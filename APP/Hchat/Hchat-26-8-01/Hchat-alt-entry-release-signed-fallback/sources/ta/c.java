package ta;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f13102g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l3.l f13103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final na.k f13104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na.b f13105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final na.b f13106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b5.c f13107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Random f13108f;

    static {
            java.lang.String r0 = "{@sender}"
            java.lang.String r1 = "{@成员}"
            java.lang.String r2 = "{@发红包的人}"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            ta.c.f13102g = r0
            return
    }

    public c(l3.l r2, na.k r3, na.b r4, na.b r5) {
            r1 = this;
            r1.<init>()
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1.f13108f = r0
            r1.f13103a = r2
            r1.f13104b = r3
            r1.f13105c = r4
            r1.f13106d = r5
            b5.c r4 = new b5.c
            q9.a r5 = new q9.a
            r0 = 8
            r5.<init>(r1, r0)
            r4.<init>(r3, r2, r5)
            r1.f13107e = r4
            return
    }

    public static boolean f(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            k8.g r0 = p.a.q()
            j8.p r1 = h.Hchat.hooks.api.core.WeChatApis.media()
            switch(r2) {
                case 1: goto L58;
                case 2: goto Lb;
                case 3: goto L4e;
                case 4: goto L43;
                case 5: goto L38;
                case 6: goto L2d;
                case 7: goto L20;
                case 8: goto L17;
                case 9: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L5a
        Lc:
            if (r1 == 0) goto L5a
            j8.h r2 = r1.f6820f
            boolean r2 = r2.A(r3, r4)
            if (r2 == 0) goto L5a
            goto L56
        L17:
            if (r0 == 0) goto L5a
            boolean r2 = r0.z(r3, r4)
            if (r2 == 0) goto L5a
            goto L56
        L20:
            if (r1 == 0) goto L5a
            androidx.lifecycle.x r2 = r1.f6819e
            java.lang.String r5 = ""
            boolean r2 = r2.T(r3, r4, r5)
            if (r2 == 0) goto L5a
            goto L56
        L2d:
            if (r1 == 0) goto L5a
            j8.f r2 = r1.f6818d
            boolean r2 = r2.v(r3, r4)
            if (r2 == 0) goto L5a
            goto L56
        L38:
            if (r1 == 0) goto L5a
            bb.b r2 = r1.f6817c
            boolean r2 = r2.q(r3, r4)
            if (r2 == 0) goto L5a
            goto L56
        L43:
            if (r1 == 0) goto L5a
            j8.y r2 = r1.f6816b
            boolean r2 = r2.t(r3, r4)
            if (r2 == 0) goto L5a
            goto L56
        L4e:
            if (r1 == 0) goto L5a
            boolean r2 = r1.a(r3, r4)
            if (r2 == 0) goto L5a
        L56:
            r2 = 1
            return r2
        L58:
            if (r0 != 0) goto L5c
        L5a:
            r2 = 0
            return r2
        L5c:
            if (r6 == 0) goto L71
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L71
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r5)
            boolean r2 = r0.y(r3, r4, r2)
            return r2
        L71:
            boolean r2 = r0.x(r3, r4)
            return r2
    }

    public final java.util.ArrayList a(java.lang.String r20, java.util.List r21, java.lang.String r22, java.lang.String r23) {
            r19 = this;
            r0 = r19
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r21 == 0) goto L12c
            boolean r2 = r21.isEmpty()
            if (r2 == 0) goto L11
            goto L12c
        L11:
            java.util.Iterator r2 = r21.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L12c
            java.lang.Object r3 = r2.next()
            na.h r3 = (na.h) r3
            java.lang.String r4 = r3.f9140c
            int r5 = r3.f9139b
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r7 = 0
            if (r6 == 0) goto L2f
            java.lang.String r4 = ""
            goto L76
        L2f:
            java.lang.String r6 = "\\|"
            java.lang.String[] r6 = r4.split(r6)     // Catch: java.lang.Throwable -> L76
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L76
            r8.<init>()     // Catch: java.lang.Throwable -> L76
            int r9 = r6.length     // Catch: java.lang.Throwable -> L76
            r10 = r7
        L3c:
            if (r10 >= r9) goto L5a
            r11 = r6[r10]     // Catch: java.lang.Throwable -> L76
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L76
            if (r12 != 0) goto L57
            java.lang.String r12 = r11.trim()     // Catch: java.lang.Throwable -> L76
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Throwable -> L76
            if (r12 != 0) goto L57
            java.lang.String r11 = r11.trim()     // Catch: java.lang.Throwable -> L76
            r8.add(r11)     // Catch: java.lang.Throwable -> L76
        L57:
            int r10 = r10 + 1
            goto L3c
        L5a:
            boolean r6 = r8.isEmpty()     // Catch: java.lang.Throwable -> L76
            if (r6 == 0) goto L65
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L76
            goto L76
        L65:
            java.util.Random r6 = r0.f13108f     // Catch: java.lang.Throwable -> L76
            int r9 = r8.size()     // Catch: java.lang.Throwable -> L76
            int r6 = r6.nextInt(r9)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r6 = r8.get(r6)     // Catch: java.lang.Throwable -> L76
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L76
            r4 = r6
        L76:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r8 = 1
            r9 = 2
            if (r6 == 0) goto L87
            r4 = 0
            r10 = r20
            r11 = r22
            r12 = r23
            goto Lea
        L87:
            if (r5 != r9) goto L8b
            r6 = r8
            goto L8c
        L8b:
            r6 = r7
        L8c:
            r10 = 3
            java.lang.String[] r11 = ta.c.f13102g
            if (r6 == 0) goto Lad
            boolean r12 = android.text.TextUtils.isEmpty(r4)
            if (r12 == 0) goto L98
            goto La7
        L98:
            r12 = r7
        L99:
            if (r12 >= r10) goto La7
            r13 = r11[r12]
            boolean r13 = r4.contains(r13)
            if (r13 == 0) goto La4
            goto Lad
        La4:
            int r12 = r12 + 1
            goto L99
        La7:
            java.lang.String r12 = "{@发红包的人}"
            java.lang.String r4 = wb.en.g(r12, r4)
        Lad:
            if (r5 == r8) goto Lb1
            if (r6 == 0) goto Lc8
        Lb1:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto Lb8
            goto Lc8
        Lb8:
            r6 = r7
        Lb9:
            if (r6 >= r10) goto Lc8
            r12 = r11[r6]
            boolean r12 = r4.contains(r12)
            if (r12 == 0) goto Lc5
            r7 = r8
            goto Lc8
        Lc5:
            int r6 = r6 + 1
            goto Lb9
        Lc8:
            if (r5 == r8) goto Ld8
            if (r5 == r9) goto Ld8
            r6 = 8
            if (r5 != r6) goto Ld1
            goto Ld8
        Ld1:
            r10 = r20
            r11 = r22
            r12 = r23
            goto Le4
        Ld8:
            b5.c r6 = r0.f13107e
            r10 = r20
            r11 = r22
            r12 = r23
            java.lang.String r4 = r6.n(r4, r10, r11, r12)
        Le4:
            fd.h r6 = new fd.h
            r6.<init>(r4, r7)
            r4 = r6
        Lea:
            if (r4 == 0) goto L15
            java.lang.Object r6 = r4.f3919h
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto Lf8
            goto L15
        Lf8:
            ta.b r13 = new ta.b
            if (r5 != r9) goto Lfe
            r14 = r8
            goto Lff
        Lfe:
            r14 = r5
        Lff:
            java.lang.Object r5 = r4.f3919h
            r17 = r5
            java.lang.String r17 = (java.lang.String) r17
            boolean r4 = r4.f3918g
            long r5 = r3.f9141d
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L110
            r5 = r7
        L110:
            boolean r3 = r3.f9142e
            r21 = r2
            if (r3 == 0) goto L11f
            r2 = 2001(0x7d1, double:9.886E-321)
            jg.a r9 = jg.d.f6902g
            long r2 = r9.e(r7, r2)
            long r5 = r5 + r2
        L11f:
            r18 = r4
            r15 = r5
            r13.<init>(r14, r15, r17, r18)
            r1.add(r13)
            r2 = r21
            goto L15
        L12c:
            return r1
    }

    public final void b(java.lang.String r2) {
            r1 = this;
            na.b r0 = r1.f13106d
            if (r0 == 0) goto L9
            na.e r0 = r0.f9099h
            r0.d(r2)
        L9:
            return
    }

    public final void c(java.lang.String r14, java.lang.String r15, java.lang.String r16, boolean r17) {
            r13 = this;
            r2 = r16
            java.lang.String r3 = "自动回复跳过: 已处理 "
            java.lang.String r4 = "redpacket_reply:"
            l3.l r5 = r13.f13103a     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = "hb_reply_enable"
            r5.getClass()     // Catch: java.lang.Throwable -> L2e
            r7 = 0
            android.content.SharedPreferences r5 = r5.b()     // Catch: java.lang.Throwable -> L17
            boolean r5 = r5.getBoolean(r6, r7)     // Catch: java.lang.Throwable -> L17
            goto L18
        L17:
            r5 = r7
        L18:
            if (r5 != 0) goto L1c
            goto L150
        L1c:
            boolean r5 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L2e
            r6 = 0
            na.k r8 = r13.f13104b
            if (r5 != 0) goto L31
            java.util.concurrent.ConcurrentHashMap r5 = r8.f9184i     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r5 = r5.get(r14)     // Catch: java.lang.Throwable -> L2e
            na.a r5 = (na.a) r5     // Catch: java.lang.Throwable -> L2e
            goto L32
        L2e:
            r0 = move-exception
            goto L15f
        L31:
            r5 = r6
        L32:
            if (r5 == 0) goto L3a
            boolean r9 = r5.f9073b     // Catch: java.lang.Throwable -> L2e
            if (r9 != 0) goto L3a
            goto L150
        L3a:
            if (r17 != 0) goto L159
            boolean r9 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = ""
            if (r9 == 0) goto L45
            goto L6d
        L45:
            java.util.concurrent.ConcurrentHashMap r9 = r8.f9181f     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r9 = r9.get(r14)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Throwable -> L2e
            na.b r11 = r13.f13105c     // Catch: java.lang.Throwable -> L2e
            if (r11 == 0) goto L58
            na.e r11 = r11.f9099h     // Catch: java.lang.Throwable -> L2e
            java.lang.String r11 = r11.a()     // Catch: java.lang.Throwable -> L2e
            goto L59
        L58:
            r11 = r10
        L59:
            boolean r12 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L2e
            if (r12 != 0) goto L6d
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L2e
            if (r12 != 0) goto L6d
            boolean r9 = r9.equals(r11)     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L6d
            goto L159
        L6d:
            boolean r9 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L2e
            if (r9 != 0) goto L7b
            java.util.concurrent.ConcurrentHashMap r6 = r8.f9183h     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r6.get(r14)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L2e
        L7b:
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L82
            r6 = r15
        L82:
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L8a
            goto L150
        L8a:
            boolean r8 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L2e
            if (r8 != 0) goto La1
            java.lang.String r8 = "@chatroom"
            boolean r8 = r6.endsWith(r8)     // Catch: java.lang.Throwable -> L2e
            if (r8 != 0) goto La0
            java.lang.String r8 = "@im.chatroom"
            boolean r8 = r6.endsWith(r8)     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto La1
        La0:
            r7 = 1
        La1:
            java.util.List r5 = r13.d(r5, r7)     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayList r5 = r13.a(r2, r5, r6, r14)     // Catch: java.lang.Throwable -> L2e
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r7 == 0) goto Lb1
            goto L150
        Lb1:
            b5.c r7 = r13.f13107e     // Catch: java.lang.Throwable -> L2e
            r7.getClass()     // Catch: java.lang.Throwable -> L2e
            boolean r8 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L2e
            if (r8 != 0) goto Lc9
            java.lang.Object r8 = r7.f469a     // Catch: java.lang.Throwable -> L2e
            na.k r8 = (na.k) r8     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.ConcurrentHashMap r8 = r8.f9182g     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = r8.get(r14)     // Catch: java.lang.Throwable -> L2e
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L2e
        Lc9:
            java.lang.String r7 = r7.K(r14, r10)     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            boolean r4 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto Lda
            r0 = r14
            goto Lee
        Lda:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            r0.append(r6)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = ":"
            r0.append(r4)     // Catch: java.lang.Throwable -> L2e
            r0.append(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2e
        Lee:
            r8.append(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            i8.e r2 = h.Hchat.hooks.api.core.WeChatApis.runtime()     // Catch: java.lang.Throwable -> L2e
            r2.getClass()     // Catch: java.lang.Throwable -> L2e
            o8.j r2 = h.Hchat.hooks.api.core.WeChatApis.p()     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L125
            java.util.Iterator r0 = r5.iterator()     // Catch: java.lang.Throwable -> L2e
        L106:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r2 == 0) goto L150
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L2e
            ta.b r2 = (ta.b) r2     // Catch: java.lang.Throwable -> L2e
            r4 = r6
            java.lang.String r6 = r2.f13099b     // Catch: java.lang.Throwable -> L2e
            boolean r8 = r2.f13100c     // Catch: java.lang.Throwable -> L2e
            int r3 = r2.f13098a     // Catch: java.lang.Throwable -> L2e
            long r9 = r2.f13101d     // Catch: java.lang.Throwable -> L2e
            r1 = r13
            r2 = r3
            r5 = r4
            r3 = r9
            r1.g(r2, r3, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2e
            r4 = r5
            r6 = r4
            goto L106
        L125:
            r4 = r6
            h.Hchat.crash.e r1 = new h.Hchat.crash.e     // Catch: java.lang.Throwable -> L2e
            r6 = 4
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2e
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L151
            java.util.concurrent.ConcurrentHashMap r6 = r2.f9606e     // Catch: java.lang.Throwable -> L2e
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r6 = r6.putIfAbsent(r0, r8)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r6 = (java.lang.Long) r6     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L145
            goto L151
        L145:
            r2.g(r1)     // Catch: java.lang.Throwable -> L2e
            r6 = r5
            r5 = r7
            r7 = 0
            r1 = r13
            r3 = r0
            r1.e(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2e
        L150:
            return
        L151:
            java.lang.String r0 = r3.concat(r0)     // Catch: java.lang.Throwable -> L2e
            r13.b(r0)     // Catch: java.lang.Throwable -> L2e
            return
        L159:
            java.lang.String r0 = "自动回复跳过: 自己发的红包"
            r13.b(r0)     // Catch: java.lang.Throwable -> L2e
            return
        L15f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "自动回复失败: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r13.b(r0)
            return
    }

    public final java.util.List d(na.a r9, boolean r10) {
            r8 = this;
            java.lang.String r0 = "hb_reply_random"
            java.lang.String r1 = "hb_reply_group_items_v1"
            if (r9 == 0) goto L16
            if (r10 == 0) goto Lb
            java.util.List r9 = r9.f9093v
            goto Ld
        Lb:
            java.util.List r9 = r9.f9092u
        Ld:
            if (r9 == 0) goto L10
            return r9
        L10:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            return r9
        L16:
            java.lang.String r9 = "hb_reply_enable"
            l3.l r2 = r8.f13103a
            r2.getClass()
            r3 = 0
            android.content.SharedPreferences r4 = r2.b()     // Catch: java.lang.Throwable -> L27
            boolean r9 = r4.getBoolean(r9, r3)     // Catch: java.lang.Throwable -> L27
            goto L28
        L27:
            r9 = r3
        L28:
            if (r9 != 0) goto L30
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            return r9
        L30:
            r9 = 1
            java.lang.String r4 = ""
            if (r10 == 0) goto L4d
            android.content.SharedPreferences r10 = r2.b()     // Catch: java.lang.Throwable -> L41
            boolean r10 = r10.contains(r1)     // Catch: java.lang.Throwable -> L41
            if (r10 != r9) goto L41
            r10 = r9
            goto L42
        L41:
            r10 = r3
        L42:
            if (r10 == 0) goto L4d
            java.lang.String r9 = r2.d(r1, r4)
            java.util.List r9 = a7.a.J(r9)
            return r9
        L4d:
            java.lang.String r10 = "hb_reply_items_v1"
            java.lang.String r10 = r2.d(r10, r4)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L5e
            java.util.List r9 = a7.a.J(r10)
            return r9
        L5e:
            java.lang.String r10 = "hb_reply_type"
            android.content.SharedPreferences r1 = r2.b()     // Catch: java.lang.Throwable -> L69
            int r10 = r1.getInt(r10, r9)     // Catch: java.lang.Throwable -> L69
            goto L6a
        L69:
            r10 = r9
        L6a:
            r1 = 3
            if (r10 == r1) goto L91
            r1 = 4
            if (r10 == r1) goto L91
            r1 = 5
            if (r10 == r1) goto L91
            r1 = 6
            if (r10 == r1) goto L91
            r1 = 7
            if (r10 == r1) goto L91
            r1 = 8
            if (r10 == r1) goto L91
            r1 = 9
            if (r10 != r1) goto L82
            goto L91
        L82:
            java.lang.String r1 = "hb_reply_text"
            java.lang.String r4 = "谢谢老板"
            java.lang.String r1 = r2.d(r1, r4)
            java.lang.String r4 = "hb_reply_templates"
            java.lang.String r1 = r2.d(r4, r1)
            goto L97
        L91:
            java.lang.String r1 = "hb_reply_media_paths"
            java.lang.String r1 = r2.d(r1, r4)
        L97:
            java.lang.String r4 = "hb_reply_custom_enable"
            android.content.SharedPreferences r5 = r2.b()     // Catch: java.lang.Throwable -> La2
            boolean r4 = r5.getBoolean(r4, r3)     // Catch: java.lang.Throwable -> La2
            goto La3
        La2:
            r4 = r3
        La3:
            if (r4 == 0) goto Lca
            java.lang.String r4 = "hb_reply_delay_value"
            android.content.SharedPreferences r5 = r2.b()     // Catch: java.lang.Throwable -> Lb0
            int r4 = r5.getInt(r4, r9)     // Catch: java.lang.Throwable -> Lb0
            goto Lb1
        Lb0:
            r4 = r9
        Lb1:
            int r4 = java.lang.Math.max(r3, r4)
            java.lang.String r5 = "hb_reply_delay_unit"
            android.content.SharedPreferences r6 = r2.b()     // Catch: java.lang.Throwable -> Lc0
            int r5 = r6.getInt(r5, r9)     // Catch: java.lang.Throwable -> Lc0
            goto Lc1
        Lc0:
            r5 = r9
        Lc1:
            if (r5 != r9) goto Lc8
            long r4 = (long) r4
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            goto Lcc
        Lc8:
            long r4 = (long) r4
            goto Lcc
        Lca:
            r4 = 0
        Lcc:
            android.content.SharedPreferences r9 = r2.b()     // Catch: java.lang.Throwable -> Ld5
            boolean r9 = r9.getBoolean(r0, r3)     // Catch: java.lang.Throwable -> Ld5
            goto Ld6
        Ld5:
            r9 = r3
        Ld6:
            if (r9 == 0) goto Le2
            java.util.Random r9 = r8.f13108f
            r6 = 2000(0x7d0, float:2.803E-42)
            int r9 = r9.nextInt(r6)
            long r6 = (long) r9
            long r4 = r4 + r6
        Le2:
            android.content.SharedPreferences r9 = r2.b()     // Catch: java.lang.Throwable -> Lea
            boolean r3 = r9.getBoolean(r0, r3)     // Catch: java.lang.Throwable -> Lea
        Lea:
            java.util.List r9 = a7.a.B(r10, r4, r1, r3)
            return r9
    }

    public final void e(o8.j r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.ArrayList r17, int r18) {
            r12 = this;
            r8 = r18
            int r0 = r17.size()
            if (r8 < r0) goto L9
            return
        L9:
            java.lang.Object r0 = r17.get(r18)
            r3 = r0
            ta.b r3 = (ta.b) r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r1 = ":step:"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r9 = r0.toString()
            long r10 = r3.f13101d
            ta.a r0 = new ta.a
            r1 = r12
            r5 = r13
            r6 = r14
            r2 = r15
            r4 = r16
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.f(r9, r10, r0)
            return
    }

    public final void g(int r6, long r7, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
            r5 = this;
            java.lang.String r0 = " at="
            java.lang.String r1 = "自动回复"
            l3.l r2 = r5.f13103a     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "hb_reply_enable"
            r2.getClass()     // Catch: java.lang.Throwable -> L1c
            r4 = 0
            android.content.SharedPreferences r2 = r2.b()     // Catch: java.lang.Throwable -> L14
            boolean r4 = r2.getBoolean(r3, r4)     // Catch: java.lang.Throwable -> L14
        L14:
            if (r4 != 0) goto L1e
            java.lang.String r6 = "自动回复跳过: 全局开关已关闭"
            r5.b(r6)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r6 = move-exception
            goto L7f
        L1e:
            boolean r2 = f(r6, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            switch(r6) {
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L33;
                case 8: goto L30;
                case 9: goto L2d;
                default: goto L2a;
            }     // Catch: java.lang.Throwable -> L1c
        L2a:
            java.lang.String r6 = "文本"
            goto L41
        L2d:
            java.lang.String r6 = "收藏"
            goto L41
        L30:
            java.lang.String r6 = "XML"
            goto L41
        L33:
            java.lang.String r6 = "文件"
            goto L41
        L36:
            java.lang.String r6 = "表情"
            goto L41
        L39:
            java.lang.String r6 = "视频"
            goto L41
        L3c:
            java.lang.String r6 = "语音"
            goto L41
        L3f:
            java.lang.String r6 = "图片"
        L41:
            r3.append(r6)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L49
            java.lang.String r6 = "已发送"
            goto L4b
        L49:
            java.lang.String r6 = "发送失败"
        L4b:
            r3.append(r6)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r6 = ": "
            r3.append(r6)     // Catch: java.lang.Throwable -> L1c
            r3.append(r10)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r6 = " -> "
            r3.append(r6)     // Catch: java.lang.Throwable -> L1c
            r3.append(r9)     // Catch: java.lang.Throwable -> L1c
            if (r12 == 0) goto L65
            java.lang.String r6 = r0.concat(r11)     // Catch: java.lang.Throwable -> L1c
            goto L67
        L65:
            java.lang.String r6 = ""
        L67:
            r3.append(r6)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r6 = " delay="
            r3.append(r6)     // Catch: java.lang.Throwable -> L1c
            r3.append(r7)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r6 = "ms"
            r3.append(r6)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L1c
            r5.b(r6)     // Catch: java.lang.Throwable -> L1c
            return
        L7f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "自动回复异常: "
            r7.<init>(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.b(r6)
            return
    }
}
