package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(23)
public final class C2088 implements Yue.InterfaceC2094 {
    public C2088() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.InterfaceC2094
    @Yue.InterfaceC1947
    /* JADX INFO: renamed from: ۥ */
    public void mo9755(@Yue.InterfaceC4418 Yue.C6081 r1, @Yue.InterfaceC4418 Yue.C6081 r2, @Yue.InterfaceC4418 android.view.Window r3, @Yue.InterfaceC4418 android.view.View r4, boolean r5, boolean r6) {
            r0 = this;
            java.lang.String r6 = "statusBarStyle"
            Yue.C3329.m13906(r1, r6)
            java.lang.String r6 = "navigationBarStyle"
            Yue.C3329.m13906(r2, r6)
            java.lang.String r6 = "window"
            Yue.C3329.m13906(r3, r6)
            java.lang.String r6 = "view"
            Yue.C3329.m13906(r4, r6)
            r6 = 0
            Yue.C7021.m27184(r3, r6)
            int r1 = r1.m22832(r5)
            r3.setStatusBarColor(r1)
            int r1 = r2.m22829()
            r3.setNavigationBarColor(r1)
            Yue.ۥۢۥۨۦ r1 = new Yue.ۥۢۥۨۦ
            r1.<init>(r3, r4)
            r2 = r5 ^ 1
            r1.m27413(r2)
            return
    }
}
