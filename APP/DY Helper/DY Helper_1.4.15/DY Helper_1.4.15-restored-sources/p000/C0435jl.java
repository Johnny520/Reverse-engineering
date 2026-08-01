package p000;

/* JADX INFO: renamed from: jl */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0435jl {

    /* JADX INFO: renamed from: α */
    public final boolean f5503;

    /* JADX INFO: renamed from: β */
    public final float f5504;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Integer f5505;

    public C0435jl(boolean r1, float r2, java.lang.Integer r3) {
            r0 = this;
            r0.<init>()
            r0.f5503 = r1
            r0.f5504 = r2
            r0.f5505 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0435jl
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            jl r5 = (p000.C0435jl) r5
            boolean r1 = r4.f5503
            boolean r3 = r5.f5503
            if (r1 == r3) goto L13
            return r2
        L13:
            float r1 = r4.f5504
            float r3 = r5.f5504
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L1e
            return r2
        L1e:
            java.lang.Integer r4 = r4.f5505
            java.lang.Integer r5 = r5.f5505
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f5503
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f5504
            int r0 = p000.lz1.m3676(r2, r0, r1)
            java.lang.Integer r3 = r3.f5505
            if (r3 != 0) goto L15
            r3 = 0
            goto L19
        L15:
            int r3 = r3.hashCode()
        L19:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RoleStyle(visible="
            r0.<init>(r1)
            boolean r1 = r2.f5503
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r1 = r2.f5504
            r0.append(r1)
            java.lang.String r1 = ", color="
            r0.append(r1)
            java.lang.Integer r2 = r2.f5505
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
