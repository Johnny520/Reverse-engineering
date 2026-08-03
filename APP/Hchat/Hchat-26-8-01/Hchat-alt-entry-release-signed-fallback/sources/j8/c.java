package j8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f6775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6776b;

    public c(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f6775a = r1
            r0.f6776b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof j8.c
            if (r0 != 0) goto L8
            goto L1b
        L8:
            j8.c r3 = (j8.c) r3
            java.lang.String r0 = r2.f6775a
            java.lang.String r1 = r3.f6775a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            int r0 = r2.f6776b
            int r3 = r3.f6776b
            if (r0 == r3) goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f6775a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.f6776b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VoiceSource(path="
            r0.<init>(r1)
            java.lang.String r1 = r2.f6775a
            r0.append(r1)
            java.lang.String r1 = ", durationMillis="
            r0.append(r1)
            int r1 = r2.f6776b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
