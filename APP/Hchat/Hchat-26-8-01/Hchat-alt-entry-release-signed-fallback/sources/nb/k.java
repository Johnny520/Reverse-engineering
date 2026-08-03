package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h.Hchat.hooks.api.model.WeChatMessage f9289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f9290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.LinkedHashMap f9291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.LinkedHashSet f9292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile java.lang.String f9293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile java.lang.String f9294j;

    public k(java.lang.String r1, java.lang.String r2, long r3, long r5, h.Hchat.hooks.api.model.WeChatMessage r7, java.util.List r8) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f9285a = r1
            r0.f9286b = r2
            r0.f9287c = r3
            r0.f9288d = r5
            r0.f9289e = r7
            r0.f9290f = r8
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r2 = r8.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "initial"
            r1.put(r3, r4)
            goto L1b
        L2d:
            r0.f9291g = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            h.Hchat.hooks.api.model.WeChatMessage r2 = r0.f9289e
            if (r2 == 0) goto L4b
            java.lang.String r2 = r2.bodyContent()
            if (r2 == 0) goto L4b
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L45
            goto L46
        L45:
            r2 = 0
        L46:
            if (r2 == 0) goto L4b
            r1.add(r2)
        L4b:
            r0.f9292h = r1
            java.lang.String r1 = "lookups=unattempted"
            r0.f9293i = r1
            java.lang.String r1 = "lookups=unattempted candidates=[]"
            r0.f9294j = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L49
        L3:
            boolean r0 = r5 instanceof nb.k
            if (r0 != 0) goto L8
            goto L47
        L8:
            nb.k r5 = (nb.k) r5
            java.lang.String r0 = r4.f9285a
            java.lang.String r1 = r5.f9285a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L47
        L15:
            java.lang.String r0 = r4.f9286b
            java.lang.String r1 = r5.f9286b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L47
        L20:
            long r0 = r4.f9287c
            long r2 = r5.f9287c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L29
            goto L47
        L29:
            long r0 = r4.f9288d
            long r2 = r5.f9288d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L32
            goto L47
        L32:
            h.Hchat.hooks.api.model.WeChatMessage r0 = r4.f9289e
            h.Hchat.hooks.api.model.WeChatMessage r1 = r5.f9289e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L3d
            goto L47
        L3d:
            java.util.List r0 = r4.f9290f
            java.util.List r5 = r5.f9290f
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L49
        L47:
            r5 = 0
            return r5
        L49:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f9285a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f9286b
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f9287c
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f9288d
            int r0 = eh.a.f(r0, r1, r2)
            h.Hchat.hooks.api.model.WeChatMessage r2 = r4.f9289e
            if (r2 != 0) goto L21
            r2 = 0
            goto L25
        L21:
            int r2 = r2.hashCode()
        L25:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.List r1 = r4.f9290f
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", talker="
            java.lang.String r1 = ", msgId="
            java.lang.String r2 = "PendingVoice(key="
            java.lang.String r3 = r5.f9285a
            java.lang.String r4 = r5.f9286b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            long r1 = r5.f9287c
            r0.append(r1)
            java.lang.String r1 = ", msgSvrId="
            java.lang.String r2 = ", initialMessage="
            long r3 = r5.f9288d
            j8.b.s(r0, r1, r3, r2)
            h.Hchat.hooks.api.model.WeChatMessage r1 = r5.f9289e
            r0.append(r1)
            java.lang.String r1 = ", initialFileNames="
            r0.append(r1)
            java.util.List r1 = r5.f9290f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
