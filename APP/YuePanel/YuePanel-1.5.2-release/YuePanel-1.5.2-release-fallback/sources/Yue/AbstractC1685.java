package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1685 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f5286 = 0;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f5287 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f5288 = 2;

    /* JADX INFO: renamed from: Yue.ۥ۟ۨ۟۠$ۥ, reason: contains not printable characters */
    public static class C1686 extends Yue.AbstractC1685 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public double f5289;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public double[] f5290;

        public C1686(double r1, double[] r3) {
                r0 = this;
                r0.<init>()
                r0.f5289 = r1
                r0.f5290 = r3
                return
        }

        @Override // Yue.AbstractC1685
        /* JADX INFO: renamed from: ۥ۟۟ */
        public double mo1915(double r1, int r3) {
                r0 = this;
                double[] r1 = r0.f5290
                r2 = r1[r3]
                return r2
        }

        @Override // Yue.AbstractC1685
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo1916(double r2, double[] r4) {
                r1 = this;
                double[] r2 = r1.f5290
                r3 = 0
                int r0 = r2.length
                java.lang.System.arraycopy(r2, r3, r4, r3, r0)
                return
        }

        @Override // Yue.AbstractC1685
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo1917(double r3, float[] r5) {
                r2 = this;
                r3 = 0
            L1:
                double[] r4 = r2.f5290
                int r0 = r4.length
                if (r3 >= r0) goto Le
                r0 = r4[r3]
                float r4 = (float) r0
                r5[r3] = r4
                int r3 = r3 + 1
                goto L1
            Le:
                return
        }

        @Override // Yue.AbstractC1685
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public double mo1918(double r1, int r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // Yue.AbstractC1685
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo1919(double r3, double[] r5) {
                r2 = this;
                r3 = 0
            L1:
                double[] r4 = r2.f5290
                int r4 = r4.length
                if (r3 >= r4) goto Ld
                r0 = 0
                r5[r3] = r0
                int r3 = r3 + 1
                goto L1
            Ld:
                return
        }

        @Override // Yue.AbstractC1685
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public double[] mo1920() {
                r4 = this;
                double r0 = r4.f5289
                r2 = 1
                double[] r2 = new double[r2]
                r3 = 0
                r2[r3] = r0
                return r2
        }
    }

    public AbstractC1685() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.AbstractC1685 m8094(int r3, double[] r4, double[][] r5) {
            int r0 = r4.length
            r1 = 1
            r2 = 2
            if (r0 != r1) goto L6
            r3 = r2
        L6:
            if (r3 == 0) goto L1b
            if (r3 == r2) goto L10
            Yue.ۥ۠ۧ۠ۤ r3 = new Yue.ۥ۠ۧ۠ۤ
            r3.<init>(r4, r5)
            return r3
        L10:
            Yue.ۥ۟ۨ۟۠$ۥ r3 = new Yue.ۥ۟ۨ۟۠$ۥ
            r0 = 0
            r1 = r4[r0]
            r4 = r5[r0]
            r3.<init>(r1, r4)
            return r3
        L1b:
            Yue.ۥۡۡۤۧ r3 = new Yue.ۥۡۡۤۧ
            r3.<init>(r4, r5)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.AbstractC1685 m8095(int[] r1, double[] r2, double[][] r3) {
            Yue.ۥ۟ۡۦ۠ r0 = new Yue.ۥ۟ۡۦ۠
            r0.<init>(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract double mo1915(double r1, int r3);

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public abstract void mo1916(double r1, double[] r3);

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public abstract void mo1917(double r1, float[] r3);

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public abstract double mo1918(double r1, int r3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public abstract void mo1919(double r1, double[] r3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public abstract double[] mo1920();
}
