package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class e40 implements p000.InterfaceC0933w3 {

    /* JADX INFO: renamed from: α */
    public final float f3403;

    /* JADX INFO: renamed from: β */
    public final p000.oz1 f3404;

    public e40(float r4, float r5, float r6) {
            r3 = this;
            r3.<init>()
            r3.f3403 = r6
            oz1 r6 = new oz1
            r6.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.f8361 = r0
            r1 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r1 = java.lang.Math.sqrt(r1)
            r6.f8362 = r1
            r6.f8363 = r0
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L22
            java.lang.String r1 = "Damping ratio must be non-negative"
            p000.ri1.m5098(r1)
        L22:
            r6.f8363 = r4
            double r1 = r6.f8362
            double r1 = r1 * r1
            float r4 = (float) r1
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 > 0) goto L31
            java.lang.String r4 = "Spring stiffness constant must be positive."
            p000.ri1.m5098(r4)
        L31:
            double r4 = (double) r5
            double r4 = java.lang.Math.sqrt(r4)
            r6.f8362 = r4
            r3.f3404 = r6
            return
    }

    @Override // p000.InterfaceC0933w3
    /* JADX INFO: renamed from: α */
    public final p000.n72 mo1841(p000.g62 r2) {
            r1 = this;
            i0 r2 = new i0
            l72 r0 = new l72
            r0.<init>(r1)
            r2.<init>(r0)
            return r2
    }
}
