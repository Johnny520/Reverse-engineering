package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e71 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3435;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f3436;

    public /* synthetic */ e71(android.app.Activity r1, int r2) {
            r0 = this;
            r0.f3435 = r2
            r0.f3436 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r21 = this;
            r0 = r21
            int r1 = r0.f3435
            java.lang.String r2 = "下载图片"
            r3 = 6
            java.lang.String r4 = "DYHelper"
            r5 = 7
            java.lang.String r6 = "选择下载"
            r7 = 1
            r8 = 0
            s62 r9 = p000.s62.f9751
            android.app.Activity r10 = r0.f3436
            switch(r1) {
                case 0: goto L2b8;
                case 1: goto L24b;
                case 2: goto L21e;
                case 3: goto L1f3;
                case 4: goto L1e8;
                case 5: goto L1d4;
                case 6: goto L196;
                case 7: goto L188;
                case 8: goto L17e;
                case 9: goto L167;
                case 10: goto L15a;
                case 11: goto L14d;
                case 12: goto L13e;
                case 13: goto L133;
                case 14: goto L128;
                case 15: goto L11b;
                case 16: goto Lb3;
                case 17: goto L9a;
                case 18: goto L25;
                default: goto L15;
            }
        L15:
            boolean r0 = r10.isFinishing()
            if (r0 != 0) goto L24
            boolean r0 = r10.isDestroyed()
            if (r0 != 0) goto L24
            r10.finish()
        L24:
            return r9
        L25:
            java.lang.String r0 = "user_clear_from_settings"
            java.lang.Object r1 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L6a
            p000.C0666ox.m4317()     // Catch: java.lang.Throwable -> L6a
            android.os.Handler r1 = p000.C0661os.f8210     // Catch: java.lang.Throwable -> L6a
            if (r10 != 0) goto L31
            goto L4b
        L31:
            java.lang.String r1 = "dyhelper_dexkit_progress"
            android.content.SharedPreferences r1 = r10.getSharedPreferences(r1, r8)     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = p000.C0661os.m4288(r10)     // Catch: java.lang.Throwable -> L46
            android.content.SharedPreferences$Editor r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L46
            r1.apply()     // Catch: java.lang.Throwable -> L46
        L46:
            java.lang.String r1 = "restart prompt ack reset"
            p000.C0661os.m4293(r1)     // Catch: java.lang.Throwable -> L6a
        L4b:
            int r1 = p000.C0410ix.f5220     // Catch: java.lang.Throwable -> L6a
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.C0410ix.f5230     // Catch: java.lang.Throwable -> L6a
            r1.set(r8)     // Catch: java.lang.Throwable -> L6a
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.C0410ix.f5229     // Catch: java.lang.Throwable -> L6a
            r1.set(r8)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "reset for next host resume, reason="
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> L6a
            p000.C0410ix.m2820(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "DexKit 缓存已清除，下次进入宿主将重新全量适配"
            android.widget.Toast r0 = android.widget.Toast.makeText(r10, r0, r8)     // Catch: java.lang.Throwable -> L6a
            r0.show()     // Catch: java.lang.Throwable -> L6a
            goto L99
        L6a:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "清除失败: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.widget.Toast r1 = android.widget.Toast.makeText(r10, r1, r8)
            r1.show()
            java.lang.String r1 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "清除 DexKit 缓存失败: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            p000.C0888ux.m5987(r4, r1, r0)
        L99:
            return r9
        L9a:
            java.lang.String r0 = "正在清除全部用户配置…"
            android.widget.Toast r0 = android.widget.Toast.makeText(r10, r0, r8)
            r0.show()
            java.lang.Thread r0 = new java.lang.Thread
            hg1 r1 = new hg1
            r1.<init>(r10, r5)
            java.lang.String r2 = "DY-ClearAllPrefs"
            r0.<init>(r1, r2)
            r0.start()
            return r9
        Lb3:
            it1 r0 = new it1
            r0.<init>(r10, r3)
            r10.getClass()
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r2 = "android.intent.action.OPEN_DOCUMENT"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r2 = "android.intent.category.OPENABLE"
            r1.addCategory(r2)     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r2 = "application/json"
            r1.setType(r2)     // Catch: java.lang.Throwable -> Lfb
            bt1 r2 = new bt1     // Catch: java.lang.Throwable -> Lfb
            r2.<init>()     // Catch: java.lang.Throwable -> Lfb
            r3 = 2
            r2.f1835 = r3     // Catch: java.lang.Throwable -> Lfb
            r2.f1837 = r0     // Catch: java.lang.Throwable -> Lfb
            android.app.FragmentManager r0 = r10.getFragmentManager()     // Catch: java.lang.Throwable -> Lfb
            android.app.FragmentTransaction r0 = r0.beginTransaction()     // Catch: java.lang.Throwable -> Lfb
            java.lang.String r3 = "dyhelper_config_import"
            android.app.FragmentTransaction r0 = r0.add(r2, r3)     // Catch: java.lang.Throwable -> Lfb
            r0.commitAllowingStateLoss()     // Catch: java.lang.Throwable -> Lfb
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> Lfb
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> Lfb
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lfb
            at1 r3 = new at1     // Catch: java.lang.Throwable -> Lfb
            r3.<init>(r2, r1, r7)     // Catch: java.lang.Throwable -> Lfb
            r1 = 100
            r0.postDelayed(r3, r1)     // Catch: java.lang.Throwable -> Lfb
            goto L11a
        Lfb:
            r0 = move-exception
            java.lang.String r1 = "导入用户配置失败"
            p000.C0888ux.m5977(r4, r1, r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "导入失败: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.widget.Toast r0 = android.widget.Toast.makeText(r10, r0, r8)
            r0.show()
        L11a:
            return r9
        L11b:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r1 = 25
            r0.<init>(r10, r1)
            p000.q71.m4783(r10, r6, r0)
            return r9
        L128:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r0.<init>(r10, r5)
            p000.q71.m4783(r10, r2, r0)
            return r9
        L133:
            q71 r0 = p000.q71.f8896
            g71 r0 = new g71
            r0.<init>(r10, r7)
            p000.q71.m4783(r10, r6, r0)
            return r9
        L13e:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r1 = 27
            r0.<init>(r10, r1)
            java.lang.String r1 = "下载视频"
            p000.q71.m4783(r10, r1, r0)
            return r9
        L14d:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r1 = 23
            r0.<init>(r10, r1)
            p000.q71.m4783(r10, r6, r0)
            return r9
        L15a:
            q71 r0 = p000.q71.f8896
            f9 r0 = new f9
            r1 = 29
            r0.<init>(r10, r1)
            p000.q71.m4783(r10, r2, r0)
            return r9
        L167:
            android.view.Window r0 = r10.getWindow()
            if (r0 == 0) goto L17d
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L17d
            n9 r1 = new n9
            r2 = 26
            r1.<init>(r10, r2)
            r0.post(r1)
        L17d:
            return r9
        L17e:
            q71 r0 = p000.q71.f8896
            java.lang.String r0 = p000.q71.m4772()
            p000.q71.m4802(r10, r0)
            return r9
        L188:
            r10.getClass()
            n9 r0 = new n9
            r1 = 20
            r0.<init>(r10, r1)
            r10.runOnUiThread(r0)
            return r9
        L196:
            boolean r0 = p000.AbstractC0976x9.m6525()
            if (r0 != 0) goto L1a6
            java.lang.String r0 = "群管理为内测功能，请联系开发者申请"
            android.widget.Toast r0 = android.widget.Toast.makeText(r10, r0, r7)
            r0.show()
            goto L1d3
        L1a6:
            android.os.Handler r0 = p000.ec0.f3479
            r10.getClass()
            boolean r0 = r10.isFinishing()
            if (r0 != 0) goto L1d3
            boolean r0 = r10.isDestroyed()
            if (r0 == 0) goto L1b8
            goto L1d3
        L1b8:
            boolean r0 = p000.AbstractC0976x9.m6525()
            if (r0 != 0) goto L1c9
            n9 r0 = new n9
            r1 = 17
            r0.<init>(r10, r1)
            r10.runOnUiThread(r0)
            goto L1d3
        L1c9:
            n9 r0 = new n9
            r1 = 18
            r0.<init>(r10, r1)
            r10.runOnUiThread(r0)
        L1d3:
            return r9
        L1d4:
            boolean r0 = p000.AbstractC0976x9.m6524()
            if (r0 != 0) goto L1e4
            java.lang.String r0 = "批量删除会话为内测功能，请联系开发者申请"
            android.widget.Toast r0 = android.widget.Toast.makeText(r10, r0, r7)
            r0.show()
            goto L1e7
        L1e4:
            p000.mi0.m3829(r10)
        L1e7:
            return r9
        L1e8:
            q71 r0 = p000.q71.f8896
            g71 r0 = new g71
            r0.<init>(r10, r3)
            p000.q71.m4783(r10, r6, r0)
            return r9
        L1f3:
            java.lang.String r0 = "正在完成互发消息任务，并在完成后自动领取"
            android.widget.Toast r0 = android.widget.Toast.makeText(r10, r0, r8)
            r0.show()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.pg1.f8551
            g71 r0 = new g71
            r0.<init>(r10, r5)
            r10.getClass()
            lg1 r11 = new lg1
            r19 = 0
            r20 = 240(0xf0, float:3.36E-43)
            kg1 r12 = p000.kg1.f5913
            r13 = 1
            r14 = 0
            r15 = 1
            r16 = 0
            r17 = 0
            r18 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            p000.pg1.m4537(r10, r11, r0)
            return r9
        L21e:
            java.lang.String r0 = "正在完成互发消息任务，进度将在顶部显示"
            r15 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r10, r0, r15)
            r0.show()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.pg1.f8551
            f9 r0 = new f9
            r1 = 15
            r0.<init>(r10, r1)
            r10.getClass()
            lg1 r11 = new lg1
            r19 = 0
            r20 = 240(0xf0, float:3.36E-43)
            kg1 r12 = p000.kg1.f5913
            r13 = 1
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            p000.pg1.m4537(r10, r11, r0)
            return r9
        L24b:
            java.lang.String r0 = "正在领取亲密度"
            android.widget.Toast r0 = android.widget.Toast.makeText(r10, r0, r8)
            r0.show()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.se1.f9875
            f9 r0 = new f9
            r1 = 22
            r0.<init>(r10, r1)
            r10.getClass()
            boolean r1 = p000.AbstractC0976x9.m6529()
            android.app.Activity r2 = r0.f3827
            if (r1 != 0) goto L274
            q71 r0 = p000.q71.f8896
            java.lang.String r0 = "亲密度领取仅限内测用户使用"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r7)
            r0.show()
            goto L2b7
        L274:
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.se1.f9875
            boolean r1 = r1.compareAndSet(r8, r7)
            if (r1 != 0) goto L288
            q71 r0 = p000.q71.f8896
            java.lang.String r0 = "已有亲密度任务正在执行，请稍后"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r7)
            r0.show()
            goto L2b7
        L288:
            java.util.concurrent.atomic.AtomicReference r1 = p000.ry1.f9578
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L29b
            java.lang.Class r1 = r1.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 == 0) goto L29b
            goto L2a3
        L29b:
            java.lang.Class r1 = r10.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
        L2a3:
            java.lang.Thread r2 = new java.lang.Thread
            e9 r3 = new e9
            r4 = 24
            r3.<init>(r1, r10, r0, r4)
            java.lang.String r0 = "r3986febebe8e2287"
            r2.<init>(r3, r0)
            r2.setDaemon(r7)
            r2.start()
        L2b7:
            return r9
        L2b8:
            java.lang.String r0 = "正在领取火星，进度将在顶部显示"
            android.widget.Toast r0 = android.widget.Toast.makeText(r10, r0, r8)
            r0.show()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.pg1.f8551
            f9 r0 = new f9
            r1 = 5
            r0.<init>(r10, r1)
            r10.getClass()
            lg1 r11 = new lg1
            r19 = 0
            r20 = 240(0xf0, float:3.36E-43)
            kg1 r12 = p000.kg1.f5912
            r13 = 0
            r14 = 0
            r15 = 1
            r16 = 0
            r17 = 0
            r18 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            p000.pg1.m4537(r10, r11, r0)
            return r9
    }
}
