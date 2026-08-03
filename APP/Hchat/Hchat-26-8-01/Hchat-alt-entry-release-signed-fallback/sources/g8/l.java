package g8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f4388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m8.c f4389b;

    public l(h.Hchat.dexkit.DexFinder r1, m8.c r2, g1.d r3) {
            r0 = this;
            r0.<init>()
            r0.f4388a = r1
            r0.f4389b = r2
            return
    }

    public static boolean a(java.lang.Class r1) {
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

    public final void b(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[WeChatVerifyUserApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
            return
    }

    public final boolean c(java.lang.String r18, java.lang.String r19, int r20, int r21) {
            r17 = this;
            r1 = r17
            java.lang.CharSequence r0 = og.m.R0(r18)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = ""
            if (r0 != 0) goto L10
            r3 = r2
            goto L11
        L10:
            r3 = r0
        L11:
            boolean r0 = og.m.t0(r3)
            r4 = 0
            if (r0 == 0) goto L1e
            java.lang.String r0 = "通过好友申请失败: wxid为空"
            r1.b(r0)
            return r4
        L1e:
            h.Hchat.dexkit.DexFinder r0 = r1.f4388a
            java.lang.Class<?> r0 = r0.verifyUserClass
            if (r0 != 0) goto L2a
            java.lang.String r0 = "通过好友申请失败: verifyUserClass为空"
            r1.b(r0)
            return r4
        L2a:
            if (r19 != 0) goto L2e
            r5 = r2
            goto L30
        L2e:
            r5 = r19
        L30:
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredConstructors(r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L42:
            boolean r9 = r0.hasNext()
            r10 = 1
            r11 = 8
            r13 = 2
            r14 = 6
            r15 = 4
            if (r9 == 0) goto L101
            java.lang.Object r9 = r0.next()
            r16 = r9
            java.lang.reflect.Constructor r16 = (java.lang.reflect.Constructor) r16
            r18 = r4
            java.lang.Class[] r4 = r16.getParameterTypes()
            r19 = r6
            int r6 = r4.length
            r16 = 5
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            if (r6 != r15) goto L87
            r6 = r4[r18]
            boolean r6 = a(r6)
            if (r6 == 0) goto Lfb
            r6 = r4[r10]
            boolean r6 = gg.l.a(r6, r12)
            if (r6 == 0) goto Lfb
            r6 = r4[r13]
            boolean r6 = gg.l.a(r6, r12)
            if (r6 == 0) goto Lfb
            r4 = r4[r19]
            boolean r4 = a(r4)
            if (r4 == 0) goto Lfb
            goto Lf8
        L87:
            int r6 = r4.length
            if (r6 != r14) goto Lbb
            r6 = r4[r18]
            boolean r6 = a(r6)
            if (r6 == 0) goto Lfb
            r6 = r4[r10]
            boolean r6 = gg.l.a(r6, r12)
            if (r6 == 0) goto Lfb
            r6 = r4[r13]
            boolean r6 = gg.l.a(r6, r12)
            if (r6 == 0) goto Lfb
            r6 = r4[r19]
            boolean r6 = a(r6)
            if (r6 == 0) goto Lfb
            r6 = r4[r15]
            boolean r6 = gg.l.a(r6, r12)
            if (r6 == 0) goto Lfb
            r4 = r4[r16]
            boolean r4 = a(r4)
            if (r4 == 0) goto Lfb
            goto Lf8
        Lbb:
            int r6 = r4.length
            if (r6 != r11) goto Lfb
            r6 = r4[r18]
            boolean r6 = a(r6)
            if (r6 == 0) goto Lfb
            r6 = r4[r10]
            boolean r6 = gg.l.a(r6, r12)
            if (r6 == 0) goto Lfb
            r6 = r4[r13]
            boolean r6 = gg.l.a(r6, r12)
            if (r6 == 0) goto Lfb
            r6 = r4[r19]
            boolean r6 = a(r6)
            if (r6 == 0) goto Lfb
            r6 = r4[r15]
            boolean r6 = gg.l.a(r6, r12)
            if (r6 == 0) goto Lfb
            r6 = r4[r16]
            boolean r6 = a(r6)
            if (r6 == 0) goto Lfb
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r4 = r4[r14]
            boolean r4 = r6.isAssignableFrom(r4)
            if (r4 == 0) goto Lfb
        Lf8:
            r8.add(r9)
        Lfb:
            r4 = r18
            r6 = r19
            goto L42
        L101:
            r18 = r4
            r19 = r6
            r16 = 5
            a9.h r0 = new a9.h
            r4 = 18
            r0.<init>(r4)
            java.util.List r0 = tf.m.K1(r8, r0)
            java.util.Iterator r4 = r0.iterator()
            r6 = 0
            r0 = r6
        L118:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L19e
            java.lang.Object r8 = r4.next()
            java.lang.reflect.Constructor r8 = (java.lang.reflect.Constructor) r8
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> L14e
            int r9 = r9.length     // Catch: java.lang.Throwable -> L14e
            if (r9 == r15) goto L167
            if (r9 == r14) goto L150
            if (r9 == r11) goto L130
            goto L118
        L130:
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L14e
            r0[r18] = r7     // Catch: java.lang.Throwable -> L14e
            r0[r10] = r3     // Catch: java.lang.Throwable -> L14e
            r0[r13] = r5     // Catch: java.lang.Throwable -> L14e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r20)     // Catch: java.lang.Throwable -> L14e
            r0[r19] = r9     // Catch: java.lang.Throwable -> L14e
            r0[r15] = r2     // Catch: java.lang.Throwable -> L14e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r21)     // Catch: java.lang.Throwable -> L14e
            r0[r16] = r9     // Catch: java.lang.Throwable -> L14e
            java.util.List r9 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L14e
            r0[r14] = r9     // Catch: java.lang.Throwable -> L14e
            r9 = 7
            r0[r9] = r6     // Catch: java.lang.Throwable -> L14e
            goto L175
        L14e:
            r0 = move-exception
            goto L17f
        L150:
            java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> L14e
            r0[r18] = r7     // Catch: java.lang.Throwable -> L14e
            r0[r10] = r3     // Catch: java.lang.Throwable -> L14e
            r0[r13] = r5     // Catch: java.lang.Throwable -> L14e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r20)     // Catch: java.lang.Throwable -> L14e
            r0[r19] = r9     // Catch: java.lang.Throwable -> L14e
            r0[r15] = r2     // Catch: java.lang.Throwable -> L14e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r21)     // Catch: java.lang.Throwable -> L14e
            r0[r16] = r9     // Catch: java.lang.Throwable -> L14e
            goto L175
        L167:
            java.lang.Object[] r0 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L14e
            r0[r18] = r7     // Catch: java.lang.Throwable -> L14e
            r0[r10] = r3     // Catch: java.lang.Throwable -> L14e
            r0[r13] = r5     // Catch: java.lang.Throwable -> L14e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r20)     // Catch: java.lang.Throwable -> L14e
            r0[r19] = r9     // Catch: java.lang.Throwable -> L14e
        L175:
            int r9 = r0.length     // Catch: java.lang.Throwable -> L14e
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r9)     // Catch: java.lang.Throwable -> L14e
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.newInstance(r8, r0)     // Catch: java.lang.Throwable -> L14e
            goto L1af
        L17f:
            java.lang.Class[] r8 = r8.getParameterTypes()
            int r8 = r8.length
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = ": "
            r9.append(r8)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            goto L118
        L19e:
            if (r0 == 0) goto L1a6
            java.lang.String r2 = ", last="
            java.lang.String r2 = r2.concat(r0)
        L1a6:
            java.lang.String r0 = "通过好友申请失败: 无合适构造"
            java.lang.String r0 = r0.concat(r2)
            r1.b(r0)
        L1af:
            if (r6 == 0) goto L1d1
            m8.c r0 = r1.f4389b
            boolean r0 = r0.j(r6)
            if (r0 != r10) goto L1bb
            r4 = r10
            goto L1bd
        L1bb:
            r4 = r18
        L1bd:
            if (r4 != 0) goto L1d0
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "通过好友申请失败: 发包失败 request="
            java.lang.String r0 = r2.concat(r0)
            r1.b(r0)
        L1d0:
            return r4
        L1d1:
            return r18
    }
}
