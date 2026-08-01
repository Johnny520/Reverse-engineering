package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mv1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f7290;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f7291;

    /* JADX INFO: renamed from: γ */
    public final int f7292;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f7293;

    /* JADX INFO: renamed from: ε */
    public final boolean f7294;

    /* JADX INFO: renamed from: ζ */
    public final p000.p70 f7295;

    public mv1(java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, boolean r5, p000.p70 r6) {
            r0 = this;
            r4.getClass()
            r0.<init>()
            r0.f7290 = r1
            r0.f7291 = r2
            r0.f7292 = r3
            r0.f7293 = r4
            r0.f7294 = r5
            r0.f7295 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L45
        L3:
            boolean r0 = r3 instanceof p000.mv1
            if (r0 != 0) goto L8
            goto L43
        L8:
            mv1 r3 = (p000.mv1) r3
            java.lang.String r0 = r2.f7290
            java.lang.String r1 = r3.f7290
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L43
        L15:
            java.lang.String r0 = r2.f7291
            java.lang.String r1 = r3.f7291
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L43
        L20:
            int r0 = r2.f7292
            int r1 = r3.f7292
            if (r0 == r1) goto L27
            goto L43
        L27:
            java.lang.String r0 = r2.f7293
            java.lang.String r1 = r3.f7293
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L32
            goto L43
        L32:
            boolean r0 = r2.f7294
            boolean r1 = r3.f7294
            if (r0 == r1) goto L39
            goto L43
        L39:
            p70 r2 = r2.f7295
            p70 r3 = r3.f7295
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L45
        L43:
            r2 = 0
            return r2
        L45:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f7290
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f7291
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r3.f7292
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r3.f7293
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r3.f7294
            int r0 = p000.lz1.m3678(r0, r1, r2)
            p70 r3 = r3.f7295
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", subtitle="
            java.lang.String r1 = ", iconRes="
            java.lang.String r2 = "ActionModel(title="
            java.lang.String r3 = r5.f7290
            java.lang.String r4 = r5.f7291
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", iconTint="
            java.lang.String r2 = ", enabled="
            int r3 = r5.f7292
            java.lang.String r4 = r5.f7293
            p000.lz1.m3671(r0, r3, r1, r4, r2)
            boolean r1 = r5.f7294
            r0.append(r1)
            java.lang.String r1 = ", onClick="
            r0.append(r1)
            p70 r5 = r5.f7295
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
