package a;

/* JADX INFO: renamed from: a.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0444wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f750a;
    public final a.C0139f9 b;

    public C0444wa(java.lang.String r1, a.C0139f9 r2) {
            r0 = this;
            r0.<init>()
            r0.f750a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof a.C0444wa
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.wa r5 = (a.C0444wa) r5
            java.lang.String r1 = r5.f750a
            java.lang.String r3 = r4.f750a
            boolean r1 = a.C0193i9.a(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            a.f9 r1 = r4.b
            a.f9 r5 = r5.b
            boolean r5 = a.C0193i9.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f750a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            a.f9 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MatchGroup(value="
            r0.<init>(r1)
            java.lang.String r1 = r2.f750a
            r0.append(r1)
            java.lang.String r1 = ", range="
            r0.append(r1)
            a.f9 r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
