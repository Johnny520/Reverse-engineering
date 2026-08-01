package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kt1 implements p000.e80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6114;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.qm1 f6115;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.app.Activity f6116;

    public /* synthetic */ kt1(p000.qm1 r1, android.app.Activity r2, int r3) {
            r0 = this;
            r0.f6114 = r3
            r0.f6115 = r1
            r0.f6116 = r2
            r0.<init>()
            return
    }

    @Override // p000.e80
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f6114
            java.lang.String r1 = "隐藏联系人仅限内测用户使用"
            s62 r2 = p000.s62.f9751
            r3 = 1
            r4 = 0
            android.app.Activity r5 = r7.f6116
            qm1 r7 = r7.f6115
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            android.widget.Switch r9 = (android.widget.Switch) r9
            switch(r0) {
                case 0: goto L6d;
                case 1: goto L43;
                default: goto L17;
            }
        L17:
            r9.getClass()
            boolean r0 = r7.f9050
            if (r0 != 0) goto L37
            if (r8 == 0) goto L37
            boolean r0 = p000.AbstractC0976x9.m6524()
            if (r0 != 0) goto L37
            r7.f9050 = r3
            r9.setChecked(r4)
            r7.f9050 = r4
            java.lang.String r7 = "会话批量删除仅限内测用户使用"
            android.widget.Toast r7 = android.widget.Toast.makeText(r5, r7, r4)
            r7.show()
            goto L42
        L37:
            boolean r7 = r7.f9050
            if (r7 != 0) goto L42
            bv1 r7 = p000.bv1.f1853
            java.lang.String r7 = "im_conversation_delete_entry_enabled"
            p000.ui1.m5871(r7, r8)
        L42:
            return r2
        L43:
            r9.getClass()
            boolean r0 = r7.f9050
            if (r0 != 0) goto L61
            if (r8 == 0) goto L61
            boolean r0 = p000.AbstractC0976x9.m6526()
            if (r0 != 0) goto L61
            r7.f9050 = r3
            r9.setChecked(r4)
            r7.f9050 = r4
            android.widget.Toast r7 = android.widget.Toast.makeText(r5, r1, r4)
            r7.show()
            goto L6c
        L61:
            boolean r7 = r7.f9050
            if (r7 != 0) goto L6c
            bv1 r7 = p000.bv1.f1853
            java.lang.String r7 = "hidden_contact_operation_toggle_enabled"
            p000.ui1.m5871(r7, r8)
        L6c:
            return r2
        L6d:
            r9.getClass()
            boolean r0 = r7.f9050
            if (r0 != 0) goto L8c
            if (r8 == 0) goto L8c
            boolean r0 = p000.AbstractC0976x9.m6526()
            if (r0 != 0) goto L8c
            r7.f9050 = r3
            r9.setChecked(r4)
            r7.f9050 = r4
            android.widget.Toast r7 = android.widget.Toast.makeText(r5, r1, r4)
            r7.show()
            goto Lf7
        L8c:
            boolean r0 = r7.f9050
            if (r0 != 0) goto Lda
            be0 r0 = p000.be0.f1670
            if (r8 == 0) goto L9b
            boolean r1 = p000.AbstractC0976x9.m6526()
            if (r1 != 0) goto L9b
            goto Lc8
        L9b:
            r0.m937()
            java.lang.String r1 = p000.be0.m929()
            int r6 = r1.length()
            if (r6 != 0) goto La9
            goto Lc8
        La9:
            java.lang.String r6 = "hidden_contact_enabled_v2"
            p000.ui1.m5871(r6, r8)
            java.lang.String r6 = "set_enabled"
            r0.m944(r6)
            java.util.concurrent.atomic.AtomicReference r0 = p000.be0.f1673
            java.lang.Object r0 = r0.get()
            zd0 r0 = (p000.zd0) r0
            java.lang.String r6 = r0.f13043
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto Lc8
            boolean r0 = r0.f13044
            if (r0 != r8) goto Lc8
            goto Lda
        Lc8:
            r7.f9050 = r3
            r8 = r8 ^ r3
            r9.setChecked(r8)
            r7.f9050 = r4
            java.lang.String r7 = "当前账号尚未识别"
            android.widget.Toast r7 = android.widget.Toast.makeText(r5, r7, r4)
            r7.show()
            goto Lf7
        Lda:
            boolean r7 = r7.f9050
            if (r7 != 0) goto Lf7
            if (r8 == 0) goto Lf7
            java.lang.Class r7 = r5.getClass()
            java.lang.ClassLoader r7 = r7.getClassLoader()
            if (r7 == 0) goto Lee
            p000.qd0.m4865(r7)
            goto Lf7
        Lee:
            java.lang.String r7 = "宿主环境尚未就绪，下次启动后生效"
            android.widget.Toast r7 = android.widget.Toast.makeText(r5, r7, r4)
            r7.show()
        Lf7:
            return r2
    }
}
