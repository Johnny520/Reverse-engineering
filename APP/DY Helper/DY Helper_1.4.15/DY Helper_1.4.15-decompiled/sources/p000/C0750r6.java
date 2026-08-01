package p000;

/* JADX INFO: renamed from: r6 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0750r6 implements p000.InterfaceC0824t6 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9268;

    /* JADX INFO: renamed from: ζ */
    public final float f9269;

    public C0750r6(int r1) {
            r0 = this;
            r0.f9268 = r1
            switch(r1) {
                case 1: goto L1d;
                case 2: goto L15;
                case 3: goto Ld;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r1 = 0
            float r1 = (float) r1
            r0.f9269 = r1
            return
        Ld:
            r0.<init>()
            r1 = 0
            float r1 = (float) r1
            r0.f9269 = r1
            return
        L15:
            r0.<init>()
            r1 = 0
            float r1 = (float) r1
            r0.f9269 = r1
            return
        L1d:
            r0.<init>()
            r1 = 0
            float r1 = (float) r1
            r0.f9269 = r1
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            int r0 = r0.f9268
            switch(r0) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "Arrangement#SpaceEvenly"
            return r0
        L8:
            java.lang.String r0 = "Arrangement#SpaceBetween"
            return r0
        Lb:
            java.lang.String r0 = "Arrangement#SpaceAround"
            return r0
        Le:
            java.lang.String r0 = "Arrangement#Center"
            return r0
    }

    @Override // p000.InterfaceC0824t6
    /* JADX INFO: renamed from: β */
    public final float mo5067() {
            r1 = this;
            int r0 = r1.f9268
            switch(r0) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            float r1 = r1.f9269
            return r1
        L8:
            float r1 = r1.f9269
            return r1
        Lb:
            float r1 = r1.f9269
            return r1
        Le:
            float r1 = r1.f9269
            return r1
    }

    @Override // p000.InterfaceC0824t6
    /* JADX INFO: renamed from: δ */
    public final void mo2605(int r1, p000.rx0 r2, int[] r3, int[] r4) {
            r0 = this;
            int r0 = r0.f9268
            switch(r0) {
                case 0: goto L14;
                case 1: goto Lf;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            r0 = 0
            p000.AbstractC0861u6.m5790(r1, r3, r4, r0)
            return
        La:
            r0 = 0
            p000.AbstractC0861u6.m5789(r1, r3, r4, r0)
            return
        Lf:
            r0 = 0
            p000.AbstractC0861u6.m5788(r1, r3, r4, r0)
            return
        L14:
            r0 = 0
            p000.AbstractC0861u6.m5786(r1, r3, r4, r0)
            return
    }
}
