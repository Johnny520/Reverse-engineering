package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f6571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab.b f6572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f6573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile java.lang.Class f6574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f6575e;

    public h(r8.g r1, ab.b r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f6571a = r1
            r0.f6572b = r2
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r0.f6573c = r1
            return
    }

    public static ia.f a(ia.b r3) {
            ia.f r0 = new ia.f
            java.lang.String r1 = r3.f6553a
            java.lang.String r2 = "comment:"
            java.lang.String r1 = r2.concat(r1)
            int r1 = r1.hashCode()
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            r1 = r1 & r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r2
            java.lang.String r3 = r3.f6554b
            r0.<init>(r1, r3)
            return r0
    }

    public static int b(java.lang.Object r0, java.lang.String r1) {
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r0, r1)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto Lb
            java.lang.Number r0 = (java.lang.Number) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L13
            int r0 = r0.intValue()
            return r0
        L13:
            r0 = 0
            return r0
    }

    public static boolean c(java.lang.Object r2, java.util.HashSet r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            goto L21
        L7:
            ia.v r2 = a7.a.O(r2)
            if (r2 == 0) goto L21
            int r0 = r2.f6636b
            r1 = 2
            if (r0 == r1) goto L13
            goto L21
        L13:
            ia.f r0 = new ia.f
            int r1 = r2.f6637c
            java.lang.String r2 = r2.f6635a
            r0.<init>(r1, r2)
            boolean r2 = r3.contains(r0)
            return r2
        L21:
            r2 = 0
            return r2
    }

    public static java.util.List e(java.lang.Object r2, java.lang.String r3) {
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r2, r3)
            boolean r1 = gg.x.e(r0)
            if (r1 == 0) goto L12
            r0.getClass()
            java.util.List r2 = gg.x.a(r0)
            return r2
        L12:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            boolean r2 = h.Hchat.utils.KavaReflector.writeField(r2, r3, r0)
            if (r2 == 0) goto L1e
            return r0
        L1e:
            r2 = 0
            return r2
    }

    public static void h(java.io.ByteArrayOutputStream r2, int r3, java.lang.String r4) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r0.getClass()
            byte[] r4 = r4.getBytes(r0)
            r4.getClass()
            int r3 = r3 << 3
            r3 = r3 | 2
            long r0 = (long) r3
            i(r2, r0)
            int r3 = r4.length
            long r0 = (long) r3
            i(r2, r0)
            r2.write(r4)
            return
    }

    public static void i(java.io.ByteArrayOutputStream r4, long r5) {
        L0:
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r5
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Le
            int r5 = (int) r5
            r4.write(r5)
            return
        Le:
            r0 = 127(0x7f, double:6.27E-322)
            long r0 = r0 & r5
            r2 = 128(0x80, double:6.3E-322)
            long r0 = r0 | r2
            int r0 = (int) r0
            r4.write(r0)
            r0 = 7
            long r5 = r5 >>> r0
            goto L0
    }

    public final ia.a d(byte[] r39, ia.c r40, ia.c r41, boolean r42, boolean r43) {
            r38 = this;
            r0 = r38
            r8 = r39
            r1 = r40
            r2 = r41
            tf.t r3 = tf.t.f13167g
            r8.g r4 = r0.f6571a
            java.lang.ClassLoader r4 = r4.f11622c
            java.lang.String r5 = "com.tencent.mm.protocal.protobuf.SnsObject"
            java.lang.Class r4 = h.Hchat.utils.KavaReflector.loadClass(r5, r4)
            r9 = 0
            if (r4 == 0) goto L3f
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.reflect.Constructor r4 = h.Hchat.utils.KavaReflector.findConstructor(r4, r5)
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstance(r4, r5)
            if (r4 == 0) goto L3f
            java.lang.Class r5 = r4.getClass()
            java.lang.String r6 = "parseFrom"
            java.lang.Object[] r7 = new java.lang.Object[]{r8}
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findCompatibleMethod(r5, r6, r7)
            if (r5 == 0) goto L3f
            java.lang.Object[] r6 = new java.lang.Object[]{r8}
            boolean r5 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r5, r4, r6)
            if (r5 != 0) goto L41
        L3f:
            r11 = 0
            goto L42
        L41:
            r11 = r4
        L42:
            if (r11 == 0) goto L387
            java.lang.String r4 = "LikeUserList"
            java.util.List r12 = e(r11, r4)
            if (r12 == 0) goto L380
            java.lang.String r4 = "CommentUserList"
            java.util.List r13 = e(r11, r4)
            if (r13 == 0) goto L379
            java.lang.String r14 = "LikeCount"
            int r15 = b(r11, r14)
            java.lang.String r4 = "LikeUserListCount"
            int r16 = b(r11, r4)
            java.lang.String r5 = "CommentCount"
            int r17 = b(r11, r5)
            java.lang.String r6 = "CommentUserListCount"
            int r18 = b(r11, r6)
            dg.n r7 = new dg.n
            r9 = 6
            r7.<init>(r12, r9)
            dg.n r9 = new dg.n
            r19 = 0
            r10 = 6
            r9.<init>(r13, r10)
            dg.j r7 = ng.m.Y(r7, r9)
            java.lang.Object r7 = ng.m.U(r7)
            if (r7 == 0) goto L89
            java.lang.Class r7 = r7.getClass()
            goto L8b
        L89:
            r7 = r19
        L8b:
            java.util.List r9 = r2.f6558a
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L96:
            boolean r20 = r9.hasNext()
            r21 = r5
            java.lang.String r5 = "like:"
            r22 = 1073741823(0x3fffffff, float:1.9999999)
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r20 == 0) goto Le0
            java.lang.Object r20 = r9.next()
            r24 = r3
            r3 = r20
            ia.d r3 = (ia.d) r3
            r20 = r4
            ia.g r4 = new ia.g
            r25 = r6
            java.lang.String r6 = r3.f6562a
            r26 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            int r5 = r5.hashCode()
            r5 = r5 & r22
            r5 = r5 | r23
            java.lang.String r3 = r3.f6562a
            r4.<init>(r5, r3)
            r10.add(r4)
            r4 = r20
            r5 = r21
            r3 = r24
            r6 = r25
            r7 = r26
            goto L96
        Le0:
            r24 = r3
            r20 = r4
            r25 = r6
            r26 = r7
            java.util.List r2 = r2.f6559b
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        Lf3:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L107
            java.lang.Object r4 = r2.next()
            ia.b r4 = (ia.b) r4
            ia.f r4 = a(r4)
            r3.add(r4)
            goto Lf3
        L107:
            ia.e r2 = new ia.e
            r4 = 0
            r2.<init>(r0, r10, r4)
            ia.e r4 = new ia.e
            r6 = 1
            r4.<init>(r0, r3, r6)
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto L11b
            r9 = 0
            goto L140
        L11b:
            java.util.Iterator r3 = r12.iterator()
            r6 = 0
        L120:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L13f
            java.lang.Object r7 = r3.next()
            java.lang.Object r7 = r2.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L120
            int r6 = r6 + 1
            if (r6 < 0) goto L13b
            goto L120
        L13b:
            a.a.P0()
            throw r19
        L13f:
            r9 = r6
        L140:
            boolean r3 = r13.isEmpty()
            if (r3 == 0) goto L148
            r10 = 0
            goto L16d
        L148:
            java.util.Iterator r3 = r13.iterator()
            r6 = 0
        L14d:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L16c
            java.lang.Object r7 = r3.next()
            java.lang.Object r7 = r4.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L14d
            int r6 = r6 + 1
            if (r6 < 0) goto L168
            goto L14d
        L168:
            a.a.P0()
            throw r19
        L16c:
            r10 = r6
        L16d:
            boolean r2 = tf.r.i1(r2, r12)
            boolean r3 = tf.r.i1(r4, r13)
            if (r3 != 0) goto L17c
            if (r2 == 0) goto L17a
            goto L17c
        L17a:
            r2 = 0
            goto L17d
        L17c:
            r2 = 1
        L17d:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r6 = r12.iterator()
        L186:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L1a1
            java.lang.Object r7 = r6.next()
            ia.v r7 = a7.a.O(r7)
            if (r7 == 0) goto L199
            java.lang.String r7 = r7.f6635a
            goto L19b
        L199:
            r7 = r19
        L19b:
            if (r7 == 0) goto L186
            r3.add(r7)
            goto L186
        L1a1:
            int r6 = r12.size()
            int r7 = r13.size()
            if (r42 == 0) goto L1dc
            java.util.List r4 = r1.f6558a
            r27 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r4 = r4.iterator()
        L1b8:
            boolean r28 = r4.hasNext()
            if (r28 == 0) goto L1d9
            r42 = r4
            java.lang.Object r4 = r42.next()
            r28 = r6
            r6 = r4
            ia.d r6 = (ia.d) r6
            java.lang.String r6 = r6.f6562a
            boolean r6 = r3.contains(r6)
            if (r6 != 0) goto L1d4
            r2.add(r4)
        L1d4:
            r4 = r42
            r6 = r28
            goto L1b8
        L1d9:
            r28 = r6
            goto L1e1
        L1dc:
            r27 = r2
            r2 = r24
            goto L1d9
        L1e1:
            if (r43 == 0) goto L1e7
            java.util.List r3 = r1.f6559b
            r24 = r3
        L1e7:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L209
            boolean r1 = r24.isEmpty()
            if (r1 != 0) goto L1f4
            goto L209
        L1f4:
            r41 = r9
            r31 = r19
            r9 = r28
            r26 = 1
            r28 = r21
            r21 = r15
            r15 = r20
            r20 = r10
            r10 = r7
        L205:
            r2 = r27
            goto L2ff
        L209:
            if (r26 == 0) goto L20e
            r1 = r26
            goto L218
        L20e:
            java.lang.Class r1 = r0.f6574d
            if (r1 == 0) goto L213
            goto L218
        L213:
            r0.g()
            java.lang.Class r1 = r0.f6574d
        L218:
            if (r1 != 0) goto L231
            boolean r1 = r0.f6575e
            if (r1 != 0) goto L22a
            r3 = 1
            r0.f6575e = r3
            ab.b r1 = r0.f6572b
            java.lang.String r2 = "朋友圈伪互动节点类型尚未就绪"
            r4 = r19
            r1.invoke(r2, r4)
        L22a:
            ia.a r1 = new ia.a
            r2 = 0
            r1.<init>(r8, r2)
            return r1
        L231:
            r4 = r19
            r3 = 1
            r0.f6574d = r1
            java.util.Iterator r19 = r2.iterator()
        L23a:
            boolean r2 = r19.hasNext()
            r29 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L2ab
            java.lang.Object r2 = r19.next()
            ia.d r2 = (ia.d) r2
            java.lang.String r6 = r2.f6562a
            r26 = r3
            java.lang.String r3 = r2.f6563b
            long r31 = java.lang.System.currentTimeMillis()
            r33 = r5
            long r4 = r31 / r29
            int r4 = (int) r4
            java.lang.String r2 = r2.f6562a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r0 = r33
            r5.<init>(r0)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            int r2 = r2.hashCode()
            r2 = r2 & r22
            r2 = r2 | r23
            r5 = r7
            r7 = r2
            r2 = r6
            r6 = r4
            java.lang.String r4 = ""
            r29 = r5
            r5 = 1
            r31 = 0
            r41 = r9
            r9 = r28
            r0 = r38
            r28 = r21
            r21 = r15
            r15 = r20
            r20 = r10
            r10 = r29
            java.lang.Object r2 = r0.f(r1, r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L295
            r12.add(r2)
            r27 = r26
        L295:
            r0 = r38
            r7 = r10
            r10 = r20
            r3 = r26
            r4 = r31
            r5 = r33
            r20 = r15
            r15 = r21
            r21 = r28
            r28 = r9
            r9 = r41
            goto L23a
        L2ab:
            r26 = r3
            r31 = r4
            r41 = r9
            r9 = r28
            r28 = r21
            r21 = r15
            r15 = r20
            r20 = r10
            r10 = r7
            java.util.Iterator r19 = r24.iterator()
        L2c0:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L205
            java.lang.Object r0 = r19.next()
            ia.b r0 = (ia.b) r0
            java.lang.String r2 = r0.f6554b
            java.lang.String r3 = r0.f6555c
            java.lang.String r4 = r0.f6556d
            long r5 = r0.f6557e
            long r32 = r5 / r29
            r34 = 1
            r36 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r5 = r9.e0.s(r32, r34, r36)
            int r6 = (int) r5
            java.lang.String r0 = r0.f6553a
            java.lang.String r5 = "comment:"
            java.lang.String r0 = r5.concat(r0)
            int r0 = r0.hashCode()
            r0 = r0 & r22
            r7 = r0 | r23
            r5 = 2
            r0 = r38
            java.lang.Object r2 = r0.f(r1, r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L2c0
            r13.add(r2)
            r27 = r26
            goto L2c0
        L2ff:
            if (r2 != 0) goto L308
            ia.a r0 = new ia.a
            r2 = 0
            r0.<init>(r8, r2)
            return r0
        L308:
            int r0 = r12.size()
            int r0 = r0 - r9
            if (r0 >= 0) goto L310
            r0 = 0
        L310:
            int r1 = r13.size()
            int r1 = r1 - r10
            if (r1 >= 0) goto L318
            r1 = 0
        L318:
            int r6 = r21 - r41
            if (r6 >= r9) goto L31d
            r6 = r9
        L31d:
            int r2 = r16 - r41
            if (r2 >= r9) goto L322
            r2 = r9
        L322:
            int r7 = r17 - r20
            if (r7 >= r10) goto L327
            r7 = r10
        L327:
            int r3 = r18 - r20
            if (r3 >= r10) goto L32c
            goto L32d
        L32c:
            r10 = r3
        L32d:
            int r6 = r6 + r0
            int r2 = r2 + r0
            int r7 = r7 + r1
            int r10 = r10 + r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            h.Hchat.utils.KavaReflector.writeField(r11, r14, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            h.Hchat.utils.KavaReflector.writeField(r11, r15, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1 = r28
            h.Hchat.utils.KavaReflector.writeField(r11, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1 = r25
            h.Hchat.utils.KavaReflector.writeField(r11, r1, r0)
            java.lang.String r0 = "toByteArray"
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r11, r0, r1)
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L362
            r10 = r0
            byte[] r10 = (byte[]) r10
            goto L364
        L362:
            r10 = r31
        L364:
            if (r10 == 0) goto L372
            ia.a r0 = new ia.a
            boolean r1 = java.util.Arrays.equals(r10, r8)
            r1 = r1 ^ 1
            r0.<init>(r10, r1)
            return r0
        L372:
            ia.a r0 = new ia.a
            r2 = 0
            r0.<init>(r8, r2)
            return r0
        L379:
            r2 = r9
            ia.a r0 = new ia.a
            r0.<init>(r8, r2)
            return r0
        L380:
            r2 = r9
            ia.a r0 = new ia.a
            r0.<init>(r8, r2)
            return r0
        L387:
            r2 = r9
            ia.a r0 = new ia.a
            r0.<init>(r8, r2)
            return r0
    }

    public final java.lang.Object f(java.lang.Class r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, int r11, int r12) {
            r5 = this;
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.reflect.Constructor r1 = h.Hchat.utils.KavaReflector.findConstructor(r6, r1)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstance(r1, r2)
            r2 = 0
            if (r1 == 0) goto Lc5
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            int r3 = r8.length()
            if (r3 <= 0) goto L25
            boolean r3 = r8.equals(r7)
            if (r3 != 0) goto L25
            goto L66
        L25:
            java.util.concurrent.ConcurrentHashMap r8 = r5.f6573c
            java.lang.Object r3 = r8.get(r7)
            if (r3 != 0) goto L60
            g8.i r3 = h.Hchat.hooks.api.core.WeChatApis.contacts()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L3a
            java.lang.String r3 = r3.r(r7)     // Catch: java.lang.Throwable -> L38
            goto L42
        L38:
            r3 = move-exception
            goto L3c
        L3a:
            r3 = r2
            goto L42
        L3c:
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L42:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L48
            r3 = r2
        L48:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L57
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto L53
            goto L54
        L53:
            r3 = r2
        L54:
            if (r3 == 0) goto L57
            goto L58
        L57:
            r3 = r7
        L58:
            java.lang.Object r8 = r8.putIfAbsent(r7, r3)
            if (r8 != 0) goto L5f
            goto L60
        L5f:
            r3 = r8
        L60:
            r3.getClass()
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
        L66:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r4 = 1
            h(r3, r4, r7)
            r7 = 2
            h(r3, r7, r8)
            r7 = 24
            long r7 = (long) r7
            i(r3, r7)
            long r7 = (long) r0
            i(r3, r7)
            r7 = 32
            long r7 = (long) r7
            i(r3, r7)
            long r7 = (long) r10
            i(r3, r7)
            int r7 = r9.length()
            if (r7 <= 0) goto L91
            r7 = 5
            h(r3, r7, r9)
        L91:
            r7 = 48
            long r7 = (long) r7
            i(r3, r7)
            long r7 = (long) r11
            i(r3, r7)
            r7 = 56
            long r7 = (long) r7
            i(r3, r7)
            long r7 = (long) r12
            i(r3, r7)
            byte[] r7 = r3.toByteArray()
            r7.getClass()
            java.lang.String r8 = "parseFrom"
            java.lang.Object[] r9 = new java.lang.Object[]{r7}
            java.lang.reflect.Method r6 = h.Hchat.utils.KavaReflector.findCompatibleMethod(r6, r8, r9)
            if (r6 == 0) goto Lc5
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            boolean r6 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r6, r1, r7)
            if (r6 == 0) goto Lc3
            goto Lc4
        Lc3:
            r1 = r2
        Lc4:
            return r1
        Lc5:
            return r2
    }

    public final boolean g() {
            r4 = this;
            java.lang.Class r0 = r4.f6574d
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            p8.d0 r0 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            r2 = 0
            if (r0 == 0) goto L37
            p8.x r0 = r0.h()
            if (r0 == 0) goto L37
            java.lang.reflect.Method r0 = r0.f()
            if (r0 == 0) goto L37
            java.lang.Class r0 = r0.getReturnType()
            if (r0 == 0) goto L37
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L37
            boolean r3 = r0.isPrimitive()
            if (r3 != 0) goto L37
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L36
            goto L37
        L36:
            r2 = r0
        L37:
            if (r2 == 0) goto L3c
            r4.f6574d = r2
            return r1
        L3c:
            r0 = 0
            return r0
    }
}
