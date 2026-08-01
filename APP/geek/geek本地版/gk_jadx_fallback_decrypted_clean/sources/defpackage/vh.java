package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class vh implements defpackage.fe, defpackage.cv {
    public static final /* synthetic */ defpackage.vh b = null;
    public static final /* synthetic */ defpackage.vh c = null;
    public static float d = -1.0f;
    public static float e;
    public static float f;
    public static float g;
    public static final /* synthetic */ defpackage.vh h = null;
    public static final defpackage.vh i = null;
    public static final defpackage.vh j = null;
    public static android.hardware.SensorManager k;
    public static final defpackage.m80 l = null;
    public static final defpackage.vh m = null;
    public static final defpackage.vh n = null;
    public static final defpackage.vh o = null;
    public static final defpackage.vh p = null;
    public final /* synthetic */ int a;

    static {
            vh r0 = new vh
            r1 = 1
            r0.<init>(r1)
            defpackage.vh.b = r0
            vh r0 = new vh
            r1 = 2
            r0.<init>(r1)
            defpackage.vh.c = r0
            vh r0 = new vh
            r1 = 4
            r0.<init>(r1)
            defpackage.vh.h = r0
            vh r0 = new vh
            r1 = 5
            r0.<init>(r1)
            defpackage.vh.i = r0
            vh r0 = new vh
            r1 = 7
            r0.<init>(r1)
            defpackage.vh.j = r0
            m80 r0 = new m80
            r0.<init>()
            defpackage.vh.l = r0
            vh r0 = new vh
            r1 = 9
            r0.<init>(r1)
            defpackage.vh.m = r0
            vh r0 = new vh
            r1 = 10
            r0.<init>(r1)
            defpackage.vh.n = r0
            vh r0 = new vh
            r1 = 11
            r0.<init>(r1)
            defpackage.vh.o = r0
            vh r0 = new vh
            r1 = 12
            r0.<init>(r1)
            defpackage.vh.p = r0
            return
    }

    public /* synthetic */ vh(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public vh(defpackage.yl r1) {
            r0 = this;
            r1 = 23
            r0.a = r1
            r0.<init>()
            return
    }

    public static final void b(android.view.ViewGroup r18, defpackage.e9 r19, defpackage.g9 r20, android.view.MotionEvent r21, defpackage.f9 r22, de.robv.android.xposed.XC_MethodHook.MethodHookParam r23, boolean r24) {
            r1 = r18
            r2 = r20
            r0 = r22
            java.lang.Object r3 = r0.a
            r4 = 2114191365(0x7e040005, float:4.386455E37)
            java.lang.Object r5 = r1.getTag(r4)
            boolean r6 = r5 instanceof android.view.VelocityTracker
            r7 = 0
            if (r6 == 0) goto L17
            android.view.VelocityTracker r5 = (android.view.VelocityTracker) r5
            goto L18
        L17:
            r5 = r7
        L18:
            r6 = r21
            if (r5 == 0) goto L1f
            r5.addMovement(r6)
        L1f:
            if (r5 == 0) goto L26
            r8 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r8)
        L26:
            if (r5 == 0) goto L2d
            float r9 = r5.getXVelocity()
            goto L2e
        L2d:
            r9 = 0
        L2e:
            r10 = 1159479296(0x451c4000, float:2500.0)
            float r9 = java.lang.Math.min(r10, r9)
            r10 = -988004352(0xffffffffc51c4000, float:-2500.0)
            float r9 = java.lang.Math.max(r10, r9)
            if (r5 == 0) goto L41
            r5.recycle()
        L41:
            r1.setTag(r4, r7)
            boolean r4 = r2.c
            if (r4 == 0) goto L592
            float r4 = r6.getRawX()
            float r6 = r2.a
            float r4 = r4 - r6
            boolean r6 = r2.d
            r13 = 1
            if (r6 != 0) goto L3e0
            if (r24 != 0) goto L3e0
            float r6 = defpackage.vh.f
            float r14 = -r6
            int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            java.lang.String r15 = "Nwje\n"
            java.lang.String r5 = "Q2m5jaPP2Zc=\n"
            java.lang.String r8 = "Fg==\n"
            r21 = 0
            java.lang.String r12 = "c8HJlSTQVfc=\n"
            if (r14 >= 0) goto L1ee
            r2.d = r13
            android.content.Context r0 = r1.getContext()
            android.view.View r4 = r1.getRootView()
            java.lang.String r6 = "teC9MYNzUg==\n"
            java.lang.String r14 = "2JPaeO0VPTc=\n"
            java.lang.String r6 = "msgInfo"
            defpackage.ip.o(r6, r3)
            boolean r6 = r0 instanceof android.app.Activity
            if (r6 == 0) goto L84
            android.app.Activity r0 = (android.app.Activity) r0
            r6 = r0
            goto L85
        L84:
            r6 = r7
        L85:
            if (r6 != 0) goto L89
            goto L3e0
        L89:
            if (r4 != 0) goto L8d
            goto L3e0
        L8d:
            java.lang.String r14 = defpackage.pb0.j0
            int r0 = r14.length()
            if (r0 != 0) goto L97
            goto L3e0
        L97:
            i00 r0 = new i00     // Catch: java.lang.Throwable -> Lb5
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5
            defpackage.gt.G(r0, r4)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r4 = r0.b     // Catch: java.lang.Throwable -> Lb5
            if (r4 != 0) goto Lb8
            gn r0 = defpackage.gn.a     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r3 = "9MViuAr3BC2ipGLPV/9EQ7PK\n"
            java.lang.String r4 = "EkzcXLJ64aU=\n"
            java.lang.String r3 = "\u627e\u4e0d\u5230\u8f93\u5165\u6846"     // Catch: java.lang.Throwable -> Lb5
            r0.getClass()     // Catch: java.lang.Throwable -> Lb5
            defpackage.gn.k(r6, r3)     // Catch: java.lang.Throwable -> Lb5
            goto L3e0
        Lb5:
            r0 = move-exception
            goto L1c7
        Lb8:
            java.lang.String r4 = defpackage.pb0.o     // Catch: java.lang.Throwable -> L111
            java.lang.ClassLoader r10 = defpackage.d9.a     // Catch: java.lang.Throwable -> L111
            java.lang.Class r4 = de.robv.android.xposed.XposedHelpers.findClassIfExists(r4, r10)     // Catch: java.lang.Throwable -> L111
            if (r4 == 0) goto L3e0
            java.lang.Object r10 = r0.b     // Catch: java.lang.Throwable -> L111
            defpackage.ip.l(r10)     // Catch: java.lang.Throwable -> L111
            java.lang.Class r10 = r10.getClass()     // Catch: java.lang.Throwable -> L111
            java.lang.reflect.Method[] r10 = r10.getMethods()     // Catch: java.lang.Throwable -> L111
            java.lang.String r7 = "0EI0LiMiE0zTVGhNaHhS\n"
            java.lang.String r11 = "tydAY0ZWeyM=\n"
            java.lang.String r7 = "getMethods(...)"     // Catch: java.lang.Throwable -> L111
            defpackage.ip.n(r7, r10)     // Catch: java.lang.Throwable -> L111
            int r7 = r10.length     // Catch: java.lang.Throwable -> L111
            r11 = r21
        Ldd:
            if (r11 >= r7) goto L120
            r17 = r10[r11]     // Catch: java.lang.Throwable -> L111
            java.lang.String r13 = r17.getName()     // Catch: java.lang.Throwable -> L111
            boolean r13 = defpackage.ip.i(r13, r14)     // Catch: java.lang.Throwable -> L111
            if (r13 == 0) goto L114
            java.lang.Class[] r13 = r17.getParameterTypes()     // Catch: java.lang.Throwable -> L111
            r22 = r7
            java.lang.String r7 = "zeRpcYpEACfP9XhTv08RL9mpMw/FHw==\n"
            r24 = r10
            java.lang.String r10 = "qoEdIes2YUo=\n"
            java.lang.String r7 = "getParameterTypes(...)"     // Catch: java.lang.Throwable -> L111
            defpackage.ip.n(r7, r13)     // Catch: java.lang.Throwable -> L111
            int r7 = r13.length     // Catch: java.lang.Throwable -> L111
            if (r7 != 0) goto L102
            goto L118
        L102:
            java.lang.Class[] r7 = r17.getParameterTypes()     // Catch: java.lang.Throwable -> L111
            r7 = r7[r21]     // Catch: java.lang.Throwable -> L111
            boolean r7 = defpackage.ip.i(r7, r4)     // Catch: java.lang.Throwable -> L111
            if (r7 == 0) goto L118
            r4 = r17
            goto L121
        L111:
            r0 = move-exception
            goto L18d
        L114:
            r22 = r7
            r24 = r10
        L118:
            int r11 = r11 + 1
            r7 = r22
            r10 = r24
            r13 = 1
            goto Ldd
        L120:
            r4 = 0
        L121:
            if (r4 == 0) goto L16d
            r7 = 1
            r4.setAccessible(r7)     // Catch: java.lang.Throwable -> L111
            java.lang.Class[] r10 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L111
            int r10 = r10.length     // Catch: java.lang.Throwable -> L111
            if (r10 != r7) goto L139
            java.lang.Object r0 = r0.b     // Catch: java.lang.Throwable -> L111
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L111
            r4.invoke(r0, r3)     // Catch: java.lang.Throwable -> L111
            goto L3e0
        L139:
            java.lang.Class[] r7 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L111
            int r7 = r7.length     // Catch: java.lang.Throwable -> L111
            r10 = 2
            if (r7 != r10) goto L14d
            java.lang.Object r0 = r0.b     // Catch: java.lang.Throwable -> L111
            r7 = 0
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r7}     // Catch: java.lang.Throwable -> L111
            r4.invoke(r0, r3)     // Catch: java.lang.Throwable -> L111
            goto L3e0
        L14d:
            gn r0 = defpackage.gn.a     // Catch: java.lang.Throwable -> L111
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L111
            r3.<init>()     // Catch: java.lang.Throwable -> L111
            java.lang.String r4 = "引用异常: 方法 ["
            r3.append(r4)     // Catch: java.lang.Throwable -> L111
            r3.append(r14)     // Catch: java.lang.Throwable -> L111
            java.lang.String r4 = "] 参数数量异常"
            r3.append(r4)     // Catch: java.lang.Throwable -> L111
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L111
            r0.getClass()     // Catch: java.lang.Throwable -> L111
            defpackage.gn.k(r6, r3)     // Catch: java.lang.Throwable -> L111
            goto L3e0
        L16d:
            gn r0 = defpackage.gn.a     // Catch: java.lang.Throwable -> L111
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L111
            r3.<init>()     // Catch: java.lang.Throwable -> L111
            java.lang.String r4 = "引用执行失败: 找不到名为 ["
            r3.append(r4)     // Catch: java.lang.Throwable -> L111
            r3.append(r14)     // Catch: java.lang.Throwable -> L111
            java.lang.String r4 = "] 且接收消息体的方法"
            r3.append(r4)     // Catch: java.lang.Throwable -> L111
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L111
            r0.getClass()     // Catch: java.lang.Throwable -> L111
            defpackage.gn.k(r6, r3)     // Catch: java.lang.Throwable -> L111
            goto L3e0
        L18d:
            gn r3 = defpackage.gn.a     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> Lb5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            r4.<init>()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r7 = "引用执行崩溃: "
            r4.append(r7)     // Catch: java.lang.Throwable -> Lb5
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lb5
            r3.getClass()     // Catch: java.lang.Throwable -> Lb5
            defpackage.gn.k(r6, r0)     // Catch: java.lang.Throwable -> Lb5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r3 = "QuoteAction_Exec_Failed targetMethod: "
            r0.append(r3)     // Catch: java.lang.Throwable -> Lb5
            r0.append(r14)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r3 = defpackage.u40.a(r15, r5)     // Catch: java.lang.Throwable -> Lb5
            defpackage.ip.o(r3, r0)     // Catch: java.lang.Throwable -> Lb5
            defpackage.u40.a(r8, r12)     // Catch: java.lang.Throwable -> Lb5
            goto L3e0
        L1c7:
            gn r3 = defpackage.gn.a
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "寻找输入框异常: "
            r4.<init>(r7)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.getClass()
            defpackage.gn.k(r6, r0)
            java.lang.String r0 = "ayoZI+6neLRTMBgIzY91pGUZFz7ng38=\n"
            java.lang.String r3 = "Ol92V4vmG8A=\n"
            java.lang.String r0 = "QuoteAction_Find_Failed"
        L1e9:
            defpackage.z30.o(r15, r5, r0, r8, r12)
            goto L3e0
        L1ee:
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L3e0
            r7 = 1
            r2.d = r7
            android.content.Context r4 = r1.getContext()
            int r6 = r0.b
            java.lang.String r7 = r0.c
            java.lang.String r0 = "文本复读中断: "
            java.lang.String r10 = "语音复读中断: "
            java.lang.String r11 = "卡片复读中断: "
            java.lang.String r13 = "0MssZ47jRA==\n"
            java.lang.String r14 = "vbhLLuCFKyc=\n"
            java.lang.String r13 = "msgInfo"
            defpackage.ip.o(r13, r3)
            java.lang.String r13 = "y5AfGhZ6\n"
            java.lang.String r14 = "v/FzcXMI+WM=\n"
            java.lang.String r13 = "talker"
            defpackage.ip.o(r13, r7)
            boolean r13 = r4 instanceof android.app.Activity
            if (r13 == 0) goto L220
            android.app.Activity r4 = (android.app.Activity) r4
            goto L221
        L220:
            r4 = 0
        L221:
            if (r4 != 0) goto L225
            goto L3e0
        L225:
            java.lang.String r13 = ""
            r14 = 1
            if (r6 == r14) goto L33c
            r14 = 3
            if (r6 == r14) goto L32a
            r0 = 34
            if (r6 == r0) goto L2d0
            r0 = 43
            if (r6 == r0) goto L32a
            r0 = 47
            if (r6 == r0) goto L2cb
            r0 = 49
            if (r6 == r0) goto L257
            r0 = 822083633(0x31000031, float:1.862656E-9)
            if (r6 == r0) goto L257
            gn r0 = defpackage.gn.a     // Catch: java.lang.Throwable -> L254
            java.lang.String r3 = "3Z5ZYKf6fAqU4lcF+tMXdpS/PSm7kCsl3ppQYqn/fB+U\n"
            java.lang.String r10 = "OwTbhB93mp4=\n"
            java.lang.String r3 = "\u6682\u4e0d\u652f\u6301\u590d\u8bfb\u6b64\u7c7b\u578b\u6d88\u606f"     // Catch: java.lang.Throwable -> L254
            r0.getClass()     // Catch: java.lang.Throwable -> L254
            defpackage.gn.k(r4, r3)     // Catch: java.lang.Throwable -> L254
            goto L3e0
        L254:
            r0 = move-exception
            goto L3ae
        L257:
            java.lang.reflect.Field r0 = defpackage.in.h     // Catch: java.lang.Throwable -> L254
            if (r0 == 0) goto L260
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L254
            goto L261
        L260:
            r0 = 0
        L261:
            boolean r3 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L254
            if (r3 == 0) goto L268
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L254
            goto L269
        L268:
            r0 = 0
        L269:
            if (r0 != 0) goto L26c
            goto L26d
        L26c:
            r13 = r0
        L26d:
            java.lang.String r0 = "sC73P+uCQmyd\n"
            java.lang.String r3 = "8E2fXp/wLQM=\n"
            java.lang.String r0 = "@chatroom"     // Catch: java.lang.Throwable -> L254
            boolean r0 = defpackage.b50.C(r7, r0)     // Catch: java.lang.Throwable -> L254
            if (r0 == 0) goto L29f
            java.lang.String r0 = "wIMvzPiA8A==\n"
            java.lang.String r3 = "+okToYvnzsA=\n"
            java.lang.String r0 = ":\n<msg>"     // Catch: java.lang.Throwable -> L254
            r3 = r21
            boolean r0 = defpackage.b50.B(r13, r0, r3)     // Catch: java.lang.Throwable -> L254
            if (r0 == 0) goto L29f
            java.lang.String r0 = "Dck=\n"
            java.lang.String r3 = "N8Ngx0zRR6k=\n"
            java.lang.String r0 = ":\n"     // Catch: java.lang.Throwable -> L254
            java.lang.String r0 = defpackage.b50.O(r13, r0)     // Catch: java.lang.Throwable -> L254
            java.lang.CharSequence r0 = defpackage.b50.T(r0)     // Catch: java.lang.Throwable -> L254
            java.lang.String r13 = r0.toString()     // Catch: java.lang.Throwable -> L254
        L29f:
            android.os.Handler r0 = defpackage.uv.a     // Catch: java.lang.Throwable -> L254
            java.lang.ClassLoader r0 = defpackage.d9.a     // Catch: java.lang.Throwable -> L254
            java.lang.String r0 = defpackage.uv.c(r0, r7, r13)     // Catch: java.lang.Throwable -> L254
            java.lang.String r3 = "t0cT4v8WqQ==\n"
            java.lang.String r10 = "5BJQobpF+uk=\n"
            java.lang.String r3 = "SUCCESS"     // Catch: java.lang.Throwable -> L254
            boolean r3 = defpackage.ip.i(r0, r3)     // Catch: java.lang.Throwable -> L254
            if (r3 != 0) goto L3e0
            gn r3 = defpackage.gn.a     // Catch: java.lang.Throwable -> L254
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L254
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L254
            r10.append(r0)     // Catch: java.lang.Throwable -> L254
            java.lang.String r0 = r10.toString()     // Catch: java.lang.Throwable -> L254
            r3.getClass()     // Catch: java.lang.Throwable -> L254
            defpackage.gn.k(r4, r0)     // Catch: java.lang.Throwable -> L254
            goto L3e0
        L2cb:
            defpackage.gt.w(r4, r3, r7)     // Catch: java.lang.Throwable -> L254
            goto L3e0
        L2d0:
            java.lang.reflect.Field r0 = defpackage.in.g     // Catch: java.lang.Throwable -> L254
            if (r0 == 0) goto L2d9
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L254
            goto L2da
        L2d9:
            r0 = 0
        L2da:
            boolean r3 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L254
            if (r3 == 0) goto L2e1
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L254
            goto L2e2
        L2e1:
            r0 = 0
        L2e2:
            if (r0 != 0) goto L2e5
            goto L2e6
        L2e5:
            r13 = r0
        L2e6:
            int r0 = r13.length()     // Catch: java.lang.Throwable -> L254
            if (r0 <= 0) goto L318
            android.os.Handler r0 = defpackage.uv.a     // Catch: java.lang.Throwable -> L254
            java.lang.ClassLoader r0 = defpackage.d9.a     // Catch: java.lang.Throwable -> L254
            java.lang.String r0 = defpackage.uv.e(r0, r7, r13, r4)     // Catch: java.lang.Throwable -> L254
            java.lang.String r3 = "T14cfq7xrQ==\n"
            java.lang.String r11 = "HAtfPeui/m0=\n"
            java.lang.String r3 = "SUCCESS"     // Catch: java.lang.Throwable -> L254
            boolean r3 = defpackage.ip.i(r0, r3)     // Catch: java.lang.Throwable -> L254
            if (r3 != 0) goto L3e0
            gn r3 = defpackage.gn.a     // Catch: java.lang.Throwable -> L254
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L254
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L254
            r11.append(r0)     // Catch: java.lang.Throwable -> L254
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> L254
            r3.getClass()     // Catch: java.lang.Throwable -> L254
            defpackage.gn.k(r4, r0)     // Catch: java.lang.Throwable -> L254
            goto L3e0
        L318:
            gn r0 = defpackage.gn.a     // Catch: java.lang.Throwable -> L254
            java.lang.String r3 = "ryjUChkzwZD7ZO1HjKjCo+pq6ndeBpPRxRqxTRthu4eiO/YHCAw=\n"
            java.lang.String r10 = "SoxZ4raIJDQ=\n"
            java.lang.String r3 = "\u590d\u8bfb\u5931\u8d25: \u65e0\u6cd5\u83b7\u53d6\u8bed\u97f3\u8def\u5f84"     // Catch: java.lang.Throwable -> L254
            r0.getClass()     // Catch: java.lang.Throwable -> L254
            defpackage.gn.k(r4, r3)     // Catch: java.lang.Throwable -> L254
            goto L3e0
        L32a:
            gn r0 = defpackage.gn.a     // Catch: java.lang.Throwable -> L254
            java.lang.String r3 = "KKTcJ4jj+e1quYtikIFyiCWQ2SW78TO0T9jTe+f+VONRlYRPkYFZkw==\n"
            java.lang.String r10 = "zT9iwAFk1gU=\n"
            java.lang.String r3 = "\u56fe\u7247/\u89c6\u9891\u590d\u8bfb\u5e95\u5c42\u7c7b\u6682\u672a\u63d0\u53d6"     // Catch: java.lang.Throwable -> L254
            r0.getClass()     // Catch: java.lang.Throwable -> L254
            defpackage.gn.k(r4, r3)     // Catch: java.lang.Throwable -> L254
            goto L3e0
        L33c:
            java.lang.reflect.Field r10 = defpackage.in.h     // Catch: java.lang.Throwable -> L254
            if (r10 == 0) goto L345
            java.lang.Object r3 = r10.get(r3)     // Catch: java.lang.Throwable -> L254
            goto L346
        L345:
            r3 = 0
        L346:
            boolean r10 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L254
            if (r10 == 0) goto L34d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L254
            goto L34e
        L34d:
            r3 = 0
        L34e:
            if (r3 != 0) goto L351
            goto L352
        L351:
            r13 = r3
        L352:
            java.lang.String r3 = "n5826w2a2sSy\n"
            java.lang.String r10 = "3/xeinnotas=\n"
            java.lang.String r3 = "@chatroom"     // Catch: java.lang.Throwable -> L254
            boolean r3 = defpackage.b50.C(r7, r3)     // Catch: java.lang.Throwable -> L254
            if (r3 == 0) goto L383
            java.lang.String r3 = "ERA=\n"
            java.lang.String r10 = "Kxq7Ss0V0Xw=\n"
            java.lang.String r3 = ":\n"     // Catch: java.lang.Throwable -> L254
            r10 = 0
            boolean r3 = defpackage.b50.B(r13, r3, r10)     // Catch: java.lang.Throwable -> L254
            if (r3 == 0) goto L383
            java.lang.String r3 = "AOw=\n"
            java.lang.String r10 = "Oubo4euCjgA=\n"
            java.lang.String r3 = ":\n"     // Catch: java.lang.Throwable -> L254
            java.lang.String r3 = defpackage.b50.O(r13, r3)     // Catch: java.lang.Throwable -> L254
            java.lang.CharSequence r3 = defpackage.b50.T(r3)     // Catch: java.lang.Throwable -> L254
            java.lang.String r13 = r3.toString()     // Catch: java.lang.Throwable -> L254
        L383:
            android.os.Handler r3 = defpackage.uv.a     // Catch: java.lang.Throwable -> L254
            java.lang.ClassLoader r3 = defpackage.d9.a     // Catch: java.lang.Throwable -> L254
            java.lang.String r3 = defpackage.uv.f(r3, r7, r13)     // Catch: java.lang.Throwable -> L254
            java.lang.String r10 = "MUIip2JuaA==\n"
            java.lang.String r11 = "Yhdh5Cc9O/E=\n"
            java.lang.String r10 = "SUCCESS"     // Catch: java.lang.Throwable -> L254
            boolean r10 = defpackage.ip.i(r3, r10)     // Catch: java.lang.Throwable -> L254
            if (r10 != 0) goto L3e0
            gn r10 = defpackage.gn.a     // Catch: java.lang.Throwable -> L254
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L254
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L254
            r11.append(r3)     // Catch: java.lang.Throwable -> L254
            java.lang.String r0 = r11.toString()     // Catch: java.lang.Throwable -> L254
            r10.getClass()     // Catch: java.lang.Throwable -> L254
            defpackage.gn.k(r4, r0)     // Catch: java.lang.Throwable -> L254
            goto L3e0
        L3ae:
            gn r3 = defpackage.gn.a
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "复读逻辑异常: "
            r10.<init>(r11)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r3.getClass()
            defpackage.gn.k(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "RepeatAction_Failed for type: "
            r0.<init>(r3)
            r0.append(r6)
            java.lang.String r3 = ", talker: "
            r0.append(r3)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            goto L1e9
        L3e0:
            int r0 = defpackage.ac.m
            java.lang.String r3 = "d2ujObtTQWhqdqwosA==\n"
            java.lang.String r4 = "Iznid+gfADw=\n"
            "TRANSLATION_X"
            r3 = 2114191361(0x7e040001, float:4.386453E37)
            qh r4 = defpackage.h40.l
            h40 r3 = h(r1, r4, r3)
            java.lang.String r4 = "Ao+wpnd0f6s=\n"
            java.lang.String r5 = "UMDk5yM9MOU=\n"
            "ROTATION"
            r4 = 2114191362(0x7e040002, float:4.3864534E37)
            qh r5 = defpackage.h40.p
            h40 r4 = h(r1, r5, r4)
            java.lang.String r5 = "5mn7OBhikQ==\n"
            java.lang.String r6 = "tSq6dF09yZs=\n"
            "SCALE_X"
            r5 = 2114191363(0x7e040003, float:4.386454E37)
            qh r6 = defpackage.h40.n
            h40 r5 = h(r1, r6, r5)
            java.lang.String r6 = "w2YvMncszQ==\n"
            java.lang.String r7 = "kCVufjJzlJA=\n"
            "SCALE_Y"
            r6 = 2114191364(0x7e040004, float:4.3864544E37)
            qh r7 = defpackage.h40.o
            h40 r6 = h(r1, r7, r6)
            java.lang.String r7 = "kCAq+l2PAs6NPSXrVw==\n"
            java.lang.String r8 = "xHJrtA7DQ5o=\n"
            "TRANSLATION_Y"
            r7 = 2114191366(0x7e040006, float:4.3864554E37)
            qh r8 = defpackage.h40.m
            h40 r7 = h(r1, r8, r7)
            r8 = 4
            if (r0 != r8) goto L490
            boolean r10 = r2.d
            if (r10 == 0) goto L490
            r3.c()
            r4.c()
            r5.c()
            r6.c()
            r7.c()
            zn r0 = new zn
            r10 = 0
            r0.<init>(r1, r5, r6, r10)
            android.view.ViewPropertyAnimator r3 = r1.animate()
            r7 = 0
            android.view.ViewPropertyAnimator r3 = r3.setListener(r7)
            android.view.ViewPropertyAnimator r3 = r3.setUpdateListener(r7)
            android.view.ViewPropertyAnimator r3 = r3.withStartAction(r7)
            r3.withEndAction(r7)
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r3 = 1069547520(0x3fc00000, float:1.5)
            android.view.ViewPropertyAnimator r1 = r1.scaleX(r3)
            android.view.ViewPropertyAnimator r1 = r1.scaleY(r3)
            r3 = 0
            android.view.ViewPropertyAnimator r1 = r1.alpha(r3)
            r3 = 90
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r3)
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r4 = 1073741824(0x40000000, float:2.0)
            r3.<init>(r4)
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r3)
            android.view.ViewPropertyAnimator r0 = r1.withEndAction(r0)
            r0.start()
        L48d:
            r10 = 0
            goto L586
        L490:
            if (r0 == 0) goto L4a1
            r10 = 2
            if (r0 == r10) goto L49e
            if (r0 == r8) goto L49b
            r10 = 1153138688(0x44bb8000, float:1500.0)
            goto L4a4
        L49b:
            r10 = 1112014848(0x42480000, float:50.0)
            goto L4a4
        L49e:
            r10 = 1128792064(0x43480000, float:200.0)
            goto L4a4
        L4a1:
            r10 = 1176256512(0x461c4000, float:10000.0)
        L4a4:
            if (r0 == 0) goto L4c0
            r14 = 1
            if (r0 == r14) goto L4bc
            r11 = 2
            if (r0 == r11) goto L4b8
            r11 = 1058642330(0x3f19999a, float:0.6)
            r14 = 3
            if (r0 == r14) goto L4c3
            if (r0 == r8) goto L4b5
            goto L4c3
        L4b5:
            r11 = 1056964608(0x3f000000, float:0.5)
            goto L4c3
        L4b8:
            r11 = 1055286886(0x3ee66666, float:0.45)
            goto L4c3
        L4bc:
            r11 = 1051931443(0x3eb33333, float:0.35)
            goto L4c3
        L4c0:
            r11 = 1061997773(0x3f4ccccd, float:0.8)
        L4c3:
            r3.a = r9
            r0 = 1110704128(0x42340000, float:45.0)
            float r9 = r9 / r0
            r4.a = r9
            i40 r0 = r3.j
            r8 = 0
            if (r0 == 0) goto L4d8
            double r12 = (double) r8
            r0.i = r12
            r0.b(r10)
            r0.a(r11)
        L4d8:
            i40 r0 = r4.j
            if (r0 == 0) goto L4e5
            double r12 = (double) r8
            r0.i = r12
            r0.b(r10)
            r0.a(r11)
        L4e5:
            i40 r0 = r5.j
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L4f4
            double r12 = (double) r8
            r0.i = r12
            r0.b(r10)
            r0.a(r11)
        L4f4:
            i40 r0 = r6.j
            if (r0 == 0) goto L501
            double r12 = (double) r8
            r0.i = r12
            r0.b(r10)
            r0.a(r11)
        L501:
            i40 r0 = r7.j
            if (r0 == 0) goto L50f
            r8 = 0
            double r12 = (double) r8
            r0.i = r12
            r0.b(r10)
            r0.a(r11)
        L50f:
            ao r0 = new ao
            r10 = 0
            r0.<init>(r1, r3, r10)
            r3.a(r0)
            r3.h()
            r4.h()
            r5.h()
            r6.h()
            r7.h()
            r3 = r19
            android.view.View r0 = r3.e
            r3 = 300(0x12c, double:1.48E-321)
            if (r0 == 0) goto L553
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L553
            r7 = 0
            android.view.ViewPropertyAnimator r0 = r0.setListener(r7)
            if (r0 == 0) goto L553
            android.view.ViewPropertyAnimator r0 = r0.withEndAction(r7)
            if (r0 == 0) goto L553
            r8 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r8)
            if (r0 == 0) goto L553
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
            if (r0 == 0) goto L553
            r0.start()
        L553:
            android.view.ViewPropertyAnimator r0 = r1.animate()
            r7 = 0
            android.view.ViewPropertyAnimator r0 = r0.setListener(r7)
            android.view.ViewPropertyAnimator r0 = r0.withEndAction(r7)
            r8 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r8)
            r8 = 0
            android.view.ViewPropertyAnimator r0 = r0.rotationX(r8)
            android.view.ViewPropertyAnimator r0 = r0.rotationY(r8)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
            java.lang.String r1 = "yths/GxhTRrQ0naQNz0CRw==\n"
            java.lang.String r3 = "ub0YuBkTLG4=\n"
            java.lang.String r1 = "setDuration(...)"
            defpackage.ip.n(r1, r0)
            r0.translationZ(r8)
            r0.start()
            goto L48d
        L586:
            r2.c = r10
            r2.e = r10
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r23
            r1.setResult(r0)
            return
        L592:
            r3 = r19
            r8 = 0
            float r0 = r1.getTranslationX()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L5b0
            float r0 = r1.getScaleX()
            r16 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 != 0) goto L5b0
            float r0 = r1.getRotation()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L5b0
            return
        L5b0:
            j(r18, r19)
            return
    }

    public static final void c(android.view.ViewGroup r2, android.app.Activity r3, java.lang.String r4, java.lang.String r5, int r6, defpackage.hm r7) {
            android.view.View r0 = r2.findViewWithTag(r4)
            if (r0 == 0) goto Lb
            r2 = 0
            r0.setVisibility(r2)
            return
        Lb:
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r3)
            r0.setTag(r4)
            r0.setText(r5)
            r3 = 1103101952(0x41c00000, float:24.0)
            r0.setTextSize(r3)
            r3 = 17
            r0.setGravity(r3)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            java.lang.String r4 = "3URGVaIG\n"
            java.lang.String r1 = "P97fuhqJSNY=\n"
            java.lang.String r4 = "\u2699\ufe0f"
            boolean r4 = defpackage.ip.i(r5, r4)
            if (r4 == 0) goto L40
            java.lang.String r4 = "PzbvSPR9x05a\n"
            java.lang.String r5 = "HHPZDrI7gQg=\n"
        L37:
            java.lang.String r4 = defpackage.u40.a(r4, r5)
            int r4 = android.graphics.Color.parseColor(r4)
            goto L45
        L40:
            java.lang.String r4 = "LA+jJvHIOZ0/\n"
            java.lang.String r5 = "DzaaFsH4Ca0=\n"
            goto L37
        L45:
            r3.setColor(r4)
            r4 = 1110704128(0x42340000, float:45.0)
            r3.setCornerRadius(r4)
            r0.setBackground(r3)
            r3 = 15
            r0.setPadding(r3, r3, r3, r3)
            r3 = 1092616192(0x41200000, float:10.0)
            r0.setElevation(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 120(0x78, float:1.68E-43)
            r3.<init>(r4, r4)
            r4 = 8388659(0x800033, float:1.1755015E-38)
            r3.gravity = r4
            r4 = 50
            r3.leftMargin = r4
            r3.topMargin = r6
            f00 r4 = new f00
            r4.<init>()
            f00 r5 = new f00
            r5.<init>()
            e00 r6 = new e00
            r6.<init>()
            j80 r1 = new j80
            r1.<init>(r4, r5, r6, r7)
            r0.setOnTouchListener(r1)
            boolean r4 = r2 instanceof android.widget.FrameLayout
            if (r4 == 0) goto L8a
            r2.addView(r0, r3)
        L8a:
            return
    }

    public static final void d(android.app.Activity r10, android.view.ViewGroup r11) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r0.add(r11)
            android.content.res.Resources r1 = r11.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            android.content.res.Resources r11 = r11.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            int r11 = r11.heightPixels
            float r11 = (float) r11
            r2 = 1041865114(0x3e19999a, float:0.15)
            float r11 = r11 * r2
            r2 = 0
            r3 = r2
        L23:
            boolean r4 = r0.isEmpty()
            r5 = 1
            if (r4 != 0) goto L98
            java.lang.Object r4 = r0.poll()
            android.view.View r4 = (android.view.View) r4
            boolean r6 = r4 instanceof android.widget.TextView
            if (r6 == 0) goto L81
            r6 = r4
            android.widget.TextView r6 = (android.widget.TextView) r6
            int r7 = r6.getVisibility()
            if (r7 != 0) goto L81
            java.lang.CharSequence r7 = r6.getText()
            java.lang.String r8 = "uIdok0pzLo/xzDLu\n"
            java.lang.String r9 = "3+Icxy8LWqc=\n"
            java.lang.String r8 = "getText(...)"
            defpackage.ip.n(r8, r7)
            int r7 = r7.length()
            if (r7 <= 0) goto L81
            r7 = 2
            int[] r7 = new int[r7]
            r6.getLocationOnScreen(r7)
            r5 = r7[r5]
            float r5 = (float) r5
            r7 = 10
            float r7 = (float) r7
            float r7 = r7 * r1
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L81
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L81
            float r5 = r6.getTextSize()
            r7 = 1096810496(0x41600000, float:14.0)
            float r7 = r7 * r1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L81
            if (r3 == 0) goto L80
            float r5 = r6.getTextSize()
            float r7 = r3.getTextSize()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L81
        L80:
            r3 = r6
        L81:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L23
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r5 = r4.getChildCount()
            r6 = 0
        L8c:
            if (r6 >= r5) goto L23
            android.view.View r7 = r4.getChildAt(r6)
            r0.add(r7)
            int r6 = r6 + 1
            goto L8c
        L98:
            if (r3 != 0) goto L9b
            goto Laa
        L9b:
            r11 = 2115108885(0x7e120015, float:4.851693E37)
            java.lang.Object r0 = r3.getTag(r11)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = defpackage.ip.i(r0, r1)
            if (r0 == 0) goto Lab
        Laa:
            return
        Lab:
            r3.setTag(r11, r1)
            r11 = 2115108871(0x7e120007, float:4.8516857E37)
            java.lang.Object r0 = r3.getTag(r11)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto Lbc
            r2 = r0
            java.lang.Integer r2 = (java.lang.Integer) r2
        Lbc:
            if (r2 == 0) goto Lc3
            int r0 = r2.intValue()
            goto Lc7
        Lc3:
            int r0 = r3.getCurrentTextColor()
        Lc7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r3.setTag(r11, r1)
            i00 r11 = new i00
            r11.<init>()
            java.lang.CharSequence r1 = r3.getText()
            java.lang.String r1 = r1.toString()
            r11.b = r1
            l80 r1 = new l80
            r1.<init>(r3, r11, r0)
            r3.addTextChangedListener(r1)
            r3.setClickable(r5)
            v9 r0 = new v9
            r1 = 3
            r0.<init>(r10, r3, r11, r1)
            r3.setOnClickListener(r0)
            java.lang.CharSequence r10 = r3.getText()
            r3.setText(r10)
            return
    }

    public static final byte[] e(byte[] r5, java.lang.ClassLoader r6) {
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            java.lang.String r0 = defpackage.pb0.f1     // Catch: java.lang.Throwable -> L59
            java.lang.Class r6 = de.robv.android.xposed.XposedHelpers.findClass(r0, r6)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = r6.newInstance()     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = defpackage.pb0.h1     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r1 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L59
            de.robv.android.xposed.XposedHelpers.callMethod(r6, r0, r1)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = defpackage.pb0.g1     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.getObjectField(r6, r0)     // Catch: java.lang.Throwable -> L59
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L59
            r2 = 0
            if (r1 == 0) goto L43
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = defpackage.pb0.e1     // Catch: java.lang.Throwable -> L59
            boolean r1 = defpackage.b50.N(r1, r3, r2)     // Catch: java.lang.Throwable -> L59
            if (r1 != 0) goto L43
            java.lang.String r1 = defpackage.pb0.g1     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = defpackage.pb0.e1     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r4.<init>()     // Catch: java.lang.Throwable -> L59
            r4.append(r3)     // Catch: java.lang.Throwable -> L59
            r4.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L59
            de.robv.android.xposed.XposedHelpers.setObjectField(r6, r1, r0)     // Catch: java.lang.Throwable -> L59
        L43:
            java.lang.String r0 = defpackage.pb0.i1     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L59
            java.lang.Object r6 = de.robv.android.xposed.XposedHelpers.callMethod(r6, r0, r1)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = "16WQemD+JwPXv4g2IvhmDtijiDY08mYD1r7ReDXxKk3NqYxzYPYpGdW5kjgC5DII+KKOdzk=\n"
            java.lang.String r1 = "udD8FkCdRm0=\n"
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.ByteArray"     // Catch: java.lang.Throwable -> L59
            defpackage.ip.m(r0, r6)     // Catch: java.lang.Throwable -> L59
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Throwable -> L59
            return r6
        L59:
            java.lang.String r6 = "YD7Lfxc0r9xdJOhOFy2t8Vw/0w==\n"
            java.lang.String r0 = "M1C4PHhZwrk=\n"
            java.lang.String r6 = "SnsCommentProtoHook"
            java.lang.String r0 = "Fg==\n"
            java.lang.String r1 = "c8HJlSTQVfc=\n"
            java.lang.String r2 = "Nwje\n"
            java.lang.String r3 = "Q2m5jaPP2Zc=\n"
            defpackage.z30.o(r2, r3, r6, r0, r1)
            return r5
    }

    public static defpackage.vh f(android.content.Context r6, int r7) {
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            java.lang.String r3 = "Cannot create a CalendarItemStyle with a styleResId of 0"
            defpackage.zt.d(r3, r2)
            int[] r2 = defpackage.wy.m
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r2)
            int r2 = r7.getDimensionPixelOffset(r1, r1)
            r3 = 2
            int r3 = r7.getDimensionPixelOffset(r3, r1)
            int r0 = r7.getDimensionPixelOffset(r0, r1)
            r4 = 3
            int r4 = r7.getDimensionPixelOffset(r4, r1)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r2, r3, r0, r4)
            r0 = 4
            defpackage.ct.n(r6, r7, r0)
            r0 = 9
            defpackage.ct.n(r6, r7, r0)
            r0 = 7
            defpackage.ct.n(r6, r7, r0)
            r0 = 8
            r7.getDimensionPixelSize(r0, r1)
            r0 = 5
            int r0 = r7.getResourceId(r0, r1)
            r2 = 6
            int r2 = r7.getResourceId(r2, r1)
            e r3 = new e
            float r1 = (float) r1
            r3.<init>(r1)
            e30 r6 = defpackage.f30.a(r6, r0, r2, r3)
            r6.a()
            r7.recycle()
            vh r6 = new vh
            r7 = 15
            r6.<init>(r7)
            int r7 = r5.left
            defpackage.zt.e(r7)
            int r7 = r5.top
            defpackage.zt.e(r7)
            int r7 = r5.right
            defpackage.zt.e(r7)
            int r7 = r5.bottom
            defpackage.zt.e(r7)
            return r6
    }

    public static defpackage.h40 h(android.view.ViewGroup r2, defpackage.ip r3, int r4) {
            java.lang.Object r0 = r2.getTag(r4)
            boolean r1 = r0 instanceof defpackage.h40
            if (r1 == 0) goto Lb
            h40 r0 = (defpackage.h40) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L5a
            h40 r0 = new h40
            r0.<init>(r2, r3)
            i40 r1 = new i40
            r1.<init>()
            r0.j = r1
            qh r1 = defpackage.h40.n
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L51
            qh r1 = defpackage.h40.o
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L2b
            goto L51
        L2b:
            qh r1 = defpackage.h40.p
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L4a
            qh r1 = defpackage.h40.q
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L4a
            qh r1 = defpackage.h40.r
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L44
            goto L4a
        L44:
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.f(r3)
            goto L57
        L4a:
            r3 = 1036831949(0x3dcccccd, float:0.1)
            r0.f(r3)
            goto L57
        L51:
            r3 = 990057071(0x3b03126f, float:0.002)
            r0.f(r3)
        L57:
            r2.setTag(r4, r0)
        L5a:
            return r0
    }

    public static boolean i(defpackage.ji r7, android.text.Editable r8, int r9, int r10, boolean r11) {
            r0 = 0
            if (r8 == 0) goto Lef
            if (r9 < 0) goto Lef
            if (r10 >= 0) goto L9
            goto Lef
        L9:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            r3 = -1
            if (r1 == r3) goto Lef
            if (r2 == r3) goto Lef
            if (r1 == r2) goto L1a
            goto Lef
        L1a:
            r4 = 1
            if (r11 == 0) goto La5
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            if (r1 < 0) goto L2c
            if (r11 >= r1) goto L2a
            goto L2c
        L2a:
            if (r9 >= 0) goto L2e
        L2c:
            r1 = r3
            goto L5d
        L2e:
            r11 = r0
        L2f:
            if (r9 != 0) goto L32
            goto L5d
        L32:
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L3b
            if (r11 == 0) goto L39
            goto L2c
        L39:
            r1 = r0
            goto L5d
        L3b:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L4b
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L48
            goto L2c
        L48:
            int r9 = r9 + (-1)
            goto L2e
        L4b:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L54
            int r9 = r9 + (-1)
            goto L2f
        L54:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L5b
            goto L2c
        L5b:
            r11 = r4
            goto L2f
        L5d:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto L6c
            if (r10 >= r2) goto L6a
            goto L6c
        L6a:
            if (r9 >= 0) goto L6e
        L6c:
            r10 = r3
            goto La0
        L6e:
            r11 = r0
        L6f:
            if (r9 != 0) goto L73
            r10 = r2
            goto La0
        L73:
            if (r2 < r10) goto L78
            if (r11 == 0) goto La0
            goto L6c
        L78:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L8a
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L85
            goto L6c
        L85:
            int r9 = r9 + (-1)
            int r2 = r2 + 1
            goto L6e
        L8a:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L95
            int r9 = r9 + (-1)
            int r2 = r2 + 1
            goto L6f
        L95:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L9c
            goto L6c
        L9c:
            int r2 = r2 + 1
            r11 = r4
            goto L6f
        La0:
            if (r1 == r3) goto Lef
            if (r10 != r3) goto Lb3
            goto Lef
        La5:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        Lb3:
            java.lang.Class<g80> r9 = defpackage.g80.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            g80[] r9 = (defpackage.g80[]) r9
            if (r9 == 0) goto Lef
            int r11 = r9.length
            if (r11 <= 0) goto Lef
            int r11 = r9.length
            r2 = r0
        Lc2:
            if (r2 >= r11) goto Ld9
            r3 = r9[r2]
            int r5 = r8.getSpanStart(r3)
            int r3 = r8.getSpanEnd(r3)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r3, r10)
            int r2 = r2 + 1
            goto Lc2
        Ld9:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            return r4
        Lef:
            return r0
    }

    public static void j(android.view.View r4, defpackage.e9 r5) {
            java.lang.String r0 = "8Q==\n"
            java.lang.String r1 = "h/xAW8uC8O8=\n"
            java.lang.String r0 = "v"
            defpackage.ip.o(r0, r4)
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.setListener(r1)
            android.view.ViewPropertyAnimator r0 = r0.setUpdateListener(r1)
            android.view.ViewPropertyAnimator r0 = r0.withStartAction(r1)
            r0.withEndAction(r1)
            android.view.View r0 = r5.e
            if (r0 == 0) goto L3e
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L3e
            android.view.ViewPropertyAnimator r0 = r0.setListener(r1)
            if (r0 == 0) goto L3e
            android.view.ViewPropertyAnimator r0 = r0.setUpdateListener(r1)
            if (r0 == 0) goto L3e
            android.view.ViewPropertyAnimator r0 = r0.withStartAction(r1)
            if (r0 == 0) goto L3e
            r0.withEndAction(r1)
        L3e:
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r0.cancel()
            android.view.View r0 = r5.e
            if (r0 == 0) goto L52
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L52
            r0.cancel()
        L52:
            r0 = 2114191367(0x7e040007, float:4.386456E37)
            java.lang.Object r2 = r4.getTag(r0)
            boolean r3 = r2 instanceof java.lang.Runnable
            if (r3 == 0) goto L60
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            goto L61
        L60:
            r2 = r1
        L61:
            if (r2 == 0) goto L69
            r4.removeCallbacks(r2)
            r4.setTag(r0, r1)
        L69:
            r0 = 2114191361(0x7e040001, float:4.386453E37)
            java.lang.Object r0 = r4.getTag(r0)
            boolean r2 = r0 instanceof defpackage.h40
            if (r2 == 0) goto L77
            h40 r0 = (defpackage.h40) r0
            goto L78
        L77:
            r0 = r1
        L78:
            if (r0 == 0) goto L81
            boolean r2 = r0.e
            if (r2 == 0) goto L81
            r0.c()
        L81:
            r0 = 2114191362(0x7e040002, float:4.3864534E37)
            java.lang.Object r0 = r4.getTag(r0)
            boolean r2 = r0 instanceof defpackage.h40
            if (r2 == 0) goto L8f
            h40 r0 = (defpackage.h40) r0
            goto L90
        L8f:
            r0 = r1
        L90:
            if (r0 == 0) goto L99
            boolean r2 = r0.e
            if (r2 == 0) goto L99
            r0.c()
        L99:
            r0 = 2114191363(0x7e040003, float:4.386454E37)
            java.lang.Object r0 = r4.getTag(r0)
            boolean r2 = r0 instanceof defpackage.h40
            if (r2 == 0) goto La7
            h40 r0 = (defpackage.h40) r0
            goto La8
        La7:
            r0 = r1
        La8:
            if (r0 == 0) goto Lb1
            boolean r2 = r0.e
            if (r2 == 0) goto Lb1
            r0.c()
        Lb1:
            r0 = 2114191364(0x7e040004, float:4.3864544E37)
            java.lang.Object r0 = r4.getTag(r0)
            boolean r2 = r0 instanceof defpackage.h40
            if (r2 == 0) goto Lbf
            h40 r0 = (defpackage.h40) r0
            goto Lc0
        Lbf:
            r0 = r1
        Lc0:
            if (r0 == 0) goto Lc9
            boolean r2 = r0.e
            if (r2 == 0) goto Lc9
            r0.c()
        Lc9:
            r0 = 2114191366(0x7e040006, float:4.3864554E37)
            java.lang.Object r0 = r4.getTag(r0)
            boolean r2 = r0 instanceof defpackage.h40
            if (r2 == 0) goto Ld7
            h40 r0 = (defpackage.h40) r0
            goto Ld8
        Ld7:
            r0 = r1
        Ld8:
            if (r0 == 0) goto Le1
            boolean r2 = r0.e
            if (r2 == 0) goto Le1
            r0.c()
        Le1:
            r0 = 0
            r4.setTranslationX(r0)
            r4.setTranslationY(r0)
            r4.setRotation(r0)
            r4.setRotationX(r0)
            r4.setRotationY(r0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r4.setScaleX(r2)
            r4.setScaleY(r2)
            r4.setAlpha(r2)
            r4.setTranslationZ(r0)
            android.view.View r0 = r5.e
            if (r0 == 0) goto L106
            r0.setAlpha(r2)
        L106:
            android.view.View r0 = r5.e
            if (r0 == 0) goto L10d
            r0.setScaleX(r2)
        L10d:
            android.view.View r0 = r5.e
            if (r0 == 0) goto L114
            r0.setScaleY(r2)
        L114:
            r0 = 0
            r4.setLayerType(r0, r1)
            g9 r4 = r5.g
            if (r4 == 0) goto L122
            r4.c = r0
            r4.d = r0
            r4.e = r0
        L122:
            return
    }

    public static byte[] k(byte[] r5, java.lang.ClassLoader r6) {
            java.lang.String r0 = "8haBOE5T\n"
            java.lang.String r1 = "nnngXCshwt8=\n"
            "loader"
            if (r5 != 0) goto Lb
            r5 = 0
            return r5
        Lb:
            java.lang.String r0 = defpackage.pb0.a1     // Catch: java.lang.Throwable -> L60
            java.lang.Class r6 = de.robv.android.xposed.XposedHelpers.findClass(r0, r6)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r6 = r6.newInstance()     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = defpackage.pb0.b1     // Catch: java.lang.Throwable -> L60
            java.lang.Object[] r1 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L60
            de.robv.android.xposed.XposedHelpers.callMethod(r6, r0, r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = defpackage.pb0.d1     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.getObjectField(r6, r0)     // Catch: java.lang.Throwable -> L60
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L60
            r2 = 0
            if (r1 == 0) goto L4a
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = defpackage.pb0.e1     // Catch: java.lang.Throwable -> L60
            boolean r1 = defpackage.b50.N(r1, r3, r2)     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L4a
            java.lang.String r1 = defpackage.pb0.d1     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = defpackage.pb0.e1     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r4.<init>()     // Catch: java.lang.Throwable -> L60
            r4.append(r3)     // Catch: java.lang.Throwable -> L60
            r4.append(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L60
            de.robv.android.xposed.XposedHelpers.setObjectField(r6, r1, r0)     // Catch: java.lang.Throwable -> L60
        L4a:
            java.lang.String r0 = defpackage.pb0.c1     // Catch: java.lang.Throwable -> L60
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L60
            java.lang.Object r6 = de.robv.android.xposed.XposedHelpers.callMethod(r6, r0, r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "JZdz+FwfjnUljWu0HhnPeCqRa7QIE891JIwy+gkQgzs/m2/xXBeAbyeLcbo+BZt+CpBt9QU=\n"
            java.lang.String r1 = "S+IflHx87xs=\n"
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.ByteArray"     // Catch: java.lang.Throwable -> L60
            defpackage.ip.m(r0, r6)     // Catch: java.lang.Throwable -> L60
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Throwable -> L60
            return r6
        L60:
            java.lang.String r6 = "sHmS8O/L7fKreI7L\n"
            java.lang.String r0 = "4xfhoJ2kmZ0=\n"
            java.lang.String r6 = "SnsProtoHook"
            java.lang.String r0 = "Fg==\n"
            java.lang.String r1 = "c8HJlSTQVfc=\n"
            java.lang.String r2 = "Nwje\n"
            java.lang.String r3 = "Q2m5jaPP2Zc=\n"
            defpackage.z30.o(r2, r3, r6, r0, r1)
            return r5
    }

    public static android.widget.TextView l(android.app.Activity r8, android.widget.FrameLayout r9, android.widget.LinearLayout r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r8)
            r0.setText(r11)
            r11 = 1097859072(0x41700000, float:15.0)
            r0.setTextSize(r11)
            java.lang.String r11 = "DH8GmhtHbw==\n"
            java.lang.String r1 = "L08x2SpxX98=\n"
            java.lang.String r11 = "#07C160"
            int r11 = android.graphics.Color.parseColor(r11)
            r0.setTextColor(r11)
            r11 = 0
            r1 = 1
            r0.setTypeface(r11, r1)
            android.graphics.drawable.GradientDrawable r11 = new android.graphics.drawable.GradientDrawable
            r11.<init>()
            r1 = -1
            r11.setColor(r1)
            r1 = 1103101952(0x41c00000, float:24.0)
            r11.setCornerRadius(r1)
            r0.setBackground(r11)
            r11 = 0
            r1 = 30
            r0.setPadding(r11, r1, r11, r1)
            r1 = 17
            r0.setGravity(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r11, r2, r3)
            r11 = 10
            r1.setMargins(r11, r11, r11, r11)
            r0.setLayoutParams(r1)
            a6 r2 = new a6
            r3 = r8
            r6 = r9
            r7 = r10
            r4 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r0.setOnClickListener(r2)
            return r0
    }

    @Override // defpackage.cv
    public void a(defpackage.ku r1, boolean r2) {
            r0 = this;
            return
    }

    public android.content.pm.Signature[] g(android.content.pm.PackageManager r2, java.lang.String r3) {
            r1 = this;
            r0 = 64
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
            android.content.pm.Signature[] r2 = r2.signatures
            return r2
    }

    @Override // defpackage.cv
    public boolean q(defpackage.ku r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 10: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.String r0 = "kotlin.Unit"
            return r0
    }
}
