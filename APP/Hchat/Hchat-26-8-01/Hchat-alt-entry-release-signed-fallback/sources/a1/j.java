package a1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f44b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1.k f45c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.x f46d;

    public j(int r1, long r2, a1.k r4, androidx.lifecycle.x r5) {
            r0 = this;
            r0.<init>()
            r0.f43a = r1
            r0.f44b = r2
            r0.f45c = r4
            r0.f46d = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L2d
        L3:
            boolean r0 = r5 instanceof a1.j
            if (r0 != 0) goto L8
            goto L2b
        L8:
            a1.j r5 = (a1.j) r5
            int r0 = r4.f43a
            int r1 = r5.f43a
            if (r0 == r1) goto L11
            goto L2b
        L11:
            long r0 = r4.f44b
            long r2 = r5.f44b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1a
            goto L2b
        L1a:
            a1.k r0 = r4.f45c
            a1.k r1 = r5.f45c
            if (r0 == r1) goto L21
            goto L2b
        L21:
            androidx.lifecycle.x r0 = r4.f46d
            androidx.lifecycle.x r5 = r5.f46d
            boolean r5 = gg.l.a(r0, r5)
            if (r5 != 0) goto L2d
        L2b:
            r5 = 0
            return r5
        L2d:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f43a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f44b
            int r0 = eh.a.f(r0, r1, r2)
            a1.k r2 = r4.f45c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            androidx.lifecycle.x r0 = r4.f46d
            if (r0 != 0) goto L1d
            r0 = 0
            goto L21
        L1d:
            int r0 = r0.hashCode()
        L21:
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContentCaptureEvent(id="
            r0.<init>(r1)
            int r1 = r3.f43a
            r0.append(r1)
            java.lang.String r1 = ", timestamp="
            r0.append(r1)
            long r1 = r3.f44b
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            a1.k r1 = r3.f45c
            r0.append(r1)
            java.lang.String r1 = ", structureCompat="
            r0.append(r1)
            androidx.lifecycle.x r1 = r3.f46d
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
