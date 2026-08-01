package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class j30 {

    /* JADX INFO: renamed from: α */
    public final java.util.HashMap f5304;

    public j30() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f5304 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final java.io.File m2848(android.net.Uri r5) {
            r4 = this;
            java.lang.String r0 = r5.getEncodedPath()
            r1 = 47
            r2 = 1
            int r1 = r0.indexOf(r1, r2)
            r3 = -1
            if (r1 == r3) goto L64
            java.lang.String r3 = r0.substring(r2, r1)
            java.lang.String r3 = android.net.Uri.decode(r3)
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r0 = android.net.Uri.decode(r0)
            java.util.HashMap r4 = r4.f5304
            java.lang.Object r4 = r4.get(r3)
            java.io.File r4 = (java.io.File) r4
            if (r4 == 0) goto L5e
            java.io.File r5 = new java.io.File
            r5.<init>(r4, r0)
            java.io.File r5 = r5.getCanonicalFile()     // Catch: java.io.IOException -> L57
            java.lang.String r0 = r5.getPath()
            java.lang.String r4 = r4.getPath()
            java.lang.String r0 = androidx.core.content.FileProvider.m413(r0)
            java.lang.String r4 = androidx.core.content.FileProvider.m413(r4)
            java.lang.String r1 = "/"
            java.lang.String r4 = r4.concat(r1)
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L4f
            return r5
        L4f:
            java.lang.SecurityException r4 = new java.lang.SecurityException
            java.lang.String r5 = "Resolved path jumped beyond configured root"
            r4.<init>(r5)
            throw r4
        L57:
            java.lang.String r4 = "Failed to resolve canonical path for "
            p000.C1080.m7274(r5, r4)
        L5c:
            r4 = 0
            return r4
        L5e:
            java.lang.String r4 = "Unable to find configured root for "
            p000.C1080.m7274(r5, r4)
            goto L5c
        L64:
            java.lang.String r4 = "Unable to find path from root: "
            p000.C1080.m7274(r5, r4)
            goto L5c
    }
}
