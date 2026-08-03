package h.Hchat.crash;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f4603b;

    public h(long r1, java.lang.String r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f4602a = r1
            r0.f4603b = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof h.Hchat.crash.h
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h.Hchat.crash.h r8 = (h.Hchat.crash.h) r8
            long r3 = r7.f4602a
            long r5 = r8.f4602a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = r7.f4603b
            java.lang.String r8 = r8.f4603b
            boolean r8 = gg.l.a(r1, r8)
            if (r8 != 0) goto L20
            return r2
        L20:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f4602a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            java.lang.String r1 = r2.f4603b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SystemExitRecord(timestamp="
            r0.<init>(r1)
            long r1 = r3.f4602a
            r0.append(r1)
            java.lang.String r1 = ", details="
            r0.append(r1)
            java.lang.String r1 = r3.f4603b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
