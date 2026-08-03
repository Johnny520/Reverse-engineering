package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class c implements i.q1, u4.h, z0.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object f5338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f5339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f5340i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f5341j;

    public c(android.graphics.Typeface r8, m3.b r9) {
            r7 = this;
            r7.<init>()
            r7.f5341j = r8
            r7.f5338g = r9
            l3.t r8 = new l3.t
            r0 = 1024(0x400, float:1.435E-42)
            r8.<init>(r0)
            r7.f5340i = r8
            r8 = 6
            int r0 = r9.a(r8)
            r1 = 0
            if (r0 == 0) goto L2d
            int r2 = r9.f8713g
            int r0 = r0 + r2
            java.lang.Object r2 = r9.f8716j
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r0)
            int r2 = r2 + r0
            java.lang.Object r0 = r9.f8716j
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt(r2)
            goto L2e
        L2d:
            r0 = r1
        L2e:
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r7.f5339h = r0
            int r8 = r9.a(r8)
            if (r8 == 0) goto L4f
            int r0 = r9.f8713g
            int r8 = r8 + r0
            java.lang.Object r0 = r9.f8716j
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt(r8)
            int r0 = r0 + r8
            java.lang.Object r8 = r9.f8716j
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            int r8 = r8.getInt(r0)
            goto L50
        L4f:
            r8 = r1
        L50:
            r9 = r1
        L51:
            if (r9 >= r8) goto Ld5
            l3.u r0 = new l3.u
            r0.<init>(r7, r9)
            m3.a r2 = r0.b()
            r3 = 4
            int r3 = r2.a(r3)
            if (r3 == 0) goto L6f
            java.lang.Object r4 = r2.f8716j
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r2 = r2.f8713g
            int r3 = r3 + r2
            int r2 = r4.getInt(r3)
            goto L70
        L6f:
            r2 = r1
        L70:
            java.lang.Object r3 = r7.f5339h
            char[] r3 = (char[]) r3
            int r4 = r9 * 2
            java.lang.Character.toChars(r2, r3, r4)
            m3.a r2 = r0.b()
            r3 = 16
            int r4 = r2.a(r3)
            if (r4 == 0) goto L9a
            int r5 = r2.f8713g
            int r4 = r4 + r5
            java.lang.Object r5 = r2.f8716j
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r5 = r5.getInt(r4)
            int r5 = r5 + r4
            java.lang.Object r2 = r2.f8716j
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r5)
            goto L9b
        L9a:
            r2 = r1
        L9b:
            r4 = 1
            if (r2 <= 0) goto La0
            r2 = r4
            goto La1
        La0:
            r2 = r1
        La1:
            if (r2 == 0) goto Lce
            java.lang.Object r2 = r7.f5340i
            l3.t r2 = (l3.t) r2
            m3.a r5 = r0.b()
            int r3 = r5.a(r3)
            if (r3 == 0) goto Lc6
            int r6 = r5.f8713g
            int r3 = r3 + r6
            java.lang.Object r6 = r5.f8716j
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            int r6 = r6.getInt(r3)
            int r6 = r6 + r3
            java.lang.Object r3 = r5.f8716j
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r6)
            goto Lc7
        Lc6:
            r3 = r1
        Lc7:
            int r3 = r3 - r4
            r2.a(r0, r1, r3)
            int r9 = r9 + 1
            goto L51
        Lce:
            java.lang.String r8 = "invalid metadata codepoint length"
            j8.o.t(r8)
            r8 = 0
            throw r8
        Ld5:
            return
    }

    public c(i.z r3) {
            r2 = this;
            androidx.lifecycle.x r0 = new androidx.lifecycle.x
            r1 = 21
            r0.<init>(r3, r1)
            r2.<init>(r0)
            return
    }

    public /* synthetic */ c(java.lang.Object r1) {
            r0 = this;
            r0.f5338g = r1
            r0.<init>()
            return
    }

    public static void A(android.app.Activity r2, java.lang.String r3) {
            if (r2 == 0) goto L3
            goto L20
        L3:
            q8.o r2 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            r0 = 0
            if (r2 == 0) goto Lf
            android.app.Activity r2 = r2.a()
            goto L10
        Lf:
            r2 = r0
        L10:
            if (r2 == 0) goto L13
            goto L14
        L13:
            r2 = r0
        L14:
            if (r2 == 0) goto L1d
            boolean r1 = r2.isFinishing()
            if (r1 != 0) goto L1d
            goto L1e
        L1d:
            r2 = r0
        L1e:
            if (r2 == 0) goto L2a
        L20:
            c9.t r0 = new c9.t
            r1 = 8
            r0.<init>(r2, r3, r1)
            r2.runOnUiThread(r0)
        L2a:
            return
    }

    public static boolean B(hb.b r6, int r7) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f5328b
            boolean r0 = r0.get()
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            r0 = 0
            r2 = 3600(0xe10, float:5.045E-42)
            int r7 = r9.e0.r(r7, r0, r2)
            long r2 = (long) r7
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r4 = 500(0x1f4, double:2.47E-321)
            long r2 = java.lang.Math.max(r4, r2)
            java.util.concurrent.CountDownLatch r6 = r6.f5329c     // Catch: java.lang.InterruptedException -> L24
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L24
            boolean r6 = r6.await(r2, r7)     // Catch: java.lang.InterruptedException -> L24
            return r6
        L24:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
            return r1
    }

    public static long q(java.lang.Object r10) {
            java.lang.String r0 = "getMsgID"
            java.lang.String r1 = "getId"
            java.lang.String r2 = "getMsgId"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            r1 = 0
            r2 = r1
        Lc:
            r3 = 0
            r5 = 1
            r6 = 0
            r7 = 3
            if (r2 < r7) goto L51
            java.lang.String r0 = "msgID"
            java.lang.String r2 = "id"
            java.lang.String r7 = "field_msgId"
            java.lang.String r8 = "msgId"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r0, r2}
            r0 = r1
        L20:
            r2 = 4
            if (r0 < r2) goto L24
            return r3
        L24:
            r2 = r7[r0]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r10, r2)
            boolean r8 = r2 instanceof java.lang.Number
            if (r8 == 0) goto L31
            java.lang.Number r2 = (java.lang.Number) r2
            goto L32
        L31:
            r2 = r6
        L32:
            if (r2 == 0) goto L4e
            long r8 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L42
            r8 = r5
            goto L43
        L42:
            r8 = r1
        L43:
            if (r8 == 0) goto L46
            goto L47
        L46:
            r2 = r6
        L47:
            if (r2 == 0) goto L4e
            long r0 = r2.longValue()
            return r0
        L4e:
            int r0 = r0 + 1
            goto L20
        L51:
            r7 = r0[r2]
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invokeMethod(r10, r7, r8)
            boolean r8 = r7 instanceof java.lang.Number
            if (r8 == 0) goto L60
            java.lang.Number r7 = (java.lang.Number) r7
            goto L61
        L60:
            r7 = r6
        L61:
            if (r7 == 0) goto L7b
            long r7 = r7.longValue()
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 <= 0) goto L70
            goto L71
        L70:
            r5 = r1
        L71:
            if (r5 == 0) goto L74
            r6 = r9
        L74:
            if (r6 == 0) goto L7b
            long r0 = r6.longValue()
            return r0
        L7b:
            int r2 = r2 + 1
            goto Lc
    }

    public static java.lang.String r(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L7
            java.lang.String r0 = x6.d.a0(r0, r1)
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static java.util.List t(java.util.List r14) {
            boolean r0 = r14.isEmpty()
            r1 = 0
            if (r0 == 0) goto L9
            goto Lc9
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = tf.n.e1(r14)
            r0.<init>(r2)
            java.util.Iterator r2 = r14.iterator()
        L16:
            boolean r3 = r2.hasNext()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto Lb3
            java.lang.Object r3 = r2.next()
            long r6 = q(r3)
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            r9 = 0
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 <= 0) goto La8
            java.lang.String r9 = "field_isSend"
            java.lang.String r10 = "isSend"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10}
            r11 = r4
        L39:
            r12 = 2
            if (r11 < r12) goto L83
            java.lang.String r9 = "getIsSend"
            java.lang.String[] r13 = new java.lang.String[]{r9, r10}
            r9 = r4
        L43:
            if (r9 < r12) goto L60
            i8.c r3 = h.Hchat.hooks.api.core.WeChatApis.message()
            r3.getClass()
            k8.s r3 = h.Hchat.hooks.api.core.WeChatApis.m()
            if (r3 == 0) goto L5e
            h.Hchat.hooks.api.model.WeChatMessage r3 = r3.c(r6)
            if (r3 == 0) goto L5e
            int r3 = r3.isSend
            if (r3 != r5) goto L5e
        L5c:
            r3 = r5
            goto La1
        L5e:
            r3 = r4
            goto La1
        L60:
            r10 = r13[r9]
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r10, r11)
            boolean r11 = r10 instanceof java.lang.Boolean
            if (r11 == 0) goto L73
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r3 = r10.booleanValue()
            goto La1
        L73:
            boolean r11 = r10 instanceof java.lang.Number
            if (r11 == 0) goto L80
            java.lang.Number r10 = (java.lang.Number) r10
            int r3 = r10.intValue()
            if (r3 == 0) goto L5e
            goto L5c
        L80:
            int r9 = r9 + 1
            goto L43
        L83:
            r12 = r9[r11]
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.readField(r3, r12)
            boolean r13 = r12 instanceof java.lang.Boolean
            if (r13 == 0) goto L94
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r3 = r12.booleanValue()
            goto La1
        L94:
            boolean r13 = r12 instanceof java.lang.Number
            if (r13 == 0) goto La5
            java.lang.Number r12 = (java.lang.Number) r12
            int r3 = r12.intValue()
            if (r3 == 0) goto L5e
            goto L5c
        La1:
            if (r3 == 0) goto La8
            r4 = r5
            goto La8
        La5:
            int r11 = r11 + 1
            goto L39
        La8:
            if (r4 == 0) goto Lab
            goto Lac
        Lab:
            r8 = r1
        Lac:
            if (r8 == 0) goto Lc9
            r0.add(r8)
            goto L16
        Lb3:
            java.util.Set r0 = tf.m.T1(r0)
            java.util.List r0 = tf.m.P1(r0)
            int r0 = r0.size()
            int r2 = r14.size()
            if (r0 != r2) goto Lc6
            r4 = r5
        Lc6:
            if (r4 == 0) goto Lc9
            return r14
        Lc9:
            return r1
    }

    public static boolean y(db.a r5, java.lang.String r6, java.lang.String r7, k8.g r8, j8.p r9) {
            int r0 = r5.f2166a
            java.lang.String r1 = r5.f2167b
            java.lang.String r2 = "%friendName%"
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L76;
                case 1: goto L2e;
                case 2: goto L2e;
                case 3: goto L2e;
                case 4: goto L2e;
                case 5: goto L2e;
                case 6: goto L1b;
                case 7: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L89
        Ld:
            if (r9 == 0) goto L89
            j8.h r5 = r9.f6820f
            if (r5 == 0) goto L89
            boolean r5 = r5.A(r6, r1)
            if (r5 != r3) goto L89
            goto L88
        L1b:
            java.lang.String r5 = og.t.a0(r1, r2, r7, r4)
            boolean r7 = og.m.t0(r5)
            if (r7 != 0) goto L89
            if (r8 == 0) goto L89
            boolean r5 = r8.z(r6, r5)
            if (r5 != r3) goto L89
            goto L88
        L2e:
            java.io.File r7 = new java.io.File
            r7.<init>(r1)
            boolean r8 = r7.isFile()
            if (r8 == 0) goto L89
            if (r9 != 0) goto L3c
            goto L89
        L3c:
            int r5 = r5.f2166a
            if (r5 == r3) goto L6d
            r8 = 2
            if (r5 == r8) goto L66
            r8 = 3
            if (r5 == r8) goto L5b
            r7 = 4
            if (r5 == r7) goto L54
            r7 = 5
            if (r5 == r7) goto L4d
            goto L89
        L4d:
            j8.y r5 = r9.f6816b
            boolean r5 = r5.t(r6, r1)
            return r5
        L54:
            j8.f r5 = r9.f6818d
            boolean r5 = r5.v(r6, r1)
            return r5
        L5b:
            java.lang.String r5 = r7.getName()
            androidx.lifecycle.x r7 = r9.f6819e
            boolean r5 = r7.T(r6, r1, r5)
            return r5
        L66:
            bb.b r5 = r9.f6817c
            boolean r5 = r5.q(r6, r1)
            return r5
        L6d:
            j8.n r5 = r9.f6815a
            java.lang.String r7 = ""
            boolean r5 = r5.r(r6, r1, r7, r3)
            return r5
        L76:
            java.lang.String r5 = og.t.a0(r1, r2, r7, r4)
            boolean r7 = og.m.t0(r5)
            if (r7 != 0) goto L89
            if (r8 == 0) goto L89
            boolean r5 = r8.x(r6, r5)
            if (r5 != r3) goto L89
        L88:
            return r3
        L89:
            return r4
    }

    @Override // i.n1
    public long b(i.q r9, i.q r10, i.q r11) {
            r8 = this;
            int r0 = r9.b()
            r1 = 0
            r3 = 0
        L7:
            if (r3 >= r0) goto L28
            java.lang.Object r4 = r8.f5338g
            androidx.lifecycle.x r4 = (androidx.lifecycle.x) r4
            i.z r4 = r4.t(r3)
            float r5 = r9.a(r3)
            float r6 = r10.a(r3)
            float r7 = r11.a(r3)
            long r4 = r4.b(r5, r6, r7)
            long r1 = java.lang.Math.max(r1, r4)
            int r3 = r3 + 1
            goto L7
        L28:
            return r1
    }

    public void c(p4.h r2) {
            r1 = this;
            java.lang.Object r0 = r1.f5338g
            p4.t r0 = (p4.t) r0
            java.lang.Object r0 = r0.f10224h
            p4.u r0 = (p4.u) r0
            r0.a(r2)
            return
    }

    public void d(p4.h r2) {
            r1 = this;
            java.lang.Object r0 = r1.f5338g
            p4.t r0 = (p4.t) r0
            java.lang.Object r0 = r0.f10225i
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
            return
    }

    @Override // u4.h
    public void e(u4.v r11) {
            r10 = this;
            u4.t r0 = r11.f13383h
            p4.j r1 = p4.x.a(r11)
            u4.r r2 = r11.f13382g
            v4.a r3 = r11.f13370k
            int r4 = r2.f13410e
            int r5 = r2.f13406a
            r6 = 6
            if (r4 != r6) goto Ld4
            java.lang.Object r4 = r10.f5340i
            p4.f r4 = (p4.f) r4
            r10.c(r4)
            boolean r2 = r2.f13411f
            if (r2 == 0) goto L27
            u4.p r11 = r11.f13385j
            p4.g r2 = new p4.g
            r2.<init>(r1, r0, r11, r3)
            r10.c(r2)
            return
        L27:
            u4.o r2 = r10.i()
            u4.p r4 = p4.y.a(r11, r2)
            boolean r6 = r1.f10122e
            int r7 = r1.f10118a
            r8 = 0
            r9 = 1
            if (r6 != 0) goto L3e
            r6 = 43
            if (r5 != r6) goto L3c
            goto L3e
        L3c:
            r6 = r8
            goto L3f
        L3e:
            r6 = r9
        L3f:
            if (r2 == 0) goto L43
            r2 = r9
            goto L44
        L43:
            r2 = r8
        L44:
            if (r6 != r2) goto Lce
            r11 = 41
            if (r5 != r11) goto L54
            r11 = 35
            if (r7 == r11) goto L54
            p4.z r11 = new p4.z
            r11.<init>(r1, r0, r4)
            goto L59
        L54:
            p4.g r11 = new p4.g
            r11.<init>(r1, r0, r4, r3)
        L59:
            java.lang.Object r1 = r10.f5338g
            p4.t r1 = (p4.t) r1
            java.lang.Object r1 = r1.f10224h
            p4.u r1 = (p4.u) r1
            java.util.ArrayList r2 = r1.f10228c
            int r2 = r2.size()
            int r2 = r2 - r9
        L68:
            r3 = 0
            if (r2 < 0) goto L89
            java.util.ArrayList r4 = r1.f10228c
            int r4 = r4.size()
            if (r2 >= r4) goto L7e
            if (r2 >= 0) goto L76
            goto L7e
        L76:
            java.util.ArrayList r3 = r1.f10228c
            java.lang.Object r3 = r3.get(r2)
            p4.h r3 = (p4.h) r3
        L7e:
            p4.j r4 = r3.f10114b
            int r4 = r4.f10118a
            r5 = -1
            if (r4 == r5) goto L86
            goto L89
        L86:
            int r2 = r2 + (-1)
            goto L68
        L89:
            r1 = 32
            if (r7 != r1) goto Lca
            if (r3 == 0) goto Lca
            u4.p r1 = r3.f10116d
            p4.j r2 = r3.f10114b
            int r2 = r2.f10118a
            r3 = 7
            if (r2 == r3) goto La0
            r3 = 8
            if (r2 == r3) goto La0
            r3 = 9
            if (r2 != r3) goto Lca
        La0:
            u4.p r2 = r11.f10116d
            java.lang.Object[] r3 = r2.f22543h
            int r3 = r3.length
            if (r3 <= 0) goto Lca
            java.lang.Object[] r3 = r1.f22543h
            int r3 = r3.length
            if (r3 <= r9) goto Lca
            java.lang.Object r2 = r2.l(r8)
            u4.o r2 = (u4.o) r2
            int r2 = r2.f13400g
            java.lang.Object r1 = r1.l(r9)
            u4.o r1 = (u4.o) r1
            int r1 = r1.f13400g
            if (r2 != r1) goto Lca
            p4.z r1 = new p4.z
            p4.j r2 = p4.k.f10131c
            u4.p r3 = u4.p.f13403i
            r1.<init>(r2, r0, r3)
            r10.c(r1)
        Lca:
            r10.c(r11)
            return
        Lce:
            java.lang.String r0 = "Insn with result/move-result-pseudo mismatch "
            okio.a.o(r11, r0)
            return
        Ld4:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            int r0 = r2.f13410e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected BRANCH_THROW got "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.<init>(r0)
            throw r11
    }

    public void f(s1.k r8, boolean r9) {
            r7 = this;
            java.lang.Object r0 = r7.f5341j
            s1.a0 r0 = (s1.a0) r0
            java.lang.Object r1 = r8.f12262a
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L21
            java.lang.Object r5 = r1.get(r4)
            s1.t r5 = (s1.t) r5
            boolean r5 = r5.b()
            if (r5 == 0) goto L1e
            r7.z(r8)
            return
        L1e:
            int r4 = r4 + 1
            goto Lc
        L21:
            java.lang.Object r2 = r7.f5338g
            v1.t r2 = (v1.t) r2
            if (r2 == 0) goto L5d
            r4 = 0
            long r4 = r2.m0(r4)
            f1.p r2 = new f1.p
            r6 = 4
            r2.<init>(r7, r6, r0)
            s1.s.i(r8, r4, r2, r3)
            java.lang.Object r2 = r7.f5339h
            s1.y r2 = (s1.y) r2
            s1.y r4 = s1.y.f12325h
            if (r2 != r4) goto L5c
            if (r9 == 0) goto L52
            int r9 = r1.size()
        L44:
            if (r3 >= r9) goto L52
            java.lang.Object r2 = r1.get(r3)
            s1.t r2 = (s1.t) r2
            r2.a()
            int r3 = r3 + 1
            goto L44
        L52:
            h0.q0 r8 = r8.f12263b
            if (r8 == 0) goto L5c
            boolean r9 = r0.f12205c
            r9 = r9 ^ 1
            r8.f4970b = r9
        L5c:
            return
        L5d:
            java.lang.String r8 = "layoutCoordinates not set"
            j8.o.A(r8)
            return
    }

    @Override // i.n1
    public i.q g(i.q r10, i.q r11, i.q r12) {
            r9 = this;
            java.lang.Object r0 = r9.f5341j
            i.q r0 = (i.q) r0
            if (r0 != 0) goto Lc
            i.q r0 = r12.c()
            r9.f5341j = r0
        Lc:
            java.lang.Object r0 = r9.f5341j
            i.q r0 = (i.q) r0
            r1 = 0
            java.lang.String r2 = "endVelocityVector"
            if (r0 == 0) goto L4b
            int r0 = r0.b()
            r3 = 0
        L1a:
            java.lang.Object r4 = r9.f5341j
            i.q r4 = (i.q) r4
            if (r3 >= r0) goto L44
            if (r4 == 0) goto L40
            java.lang.Object r5 = r9.f5338g
            androidx.lifecycle.x r5 = (androidx.lifecycle.x) r5
            i.z r5 = r5.t(r3)
            float r6 = r10.a(r3)
            float r7 = r11.a(r3)
            float r8 = r12.a(r3)
            float r5 = r5.d(r6, r7, r8)
            r4.e(r3, r5)
            int r3 = r3 + 1
            goto L1a
        L40:
            gg.l.g(r2)
            throw r1
        L44:
            if (r4 == 0) goto L47
            return r4
        L47:
            gg.l.g(r2)
            throw r1
        L4b:
            gg.l.g(r2)
            throw r1
    }

    public hb.s h(java.util.ArrayList r9, java.util.List r10, int r11, int r12, fg.q r13) {
            r8 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r9 = r9.iterator()
        L9:
            boolean r0 = r9.hasNext()
            r1 = 0
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r9.next()
            db.a r0 = (db.a) r0
            java.lang.String r2 = r0.f2167b
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L2f
            int r3 = r0.f2166a
            if (r3 < 0) goto L2f
            r5 = 8
            if (r3 >= r5) goto L2f
            goto L30
        L2f:
            r0 = r1
        L30:
            if (r0 == 0) goto L36
            db.a r1 = db.a.a(r0, r2)
        L36:
            if (r1 == 0) goto L9
            r4.add(r1)
            goto L9
        L3c:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r0 = tf.n.e1(r10)
            r9.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L49:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r10.next()
            java.lang.String r0 = (java.lang.String) r0
            j8.b.r(r0, r9)
            goto L49
        L59:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L62:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r9.next()
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L62
            r10.add(r0)
            goto L62
        L79:
            java.util.Set r9 = tf.m.T1(r10)
            java.util.List r9 = tf.m.P1(r9)
            boolean r10 = r4.isEmpty()
            if (r10 != 0) goto L8d
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L8f
        L8d:
            r2 = r8
            goto Lc6
        L8f:
            hb.b r3 = new hb.b
            java.util.UUID r10 = java.util.UUID.randomUUID()
            java.lang.String r10 = r10.toString()
            r10.getClass()
            r3.<init>(r10)
            java.lang.Object r10 = r8.f5341j
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10
            java.lang.String r0 = r3.f5327a
            r10.put(r0, r3)
            java.lang.Object r10 = r8.f5340i
            java.util.concurrent.ExecutorService r10 = (java.util.concurrent.ExecutorService) r10
            hb.a r0 = new hb.a
            r2 = r8
            r1 = r9
            r6 = r11
            r5 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.execute(r0)
            hb.s r9 = new hb.s
            aa.c r10 = new aa.c
            r11 = 12
            r10.<init>(r8, r11, r3)
            r9.<init>(r10)
            return r9
        Lc6:
            return r1
    }

    public u4.o i() {
            r3 = this;
            java.lang.Object r0 = r3.f5339h
            u4.b r0 = (u4.b) r0
            int r0 = r0.f13368d
            if (r0 >= 0) goto L9
            goto L28
        L9:
            java.lang.Object r1 = r3.f5341j
            p4.y r1 = (p4.y) r1
            f1.h r1 = r1.f10238a
            java.lang.Object r1 = r1.f3058i
            u4.c r1 = (u4.c) r1
            u4.b r0 = r1.s(r0)
            h4.u r0 = r0.f13366b
            r1 = 0
            java.lang.Object r0 = r0.l(r1)
            u4.i r0 = (u4.i) r0
            u4.r r1 = r0.f13382g
            int r1 = r1.f13406a
            r2 = 56
            if (r1 == r2) goto L2a
        L28:
            r0 = 0
            return r0
        L2a:
            u4.o r0 = r0.f13384i
            return r0
    }

    @Override // u4.h
    public void j(u4.j r7) {
            r6 = this;
            u4.t r0 = r7.f13383h
            p4.j r1 = p4.x.a(r7)
            u4.r r2 = r7.f13382g
            int r3 = r2.f13410e
            r4 = 6
            if (r3 != r4) goto L36
            boolean r2 = r2.f13411f
            if (r2 == 0) goto L30
            java.lang.Object r2 = r6.f5340i
            p4.f r2 = (p4.f) r2
            r6.c(r2)
            u4.p r2 = r7.f13385j
            v4.y r3 = r7.f13391m
            v4.a0 r7 = r7.f13392n
            r4 = 2
            v4.a[] r4 = new v4.a[r4]
            r5 = 0
            r4[r5] = r3
            r3 = 1
            r4[r3] = r7
            p4.r r7 = new p4.r
            r7.<init>(r1, r0, r2, r4)
            r6.c(r7)
            return
        L30:
            java.lang.String r7 = "Expected call-like operation"
            bsh.j.g(r7)
            return
        L36:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            int r0 = r2.f13410e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected BRANCH_THROW got "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
    }

    public i.q k(long r15, i.q r17, i.q r18) {
            r14 = this;
            java.lang.Object r0 = r14.f5340i
            i.q r0 = (i.q) r0
            if (r0 != 0) goto Lc
            i.q r0 = r17.c()
            r14.f5340i = r0
        Lc:
            java.lang.Object r0 = r14.f5340i
            i.q r0 = (i.q) r0
            r1 = 0
            java.lang.String r2 = "velocityVector"
            if (r0 == 0) goto L70
            int r0 = r0.b()
            r3 = 0
        L1a:
            java.lang.Object r4 = r14.f5340i
            i.q r4 = (i.q) r4
            if (r3 >= r0) goto L69
            if (r4 == 0) goto L65
            java.lang.Object r5 = r14.f5338g
            androidx.lifecycle.x r5 = (androidx.lifecycle.x) r5
            r17.getClass()
            r6 = r18
            float r7 = r6.a(r3)
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r15 / r8
            java.lang.Object r5 = r5.f310h
            h.v0 r5 = (h.v0) r5
            h.u0 r5 = r5.a(r7)
            long r10 = r5.f4762c
            r12 = 0
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 <= 0) goto L48
            float r7 = (float) r8
            float r8 = (float) r10
            float r7 = r7 / r8
            goto L4a
        L48:
            r7 = 1065353216(0x3f800000, float:1.0)
        L4a:
            h.a r7 = h.b.a(r7)
            float r7 = r7.f4611b
            float r8 = r5.f4760a
            float r8 = java.lang.Math.signum(r8)
            float r8 = r8 * r7
            float r5 = r5.f4761b
            float r8 = r8 * r5
            float r5 = (float) r10
            float r8 = r8 / r5
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r8 = r8 * r5
            r4.e(r3, r8)
            int r3 = r3 + 1
            goto L1a
        L65:
            gg.l.g(r2)
            throw r1
        L69:
            if (r4 == 0) goto L6c
            return r4
        L6c:
            gg.l.g(r2)
            throw r1
        L70:
            gg.l.g(r2)
            throw r1
    }

    @Override // u4.h
    public void l(u4.u r6) {
            r5 = this;
            u4.t r0 = r6.f13383h
            p4.j r1 = p4.x.a(r6)
            u4.r r2 = r6.f13382g
            int r2 = r2.f13410e
            r3 = 6
            if (r2 != r3) goto L34
            u4.o r2 = r5.i()
            boolean r3 = r1.f10122e
            if (r2 == 0) goto L17
            r4 = 1
            goto L18
        L17:
            r4 = 0
        L18:
            if (r3 != r4) goto L2e
            java.lang.Object r3 = r5.f5340i
            p4.f r3 = (p4.f) r3
            r5.c(r3)
            p4.z r3 = new p4.z
            u4.p r6 = p4.y.a(r6, r2)
            r3.<init>(r1, r0, r6)
            r5.c(r3)
            return
        L2e:
            java.lang.String r0 = "Insn with result/move-result-pseudo mismatch"
            okio.a.o(r6, r0)
            return
        L34:
            java.lang.String r6 = "shouldn't happen"
            bsh.j.g(r6)
            return
    }

    @Override // u4.h
    public void m(u4.l r8) {
            r7 = this;
            u4.t r0 = r8.f13383h
            v4.a r1 = r8.f13370k
            u4.o r2 = r8.f13384i
            p4.j r3 = p4.x.a(r8)
            u4.r r4 = r8.f13382g
            int r5 = r4.f13406a
            int r4 = r4.f13410e
            r6 = 1
            if (r4 != r6) goto L4d
            r4 = 3
            if (r5 != r4) goto L40
            java.lang.Object r8 = r7.f5341j
            p4.y r8 = (p4.y) r8
            boolean r4 = r8.f10246i
            if (r4 != 0) goto L3f
            v4.o r1 = (v4.o) r1
            int r1 = r1.f14121g
            int r4 = r8.f10243f
            int r8 = r8.f10245h
            int r4 = r4 - r8
            int r4 = r4 + r1
            w4.d r8 = r2.f13401h
            w4.c r8 = r8.getType()
            r1 = 0
            u4.o r8 = u4.o.k(r4, r8, r1)
            p4.z r1 = new p4.z
            u4.p r8 = u4.p.q(r2, r8)
            r1.<init>(r3, r0, r8)
            r7.c(r1)
        L3f:
            return
        L40:
            u4.p r8 = p4.y.a(r8, r2)
            p4.g r2 = new p4.g
            r2.<init>(r3, r0, r8, r1)
            r7.c(r2)
            return
        L4d:
            java.lang.String r8 = "shouldn't happen"
            bsh.j.g(r8)
            return
    }

    @Override // i.n1
    public i.q n(long r15, i.q r17, i.q r18, i.q r19) {
            r14 = this;
            java.lang.Object r0 = r14.f5340i
            i.q r0 = (i.q) r0
            if (r0 != 0) goto Lc
            i.q r0 = r19.c()
            r14.f5340i = r0
        Lc:
            java.lang.Object r0 = r14.f5340i
            i.q r0 = (i.q) r0
            r1 = 0
            java.lang.String r2 = "velocityVector"
            if (r0 == 0) goto L52
            int r0 = r0.b()
            r3 = 0
        L1a:
            java.lang.Object r4 = r14.f5340i
            i.q r4 = (i.q) r4
            if (r3 >= r0) goto L4b
            if (r4 == 0) goto L47
            java.lang.Object r5 = r14.f5338g
            androidx.lifecycle.x r5 = (androidx.lifecycle.x) r5
            i.z r6 = r5.t(r3)
            r5 = r17
            float r7 = r5.a(r3)
            r12 = r18
            float r8 = r12.a(r3)
            r13 = r19
            float r9 = r13.a(r3)
            r10 = r15
            float r6 = r6.c(r7, r8, r9, r10)
            r4.e(r3, r6)
            int r3 = r3 + 1
            goto L1a
        L47:
            gg.l.g(r2)
            throw r1
        L4b:
            if (r4 == 0) goto L4e
            return r4
        L4e:
            gg.l.g(r2)
            throw r1
        L52:
            gg.l.g(r2)
            throw r1
    }

    @Override // u4.h
    public void o(u4.m r7) {
            r6 = this;
            u4.r r0 = r7.f13382g
            u4.o r1 = r7.f13384i
            int r2 = r0.f13406a
            r3 = 54
            if (r2 != r3) goto Lb
            goto L4e
        Lb:
            r3 = 56
            if (r2 != r3) goto L10
            goto L4e
        L10:
            u4.t r2 = r7.f13383h
            p4.j r3 = p4.x.a(r7)
            int r0 = r0.f13410e
            r4 = 1
            if (r0 == r4) goto L4f
            r5 = 2
            if (r0 == r5) goto L4f
            r5 = 3
            if (r0 == r5) goto L4e
            r5 = 4
            if (r0 == r5) goto L2e
            r4 = 6
            if (r0 != r4) goto L28
            goto L4f
        L28:
            java.lang.String r7 = "shouldn't happen"
            bsh.j.g(r7)
            return
        L2e:
            java.lang.Object r0 = r6.f5339h
            u4.b r0 = (u4.b) r0
            z4.g r0 = r0.f13367c
            int r0 = r0.n(r4)
            p4.b0 r4 = new p4.b0
            u4.p r7 = p4.y.a(r7, r1)
            java.lang.Object r1 = r6.f5341j
            p4.y r1 = (p4.y) r1
            b5.c r1 = r1.f10240c
            java.lang.Object r1 = r1.f469a
            p4.f[] r1 = (p4.f[]) r1
            r0 = r1[r0]
            r4.<init>(r3, r2, r7, r0)
            goto L58
        L4e:
            return
        L4f:
            p4.z r4 = new p4.z
            u4.p r7 = p4.y.a(r7, r1)
            r4.<init>(r3, r2, r7)
        L58:
            r6.c(r4)
            return
    }

    public boolean p(java.lang.reflect.Method r5, de.robv.android.xposed.XC_MethodHook r6) {
            r4 = this;
            java.lang.Object r0 = r4.f5341j
            java.util.Set r0 = (java.util.Set) r0
            boolean r1 = r0.add(r5)
            if (r1 != 0) goto Lc
            r5 = 1
            return r5
        Lc:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L14
            r1.b(r5, r6)     // Catch: java.lang.Throwable -> L14
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r6 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r6)
            r6 = r1
        L1b:
            java.lang.Throwable r1 = sf.g.b(r6)
            if (r1 == 0) goto L3d
            r0.remove(r5)
            java.lang.Object r0 = r4.f5339h
            ia.t r0 = (ia.t) r0
            java.lang.String r5 = r5.toGenericString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "多选撤回Hook安装失败: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.invoke(r5, r1)
        L3d:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r0 = r6 instanceof sf.f
            if (r0 == 0) goto L44
            r6 = r5
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            return r5
    }

    @Override // u4.h
    public void u(u4.g r7) {
            r6 = this;
            u4.t r0 = r7.f13383h
            v4.a r1 = r7.f13381l
            java.util.ArrayList r2 = r7.f13380k
            u4.r r3 = r7.f13382g
            int r3 = r3.f13410e
            r4 = 1
            if (r3 != r4) goto L42
            p4.f r3 = new p4.f
            r4 = 0
            r3.<init>(r0, r4)
            p4.a r4 = new p4.a
            java.lang.Object r5 = r6.f5340i
            p4.f r5 = (p4.f) r5
            r4.<init>(r0, r5, r2, r1)
            p4.b0 r1 = new p4.b0
            p4.j r2 = p4.k.G
            u4.o r5 = r7.f13384i
            u4.p r7 = p4.y.a(r7, r5)
            r1.<init>(r2, r0, r7, r3)
            java.lang.Object r7 = r6.f5340i
            p4.f r7 = (p4.f) r7
            r6.c(r7)
            r6.c(r1)
            p4.s r7 = new p4.s
            r7.<init>(r0)
            r6.d(r7)
            r6.d(r3)
            r6.d(r4)
            return
        L42:
            java.lang.String r7 = "shouldn't happen"
            bsh.j.g(r7)
            return
    }

    @Override // i.n1
    public i.q w(long r15, i.q r17, i.q r18, i.q r19) {
            r14 = this;
            java.lang.Object r0 = r14.f5339h
            i.q r0 = (i.q) r0
            if (r0 != 0) goto Lc
            i.q r0 = r17.c()
            r14.f5339h = r0
        Lc:
            java.lang.Object r0 = r14.f5339h
            i.q r0 = (i.q) r0
            r1 = 0
            java.lang.String r2 = "valueVector"
            if (r0 == 0) goto L52
            int r0 = r0.b()
            r3 = 0
        L1a:
            java.lang.Object r4 = r14.f5339h
            i.q r4 = (i.q) r4
            if (r3 >= r0) goto L4b
            if (r4 == 0) goto L47
            java.lang.Object r5 = r14.f5338g
            androidx.lifecycle.x r5 = (androidx.lifecycle.x) r5
            i.z r6 = r5.t(r3)
            r5 = r17
            float r7 = r5.a(r3)
            r12 = r18
            float r8 = r12.a(r3)
            r13 = r19
            float r9 = r13.a(r3)
            r10 = r15
            float r6 = r6.e(r7, r8, r9, r10)
            r4.e(r3, r6)
            int r3 = r3 + 1
            goto L1a
        L47:
            gg.l.g(r2)
            throw r1
        L4b:
            if (r4 == 0) goto L4e
            return r4
        L4e:
            gg.l.g(r2)
            throw r1
        L52:
            gg.l.g(r2)
            throw r1
    }

    @Override // u4.h
    public void x(u4.u r11) {
            r10 = this;
            u4.t r0 = r11.f13383h
            java.lang.Object r1 = r11.f13520l
            z4.g r1 = (z4.g) r1
            java.lang.Object r2 = r10.f5339h
            u4.b r2 = (u4.b) r2
            z4.g r3 = r2.f13367c
            int r4 = r1.f22552i
            int r5 = r3.f22552i
            int r2 = r2.f13368d
            r6 = 1
            int r5 = r5 - r6
            if (r4 != r5) goto L75
            int r5 = r3.n(r4)
            if (r2 != r5) goto L75
            p4.f[] r2 = new p4.f[r4]
            r5 = 0
            r7 = r5
        L20:
            if (r7 >= r4) goto L37
            int r8 = r3.n(r7)
            java.lang.Object r9 = r10.f5341j
            p4.y r9 = (p4.y) r9
            b5.c r9 = r9.f10240c
            java.lang.Object r9 = r9.f469a
            p4.f[] r9 = (p4.f[]) r9
            r8 = r9[r8]
            r2[r7] = r8
            int r7 = r7 + 1
            goto L20
        L37:
            p4.f r3 = new p4.f
            r3.<init>(r0, r5)
            p4.f r4 = new p4.f
            java.lang.Object r5 = r10.f5340i
            p4.f r5 = (p4.f) r5
            u4.t r5 = r5.f10115c
            r4.<init>(r5, r6)
            p4.a0 r5 = new p4.a0
            r5.<init>(r0, r4, r1, r2)
            boolean r1 = r5.f10100i
            if (r1 == 0) goto L53
            p4.j r1 = p4.k.J
            goto L55
        L53:
            p4.j r1 = p4.k.K
        L55:
            p4.b0 r2 = new p4.b0
            u4.o r6 = r11.f13384i
            u4.p r11 = p4.y.a(r11, r6)
            r2.<init>(r1, r0, r11, r3)
            r10.c(r4)
            r10.c(r2)
            p4.s r11 = new p4.s
            r11.<init>(r0)
            r10.d(r11)
            r10.d(r3)
            r10.d(r5)
            return
        L75:
            java.lang.String r11 = "shouldn't happen"
            bsh.j.g(r11)
            return
    }

    public void z(s1.k r6) {
            r5 = this;
            java.lang.Object r0 = r5.f5339h
            s1.y r0 = (s1.y) r0
            s1.y r1 = s1.y.f12325h
            if (r0 != r1) goto L29
            java.lang.Object r0 = r5.f5338g
            v1.t r0 = (v1.t) r0
            if (r0 == 0) goto L23
            r1 = 0
            long r0 = r0.m0(r1)
            s1.z r2 = new s1.z
            java.lang.Object r3 = r5.f5341j
            s1.a0 r3 = (s1.a0) r3
            r4 = 1
            r2.<init>(r3, r4)
            r3 = 1
            s1.s.i(r6, r0, r2, r3)
            goto L29
        L23:
            java.lang.String r6 = "layoutCoordinates not set"
            j8.o.A(r6)
            return
        L29:
            s1.y r6 = s1.y.f12326i
            r5.f5339h = r6
            return
    }
}
