package p000;

/* JADX INFO: renamed from: y */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1003y extends p000.p80 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public static final p000.C1003y f12404 = null;

    static {
            y r0 = new y
            java.lang.String r4 = "min(II)I"
            r5 = 1
            r1 = 2
            java.lang.Class<jx0> r2 = p000.jx0.class
            java.lang.String r3 = "min"
            r0.<init>(r1, r2, r3, r4, r5)
            p000.C1003y.f12404 = r0
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            int r0 = java.lang.Math.min(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }
}
