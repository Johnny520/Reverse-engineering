package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bf0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1690;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ boolean f1691;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f1692;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f1693;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f1694;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f1695;

    public /* synthetic */ bf0(android.content.Context r2, p000.C0276f8 r3, boolean r4, java.lang.String r5, p000.C0299fv r6) {
            r1 = this;
            r0 = 2
            r1.f1690 = r0
            r1.<init>()
            r1.f1692 = r2
            r1.f1693 = r3
            r1.f1691 = r4
            r1.f1694 = r5
            r1.f1695 = r6
            return
    }

    public /* synthetic */ bf0(java.util.List r2, android.app.Activity r3, p000.C0276f8 r4, boolean r5, java.lang.String r6) {
            r1 = this;
            r0 = 1
            r1.f1690 = r0
            r1.<init>()
            r1.f1692 = r2
            r1.f1693 = r3
            r1.f1694 = r4
            r1.f1691 = r5
            r1.f1695 = r6
            return
    }

    public /* synthetic */ bf0(p000.k01 r1, p000.cf0 r2, p000.z81 r3, p000.C0574n5 r4, boolean r5, com.example.dyhelper.MainHook r6) {
            r0 = this;
            r2 = 0
            r0.f1690 = r2
            r0.<init>()
            r0.f1692 = r1
            r0.f1693 = r3
            r0.f1694 = r4
            r0.f1691 = r5
            r0.f1695 = r6
            return
    }

    /* JADX INFO: renamed from: β */
    private final java.lang.Object m954() {
            r21 = this;
            r0 = r21
            java.lang.Object r1 = r0.f1692
            k01 r1 = (p000.k01) r1
            java.lang.Object r2 = r0.f1693
            z81 r2 = (p000.z81) r2
            java.lang.Object r3 = r0.f1694
            n5 r3 = (p000.C0574n5) r3
            boolean r4 = r0.f1691
            java.lang.Object r0 = r0.f1695
            r5 = r0
            com.example.dyhelper.MainHook r5 = (com.example.dyhelper.MainHook) r5
            java.lang.Object r0 = r1.f5691
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L1e
            android.app.Application r0 = (android.app.Application) r0
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 != 0) goto L28
            java.lang.String r0 = "DYHelper: Application not available, skipping DyDexKitManager init"
            p000.C0888ux.m5985(r0)
            goto L755
        L28:
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 != 0) goto L2f
            r1 = r0
        L2f:
            java.lang.Object r0 = p000.C0666ox.f8297
            java.lang.String r0 = r1.getPackageName()
            if (r0 != 0) goto L39
            java.lang.String r0 = ""
        L39:
            java.lang.String r7 = r2.f13009
            boolean r8 = p000.q02.m4671(r0)
            r9 = 1
            r10 = 0
            if (r8 != 0) goto L67
            boolean r8 = p000.q02.m4671(r7)
            if (r8 != 0) goto L67
            boolean r8 = r0.equals(r7)
            if (r8 != 0) goto L67
            java.lang.String r8 = r2.f13010
            java.lang.String r11 = "initFromLoadPackage skipped: package mismatch, context="
            java.lang.String r12 = ", lppkg="
            java.lang.String r13 = ", process="
            java.lang.StringBuilder r0 = p000.lz1.m3695(r11, r0, r12, r7, r13)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            p000.C0666ox.m4319(r0)
            goto L14a
        L67:
            boolean r8 = p000.q02.m4671(r0)
            if (r8 == 0) goto L6f
            r12 = r7
            goto L70
        L6f:
            r12 = r0
        L70:
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r12, r10)     // Catch: java.lang.Throwable -> L79
            goto L80
        L79:
            r0 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r0)
            r0 = r7
        L80:
            boolean r7 = r0 instanceof p000.eo1
            if (r7 == 0) goto L85
            r0 = 0
        L85:
            android.content.pm.PackageInfo r0 = (android.content.pm.PackageInfo) r0
            android.content.pm.ApplicationInfo r7 = r1.getApplicationInfo()
            if (r7 == 0) goto L91
            java.lang.String r7 = r7.sourceDir
            if (r7 != 0) goto L9d
        L91:
            android.content.pm.ApplicationInfo r7 = r2.f13012
            if (r7 == 0) goto L98
            java.lang.String r7 = r7.sourceDir
            goto L99
        L98:
            r7 = 0
        L99:
            if (r7 != 0) goto L9d
            java.lang.String r7 = ""
        L9d:
            r13 = 0
            if (r0 == 0) goto La6
            long r15 = r0.getLongVersionCode()
            goto La7
        La6:
            r15 = r13
        La7:
            if (r0 == 0) goto Lac
            java.lang.String r8 = r0.versionName
            goto Lad
        Lac:
            r8 = 0
        Lad:
            if (r8 != 0) goto Lb1
            java.lang.String r8 = ""
        Lb1:
            if (r0 == 0) goto Lb8
            long r13 = r0.lastUpdateTime
        Lb5:
            r17 = r13
            goto Ldd
        Lb8:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Lc6
            r0.<init>(r7)     // Catch: java.lang.Throwable -> Lc6
            long r17 = r0.lastModified()     // Catch: java.lang.Throwable -> Lc6
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch: java.lang.Throwable -> Lc6
            goto Lcd
        Lc6:
            r0 = move-exception
            eo1 r11 = new eo1
            r11.<init>(r0)
            r0 = r11
        Lcd:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            boolean r13 = r0 instanceof p000.eo1
            if (r13 == 0) goto Ld6
            r0 = r11
        Ld6:
            java.lang.Number r0 = (java.lang.Number) r0
            long r13 = r0.longValue()
            goto Lb5
        Ldd:
            java.lang.ClassLoader r0 = r2.f13011
            if (r0 != 0) goto Le5
            java.lang.ClassLoader r0 = r1.getClassLoader()
        Le5:
            r0.getClass()
            android.content.Context r11 = r1.getApplicationContext()
            if (r11 != 0) goto Lef
            r11 = r1
        Lef:
            px r13 = new px
            r19 = r15
            r16 = r7
            r7 = r11
            r11 = r13
            r13 = r19
            r15 = r8
            r11.<init>(r12, r13, r15, r16, r17)
            java.lang.Object r8 = p000.C0666ox.f8297
            monitor-enter(r8)
            px r6 = p000.C0666ox.f8301     // Catch: java.lang.Throwable -> L115
            if (r6 == 0) goto L118
            boolean r6 = r6.equals(r11)     // Catch: java.lang.Throwable -> L115
            if (r6 != 0) goto L118
            java.lang.Object r6 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L115
            p000.C0666ox.m4307()     // Catch: java.lang.Throwable -> L115
            java.lang.String r6 = "meta changed"
            p000.C0666ox.m4308(r6)     // Catch: java.lang.Throwable -> L115
            goto L118
        L115:
            r0 = move-exception
            goto L758
        L118:
            p000.C0666ox.f8302 = r16     // Catch: java.lang.Throwable -> L115
            p000.C0666ox.f8303 = r0     // Catch: java.lang.Throwable -> L115
            p000.C0666ox.f8301 = r11     // Catch: java.lang.Throwable -> L115
            jx r0 = new jx     // Catch: java.lang.Throwable -> L115
            r0.<init>(r7, r10)     // Catch: java.lang.Throwable -> L115
            r0.m3001(r11)     // Catch: java.lang.Throwable -> L115
            p000.C0666ox.f8300 = r0     // Catch: java.lang.Throwable -> L115
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0666ox.f8305     // Catch: java.lang.Throwable -> L115
            r0.set(r9)     // Catch: java.lang.Throwable -> L115
            monitor-exit(r8)
            java.lang.String r0 = "init ok, host="
            java.lang.String r6 = "/"
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r0, r12, r13, r6)
            java.lang.String r6 = "/"
            r0.append(r6)
            r0.append(r15)
            java.lang.String r6 = ", module=60/1.4.15"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            p000.C0666ox.m4319(r0)
        L14a:
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L153
            p000.ui1.m5896(r1)
        L153:
            java.lang.String r0 = "FeedGestureHookConfig"
            ve0 r6 = new ve0
            r7 = 6
            r6.<init>(r2, r7)
            r3.m3976(r0, r6)
            java.lang.String r0 = "FeedDoubleTapLikeBlockHook"
            ve0 r6 = new ve0
            r8 = 2
            r6.<init>(r2, r8)
            r3.m3976(r0, r6)
            java.lang.String r0 = "FeedRightDislikeButtonHook"
            ve0 r6 = new ve0
            r11 = 3
            r6.<init>(r2, r11)
            r3.m3976(r0, r6)
            java.lang.String r0 = "FeedRightControlsHideHook"
            we0 r6 = new we0
            r6.<init>(r2, r4, r10)
            r3.m3976(r0, r6)
            java.lang.String r0 = "CommentControlOpacityHook"
            ve0 r6 = new ve0
            r12 = 4
            r6.<init>(r2, r12)
            r3.m3976(r0, r6)
            yl r0 = p000.C1025yl.f12669
            java.lang.String r6 = "comment_keyboard_entrance_hide"
            java.util.concurrent.atomic.AtomicBoolean r13 = p000.C1025yl.f12670
            boolean r13 = r13.compareAndSet(r10, r9)
            r14 = 5
            if (r13 != 0) goto L197
            goto L1b0
        L197:
            java.util.concurrent.ConcurrentHashMap r13 = p000.C0777rx.f9562
            ul r13 = new ul
            r13.<init>(r14)
            p000.C0777rx.m5178(r6, r13)
            ul r13 = new ul
            r13.<init>(r7)
            p000.C0777rx.m5177(r6, r13)
            java.lang.String r6 = "r931d7e30ef229d29"
            java.lang.String r13 = "DexKit prewarm provider registered"
            p000.C0888ux.m5975(r6, r13)
        L1b0:
            java.lang.ClassLoader r6 = r2.f13011
            r0.m6937(r6)
            jm r0 = p000.C0436jm.f5518
            java.lang.String r6 = "comment_search_entry_hide"
            boolean r13 = p000.C0436jm.m2968()
            r15 = 29
            r14 = 28
            if (r13 != 0) goto L1c4
            goto L1e6
        L1c4:
            java.util.concurrent.atomic.AtomicBoolean r13 = p000.C0436jm.f5519
            boolean r13 = r13.compareAndSet(r10, r9)
            if (r13 != 0) goto L1cd
            goto L1e6
        L1cd:
            java.util.concurrent.ConcurrentHashMap r13 = p000.C0777rx.f9562
            ul r13 = new ul
            r13.<init>(r14)
            p000.C0777rx.m5178(r6, r13)
            ul r13 = new ul
            r13.<init>(r15)
            p000.C0777rx.m5177(r6, r13)
            java.lang.String r6 = "DexKit prewarm provider registered"
            java.lang.String r13 = "rb57159a7dbcb5c6"
            p000.C0888ux.m5975(r13, r6)
        L1e6:
            java.lang.ClassLoader r6 = r2.f13011
            r0.m2970(r6)
            r0 = 18
            r6 = 27
            if (r4 == 0) goto L246
            af r13 = p000.C0016af.f205
            java.lang.String r7 = "chapter_ad_skip_3903"
            java.util.concurrent.atomic.AtomicBoolean r8 = p000.C0016af.f207
            boolean r8 = r8.compareAndSet(r10, r9)
            if (r8 != 0) goto L1fe
            goto L215
        L1fe:
            java.util.concurrent.ConcurrentHashMap r8 = p000.C0777rx.f9562
            we r8 = new we
            r8.<init>(r11)
            p000.C0777rx.m5178(r7, r8)
            we r8 = new we
            r8.<init>(r12)
            p000.C0777rx.m5177(r7, r8)
            java.lang.String r7 = "DexKit prewarm provider registered"
            p000.C0016af.m101(r7)
        L215:
            java.lang.ClassLoader r7 = r2.f13011
            r13.m102(r7)
            m82 r7 = p000.m82.f7014
            java.lang.String r8 = "video_speed_3903"
            java.util.concurrent.atomic.AtomicBoolean r11 = p000.m82.f7016
            boolean r11 = r11.compareAndSet(r10, r9)
            if (r11 != 0) goto L227
            goto L240
        L227:
            java.util.concurrent.ConcurrentHashMap r11 = p000.C0777rx.f9562
            j72 r11 = new j72
            r13 = 17
            r11.<init>(r13)
            p000.C0777rx.m5178(r8, r11)
            j72 r11 = new j72
            r11.<init>(r0)
            p000.C0777rx.m5177(r8, r11)
            java.lang.String r8 = "DexKit prewarm provider registered"
            p000.m82.m3796(r8)
        L240:
            java.lang.ClassLoader r8 = r2.f13011
            r7.m3797(r8)
            goto L26f
        L246:
            bf r7 = p000.C0075bf.f1684
            java.lang.String r8 = "chapter_ad_skip"
            java.util.concurrent.atomic.AtomicBoolean r11 = p000.C0075bf.f1685
            boolean r11 = r11.compareAndSet(r10, r9)
            if (r11 != 0) goto L253
            goto L26a
        L253:
            java.util.concurrent.ConcurrentHashMap r11 = p000.C0777rx.f9562
            n7 r11 = new n7
            r11.<init>(r6)
            p000.C0777rx.m5178(r8, r11)
            n7 r11 = new n7
            r11.<init>(r14)
            p000.C0777rx.m5177(r8, r11)
            java.lang.String r8 = "DexKit prewarm provider registered"
            p000.C0075bf.m950(r8)
        L26a:
            java.lang.ClassLoader r8 = r2.f13011
            r7.m951(r8)
        L26f:
            hf0 r7 = p000.hf0.f4718
            java.lang.String r8 = "feed_long_press_speed_resolver"
            java.util.concurrent.atomic.AtomicBoolean r11 = p000.m20.f6907
            boolean r11 = r11.compareAndSet(r10, r9)
            if (r11 != 0) goto L27c
            goto L290
        L27c:
            java.util.concurrent.ConcurrentHashMap r11 = p000.C0777rx.f9562
            q00 r11 = new q00
            r13 = 26
            r11.<init>(r13)
            p000.C0777rx.m5178(r8, r11)
            q00 r11 = new q00
            r11.<init>(r6)
            p000.C0777rx.m5177(r8, r11)
        L290:
            r7.m2504(r2)
            java.lang.String r7 = "DYHelper: BravoPublishHideResolver 初始化配置成功"
            p000.C0888ux.m5985(r7)
            java.lang.String r7 = "DYHelper: DyDexKitManager init success, starting CommentBookmarkHook init"
            p000.C0888ux.m5985(r7)
            java.lang.String r7 = "DYHelper: Registering DexKit prewarm providers"
            p000.C0888ux.m5985(r7)
            st r7 = p000.C0810st.f10010
            java.lang.String r8 = "display_name_resolver"
            java.util.concurrent.atomic.AtomicBoolean r11 = p000.C0810st.f10022
            boolean r11 = r11.compareAndSet(r10, r9)
            r13 = 12
            r6 = 13
            if (r11 != 0) goto L2b3
            goto L2cc
        L2b3:
            java.util.concurrent.ConcurrentHashMap r11 = p000.C0777rx.f9562
            hm r11 = new hm
            r11.<init>(r13)
            p000.C0777rx.m5178(r8, r11)
            hm r11 = new hm
            r11.<init>(r6)
            p000.C0777rx.m5177(r8, r11)
            java.lang.String r8 = "r398844d0f2b2fd7c"
            java.lang.String r11 = "DisplayNameResolver DexKit 预热任务已注册"
            p000.C0888ux.m5975(r8, r11)
        L2cc:
            vh0 r8 = p000.vh0.f11270
            java.lang.String r8 = "im_conversation_catalog_resolver"
            java.util.concurrent.atomic.AtomicBoolean r11 = p000.ci0.f2138
            boolean r11 = r11.compareAndSet(r10, r9)
            r12 = 15
            r0 = 14
            if (r11 != 0) goto L2dd
            goto L2f6
        L2dd:
            java.util.concurrent.ConcurrentHashMap r11 = p000.C0777rx.f9562
            sh0 r11 = new sh0
            r11.<init>(r0)
            p000.C0777rx.m5178(r8, r11)
            sh0 r11 = new sh0
            r11.<init>(r12)
            p000.C0777rx.m5177(r8, r11)
            java.lang.String r8 = "rf41ec7c6342b5bdc"
            java.lang.String r11 = "IMConversationCatalog DexKit 预热任务已注册"
            p000.C0888ux.m5975(r8, r11)
        L2f6:
            wi0 r8 = p000.wi0.f11726
            java.lang.String r11 = "im_conversation_delete_host"
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.wi0.f11728
            boolean r12 = r12.compareAndSet(r10, r9)
            if (r12 != 0) goto L303
            goto L31c
        L303:
            java.util.concurrent.ConcurrentHashMap r12 = p000.C0777rx.f9562
            sh0 r12 = new sh0
            r12.<init>(r14)
            p000.C0777rx.m5178(r11, r12)
            sh0 r12 = new sh0
            r12.<init>(r15)
            p000.C0777rx.m5177(r11, r12)
            java.lang.String r11 = "r542b803b7817851a"
            java.lang.String r12 = "会话删除 DexKit 预热任务已注册"
            p000.C0888ux.m5975(r11, r12)
        L31c:
            fk1 r11 = p000.fk1.f3997
            java.lang.String r12 = "quick_share_contact_resolver"
            java.util.concurrent.atomic.AtomicBoolean r15 = p000.fk1.f3998
            boolean r15 = r15.compareAndSet(r10, r9)
            if (r15 != 0) goto L329
            goto L33b
        L329:
            java.util.concurrent.ConcurrentHashMap r15 = p000.C0777rx.f9562
            li1 r15 = new li1
            r15.<init>(r13)
            p000.C0777rx.m5178(r12, r15)
            li1 r15 = new li1
            r15.<init>(r6)
            p000.C0777rx.m5177(r12, r15)
        L33b:
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.C0261eu.f3669
            java.lang.String r12 = "douyin_duration_reminder_block"
            java.util.concurrent.atomic.AtomicBoolean r15 = p000.C0261eu.f3669
            boolean r15 = r15.compareAndSet(r10, r9)
            if (r15 != 0) goto L348
            goto L363
        L348:
            java.util.concurrent.ConcurrentHashMap r15 = p000.C0777rx.f9562
            hm r15 = new hm
            r13 = 18
            r15.<init>(r13)
            p000.C0777rx.m5178(r12, r15)
            hm r13 = new hm
            r15 = 19
            r13.<init>(r15)
            p000.C0777rx.m5177(r12, r13)
            java.lang.String r12 = "DexKit prewarm provider registered"
            p000.C0261eu.m1960(r12)
        L363:
            java.lang.String r12 = "gesture_enabled"
            boolean r12 = p000.ui1.m5887(r12, r10)
            if (r12 != 0) goto L37a
            java.lang.String r12 = "feed_double_tap_like_block_enabled"
            boolean r12 = p000.ui1.m5887(r12, r10)
            if (r12 == 0) goto L374
            goto L37a
        L374:
            java.lang.String r0 = "DYHelper: 双击入口依赖功能关闭，跳过 DexKit 预热注册"
            p000.C0888ux.m5985(r0)
            goto L397
        L37a:
            java.lang.String r12 = "feed_double_tap_resolver"
            java.util.concurrent.atomic.AtomicBoolean r13 = p000.c10.f1929
            boolean r13 = r13.compareAndSet(r10, r9)
            if (r13 != 0) goto L385
            goto L397
        L385:
            java.util.concurrent.ConcurrentHashMap r13 = p000.C0777rx.f9562
            q00 r13 = new q00
            r13.<init>(r6)
            p000.C0777rx.m5178(r12, r13)
            q00 r13 = new q00
            r13.<init>(r0)
            p000.C0777rx.m5177(r12, r13)
        L397:
            java.lang.String r0 = "feed_current_aweme_resolver"
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.u00.f10545
            boolean r12 = r12.compareAndSet(r10, r9)
            if (r12 != 0) goto L3a2
            goto L3b5
        L3a2:
            java.util.concurrent.ConcurrentHashMap r12 = p000.C0777rx.f9562
            q00 r12 = new q00
            r12.<init>(r9)
            p000.C0777rx.m5178(r0, r12)
            q00 r12 = new q00
            r13 = 2
            r12.<init>(r13)
            p000.C0777rx.m5177(r0, r12)
        L3b5:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.p00.f8376
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.p00.f8376
            boolean r0 = r0.compareAndSet(r10, r9)
            r12 = 24
            if (r0 != 0) goto L3c2
            goto L3ce
        L3c2:
            java.util.concurrent.ConcurrentHashMap r0 = p000.C0777rx.f9562
            java.lang.String r0 = "feed_ad_panel_detector"
            hm r13 = new hm
            r13.<init>(r12)
            p000.C0777rx.m5178(r0, r13)
        L3ce:
            java.lang.String r0 = "feed_video_model_resolver"
            java.util.concurrent.atomic.AtomicBoolean r13 = p000.h30.f4556
            boolean r13 = r13.compareAndSet(r10, r9)
            r15 = 21
            if (r13 != 0) goto L3db
            goto L3ef
        L3db:
            java.util.concurrent.ConcurrentHashMap r13 = p000.C0777rx.f9562
            s20 r13 = new s20
            r13.<init>(r15)
            p000.C0777rx.m5178(r0, r13)
            s20 r13 = new s20
            r12 = 22
            r13.<init>(r12)
            p000.C0777rx.m5177(r0, r13)
        L3ef:
            r0 = 10
            if (r4 == 0) goto L412
            java.lang.String r4 = "feed_right_controls_resolver"
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.b30.f1439
            boolean r12 = r12.compareAndSet(r10, r9)
            if (r12 != 0) goto L3fe
            goto L412
        L3fe:
            java.util.concurrent.ConcurrentHashMap r12 = p000.C0777rx.f9562
            s20 r12 = new s20
            r13 = 9
            r12.<init>(r13)
            p000.C0777rx.m5178(r4, r12)
            s20 r12 = new s20
            r12.<init>(r0)
            p000.C0777rx.m5177(r4, r12)
        L412:
            java.lang.String r4 = "feed_enable_preload"
            boolean r4 = p000.ui1.m5887(r4, r10)
            if (r4 == 0) goto L42b
            java.lang.String r4 = "feed_preload_count"
            android.content.SharedPreferences r12 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L426
            r13 = 2
            int r4 = r12.getInt(r4, r13)     // Catch: java.lang.Throwable -> L426
            goto L427
        L426:
            r4 = 2
        L427:
            if (r4 <= 0) goto L42b
            r4 = r9
            goto L42c
        L42b:
            r4 = r10
        L42c:
            if (r4 == 0) goto L446
            java.util.Set r4 = p000.q20.f8803
            java.util.concurrent.ConcurrentHashMap r4 = p000.C0777rx.f9562
            java.lang.String r4 = "feed_preload_control"
            l20 r12 = new l20
            r13 = 6
            r12.<init>(r13)
            p000.C0777rx.m5178(r4, r12)
            l20 r12 = new l20
            r12.<init>(r6)
            p000.C0777rx.m5177(r4, r12)
            goto L44b
        L446:
            java.lang.String r4 = "DYHelper: FeedPreloadControlHook 预加载控制关闭，跳过 DexKit 预热注册"
            p000.C0888ux.m5985(r4)
        L44b:
            java.lang.String r4 = "offline_cache_count_enabled"
            boolean r4 = p000.ui1.m5887(r4, r10)
            java.lang.String r6 = "offline_cache_count"
            r12 = 100
            android.content.SharedPreferences r13 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L45e
            int r6 = r13.getInt(r6, r12)     // Catch: java.lang.Throwable -> L45e
            goto L45f
        L45e:
            r6 = r12
        L45f:
            r13 = 500(0x1f4, float:7.0E-43)
            p000.j81.m2906(r6, r0, r13)
            r6 = 20
            if (r4 == 0) goto L481
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.m41.f6932
            l41 r4 = p000.l41.f6416
            java.util.concurrent.ConcurrentHashMap r4 = p000.C0777rx.f9562
            java.lang.String r4 = "offline_cache_count"
            sv0 r0 = new sv0
            r0.<init>(r6)
            p000.C0777rx.m5178(r4, r0)
            sv0 r0 = new sv0
            r0.<init>(r15)
            p000.C0777rx.m5177(r4, r0)
            goto L486
        L481:
            java.lang.String r0 = "DYHelper: 离线缓存数量覆盖关闭，跳过 DexKit 预热注册"
            p000.C0888ux.m5985(r0)
        L486:
            boolean r0 = p000.ui1.m5903()
            if (r0 == 0) goto L4b6
            java.lang.String r0 = "feed_follow_confirm"
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.n10.f7350
            boolean r4 = r4.compareAndSet(r10, r9)
            if (r4 != 0) goto L497
            goto L4bb
        L497:
            boolean r4 = p000.ui1.m5903()
            if (r4 != 0) goto L4a3
            java.lang.String r0 = "r965f1b33b90ef5ec"
            p000.C0888ux.m5985(r0)
            goto L4bb
        L4a3:
            java.util.concurrent.ConcurrentHashMap r4 = p000.C0777rx.f9562
            q00 r4 = new q00
            r4.<init>(r6)
            p000.C0777rx.m5178(r0, r4)
            q00 r4 = new q00
            r4.<init>(r15)
            p000.C0777rx.m5177(r0, r4)
            goto L4bb
        L4b6:
            java.lang.String r0 = "DYHelper: FeedFollowConfirmHook 关闭，跳过 DexKit 预热注册"
            p000.C0888ux.m5985(r0)
        L4bb:
            p81 r0 = p000.p81.f8454
            java.lang.String r4 = "original_not_interested_action"
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.p81.f8455
            boolean r6 = r6.compareAndSet(r10, r9)
            if (r6 != 0) goto L4c8
            goto L4db
        L4c8:
            java.util.concurrent.ConcurrentHashMap r6 = p000.C0777rx.f9562
            f71 r6 = new f71
            r6.<init>(r9)
            p000.C0777rx.m5178(r4, r6)
            f71 r6 = new f71
            r15 = 2
            r6.<init>(r15)
            p000.C0777rx.m5177(r4, r6)
        L4db:
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.tu0.f10462
            java.lang.String r4 = "live_room_audience_exact_count"
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.tu0.f10462
            boolean r6 = r6.compareAndSet(r10, r9)
            r15 = 16
            if (r6 != 0) goto L4ea
            goto L50c
        L4ea:
            java.lang.String r6 = "live_room_audience_exact_count_enabled"
            boolean r6 = p000.ui1.m5887(r6, r10)
            if (r6 != 0) goto L4f8
            java.lang.String r4 = "r201db4a1a9306270"
            p000.C0888ux.m5985(r4)
            goto L50c
        L4f8:
            java.util.concurrent.ConcurrentHashMap r6 = p000.C0777rx.f9562
            gp0 r6 = new gp0
            r13 = 15
            r6.<init>(r13)
            p000.C0777rx.m5178(r4, r6)
            gp0 r6 = new gp0
            r6.<init>(r15)
            p000.C0777rx.m5177(r4, r6)
        L50c:
            mi1 r4 = p000.mi1.f7162
            java.lang.String r6 = "comment_precise_time"
            java.util.concurrent.atomic.AtomicBoolean r13 = p000.mi1.f7164
            boolean r13 = r13.compareAndSet(r10, r9)
            if (r13 != 0) goto L519
            goto L53f
        L519:
            java.lang.String r13 = "precise_time_enabled"
            boolean r13 = p000.ui1.m5887(r13, r10)
            if (r13 != 0) goto L52b
            java.lang.String r6 = "rb95bed5e6997b6c3"
            java.lang.String r13 = "feature disabled, skip prewarm provider"
            r14 = 4
            r15 = 0
            p000.C0888ux.m5988(r6, r13, r15, r14, r15)
            goto L53f
        L52b:
            java.util.concurrent.ConcurrentHashMap r13 = p000.C0777rx.f9562
            cf1 r13 = new cf1
            r15 = 27
            r13.<init>(r15)
            p000.C0777rx.m5178(r6, r13)
            cf1 r13 = new cf1
            r13.<init>(r14)
            p000.C0777rx.m5177(r6, r13)
        L53f:
            com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions r6 = com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions.INSTANCE
            r6.registerAll()
            java.lang.String r6 = "comment_panel_hook_enabled"
            boolean r6 = p000.ui1.m5887(r6, r10)
            r13 = 25
            if (r6 != 0) goto L558
            java.lang.String r6 = "r29fd1f5135ecd17"
            java.lang.String r14 = "disabled, skip prewarm provider"
            r12 = 0
            r15 = 4
            p000.C0888ux.m5988(r6, r14, r12, r15, r12)
            goto L575
        L558:
            java.lang.String r6 = "long_press_panel_resolver"
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.uv0.f10964
            boolean r12 = r12.compareAndSet(r10, r9)
            if (r12 != 0) goto L563
            goto L575
        L563:
            java.util.concurrent.ConcurrentHashMap r12 = p000.C0777rx.f9562
            gp0 r12 = new gp0
            r12.<init>(r13)
            p000.C0777rx.m5178(r6, r12)
            sv0 r12 = new sv0
            r12.<init>(r10)
            p000.C0777rx.m5177(r6, r12)
        L575:
            java.lang.ClassLoader r6 = r2.f13011
            p000.jx0.m3013(r6)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkHook.INSTANCE
            r6.registerDexKitPrewarmProvider()
            ql r12 = p000.C0728ql.f9031
            java.util.concurrent.ConcurrentHashMap r12 = p000.C0777rx.f9562
            java.lang.String r12 = "comment_similar_emoji_download"
            wj r14 = new wj
            r15 = 24
            r14.<init>(r15)
            p000.C0777rx.m5178(r12, r14)
            wj r14 = new wj
            r14.<init>(r13)
            p000.C0777rx.m5177(r12, r14)
            java.lang.String r12 = "comment_audio_download"
            java.util.concurrent.atomic.AtomicBoolean r13 = p000.C0287fj.f3951
            boolean r13 = r13.compareAndSet(r10, r9)
            if (r13 != 0) goto L5a2
            goto L5b6
        L5a2:
            gh r13 = new gh
            r14 = 11
            r13.<init>(r14)
            p000.C0777rx.m5178(r12, r13)
            gh r13 = new gh
            r14 = 12
            r13.<init>(r14)
            p000.C0777rx.m5177(r12, r13)
        L5b6:
            java.lang.String r12 = "DYHelper: All DexKit prewarm providers registered"
            p000.C0888ux.m5985(r12)
            java.lang.String r12 = "DYHelper: Starting individual Hook initializations"
            p000.C0888ux.m5985(r12)
            java.lang.ClassLoader r12 = r2.f13011
            r7.m5569(r12)
            java.lang.String r12 = "DYHelper: DisplayNameResolver.init completed"
            p000.C0888ux.m5985(r12)
            java.lang.ClassLoader r12 = r2.f13011
            p000.vh0.f11289 = r12
            java.lang.ClassLoader r12 = r2.f13011
            r7.m5569(r12)
            ci0 r7 = p000.ci0.f2128
            java.lang.ClassLoader r12 = r2.f13011
            r7.m1213(r12)
            java.lang.String r7 = "DYHelper: IMConversationCatalog.init completed"
            p000.C0888ux.m5985(r7)
            java.lang.ClassLoader r7 = r2.f13011
            r8.m6392(r7)
            java.lang.ClassLoader r7 = r2.f13011
            r11.m2145(r7, r10)
            java.lang.ClassLoader r7 = r2.f13011
            p000.C0261eu.m1958(r7)
            java.lang.ClassLoader r7 = r2.f13011
            r7.getClass()
            g30[] r8 = p000.g30.values()
            int r11 = r8.length
            r12 = r10
        L5f9:
            if (r12 >= r11) goto L603
            r13 = r8[r12]
            p000.h30.m2348(r13, r7, r10)
            int r12 = r12 + 1
            goto L5f9
        L603:
            p000.h30.m2349(r7, r10)
            java.lang.ClassLoader r7 = r2.f13011
            r7.getClass()
            p000.u00.m5771(r7, r10)
            java.lang.ClassLoader r7 = r2.f13011
            r7.getClass()
            p000.p00.m4341(r7, r10)
            java.lang.String r7 = "feed_enable_preload"
            boolean r7 = p000.ui1.m5887(r7, r10)
            if (r7 == 0) goto L630
            java.lang.String r7 = "feed_preload_count"
            android.content.SharedPreferences r8 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L62a
            r13 = 2
            int r8 = r8.getInt(r7, r13)     // Catch: java.lang.Throwable -> L62b
            goto L62c
        L62a:
            r13 = 2
        L62b:
            r8 = r13
        L62c:
            if (r8 <= 0) goto L630
            r7 = r9
            goto L631
        L630:
            r7 = r10
        L631:
            if (r7 == 0) goto L63b
            java.util.Set r7 = p000.q20.f8803
            java.lang.ClassLoader r7 = r2.f13011
            p000.q20.m4725(r7)
            goto L640
        L63b:
            java.lang.String r7 = "DYHelper: FeedPreloadControlHook 预加载控制关闭，跳过初始化"
            p000.C0888ux.m5985(r7)
        L640:
            java.lang.String r7 = "offline_cache_count_enabled"
            boolean r7 = p000.ui1.m5887(r7, r10)
            java.lang.String r8 = "offline_cache_count"
            android.content.SharedPreferences r11 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L657
            r12 = 100
            int r12 = r11.getInt(r8, r12)     // Catch: java.lang.Throwable -> L652
        L652:
            r8 = 500(0x1f4, float:7.0E-43)
            r11 = 10
            goto L65a
        L657:
            r12 = 100
            goto L652
        L65a:
            p000.j81.m2906(r12, r11, r8)
            if (r7 == 0) goto L667
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.m41.f6932
            java.lang.ClassLoader r7 = r2.f13011
            p000.m41.m3726(r7)
            goto L66c
        L667:
            java.lang.String r7 = "DYHelper: 离线缓存数量覆盖关闭，跳过初始化"
            p000.C0888ux.m5985(r7)
        L66c:
            boolean r7 = p000.ui1.m5903()
            if (r7 == 0) goto L67a
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.n10.f7350
            java.lang.ClassLoader r7 = r2.f13011
            p000.n10.m3934(r7)
            goto L67f
        L67a:
            java.lang.String r7 = "DYHelper: FeedFollowConfirmHook 关闭，跳过初始化"
            p000.C0888ux.m5985(r7)
        L67f:
            java.lang.ClassLoader r7 = r2.f13011
            r7.getClass()
            r0.m4404(r7, r10)
            r0.m4405(r7, r10)
            java.lang.ClassLoader r0 = r2.f13011
            p000.tu0.m5741(r0)
            java.lang.String r0 = "DYHelper: LiveRoomAudienceExactCountHook.init completed"
            p000.C0888ux.m5985(r0)
            java.lang.ClassLoader r0 = r2.f13011
            r4.m3841(r0)
            java.lang.String r0 = "DYHelper: PreciseTimeHook.init completed"
            p000.C0888ux.m5985(r0)
            java.lang.String r0 = "DYHelper: ====== Starting CommentBookmarkHook initialization ======"
            p000.C0888ux.m5985(r0)
            java.lang.String r0 = "DYHelper: Calling CommentBookmarkHook.onHostContext"
            p000.C0888ux.m5985(r0)
            r6.onHostContext(r1)
            java.lang.String r0 = "DYHelper: CommentBookmarkHook.onHostContext completed"
            p000.C0888ux.m5985(r0)
            java.lang.String r0 = "DYHelper: Calling CommentBookmarkActiveQuery.init"
            p000.C0888ux.m5985(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.INSTANCE
            java.lang.ClassLoader r4 = r2.f13011
            r0.init(r1, r4)
            java.lang.String r4 = "DYHelper: CommentBookmarkActiveQuery.init completed"
            p000.C0888ux.m5985(r4)
            java.lang.String r4 = "DYHelper: Calling CommentBookmarkActiveQuery.scheduleAutoScanIfNeeded"
            p000.C0888ux.m5985(r4)
            r0.scheduleAutoScanIfNeeded()
            java.lang.String r0 = "DYHelper: CommentBookmarkActiveQuery.scheduleAutoScanIfNeeded completed"
            p000.C0888ux.m5985(r0)
            java.lang.String r0 = "DYHelper: Calling CommentBookmarkHook.init with allowDexKitScan=false"
            p000.C0888ux.m5985(r0)
            java.lang.ClassLoader r0 = r2.f13011
            r6.init(r0, r10)
            java.lang.String r0 = "DYHelper: CommentBookmarkHook.init completed"
            p000.C0888ux.m5985(r0)
            java.lang.String r0 = "DYHelper: ====== Starting ProfileBookmark initialization ======"
            p000.C0888ux.m5985(r0)
            java.lang.String r0 = "ProfileBookmarkStore"
            xe0 r4 = new xe0
            r4.<init>(r1, r10)
            r3.m3976(r0, r4)
            java.lang.String r0 = "ProbeNotifier"
            xe0 r4 = new xe0
            r4.<init>(r1, r9)
            r3.m3976(r0, r4)
            java.lang.String r0 = "ProfileBookmarkActiveQuery"
            ye0 r4 = new ye0
            r4.<init>(r1, r2, r10)
            r3.m3976(r0, r4)
            java.lang.String r0 = "ProfileBookmarkProfileHook"
            ye0 r4 = new ye0
            r4.<init>(r1, r2, r9)
            r3.m3976(r0, r4)
            java.lang.String r0 = "DYHelper: ====== ProfileBookmark initialization END ======"
            p000.C0888ux.m5985(r0)
            java.lang.String r0 = "DYHelper: Initializing diagnostic probes"
            p000.C0888ux.m5985(r0)
            java.lang.String r0 = "CmtReplyDetailProbeHook"
            ve0 r1 = new ve0
            r4 = 5
            r1.<init>(r2, r4)
            r3.m3976(r0, r1)
            java.lang.String r0 = "DYHelper: CmtReplyDetailProbeHook initialized"
            p000.C0888ux.m5985(r0)
            java.lang.String r0 = "CommentRouterTraceHook"
            ve0 r1 = new ve0
            r1.<init>(r2, r10)
            r3.m3976(r0, r1)
            java.lang.String r0 = "DYHelper: CommentRouterTraceHook initialized"
            p000.C0888ux.m5985(r0)
            java.lang.String r0 = "DYHelper: ====== CommentBookmarkHook initialization END ======"
            p000.C0888ux.m5985(r0)
            java.lang.String r0 = "BottomBarManager"
            p3 r1 = new p3
            r4 = 16
            r1.<init>(r2, r4, r5)
            r3.m3976(r0, r1)
            java.lang.String r0 = "LiquidGlassBottomBarAttachRetry"
            ve0 r1 = new ve0
            r1.<init>(r2, r9)
            r3.m3976(r0, r1)
            int r0 = p000.C0410ix.f5220
            p000.C0410ix.m2819(r2)
            int r0 = p000.oe0.f8059
        L755:
            s62 r0 = p000.s62.f9751
            return r0
        L758:
            monitor-exit(r8)
            throw r0
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r38 = this;
            r1 = r38
            int r0 = r1.f1690
            switch(r0) {
                case 0: goto L7cf;
                case 1: goto L713;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.f1692
            r3 = r0
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r0 = r1.f1693
            r12 = r0
            f8 r12 = (p000.C0276f8) r12
            java.lang.Object r0 = r1.f1694
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r1.f1695
            fv r0 = (p000.C0299fv) r0
            qy0 r2 = p000.qy0.f9157
            lu r4 = p000.qy0.m4998()
            java.util.ArrayList r13 = p000.kn0.m3369(r12, r4)
            java.lang.String r14 = r12.f3800
            lu r4 = p000.qy0.m4998()
            java.util.List r15 = p000.kn0.m3372(r12, r4)
            boolean r4 = r15.isEmpty()
            if (r4 != 0) goto L70b
            java.io.File r4 = new java.io.File
            java.io.File r5 = r3.getCacheDir()
            java.lang.String r6 = "dyhelper_livephoto"
            r4.<init>(r5, r6)
            boolean r5 = r4.exists()
            if (r5 != 0) goto L48
            r4.mkdirs()
        L48:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r6 = p000.qy0.m4969(r3, r12)
            if (r0 != 0) goto L59
            jy0 r0 = p000.jy0.f5663
            fv r0 = p000.qy0.m5014(r2, r3, r12, r0, r6)
        L59:
            r6 = r0
            java.lang.String r0 = r6.f4140
            java.lang.String r8 = p000.pu0.m4619(r0)
            java.lang.String r0 = "live_photo_motion_photo_format"
            r9 = 1
            boolean r10 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> L75
            if (r10 == 0) goto L71
            android.content.SharedPreferences r10 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L78
            r10.getInt(r0, r9)     // Catch: java.lang.Throwable -> L78
            goto L78
        L71:
            p000.qy0.m5010(r9, r3, r0)     // Catch: java.lang.Throwable -> L75
            goto L78
        L75:
            p000.qy0.m5010(r9, r3, r0)
        L78:
            rk0 r0 = p000.ou0.f8254
            r0.getClass()
            ou0[] r0 = p000.ou0.values()
            int r10 = r0.length
            r11 = 0
        L83:
            r17 = 0
            if (r11 >= r10) goto L99
            r18 = r0
            r0 = r18[r11]
            r19 = r6
            int r6 = r0.f8257
            if (r6 != r9) goto L92
            goto L9d
        L92:
            int r11 = r11 + 1
            r0 = r18
            r6 = r19
            goto L83
        L99:
            r19 = r6
            r0 = r17
        L9d:
            if (r0 != 0) goto La1
            ou0 r0 = p000.ou0.f8255
        La1:
            r6 = r0
            if (r7 == 0) goto Lb1
            java.lang.String r0 = "正在下载视频"
            r10 = 0
            p000.qy0.m4997(r10, r3, r7, r0)     // Catch: java.lang.Throwable -> Lab
            goto Lb2
        Lab:
            r0 = move-exception
            r13 = r5
        Lad:
            r2 = r17
            goto L6eb
        Lb1:
            r10 = 0
        Lb2:
            java.util.Iterator r16 = r15.iterator()     // Catch: java.lang.Throwable -> Lab
            r0 = r10
            r18 = r17
        Lb9:
            boolean r11 = r16.hasNext()     // Catch: java.lang.Throwable -> Lab
            r20 = r8
            boolean r8 = r1.f1691
            r21 = r12
            java.lang.String r12 = " 失败: "
            r22 = r13
            java.lang.String r13 = ", candidate="
            r23 = r15
            java.lang.String r15 = ", url="
            java.lang.String r1 = ".mp4"
            r24 = r12
            pu0 r12 = p000.pu0.f8717
            r25 = r12
            java.lang.String r12 = "/"
            r26 = r3
            java.lang.String r3 = "DYHelper"
            if (r11 == 0) goto L240
            int r11 = r0 + 1
            java.lang.Object r0 = r16.next()     // Catch: java.lang.Throwable -> L23a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L23a
            java.lang.String r9 = "dyhelper_lp_video_"
            java.io.File r9 = java.io.File.createTempFile(r9, r1, r4)     // Catch: java.lang.Throwable -> L23a
            r5.add(r9)     // Catch: java.lang.Throwable -> L23a
            int r10 = r23.size()     // Catch: java.lang.Throwable -> L1e2
            r29 = r4
            java.lang.String r4 = p000.qy0.m5015(r2, r0)     // Catch: java.lang.Throwable -> L1d2
            r30 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d2
            r0.<init>()     // Catch: java.lang.Throwable -> L1d2
            r31 = r2
            java.lang.String r2 = "[LIVEPHOTO-MERGE-VIDEO] awemeId="
            r0.append(r2)     // Catch: java.lang.Throwable -> L1cd
            r0.append(r14)     // Catch: java.lang.Throwable -> L1cd
            r0.append(r13)     // Catch: java.lang.Throwable -> L1cd
            r0.append(r11)     // Catch: java.lang.Throwable -> L1cd
            r0.append(r12)     // Catch: java.lang.Throwable -> L1cd
            r0.append(r10)     // Catch: java.lang.Throwable -> L1cd
            r0.append(r15)     // Catch: java.lang.Throwable -> L1cd
            r0.append(r4)     // Catch: java.lang.Throwable -> L1cd
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1cd
            p000.C0888ux.m5975(r3, r0)     // Catch: java.lang.Throwable -> L1cd
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1cd
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L1cd
            r2 = r6
            int r6 = r31.m5031()     // Catch: java.lang.Throwable -> L1bc
            int r0 = r23.size()     // Catch: java.lang.Throwable -> L1bc
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1bc
            r10.<init>()     // Catch: java.lang.Throwable -> L1bc
            r32 = r2
            java.lang.String r2 = "动图合并视频 "
            r10.append(r2)     // Catch: java.lang.Throwable -> L1b7
            r10.append(r11)     // Catch: java.lang.Throwable -> L1b7
            r10.append(r12)     // Catch: java.lang.Throwable -> L1b7
            r10.append(r0)     // Catch: java.lang.Throwable -> L1b7
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L1b7
            ig r10 = new ig     // Catch: java.lang.Throwable -> L1b7
            r2 = 20
            r10.<init>(r2)     // Catch: java.lang.Throwable -> L1b7
            r2 = r11
            ig r11 = new ig     // Catch: java.lang.Throwable -> L1a1
            r33 = r0
            r0 = 21
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L1a1
            r27 = r13
            r13 = r5
            r5 = r26
            r26 = r27
            r34 = r9
            r28 = r14
            r35 = r19
            r36 = r20
            r37 = r32
            r27 = 1
            r19 = r1
            r1 = r2
            r14 = r3
            r9 = r7
            r20 = r15
            r15 = r29
            r3 = r30
            r2 = r31
            r7 = r33
            r2.m5027(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L19c
            r10 = r2
            r0 = r3
            r3 = r5
            r6 = r8
            r7 = r9
            r34.getClass()     // Catch: java.lang.Throwable -> L198
            r11 = r25
            r2 = r34
            r11.m4640(r2, r0)     // Catch: java.lang.Throwable -> L193
            r1 = r2
        L18f:
            r5 = r24
            goto L25d
        L193:
            r0 = move-exception
        L194:
            r18 = r0
            goto L1f1
        L198:
            r0 = move-exception
        L199:
            r2 = r34
            goto L194
        L19c:
            r0 = move-exception
            r10 = r2
            r3 = r5
            r7 = r9
            goto L199
        L1a1:
            r0 = move-exception
            r1 = r2
            r13 = r5
            r2 = r9
        L1a5:
            r28 = r14
            r35 = r19
            r36 = r20
            r15 = r29
            r10 = r31
            r37 = r32
        L1b1:
            r27 = 1
            r14 = r3
            r3 = r26
            goto L194
        L1b7:
            r0 = move-exception
            r13 = r5
            r2 = r9
            r1 = r11
            goto L1a5
        L1bc:
            r0 = move-exception
            r37 = r2
            r13 = r5
        L1c0:
            r2 = r9
            r1 = r11
            r28 = r14
            r35 = r19
            r36 = r20
            r15 = r29
            r10 = r31
            goto L1b1
        L1cd:
            r0 = move-exception
            r13 = r5
            r37 = r6
            goto L1c0
        L1d2:
            r0 = move-exception
            r10 = r2
            r13 = r5
            r37 = r6
            r2 = r9
            r1 = r11
            r28 = r14
            r35 = r19
            r36 = r20
            r15 = r29
            goto L1b1
        L1e2:
            r0 = move-exception
            r10 = r2
            r15 = r4
            r13 = r5
            r37 = r6
            r2 = r9
            r1 = r11
            r28 = r14
            r35 = r19
            r36 = r20
            goto L1b1
        L1f1:
            r2.delete()     // Catch: java.lang.Throwable -> L237
            int r0 = r23.size()     // Catch: java.lang.Throwable -> L237
            java.lang.String r2 = r18.getMessage()     // Catch: java.lang.Throwable -> L237
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L237
            r4.<init>()     // Catch: java.lang.Throwable -> L237
            java.lang.String r5 = "[LIVEPHOTO-MERGE-VIDEO-RETRY] 候选 "
            r4.append(r5)     // Catch: java.lang.Throwable -> L237
            r4.append(r1)     // Catch: java.lang.Throwable -> L237
            r4.append(r12)     // Catch: java.lang.Throwable -> L237
            r4.append(r0)     // Catch: java.lang.Throwable -> L237
            r5 = r24
            r4.append(r5)     // Catch: java.lang.Throwable -> L237
            r4.append(r2)     // Catch: java.lang.Throwable -> L237
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L237
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L237
            r0 = r1
            r2 = r10
            r5 = r13
            r4 = r15
            r12 = r21
            r13 = r22
            r15 = r23
            r9 = r27
            r14 = r28
            r19 = r35
            r8 = r36
            r6 = r37
            r10 = 0
            r1 = r38
            goto Lb9
        L237:
            r0 = move-exception
            goto Lad
        L23a:
            r0 = move-exception
            r13 = r5
        L23c:
            r3 = r26
            goto Lad
        L240:
            r10 = r2
            r37 = r6
            r6 = r8
            r27 = r9
            r28 = r14
            r35 = r19
            r36 = r20
            r11 = r25
            r19 = r1
            r14 = r3
            r20 = r15
            r3 = r26
            r15 = r4
            r26 = r13
            r13 = r5
            r1 = r17
            goto L18f
        L25d:
            if (r1 != 0) goto L27f
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L237
            if (r18 == 0) goto L268
            java.lang.String r1 = r18.getMessage()     // Catch: java.lang.Throwable -> L237
            goto L26a
        L268:
            r1 = r17
        L26a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L237
            r2.<init>()     // Catch: java.lang.Throwable -> L237
            java.lang.String r4 = "合并动图失败：视频全部候选下载失败: "
            r2.append(r4)     // Catch: java.lang.Throwable -> L237
            r2.append(r1)     // Catch: java.lang.Throwable -> L237
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L237
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L237
            throw r0     // Catch: java.lang.Throwable -> L237
        L27f:
            if (r7 == 0) goto L288
            java.lang.String r0 = "正在准备静态图"
            r2 = 55
            p000.qy0.m4997(r2, r3, r7, r0)     // Catch: java.lang.Throwable -> L237
        L288:
            java.lang.String r0 = "dyhelper_lp_img_"
            java.lang.String r2 = ".jpg"
            java.io.File r2 = java.io.File.createTempFile(r0, r2, r15)     // Catch: java.lang.Throwable -> L237
            r13.add(r2)     // Catch: java.lang.Throwable -> L237
            java.lang.String r4 = ""
            boolean r0 = r22.isEmpty()     // Catch: java.lang.Throwable -> L237
            r23 = 0
            if (r0 != 0) goto L3b5
            java.util.Iterator r8 = r22.iterator()     // Catch: java.lang.Throwable -> L3a1
            r16 = r17
            r0 = 0
            r9 = 0
        L2a5:
            boolean r18 = r8.hasNext()     // Catch: java.lang.Throwable -> L3a1
            if (r18 == 0) goto L3a6
            r38 = r4
            int r4 = r0 + 1
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Throwable -> L3a1
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L3a1
            boolean r18 = r2.exists()     // Catch: java.lang.Throwable -> L2be
            if (r18 == 0) goto L2be
            r2.delete()     // Catch: java.lang.Throwable -> L2be
        L2be:
            r18 = r6
            int r6 = r22.size()     // Catch: java.lang.Throwable -> L354
            r25 = r8
            java.lang.String r8 = p000.qy0.m5015(r10, r0)     // Catch: java.lang.Throwable -> L344
            r29 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L340
            r9.<init>()     // Catch: java.lang.Throwable -> L340
            r30 = r11
            java.lang.String r11 = "[LIVEPHOTO-MERGE-IMG] awemeId="
            r9.append(r11)     // Catch: java.lang.Throwable -> L338
            r11 = r28
            r9.append(r11)     // Catch: java.lang.Throwable -> L330
            r28 = r13
            r13 = r26
            r9.append(r13)     // Catch: java.lang.Throwable -> L32c
            r9.append(r4)     // Catch: java.lang.Throwable -> L32c
            r9.append(r12)     // Catch: java.lang.Throwable -> L32c
            r9.append(r6)     // Catch: java.lang.Throwable -> L32c
            r6 = r20
            r9.append(r6)     // Catch: java.lang.Throwable -> L31e
            r9.append(r8)     // Catch: java.lang.Throwable -> L31e
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L31e
            p000.C0888ux.m5975(r14, r8)     // Catch: java.lang.Throwable -> L31e
            r2.getClass()     // Catch: java.lang.Throwable -> L31e
            r10.m5019(r2, r0)     // Catch: java.lang.Throwable -> L31e
            boolean r8 = r2.exists()     // Catch: java.lang.Throwable -> L31e
            if (r8 == 0) goto L324
            long r8 = r2.length()     // Catch: java.lang.Throwable -> L31e
            int r8 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r8 <= 0) goto L324
            java.lang.String r4 = p000.qy0.m5015(r10, r0)     // Catch: java.lang.Throwable -> L318
            r9 = r27
            goto L3cb
        L318:
            r0 = move-exception
            r16 = r0
            r9 = r27
            goto L358
        L31e:
            r0 = move-exception
        L31f:
            r16 = r0
            r9 = r29
            goto L358
        L324:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L31e
            java.lang.String r8 = "JPEG 输出为空"
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L31e
            throw r0     // Catch: java.lang.Throwable -> L31e
        L32c:
            r0 = move-exception
            r6 = r20
            goto L31f
        L330:
            r0 = move-exception
            r28 = r13
            r6 = r20
        L335:
            r13 = r26
            goto L31f
        L338:
            r0 = move-exception
        L339:
            r6 = r20
            r11 = r28
            r28 = r13
            goto L335
        L340:
            r0 = move-exception
            r30 = r11
            goto L339
        L344:
            r0 = move-exception
        L345:
            r29 = r9
            r30 = r11
            r6 = r20
            r11 = r28
            r28 = r13
            r13 = r26
            r16 = r0
            goto L358
        L354:
            r0 = move-exception
            r25 = r8
            goto L345
        L358:
            r2.delete()     // Catch: java.lang.Throwable -> L35b
        L35b:
            int r0 = r22.size()     // Catch: java.lang.Throwable -> L39a
            java.lang.String r8 = r16.getMessage()     // Catch: java.lang.Throwable -> L39a
            r20 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39a
            r9.<init>()     // Catch: java.lang.Throwable -> L39a
            r26 = r13
            java.lang.String r13 = "[LIVEPHOTO-MERGE-IMG-RETRY] 静态图候选 "
            r9.append(r13)     // Catch: java.lang.Throwable -> L39a
            r9.append(r4)     // Catch: java.lang.Throwable -> L39a
            r9.append(r12)     // Catch: java.lang.Throwable -> L39a
            r9.append(r0)     // Catch: java.lang.Throwable -> L39a
            r9.append(r5)     // Catch: java.lang.Throwable -> L39a
            r9.append(r8)     // Catch: java.lang.Throwable -> L39a
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L39a
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L39a
            r0 = r4
            r9 = r20
            r8 = r25
            r13 = r28
            r4 = r38
            r20 = r6
            r28 = r11
            r6 = r18
            r11 = r30
            goto L2a5
        L39a:
            r0 = move-exception
            r2 = r17
            r13 = r28
            goto L6eb
        L3a1:
            r0 = move-exception
            r28 = r13
            goto Lad
        L3a6:
            r38 = r4
            r18 = r6
            r29 = r9
            r30 = r11
            r6 = r20
            r11 = r28
            r28 = r13
            goto L3cb
        L3b5:
            r38 = r4
            r18 = r6
            r30 = r11
            r6 = r20
            r11 = r28
            r28 = r13
            java.lang.String r0 = "[LIVEPHOTO-MERGE-IMG-SKIP] 没有静态图候选，准备使用视频首帧"
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L59a
            r4 = r38
            r16 = r17
            r9 = 0
        L3cb:
            if (r9 != 0) goto L444
            if (r7 == 0) goto L3d6
            java.lang.String r0 = "静态图不可用，使用视频首帧"
            r4 = 60
            p000.qy0.m4997(r4, r3, r7, r0)     // Catch: java.lang.Throwable -> L39a
        L3d6:
            r2.getClass()     // Catch: java.lang.Throwable -> L40d
            p000.qy0.m4984(r1, r2)     // Catch: java.lang.Throwable -> L40d
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L40d
            if (r0 == 0) goto L40f
            long r4 = r2.length()     // Catch: java.lang.Throwable -> L40d
            int r0 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r0 <= 0) goto L40f
            java.lang.String r4 = "video-frame"
            long r8 = r2.length()     // Catch: java.lang.Throwable -> L40d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40d
            r0.<init>()     // Catch: java.lang.Throwable -> L40d
            java.lang.String r5 = "[LIVEPHOTO-MERGE-IMG-FRAME] awemeId="
            r0.append(r5)     // Catch: java.lang.Throwable -> L40d
            r0.append(r11)     // Catch: java.lang.Throwable -> L40d
            java.lang.String r5 = ", 使用视频首帧生成静态图, size="
            r0.append(r5)     // Catch: java.lang.Throwable -> L40d
            r0.append(r8)     // Catch: java.lang.Throwable -> L40d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L40d
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L40d
            goto L444
        L40d:
            r0 = move-exception
            goto L417
        L40f:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L40d
            java.lang.String r1 = "视频首帧 JPEG 输出为空"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L40d
            throw r0     // Catch: java.lang.Throwable -> L40d
        L417:
            if (r16 == 0) goto L41f
            java.lang.String r1 = r16.getMessage()     // Catch: java.lang.Throwable -> L39a
            if (r1 != 0) goto L421
        L41f:
            java.lang.String r1 = "没有静态图候选"
        L421:
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Throwable -> L39a
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L39a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39a
            r4.<init>()     // Catch: java.lang.Throwable -> L39a
            java.lang.String r5 = "合并动图失败：静态图片全部候选不可用，且视频首帧兜底失败。\n图片错误："
            r4.append(r5)     // Catch: java.lang.Throwable -> L39a
            r4.append(r1)     // Catch: java.lang.Throwable -> L39a
            java.lang.String r1 = "\n首帧错误："
            r4.append(r1)     // Catch: java.lang.Throwable -> L39a
            r4.append(r0)     // Catch: java.lang.Throwable -> L39a
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L39a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L39a
            throw r2     // Catch: java.lang.Throwable -> L39a
        L444:
            long r8 = r2.length()     // Catch: java.lang.Throwable -> L59a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59a
            r0.<init>()     // Catch: java.lang.Throwable -> L59a
            java.lang.String r5 = "[LIVEPHOTO-MERGE-IMG-READY] awemeId="
            r0.append(r5)     // Catch: java.lang.Throwable -> L59a
            r0.append(r11)     // Catch: java.lang.Throwable -> L59a
            java.lang.String r5 = ", size="
            r0.append(r5)     // Catch: java.lang.Throwable -> L59a
            r0.append(r8)     // Catch: java.lang.Throwable -> L59a
            java.lang.String r5 = ", source="
            r0.append(r5)     // Catch: java.lang.Throwable -> L59a
            r0.append(r4)     // Catch: java.lang.Throwable -> L59a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L59a
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L59a
            java.lang.String r0 = r21.m2044()     // Catch: java.lang.Throwable -> L59a
            if (r0 == 0) goto L478
            boolean r4 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L59a
            if (r4 == 0) goto L486
        L478:
            r12 = r2
            r31 = r10
            r6 = r18
            r13 = r28
            r10 = r1
            r28 = r11
            r11 = r19
            goto L59c
        L486:
            if (r7 == 0) goto L48f
            java.lang.String r4 = "正在下载音频"
            r5 = 66
            p000.qy0.m4997(r5, r3, r7, r4)     // Catch: java.lang.Throwable -> L39a
        L48f:
            java.lang.String r4 = "dyhelper_lp_audio_"
            java.lang.String r5 = ".mp3"
            java.lang.String r8 = ".flac"
            java.lang.String r9 = ".wav"
            java.lang.String r12 = ".ogg"
            java.lang.String r13 = ".m4a"
            r38 = r1
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L598
            java.lang.String r1 = r0.toLowerCase(r1)     // Catch: java.lang.Throwable -> L598
            r1.getClass()     // Catch: java.lang.Throwable -> L598
            r16 = r2
            java.lang.String r2 = ".aac"
            r26 = r3
            r3 = 0
            boolean r20 = p000.q02.m4654(r1, r2, r3)     // Catch: java.lang.Throwable -> L594
            if (r20 == 0) goto L4b7
            r5 = r2
        L4b4:
            r2 = r19
            goto L4ea
        L4b7:
            boolean r2 = p000.q02.m4654(r1, r13, r3)     // Catch: java.lang.Throwable -> L594
            if (r2 == 0) goto L4bf
            r5 = r13
            goto L4b4
        L4bf:
            r2 = r19
            boolean r19 = p000.q02.m4654(r1, r2, r3)     // Catch: java.lang.Throwable -> L594
            if (r19 == 0) goto L4c9
            r5 = r13
            goto L4ea
        L4c9:
            boolean r13 = p000.q02.m4654(r1, r12, r3)     // Catch: java.lang.Throwable -> L594
            if (r13 == 0) goto L4d1
            r5 = r12
            goto L4ea
        L4d1:
            boolean r12 = p000.q02.m4654(r1, r9, r3)     // Catch: java.lang.Throwable -> L594
            if (r12 == 0) goto L4d9
            r5 = r9
            goto L4ea
        L4d9:
            boolean r9 = p000.q02.m4654(r1, r8, r3)     // Catch: java.lang.Throwable -> L594
            if (r9 == 0) goto L4e1
            r5 = r8
            goto L4ea
        L4e1:
            boolean r1 = p000.q02.m4654(r1, r5, r3)     // Catch: java.lang.Throwable -> L594
            if (r1 == 0) goto L4e8
            goto L4ea
        L4e8:
            java.lang.String r5 = ".audio"
        L4ea:
            java.io.File r12 = java.io.File.createTempFile(r4, r5, r15)     // Catch: java.lang.Throwable -> L58d
            r13 = r28
            r13.add(r12)     // Catch: java.lang.Throwable -> L58a
            java.lang.String r1 = p000.qy0.m5015(r10, r0)     // Catch: java.lang.Throwable -> L55f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55f
            r3.<init>()     // Catch: java.lang.Throwable -> L55f
            java.lang.String r4 = "[LIVEPHOTO-MERGE-AUDIO] awemeId="
            r3.append(r4)     // Catch: java.lang.Throwable -> L55f
            r3.append(r11)     // Catch: java.lang.Throwable -> L55f
            r3.append(r6)     // Catch: java.lang.Throwable -> L55f
            r3.append(r1)     // Catch: java.lang.Throwable -> L55f
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L55f
            p000.C0888ux.m5975(r14, r1)     // Catch: java.lang.Throwable -> L55f
            r19 = r2
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L54d
            r2.<init>(r12)     // Catch: java.lang.Throwable -> L54d
            int r4 = r10.m5031()     // Catch: java.lang.Throwable -> L54d
            java.lang.String r5 = "动图音频"
            ig r8 = new ig     // Catch: java.lang.Throwable -> L54d
            r1 = 22
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L54d
            ig r9 = new ig     // Catch: java.lang.Throwable -> L54d
            r1 = 23
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L54d
            r1 = r0
            r31 = r10
            r28 = r11
            r6 = r18
            r11 = r19
            r3 = r26
            r10 = r38
            r38 = r12
            r12 = r16
            p000.qy0.m4956(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L54b
            long r0 = r38.length()     // Catch: java.lang.Throwable -> L54b
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L587
            r0 = r38
            goto L5a2
        L54b:
            r0 = move-exception
            goto L56c
        L54d:
            r0 = move-exception
            r31 = r10
            r28 = r11
            r6 = r18
            r11 = r19
            r3 = r26
            r10 = r38
        L55a:
            r38 = r12
            r12 = r16
            goto L56c
        L55f:
            r0 = move-exception
            r31 = r10
            r28 = r11
            r6 = r18
            r3 = r26
            r10 = r38
            r11 = r2
            goto L55a
        L56c:
            r38.delete()     // Catch: java.lang.Throwable -> L237
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L237
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L237
            r1.<init>()     // Catch: java.lang.Throwable -> L237
            java.lang.String r2 = "[LIVEPHOTO-MERGE-AUDIO-SKIP] 音频下载失败，继续无音频合成: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L237
            r1.append(r0)     // Catch: java.lang.Throwable -> L237
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L237
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L237
        L587:
            r0 = r17
            goto L5a2
        L58a:
            r0 = move-exception
            goto L23c
        L58d:
            r0 = move-exception
            r3 = r26
        L590:
            r13 = r28
            goto Lad
        L594:
            r0 = move-exception
            r3 = r26
            goto L590
        L598:
            r0 = move-exception
            goto L590
        L59a:
            r0 = move-exception
            goto L590
        L59c:
            java.lang.String r0 = "[LIVEPHOTO-MERGE-AUDIO-SKIP] 未找到音频链接，继续无音频合成"
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L237
            goto L587
        L5a2:
            if (r7 == 0) goto L5ab
            java.lang.String r1 = "正在合并音视频"
            r2 = 80
            p000.qy0.m4997(r2, r3, r7, r1)     // Catch: java.lang.Throwable -> L237
        L5ab:
            if (r0 == 0) goto L611
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L237
            if (r1 == 0) goto L611
            long r1 = r0.length()     // Catch: java.lang.Throwable -> L237
            int r1 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r1 <= 0) goto L611
            java.lang.String r1 = "dyhelper_lp_mux_"
            java.io.File r1 = java.io.File.createTempFile(r1, r11, r15)     // Catch: java.lang.Throwable -> L237
            r13.add(r1)     // Catch: java.lang.Throwable -> L237
            r1.getClass()     // Catch: java.lang.Throwable -> L5e9
            r11 = r30
            java.io.File r0 = r11.m4638(r10, r0, r1)     // Catch: java.lang.Throwable -> L5e9
            if (r0 == 0) goto L5eb
            long r4 = r0.length()     // Catch: java.lang.Throwable -> L5e9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e9
            r2.<init>()     // Catch: java.lang.Throwable -> L5e9
            java.lang.String r8 = "[LIVEPHOTO-MERGE-MUX] 音视频合并成功, size="
            r2.append(r8)     // Catch: java.lang.Throwable -> L5e9
            r2.append(r4)     // Catch: java.lang.Throwable -> L5e9
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L5e9
            p000.C0888ux.m5975(r14, r2)     // Catch: java.lang.Throwable -> L5e9
            r1 = r0
            goto L619
        L5e9:
            r0 = move-exception
            goto L5f5
        L5eb:
            r1.delete()     // Catch: java.lang.Throwable -> L5e9
            java.lang.String r0 = "[LIVEPHOTO-MERGE-MUX-SKIP] 音频格式不支持 MP4 封装或合并失败，使用原视频"
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L5e9
        L5f3:
            r1 = r10
            goto L619
        L5f5:
            r1.delete()     // Catch: java.lang.Throwable -> L237
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L237
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L237
            r1.<init>()     // Catch: java.lang.Throwable -> L237
            java.lang.String r2 = "[LIVEPHOTO-MERGE-MUX-EXCEPTION] 音频合并异常，降级为无声动图: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L237
            r1.append(r0)     // Catch: java.lang.Throwable -> L237
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L237
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L237
            goto L5f3
        L611:
            if (r0 == 0) goto L5f3
            java.lang.String r0 = "[LIVEPHOTO-MERGE-AUDIO-EMPTY] 音频文件为空，使用原视频"
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L237
            goto L5f3
        L619:
            if (r7 == 0) goto L622
            java.lang.String r0 = "正在生成动态照片"
            r2 = 88
            p000.qy0.m4997(r2, r3, r7, r0)     // Catch: java.lang.Throwable -> L237
        L622:
            r2 = r35
            java.lang.String r0 = r2.f4139     // Catch: java.lang.Throwable -> L237
            java.lang.String r2 = "image/jpeg"
            java.lang.String r4 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Throwable -> L237
            r4.getClass()     // Catch: java.lang.Throwable -> L237
            r5 = r36
            android.net.Uri r2 = p000.qy0.m4985(r3, r0, r5, r2, r4)     // Catch: java.lang.Throwable -> L237
            android.content.ContentResolver r0 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L657
            java.io.OutputStream r4 = r0.openOutputStream(r2)     // Catch: java.lang.Throwable -> L657
            if (r4 == 0) goto L6e3
            nu0 r0 = new nu0     // Catch: java.lang.Throwable -> L6db
            r8 = r37
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L6db
            p000.pu0.m4612(r12, r1, r4, r0)     // Catch: java.lang.Throwable -> L6db
            r4.close()     // Catch: java.lang.Throwable -> L657
            p000.qy0.m4999(r3, r2)     // Catch: java.lang.Throwable -> L657
            if (r7 == 0) goto L65a
            java.lang.String r0 = "动态照片生成完成"
            r1 = 100
            p000.qy0.m4997(r1, r3, r7, r0)     // Catch: java.lang.Throwable -> L657
            goto L65a
        L657:
            r0 = move-exception
            goto L6eb
        L65a:
            if (r6 == 0) goto L694
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L657
            r0.getClass()     // Catch: java.lang.Throwable -> L657
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0     // Catch: java.lang.Throwable -> L657
            int r1 = r31.m5031()     // Catch: java.lang.Throwable -> L657
            x31 r4 = new x31     // Catch: java.lang.Throwable -> L657
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L657
            android.app.Notification r6 = r4.f12043     // Catch: java.lang.Throwable -> L657
            r7 = 17301634(0x1080082, float:2.497962E-38)
            r6.icon = r7     // Catch: java.lang.Throwable -> L657
            java.lang.String r6 = "动图合并完成"
            java.lang.CharSequence r6 = p000.x31.m6513(r6)     // Catch: java.lang.Throwable -> L657
            r4.f12034 = r6     // Catch: java.lang.Throwable -> L657
            java.lang.CharSequence r6 = p000.x31.m6513(r5)     // Catch: java.lang.Throwable -> L657
            r4.f12035 = r6     // Catch: java.lang.Throwable -> L657
            r6 = 16
            r4.m6515(r6)     // Catch: java.lang.Throwable -> L657
            r6 = 1
            r4.f12044 = r6     // Catch: java.lang.Throwable -> L657
            android.app.Notification r4 = r4.m6514()     // Catch: java.lang.Throwable -> L657
            r0.notify(r1, r4)     // Catch: java.lang.Throwable -> L657
        L694:
            java.lang.String r0 = r8.f8258     // Catch: java.lang.Throwable -> L657
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L657
            r1.<init>()     // Catch: java.lang.Throwable -> L657
            java.lang.String r4 = "[LIVEPHOTO-MERGE-DONE] awemeId="
            r1.append(r4)     // Catch: java.lang.Throwable -> L657
            r11 = r28
            r1.append(r11)     // Catch: java.lang.Throwable -> L657
            java.lang.String r4 = ", file="
            r1.append(r4)     // Catch: java.lang.Throwable -> L657
            r1.append(r5)     // Catch: java.lang.Throwable -> L657
            java.lang.String r4 = ", format="
            r1.append(r4)     // Catch: java.lang.Throwable -> L657
            r1.append(r0)     // Catch: java.lang.Throwable -> L657
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L657
            p000.C0888ux.m5975(r14, r0)     // Catch: java.lang.Throwable -> L657
            java.util.List r0 = p000.AbstractC1021yh.m6896(r5)     // Catch: java.lang.Throwable -> L657
            java.util.Iterator r1 = r13.iterator()
        L6c4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6da
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L6c4
            if (r3 == 0) goto L6c4
            r2.delete()     // Catch: java.lang.Throwable -> L6c4
            goto L6c4
        L6da:
            return r0
        L6db:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L6de
        L6de:
            r0 = move-exception
            p000.AbstractC0978xb.m6584(r4, r1)     // Catch: java.lang.Throwable -> L657
            throw r0     // Catch: java.lang.Throwable -> L657
        L6e3:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L657
            java.lang.String r1 = "无法打开 Motion Photo 输出流"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L657
            throw r0     // Catch: java.lang.Throwable -> L657
        L6eb:
            p000.qy0.m4987(r3, r2)     // Catch: java.lang.Throwable -> L6ef
            throw r0     // Catch: java.lang.Throwable -> L6ef
        L6ef:
            r0 = move-exception
            java.util.Iterator r1 = r13.iterator()
        L6f4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L70a
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L6f4
            if (r3 == 0) goto L6f4
            r2.delete()     // Catch: java.lang.Throwable -> L6f4
            goto L6f4
        L70a:
            throw r0
        L70b:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "合并动图失败：未找到可直接保存的 MP4 视频资源"
            r0.<init>(r1)
            throw r0
        L713:
            java.lang.Object r0 = r1.f1692
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r1.f1693
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r0 = r1.f1694
            r5 = r0
            f8 r5 = (p000.C0276f8) r5
            java.lang.Object r0 = r1.f1695
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            qy0 r3 = p000.qy0.f9157
            java.util.Iterator r9 = r2.iterator()
            r10 = 0
            r0 = r10
            r11 = r0
        L730:
            boolean r6 = r9.hasNext()
            java.lang.String r7 = "选择下载"
            java.lang.String r12 = "/"
            if (r6 == 0) goto L7ad
            r6 = 1
            int r13 = r0 + 1
            java.lang.Object r0 = r9.next()
            r14 = r0
            zy0 r14 = (p000.zy0) r14
            int r0 = r2.size()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            r15.append(r12)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            int r12 = r13 * 100
            int r15 = r2.size()
            int r12 = r12 / r15
            p000.qy0.m4997(r12, r4, r7, r0)
            az0 r0 = r14.f13351     // Catch: java.lang.Throwable -> L791
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L791
            boolean r7 = r1.f1691
            if (r0 == 0) goto L78b
            if (r0 == r6) goto L785
            r6 = 2
            if (r0 == r6) goto L785
            r6 = 3
            if (r0 != r6) goto L77e
            r6 = r14
            boolean r0 = r3.m5025(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L77c
            goto L7a7
        L77c:
            r0 = move-exception
            goto L793
        L77e:
            r6 = r14
            pm r0 = new pm     // Catch: java.lang.Throwable -> L77c
            r0.<init>()     // Catch: java.lang.Throwable -> L77c
            throw r0     // Catch: java.lang.Throwable -> L77c
        L785:
            r6 = r14
            boolean r0 = r3.m5023(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L77c
            goto L7a7
        L78b:
            r6 = r14
            boolean r0 = r3.m5024(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L77c
            goto L7a7
        L791:
            r0 = move-exception
            r6 = r14
        L793:
            java.lang.String r7 = r6.f13354
            java.lang.String r6 = r6.f13355
            java.lang.String r12 = " "
            java.lang.String r14 = " 失败"
            java.lang.String r15 = "[SELECT-DL-FAIL] "
            java.lang.String r6 = p000.lz1.m3689(r15, r7, r12, r6, r14)
            java.lang.String r7 = "DYHelper"
            p000.C0888ux.m5977(r7, r6, r0)
            r0 = r10
        L7a7:
            if (r0 == 0) goto L7ab
            int r11 = r11 + 1
        L7ab:
            r0 = r13
            goto L730
        L7ad:
            r0 = 100
            java.lang.String r1 = "下载完成"
            p000.qy0.m4997(r0, r4, r7, r1)
            int r0 = r2.size()
            java.lang.String r3 = "已完成 "
            java.lang.String r5 = " 项"
            java.lang.String r0 = p000.AbstractC0602nx.m4128(r3, r11, r12, r0, r5)
            p000.qy0.m4993(r4, r1, r0, r7)
            gs r0 = new gs
            r1 = 3
            r0.<init>(r11, r1, r4, r2)
            r4.runOnUiThread(r0)
            s62 r0 = p000.s62.f9751
            return r0
        L7cf:
            java.lang.Object r0 = r1.m954()
            return r0
    }
}
