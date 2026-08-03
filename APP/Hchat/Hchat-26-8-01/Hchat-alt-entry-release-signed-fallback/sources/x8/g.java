package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f21274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f21275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f21280h;

    public /* synthetic */ g(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
            r10 = this;
            r11 = r11 & 4
            if (r11 == 0) goto L6
            java.lang.String r14 = ""
        L6:
            r3 = r14
            r8 = 0
            r9 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r0 = r10
            r1 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9)
            return
    }

    public g(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4, boolean r6, boolean r7, boolean r8, boolean r9) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f21273a = r1
            r0.f21274b = r2
            r0.f21275c = r3
            r0.f21276d = r4
            r0.f21277e = r6
            r0.f21278f = r7
            r0.f21279g = r8
            r0.f21280h = r9
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof x8.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            x8.g r8 = (x8.g) r8
            java.lang.String r1 = r7.f21273a
            java.lang.String r3 = r8.f21273a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.f21274b
            java.lang.String r3 = r8.f21274b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.f21275c
            java.lang.String r3 = r8.f21275c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            long r3 = r7.f21276d
            long r5 = r8.f21276d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L36
            return r2
        L36:
            boolean r1 = r7.f21277e
            boolean r3 = r8.f21277e
            if (r1 == r3) goto L3d
            return r2
        L3d:
            boolean r1 = r7.f21278f
            boolean r3 = r8.f21278f
            if (r1 == r3) goto L44
            return r2
        L44:
            boolean r1 = r7.f21279g
            boolean r3 = r8.f21279g
            if (r1 == r3) goto L4b
            return r2
        L4b:
            boolean r1 = r7.f21280h
            boolean r8 = r8.f21280h
            if (r1 == r8) goto L52
            return r2
        L52:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f21273a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f21274b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f21275c
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f21276d
            int r0 = eh.a.f(r0, r1, r2)
            boolean r2 = r4.f21277e
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r4.f21278f
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r4.f21279g
            int r0 = eh.a.h(r0, r1, r2)
            boolean r1 = r4.f21280h
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", sender="
            java.lang.String r1 = ", content="
            java.lang.String r2 = "MessageContext(talker="
            java.lang.String r3 = r5.f21273a
            java.lang.String r4 = r5.f21274b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f21275c
            r0.append(r1)
            java.lang.String r1 = ", msgId="
            r0.append(r1)
            long r1 = r5.f21276d
            r0.append(r1)
            java.lang.String r1 = ", group="
            r0.append(r1)
            boolean r1 = r5.f21277e
            r0.append(r1)
            java.lang.String r1 = ", atMe="
            r0.append(r1)
            boolean r1 = r5.f21278f
            r0.append(r1)
            java.lang.String r1 = ", atAll="
            r0.append(r1)
            boolean r1 = r5.f21279g
            r0.append(r1)
            java.lang.String r1 = ", patMe="
            r0.append(r1)
            boolean r1 = r5.f21280h
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
