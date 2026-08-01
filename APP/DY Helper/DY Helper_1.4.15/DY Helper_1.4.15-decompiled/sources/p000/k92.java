package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k92 extends p000.p80 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public static final p000.k92 f5821 = null;

    static {
            k92 r0 = new k92
            java.lang.String r4 = "getParent()Landroid/view/ViewParent;"
            r5 = 0
            r1 = 1
            java.lang.Class<android.view.ViewParent> r2 = android.view.ViewParent.class
            java.lang.String r3 = "getParent"
            r0.<init>(r1, r2, r3, r4, r5)
            p000.k92.f5821 = r0
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            android.view.ViewParent r1 = (android.view.ViewParent) r1
            android.view.ViewParent r0 = r1.getParent()
            return r0
    }
}
