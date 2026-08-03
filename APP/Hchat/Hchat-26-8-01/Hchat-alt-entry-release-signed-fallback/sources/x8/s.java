package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f21346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21348e;

    public /* synthetic */ s(int r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            r0 = r8 & 1
            if (r0 == 0) goto Lc
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r0)
        Lc:
            r1 = r9
            r8 = r8 & 4
            if (r8 == 0) goto L13
            java.lang.String r10 = "你好"
        L13:
            r3 = r10
            r4 = 0
            r6 = 0
            r2 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r6)
            return
    }

    public s(java.lang.String r1, int r2, java.lang.String r3, long r4, boolean r6) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.f21344a = r1
            r0.f21345b = r2
            r0.f21346c = r3
            r0.f21347d = r4
            r0.f21348e = r6
            return
    }

    public static x8.s a(x8.s r2, int r3, java.lang.String r4, long r5, boolean r7, int r8) {
            r0 = r3
            java.lang.String r3 = r2.f21344a
            r1 = r8 & 2
            if (r1 == 0) goto L9
            int r0 = r2.f21345b
        L9:
            r1 = r8 & 4
            if (r1 == 0) goto Lf
            java.lang.String r4 = r2.f21346c
        Lf:
            r1 = r8 & 8
            if (r1 == 0) goto L15
            long r5 = r2.f21347d
        L15:
            r8 = r8 & 16
            if (r8 == 0) goto L1b
            boolean r7 = r2.f21348e
        L1b:
            r8 = r7
            r2.getClass()
            r3.getClass()
            r4.getClass()
            x8.s r2 = new x8.s
            r6 = r5
            r5 = r4
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof x8.s
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            x8.s r8 = (x8.s) r8
            java.lang.String r1 = r7.f21344a
            java.lang.String r3 = r8.f21344a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r7.f21345b
            int r3 = r8.f21345b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r7.f21346c
            java.lang.String r3 = r8.f21346c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            long r3 = r7.f21347d
            long r5 = r8.f21347d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L32
            return r2
        L32:
            boolean r1 = r7.f21348e
            boolean r8 = r8.f21348e
            if (r1 == r8) goto L39
            return r2
        L39:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f21344a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f21345b
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r4.f21346c
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f21347d
            int r0 = eh.a.f(r0, r1, r2)
            boolean r1 = r4.f21348e
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", mode="
            java.lang.String r1 = ", content="
            int r2 = r5.f21345b
            java.lang.String r3 = "AutoReplyStep(id="
            java.lang.String r4 = r5.f21344a
            java.lang.StringBuilder r0 = eh.a.u(r2, r3, r4, r0, r1)
            java.lang.String r1 = r5.f21346c
            r0.append(r1)
            java.lang.String r1 = ", delayMs="
            r0.append(r1)
            long r1 = r5.f21347d
            r0.append(r1)
            java.lang.String r1 = ", randomDelay="
            r0.append(r1)
            boolean r1 = r5.f21348e
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
