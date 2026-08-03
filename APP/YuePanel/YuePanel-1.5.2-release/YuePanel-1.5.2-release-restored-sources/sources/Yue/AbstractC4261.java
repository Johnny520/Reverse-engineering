package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4261 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f764 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f765 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f8760 = 2;

    /* JADX INFO: renamed from: Yue.ۥ۟ۨ۟۠$ۥ */
    public static class C0373 extends AbstractC4261 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public double f8761;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public double[] f8762;

        public C0373(double d, double[] dArr) {
            this.f8761 = d;
            this.f8762 = dArr;
        }

        @Override // Yue.AbstractC4261
        /* JADX INFO: renamed from: ۥ۟۟ */
        public double mo6902(double d, int i) {
            return this.f8762[i];
        }

        @Override // Yue.AbstractC4261
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo6903(double d, double[] dArr) {
            double[] dArr2 = this.f8762;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // Yue.AbstractC4261
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo6904(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f8762;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // Yue.AbstractC4261
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public double mo6905(double d, int i) {
            return 0.0d;
        }

        @Override // Yue.AbstractC4261
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo6906(double d, double[] dArr) {
            for (int i = 0; i < this.f8762.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // Yue.AbstractC4261
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public double[] mo6907() {
            return new double[]{this.f8761};
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static AbstractC4261 m1226(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        return i != 0 ? i != 2 ? new C5703(dArr, dArr2) : new C0373(dArr[0], dArr2[0]) : new C6266(dArr, dArr2);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static AbstractC4261 m1227(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C3371(iArr, dArr, dArr2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract double mo6902(double d, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public abstract void mo6903(double d, double[] dArr);

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public abstract void mo6904(double d, float[] fArr);

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public abstract double mo6905(double d, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public abstract void mo6906(double d, double[] dArr);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public abstract double[] mo6907();
}
