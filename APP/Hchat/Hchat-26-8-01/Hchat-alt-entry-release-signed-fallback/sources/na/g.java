package na;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l3.l f9134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae.g f9135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f9136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f9137d;

    public g(l3.l r1, ae.g r2) {
            r0 = this;
            r0.<init>()
            r0.f9134a = r1
            r0.f9135b = r2
            return
    }

    public static java.lang.String a(java.lang.String r1) {
            java.lang.String r1 = oa.b.g(r1)
            boolean r0 = oa.b.f(r1)
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.String r1 = ""
            return r1
    }

    public final void b() {
            r6 = this;
            l3.l r0 = r6.f9134a
            r0.b()
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L44
            r0.getClass()     // Catch: java.lang.Throwable -> L44
            g8.d r0 = h.Hchat.hooks.api.core.WeChatApis.c()     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L13
            goto L6b
        L13:
            java.util.LinkedHashSet r1 = r6.c()     // Catch: java.lang.Throwable -> L44
            java.util.ArrayList r0 = r0.g()     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L44
            r2 = 0
        L20:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L44
            r4 = 1
            if (r3 == 0) goto L46
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L44
            h.Hchat.hooks.api.model.WeChatChatroom r3 = (h.Hchat.hooks.api.model.WeChatChatroom) r3     // Catch: java.lang.Throwable -> L44
            if (r3 != 0) goto L30
            goto L20
        L30:
            java.lang.String r3 = r3.chatroomId     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = a(r3)     // Catch: java.lang.Throwable -> L44
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L44
            if (r5 != 0) goto L20
            boolean r3 = r1.add(r3)     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L20
            r2 = r4
            goto L20
        L44:
            r0 = move-exception
            goto L4e
        L46:
            if (r2 == 0) goto L4b
            r6.d(r1)     // Catch: java.lang.Throwable -> L44
        L4b:
            r6.f9137d = r4     // Catch: java.lang.Throwable -> L44
            return
        L4e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "预加载群聊基线失败: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            ae.g r1 = r6.f9135b
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L6b
            r1.accept(r0)
        L6b:
            return
    }

    public final java.util.LinkedHashSet c() {
            r6 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            l3.l r1 = r6.f9134a
            java.lang.String r2 = ""
            java.lang.String r3 = "hb_block_new_group_known"
            java.lang.String r1 = r1.d(r3, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L16
            goto L32
        L16:
            java.lang.String r2 = "[|,，\\n\\r]+"
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            r3 = 0
        L1e:
            if (r3 >= r2) goto L32
            r4 = r1[r3]
            java.lang.String r4 = a(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L2f
            r0.add(r4)
        L2f:
            int r3 = r3 + 1
            goto L1e
        L32:
            return r0
    }

    public final void d(java.util.LinkedHashSet r5) {
            r4 = this;
            l3.l r0 = r4.f9134a
            android.content.SharedPreferences r0 = r0.b()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = a(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L2a
            goto L13
        L2a:
            int r3 = r1.length()
            if (r3 <= 0) goto L35
            r3 = 10
            r1.append(r3)
        L35:
            r1.append(r2)
            goto L13
        L39:
            java.lang.String r5 = r1.toString()
            java.lang.String r1 = "hb_block_new_group_known"
            android.content.SharedPreferences$Editor r5 = r0.putString(r1, r5)
            r5.commit()
            return
    }
}
