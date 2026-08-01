package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class se0 extends p000.bp0 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9873;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.te0[] f9874;

    public /* synthetic */ se0(p000.te0[] r1, int r2) {
            r0 = this;
            r0.f9873 = r2
            r0.f9874 = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f9873
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            bh1 r2 = (p000.bh1) r2
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r0 = 0
            te0[] r1 = r1.f9874
            float r1 = p000.i91.m2677(r2, r0, r1, r3)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        L19:
            bh1 r2 = (p000.bh1) r2
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r0 = 1
            te0[] r1 = r1.f9874
            float r1 = p000.i91.m2677(r2, r0, r1, r3)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }
}
