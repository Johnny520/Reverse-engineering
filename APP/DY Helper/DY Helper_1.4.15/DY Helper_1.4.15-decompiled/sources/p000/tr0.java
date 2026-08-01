package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tr0 {

    /* JADX INFO: renamed from: β */
    public static final float f10432 = 0.0f;

    /* JADX INFO: renamed from: γ */
    public static final float f10433 = 0.0f;

    /* JADX INFO: renamed from: δ */
    public static final float f10434 = 0.0f;

    /* JADX INFO: renamed from: α */
    public final float f10435;

    static {
            r0 = 0
            m5735(r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            m5735(r0)
            p000.tr0.f10432 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            m5735(r0)
            p000.tr0.f10433 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            m5735(r0)
            p000.tr0.f10434 = r0
            return
    }

    public /* synthetic */ tr0(float r1) {
            r0 = this;
            r0.<init>()
            r0.f10435 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m5735(float r1) {
            r0 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lc
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto Lc
            goto L12
        Lc:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L13
        L12:
            return
        L13:
            java.lang.String r1 = "topRatio should be in [0..1] range or -1"
            p000.bm0.m983(r1)
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.String m5736(float r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L8
            java.lang.String r2 = "LineHeightStyle.Alignment.Top"
            return r2
        L8:
            float r0 = p000.tr0.f10432
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L11
            java.lang.String r2 = "LineHeightStyle.Alignment.Center"
            return r2
        L11:
            float r0 = p000.tr0.f10433
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L1a
            java.lang.String r2 = "LineHeightStyle.Alignment.Proportional"
            return r2
        L1a:
            float r0 = p000.tr0.f10434
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L23
            java.lang.String r2 = "LineHeightStyle.Alignment.Bottom"
            return r2
        L23:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LineHeightStyle.Alignment(topPercentage = "
            r0.<init>(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.tr0
            if (r0 != 0) goto L5
            goto L11
        L5:
            tr0 r2 = (p000.tr0) r2
            float r2 = r2.f10435
            float r1 = r1.f10435
            int r1 = java.lang.Float.compare(r1, r2)
            if (r1 == 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            float r0 = r0.f10435
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            float r0 = r0.f10435
            java.lang.String r0 = m5736(r0)
            return r0
    }
}
