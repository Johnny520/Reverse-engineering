package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vs1 extends p000.p80 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public static final p000.vs1 f11382 = null;

    static {
            vs1 r0 = new vs1
            java.lang.String r4 = "iterator()Ljava/util/Iterator;"
            r5 = 0
            r1 = 1
            java.lang.Class<ss1> r2 = p000.ss1.class
            java.lang.String r3 = "iterator"
            r0.<init>(r1, r2, r3, r4, r5)
            p000.vs1.f11382 = r0
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            ss1 r1 = (p000.ss1) r1
            r1.getClass()
            java.util.Iterator r0 = r1.iterator()
            return r0
    }
}
