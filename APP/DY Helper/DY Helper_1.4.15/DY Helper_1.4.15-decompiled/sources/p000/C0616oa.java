package p000;

/* JADX INFO: renamed from: oa */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0616oa extends p000.bp0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ float f8000;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ float f8001;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ int f8002;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ boolean f8003;

    public C0616oa(float r1, float r2, int r3, boolean r4) {
            r0 = this;
            r0.f8000 = r1
            r0.f8001 = r2
            r0.f8002 = r3
            r0.f8003 = r4
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            pl1 r0 = p000.kn0.f6053
            za0 r6 = (p000.za0) r6
            float r1 = r5.f8000
            float r2 = r6.mo586()
            float r2 = r2 * r1
            float r1 = r5.f8001
            float r3 = r6.mo586()
            float r3 = r3 * r1
            r1 = 0
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L23
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L23
            ma r1 = new ma
            int r4 = r5.f8002
            r1.<init>(r2, r3, r4)
            goto L24
        L23:
            r1 = 0
        L24:
            r6.mo2785(r1)
            r6.mo2793(r0)
            boolean r5 = r5.f8003
            r6.mo2781(r5)
            s62 r5 = p000.s62.f9751
            return r5
    }
}
