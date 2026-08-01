package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zj {
    public final java.util.HashMap a;

    public zj() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            return
    }

    public final java.io.File a(android.net.Uri r5) {
            r4 = this;
            java.lang.String r0 = r5.getEncodedPath()
            r1 = 47
            r2 = 1
            int r1 = r0.indexOf(r1, r2)
            java.lang.String r3 = r0.substring(r2, r1)
            java.lang.String r3 = android.net.Uri.decode(r3)
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r0 = android.net.Uri.decode(r0)
            java.util.HashMap r1 = r4.a
            java.lang.Object r1 = r1.get(r3)
            java.io.File r1 = (java.io.File) r1
            if (r1 == 0) goto L5a
            java.io.File r5 = new java.io.File
            r5.<init>(r1, r0)
            java.io.File r5 = r5.getCanonicalFile()     // Catch: java.io.IOException -> L46
            java.lang.String r0 = r5.getPath()
            java.lang.String r1 = r1.getPath()
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L3e
            return r5
        L3e:
            java.lang.SecurityException r5 = new java.lang.SecurityException
            java.lang.String r0 = "Resolved path jumped beyond configured root"
            r5.<init>(r0)
            throw r5
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to resolve canonical path for "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L5a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to find configured root for "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }
}
