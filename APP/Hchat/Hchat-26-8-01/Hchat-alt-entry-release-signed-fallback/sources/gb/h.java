package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f4428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f4429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f4431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f4432f;

    public h(long r1, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.f4427a = r3
            r0.f4428b = r4
            r0.f4429c = r5
            r0.f4430d = r1
            r0.f4431e = r6
            r0.f4432f = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L4b
        L3:
            boolean r0 = r5 instanceof gb.h
            if (r0 != 0) goto L8
            goto L49
        L8:
            gb.h r5 = (gb.h) r5
            java.lang.String r0 = r4.f4427a
            java.lang.String r1 = r5.f4427a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L49
        L15:
            java.lang.String r0 = r4.f4428b
            java.lang.String r1 = r5.f4428b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L49
        L20:
            java.lang.String r0 = r4.f4429c
            java.lang.String r1 = r5.f4429c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L49
        L2b:
            long r0 = r4.f4430d
            long r2 = r5.f4430d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L34
            goto L49
        L34:
            java.lang.String r0 = r4.f4431e
            java.lang.String r1 = r5.f4431e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L49
        L3f:
            java.lang.String r0 = r4.f4432f
            java.lang.String r5 = r5.f4432f
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L4b
        L49:
            r5 = 0
            return r5
        L4b:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f4427a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f4428b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f4429c
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f4430d
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r2 = r4.f4431e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r4.f4432f
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", versionName="
            java.lang.String r1 = ", contentHash="
            java.lang.String r2 = "PluginMarketHistoryVersion(versionId="
            java.lang.String r3 = r5.f4427a
            java.lang.String r4 = r5.f4428b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f4429c
            r0.append(r1)
            java.lang.String r1 = ", totalSize="
            r0.append(r1)
            long r1 = r5.f4430d
            r0.append(r1)
            java.lang.String r1 = ", createdAt="
            java.lang.String r2 = ", releaseNotes="
            java.lang.String r3 = r5.f4431e
            java.lang.String r4 = r5.f4432f
            j8.b.t(r0, r1, r3, r2, r4)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
