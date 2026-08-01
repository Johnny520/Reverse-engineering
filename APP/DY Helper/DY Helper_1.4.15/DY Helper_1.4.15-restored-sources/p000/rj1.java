package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class rj1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.Set f9389 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f9390 = null;

    static {
            java.lang.String r0 = "from_profile_self"
            java.lang.String r1 = "from_profile_other"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.rj1.f9389 = r0
            java.lang.String r0 = "personal_homepage"
            java.lang.String r1 = "others_homepage"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.rj1.f9390 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static float m5100(float r4, float r5) {
            float r0 = java.lang.Math.abs(r4)
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 > 0) goto L13
            float r4 = p000.j81.m2905(r4, r2, r3)
            goto L14
        L13:
            r4 = r3
        L14:
            float r0 = java.lang.Math.abs(r5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L20
            float r3 = p000.j81.m2905(r5, r2, r3)
        L20:
            float r3 = r3 * r4
            return r3
    }
}
