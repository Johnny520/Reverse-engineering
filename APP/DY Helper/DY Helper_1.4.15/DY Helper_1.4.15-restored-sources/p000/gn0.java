package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gn0 extends p000.p80 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ android.app.Activity f4422;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Dialog f4423;

    public gn0(android.app.Activity r7, android.app.Dialog r8) {
            r6 = this;
            r6.f4422 = r7
            r6.f4423 = r8
            java.lang.String r4 = "createSharePanelActionCard$openFullMenu(Landroid/app/Activity;Landroid/app/Dialog;)V"
            r5 = 0
            r1 = 0
            java.lang.Class<kn0> r2 = p000.kn0.class
            java.lang.String r3 = "openFullMenu"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r4 = this;
            android.app.Dialog r0 = r4.f4423
            android.app.Activity r4 = r4.f4422
            if (r4 != 0) goto Lc
            java.lang.String r4 = "DYHelper: 分享面板打开完整菜单失败: Activity 为空"
            p000.C0888ux.m5985(r4)
            goto L20
        Lc:
            ja0 r1 = new ja0
            r2 = 2
            r1.<init>(r4, r2)
            r0.dismiss()     // Catch: java.lang.Throwable -> L15
        L15:
            android.os.Handler r0 = p000.in0.f5135
            fn0 r2 = new fn0
            r3 = 0
            r2.<init>(r3, r1, r4)
            r0.post(r2)
        L20:
            s62 r4 = p000.s62.f9751
            return r4
    }
}
