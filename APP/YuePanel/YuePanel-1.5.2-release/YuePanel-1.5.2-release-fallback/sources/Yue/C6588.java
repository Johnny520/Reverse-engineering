package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6588<T> extends Yue.C5512<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public java.lang.ThreadLocal<Yue.C4677<Yue.InterfaceC1632, java.lang.Object>> f23014;

    public C6588(@Yue.InterfaceC4418 Yue.InterfaceC1632 r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r4) {
            r2 = this;
            Yue.ۥۣۢ۠ۡ r0 = Yue.C6590.f23015
            Yue.ۥ۟ۧۦۥ$ۥ۟ r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            Yue.ۥ۟ۧۦۥ r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f23014 = r0
            Yue.ۥ۟ۧۦۥ r4 = r4.getContext()
            Yue.ۥ۟ۧۤۥ$ۥ۟ r0 = Yue.InterfaceC1601.f5016
            Yue.ۥ۟ۧۦۥ$ۥ۟ r4 = r4.get(r0)
            boolean r4 = r4 instanceof Yue.AbstractC1643
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = Yue.C6179.m23131(r3, r4)
            Yue.C6179.m23129(r3, r4)
            r2.m25374(r3, r4)
        L31:
            return
    }

    @Override // Yue.C5512, Yue.AbstractC0043
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ */
    public void mo376(@Yue.InterfaceC4543 java.lang.Object r6) {
            r5 = this;
            java.lang.ThreadLocal<Yue.ۥۣۡۦ۠<Yue.ۥ۟ۧۦۥ, java.lang.Object>> r0 = r5.f23014
            java.lang.Object r0 = r0.get()
            Yue.ۥۣۡۦ۠ r0 = (Yue.C4677) r0
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.Object r2 = r0.m18537()
            Yue.ۥ۟ۧۦۥ r2 = (Yue.InterfaceC1632) r2
            java.lang.Object r0 = r0.m18538()
            Yue.C6179.m23129(r2, r0)
            java.lang.ThreadLocal<Yue.ۥۣۡۦ۠<Yue.ۥ۟ۧۦۥ, java.lang.Object>> r0 = r5.f23014
            r0.set(r1)
        L1d:
            Yue.ۥ۟ۧۤۢ<T> r0 = r5.f20408
            java.lang.Object r6 = Yue.C1423.m7051(r6, r0)
            Yue.ۥ۟ۧۤۢ<T> r0 = r5.f20408
            Yue.ۥ۟ۧۦۥ r2 = r0.getContext()
            java.lang.Object r3 = Yue.C6179.m23131(r2, r1)
            Yue.ۥۢ۠ۦۢ r4 = Yue.C6179.f22151
            if (r3 == r4) goto L35
            Yue.ۥۣۢ۠۟ r1 = Yue.C1639.m7920(r0, r2, r3)
        L35:
            Yue.ۥ۟ۧۤۢ<T> r0 = r5.f20408     // Catch: java.lang.Throwable -> L48
            r0.resumeWith(r6)     // Catch: java.lang.Throwable -> L48
            Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L44
            boolean r6 = r1.m25373()
            if (r6 == 0) goto L47
        L44:
            Yue.C6179.m23129(r2, r3)
        L47:
            return
        L48:
            r6 = move-exception
            if (r1 == 0) goto L51
            boolean r0 = r1.m25373()
            if (r0 == 0) goto L54
        L51:
            Yue.C6179.m23129(r2, r3)
        L54:
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public final boolean m25373() {
            r2 = this;
            java.lang.ThreadLocal<Yue.ۥۣۡۦ۠<Yue.ۥ۟ۧۦۥ, java.lang.Object>> r0 = r2.f23014
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.ThreadLocal<Yue.ۥۣۡۦ۠<Yue.ۥ۟ۧۦۥ, java.lang.Object>> r0 = r2.f23014
            r1 = 0
            r0.set(r1)
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public final void m25374(@Yue.InterfaceC4418 Yue.InterfaceC1632 r2, @Yue.InterfaceC4543 java.lang.Object r3) {
            r1 = this;
            java.lang.ThreadLocal<Yue.ۥۣۡۦ۠<Yue.ۥ۟ۧۦۥ, java.lang.Object>> r0 = r1.f23014
            Yue.ۥۣۡۦ۠ r2 = Yue.C6456.m23777(r2, r3)
            r0.set(r2)
            return
    }
}
