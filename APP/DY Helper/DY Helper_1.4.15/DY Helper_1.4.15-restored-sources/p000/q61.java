package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q61 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8889;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f8890;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.widget.TextView f8891;

    public /* synthetic */ q61(android.app.Activity r1, android.widget.TextView r2, int r3) {
            r0 = this;
            r0.f8889 = r3
            r0.f8890 = r1
            r0.f8891 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ q61(android.widget.TextView r2, android.app.Activity r3) {
            r1 = this;
            r0 = 2
            r1.f8889 = r0
            r1.<init>()
            r1.f8891 = r2
            r1.f8890 = r3
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f8889
            s62 r1 = p000.s62.f9751
            android.app.Activity r2 = r3.f8890
            android.widget.TextView r3 = r3.f8891
            switch(r0) {
                case 0: goto L84;
                case 1: goto L3c;
                default: goto Lb;
            }
        Lb:
            mg1 r4 = (p000.mg1) r4
            r4.getClass()
            r0 = 1
            r3.setEnabled(r0)
            boolean r3 = r2.isFinishing()
            if (r3 != 0) goto L3b
            boolean r3 = r2.isDestroyed()
            if (r3 != 0) goto L3b
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r3.<init>(r2)
            java.lang.String r0 = "火星任务结果"
            android.app.AlertDialog$Builder r3 = r3.setTitle(r0)
            java.lang.String r4 = r4.f7129
            android.app.AlertDialog$Builder r3 = r3.setMessage(r4)
            java.lang.String r4 = "确定"
            r0 = 0
            android.app.AlertDialog$Builder r3 = r3.setPositiveButton(r4, r0)
            r3.show()
        L3b:
            return r1
        L3c:
            a80 r4 = (p000.a80) r4
            r4.getClass()
            boolean r4 = p000.AbstractC0976x9.m6526()
            if (r4 != 0) goto L52
            java.lang.String r3 = "隐藏联系人仅限内测用户使用"
            r4 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r2, r3, r4)
            r3.show()
            goto L83
        L52:
            java.util.concurrent.ExecutorService r4 = p000.pd0.f8508
            fi r4 = new fi
            r0 = 2
            r4.<init>(r3, r0)
            r2.getClass()
            boolean r3 = r2.isFinishing()
            if (r3 != 0) goto L83
            boolean r3 = r2.isDestroyed()
            if (r3 == 0) goto L6a
            goto L83
        L6a:
            boolean r3 = p000.AbstractC0976x9.m6526()
            if (r3 != 0) goto L7b
            n9 r3 = new n9
            r4 = 19
            r3.<init>(r2, r4)
            r2.runOnUiThread(r3)
            goto L83
        L7b:
            w1 r3 = new w1
            r3.<init>(r2, r4)
            r2.runOnUiThread(r3)
        L83:
            return r1
        L84:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r4.getClass()
            ii0 r4 = new ii0
            r0 = 4
            r4.<init>(r2, r0, r3)
            r2.runOnUiThread(r4)
            return r1
    }
}
