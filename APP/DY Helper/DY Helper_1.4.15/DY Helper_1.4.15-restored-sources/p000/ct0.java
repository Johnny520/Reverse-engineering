package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct0 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2740;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.ps0 f2741;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ p000.a80 f2742;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.a80 f2743;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ p000.g21 f2744;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ p000.g21 f2745;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ p000.g21 f2746;

    public /* synthetic */ ct0(p000.ps0 r1, p000.a80 r2, p000.a80 r3, p000.g21 r4, p000.g21 r5, p000.g21 r6, int r7) {
            r0 = this;
            r0.f2740 = r7
            r0.f2741 = r1
            r0.f2742 = r2
            r0.f2743 = r3
            r0.f2744 = r4
            r0.f2745 = r5
            r0.f2746 = r6
            r0.<init>()
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f2740
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            switch(r0) {
                case 0: goto L3f;
                default: goto L11;
            }
        L11:
            ps0 r0 = r1.f2741
            java.util.List r0 = r0.f8687
            java.lang.Object r2 = p000.AbstractC0984xh.m6641(r2, r0)
            xt0 r2 = (p000.xt0) r2
            if (r2 == 0) goto L2c
            java.lang.String r2 = r2.f12283
            if (r3 == 0) goto L27
            a80 r3 = r1.f2742
            r3.invoke(r2)
            goto L2c
        L27:
            a80 r3 = r1.f2743
            r3.invoke(r2)
        L2c:
            g21 r2 = r1.f2744
            r3 = 0
            r2.setValue(r3)
            g21 r2 = r1.f2745
            r2.setValue(r3)
            g21 r1 = r1.f2746
            r1.setValue(r3)
        L3c:
            s62 r1 = p000.s62.f9751
            return r1
        L3f:
            ps0 r0 = r1.f2741
            java.util.List r0 = r0.f8687
            java.lang.Object r2 = p000.AbstractC0984xh.m6641(r2, r0)
            xt0 r2 = (p000.xt0) r2
            if (r2 == 0) goto L5a
            java.lang.String r2 = r2.f12283
            if (r3 == 0) goto L55
            a80 r3 = r1.f2742
            r3.invoke(r2)
            goto L5a
        L55:
            a80 r3 = r1.f2743
            r3.invoke(r2)
        L5a:
            g21 r2 = r1.f2744
            r3 = 0
            r2.setValue(r3)
            g21 r2 = r1.f2745
            r2.setValue(r3)
            g21 r1 = r1.f2746
            r1.setValue(r3)
            goto L3c
    }
}
