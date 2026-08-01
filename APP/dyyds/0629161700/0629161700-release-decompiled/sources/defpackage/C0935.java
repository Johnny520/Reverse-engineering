package defpackage;

/* JADX INFO: renamed from: ᛵᛷᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0935 extends java.lang.ClassLoader {
    public C0935(java.lang.ClassLoader r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.lang.ClassLoader
    public final java.lang.Class findClass(java.lang.String r1) {
            r0 = this;
            java.lang.Class<ᛵᛷᲀᲇ> r0 = defpackage.C0935.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Class r0 = r0.loadClass(r1)
            return r0
    }

    @Override // java.lang.ClassLoader
    public final java.lang.Class loadClass(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "com.airbnb.lottie"
            boolean r0 = r2.startsWith(r0)     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto Lf
            java.lang.Class r0 = super.loadClass(r2)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.lang.Class r1 = r1.findClass(r2)
            return r1
    }

    @Override // java.lang.ClassLoader
    public final java.lang.Class loadClass(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "com.airbnb.lottie"
            boolean r0 = r2.startsWith(r0)     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto Lf
            java.lang.Class r3 = super.loadClass(r2, r3)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto Lf
            return r3
        Lf:
            java.lang.Class r1 = r1.findClass(r2)
            return r1
    }
}
