package Yue;

import java.nio.file.Path;
import java.nio.file.Paths;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6627 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C6627 f2193 = new C6627();

    /* JADX INFO: renamed from: ۥ۟ */
    public static final Path f2194 = Paths.get("", new String[0]);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Path f16999 = Paths.get("..", new String[0]);

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final Path m3107(@InterfaceC6399 Path path, @InterfaceC6399 Path path2) {
        C5499.m17103(path, "path");
        C5499.m17103(path2, "base");
        Path pathNormalize = path2.normalize();
        Path pathNormalize2 = path.normalize();
        Path pathRelativize = pathNormalize.relativize(pathNormalize2);
        int iMin = Math.min(pathNormalize.getNameCount(), pathNormalize2.getNameCount());
        for (int i = 0; i < iMin; i++) {
            Path name = pathNormalize.getName(i);
            Path path3 = f16999;
            if (!C5499.m17094(name, path3)) {
                break;
            }
            if (!C5499.m17094(pathNormalize2.getName(i), path3)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (C5499.m17094(pathNormalize2, pathNormalize) || !C5499.m17094(pathNormalize, f2194)) {
            String string = pathRelativize.toString();
            String separator = pathRelativize.getFileSystem().getSeparator();
            C5499.m17102(separator, "rn.fileSystem.separator");
            pathNormalize2 = C7627.m23973(string, separator, false, 2, null) ? pathRelativize.getFileSystem().getPath(C7633.m24228(string, pathRelativize.getFileSystem().getSeparator().length()), new String[0]) : pathRelativize;
        }
        C5499.m17102(pathNormalize2, "r");
        return pathNormalize2;
    }
}
