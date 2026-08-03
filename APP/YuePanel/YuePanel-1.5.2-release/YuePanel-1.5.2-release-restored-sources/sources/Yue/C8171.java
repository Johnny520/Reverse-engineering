package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8171 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static String f24264 = "VelocityMatrix";

    /* JADX INFO: renamed from: ۥ */
    public float f3277;

    /* JADX INFO: renamed from: ۥ۟ */
    public float f3278;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float f24265;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float f24266;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f24267;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public float f24268;

    /* JADX INFO: renamed from: ۥ */
    public void m4196(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f24265;
        float f8 = f4 + this.f24266;
        float f9 = f7 + (this.f3277 * f5);
        float f10 = f8 + (this.f3278 * f6);
        float radians = (float) Math.toRadians(this.f24268);
        float radians2 = (float) Math.toRadians(this.f24267);
        double d = radians;
        double d2 = i2 * f6;
        float fSin = f9 + (((float) ((((double) ((-i) * f5)) * Math.sin(d)) - (Math.cos(d) * d2))) * radians2);
        float fCos = f10 + (radians2 * ((float) ((((double) (i * f5)) * Math.cos(d)) - (d2 * Math.sin(d)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4197() {
        this.f24267 = 0.0f;
        this.f24266 = 0.0f;
        this.f24265 = 0.0f;
        this.f3278 = 0.0f;
        this.f3277 = 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m26955(AbstractC5620 abstractC5620, float f) {
        if (abstractC5620 != null) {
            this.f24267 = abstractC5620.m17483(f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m26956(AbstractC7544 abstractC7544, float f) {
        if (abstractC7544 != null) {
            this.f24267 = abstractC7544.m23649(f);
            this.f24268 = abstractC7544.m3726(f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m26957(AbstractC5620 abstractC5620, AbstractC5620 abstractC56202, float f) {
        if (abstractC5620 == null && abstractC56202 == null) {
            return;
        }
        if (abstractC5620 == null) {
            this.f3277 = abstractC5620.m17483(f);
        }
        if (abstractC56202 == null) {
            this.f3278 = abstractC56202.m17483(f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m26958(AbstractC7544 abstractC7544, AbstractC7544 abstractC75442, float f) {
        if (abstractC7544 != null) {
            this.f3277 = abstractC7544.m23649(f);
        }
        if (abstractC75442 != null) {
            this.f3278 = abstractC75442.m23649(f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m26959(AbstractC5620 abstractC5620, AbstractC5620 abstractC56202, float f) {
        if (abstractC5620 != null) {
            this.f24265 = abstractC5620.m17483(f);
        }
        if (abstractC56202 != null) {
            this.f24266 = abstractC56202.m17483(f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m26960(AbstractC7544 abstractC7544, AbstractC7544 abstractC75442, float f) {
        if (abstractC7544 != null) {
            this.f24265 = abstractC7544.m23649(f);
        }
        if (abstractC75442 != null) {
            this.f24266 = abstractC75442.m23649(f);
        }
    }
}
