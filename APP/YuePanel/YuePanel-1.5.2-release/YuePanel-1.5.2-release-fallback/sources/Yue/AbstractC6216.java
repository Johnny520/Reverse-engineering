package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6216 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.String f22212 = "SplineSet";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f22213 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f22214 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f22215 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static float f22216 = 6.2831855f;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.AbstractC1685 f22217;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f22218;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int[] f22219;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float[][] f22220;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f22221;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.String f22222;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float[] f22223;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f22224;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public long f22225;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float f22226;

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ, reason: contains not printable characters */
    public static class C6217 extends Yue.AbstractC6216 {
        public C6217() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo23216(android.view.View r7, float r8, long r9, Yue.C3486 r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m23213(r1, r2, r4, r5)
                r7.setAlpha(r8)
                boolean r7 = r6.f22224
                return r7
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟, reason: contains not printable characters */
    public static class C6218 extends Yue.AbstractC6216 {

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public java.lang.String f22227;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public android.util.SparseArray<androidx.constraintlayout.widget.C7454> f22228;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public android.util.SparseArray<float[]> f22229;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public float[] f22230;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public float[] f22231;

        public C6218(java.lang.String r2, android.util.SparseArray<androidx.constraintlayout.widget.C7454> r3) {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.f22229 = r0
                java.lang.String r0 = ","
                java.lang.String[] r2 = r2.split(r0)
                r0 = 1
                r2 = r2[r0]
                r1.f22227 = r2
                r1.f22228 = r3
                return
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo23215(int r1, float r2, float r3, int r4, float r5) {
                r0 = this;
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)"
                r1.<init>(r2)
                throw r1
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo23216(android.view.View r17, float r18, long r19, Yue.C3486 r21) {
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r19
                Yue.ۥ۟ۨ۟۠ r4 = r0.f22217
                r5 = r18
                double r5 = (double) r5
                float[] r7 = r0.f22230
                r4.mo1917(r5, r7)
                float[] r4 = r0.f22230
                int r5 = r4.length
                int r5 = r5 + (-2)
                r5 = r4[r5]
                int r6 = r4.length
                r7 = 1
                int r6 = r6 - r7
                r4 = r4[r6]
                long r8 = r0.f22225
                long r8 = r2 - r8
                float r6 = r0.f22226
                boolean r6 = java.lang.Float.isNaN(r6)
                r10 = 0
                r11 = 0
                if (r6 == 0) goto L3c
                java.lang.String r6 = r0.f22227
                r12 = r21
                float r6 = r12.m14319(r1, r6, r11)
                r0.f22226 = r6
                boolean r6 = java.lang.Float.isNaN(r6)
                if (r6 == 0) goto L3c
                r0.f22226 = r10
            L3c:
                float r6 = r0.f22226
                double r12 = (double) r6
                double r8 = (double) r8
                r14 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
                double r8 = r8 * r14
                double r14 = (double) r5
                double r8 = r8 * r14
                double r12 = r12 + r8
                r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r12 = r12 % r8
                float r6 = (float) r12
                r0.f22226 = r6
                r0.f22225 = r2
                float r2 = r0.m23212(r6)
                r0.f22224 = r11
                r3 = r11
            L58:
                float[] r6 = r0.f22231
                int r8 = r6.length
                if (r3 >= r8) goto L77
                boolean r8 = r0.f22224
                float[] r9 = r0.f22230
                r9 = r9[r3]
                double r12 = (double) r9
                r14 = 0
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 == 0) goto L6c
                r12 = r7
                goto L6d
            L6c:
                r12 = r11
            L6d:
                r8 = r8 | r12
                r0.f22224 = r8
                float r9 = r9 * r2
                float r9 = r9 + r4
                r6[r3] = r9
                int r3 = r3 + 1
                goto L58
            L77:
                android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟> r2 = r0.f22228
                java.lang.Object r2 = r2.valueAt(r11)
                androidx.constraintlayout.widget.ۥ۟ r2 = (androidx.constraintlayout.widget.C7454) r2
                float[] r3 = r0.f22231
                r2.m28523(r1, r3)
                int r1 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
                if (r1 == 0) goto L8a
                r0.f22224 = r7
            L8a:
                boolean r1 = r0.f22224
                return r1
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo23219(int r15) {
                r14 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟> r0 = r14.f22228
                int r0 = r0.size()
                android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟> r1 = r14.f22228
                r2 = 0
                java.lang.Object r1 = r1.valueAt(r2)
                androidx.constraintlayout.widget.ۥ۟ r1 = (androidx.constraintlayout.widget.C7454) r1
                int r1 = r1.m28519()
                double[] r3 = new double[r0]
                int r4 = r1 + 2
                float[] r5 = new float[r4]
                r14.f22230 = r5
                float[] r5 = new float[r1]
                r14.f22231 = r5
                r5 = 2
                int[] r5 = new int[r5]
                r6 = 1
                r5[r6] = r4
                r5[r2] = r0
                java.lang.Class r4 = java.lang.Double.TYPE
                java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r5)
                double[][] r4 = (double[][]) r4
                r5 = r2
            L30:
                if (r5 >= r0) goto L77
                android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟> r7 = r14.f22228
                int r7 = r7.keyAt(r5)
                android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟> r8 = r14.f22228
                java.lang.Object r8 = r8.valueAt(r5)
                androidx.constraintlayout.widget.ۥ۟ r8 = (androidx.constraintlayout.widget.C7454) r8
                android.util.SparseArray<float[]> r9 = r14.f22229
                java.lang.Object r9 = r9.valueAt(r5)
                float[] r9 = (float[]) r9
                double r10 = (double) r7
                r12 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r10 = r10 * r12
                r3[r5] = r10
                float[] r7 = r14.f22230
                r8.m28518(r7)
                r7 = r2
            L57:
                float[] r8 = r14.f22230
                int r10 = r8.length
                if (r7 >= r10) goto L66
                r10 = r4[r5]
                r8 = r8[r7]
                double r11 = (double) r8
                r10[r7] = r11
                int r7 = r7 + 1
                goto L57
            L66:
                r7 = r4[r5]
                r8 = r9[r2]
                double r10 = (double) r8
                r7[r1] = r10
                int r8 = r1 + 1
                r9 = r9[r6]
                double r9 = (double) r9
                r7[r8] = r9
                int r5 = r5 + 1
                goto L30
            L77:
                Yue.ۥ۟ۨ۟۠ r15 = Yue.AbstractC1685.m8094(r15, r3, r4)
                r14.f22217 = r15
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m23220(int r3, androidx.constraintlayout.widget.C7454 r4, float r5, int r6, float r7) {
                r2 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟> r0 = r2.f22228
                r0.append(r3, r4)
                android.util.SparseArray<float[]> r4 = r2.f22229
                r0 = 2
                float[] r0 = new float[r0]
                r1 = 0
                r0[r1] = r5
                r5 = 1
                r0[r5] = r7
                r4.append(r3, r0)
                int r3 = r2.f22218
                int r3 = java.lang.Math.max(r3, r6)
                r2.f22218 = r3
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟, reason: contains not printable characters */
    public static class C6219 extends Yue.AbstractC6216 {
        public C6219() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo23216(android.view.View r7, float r8, long r9, Yue.C3486 r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m23213(r1, r2, r4, r5)
                r7.setElevation(r8)
                boolean r7 = r6.f22224
                return r7
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C6220 extends Yue.AbstractC6216 {
        public C6220() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo23216(android.view.View r1, float r2, long r3, Yue.C3486 r5) {
                r0 = this;
                boolean r1 = r0.f22224
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public boolean m23221(android.view.View r7, Yue.C3486 r8, float r9, long r10, double r12, double r14) {
                r6 = this;
                r0 = r6
                r1 = r9
                r2 = r10
                r4 = r7
                r5 = r8
                float r8 = r0.m23213(r1, r2, r4, r5)
                double r9 = java.lang.Math.atan2(r14, r12)
                double r9 = java.lang.Math.toDegrees(r9)
                float r9 = (float) r9
                float r8 = r8 + r9
                r7.setRotation(r8)
                boolean r7 = r6.f22224
                return r7
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C6221 extends Yue.AbstractC6216 {

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public boolean f22232;

        public C6221() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f22232 = r0
                return
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo23216(android.view.View r10, float r11, long r12, Yue.C3486 r14) {
                r9 = this;
                java.lang.String r0 = "unable to setProgress"
                java.lang.String r1 = "SplineSet"
                boolean r2 = r10 instanceof Yue.C4273
                if (r2 == 0) goto L18
                r0 = r10
                Yue.ۥۡۡۥۣ r0 = (Yue.C4273) r0
                r1 = r9
                r2 = r11
                r3 = r12
                r5 = r10
                r6 = r14
                float r10 = r1.m23213(r2, r3, r5, r6)
                r0.setProgress(r10)
                goto L55
            L18:
                boolean r2 = r9.f22232
                if (r2 == 0) goto L1e
                r10 = 0
                return r10
            L1e:
                java.lang.Class r2 = r10.getClass()     // Catch: java.lang.NoSuchMethodException -> L2f
                java.lang.String r3 = "setProgress"
                java.lang.Class r4 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L2f
                java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L2f
                java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L2f
                goto L33
            L2f:
                r2 = 1
                r9.f22232 = r2
                r2 = 0
            L33:
                if (r2 == 0) goto L55
                r3 = r9
                r4 = r11
                r5 = r12
                r7 = r10
                r8 = r14
                float r11 = r3.m23213(r4, r5, r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c
                java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c
                java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c
                r2.invoke(r10, r11)     // Catch: java.lang.reflect.InvocationTargetException -> L4a java.lang.IllegalAccessException -> L4c
                goto L55
            L4a:
                r10 = move-exception
                goto L4e
            L4c:
                r10 = move-exception
                goto L52
            L4e:
                android.util.Log.e(r1, r0, r10)
                goto L55
            L52:
                android.util.Log.e(r1, r0, r10)
            L55:
                boolean r10 = r9.f22224
                return r10
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C6222 extends Yue.AbstractC6216 {
        public C6222() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo23216(android.view.View r7, float r8, long r9, Yue.C3486 r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m23213(r1, r2, r4, r5)
                r7.setRotation(r8)
                boolean r7 = r6.f22224
                return r7
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C6223 extends Yue.AbstractC6216 {
        public C6223() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo23216(android.view.View r7, float r8, long r9, Yue.C3486 r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m23213(r1, r2, r4, r5)
                r7.setRotationX(r8)
                boolean r7 = r6.f22224
                return r7
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C6224 extends Yue.AbstractC6216 {
        public C6224() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo23216(android.view.View r7, float r8, long r9, Yue.C3486 r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m23213(r1, r2, r4, r5)
                r7.setRotationY(r8)
                boolean r7 = r6.f22224
                return r7
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C6225 extends Yue.AbstractC6216 {
        public C6225() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo23216(android.view.View r7, float r8, long r9, Yue.C3486 r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m23213(r1, r2, r4, r5)
                r7.setScaleX(r8)
                boolean r7 = r6.f22224
                return r7
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C6226 extends Yue.AbstractC6216 {
        public C6226() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo23216(android.view.View r7, float r8, long r9, Yue.C3486 r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m23213(r1, r2, r4, r5)
                r7.setScaleY(r8)
                boolean r7 = r6.f22224
                return r7
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static class C6227 {
        public C6227() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m23222(int[] r7, float[][] r8, int r9, int r10) {
                int r0 = r7.length
                int r0 = r0 + 10
                int[] r0 = new int[r0]
                r1 = 0
                r0[r1] = r10
                r10 = 1
                r0[r10] = r9
                r9 = 2
            Lc:
                if (r9 <= 0) goto L30
                int r1 = r9 + (-1)
                r1 = r0[r1]
                int r2 = r9 + (-2)
                r3 = r0[r2]
                if (r1 >= r3) goto L2e
                int r4 = m23223(r7, r8, r1, r3)
                int r5 = r9 + (-1)
                int r6 = r4 + (-1)
                r0[r2] = r6
                r0[r5] = r1
                int r1 = r9 + 1
                r0[r9] = r3
                int r9 = r9 + 2
                int r4 = r4 + r10
                r0[r1] = r4
                goto Lc
            L2e:
                r9 = r2
                goto Lc
            L30:
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static int m23223(int[] r3, float[][] r4, int r5, int r6) {
                r0 = r3[r6]
                r1 = r5
            L3:
                if (r5 >= r6) goto L11
                r2 = r3[r5]
                if (r2 > r0) goto Le
                m23224(r3, r4, r1, r5)
                int r1 = r1 + 1
            Le:
                int r5 = r5 + 1
                goto L3
            L11:
                m23224(r3, r4, r1, r6)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m23224(int[] r2, float[][] r3, int r4, int r5) {
                r0 = r2[r4]
                r1 = r2[r5]
                r2[r4] = r1
                r2[r5] = r0
                r2 = r3[r4]
                r0 = r3[r5]
                r3[r4] = r0
                r3[r5] = r2
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C6228 extends Yue.AbstractC6216 {
        public C6228() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo23216(android.view.View r7, float r8, long r9, Yue.C3486 r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m23213(r1, r2, r4, r5)
                r7.setTranslationX(r8)
                boolean r7 = r6.f22224
                return r7
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static class C6229 extends Yue.AbstractC6216 {
        public C6229() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo23216(android.view.View r7, float r8, long r9, Yue.C3486 r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m23213(r1, r2, r4, r5)
                r7.setTranslationY(r8)
                boolean r7 = r6.f22224
                return r7
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۥ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static class C6230 extends Yue.AbstractC6216 {
        public C6230() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC6216
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public boolean mo23216(android.view.View r7, float r8, long r9, Yue.C3486 r11) {
                r6 = this;
                r0 = r6
                r1 = r8
                r2 = r9
                r4 = r7
                r5 = r11
                float r8 = r0.m23213(r1, r2, r4, r5)
                r7.setTranslationZ(r8)
                boolean r7 = r6.f22224
                return r7
        }
    }

    static {
            return
    }

    public AbstractC6216() {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f22218 = r0
            r1 = 10
            int[] r2 = new int[r1]
            r5.f22219 = r2
            r2 = 2
            int[] r2 = new int[r2]
            r3 = 1
            r4 = 3
            r2[r3] = r4
            r2[r0] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            float[][] r1 = (float[][]) r1
            r5.f22220 = r1
            float[] r1 = new float[r4]
            r5.f22223 = r1
            r5.f22224 = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r5.f22226 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.AbstractC6216 m23210(java.lang.String r1, android.util.SparseArray<androidx.constraintlayout.widget.C7454> r2) {
            Yue.ۥۣۢۡۥ$ۥ۟ r0 = new Yue.ۥۣۢۡۥ$ۥ۟
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.AbstractC6216 m23211(java.lang.String r2, long r3) {
            r2.hashCode()
            r0 = -1
            int r1 = r2.hashCode()
            switch(r1) {
                case -1249320806: goto L92;
                case -1249320805: goto L87;
                case -1225497657: goto L7c;
                case -1225497656: goto L71;
                case -1225497655: goto L66;
                case -1001078227: goto L5b;
                case -908189618: goto L50;
                case -908189617: goto L45;
                case -40300674: goto L37;
                case -4379043: goto L29;
                case 37232917: goto L1b;
                case 92909918: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L9c
        Ld:
            java.lang.String r1 = "alpha"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L17
            goto L9c
        L17:
            r0 = 11
            goto L9c
        L1b:
            java.lang.String r1 = "transitionPathRotate"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L25
            goto L9c
        L25:
            r0 = 10
            goto L9c
        L29:
            java.lang.String r1 = "elevation"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L33
            goto L9c
        L33:
            r0 = 9
            goto L9c
        L37:
            java.lang.String r1 = "rotation"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L41
            goto L9c
        L41:
            r0 = 8
            goto L9c
        L45:
            java.lang.String r1 = "scaleY"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L4e
            goto L9c
        L4e:
            r0 = 7
            goto L9c
        L50:
            java.lang.String r1 = "scaleX"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L59
            goto L9c
        L59:
            r0 = 6
            goto L9c
        L5b:
            java.lang.String r1 = "progress"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L64
            goto L9c
        L64:
            r0 = 5
            goto L9c
        L66:
            java.lang.String r1 = "translationZ"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L6f
            goto L9c
        L6f:
            r0 = 4
            goto L9c
        L71:
            java.lang.String r1 = "translationY"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L7a
            goto L9c
        L7a:
            r0 = 3
            goto L9c
        L7c:
            java.lang.String r1 = "translationX"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L85
            goto L9c
        L85:
            r0 = 2
            goto L9c
        L87:
            java.lang.String r1 = "rotationY"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L90
            goto L9c
        L90:
            r0 = 1
            goto L9c
        L92:
            java.lang.String r1 = "rotationX"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L9b
            goto L9c
        L9b:
            r0 = 0
        L9c:
            switch(r0) {
                case 0: goto Le3;
                case 1: goto Ldd;
                case 2: goto Ld7;
                case 3: goto Ld1;
                case 4: goto Lcb;
                case 5: goto Lc5;
                case 6: goto Lbf;
                case 7: goto Lb9;
                case 8: goto Lb3;
                case 9: goto Lad;
                case 10: goto La7;
                case 11: goto La1;
                default: goto L9f;
            }
        L9f:
            r2 = 0
            return r2
        La1:
            Yue.ۥۣۢۡۥ$ۥ r2 = new Yue.ۥۣۢۡۥ$ۥ
            r2.<init>()
            goto Le8
        La7:
            Yue.ۥۣۢۡۥ$ۥ۟۟۟ r2 = new Yue.ۥۣۢۡۥ$ۥ۟۟۟
            r2.<init>()
            goto Le8
        Lad:
            Yue.ۥۣۢۡۥ$ۥ۟۟ r2 = new Yue.ۥۣۢۡۥ$ۥ۟۟
            r2.<init>()
            goto Le8
        Lb3:
            Yue.ۥۣۢۡۥ$ۥ۟۟۟۠ r2 = new Yue.ۥۣۢۡۥ$ۥ۟۟۟۠
            r2.<init>()
            goto Le8
        Lb9:
            Yue.ۥۣۢۡۥ$ۥ۟۟۟ۤ r2 = new Yue.ۥۣۢۡۥ$ۥ۟۟۟ۤ
            r2.<init>()
            goto Le8
        Lbf:
            Yue.ۥۣۢۡۥ$ۥۣ۟۟۟ r2 = new Yue.ۥۣۢۡۥ$ۥۣ۟۟۟
            r2.<init>()
            goto Le8
        Lc5:
            Yue.ۥۣۢۡۥ$ۥ۟۟۟۟ r2 = new Yue.ۥۣۢۡۥ$ۥ۟۟۟۟
            r2.<init>()
            goto Le8
        Lcb:
            Yue.ۥۣۢۡۥ$ۥ۟۟۟ۨ r2 = new Yue.ۥۣۢۡۥ$ۥ۟۟۟ۨ
            r2.<init>()
            goto Le8
        Ld1:
            Yue.ۥۣۢۡۥ$ۥ۟۟۟ۧ r2 = new Yue.ۥۣۢۡۥ$ۥ۟۟۟ۧ
            r2.<init>()
            goto Le8
        Ld7:
            Yue.ۥۣۢۡۥ$ۥ۟۟۟ۦ r2 = new Yue.ۥۣۢۡۥ$ۥ۟۟۟ۦ
            r2.<init>()
            goto Le8
        Ldd:
            Yue.ۥۣۢۡۥ$ۥ۟۟۟ۢ r2 = new Yue.ۥۣۢۡۥ$ۥ۟۟۟ۢ
            r2.<init>()
            goto Le8
        Le3:
            Yue.ۥۣۢۡۥ$ۥ۟۟۟ۡ r2 = new Yue.ۥۣۢۡۥ$ۥ۟۟۟ۡ
            r2.<init>()
        Le8:
            r2.m23217(r3)
            return r2
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.f22222
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            r2 = 0
        La:
            int r3 = r4.f22221
            if (r2 >= r3) goto L3e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "["
            r3.append(r0)
            int[] r0 = r4.f22219
            r0 = r0[r2]
            r3.append(r0)
            java.lang.String r0 = " , "
            r3.append(r0)
            float[][] r0 = r4.f22220
            r0 = r0[r2]
            java.lang.String r0 = r1.format(r0)
            r3.append(r0)
            java.lang.String r0 = "] "
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            int r2 = r2 + 1
            goto La
        L3e:
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float m23212(float r4) {
            r3 = this;
            int r0 = r3.f22218
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            switch(r0) {
                case 1: goto L39;
                case 2: goto L34;
                case 3: goto L2f;
                case 4: goto L2b;
                case 5: goto L21;
                case 6: goto L13;
                default: goto L9;
            }
        L9:
            float r0 = Yue.AbstractC6216.f22216
            float r4 = r4 * r0
            double r0 = (double) r4
            double r0 = java.lang.Math.sin(r0)
            float r4 = (float) r0
            return r4
        L13:
            r0 = 1082130432(0x40800000, float:4.0)
            float r4 = r4 * r0
            float r4 = r4 % r0
            float r4 = r4 - r1
            float r4 = java.lang.Math.abs(r4)
            float r4 = r2 - r4
            float r4 = r4 * r4
        L1f:
            float r2 = r2 - r4
            return r2
        L21:
            float r0 = Yue.AbstractC6216.f22216
            float r4 = r4 * r0
            double r0 = (double) r4
            double r0 = java.lang.Math.cos(r0)
            float r4 = (float) r0
            return r4
        L2b:
            float r4 = r4 * r1
            float r4 = r4 + r2
            float r4 = r4 % r1
            goto L1f
        L2f:
            float r4 = r4 * r1
            float r4 = r4 + r2
            float r4 = r4 % r1
            float r4 = r4 - r2
            return r4
        L34:
            float r4 = java.lang.Math.abs(r4)
            goto L1f
        L39:
            float r0 = Yue.AbstractC6216.f22216
            float r4 = r4 * r0
            float r4 = java.lang.Math.signum(r4)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public float m23213(float r19, long r20, android.view.View r22, Yue.C3486 r23) {
            r18 = this;
            r0 = r18
            r1 = r20
            r3 = r22
            r4 = r23
            Yue.ۥ۟ۨ۟۠ r5 = r0.f22217
            r6 = r19
            double r6 = (double) r6
            float[] r8 = r0.f22223
            r5.mo1917(r6, r8)
            float[] r5 = r0.f22223
            r6 = 1
            r7 = r5[r6]
            r8 = 0
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            r10 = 2
            r11 = 0
            if (r9 != 0) goto L23
            r0.f22224 = r11
            r1 = r5[r10]
            return r1
        L23:
            float r5 = r0.f22226
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L3b
            java.lang.String r5 = r0.f22222
            float r5 = r4.m14319(r3, r5, r11)
            r0.f22226 = r5
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 == 0) goto L3b
            r0.f22226 = r8
        L3b:
            long r12 = r0.f22225
            long r12 = r1 - r12
            float r5 = r0.f22226
            double r14 = (double) r5
            double r12 = (double) r12
            r16 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            double r12 = r12 * r16
            double r6 = (double) r7
            double r12 = r12 * r6
            double r14 = r14 + r12
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r14 % r5
            float r5 = (float) r14
            r0.f22226 = r5
            java.lang.String r6 = r0.f22222
            r4.m14320(r3, r6, r11, r5)
            r0.f22225 = r1
            float[] r1 = r0.f22223
            r1 = r1[r11]
            float r2 = r0.f22226
            float r2 = r0.m23212(r2)
            float[] r3 = r0.f22223
            r3 = r3[r10]
            float r2 = r2 * r1
            float r2 = r2 + r3
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L73
            if (r9 == 0) goto L71
            goto L73
        L71:
            r6 = r11
            goto L74
        L73:
            r6 = 1
        L74:
            r0.f22224 = r6
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.AbstractC1685 m23214() {
            r1 = this;
            Yue.ۥ۟ۨ۟۠ r0 = r1.f22217
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo23215(int r3, float r4, float r5, int r6, float r7) {
            r2 = this;
            int[] r0 = r2.f22219
            int r1 = r2.f22221
            r0[r1] = r3
            float[][] r3 = r2.f22220
            r3 = r3[r1]
            r0 = 0
            r3[r0] = r4
            r4 = 1
            r3[r4] = r5
            r5 = 2
            r3[r5] = r7
            int r3 = r2.f22218
            int r3 = java.lang.Math.max(r3, r6)
            r2.f22218 = r3
            int r3 = r2.f22221
            int r3 = r3 + r4
            r2.f22221 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract boolean mo23216(android.view.View r1, float r2, long r3, Yue.C3486 r5);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m23217(long r1) {
            r0 = this;
            r0.f22225 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m23218(java.lang.String r1) {
            r0 = this;
            r0.f22222 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo23219(int r12) {
            r11 = this;
            int r0 = r11.f22221
            if (r0 != 0) goto L1d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Error no points added to "
            r12.append(r0)
            java.lang.String r0 = r11.f22222
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "SplineSet"
            android.util.Log.e(r0, r12)
            return
        L1d:
            int[] r1 = r11.f22219
            float[][] r2 = r11.f22220
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            Yue.AbstractC6216.C6227.m23222(r1, r2, r4, r0)
            r0 = r3
            r1 = r4
        L29:
            int[] r2 = r11.f22219
            int r5 = r2.length
            if (r0 >= r5) goto L3b
            r5 = r2[r0]
            int r6 = r0 + (-1)
            r2 = r2[r6]
            if (r5 == r2) goto L38
            int r1 = r1 + 1
        L38:
            int r0 = r0 + 1
            goto L29
        L3b:
            if (r1 != 0) goto L3e
            r1 = r3
        L3e:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r5 = new int[r2]
            r6 = 3
            r5[r3] = r6
            r5[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r5)
            double[][] r1 = (double[][]) r1
            r5 = r4
            r6 = r5
        L52:
            int r7 = r11.f22221
            if (r5 >= r7) goto L8a
            if (r5 <= 0) goto L63
            int[] r7 = r11.f22219
            r8 = r7[r5]
            int r9 = r5 + (-1)
            r7 = r7[r9]
            if (r8 != r7) goto L63
            goto L87
        L63:
            int[] r7 = r11.f22219
            r7 = r7[r5]
            double r7 = (double) r7
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r7 = r7 * r9
            r0[r6] = r7
            r7 = r1[r6]
            float[][] r8 = r11.f22220
            r8 = r8[r5]
            r9 = r8[r4]
            double r9 = (double) r9
            r7[r4] = r9
            r9 = r8[r3]
            double r9 = (double) r9
            r7[r3] = r9
            r8 = r8[r2]
            double r8 = (double) r8
            r7[r2] = r8
            int r6 = r6 + 1
        L87:
            int r5 = r5 + 1
            goto L52
        L8a:
            Yue.ۥ۟ۨ۟۠ r12 = Yue.AbstractC1685.m8094(r12, r0, r1)
            r11.f22217 = r12
            return
    }
}
