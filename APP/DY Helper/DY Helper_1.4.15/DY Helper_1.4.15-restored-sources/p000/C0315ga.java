package p000;

/* JADX INFO: renamed from: ga */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0315ga {

    /* JADX INFO: renamed from: α */
    public final android.graphics.BlendModeColorFilter f4290;

    /* JADX INFO: renamed from: β */
    public final long f4291;

    /* JADX INFO: renamed from: γ */
    public final int f4292;

    public C0315ga(long r5) {
            r4 = this;
            android.graphics.BlendModeColorFilter r0 = new android.graphics.BlendModeColorFilter
            int r1 = p000.kn0.m3355(r5)
            r2 = 5
            android.graphics.BlendMode r3 = p000.AbstractC0978xb.m6600(r2)
            r0.<init>(r1, r3)
            r4.<init>()
            r4.f4290 = r0
            r4.f4291 = r5
            r4.f4292 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L1b
        L3:
            boolean r0 = r5 instanceof p000.C0315ga
            if (r0 != 0) goto L8
            goto L1d
        L8:
            ga r5 = (p000.C0315ga) r5
            long r0 = r5.f4291
            long r2 = r4.f4291
            boolean r0 = p000.C0114ci.m1192(r2, r0)
            if (r0 != 0) goto L15
            goto L1d
        L15:
            int r4 = r4.f4292
            int r5 = r5.f4292
            if (r4 != r5) goto L1d
        L1b:
            r4 = 1
            return r4
        L1d:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r2 = this;
            int r0 = p000.C0114ci.f2126
            long r0 = r2.f4291
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            int r2 = r2.f4292
            int r2 = java.lang.Integer.hashCode(r2)
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BlendModeColorFilter(color="
            r0.<init>(r1)
            long r1 = r3.f4291
            java.lang.String r1 = p000.C0114ci.m1198(r1)
            r0.append(r1)
            java.lang.String r1 = ", blendMode="
            r0.append(r1)
            int r3 = r3.f4292
            java.lang.String r3 = p000.AbstractC0978xb.m6601(r3)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
