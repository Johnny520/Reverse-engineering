package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Y9 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f356a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ Y9(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f356a = r2
            r0.b = r1
            r0.c = r3
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r6) {
            r5 = this;
            int r6 = r5.f356a
            switch(r6) {
                case 0: goto La8;
                case 1: goto L5c;
                default: goto L5;
            }
        L5:
            android.app.AlertDialog$Builder r6 = new android.app.AlertDialog$Builder
            java.lang.Object r0 = r5.b
            a.ra r0 = (a.C0354ra) r0
            android.app.Activity r1 = r0.f669a
            r6.<init>(r1)
            java.lang.String r1 = "确认清空"
            android.app.AlertDialog$Builder r6 = r6.setTitle(r1)
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            java.util.ArrayList r2 = a.K3.a.f()
            int r2 = r2.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "将删除全部 "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " 个伪装，不可撤销。"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.app.AlertDialog$Builder r6 = r6.setMessage(r2)
            a.O9 r2 = new a.O9
            java.lang.Object r3 = r5.c
            a.n5 r3 = (a.C0278n5) r3
            r4 = 1
            r2.<init>(r4, r3)
            android.app.AlertDialog$Builder r6 = r6.setPositiveButton(r1, r2)
            java.lang.String r1 = "取消"
            r2 = 0
            android.app.AlertDialog$Builder r6 = r6.setNegativeButton(r1, r2)
            android.app.AlertDialog r6 = r6.create()
            if (r6 == 0) goto L5b
            r6.show()
            r0.o(r6)
        L5b:
            return
        L5c:
            a.K3$a r6 = a.K3.f148a
            java.lang.Object r0 = r5.b
            top.mmjz.floatingclouds.bean.MaskItemBean r0 = (top.mmjz.floatingclouds.bean.MaskItemBean) r0
            java.lang.String r0 = r0.getMaskId()
            r6.getClass()
            java.lang.String r6 = "chatUser"
            a.C0193i9.e(r0, r6)
            java.util.ArrayList r6 = a.K3.a.f()
            java.util.Iterator r1 = r6.iterator()
            java.lang.String r2 = "iterator(...)"
            a.C0193i9.d(r1, r2)
        L7b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r1.next()
            java.lang.String r3 = "next(...)"
            a.C0193i9.d(r2, r3)
            top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2
            java.lang.String r2 = r2.getMaskId()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L7b
            r1.remove()
            goto L7b
        L9a:
            a.K3.a.s(r6)
            a.K3.a.m()
            java.lang.Object r6 = r5.c
            a.n5 r6 = (a.C0278n5) r6
            r6.a()
            return
        La8:
            java.lang.Object r6 = r5.b
            a.X9$a$b r6 = (a.X9.a.b) r6
            java.lang.Object r0 = r5.c
            a.X9$b$b r0 = (a.X9.b.C0001b) r0
            androidx.appcompat.widget.SwitchCompat r0 = r0.w
            boolean r0 = r0.isChecked()
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            a.l4 r6 = r6.d
            r6.f(r0)
            return
    }
}
