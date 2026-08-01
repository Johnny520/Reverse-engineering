package p000;

/* JADX INFO: renamed from: yw */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1036yw {

    /* JADX INFO: renamed from: α */
    public static final android.os.Handler f12843 = null;

    /* JADX INFO: renamed from: β */
    public static volatile long f12844;

    /* JADX INFO: renamed from: γ */
    public static volatile long f12845;

    /* JADX INFO: renamed from: δ */
    public static volatile long f12846;

    /* JADX INFO: renamed from: ε */
    public static volatile boolean f12847;

    /* JADX INFO: renamed from: ζ */
    public static volatile int f12848;

    /* JADX INFO: renamed from: η */
    public static volatile int f12849;

    /* JADX INFO: renamed from: θ */
    public static volatile long f12850;

    /* JADX INFO: renamed from: ι */
    public static volatile boolean f12851;

    /* JADX INFO: renamed from: κ */
    public static volatile int f12852;

    /* JADX INFO: renamed from: λ */
    public static p000.RunnableC1149 f12853;

    /* JADX INFO: renamed from: μ */
    public static p000.RunnableC0196d1 f12854;

    /* JADX INFO: renamed from: ν */
    public static p000.C0999xw f12855;

    /* JADX INFO: renamed from: ξ */
    public static long f12856;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.C1036yw.f12843 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m7032(android.app.Activity r6, p000.C0999xw r7) {
            long r0 = p000.C1036yw.f12845
            boolean r2 = p000.C1036yw.f12847
            if (r2 == 0) goto L16
            long r2 = p000.C1036yw.f12846
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L16
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = p000.C1036yw.f12846
            long r2 = r2 - r4
            long r0 = r0 + r2
        L16:
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 / r2
            int r0 = (int) r0
            int r1 = r7.f12331
            if (r0 >= r1) goto L20
            goto L2b
        L20:
            boolean r2 = r7.f12332
            if (r2 == 0) goto L27
            int r2 = r0 / r1
            int r1 = r1 * r2
        L27:
            int r2 = p000.C1036yw.f12848
            if (r1 > r2) goto L2c
        L2b:
            return
        L2c:
            p000.C1036yw.f12848 = r1
            int r1 = p000.C1036yw.f12849
            r2 = 1
            int r1 = r1 + r2
            p000.C1036yw.f12849 = r1
            java.lang.String r1 = r7.f12334
            java.lang.String r3 = "%d"
            r4 = 0
            boolean r3 = p000.q02.m4654(r1, r3, r4)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L58
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L50
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> L50
            goto L58
        L50:
            java.lang.String r1 = "你已经刷了 "
            java.lang.String r2 = " 分钟了，休息一下吧~"
            java.lang.String r1 = p000.AbstractC0602nx.m4127(r1, r0, r2)
        L58:
            int r2 = p000.C1036yw.f12849
            java.lang.String r3 = " 分钟（第 "
            java.lang.String r4 = " 次）"
            java.lang.String r5 = "时长提醒 - 已观看 "
            java.lang.String r2 = p000.AbstractC0602nx.m4128(r5, r0, r3, r2, r4)
            r3 = 4
            java.lang.String r4 = "DYHelper:DurationAlert"
            r5 = 0
            p000.C0888ux.m5988(r4, r2, r5, r3, r5)
            android.os.Handler r2 = p000.C1036yw.f12843
            vw r3 = new vw
            r3.<init>(r6, r1, r0, r7)
            r2.post(r3)
            return
    }

    /* JADX INFO: renamed from: β */
    public static final void m7033(android.app.Activity r9, p000.C0999xw r10) {
            long r0 = p000.C1036yw.f12850
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L9
            goto L74
        L9:
            boolean r0 = p000.C1036yw.f12851
            if (r0 == 0) goto Le
            goto L74
        Le:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = p000.C1036yw.f12850
            long r0 = r0 - r2
            int r2 = r10.f12336
            long r3 = (long) r2
            r5 = 60000(0xea60, double:2.9644E-319)
            long r3 = r3 * r5
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r6 = 4
            java.lang.String r7 = "DYHelper:DurationAlert"
            r8 = 0
            if (r5 < 0) goto L3f
            java.lang.String r0 = " 空闲超时（"
            java.lang.String r1 = "min），直接退出"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r0, r2, r1)
            p000.C0888ux.m5988(r7, r0, r8, r6, r8)
            m7039()
            android.os.Handler r0 = p000.C1036yw.f12843
            w1 r1 = new w1
            r2 = 12
            r1.<init>(r9, r2, r10)
            r0.post(r1)
            return
        L3f:
            boolean r2 = r10.f12338
            if (r2 == 0) goto L74
            long r3 = r3 - r0
            r0 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L74
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            int r0 = (int) r3
            r1 = 1
            if (r0 >= r1) goto L52
            r0 = r1
        L52:
            java.lang.String r2 = "空闲倒计时开始，剩余 "
            java.lang.String r3 = "s"
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r2, r0, r3)
            p000.C0888ux.m5988(r7, r2, r8, r6, r8)
            boolean r2 = p000.C1036yw.f12851
            if (r2 == 0) goto L62
            goto L74
        L62:
            p000.C1036yw.f12851 = r1
            p000.C1036yw.f12852 = r0
            ｓ r0 = new ｓ
            r1 = 2
            r2 = 0
            r0.<init>(r1, r9, r10, r2)
            p000.C1036yw.f12853 = r0
            android.os.Handler r9 = p000.C1036yw.f12843
            r9.post(r0)
        L74:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static final boolean m7034(android.app.Activity r2) {
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"
            java.lang.String r0 = p000.jf0.m2957(r0)
            r1 = 0
            boolean r2 = p000.q02.m4654(r2, r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public static final p000.C0999xw m7035() {
            long r0 = java.lang.System.currentTimeMillis()
            xw r2 = p000.C1036yw.f12855
            if (r2 == 0) goto L13
            long r3 = p000.C1036yw.f12856
            long r3 = r0 - r3
            r5 = 5000(0x1388, double:2.4703E-320)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L13
            return r2
        L13:
            boolean r2 = p000.ui1.m5867()
            r3 = 4
            java.lang.String r4 = "DYHelper:DurationAlert"
            r5 = 0
            if (r2 != 0) goto L34
            java.lang.String r0 = "[配置] PrefsManager 未初始化，使用默认值"
            p000.C0888ux.m5988(r4, r0, r5, r3, r5)
            xw r6 = new xw
            r14 = 0
            r15 = 0
            r7 = 0
            r8 = 30
            r9 = 1
            r10 = 1
            java.lang.String r11 = "你已经刷了 %d 分钟了,休息一下吧~"
            r12 = 0
            r13 = 30
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r6
        L34:
            java.lang.String r2 = "idle_auto_exit_enabled"
            r6 = 0
            boolean r2 = p000.ui1.m5887(r2, r6)
            boolean r7 = p000.AbstractC0976x9.m6538()
            r8 = 1
            if (r7 == 0) goto L4a
            boolean r7 = com.example.dyhelper.beta.BetaNativeBridge.m1286()
            if (r7 == 0) goto L4a
            r7 = r8
            goto L4b
        L4a:
            r7 = r6
        L4b:
            if (r2 == 0) goto L56
            if (r7 != 0) goto L56
            java.lang.String r2 = "[内测拦截] 检测到开启了空闲退出，但未通过内测验证，已强制关闭该功能"
            p000.C0888ux.m5988(r4, r2, r5, r3, r5)
            r15 = r6
            goto L57
        L56:
            r15 = r2
        L57:
            java.lang.String r2 = "duration_alert_enabled"
            boolean r10 = p000.ui1.m5887(r2, r6)
            java.lang.String r2 = "duration_alert_minutes"
            r7 = 30
            android.content.SharedPreferences r9 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L6a
            int r2 = r9.getInt(r2, r7)     // Catch: java.lang.Throwable -> L6a
            goto L6b
        L6a:
            r2 = r7
        L6b:
            r9 = 180(0xb4, float:2.52E-43)
            int r11 = p000.j81.m2906(r2, r8, r9)
            java.lang.String r2 = "duration_alert_repeat"
            boolean r12 = p000.ui1.m5887(r2, r8)
            java.lang.String r2 = "duration_alert_vibrate"
            boolean r13 = p000.ui1.m5887(r2, r8)
            java.lang.String r2 = "duration_alert_message"
            java.lang.String r9 = "你已经刷了 %d 分钟了,休息一下吧~"
            java.lang.String r2 = p000.ui1.m5893(r2, r9)
            int r14 = r2.length()
            if (r14 != 0) goto L8d
            r14 = r9
            goto L8e
        L8d:
            r14 = r2
        L8e:
            java.lang.String r2 = "idle_auto_exit_minutes"
            android.content.SharedPreferences r9 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L98
            int r7 = r9.getInt(r2, r7)     // Catch: java.lang.Throwable -> L98
        L98:
            r2 = 60
            int r16 = p000.j81.m2906(r7, r8, r2)
            java.lang.String r2 = "idle_exit_lock_screen"
            boolean r17 = p000.ui1.m5887(r2, r6)
            java.lang.String r2 = "idle_exit_show_countdown"
            boolean r18 = p000.ui1.m5887(r2, r6)
            xw r9 = new xw
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = r16
            r6 = r17
            r7 = r18
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r14 = "[配置刷新] 时长提醒="
            r8.<init>(r14)
            r8.append(r10)
            java.lang.String r10 = "("
            r8.append(r10)
            r8.append(r11)
            java.lang.String r11 = "min,repeat="
            r8.append(r11)
            java.lang.String r11 = ",vib="
            java.lang.String r14 = ") | 空闲退出="
            p000.AbstractC0602nx.m4120(r8, r12, r11, r13, r14)
            r8.append(r15)
            r8.append(r10)
            r8.append(r2)
            java.lang.String r2 = "min,lock="
            r8.append(r2)
            r8.append(r6)
            java.lang.String r2 = ",countdown="
            r8.append(r2)
            r8.append(r7)
            java.lang.String r2 = ")"
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            p000.C0888ux.m5988(r4, r2, r5, r3, r5)
            p000.C1036yw.f12855 = r9
            p000.C1036yw.f12856 = r0
            return r9
    }

    /* JADX INFO: renamed from: ε */
    public static void m7036() {
            r0 = 0
            p000.C1036yw.f12851 = r0
            p000.C1036yw.f12852 = r0
            ｓ r0 = p000.C1036yw.f12853
            if (r0 == 0) goto Le
            android.os.Handler r1 = p000.C1036yw.f12843
            r1.removeCallbacks(r0)
        Le:
            r0 = 0
            p000.C1036yw.f12853 = r0
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static void m7037(android.app.Activity r7, p000.C0999xw r8) {
            java.lang.String r0 = "DYHelper:DurationAlert"
            java.lang.String r1 = "空闲退出完成（锁屏="
            r2 = 4
            r3 = 0
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = "android.intent.action.MAIN"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L25
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r4.setFlags(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = "android.intent.category.HOME"
            r4.addCategory(r5)     // Catch: java.lang.Throwable -> L25
            r7.startActivity(r4)     // Catch: java.lang.Throwable -> L25
            r7.finishAndRemoveTask()     // Catch: java.lang.Throwable -> L25
            boolean r4 = r8.f12337     // Catch: java.lang.Throwable -> L25
            if (r4 == 0) goto L27
            m7038(r7)     // Catch: java.lang.Throwable -> L25
            goto L2c
        L25:
            r8 = move-exception
            goto L5a
        L27:
            java.lang.String r4 = "锁屏已关闭，仅退出"
            p000.C0888ux.m5988(r0, r4, r3, r2, r3)     // Catch: java.lang.Throwable -> L25
        L2c:
            r4 = 0
            p000.C1036yw.f12844 = r4     // Catch: java.lang.Throwable -> L25
            p000.C1036yw.f12845 = r4     // Catch: java.lang.Throwable -> L25
            p000.C1036yw.f12846 = r4     // Catch: java.lang.Throwable -> L25
            r6 = 0
            p000.C1036yw.f12848 = r6     // Catch: java.lang.Throwable -> L25
            p000.C1036yw.f12849 = r6     // Catch: java.lang.Throwable -> L25
            p000.C1036yw.f12850 = r4     // Catch: java.lang.Throwable -> L25
            p000.C1036yw.f12847 = r6     // Catch: java.lang.Throwable -> L25
            m7036()     // Catch: java.lang.Throwable -> L25
            m7039()     // Catch: java.lang.Throwable -> L25
            boolean r8 = r8.f12337     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L25
            r4.append(r8)     // Catch: java.lang.Throwable -> L25
            java.lang.String r8 = "）"
            r4.append(r8)     // Catch: java.lang.Throwable -> L25
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L25
            p000.C0888ux.m5988(r0, r8, r3, r2, r3)     // Catch: java.lang.Throwable -> L25
            return
        L5a:
            java.lang.String r8 = r8.getMessage()
            java.lang.String r1 = "退出异常: "
            java.lang.String r8 = p000.lz1.m3687(r1, r8)
            p000.C0888ux.m5988(r0, r8, r3, r2, r3)
            r7.finish()     // Catch: java.lang.Throwable -> L6a
        L6a:
            return
    }

    /* JADX INFO: renamed from: η */
    public static void m7038(android.app.Activity r7) {
            java.lang.String r0 = "DYHelper:DurationAlert"
            r1 = 4
            r2 = 0
            java.lang.String r3 = "power"
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = "goToSleep"
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L2e
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch: java.lang.Throwable -> L2e
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L30
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L2e
            r4.invoke(r3, r5)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r3 = move-exception
            goto L36
        L30:
            java.lang.String r3 = "goToSleep 锁屏成功"
            p000.C0888ux.m5988(r0, r3, r2, r1, r2)     // Catch: java.lang.Throwable -> L2e
            return
        L36:
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "goToSleep 失败: "
            java.lang.String r3 = p000.lz1.m3687(r4, r3)
            p000.C0888ux.m5988(r0, r3, r2, r1, r2)
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = "su"
            java.lang.String r5 = "-c"
            java.lang.String r6 = "input keyevent 26"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}     // Catch: java.lang.Throwable -> L5a
            r3.exec(r4)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = "Root 锁屏指令已发送"
            p000.C0888ux.m5988(r0, r3, r2, r1, r2)     // Catch: java.lang.Throwable -> L5a
            goto L77
        L5a:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "Root 锁屏失败: "
            java.lang.String r3 = p000.lz1.m3687(r4, r3)
            p000.C0888ux.m5988(r0, r3, r2, r1, r2)
            java.lang.String r3 = "所有锁屏方案均失败，仅退出"
            p000.C0888ux.m5988(r0, r3, r2, r1, r2)
            java.lang.String r0 = "已退出，无法自动锁屏（需要 Root）"
            r1 = 1
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r0, r1)     // Catch: java.lang.Throwable -> L77
            r7.show()     // Catch: java.lang.Throwable -> L77
        L77:
            return
    }

    /* JADX INFO: renamed from: θ */
    public static void m7039() {
            d1 r0 = p000.C1036yw.f12854
            if (r0 == 0) goto L9
            android.os.Handler r1 = p000.C1036yw.f12843
            r1.removeCallbacks(r0)
        L9:
            r0 = 0
            p000.C1036yw.f12854 = r0
            return
    }
}
