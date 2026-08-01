package p000;

/* JADX INFO: renamed from: u7 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0862u7 {

    /* JADX INFO: renamed from: α */
    public int f10616;

    /* JADX INFO: renamed from: β */
    public int f10617;

    /* JADX INFO: renamed from: γ */
    public float f10618;

    /* JADX INFO: renamed from: δ */
    public float f10619;

    /* JADX INFO: renamed from: ε */
    public long f10620;

    /* JADX INFO: renamed from: ζ */
    public long f10621;

    /* JADX INFO: renamed from: η */
    public long f10622;

    /* JADX INFO: renamed from: θ */
    public float f10623;

    /* JADX INFO: renamed from: ι */
    public int f10624;

    /* JADX INFO: renamed from: α */
    public final float m5791(long r9) {
            r8 = this;
            long r0 = r8.f10620
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r3 = 0
            if (r2 >= 0) goto L8
            return r3
        L8:
            long r4 = r8.f10622
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r2 < 0) goto L28
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 >= 0) goto L17
            goto L28
        L17:
            long r9 = r9 - r4
            float r0 = r8.f10623
            float r1 = r6 - r0
            float r9 = (float) r9
            int r8 = r8.f10624
            float r8 = (float) r8
            float r9 = r9 / r8
            float r8 = p000.iu0.m2800(r9, r3, r6)
            float r8 = r8 * r0
            float r8 = r8 + r1
            return r8
        L28:
            long r9 = r9 - r0
            float r9 = (float) r9
            int r8 = r8.f10616
            float r8 = (float) r8
            float r9 = r9 / r8
            float r8 = p000.iu0.m2800(r9, r3, r6)
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r9
            return r8
    }
}
