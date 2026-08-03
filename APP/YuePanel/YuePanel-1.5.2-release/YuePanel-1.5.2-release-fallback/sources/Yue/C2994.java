package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2994 implements java.lang.Iterable<Yue.C4677<? extends java.lang.String, ? extends java.lang.String>>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C2994.C2996 f9667 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String[] f9668;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۢۢ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,458:1\n1#2:459\n37#3,2:460\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n*L\n359#1:460,2\n*E\n"})
    public static final class C2995 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public final java.util.List<java.lang.String> f9669;

        public C2995() {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 20
                r0.<init>(r1)
                r2.f9669 = r0
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C2994.C2995 m12688(@Yue.InterfaceC4418 java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "line"
                Yue.C3329.m13906(r8, r0)
                r5 = 6
                r6 = 0
                r2 = 58
                r3 = 0
                r4 = 0
                r1 = r8
                int r0 = Yue.C5989.m22363(r1, r2, r3, r4, r5, r6)
                r1 = -1
                if (r0 == r1) goto L34
                r1 = 0
                java.lang.String r1 = r8.substring(r1, r0)
                java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
                Yue.C3329.m13905(r1, r2)
                java.lang.CharSequence r1 = Yue.C5989.m22481(r1)
                java.lang.String r1 = r1.toString()
                int r0 = r0 + 1
                java.lang.String r8 = r8.substring(r0)
                java.lang.String r0 = "this as java.lang.String).substring(startIndex)"
                Yue.C3329.m13905(r8, r0)
                r7.m12689(r1, r8)
                return r7
            L34:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unexpected header: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r0.<init>(r8)
                throw r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C2994.C2995 m12689(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥ۠ۤۢۢ$ۥ۟ r0 = Yue.C2994.f9667
                Yue.C2994.C2996.m12703(r0, r2)
                Yue.C2994.C2996.m12704(r0, r3, r2)
                r1.m12694(r2, r3)
                return r1
        }

        @Yue.InterfaceC4418
        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.C2994.C2995 m12690(@Yue.InterfaceC4418 java.lang.String r4, @Yue.InterfaceC4418 java.time.Instant r5) {
                r3 = this;
                java.lang.String r0 = "name"
                Yue.C3329.m13906(r4, r0)
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r5, r0)
                java.util.Date r0 = new java.util.Date
                long r1 = r5.toEpochMilli()
                r0.<init>(r1)
                r3.m12691(r4, r0)
                return r3
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Yue.C2994.C2995 m12691(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.util.Date r3) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r3 = Yue.C1733.m8245(r3)
                r1.m12689(r2, r3)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final Yue.C2994.C2995 m12692(@Yue.InterfaceC4418 Yue.C2994 r5) {
                r4 = this;
                java.lang.String r0 = "headers"
                Yue.C3329.m13906(r5, r0)
                int r0 = r5.size()
                r1 = 0
            La:
                if (r1 >= r0) goto L1a
                java.lang.String r2 = r5.m12682(r1)
                java.lang.String r3 = r5.m12686(r1)
                r4.m12694(r2, r3)
                int r1 = r1 + 1
                goto La
            L1a:
                return r4
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final Yue.C2994.C2995 m12693(@Yue.InterfaceC4418 java.lang.String r8) {
                r7 = this;
                java.lang.String r0 = "line"
                Yue.C3329.m13906(r8, r0)
                r5 = 4
                r6 = 0
                r2 = 58
                r3 = 1
                r4 = 0
                r1 = r8
                int r0 = Yue.C5989.m22363(r1, r2, r3, r4, r5, r6)
                r1 = -1
                java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
                if (r0 == r1) goto L2a
                java.lang.String r1 = r8.substring(r4, r0)
                java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
                Yue.C3329.m13905(r1, r4)
                int r0 = r0 + r3
                java.lang.String r8 = r8.substring(r0)
                Yue.C3329.m13905(r8, r2)
                r7.m12694(r1, r8)
                goto L42
            L2a:
                char r0 = r8.charAt(r4)
                r1 = 58
                java.lang.String r4 = ""
                if (r0 != r1) goto L3f
                java.lang.String r8 = r8.substring(r3)
                Yue.C3329.m13905(r8, r2)
                r7.m12694(r4, r8)
                goto L42
            L3f:
                r7.m12694(r4, r8)
            L42:
                return r7
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final Yue.C2994.C2995 m12694(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r3, r0)
                java.util.List<java.lang.String> r0 = r1.f9669
                r0.add(r2)
                java.util.List<java.lang.String> r2 = r1.f9669
                java.lang.CharSequence r3 = Yue.C5989.m22481(r3)
                java.lang.String r3 = r3.toString()
                r2.add(r3)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final Yue.C2994.C2995 m12695(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥ۠ۤۢۢ$ۥ۟ r0 = Yue.C2994.f9667
                Yue.C2994.C2996.m12703(r0, r2)
                r1.m12694(r2, r3)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final Yue.C2994 m12696() {
                r3 = this;
                Yue.ۥ۠ۤۢۢ r0 = new Yue.ۥ۠ۤۢۢ
                java.util.List<java.lang.String> r1 = r3.f9669
                r2 = 0
                java.lang.String[] r2 = new java.lang.String[r2]
                java.lang.Object[] r1 = r1.toArray(r2)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final java.lang.String m12697(@Yue.InterfaceC4418 java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = "name"
                Yue.C3329.m13906(r5, r0)
                java.util.List<java.lang.String> r0 = r4.f9669
                int r0 = r0.size()
                int r0 = r0 + (-2)
                r1 = 0
                r2 = -2
                int r1 = Yue.C4968.m19395(r0, r1, r2)
                if (r1 > r0) goto L33
            L15:
                java.util.List<java.lang.String> r2 = r4.f9669
                java.lang.Object r2 = r2.get(r0)
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                boolean r2 = Yue.C5988.m22281(r5, r2, r3)
                if (r2 == 0) goto L2e
                java.util.List<java.lang.String> r5 = r4.f9669
                int r0 = r0 + r3
                java.lang.Object r5 = r5.get(r0)
                java.lang.String r5 = (java.lang.String) r5
                return r5
            L2e:
                if (r0 == r1) goto L33
                int r0 = r0 + (-2)
                goto L15
            L33:
                r5 = 0
                return r5
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final java.util.List<java.lang.String> m12698() {
                r1 = this;
                java.util.List<java.lang.String> r0 = r1.f9669
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final Yue.C2994.C2995 m12699(@Yue.InterfaceC4418 java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "name"
                Yue.C3329.m13906(r4, r0)
                r0 = 0
            L6:
                java.util.List<java.lang.String> r1 = r3.f9669
                int r1 = r1.size()
                if (r0 >= r1) goto L2c
                java.util.List<java.lang.String> r1 = r3.f9669
                java.lang.Object r1 = r1.get(r0)
                java.lang.String r1 = (java.lang.String) r1
                r2 = 1
                boolean r1 = Yue.C5988.m22281(r4, r1, r2)
                if (r1 == 0) goto L29
                java.util.List<java.lang.String> r1 = r3.f9669
                r1.remove(r0)
                java.util.List<java.lang.String> r1 = r3.f9669
                r1.remove(r0)
                int r0 = r0 + (-2)
            L29:
                int r0 = r0 + 2
                goto L6
            L2c:
                return r3
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final Yue.C2994.C2995 m12700(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥ۠ۤۢۢ$ۥ۟ r0 = Yue.C2994.f9667
                Yue.C2994.C2996.m12703(r0, r2)
                Yue.C2994.C2996.m12704(r0, r3, r2)
                r1.m12699(r2)
                r1.m12694(r2, r3)
                return r1
        }

        @Yue.InterfaceC4418
        @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final Yue.C2994.C2995 m12701(@Yue.InterfaceC4418 java.lang.String r4, @Yue.InterfaceC4418 java.time.Instant r5) {
                r3 = this;
                java.lang.String r0 = "name"
                Yue.C3329.m13906(r4, r0)
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r5, r0)
                java.util.Date r0 = new java.util.Date
                long r1 = r5.toEpochMilli()
                r0.<init>(r1)
                Yue.ۥ۠ۤۢۢ$ۥ r4 = r3.m12702(r4, r0)
                return r4
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final Yue.C2994.C2995 m12702(@Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4418 java.util.Date r3) {
                r1 = this;
                java.lang.String r0 = "name"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r0 = "value"
                Yue.C3329.m13906(r3, r0)
                java.lang.String r3 = Yue.C1733.m8245(r3)
                r1.m12700(r2, r3)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۢۢ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n1#2:459\n*E\n"})
    public static final class C2996 {
        public C2996() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C2996(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final /* synthetic */ void m12703(Yue.C2994.C2996 r0, java.lang.String r1) {
                r0.m12708(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final /* synthetic */ void m12704(Yue.C2994.C2996 r0, java.lang.String r1, java.lang.String r2) {
                r0.m12709(r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final /* synthetic */ java.lang.String m12705(Yue.C2994.C2996 r0, java.lang.String[] r1, java.lang.String r2) {
                java.lang.String r0 = r0.m12710(r1, r2)
                return r0
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "function moved to extension", replaceWith = @Yue.InterfaceC5313(expression = "headers.toHeaders()", imports = {}))
        @Yue.InterfaceC3421(name = "-deprecated_of")
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C2994 m12706(@Yue.InterfaceC4418 java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                java.lang.String r0 = "headers"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥ۠ۤۢۢ r2 = r1.m12711(r2)
                return r2
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "function name changed", replaceWith = @Yue.InterfaceC5313(expression = "headersOf(*namesAndValues)", imports = {}))
        @Yue.InterfaceC3421(name = "-deprecated_of")
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C2994 m12707(@Yue.InterfaceC4418 java.lang.String... r2) {
                r1 = this;
                java.lang.String r0 = "namesAndValues"
                Yue.C3329.m13906(r2, r0)
                int r0 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
                java.lang.String[] r2 = (java.lang.String[]) r2
                Yue.ۥ۠ۤۢۢ r2 = r1.m12712(r2)
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m12708(java.lang.String r5) {
                r4 = this;
                int r0 = r5.length()
                if (r0 <= 0) goto L39
                int r0 = r5.length()
                r1 = 0
            Lb:
                if (r1 >= r0) goto L38
                char r2 = r5.charAt(r1)
                r3 = 33
                if (r3 > r2) goto L1c
                r3 = 127(0x7f, float:1.78E-43)
                if (r2 >= r3) goto L1c
                int r1 = r1 + 1
                goto Lb
            L1c:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r5 = new java.lang.Object[]{r0, r1, r5}
                java.lang.String r0 = "Unexpected char %#04x at %d in header name: %s"
                java.lang.String r5 = Yue.C6656.m25577(r0, r5)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r5 = r5.toString()
                r0.<init>(r5)
                throw r0
            L38:
                return
            L39:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "name is empty"
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final void m12709(java.lang.String r5, java.lang.String r6) {
                r4 = this;
                int r0 = r5.length()
                r1 = 0
            L5:
                if (r1 >= r0) goto L60
                char r2 = r5.charAt(r1)
                r3 = 9
                if (r2 == r3) goto L5d
                r3 = 32
                if (r3 > r2) goto L18
                r3 = 127(0x7f, float:1.78E-43)
                if (r2 >= r3) goto L18
                goto L5d
            L18:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r6}
                java.lang.String r2 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r1 = Yue.C6656.m25577(r2, r1)
                r0.append(r1)
                boolean r6 = Yue.C6656.m25593(r6)
                if (r6 == 0) goto L3b
                java.lang.String r5 = ""
                goto L4c
            L3b:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r1 = ": "
                r6.append(r1)
                r6.append(r5)
                java.lang.String r5 = r6.toString()
            L4c:
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r5 = r5.toString()
                r6.<init>(r5)
                throw r6
            L5d:
                int r1 = r1 + 1
                goto L5
            L60:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final java.lang.String m12710(java.lang.String[] r5, java.lang.String r6) {
                r4 = this;
                int r0 = r5.length
                int r0 = r0 + (-2)
                r1 = 0
                r2 = -2
                int r1 = Yue.C4968.m19395(r0, r1, r2)
                if (r1 > r0) goto L1d
            Lb:
                r2 = r5[r0]
                r3 = 1
                boolean r2 = Yue.C5988.m22281(r6, r2, r3)
                if (r2 == 0) goto L18
                int r0 = r0 + r3
                r5 = r5[r0]
                return r5
            L18:
                if (r0 == r1) goto L1d
                int r0 = r0 + (-2)
                goto Lb
            L1d:
                r5 = 0
                return r5
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC3421(name = "of")
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final Yue.C2994 m12711(@Yue.InterfaceC4418 java.util.Map<java.lang.String, java.lang.String> r5) {
                r4 = this;
                java.lang.String r0 = "<this>"
                Yue.C3329.m13906(r5, r0)
                int r0 = r5.size()
                int r0 = r0 * 2
                java.lang.String[] r0 = new java.lang.String[r0]
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
                r1 = 0
            L16:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L4d
                java.lang.Object r2 = r5.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r2 = r2.getValue()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.CharSequence r3 = Yue.C5989.m22481(r3)
                java.lang.String r3 = r3.toString()
                java.lang.CharSequence r2 = Yue.C5989.m22481(r2)
                java.lang.String r2 = r2.toString()
                r4.m12708(r3)
                r4.m12709(r2, r3)
                r0[r1] = r3
                int r3 = r1 + 1
                r0[r3] = r2
                int r1 = r1 + 2
                goto L16
            L4d:
                Yue.ۥ۠ۤۢۢ r5 = new Yue.ۥ۠ۤۢۢ
                r1 = 0
                r5.<init>(r0, r1)
                return r5
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        @Yue.InterfaceC3421(name = "of")
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final Yue.C2994 m12712(@Yue.InterfaceC4418 java.lang.String... r6) {
                r5 = this;
                java.lang.String r0 = "namesAndValues"
                Yue.C3329.m13906(r6, r0)
                int r0 = r6.length
                r1 = 2
                int r0 = r0 % r1
                if (r0 != 0) goto L53
                java.lang.Object r6 = r6.clone()
                java.lang.String[] r6 = (java.lang.String[]) r6
                int r0 = r6.length
                r2 = 0
                r3 = r2
            L13:
                if (r3 >= r0) goto L32
                r4 = r6[r3]
                if (r4 == 0) goto L26
                java.lang.CharSequence r4 = Yue.C5989.m22481(r4)
                java.lang.String r4 = r4.toString()
                r6[r3] = r4
                int r3 = r3 + 1
                goto L13
            L26:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Headers cannot be null"
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L32:
                int r0 = r6.length
                int r0 = r0 + (-1)
                int r0 = Yue.C4968.m19395(r2, r0, r1)
                if (r0 < 0) goto L4c
            L3b:
                r1 = r6[r2]
                int r3 = r2 + 1
                r3 = r6[r3]
                r5.m12708(r1)
                r5.m12709(r3, r1)
                if (r2 == r0) goto L4c
                int r2 = r2 + 2
                goto L3b
            L4c:
                Yue.ۥ۠ۤۢۢ r0 = new Yue.ۥ۠ۤۢۢ
                r1 = 0
                r0.<init>(r6, r1)
                return r0
            L53:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Expected alternating header names and values"
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
        }
    }

    static {
            Yue.ۥ۠ۤۢۢ$ۥ۟ r0 = new Yue.ۥ۠ۤۢۢ$ۥ۟
            r1 = 0
            r0.<init>(r1)
            Yue.C2994.f9667 = r0
            return
    }

    public C2994(java.lang.String[] r1) {
            r0 = this;
            r0.<init>()
            r0.f9668 = r1
            return
    }

    public /* synthetic */ C2994(java.lang.String[] r1, Yue.C1769 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC3421(name = "of")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final Yue.C2994 m12675(@Yue.InterfaceC4418 java.util.Map<java.lang.String, java.lang.String> r1) {
            Yue.ۥ۠ۤۢۢ$ۥ۟ r0 = Yue.C2994.f9667
            Yue.ۥ۠ۤۢۢ r1 = r0.m12711(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    @Yue.InterfaceC3421(name = "of")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Yue.C2994 m12676(@Yue.InterfaceC4418 java.lang.String... r1) {
            Yue.ۥ۠ۤۢۢ$ۥ۟ r0 = Yue.C2994.f9667
            Yue.ۥ۠ۤۢۢ r1 = r0.m12712(r1)
            return r1
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C2994
            if (r0 == 0) goto L12
            java.lang.String[] r0 = r1.f9668
            Yue.ۥ۠ۤۢۢ r2 = (Yue.C2994) r2
            java.lang.String[] r2 = r2.f9668
            boolean r2 = java.util.Arrays.equals(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String[] r0 = r1.f9668
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // java.lang.Iterable
    @Yue.InterfaceC4418
    public java.util.Iterator<Yue.C4677<? extends java.lang.String, ? extends java.lang.String>> iterator() {
            r5 = this;
            int r0 = r5.size()
            Yue.ۥۣۡۦ۠[] r1 = new Yue.C4677[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L1a
            java.lang.String r3 = r5.m12682(r2)
            java.lang.String r4 = r5.m12686(r2)
            Yue.ۥۣۡۦ۠ r3 = Yue.C6456.m23777(r3, r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L1a:
            java.util.Iterator r0 = Yue.C0569.m2009(r1)
            return r0
    }

    @Yue.InterfaceC3421(name = "size")
    public final int size() {
            r1 = this;
            java.lang.String[] r0 = r1.f9668
            int r0 = r0.length
            int r0 = r0 / 2
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L2f
            java.lang.String r3 = r6.m12682(r2)
            java.lang.String r4 = r6.m12686(r2)
            r0.append(r3)
            java.lang.String r5 = ": "
            r0.append(r5)
            boolean r3 = Yue.C6656.m25593(r3)
            if (r3 == 0) goto L24
            java.lang.String r4 = "██"
        L24:
            r0.append(r4)
            java.lang.String r3 = "\n"
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L2f:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "moved to val", replaceWith = @Yue.InterfaceC5313(expression = "size", imports = {}))
    @Yue.InterfaceC3421(name = "-deprecated_size")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int m12677() {
            r1 = this;
            int r0 = r1.size()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final long m12678() {
            r6 = this;
            java.lang.String[] r0 = r6.f9668
            int r1 = r0.length
            int r1 = r1 * 2
            long r1 = (long) r1
            int r0 = r0.length
            r3 = 0
        L8:
            if (r3 >= r0) goto L17
            java.lang.String[] r4 = r6.f9668
            r4 = r4[r3]
            int r4 = r4.length()
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L8
        L17:
            return r1
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.String m12679(@Yue.InterfaceC4418 java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥ۠ۤۢۢ$ۥ۟ r0 = Yue.C2994.f9667
            java.lang.String[] r1 = r2.f9668
            java.lang.String r3 = Yue.C2994.C2996.m12705(r0, r1, r3)
            return r3
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.util.Date m12680(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = r1.m12679(r2)
            if (r2 == 0) goto L10
            java.util.Date r2 = Yue.C1733.m8244(r2)
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    @Yue.InterfaceC4543
    @org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.time.Instant m12681(@Yue.InterfaceC4418 java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            java.util.Date r2 = r1.m12680(r2)
            if (r2 == 0) goto L10
            java.time.Instant r2 = r2.toInstant()
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.lang.String m12682(int r2) {
            r1 = this;
            java.lang.String[] r0 = r1.f9668
            int r2 = r2 * 2
            r2 = r0[r2]
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final java.util.Set<java.lang.String> m12683() {
            r4 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            Yue.ۥۢ۠ۡ۟ r1 = Yue.C5968.f21745
            java.util.Comparator r1 = Yue.C5988.m22287(r1)
            r0.<init>(r1)
            int r1 = r4.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L1c
            java.lang.String r3 = r4.m12682(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L10
        L1c:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            java.lang.String r1 = "unmodifiableSet(result)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Yue.C2994.C2995 m12684() {
            r3 = this;
            Yue.ۥ۠ۤۢۢ$ۥ r0 = new Yue.ۥ۠ۤۢۢ$ۥ
            r0.<init>()
            java.util.List r1 = r0.m12698()
            java.lang.String[] r2 = r3.f9668
            Yue.C1216.m6248(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> m12685() {
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            Yue.ۥۢ۠ۡ۟ r1 = Yue.C5968.f21745
            java.util.Comparator r1 = Yue.C5988.m22287(r1)
            r0.<init>(r1)
            int r1 = r6.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L41
            java.lang.String r3 = r6.m12682(r2)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r5 = "US"
            Yue.C3329.m13905(r4, r5)
            java.lang.String r3 = r3.toLowerCase(r4)
            java.lang.String r4 = "this as java.lang.String).toLowerCase(locale)"
            Yue.C3329.m13905(r3, r4)
            java.lang.Object r4 = r0.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L37
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 2
            r4.<init>(r5)
            r0.put(r3, r4)
        L37:
            java.lang.String r3 = r6.m12686(r2)
            r4.add(r3)
            int r2 = r2 + 1
            goto L10
        L41:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final java.lang.String m12686(int r2) {
            r1 = this;
            java.lang.String[] r0 = r1.f9668
            int r2 = r2 * 2
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final java.util.List<java.lang.String> m12687(@Yue.InterfaceC4418 java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r6, r0)
            int r0 = r5.size()
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L2a
            java.lang.String r3 = r5.m12682(r2)
            r4 = 1
            boolean r3 = Yue.C5988.m22281(r6, r3, r4)
            if (r3 == 0) goto L27
            if (r1 != 0) goto L20
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 2
            r1.<init>(r3)
        L20:
            java.lang.String r3 = r5.m12686(r2)
            r1.add(r3)
        L27:
            int r2 = r2 + 1
            goto Lb
        L2a:
            if (r1 == 0) goto L36
            java.util.List r6 = java.util.Collections.unmodifiableList(r1)
            java.lang.String r0 = "{\n      Collections.unmodifiableList(result)\n    }"
            Yue.C3329.m13905(r6, r0)
            goto L3a
        L36:
            java.util.List r6 = Yue.C1208.m6210()
        L3a:
            return r6
    }
}
