package x0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f20824b;

    public b(int r1, oh.h r2, java.lang.Integer r3) {
            r0 = this;
            r0.<init>()
            r0.f20823a = r1
            r0.f20824b = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof x0.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            x0.b r5 = (x0.b) r5
            int r1 = r4.f20823a
            int r3 = r5.f20823a
            if (r1 == r3) goto L13
            return r2
        L13:
            r1 = 0
            r3 = 0
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L1c
            return r2
        L1c:
            java.lang.Integer r1 = r4.f20824b
            java.lang.Integer r5 = r5.f20824b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L27
            return r2
        L27:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f20823a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            r1 = 0
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Integer r2 = r3.f20824b
            if (r2 != 0) goto L11
            goto L15
        L11:
            int r1 = r2.hashCode()
        L15:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ComposeStackTraceFrame(groupKey="
            r0.<init>(r1)
            int r1 = r2.f20823a
            r0.append(r1)
            java.lang.String r1 = ", sourceInfo="
            r0.append(r1)
            r1 = 0
            r0.append(r1)
            java.lang.String r1 = ", groupOffset="
            r0.append(r1)
            java.lang.Integer r1 = r2.f20824b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
