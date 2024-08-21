package net.cleptomania.glsl;

import com.graphicsfuzz.common.ast.TranslationUnit;
import com.graphicsfuzz.common.ast.decl.Declaration;
import com.graphicsfuzz.common.ast.decl.VariableDeclInfo;
import com.graphicsfuzz.common.ast.decl.VariablesDeclaration;
import com.graphicsfuzz.common.util.ParseHelper;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting...");
        TranslationUnit tu = ParseHelper.parse(new File("test.glsl"));

        for (Declaration d : tu.getTopLevelDeclarations()) {
            if (d instanceof VariablesDeclaration vd) {
                String type = vd.getBaseType().getText();
                for (VariableDeclInfo vi : vd.getDeclInfos()) {
                    String varName = vi.getName();
                    System.out.println(varName + " is a " + type);
                }
            }
        }

        System.out.println("Finishing...");
    }

}
