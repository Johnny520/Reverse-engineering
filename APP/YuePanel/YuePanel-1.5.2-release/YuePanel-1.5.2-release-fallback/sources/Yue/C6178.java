package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6178 {
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> Yue.InterfaceC6176<T> m23123(@Yue.InterfaceC4418 java.lang.ThreadLocal<T> r1, T r2) {
            Yue.ۥۢۡۡۧ r0 = new Yue.ۥۢۡۡۧ
            r0.<init>(r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC6176 m23124(java.lang.ThreadLocal r0, java.lang.Object r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L8
            java.lang.Object r1 = r0.get()
        L8:
            Yue.ۥۢۡۡۤ r0 = m23123(r0, r1)
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.Object m23125(@Yue.InterfaceC4418 java.lang.ThreadLocal<?> r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3) {
            Yue.ۥ۟ۧۦۥ r0 = r3.getContext()
            Yue.ۥۢۡۢ r1 = new Yue.ۥۢۡۢ
            r1.<init>(r2)
            Yue.ۥ۟ۧۦۥ$ۥ۟ r0 = r0.get(r1)
            if (r0 == 0) goto L12
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
            return r2
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ThreadLocal "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " is missing from context "
            r0.append(r2)
            Yue.ۥ۟ۧۦۥ r2 = r3.getContext()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.Object m23126(java.lang.ThreadLocal<?> r0, Yue.InterfaceC1598<? super Yue.C6593> r1) {
            r0 = 3
            Yue.C3249.m13688(r0)
            r0 = 0
            throw r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.Object m23127(@Yue.InterfaceC4418 java.lang.ThreadLocal<?> r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super java.lang.Boolean> r2) {
            Yue.ۥ۟ۧۦۥ r2 = r2.getContext()
            Yue.ۥۢۡۢ r0 = new Yue.ۥۢۡۢ
            r0.<init>(r1)
            Yue.ۥ۟ۧۦۥ$ۥ۟ r1 = r2.get(r0)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            java.lang.Boolean r1 = Yue.C0828.m4773(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.Object m23128(java.lang.ThreadLocal<?> r0, Yue.InterfaceC1598<? super java.lang.Boolean> r1) {
            r0 = 3
            Yue.C3249.m13688(r0)
            r0 = 0
            throw r0
    }
}
