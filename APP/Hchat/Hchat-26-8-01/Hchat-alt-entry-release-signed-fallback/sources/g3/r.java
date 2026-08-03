package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r extends gg.j implements fg.l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g3.r f4228n = null;

    static {
            g3.r r0 = new g3.r
            java.lang.String r4 = "getParent()Landroid/view/ViewParent;"
            r5 = 0
            r1 = 1
            java.lang.Class<android.view.ViewParent> r2 = android.view.ViewParent.class
            java.lang.String r3 = "getParent"
            r0.<init>(r1, r2, r3, r4, r5)
            g3.r.f4228n = r0
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r1) {
            r0 = this;
            android.view.ViewParent r1 = (android.view.ViewParent) r1
            android.view.ViewParent r1 = r1.getParent()
            return r1
    }
}
