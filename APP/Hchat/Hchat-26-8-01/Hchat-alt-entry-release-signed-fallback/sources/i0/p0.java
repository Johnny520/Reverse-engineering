package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f5993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f5994b;

    public p0(java.lang.Integer r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f5993a = r1
            r0.f5994b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof i0.p0
            if (r0 != 0) goto L8
            goto L1f
        L8:
            i0.p0 r3 = (i0.p0) r3
            java.lang.Integer r0 = r2.f5993a
            java.lang.Integer r1 = r3.f5993a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.Object r0 = r2.f5994b
            java.lang.Object r3 = r3.f5994b
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Integer r0 = r3.f5993a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Object r1 = r3.f5994b
            boolean r2 = r1 instanceof java.lang.Enum
            if (r2 == 0) goto L15
            java.lang.Enum r1 = (java.lang.Enum) r1
            int r1 = r1.ordinal()
            goto L1d
        L15:
            if (r1 == 0) goto L1c
            int r1 = r1.hashCode()
            goto L1d
        L1c:
            r1 = 0
        L1d:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "JoinedKey(left="
            r0.<init>(r1)
            java.lang.Integer r1 = r2.f5993a
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            java.lang.Object r1 = r2.f5994b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
