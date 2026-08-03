package a;

/* JADX INFO: renamed from: a.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0304od implements a.InterfaceC0359rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List<java.lang.String> f626a;

    public C0304od() {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "toolbar_title"
            java.lang.String r1 = "nav_title"
            java.lang.String r2 = "title"
            java.lang.String r3 = "action_bar"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = a.C0294o3.d0(r0)
            r4.f626a = r0
            return
    }

    @Override // a.InterfaceC0359rf
    public final android.widget.TextView a(android.app.Activity r3, android.view.View r4) {
            r2 = this;
            java.lang.String r0 = "rootView"
            a.C0193i9.e(r4, r0)
            a.qf r0 = a.C0342qf.f660a
            r0.getClass()
            int r3 = a.C0342qf.b(r3)
            a.x2 r0 = new a.x2
            r1 = 1
            r0.<init>(r2, r3, r1)
            android.widget.TextView r3 = a.C0282n9.q(r4, r0)
            return r3
    }
}
