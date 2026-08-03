package p034c7;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: c7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C0407c extends IOException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0407c(File file, File file2, String str) {
        file.getClass();
        StringBuilder sb2 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb2.append(" -> " + file2);
        }
        sb2.append(": ".concat(str));
        super(sb2.toString());
    }
}
