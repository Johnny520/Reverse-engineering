package a;

/* JADX INFO: renamed from: a.pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0319pa implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f639a;
    public final /* synthetic */ a.C0354ra b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0319pa(a.C0354ra r1, int r2) {
            r0 = this;
            r0.f639a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r10, int r11) {
            r9 = this;
            r10 = 0
            java.lang.String r11 = "hotupdate_intercept_events.log"
            r0 = 2
            r1 = 1
            r2 = 0
            int r3 = r9.f639a
            switch(r3) {
                case 0: goto L2c5;
                case 1: goto L29b;
                case 2: goto L257;
                case 3: goto L233;
                case 4: goto L22d;
                case 5: goto L3a;
                default: goto Lb;
            }
        Lb:
            a.K3$a r10 = a.K3.f148a
            r10.getClass()
            android.content.SharedPreferences r10 = a.K3.a.j()     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch: java.lang.Throwable -> L21
            java.lang.String r11 = a.K3.f     // Catch: java.lang.Throwable -> L21
            android.content.SharedPreferences$Editor r10 = r10.putBoolean(r11, r1)     // Catch: java.lang.Throwable -> L21
            r10.apply()     // Catch: java.lang.Throwable -> L21
        L21:
            a.jc r10 = a.K3.a.i()
            r10.M = r2
            a.ra r11 = r9.b
            r11.getClass()
            a.C0354ra.i(r10)
            android.app.AlertDialog r10 = r11.d
            if (r10 == 0) goto L36
            r10.dismiss()
        L36:
            r11.l()
            return
        L3a:
            a.ra r3 = r9.b
            a.K3$a r4 = a.K3.f148a
            r4.getClass()
            java.lang.String r4 = "clear sp data fail sp="
            android.content.SharedPreferences r5 = a.K3.a.j()     // Catch: java.lang.Exception -> L8c
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Exception -> L8c
            android.content.SharedPreferences$Editor r5 = r5.clear()     // Catch: java.lang.Exception -> L8c
            boolean r5 = r5.commit()     // Catch: java.lang.Exception -> L8c
            android.content.SharedPreferences r6 = a.K3.a.h()     // Catch: java.lang.Exception -> L8c
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Exception -> L8c
            android.content.SharedPreferences$Editor r6 = r6.clear()     // Catch: java.lang.Exception -> L8c
            boolean r6 = r6.commit()     // Catch: java.lang.Exception -> L8c
            if (r5 == 0) goto L69
            if (r6 == 0) goto L69
            r7 = r1
            goto L6a
        L69:
            r7 = r2
        L6a:
            if (r7 != 0) goto L9b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8c
            r8.<init>(r4)     // Catch: java.lang.Exception -> L8c
            r8.append(r5)     // Catch: java.lang.Exception -> L8c
            java.lang.String r4 = " optSp="
            r8.append(r4)     // Catch: java.lang.Exception -> L8c
            r8.append(r6)     // Catch: java.lang.Exception -> L8c
            java.lang.String r4 = r8.toString()     // Catch: java.lang.Exception -> L8c
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L8c
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.lang.Exception -> L8c
            a.C0453x1.e(r4)     // Catch: java.lang.Exception -> L8c
            goto L9b
        L8c:
            r4 = move-exception
            java.lang.String r5 = "clear sp data fail"
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            a.C0453x1.e(r0)
            r7 = r2
        L9b:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> La7
            java.io.File r4 = a.gh.b()     // Catch: java.lang.Throwable -> La7
            r0.<init>(r4, r11)     // Catch: java.lang.Throwable -> La7
            r0.delete()     // Catch: java.lang.Throwable -> La7
        La7:
            android.content.Context r11 = a.C0435w1.p     // Catch: java.lang.Throwable -> Ldb
            if (r11 == 0) goto L13a
            java.lang.String r0 = "dexkit_scan_cache"
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r0, r2)     // Catch: java.lang.Throwable -> Ldb
            if (r11 == 0) goto L13a
            android.content.SharedPreferences$Editor r0 = r11.edit()     // Catch: java.lang.Throwable -> Ldb
            java.util.Map r11 = r11.getAll()     // Catch: java.lang.Throwable -> Ldb
            java.util.Set r11 = r11.keySet()     // Catch: java.lang.Throwable -> Ldb
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> Ldb
        Lc3:
            boolean r4 = r11.hasNext()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r5 = "tinker_symbols_v1"
            if (r4 == 0) goto Ldd
            java.lang.Object r4 = r11.next()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Ldb
            boolean r5 = a.C0193i9.a(r4, r5)     // Catch: java.lang.Throwable -> Ldb
            if (r5 != 0) goto Lc3
            r0.remove(r4)     // Catch: java.lang.Throwable -> Ldb
            goto Lc3
        Ldb:
            r11 = move-exception
            goto L131
        Ldd:
            r0.apply()     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object r11 = a.C0043a5.f384a     // Catch: java.lang.Throwable -> Ldb
            if (r11 == 0) goto L115
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Ldb
            r0.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.util.Set r11 = r11.entrySet()     // Catch: java.lang.Throwable -> Ldb
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> Ldb
        Lf1:
            boolean r4 = r11.hasNext()     // Catch: java.lang.Throwable -> Ldb
            if (r4 == 0) goto L116
            java.lang.Object r4 = r11.next()     // Catch: java.lang.Throwable -> Ldb
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Ldb
            boolean r6 = a.C0193i9.a(r6, r5)     // Catch: java.lang.Throwable -> Ldb
            if (r6 == 0) goto Lf1
            java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> Ldb
            r0.put(r6, r4)     // Catch: java.lang.Throwable -> Ldb
            goto Lf1
        L115:
            r0 = r10
        L116:
            a.C0043a5.f384a = r0     // Catch: java.lang.Throwable -> Ldb
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            r11.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r0 = "DexKitCache: clear done, keepTinkerSymbols="
            r11.append(r0)     // Catch: java.lang.Throwable -> Ldb
            r11.append(r1)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch: java.lang.Throwable -> Ldb
            a.C0453x1.b(r11)     // Catch: java.lang.Throwable -> Ldb
            goto L13a
        L131:
            java.lang.String r0 = "DexKitCache: clear failed"
            java.lang.Object[] r11 = new java.lang.Object[]{r0, r11}
            a.C0453x1.e(r11)
        L13a:
            android.content.Context r11 = a.C0435w1.p
            if (r11 == 0) goto L16f
            java.lang.String r0 = "StartupSnapshot"
            java.lang.String r4 = "fc_startup_state"
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r4, r2)     // Catch: java.lang.Exception -> L15d
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch: java.lang.Exception -> L15d
            java.lang.String r2 = "startup_snapshot"
            android.content.SharedPreferences$Editor r11 = r11.remove(r2)     // Catch: java.lang.Exception -> L15d
            r11.apply()     // Catch: java.lang.Exception -> L15d
            java.lang.String r11 = "INVALIDATED manually"
            java.lang.Object[] r11 = new java.lang.Object[]{r0, r11}     // Catch: java.lang.Exception -> L15d
            a.C0453x1.b(r11)     // Catch: java.lang.Exception -> L15d
            goto L16f
        L15d:
            r11 = move-exception
            java.lang.String r11 = r11.getMessage()
            java.lang.String r2 = "invalidate failed: "
            java.lang.String r11 = a.C0487z.k(r2, r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r0, r11}
            a.C0453x1.e(r11)
        L16f:
            android.content.Context r11 = a.C0435w1.p
            if (r11 != 0) goto L175
            goto L1ea
        L175:
            java.lang.String r0 = "mask_wechat_config"
            java.lang.String r2 = "mask_wechat_options"
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}
            java.util.List r0 = a.C0294o3.d0(r0)
            java.util.Iterator r0 = r0.iterator()
        L185:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1ea
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            a.K3$a r4 = a.K3.f148a
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L1e1
            java.io.File r5 = r11.getDataDir()     // Catch: java.lang.Throwable -> L1e1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e1
            r6.<init>()     // Catch: java.lang.Throwable -> L1e1
            java.lang.String r8 = "shared_prefs/"
            r6.append(r8)     // Catch: java.lang.Throwable -> L1e1
            r6.append(r2)     // Catch: java.lang.Throwable -> L1e1
            java.lang.String r8 = ".xml"
            r6.append(r8)     // Catch: java.lang.Throwable -> L1e1
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1e1
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L1e1
            boolean r5 = r4.exists()     // Catch: java.lang.Throwable -> L1e1
            if (r5 == 0) goto L1e3
            boolean r4 = r4.delete()     // Catch: java.lang.Throwable -> L1e1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e1
            r5.<init>()     // Catch: java.lang.Throwable -> L1e1
            java.lang.String r6 = "ConfigUtil: delete legacy SP "
            r5.append(r6)     // Catch: java.lang.Throwable -> L1e1
            r5.append(r2)     // Catch: java.lang.Throwable -> L1e1
            java.lang.String r2 = ".xml ok="
            r5.append(r2)     // Catch: java.lang.Throwable -> L1e1
            r5.append(r4)     // Catch: java.lang.Throwable -> L1e1
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L1e1
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L1e1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)     // Catch: java.lang.Throwable -> L1e1
            a.C0453x1.b(r2)     // Catch: java.lang.Throwable -> L1e1
            goto L1e3
        L1e1:
            r2 = move-exception
            goto L1e6
        L1e3:
            a.Wf r2 = a.Wf.f330a     // Catch: java.lang.Throwable -> L1e1
            goto L185
        L1e6:
            a.C0465xd.a(r2)
            goto L185
        L1ea:
            android.content.Context r11 = a.C0435w1.p
            if (r11 == 0) goto L1fa
            a.K3$a r0 = a.K3.f148a
            a.C0435w1.d(r11)     // Catch: java.lang.Throwable -> L1f6
            a.Wf r11 = a.Wf.f330a     // Catch: java.lang.Throwable -> L1f6
            goto L1fa
        L1f6:
            r11 = move-exception
            a.C0465xd.a(r11)
        L1fa:
            a.K3.j = r10
            a.K3.k = r10
            a.K3.l = r10
            a.K3.a.m()
            android.content.SharedPreferences r10 = a.K3.a.j()     // Catch: java.lang.Throwable -> L214
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch: java.lang.Throwable -> L214
            java.lang.String r11 = a.K3.g     // Catch: java.lang.Throwable -> L214
            android.content.SharedPreferences$Editor r10 = r10.putBoolean(r11, r1)     // Catch: java.lang.Throwable -> L214
            r10.apply()     // Catch: java.lang.Throwable -> L214
        L214:
            android.app.AlertDialog r10 = r3.d
            if (r10 == 0) goto L21b
            r10.dismiss()
        L21b:
            if (r7 != 0) goto L229
            android.app.Activity r10 = r3.f669a
            java.lang.String r11 = "配置清理未完全成功，已取消重启，请重试"
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r11, r1)
            r10.show()
            goto L22c
        L229:
            r3.h()
        L22c:
            return
        L22d:
            a.ra r10 = r9.b
            r10.h()
            return
        L233:
            a.if r10 = a.Cif.f512a
            r10.getClass()
            a.K3$a r10 = a.K3.f148a
            r10.getClass()
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L249
            java.io.File r0 = a.gh.b()     // Catch: java.lang.Throwable -> L249
            r10.<init>(r0, r11)     // Catch: java.lang.Throwable -> L249
            r10.delete()     // Catch: java.lang.Throwable -> L249
        L249:
            a.ra r10 = r9.b
            android.app.Activity r10 = r10.f669a
            java.lang.String r11 = "拦截记录已清零"
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r11, r2)
            r10.show()
            return
        L257:
            android.widget.EditText r11 = new android.widget.EditText
            a.ra r1 = r9.b
            android.app.Activity r2 = r1.f669a
            r11.<init>(r2)
            java.lang.String r2 = "输入朋友圈 snsId"
            r11.setHint(r2)
            a.ra$a r2 = r1.b
            int r2 = r2.d
            r11.setTextColor(r2)
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.app.Activity r3 = r1.f669a
            r2.<init>(r3)
            java.lang.String r3 = "添加要隐藏的朋友圈"
            android.app.AlertDialog$Builder r2 = r2.setTitle(r3)
            android.app.AlertDialog$Builder r2 = r2.setView(r11)
            a.O9 r3 = new a.O9
            r3.<init>(r0, r11)
            java.lang.String r11 = "添加"
            android.app.AlertDialog$Builder r11 = r2.setPositiveButton(r11, r3)
            java.lang.String r0 = "取消"
            android.app.AlertDialog$Builder r10 = r11.setNegativeButton(r0, r10)
            android.app.AlertDialog r10 = r10.create()
            if (r10 == 0) goto L29a
            r10.show()
            r1.o(r10)
        L29a:
            return
        L29b:
            a.K3$a r10 = a.K3.f148a
            r10.getClass()
            android.content.SharedPreferences r10 = a.K3.a.j()     // Catch: java.lang.Throwable -> L2b7
            android.content.SharedPreferences$Editor r10 = r10.edit()     // Catch: java.lang.Throwable -> L2b7
            java.lang.String r11 = "version_initial_snapshot"
            android.content.SharedPreferences$Editor r10 = r10.remove(r11)     // Catch: java.lang.Throwable -> L2b7
            java.lang.String r11 = "version_latest_snapshot"
            android.content.SharedPreferences$Editor r10 = r10.remove(r11)     // Catch: java.lang.Throwable -> L2b7
            r10.apply()     // Catch: java.lang.Throwable -> L2b7
        L2b7:
            a.ra r10 = r9.b
            android.app.Activity r10 = r10.f669a
            java.lang.String r11 = "快照已重置，点击刷新重新采集"
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r11, r2)
            r10.show()
            return
        L2c5:
            a.ra r10 = r9.b
            r10.m()
            return
    }
}
