package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5889 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f21531 = "SplineSet";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.AbstractC1685 f21532;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int[] f21533;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float[] f21534;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f21535;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.String f21536;

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ, reason: contains not printable characters */
    public static class C5890 extends Yue.AbstractC5889 {
        public C5890() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m21912(r2)
                r1.setAlpha(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟, reason: contains not printable characters */
    public static class C5891 extends Yue.AbstractC5889 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public java.lang.String f21537;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public android.util.SparseArray<androidx.constraintlayout.widget.C7454> f21538;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public float[] f21539;

        public C5891(java.lang.String r2, android.util.SparseArray<androidx.constraintlayout.widget.C7454> r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ","
                java.lang.String[] r2 = r2.split(r0)
                r0 = 1
                r2 = r2[r0]
                r1.f21537 = r2
                r1.f21538 = r3
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo21915(int r1, float r2) {
                r0 = this;
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "don't call for custom attribute call setPoint(pos, ConstraintAttribute)"
                r1.<init>(r2)
                throw r1
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r4, float r5) {
                r3 = this;
                Yue.ۥ۟ۨ۟۠ r0 = r3.f21532
                double r1 = (double) r5
                float[] r5 = r3.f21539
                r0.mo1917(r1, r5)
                android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟> r5 = r3.f21538
                r0 = 0
                java.lang.Object r5 = r5.valueAt(r0)
                androidx.constraintlayout.widget.ۥ۟ r5 = (androidx.constraintlayout.widget.C7454) r5
                float[] r0 = r3.f21539
                r5.m28523(r4, r0)
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo21918(int r12) {
                r11 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟> r0 = r11.f21538
                int r0 = r0.size()
                android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟> r1 = r11.f21538
                r2 = 0
                java.lang.Object r1 = r1.valueAt(r2)
                androidx.constraintlayout.widget.ۥ۟ r1 = (androidx.constraintlayout.widget.C7454) r1
                int r1 = r1.m28519()
                double[] r3 = new double[r0]
                float[] r4 = new float[r1]
                r11.f21539 = r4
                r4 = 2
                int[] r4 = new int[r4]
                r5 = 1
                r4[r5] = r1
                r4[r2] = r0
                java.lang.Class r1 = java.lang.Double.TYPE
                java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r4)
                double[][] r1 = (double[][]) r1
                r4 = r2
            L2a:
                if (r4 >= r0) goto L5b
                android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟> r5 = r11.f21538
                int r5 = r5.keyAt(r4)
                android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟> r6 = r11.f21538
                java.lang.Object r6 = r6.valueAt(r4)
                androidx.constraintlayout.widget.ۥ۟ r6 = (androidx.constraintlayout.widget.C7454) r6
                double r7 = (double) r5
                r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
                double r7 = r7 * r9
                r3[r4] = r7
                float[] r5 = r11.f21539
                r6.m28518(r5)
                r5 = r2
            L49:
                float[] r6 = r11.f21539
                int r7 = r6.length
                if (r5 >= r7) goto L58
                r7 = r1[r4]
                r6 = r6[r5]
                double r8 = (double) r6
                r7[r5] = r8
                int r5 = r5 + 1
                goto L49
            L58:
                int r4 = r4 + 1
                goto L2a
            L5b:
                Yue.ۥ۟ۨ۟۠ r12 = Yue.AbstractC1685.m8094(r12, r3, r1)
                r11.f21532 = r12
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m21919(int r2, androidx.constraintlayout.widget.C7454 r3) {
                r1 = this;
                android.util.SparseArray<androidx.constraintlayout.widget.ۥ۟> r0 = r1.f21538
                r0.append(r2, r3)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟, reason: contains not printable characters */
    public static class C5892 extends Yue.AbstractC5889 {
        public C5892() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m21912(r2)
                r1.setElevation(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static class C5893 extends Yue.AbstractC5889 {
        public C5893() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r1, float r2) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m21920(android.view.View r1, float r2, double r3, double r5) {
                r0 = this;
                float r2 = r0.m21912(r2)
                double r3 = java.lang.Math.atan2(r5, r3)
                double r3 = java.lang.Math.toDegrees(r3)
                float r3 = (float) r3
                float r2 = r2 + r3
                r1.setRotation(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C5894 extends Yue.AbstractC5889 {
        public C5894() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m21912(r2)
                r1.setPivotX(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C5895 extends Yue.AbstractC5889 {
        public C5895() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m21912(r2)
                r1.setPivotY(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C5896 extends Yue.AbstractC5889 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f21540;

        public C5896() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f21540 = r0
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r6, float r7) {
                r5 = this;
                java.lang.String r0 = "unable to setProgress"
                java.lang.String r1 = "SplineSet"
                boolean r2 = r6 instanceof Yue.C4273
                if (r2 == 0) goto L12
                Yue.ۥۡۡۥۣ r6 = (Yue.C4273) r6
                float r7 = r5.m21912(r7)
                r6.setProgress(r7)
                goto L49
            L12:
                boolean r2 = r5.f21540
                if (r2 == 0) goto L17
                return
            L17:
                java.lang.Class r2 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L28
                java.lang.String r3 = "setProgress"
                java.lang.Class r4 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L28
                java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L28
                java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L28
                goto L2c
            L28:
                r2 = 1
                r5.f21540 = r2
                r2 = 0
            L2c:
                if (r2 == 0) goto L49
                float r7 = r5.m21912(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L40
                java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L40
                java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L40
                r2.invoke(r6, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L3e java.lang.IllegalAccessException -> L40
                goto L49
            L3e:
                r6 = move-exception
                goto L42
            L40:
                r6 = move-exception
                goto L46
            L42:
                android.util.Log.e(r1, r0, r6)
                goto L49
            L46:
                android.util.Log.e(r1, r0, r6)
            L49:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C5897 extends Yue.AbstractC5889 {
        public C5897() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m21912(r2)
                r1.setRotation(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C5898 extends Yue.AbstractC5889 {
        public C5898() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m21912(r2)
                r1.setRotationX(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static class C5899 extends Yue.AbstractC5889 {
        public C5899() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m21912(r2)
                r1.setRotationY(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static class C5900 extends Yue.AbstractC5889 {
        public C5900() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m21912(r2)
                r1.setScaleX(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static class C5901 extends Yue.AbstractC5889 {
        public C5901() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m21912(r2)
                r1.setScaleY(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static class C5902 {
        public C5902() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m21921(int[] r7, float[] r8, int r9, int r10) {
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
                int r4 = m21922(r7, r8, r1, r3)
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
        public static int m21922(int[] r3, float[] r4, int r5, int r6) {
                r0 = r3[r6]
                r1 = r5
            L3:
                if (r5 >= r6) goto L11
                r2 = r3[r5]
                if (r2 > r0) goto Le
                m21923(r3, r4, r1, r5)
                int r1 = r1 + 1
            Le:
                int r5 = r5 + 1
                goto L3
            L11:
                m21923(r3, r4, r1, r6)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m21923(int[] r2, float[] r3, int r4, int r5) {
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

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static class C5903 extends Yue.AbstractC5889 {
        public C5903() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m21912(r2)
                r1.setTranslationX(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۠, reason: contains not printable characters */
    public static class C5904 extends Yue.AbstractC5889 {
        public C5904() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m21912(r2)
                r1.setTranslationY(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۟$ۥ۟۟۠۟, reason: contains not printable characters */
    public static class C5905 extends Yue.AbstractC5889 {
        public C5905() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC5889
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public void mo21916(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.m21912(r2)
                r1.setTranslationZ(r2)
                return
        }
    }

    public AbstractC5889() {
            r2 = this;
            r2.<init>()
            r0 = 10
            int[] r1 = new int[r0]
            r2.f21533 = r1
            float[] r0 = new float[r0]
            r2.f21534 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.AbstractC5889 m21910(java.lang.String r1, android.util.SparseArray<androidx.constraintlayout.widget.C7454> r2) {
            Yue.ۥۢ۟ۧ۟$ۥ۟ r0 = new Yue.ۥۢ۟ۧ۟$ۥ۟
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.AbstractC5889 m21911(java.lang.String r2) {
            r2.hashCode()
            r0 = -1
            int r1 = r2.hashCode()
            switch(r1) {
                case -1249320806: goto Lca;
                case -1249320805: goto Lbf;
                case -1225497657: goto Lb4;
                case -1225497656: goto La9;
                case -1225497655: goto L9e;
                case -1001078227: goto L93;
                case -908189618: goto L88;
                case -908189617: goto L7d;
                case -797520672: goto L6f;
                case -760884510: goto L61;
                case -760884509: goto L53;
                case -40300674: goto L45;
                case -4379043: goto L37;
                case 37232917: goto L29;
                case 92909918: goto L1b;
                case 156108012: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto Ld4
        Ld:
            java.lang.String r1 = "waveOffset"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L17
            goto Ld4
        L17:
            r0 = 15
            goto Ld4
        L1b:
            java.lang.String r1 = "alpha"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L25
            goto Ld4
        L25:
            r0 = 14
            goto Ld4
        L29:
            java.lang.String r1 = "transitionPathRotate"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L33
            goto Ld4
        L33:
            r0 = 13
            goto Ld4
        L37:
            java.lang.String r1 = "elevation"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L41
            goto Ld4
        L41:
            r0 = 12
            goto Ld4
        L45:
            java.lang.String r1 = "rotation"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L4f
            goto Ld4
        L4f:
            r0 = 11
            goto Ld4
        L53:
            java.lang.String r1 = "transformPivotY"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L5d
            goto Ld4
        L5d:
            r0 = 10
            goto Ld4
        L61:
            java.lang.String r1 = "transformPivotX"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L6b
            goto Ld4
        L6b:
            r0 = 9
            goto Ld4
        L6f:
            java.lang.String r1 = "waveVariesBy"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L79
            goto Ld4
        L79:
            r0 = 8
            goto Ld4
        L7d:
            java.lang.String r1 = "scaleY"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L86
            goto Ld4
        L86:
            r0 = 7
            goto Ld4
        L88:
            java.lang.String r1 = "scaleX"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L91
            goto Ld4
        L91:
            r0 = 6
            goto Ld4
        L93:
            java.lang.String r1 = "progress"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L9c
            goto Ld4
        L9c:
            r0 = 5
            goto Ld4
        L9e:
            java.lang.String r1 = "translationZ"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto La7
            goto Ld4
        La7:
            r0 = 4
            goto Ld4
        La9:
            java.lang.String r1 = "translationY"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Lb2
            goto Ld4
        Lb2:
            r0 = 3
            goto Ld4
        Lb4:
            java.lang.String r1 = "translationX"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Lbd
            goto Ld4
        Lbd:
            r0 = 2
            goto Ld4
        Lbf:
            java.lang.String r1 = "rotationY"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Lc8
            goto Ld4
        Lc8:
            r0 = 1
            goto Ld4
        Lca:
            java.lang.String r1 = "rotationX"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Ld3
            goto Ld4
        Ld3:
            r0 = 0
        Ld4:
            switch(r0) {
                case 0: goto L133;
                case 1: goto L12d;
                case 2: goto L127;
                case 3: goto L121;
                case 4: goto L11b;
                case 5: goto L115;
                case 6: goto L10f;
                case 7: goto L109;
                case 8: goto L103;
                case 9: goto Lfd;
                case 10: goto Lf7;
                case 11: goto Lf1;
                case 12: goto Leb;
                case 13: goto Le5;
                case 14: goto Ldf;
                case 15: goto Ld9;
                default: goto Ld7;
            }
        Ld7:
            r2 = 0
            return r2
        Ld9:
            Yue.ۥۢ۟ۧ۟$ۥ r2 = new Yue.ۥۢ۟ۧ۟$ۥ
            r2.<init>()
            return r2
        Ldf:
            Yue.ۥۢ۟ۧ۟$ۥ r2 = new Yue.ۥۢ۟ۧ۟$ۥ
            r2.<init>()
            return r2
        Le5:
            Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ r2 = new Yue.ۥۢ۟ۧ۟$ۥ۟۟۟
            r2.<init>()
            return r2
        Leb:
            Yue.ۥۢ۟ۧ۟$ۥ۟۟ r2 = new Yue.ۥۢ۟ۧ۟$ۥ۟۟
            r2.<init>()
            return r2
        Lf1:
            Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۢ r2 = new Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۢ
            r2.<init>()
            return r2
        Lf7:
            Yue.ۥۢ۟ۧ۟$ۥ۟۟۟۠ r2 = new Yue.ۥۢ۟ۧ۟$ۥ۟۟۟۠
            r2.<init>()
            return r2
        Lfd:
            Yue.ۥۢ۟ۧ۟$ۥ۟۟۟۟ r2 = new Yue.ۥۢ۟ۧ۟$ۥ۟۟۟۟
            r2.<init>()
            return r2
        L103:
            Yue.ۥۢ۟ۧ۟$ۥ r2 = new Yue.ۥۢ۟ۧ۟$ۥ
            r2.<init>()
            return r2
        L109:
            Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۦ r2 = new Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۦ
            r2.<init>()
            return r2
        L10f:
            Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۥ r2 = new Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۥ
            r2.<init>()
            return r2
        L115:
            Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۡ r2 = new Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۡ
            r2.<init>()
            return r2
        L11b:
            Yue.ۥۢ۟ۧ۟$ۥ۟۟۠۟ r2 = new Yue.ۥۢ۟ۧ۟$ۥ۟۟۠۟
            r2.<init>()
            return r2
        L121:
            Yue.ۥۢ۟ۧ۟$ۥ۟۟۠ r2 = new Yue.ۥۢ۟ۧ۟$ۥ۟۟۠
            r2.<init>()
            return r2
        L127:
            Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۨ r2 = new Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۨ
            r2.<init>()
            return r2
        L12d:
            Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۤ r2 = new Yue.ۥۢ۟ۧ۟$ۥ۟۟۟ۤ
            r2.<init>()
            return r2
        L133:
            Yue.ۥۢ۟ۧ۟$ۥۣ۟۟۟ r2 = new Yue.ۥۢ۟ۧ۟$ۥۣ۟۟۟
            r2.<init>()
            return r2
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = r6.f21536
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            r2 = 0
        La:
            int r3 = r6.f21535
            if (r2 >= r3) goto L3f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "["
            r3.append(r0)
            int[] r0 = r6.f21533
            r0 = r0[r2]
            r3.append(r0)
            java.lang.String r0 = " , "
            r3.append(r0)
            float[] r0 = r6.f21534
            r0 = r0[r2]
            double r4 = (double) r0
            java.lang.String r0 = r1.format(r4)
            r3.append(r0)
            java.lang.String r0 = "] "
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            int r2 = r2 + 1
            goto La
        L3f:
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float m21912(float r4) {
            r3 = this;
            Yue.ۥ۟ۨ۟۠ r0 = r3.f21532
            double r1 = (double) r4
            r4 = 0
            double r0 = r0.mo1915(r1, r4)
            float r4 = (float) r0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.AbstractC1685 m21913() {
            r1 = this;
            Yue.ۥ۟ۨ۟۠ r0 = r1.f21532
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float m21914(float r4) {
            r3 = this;
            Yue.ۥ۟ۨ۟۠ r0 = r3.f21532
            double r1 = (double) r4
            r4 = 0
            double r0 = r0.mo1918(r1, r4)
            float r4 = (float) r0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo21915(int r4, float r5) {
            r3 = this;
            int[] r0 = r3.f21533
            int r1 = r0.length
            int r2 = r3.f21535
            int r2 = r2 + 1
            if (r1 >= r2) goto L1d
            int r1 = r0.length
            int r1 = r1 * 2
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.f21533 = r0
            float[] r0 = r3.f21534
            int r1 = r0.length
            int r1 = r1 * 2
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.f21534 = r0
        L1d:
            int[] r0 = r3.f21533
            int r1 = r3.f21535
            r0[r1] = r4
            float[] r4 = r3.f21534
            r4[r1] = r5
            int r1 = r1 + 1
            r3.f21535 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public abstract void mo21916(android.view.View r1, float r2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m21917(java.lang.String r1) {
            r0 = this;
            r0.f21536 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void mo21918(int r10) {
            r9 = this;
            int r0 = r9.f21535
            if (r0 != 0) goto L5
            return
        L5:
            int[] r1 = r9.f21533
            float[] r2 = r9.f21534
            r3 = 1
            int r0 = r0 - r3
            r4 = 0
            Yue.AbstractC5889.C5902.m21921(r1, r2, r4, r0)
            r0 = r3
            r1 = r0
        L11:
            int r2 = r9.f21535
            if (r0 >= r2) goto L24
            int[] r2 = r9.f21533
            int r5 = r0 + (-1)
            r5 = r2[r5]
            r2 = r2[r0]
            if (r5 == r2) goto L21
            int r1 = r1 + 1
        L21:
            int r0 = r0 + 1
            goto L11
        L24:
            double[] r0 = new double[r1]
            r2 = 2
            int[] r2 = new int[r2]
            r2[r3] = r3
            r2[r4] = r1
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            double[][] r1 = (double[][]) r1
            r2 = r4
            r3 = r2
        L37:
            int r5 = r9.f21535
            if (r2 >= r5) goto L63
            if (r2 <= 0) goto L48
            int[] r5 = r9.f21533
            r6 = r5[r2]
            int r7 = r2 + (-1)
            r5 = r5[r7]
            if (r6 != r5) goto L48
            goto L60
        L48:
            int[] r5 = r9.f21533
            r5 = r5[r2]
            double r5 = (double) r5
            r7 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r5 = r5 * r7
            r0[r3] = r5
            r5 = r1[r3]
            float[] r6 = r9.f21534
            r6 = r6[r2]
            double r6 = (double) r6
            r5[r4] = r6
            int r3 = r3 + 1
        L60:
            int r2 = r2 + 1
            goto L37
        L63:
            Yue.ۥ۟ۨ۟۠ r10 = Yue.AbstractC1685.m8094(r10, r0, r1)
            r9.f21532 = r10
            return
    }
}
