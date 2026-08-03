package n8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f9064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m8.c f9065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.os.Handler f9066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Map f9067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f9068e;

    public c(h.Hchat.dexkit.DexFinder r1, m8.c r2, g1.d r3) {
            r0 = this;
            r0.<init>()
            r0.f9064a = r1
            r0.f9065b = r2
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.f9066c = r1
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Map r1 = java.util.Collections.synchronizedMap(r1)
            r0.f9067d = r1
            return
    }

    public static final int a(n8.c r5, java.lang.reflect.Constructor r6) {
            java.lang.Class[] r5 = r6.getParameterTypes()
            r5.getClass()
            int r6 = r5.length
            r0 = 0
            r1 = r0
        La:
            r2 = 2
            if (r1 >= r6) goto L24
            r3 = r5[r1]
            java.lang.Class r4 = java.lang.Long.TYPE
            boolean r4 = gg.l.a(r3, r4)
            if (r4 != 0) goto L23
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L20
            goto L23
        L20:
            int r1 = r1 + 1
            goto La
        L23:
            r0 = r2
        L24:
            int r6 = r5.length
            r1 = 10
            if (r6 < r1) goto L36
            r6 = 9
            r5 = r5[r6]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L36
            int r0 = r0 + r2
        L36:
            return r0
    }

    public static java.lang.Object[] b(java.lang.Class[] r25, java.lang.String r26, n8.a r27) {
            r0 = r25
            r1 = r27
            java.lang.String r8 = r1.f9056h
            java.lang.String r13 = r1.f9059k
            java.lang.String r15 = r1.f9058j
            java.lang.String r11 = r1.f9060l
            long r2 = r1.f9057i
            java.lang.String r9 = r1.f9049a
            int r4 = r1.f9055g
            java.lang.String r6 = r1.f9054f
            int r5 = r1.f9053e
            r7 = r4
            java.lang.String r4 = r1.f9052d
            int r10 = r1.f9051c
            java.lang.String r1 = r1.f9050b
            int r12 = r0.length
            switch(r12) {
                case 9: goto Le1;
                case 10: goto Lc3;
                case 11: goto L21;
                case 12: goto L9f;
                case 13: goto L47;
                case 14: goto L25;
                default: goto L21;
            }
        L21:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
        L25:
            r16 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0 = r9
            r9 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10 = 0
            r19 = r11
            java.lang.Long r11 = java.lang.Long.valueOf(r16)
            r3 = r26
            r7 = r6
            r6 = r15
            r12 = r19
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            return r0
        L47:
            r16 = r2
            r21 = r6
            r14 = r9
            r19 = r11
            r9 = r8
            r2 = 7
            java.lang.Object r0 = tf.l.C0(r2, r0)
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = d(r0)
            if (r0 == 0) goto L7a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = r9
            r9 = 0
            java.lang.Long r10 = java.lang.Long.valueOf(r16)
            r3 = r26
            r0 = r14
            r11 = r19
            r6 = r21
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            return r0
        L7a:
            r0 = r14
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            r2 = r16
            java.lang.Integer r17 = java.lang.Integer.valueOf(r7)
            r18 = 0
            r20 = r19
            java.lang.Long r19 = java.lang.Long.valueOf(r2)
            r12 = r26
            r9 = r0
            r10 = r1
            r16 = r21
            r21 = r13
            r13 = r4
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21}
            return r0
        L9f:
            r21 = r6
            r0 = r9
            r19 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)
            r17 = 0
            java.lang.Long r18 = java.lang.Long.valueOf(r2)
            r12 = r26
            r10 = r1
            r20 = r13
            r15 = r21
            r13 = r4
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            return r0
        Lc3:
            r21 = r6
            r0 = r9
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r7)
            r23 = 0
            r17 = r26
            r14 = r0
            r18 = r4
            r20 = r15
            r15 = r1
            java.lang.Object[] r0 = new java.lang.Object[]{r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            return r0
        Le1:
            r21 = r6
            r0 = r9
            java.lang.Integer r18 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r7)
            r24 = 0
            r19 = r26
            r16 = r0
            r17 = r1
            r20 = r4
            r22 = r21
            r21 = r2
            java.lang.Object[] r0 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21, r22, r23, r24}
            return r0
    }

    public static boolean d(java.lang.Class r1) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L13
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r1 = gg.l.a(r1, r0)
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final boolean c() {
            r2 = this;
            h.Hchat.dexkit.DexFinder r0 = r2.f9064a
            boolean r0 = r0.hasTransferOperationApi()
            r1 = 1
            if (r0 != r1) goto La
            return r1
        La:
            r0 = 0
            return r0
    }

    public final void e(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[WeChatTransferApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
            return
    }

    public final boolean f(java.lang.String r13, n8.a r14) {
            r12 = this;
            java.lang.String r0 = "confirm"
            boolean r0 = r13.equals(r0)
            r1 = 0
            if (r0 != 0) goto L18
            java.lang.String r0 = "refuse"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L12
            goto L18
        L12:
            java.lang.String r13 = "转账操作失败: op无效"
            r12.e(r13)
            return r1
        L18:
            java.lang.String r0 = r14.f9049a
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L17f
            java.lang.String r0 = r14.f9050b
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L17f
            java.lang.String r0 = r14.f9052d
            boolean r0 = og.m.t0(r0)
            if (r0 == 0) goto L32
            goto L17f
        L32:
            h.Hchat.dexkit.DexFinder r0 = r12.f9064a
            java.lang.Class<?> r0 = r0.transferOperationClass
            if (r0 != 0) goto L3e
            java.lang.String r13 = "转账操作失败: transferOperationClass为空"
            r12.e(r13)
            return r1
        L3e:
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredConstructors(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L4b:
            boolean r3 = r0.hasNext()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 1
            if (r3 == 0) goto Lce
            java.lang.Object r3 = r0.next()
            r6 = r3
            java.lang.reflect.Constructor r6 = (java.lang.reflect.Constructor) r6
            java.lang.Class[] r6 = r6.getParameterTypes()
            r7 = 9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 12
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 13
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 14
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer[] r7 = new java.lang.Integer[]{r7, r8, r9, r10, r11}
            java.util.Set r7 = tf.d0.W(r7)
            int r8 = r6.length
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L91
            goto L4b
        L91:
            int r7 = r6.length
            r8 = 6
            if (r7 < r8) goto L4b
            r7 = r6[r1]
            boolean r7 = gg.l.a(r7, r4)
            if (r7 == 0) goto L4b
            r5 = r6[r5]
            boolean r5 = gg.l.a(r5, r4)
            if (r5 == 0) goto L4b
            r5 = 2
            r5 = r6[r5]
            boolean r5 = d(r5)
            if (r5 == 0) goto L4b
            r5 = 3
            r5 = r6[r5]
            boolean r5 = gg.l.a(r5, r4)
            if (r5 == 0) goto L4b
            r5 = 4
            r5 = r6[r5]
            boolean r4 = gg.l.a(r5, r4)
            if (r4 == 0) goto L4b
            r4 = 5
            r4 = r6[r4]
            boolean r4 = d(r4)
            if (r4 == 0) goto L4b
            r2.add(r3)
            goto L4b
        Lce:
            a9.h r0 = new a9.h
            r3 = 23
            r0.<init>(r3)
            da.g r3 = new da.g
            r6 = 3
            r3.<init>(r0, r12, r6)
            java.util.List r0 = tf.m.K1(r2, r3)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        Le5:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L125
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3
            java.lang.Class[] r6 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L106
            r6.getClass()     // Catch: java.lang.Throwable -> L106
            java.lang.Object[] r6 = b(r6, r13, r14)     // Catch: java.lang.Throwable -> L106
            int r7 = r6.length     // Catch: java.lang.Throwable -> L106
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)     // Catch: java.lang.Throwable -> L106
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.newInstance(r3, r6)     // Catch: java.lang.Throwable -> L106
            goto L139
        L106:
            r6 = move-exception
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r3 = r3.length
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r3 = ": "
            r7.append(r3)
            r7.append(r6)
            java.lang.String r3 = r7.toString()
            goto Le5
        L125:
            if (r3 == 0) goto L12e
            java.lang.String r14 = ", last="
            java.lang.String r14 = r14.concat(r3)
            goto L130
        L12e:
            java.lang.String r14 = ""
        L130:
            java.lang.String r0 = "转账操作失败: 无合适构造"
            java.lang.String r14 = r0.concat(r14)
            r12.e(r14)
        L139:
            if (r2 == 0) goto L17e
            java.lang.Class r14 = r2.getClass()     // Catch: java.lang.Throwable -> L152
            java.lang.String r0 = "setProcessName"
            java.lang.Class[] r3 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L152
            java.lang.reflect.Method r14 = h.Hchat.utils.KavaReflector.findMethod(r14, r0, r3)     // Catch: java.lang.Throwable -> L152
            java.lang.String r0 = "RemittanceProcess"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L152
            h.Hchat.utils.KavaReflector.invoke(r14, r2, r0)     // Catch: java.lang.Throwable -> L152
        L152:
            m8.c r14 = r12.f9065b
            boolean r14 = r14.j(r2)
            if (r14 != r5) goto L15b
            r1 = r5
        L15b:
            if (r1 != 0) goto L17e
            java.lang.Class r14 = r2.getClass()
            java.lang.String r14 = r14.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "转账操作失败: 发包失败 op="
            r0.<init>(r2)
            r0.append(r13)
            java.lang.String r13 = " request="
            r0.append(r13)
            r0.append(r14)
            java.lang.String r13 = r0.toString()
            r12.e(r13)
        L17e:
            return r1
        L17f:
            java.lang.String r13 = "转账操作失败: transactionId/transId/username缺失"
            r12.e(r13)
            return r1
    }
}
