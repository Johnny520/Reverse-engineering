package na;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f9140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9142e;

    public h(java.lang.String r1, int r2, java.lang.String r3, long r4, boolean r6) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.f9138a = r1
            r0.f9139b = r2
            r0.f9140c = r3
            r0.f9141d = r4
            r0.f9142e = r6
            return
    }

    public static na.h a(na.h r7, java.lang.String r8, int r9, java.lang.String r10, long r11, boolean r13, int r14) {
            r0 = r14 & 1
            if (r0 == 0) goto L6
            java.lang.String r8 = r7.f9138a
        L6:
            r1 = r8
            r8 = r14 & 2
            if (r8 == 0) goto Ld
            int r9 = r7.f9139b
        Ld:
            r2 = r9
            r8 = r14 & 4
            if (r8 == 0) goto L14
            java.lang.String r10 = r7.f9140c
        L14:
            r3 = r10
            r8 = r14 & 8
            if (r8 == 0) goto L1b
            long r11 = r7.f9141d
        L1b:
            r4 = r11
            r8 = r14 & 16
            if (r8 == 0) goto L22
            boolean r13 = r7.f9142e
        L22:
            r6 = r13
            r7.getClass()
            r1.getClass()
            r3.getClass()
            na.h r0 = new na.h
            r0.<init>(r1, r2, r3, r4, r6)
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof na.h
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            na.h r8 = (na.h) r8
            java.lang.String r1 = r7.f9138a
            java.lang.String r3 = r8.f9138a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r7.f9139b
            int r3 = r8.f9139b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r7.f9140c
            java.lang.String r3 = r8.f9140c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            long r3 = r7.f9141d
            long r5 = r8.f9141d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L32
            return r2
        L32:
            boolean r1 = r7.f9142e
            boolean r8 = r8.f9142e
            if (r1 == r8) goto L39
            return r2
        L39:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f9138a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f9139b
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r4.f9140c
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f9141d
            int r0 = eh.a.f(r0, r1, r2)
            boolean r1 = r4.f9142e
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", mode="
            java.lang.String r1 = ", content="
            int r2 = r5.f9139b
            java.lang.String r3 = "RedPacketReplyStep(id="
            java.lang.String r4 = r5.f9138a
            java.lang.StringBuilder r0 = eh.a.u(r2, r3, r4, r0, r1)
            java.lang.String r1 = r5.f9140c
            r0.append(r1)
            java.lang.String r1 = ", delayMs="
            r0.append(r1)
            long r1 = r5.f9141d
            r0.append(r1)
            java.lang.String r1 = ", random="
            r0.append(r1)
            boolean r1 = r5.f9142e
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
