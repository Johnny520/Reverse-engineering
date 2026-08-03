package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f11706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f11707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f11708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f11709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f11710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f11711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f11712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f11713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f11714l;

    public f0(int r1, long r2, long r4, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, long r13, boolean r15) {
            r0 = this;
            r9.getClass()
            r0.<init>()
            r0.f11703a = r1
            r0.f11704b = r2
            r0.f11705c = r4
            r0.f11706d = r6
            r0.f11707e = r7
            r0.f11708f = r8
            r0.f11709g = r9
            r0.f11710h = r10
            r0.f11711i = r11
            r0.f11712j = r12
            r0.f11713k = r13
            r0.f11714l = r15
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L85
        L4:
            boolean r0 = r5 instanceof r9.f0
            if (r0 != 0) goto La
            goto L83
        La:
            r9.f0 r5 = (r9.f0) r5
            int r0 = r4.f11703a
            int r1 = r5.f11703a
            if (r0 == r1) goto L14
            goto L83
        L14:
            long r0 = r4.f11704b
            long r2 = r5.f11704b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L83
        L1e:
            long r0 = r4.f11705c
            long r2 = r5.f11705c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L27
            goto L83
        L27:
            java.lang.String r0 = r4.f11706d
            java.lang.String r1 = r5.f11706d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L83
        L32:
            java.lang.String r0 = r4.f11707e
            java.lang.String r1 = r5.f11707e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3d
            goto L83
        L3d:
            java.lang.String r0 = r4.f11708f
            java.lang.String r1 = r5.f11708f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L83
        L48:
            java.lang.String r0 = r4.f11709g
            java.lang.String r1 = r5.f11709g
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L53
            goto L83
        L53:
            java.lang.String r0 = r4.f11710h
            java.lang.String r1 = r5.f11710h
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5e
            goto L83
        L5e:
            java.lang.String r0 = r4.f11711i
            java.lang.String r1 = r5.f11711i
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L69
            goto L83
        L69:
            java.lang.String r0 = r4.f11712j
            java.lang.String r1 = r5.f11712j
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L74
            goto L83
        L74:
            long r0 = r4.f11713k
            long r2 = r5.f11713k
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L7d
            goto L83
        L7d:
            boolean r0 = r4.f11714l
            boolean r5 = r5.f11714l
            if (r0 == r5) goto L85
        L83:
            r5 = 0
            return r5
        L85:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f11703a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f11704b
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f11705c
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r2 = r4.f11706d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f11707e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f11708f
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f11709g
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f11710h
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f11711i
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f11712j
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f11713k
            int r0 = eh.a.f(r0, r1, r2)
            boolean r1 = r4.f11714l
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MessageDetails(type="
            r0.<init>(r1)
            int r1 = r5.f11703a
            r0.append(r1)
            java.lang.String r1 = ", id="
            r0.append(r1)
            long r1 = r5.f11704b
            r0.append(r1)
            java.lang.String r1 = ", serverId="
            java.lang.String r2 = ", talker="
            long r3 = r5.f11705c
            j8.b.s(r0, r1, r3, r2)
            java.lang.String r1 = ", sender="
            java.lang.String r2 = ", content="
            java.lang.String r3 = r5.f11706d
            java.lang.String r4 = r5.f11707e
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", body="
            java.lang.String r2 = ", msgSource="
            java.lang.String r3 = r5.f11708f
            java.lang.String r4 = r5.f11709g
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", atUserList="
            java.lang.String r2 = ", nativeClassName="
            java.lang.String r3 = r5.f11710h
            java.lang.String r4 = r5.f11711i
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f11712j
            r0.append(r1)
            java.lang.String r1 = ", createTime="
            r0.append(r1)
            long r1 = r5.f11713k
            r0.append(r1)
            java.lang.String r1 = ", isSelf="
            r0.append(r1)
            boolean r1 = r5.f11714l
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
