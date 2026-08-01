package com.example.dyhelper;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class MainHook extends io.github.libxposed.api.XposedModule {

    /* JADX INFO: renamed from: β */
    public static final /* synthetic */ int f2222 = 0;

    /* JADX INFO: renamed from: α */
    public java.lang.String f2223;

    public MainHook() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.f2223 = r0
            return
    }

    public final boolean onHotReloading(io.github.libxposed.api.XposedModuleInterface.HotReloadingParam r1) {
            r0 = this;
            r1.getClass()
            java.lang.String r0 = "DYHelper: hot reload rejected because process hooks are not generation-safe"
            p000.C0888ux.m5985(r0)
            r0 = 0
            return r0
    }

    public final void onModuleLoaded(io.github.libxposed.api.XposedModuleInterface.ModuleLoadedParam r2) {
            r1 = this;
            r2.getClass()
            yq0 r0 = p000.yq0.f12764
            r0.m7017(r1)
            java.lang.String r0 = r2.getProcessName()
            r0.getClass()
            r1.f2223 = r0
            x01 r0 = p000.x01.f11964
            android.content.pm.ApplicationInfo r1 = r1.getModuleApplicationInfo()
            java.lang.String r1 = r1.sourceDir
            if (r1 == 0) goto L35
            boolean r0 = p000.q02.m4671(r1)
            if (r0 == 0) goto L22
            goto L35
        L22:
            p000.x01.f11965 = r1
            java.lang.Class<x01> r0 = p000.x01.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            p000.x01.f11967 = r0
            java.lang.String r0 = "DYHelper: ModuleContext 已初始化 modulePath="
            java.lang.String r1 = r0.concat(r1)
            p000.C0888ux.m5985(r1)
        L35:
            java.lang.String r1 = r2.getProcessName()
            java.lang.String r2 = "DYHelper: libxposed API 102 module loaded process="
            p000.AbstractC0602nx.m4142(r2, r1)
            return
    }

    public final void onPackageReady(io.github.libxposed.api.XposedModuleInterface.PackageReadyParam r25) {
            r24 = this;
            r25.getClass()
            java.lang.String r1 = r25.getPackageName()
            r1.getClass()
            r10 = r24
            java.lang.String r0 = r10.f2223
            boolean r2 = p000.q02.m4671(r0)
            if (r2 == 0) goto L1b
            java.lang.String r0 = r25.getPackageName()
            r0.getClass()
        L1b:
            java.lang.ClassLoader r2 = r25.getClassLoader()
            r2.getClass()
            android.content.pm.ApplicationInfo r11 = r25.getApplicationInfo()
            z81 r12 = new z81
            r12.<init>(r1, r0, r2, r11)
            java.util.Set r2 = p000.sw0.f10059
            java.lang.String r2 = "com.xingin.xhs"
            boolean r3 = r1.equals(r2)
            java.lang.Class<android.content.Context> r13 = android.content.Context.class
            java.lang.String r14 = "attach"
            java.lang.Class<android.app.Application> r15 = android.app.Application.class
            r16 = 0
            java.lang.String r4 = ""
            r5 = 0
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L133
            java.util.Set r3 = p000.sw0.f10059
            boolean r8 = r3.contains(r0)
            if (r8 == 0) goto L133
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L40d
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L40d
            n5 r10 = new n5
            nz r0 = p000.C0604nz.f7825
            java.lang.String r2 = "XHSHelper"
            r10.<init>(r2, r0)
            java.lang.Object r0 = p000.md2.f7088
            if (r11 == 0) goto L66
            java.lang.String r0 = r11.sourceDir
            goto L67
        L66:
            r0 = r5
        L67:
            if (r0 != 0) goto L6a
            goto L6b
        L6a:
            r4 = r0
        L6b:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L79
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L79
            long r8 = r0.lastModified()     // Catch: java.lang.Throwable -> L79
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L79
            goto L80
        L79:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L80:
            java.lang.Long r3 = java.lang.Long.valueOf(r16)
            boolean r8 = r0 instanceof p000.eo1
            if (r8 == 0) goto L89
            r0 = r3
        L89:
            java.lang.Number r0 = (java.lang.Number) r0
            long r8 = r0.longValue()
            r3 = r6
            r22 = r8
            r9 = r7
            r6 = r22
            java.lang.ClassLoader r8 = r12.f13011
            r0 = 0
            r17 = r2
            r16 = r3
            r2 = r4
            r3 = 0
            r18 = r5
            java.lang.String r5 = ""
            r19 = r9
            java.lang.String r9 = "1.4.15"
            r25 = r11
            r18 = r14
            r11 = r16
            r20 = r17
            r14 = r19
            boolean r1 = p000.md2.m3815(r0, r1, r2, r3, r5, r6, r8, r9)
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.sw0.f10060
            boolean r0 = r2.compareAndSet(r11, r14)
            if (r0 != 0) goto Lc0
        Lbd:
            r3 = r20
            goto Le0
        Lc0:
            qg r0 = new qg     // Catch: java.lang.Throwable -> Ld5
            r3 = 6
            r0.<init>(r12, r3, r10)     // Catch: java.lang.Throwable -> Ld5
            java.lang.Object[] r0 = new java.lang.Object[]{r13, r0}     // Catch: java.lang.Throwable -> Ld5
            r3 = r18
            p000.qe0.m4873(r15, r3, r0)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r0 = "XHSHelper: Application.attach Hook 已安装"
            p000.C0888ux.m5985(r0)     // Catch: java.lang.Throwable -> Ld5
            goto Lbd
        Ld5:
            r0 = move-exception
            r2.set(r11)
            java.lang.String r2 = "SAMPLE Application.attach Hook 安装失败"
            r3 = r20
            p000.C0888ux.m5977(r3, r2, r0)
        Le0:
            if (r1 == 0) goto L12c
            if (r25 == 0) goto L108
            r1 = r25
            java.lang.String r5 = r1.className
            if (r5 == 0) goto L108
            boolean r0 = p000.q02.m4671(r5)
            if (r0 != 0) goto Lf1
            goto Lf2
        Lf1:
            r5 = 0
        Lf2:
            if (r5 != 0) goto Lf5
            goto L108
        Lf5:
            java.lang.ClassLoader r0 = r12.f13011     // Catch: java.lang.Throwable -> Lfc
            java.lang.Class r0 = java.lang.Class.forName(r5, r11, r0)     // Catch: java.lang.Throwable -> Lfc
            goto L103
        Lfc:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L103:
            boolean r0 = r0 instanceof p000.eo1
            r7 = r0 ^ 1
            goto L109
        L108:
            r7 = r14
        L109:
            if (r7 == 0) goto L12c
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.od2.f8054     // Catch: java.lang.Throwable -> L118
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.sw0.f10061     // Catch: java.lang.Throwable -> L118
            boolean r0 = p000.od2.m4227(r12, r10, r0)     // Catch: java.lang.Throwable -> L118
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L118
            goto L11f
        L118:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L11f:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L40d
            java.lang.String r1 = "SAMPLE 早期 Hook 安装失败，等待 attach 重试"
            p000.C0888ux.m5977(r3, r1, r0)
            goto L40d
        L12c:
            java.lang.String r0 = "XHSHelper: 早期 DexKit 或宿主 ClassLoader 未就绪，Hook 延后到 Application.attach"
            p000.C0888ux.m5985(r0)
            goto L40d
        L133:
            r11 = r6
            r3 = r14
            r14 = r7
            java.util.Set r2 = p000.tw0.f10476
            boolean r5 = r2.contains(r1)
            if (r5 == 0) goto L146
            boolean r5 = r2.contains(r0)
            if (r5 == 0) goto L146
            r6 = r14
            goto L147
        L146:
            r6 = r11
        L147:
            java.lang.String r5 = "DYHelper"
            java.lang.String r7 = ", process="
            if (r6 == 0) goto L40e
            boolean r6 = r2.contains(r1)
            if (r6 == 0) goto L15b
            boolean r6 = r2.contains(r0)
            if (r6 == 0) goto L15b
            r6 = r14
            goto L15c
        L15b:
            r6 = r11
        L15c:
            if (r6 != 0) goto L17d
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L40d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "DYHelper: 跳过非目标包加载 package="
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r7)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p000.C0888ux.m5985(r0)
            goto L40d
        L17d:
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.tw0.f10479
            boolean r2 = r2.compareAndSet(r11, r14)
            if (r2 != 0) goto L18c
            java.lang.String r2 = "handleLoadPackage 已处理，跳过嵌入式框架的重复回调 package="
            p000.AbstractC0602nx.m4144(r2, r1, r7, r0, r5)
            goto L40d
        L18c:
            n5 r8 = new n5
            java.util.Set r0 = p000.tw0.f10477
            r8.<init>(r5, r0)
            android.content.Context r0 = p000.tw0.m5755()     // Catch: java.lang.Throwable -> L19f
            if (r0 != 0) goto L1a1
            rw0 r0 = new rw0     // Catch: java.lang.Throwable -> L19f
            r0.<init>()     // Catch: java.lang.Throwable -> L19f
            goto L1c1
        L19f:
            r0 = move-exception
            goto L1bb
        L1a1:
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L19f
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r11)     // Catch: java.lang.Throwable -> L19f
            rw0 r1 = new rw0     // Catch: java.lang.Throwable -> L19f
            r0.getClass()     // Catch: java.lang.Throwable -> L19f
            long r6 = r0.getLongVersionCode()     // Catch: java.lang.Throwable -> L19f
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Throwable -> L19f
            if (r0 != 0) goto L1b7
            r0 = r4
        L1b7:
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> L19f
            goto L1c0
        L1bb:
            eo1 r1 = new eo1
            r1.<init>(r0)
        L1c0:
            r0 = r1
        L1c1:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 != 0) goto L1c8
            goto L1e2
        L1c8:
            java.lang.String r0 = r1.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DYHelper: 读取宿主版本失败，顶栏分支降级旧版: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.C0888ux.m5985(r0)
            rw0 r0 = new rw0
            r0.<init>()
        L1e2:
            r1 = r0
            rw0 r1 = (p000.rw0) r1
            long r6 = r1.f9536
            r18 = 390301(0x5f49d, double:1.928343E-318)
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            r18 = r6
            if (r0 < 0) goto L1f2
            r6 = r14
            goto L1f3
        L1f2:
            r6 = r11
        L1f3:
            r20 = 390601(0x5f5c9, double:1.929825E-318)
            int r0 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r0 < 0) goto L1fc
            r7 = r14
            goto L1fd
        L1fc:
            r7 = r11
        L1fd:
            java.lang.String r0 = r12.f13010
            java.lang.String r2 = "DYHelper: 模块已加载 (进程="
            java.lang.String r9 = ")"
            p000.AbstractC0602nx.m4121(r2, r0, r9)
            java.lang.String r0 = r1.f9537
            boolean r2 = p000.q02.m4671(r0)
            if (r2 == 0) goto L210
            java.lang.String r0 = "unknown"
        L210:
            r19 = r14
            r25 = r15
            long r14 = r1.f9536
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r9 = "DYHelper: 宿主版本 versionName="
            r2.<init>(r9)
            r2.append(r0)
            java.lang.String r0 = ", versionCode="
            r2.append(r0)
            r2.append(r14)
            java.lang.String r0 = ", use3903Branch="
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = ", use390601Branch="
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            p000.C0888ux.m5985(r0)
            int r0 = p000.oe0.f8059
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.AbstractC0976x9.f12071
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1299()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r9 = "DYHelper: Beta native verifier loaded="
            r2.<init>(r9)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p000.C0888ux.m5985(r0)
            com.example.dyhelper.beta.BlacklistVerifier r0 = com.example.dyhelper.beta.BlacklistVerifier.f2226
            boolean r0 = com.example.dyhelper.beta.BlacklistVerifier.m1304()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r9 = "DYHelper: Blacklist native verifier loaded="
            r2.<init>(r9)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p000.C0888ux.m5985(r0)
            android.content.pm.ApplicationInfo r0 = r12.f13012
            if (r0 == 0) goto L276
            java.lang.String r0 = r0.dataDir
            goto L277
        L276:
            r0 = 0
        L277:
            java.lang.String r2 = "rc2b948eb05c3593c"
            java.lang.String r9 = "early blacklist cache loaded uid="
            if (r0 == 0) goto L286
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            goto L287
        L286:
            r0 = 0
        L287:
            if (r0 != 0) goto L28a
            goto L28b
        L28a:
            r4 = r0
        L28b:
            boolean r0 = p000.q02.m4671(r4)
            if (r0 == 0) goto L294
        L291:
            r15 = 0
            goto L31f
        L294:
            r14 = 4
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L2fa
            java.io.File r15 = new java.io.File     // Catch: java.lang.Throwable -> L2fa
            java.lang.String r11 = "shared_prefs"
            r15.<init>(r4, r11)     // Catch: java.lang.Throwable -> L2fa
            java.lang.String r4 = "dyhelper_blacklist.xml"
            r0.<init>(r15, r4)     // Catch: java.lang.Throwable -> L2fa
            boolean r4 = r0.isFile()     // Catch: java.lang.Throwable -> L2fa
            if (r4 != 0) goto L2aa
            goto L291
        L2aa:
            java.nio.charset.Charset r4 = p000.AbstractC0547mf.f7105     // Catch: java.lang.Throwable -> L2fa
            r4.getClass()     // Catch: java.lang.Throwable -> L2fa
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2fa
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2fa
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L2fa
            r11.<init>(r15, r4)     // Catch: java.lang.Throwable -> L2fa
            java.lang.String r0 = p000.i81.m2672(r11)     // Catch: java.lang.Throwable -> L2fd
            r11.close()     // Catch: java.lang.Throwable -> L2fa
            boolean r4 = com.example.dyhelper.beta.BlacklistVerifier.m1306(r0)     // Catch: java.lang.Throwable -> L2fa
            if (r4 != 0) goto L2c7
            goto L291
        L2c7:
            com.example.dyhelper.beta.BlacklistVerifier.f2237 = r19     // Catch: java.lang.Throwable -> L2fa
            java.lang.String r4 = "reason"
            java.lang.String r4 = com.example.dyhelper.beta.BlacklistVerifier.m1307(r0, r4)     // Catch: java.lang.Throwable -> L2fa
            com.example.dyhelper.beta.BlacklistVerifier.f2238 = r4     // Catch: java.lang.Throwable -> L2fa
            java.lang.String r4 = "uid"
            java.lang.String r0 = com.example.dyhelper.beta.BlacklistVerifier.m1307(r0, r4)     // Catch: java.lang.Throwable -> L2fa
            com.example.dyhelper.beta.BlacklistVerifier.f2235 = r0     // Catch: java.lang.Throwable -> L2fa
            java.lang.String r0 = com.example.dyhelper.beta.BlacklistVerifier.f2235     // Catch: java.lang.Throwable -> L2fa
            java.lang.String r4 = com.example.dyhelper.beta.BlacklistVerifier.f2238     // Catch: java.lang.Throwable -> L2fa
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2fa
            r11.<init>(r9)     // Catch: java.lang.Throwable -> L2fa
            r11.append(r0)     // Catch: java.lang.Throwable -> L2fa
            java.lang.String r0 = " reason="
            r11.append(r0)     // Catch: java.lang.Throwable -> L2fa
            r11.append(r4)     // Catch: java.lang.Throwable -> L2fa
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> L2fa
            r15 = 0
            p000.C0888ux.m5988(r2, r0, r15, r14, r15)     // Catch: java.lang.Throwable -> L2f8
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2f8
            goto L30c
        L2f8:
            r0 = move-exception
            goto L306
        L2fa:
            r0 = move-exception
            r15 = 0
            goto L306
        L2fd:
            r0 = move-exception
            r15 = 0
            r4 = r0
            throw r4     // Catch: java.lang.Throwable -> L301
        L301:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r11, r4)     // Catch: java.lang.Throwable -> L2f8
            throw r0     // Catch: java.lang.Throwable -> L2f8
        L306:
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L30c:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L31f
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "early blacklist cache load failed: "
            java.lang.String r0 = p000.lz1.m3687(r4, r0)
            p000.C0888ux.m5988(r2, r0, r15, r14, r15)
        L31f:
            com.example.dyhelper.beta.BlacklistVerifier r0 = com.example.dyhelper.beta.BlacklistVerifier.f2226
            boolean r0 = r0.m1312()
            if (r0 == 0) goto L32c
            java.lang.String r0 = "DYHelper: Blacklist blocked by early blacklist cache, skip early hooks"
            p000.C0888ux.m5985(r0)
        L32c:
            java.lang.String r0 = "onCreate"
            oj0 r2 = new oj0     // Catch: java.lang.Throwable -> L342
            r4 = 19
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L342
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L342
            r11 = r25
            p000.qe0.m4873(r11, r0, r2)     // Catch: java.lang.Throwable -> L340
        L33e:
            r2 = r3
            goto L34b
        L340:
            r0 = move-exception
            goto L345
        L342:
            r0 = move-exception
            r11 = r25
        L345:
            java.lang.String r2 = "ModuleContextProvider init 失败"
            p000.C0888ux.m5977(r5, r2, r0)
            goto L33e
        L34b:
            java.util.Set r3 = p000.tw0.f10476
            r4 = r5
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.tw0.f10478
            java.util.concurrent.atomic.AtomicBoolean r9 = p000.tw0.f10480
            r3.getClass()
            r5.getClass()
            r9.getClass()
            r14 = r2
            cf0 r2 = new cf0
            r22 = r12
            r12 = r4
            r4 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object[] r0 = new java.lang.Object[]{r13, r2}
            p000.qe0.m4873(r11, r14, r0)
            long r0 = r1.f9536
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 > 0) goto L379
            java.lang.String r0 = "早期宿主版本未知，等待 Application.attach 重新解析"
            p000.C0888ux.m5975(r12, r0)
            goto L3d1
        L379:
            java.lang.ClassLoader r1 = r4.f13011
            zt0 r0 = p000.AbstractC1021yh.m6893()
            android.content.pm.ApplicationInfo r2 = r4.f13012
            if (r2 == 0) goto L394
            java.lang.String r5 = r2.className
            if (r5 == 0) goto L394
            boolean r2 = p000.q02.m4671(r5)
            if (r2 != 0) goto L38e
            goto L38f
        L38e:
            r5 = r15
        L38f:
            if (r5 == 0) goto L394
            r0.add(r5)
        L394:
            java.lang.String r2 = p000.tw0.f10481
            r0.add(r2)
            zt0 r0 = p000.AbstractC1021yh.m6883(r0)
            r3 = 0
            java.util.ListIterator r2 = r0.listIterator(r3)
        L3a2:
            r0 = r2
            le0 r0 = (p000.le0) r0
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L3d9
            java.lang.Object r0 = r0.next()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class r0 = java.lang.Class.forName(r5, r3, r1)     // Catch: java.lang.Throwable -> L3b7
            goto L3be
        L3b7:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L3be:
            boolean r0 = r0 instanceof p000.eo1
            if (r0 == 0) goto L3d7
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "早期 ClassLoader 尚不可用: class="
            java.lang.String r2 = ", loader="
            p000.AbstractC0602nx.m4144(r1, r5, r2, r0, r12)
        L3d1:
            java.lang.String r0 = "DYHelper: 早期宿主环境未就绪，load-package Hook 延后到 Application.attach"
            p000.C0888ux.m5985(r0)
            goto L40b
        L3d7:
            r3 = 0
            goto L3a2
        L3d9:
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.tw0.f10480     // Catch: java.lang.Throwable -> L3f2
            r1.getClass()     // Catch: java.lang.Throwable -> L3f2
            r14 = r19
            r3 = 0
            boolean r0 = r1.compareAndSet(r3, r14)     // Catch: java.lang.Throwable -> L3f2
            if (r0 != 0) goto L3e9
            r6 = 0
            goto L3ed
        L3e9:
            p000.kn0.m3340(r4, r8, r6, r7)     // Catch: java.lang.Throwable -> L3f4
            r6 = r14
        L3ed:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L3f2
            goto L400
        L3f2:
            r0 = move-exception
            goto L3fa
        L3f4:
            r0 = move-exception
            r3 = 0
            r1.set(r3)     // Catch: java.lang.Throwable -> L3f2
            throw r0     // Catch: java.lang.Throwable -> L3f2
        L3fa:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L400:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L40b
            java.lang.String r1 = "早期 load-package Hook 安装失败，等待 attach 重试"
            p000.C0888ux.m5977(r12, r1, r0)
        L40b:
            int r0 = p000.oe0.f8059
        L40d:
            return
        L40e:
            r12 = r5
            java.lang.String r2 = "跳过未注册宿主 package="
            p000.AbstractC0602nx.m4144(r2, r1, r7, r0, r12)
            return
    }
}
