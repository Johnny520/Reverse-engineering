package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class df0 {

    /* JADX INFO: renamed from: α */
    public final p000.C0387i8 f3113;

    /* JADX INFO: renamed from: β */
    public final java.util.List f3114;

    /* JADX INFO: renamed from: γ */
    public final boolean f3115;

    public /* synthetic */ df0() {
            r3 = this;
            jz r0 = p000.C0450jz.f5672
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public df0(p000.C0387i8 r1, java.util.List r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f3113 = r1
            r0.f3114 = r2
            r0.f3115 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.df0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            df0 r5 = (p000.df0) r5
            i8 r1 = r4.f3113
            i8 r3 = r5.f3113
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List r1 = r4.f3114
            java.util.List r3 = r5.f3114
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r4 = r4.f3115
            boolean r5 = r5.f3115
            if (r4 == r5) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            i8 r0 = r3.f3113
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.f3114
            int r0 = p000.a12.m16(r2, r0, r1)
            boolean r3 = r3.f3115
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ResolvedAwemeSources(rootVideo="
            r0.<init>(r1)
            i8 r1 = r2.f3113
            r0.append(r1)
            java.lang.String r1 = ", pageItems="
            r0.append(r1)
            java.util.List r1 = r2.f3114
            r0.append(r1)
            java.lang.String r1 = ", animatedInfoPresent="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r2.f3115
            java.lang.String r2 = p000.lz1.m3693(r0, r2, r1)
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final boolean m1736() {
            r0 = this;
            boolean r0 = r0.f3115
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final java.util.List m1737() {
            r0 = this;
            java.util.List r0 = r0.f3114
            return r0
    }
}
