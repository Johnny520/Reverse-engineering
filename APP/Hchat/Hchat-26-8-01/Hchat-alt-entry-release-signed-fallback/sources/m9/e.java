package m9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.List f8798h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.List f8799i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.util.List f8800j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.util.HashSet f8801k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.util.HashSet f8802l = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f8803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia.t f8804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.os.Handler f8805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.ThreadLocal f8806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f8807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Object f8808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f8809g;

    static {
            java.lang.String r10 = "field_designerID"
            java.lang.String r11 = "field_thumbUrl"
            java.lang.String r0 = "field_md5"
            java.lang.String r1 = "field_svrid"
            java.lang.String r2 = "field_catalog"
            java.lang.String r3 = "field_size"
            java.lang.String r4 = "field_name"
            java.lang.String r5 = "field_content"
            java.lang.String r6 = "field_reserved3"
            java.lang.String r7 = "field_reserved4"
            java.lang.String r8 = "field_groupId"
            java.lang.String r9 = "field_source"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.List r0 = a.a.y0(r0)
            m9.e.f8798h = r0
            m9.b r1 = new m9.b
            r3 = 2782(0xade, float:3.898E-42)
            java.lang.String r6 = "jsb_j.png"
            r2 = 1
            java.lang.String r4 = "剪刀"
            java.lang.String r5 = "514914788fc461e7205bf0b6ba496c49"
            r1.<init>(r2, r3, r4, r5, r6)
            m9.b r2 = new m9.b
            r4 = 2278(0x8e6, float:3.192E-42)
            java.lang.String r7 = "jsb_s.png"
            r3 = 2
            java.lang.String r5 = "石头"
            java.lang.String r6 = "f790e342a02e0f99d34b316547f9aeab"
            r2.<init>(r3, r4, r5, r6, r7)
            m9.b r3 = new m9.b
            r5 = 3612(0xe1c, float:5.061E-42)
            java.lang.String r8 = "jsb_b.png"
            r4 = 3
            java.lang.String r6 = "布"
            java.lang.String r7 = "091577322c40c05aa3dd701da29d6423"
            r3.<init>(r4, r5, r6, r7, r8)
            m9.b[] r0 = new m9.b[]{r1, r2, r3}
            java.util.List r0 = a.a.y0(r0)
            m9.e.f8799i = r0
            m9.b r1 = new m9.b
            r3 = 2342(0x926, float:3.282E-42)
            java.lang.String r6 = "dice_1.png"
            r2 = 1
            java.lang.String r4 = "1 点"
            java.lang.String r5 = "da1c289d4e363f3ce1ff36538903b92f"
            r1.<init>(r2, r3, r4, r5, r6)
            m9.b r2 = new m9.b
            r4 = 2278(0x8e6, float:3.192E-42)
            java.lang.String r7 = "dice_2.png"
            r3 = 2
            java.lang.String r5 = "2 点"
            java.lang.String r6 = "9e3f303561566dc9342a3ea41e6552a6"
            r2.<init>(r3, r4, r5, r6, r7)
            m9.b r3 = new m9.b
            r5 = 2404(0x964, float:3.369E-42)
            java.lang.String r8 = "dice_3.png"
            r4 = 3
            java.lang.String r6 = "3 点"
            java.lang.String r7 = "dbcc51db2765c1d0106290bae6326fc4"
            r3.<init>(r4, r5, r6, r7, r8)
            m9.b r4 = new m9.b
            r6 = 2422(0x976, float:3.394E-42)
            java.lang.String r9 = "dice_4.png"
            r5 = 4
            java.lang.String r7 = "4 点"
            java.lang.String r8 = "9a21c57defc4974ab5b7c842e3232671"
            r4.<init>(r5, r6, r7, r8, r9)
            m9.b r5 = new m9.b
            r7 = 2538(0x9ea, float:3.556E-42)
            java.lang.String r10 = "dice_5.png"
            r6 = 5
            java.lang.String r8 = "5 点"
            java.lang.String r9 = "3a8e16d650f7e66ba5516b2780512830"
            r5.<init>(r6, r7, r8, r9, r10)
            m9.b r6 = new m9.b
            r8 = 2536(0x9e8, float:3.554E-42)
            java.lang.String r11 = "dice_6.png"
            r7 = 6
            java.lang.String r9 = "6 点"
            java.lang.String r10 = "5ba8e9694b853df10b9f2a77b312cc09"
            r6.<init>(r7, r8, r9, r10, r11)
            m9.b[] r1 = new m9.b[]{r1, r2, r3, r4, r5, r6}
            java.util.List r1 = a.a.y0(r1)
            m9.e.f8800j = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lbd:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lcf
            java.lang.Object r2 = r0.next()
            m9.b r2 = (m9.b) r2
            java.lang.String r2 = r2.f8787c
            r1.add(r2)
            goto Lbd
        Lcf:
            m9.e.f8801k = r1
            java.util.List r0 = m9.e.f8800j
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ldc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lee
            java.lang.Object r2 = r0.next()
            m9.b r2 = (m9.b) r2
            java.lang.String r2 = r2.f8787c
            r1.add(r2)
            goto Ldc
        Lee:
            m9.e.f8802l = r1
            return
    }

    public e(r8.g r1, ia.t r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f8803a = r1
            r0.f8804b = r2
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.f8805c = r1
            java.lang.ThreadLocal r1 = new java.lang.ThreadLocal
            r1.<init>()
            r0.f8806d = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            r0.f8807e = r1
            tf.u r1 = tf.u.f13168g
            r0.f8808f = r1
            return
    }

    public final boolean a(java.lang.Object r22, m9.c r23, int r24) {
            r21 = this;
            r0 = r23
            r1 = r24
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            m9.c r4 = m9.c.f8791i
            if (r0 != r4) goto L10
            java.util.List r5 = m9.e.f8800j
            goto L12
        L10:
            java.util.List r5 = m9.e.f8799i
        L12:
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r6 = r5.hasNext()
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L2f
            java.lang.Object r6 = r5.next()
            r9 = r6
            m9.b r9 = (m9.b) r9
            int r9 = r9.f8785a
            if (r9 != r1) goto L2b
            r9 = r8
            goto L2c
        L2b:
            r9 = r2
        L2c:
            if (r9 == 0) goto L16
            goto L30
        L2f:
            r6 = r7
        L30:
            m9.b r6 = (m9.b) r6
            if (r6 == 0) goto Lf7
            if (r0 != r4) goto L38
            int r1 = r1 + 3
        L38:
            java.lang.String r4 = r6.f8787c
            sf.e r9 = new sf.e
            java.lang.String r5 = "field_md5"
            r9.<init>(r5, r4)
            int r4 = r6.f8788d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            sf.e r10 = new sf.e
            java.lang.String r5 = "field_size"
            r10.<init>(r5, r4)
            int r0 = r0.f8793g
            java.lang.String r4 = "\" content=\""
            java.lang.String r5 = "\" ></gameext>"
            java.lang.String r11 = "<gameext type=\""
            java.lang.String r0 = eh.a.k(r0, r1, r11, r4, r5)
            sf.e r11 = new sf.e
            java.lang.String r1 = "field_content"
            r11.<init>(r1, r0)
            java.lang.String r0 = r6.f8789e
            sf.e r12 = new sf.e
            java.lang.String r1 = "field_name"
            r12.<init>(r1, r0)
            sf.e r13 = new sf.e
            java.lang.String r0 = "field_svrid"
            java.lang.String r1 = ""
            r13.<init>(r0, r1)
            r0 = 50
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            sf.e r14 = new sf.e
            java.lang.String r1 = "field_catalog"
            r14.<init>(r1, r0)
            sf.e r15 = new sf.e
            java.lang.String r0 = "field_reserved3"
            r15.<init>(r0, r3)
            sf.e r0 = new sf.e
            java.lang.String r1 = "field_reserved4"
            r0.<init>(r1, r3)
            sf.e r1 = new sf.e
            java.lang.String r4 = "field_groupId"
            java.lang.String r5 = "50"
            r1.<init>(r4, r5)
            sf.e r4 = new sf.e
            java.lang.String r5 = "field_source"
            r4.<init>(r5, r3)
            sf.e r3 = new sf.e
            java.lang.String r5 = "field_designerID"
            r3.<init>(r5, r7)
            sf.e r5 = new sf.e
            java.lang.String r6 = "field_thumbUrl"
            r5.<init>(r6, r7)
            r16 = r0
            r17 = r1
            r19 = r3
            r18 = r4
            r20 = r5
            sf.e[] r0 = new sf.e[]{r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            java.util.Map r0 = tf.y.b0(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lc6:
            r1 = r8
        Lc7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lf4
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            r5 = r21
            java.lang.Object r6 = r5.f8808f
            java.lang.Object r4 = r6.get(r4)
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r6 = r22
            boolean r3 = h.Hchat.utils.KavaReflector.writeField(r4, r6, r3)
            if (r3 == 0) goto Lf2
            if (r1 == 0) goto Lf2
            goto Lc6
        Lf2:
            r1 = r2
            goto Lc7
        Lf4:
            r5 = r21
            return r1
        Lf7:
            r5 = r21
            return r2
    }

    public final java.lang.String b(java.lang.Object r2, java.lang.String r3) {
            r1 = this;
            java.lang.Object r0 = r1.f8808f
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r3, r2)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L13
            java.lang.String r2 = (java.lang.String) r2
            goto L14
        L13:
            r2 = 0
        L14:
            if (r2 == 0) goto L17
            return r2
        L17:
            java.lang.String r2 = ""
            return r2
    }

    public final void c(m9.d r5, m9.b r6) {
            r4 = this;
            java.lang.Object[] r0 = r5.f8796c
            r1 = 1
            java.lang.Object r1 = tf.l.C0(r1, r0)
            if (r1 == 0) goto L44
            ia.t r2 = r4.f8804b
            if (r6 == 0) goto L1e
            m9.c r3 = r5.f8797d
            int r6 = r6.f8785a
            boolean r6 = r4.a(r1, r3, r6)
            if (r6 != 0) goto L1e
            java.lang.String r5 = "应用所选游戏表情结果失败"
            r6 = 0
            r2.invoke(r5, r6)
            return
        L1e:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.ThreadLocal r1 = r4.f8806d
            r1.set(r6)
            java.lang.reflect.Method r6 = r5.f8794a     // Catch: java.lang.Throwable -> L35
            java.lang.Object r5 = r5.f8795b     // Catch: java.lang.Throwable -> L35
            int r3 = r0.length     // Catch: java.lang.Throwable -> L35
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> L35
            h.Hchat.utils.KavaReflector.invokeOrThrow(r6, r5, r0)     // Catch: java.lang.Throwable -> L35
            r1.remove()
            return
        L35:
            r5 = move-exception
            java.lang.String r6 = "重新发送游戏表情失败"
            r2.invoke(r6, r5)     // Catch: java.lang.Throwable -> L3f
            r1.remove()
            return
        L3f:
            r5 = move-exception
            r1.remove()
            throw r5
        L44:
            return
    }

    public final java.util.LinkedHashMap d(java.lang.Class r5) {
            r4 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.List r1 = m9.e.f8798h
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r3 = h.Hchat.utils.KavaReflector.findFieldRecursive(r5, r2)
            if (r3 == 0) goto L21
            r0.put(r2, r3)
            goto Lb
        L21:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "EmojiInfo 缺少字段: "
            r5.<init>(r0)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            ia.t r0 = r4.f8804b
            r1 = 0
            r0.invoke(r5, r1)
            return r1
        L36:
            return r0
    }
}
