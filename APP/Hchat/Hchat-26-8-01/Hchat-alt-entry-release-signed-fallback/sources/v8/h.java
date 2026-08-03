package v8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f14244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f14245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h.Hchat.hooks.api.model.WeChatMessage f14247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f14248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.LinkedHashMap f14249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f14250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f14251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f14252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f14253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f14254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f14255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f14256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.String f14257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.lang.String f14258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14259p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14260q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14261r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public java.lang.String f14262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public java.lang.String f14263t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f14264u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14265v;

    public h(java.lang.String r1, java.lang.String r2, long r3, h.Hchat.hooks.api.model.WeChatMessage r5, java.util.List r6, java.util.LinkedHashMap r7, java.lang.String r8, int r9, java.lang.String r10, boolean r11, java.lang.String r12, long r13, java.lang.String r15) {
            r0 = this;
            r2.getClass()
            r5.getClass()
            r8.getClass()
            r12.getClass()
            r0.<init>()
            r0.f14244a = r1
            r0.f14245b = r2
            r0.f14246c = r3
            r0.f14247d = r5
            r0.f14248e = r6
            r0.f14249f = r7
            r0.f14250g = r8
            r0.f14251h = r9
            r0.f14252i = r10
            r0.f14253j = r11
            r0.f14254k = r12
            r0.f14255l = r13
            r0.f14256m = r15
            java.lang.String r1 = ""
            r0.f14257n = r1
            r0.f14258o = r1
            r2 = 0
            r0.f14259p = r2
            r0.f14260q = r2
            r0.f14261r = r2
            r0.f14262s = r1
            r0.f14263t = r1
            r3 = -1
            r0.f14264u = r3
            r0.f14265v = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto Lec
        L4:
            boolean r0 = r5 instanceof v8.h
            if (r0 != 0) goto La
            goto Lea
        La:
            v8.h r5 = (v8.h) r5
            java.lang.String r0 = r4.f14244a
            java.lang.String r1 = r5.f14244a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            goto Lea
        L18:
            java.lang.String r0 = r4.f14245b
            java.lang.String r1 = r5.f14245b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L24
            goto Lea
        L24:
            long r0 = r4.f14246c
            long r2 = r5.f14246c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2e
            goto Lea
        L2e:
            h.Hchat.hooks.api.model.WeChatMessage r0 = r4.f14247d
            h.Hchat.hooks.api.model.WeChatMessage r1 = r5.f14247d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L3a
            goto Lea
        L3a:
            java.util.List r0 = r4.f14248e
            java.util.List r1 = r5.f14248e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto Lea
        L46:
            java.util.LinkedHashMap r0 = r4.f14249f
            java.util.LinkedHashMap r1 = r5.f14249f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L52
            goto Lea
        L52:
            java.lang.String r0 = r4.f14250g
            java.lang.String r1 = r5.f14250g
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L5e
            goto Lea
        L5e:
            int r0 = r4.f14251h
            int r1 = r5.f14251h
            if (r0 == r1) goto L66
            goto Lea
        L66:
            java.lang.String r0 = r4.f14252i
            java.lang.String r1 = r5.f14252i
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L72
            goto Lea
        L72:
            boolean r0 = r4.f14253j
            boolean r1 = r5.f14253j
            if (r0 == r1) goto L7a
            goto Lea
        L7a:
            java.lang.String r0 = r4.f14254k
            java.lang.String r1 = r5.f14254k
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L86
            goto Lea
        L86:
            long r0 = r4.f14255l
            long r2 = r5.f14255l
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L8f
            goto Lea
        L8f:
            java.lang.String r0 = r4.f14256m
            java.lang.String r1 = r5.f14256m
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9a
            goto Lea
        L9a:
            java.lang.String r0 = r4.f14257n
            java.lang.String r1 = r5.f14257n
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La5
            goto Lea
        La5:
            java.lang.String r0 = r4.f14258o
            java.lang.String r1 = r5.f14258o
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb0
            goto Lea
        Lb0:
            boolean r0 = r4.f14259p
            boolean r1 = r5.f14259p
            if (r0 == r1) goto Lb7
            goto Lea
        Lb7:
            boolean r0 = r4.f14260q
            boolean r1 = r5.f14260q
            if (r0 == r1) goto Lbe
            goto Lea
        Lbe:
            boolean r0 = r4.f14261r
            boolean r1 = r5.f14261r
            if (r0 == r1) goto Lc5
            goto Lea
        Lc5:
            java.lang.String r0 = r4.f14262s
            java.lang.String r1 = r5.f14262s
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld0
            goto Lea
        Ld0:
            java.lang.String r0 = r4.f14263t
            java.lang.String r1 = r5.f14263t
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ldb
            goto Lea
        Ldb:
            long r0 = r4.f14264u
            long r2 = r5.f14264u
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Le4
            goto Lea
        Le4:
            int r0 = r4.f14265v
            int r5 = r5.f14265v
            if (r0 == r5) goto Lec
        Lea:
            r5 = 0
            return r5
        Lec:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f14244a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f14245b
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f14246c
            int r0 = eh.a.f(r0, r1, r2)
            h.Hchat.hooks.api.model.WeChatMessage r2 = r4.f14247d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.List r0 = r4.f14248e
            int r0 = j8.b.e(r0, r2, r1)
            java.util.LinkedHashMap r2 = r4.f14249f
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r4.f14250g
            int r0 = eh.a.g(r2, r1, r0)
            int r2 = r4.f14251h
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r4.f14252i
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r4.f14253j
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r4.f14254k
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f14255l
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r2 = r4.f14256m
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f14257n
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f14258o
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r4.f14259p
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r4.f14260q
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r4.f14261r
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r4.f14262s
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f14263t
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f14264u
            int r0 = eh.a.f(r0, r1, r2)
            int r1 = r4.f14265v
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r15 = this;
            java.lang.String r0 = r15.f14257n
            java.lang.String r1 = r15.f14258o
            boolean r2 = r15.f14259p
            boolean r3 = r15.f14260q
            boolean r4 = r15.f14261r
            java.lang.String r5 = r15.f14262s
            java.lang.String r6 = r15.f14263t
            long r7 = r15.f14264u
            int r9 = r15.f14265v
            java.lang.String r10 = ", talker="
            java.lang.String r11 = ", msgSvrId="
            java.lang.String r12 = "PendingForward(key="
            java.lang.String r13 = r15.f14244a
            java.lang.String r14 = r15.f14245b
            java.lang.StringBuilder r10 = bc.e.p(r12, r13, r10, r14, r11)
            long r11 = r15.f14246c
            r10.append(r11)
            java.lang.String r11 = ", fallback="
            r10.append(r11)
            h.Hchat.hooks.api.model.WeChatMessage r11 = r15.f14247d
            r10.append(r11)
            java.lang.String r11 = ", targets="
            r10.append(r11)
            java.util.List r11 = r15.f14248e
            r10.append(r11)
            java.lang.String r11 = ", targetRules="
            r10.append(r11)
            java.util.LinkedHashMap r11 = r15.f14249f
            r10.append(r11)
            java.lang.String r11 = ", kind="
            r10.append(r11)
            java.lang.String r11 = r15.f14250g
            r10.append(r11)
            java.lang.String r11 = ", messageType="
            r10.append(r11)
            int r11 = r15.f14251h
            r10.append(r11)
            java.lang.String r11 = ", searchableContent="
            r10.append(r11)
            java.lang.String r11 = r15.f14252i
            r10.append(r11)
            java.lang.String r11 = ", outgoing="
            r10.append(r11)
            boolean r11 = r15.f14253j
            r10.append(r11)
            java.lang.String r11 = ", sourceSender="
            r10.append(r11)
            java.lang.String r11 = r15.f14254k
            r10.append(r11)
            java.lang.String r11 = ", deadline="
            r10.append(r11)
            long r11 = r15.f14255l
            r10.append(r11)
            java.lang.String r11 = ", cacheToken="
            r10.append(r11)
            java.lang.String r11 = r15.f14256m
            r10.append(r11)
            java.lang.String r11 = ", downloadTargetPath="
            java.lang.String r12 = ", downloadPath="
            j8.b.t(r10, r11, r0, r12, r1)
            java.lang.String r0 = ", downloadRequested="
            r10.append(r0)
            r10.append(r2)
            java.lang.String r0 = ", downloadInFlight="
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = ", downloadFailed="
            r10.append(r0)
            r10.append(r4)
            java.lang.String r0 = ", downloadError="
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = ", stableLocalPath="
            r10.append(r0)
            r10.append(r6)
            java.lang.String r0 = ", stableLocalLength="
            r10.append(r0)
            r10.append(r7)
            java.lang.String r0 = ", stableLocalChecks="
            r10.append(r0)
            r10.append(r9)
            java.lang.String r0 = ")"
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            return r0
    }
}
