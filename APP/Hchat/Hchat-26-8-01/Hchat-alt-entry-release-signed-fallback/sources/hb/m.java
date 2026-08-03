package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile hb.l f5433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile hb.l f5434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f5435c = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            hb.m.f5435c = r0
            return
    }

    public static java.util.List a(boolean r4) {
            hb.l r0 = hb.m.f5433a
            r1 = 0
            if (r0 == 0) goto Lc
            boolean r2 = r0.a()
            if (r2 == 0) goto Lc
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r4 != 0) goto L14
            if (r0 == 0) goto L51
            java.util.List r4 = r0.f5431a
            return r4
        L14:
            if (r0 == 0) goto L40
            java.util.List r4 = r0.f5431a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L21:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r4.next()
            r2 = r1
            wb.jv r2 = (wb.jv) r2
            boolean r3 = r2.f17142c
            if (r3 != 0) goto L38
            boolean r2 = r2.f17146g
            if (r2 != 0) goto L38
            r2 = 1
            goto L39
        L38:
            r2 = 0
        L39:
            if (r2 == 0) goto L21
            r0.add(r1)
            goto L21
        L3f:
            return r0
        L40:
            hb.l r4 = hb.m.f5434b
            if (r4 == 0) goto L51
            boolean r0 = r4.a()
            if (r0 == 0) goto L4b
            goto L4c
        L4b:
            r4 = r1
        L4c:
            if (r4 == 0) goto L51
            java.util.List r4 = r4.f5431a
            return r4
        L51:
            return r1
    }

    public static c9.a0 b() {
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.conversations()
            r1 = 0
            if (r0 == 0) goto Lc
            java.util.ArrayList r0 = r0.c()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 != 0) goto L11
            tf.t r0 = tf.t.f13167g
        L11:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r0)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L1f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r0.next()
            int r5 = r3 + 1
            if (r3 < 0) goto L3f
            l8.b r4 = (l8.b) r4
            java.lang.String r4 = r4.f7898a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            sf.e r6 = new sf.e
            r6.<init>(r4, r3)
            r2.add(r6)
            r3 = r5
            goto L1f
        L3f:
            a.a.Q0()
            throw r1
        L43:
            java.util.Map r0 = tf.y.e0(r2)
            c9.z r1 = new c9.z
            r2 = 1
            r1.<init>(r0, r2)
            c9.a0 r0 = new c9.a0
            r2 = 16
            r0.<init>(r1, r2)
            c9.a0 r1 = new c9.a0
            r2 = 17
            r1.<init>(r0, r2)
            c9.a0 r0 = new c9.a0
            r2 = 18
            r0.<init>(r1, r2)
            return r0
    }

    public static java.util.List c(boolean r9) {
            java.util.List r0 = a(r9)
            if (r0 == 0) goto L7
            return r0
        L7:
            tf.t r0 = tf.t.f13167g
            g8.i r1 = wb.en.c()
            if (r1 == 0) goto L16d
            boolean r2 = r1.G()
            if (r2 != 0) goto L17
            goto L16d
        L17:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.ArrayList r3 = r1.p()     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L28:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L2e
            r3 = r0
        L2e:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L34:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7d
            java.lang.Object r4 = r3.next()
            h.Hchat.hooks.api.model.ContactLabelBean r4 = (h.Hchat.hooks.api.model.ContactLabelBean) r4
            java.lang.String r5 = r4.labelName
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L4a
            java.lang.String r5 = r4.labelId
        L4a:
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L51
            goto L34
        L51:
            java.util.List<java.lang.String> r4 = r4.userNameList
            java.util.Iterator r4 = r4.iterator()
        L57:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L34
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = og.m.t0(r6)
            if (r7 != 0) goto L57
            java.lang.Object r7 = r2.get(r6)
            if (r7 != 0) goto L77
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r2.put(r6, r7)
        L77:
            java.util.List r7 = (java.util.List) r7
            r7.add(r5)
            goto L57
        L7d:
            r3 = 0
            if (r9 == 0) goto Lb8
            java.util.ArrayList r1 = r1.y()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L8d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lae
            java.lang.Object r5 = r1.next()
            h.Hchat.hooks.api.model.WeChatContact r5 = (h.Hchat.hooks.api.model.WeChatContact) r5
            java.lang.String r6 = r5.wxId
            java.lang.Object r6 = r2.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto La4
            r6 = r0
        La4:
            wb.jv r5 = d(r5, r3, r6, r3)
            if (r5 == 0) goto L8d
            r4.add(r5)
            goto L8d
        Lae:
            c9.a0 r0 = b()
            java.util.List r0 = tf.m.K1(r4, r0)
            goto L16d
        Lb8:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = r1.y()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lca:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Leb
            java.lang.Object r7 = r5.next()
            h.Hchat.hooks.api.model.WeChatContact r7 = (h.Hchat.hooks.api.model.WeChatContact) r7
            java.lang.String r8 = r7.wxId
            java.lang.Object r8 = r2.get(r8)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto Le1
            r8 = r0
        Le1:
            wb.jv r7 = d(r7, r3, r8, r3)
            if (r7 == 0) goto Lca
            r6.add(r7)
            goto Lca
        Leb:
            tf.r.h1(r4, r6)
            java.lang.String r2 = "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE 'gh\\_%' ESCAPE '\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)"
            r5 = 0
            java.util.ArrayList r2 = r1.U(r2, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        Lfe:
            boolean r6 = r2.hasNext()
            r7 = 1
            if (r6 == 0) goto L115
            java.lang.Object r6 = r2.next()
            h.Hchat.hooks.api.model.WeChatContact r6 = (h.Hchat.hooks.api.model.WeChatContact) r6
            wb.jv r6 = d(r6, r3, r0, r7)
            if (r6 == 0) goto Lfe
            r5.add(r6)
            goto Lfe
        L115:
            tf.r.h1(r4, r5)
            java.util.ArrayList r1 = r1.x()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L125:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L13b
            java.lang.Object r5 = r1.next()
            h.Hchat.hooks.api.model.WeChatContact r5 = (h.Hchat.hooks.api.model.WeChatContact) r5
            wb.jv r5 = d(r5, r7, r0, r3)
            if (r5 == 0) goto L125
            r2.add(r5)
            goto L125
        L13b:
            tf.r.h1(r4, r2)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r4.iterator()
        L14c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L165
            java.lang.Object r3 = r2.next()
            r4 = r3
            wb.jv r4 = (wb.jv) r4
            java.lang.String r4 = r4.f17140a
            boolean r4 = r0.add(r4)
            if (r4 == 0) goto L14c
            r1.add(r3)
            goto L14c
        L165:
            c9.a0 r0 = b()
            java.util.List r0 = tf.m.K1(r1, r0)
        L16d:
            hb.l r1 = new hb.l
            long r2 = java.lang.System.currentTimeMillis()
            r1.<init>(r0, r2)
            if (r9 == 0) goto L17b
            hb.m.f5434b = r1
            goto L1a8
        L17b:
            hb.m.f5433a = r1
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r0.iterator()
        L186:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L19f
            java.lang.Object r3 = r2.next()
            r4 = r3
            wb.jv r4 = (wb.jv) r4
            boolean r5 = r4.f17142c
            if (r5 != 0) goto L186
            boolean r4 = r4.f17146g
            if (r4 != 0) goto L186
            r9.add(r3)
            goto L186
        L19f:
            long r1 = r1.f5432b
            hb.l r3 = new hb.l
            r3.<init>(r9, r1)
            hb.m.f5434b = r3
        L1a8:
            return r0
    }

    public static wb.jv d(h.Hchat.hooks.api.model.WeChatContact r10, boolean r11, java.util.List r12, boolean r13) {
            if (r10 == 0) goto L5b
            java.lang.String r0 = r10.wxId
            boolean r0 = og.m.t0(r0)
            if (r0 == 0) goto Lb
            goto L5b
        Lb:
            java.lang.String r2 = r10.wxId
            java.lang.String r3 = r9.e0.Z(r10, r11)
            java.lang.String r5 = r10.avatarUrl
            java.lang.String r6 = r10.avatarBackupUrl
            java.util.Set r12 = tf.m.T1(r12)
            java.util.List r7 = tf.m.P1(r12)
            java.lang.String r12 = r10.remarkName
            java.lang.String r0 = r10.nickname
            java.lang.String r10 = r10.customWxId
            java.lang.String[] r10 = new java.lang.String[]{r12, r0, r10}
            java.util.List r10 = a.a.y0(r10)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r10 = r10.iterator()
        L34:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r10.next()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = og.m.t0(r1)
            if (r1 != 0) goto L34
            r12.add(r0)
            goto L34
        L4b:
            java.util.Set r10 = tf.m.T1(r12)
            java.util.List r9 = tf.m.P1(r10)
            wb.jv r1 = new wb.jv
            r4 = r11
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L5b:
            r10 = 0
            return r10
    }
}
