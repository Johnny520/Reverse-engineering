package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class x10 implements p000.d30, p000.e10 {

    /* JADX INFO: renamed from: α */
    public static final p000.x10 f11972 = null;

    /* JADX INFO: renamed from: β */
    public static final long f11973 = 0;

    /* JADX INFO: renamed from: γ */
    public static volatile boolean f11974;

    /* JADX INFO: renamed from: δ */
    public static volatile boolean f11975;

    /* JADX INFO: renamed from: ε */
    public static volatile java.lang.ClassLoader f11976;

    /* JADX INFO: renamed from: ζ */
    public static final java.lang.Object f11977 = null;

    /* JADX INFO: renamed from: η */
    public static volatile boolean f11978;

    /* JADX INFO: renamed from: θ */
    public static volatile long f11979;

    /* JADX INFO: renamed from: ι */
    public static volatile long f11980;

    /* JADX INFO: renamed from: κ */
    public static final java.util.WeakHashMap f11981 = null;

    /* JADX INFO: renamed from: λ */
    public static final java.util.WeakHashMap f11982 = null;

    /* JADX INFO: renamed from: μ */
    public static final java.lang.Object f11983 = null;

    /* JADX INFO: renamed from: ν */
    public static volatile p000.w10 f11984;

    static {
            x10 r0 = new x10
            r0.<init>()
            p000.x10.f11972 = r0
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            long r0 = (long) r0
            r2 = 120(0x78, double:5.93E-322)
            long r0 = r0 - r2
            r2 = 320(0x140, double:1.58E-321)
            long r0 = java.lang.Math.max(r2, r0)
            p000.x10.f11973 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.x10.f11977 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            p000.x10.f11981 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            p000.x10.f11982 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.x10.f11983 = r0
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m6490(p000.v10 r2) {
            android.view.View r0 = r2.f11060
            java.lang.Runnable r1 = r2.f11061
            if (r0 == 0) goto Lb
            if (r1 == 0) goto Lb
            r0.removeCallbacks(r1)
        Lb:
            r0 = 0
            r2.f11060 = r0
            r2.f11061 = r0
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m6491(p000.v10 r3) {
            m6490(r3)
            r0 = 0
            r3.f11052 = r0
            r1 = 0
            r3.f11053 = r1
            r3.f11054 = r1
            r1 = 0
            r3.f11055 = r1
            java.lang.String r1 = ""
            r3.f11056 = r1
            java.lang.String r1 = "无"
            r3.f11057 = r1
            r3.f11058 = r0
            r3.f11059 = r0
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static void m6492(android.app.Activity r10) {
            boolean r0 = p000.ui1.m5867()
            r1 = 4
            java.lang.String r2 = "FeedGestureHook"
            r3 = 0
            if (r0 != 0) goto L1c
            p000.ui1.m5896(r10)     // Catch: java.lang.Throwable -> Le
            goto L1c
        Le:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            java.lang.String r0 = "Prefs 初始化失败: "
            java.lang.String r10 = p000.lz1.m3687(r0, r10)
            p000.C0888ux.m5988(r2, r10, r3, r1, r3)
        L1c:
            java.lang.String r10 = "double_tap_menu_enabled"
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L25
            goto L54
        L25:
            long r4 = android.os.SystemClock.uptimeMillis()
            long r6 = p000.x10.f11979
            long r6 = r4 - r6
            r8 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L34
            goto L54
        L34:
            p000.x10.f11979 = r4
            r0 = 0
            boolean r4 = p000.ui1.m5887(r10, r0)     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L54
            p000.ui1.m5871(r10, r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r10 = "已关闭旧版双击唤出菜单开关"
            p000.C0888ux.m5988(r2, r10, r3, r1, r3)     // Catch: java.lang.Throwable -> L46
            goto L54
        L46:
            r10 = move-exception
            java.lang.String r10 = r10.getMessage()
            java.lang.String r0 = "关闭旧版双击菜单失败: "
            java.lang.String r10 = p000.lz1.m3687(r0, r10)
            p000.C0888ux.m5988(r2, r10, r3, r1, r3)
        L54:
            return
    }

    /* JADX INFO: renamed from: η */
    public static void m6493(android.app.Activity r13, java.lang.String r14) {
            w90 r0 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            java.lang.String r0 = p000.C0381i2.m2598(r14)
            int r1 = r0.hashCode()
            java.lang.String r2 = "打开评论区"
            java.lang.String r3 = "分享作品"
            java.lang.String r4 = "关注作者"
            java.lang.String r5 = "打开作者主页"
            java.lang.String r6 = "收藏作品"
            java.lang.String r7 = "点赞作品"
            r8 = 1
            r9 = 0
            r10 = 4
            java.lang.String r11 = "FeedGestureHook"
            r12 = 0
            switch(r1) {
                case -1864099483: goto L2c2;
                case -1763824809: goto L201;
                case -943367974: goto L1e7;
                case 619829985: goto L1cd;
                case 631146295: goto L1b1;
                case 631739728: goto L195;
                case 632348663: goto L17a;
                case 635158013: goto Lf7;
                case 645556490: goto Lef;
                case 648627390: goto Le7;
                case 663177879: goto Lce;
                case 692437008: goto Lc6;
                case 805455358: goto Lbe;
                case 831946447: goto La4;
                case 895108970: goto L9c;
                case 958306521: goto L73;
                case 1354647929: goto L59;
                case 1581080322: goto L3d;
                case 1705654023: goto L21;
                default: goto L1f;
            }
        L1f:
            goto L2ca
        L21:
            java.lang.String r1 = "添加个人主页书签"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L2ca
        L2b:
            java.lang.String r14 = "添加当前作品作者主页书签"
            p000.C0888ux.m5988(r11, r14, r12, r10, r12)
            q71 r14 = p000.q71.f8896
            n9 r14 = new n9
            r0 = 27
            r14.<init>(r13, r0)
            r13.runOnUiThread(r14)
            return
        L3d:
            java.lang.String r1 = "添加作品书签"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L47
            goto L2ca
        L47:
            java.lang.String r14 = "添加当前作品书签"
            p000.C0888ux.m5988(r11, r14, r12, r10, r12)
            q71 r14 = p000.q71.f8896
            n9 r14 = new n9
            r0 = 25
            r14.<init>(r13, r0)
            r13.runOnUiThread(r14)
            return
        L59:
            java.lang.String r1 = "切换隐藏联系人"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            goto L2ca
        L63:
            java.lang.String r14 = "切换隐藏联系人的临时显示状态"
            p000.C0888ux.m5988(r11, r14, r12, r10, r12)
            n9 r14 = new n9
            r0 = 20
            r14.<init>(r13, r0)
            r13.runOnUiThread(r14)
            return
        L73:
            java.lang.String r1 = "清爽模式开关"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7d
            goto L2ca
        L7d:
            java.lang.String r14 = "切换清爽模式"
            p000.C0888ux.m5988(r11, r14, r12, r10, r12)
            java.lang.String r14 = "clean_mode_enabled"
            boolean r0 = p000.ui1.m5887(r14, r9)
            r0 = r0 ^ r8
            p000.ui1.m5871(r14, r0)
            tg r1 = p000.AbstractC0871ug.f10771
            java.lang.String r1 = "feed_gesture"
            p000.C0834tg.m5649(r14, r1)
            jg r14 = new jg
            r14.<init>(r13, r0, r8)
            r13.runOnUiThread(r14)
            return
        L9c:
            boolean r1 = r0.equals(r7)
            if (r1 != 0) goto L209
            goto L2ca
        La4:
            java.lang.String r1 = "模块菜单"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lae
            goto L2ca
        Lae:
            java.lang.String r14 = "打开模块菜单"
            p000.C0888ux.m5988(r11, r14, r12, r10, r12)
            n9 r14 = new n9
            r0 = 8
            r14.<init>(r13, r0)
            r13.runOnUiThread(r14)
            return
        Lbe:
            boolean r1 = r0.equals(r6)
            if (r1 != 0) goto L209
            goto L2ca
        Lc6:
            boolean r1 = r0.equals(r5)
            if (r1 != 0) goto L209
            goto L2ca
        Lce:
            java.lang.String r1 = "发布按钮"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld8
            goto L2ca
        Ld8:
            java.lang.String r14 = "执行发布按钮入口"
            p000.C0888ux.m5988(r11, r14, r12, r10, r12)
            n9 r14 = new n9
            r0 = 7
            r14.<init>(r13, r0)
            r13.runOnUiThread(r14)
            return
        Le7:
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L209
            goto L2ca
        Lef:
            boolean r1 = r0.equals(r3)
            if (r1 != 0) goto L209
            goto L2ca
        Lf7:
            java.lang.String r1 = "修改倍速"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L101
            goto L2ca
        L101:
            java.lang.String r14 = "gesture_video_speed"
            r0 = 1073741824(0x40000000, float:2.0)
            android.content.SharedPreferences r1 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L10d
            float r0 = r1.getFloat(r14, r0)     // Catch: java.lang.Throwable -> L10d
        L10d:
            float r14 = p000.C0381i2.m2601(r0)
            l82 r0 = p000.l82.f6483
            float r0 = java.lang.Math.abs(r14)
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L158
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 > 0) goto L158
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 > 0) goto L158
            java.util.concurrent.atomic.AtomicLong r0 = p000.l82.f6489
            long r1 = r0.get()
            p000.l82.f6491 = r1
            long r0 = r0.get()
            long r0 = -r0
            p000.l82.f6490 = r0
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L14d
            boolean r9 = p000.l82.m3534(r14)
            goto L158
        L14d:
            android.os.Handler r0 = p000.l82.f6488
            g82 r1 = new g82
            r1.<init>(r9, r14)
            boolean r9 = r0.post(r1)
        L158:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "修改当前视频倍速 speed="
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r1 = " success="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5988(r11, r0, r12, r10, r12)
            u10 r0 = new u10
            r0.<init>(r13, r9, r14)
            r13.runOnUiThread(r0)
            return
        L17a:
            java.lang.String r1 = "一键已读"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L184
            goto L2ca
        L184:
            java.lang.String r14 = "执行一键已读"
            p000.C0888ux.m5988(r11, r14, r12, r10, r12)
            zj0 r14 = p000.zj0.f13118
            f9 r0 = new f9
            r1 = 2
            r0.<init>(r13, r1)
            r14.m7162(r13, r0)
            return
        L195:
            java.lang.String r1 = "下载音频"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L19f
            goto L2ca
        L19f:
            java.lang.String r14 = "执行下载音频"
            p000.C0888ux.m5988(r11, r14, r12, r10, r12)
            q71 r14 = p000.q71.f8896
            n9 r14 = new n9
            r0 = 24
            r14.<init>(r13, r0)
            r13.runOnUiThread(r14)
            return
        L1b1:
            java.lang.String r1 = "下载作品"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1bb
            goto L2ca
        L1bb:
            java.lang.String r14 = "执行下载作品"
            p000.C0888ux.m5988(r11, r14, r12, r10, r12)
            q71 r14 = p000.q71.f8896
            n9 r14 = new n9
            r0 = 28
            r14.<init>(r13, r0)
            r13.runOnUiThread(r14)
            return
        L1cd:
            java.lang.String r1 = "不感兴趣"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d7
            goto L2ca
        L1d7:
            java.lang.String r14 = "执行不感兴趣动作"
            p000.C0888ux.m5988(r11, r14, r12, r10, r12)
            n9 r14 = new n9
            r0 = 9
            r14.<init>(r13, r0)
            r13.runOnUiThread(r14)
            return
        L1e7:
            java.lang.String r1 = "观看历史记录"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1f1
            goto L2ca
        L1f1:
            java.lang.String r14 = "打开观看历史记录"
            p000.C0888ux.m5988(r11, r14, r12, r10, r12)
            n9 r14 = new n9
            r0 = 10
            r14.<init>(r13, r0)
            r13.runOnUiThread(r14)
            return
        L201:
            boolean r1 = r0.equals(r2)
            if (r1 != 0) goto L209
            goto L2ca
        L209:
            int r14 = r0.hashCode()
            switch(r14) {
                case -1763824809: goto L249;
                case 645556490: goto L23e;
                case 648627390: goto L233;
                case 692437008: goto L228;
                case 805455358: goto L21d;
                case 895108970: goto L212;
                default: goto L210;
            }
        L210:
            goto L2c1
        L212:
            boolean r14 = r0.equals(r7)
            if (r14 != 0) goto L21a
            goto L2c1
        L21a:
            o10 r14 = p000.o10.f7858
            goto L253
        L21d:
            boolean r14 = r0.equals(r6)
            if (r14 != 0) goto L225
            goto L2c1
        L225:
            o10 r14 = p000.o10.f7860
            goto L253
        L228:
            boolean r14 = r0.equals(r5)
            if (r14 != 0) goto L230
            goto L2c1
        L230:
            o10 r14 = p000.o10.f7862
            goto L253
        L233:
            boolean r14 = r0.equals(r4)
            if (r14 != 0) goto L23b
            goto L2c1
        L23b:
            o10 r14 = p000.o10.f7863
            goto L253
        L23e:
            boolean r14 = r0.equals(r3)
            if (r14 != 0) goto L246
            goto L2c1
        L246:
            o10 r14 = p000.o10.f7861
            goto L253
        L249:
            boolean r14 = r0.equals(r2)
            if (r14 != 0) goto L251
            goto L2c1
        L251:
            o10 r14 = p000.o10.f7859
        L253:
            e9 r1 = new e9
            r2 = 13
            r1.<init>(r0, r14, r13, r2)
            android.view.Window r2 = r13.getWindow()     // Catch: java.lang.Throwable -> L265
            if (r2 == 0) goto L267
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> L265
            goto L26f
        L265:
            r2 = move-exception
            goto L269
        L267:
            r2 = r12
            goto L26f
        L269:
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L26f:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L274
            r2 = r12
        L274:
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L299
            boolean r3 = r2.post(r1)     // Catch: java.lang.Throwable -> L281
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L281
            goto L288
        L281:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L288:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r5 = r3 instanceof p000.eo1
            if (r5 == 0) goto L28f
            r3 = r4
        L28f:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != r8) goto L299
            r3 = r8
            goto L29a
        L299:
            r3 = r9
        L29a:
            java.lang.String r14 = r14.f7865
            if (r2 == 0) goto L29f
            goto L2a0
        L29f:
            r8 = r9
        L2a0:
            java.lang.String r2 = " hostAction="
            java.lang.String r4 = " decorAvailable="
            java.lang.String r5 = "Feed 原生互动动作已投递 action="
            java.lang.StringBuilder r14 = p000.lz1.m3695(r5, r0, r2, r14, r4)
            r14.append(r8)
            java.lang.String r0 = " posted="
            r14.append(r0)
            r14.append(r3)
            java.lang.String r14 = r14.toString()
            p000.C0888ux.m5988(r11, r14, r12, r10, r12)
            if (r3 != 0) goto L2c1
            r13.runOnUiThread(r1)
        L2c1:
            return
        L2c2:
            java.lang.String r1 = "一键续火花"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d4
        L2ca:
            java.lang.String r13 = "忽略未配置或不支持的手势动作: "
            java.lang.String r13 = r13.concat(r14)
            p000.C0888ux.m5988(r11, r13, r12, r10, r12)
            return
        L2d4:
            java.lang.String r14 = "执行一键续火花"
            p000.C0888ux.m5988(r11, r14, r12, r10, r12)
            n9 r14 = new n9
            r0 = 6
            r14.<init>(r13, r0)
            r13.runOnUiThread(r14)
            return
    }

    /* JADX INFO: renamed from: θ */
    public static android.app.Activity m6494(android.content.Context r1) {
        L0:
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L7
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        L7:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L12
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L0
        L12:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static p000.w10 m6495(android.view.MotionEvent r15) {
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = 0
            if (r15 == 0) goto Ld
            long r4 = r15.getEventTime()
            goto Le
        Ld:
            r4 = r2
        Le:
            java.lang.Object r6 = p000.x10.f11983
            monitor-enter(r6)
            zt0 r7 = p000.AbstractC1021yh.m6893()     // Catch: java.lang.Throwable -> L1d
            w10 r8 = p000.x10.f11984     // Catch: java.lang.Throwable -> L1d
            if (r8 == 0) goto L20
            r7.add(r8)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r15 = move-exception
            goto Lb0
        L20:
            java.util.WeakHashMap r8 = p000.x10.f11982     // Catch: java.lang.Throwable -> L1d
            java.util.Collection r8 = r8.values()     // Catch: java.lang.Throwable -> L1d
            r8.getClass()     // Catch: java.lang.Throwable -> L1d
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L1d
        L2f:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r9 == 0) goto L3f
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L1d
            w10 r9 = (p000.w10) r9     // Catch: java.lang.Throwable -> L1d
            r7.add(r9)     // Catch: java.lang.Throwable -> L1d
            goto L2f
        L3f:
            zt0 r7 = p000.AbstractC1021yh.m6883(r7)     // Catch: java.lang.Throwable -> L1d
            r8 = 0
            java.util.ListIterator r7 = r7.listIterator(r8)     // Catch: java.lang.Throwable -> L1d
            r8 = 0
            r9 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L4c:
            r10 = r7
            le0 r10 = (p000.le0) r10     // Catch: java.lang.Throwable -> L1d
            boolean r11 = r10.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r11 == 0) goto Lae
            java.lang.Object r10 = r10.next()     // Catch: java.lang.Throwable -> L1d
            w10 r10 = (p000.w10) r10     // Catch: java.lang.Throwable -> L1d
            java.lang.ref.WeakReference r11 = r10.f11514     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r11 = r11.get()     // Catch: java.lang.Throwable -> L1d
            if (r11 == 0) goto L4c
            long r11 = r10.f11518     // Catch: java.lang.Throwable -> L1d
            long r11 = r0 - r11
            r13 = 1200(0x4b0, double:5.93E-321)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 > 0) goto L4c
            int r11 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r11 <= 0) goto L7e
            long r11 = r10.f11517     // Catch: java.lang.Throwable -> L1d
            long r11 = r4 - r11
            long r11 = java.lang.Math.abs(r11)     // Catch: java.lang.Throwable -> L1d
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L7e
            goto L4c
        L7e:
            if (r15 != 0) goto L86
            long r11 = r10.f11518     // Catch: java.lang.Throwable -> L1d
            long r11 = r0 - r11
            float r11 = (float) r11     // Catch: java.lang.Throwable -> L1d
            goto La7
        L86:
            float r11 = r15.getRawX()     // Catch: java.lang.Throwable -> L1d
            float r12 = r10.f11515     // Catch: java.lang.Throwable -> L1d
            float r11 = r11 - r12
            float r11 = java.lang.Math.abs(r11)     // Catch: java.lang.Throwable -> L1d
            float r12 = r15.getRawY()     // Catch: java.lang.Throwable -> L1d
            float r13 = r10.f11516     // Catch: java.lang.Throwable -> L1d
            float r12 = r12 - r13
            float r12 = java.lang.Math.abs(r12)     // Catch: java.lang.Throwable -> L1d
            float r11 = r11 + r12
            long r12 = r10.f11517     // Catch: java.lang.Throwable -> L1d
            long r12 = r4 - r12
            long r12 = java.lang.Math.abs(r12)     // Catch: java.lang.Throwable -> L1d
            float r12 = (float) r12
            float r11 = r11 + r12
        La7:
            int r12 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r12 >= 0) goto L4c
            r8 = r10
            r9 = r11
            goto L4c
        Lae:
            monitor-exit(r6)
            return r8
        Lb0:
            monitor-exit(r6)
            throw r15
    }

    /* JADX INFO: renamed from: κ */
    public static p000.v10 m6496(android.app.Activity r2) {
            java.util.WeakHashMap r0 = p000.x10.f11981
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            v10 r1 = new v10     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r2 = move-exception
            goto L18
        L14:
            v10 r1 = (p000.v10) r1     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r1
        L18:
            monitor-exit(r0)
            throw r2
    }

    /* JADX INFO: renamed from: μ */
    public static boolean m6497(android.app.Activity r21, p000.v10 r22, boolean r23) {
            r1 = r22
            long r2 = android.os.SystemClock.uptimeMillis()
            if (r23 != 0) goto L15
            long r4 = r1.f11062
            long r4 = r2 - r4
            r6 = 200(0xc8, double:9.9E-322)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L15
            boolean r0 = r1.f11063
            return r0
        L15:
            t10 r0 = p000.h62.m2447(r21)     // Catch: java.lang.Throwable -> L1a
            goto L21
        L1a:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L21:
            java.lang.Throwable r4 = p000.fo1.m2190(r0)
            r5 = 0
            java.lang.String r6 = ""
            if (r4 != 0) goto L2b
            goto L3e
        L2b:
            t10 r0 = new t10
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.String r7 = "selection_error:"
            java.lang.String r4 = r7.concat(r4)
            r0.<init>(r6, r6, r4, r5)
        L3e:
            r4 = r0
            t10 r4 = (p000.t10) r4
            s10 r7 = new s10
            r7.<init>()
            r7.f9662 = r6
            r7.f9664 = r6
            r7.f9665 = r6
            r7.f9669 = r6
            android.view.Window r0 = r21.getWindow()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L5b
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> L59
            goto L63
        L59:
            r0 = move-exception
            goto L5d
        L5b:
            r0 = 0
            goto L63
        L5d:
            eo1 r8 = new eo1
            r8.<init>(r0)
            r0 = r8
        L63:
            boolean r8 = r0 instanceof p000.eo1
            if (r8 == 0) goto L68
            r0 = 0
        L68:
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L8a
            p000.h62.m2451(r0, r7)     // Catch: java.lang.Throwable -> L72
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L72
            goto L79
        L72:
            r0 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r0)
            r0 = r8
        L79:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L8e
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r7.f9669 = r0
            goto L8e
        L8a:
            java.lang.String r0 = "decor_unavailable"
            r7.f9669 = r0
        L8e:
            boolean r0 = r4.f10131
            boolean r8 = r7.f9661
            boolean r9 = r7.f9663
            if (r0 != 0) goto L98
            if (r8 == 0) goto L9b
        L98:
            if (r9 != 0) goto L9b
            r5 = 1
        L9b:
            java.lang.String r10 = r4.f10132
            java.lang.String r11 = r4.f10133
            java.lang.String r4 = r4.f10134
            java.lang.String r12 = r7.f9662
            java.lang.String r13 = r7.f9664
            java.lang.String r14 = r7.f9665
            int r15 = r7.f9666
            boolean r6 = r7.f9667
            r16 = r6
            boolean r6 = r7.f9668
            java.lang.String r7 = r7.f9669
            r1.f11062 = r2
            r1.f11063 = r5
            if (r23 == 0) goto L140
            long r17 = p000.x10.f11980
            long r17 = r2 - r17
            r19 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r1 <= 0) goto L140
            p000.x10.f11980 = r2
            java.lang.Class r1 = r21.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Feed场景判断 allowed="
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = " selected="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " selectionSource="
            r2.append(r0)
            java.lang.String r0 = " selectionView="
            java.lang.String r3 = " selectionReject="
            p000.AbstractC0602nx.m4119(r2, r10, r0, r11, r3)
            r2.append(r4)
            java.lang.String r0 = " hasPlayer="
            r2.append(r0)
            r2.append(r8)
            java.lang.String r0 = " anchor="
            r2.append(r0)
            r2.append(r12)
            java.lang.String r0 = " commentOpen="
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = " commentAnchor="
            r2.append(r0)
            java.lang.String r0 = " commentRect="
            java.lang.String r3 = " visited="
            p000.AbstractC0602nx.m4119(r2, r13, r0, r14, r3)
            r2.append(r15)
            java.lang.String r0 = " depthLimit="
            r2.append(r0)
            r0 = r16
            r2.append(r0)
            java.lang.String r0 = " nodeLimit="
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = " scanFailure="
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = " activity="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r1 = 4
            java.lang.String r2 = "FeedGestureHook"
            r3 = 0
            p000.C0888ux.m5988(r2, r0, r3, r1, r3)
        L140:
            return r5
    }

    /* JADX INFO: renamed from: ν */
    public static boolean m6498() {
            boolean r0 = p000.ui1.m5867()
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r0 = "gesture_enabled"
            boolean r0 = p000.ui1.m5887(r0, r1)
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            return r1
    }

    /* JADX INFO: renamed from: ξ */
    public static java.lang.String m6499(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "无"
            if (r2 != 0) goto L5
            goto Lb
        L5:
            boolean r1 = p000.ui1.m5867()
            if (r1 != 0) goto Lc
        Lb:
            return r0
        Lc:
            w90 r1 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            java.lang.String r2 = p000.C0381i2.m2602(r2, r3)
            java.lang.String r3 = p000.ui1.m5893(r2, r0)
            java.lang.String r0 = p000.C0381i2.m2598(r3)
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L23
            p000.ui1.m5875(r2, r0)
        L23:
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static void m6500(android.app.Activity r12, p000.v10 r13) {
            java.lang.String r1 = "FeedGestureHook"
            java.lang.String r2 = "派发 ACTION_CANCEL 失败: "
            long r5 = android.os.SystemClock.uptimeMillis()
            long r3 = r13.f11055
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r7 = 0
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r11 = 0
            if (r3 <= 0) goto L16
            goto L17
        L16:
            r0 = r11
        L17:
            if (r0 == 0) goto L1e
            long r3 = r0.longValue()
            goto L1f
        L1e:
            r3 = r5
        L1f:
            float r8 = r13.f11053
            float r9 = r13.f11054
            r10 = 0
            r7 = 3
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r3 = 4
            e30 r0 = p000.e30.f3390     // Catch: java.lang.Throwable -> L3b
            r13.getClass()     // Catch: java.lang.Throwable -> L3b
            p000.e30.m1838(r12, r13)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r12 = "已向原生派发 ACTION_CANCEL，阻止原生长按"
            p000.C0888ux.m5988(r1, r12, r11, r3, r11)     // Catch: java.lang.Throwable -> L3b
            r13.recycle()
            return
        L3b:
            r0 = move-exception
            r12 = r0
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L54
            r0.append(r12)     // Catch: java.lang.Throwable -> L54
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> L54
            p000.C0888ux.m5988(r1, r12, r11, r3, r11)     // Catch: java.lang.Throwable -> L54
            r13.recycle()
            return
        L54:
            r0 = move-exception
            r12 = r0
            r13.recycle()
            throw r12
    }

    /* JADX INFO: renamed from: π */
    public static void m6501(java.lang.ClassLoader r4) {
            java.lang.String r0 = "注册共享双击手势策略失败: "
            java.lang.Object r1 = p000.x10.f11977
            monitor-enter(r1)
            x10 r2 = p000.x10.f11972     // Catch: java.lang.Throwable -> L2d
            boolean r3 = m6498()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L4d
            boolean r3 = p000.x10.f11978     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L13
            monitor-exit(r1)
            return
        L13:
            java.util.concurrent.CopyOnWriteArrayList r3 = p000.g10.f4192     // Catch: java.lang.Throwable -> L1b
            p000.g10.m2222(r4, r2)     // Catch: java.lang.Throwable -> L1b
            s62 r4 = p000.s62.f9751     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r4 = move-exception
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2d
            r4 = r2
        L22:
            boolean r2 = r4 instanceof p000.eo1     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L2f
            r2 = r4
            s62 r2 = (p000.s62) r2     // Catch: java.lang.Throwable -> L2d
            r2 = 1
            p000.x10.f11978 = r2     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
            r4 = move-exception
            goto L5b
        L2f:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L59
            java.lang.String r2 = "FeedGestureHook"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            r3.append(r4)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L2d
            r0 = 4
            r3 = 0
            p000.C0888ux.m5988(r2, r4, r3, r0, r3)     // Catch: java.lang.Throwable -> L2d
            goto L59
        L4d:
            boolean r4 = p000.x10.f11978     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L59
            java.util.concurrent.CopyOnWriteArrayList r4 = p000.g10.f4192     // Catch: java.lang.Throwable -> L2d
            p000.g10.m2226(r2)     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            p000.x10.f11978 = r4     // Catch: java.lang.Throwable -> L2d
        L59:
            monitor-exit(r1)
            return
        L5b:
            monitor-exit(r1)
            throw r4
    }

    @Override // p000.e10
    /* JADX INFO: renamed from: α */
    public final int mo1833() {
            r0 = this;
            r0 = 100
            return r0
    }

    @Override // p000.e10
    /* JADX INFO: renamed from: β */
    public final boolean mo1834(java.lang.Object r13, android.view.MotionEvent r14) {
            r12 = this;
            r12 = 0
            r0 = 0
            if (r13 != 0) goto L6
            r13 = r0
            goto L3e
        L6:
            boolean r1 = r13 instanceof android.view.View
            if (r1 == 0) goto Le
            r1 = r13
            android.view.View r1 = (android.view.View) r1
            goto Lf
        Le:
            r1 = r0
        Lf:
            if (r1 == 0) goto L1a
            android.content.Context r13 = r1.getContext()
            android.app.Activity r13 = m6494(r13)
            goto L3e
        L1a:
            java.lang.String r1 = "getContext"
            java.lang.Object[] r2 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L29
            java.lang.Object r13 = p000.qe0.m4869(r13, r1, r2)     // Catch: java.lang.Throwable -> L29
            boolean r1 = r13 instanceof android.content.Context     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L2b
            android.content.Context r13 = (android.content.Context) r13     // Catch: java.lang.Throwable -> L29
            goto L2c
        L29:
            r13 = move-exception
            goto L31
        L2b:
            r13 = r0
        L2c:
            android.app.Activity r13 = m6494(r13)     // Catch: java.lang.Throwable -> L29
            goto L37
        L31:
            eo1 r1 = new eo1
            r1.<init>(r13)
            r13 = r1
        L37:
            boolean r1 = r13 instanceof p000.eo1
            if (r1 == 0) goto L3c
            r13 = r0
        L3c:
            android.app.Activity r13 = (android.app.Activity) r13
        L3e:
            if (r13 != 0) goto L54
            w10 r13 = m6495(r14)
            if (r13 == 0) goto L4f
            java.lang.ref.WeakReference r13 = r13.f11514
            java.lang.Object r13 = r13.get()
            android.app.Activity r13 = (android.app.Activity) r13
            goto L50
        L4f:
            r13 = r0
        L50:
            if (r13 != 0) goto L54
            goto L1b1
        L54:
            m6492(r13)
            boolean r1 = p000.ui1.m5867()
            if (r1 != 0) goto L5f
            goto L1b1
        L5f:
            java.lang.String r1 = "gesture_enabled"
            boolean r1 = p000.ui1.m5887(r1, r12)
            if (r1 != 0) goto L69
            goto L1b1
        L69:
            v10 r1 = m6496(r13)
            r2 = 1
            boolean r3 = m6497(r13, r1, r2)
            if (r3 != 0) goto L76
            goto L1b1
        L76:
            w10 r3 = m6495(r14)
            if (r3 == 0) goto L85
            java.lang.ref.WeakReference r4 = r3.f11514
            java.lang.Object r4 = r4.get()
            if (r4 != r13) goto L85
            goto L86
        L85:
            r3 = r0
        L86:
            android.view.Window r4 = r13.getWindow()
            if (r4 == 0) goto L91
            android.view.View r4 = r4.getDecorView()
            goto L92
        L91:
            r4 = r0
        L92:
            if (r4 == 0) goto La8
            int r5 = r4.getWidth()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            if (r5 <= 0) goto L9f
            goto La0
        L9f:
            r6 = r0
        La0:
            if (r6 == 0) goto La8
            int r5 = r6.intValue()
        La6:
            float r5 = (float) r5
            goto Lb3
        La8:
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            goto La6
        Lb3:
            if (r4 == 0) goto Lc9
            int r6 = r4.getHeight()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r6 <= 0) goto Lc0
            goto Lc1
        Lc0:
            r7 = r0
        Lc1:
            if (r7 == 0) goto Lc9
            int r6 = r7.intValue()
        Lc7:
            float r6 = (float) r6
            goto Ld4
        Lc9:
            android.content.res.Resources r6 = r13.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.heightPixels
            goto Lc7
        Ld4:
            r7 = 2
            int[] r7 = new int[r7]
            if (r4 == 0) goto Ldc
            r4.getLocationOnScreen(r7)     // Catch: java.lang.Throwable -> Ldc
        Ldc:
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r14 == 0) goto Lf5
            float r8 = r14.getRawX()
            java.lang.Float r9 = java.lang.Float.valueOf(r8)
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 > 0) goto Lf2
            goto Lf3
        Lf2:
            r9 = r0
        Lf3:
            if (r9 != 0) goto L107
        Lf5:
            if (r3 == 0) goto L106
            float r8 = r3.f11515
            java.lang.Float r9 = java.lang.Float.valueOf(r8)
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 > 0) goto L106
            goto L107
        L106:
            r9 = r0
        L107:
            if (r14 == 0) goto L11d
            float r8 = r14.getRawY()
            java.lang.Float r10 = java.lang.Float.valueOf(r8)
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 > 0) goto L11a
            goto L11b
        L11a:
            r10 = r0
        L11b:
            if (r10 != 0) goto L12f
        L11d:
            if (r3 == 0) goto L12e
            float r3 = r3.f11516
            java.lang.Float r10 = java.lang.Float.valueOf(r3)
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L12e
            goto L12f
        L12e:
            r10 = r0
        L12f:
            r3 = 0
            if (r9 == 0) goto L13b
            float r4 = r9.floatValue()
            r8 = r7[r12]
            float r8 = (float) r8
            float r4 = r4 - r8
            goto L143
        L13b:
            if (r14 == 0) goto L142
            float r4 = r14.getX()
            goto L143
        L142:
            r4 = r3
        L143:
            float r4 = p000.j81.m2905(r4, r3, r5)
            if (r10 == 0) goto L152
            float r14 = r10.floatValue()
            r7 = r7[r2]
            float r7 = (float) r7
            float r14 = r14 - r7
            goto L15a
        L152:
            if (r14 == 0) goto L159
            float r14 = r14.getY()
            goto L15a
        L159:
            r14 = r3
        L15a:
            float r14 = p000.j81.m2905(r14, r3, r6)
            w90 r3 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            w90 r3 = p000.C0381i2.m2596()
            java.lang.String r3 = p000.C0381i2.m2594(r4, r14, r5, r6, r3)
            java.lang.String r7 = "double_tap"
            java.lang.String r7 = m6499(r3, r7)
            boolean r8 = p000.C0381i2.m2595(r7)
            r9 = 4
            java.lang.String r10 = "FeedGestureHook"
            if (r8 != 0) goto L183
            java.lang.String r13 = "宿主双击放行 area="
            java.lang.String r14 = " source=decor action="
            java.lang.String r13 = p000.a12.m18(r13, r3, r14, r7)
            p000.C0888ux.m5988(r10, r13, r0, r9, r0)
            goto L1b1
        L183:
            int r12 = (int) r4
            int r14 = (int) r14
            int r4 = (int) r5
            int r5 = (int) r6
            java.lang.String r6 = " source=decor pos=("
            java.lang.String r8 = ","
            java.lang.String r11 = "拦截宿主双击点赞 area="
            java.lang.StringBuilder r12 = p000.AbstractC0602nx.m4135(r12, r11, r3, r6, r8)
            java.lang.String r3 = ") size="
            java.lang.String r6 = "x"
            p000.AbstractC0602nx.m4117(r12, r14, r3, r4, r6)
            r12.append(r5)
            java.lang.String r14 = " action="
            r12.append(r14)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            p000.C0888ux.m5988(r10, r12, r0, r9, r0)
            m6491(r1)
            m6493(r13, r7)
            r12 = r2
        L1b1:
            return r12
    }

    @Override // p000.d30
    /* JADX INFO: renamed from: γ */
    public final boolean mo1647(android.app.Activity r12, android.view.MotionEvent r13) {
            r11 = this;
            m6492(r12)
            v10 r11 = m6496(r12)
            android.view.Window r0 = r12.getWindow()
            r1 = 0
            if (r0 == 0) goto L13
            android.view.View r0 = r0.getDecorView()
            goto L14
        L13:
            r0 = r1
        L14:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L1b
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L1c
        L1b:
            r0 = r1
        L1c:
            r2 = 0
            if (r0 != 0) goto L20
            goto L2c
        L20:
            java.lang.String r3 = "dyhelper_gesture_position_preview"
            android.view.View r0 = r0.findViewWithTag(r3)
            if (r0 == 0) goto L2c
            m6491(r11)
            return r2
        L2c:
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L36
            m6491(r11)
            return r2
        L36:
            java.lang.String r0 = "gesture_enabled"
            boolean r0 = p000.ui1.m5887(r0, r2)
            if (r0 != 0) goto L42
            m6491(r11)
            return r2
        L42:
            int r0 = r13.getActionMasked()
            r3 = 5
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L53
            if (r0 == r5) goto L53
            if (r0 == r4) goto L53
            if (r0 == r3) goto L53
            r0 = r2
            goto L54
        L53:
            r0 = r5
        L54:
            boolean r0 = m6497(r12, r11, r0)
            if (r0 != 0) goto L5e
            m6491(r11)
            return r2
        L5e:
            int r0 = r13.getActionMasked()
            if (r0 == 0) goto Lca
            if (r0 == r5) goto Lb7
            r1 = 2
            if (r0 == r1) goto L85
            if (r0 == r4) goto L7f
            if (r0 == r3) goto L70
            boolean r11 = r11.f11059
            return r11
        L70:
            boolean r12 = r11.f11052
            if (r12 == 0) goto L1b3
            boolean r12 = r11.f11059
            if (r12 == 0) goto L79
            goto L8d
        L79:
            r11.f11058 = r5
            m6490(r11)
            return r2
        L7f:
            boolean r12 = r11.f11059
            m6491(r11)
            return r12
        L85:
            boolean r0 = r11.f11052
            if (r0 == 0) goto L1b3
            boolean r0 = r11.f11059
            if (r0 == 0) goto L8e
        L8d:
            return r5
        L8e:
            float r0 = r11.f11053
            float r1 = r11.f11054
            android.view.ViewConfiguration r12 = android.view.ViewConfiguration.get(r12)     // Catch: java.lang.Throwable -> L9b
            int r12 = r12.getScaledTouchSlop()     // Catch: java.lang.Throwable -> L9b
            goto L9d
        L9b:
            r12 = 16
        L9d:
            float r3 = r13.getX()
            float r3 = r3 - r0
            float r13 = r13.getY()
            float r13 = r13 - r1
            float r3 = r3 * r3
            float r13 = r13 * r13
            float r13 = r13 + r3
            int r12 = r12 * r12
            float r12 = (float) r12
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 <= 0) goto L1b3
            r11.f11058 = r5
            m6490(r11)
            goto L1b3
        Lb7:
            boolean r12 = r11.f11052
            if (r12 == 0) goto L1b3
            m6490(r11)
            boolean r12 = r11.f11059
            if (r12 == 0) goto Lc6
            m6491(r11)
            return r5
        Lc6:
            m6491(r11)
            return r2
        Lca:
            android.view.Window r0 = r12.getWindow()
            if (r0 == 0) goto Ld5
            android.view.View r0 = r0.getDecorView()
            goto Ld6
        Ld5:
            r0 = r1
        Ld6:
            if (r0 == 0) goto Lec
            int r3 = r0.getWidth()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r3 <= 0) goto Le3
            goto Le4
        Le3:
            r4 = r1
        Le4:
            if (r4 == 0) goto Lec
            int r3 = r4.intValue()
        Lea:
            float r3 = (float) r3
            goto Lf7
        Lec:
            android.content.res.Resources r3 = r12.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.widthPixels
            goto Lea
        Lf7:
            if (r0 == 0) goto L10d
            int r0 = r0.getHeight()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L104
            goto L105
        L104:
            r4 = r1
        L105:
            if (r4 == 0) goto L10d
            int r0 = r4.intValue()
        L10b:
            float r0 = (float) r0
            goto L118
        L10d:
            android.content.res.Resources r0 = r12.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            goto L10b
        L118:
            w90 r4 = com.example.dyhelper.p002ui.GestureAreaView.f2522
            float r4 = r13.getX()
            float r6 = r13.getY()
            w90 r7 = p000.C0381i2.m2596()
            java.lang.String r0 = p000.C0381i2.m2594(r4, r6, r3, r0, r7)
            java.lang.String r3 = "long_press"
            java.lang.String r3 = m6499(r0, r3)
            java.lang.String r4 = "double_tap"
            java.lang.String r4 = m6499(r0, r4)
            boolean r6 = p000.C0381i2.m2595(r3)
            boolean r7 = p000.C0381i2.m2595(r4)
            java.lang.String r8 = " long="
            java.lang.String r9 = " ownsLong="
            java.lang.String r10 = "DOWN area="
            java.lang.StringBuilder r8 = p000.lz1.m3695(r10, r0, r8, r3, r9)
            r8.append(r6)
            java.lang.String r9 = " double="
            r8.append(r9)
            r8.append(r4)
            java.lang.String r4 = " ownsDouble="
            r8.append(r4)
            r8.append(r7)
            java.lang.String r4 = r8.toString()
            r8 = 4
            java.lang.String r9 = "FeedGestureHook"
            p000.C0888ux.m5988(r9, r4, r1, r8, r1)
            m6491(r11)
            if (r6 != 0) goto L16d
            if (r7 != 0) goto L16d
            goto L1b3
        L16d:
            r11.f11052 = r5
            float r1 = r13.getX()
            r11.f11053 = r1
            float r1 = r13.getY()
            r11.f11054 = r1
            long r4 = r13.getEventTime()
            r11.f11055 = r4
            if (r0 != 0) goto L185
            java.lang.String r0 = ""
        L185:
            r11.f11056 = r0
            r11.f11057 = r3
            r11.f11058 = r2
            r11.f11059 = r2
            if (r6 == 0) goto L1b3
            android.view.Window r13 = r12.getWindow()
            if (r13 == 0) goto L1b3
            android.view.View r13 = r13.getDecorView()
            if (r13 != 0) goto L19c
            goto L1b3
        L19c:
            um1 r0 = new um1
            r0.<init>()
            e9 r1 = new e9
            r3 = 12
            r1.<init>(r11, r0, r12, r3)
            r0.f10912 = r1
            r11.f11060 = r13
            r11.f11061 = r1
            long r11 = p000.x10.f11973
            r13.postDelayed(r1, r11)
        L1b3:
            return r2
    }

    /* JADX INFO: renamed from: λ */
    public final void m6502(java.lang.ClassLoader r13) {
            r12 = this;
            java.lang.String r0 = "Feed 手势 Hook 安装失败: "
            java.lang.String r1 = "PublishGestureLauncher Hook 失败: "
            r13.getClass()
            p000.x10.f11976 = r13
            r2 = 4
            r3 = 0
            q10 r4 = p000.q10.f8786     // Catch: java.lang.Throwable -> L11
            r4.m4708(r13)     // Catch: java.lang.Throwable -> L11
            goto L21
        L11:
            r4 = move-exception
            java.lang.String r5 = "FeedGestureHook"
            java.lang.String r4 = r4.getMessage()
            java.lang.String r6 = "Feed 原生互动动作桥安装失败: "
            java.lang.String r4 = p000.lz1.m3687(r6, r4)
            p000.C0888ux.m5988(r5, r4, r3, r2, r3)
        L21:
            boolean r4 = p000.x10.f11975
            r5 = 1
            if (r4 != 0) goto L47
            boolean r4 = p000.ui1.m5867()
            if (r4 != 0) goto L2d
            goto L47
        L2d:
            monitor-enter(r12)
            boolean r4 = p000.x10.f11975     // Catch: java.lang.Throwable -> L44
            if (r4 == 0) goto L34
            monitor-exit(r12)
            goto L47
        L34:
            bb r4 = new bb     // Catch: java.lang.Throwable -> L44
            r6 = 25
            r4.<init>(r13, r6)     // Catch: java.lang.Throwable -> L44
            java.util.concurrent.CopyOnWriteArrayList r6 = p000.ui1.f10853     // Catch: java.lang.Throwable -> L44
            r6.add(r4)     // Catch: java.lang.Throwable -> L44
            p000.x10.f11975 = r5     // Catch: java.lang.Throwable -> L44
            monitor-exit(r12)
            goto L47
        L44:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        L47:
            m6501(r13)
            boolean r4 = m6498()
            if (r4 != 0) goto L58
            java.lang.String r12 = "FeedGestureHook"
            java.lang.String r13 = "手势关闭，跳过高频 Hook 安装"
            p000.C0888ux.m5988(r12, r13, r3, r2, r3)
            return
        L58:
            l82 r4 = p000.l82.f6483     // Catch: java.lang.Throwable -> L5e
            r4.m3539(r13)     // Catch: java.lang.Throwable -> L5e
            goto L6e
        L5e:
            r4 = move-exception
            java.lang.String r6 = "FeedGestureHook"
            java.lang.String r4 = r4.getMessage()
            java.lang.String r7 = "Feed 倍速播放器边界安装失败，保留按需解析降级: "
            java.lang.String r4 = p000.lz1.m3687(r7, r4)
            p000.C0888ux.m5988(r6, r4, r3, r2, r3)
        L6e:
            x00 r4 = p000.x00.f11959     // Catch: java.lang.Throwable -> L74
            r4.m6471(r13)     // Catch: java.lang.Throwable -> L74
            goto L84
        L74:
            r4 = move-exception
            java.lang.String r6 = "FeedGestureHook"
            java.lang.String r4 = r4.getMessage()
            java.lang.String r7 = "当前作品选中态 Hook 安装失败，保留 View 扫描降级: "
            java.lang.String r4 = p000.lz1.m3687(r7, r4)
            p000.C0888ux.m5988(r6, r4, r3, r2, r3)
        L84:
            boolean r4 = p000.x10.f11974
            if (r4 == 0) goto L89
            return
        L89:
            monitor-enter(r12)
            boolean r4 = p000.x10.f11974     // Catch: java.lang.Throwable -> L10b
            if (r4 == 0) goto L90
            monitor-exit(r12)
            return
        L90:
            dk1 r4 = p000.dk1.f3201     // Catch: java.lang.Throwable -> L96
            r4.m1772(r13)     // Catch: java.lang.Throwable -> L96
            goto Lac
        L96:
            r4 = move-exception
            java.lang.String r6 = "FeedGestureHook"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> Lf3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf3
            r7.<init>(r1)     // Catch: java.lang.Throwable -> Lf3
            r7.append(r4)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> Lf3
            p000.C0888ux.m5988(r6, r1, r3, r2, r3)     // Catch: java.lang.Throwable -> Lf3
        Lac:
            x10 r1 = p000.x10.f11972     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r4 = "FeedGestureHook"
            java.lang.Object r6 = p000.qe0.f8982     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r6 = "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F03474AEFAA0D9A94E4C21F0622A378CF61B87F8A576C81A592CCB282165A7"
            java.lang.String r6 = p000.jf0.m2957(r6)     // Catch: java.lang.Throwable -> Lf3
            java.lang.Class r6 = p000.qe0.m4877(r13, r6)     // Catch: java.lang.Throwable -> Lf3
            if (r6 != 0) goto Lc4
            java.lang.String r6 = "r1407920ef6e35873"
            p000.C0888ux.m5988(r4, r6, r3, r2, r3)     // Catch: java.lang.Throwable -> Lf3
            goto Ld9
        Lc4:
            xq0 r7 = p000.xq0.f12253     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r8 = "dispatchTouchEvent"
            f10 r9 = new f10     // Catch: java.lang.Throwable -> Lf3
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 2
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> Lf3
            r7.m6774(r6, r8, r9)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r6 = "宿主 Feed RootView 触摸落点记录 Hook 已安装"
            p000.C0888ux.m5988(r4, r6, r3, r2, r3)     // Catch: java.lang.Throwable -> Lf3
        Ld9:
            e30 r4 = p000.e30.f3390     // Catch: java.lang.Throwable -> Lf3
            r4.m1839(r13)     // Catch: java.lang.Throwable -> Lf3
            java.util.concurrent.CopyOnWriteArrayList r13 = p000.e30.f3392     // Catch: java.lang.Throwable -> Lf3
            boolean r4 = r13.contains(r1)     // Catch: java.lang.Throwable -> Lf3
            if (r4 != 0) goto Le9
            r13.add(r1)     // Catch: java.lang.Throwable -> Lf3
        Le9:
            p000.x10.f11974 = r5     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r13 = "FeedGestureHook"
            java.lang.String r1 = "Feed 手势 Hook 已注册到统一触摸分发器"
            p000.C0888ux.m5988(r13, r1, r3, r2, r3)     // Catch: java.lang.Throwable -> Lf3
            goto L109
        Lf3:
            r13 = move-exception
            java.lang.String r1 = "FeedGestureHook"
            java.lang.String r13 = r13.getMessage()     // Catch: java.lang.Throwable -> L10b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10b
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L10b
            r4.append(r13)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r13 = r4.toString()     // Catch: java.lang.Throwable -> L10b
            p000.C0888ux.m5988(r1, r13, r3, r2, r3)     // Catch: java.lang.Throwable -> L10b
        L109:
            monitor-exit(r12)
            return
        L10b:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
    }
}
