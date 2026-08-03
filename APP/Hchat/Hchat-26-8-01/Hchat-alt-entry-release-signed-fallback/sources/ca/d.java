package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1473d;

    public d(int r1, int r2, long r3, int r5) {
            r0 = this;
            r0.<init>()
            r0.f1470a = r1
            r0.f1471b = r2
            r0.f1472c = r5
            r0.f1473d = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof ca.d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ca.d r8 = (ca.d) r8
            int r1 = r7.f1470a
            int r3 = r8.f1470a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r7.f1471b
            int r3 = r8.f1471b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r7.f1472c
            int r3 = r8.f1472c
            if (r1 == r3) goto L21
            return r2
        L21:
            long r3 = r7.f1473d
            long r5 = r8.f1473d
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L2a
            return r2
        L2a:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f1470a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f1471b
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f1472c
            int r0 = eh.a.e(r2, r0, r1)
            long r1 = r3.f1473d
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", width="
            java.lang.String r1 = ", height="
            int r2 = r5.f1470a
            int r3 = r5.f1471b
            java.lang.String r4 = "ChatLivePhotoVideoMetadata(durationMillis="
            java.lang.StringBuilder r0 = eh.a.s(r2, r3, r4, r0, r1)
            int r1 = r5.f1472c
            r0.append(r1)
            java.lang.String r1 = ", sizeBytes="
            r0.append(r1)
            long r1 = r5.f1473d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
