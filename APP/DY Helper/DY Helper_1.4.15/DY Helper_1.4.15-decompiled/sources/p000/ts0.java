package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ts0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10439;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.c02 f10440;

    public /* synthetic */ ts0(p000.c02 r1, int r2) {
            r0 = this;
            r0.f10439 = r2
            r0.f10440 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f10439
            za0 r5 = (p000.za0) r5
            switch(r0) {
                case 0: goto L62;
                case 1: goto L29;
                default: goto L7;
            }
        L7:
            r5.getClass()
            c02 r4 = r4.f10440
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r5.mo2778(r0)
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5.mo2786(r4)
        L26:
            s62 r4 = p000.s62.f9751
            return r4
        L29:
            r5.getClass()
            long r0 = r5.mo2787()
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L3f
            r0 = r1
        L3f:
            r2 = 16
            float r2 = (float) r2
            float r3 = r5.mo586()
            float r3 = r3 * r2
            float r3 = r3 / r0
            float r3 = r3 + r1
            c02 r4 = r4.f10440
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r0 = 1
            float r0 = (float) r0
            float r0 = r0 - r4
            float r0 = r0 * r1
            float r4 = r4 * r3
            float r4 = r4 + r0
            r5.mo2778(r4)
            r5.mo2786(r4)
            goto L26
        L62:
            r5.getClass()
            c02 r4 = r4.f10440
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r5.mo2778(r0)
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5.mo2786(r4)
            goto L26
    }
}
