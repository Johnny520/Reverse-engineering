package lb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lb.i f7981b;

    public /* synthetic */ h(lb.i r1, int r2) {
            r0 = this;
            r0.f7980a = r2
            r0.f7981b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r15) {
            r14 = this;
            int r0 = r14.f7980a
            switch(r0) {
                case 1: goto L36;
                case 2: goto L23;
                case 3: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r15)
            return
        L9:
            r15.getClass()
            lb.i r0 = r14.f7981b
            java.lang.ref.WeakReference r0 = r0.f7996o
            java.lang.Object r0 = r0.get()
            java.lang.Object r15 = r15.thisObject
            if (r0 != r15) goto L22
            lb.i r15 = r14.f7981b
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r15.f7996o = r0
        L22:
            return
        L23:
            r15.getClass()
            java.lang.Object r15 = r15.thisObject
            boolean r0 = r15 instanceof android.view.View
            if (r0 == 0) goto L35
            lb.i r0 = r14.f7981b
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r15)
            r0.f7996o = r1
        L35:
            return
        L36:
            r15.getClass()
            lb.i r0 = r14.f7981b
            java.lang.Object[] r1 = r15.args
            if (r1 == 0) goto L201
            int r2 = r1.length
            r3 = 2
            if (r2 >= r3) goto L45
            goto L201
        L45:
            r2 = 0
            r3 = r1[r2]
            if (r3 == 0) goto L201
            r4 = 1
            r1 = r1[r4]
            boolean r5 = r1 instanceof java.lang.Integer
            r6 = 0
            if (r5 == 0) goto L55
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L56
        L55:
            r1 = r6
        L56:
            if (r1 == 0) goto L201
            int r5 = r1.intValue()
            java.lang.Object r15 = r15.thisObject
            if (r15 == 0) goto L201
            java.util.concurrent.ConcurrentHashMap r7 = r0.f7984c
            if (r5 >= 0) goto L67
            r15 = r6
            goto L19e
        L67:
            java.lang.Class r8 = r15.getClass()
            java.lang.Object r8 = r7.get(r8)
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r8 == 0) goto L7d
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object r15 = h.Hchat.utils.KavaReflector.invoke(r8, r15, r1)
            goto L19e
        L7d:
            java.lang.Class r8 = r15.getClass()
        L81:
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            if (r8 == 0) goto L105
            boolean r10 = r8.equals(r9)
            if (r10 != 0) goto L105
            java.util.List r9 = h.Hchat.utils.KavaReflector.declaredMethods(r8)
            java.util.Iterator r9 = r9.iterator()
        L93:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Le6
            java.lang.Object r10 = r9.next()
            r11 = r10
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.Class[] r12 = r11.getParameterTypes()
            int r12 = r12.length
            if (r12 != r4) goto L93
            java.lang.Class[] r12 = r11.getParameterTypes()
            r12 = r12[r2]
            java.lang.Class r13 = java.lang.Integer.TYPE
            boolean r12 = gg.l.a(r12, r13)
            if (r12 != 0) goto Lc1
            java.lang.Class[] r12 = r11.getParameterTypes()
            r12 = r12[r2]
            boolean r12 = gg.l.a(r12, r13)
            if (r12 == 0) goto L93
        Lc1:
            java.lang.String r12 = r11.getName()
            java.lang.String r13 = "J0"
            boolean r12 = gg.l.a(r12, r13)
            if (r12 != 0) goto Le7
            java.lang.String r12 = r11.getName()
            java.lang.String r13 = "getItem"
            boolean r12 = gg.l.a(r12, r13)
            if (r12 != 0) goto Le7
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "get"
            boolean r11 = gg.l.a(r11, r12)
            if (r11 == 0) goto L93
            goto Le7
        Le6:
            r10 = r6
        Le7:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            if (r10 == 0) goto Lff
            java.lang.Class r9 = r15.getClass()
            r7.put(r9, r10)
            java.lang.Object[] r9 = new java.lang.Object[]{r1}
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.invoke(r10, r15, r9)
            if (r9 == 0) goto Lff
            r15 = r9
            goto L19e
        Lff:
            java.lang.Class r8 = r8.getSuperclass()
            goto L81
        L105:
            java.util.concurrent.ConcurrentHashMap r1 = r0.f7985d
            java.lang.Class r4 = r15.getClass()
            java.lang.Object r4 = r1.get(r4)
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            if (r4 == 0) goto L120
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r15)
            java.lang.Object r4 = lb.i.v(r5, r4)
            if (r4 == 0) goto L120
            r15 = r4
            goto L19e
        L120:
            java.lang.Class r4 = r15.getClass()
        L124:
            if (r4 == 0) goto L18c
            boolean r7 = r4.equals(r9)
            if (r7 != 0) goto L18c
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredFields(r4)
            java.util.Iterator r7 = r7.iterator()
        L134:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L172
            java.lang.Object r8 = r7.next()
            r10 = r8
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            java.lang.String r11 = r10.getName()
            java.lang.String r12 = "K"
            boolean r11 = gg.l.a(r11, r12)
            if (r11 != 0) goto L173
            java.lang.String r11 = r10.getName()
            java.lang.String r12 = "items"
            boolean r11 = gg.l.a(r11, r12)
            if (r11 != 0) goto L173
            java.lang.String r11 = r10.getName()
            java.lang.String r12 = "data"
            boolean r11 = gg.l.a(r11, r12)
            if (r11 != 0) goto L173
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "list"
            boolean r10 = gg.l.a(r10, r11)
            if (r10 == 0) goto L134
            goto L173
        L172:
            r8 = r6
        L173:
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            if (r8 == 0) goto L187
            java.lang.Class r2 = r15.getClass()
            r1.put(r2, r8)
            java.lang.Object r15 = h.Hchat.utils.KavaReflector.readField(r8, r15)
            java.lang.Object r15 = lb.i.v(r5, r15)
            goto L19e
        L187:
            java.lang.Class r4 = r4.getSuperclass()
            goto L124
        L18c:
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r1.getClass()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r15 = lb.i.h(r15, r5, r1, r2)
        L19e:
            if (r15 == 0) goto L201
            java.lang.Object r15 = lb.i.K(r15)
            if (r15 == 0) goto L201
            long r1 = lb.i.x(r15)
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 > 0) goto L1b1
            goto L201
        L1b1:
            q8.m r4 = h.Hchat.hooks.api.core.WeChatApis.chatPage()
            if (r4 == 0) goto L1bc
            java.lang.String r4 = r4.a()
            goto L1bd
        L1bc:
            r4 = r6
        L1bd:
            if (r4 != 0) goto L1c1
            java.lang.String r4 = ""
        L1c1:
            int r5 = r4.length()
            if (r5 != 0) goto L1c8
            goto L201
        L1c8:
            java.lang.String r5 = "itemView"
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r3, r5)
            boolean r7 = r5 instanceof android.view.View
            if (r7 == 0) goto L1d5
            android.view.View r5 = (android.view.View) r5
            goto L1d6
        L1d5:
            r5 = r6
        L1d6:
            if (r5 == 0) goto L1da
            r6 = r5
            goto L1ed
        L1da:
            java.lang.Class r5 = r3.getClass()
            java.lang.reflect.Field r5 = r0.i(r5)
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r5, r3)
            boolean r5 = r3 instanceof android.view.View
            if (r5 == 0) goto L1ed
            r6 = r3
            android.view.View r6 = (android.view.View) r6
        L1ed:
            if (r6 == 0) goto L201
            lb.i.b(r6)
            java.util.Map r0 = r0.f7997p
            r0.getClass()
            java.util.Map r0 = (java.util.Map) r0
            lb.c r3 = new lb.c
            r3.<init>(r1, r4, r15)
            r0.put(r6, r3)
        L201:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r26) {
            r25 = this;
            r1 = r25
            r2 = r26
            int r0 = r1.f7980a
            switch(r0) {
                case 0: goto Ld;
                default: goto L9;
            }
        L9:
            super.beforeHookedMethod(r26)
            return
        Ld:
            lb.f r3 = lb.f.f7964g
            r2.getClass()
            java.lang.Object r0 = r2.thisObject
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L1c
            android.view.View r0 = (android.view.View) r0
            r4 = r0
            goto L1d
        L1c:
            r4 = 0
        L1d:
            if (r4 == 0) goto L727
            java.lang.Object[] r0 = r2.args
            r6 = 0
            if (r0 == 0) goto L29
            java.lang.Object r0 = tf.l.C0(r6, r0)
            goto L2a
        L29:
            r0 = 0
        L2a:
            boolean r7 = r0 instanceof android.view.MotionEvent
            if (r7 == 0) goto L31
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            goto L32
        L31:
            r0 = 0
        L32:
            if (r0 == 0) goto L727
            lb.i r7 = r1.f7981b
            r8.g r8 = r7.f7982a
            android.content.Context r8 = r8.f11620a
            java.lang.String r9 = "Hchat_swipe_quote_config"
            android.content.SharedPreferences r8 = ub.b.c(r8, r9)
            java.lang.String r10 = "swipe_quote_enable"
            boolean r8 = r8.getBoolean(r10, r6)
            java.lang.String r11 = "swipe_repeat_enable"
            if (r8 != 0) goto L58
            r8.g r7 = r7.f7982a
            android.content.Context r7 = r7.f11620a
            android.content.SharedPreferences r7 = ub.b.c(r7, r9)
            boolean r7 = r7.getBoolean(r11, r6)
            if (r7 == 0) goto L727
        L58:
            lb.i r7 = r1.f7981b
            float r8 = r0.getX()
            float r12 = r0.getY()
            boolean r13 = r4 instanceof android.view.ViewGroup
            if (r13 == 0) goto L6a
            r13 = r4
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            goto L6b
        L6a:
            r13 = 0
        L6b:
            r14 = 1
            r15 = -1
            if (r13 == 0) goto Lb6
            int r16 = r13.getChildCount()
            int r16 = r16 + (-1)
            r5 = r16
        L77:
            if (r15 < r5) goto L7a
            goto Lb6
        L7a:
            android.view.View r6 = r13.getChildAt(r5)
            if (r6 == 0) goto Lb1
            int r14 = r6.getLeft()
            float r14 = (float) r14
            int r14 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r14 < 0) goto Lb1
            int r14 = r6.getRight()
            float r14 = (float) r14
            int r14 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r14 > 0) goto Lb1
            int r14 = r6.getTop()
            float r14 = (float) r14
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 < 0) goto Lb1
            int r14 = r6.getBottom()
            float r14 = (float) r14
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 <= 0) goto La5
            goto Lb1
        La5:
            lb.c r14 = r7.j(r6)
            if (r14 == 0) goto Lb1
            lb.b r5 = new lb.b
            r5.<init>(r6, r14)
            goto Lb7
        Lb1:
            int r5 = r5 + (-1)
            r6 = 0
            r14 = 1
            goto L77
        Lb6:
            r5 = 0
        Lb7:
            lb.i r6 = r1.f7981b
            java.util.Map r7 = r6.f7998q
            r7.getClass()
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r8 = r7.get(r4)
            if (r8 != 0) goto Ld2
            lb.g r8 = new lb.g
            r8.<init>()
            r8.f7972e = r3
            r8.f7979l = r15
            r7.put(r4, r8)
        Ld2:
            lb.g r8 = (lb.g) r8
            int r7 = r0.getActionMasked()
            r12 = 2
            if (r7 != r12) goto Lf1
            long r13 = r8.f7978k
            long r18 = r0.getEventTime()
            int r7 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r7 != 0) goto Lf1
            int r7 = r8.f7979l
            int r13 = r0.getActionMasked()
            if (r7 != r13) goto Lf1
            boolean r6 = r8.f7974g
            goto L71e
        Lf1:
            long r13 = r0.getEventTime()
            r8.f7978k = r13
            int r7 = r0.getActionMasked()
            r8.f7979l = r7
            int r7 = r0.getActionMasked()
            if (r7 == 0) goto L6fa
            r13 = 3
            r14 = 1
            if (r7 == r14) goto L28d
            if (r7 == r12) goto L10c
            if (r7 == r13) goto L28d
            goto L16e
        L10c:
            boolean r7 = r8.f7973f
            if (r7 != 0) goto L111
            goto L16e
        L111:
            boolean r7 = r8.f7977j
            if (r7 == 0) goto L117
            goto L28a
        L117:
            lb.b r7 = r8.f7970c
            if (r7 == 0) goto L11d
            r5 = r7
            goto L11f
        L11d:
            if (r5 == 0) goto L16e
        L11f:
            float r7 = r0.getRawX()
            float r13 = r8.f7968a
            float r7 = r7 - r13
            float r0 = r0.getRawY()
            float r13 = r8.f7969b
            float r0 = r0 - r13
            r8.g r13 = r6.f7982a
            android.content.Context r13 = r13.f11620a
            android.content.SharedPreferences r13 = ub.b.c(r13, r9)
            r14 = 0
            boolean r10 = r13.getBoolean(r10, r14)
            r8.g r13 = r6.f7982a
            android.content.Context r13 = r13.f11620a
            android.content.SharedPreferences r9 = ub.b.c(r13, r9)
            boolean r9 = r9.getBoolean(r11, r14)
            boolean r11 = r8.f7974g
            if (r11 != 0) goto L171
            float r11 = java.lang.Math.abs(r0)
            r13 = 1107296256(0x42000000, float:32.0)
            float r13 = r6.c(r13)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L171
            float r11 = java.lang.Math.abs(r0)
            float r13 = java.lang.Math.abs(r7)
            r14 = 1067030938(0x3f99999a, float:1.2)
            float r13 = r13 * r14
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L171
            lb.i.I(r8)
            r14 = 0
            r8.f7973f = r14
        L16e:
            r6 = 0
            goto L71e
        L171:
            boolean r11 = r8.f7974g
            r13 = 0
            if (r11 != 0) goto L1d8
            float r11 = java.lang.Math.abs(r7)
            r14 = 1086324736(0x40c00000, float:6.0)
            float r14 = r6.c(r14)
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 <= 0) goto L196
            float r11 = java.lang.Math.abs(r7)
            float r14 = java.lang.Math.abs(r0)
            r15 = 1066611507(0x3f933333, float:1.15)
            float r14 = r14 * r15
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 <= 0) goto L196
            r11 = 1
            goto L197
        L196:
            r11 = 0
        L197:
            float r14 = java.lang.Math.abs(r7)
            r15 = 1099956224(0x41900000, float:18.0)
            float r15 = r6.c(r15)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 <= 0) goto L1b7
            float r14 = java.lang.Math.abs(r7)
            float r0 = java.lang.Math.abs(r0)
            r15 = 1068289229(0x3faccccd, float:1.35)
            float r0 = r0 * r15
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1b7
            r0 = 1
            goto L1b8
        L1b7:
            r0 = 0
        L1b8:
            if (r11 == 0) goto L1c3
            int r11 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r11 >= 0) goto L1c3
            if (r10 == 0) goto L1c3
            lb.f r0 = lb.f.f7965h
            goto L1cf
        L1c3:
            if (r0 == 0) goto L1ce
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 <= 0) goto L1ce
            if (r9 == 0) goto L1ce
            lb.f r0 = lb.f.f7966i
            goto L1cf
        L1ce:
            r0 = r3
        L1cf:
            if (r0 != r3) goto L1d2
            goto L16e
        L1d2:
            r8.f7972e = r0
            r14 = 1
            r8.f7974g = r14
            goto L1d9
        L1d8:
            r14 = 1
        L1d9:
            lb.f r0 = r8.f7972e
            int r0 = r0.ordinal()
            if (r0 == 0) goto L16e
            if (r0 == r14) goto L1f0
            if (r0 != r12) goto L1eb
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 >= 0) goto L1f7
        L1e9:
            r7 = r13
            goto L1f7
        L1eb:
            okio.a.k()
            goto L727
        L1f0:
            float r0 = -r7
            int r3 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r3 >= 0) goto L1f6
            goto L1e9
        L1f6:
            r7 = r0
        L1f7:
            r0 = 1125515264(0x43160000, float:150.0)
            float r0 = r6.c(r0)
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 <= 0) goto L202
            r7 = r0
        L202:
            android.view.ViewParent r0 = r4.getParent()
            r14 = 1
            if (r0 == 0) goto L20c
            r0.requestDisallowInterceptTouchEvent(r14)
        L20c:
            lb.f r0 = r8.f7972e
            int r0 = r0.ordinal()
            if (r0 == 0) goto L22b
            if (r0 == r14) goto L224
            if (r0 != r12) goto L21f
            r0 = 1119354880(0x42b80000, float:92.0)
            float r0 = r6.c(r0)
            goto L22e
        L21f:
            okio.a.k()
            goto L727
        L224:
            r0 = 1112539136(0x42500000, float:52.0)
            float r0 = r6.c(r0)
            goto L22e
        L22b:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L22e:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L234
            r0 = 1
            goto L235
        L234:
            r0 = 0
        L235:
            r8.f7975h = r0
            android.view.View r0 = r5.f7953a
            android.view.View r3 = r8.f7971d
            if (r3 == r0) goto L245
            lb.i.I(r8)
            r8.f7971d = r0
            lb.i.b(r0)
        L245:
            r3 = 1124335616(0x43040000, float:132.0)
            float r3 = r6.c(r3)
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L250
            r7 = r3
        L250:
            lb.f r5 = r8.f7972e
            int r5 = r5.ordinal()
            if (r5 == 0) goto L268
            r14 = 1
            if (r5 == r14) goto L265
            if (r5 != r12) goto L260
            float r5 = r13 + r7
            goto L269
        L260:
            okio.a.k()
            goto L727
        L265:
            float r5 = r13 - r7
            goto L269
        L268:
            r5 = r13
        L269:
            r0.setTranslationX(r5)
            float r7 = r7 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r5 = r9.e0.q(r7, r13, r3)
            r6 = 1032805417(0x3d8f5c29, float:0.07)
            float r5 = r5 * r6
            float r3 = r3 - r5
            r0.setAlpha(r3)
            boolean r0 = r8.f7975h
            if (r0 == 0) goto L28a
            boolean r0 = r8.f7976i
            if (r0 != 0) goto L28a
            r0 = 4
            r4.performHapticFeedback(r0)
            r14 = 1
            r8.f7976i = r14
        L28a:
            r6 = 1
            goto L71e
        L28d:
            lb.b r7 = r8.f7970c
            if (r7 == 0) goto L292
            r5 = r7
        L292:
            int r0 = r0.getActionMasked()
            r14 = 1
            if (r0 != r14) goto L6c4
            boolean r0 = r8.f7975h
            if (r0 == 0) goto L6c4
            if (r5 == 0) goto L6c4
            lb.f r0 = r8.f7972e
            int r0 = r0.ordinal()
            if (r0 == 0) goto L6c4
            if (r0 == r14) goto L2bd
            if (r0 != r12) goto L2b8
            lb.c r0 = r5.f7954b
            boolean r0 = r6.F(r0)
            r14 = r0
            r22 = r3
            r23 = r4
            goto L6c9
        L2b8:
            okio.a.k()
            goto L727
        L2bd:
            android.view.View r0 = r5.f7953a
            lb.c r5 = r5.f7954b
            q8.m r7 = h.Hchat.hooks.api.core.WeChatApis.chatPage()
            if (r7 == 0) goto L2cc
            java.lang.String r7 = r7.a()
            goto L2cd
        L2cc:
            r7 = 0
        L2cd:
            java.lang.String r9 = ""
            if (r7 != 0) goto L2d2
            r7 = r9
        L2d2:
            int r10 = r7.length()
            if (r10 != 0) goto L2d9
            goto L2e1
        L2d9:
            java.lang.String r10 = r5.f7955a
            boolean r10 = r7.equals(r10)
            if (r10 != 0) goto L2e8
        L2e1:
            r22 = r3
            r23 = r4
        L2e5:
            r0 = 0
            goto L6c2
        L2e8:
            java.lang.ref.WeakReference r10 = r6.f7996o
            java.lang.Object r10 = r10.get()
            boolean r11 = r10 instanceof android.view.View
            if (r11 == 0) goto L2fc
            r11 = r10
            android.view.View r11 = (android.view.View) r11
            boolean r11 = r11.isAttachedToWindow()
            if (r11 == 0) goto L2fc
            goto L32e
        L2fc:
            android.view.View r0 = r0.getRootView()
            if (r0 == 0) goto L30a
            java.lang.Object r0 = r6.d(r0)
            if (r0 == 0) goto L30a
        L308:
            r10 = r0
            goto L32e
        L30a:
            q8.o r0 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r0 == 0) goto L315
            android.app.Activity r0 = r0.a()
            goto L316
        L315:
            r0 = 0
        L316:
            if (r0 == 0) goto L323
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L323
            android.view.View r0 = r0.getDecorView()
            goto L324
        L323:
            r0 = 0
        L324:
            if (r0 == 0) goto L32d
            java.lang.Object r0 = r6.d(r0)
            if (r0 == 0) goto L32d
            goto L308
        L32d:
            r10 = 0
        L32e:
            if (r10 == 0) goto L2e1
            java.lang.Object r0 = r5.f7957c
            java.util.concurrent.ConcurrentHashMap r11 = r6.f7988g
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r0)
            long r18 = lb.i.x(r0)
            java.lang.Class r15 = r0.getClass()
            r20 = r12
        L346:
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            if (r15 == 0) goto L3c3
            boolean r21 = r15.equals(r12)
            if (r21 != 0) goto L3c3
            java.util.List r12 = h.Hchat.utils.KavaReflector.declaredFields(r15)
            java.util.Iterator r12 = r12.iterator()
        L358:
            boolean r21 = r12.hasNext()
            if (r21 == 0) goto L3b9
            java.lang.Object r21 = r12.next()
            r13 = r21
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            java.lang.Object r13 = h.Hchat.utils.KavaReflector.readField(r13, r0)
            if (r13 == 0) goto L3b6
            if (r13 == r0) goto L3b3
            boolean r21 = r14.isEmpty()
            if (r21 == 0) goto L377
        L374:
            r22 = r0
            goto L38d
        L377:
            java.util.Iterator r21 = r14.iterator()
        L37b:
            boolean r22 = r21.hasNext()
            if (r22 == 0) goto L374
            r22 = r0
            java.lang.Object r0 = r21.next()
            if (r0 != r13) goto L38a
            goto L39c
        L38a:
            r0 = r22
            goto L37b
        L38d:
            java.lang.String r0 = "com.tencent.mm.storage."
            r1 = 0
            boolean r0 = eh.a.z(r0, r13, r1)
            r23 = 0
            if (r0 != 0) goto L3a2
            int r0 = (r18 > r23 ? 1 : (r18 == r23 ? 0 : -1))
            if (r0 > 0) goto L3a2
        L39c:
            r1 = r25
            r0 = r22
        L3a0:
            r13 = 3
            goto L358
        L3a2:
            int r0 = (r18 > r23 ? 1 : (r18 == r23 ? 0 : -1))
            if (r0 <= 0) goto L3af
            long r0 = lb.i.x(r13)
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 == 0) goto L3af
            goto L39c
        L3af:
            r14.add(r13)
            goto L39c
        L3b3:
            r22 = r0
            goto L39c
        L3b6:
            r1 = r25
            goto L3a0
        L3b9:
            r22 = r0
            java.lang.Class r15 = r15.getSuperclass()
            r1 = r25
            r13 = 3
            goto L346
        L3c3:
            java.util.Iterator r0 = r14.iterator()
        L3c7:
            boolean r1 = r0.hasNext()
            java.lang.Class r13 = java.lang.Void.TYPE
            if (r1 == 0) goto L4bf
            java.lang.Object r1 = r0.next()
            java.lang.Class r14 = r10.getClass()
            java.lang.Object r15 = r11.get(r14)
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            if (r15 == 0) goto L40e
            java.lang.Class[] r18 = r15.getParameterTypes()
            r18.getClass()
            java.lang.Object r18 = tf.l.z0(r18)
            r19 = r0
            r0 = r18
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L3f4
            if (r1 != 0) goto L3f7
        L3f4:
            r18 = r1
            goto L402
        L3f7:
            r18 = r1
            java.lang.Class r1 = r18.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            goto L403
        L402:
            r0 = 0
        L403:
            if (r0 == 0) goto L406
            goto L407
        L406:
            r15 = 0
        L407:
            if (r15 == 0) goto L412
            r23 = r4
            r0 = r15
            goto L491
        L40e:
            r19 = r0
            r18 = r1
        L412:
            r0 = r14
        L413:
            if (r0 == 0) goto L48e
            boolean r1 = r0.equals(r12)
            if (r1 != 0) goto L48e
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.Iterator r1 = r1.iterator()
        L423:
            boolean r15 = r1.hasNext()
            if (r15 == 0) goto L485
            java.lang.Object r15 = r1.next()
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            r21 = r0
            java.lang.Class[] r0 = r15.getParameterTypes()
            r22 = r1
            java.lang.Class r1 = r15.getReturnType()
            boolean r1 = gg.l.a(r1, r13)
            if (r1 == 0) goto L47c
            int r1 = r15.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L47c
            java.lang.String r1 = r15.getName()
            r23 = r4
            java.lang.String r4 = "setLastQuoteMsgInfo"
            boolean r1 = gg.l.a(r1, r4)
            if (r1 == 0) goto L47e
            int r1 = r0.length
            r4 = 1
            if (r1 != r4) goto L47e
            r16 = 0
            r0 = r0[r16]
            if (r0 == 0) goto L46f
            if (r18 != 0) goto L466
            goto L46f
        L466:
            java.lang.Class r1 = r18.getClass()
            boolean r0 = r0.isAssignableFrom(r1)
            goto L470
        L46f:
            r0 = 0
        L470:
            if (r0 == 0) goto L47e
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.accessible(r15)
            if (r0 == 0) goto L491
            r11.put(r14, r0)
            goto L491
        L47c:
            r23 = r4
        L47e:
            r0 = r21
            r1 = r22
            r4 = r23
            goto L423
        L485:
            r21 = r0
            r23 = r4
            java.lang.Class r0 = r21.getSuperclass()
            goto L413
        L48e:
            r23 = r4
            r0 = 0
        L491:
            if (r0 == 0) goto L4b9
            java.lang.Object[] r1 = new java.lang.Object[]{r18}
            boolean r0 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r0, r10, r1)
            if (r0 == 0) goto L4b2
            long r0 = r5.f7956b
            r6.r(r10, r0)
            r6.D(r10)
            long r0 = r5.f7956b
            r6.C(r10, r0)
            r6.k(r10)
            r22 = r3
        L4af:
            r0 = 1
            goto L6c2
        L4b2:
            java.lang.Class r0 = r10.getClass()
            r11.remove(r0)
        L4b9:
            r0 = r19
            r4 = r23
            goto L3c7
        L4bf:
            r23 = r4
            long r14 = r5.f7956b
            java.lang.Object r1 = r5.f7957c
            java.lang.Class r4 = r10.getClass()
            java.lang.reflect.Method r0 = r6.f7995n
            if (r0 == 0) goto L4d3
            r22 = r3
            r18 = r14
            goto L599
        L4d3:
            java.lang.String r11 = r6.y()
            android.content.SharedPreferences r0 = r6.f8002u
            r18 = r14
            r8.g r14 = r6.f7982a
            java.lang.ClassLoader r14 = r14.f11622c
            java.lang.String r15 = "quote_method"
            java.lang.reflect.Method r0 = e8.b.c(r0, r11, r14, r15)
            if (r0 == 0) goto L4fd
            boolean r14 = lb.i.t(r0)
            if (r14 == 0) goto L4ee
            goto L4ef
        L4ee:
            r0 = 0
        L4ef:
            if (r0 == 0) goto L4fd
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.accessible(r0)
            r6.f7995n = r0
            java.lang.reflect.Method r0 = r6.f7995n
            r22 = r3
            goto L599
        L4fd:
            r8.g r0 = r6.f7982a     // Catch: java.lang.Throwable -> L555
            org.luckypray.dexkit.DexKitBridge r0 = r0.f11623d     // Catch: java.lang.Throwable -> L555
            ch.e r14 = new ch.e     // Catch: java.lang.Throwable -> L555
            r14.<init>()     // Catch: java.lang.Throwable -> L555
            fh.k r2 = new fh.k     // Catch: java.lang.Throwable -> L555
            r2.<init>()     // Catch: java.lang.Throwable -> L555
            java.lang.String r21 = "invalid quote msg id"
            r22 = r3
            java.util.List r3 = a.a.x0(r21)     // Catch: java.lang.Throwable -> L54d
            fh.k.u0(r2, r3)     // Catch: java.lang.Throwable -> L54d
            r14.f1666h = r2     // Catch: java.lang.Throwable -> L54d
            hh.p r0 = r0.findMethod(r14)     // Catch: java.lang.Throwable -> L54d
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L54d
        L520:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L54d
            if (r0 == 0) goto L553
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L54d
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L54d
            r8.g r3 = r6.f7982a     // Catch: java.lang.Throwable -> L535
            java.lang.ClassLoader r3 = r3.f11622c     // Catch: java.lang.Throwable -> L535
            java.lang.reflect.Method r0 = r0.r(r3)     // Catch: java.lang.Throwable -> L535
            goto L53c
        L535:
            r0 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L54d
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L54d
            r0 = r3
        L53c:
            boolean r3 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L54d
            if (r3 == 0) goto L542
            r0 = 0
        L542:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L54d
            if (r0 == 0) goto L54f
            boolean r3 = lb.i.t(r0)     // Catch: java.lang.Throwable -> L54d
            if (r3 == 0) goto L54f
            goto L550
        L54d:
            r0 = move-exception
            goto L558
        L54f:
            r0 = 0
        L550:
            if (r0 == 0) goto L520
            goto L55e
        L553:
            r0 = 0
            goto L55e
        L555:
            r0 = move-exception
            r22 = r3
        L558:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L55e:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L564
            r0 = 0
        L564:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L574
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.accessible(r0)
            r6.f7995n = r2
            android.content.SharedPreferences r2 = r6.f8002u
            e8.b.h(r2, r11, r15, r0)
            goto L597
        L574:
            android.content.SharedPreferences r0 = r6.f8002u
            java.lang.String r2 = "cache.key"
            r0.getClass()
            android.content.SharedPreferences$Editor r3 = r0.edit()     // Catch: java.lang.Throwable -> L597
            java.lang.String r0 = r0.getString(r2, r9)     // Catch: java.lang.Throwable -> L597
            boolean r0 = gg.l.a(r0, r11)     // Catch: java.lang.Throwable -> L597
            if (r0 != 0) goto L590
            android.content.SharedPreferences$Editor r0 = r3.clear()     // Catch: java.lang.Throwable -> L597
            r0.putString(r2, r11)     // Catch: java.lang.Throwable -> L597
        L590:
            android.content.SharedPreferences$Editor r0 = r3.remove(r15)     // Catch: java.lang.Throwable -> L597
            r0.apply()     // Catch: java.lang.Throwable -> L597
        L597:
            java.lang.reflect.Method r0 = r6.f7995n
        L599:
            if (r0 == 0) goto L5b5
            java.lang.Class r2 = r0.getDeclaringClass()
            boolean r2 = r4.isAssignableFrom(r2)
            if (r2 != 0) goto L5b1
            java.lang.Class r2 = r0.getDeclaringClass()
            boolean r2 = r2.isAssignableFrom(r4)
            if (r2 == 0) goto L5b0
            goto L5b1
        L5b0:
            r0 = 0
        L5b1:
            if (r0 == 0) goto L5b5
            goto L654
        L5b5:
            java.util.concurrent.ConcurrentHashMap r0 = r6.f7987f
            java.lang.Object r0 = r0.get(r4)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L5c1
            goto L654
        L5c1:
            r0 = r4
        L5c2:
            if (r0 == 0) goto L653
            boolean r2 = r0.equals(r12)
            if (r2 != 0) goto L653
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.Iterator r2 = r2.iterator()
        L5d2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L64d
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class[] r9 = r3.getParameterTypes()
            java.lang.Class r11 = r3.getReturnType()
            boolean r11 = gg.l.a(r11, r13)
            if (r11 == 0) goto L5d2
            int r11 = r3.getModifiers()
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)
            if (r11 != 0) goto L5d2
            int r11 = r9.length
            r14 = 3
            if (r11 != r14) goto L5d2
            r16 = 0
            r11 = r9[r16]
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            boolean r11 = gg.l.a(r11, r15)
            if (r11 == 0) goto L5d2
            r17 = 1
            r11 = r9[r17]
            java.lang.Class r15 = java.lang.Long.TYPE
            boolean r11 = gg.l.a(r11, r15)
            if (r11 != 0) goto L61c
            r11 = r9[r17]
            java.lang.Class<java.lang.Long> r15 = java.lang.Long.class
            boolean r11 = gg.l.a(r11, r15)
            if (r11 == 0) goto L5d2
        L61c:
            r11 = r9[r20]
            boolean r11 = r11.isPrimitive()
            if (r11 != 0) goto L5d2
            r11 = r9[r20]
            java.lang.String r11 = r11.getName()
            java.lang.String r15 = "java."
            r14 = 0
            boolean r11 = og.t.d0(r11, r15, r14)
            if (r11 != 0) goto L5d2
            r9 = r9[r20]
            java.lang.String r9 = r9.getName()
            java.lang.String r11 = "android."
            boolean r9 = og.t.d0(r9, r11, r14)
            if (r9 != 0) goto L5d2
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.accessible(r3)
            if (r0 == 0) goto L654
            java.util.concurrent.ConcurrentHashMap r2 = r6.f7987f
            r2.put(r4, r0)
            goto L654
        L64d:
            java.lang.Class r0 = r0.getSuperclass()
            goto L5c2
        L653:
            r0 = 0
        L654:
            if (r0 == 0) goto L6ad
            java.lang.Long r2 = java.lang.Long.valueOf(r18)
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[]{r7, r2, r3}
            boolean r2 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r0, r10, r2)
            if (r2 == 0) goto L666
            goto L691
        L666:
            java.lang.Class[] r2 = r0.getParameterTypes()
            r2.getClass()
            r3 = r20
            java.lang.Object r2 = tf.l.C0(r3, r2)
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 == 0) goto L680
            java.lang.Class r3 = r1.getClass()
            boolean r14 = r2.isAssignableFrom(r3)
            goto L681
        L680:
            r14 = 0
        L681:
            if (r14 == 0) goto L699
            java.lang.Long r2 = java.lang.Long.valueOf(r18)
            java.lang.Object[] r1 = new java.lang.Object[]{r7, r2, r1}
            boolean r1 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r0, r10, r1)
            if (r1 == 0) goto L699
        L691:
            r6.D(r10)
            r6.k(r10)
            goto L4af
        L699:
            java.util.concurrent.ConcurrentHashMap r1 = r6.f7987f
            java.lang.Class r2 = r10.getClass()
            r1.remove(r2)
            java.lang.reflect.Method r1 = r6.f7995n
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6ad
            r3 = 0
            r6.f7995n = r3
        L6ad:
            long r0 = r5.f7956b
            boolean r0 = r6.r(r10, r0)
            if (r0 == 0) goto L2e5
            r6.D(r10)
            long r0 = r5.f7956b
            r6.C(r10, r0)
            r6.k(r10)
            goto L4af
        L6c2:
            r14 = r0
            goto L6c9
        L6c4:
            r22 = r3
            r23 = r4
            r14 = 0
        L6c9:
            if (r14 == 0) goto L6ce
            r14 = 1
            r8.f7977j = r14
        L6ce:
            boolean r0 = r8.f7974g
            if (r0 != 0) goto L6d9
            boolean r0 = r8.f7977j
            if (r0 == 0) goto L6d7
            goto L6d9
        L6d7:
            r14 = 0
            goto L6da
        L6d9:
            r14 = 1
        L6da:
            lb.i.I(r8)
            r1 = 0
            r8.f7973f = r1
            r8.f7977j = r1
            r3 = 0
            r8.f7970c = r3
            r2 = r22
            r8.f7972e = r2
            r8.f7974g = r1
            r8.f7975h = r1
            r8.f7976i = r1
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L6f8
            r0.requestDisallowInterceptTouchEvent(r1)
        L6f8:
            r6 = r14
            goto L71e
        L6fa:
            r2 = r3
            r1 = 0
            lb.i.I(r8)
            float r3 = r0.getRawX()
            r8.f7968a = r3
            float r0 = r0.getRawY()
            r8.f7969b = r0
            r8.f7970c = r5
            r8.f7972e = r2
            r8.f7974g = r1
            r8.f7975h = r1
            r8.f7976i = r1
            r14 = 1
            r8.f7973f = r14
            r8.f7977j = r1
            r3 = 0
            r8.f7971d = r3
            r6 = r1
        L71e:
            if (r6 == 0) goto L727
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2 = r26
            r2.setResult(r0)
        L727:
            return
    }
}
