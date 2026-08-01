package p000;

/* JADX INFO: renamed from: rd */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0757rd {

    /* JADX INFO: renamed from: α */
    public final p000.ip1 f9337;

    /* JADX INFO: renamed from: β */
    public final p000.ip1 f9338;

    /* JADX INFO: renamed from: γ */
    public final p000.ip1 f9339;

    public /* synthetic */ C0757rd() {
            r1 = this;
            ip1 r0 = p000.ip1.f5162
            r1.<init>(r0, r0, r0)
            return
    }

    public C0757rd(p000.ip1 r1, p000.ip1 r2, p000.ip1 r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f9337 = r1
            r0.f9338 = r2
            r0.f9339 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0757rd
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            rd r5 = (p000.C0757rd) r5
            ip1 r1 = r4.f9337
            ip1 r3 = r5.f9337
            if (r1 == r3) goto L13
            return r2
        L13:
            ip1 r1 = r4.f9338
            ip1 r3 = r5.f9338
            if (r1 == r3) goto L1a
            return r2
        L1a:
            ip1 r4 = r4.f9339
            ip1 r5 = r5.f9339
            if (r4 == r5) goto L21
            return r2
        L21:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            ip1 r0 = r2.f9337
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            ip1 r1 = r2.f9338
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            ip1 r2 = r2.f9339
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CampGroupRule(harvest="
            r0.<init>(r1)
            ip1 r1 = r2.f9337
            r0.append(r1)
            java.lang.String r1 = ", plant="
            r0.append(r1)
            ip1 r1 = r2.f9338
            r0.append(r1)
            java.lang.String r1 = ", water="
            r0.append(r1)
            ip1 r2 = r2.f9339
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
