package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4719 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ boolean m18748(Yue.C4709 r0) {
            boolean r0 = m18750(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.Object m18749(java.nio.file.Path r0, java.nio.file.LinkOption[] r1) {
            java.lang.Object r0 = m18751(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m18750(Yue.C4709 r4) {
            Yue.ۥۣۡۨۢ r0 = r4.m18701()
        L4:
            if (r0 == 0) goto L36
            java.lang.Object r1 = r0.m18700()
            r2 = 1
            if (r1 == 0) goto L22
            java.lang.Object r1 = r4.m18700()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.m18700()
            java.lang.Object r3 = r4.m18700()
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 == 0) goto L31
            return r2
        L22:
            java.nio.file.Path r1 = r0.m18702()     // Catch: java.lang.Throwable -> L31
            java.nio.file.Path r3 = r4.m18702()     // Catch: java.lang.Throwable -> L31
            boolean r1 = java.nio.file.Files.isSameFile(r1, r3)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L31
            return r2
        L31:
            Yue.ۥۣۡۨۢ r0 = r0.m18701()
            goto L4
        L36:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.Object m18751(java.nio.file.Path r2, java.nio.file.LinkOption[] r3) {
            int r0 = r3.length     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)     // Catch: java.lang.Throwable -> L1e
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3     // Catch: java.lang.Throwable -> L1e
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r0 = java.nio.file.attribute.BasicFileAttributes.class
            int r1 = r3.length     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)     // Catch: java.lang.Throwable -> L1e
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3     // Catch: java.lang.Throwable -> L1e
            java.nio.file.attribute.BasicFileAttributes r2 = java.nio.file.Files.readAttributes(r2, r0, r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "readAttributes(this, A::class.java, *options)"
            Yue.C3329.m13905(r2, r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r2.fileKey()     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r2 = 0
        L1f:
            return r2
    }
}
