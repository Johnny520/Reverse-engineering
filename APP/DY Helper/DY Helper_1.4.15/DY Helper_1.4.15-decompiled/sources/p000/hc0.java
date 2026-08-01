package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hc0 extends p000.p80 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public static final p000.hc0 f4684 = null;

    static {
            hc0 r0 = new hc0
            java.lang.String r4 = "isNotBlank(Ljava/lang/CharSequence;)Z"
            r5 = 1
            r1 = 1
            java.lang.Class<q02> r2 = p000.q02.class
            java.lang.String r3 = "isNotBlank"
            r0.<init>(r1, r2, r3, r4, r5)
            p000.hc0.f4684 = r0
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            boolean r0 = p000.q02.m4671(r1)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }
}
