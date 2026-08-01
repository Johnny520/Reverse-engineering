package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class iz1 implements java.util.Comparator {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f5275;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f5276;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.lang.Object f5277;

    public /* synthetic */ iz1(java.util.Comparator r1, java.util.LinkedHashMap r2, int r3) {
            r0 = this;
            r0.f5275 = r3
            r0.f5277 = r1
            r0.f5276 = r2
            r0.<init>()
            return
    }

    public iz1(p000.p22 r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 2
            r1.f5275 = r0
            r1.<init>()
            r1.f5276 = r2
            r1.f5277 = r3
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f5275
            java.lang.Object r1 = r2.f5277
            java.lang.Object r2 = r2.f5276
            switch(r0) {
                case 0: goto L5e;
                case 1: goto L16;
                default: goto L9;
            }
        L9:
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            p22 r2 = (p000.p22) r2
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r2.keysCompare(r3, r4, r1)
            return r2
        L16:
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            qy1 r1 = (p000.qy1) r1
            int r0 = r1.compare(r3, r4)
            if (r0 == 0) goto L21
            goto L5d
        L21:
            ky1 r4 = (p000.ky1) r4
            ry1 r0 = p000.ry1.f9602
            java.lang.String r4 = p000.ry1.m5291(r4)
            java.lang.Object r4 = r2.get(r4)
            hz1 r4 = (p000.hz1) r4
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L3b
            gy1 r4 = r4.f4849
            boolean r4 = r4.f4506
            if (r4 != r1) goto L3b
            r4 = r1
            goto L3c
        L3b:
            r4 = r0
        L3c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            ky1 r3 = (p000.ky1) r3
            java.lang.String r3 = p000.ry1.m5291(r3)
            java.lang.Object r2 = r2.get(r3)
            hz1 r2 = (p000.hz1) r2
            if (r2 == 0) goto L55
            gy1 r2 = r2.f4849
            boolean r2 = r2.f4506
            if (r2 != r1) goto L55
            r0 = r1
        L55:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            int r0 = p000.AbstractC0073bd.m877(r4, r2)
        L5d:
            return r0
        L5e:
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            jd1 r1 = (p000.jd1) r1
            int r0 = r1.compare(r3, r4)
            if (r0 == 0) goto L69
            goto L9b
        L69:
            ky1 r3 = (p000.ky1) r3
            ry1 r0 = p000.ry1.f9602
            java.lang.String r3 = p000.ry1.m5291(r3)
            java.lang.Object r3 = r2.get(r3)
            hz1 r3 = (p000.hz1) r3
            r0 = 0
            if (r3 == 0) goto L7d
            java.lang.String r3 = r3.f4848
            goto L7e
        L7d:
            r3 = r0
        L7e:
            java.lang.String r1 = ""
            if (r3 != 0) goto L83
            r3 = r1
        L83:
            ky1 r4 = (p000.ky1) r4
            java.lang.String r4 = p000.ry1.m5291(r4)
            java.lang.Object r2 = r2.get(r4)
            hz1 r2 = (p000.hz1) r2
            if (r2 == 0) goto L93
            java.lang.String r0 = r2.f4848
        L93:
            if (r0 != 0) goto L96
            goto L97
        L96:
            r1 = r0
        L97:
            int r0 = p000.AbstractC0073bd.m877(r3, r1)
        L9b:
            return r0
    }
}
