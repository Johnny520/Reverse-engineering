package a;

/* JADX INFO: renamed from: a.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0301oa implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f624a;
    public final /* synthetic */ android.widget.TextView b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ android.view.View d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ ViewOnClickListenerC0301oa(java.lang.Object r1, android.view.View r2, android.widget.TextView r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.f624a = r5
            r0.c = r1
            r0.d = r2
            r0.b = r3
            r0.e = r4
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r3.f624a
            switch(r4) {
                case 0: goto L40;
                default: goto L5;
            }
        L5:
            java.lang.Object r4 = r3.c
            a.Qc r4 = (a.Qc) r4
            boolean r0 = r4.f231a
            r1 = r0 ^ 1
            r4.f231a = r1
            if (r0 != 0) goto L13
            r0 = 0
            goto L15
        L13:
            r0 = 8
        L15:
            android.view.View r1 = r3.d
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            r1.setVisibility(r0)
            boolean r4 = r4.f231a
            java.lang.Object r0 = r3.e
            java.util.List r0 = (java.util.List) r0
            if (r4 == 0) goto L31
            int r4 = r0.size()
            java.lang.String r0 = "▾ 最近事件（"
            java.lang.String r1 = " 条）点击收起"
        L2c:
            java.lang.String r4 = a.C0487z.c(r4, r0, r1)
            goto L3a
        L31:
            int r4 = r0.size()
            java.lang.String r0 = "▸ 最近事件（"
            java.lang.String r1 = " 条）点击展开"
            goto L2c
        L3a:
            android.widget.TextView r0 = r3.b
            r0.setText(r4)
            return
        L40:
            android.view.View r4 = r3.d
            android.widget.EditText r4 = (android.widget.EditText) r4
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.Object r0 = r3.c
            a.D7 r0 = (a.D7) r0
            r0.f(r4)
            android.widget.TextView r4 = r3.b
            java.lang.String r0 = "已保存"
            r4.setText(r0)
            a.M2 r0 = new a.M2
            r1 = 12
            r0.<init>(r1, r4)
            r1 = 1500(0x5dc, double:7.41E-321)
            r4.postDelayed(r0, r1)
            java.lang.Object r4 = r3.e
            a.ra r4 = (a.C0354ra) r4
            android.app.Activity r4 = r4.f669a
            java.lang.String r0 = "保存成功"
            r1 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r0, r1)
            r4.show()
            return
    }
}
