package t2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f13001b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f13002c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f13003d = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13004a;

    static {
            r0 = 0
            a(r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            a(r0)
            t2.f.f13001b = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            a(r0)
            t2.f.f13002c = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            a(r0)
            t2.f.f13003d = r0
            return
    }

    public /* synthetic */ f(float r1) {
            r0 = this;
            r0.<init>()
            r0.f13004a = r1
            return
    }

    public static void a(float r1) {
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
            o2.a.b(r1)
            return
    }

    public static java.lang.String b(float r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L8
            java.lang.String r2 = "LineHeightStyle.Alignment.Top"
            return r2
        L8:
            float r0 = t2.f.f13001b
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L11
            java.lang.String r2 = "LineHeightStyle.Alignment.Center"
            return r2
        L11:
            float r0 = t2.f.f13002c
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L1a
            java.lang.String r2 = "LineHeightStyle.Alignment.Proportional"
            return r2
        L1a:
            float r0 = t2.f.f13003d
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
            boolean r0 = r2 instanceof t2.f
            if (r0 != 0) goto L5
            goto L11
        L5:
            t2.f r2 = (t2.f) r2
            float r2 = r2.f13004a
            float r0 = r1.f13004a
            int r2 = java.lang.Float.compare(r0, r2)
            if (r2 == 0) goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            float r0 = r1.f13004a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            float r0 = r1.f13004a
            java.lang.String r0 = b(r0)
            return r0
    }
}
