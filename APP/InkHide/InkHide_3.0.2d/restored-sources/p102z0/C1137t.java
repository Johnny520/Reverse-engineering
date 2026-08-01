package p102z0;

import java.io.File;
import java.io.FileFilter;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;

/* JADX INFO: renamed from: z0.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1137t implements FileFilter {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file.isFile()) {
            String name = file.getName();
            AbstractC0223g.m417d(name, "getName(...)");
            if (AbstractC0307q.m538h0(name, false, "inkhide-crash-")) {
                return true;
            }
        }
        return false;
    }
}
