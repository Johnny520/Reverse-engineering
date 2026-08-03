package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f12671f;

    public l(long r1, long r3, long r5, float r7, float r8, float r9) {
            r0 = this;
            r0.<init>()
            r0.f12666a = r1
            r0.f12667b = r3
            r0.f12668c = r5
            r0.f12669d = r7
            r0.f12670e = r8
            r0.f12671f = r9
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L4d
        L3:
            boolean r0 = r5 instanceof sh.l
            if (r0 != 0) goto L8
            goto L4b
        L8:
            sh.l r5 = (sh.l) r5
            long r0 = r4.f12666a
            long r2 = r5.f12666a
            boolean r0 = e1.b.b(r0, r2)
            if (r0 != 0) goto L15
            goto L4b
        L15:
            long r0 = r4.f12667b
            long r2 = r5.f12667b
            boolean r0 = e1.b.b(r0, r2)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            long r0 = r4.f12668c
            long r2 = r5.f12668c
            boolean r0 = e1.b.b(r0, r2)
            if (r0 != 0) goto L2b
            goto L4b
        L2b:
            float r0 = r4.f12669d
            float r1 = r5.f12669d
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L36
            goto L4b
        L36:
            float r0 = r4.f12670e
            float r1 = r5.f12670e
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L41
            goto L4b
        L41:
            float r0 = r4.f12671f
            float r5 = r5.f12671f
            int r5 = java.lang.Float.compare(r0, r5)
            if (r5 == 0) goto L4d
        L4b:
            r5 = 0
            return r5
        L4d:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f12666a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f12667b
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f12668c
            int r0 = eh.a.f(r0, r1, r2)
            float r2 = r4.f12669d
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r4.f12670e
            int r0 = eh.a.d(r2, r0, r1)
            float r1 = r4.f12671f
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r6 = this;
            long r0 = r6.f12666a
            java.lang.String r0 = e1.b.g(r0)
            long r1 = r6.f12667b
            java.lang.String r1 = e1.b.g(r1)
            long r2 = r6.f12668c
            java.lang.String r2 = e1.b.g(r2)
            java.lang.String r3 = ", middlePoint="
            java.lang.String r4 = ", endPoint="
            java.lang.String r5 = "CheckmarkCache(startPoint="
            java.lang.StringBuilder r0 = bc.e.p(r5, r0, r3, r1, r4)
            r0.append(r2)
            java.lang.String r1 = ", centerX="
            r0.append(r1)
            float r1 = r6.f12669d
            r0.append(r1)
            java.lang.String r1 = ", centerY="
            r0.append(r1)
            float r1 = r6.f12670e
            r0.append(r1)
            java.lang.String r1 = ", strokeWidth="
            r0.append(r1)
            float r1 = r6.f12671f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
