package scripts;

import org.tribot.script.Script;
import org.tribot.script.ScriptManifest;
import org.tribot.script.interfaces.Ending;
import org.tribot.script.interfaces.Painting;
import scripts.dax_api.api_lib.DaxWalker;
import scripts.dax_api.api_lib.models.DaxCredentials;
import scripts.dax_api.api_lib.models.DaxCredentialsProvider;

import java.awt.*;
@ScriptManifest(category = "", name ="" , authors ="Papi" )
public class cowkiller extends Script implements Ending, Painting {
    @Override
    public void run() {
        DaxWalker.setCredentials(new DaxCredentialsProvider() {
            @Override
            public DaxCredentials getDaxCredentials() {
                return new DaxCredentials("sub_DPjXXzL5DeSiPf", "PUBLIC-KEY");
            }
        });

        System.out.println(" has initialized successfully!");

        while (true){





        }

    }

    @Override
    public void onEnd() {

    }

    @Override
    public void onPaint(Graphics graphics) {

    }
}
