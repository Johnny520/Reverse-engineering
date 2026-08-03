package ka;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f7561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f7562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f7563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f7564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f7565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f7566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f7567g;

    public k(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.f7561a = r1
            r0.f7562b = r2
            r0.f7563c = r3
            r0.f7564d = r4
            r0.f7565e = r5
            r0.f7566f = r6
            r0.f7567g = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L58
        L3:
            boolean r0 = r3 instanceof ka.k
            if (r0 != 0) goto L8
            goto L56
        L8:
            ka.k r3 = (ka.k) r3
            java.lang.String r0 = r2.f7561a
            java.lang.String r1 = r3.f7561a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L56
        L15:
            java.lang.String r0 = r2.f7562b
            java.lang.String r1 = r3.f7562b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L56
        L20:
            java.lang.String r0 = r2.f7563c
            java.lang.String r1 = r3.f7563c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L56
        L2b:
            java.lang.String r0 = r2.f7564d
            java.lang.String r1 = r3.f7564d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L56
        L36:
            java.lang.String r0 = r2.f7565e
            java.lang.String r1 = r3.f7565e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L56
        L41:
            java.lang.String r0 = r2.f7566f
            java.lang.String r1 = r3.f7566f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4c
            goto L56
        L4c:
            java.lang.String r0 = r2.f7567g
            java.lang.String r3 = r3.f7567g
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L58
        L56:
            r3 = 0
            return r3
        L58:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f7561a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f7562b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f7563c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f7564d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f7565e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f7566f
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f7567g
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", singer="
            java.lang.String r1 = ", mid="
            java.lang.String r2 = "QQMusicTrack(title="
            java.lang.String r3 = r5.f7561a
            java.lang.String r4 = r5.f7562b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", playUrl="
            java.lang.String r2 = ", lyric="
            java.lang.String r3 = r5.f7563c
            java.lang.String r4 = r5.f7564d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", coverUrl="
            java.lang.String r2 = ", landingUrl="
            java.lang.String r3 = r5.f7565e
            java.lang.String r4 = r5.f7566f
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f7567g
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
