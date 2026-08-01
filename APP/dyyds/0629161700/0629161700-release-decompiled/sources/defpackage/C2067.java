package defpackage;

/* JADX INFO: renamed from: ᲇᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2067 extends java.lang.ClassLoader {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.lang.String f8881 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.lang.Class[] f8882 = null;

    static {
            java.lang.Class<ᲀᛴᲀᛵ> r0 = defpackage.AbstractC1665.class
            java.lang.String r0 = r0.getName()
            defpackage.C2067.f8881 = r0
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r0, r1, r1}
            defpackage.C2067.f8882 = r0
            return
    }

    public C2067(java.lang.ClassLoader r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.lang.ClassLoader
    public final synchronized java.lang.Class loadClass(java.lang.String r2, boolean r3) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = defpackage.C2067.f8881     // Catch: java.lang.Throwable -> Ld
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            java.lang.Class<ᲀᛴᲀᛵ> r2 = defpackage.AbstractC1665.class
            monitor-exit(r1)
            return r2
        Ld:
            r2 = move-exception
            goto L15
        Lf:
            java.lang.Class r2 = super.loadClass(r2, r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return r2
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Class m3474(java.lang.String r6, byte[] r7) {
            r5 = this;
            r0 = 0
            java.lang.Class<java.lang.ClassLoader> r1 = java.lang.ClassLoader.class
            java.lang.String r2 = "defineClass"
            java.lang.Class[] r3 = defpackage.C2067.f8882     // Catch: java.lang.Exception -> L27
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Exception -> L27
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L27
            java.lang.ClassLoader r2 = r5.getParent()     // Catch: java.lang.Exception -> L27
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L27
            int r4 = r7.length     // Catch: java.lang.Exception -> L27
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L27
            java.lang.Object[] r3 = new java.lang.Object[]{r6, r7, r3, r4}     // Catch: java.lang.Exception -> L27
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Exception -> L27
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Exception -> L27
            return r1
        L27:
            int r1 = r7.length
            java.lang.Class r5 = r5.defineClass(r6, r7, r0, r1)
            return r5
    }
}
