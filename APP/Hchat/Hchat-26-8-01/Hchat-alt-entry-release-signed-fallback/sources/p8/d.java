package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f10322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f10323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10327f;

    public d(java.lang.String r3, java.lang.String r4, int r5, int r6, int r7, long r8, int r10) {
            r2 = this;
            r0 = r10 & 2
            if (r0 == 0) goto L6
            java.lang.String r4 = ""
        L6:
            r0 = r10 & 4
            r1 = 0
            if (r0 == 0) goto Lc
            r5 = r1
        Lc:
            r0 = r10 & 8
            if (r0 == 0) goto L11
            r6 = r1
        L11:
            r0 = r10 & 16
            if (r0 == 0) goto L16
            r7 = r1
        L16:
            r10 = r10 & 32
            if (r10 == 0) goto L1c
            r8 = 0
        L1c:
            r3.getClass()
            r2.<init>()
            r2.f10322a = r3
            r2.f10323b = r4
            r2.f10324c = r5
            r2.f10325d = r6
            r2.f10326e = r7
            r2.f10327f = r8
            return
    }

    public final boolean a() {
            r1 = this;
            java.lang.String r0 = r1.f10323b
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto Le
            int r0 = r1.f10324c
            if (r0 <= 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p8.d
            if (r1 != 0) goto L9
            goto L3e
        L9:
            p8.d r6 = (p8.d) r6
            java.lang.String r1 = r5.f10322a
            java.lang.String r2 = r6.f10322a
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L16
            goto L3e
        L16:
            java.lang.String r1 = r5.f10323b
            java.lang.String r2 = r6.f10323b
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L21
            goto L3e
        L21:
            int r1 = r5.f10324c
            int r2 = r6.f10324c
            if (r1 == r2) goto L28
            goto L3e
        L28:
            int r1 = r5.f10325d
            int r2 = r6.f10325d
            if (r1 == r2) goto L2f
            goto L3e
        L2f:
            int r1 = r5.f10326e
            int r2 = r6.f10326e
            if (r1 == r2) goto L36
            goto L3e
        L36:
            long r1 = r5.f10327f
            long r3 = r6.f10327f
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L40
        L3e:
            r6 = 0
            return r6
        L40:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f10322a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f10323b
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r4.f10324c
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r4.f10325d
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r4.f10326e
            int r0 = eh.a.e(r2, r0, r1)
            long r2 = r4.f10327f
            int r0 = eh.a.f(r0, r1, r2)
            r1 = 0
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", liveVideoPath="
            java.lang.String r1 = ", liveVideoDurationMillis="
            java.lang.String r2 = "PreparedSnsImage(imagePath="
            java.lang.String r3 = r5.f10322a
            java.lang.String r4 = r5.f10323b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", liveVideoWidth="
            java.lang.String r2 = ", liveVideoHeight="
            int r3 = r5.f10324c
            int r4 = r5.f10325d
            wb.en.p(r0, r3, r1, r4, r2)
            int r1 = r5.f10326e
            r0.append(r1)
            java.lang.String r1 = ", liveVideoSizeBytes="
            r0.append(r1)
            long r1 = r5.f10327f
            r0.append(r1)
            java.lang.String r1 = ", liveVideoCoverTimeMillis=0)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
