package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f2515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f2517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.io.File f2519e;

    public c1(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4, java.io.File r6) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f2515a = r1
            r0.f2516b = r2
            r0.f2517c = r3
            r0.f2518d = r4
            r0.f2519e = r6
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof eb.c1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            eb.c1 r8 = (eb.c1) r8
            java.lang.String r1 = r7.f2515a
            java.lang.String r3 = r8.f2515a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.f2516b
            java.lang.String r3 = r8.f2516b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.f2517c
            java.lang.String r3 = r8.f2517c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            long r3 = r7.f2518d
            long r5 = r8.f2518d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L36
            return r2
        L36:
            java.io.File r1 = r7.f2519e
            java.io.File r8 = r8.f2519e
            boolean r8 = gg.l.a(r1, r8)
            if (r8 != 0) goto L41
            return r2
        L41:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f2515a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f2516b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f2517c
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f2518d
            int r0 = eh.a.f(r0, r1, r2)
            java.io.File r1 = r4.f2519e
            if (r1 != 0) goto L21
            r1 = 0
            goto L25
        L21:
            int r1 = r1.hashCode()
        L25:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", url="
            java.lang.String r1 = ", aesKey="
            java.lang.String r2 = "VideoDownloadRequest(md5="
            java.lang.String r3 = r5.f2515a
            java.lang.String r4 = r5.f2516b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f2517c
            r0.append(r1)
            java.lang.String r1 = ", expectedLength="
            r0.append(r1)
            long r1 = r5.f2518d
            r0.append(r1)
            java.lang.String r1 = ", localFile="
            r0.append(r1)
            java.io.File r1 = r5.f2519e
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
