package d9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.a f2112b;

    public j(long r1, c9.a r3) {
            r0 = this;
            r0.<init>()
            r0.f2111a = r1
            r0.f2112b = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof d9.j
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            d9.j r8 = (d9.j) r8
            long r3 = r7.f2111a
            long r5 = r8.f2111a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            c9.a r1 = r7.f2112b
            c9.a r8 = r8.f2112b
            boolean r8 = gg.l.a(r1, r8)
            if (r8 != 0) goto L20
            return r2
        L20:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f2111a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            c9.a r1 = r2.f2112b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CachedGroupAvatar(loadedAt="
            r0.<init>(r1)
            long r1 = r3.f2111a
            r0.append(r1)
            java.lang.String r1 = ", group="
            r0.append(r1)
            c9.a r1 = r3.f2112b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
