package f9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f3380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f3381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f3382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3383h;

    public h(long r1, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.f3376a = r1
            r0.f3377b = r3
            r0.f3378c = r7
            r0.f3379d = r8
            r0.f3380e = r4
            r0.f3381f = r5
            r0.f3382g = r6
            r0.f3383h = r9
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L55
        L3:
            boolean r0 = r5 instanceof f9.h
            if (r0 != 0) goto L8
            goto L53
        L8:
            f9.h r5 = (f9.h) r5
            long r0 = r4.f3376a
            long r2 = r5.f3376a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L53
        L13:
            java.lang.String r0 = r4.f3377b
            java.lang.String r1 = r5.f3377b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L1e
            goto L53
        L1e:
            boolean r0 = r4.f3378c
            boolean r1 = r5.f3378c
            if (r0 == r1) goto L25
            goto L53
        L25:
            boolean r0 = r4.f3379d
            boolean r1 = r5.f3379d
            if (r0 == r1) goto L2c
            goto L53
        L2c:
            java.lang.String r0 = r4.f3380e
            java.lang.String r1 = r5.f3380e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L37
            goto L53
        L37:
            java.lang.String r0 = r4.f3381f
            java.lang.String r1 = r5.f3381f
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L42
            goto L53
        L42:
            java.lang.String r0 = r4.f3382g
            java.lang.String r1 = r5.f3382g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4d
            goto L53
        L4d:
            boolean r0 = r4.f3383h
            boolean r5 = r5.f3383h
            if (r0 == r5) goto L55
        L53:
            r5 = 0
            return r5
        L55:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f3376a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3377b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f3378c
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r3.f3379d
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r3.f3380e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3381f
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3382g
            int r0 = eh.a.g(r0, r1, r2)
            boolean r1 = r3.f3383h
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EditableChatMessage(msgId="
            r0.<init>(r1)
            long r1 = r5.f3376a
            r0.append(r1)
            java.lang.String r1 = ", talker="
            r0.append(r1)
            java.lang.String r1 = r5.f3377b
            r0.append(r1)
            java.lang.String r1 = ", isQuote="
            r0.append(r1)
            boolean r1 = r5.f3378c
            r0.append(r1)
            java.lang.String r1 = ", isTransfer="
            r0.append(r1)
            boolean r1 = r5.f3379d
            r0.append(r1)
            java.lang.String r1 = ", displayText="
            java.lang.String r2 = ", replyText="
            java.lang.String r3 = r5.f3380e
            java.lang.String r4 = r5.f3381f
            j8.b.t(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", quotedText="
            r0.append(r1)
            java.lang.String r1 = r5.f3382g
            r0.append(r1)
            java.lang.String r1 = ", hasBackup="
            r0.append(r1)
            boolean r1 = r5.f3383h
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
