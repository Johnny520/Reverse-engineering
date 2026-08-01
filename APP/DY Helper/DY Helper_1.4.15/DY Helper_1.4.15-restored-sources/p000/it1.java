package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class it1 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5183;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f5184;

    public /* synthetic */ it1(android.app.Activity r1, int r2) {
            r0 = this;
            r0.f5183 = r2
            r0.f5184 = r1
            r0.<init>()
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.f5183
            java.lang.String r1 = "自动审批仅限内测用户使用"
            r2 = 0
            s62 r3 = p000.s62.f9751
            android.app.Activity r5 = r5.f5184
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            switch(r0) {
                case 0: goto Lc2;
                case 1: goto L9b;
                case 2: goto L6e;
                case 3: goto L46;
                case 4: goto L33;
                case 5: goto L20;
                default: goto Le;
            }
        Le:
            boolean r6 = r6.booleanValue()
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            au1 r0 = new au1
            r0.<init>(r6, r5, r7)
            r5.runOnUiThread(r0)
            return r3
        L20:
            r6.getClass()
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            xx0 r6 = new xx0
            r0 = 13
            r6.<init>(r5, r7, r0)
            r5.runOnUiThread(r6)
            return r3
        L33:
            r6.getClass()
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            xx0 r6 = new xx0
            r0 = 12
            r6.<init>(r5, r7, r0)
            r5.runOnUiThread(r6)
            return r3
        L46:
            boolean r6 = r6.booleanValue()
            android.widget.Switch r7 = (android.widget.Switch) r7
            r7.getClass()
            java.lang.String r7 = "pet_elf_camp_show_top_notification"
            p000.ui1.m5871(r7, r6)
            java.util.concurrent.atomic.AtomicReference r7 = p000.dd1.f3093
            r5.getClass()
            java.util.concurrent.atomic.AtomicReference r7 = p000.dd1.f3093
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r7.set(r0)
            if (r6 != 0) goto L6d
            com.example.dyhelper.ui.φ r6 = new com.example.dyhelper.ui.φ
            r6.<init>(r5)
            com.example.dyhelper.p002ui.C0182.m1597(r6)
        L6d:
            return r3
        L6e:
            boolean r6 = r6.booleanValue()
            android.widget.Switch r7 = (android.widget.Switch) r7
            r7.getClass()
            bv1 r7 = p000.bv1.f1853
            java.lang.String r7 = "version_update_check_enabled"
            p000.ui1.m5871(r7, r6)
            if (r6 == 0) goto L91
            p000.u72.m5796(r5)
            r6 = 1
            p000.u72.m5792(r6)
            java.lang.String r6 = "已开启版本更新检查"
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r2)
            r5.show()
            goto L9a
        L91:
            java.lang.String r6 = "已关闭版本更新检查"
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r2)
            r5.show()
        L9a:
            return r3
        L9b:
            boolean r6 = r6.booleanValue()
            android.widget.Switch r7 = (android.widget.Switch) r7
            bv1 r0 = p000.bv1.f1853
            r7.getClass()
            java.lang.String r0 = "group_apply_auto_approval_polling_enabled"
            if (r6 == 0) goto Lbe
            boolean r4 = p000.AbstractC0976x9.m6525()
            if (r4 != 0) goto Lbe
            p000.ui1.m5871(r0, r2)
            r7.setChecked(r2)
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r1, r2)
            r5.show()
            goto Lc1
        Lbe:
            p000.ui1.m5871(r0, r6)
        Lc1:
            return r3
        Lc2:
            boolean r6 = r6.booleanValue()
            android.widget.Switch r7 = (android.widget.Switch) r7
            bv1 r0 = p000.bv1.f1853
            r7.getClass()
            java.lang.String r0 = "group_apply_auto_approval_cold_start_enabled"
            if (r6 == 0) goto Le5
            boolean r4 = p000.AbstractC0976x9.m6525()
            if (r4 != 0) goto Le5
            p000.ui1.m5871(r0, r2)
            r7.setChecked(r2)
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r1, r2)
            r5.show()
            goto Le8
        Le5:
            p000.ui1.m5871(r0, r6)
        Le8:
            return r3
    }
}
