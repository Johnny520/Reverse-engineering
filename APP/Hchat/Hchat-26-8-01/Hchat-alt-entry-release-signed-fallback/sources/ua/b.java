package ua;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.os.Handler f13569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f13570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f13571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile ua.k f13572h;

    public b() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f13569e = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2.f13570f = r0
            return
    }

    public static boolean l(java.lang.String r5, java.lang.String r6) {
            if (r5 == 0) goto L42
            boolean r0 = og.m.t0(r5)
            if (r0 == 0) goto L9
            goto L42
        L9:
            java.lang.String r0 = "\n"
            java.lang.String r1 = "\r"
            java.lang.String r2 = "|"
            java.lang.String r3 = ","
            java.lang.String r4 = "，"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.List r6 = og.m.G0(r6, r0)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L22
            goto L42
        L22:
            java.util.Iterator r6 = r6.iterator()
        L26:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r0 = gg.l.a(r0, r5)
            if (r0 == 0) goto L26
            r5 = 1
            return r5
        L42:
            r5 = 0
            return r5
    }

    public static java.lang.String n(ua.d r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.f13599a
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            java.lang.String r2 = r3.f13600b
            r0.append(r2)
            r0.append(r1)
            java.lang.String r3 = r3.f13601c
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "auto_transfer"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            s8.d r5 = new s8.d
            java.lang.String r0 = "自动领取微信转账"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "auto_transfer"
            java.lang.String r3 = "自动收款"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r6) {
            r5 = this;
            r6.getClass()
            android.os.Handler r0 = r8.e.f11615a
            sh.v1 r0 = new sh.v1
            r1 = 1
            r0.<init>(r6, r1, r5)
            r1 = 8
            java.lang.String r2 = "auto_transfer"
            java.lang.String r3 = "自动收款"
            r8.c r4 = r8.c.f11604j
            r8.e.f(r1, r0, r2, r3, r4)
            e9.a r0 = new e9.a
            r1 = 9
            r0.<init>(r5, r1, r6)
            java.lang.Class<f8.e> r6 = f8.e.class
            r5.i(r6, r0)
            return
    }

    public final void k(ua.c r19, k8.o r20, ua.d r21, ua.f r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r5 = r21
            java.lang.String r2 = "confirm"
            r3 = r22
            boolean r2 = r0.m(r5, r2, r3)
            if (r2 != 0) goto L16
            java.lang.String r3 = "自动收款失败"
            r4 = 0
            r0.e(r3, r4)
        L16:
            if (r2 != 0) goto L1a
            goto Lac
        L1a:
            ua.k r2 = r0.f13572h
            if (r2 == 0) goto Lac
            java.lang.String r8 = n(r5)
            boolean r3 = og.m.t0(r8)
            if (r3 != 0) goto L32
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = r2.f13663e
            boolean r3 = r3.add(r8)
            if (r3 != 0) goto L32
            goto Lac
        L32:
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = r1.B
            r4 = r20
            java.lang.String r9 = r2.a(r3, r4, r5, r6)
            java.lang.String r3 = r1.C
            r5 = r21
            java.lang.String r3 = r2.a(r3, r4, r5, r6)
            r15 = r2
            r2 = r4
            r16 = r6
            boolean r10 = r1.f13594v
            if (r10 != 0) goto L52
            boolean r4 = r1.f13595w
            if (r4 == 0) goto L68
        L52:
            r6 = r3
            sa.c r3 = r15.f13662d
            java.lang.String r7 = r2.f7446c
            boolean r11 = r1.f13595w
            boolean r12 = r1.f13596x
            boolean r13 = r1.f13598z
            java.lang.String r14 = r1.A
            java.lang.String r4 = "自动收款"
            r5 = r9
            r9 = 300000(0x493e0, float:4.2039E-40)
            r3.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L68:
            boolean r3 = r1.D
            if (r3 == 0) goto L8c
            java.lang.String r3 = r1.E
            r5 = r21
            r4 = r2
            r2 = r15
            r6 = r16
            java.lang.String r3 = r2.a(r3, r4, r5, r6)
            boolean r8 = og.m.t0(r3)
            if (r8 == 0) goto L7f
            goto L8a
        L7f:
            android.os.Handler r8 = r2.f13661c
            rb.g r9 = new rb.g
            r10 = 4
            r9.<init>(r2, r10, r3)
            r8.post(r9)
        L8a:
            r15 = r2
            goto L91
        L8c:
            r5 = r21
            r4 = r2
            r6 = r16
        L91:
            java.lang.String r2 = r4.f7446c
            r2.getClass()
            java.lang.String r3 = r5.f13601c
            boolean r8 = og.m.t0(r3)
            if (r8 == 0) goto La0
            java.lang.String r3 = r4.f7447d
        La0:
            r3.getClass()
            java.util.List r1 = r1.f13593u
            r9 = 0
            r7 = r6
            r6 = r1
            r1 = r15
            r1.b(r2, r3, r4, r5, r6, r7, r9)
        Lac:
            return
    }

    public final boolean m(ua.d r13, java.lang.String r14, ua.f r15) {
            r12 = this;
            java.lang.String r2 = r13.f13600b
            java.lang.String r1 = r13.f13599a
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            r4 = 0
            if (r0 != 0) goto L12
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L16
        L12:
            r7 = r3
            r6 = r4
            goto L8e
        L16:
            i8.d r0 = h.Hchat.hooks.api.core.WeChatApis.payment()
            r0.getClass()
            n8.c r11 = h.Hchat.hooks.api.core.WeChatApis.q()
            if (r11 == 0) goto L29
            boolean r0 = r11.c()
            if (r0 != 0) goto L2c
        L29:
            r7 = r3
            r6 = r4
            goto L63
        L2c:
            n8.a r0 = new n8.a
            r5 = r3
            int r3 = r13.f13604f
            r6 = r4
            java.lang.String r4 = r13.f13601c
            r7 = r5
            int r5 = r13.f13603e
            if (r15 == 0) goto L3b
            int r6 = r15.f13612c
        L3b:
            if (r15 == 0) goto L3f
            java.lang.String r7 = r15.f13614e
        L3f:
            if (r7 != 0) goto L43
            java.lang.String r7 = ""
        L43:
            if (r15 == 0) goto L48
            long r8 = r15.f13613d
            goto L4a
        L48:
            r8 = 0
        L4a:
            java.lang.String r10 = r13.f13607i
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10)
            java.lang.String r13 = "refuse"
            boolean r14 = r14.equals(r13)
            if (r14 == 0) goto L5c
            boolean r13 = r11.f(r13, r0)
            return r13
        L5c:
            java.lang.String r13 = "confirm"
            boolean r13 = r11.f(r13, r0)
            return r13
        L63:
            if (r11 == 0) goto L67
            r13 = 1
            goto L68
        L67:
            r13 = r6
        L68:
            if (r11 == 0) goto L73
            boolean r14 = r11.c()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            goto L74
        L73:
            r14 = r7
        L74:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "转账 API 未就绪: api="
            r15.<init>(r0)
            r15.append(r13)
            java.lang.String r13 = " canOperate="
            r15.append(r13)
            r15.append(r14)
            java.lang.String r13 = r15.toString()
            r12.e(r13, r7)
            return r6
        L8e:
            java.lang.String r13 = "转账单号缺失，跳过"
            r12.e(r13, r7)
            return r6
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "自动收款"
            return r0
    }
}
