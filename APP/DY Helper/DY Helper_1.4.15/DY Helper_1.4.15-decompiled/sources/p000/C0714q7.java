package p000;

/* JADX INFO: renamed from: q7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0714q7 {

    /* JADX INFO: renamed from: α */
    public final long f8893;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f8894;

    /* JADX INFO: renamed from: γ */
    public final p000.EnumC0539m7 f8895;

    public C0714q7(long r1, java.lang.String r3, p000.EnumC0539m7 r4) {
            r0 = this;
            r4.getClass()
            r0.<init>()
            r0.f8893 = r1
            r0.f8894 = r3
            r0.f8895 = r4
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.C0714q7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            q7 r8 = (p000.C0714q7) r8
            long r3 = r7.f8893
            long r5 = r8.f8893
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = r7.f8894
            java.lang.String r3 = r8.f8894
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            m7 r7 = r7.f8895
            m7 r8 = r8.f8895
            if (r7 == r8) goto L27
            return r2
        L27:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f8893
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            java.lang.String r1 = r2.f8894
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            m7 r2 = r2.f8895
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Trigger(generation="
            r0.<init>(r1)
            long r1 = r3.f8893
            r0.append(r1)
            java.lang.String r1 = ", awemeId="
            r0.append(r1)
            java.lang.String r1 = r3.f8894
            r0.append(r1)
            java.lang.String r1 = ", kind="
            r0.append(r1)
            m7 r3 = r3.f8895
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
