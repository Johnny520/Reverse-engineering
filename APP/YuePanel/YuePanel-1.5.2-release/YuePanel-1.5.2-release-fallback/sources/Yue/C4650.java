package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4650 extends Yue.AbstractC0052<Yue.C0879> implements java.util.RandomAccess {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C4650.C4651 f14814 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C0879[] f14815;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final int[] f14816;

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,236:1\n11065#2:237\n11400#2,3:238\n13374#2,3:243\n37#3,2:241\n1#4:246\n74#5:247\n74#5:248\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n43#1:237\n43#1:238,3\n44#1:243,3\n43#1:241,2\n151#1:247\n208#1:248\n*E\n"})
    public static final class C4651 {
        public C4651() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C4651(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static /* synthetic */ void m18483(Yue.C4650.C4651 r11, long r12, Yue.C0843 r14, int r15, java.util.List r16, int r17, int r18, java.util.List r19, int r20, java.lang.Object r21) {
                r0 = r20 & 1
                if (r0 == 0) goto L8
                r0 = 0
                r3 = r0
                goto L9
            L8:
                r3 = r12
            L9:
                r0 = r20 & 4
                r1 = 0
                if (r0 == 0) goto L10
                r6 = r1
                goto L11
            L10:
                r6 = r15
            L11:
                r0 = r20 & 16
                if (r0 == 0) goto L17
                r8 = r1
                goto L19
            L17:
                r8 = r17
            L19:
                r0 = r20 & 32
                if (r0 == 0) goto L23
                int r0 = r16.size()
                r9 = r0
                goto L25
            L23:
                r9 = r18
            L25:
                r2 = r11
                r5 = r14
                r7 = r16
                r10 = r19
                r2.m18484(r3, r5, r6, r7, r8, r9, r10)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m18484(long r20, Yue.C0843 r22, int r23, java.util.List<? extends Yue.C0879> r24, int r25, int r26, java.util.List<java.lang.Integer> r27) {
                r19 = this;
                r9 = r19
                r10 = r22
                r11 = r23
                r12 = r24
                r0 = r25
                r13 = r26
                r14 = r27
                java.lang.String r1 = "Failed requirement."
                if (r0 >= r13) goto L1bd
                r2 = r0
            L13:
                if (r2 >= r13) goto L2e
                java.lang.Object r3 = r12.get(r2)
                Yue.ۥۣ۟ۥۤ r3 = (Yue.C0879) r3
                int r3 = r3.m5095()
                if (r3 < r11) goto L24
                int r2 = r2 + 1
                goto L13
            L24:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L2e:
                java.lang.Object r1 = r24.get(r25)
                Yue.ۥۣ۟ۥۤ r1 = (Yue.C0879) r1
                int r2 = r13 + (-1)
                java.lang.Object r2 = r12.get(r2)
                Yue.ۥۣ۟ۥۤ r2 = (Yue.C0879) r2
                int r3 = r1.m5095()
                r15 = -1
                if (r11 != r3) goto L59
                java.lang.Object r1 = r14.get(r0)
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                int r0 = r0 + 1
                java.lang.Object r3 = r12.get(r0)
                Yue.ۥۣ۟ۥۤ r3 = (Yue.C0879) r3
                r6 = r0
                r0 = r1
                r1 = r3
                goto L5b
            L59:
                r6 = r0
                r0 = r15
            L5b:
                byte r3 = r1.m5066(r11)
                byte r4 = r2.m5066(r11)
                r5 = 2
                if (r3 == r4) goto L130
                int r1 = r6 + 1
                r2 = 1
            L69:
                if (r1 >= r13) goto L88
                int r3 = r1 + (-1)
                java.lang.Object r3 = r12.get(r3)
                Yue.ۥۣ۟ۥۤ r3 = (Yue.C0879) r3
                byte r3 = r3.m5066(r11)
                java.lang.Object r4 = r12.get(r1)
                Yue.ۥۣ۟ۥۤ r4 = (Yue.C0879) r4
                byte r4 = r4.m5066(r11)
                if (r3 == r4) goto L85
                int r2 = r2 + 1
            L85:
                int r1 = r1 + 1
                goto L69
            L88:
                long r3 = r9.m18485(r10)
                long r3 = r20 + r3
                long r7 = (long) r5
                long r3 = r3 + r7
                int r1 = r2 * 2
                long r7 = (long) r1
                long r16 = r3 + r7
                r10.m4901(r2)
                r10.m4901(r0)
                r0 = r6
            L9c:
                if (r0 >= r13) goto Lc0
                java.lang.Object r1 = r12.get(r0)
                Yue.ۥۣ۟ۥۤ r1 = (Yue.C0879) r1
                byte r1 = r1.m5066(r11)
                if (r0 == r6) goto Lb8
                int r2 = r0 + (-1)
                java.lang.Object r2 = r12.get(r2)
                Yue.ۥۣ۟ۥۤ r2 = (Yue.C0879) r2
                byte r2 = r2.m5066(r11)
                if (r1 == r2) goto Lbd
            Lb8:
                r1 = r1 & 255(0xff, float:3.57E-43)
                r10.m4901(r1)
            Lbd:
                int r0 = r0 + 1
                goto L9c
            Lc0:
                Yue.ۥۣ۟ۢۨ r8 = new Yue.ۥۣ۟ۢۨ
                r8.<init>()
            Lc5:
                if (r6 >= r13) goto L12a
                java.lang.Object r0 = r12.get(r6)
                Yue.ۥۣ۟ۥۤ r0 = (Yue.C0879) r0
                byte r0 = r0.m5066(r11)
                int r1 = r6 + 1
                r2 = r1
            Ld4:
                if (r2 >= r13) goto Le7
                java.lang.Object r3 = r12.get(r2)
                Yue.ۥۣ۟ۥۤ r3 = (Yue.C0879) r3
                byte r3 = r3.m5066(r11)
                if (r0 == r3) goto Le4
                r7 = r2
                goto Le8
            Le4:
                int r2 = r2 + 1
                goto Ld4
            Le7:
                r7 = r13
            Le8:
                if (r1 != r7) goto L109
                int r0 = r11 + 1
                java.lang.Object r1 = r12.get(r6)
                Yue.ۥۣ۟ۥۤ r1 = (Yue.C0879) r1
                int r1 = r1.m5095()
                if (r0 != r1) goto L109
                java.lang.Object r0 = r14.get(r6)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r10.m4901(r0)
                r18 = r7
                r15 = r8
                goto L125
            L109:
                long r0 = r9.m18485(r8)
                long r0 = r16 + r0
                int r0 = (int) r0
                int r0 = r0 * r15
                r10.m4901(r0)
                int r4 = r11 + 1
                r0 = r19
                r1 = r16
                r3 = r8
                r5 = r24
                r18 = r7
                r15 = r8
                r8 = r27
                r0.m18484(r1, r3, r4, r5, r6, r7, r8)
            L125:
                r8 = r15
                r6 = r18
                r15 = -1
                goto Lc5
            L12a:
                r15 = r8
                r10.mo4815(r15)
                goto L1bc
            L130:
                int r3 = r1.m5095()
                int r4 = r2.m5095()
                int r3 = java.lang.Math.min(r3, r4)
                r4 = 0
                r7 = r11
            L13e:
                if (r7 >= r3) goto L14f
                byte r8 = r1.m5066(r7)
                byte r15 = r2.m5066(r7)
                if (r8 != r15) goto L14f
                int r4 = r4 + 1
                int r7 = r7 + 1
                goto L13e
            L14f:
                long r2 = r9.m18485(r10)
                long r2 = r20 + r2
                long r7 = (long) r5
                long r2 = r2 + r7
                long r7 = (long) r4
                long r2 = r2 + r7
                r7 = 1
                long r2 = r2 + r7
                int r5 = -r4
                r10.m4901(r5)
                r10.m4901(r0)
                int r4 = r4 + r11
            L164:
                if (r11 >= r4) goto L172
                byte r0 = r1.m5066(r11)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r10.m4901(r0)
                int r11 = r11 + 1
                goto L164
            L172:
                int r0 = r6 + 1
                if (r0 != r13) goto L19c
                java.lang.Object r0 = r12.get(r6)
                Yue.ۥۣ۟ۥۤ r0 = (Yue.C0879) r0
                int r0 = r0.m5095()
                if (r4 != r0) goto L190
                java.lang.Object r0 = r14.get(r6)
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                r10.m4901(r0)
                goto L1bc
            L190:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Check failed."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L19c:
                Yue.ۥۣ۟ۢۨ r11 = new Yue.ۥۣ۟ۢۨ
                r11.<init>()
                long r0 = r9.m18485(r11)
                long r0 = r0 + r2
                int r0 = (int) r0
                r1 = -1
                int r0 = r0 * r1
                r10.m4901(r0)
                r0 = r19
                r1 = r2
                r3 = r11
                r5 = r24
                r7 = r26
                r8 = r27
                r0.m18484(r1, r3, r4, r5, r6, r7, r8)
                r10.mo4815(r11)
            L1bc:
                return
            L1bd:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final long m18485(Yue.C0843 r5) {
                r4 = this;
                long r0 = r5.m4889()
                r5 = 4
                long r2 = (long) r5
                long r0 = r0 / r2
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Yue.C4650 m18486(@Yue.InterfaceC4418 Yue.C0879... r17) {
                r16 = this;
                r0 = r17
                java.lang.String r1 = "byteStrings"
                Yue.C3329.m13906(r0, r1)
                int r1 = r0.length
                r2 = 0
                r3 = -1
                r4 = 0
                if (r1 != 0) goto L19
                Yue.ۥۣۡۤۥ r0 = new Yue.ۥۣۡۤۥ
                Yue.ۥۣ۟ۥۤ[] r1 = new Yue.C0879[r4]
                int[] r3 = new int[]{r4, r3}
                r0.<init>(r1, r3, r2)
                return r0
            L19:
                java.util.List r1 = Yue.C0595.m3992(r17)
                Yue.C1215.m6242(r1)
                java.util.ArrayList r5 = new java.util.ArrayList
                int r6 = r0.length
                r5.<init>(r6)
                int r6 = r0.length
                r7 = r4
            L28:
                if (r7 >= r6) goto L36
                r8 = r0[r7]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
                r5.add(r8)
                int r7 = r7 + 1
                goto L28
            L36:
                java.lang.Integer[] r3 = new java.lang.Integer[r4]
                java.lang.Object[] r3 = r5.toArray(r3)
                java.lang.Integer[] r3 = (java.lang.Integer[]) r3
                int r5 = r3.length
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r5)
                java.util.List r13 = Yue.C1208.m6221(r3)
                int r3 = r0.length
                r11 = r4
                r12 = r11
            L4a:
                if (r11 >= r3) goto L64
                r6 = r0[r11]
                int r14 = r12 + 1
                r9 = 6
                r10 = 0
                r7 = 0
                r8 = 0
                r5 = r1
                int r5 = Yue.C1208.m6203(r5, r6, r7, r8, r9, r10)
                java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
                r13.set(r5, r6)
                int r11 = r11 + 1
                r12 = r14
                goto L4a
            L64:
                java.lang.Object r3 = r1.get(r4)
                Yue.ۥۣ۟ۥۤ r3 = (Yue.C0879) r3
                int r3 = r3.m5095()
                if (r3 <= 0) goto L118
                r3 = r4
            L71:
                int r5 = r1.size()
                if (r3 >= r5) goto Ld9
                java.lang.Object r5 = r1.get(r3)
                Yue.ۥۣ۟ۥۤ r5 = (Yue.C0879) r5
                int r6 = r3 + 1
                r7 = r6
            L80:
                int r8 = r1.size()
                if (r7 >= r8) goto Ld7
                java.lang.Object r8 = r1.get(r7)
                Yue.ۥۣ۟ۥۤ r8 = (Yue.C0879) r8
                boolean r9 = r8.m5096(r5)
                if (r9 == 0) goto Ld7
                int r9 = r8.m5095()
                int r10 = r5.m5095()
                if (r9 == r10) goto Lbc
                java.lang.Object r8 = r13.get(r7)
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                java.lang.Object r9 = r13.get(r3)
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                if (r8 <= r9) goto Lb9
                r1.remove(r7)
                r13.remove(r7)
                goto L80
            Lb9:
                int r7 = r7 + 1
                goto L80
            Lbc:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "duplicate option: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            Ld7:
                r3 = r6
                goto L71
            Ld9:
                Yue.ۥۣ۟ۢۨ r3 = new Yue.ۥۣ۟ۢۨ
                r3.<init>()
                r14 = 53
                r15 = 0
                r6 = 0
                r9 = 0
                r11 = 0
                r12 = 0
                r5 = r16
                r8 = r3
                r10 = r1
                m18483(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15)
                r1 = r16
                long r5 = r1.m18485(r3)
                int r5 = (int) r5
                int[] r5 = new int[r5]
            Lf6:
                boolean r6 = r3.mo4827()
                if (r6 != 0) goto L106
                int r6 = r4 + 1
                int r7 = r3.readInt()
                r5[r4] = r7
                r4 = r6
                goto Lf6
            L106:
                Yue.ۥۣۡۤۥ r3 = new Yue.ۥۣۡۤۥ
                int r4 = r0.length
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
                java.lang.String r4 = "copyOf(this, size)"
                Yue.C3329.m13905(r0, r4)
                Yue.ۥۣ۟ۥۤ[] r0 = (Yue.C0879[]) r0
                r3.<init>(r0, r5, r2)
                return r3
            L118:
                r1 = r16
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "the empty byte string is not a supported option"
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
        }
    }

    static {
            Yue.ۥۣۡۤۥ$ۥ r0 = new Yue.ۥۣۡۤۥ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C4650.f14814 = r0
            return
    }

    public C4650(Yue.C0879[] r1, int[] r2) {
            r0 = this;
            r0.<init>()
            r0.f14815 = r1
            r0.f14816 = r2
            return
    }

    public /* synthetic */ C4650(Yue.C0879[] r1, int[] r2, Yue.C1769 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Yue.C4650 m18476(@Yue.InterfaceC4418 Yue.C0879... r1) {
            Yue.ۥۣۡۤۥ$ۥ r0 = Yue.C4650.f14814
            Yue.ۥۣۡۤۥ r1 = r0.m18486(r1)
            return r1
    }

    @Override // Yue.AbstractC0041, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C0879
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            Yue.ۥۣ۟ۥۤ r2 = (Yue.C0879) r2
            boolean r2 = r1.m18477(r2)
            return r2
    }

    @Override // Yue.AbstractC0052, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            Yue.ۥۣ۟ۥۤ r1 = r0.m18478(r1)
            return r1
    }

    @Override // Yue.AbstractC0052, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C0879
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            Yue.ۥۣ۟ۥۤ r2 = (Yue.C0879) r2
            int r2 = r1.m18481(r2)
            return r2
    }

    @Override // Yue.AbstractC0052, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C0879
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            Yue.ۥۣ۟ۥۤ r2 = (Yue.C0879) r2
            int r2 = r1.m18482(r2)
            return r2
    }

    @Override // Yue.AbstractC0052, Yue.AbstractC0041
    /* JADX INFO: renamed from: ۥ */
    public int mo368() {
            r1 = this;
            Yue.ۥۣ۟ۥۤ[] r0 = r1.f14815
            int r0 = r0.length
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public /* bridge */ boolean m18477(Yue.C0879 r1) {
            r0 = this;
            boolean r1 = super.contains(r1)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C0879 m18478(int r2) {
            r1 = this;
            Yue.ۥۣ۟ۥۤ[] r0 = r1.f14815
            r2 = r0[r2]
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.C0879[] m18479() {
            r1 = this;
            Yue.ۥۣ۟ۥۤ[] r0 = r1.f14815
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int[] m18480() {
            r1 = this;
            int[] r0 = r1.f14816
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public /* bridge */ int m18481(Yue.C0879 r1) {
            r0 = this;
            int r1 = super.indexOf(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public /* bridge */ int m18482(Yue.C0879 r1) {
            r0 = this;
            int r1 = super.lastIndexOf(r1)
            return r1
    }
}
