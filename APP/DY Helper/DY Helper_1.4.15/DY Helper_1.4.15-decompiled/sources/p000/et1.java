package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class et1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3666;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.content.Context f3667;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.app.Activity f3668;

    public /* synthetic */ et1(android.app.Activity r1, android.app.Activity r2, int r3) {
            r0 = this;
            r0.f3666 = r3
            r0.f3667 = r1
            r0.f3668 = r2
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f3666
            r1 = 5
            r2 = 0
            s62 r3 = p000.s62.f9751
            android.app.Activity r4 = r5.f3668
            android.content.Context r5 = r5.f3667
            a80 r6 = (p000.a80) r6
            switch(r0) {
                case 0: goto L7b;
                case 1: goto L37;
                default: goto Lf;
            }
        Lf:
            r6.getClass()
            boolean r0 = p000.AbstractC0976x9.m6530()
            if (r0 != 0) goto L22
            java.lang.String r6 = "该功能仅限内测用户使用"
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r2)
            r5.show()
            goto L36
        L22:
            java.lang.String r5 = "已打开"
            r6.invoke(r5)
            java.util.LinkedHashSet r5 = p000.jz1.f5676
            r4.getClass()
            hg1 r5 = new hg1
            r6 = 10
            r5.<init>(r4, r6)
            r4.runOnUiThread(r5)
        L36:
            return r3
        L37:
            r6.getClass()
            boolean r0 = p000.i81.m2670(r5)
            if (r0 != 0) goto L4d
            r5.getClass()
            java.lang.String r6 = "该功能仅限内测用户使用，请先完成内测验证"
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r2)
            r5.show()
            goto L7a
        L4d:
            xj0 r5 = new xj0
            r0 = 3
            r5.<init>(r6, r0)
            qh1 r6 = new qh1
            r6.<init>(r4, r1, r5)
            r4.getClass()
            ha2 r5 = new ha2
            r5.<init>()
            ic r0 = new ic
            r1 = 11
            r0.<init>(r4, r1, r6)
            r5.f4671 = r0
            android.app.FragmentManager r6 = r4.getFragmentManager()
            android.app.FragmentTransaction r6 = r6.beginTransaction()
            java.lang.String r0 = "dyhelper_voice_replace_file"
            android.app.FragmentTransaction r5 = r6.add(r5, r0)
            r5.commitAllowingStateLoss()
        L7a:
            return r3
        L7b:
            r6.getClass()
            boolean r0 = p000.u90.m5833(r5)
            if (r0 == 0) goto L95
            bv1 r0 = p000.bv1.f1853
            z61 r0 = new z61
            r0.<init>(r5, r1, r6)
            java.lang.String r5 = "删除国外数据库"
            java.lang.String r6 = "删除后国外地区编码将无法显示详细名称。"
            java.lang.String r1 = "删除"
            p000.bv1.m1043(r4, r5, r6, r1, r0)
            goto La0
        L95:
            q71 r5 = p000.q71.f8896
            nt r5 = new nt
            r0 = 1
            r5.<init>(r6, r0)
            p000.q71.m4777(r4, r5)
        La0:
            return r3
    }
}
