package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f7400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.ThreadLocal f7401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f7402c;

    public e(h.Hchat.dexkit.DexFinder r1, i8.f r2) {
            r0 = this;
            r0.<init>()
            r0.f7400a = r1
            java.lang.ThreadLocal r1 = new java.lang.ThreadLocal
            r1.<init>()
            r0.f7401b = r1
            return
    }

    public static boolean a(java.lang.Object r3, int r4, java.lang.String... r5) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            r0.getClass()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            int r2 = r5.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            boolean r0 = b(r3, r0, r1, r2)
            if (r0 != 0) goto L2c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r0 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r3 = b(r3, r0, r4, r5)
            if (r3 == 0) goto L2a
            goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public static boolean b(java.lang.Object r3, java.lang.Class r4, java.lang.Object r5, java.lang.String... r6) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r6.length
            int r1 = tf.y.a0(r1)
            r0.<init>(r1)
            tf.l.J0(r6, r0)
            java.util.List r6 = tf.m.P1(r0)
            java.util.Iterator r6 = r6.iterator()
        L15:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class r1 = r3.getClass()
            java.lang.Class[] r2 = new java.lang.Class[]{r4}
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethodRecursive(r1, r0, r2)
            if (r0 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            boolean r0 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r0, r3, r1)
            if (r0 == 0) goto L15
            r3 = 1
            return r3
        L3b:
            r3 = 0
            return r3
    }

    public static void i(java.lang.Object r4, int r5, java.lang.String... r6) {
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 < r0) goto L5
            goto L1b
        L5:
            r2 = r6[r1]
            java.lang.Class r3 = r4.getClass()
            java.lang.reflect.Field r2 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r2)
            if (r2 == 0) goto L1c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            boolean r2 = h.Hchat.utils.KavaReflector.writeField(r2, r4, r3)
            if (r2 == 0) goto L1c
        L1b:
            return
        L1c:
            int r1 = r1 + 1
            goto L2
    }

    public static void j(java.lang.Object r4, long r5, java.lang.String... r7) {
            int r0 = r7.length
            r1 = 0
        L2:
            if (r1 < r0) goto L5
            goto L1b
        L5:
            r2 = r7[r1]
            java.lang.Class r3 = r4.getClass()
            java.lang.reflect.Field r2 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r2)
            if (r2 == 0) goto L1c
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            boolean r2 = h.Hchat.utils.KavaReflector.writeField(r2, r4, r3)
            if (r2 == 0) goto L1c
        L1b:
            return
        L1c:
            int r1 = r1 + 1
            goto L2
    }

    public static void k(java.lang.Object r4, java.lang.String r5, java.lang.String... r6) {
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 < r0) goto L5
            goto L17
        L5:
            r2 = r6[r1]
            java.lang.Class r3 = r4.getClass()
            java.lang.reflect.Field r2 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r2)
            if (r2 == 0) goto L18
            boolean r2 = h.Hchat.utils.KavaReflector.writeField(r2, r4, r5)
            if (r2 == 0) goto L18
        L17:
            return
        L18:
            int r1 = r1 + 1
            goto L2
    }

    public final void c() {
            r2 = this;
            h.Hchat.dexkit.DexFinder r0 = r2.f7400a
            boolean r1 = r0.hasLocalMessageApi()
            if (r1 == 0) goto Lc
            java.lang.reflect.Method r1 = r0.localMessageCreateTimeMethod
            if (r1 != 0) goto Lf
        Lc:
            r0.resolveLocalMessageApi()
        Lf:
            r2.g()
            return
    }

    public final void d(java.lang.Object r18, java.lang.String r19, java.lang.String r20, long r21, boolean r23) {
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 0
            r5 = 1000(0x3e8, double:4.94E-321)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            if (r23 == 0) goto L40
            r9 = r17
            h.Hchat.dexkit.DexFinder r10 = r9.f7400a
            java.lang.reflect.Method r10 = r10.localMessageCreateTimeMethod
            if (r10 == 0) goto L3d
            int r7 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
            if (r7 <= 0) goto L20
            long r5 = r21 / r5
            goto L22
        L20:
            r5 = r21
        L22:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r5}
            r6 = 0
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r10, r6, r5)
            boolean r7 = r5 instanceof java.lang.Number
            if (r7 == 0) goto L36
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
        L36:
            if (r6 == 0) goto L3d
            long r5 = r6.longValue()
            goto L4c
        L3d:
            r5 = r21
            goto L4c
        L40:
            r9 = r17
            int r10 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r10 <= 0) goto L3d
            int r7 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
            if (r7 >= 0) goto L3d
            long r5 = r5 * r21
        L4c:
            java.lang.String r7 = "k1"
            java.lang.String r8 = "j1"
            java.lang.String r10 = "U0"
            java.lang.String[] r7 = new java.lang.String[]{r10, r7, r8}
            r8 = 0
            boolean r7 = a(r0, r8, r7)
            if (r7 != 0) goto L68
            java.lang.String r7 = "field_isSend"
            java.lang.String r10 = "isSend"
            java.lang.String[] r7 = new java.lang.String[]{r7, r10}
            i(r0, r8, r7)
        L68:
            java.lang.String r7 = "C1"
            java.lang.String r8 = "u1"
            java.lang.String r10 = "i1"
            java.lang.String r11 = "A1"
            java.lang.String r12 = "H1"
            java.lang.String[] r7 = new java.lang.String[]{r10, r11, r12, r7, r8}
            r8 = 5
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r8)
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            boolean r7 = b(r0, r10, r1, r7)
            if (r7 != 0) goto L90
            java.lang.String r7 = "field_talker"
            java.lang.String r11 = "talker"
            java.lang.String[] r7 = new java.lang.String[]{r7, r11}
            k(r0, r1, r7)
        L90:
            java.lang.String r15 = "t1"
            java.lang.String r16 = "r1"
            java.lang.String r11 = "h1"
            java.lang.String r12 = "z1"
            java.lang.String r13 = "E1"
            java.lang.String r14 = "y1"
            java.lang.String[] r1 = new java.lang.String[]{r11, r12, r13, r14, r15, r16}
            r7 = 3
            boolean r1 = a(r0, r7, r1)
            if (r1 != 0) goto Lb2
            java.lang.String r1 = "field_status"
            java.lang.String r11 = "status"
            java.lang.String[] r1 = new java.lang.String[]{r1, r11}
            i(r0, r7, r1)
        Lb2:
            java.lang.String r1 = "Y0"
            java.lang.String r7 = "c1"
            java.lang.String r11 = "J0"
            java.lang.String r12 = "d1"
            java.lang.String[] r1 = new java.lang.String[]{r11, r1, r12, r7}
            r7 = 4
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r7)
            java.lang.String[] r1 = (java.lang.String[]) r1
            boolean r1 = b(r0, r10, r2, r1)
            if (r1 != 0) goto Ld6
            java.lang.String r1 = "field_content"
            java.lang.String r7 = "content"
            java.lang.String[] r1 = new java.lang.String[]{r1, r7}
            k(r0, r2, r1)
        Ld6:
            java.lang.String r1 = "f1"
            java.lang.String r2 = "e1"
            java.lang.String r7 = "K0"
            java.lang.String r10 = "a1"
            java.lang.String[] r1 = new java.lang.String[]{r7, r10, r1, r2, r12}
            java.lang.Class r2 = java.lang.Long.TYPE
            r2.getClass()
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r1, r8)
            java.lang.String[] r10 = (java.lang.String[]) r10
            boolean r2 = b(r0, r2, r7, r10)
            if (r2 != 0) goto L115
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r8)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            boolean r1 = b(r0, r7, r2, r1)
            if (r1 == 0) goto L10a
            goto L115
        L10a:
            java.lang.String r1 = "field_createTime"
            java.lang.String r2 = "createTime"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            j(r0, r5, r1)
        L115:
            java.lang.String r1 = "setType"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r2 = 10000(0x2710, float:1.4013E-41)
            boolean r1 = a(r0, r2, r1)
            if (r1 != 0) goto L12e
            java.lang.String r1 = "field_type"
            java.lang.String r5 = "type"
            java.lang.String[] r1 = new java.lang.String[]{r1, r5}
            i(r0, r2, r1)
        L12e:
            java.lang.String r1 = "field_msgSvrId"
            java.lang.String r2 = "msgSvrId"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            j(r0, r3, r1)
            java.lang.String r1 = "field_imgPath"
            java.lang.String r2 = "imgPath"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.lang.String r2 = ""
            k(r0, r2, r1)
            java.lang.String r1 = "field_reserved"
            java.lang.String r3 = "reserved"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}
            k(r0, r2, r1)
            java.lang.String r1 = "field_transContent"
            java.lang.String r3 = "transContent"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}
            k(r0, r2, r1)
            java.lang.String r1 = "field_msgSource"
            java.lang.String r3 = "msgSource"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}
            k(r0, r2, r1)
            return
    }

    public final long e(java.lang.String r12, java.lang.String r13, long r14, boolean r16) {
            r11 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r8 = 0
            if (r0 != 0) goto Lf7
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L10
            goto Lf7
        L10:
            h.Hchat.dexkit.DexFinder r0 = r11.f7400a
            boolean r2 = r0.hasLocalMessageApi()
            if (r2 != 0) goto L1e
            java.lang.String r0 = "插入系统消息失败: 本地消息API未就绪"
            r11.h(r0)
            return r8
        L1e:
            if (r16 != 0) goto L2c
            boolean r2 = r11.g()
            if (r2 != 0) goto L2c
            java.lang.String r0 = "插入系统消息失败: createTime hook 未就绪"
            r11.h(r0)
            return r8
        L2c:
            java.lang.String r2 = ""
            if (r12 != 0) goto L32
            r3 = r2
            goto L33
        L32:
            r3 = r12
        L33:
            if (r13 != 0) goto L37
            r4 = r2
            goto L38
        L37:
            r4 = r13
        L38:
            r10 = 0
            if (r16 == 0) goto L3d
            r5 = r10
            goto L53
        L3d:
            int r5 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r5 <= 0) goto L4e
            r5 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4e
            r5 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r14
            goto L4f
        L4e:
            r5 = r14
        L4f:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L5f
        L53:
            java.lang.Long r3 = r11.f(r0, r3, r4, r5)     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L62
            long r2 = r3.longValue()     // Catch: java.lang.Throwable -> L5f
            goto Lb9
        L5f:
            r0 = move-exception
            goto Lc6
        L62:
            if (r12 != 0) goto L66
            r3 = r2
            goto L67
        L66:
            r3 = r12
        L67:
            java.lang.reflect.Constructor<?> r4 = r0.localMessageCtor     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L86
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L5f
            r5.getClass()     // Catch: java.lang.Throwable -> L5f
            int r5 = r5.length     // Catch: java.lang.Throwable -> L5f
            if (r5 != 0) goto L7d
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.newInstance(r4, r3)     // Catch: java.lang.Throwable -> L5f
            goto L87
        L7d:
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.newInstance(r4, r3)     // Catch: java.lang.Throwable -> L5f
            goto L87
        L86:
            r3 = r10
        L87:
            if (r3 == 0) goto Lbe
            if (r12 != 0) goto L8d
            r4 = r2
            goto L8e
        L8d:
            r4 = r12
        L8e:
            if (r13 != 0) goto L99
            r1 = r4
            r4 = r2
            r2 = r3
            r3 = r1
        L94:
            r1 = r11
            r5 = r14
            r7 = r16
            goto L9d
        L99:
            r2 = r3
            r3 = r4
            r4 = r13
            goto L94
        L9d:
            r1.d(r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L5f
            java.lang.reflect.Method r0 = r0.localMessageInsertMethod     // Catch: java.lang.Throwable -> L5f
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r10, r2)     // Catch: java.lang.Throwable -> L5f
            boolean r2 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto Lb1
            r10 = r0
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L5f
        Lb1:
            if (r10 == 0) goto Lb8
            long r2 = r10.longValue()     // Catch: java.lang.Throwable -> L5f
            goto Lb9
        Lb8:
            r2 = r8
        Lb9:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L5f
            goto Lcc
        Lbe:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = "消息对象创建失败"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            throw r0     // Catch: java.lang.Throwable -> L5f
        Lc6:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        Lcc:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 == 0) goto Le7
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "插入系统消息失败: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r11.h(r2)
        Le7:
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto Lf0
            r0 = r2
        Lf0:
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            return r2
        Lf7:
            java.lang.String r0 = "插入系统消息失败: talker/content 为空"
            r11.h(r0)
            return r8
    }

    public final java.lang.Long f(h.Hchat.dexkit.DexFinder r11, java.lang.String r12, java.lang.String r13, java.lang.Long r14) {
            r10 = this;
            java.lang.reflect.Method r1 = r11.localSystemMessageMethod
            r2 = 0
            if (r1 == 0) goto L182
            java.lang.Class r3 = r1.getDeclaringClass()
            if (r3 == 0) goto L14c
            java.lang.Object r11 = ig.a.A(r11, r3)
            if (r11 == 0) goto L14
        L11:
            r2 = r11
            goto L14c
        L14:
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.staticInstance(r3)
            if (r11 == 0) goto L1b
            goto L11
        L1b:
            java.util.List r11 = h.Hchat.utils.KavaReflector.declaredFields(r3)
            java.util.Iterator r11 = r11.iterator()
        L23:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r11.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            boolean r4 = h.Hchat.utils.KavaReflector.isStatic(r0)
            if (r4 != 0) goto L36
            goto L23
        L36:
            java.lang.Class r4 = r0.getType()
            boolean r4 = r3.isAssignableFrom(r4)
            if (r4 != 0) goto L41
            goto L23
        L41:
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r0, r2)
            if (r0 == 0) goto L23
            goto L49
        L48:
            r0 = r2
        L49:
            if (r0 == 0) goto L4e
        L4b:
            r2 = r0
            goto L14c
        L4e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.newInstanceByArgs(r3, r0)
            if (r0 == 0) goto L5d
        L5c:
            goto L4b
        L5d:
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch: java.lang.Throwable -> L6e
            java.lang.reflect.Constructor r0 = h.Hchat.utils.KavaReflector.findConstructor(r3, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L70
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.newInstance(r0, r5)     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L70
            goto L5c
        L6e:
            r0 = move-exception
            goto L72
        L70:
            r5 = r2
            goto L77
        L72:
            sf.f r5 = new sf.f
            r5.<init>(r0)
        L77:
            java.lang.Throwable r0 = sf.g.b(r5)
            if (r0 == 0) goto La2
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "KavaCtor="
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = ":"
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r4.add(r0)
        La2:
            java.lang.String r0 = "sun.misc.Unsafe"
            java.lang.String r5 = "jdk.internal.misc.Unsafe"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5}
        Laa:
            r0 = 2
            if (r11 < r0) goto Lb0
            r0 = r2
            goto L114
        Lb0:
            r0 = r5[r11]
            java.lang.ClassLoader r6 = r3.getClassLoader()     // Catch: java.lang.Throwable -> Le6
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r6)     // Catch: java.lang.Throwable -> Le6
            if (r0 == 0) goto L104
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredFields(r0)     // Catch: java.lang.Throwable -> Le6
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Le6
        Lc4:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Le6
            if (r7 == 0) goto Lec
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Le6
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7     // Catch: java.lang.Throwable -> Le6
            boolean r8 = h.Hchat.utils.KavaReflector.isStatic(r7)     // Catch: java.lang.Throwable -> Le6
            if (r8 == 0) goto Le8
            java.lang.Class r8 = r7.getType()     // Catch: java.lang.Throwable -> Le6
            boolean r8 = r0.isAssignableFrom(r8)     // Catch: java.lang.Throwable -> Le6
            if (r8 != 0) goto Le1
            goto Le8
        Le1:
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r7, r2)     // Catch: java.lang.Throwable -> Le6
            goto Le9
        Le6:
            r0 = move-exception
            goto L106
        Le8:
            r7 = r2
        Le9:
            if (r7 == 0) goto Lc4
            goto Led
        Lec:
            r7 = r2
        Led:
            if (r7 == 0) goto L104
            java.lang.String r6 = "allocateInstance"
            java.lang.Class<java.lang.Class> r8 = java.lang.Class.class
            java.lang.Class[] r8 = new java.lang.Class[]{r8}     // Catch: java.lang.Throwable -> Le6
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r0, r6, r8)     // Catch: java.lang.Throwable -> Le6
            java.lang.Object[] r6 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> Le6
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r7, r6)     // Catch: java.lang.Throwable -> Le6
            goto L10c
        L104:
            r0 = r2
            goto L10c
        L106:
            sf.f r6 = new sf.f
            r6.<init>(r0)
            r0 = r6
        L10c:
            boolean r6 = r0 instanceof sf.f
            if (r6 == 0) goto L112
            r0 = r2
        L112:
            if (r0 == 0) goto L148
        L114:
            if (r0 != 0) goto L11b
            java.lang.String r11 = "UnsafeAllocate=null"
            r4.add(r11)
        L11b:
            if (r0 == 0) goto L11f
            goto L4b
        L11f:
            java.lang.String r11 = r3.getName()
            r8 = 0
            r9 = 62
            java.lang.String r5 = ";"
            r6 = 0
            r7 = 0
            java.lang.String r0 = tf.m.A1(r4, r5, r6, r7, r8, r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "系统消息API实例创建失败: owner="
            r3.<init>(r4)
            r3.append(r11)
            java.lang.String r11 = " service=false static=false "
            r3.append(r11)
            r3.append(r0)
            java.lang.String r11 = r3.toString()
            r10.h(r11)
            goto L14c
        L148:
            int r11 = r11 + 1
            goto Laa
        L14c:
            if (r2 == 0) goto L17b
            java.lang.ThreadLocal r11 = r10.f7401b
            if (r14 == 0) goto L15e
            k8.d r0 = new k8.d
            long r3 = r14.longValue()
            r0.<init>(r12, r3)
            r11.set(r0)
        L15e:
            java.lang.String r0 = ""
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r0}     // Catch: java.lang.Throwable -> L173
            h.Hchat.utils.KavaReflector.invoke(r1, r2, r12)     // Catch: java.lang.Throwable -> L173
            r12 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Throwable -> L173
            if (r14 == 0) goto L172
            r11.remove()
        L172:
            return r12
        L173:
            r0 = move-exception
            r12 = r0
            if (r14 == 0) goto L17a
            r11.remove()
        L17a:
            throw r12
        L17b:
            java.lang.String r11 = "系统消息API实例创建失败"
            j8.o.A(r11)
            r11 = 0
            return r11
        L182:
            return r2
    }

    public final boolean g() {
            r5 = this;
            boolean r0 = r5.f7402c
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            h.Hchat.dexkit.DexFinder r0 = r5.f7400a
            java.lang.reflect.Method r2 = r0.localMessageCreateTimeMethod
            if (r2 != 0) goto Lf
            r0.resolveLocalMessageApi()
        Lf:
            java.lang.reflect.Method r0 = r0.localMessageCreateTimeMethod
            if (r0 == 0) goto L2d
            monitor-enter(r5)
            boolean r2 = r5.f7402c     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L1a
            monitor-exit(r5)
            return r1
        L1a:
            r8.i r2 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2a
            b9.e r3 = new b9.e     // Catch: java.lang.Throwable -> L2a
            r4 = 15
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L2a
            r2.b(r0, r3)     // Catch: java.lang.Throwable -> L2a
            r5.f7402c = r1     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r5)
            return r1
        L2a:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L2d:
            r0 = 0
            return r0
    }

    public final void h(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[Hchat:LocalMessage] "
            java.lang.String r0 = r0.concat(r2)
            de.robv.android.xposed.XposedBridge.log(r0)
            java.lang.String r0 = "[WeChatLocalMessageApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
            return
    }
}
