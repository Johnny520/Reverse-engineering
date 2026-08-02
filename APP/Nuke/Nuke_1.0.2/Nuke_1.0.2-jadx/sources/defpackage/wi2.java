package defpackage;

import java.io.File;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wi2 {
    public static final Set d = mg.u0(new String[]{".nuke-staging", ".nuke-backup"});
    public final j51 a;
    public final c20 b;
    public final File c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wi2(File file, c20 c20Var, int i) {
        j51 j51Var = new j51(24);
        if ((i & 4) != 0) {
            c60 c60Var = o90.a;
            c20Var = t50.j;
        }
        c20Var.getClass();
        this.a = j51Var;
        this.b = c20Var;
        File absoluteFile = file.getAbsoluteFile();
        absoluteFile.getClass();
        this.c = absoluteFile;
    }
}
