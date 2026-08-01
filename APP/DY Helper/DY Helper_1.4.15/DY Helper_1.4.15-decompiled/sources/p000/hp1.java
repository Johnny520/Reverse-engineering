package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public interface hp1 {
    /* JADX INFO: renamed from: α */
    static p000.r01 m2525(p000.r01 r5) {
            r0 = 1065353216(0x3f800000, float:1.0)
            double r1 = (double) r0
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto La
            goto Lf
        La:
            java.lang.String r1 = "invalid weight; must be greater than zero"
            p000.yl0.m6938(r1)
        Lf:
            mq0 r1 = new mq0
            r1.<init>(r0)
            r01 r5 = r5.mo4345(r1)
            return r5
    }
}
