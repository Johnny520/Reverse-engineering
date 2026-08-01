package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cf0 extends p000.m01 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ java.util.Set f2093;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.z81 f2094;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f2095;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ boolean f2096;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ boolean f2097;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.C0574n5 f2098;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f2099;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ com.example.dyhelper.MainHook f2100;

    public cf0(java.util.Set r1, p000.z81 r2, java.util.concurrent.atomic.AtomicBoolean r3, boolean r4, boolean r5, p000.C0574n5 r6, java.util.concurrent.atomic.AtomicBoolean r7, com.example.dyhelper.MainHook r8) {
            r0 = this;
            r0.f2093 = r1
            r0.f2094 = r2
            r0.f2095 = r3
            r0.f2096 = r4
            r0.f2097 = r5
            r0.f2098 = r6
            r0.f2099 = r7
            r0.f2100 = r8
            r0.<init>()
            return
    }

    @Override // p000.m01
    public final void afterHookedMethod(p000.k01 r17) {
            r16 = this;
            r2 = r16
            r1 = r17
            s62 r3 = p000.s62.f9751
            r1.getClass()
            java.lang.Object[] r0 = r1.f5692
            r4 = 0
            r0 = r0[r4]
            boolean r5 = r0 instanceof android.content.Context
            r6 = 0
            if (r5 == 0) goto L17
            android.content.Context r0 = (android.content.Context) r0
            r5 = r0
            goto L18
        L17:
            r5 = r6
        L18:
            if (r5 != 0) goto L1b
            return
        L1b:
            java.util.Set r0 = r2.f2093
            java.lang.String r7 = r5.getPackageName()
            boolean r0 = r0.contains(r7)
            r7 = r3
            z81 r3 = r2.f2094
            if (r0 != 0) goto L4a
            java.lang.String r0 = r5.getPackageName()
            java.lang.String r1 = r3.f13009
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "DYHelper: 跳过非目标 Context attach, context="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", lppkg="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            p000.C0888ux.m5985(r0)
            return
        L4a:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f2095
            r8 = 1
            boolean r0 = r0.compareAndSet(r4, r8)
            java.lang.String r9 = "DYHelper"
            if (r0 != 0) goto L5b
            java.lang.String r0 = "attach-stage already initialized, skip duplicate"
            p000.C0888ux.m5975(r9, r0)
            return
        L5b:
            java.lang.ClassLoader r0 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L60
            goto L67
        L60:
            r0 = move-exception
            eo1 r10 = new eo1
            r10.<init>(r0)
            r0 = r10
        L67:
            boolean r10 = r0 instanceof p000.eo1
            if (r10 == 0) goto L6c
            r0 = r6
        L6c:
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            if (r0 != 0) goto L72
            java.lang.ClassLoader r0 = r3.f13011
        L72:
            r10 = r0
            java.lang.ClassLoader r11 = r3.f13011
            r10.getClass()
            r3.f13011 = r10
            java.lang.Class<android.app.Application> r0 = android.app.Application.class
            java.lang.String r12 = "onCreate"
            oj0 r13 = new oj0     // Catch: java.lang.Throwable -> L8d
            r14 = 19
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L8d
            java.lang.Object[] r13 = new java.lang.Object[]{r13}     // Catch: java.lang.Throwable -> L8d
            p000.qe0.m4873(r0, r12, r13)     // Catch: java.lang.Throwable -> L8d
            goto L93
        L8d:
            r0 = move-exception
            java.lang.String r12 = "ModuleContextProvider init 失败"
            p000.C0888ux.m5977(r9, r12, r0)     // Catch: java.lang.Throwable -> L95
        L93:
            r12 = r7
            goto L9b
        L95:
            r0 = move-exception
            eo1 r12 = new eo1
            r12.<init>(r0)
        L9b:
            java.lang.Throwable r0 = p000.fo1.m2190(r12)
            if (r0 == 0) goto La6
            java.lang.String r12 = "attach-stage 更新模块宿主上下文失败"
            p000.C0888ux.m5977(r9, r12, r0)
        La6:
            boolean r0 = r2.f2096
            r12 = 390301(0x5f49d, double:1.928343E-318)
            boolean r12 = p000.C0966x.m6433(r5, r0, r12)
            boolean r0 = r2.f2097
            r13 = 390601(0x5f5c9, double:1.929825E-318)
            boolean r13 = p000.C0966x.m6433(r5, r0, r13)
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getName()
            int r14 = java.lang.System.identityHashCode(r10)
            if (r11 == r10) goto Lc8
            r10 = r8
            goto Lc9
        Lc8:
            r10 = r4
        Lc9:
            java.lang.String r11 = "@"
            java.lang.String r15 = ", replacedEarlyLoader="
            java.lang.String r8 = "attach-stage 宿主环境已确认 loader="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4135(r14, r8, r0, r11, r15)
            java.lang.String r8 = ", use3903Branch="
            java.lang.String r11 = ", use390601Branch="
            p000.AbstractC0602nx.m4120(r0, r10, r8, r12, r11)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            r8 = 4
            p000.C0888ux.m5988(r9, r0, r6, r8, r6)
            android.os.Handler r0 = p000.C0661os.f8210
            ks r0 = p000.C0661os.m4287(r5)
            java.lang.String r10 = r0.f6100
            boolean r11 = p000.q02.m4671(r10)
            if (r11 == 0) goto Lf5
            java.lang.String r10 = "unknown"
        Lf5:
            java.lang.String r11 = r0.f6098
            long r14 = r0.f6099
            java.lang.String r0 = ", versionName="
            java.lang.String r6 = ", versionCode="
            java.lang.String r8 = "host version, package="
            java.lang.StringBuilder r0 = p000.lz1.m3695(r8, r11, r0, r10, r6)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            p000.C0661os.m4293(r0)
            ze0 r0 = new ze0
            r0.<init>(r1, r5, r4)
            n5 r6 = r2.f2098
            java.lang.String r8 = "BlacklistVerifier"
            r6.m3976(r8, r0)
            com.example.dyhelper.beta.BlacklistVerifier r0 = com.example.dyhelper.beta.BlacklistVerifier.f2226
            boolean r0 = r0.m1312()
            if (r0 == 0) goto L127
            java.lang.String r0 = "DYHelper: all attach-stage features disabled by blacklist"
            p000.C0888ux.m5985(r0)
            return
        L127:
            java.lang.Object r0 = r1.f5691
            boolean r8 = r0 instanceof android.app.Application
            if (r8 == 0) goto L130
            android.app.Application r0 = (android.app.Application) r0
            goto L131
        L130:
            r0 = 0
        L131:
            if (r0 == 0) goto L139
            android.content.Context r0 = r0.getApplicationContext()
            if (r0 != 0) goto L140
        L139:
            android.content.Context r0 = r5.getApplicationContext()
            if (r0 != 0) goto L140
            r0 = r5
        L140:
            p000.ui1.m5896(r0)     // Catch: java.lang.Throwable -> L144
            goto L14a
        L144:
            r0 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r0)
        L14a:
            java.lang.Throwable r0 = p000.fo1.m2190(r7)
            if (r0 == 0) goto L155
            java.lang.String r7 = "attach-stage 初始化配置失败"
            p000.C0888ux.m5977(r9, r7, r0)
        L155:
            java.util.concurrent.atomic.AtomicBoolean r7 = r2.f2099     // Catch: java.lang.Throwable -> L175
            r7.getClass()     // Catch: java.lang.Throwable -> L175
            r8 = 1
            boolean r0 = r7.compareAndSet(r4, r8)     // Catch: java.lang.Throwable -> L175
            if (r0 != 0) goto L162
            goto L17b
        L162:
            p000.kn0.m3340(r3, r6, r12, r13)     // Catch: java.lang.Throwable -> L170
            java.lang.String r0 = "已使用 attach 后宿主 ClassLoader 安装延迟 Hook"
            r4 = 4
            r7 = 0
            p000.C0888ux.m5988(r9, r0, r7, r4, r7)
            int r0 = p000.oe0.f8059
            r8 = 1
            goto L190
        L170:
            r0 = move-exception
            r7.set(r4)     // Catch: java.lang.Throwable -> L175
            throw r0     // Catch: java.lang.Throwable -> L175
        L175:
            r0 = move-exception
            java.lang.String r7 = "attach-stage 延迟 Hook 安装失败"
            p000.C0888ux.m5977(r9, r7, r0)
        L17b:
            af0 r0 = new af0
            r0.<init>(r3, r12, r13, r4)
            java.lang.String r4 = "CleanModeHookAttachRetry"
            r6.m3976(r4, r0)
            we0 r0 = new we0
            r8 = 1
            r0.<init>(r3, r12, r8)
            java.lang.String r4 = "TopTabFilterHookAttachRetry"
            r6.m3976(r4, r0)
        L190:
            ze0 r0 = new ze0
            r0.<init>(r1, r5, r8)
            java.lang.String r4 = "BetaNotice"
            r6.m3976(r4, r0)
            xe0 r0 = new xe0
            r4 = 2
            r0.<init>(r5, r4)
            java.lang.String r4 = "BetaVerifier"
            r6.m3976(r4, r0)
            bf0 r0 = new bf0
            r4 = r6
            com.example.dyhelper.MainHook r6 = r2.f2100
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "DyDexKitManager"
            r4.m3976(r1, r0)
            return
    }
}
