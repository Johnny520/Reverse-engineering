package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class aw0 implements p000.InterfaceC1031yr {

    /* JADX INFO: renamed from: ε */
    public boolean f1347;

    /* JADX INFO: renamed from: ζ */
    public long f1348;

    /* JADX INFO: renamed from: η */
    public long f1349;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.dw0 f1350;

    public aw0(p000.dw0 r3) {
            r2 = this;
            r2.<init>()
            r2.f1350 = r3
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r2.f1348 = r0
            r0 = 0
            r2.f1349 = r0
            return
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: β */
    public final float mo586() {
            r0 = this;
            dw0 r0 = r0.f1350
            float r0 = r0.mo586()
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final void m615(p000.te0 r5, float r6) {
            r4 = this;
            dw0 r4 = r4.f1350
            o4 r0 = r4.f3311
            if (r0 != 0) goto Ld
            o4 r0 = new o4
            r0.<init>()
            r4.f3311 = r0
        Ld:
            java.lang.Object r4 = r0.f7940
            te0[] r4 = (p000.te0[]) r4
            int r4 = p000.AbstractC0312g7.m2254(r4, r5)
            r1 = 1
            if (r4 >= 0) goto L58
            int r4 = r0.f7939
            java.lang.Object r2 = r0.f7940
            te0[] r2 = (p000.te0[]) r2
            int r3 = r2.length
            if (r4 != r3) goto L3f
            int r3 = r4 * 2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            te0[] r2 = (p000.te0[]) r2
            r0.f7940 = r2
            java.lang.Object r2 = r0.f7941
            float[] r2 = (float[]) r2
            float[] r2 = java.util.Arrays.copyOf(r2, r3)
            r0.f7941 = r2
            java.lang.Object r2 = r0.f7942
            byte[] r2 = (byte[]) r2
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            r0.f7942 = r2
        L3f:
            java.lang.Object r2 = r0.f7940
            te0[] r2 = (p000.te0[]) r2
            r2[r4] = r5
            java.lang.Object r5 = r0.f7942
            byte[] r5 = (byte[]) r5
            r2 = 3
            r5[r4] = r2
            java.lang.Object r5 = r0.f7941
            float[] r5 = (float[]) r5
            r5[r4] = r6
            int r4 = r0.f7939
            int r4 = r4 + r1
            r0.f7939 = r4
            return
        L58:
            java.lang.Object r5 = r0.f7941
            float[] r5 = (float[]) r5
            r2 = r5[r4]
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L6f
            java.lang.Object r5 = r0.f7942
            byte[] r5 = (byte[]) r5
            r6 = r5[r4]
            r0 = 2
            if (r6 != r0) goto L6e
            r6 = 0
            r5[r4] = r6
        L6e:
            return
        L6f:
            r5[r4] = r6
            java.lang.Object r5 = r0.f7942
            byte[] r5 = (byte[]) r5
            r5[r4] = r1
            return
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: θ */
    public final float mo590() {
            r0 = this;
            dw0 r0 = r0.f1350
            float r0 = r0.mo590()
            return r0
    }
}
