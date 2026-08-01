package p000;

/* JADX INFO: renamed from: wv */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0961wv implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.InterfaceC1031yr f11870;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ float f11871;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.wa0 f11872;

    public C0961wv(p000.InterfaceC1031yr r1, float r2, p000.wa0 r3) {
            r0 = this;
            r0.<init>()
            r0.f11870 = r1
            r0.f11871 = r2
            r0.f11872 = r3
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r9) {
            r8 = this;
            cw r9 = (p000.InterfaceC0190cw) r9
            r9.getClass()
            m6 r0 = r9.mo579()
            yr r0 = r0.m3791()
            m6 r1 = r9.mo579()
            yr r2 = r8.f11870
            r1.m3769(r2)
            float r1 = r8.f11871     // Catch: java.lang.Throwable -> L49
            m6 r2 = r9.mo579()     // Catch: java.lang.Throwable -> L49
            long r3 = r2.m3758()     // Catch: java.lang.Throwable -> L49
            de r5 = r2.m3787()     // Catch: java.lang.Throwable -> L49
            r5.mo1729()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r5 = r2.f6967     // Catch: java.lang.Throwable -> L4b
            n r5 = (p000.C0568n) r5     // Catch: java.lang.Throwable -> L4b
            r6 = 0
            r5.m3923(r1, r1, r6)     // Catch: java.lang.Throwable -> L4b
            wa0 r8 = r8.f11872     // Catch: java.lang.Throwable -> L4b
            p000.ln0.m3638(r9, r8)     // Catch: java.lang.Throwable -> L4b
            de r8 = r2.m3787()     // Catch: java.lang.Throwable -> L49
            r8.mo1727()     // Catch: java.lang.Throwable -> L49
            r2.m3771(r3)     // Catch: java.lang.Throwable -> L49
            m6 r8 = r9.mo579()
            r8.m3769(r0)
            s62 r8 = p000.s62.f9751
            return r8
        L49:
            r8 = move-exception
            goto L57
        L4b:
            r8 = move-exception
            de r1 = r2.m3787()     // Catch: java.lang.Throwable -> L49
            r1.mo1727()     // Catch: java.lang.Throwable -> L49
            r2.m3771(r3)     // Catch: java.lang.Throwable -> L49
            throw r8     // Catch: java.lang.Throwable -> L49
        L57:
            m6 r9 = r9.mo579()
            r9.m3769(r0)
            throw r8
    }
}
