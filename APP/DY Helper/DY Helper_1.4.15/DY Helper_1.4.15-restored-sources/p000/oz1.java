package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class oz1 {

    /* JADX INFO: renamed from: α */
    public float f8361;

    /* JADX INFO: renamed from: β */
    public double f8362;

    /* JADX INFO: renamed from: γ */
    public float f8363;

    /* JADX INFO: renamed from: α */
    public final long m4338(float r21, float r22, long r23) {
            r20 = this;
            r0 = r20
            r1 = r22
            float r2 = r0.f8361
            float r2 = r21 - r2
            r3 = r23
            double r3 = (double) r3
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r3 / r5
            float r5 = r0.f8363
            double r6 = (double) r5
            double r8 = (double) r5
            double r6 = r6 * r8
            float r8 = -r5
            double r8 = (double) r8
            double r10 = r0.f8362
            double r8 = r8 * r10
            r12 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            r14 = 1
            if (r13 <= 0) goto L53
            double r12 = (double) r14
            double r6 = r6 - r12
            double r5 = java.lang.Math.sqrt(r6)
            double r5 = r5 * r10
            double r10 = r8 + r5
            double r8 = r8 - r5
            double r5 = (double) r2
            double r12 = r8 * r5
            double r1 = (double) r1
            double r12 = r12 - r1
            double r1 = r8 - r10
            double r12 = r12 / r1
            double r5 = r5 - r12
            double r1 = r8 * r3
            double r14 = java.lang.Math.exp(r1)
            double r14 = r14 * r5
            double r3 = r3 * r10
            double r16 = java.lang.Math.exp(r3)
            double r16 = r16 * r12
            double r16 = r16 + r14
            double r5 = r5 * r8
            double r1 = java.lang.Math.exp(r1)
            double r1 = r1 * r5
            double r12 = r12 * r10
            double r3 = java.lang.Math.exp(r3)
            double r3 = r3 * r12
        L51:
            double r3 = r3 + r1
            goto Lb2
        L53:
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 != 0) goto L75
            double r5 = (double) r1
            double r1 = (double) r2
            double r7 = r10 * r1
            double r7 = r7 + r5
            double r5 = -r10
            double r5 = r5 * r3
            double r3 = r3 * r7
            double r3 = r3 + r1
            double r1 = java.lang.Math.exp(r5)
            double r16 = r1 * r3
            double r1 = java.lang.Math.exp(r5)
            double r1 = r1 * r3
            double r3 = r0.f8362
            double r3 = -r3
            double r1 = r1 * r3
            double r3 = java.lang.Math.exp(r5)
            double r3 = r3 * r7
            goto L51
        L75:
            double r12 = (double) r14
            double r5 = r12 - r6
            double r5 = java.lang.Math.sqrt(r5)
            double r5 = r5 * r10
            double r12 = r12 / r5
            double r10 = -r8
            double r14 = (double) r2
            double r10 = r10 * r14
            double r1 = (double) r1
            double r10 = r10 + r1
            double r10 = r10 * r12
            double r1 = r5 * r3
            double r3 = r3 * r8
            double r12 = java.lang.Math.exp(r3)
            double r16 = java.lang.Math.cos(r1)
            double r16 = r16 * r14
            double r18 = java.lang.Math.sin(r1)
            double r18 = r18 * r10
            double r18 = r18 + r16
            double r16 = r18 * r12
            double r8 = r8 * r16
            double r3 = java.lang.Math.exp(r3)
            double r12 = -r5
            double r12 = r12 * r14
            double r14 = java.lang.Math.sin(r1)
            double r14 = r14 * r12
            double r5 = r5 * r10
            double r1 = java.lang.Math.cos(r1)
            double r1 = r1 * r5
            double r1 = r1 + r14
            double r1 = r1 * r3
            double r3 = r1 + r8
        Lb2:
            float r0 = r0.f8361
            double r0 = (double) r0
            double r0 = r16 + r0
            float r0 = (float) r0
            float r1 = (float) r3
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            r4 = 32
            long r2 = r2 << r4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            return r0
    }
}
