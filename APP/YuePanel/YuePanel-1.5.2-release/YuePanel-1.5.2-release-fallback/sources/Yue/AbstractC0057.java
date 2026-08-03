package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2312.class})
@Yue.InterfaceC5792(version = "1.9")
public abstract class AbstractC0057 implements Yue.InterfaceC6233.InterfaceC6237 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.EnumC2050 f122;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC3574 f123;

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۡ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:200\n*E\n"})
    public static final class C0058 implements Yue.InterfaceC1386 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final long f124;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final Yue.AbstractC0057 f125;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final long f126;

        public C0058(long r2, Yue.AbstractC0057 r4, long r5) {
                r1 = this;
                java.lang.String r0 = "timeSource"
                Yue.C3329.m13906(r4, r0)
                r1.<init>()
                r1.f124 = r2
                r1.f125 = r4
                r1.f126 = r5
                return
        }

        public /* synthetic */ C0058(long r1, Yue.AbstractC0057 r3, long r4, Yue.C1769 r6) {
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
                boolean r0 = r5 instanceof Yue.AbstractC0057.C0058
                if (r0 == 0) goto L25
                Yue.ۥۣ۟۟ۡ r0 = r4.f125
                r1 = r5
                Yue.ۥۣ۟۟ۡ$ۥ r1 = (Yue.AbstractC0057.C0058) r1
                Yue.ۥۣ۟۟ۡ r1 = r1.f125
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
                r3 = this;
                long r0 = r3.f126
                int r0 = Yue.C2045.m9482(r0)
                int r0 = r0 * 37
                long r1 = r3.f124
                int r1 = java.lang.Long.hashCode(r1)
                int r0 = r0 + r1
                return r0
        }

        @Yue.InterfaceC4418
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "LongTimeMark("
                r0.append(r1)
                long r1 = r3.f124
                r0.append(r1)
                Yue.ۥۣ۟۟ۡ r1 = r3.f125
                Yue.ۥۣ۠۠ r1 = r1.m408()
                java.lang.String r1 = Yue.C2054.m9663(r1)
                r0.append(r1)
                java.lang.String r1 = " + "
                r0.append(r1)
                long r1 = r3.f126
                java.lang.String r1 = Yue.C2045.m9503(r1)
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                Yue.ۥۣ۟۟ۡ r1 = r3.f125
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // Yue.InterfaceC6231
        /* JADX INFO: renamed from: ۥ */
        public boolean mo385() {
                r1 = this;
                boolean r0 = Yue.InterfaceC1386.C1387.m6921(r1)
                return r0
        }

        @Override // Yue.InterfaceC1386, Yue.InterfaceC6231
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟ */
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
        /* JADX INFO: renamed from: ۥ۟۟ */
        public Yue.InterfaceC1386 mo387(long r11) {
                r10 = this;
                Yue.ۥۣ۟۟ۡ r0 = r10.f125
                Yue.ۥۣ۠۠ r0 = r0.m408()
                boolean r1 = Yue.C2045.m9486(r11)
                if (r1 == 0) goto L22
                long r1 = r10.f124
                long r4 = Yue.C3826.m15304(r1, r0, r11)
                Yue.ۥۣ۟۟ۡ$ۥ r11 = new Yue.ۥۣ۟۟ۡ$ۥ
                Yue.ۥۣ۟۟ۡ r6 = r10.f125
                Yue.ۥ۠۠ۢۥ$ۥ r12 = Yue.C2045.f6532
                long r7 = r12.m9558()
                r9 = 0
                r3 = r11
                r3.<init>(r4, r6, r7, r9)
                return r11
            L22:
                long r1 = Yue.C2045.m9506(r11, r0)
                long r11 = Yue.C2045.m9489(r11, r1)
                long r3 = r10.f126
                long r11 = Yue.C2045.m9490(r11, r3)
                long r3 = r10.f124
                long r1 = Yue.C3826.m15304(r3, r0, r1)
                long r3 = Yue.C2045.m9506(r11, r0)
                long r1 = Yue.C3826.m15304(r1, r0, r3)
                long r11 = Yue.C2045.m9489(r11, r3)
                long r3 = Yue.C2045.m9471(r11)
                r5 = 0
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 == 0) goto L66
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 == 0) goto L66
                long r7 = r1 ^ r3
                int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r5 >= 0) goto L66
                int r3 = Yue.C4094.m15946(r3)
                long r3 = Yue.C2049.m9651(r3, r0)
                long r1 = Yue.C3826.m15304(r1, r0, r3)
                long r11 = Yue.C2045.m9489(r11, r3)
            L66:
                r3 = 1
                long r5 = r1 - r3
                long r3 = r3 | r5
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 != 0) goto L7a
                Yue.ۥ۠۠ۢۥ$ۥ r11 = Yue.C2045.f6532
                long r11 = r11.m9558()
            L7a:
                r4 = r11
                Yue.ۥۣ۟۟ۡ$ۥ r11 = new Yue.ۥۣ۟۟ۡ$ۥ
                Yue.ۥۣ۟۟ۡ r3 = r10.f125
                r6 = 0
                r0 = r11
                r0.<init>(r1, r3, r4, r6)
                return r11
        }

        @Override // Yue.InterfaceC6231
        /* JADX INFO: renamed from: ۥ۟۟ */
        public /* bridge */ /* synthetic */ Yue.InterfaceC6231 mo387(long r1) {
                r0 = this;
                Yue.ۥ۟ۦۡۦ r1 = r0.mo387(r1)
                return r1
        }

        @Override // Yue.InterfaceC6231
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public long mo388() {
                r5 = this;
                Yue.ۥۣ۟۟ۡ r0 = r5.f125
                long r0 = Yue.AbstractC0057.m406(r0)
                long r2 = r5.f124
                Yue.ۥۣ۟۟ۡ r4 = r5.f125
                Yue.ۥۣ۠۠ r4 = r4.m408()
                long r0 = Yue.C3826.m15308(r0, r2, r4)
                long r2 = r5.f126
                long r0 = Yue.C2045.m9489(r0, r2)
                return r0
        }

        @Override // Yue.InterfaceC6231
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo389() {
                r1 = this;
                boolean r0 = Yue.InterfaceC1386.C1387.m6920(r1)
                return r0
        }

        @Override // Yue.InterfaceC1386
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public long mo390(@Yue.InterfaceC4418 Yue.InterfaceC1386 r7) {
                r6 = this;
                java.lang.String r0 = "other"
                Yue.C3329.m13906(r7, r0)
                boolean r0 = r7 instanceof Yue.AbstractC0057.C0058
                if (r0 == 0) goto L31
                Yue.ۥۣ۟۟ۡ r0 = r6.f125
                r1 = r7
                Yue.ۥۣ۟۟ۡ$ۥ r1 = (Yue.AbstractC0057.C0058) r1
                Yue.ۥۣ۟۟ۡ r2 = r1.f125
                boolean r0 = Yue.C3329.m13897(r0, r2)
                if (r0 == 0) goto L31
                long r2 = r6.f124
                long r4 = r1.f124
                Yue.ۥۣ۟۟ۡ r7 = r6.f125
                Yue.ۥۣ۠۠ r7 = r7.m408()
                long r2 = Yue.C3826.m15308(r2, r4, r7)
                long r4 = r6.f126
                long r0 = r1.f126
                long r0 = Yue.C2045.m9489(r4, r0)
                long r0 = Yue.C2045.m9490(r2, r0)
                return r0
            L31:
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
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public int mo391(@Yue.InterfaceC4418 Yue.InterfaceC1386 r1) {
                r0 = this;
                int r1 = Yue.InterfaceC1386.C1387.m6919(r0, r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۡ$ۥ۟, reason: contains not printable characters */
    public static final class C0059 extends Yue.AbstractC3560 implements Yue.InterfaceC2823<java.lang.Long> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC0057 f127;

        public C0059(Yue.AbstractC0057 r1) {
                r0 = this;
                r0.f127 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // Yue.InterfaceC2823
        @Yue.InterfaceC4418
        public final java.lang.Long invoke() {
                r2 = this;
                Yue.ۥۣ۟۟ۡ r0 = r2.f127
                long r0 = r0.mo410()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                return r0
        }

        @Override // Yue.InterfaceC2823
        public /* bridge */ /* synthetic */ java.lang.Long invoke() {
                r1 = this;
                java.lang.Long r0 = r1.invoke()
                return r0
        }
    }

    public AbstractC0057(@Yue.InterfaceC4418 Yue.EnumC2050 r2) {
            r1 = this;
            java.lang.String r0 = "unit"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f122 = r2
            Yue.ۥۣ۟۟ۡ$ۥ۟ r2 = new Yue.ۥۣ۟۟ۡ$ۥ۟
            r2.<init>(r1)
            Yue.ۥ۠ۦۨۨ r2 = Yue.C3579.m14505(r2)
            r1.f123 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ long m406(Yue.AbstractC0057 r2) {
            long r0 = r2.m407()
            return r0
    }

    @Override // Yue.InterfaceC6233.InterfaceC6237, Yue.InterfaceC6233
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.InterfaceC1386 mo382() {
            r8 = this;
            Yue.ۥۣ۟۟ۡ$ۥ r7 = new Yue.ۥۣ۟۟ۡ$ۥ
            long r1 = r8.m407()
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

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long m407() {
            r4 = this;
            long r0 = r4.mo410()
            long r2 = r4.m409()
            long r0 = r0 - r2
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.EnumC2050 m408() {
            r1 = this;
            Yue.ۥۣ۠۠ r0 = r1.f122
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final long m409() {
            r2 = this;
            Yue.ۥ۠ۦۨۨ r0 = r2.f123
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public abstract long mo410();
}
