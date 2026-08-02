package p000;

import java.io.File;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wi2 {

    /* JADX INFO: renamed from: d */
    public static final Set f12518d = AbstractC0460mg.m3106u0(new String[]{".nuke-staging", ".nuke-backup"});

    /* JADX INFO: renamed from: a */
    public final j51 f12519a;

    /* JADX INFO: renamed from: b */
    public final c20 f12520b;

    /* JADX INFO: renamed from: c */
    public final File f12521c;

    public wi2(File file, c20 c20Var, int i) {
        j51 j51Var = new j51(24);
        if ((i & 4) != 0) {
            c60 c60Var = o90.f7590a;
            c20Var = t50.f10560j;
        }
        c20Var.getClass();
        this.f12519a = j51Var;
        this.f12520b = c20Var;
        File absoluteFile = file.getAbsoluteFile();
        absoluteFile.getClass();
        this.f12521c = absoluteFile;
    }
}
