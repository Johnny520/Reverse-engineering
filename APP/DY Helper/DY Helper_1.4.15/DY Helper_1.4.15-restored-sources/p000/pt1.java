package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pt1 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8698;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.um1 f8699;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.app.Activity f8700;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.wu1 f8701;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.widget.TextView f8702;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ android.widget.TextView f8703;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ android.widget.TextView f8704;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ android.widget.TextView f8705;

    public /* synthetic */ pt1(android.app.Activity r2, p000.um1 r3, p000.wu1 r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.TextView r7, android.widget.TextView r8) {
            r1 = this;
            r0 = 0
            r1.f8698 = r0
            r1.<init>()
            r1.f8700 = r2
            r1.f8699 = r3
            r1.f8701 = r4
            r1.f8702 = r5
            r1.f8703 = r6
            r1.f8704 = r7
            r1.f8705 = r8
            return
    }

    public /* synthetic */ pt1(p000.um1 r2, android.app.Activity r3, p000.wu1 r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.TextView r7, android.widget.TextView r8) {
            r1 = this;
            r0 = 1
            r1.f8698 = r0
            r1.<init>()
            r1.f8699 = r2
            r1.f8700 = r3
            r1.f8701 = r4
            r1.f8702 = r5
            r1.f8703 = r6
            r1.f8704 = r7
            r1.f8705 = r8
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r10) {
            r9 = this;
            int r10 = r9.f8698
            switch(r10) {
                case 0: goto L39;
                default: goto L5;
            }
        L5:
            um1 r0 = r9.f8699
            java.lang.Object r10 = r0.f10912
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = p000.q02.m4671(r10)
            android.app.Activity r6 = r9.f8700
            r7 = 0
            if (r10 == 0) goto L1e
            java.lang.String r9 = "当前没有筛选条件"
            android.widget.Toast r9 = android.widget.Toast.makeText(r6, r9, r7)
            r9.show()
            goto L38
        L1e:
            java.lang.String r10 = ""
            r0.f10912 = r10
            wu1 r1 = r9.f8701
            android.widget.TextView r2 = r9.f8702
            android.widget.TextView r3 = r9.f8703
            android.widget.TextView r4 = r9.f8704
            android.widget.TextView r5 = r9.f8705
            p000.bv1.m1045(r0, r1, r2, r3, r4, r5)
            java.lang.String r9 = "已清除筛选"
            android.widget.Toast r9 = android.widget.Toast.makeText(r6, r9, r7)
            r9.show()
        L38:
            return
        L39:
            r10 = 0
            r0 = 4
            java.lang.String r1 = "DYHelper"
            java.lang.String r2 = "刷新 DyLog 日志查看器"
            p000.C0888ux.m5988(r1, r2, r10, r0, r10)
            um1 r3 = r9.f8699
            wu1 r4 = r9.f8701
            android.widget.TextView r5 = r9.f8702
            android.widget.TextView r6 = r9.f8703
            android.widget.TextView r7 = r9.f8704
            android.widget.TextView r8 = r9.f8705
            p000.bv1.m1045(r3, r4, r5, r6, r7, r8)
            java.lang.String r10 = "已刷新日志"
            r0 = 0
            android.app.Activity r9 = r9.f8700
            android.widget.Toast r9 = android.widget.Toast.makeText(r9, r10, r0)
            r9.show()
            return
    }
}
