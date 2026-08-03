package wa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.ClassLoader f14915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f14916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f14917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final okio.a f14918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b5.c f14919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wa.e f14920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f14921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f14922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f14923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f14924j;

    public g(java.lang.ClassLoader r2, h.Hchat.dexkit.DexFinder r3, android.content.SharedPreferences r4, b5.c r5, okio.a r6) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f14921g = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f14922h = r0
            r1.f14915a = r2
            r1.f14916b = r3
            r1.f14917c = r4
            r1.f14919e = r5
            r1.f14918d = r6
            wa.e r4 = new wa.e
            r4.<init>(r3, r2)
            r1.f14920f = r4
            return
    }

    public static void b(java.util.ArrayList r1, java.lang.Class r2) {
            if (r2 == 0) goto L11
            boolean r0 = r2.isInterface()
            if (r0 != 0) goto L11
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L11
            r1.add(r2)
        L11:
            return
    }

    public static void c(java.lang.String r9, java.lang.String r10, int r11, byte[] r12) {
            java.util.concurrent.CopyOnWriteArrayList r0 = wa.j.f14927c
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L9
            goto L37
        L9:
            long r7 = java.lang.System.currentTimeMillis()
            h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet r2 = new h.Hchat.hooks.items.protobuf.ProtobufPacketRuntime$Packet
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.Iterator r9 = r0.iterator()
        L1a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L37
            java.lang.Object r10 = r9.next()
            wa.i r10 = (wa.i) r10
            eb.x r10 = (eb.x) r10     // Catch: java.lang.Throwable -> L2f
            r10.getClass()     // Catch: java.lang.Throwable -> L2f
            h.Hchat.hooks.items.script.ScriptPluginRuntime.a(r2)     // Catch: java.lang.Throwable -> L2f
            goto L1a
        L2f:
            r0 = move-exception
            r10 = r0
            java.lang.String r11 = "[Hchat:Protobuf] 数据包监听器处理失败"
            fb.v0.n(r11, r10)
            goto L1a
        L37:
            return
    }

    public static java.lang.Object e(java.lang.Object r3, java.lang.String r4) {
            if (r3 == 0) goto L7
            java.lang.Class r0 = r3.getClass()
            goto L8
        L7:
            r0 = 0
        L8:
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findMethod(r0, r4, r2)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r4, r3, r0)
            return r3
    }

    public static void h(java.lang.String r1) {
            java.lang.String r0 = "[Hchat:Protobuf] "
            java.lang.String r1 = r0.concat(r1)
            de.robv.android.xposed.XposedBridge.log(r1)
            return
    }

    public static java.lang.Object i(java.lang.Object r4) {
            if (r4 != 0) goto L3
            goto L3e
        L3:
            java.lang.String r0 = "a"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r4, r0)     // Catch: java.lang.Throwable -> L10
            boolean r1 = o(r0)     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L10
            return r0
        L10:
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L3e
        L14:
            if (r0 == 0) goto L3e
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto L3e
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r0)     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3e
        L22:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r4)     // Catch: java.lang.Throwable -> L22
            boolean r3 = o(r2)     // Catch: java.lang.Throwable -> L22
            if (r3 == 0) goto L22
            return r2
        L39:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L3e
            goto L14
        L3e:
            r4 = 0
            return r4
    }

    public static boolean o(java.lang.Object r4) {
            r0 = 0
            if (r4 == 0) goto L25
            java.lang.Class r1 = r4.getClass()
            java.lang.String r2 = "toByteArray"
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findMethod(r1, r2, r3)
            if (r1 == 0) goto L25
            java.lang.Class r4 = r4.getClass()
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.String r2 = "parseFrom"
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findMethod(r4, r2, r1)
            if (r4 == 0) goto L25
            r4 = 1
            return r4
        L25:
            return r0
    }

    public static byte[] u(java.lang.Object r1) {
            if (r1 != 0) goto L3
            goto L10
        L3:
            java.lang.String r0 = "toByteArray"
            java.lang.Object r1 = e(r1, r0)     // Catch: java.lang.Throwable -> L10
            boolean r0 = r1 instanceof byte[]     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L10
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = 0
            return r1
    }

    public final void a(java.lang.String r2, java.util.ArrayList r3) {
            r1 = this;
            java.lang.ClassLoader r0 = r1.f14915a     // Catch: java.lang.Throwable -> L11
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r0)     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L11
            boolean r0 = r3.contains(r2)     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L11
            r3.add(r2)     // Catch: java.lang.Throwable -> L11
        L11:
            return
    }

    public final java.lang.Object d(java.lang.Class r23, org.json.JSONObject r24, int r25) {
            r22 = this;
            r0 = r25
            wa.e r1 = new wa.e
            r1.<init>()
            r2 = r24
            r1.c(r2)
            java.lang.Object r2 = r1.f14907a
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L1c
        L16:
            r3 = r22
            r24 = 0
            goto L1bf
        L1c:
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredConstructors(r23)
            java.util.Iterator r3 = r3.iterator()
        L24:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L16
            java.lang.Object r5 = r3.next()
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            java.lang.Class[] r6 = r5.getParameterTypes()
            if (r6 == 0) goto L39
            int r7 = r6.length
            if (r7 != 0) goto L40
        L39:
            r16 = r2
            r17 = r3
            r24 = 0
            goto L71
        L40:
            int r7 = r6.length
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r8 = r6.length
            r10 = 0
            r11 = 0
        L46:
            java.lang.Class<java.lang.Boolean> r12 = java.lang.Boolean.class
            java.lang.Class r13 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Long> r14 = java.lang.Long.class
            java.lang.Class r15 = java.lang.Long.TYPE
            r24 = 0
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            java.lang.Class r9 = java.lang.Integer.TYPE
            r16 = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r10 >= r8) goto L7c
            r17 = r3
            r3 = r6[r10]
            if (r3 != r2) goto L62
            int r11 = r11 + 1
        L62:
            if (r3 == r2) goto L75
            if (r3 == r9) goto L75
            if (r3 == r4) goto L75
            if (r3 == r15) goto L75
            if (r3 == r14) goto L75
            if (r3 == r13) goto L75
            if (r3 != r12) goto L71
            goto L75
        L71:
            r7 = r24
            goto L171
        L75:
            int r10 = r10 + 1
            r2 = r16
            r3 = r17
            goto L46
        L7c:
            r17 = r3
            if (r11 <= 0) goto L9a
            java.util.ArrayList r3 = r1.h()
            java.util.Iterator r3 = r3.iterator()
        L88:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L71
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L88
        L9a:
            r3 = 0
            r8 = 0
            r10 = 0
        L9d:
            int r11 = r6.length
            if (r3 >= r11) goto L171
            r11 = r6[r3]
            if (r11 != r2) goto Lc4
            int r11 = r8 + 1
            r18 = r2
            java.util.ArrayList r2 = r1.h()
            r19 = r3
            if (r8 < 0) goto Lbd
            int r3 = r2.size()
            if (r8 >= r3) goto Lbd
            java.lang.Object r2 = r2.get(r8)
            java.lang.String r2 = (java.lang.String) r2
            goto Lbf
        Lbd:
            java.lang.String r2 = ""
        Lbf:
            r7[r19] = r2
            r8 = r11
            goto L16b
        Lc4:
            r18 = r2
            r19 = r3
            if (r11 == r9) goto Le6
            if (r11 != r4) goto Lcd
            goto Le6
        Lcd:
            if (r11 == r15) goto Ldc
            if (r11 != r14) goto Ld2
            goto Ldc
        Ld2:
            if (r11 == r13) goto Ld6
            if (r11 != r12) goto L16b
        Ld6:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r7[r19] = r2
            goto L16b
        Ldc:
            r2 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r7[r19] = r2
            goto L16b
        Le6:
            int r2 = r10 + 1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r20 = r2
            r11 = 0
        Lf0:
            r2 = 4
            if (r11 >= r2) goto L119
            java.lang.String[] r2 = wa.e.f14906d
            r2 = r2[r11]
            java.lang.String r2 = r1.k(r2)
            boolean r21 = android.text.TextUtils.isEmpty(r2)
            if (r21 == 0) goto L102
            goto L10f
        L102:
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L10f
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L10f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L10f
            goto L111
        L10f:
            r2 = r24
        L111:
            if (r2 == 0) goto L116
            r3.add(r2)
        L116:
            int r11 = r11 + 1
            goto Lf0
        L119:
            java.util.Collection r2 = r16.values()
            java.util.Iterator r2 = r2.iterator()
        L121:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L14f
            java.lang.Object r11 = r2.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r21 = android.text.TextUtils.isEmpty(r11)
            if (r21 == 0) goto L134
            goto L141
        L134:
            java.lang.String r11 = r11.trim()     // Catch: java.lang.Throwable -> L141
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Throwable -> L141
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L141
            goto L143
        L141:
            r11 = r24
        L143:
            if (r11 == 0) goto L121
            boolean r21 = r3.contains(r11)
            if (r21 != 0) goto L121
            r3.add(r11)
            goto L121
        L14f:
            if (r10 < 0) goto L162
            int r2 = r3.size()
            if (r10 >= r2) goto L162
            java.lang.Object r2 = r3.get(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L163
        L162:
            r2 = 0
        L163:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r19] = r2
            r10 = r20
        L16b:
            int r3 = r19 + 1
            r2 = r18
            goto L9d
        L171:
            if (r7 != 0) goto L179
        L173:
            r2 = r16
            r3 = r17
            goto L24
        L179:
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.newInstance(r5, r7)
            if (r2 != 0) goto L180
            goto L173
        L180:
            r3 = -1
            java.lang.String r4 = "getType"
            java.lang.Object r4 = e(r2, r4)     // Catch: java.lang.Throwable -> L191
            boolean r6 = r4 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L191
            if (r6 == 0) goto L191
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L191
            int r3 = r4.intValue()     // Catch: java.lang.Throwable -> L191
        L191:
            if (r3 != r0) goto L1bc
            java.lang.String r1 = "原生场景参数: type="
            java.lang.String r3 = " ctor="
            java.lang.StringBuilder r0 = eh.a.t(r0, r1, r3)
            int r1 = r5.getParameterCount()
            r0.append(r1)
            java.lang.String r1 = " query="
            r0.append(r1)
            java.util.Set r1 = r16.keySet()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3 = r22
            r3.p(r0)
            return r2
        L1bc:
            r3 = r22
            goto L173
        L1bf:
            return r24
    }

    public final java.util.ArrayList f() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "com.tencent.mm.modelbase.m1"
            r4.a(r1, r0)
            java.lang.String r1 = "com.tencent.mm.modelbase.k1"
            r4.a(r1, r0)
            java.lang.String r1 = "com.tencent.mm.modelbase.l1"
            r4.a(r1, r0)
            java.lang.String r1 = "com.tencent.mm.modelbase.n1"
            r4.a(r1, r0)
            h.Hchat.dexkit.DexFinder r1 = r4.f14916b
            if (r1 == 0) goto L3d
            java.util.List<java.lang.Class<?>> r1 = r1.packetBaseClasses
            if (r1 == 0) goto L3d
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 == 0) goto L25
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L25
            r0.add(r2)
            goto L25
        L3d:
            return r0
    }

    public final void g(java.util.ArrayList r7, java.lang.Class r8) {
            r6 = this;
            if (r8 != 0) goto L3
            goto L68
        L3:
            boolean r0 = r8.isInterface()
            if (r0 == 0) goto L53
            h.Hchat.dexkit.DexFinder r0 = r6.f14916b
            if (r0 != 0) goto Le
            goto L68
        Le:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<java.lang.Class<?>> r2 = r0.packetBaseClasses
            if (r2 == 0) goto L1a
            r1.addAll(r2)
        L1a:
            java.util.List<java.lang.Class<?>> r0 = r0.netQueueCandidateClasses
            if (r0 == 0) goto L21
            r1.addAll(r0)
        L21:
            java.util.Iterator r0 = r1.iterator()
        L25:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 != 0) goto L34
            goto L25
        L34:
            boolean r2 = r8.isAssignableFrom(r1)
            if (r2 == 0) goto L3d
            b(r7, r1)
        L3d:
            java.lang.Class[] r1 = r1.getDeclaredClasses()
            int r2 = r1.length
            r3 = 0
        L43:
            if (r3 >= r2) goto L25
            r4 = r1[r3]
            boolean r5 = r8.isAssignableFrom(r4)
            if (r5 == 0) goto L50
            b(r7, r4)
        L50:
            int r3 = r3 + 1
            goto L43
        L53:
            b(r7, r8)
            java.lang.Class r8 = r8.getSuperclass()
        L5a:
            if (r8 == 0) goto L68
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r8 == r0) goto L68
            b(r7, r8)
            java.lang.Class r8 = r8.getSuperclass()
            goto L5a
        L68:
            return
    }

    public final wa.f j(int r12, java.lang.String r13) {
            r11 = this;
            if (r13 != 0) goto L5
            java.lang.String r13 = ""
            goto L9
        L5:
            java.lang.String r13 = r13.trim()
        L9:
            long r0 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r2 = r11.f14921g
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L18:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r2.next()
            wa.f r4 = (wa.f) r4
            int r5 = r4.f14910b
            if (r5 == r12) goto L29
            goto L18
        L29:
            java.lang.String r5 = r4.f14909a
            boolean r5 = r13.equals(r5)
            if (r5 != 0) goto L32
            goto L18
        L32:
            long r5 = r4.f14914f
            long r7 = r0 - r5
            r9 = 600000(0x927c0, double:2.964394E-318)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L3e
            goto L18
        L3e:
            if (r3 == 0) goto L46
            long r7 = r3.f14914f
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L18
        L46:
            r3 = r4
            goto L18
        L48:
            java.lang.String r0 = " uri="
            if (r3 == 0) goto L76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "快照命中: type="
            r1.<init>(r2)
            r1.append(r12)
            r1.append(r0)
            r1.append(r13)
            java.lang.String r12 = " req="
            r1.append(r12)
            java.lang.Object r12 = r3.f14912d
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r11.p(r12)
            return r3
        L76:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "快照未命中: type="
            r1.<init>(r2)
            r1.append(r12)
            r1.append(r0)
            r1.append(r13)
            java.lang.String r12 = r1.toString()
            r11.p(r12)
            return r3
    }

    public final void k() {
            r6 = this;
            boolean r0 = r6.f14924j
            if (r0 != 0) goto La6
            h.Hchat.dexkit.DexFinder r0 = r6.f14916b
            if (r0 == 0) goto La6
            java.lang.Class<?> r0 = r0.protobufNetSceneBaseClass
            if (r0 != 0) goto Le
            goto La6
        Le:
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L31
            r0.<init>()     // Catch: java.lang.Throwable -> L31
            h.Hchat.dexkit.DexFinder r1 = r6.f14916b     // Catch: java.lang.Throwable -> L31
            java.util.List<java.lang.reflect.Method> r1 = r1.protobufSceneEndMethods     // Catch: java.lang.Throwable -> L31
            r2 = 0
            if (r1 == 0) goto L33
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L31
            r3 = r2
        L1f:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L34
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L31
            int r4 = r6.l(r4, r0)     // Catch: java.lang.Throwable -> L31
            int r3 = r3 + r4
            goto L1f
        L31:
            r0 = move-exception
            goto L91
        L33:
            r3 = r2
        L34:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            h.Hchat.dexkit.DexFinder r4 = r6.f14916b     // Catch: java.lang.Throwable -> L31
            java.lang.Class<?> r4 = r4.protobufOnGYNetEndClass     // Catch: java.lang.Throwable -> L31
            r6.g(r1, r4)     // Catch: java.lang.Throwable -> L31
            h.Hchat.dexkit.DexFinder r4 = r6.f14916b     // Catch: java.lang.Throwable -> L31
            java.util.List<java.lang.Class<?>> r4 = r4.packetBaseClasses     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L5a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L31
        L4a:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L31
            java.lang.Class r5 = (java.lang.Class) r5     // Catch: java.lang.Throwable -> L31
            r6.g(r1, r5)     // Catch: java.lang.Throwable -> L31
            goto L4a
        L5a:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L31
        L5e:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L84
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L31
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Throwable -> L31
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r4)     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L31
        L72:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L5e
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L31
            int r5 = r6.l(r5, r0)     // Catch: java.lang.Throwable -> L31
            int r3 = r3 + r5
            goto L72
        L84:
            if (r3 <= 0) goto L87
            r2 = 1
        L87:
            r6.f14924j = r2     // Catch: java.lang.Throwable -> L31
            if (r3 > 0) goto La6
            java.lang.String r0 = "Hook通用发包回调隔离失败: 未找到onSceneEnd"
            h(r0)     // Catch: java.lang.Throwable -> L31
            return
        L91:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Hook通用发包回调隔离失败: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            h(r0)
        La6:
            return
    }

    public final int l(java.lang.reflect.Method r6, java.util.HashSet r7) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L71
            java.lang.String r1 = "onSceneEnd"
            java.lang.String r2 = r6.getName()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L10
            goto L71
        L10:
            java.lang.Class[] r1 = r6.getParameterTypes()
            if (r1 == 0) goto L71
            int r2 = r1.length
            r3 = 4
            if (r2 != r3) goto L71
            r2 = r1[r0]
            java.lang.Class r3 = java.lang.Integer.TYPE
            if (r2 != r3) goto L71
            r2 = 1
            r4 = r1[r2]
            if (r4 != r3) goto L71
            r3 = 2
            r3 = r1[r3]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 != r4) goto L71
            h.Hchat.dexkit.DexFinder r3 = r5.f14916b
            if (r3 == 0) goto L71
            java.lang.Class<?> r3 = r3.protobufNetSceneBaseClass
            if (r3 == 0) goto L71
            r4 = 3
            r1 = r1[r4]
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L71
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r3 = r6.getDeclaringClass()
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = "#"
            r1.append(r3)
            java.lang.String r3 = r6.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            boolean r7 = r7.add(r1)
            if (r7 != 0) goto L64
            goto L71
        L64:
            r8.i r7 = r8.i.f11631b
            ba.f r0 = new ba.f
            r1 = 27
            r0.<init>(r1)
            r7.b(r6, r0)
            return r2
        L71:
            return r0
    }

    public final boolean m() {
            r11 = this;
            boolean r0 = r11.f14923i
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 0
            java.util.ArrayList r2 = r11.f()     // Catch: java.lang.Throwable -> L7d
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L7d
            r3.<init>()     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L7d
            r4 = r0
        L15:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L7d
            java.lang.Class r5 = (java.lang.Class) r5     // Catch: java.lang.Throwable -> L7d
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredMethods(r5)     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L7d
        L29:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto L15
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L7d
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L7d
            java.lang.String r8 = "dispatch"
            java.lang.String r9 = r7.getName()     // Catch: java.lang.Throwable -> L7d
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Throwable -> L7d
            if (r8 != 0) goto L42
            goto L29
        L42:
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L7d
            int r8 = r8.length     // Catch: java.lang.Throwable -> L7d
            r9 = 3
            if (r8 == r9) goto L4b
            goto L29
        L4b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r8.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L7d
            r8.append(r9)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r9 = "#"
            r8.append(r9)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r9 = r7.toString()     // Catch: java.lang.Throwable -> L7d
            r8.append(r9)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L7d
            boolean r8 = r3.add(r8)     // Catch: java.lang.Throwable -> L7d
            if (r8 != 0) goto L6e
            goto L29
        L6e:
            r8.i r8 = r8.i.f11631b     // Catch: java.lang.Throwable -> L7d
            b9.e r9 = new b9.e     // Catch: java.lang.Throwable -> L7d
            r10 = 29
            r9.<init>(r11, r10)     // Catch: java.lang.Throwable -> L7d
            r8.b(r7, r9)     // Catch: java.lang.Throwable -> L7d
            int r4 = r4 + 1
            goto L29
        L7d:
            r1 = move-exception
            goto L92
        L7f:
            r11.k()     // Catch: java.lang.Throwable -> L7d
            if (r4 <= 0) goto L85
            goto L86
        L85:
            r1 = r0
        L86:
            r11.f14923i = r1     // Catch: java.lang.Throwable -> L7d
            if (r4 > 0) goto L8f
            java.lang.String r1 = "Hook失败: 未找到dispatch"
            h(r1)     // Catch: java.lang.Throwable -> L7d
        L8f:
            boolean r0 = r11.f14923i     // Catch: java.lang.Throwable -> L7d
            return r0
        L92:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Hook失败: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            h(r1)
            return r0
    }

    public final boolean n(int r7) {
            r6 = this;
            java.lang.String r0 = "25694,14186,5171,11421,389,3565,138,1948,211,29710,996,4326,4687,4768,28920,379,8674"
            android.content.SharedPreferences r1 = r6.f14917c
            if (r1 != 0) goto L7
            goto Ld
        L7:
            java.lang.String r2 = "protobuf_packet_block_types"
            java.lang.String r0 = r1.getString(r2, r0)
        Ld:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = "[,，|\\s]+"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = r2
        L1d:
            if (r3 >= r1) goto L37
            r4 = r0[r3]
            int r5 = r4.length()
            if (r5 != 0) goto L28
            goto L34
        L28:
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L34
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L34
            if (r4 != r7) goto L34
            r7 = 1
            return r7
        L34:
            int r3 = r3 + 1
            goto L1d
        L37:
            return r2
    }

    public final void p(java.lang.String r2) {
            r1 = this;
            okio.a r0 = r1.f14918d
            if (r0 == 0) goto Ld
            java.lang.String r0 = "[Hchat:Protobuf] "
            java.lang.String r2 = r0.concat(r2)
            de.robv.android.xposed.XposedBridge.log(r2)
        Ld:
            return
    }

    public final void q(java.lang.String r12, java.lang.String r13, int r14, byte[] r15) {
            r11 = this;
            org.json.JSONObject r0 = ig.a.Z(r15)     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            java.lang.String r0 = "{}"
        Lb:
            java.lang.String r1 = "[Hchat:Protobuf] "
            java.lang.String r2 = "\nUri: "
            java.lang.String r3 = "\nType: "
            java.lang.StringBuilder r1 = bc.e.p(r1, r12, r2, r13, r3)
            r1.append(r14)
            java.lang.String r2 = "\nLen: "
            r1.append(r2)
            int r2 = r15.length
            r1.append(r2)
            java.lang.String r2 = "\nJson: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            de.robv.android.xposed.XposedBridge.log(r1)
            b5.c r1 = r11.f14919e
            if (r1 == 0) goto Lbc
            int r15 = r15.length
            java.lang.String r2 = "[Hchat:Protobuf] 写入抓包文件失败: "
            java.lang.String r3 = "\nJson: "
            java.lang.String r4 = "\nLen: "
            java.lang.String r5 = "\nType: "
            java.lang.String r6 = "\nUri: "
            java.lang.String r7 = "----- "
            monitor-enter(r1)
            r0.getClass()     // Catch: java.lang.Throwable -> Lb9
            java.io.File r8 = r1.E()     // Catch: java.lang.Throwable -> L57
            boolean r9 = r8.isDirectory()     // Catch: java.lang.Throwable -> L57
            if (r9 != 0) goto L59
            boolean r9 = r8.mkdirs()     // Catch: java.lang.Throwable -> L57
            if (r9 != 0) goto L59
            monitor-exit(r1)
            goto Lbc
        L57:
            r12 = move-exception
            goto La4
        L59:
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L57
            java.lang.String r10 = r1.f()     // Catch: java.lang.Throwable -> L57
            r9.<init>(r8, r10)     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L57
            java.lang.Object r7 = r1.f470b     // Catch: java.lang.Throwable -> L57
            java.text.SimpleDateFormat r7 = (java.text.SimpleDateFormat) r7     // Catch: java.lang.Throwable -> L57
            java.util.Date r10 = new java.util.Date     // Catch: java.lang.Throwable -> L57
            r10.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r7 = r7.format(r10)     // Catch: java.lang.Throwable -> L57
            r8.append(r7)     // Catch: java.lang.Throwable -> L57
            java.lang.String r7 = " -----\n"
            r8.append(r7)     // Catch: java.lang.Throwable -> L57
            r8.append(r12)     // Catch: java.lang.Throwable -> L57
            r8.append(r6)     // Catch: java.lang.Throwable -> L57
            r8.append(r13)     // Catch: java.lang.Throwable -> L57
            r8.append(r5)     // Catch: java.lang.Throwable -> L57
            r8.append(r14)     // Catch: java.lang.Throwable -> L57
            r8.append(r4)     // Catch: java.lang.Throwable -> L57
            r8.append(r15)     // Catch: java.lang.Throwable -> L57
            r8.append(r3)     // Catch: java.lang.Throwable -> L57
            r8.append(r0)     // Catch: java.lang.Throwable -> L57
            java.lang.String r12 = "\n\n"
            r8.append(r12)     // Catch: java.lang.Throwable -> L57
            java.lang.String r12 = r8.toString()     // Catch: java.lang.Throwable -> L57
            dg.l.Z(r9, r12)     // Catch: java.lang.Throwable -> L57
            goto Lb7
        La4:
            java.lang.String r13 = r12.getMessage()     // Catch: java.lang.Throwable -> Lb9
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9
            r14.<init>(r2)     // Catch: java.lang.Throwable -> Lb9
            r14.append(r13)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r13 = r14.toString()     // Catch: java.lang.Throwable -> Lb9
            fb.v0.n(r13, r12)     // Catch: java.lang.Throwable -> Lb9
        Lb7:
            monitor-exit(r1)
            goto Lbc
        Lb9:
            r12 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb9
            throw r12
        Lbc:
            return
    }

    public final void r(wa.h r1, boolean r2, java.lang.String r3) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.c(r3, r2)
        L5:
            if (r2 == 0) goto Lb
            r0.p(r3)
            return
        Lb:
            h(r3)
            return
    }

    public final boolean s(wa.f r8, byte[] r9, java.lang.String r10, int r11, wa.h r12) {
            r7 = this;
            java.lang.String r0 = "已用同类请求重放: "
            r1 = 0
            java.lang.Object r2 = r8.f14911c     // Catch: java.lang.Throwable -> L58
            java.lang.Object r3 = r8.f14912d     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L78
            byte[] r8 = r8.f14913e     // Catch: java.lang.Throwable -> L58
            int r4 = r8.length     // Catch: java.lang.Throwable -> L58
            r5 = 1
            r6 = 4
            if (r4 < r6) goto L18
            r4 = r8[r1]     // Catch: java.lang.Throwable -> L58
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r4 != 0) goto L18
            r4 = r5
            goto L19
        L18:
            r4 = r1
        L19:
            if (r4 != 0) goto L1c
            goto L2e
        L1c:
            if (r9 != 0) goto L20
            r4 = r1
            goto L21
        L20:
            int r4 = r9.length     // Catch: java.lang.Throwable -> L58
        L21:
            int r4 = r4 + r6
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L58
            java.lang.System.arraycopy(r8, r1, r4, r1, r6)     // Catch: java.lang.Throwable -> L58
            if (r9 == 0) goto L2d
            int r8 = r9.length     // Catch: java.lang.Throwable -> L58
            java.lang.System.arraycopy(r9, r1, r4, r6, r8)     // Catch: java.lang.Throwable -> L58
        L2d:
            r9 = r4
        L2e:
            java.lang.Class r8 = r3.getClass()     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = "parseFrom"
            java.lang.Class<byte[]> r6 = byte[].class
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch: java.lang.Throwable -> L58
            java.lang.reflect.Method r8 = h.Hchat.utils.KavaReflector.findMethodRecursive(r8, r4, r6)     // Catch: java.lang.Throwable -> L58
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L58
            h.Hchat.utils.KavaReflector.invoke(r8, r3, r9)     // Catch: java.lang.Throwable -> L58
            m8.a r8 = h.Hchat.hooks.api.core.WeChatApis.network()     // Catch: java.lang.Throwable -> L58
            if (r8 == 0) goto L5a
            m8.a r8 = h.Hchat.hooks.api.core.WeChatApis.network()     // Catch: java.lang.Throwable -> L58
            m8.c r8 = r8.f8777a     // Catch: java.lang.Throwable -> L58
            boolean r8 = r8.j(r2)     // Catch: java.lang.Throwable -> L58
            if (r8 == 0) goto L5a
            goto L5b
        L58:
            r8 = move-exception
            goto L79
        L5a:
            r5 = r1
        L5b:
            if (r5 == 0) goto L72
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L58
            r8.append(r10)     // Catch: java.lang.Throwable -> L58
            java.lang.String r9 = " type="
            r8.append(r9)     // Catch: java.lang.Throwable -> L58
            r8.append(r11)     // Catch: java.lang.Throwable -> L58
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L58
            goto L74
        L72:
            java.lang.String r8 = "发送失败: 网络API未就绪"
        L74:
            r7.r(r12, r5, r8)     // Catch: java.lang.Throwable -> L58
            return r5
        L78:
            return r1
        L79:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "重放发送失败: "
            r9.<init>(r10)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.r(r12, r1, r8)
            return r1
    }

    public final boolean t(java.lang.String r5, byte[] r6) {
            r4 = this;
            java.lang.String r0 = "|"
            java.lang.StringBuilder r5 = bc.e.n(r5, r0)
            int r6 = java.util.Arrays.hashCode(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap r2 = r4.f14922h
            java.lang.Object r5 = r2.put(r5, r6)
            java.lang.Long r5 = (java.lang.Long) r5
            int r6 = r2.size()
            r3 = 80
            if (r6 <= r3) goto L38
            java.util.Set r6 = r2.keySet()     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r6 = r6.next()     // Catch: java.lang.Throwable -> L38
            r2.remove(r6)     // Catch: java.lang.Throwable -> L38
        L38:
            if (r5 == 0) goto L48
            long r5 = r5.longValue()
            long r0 = r0 - r5
            r5 = 500(0x1f4, double:2.47E-321)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto L46
            goto L48
        L46:
            r5 = 0
            goto L49
        L48:
            r5 = 1
        L49:
            return r5
    }

    public final boolean v(int r5, java.lang.String r6, org.json.JSONObject r7, wa.h r8) {
            r4 = this;
            java.lang.String r0 = "原生场景已构造: type="
            java.lang.String r1 = " uri="
            r2 = 0
            h.Hchat.dexkit.DexFinder r3 = r4.f14916b
            if (r3 == 0) goto L5b
            java.lang.Class r3 = r3.findNativeNetSceneClass(r6, r5)     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L10
            goto L5b
        L10:
            java.lang.Object r7 = r4.d(r3, r7, r5)     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L37
            r3.append(r5)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = " class="
            r3.append(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L37
            r3.append(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L37
            r4.p(r0)     // Catch: java.lang.Throwable -> L37
        L35:
            r2 = r7
            goto L5b
        L37:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "原生场景构造失败: type="
            r0.<init>(r3)
            r0.append(r5)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r3 = " msg="
            r0.append(r3)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r4.p(r7)
        L5b:
            r7 = 0
            if (r2 != 0) goto L5f
            return r7
        L5f:
            m8.a r0 = h.Hchat.hooks.api.core.WeChatApis.network()
            if (r0 == 0) goto L8c
            m8.a r0 = h.Hchat.hooks.api.core.WeChatApis.network()
            m8.c r0 = r0.f8777a
            boolean r0 = r0.j(r2)
            if (r0 == 0) goto L8c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "已用原生场景发送: "
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = " type="
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6 = 1
            r4.r(r8, r6, r5)
            return r6
        L8c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "原生场景发送失败: type="
            r8.<init>(r0)
            r8.append(r5)
            r8.append(r1)
            r8.append(r6)
            java.lang.String r5 = " scene="
            r8.append(r5)
            java.lang.Class r5 = r2.getClass()
            java.lang.String r5 = r5.getName()
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r4.p(r5)
            return r7
    }
}
