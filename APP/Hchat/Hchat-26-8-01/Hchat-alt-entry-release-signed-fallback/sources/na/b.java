package na;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements sa.d, m8.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ na.e f9099h;

    public /* synthetic */ b(na.e r1, int r2) {
            r0 = this;
            r0.f9098g = r2
            r0.f9099h = r1
            r0.<init>()
            return
    }

    @Override // sa.d, m8.b
    public void a(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f9098g
            switch(r0) {
                case 1: goto L5;
                default: goto L5;
            }
        L5:
            na.e r0 = r1.f9099h
            r0.d(r2)
            return
    }

    public void b(java.lang.String r6) {
            r5 = this;
            na.e r0 = r5.f9099h
            na.k r1 = r0.f9112f
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L13
            java.util.concurrent.ConcurrentHashMap r2 = r1.f9183h
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            goto L14
        L13:
            r2 = 0
        L14:
            be.k r3 = r0.f9114h
            na.a r0 = r0.g(r6)
            java.lang.String r4 = "手慢了或红包已领完"
            r3.m(r2, r6, r4, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L39
            java.util.concurrent.ConcurrentHashMap r0 = r1.f9181f
            r0.remove(r6)
            java.util.concurrent.ConcurrentHashMap r0 = r1.f9182g
            r0.remove(r6)
            java.util.concurrent.ConcurrentHashMap r0 = r1.f9183h
            r0.remove(r6)
            java.util.concurrent.ConcurrentHashMap r0 = r1.f9184i
            r0.remove(r6)
        L39:
            return
    }

    public void c(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Object r21) {
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r16
            r4 = r21
            na.e r5 = r3.f9099h
            na.a r6 = r5.g(r2)
            be.k r7 = r5.f9114h
            r7.n(r0, r1, r2, r6)
            ra.c r7 = r5.f9124r
            r7.a(r0, r1, r2, r6)
            ta.c r6 = r5.f9122p
            r7 = 0
            r6.c(r2, r1, r0, r7)
            hb.c r0 = r5.f9123q
            r0.getClass()
            java.lang.Object r1 = r0.f5341j
            na.b r1 = (na.b) r1
            java.lang.String r2 = "sendId"
            java.lang.String r2 = hb.c.r(r4, r2)
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L3b
            java.lang.String r2 = "sendid"
            java.lang.String r2 = hb.c.r(r4, r2)
        L3b:
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 == 0) goto L43
            r2 = r20
        L43:
            java.lang.String r5 = "receiveId"
            java.lang.String r5 = hb.c.r(r4, r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L55
            java.lang.String r5 = "receiveid"
            java.lang.String r5 = hb.c.r(r4, r5)
        L55:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L61
            java.lang.String r5 = "receive_id"
            java.lang.String r5 = hb.c.r(r4, r5)
        L61:
            java.lang.String r6 = "ver"
            java.lang.String r6 = hb.c.r(r4, r6)
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 == 0) goto L73
            java.lang.String r6 = "hbVer"
            java.lang.String r6 = hb.c.r(r4, r6)
        L73:
            java.lang.Object r4 = r0.f5340i
            m8.c r4 = (m8.c) r4
            java.lang.Object r8 = r0.f5338g
            h.Hchat.dexkit.DexFinder r8 = (h.Hchat.dexkit.DexFinder) r8
            java.lang.String r9 = "祝福功能不可用: class="
            java.lang.String r10 = "自动祝福已发送: "
            java.lang.Object r0 = r0.f5339h
            l3.l r0 = (l3.l) r0
            java.lang.String r11 = "hb_wish_enable"
            android.content.SharedPreferences r12 = r0.b()     // Catch: java.lang.Throwable -> L8e
            boolean r11 = r12.getBoolean(r11, r7)     // Catch: java.lang.Throwable -> L8e
            goto L8f
        L8e:
            r11 = r7
        L8f:
            if (r11 != 0) goto L93
            goto L16e
        L93:
            boolean r11 = android.text.TextUtils.isEmpty(r2)
            if (r11 == 0) goto L9b
            goto L16e
        L9b:
            java.lang.String r11 = "hb_wish_text"
            java.lang.String r12 = "谢谢老板"
            java.lang.String r11 = r0.d(r11, r12)
            java.lang.String r12 = "hb_wish_random"
            android.content.SharedPreferences r13 = r0.b()     // Catch: java.lang.Throwable -> Lae
            boolean r12 = r13.getBoolean(r12, r7)     // Catch: java.lang.Throwable -> Lae
            goto Laf
        Lae:
            r12 = r7
        Laf:
            java.lang.String r13 = ""
            if (r12 != 0) goto Lb6
        Lb3:
            r17 = r8
            goto Le5
        Lb6:
            java.lang.String r12 = "hb_wish_templates"
            java.lang.String r0 = r0.d(r12, r13)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 == 0) goto Lc3
            goto Lb3
        Lc3:
            java.lang.String r12 = "\\|"
            java.lang.String[] r0 = r0.split(r12)
            int r12 = r0.length
            if (r12 != 0) goto Lcd
            goto Lb3
        Lcd:
            double r14 = java.lang.Math.random()
            int r12 = r0.length
            r17 = r8
            double r7 = (double) r12
            double r14 = r14 * r7
            int r7 = (int) r14
            r0 = r0[r7]
            java.lang.String r0 = r0.trim()
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 == 0) goto Le4
            goto Le5
        Le4:
            r11 = r0
        Le5:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto Led
            goto L16e
        Led:
            r8 = r17
            java.lang.Class<?> r0 = r8.wishWxHbClass     // Catch: java.lang.Throwable -> L107
            if (r0 == 0) goto L131
            java.lang.reflect.Constructor<?> r0 = r8.wishWxHbCtor     // Catch: java.lang.Throwable -> L107
            if (r0 == 0) goto L131
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L107
            if (r7 == 0) goto Lfe
            r5 = r13
        Lfe:
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L107
            if (r7 == 0) goto L109
            java.lang.String r6 = "v1.0"
            goto L109
        L107:
            r0 = move-exception
            goto L16f
        L109:
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r11, r5, r6}     // Catch: java.lang.Throwable -> L107
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.newInstance(r0, r2)     // Catch: java.lang.Throwable -> L107
            boolean r0 = r4.j(r0)     // Catch: java.lang.Throwable -> L107
            if (r0 == 0) goto L129
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L107
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L107
            r0.append(r11)     // Catch: java.lang.Throwable -> L107
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L107
            na.e r2 = r1.f9099h     // Catch: java.lang.Throwable -> L107
            r2.d(r0)     // Catch: java.lang.Throwable -> L107
            goto L16e
        L129:
            java.lang.String r0 = "自动祝福发送失败"
            na.e r2 = r1.f9099h     // Catch: java.lang.Throwable -> L107
            r2.d(r0)     // Catch: java.lang.Throwable -> L107
            goto L16e
        L131:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L107
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L107
            java.lang.Class<?> r2 = r8.wishWxHbClass     // Catch: java.lang.Throwable -> L107
            r5 = 1
            if (r2 == 0) goto L13d
            r2 = r5
            goto L13e
        L13d:
            r2 = 0
        L13e:
            r0.append(r2)     // Catch: java.lang.Throwable -> L107
            java.lang.String r2 = " ctor="
            r0.append(r2)     // Catch: java.lang.Throwable -> L107
            java.lang.reflect.Constructor<?> r2 = r8.wishWxHbCtor     // Catch: java.lang.Throwable -> L107
            if (r2 == 0) goto L14c
            r2 = r5
            goto L14d
        L14c:
            r2 = 0
        L14d:
            r0.append(r2)     // Catch: java.lang.Throwable -> L107
            java.lang.String r2 = " dispatcher="
            r0.append(r2)     // Catch: java.lang.Throwable -> L107
            java.lang.Object r2 = r4.f8780c     // Catch: java.lang.Throwable -> L107
            if (r2 == 0) goto L161
            java.lang.Object r2 = r4.f8781d     // Catch: java.lang.Throwable -> L107
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L107
            if (r2 == 0) goto L161
            r7 = r5
            goto L162
        L161:
            r7 = 0
        L162:
            r0.append(r7)     // Catch: java.lang.Throwable -> L107
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L107
            na.e r2 = r1.f9099h     // Catch: java.lang.Throwable -> L107
            r2.d(r0)     // Catch: java.lang.Throwable -> L107
        L16e:
            return
        L16f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "ERROR sendWish: "
            r2.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            na.e r1 = r1.f9099h
            r1.d(r0)
            return
    }

    public void d(java.lang.String r6, java.lang.String r7, boolean r8) {
            r5 = this;
            na.e r0 = r5.f9099h
            na.k r1 = r0.f9112f
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L13
            b5.c r2 = r0.f9113g
            boolean r2 = r2.y(r6)
            if (r2 != 0) goto L13
            goto L50
        L13:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L22
            java.util.concurrent.ConcurrentHashMap r2 = r1.f9183h
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            goto L23
        L22:
            r2 = 0
        L23:
            na.a r3 = r0.g(r6)
            be.k r4 = r0.f9114h
            r4.n(r7, r2, r6, r3)
            ra.c r4 = r0.f9124r
            r4.a(r7, r2, r6, r3)
            ta.c r0 = r0.f9122p
            r0.c(r6, r2, r7, r8)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L50
            java.util.concurrent.ConcurrentHashMap r7 = r1.f9181f
            r7.remove(r6)
            java.util.concurrent.ConcurrentHashMap r7 = r1.f9182g
            r7.remove(r6)
            java.util.concurrent.ConcurrentHashMap r7 = r1.f9183h
            r7.remove(r6)
            java.util.concurrent.ConcurrentHashMap r7 = r1.f9184i
            r7.remove(r6)
        L50:
            return
    }
}
