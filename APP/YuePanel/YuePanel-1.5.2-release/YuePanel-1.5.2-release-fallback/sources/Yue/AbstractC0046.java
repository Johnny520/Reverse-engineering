package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC2312
@Yue.InterfaceC1816(message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@Yue.InterfaceC5792(version = "1.3")
public abstract class AbstractC0046 implements Yue.InterfaceC6233.InterfaceC6237 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.EnumC2050 f104;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡ۟$ۥ, reason: contains not printable characters */
    public static final class C0047 implements Yue.InterfaceC1386 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final double f105;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.AbstractC0046 f106;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final long f107;

        public C0047(double r2, Yue.AbstractC0046 r4, long r5) {
                r1 = this;
                java.lang.String r0 = "timeSource"
                Yue.C3329.m13906(r4, r0)
                r1.<init>()
                r1.f105 = r2
                r1.f106 = r4
                r1.f107 = r5
                return
        }

        public /* synthetic */ C0047(double r1, Yue.AbstractC0046 r3, long r4, Yue.C1769 r6) {
                r0 = this;
                r0.<init>(r1, r3, r4)
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Yue.InterfaceC1386 r1) {
                r0 = this;
                Yue.ۥ۟ۦۡۦ r1 = (Yue.InterfaceC1386) r1
                int r1 = r0.mo391(r1)
                return r1
        }

        @Override // Yue.InterfaceC1386
        public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
                r4 = this;
                boolean r0 = r5 instanceof Yue.AbstractC0046.C0047
                if (r0 == 0) goto L25
                Yue.ۥ۟۟ۡ۟ r0 = r4.f106
                r1 = r5
                Yue.ۥ۟۟ۡ۟$ۥ r1 = (Yue.AbstractC0046.C0047) r1
                Yue.ۥ۟۟ۡ۟ r1 = r1.f106
                boolean r0 = Yue.C3329.m13897(r0, r1)
                if (r0 == 0) goto L25
                Yue.ۥ۟ۦۡۦ r5 = (Yue.InterfaceC1386) r5
                long r0 = r4.mo390(r5)
                Yue.ۥ۠۠ۢۥ$ۥ r5 = Yue.C2045.f6532
                long r2 = r5.m9558()
                boolean r5 = Yue.C2045.m9448(r0, r2)
                if (r5 == 0) goto L25
                r5 = 1
                goto L26
            L25:
                r5 = 0
            L26:
                return r5
        }

        @Override // Yue.InterfaceC1386
        public int hashCode() {
                r4 = this;
                double r0 = r4.f105
                Yue.ۥ۟۟ۡ۟ r2 = r4.f106
                Yue.ۥۣ۠۠ r2 = r2.m383()
                long r0 = Yue.C2049.m9650(r0, r2)
                long r2 = r4.f107
                long r0 = Yue.C2045.m9490(r0, r2)
                int r0 = Yue.C2045.m9482(r0)
                return r0
        }

        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DoubleTimeMark("
                r0.append(r1)
                double r1 = r3.f105
                r0.append(r1)
                Yue.ۥ۟۟ۡ۟ r1 = r3.f106
                Yue.ۥۣ۠۠ r1 = r1.m383()
                java.lang.String r1 = Yue.C2054.m9663(r1)
                r0.append(r1)
                java.lang.String r1 = " + "
                r0.append(r1)
                long r1 = r3.f107
                java.lang.String r1 = Yue.C2045.m9503(r1)
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                Yue.ۥ۟۟ۡ۟ r1 = r3.f106
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.InterfaceC6231
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean mo385() {
                r1 = this;
                boolean r0 = Yue.InterfaceC1386.C1387.m6921(r1)
                return r0
        }

        @Override // Yue.InterfaceC1386, Yue.InterfaceC6231
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.InterfaceC1386 mo386(long r1) {
                r0 = this;
                Yue.ۥ۟ۦۡۦ r1 = Yue.InterfaceC1386.C1387.m6922(r0, r1)
                return r1
        }

        @Override // Yue.InterfaceC6231
        /* JADX INFO: renamed from: ۥ۟ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC6231 mo386(long r1) {
                r0 = this;
                Yue.ۥ۟ۦۡۦ r1 = r0.mo386(r1)
                return r1
        }

        @Override // Yue.InterfaceC1386, Yue.InterfaceC6231
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.InterfaceC1386 mo387(long r9) {
                r8 = this;
                Yue.ۥ۟۟ۡ۟$ۥ r7 = new Yue.ۥ۟۟ۡ۟$ۥ
                double r1 = r8.f105
                Yue.ۥ۟۟ۡ۟ r3 = r8.f106
                long r4 = r8.f107
                long r4 = Yue.C2045.m9490(r4, r9)
                r6 = 0
                r0 = r7
                r0.<init>(r1, r3, r4, r6)
                return r7
        }

        @Override // Yue.InterfaceC6231
        /* JADX INFO: renamed from: ۥ۟۟ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC6231 mo387(long r1) {
                r0 = this;
                Yue.ۥ۟ۦۡۦ r1 = r0.mo387(r1)
                return r1
        }

        @Override // Yue.InterfaceC6231
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public long mo388() {
                r4 = this;
                Yue.ۥ۟۟ۡ۟ r0 = r4.f106
                double r0 = r0.m384()
                double r2 = r4.f105
                double r0 = r0 - r2
                Yue.ۥ۟۟ۡ۟ r2 = r4.f106
                Yue.ۥۣ۠۠ r2 = r2.m383()
                long r0 = Yue.C2049.m9650(r0, r2)
                long r2 = r4.f107
                long r0 = Yue.C2045.m9489(r0, r2)
                return r0
        }

        @Override // Yue.InterfaceC6231
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean mo389() {
                r1 = this;
                boolean r0 = Yue.InterfaceC1386.C1387.m6920(r1)
                return r0
        }

        @Override // Yue.InterfaceC1386
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public long mo390(@Yue.InterfaceC4418 Yue.InterfaceC1386 r7) {
                r6 = this;
                java.lang.String r0 = "other"
                Yue.C3329.m13906(r7, r0)
                boolean r0 = r7 instanceof Yue.AbstractC0046.C0047
                if (r0 == 0) goto L5c
                Yue.ۥ۟۟ۡ۟ r0 = r6.f106
                r1 = r7
                Yue.ۥ۟۟ۡ۟$ۥ r1 = (Yue.AbstractC0046.C0047) r1
                Yue.ۥ۟۟ۡ۟ r2 = r1.f106
                boolean r0 = Yue.C3329.m13897(r0, r2)
                if (r0 == 0) goto L5c
                long r2 = r6.f107
                long r4 = r1.f107
                boolean r7 = Yue.C2045.m9448(r2, r4)
                if (r7 == 0) goto L2f
                long r2 = r6.f107
                boolean r7 = Yue.C2045.m9486(r2)
                if (r7 == 0) goto L2f
                Yue.ۥ۠۠ۢۥ$ۥ r7 = Yue.C2045.f6532
                long r0 = r7.m9558()
                return r0
            L2f:
                long r2 = r6.f107
                long r4 = r1.f107
                long r2 = Yue.C2045.m9489(r2, r4)
                double r4 = r6.f105
                double r0 = r1.f105
                double r4 = r4 - r0
                Yue.ۥ۟۟ۡ۟ r7 = r6.f106
                Yue.ۥۣ۠۠ r7 = r7.m383()
                long r0 = Yue.C2049.m9650(r4, r7)
                long r4 = Yue.C2045.m9507(r2)
                boolean r7 = Yue.C2045.m9448(r0, r4)
                if (r7 == 0) goto L57
                Yue.ۥ۠۠ۢۥ$ۥ r7 = Yue.C2045.f6532
                long r0 = r7.m9558()
                goto L5b
            L57:
                long r0 = Yue.C2045.m9490(r0, r2)
            L5b:
                return r0
            L5c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Subtracting or comparing time marks from different time sources is not possible: "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r2 = " and "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
        }

        @Override // Yue.InterfaceC1386
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public int mo391(@Yue.InterfaceC4418 Yue.InterfaceC1386 r1) {
                r0 = this;
                int r1 = Yue.InterfaceC1386.C1387.m6919(r0, r1)
                return r1
        }
    }

    public AbstractC0046(@Yue.InterfaceC4418 Yue.EnumC2050 r2) {
            r1 = this;
            java.lang.String r0 = "unit"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f104 = r2
            return
    }

    @Override // Yue.InterfaceC6233.InterfaceC6237, Yue.InterfaceC6233
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.InterfaceC1386 mo382() {
            r8 = this;
            Yue.ۥ۟۟ۡ۟$ۥ r7 = new Yue.ۥ۟۟ۡ۟$ۥ
            double r1 = r8.m384()
            Yue.ۥ۠۠ۢۥ$ۥ r0 = Yue.C2045.f6532
            long r4 = r0.m9558()
            r6 = 0
            r0 = r7
            r3 = r8
            r0.<init>(r1, r3, r4, r6)
            return r7
    }

    @Override // Yue.InterfaceC6233
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ Yue.InterfaceC6231 mo382() {
            r1 = this;
            Yue.ۥ۟ۦۡۦ r0 = r1.mo382()
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.EnumC2050 m383() {
            r1 = this;
            Yue.ۥۣ۠۠ r0 = r1.f104
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public abstract double m384();
}
