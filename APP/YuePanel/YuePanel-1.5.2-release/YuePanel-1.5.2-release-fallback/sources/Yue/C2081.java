package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2081 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C2081 f6600 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f6601 = "cubic(0.4, 0.0, 0.2, 1)";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f6602 = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f6603 = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f6604 = "cubic(1, 1, 0, 0)";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f6605 = "decelerate";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.String f6606 = "accelerate";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f6607 = "standard";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String f6608 = "linear";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static java.lang.String[] f6609;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.String f6610;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۠ۨ$ۥ, reason: contains not printable characters */
    public static class C2082 extends Yue.C2081 {

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static double f6611 = 0.01d;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static double f6612 = 1.0E-4d;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public double f6613;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public double f6614;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public double f6615;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public double f6616;

        static {
                return
        }

        public C2082(double r1, double r3, double r5, double r7) {
                r0 = this;
                r0.<init>()
                r0.m9730(r1, r3, r5, r7)
                return
        }

        public C2082(java.lang.String r6) {
                r5 = this;
                r5.<init>()
                r5.f6610 = r6
                r0 = 40
                int r0 = r6.indexOf(r0)
                r1 = 44
                int r2 = r6.indexOf(r1, r0)
                int r0 = r0 + 1
                java.lang.String r0 = r6.substring(r0, r2)
                java.lang.String r0 = r0.trim()
                double r3 = java.lang.Double.parseDouble(r0)
                r5.f6613 = r3
                int r2 = r2 + 1
                int r0 = r6.indexOf(r1, r2)
                java.lang.String r2 = r6.substring(r2, r0)
                java.lang.String r2 = r2.trim()
                double r2 = java.lang.Double.parseDouble(r2)
                r5.f6614 = r2
                int r0 = r0 + 1
                int r1 = r6.indexOf(r1, r0)
                java.lang.String r0 = r6.substring(r0, r1)
                java.lang.String r0 = r0.trim()
                double r2 = java.lang.Double.parseDouble(r0)
                r5.f6615 = r2
                int r1 = r1 + 1
                r0 = 41
                int r0 = r6.indexOf(r0, r1)
                java.lang.String r6 = r6.substring(r1, r0)
                java.lang.String r6 = r6.trim()
                double r0 = java.lang.Double.parseDouble(r6)
                r5.f6616 = r0
                return
        }

        @Override // Yue.C2081
        /* JADX INFO: renamed from: ۥ */
        public double mo9724(double r9) {
                r8 = this;
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 > 0) goto L7
                return r0
            L7:
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto Le
                return r0
            Le:
                r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                r2 = r0
                r4 = r2
            L12:
                double r6 = Yue.C2081.C2082.f6611
                int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r6 <= 0) goto L25
                double r6 = r8.m9728(r4)
                double r2 = r2 * r0
                int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r6 >= 0) goto L23
                double r4 = r4 + r2
                goto L12
            L23:
                double r4 = r4 - r2
                goto L12
            L25:
                double r0 = r4 - r2
                double r6 = r8.m9728(r0)
                double r4 = r4 + r2
                double r2 = r8.m9728(r4)
                double r0 = r8.m9729(r0)
                double r4 = r8.m9729(r4)
                double r4 = r4 - r0
                double r9 = r9 - r6
                double r4 = r4 * r9
                double r2 = r2 - r6
                double r4 = r4 / r2
                double r4 = r4 + r0
                return r4
        }

        @Override // Yue.C2081
        /* JADX INFO: renamed from: ۥ۟ */
        public double mo9725(double r9) {
                r8 = this;
                r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                r2 = r0
                r4 = r2
            L4:
                double r6 = Yue.C2081.C2082.f6612
                int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r6 <= 0) goto L17
                double r6 = r8.m9728(r4)
                double r2 = r2 * r0
                int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r6 >= 0) goto L15
                double r4 = r4 + r2
                goto L4
            L15:
                double r4 = r4 - r2
                goto L4
            L17:
                double r9 = r4 - r2
                double r0 = r8.m9728(r9)
                double r4 = r4 + r2
                double r2 = r8.m9728(r4)
                double r9 = r8.m9729(r9)
                double r4 = r8.m9729(r4)
                double r4 = r4 - r9
                double r2 = r2 - r0
                double r4 = r4 / r2
                return r4
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final double m9726(double r13) {
                r12 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r2 = r0 - r13
                r4 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r6 = r2 * r4
                double r6 = r6 * r2
                double r8 = r12.f6613
                double r6 = r6 * r8
                r10 = 4618441417868443648(0x4018000000000000, double:6.0)
                double r2 = r2 * r10
                double r2 = r2 * r13
                double r10 = r12.f6615
                double r8 = r10 - r8
                double r2 = r2 * r8
                double r6 = r6 + r2
                double r4 = r4 * r13
                double r4 = r4 * r13
                double r0 = r0 - r10
                double r4 = r4 * r0
                double r6 = r6 + r4
                return r6
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final double m9727(double r13) {
                r12 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r2 = r0 - r13
                r4 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r6 = r2 * r4
                double r6 = r6 * r2
                double r8 = r12.f6614
                double r6 = r6 * r8
                r10 = 4618441417868443648(0x4018000000000000, double:6.0)
                double r2 = r2 * r10
                double r2 = r2 * r13
                double r10 = r12.f6616
                double r8 = r10 - r8
                double r2 = r2 * r8
                double r6 = r6 + r2
                double r4 = r4 * r13
                double r4 = r4 * r13
                double r0 = r0 - r10
                double r4 = r4 * r0
                double r6 = r6 + r4
                return r6
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final double m9728(double r7) {
                r6 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r0 = r0 - r7
                r2 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r2 = r2 * r0
                double r0 = r0 * r2
                double r0 = r0 * r7
                double r2 = r2 * r7
                double r2 = r2 * r7
                double r4 = r7 * r7
                double r4 = r4 * r7
                double r7 = r6.f6613
                double r7 = r7 * r0
                double r0 = r6.f6615
                double r0 = r0 * r2
                double r7 = r7 + r0
                double r7 = r7 + r4
                return r7
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final double m9729(double r7) {
                r6 = this;
                r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r0 = r0 - r7
                r2 = 4613937818241073152(0x4008000000000000, double:3.0)
                double r2 = r2 * r0
                double r0 = r0 * r2
                double r0 = r0 * r7
                double r2 = r2 * r7
                double r2 = r2 * r7
                double r4 = r7 * r7
                double r4 = r4 * r7
                double r7 = r6.f6614
                double r7 = r7 * r0
                double r0 = r6.f6616
                double r0 = r0 * r2
                double r7 = r7 + r0
                double r7 = r7 + r4
                return r7
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m9730(double r1, double r3, double r5, double r7) {
                r0 = this;
                r0.f6613 = r1
                r0.f6614 = r3
                r0.f6615 = r5
                r0.f6616 = r7
                return
        }
    }

    static {
            Yue.ۥۣ۠۠ۨ r0 = new Yue.ۥۣ۠۠ۨ
            r0.<init>()
            Yue.C2081.f6600 = r0
            java.lang.String r0 = "decelerate"
            java.lang.String r1 = "linear"
            java.lang.String r2 = "standard"
            java.lang.String r3 = "accelerate"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            Yue.C2081.f6609 = r0
            return
    }

    public C2081() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "identity"
            r1.f6610 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C2081 m9723(java.lang.String r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "cubic"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L12
            Yue.ۥۣ۠۠ۨ$ۥ r0 = new Yue.ۥۣ۠۠ۨ$ۥ
            r0.<init>(r2)
            return r0
        L12:
            r0 = -1
            int r1 = r2.hashCode()
            switch(r1) {
                case -1354466595: goto L3c;
                case -1263948740: goto L31;
                case -1102672091: goto L26;
                case 1312628413: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L46
        L1b:
            java.lang.String r1 = "standard"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L24
            goto L46
        L24:
            r0 = 3
            goto L46
        L26:
            java.lang.String r1 = "linear"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L2f
            goto L46
        L2f:
            r0 = 2
            goto L46
        L31:
            java.lang.String r1 = "decelerate"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L3a
            goto L46
        L3a:
            r0 = 1
            goto L46
        L3c:
            java.lang.String r1 = "accelerate"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L45
            goto L46
        L45:
            r0 = 0
        L46:
            switch(r0) {
                case 0: goto L80;
                case 1: goto L78;
                case 2: goto L70;
                case 3: goto L68;
                default: goto L49;
            }
        L49:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or "
            r2.append(r0)
            java.lang.String[] r0 = Yue.C2081.f6609
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "ConstraintSet"
            android.util.Log.e(r0, r2)
            Yue.ۥۣ۠۠ۨ r2 = Yue.C2081.f6600
            return r2
        L68:
            Yue.ۥۣ۠۠ۨ$ۥ r2 = new Yue.ۥۣ۠۠ۨ$ۥ
            java.lang.String r0 = "cubic(0.4, 0.0, 0.2, 1)"
            r2.<init>(r0)
            return r2
        L70:
            Yue.ۥۣ۠۠ۨ$ۥ r2 = new Yue.ۥۣ۠۠ۨ$ۥ
            java.lang.String r0 = "cubic(1, 1, 0, 0)"
            r2.<init>(r0)
            return r2
        L78:
            Yue.ۥۣ۠۠ۨ$ۥ r2 = new Yue.ۥۣ۠۠ۨ$ۥ
            java.lang.String r0 = "cubic(0.0, 0.0, 0.2, 0.95)"
            r2.<init>(r0)
            return r2
        L80:
            Yue.ۥۣ۠۠ۨ$ۥ r2 = new Yue.ۥۣ۠۠ۨ$ۥ
            java.lang.String r0 = "cubic(0.4, 0.05, 0.8, 0.7)"
            r2.<init>(r0)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f6610
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public double mo9724(double r1) {
            r0 = this;
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public double mo9725(double r1) {
            r0 = this;
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            return r1
    }
}
