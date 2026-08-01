package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bt0 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1829;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.ps0 f1830;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.view.View f1831;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.g21 f1832;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ p000.g21 f1833;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ p000.g21 f1834;

    public /* synthetic */ bt0(p000.ps0 r1, android.view.View r2, p000.g21 r3, p000.g21 r4, p000.g21 r5, int r6) {
            r0 = this;
            r0.f1829 = r6
            r0.f1830 = r1
            r0.f1831 = r2
            r0.f1832 = r3
            r0.f1833 = r4
            r0.f1834 = r5
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f1829
            java.lang.Float r3 = (java.lang.Float) r3
            switch(r0) {
                case 0: goto Lc3;
                case 1: goto L80;
                case 2: goto L4a;
                default: goto L7;
            }
        L7:
            float r0 = r3.floatValue()
            g21 r1 = r2.f1832
            r1.setValue(r3)
            int r3 = p000.jx0.m3061(r0)
            ps0 r0 = r2.f1830
            java.util.List r0 = r0.f8687
            xm0 r0 = p000.AbstractC1021yh.m6857(r0)
            int r3 = p000.j81.m2907(r3, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            g21 r1 = r2.f1833
            r1.setValue(r0)
            g21 r0 = r2.f1834
            java.lang.Object r1 = r0.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L34
            goto L3a
        L34:
            int r1 = r1.intValue()
            if (r1 == r3) goto L47
        L3a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.setValue(r3)
            r3 = 4
            android.view.View r2 = r2.f1831
            r2.performHapticFeedback(r3)
        L47:
            s62 r2 = p000.s62.f9751
            return r2
        L4a:
            float r0 = r3.floatValue()
            g21 r1 = r2.f1832
            r1.setValue(r3)
            int r3 = p000.jx0.m3061(r0)
            ps0 r0 = r2.f1830
            java.util.List r0 = r0.f8687
            xm0 r0 = p000.AbstractC1021yh.m6857(r0)
            int r3 = p000.j81.m2907(r3, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            g21 r0 = r2.f1833
            r0.setValue(r3)
            java.lang.Object r3 = r0.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            g21 r0 = r2.f1834
            r0.setValue(r3)
            r3 = 0
            android.view.View r2 = r2.f1831
            r2.performHapticFeedback(r3)
        L7d:
            s62 r2 = p000.s62.f9751
            return r2
        L80:
            float r0 = r3.floatValue()
            g21 r1 = r2.f1832
            r1.setValue(r3)
            int r3 = p000.jx0.m3061(r0)
            ps0 r0 = r2.f1830
            java.util.List r0 = r0.f8687
            xm0 r0 = p000.AbstractC1021yh.m6857(r0)
            int r3 = p000.j81.m2907(r3, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            g21 r1 = r2.f1833
            r1.setValue(r0)
            g21 r0 = r2.f1834
            java.lang.Object r1 = r0.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto Lad
            goto Lb3
        Lad:
            int r1 = r1.intValue()
            if (r1 == r3) goto Lc0
        Lb3:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.setValue(r3)
            r3 = 4
            android.view.View r2 = r2.f1831
            r2.performHapticFeedback(r3)
        Lc0:
            s62 r2 = p000.s62.f9751
            return r2
        Lc3:
            float r0 = r3.floatValue()
            g21 r1 = r2.f1832
            r1.setValue(r3)
            int r3 = p000.jx0.m3061(r0)
            ps0 r0 = r2.f1830
            java.util.List r0 = r0.f8687
            xm0 r0 = p000.AbstractC1021yh.m6857(r0)
            int r3 = p000.j81.m2907(r3, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            g21 r0 = r2.f1833
            r0.setValue(r3)
            java.lang.Object r3 = r0.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            g21 r0 = r2.f1834
            r0.setValue(r3)
            r3 = 0
            android.view.View r2 = r2.f1831
            r2.performHapticFeedback(r3)
            goto L7d
    }
}
