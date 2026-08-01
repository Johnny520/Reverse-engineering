package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class d00 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicLong f2829 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f2830 = null;

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            p000.d00.f2829 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            p000.d00.f2830 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m1635(java.lang.Object r6, java.lang.ClassLoader r7) {
            java.lang.String r0 = "mAdParamsModel"
            java.lang.Object r0 = p000.qe0.m4879(r6, r0)
            java.lang.String r1 = "mRewardOnceMoreAdParams"
            java.lang.Object r1 = p000.qe0.m4879(r6, r1)
            r2 = 0
            if (r0 == 0) goto L22
            if (r1 == 0) goto L22
            java.lang.String r3 = "getRewardInfo"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Object r3 = p000.qe0.m4869(r0, r3, r4)
            java.lang.String r4 = "LIZJ"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            p000.qe0.m4869(r1, r4, r3)
        L22:
            java.lang.String r1 = "mVideoAd"
            java.lang.Object r3 = p000.qe0.m4879(r6, r1)
            if (r3 != 0) goto L5d
            java.lang.String r4 = "mVideoCacheModel"
            java.lang.Object r4 = p000.qe0.m4879(r6, r4)
            java.lang.String r5 = "getVideoAd"
            if (r4 == 0) goto L3a
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r3 = p000.qe0.m4869(r4, r5, r3)
        L3a:
            if (r3 != 0) goto L58
            if (r0 == 0) goto L58
            java.lang.String r3 = "~792076A9A8C9D37392B1BEA902D394E24996B7A788E87959238B9A31B88E8390C7CCB5B0A7376413629F8EC59E"
            java.lang.String r3 = p000.jf0.m2957(r3)
            java.lang.Class r7 = p000.qe0.m4876(r7, r3)
            java.lang.String r3 = "inst"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r7 = p000.qe0.m4870(r7, r3, r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object r3 = p000.qe0.m4869(r7, r5, r0)
        L58:
            if (r3 == 0) goto L5d
            p000.qe0.m4882(r1, r6, r3)
        L5d:
            return
    }

    /* JADX INFO: renamed from: β */
    public static boolean m1636() {
            java.lang.String r0 = "mini_game_ad_auto_complete_enabled"
            r1 = 0
            boolean r0 = p000.ui1.m5887(r0, r1)
            return r0
    }
}
