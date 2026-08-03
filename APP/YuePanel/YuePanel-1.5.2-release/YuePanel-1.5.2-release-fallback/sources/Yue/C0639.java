package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5840({"SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,76:1\n30#1,13:77\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n48#1:77,13\n*E\n"})
public final class C0639 {
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final byte[] m4193(@Yue.InterfaceC4418 android.util.AtomicFile r0) {
            byte[] r0 = r0.readFully()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String m4194(@Yue.InterfaceC4418 android.util.AtomicFile r1, @Yue.InterfaceC4418 java.nio.charset.Charset r2) {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r1.readFully()
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.String m4195(android.util.AtomicFile r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = Yue.C1099.f3261
        L6:
            java.lang.String r0 = m4194(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m4196(@Yue.InterfaceC4418 android.util.AtomicFile r2, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super java.io.FileOutputStream, Yue.C6593> r3) {
            java.io.FileOutputStream r0 = r2.startWrite()
            r1 = 1
            r3.invoke(r0)     // Catch: java.lang.Throwable -> L12
            Yue.C3249.m13687(r1)
            r2.finishWrite(r0)
            Yue.C3249.m13686(r1)
            return
        L12:
            r3 = move-exception
            Yue.C3249.m13687(r1)
            r2.failWrite(r0)
            Yue.C3249.m13686(r1)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m4197(@Yue.InterfaceC4418 android.util.AtomicFile r1, @Yue.InterfaceC4418 byte[] r2) {
            java.io.FileOutputStream r0 = r1.startWrite()
            r0.write(r2)     // Catch: java.lang.Throwable -> Lb
            r1.finishWrite(r0)
            return
        Lb:
            r2 = move-exception
            r1.failWrite(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m4198(@Yue.InterfaceC4418 android.util.AtomicFile r0, @Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4418 java.nio.charset.Charset r2) {
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            Yue.C3329.m13905(r1, r2)
            m4197(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m4199(android.util.AtomicFile r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = Yue.C1099.f3261
        L6:
            m4198(r0, r1, r2)
            return
    }
}
