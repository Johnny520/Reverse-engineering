package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6671 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.lang.String f23303 = "VelocityMatrix";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float f23304;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public float f23305;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float f23306;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f23307;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f23308;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f23309;

    static {
            return
    }

    public C6671() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m25688(float r19, float r20, int r21, int r22, float[] r23) {
            r18 = this;
            r0 = r18
            r1 = r21
            r2 = 0
            r3 = r23[r2]
            r4 = 1
            r5 = r23[r4]
            r6 = 1056964608(0x3f000000, float:0.5)
            float r7 = r19 - r6
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r8
            float r6 = r20 - r6
            float r6 = r6 * r8
            float r8 = r0.f23306
            float r3 = r3 + r8
            float r8 = r0.f23307
            float r5 = r5 + r8
            float r8 = r0.f23304
            float r8 = r8 * r7
            float r3 = r3 + r8
            float r8 = r0.f23305
            float r8 = r8 * r6
            float r5 = r5 + r8
            float r8 = r0.f23309
            double r8 = (double) r8
            double r8 = java.lang.Math.toRadians(r8)
            float r8 = (float) r8
            float r9 = r0.f23308
            double r9 = (double) r9
            double r9 = java.lang.Math.toRadians(r9)
            float r9 = (float) r9
            int r10 = -r1
            float r10 = (float) r10
            float r10 = r10 * r7
            double r10 = (double) r10
            double r12 = (double) r8
            double r14 = java.lang.Math.sin(r12)
            double r10 = r10 * r14
            r8 = r22
            float r8 = (float) r8
            float r8 = r8 * r6
            double r14 = (double) r8
            double r16 = java.lang.Math.cos(r12)
            double r16 = r16 * r14
            double r10 = r10 - r16
            float r6 = (float) r10
            float r6 = r6 * r9
            float r3 = r3 + r6
            float r1 = (float) r1
            float r1 = r1 * r7
            double r6 = (double) r1
            double r10 = java.lang.Math.cos(r12)
            double r6 = r6 * r10
            double r10 = java.lang.Math.sin(r12)
            double r14 = r14 * r10
            double r6 = r6 - r14
            float r1 = (float) r6
            float r9 = r9 * r1
            float r5 = r5 + r9
            r23[r2] = r3
            r23[r4] = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m25689() {
            r1 = this;
            r0 = 0
            r1.f23308 = r0
            r1.f23307 = r0
            r1.f23306 = r0
            r1.f23305 = r0
            r1.f23304 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m25690(Yue.AbstractC3489 r1, float r2) {
            r0 = this;
            if (r1 == 0) goto L8
            float r1 = r1.m14363(r2)
            r0.f23308 = r1
        L8:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m25691(Yue.AbstractC5889 r2, float r3) {
            r1 = this;
            if (r2 == 0) goto Le
            float r0 = r2.m21914(r3)
            r1.f23308 = r0
            float r2 = r2.m21912(r3)
            r1.f23309 = r2
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m25692(Yue.AbstractC3489 r1, Yue.AbstractC3489 r2, float r3) {
            r0 = this;
            if (r1 != 0) goto L5
            if (r2 != 0) goto L5
            return
        L5:
            if (r1 != 0) goto Ld
            float r1 = r1.m14363(r3)
            r0.f23304 = r1
        Ld:
            if (r2 != 0) goto L15
            float r1 = r2.m14363(r3)
            r0.f23305 = r1
        L15:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m25693(Yue.AbstractC5889 r1, Yue.AbstractC5889 r2, float r3) {
            r0 = this;
            if (r1 == 0) goto L8
            float r1 = r1.m21914(r3)
            r0.f23304 = r1
        L8:
            if (r2 == 0) goto L10
            float r1 = r2.m21914(r3)
            r0.f23305 = r1
        L10:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m25694(Yue.AbstractC3489 r1, Yue.AbstractC3489 r2, float r3) {
            r0 = this;
            if (r1 == 0) goto L8
            float r1 = r1.m14363(r3)
            r0.f23306 = r1
        L8:
            if (r2 == 0) goto L10
            float r1 = r2.m14363(r3)
            r0.f23307 = r1
        L10:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m25695(Yue.AbstractC5889 r1, Yue.AbstractC5889 r2, float r3) {
            r0 = this;
            if (r1 == 0) goto L8
            float r1 = r1.m21914(r3)
            r0.f23306 = r1
        L8:
            if (r2 == 0) goto L10
            float r1 = r2.m21914(r3)
            r0.f23307 = r1
        L10:
            return
    }
}
