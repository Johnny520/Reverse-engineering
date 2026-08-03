package a;

/* JADX INFO: renamed from: a.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0201j0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f518a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ RunnableC0201j0(a.C0366s4.a.C0005a.EnumC0006a r2, boolean r3, a.C0366s4 r4, a.InterfaceC0369s7 r5) {
            r1 = this;
            r0 = 1
            r1.f518a = r0
            r1.<init>()
            r1.c = r2
            r1.b = r3
            r1.d = r4
            r1.e = r5
            return
    }

    public /* synthetic */ RunnableC0201j0(boolean r2, android.app.Activity r3, java.lang.String r4, android.app.ProgressDialog r5) {
            r1 = this;
            r0 = 0
            r1.f518a = r0
            r1.<init>()
            r1.b = r2
            r1.c = r3
            r1.d = r4
            r1.e = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            r0 = 0
            r1 = 1
            int r2 = r10.f518a
            switch(r2) {
                case 0: goto Le6;
                default: goto L7;
            }
        L7:
            java.lang.Object r2 = r10.c
            a.s4$a$a$a r2 = (a.C0366s4.a.C0005a.EnumC0006a) r2
            boolean r3 = r10.b
            java.lang.Object r4 = r10.d
            a.s4 r4 = (a.C0366s4) r4
            java.lang.Object r5 = r10.e
            a.s7 r5 = (a.InterfaceC0369s7) r5
            a.s4$a$a r6 = a.C0366s4.a.C0005a.f679a
            boolean r7 = a.C0366s4.a.C0005a.a(r2)
            if (r7 != 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "[HideMainUI] toggleHide("
            r0.<init>(r4)
            r0.append(r3)
            java.lang.String r3 = ") STALE: expected="
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = " actual="
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
            goto Ldd
        L48:
            if (r3 == 0) goto L59
            a.K3$a r6 = a.K3.f148a
            r6.getClass()
            a.jc r6 = a.K3.a.i()
            boolean r6 = r6.q
            if (r6 != 0) goto L59
            goto Ldd
        L59:
            a.C0366s4.J = r1
            a.K3$a r6 = a.K3.f148a     // Catch: java.lang.Throwable -> L87
            r6.getClass()     // Catch: java.lang.Throwable -> L87
            java.util.ArrayList r6 = a.K3.a.f()     // Catch: java.lang.Throwable -> L87
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L87
            r8 = 10
            int r8 = a.C0312p3.g0(r6, r8)     // Catch: java.lang.Throwable -> L87
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L87
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L87
        L73:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> L87
            if (r8 == 0) goto L89
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L87
            top.mmjz.floatingclouds.bean.MaskItemBean r8 = (top.mmjz.floatingclouds.bean.MaskItemBean) r8     // Catch: java.lang.Throwable -> L87
            java.lang.String r8 = r8.getMaskId()     // Catch: java.lang.Throwable -> L87
            r7.add(r8)     // Catch: java.lang.Throwable -> L87
            goto L73
        L87:
            r1 = move-exception
            goto Lde
        L89:
            a.A3 r6 = new a.A3     // Catch: java.lang.Throwable -> L87
            r6.<init>(r1, r2)     // Catch: java.lang.Throwable -> L87
            int r2 = a.C0134f4.a(r7, r3, r6)     // Catch: java.lang.Throwable -> L87
            int r6 = r7.size()     // Catch: java.lang.Throwable -> L87
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r7.<init>()     // Catch: java.lang.Throwable -> L87
            java.lang.String r8 = "[HideMainUI] toggleHide: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L87
            r7.append(r2)     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = "/"
            r7.append(r2)     // Catch: java.lang.Throwable -> L87
            r7.append(r6)     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = " hide="
            r7.append(r2)     // Catch: java.lang.Throwable -> L87
            r7.append(r3)     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L87
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L87
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)     // Catch: java.lang.Throwable -> L87
            a.C0453x1.b(r1)     // Catch: java.lang.Throwable -> L87
            a.C0366s4.J = r0
            if (r3 == 0) goto Lc9
            r4.f()
        Lc9:
            if (r5 == 0) goto Ldd
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            a.M2 r1 = new a.M2
            r2 = 6
            r1.<init>(r2, r5)
            r0.post(r1)
        Ldd:
            return
        Lde:
            a.C0366s4.J = r0
            if (r3 == 0) goto Le5
            r4.f()
        Le5:
            throw r1
        Le6:
            boolean r2 = r10.b
            java.lang.Object r3 = r10.c
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r4 = r10.d
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r10.e
            android.app.ProgressDialog r5 = (android.app.ProgressDialog) r5
            r5.dismiss()     // Catch: java.lang.Throwable -> Lfa
            a.Wf r5 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lfa
            goto Lfe
        Lfa:
            r5 = move-exception
            a.C0465xd.a(r5)
        Lfe:
            if (r2 == 0) goto L198
            a.m0 r2 = a.C0255m0.f569a
            r2.getClass()
            java.lang.String r2 = "AdaptationManager"
            java.lang.String r4 = " pluginUpdate=1785635034120"
            java.lang.String r5 = "saveVersionInfo plugin=316 wechat="
            java.lang.String r6 = "adaptation_state_v2"
            android.content.SharedPreferences r6 = r3.getSharedPreferences(r6, r0)     // Catch: java.lang.Exception -> L15f
            java.lang.String r7 = "getSharedPreferences(...)"
            a.C0193i9.d(r6, r7)     // Catch: java.lang.Exception -> L15f
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Exception -> L15f
            java.lang.String r7 = "last_plugin_version_code"
            r8 = 316(0x13c, float:4.43E-43)
            android.content.SharedPreferences$Editor r6 = r6.putInt(r7, r8)     // Catch: java.lang.Exception -> L15f
            java.lang.String r7 = "last_wechat_version_code"
            int r8 = a.C0255m0.d(r3)     // Catch: java.lang.Exception -> L15f
            android.content.SharedPreferences$Editor r6 = r6.putInt(r7, r8)     // Catch: java.lang.Exception -> L15f
            java.lang.String r7 = "last_plugin_update_time"
            r8 = 1785635034120(0x19fc0245408, double:8.822209263693E-312)
            android.content.SharedPreferences$Editor r6 = r6.putLong(r7, r8)     // Catch: java.lang.Exception -> L15f
            java.lang.String r7 = "last_adaptation_time"
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L15f
            android.content.SharedPreferences$Editor r6 = r6.putLong(r7, r8)     // Catch: java.lang.Exception -> L15f
            r6.apply()     // Catch: java.lang.Exception -> L15f
            int r6 = a.C0255m0.d(r3)     // Catch: java.lang.Exception -> L15f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L15f
            r7.<init>(r5)     // Catch: java.lang.Exception -> L15f
            r7.append(r6)     // Catch: java.lang.Exception -> L15f
            r7.append(r4)     // Catch: java.lang.Exception -> L15f
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Exception -> L15f
            java.lang.Object[] r4 = new java.lang.Object[]{r2, r4}     // Catch: java.lang.Exception -> L15f
            a.C0453x1.b(r4)     // Catch: java.lang.Exception -> L15f
            goto L169
        L15f:
            r4 = move-exception
            java.lang.String r5 = "saveVersionInfo failed"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5, r4}
            a.C0453x1.a(r2)
        L169:
            a.m0 r2 = a.C0255m0.f569a
            r2.getClass()
            android.app.AlertDialog$Builder r2 = a.C0255m0.e(r3)
            java.lang.String r4 = "适配完成"
            android.app.AlertDialog$Builder r2 = r2.setTitle(r4)
            java.lang.String r4 = "扫描适配已完成，即将自动重启微信以生效。"
            android.app.AlertDialog$Builder r2 = r2.setMessage(r4)
            android.app.AlertDialog$Builder r0 = r2.setCancelable(r0)
            a.f0 r2 = new a.f0
            r2.<init>(r3, r1)
            java.lang.String r1 = "立即重启"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.app.AlertDialog r0 = r0.show()
            a.C0193i9.b(r0)
            a.C0255m0.a(r0, r3)
            goto L1c8
        L198:
            a.C0255m0.c = r0
            a.m0 r0 = a.C0255m0.f569a
            if (r4 != 0) goto L1a0
            java.lang.String r4 = "扫描失败，请查看日志确认详情。"
        L1a0:
            r0.getClass()
            android.app.AlertDialog$Builder r0 = a.C0255m0.e(r3)
            java.lang.String r1 = "适配异常"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.String r1 = "\n\n可稍后从设置页手动重新扫描适配。"
            java.lang.String r1 = r4.concat(r1)
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            java.lang.String r1 = "确定"
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            android.app.AlertDialog r0 = r0.show()
            a.C0193i9.b(r0)
            a.C0255m0.a(r0, r3)
        L1c8:
            return
    }
}
