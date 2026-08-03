package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(26)
public final class C2089 implements Yue.InterfaceC2094 {
    public C2089() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.InterfaceC2094
    @Yue.InterfaceC1947
    /* JADX INFO: renamed from: ۥ */
    public void mo9755(@Yue.InterfaceC4418 Yue.C6081 r2, @Yue.InterfaceC4418 Yue.C6081 r3, @Yue.InterfaceC4418 android.view.Window r4, @Yue.InterfaceC4418 android.view.View r5, boolean r6, boolean r7) {
            r1 = this;
            java.lang.String r0 = "statusBarStyle"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "navigationBarStyle"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "window"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "view"
            Yue.C3329.m13906(r5, r0)
            r0 = 0
            Yue.C7021.m27184(r4, r0)
            int r2 = r2.m22832(r6)
            r4.setStatusBarColor(r2)
            int r2 = r3.m22832(r7)
            r4.setNavigationBarColor(r2)
            Yue.ۥۢۥۨۦ r2 = new Yue.ۥۢۥۨۦ
            r2.<init>(r4, r5)
            r3 = r6 ^ 1
            r2.m27413(r3)
            r3 = r7 ^ 1
            r2.m27412(r3)
            return
    }
}
