package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zj {
    public final HashMap a;

    public zj() {
        this.a = new HashMap();
    }

    public final File a(Uri r5) {
        String r0 = r5.getEncodedPath();
        int r1 = r0.indexOf(47, 1);
        String r3 = Uri.decode(r0.substring(1, r1));
        String r02 = Uri.decode(r0.substring(r1 + 1));
        File r12 = (File) this.a.get(r3);
        if (r12 == null) goto L14;
        File r52 = new File(r12, r02);
        File r53 = r52.getCanonicalFile();     // Catch: IOException -> L11
        if (r53.getPath().startsWith(r12.getPath()) == false) goto L10;
        return r53;
    L10:
        throw new SecurityException("Resolved path jumped beyond configured root");
    L12:
        throw new IllegalArgumentException("Failed to resolve canonical path for " + r52);
    L14:
        throw new IllegalArgumentException("Unable to find configured root for " + r5);
    }
}
