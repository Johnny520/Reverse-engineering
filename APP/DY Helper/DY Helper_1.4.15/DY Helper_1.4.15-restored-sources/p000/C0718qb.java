package p000;

/* JADX INFO: renamed from: qb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0718qb {

    /* JADX INFO: renamed from: α */
    public float f8947;

    /* JADX INFO: renamed from: β */
    public boolean f8948;

    /* JADX INFO: renamed from: γ */
    public boolean f8949;

    /* JADX INFO: renamed from: δ */
    public boolean f8950;

    /* JADX INFO: renamed from: ε */
    public int f8951;

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0718qb
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qb r5 = (p000.C0718qb) r5
            float r1 = r4.f8947
            float r3 = r5.f8947
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            boolean r1 = r4.f8948
            boolean r3 = r5.f8948
            if (r1 == r3) goto L1e
            return r2
        L1e:
            boolean r1 = r4.f8949
            boolean r3 = r5.f8949
            if (r1 == r3) goto L25
            return r2
        L25:
            boolean r1 = r4.f8950
            boolean r3 = r5.f8950
            if (r1 == r3) goto L2c
            return r2
        L2c:
            int r4 = r4.f8951
            int r5 = r5.f8951
            if (r4 == r5) goto L33
            return r2
        L33:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f8947
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f8948
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r3.f8949
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r2 = r3.f8950
            int r0 = p000.lz1.m3678(r0, r1, r2)
            int r3 = r3.f8951
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r6 = this;
            float r0 = r6.f8947
            boolean r1 = r6.f8948
            boolean r2 = r6.f8949
            boolean r3 = r6.f8950
            int r6 = r6.f8951
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "LiquidGlassNativeTabState(alpha="
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = ", clickable="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = ", longClickable="
            r4.append(r0)
            java.lang.String r0 = ", focusable="
            java.lang.String r1 = ", importantForAccessibility="
            p000.AbstractC0602nx.m4120(r4, r2, r0, r3, r1)
            java.lang.String r0 = ")"
            java.lang.String r6 = p000.AbstractC0602nx.m4131(r4, r6, r0)
            return r6
    }
}
