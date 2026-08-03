package v8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f14233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f14234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f14236e;

    public f(int r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7, int r8) {
            r2 = this;
            r0 = r8 & 2
            java.lang.String r1 = ""
            if (r0 == 0) goto L7
            r4 = r1
        L7:
            r0 = r8 & 4
            if (r0 == 0) goto Lc
            r5 = r1
        Lc:
            r0 = r8 & 8
            if (r0 == 0) goto L11
            r6 = 0
        L11:
            r8 = r8 & 16
            if (r8 == 0) goto L16
            r7 = r1
        L16:
            r2.<init>()
            r2.f14232a = r3
            r2.f14233b = r4
            r2.f14234c = r5
            r2.f14235d = r6
            r2.f14236e = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3a
        L3:
            boolean r0 = r3 instanceof v8.f
            if (r0 != 0) goto L8
            goto L38
        L8:
            v8.f r3 = (v8.f) r3
            int r0 = r2.f14232a
            int r1 = r3.f14232a
            if (r0 == r1) goto L11
            goto L38
        L11:
            java.lang.String r0 = r2.f14233b
            java.lang.String r1 = r3.f14233b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L38
        L1c:
            java.lang.String r0 = r2.f14234c
            java.lang.String r1 = r3.f14234c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L38
        L27:
            int r0 = r2.f14235d
            int r1 = r3.f14235d
            if (r0 == r1) goto L2e
            goto L38
        L2e:
            java.lang.String r0 = r2.f14236e
            java.lang.String r3 = r3.f14236e
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L3a
        L38:
            r3 = 0
            return r3
        L3a:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f14232a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f14233b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f14234c
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r3.f14235d
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r1 = r3.f14236e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ForwardPlan(type="
            r0.<init>(r1)
            int r1 = r3.f14232a
            r0.append(r1)
            java.lang.String r1 = ", content="
            r0.append(r1)
            java.lang.String r1 = r3.f14233b
            r0.append(r1)
            java.lang.String r1 = ", path="
            r0.append(r1)
            java.lang.String r1 = r3.f14234c
            r0.append(r1)
            java.lang.String r1 = ", durationMillis="
            r0.append(r1)
            int r1 = r3.f14235d
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f14236e
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
