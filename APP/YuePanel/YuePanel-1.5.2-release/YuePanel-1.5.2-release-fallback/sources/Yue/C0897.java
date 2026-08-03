package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0897 implements Yue.InterfaceC3318 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0897.C0898 f2631 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.C0883 f2632;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۦ۠$ۥ, reason: contains not printable characters */
    public static final class C0898 {
        public C0898() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0898(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ Yue.C2994 m5224(Yue.C0897.C0898 r0, Yue.C2994 r1, Yue.C2994 r2) {
                Yue.ۥ۠ۤۢۢ r0 = r0.m5226(r1, r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final /* synthetic */ Yue.C5377 m5225(Yue.C0897.C0898 r0, Yue.C5377 r1) {
                Yue.ۥۡۦۧ r0 = r0.m5229(r1)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C2994 m5226(Yue.C2994 r10, Yue.C2994 r11) {
                r9 = this;
                Yue.ۥ۠ۤۢۢ$ۥ r0 = new Yue.ۥ۠ۤۢۢ$ۥ
                r0.<init>()
                int r1 = r10.size()
                r2 = 0
                r3 = r2
            Lb:
                if (r3 >= r1) goto L41
                java.lang.String r4 = r10.m12682(r3)
                java.lang.String r5 = r10.m12686(r3)
                java.lang.String r6 = "Warning"
                r7 = 1
                boolean r6 = Yue.C5988.m22281(r6, r4, r7)
                if (r6 == 0) goto L29
                r6 = 2
                r7 = 0
                java.lang.String r8 = "1"
                boolean r6 = Yue.C5988.m22315(r5, r8, r2, r6, r7)
                if (r6 == 0) goto L29
                goto L3e
            L29:
                boolean r6 = r9.m5227(r4)
                if (r6 != 0) goto L3b
                boolean r6 = r9.m5228(r4)
                if (r6 == 0) goto L3b
                java.lang.String r6 = r11.m12679(r4)
                if (r6 != 0) goto L3e
            L3b:
                r0.m12694(r4, r5)
            L3e:
                int r3 = r3 + 1
                goto Lb
            L41:
                int r10 = r11.size()
            L45:
                if (r2 >= r10) goto L61
                java.lang.String r1 = r11.m12682(r2)
                boolean r3 = r9.m5227(r1)
                if (r3 != 0) goto L5e
                boolean r3 = r9.m5228(r1)
                if (r3 == 0) goto L5e
                java.lang.String r3 = r11.m12686(r2)
                r0.m12694(r1, r3)
            L5e:
                int r2 = r2 + 1
                goto L45
            L61:
                Yue.ۥ۠ۤۢۢ r10 = r0.m12696()
                return r10
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m5227(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "Content-Length"
                r1 = 1
                boolean r0 = Yue.C5988.m22281(r0, r3, r1)
                if (r0 != 0) goto L1b
                java.lang.String r0 = "Content-Encoding"
                boolean r0 = Yue.C5988.m22281(r0, r3, r1)
                if (r0 != 0) goto L1b
                java.lang.String r0 = "Content-Type"
                boolean r3 = Yue.C5988.m22281(r0, r3, r1)
                if (r3 == 0) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final boolean m5228(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "Connection"
                r1 = 1
                boolean r0 = Yue.C5988.m22281(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Keep-Alive"
                boolean r0 = Yue.C5988.m22281(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Proxy-Authenticate"
                boolean r0 = Yue.C5988.m22281(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Proxy-Authorization"
                boolean r0 = Yue.C5988.m22281(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "TE"
                boolean r0 = Yue.C5988.m22281(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Trailers"
                boolean r0 = Yue.C5988.m22281(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Transfer-Encoding"
                boolean r0 = Yue.C5988.m22281(r0, r3, r1)
                if (r0 != 0) goto L42
                java.lang.String r0 = "Upgrade"
                boolean r3 = Yue.C5988.m22281(r0, r3, r1)
                if (r3 != 0) goto L42
                goto L43
            L42:
                r1 = 0
            L43:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final Yue.C5377 m5229(Yue.C5377 r3) {
                r2 = this;
                r0 = 0
                if (r3 == 0) goto L8
                Yue.ۥۡۦۧ۟ r1 = r3.m20280()
                goto L9
            L8:
                r1 = r0
            L9:
                if (r1 == 0) goto L17
                Yue.ۥۡۦۧ$ۥ r3 = r3.m20295()
                Yue.ۥۡۦۧ$ۥ r3 = r3.m20304(r0)
                Yue.ۥۡۦۧ r3 = r3.m20305()
            L17:
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۦ۠$ۥ۟, reason: contains not printable characters */
    public static final class C0899 implements Yue.InterfaceC5839 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f2633;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC0849 f2634;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC0900 f2635;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC0848 f2636;

        public C0899(Yue.InterfaceC0849 r1, Yue.InterfaceC0900 r2, Yue.InterfaceC0848 r3) {
                r0 = this;
                r0.f2634 = r1
                r0.f2635 = r2
                r0.f2636 = r3
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5839, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r2 = this;
                boolean r0 = r2.f2633
                if (r0 != 0) goto L16
                r0 = 100
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
                boolean r0 = Yue.C6656.m25575(r2, r0, r1)
                if (r0 != 0) goto L16
                r0 = 1
                r2.f2633 = r0
                Yue.ۥۣ۟ۦۡ r0 = r2.f2635
                r0.mo5171()
            L16:
                Yue.ۥۣۣ۟۠ r0 = r2.f2634
                r0.close()
                return
        }

        @Override // Yue.InterfaceC5839
        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ */
        public Yue.C6250 mo4177() {
                r1 = this;
                Yue.ۥۣۣ۟۠ r0 = r1.f2634
                Yue.ۥۢۡۤۧ r0 = r0.mo4177()
                return r0
        }

        @Override // Yue.InterfaceC5839
        /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
        public long mo4179(@Yue.InterfaceC4418 Yue.C0843 r9, long r10) throws java.io.IOException {
                r8 = this;
                java.lang.String r0 = "sink"
                Yue.C3329.m13906(r9, r0)
                r0 = 1
                Yue.ۥۣۣ۟۠ r1 = r8.f2634     // Catch: java.io.IOException -> L35
                long r10 = r1.mo4179(r9, r10)     // Catch: java.io.IOException -> L35
                r1 = -1
                int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r3 != 0) goto L1e
                boolean r9 = r8.f2633
                if (r9 != 0) goto L1d
                r8.f2633 = r0
                Yue.ۥۣۣ۟۟ r9 = r8.f2636
                r9.close()
            L1d:
                return r1
            L1e:
                Yue.ۥۣۣ۟۟ r0 = r8.f2636
                Yue.ۥۣ۟ۢۨ r3 = r0.mo4810()
                long r0 = r9.m4889()
                long r4 = r0 - r10
                r2 = r9
                r6 = r10
                r2.m4825(r3, r4, r6)
                Yue.ۥۣۣ۟۟ r9 = r8.f2636
                r9.mo4837()
                return r10
            L35:
                r9 = move-exception
                boolean r10 = r8.f2633
                if (r10 != 0) goto L41
                r8.f2633 = r0
                Yue.ۥۣ۟ۦۡ r10 = r8.f2635
                r10.mo5171()
            L41:
                throw r9
        }
    }

    static {
            Yue.ۥۣ۟ۦ۠$ۥ r0 = new Yue.ۥۣ۟ۦ۠$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C0897.f2631 = r0
            return
    }

    public C0897(@Yue.InterfaceC4543 Yue.C0883 r1) {
            r0 = this;
            r0.<init>()
            r0.f2632 = r1
            return
    }

    @Override // Yue.InterfaceC3318
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.C5377 mo4781(@Yue.InterfaceC4418 Yue.InterfaceC3318.InterfaceC3319 r9) throws java.io.IOException {
            r8 = this;
            java.lang.String r0 = "chain"
            Yue.C3329.m13906(r9, r0)
            Yue.ۥۣ۟ۦۣ r0 = r9.call()
            Yue.ۥۣ۟ۥۧ r1 = r8.f2632
            r2 = 0
            if (r1 == 0) goto L17
            Yue.ۥۡۦۤۧ r3 = r9.mo13871()
            Yue.ۥۡۦۧ r1 = r1.m5142(r3)
            goto L18
        L17:
            r1 = r2
        L18:
            long r3 = java.lang.System.currentTimeMillis()
            Yue.ۥۣ۟ۦۢ$ۥ۟ r5 = new Yue.ۥۣ۟ۦۢ$ۥ۟
            Yue.ۥۡۦۤۧ r6 = r9.mo13871()
            r5.<init>(r3, r6, r1)
            Yue.ۥۣ۟ۦۢ r3 = r5.m5234()
            Yue.ۥۡۦۤۧ r4 = r3.m5231()
            Yue.ۥۡۦۧ r5 = r3.m5230()
            Yue.ۥۣ۟ۥۧ r6 = r8.f2632
            if (r6 == 0) goto L38
            r6.m5158(r3)
        L38:
            boolean r3 = r0 instanceof Yue.C5215
            if (r3 == 0) goto L3f
            r2 = r0
            Yue.ۥۡۦ۠ۤ r2 = (Yue.C5215) r2
        L3f:
            if (r2 == 0) goto L47
            Yue.ۥ۠ۡۡ۟ r2 = r2.m19684()
            if (r2 != 0) goto L49
        L47:
            Yue.ۥ۠ۡۡ۟ r2 = Yue.AbstractC2233.f6909
        L49:
            if (r1 == 0) goto L56
            if (r5 != 0) goto L56
            Yue.ۥۡۦۧ۟ r3 = r1.m20280()
            if (r3 == 0) goto L56
            Yue.C6656.m25567(r3)
        L56:
            if (r4 != 0) goto L95
            if (r5 != 0) goto L95
            Yue.ۥۡۦۧ$ۥ r1 = new Yue.ۥۡۦۧ$ۥ
            r1.<init>()
            Yue.ۥۡۦۤۧ r9 = r9.mo13871()
            Yue.ۥۡۦۧ$ۥ r9 = r1.m20333(r9)
            Yue.ۥۡۥۣۧ r1 = Yue.EnumC4981.f15839
            Yue.ۥۡۦۧ$ۥ r9 = r9.m20330(r1)
            r1 = 504(0x1f8, float:7.06E-43)
            Yue.ۥۡۦۧ$ۥ r9 = r9.m20309(r1)
            java.lang.String r1 = "Unsatisfiable Request (only-if-cached)"
            Yue.ۥۡۦۧ$ۥ r9 = r9.m20327(r1)
            Yue.ۥۡۦۧ۟ r1 = Yue.C6656.f23206
            Yue.ۥۡۦۧ$ۥ r9 = r9.m20304(r1)
            r3 = -1
            Yue.ۥۡۦۧ$ۥ r9 = r9.m20334(r3)
            long r3 = java.lang.System.currentTimeMillis()
            Yue.ۥۡۦۧ$ۥ r9 = r9.m20331(r3)
            Yue.ۥۡۦۧ r9 = r9.m20305()
            r2.mo10247(r0, r9)
            return r9
        L95:
            if (r4 != 0) goto Lb0
            Yue.C3329.m13903(r5)
            Yue.ۥۡۦۧ$ۥ r9 = r5.m20295()
            Yue.ۥۣ۟ۦ۠$ۥ r1 = Yue.C0897.f2631
            Yue.ۥۡۦۧ r1 = Yue.C0897.C0898.m5225(r1, r5)
            Yue.ۥۡۦۧ$ۥ r9 = r9.m20306(r1)
            Yue.ۥۡۦۧ r9 = r9.m20305()
            r2.mo10222(r0, r9)
            return r9
        Lb0:
            if (r5 == 0) goto Lb6
            r2.mo10221(r0, r5)
            goto Lbd
        Lb6:
            Yue.ۥۣ۟ۥۧ r3 = r8.f2632
            if (r3 == 0) goto Lbd
            r2.mo10223(r0)
        Lbd:
            Yue.ۥۡۦۧ r9 = r9.mo13878(r4)     // Catch: java.lang.Throwable -> L189
            if (r9 != 0) goto Lce
            if (r1 == 0) goto Lce
            Yue.ۥۡۦۧ۟ r1 = r1.m20280()
            if (r1 == 0) goto Lce
            Yue.C6656.m25567(r1)
        Lce:
            if (r5 == 0) goto L138
            if (r9 == 0) goto L12f
            int r1 = r9.m20284()
            r3 = 304(0x130, float:4.26E-43)
            if (r1 != r3) goto L12f
            Yue.ۥۡۦۧ$ۥ r1 = r5.m20295()
            Yue.ۥۣ۟ۦ۠$ۥ r3 = Yue.C0897.f2631
            Yue.ۥ۠ۤۢۢ r4 = r5.m20289()
            Yue.ۥ۠ۤۢۢ r6 = r9.m20289()
            Yue.ۥ۠ۤۢۢ r4 = Yue.C0897.C0898.m5224(r3, r4, r6)
            Yue.ۥۡۦۧ$ۥ r1 = r1.m20325(r4)
            long r6 = r9.m20301()
            Yue.ۥۡۦۧ$ۥ r1 = r1.m20334(r6)
            long r6 = r9.m20299()
            Yue.ۥۡۦۧ$ۥ r1 = r1.m20331(r6)
            Yue.ۥۡۦۧ r4 = Yue.C0897.C0898.m5225(r3, r5)
            Yue.ۥۡۦۧ$ۥ r1 = r1.m20306(r4)
            Yue.ۥۡۦۧ r3 = Yue.C0897.C0898.m5225(r3, r9)
            Yue.ۥۡۦۧ$ۥ r1 = r1.m20328(r3)
            Yue.ۥۡۦۧ r1 = r1.m20305()
            Yue.ۥۡۦۧ۟ r9 = r9.m20280()
            Yue.C3329.m13903(r9)
            r9.close()
            Yue.ۥۣ۟ۥۧ r9 = r8.f2632
            Yue.C3329.m13903(r9)
            r9.m5157()
            Yue.ۥۣ۟ۥۧ r9 = r8.f2632
            r9.m5159(r5, r1)
            r2.mo10222(r0, r1)
            return r1
        L12f:
            Yue.ۥۡۦۧ۟ r1 = r5.m20280()
            if (r1 == 0) goto L138
            Yue.C6656.m25567(r1)
        L138:
            Yue.C3329.m13903(r9)
            Yue.ۥۡۦۧ$ۥ r1 = r9.m20295()
            Yue.ۥۣ۟ۦ۠$ۥ r3 = Yue.C0897.f2631
            Yue.ۥۡۦۧ r6 = Yue.C0897.C0898.m5225(r3, r5)
            Yue.ۥۡۦۧ$ۥ r1 = r1.m20306(r6)
            Yue.ۥۡۦۧ r9 = Yue.C0897.C0898.m5225(r3, r9)
            Yue.ۥۡۦۧ$ۥ r9 = r1.m20328(r9)
            Yue.ۥۡۦۧ r9 = r9.m20305()
            Yue.ۥۣ۟ۥۧ r1 = r8.f2632
            if (r1 == 0) goto L188
            boolean r1 = Yue.C3163.m13408(r9)
            if (r1 == 0) goto L177
            Yue.ۥۣ۟ۦۢ$ۥ r1 = Yue.C0901.f2637
            boolean r1 = r1.m5232(r9, r4)
            if (r1 == 0) goto L177
            Yue.ۥۣ۟ۥۧ r1 = r8.f2632
            Yue.ۥۣ۟ۦۡ r1 = r1.m5151(r9)
            Yue.ۥۡۦۧ r9 = r8.m5222(r1, r9)
            if (r5 == 0) goto L176
            r2.mo10223(r0)
        L176:
            return r9
        L177:
            Yue.ۥۣ۠ۤۨ r0 = Yue.C3169.f10460
            java.lang.String r1 = r4.m20086()
            boolean r0 = r0.m13426(r1)
            if (r0 == 0) goto L188
            Yue.ۥۣ۟ۥۧ r0 = r8.f2632     // Catch: java.io.IOException -> L188
            r0.m5152(r4)     // Catch: java.io.IOException -> L188
        L188:
            return r9
        L189:
            r9 = move-exception
            if (r1 == 0) goto L195
            Yue.ۥۡۦۧ۟ r0 = r1.m20280()
            if (r0 == 0) goto L195
            Yue.C6656.m25567(r0)
        L195:
            throw r9
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C5377 m5222(Yue.InterfaceC0900 r5, Yue.C5377 r6) throws java.io.IOException {
            r4 = this;
            if (r5 != 0) goto L3
            return r6
        L3:
            Yue.ۥۣۢ۟ۡ r0 = r5.mo5170()
            Yue.ۥۡۦۧ۟ r1 = r6.m20280()
            Yue.C3329.m13903(r1)
            Yue.ۥۣۣ۟۠ r1 = r1.mo5165()
            Yue.ۥۣۣ۟۟ r0 = Yue.C4603.m18379(r0)
            Yue.ۥۣ۟ۦ۠$ۥ۟ r2 = new Yue.ۥۣ۟ۦ۠$ۥ۟
            r2.<init>(r1, r5, r0)
            java.lang.String r5 = "Content-Type"
            r0 = 2
            r1 = 0
            java.lang.String r5 = Yue.C5377.m20266(r6, r5, r1, r0, r1)
            Yue.ۥۡۦۧ۟ r0 = r6.m20280()
            long r0 = r0.mo5163()
            Yue.ۥۡۦۧ$ۥ r6 = r6.m20295()
            Yue.ۥۡۦ۠ۨ r3 = new Yue.ۥۡۦ۠ۨ
            Yue.ۥۣۣ۟۠ r2 = Yue.C4603.m18380(r2)
            r3.<init>(r5, r0, r2)
            Yue.ۥۡۦۧ$ۥ r5 = r6.m20304(r3)
            Yue.ۥۡۦۧ r5 = r5.m20305()
            return r5
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C0883 m5223() {
            r1 = this;
            Yue.ۥۣ۟ۥۧ r0 = r1.f2632
            return r0
    }
}
