package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3919 implements Yue.InterfaceC3916 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.regex.Matcher f12454;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.CharSequence f12455;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC3914 f12456;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public java.util.List<java.lang.String> f12457;

    /* JADX INFO: renamed from: Yue.ۥۡ۟۟۟$ۥ, reason: contains not printable characters */
    public static final class C3920 extends Yue.AbstractC0052<java.lang.String> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3919 f12458;

        public C3920(Yue.C3919 r1) {
                r0 = this;
                r0.f12458 = r1
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC0041, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.String
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.String r2 = (java.lang.String) r2
                boolean r2 = r1.m15895(r2)
                return r2
        }

        @Override // Yue.AbstractC0052, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.String r1 = r0.m15892(r1)
                return r1
        }

        @Override // Yue.AbstractC0052, java.util.List
        public final /* bridge */ int indexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.String
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.String r2 = (java.lang.String) r2
                int r2 = r1.m15893(r2)
                return r2
        }

        @Override // Yue.AbstractC0052, java.util.List
        public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.String
                if (r0 != 0) goto L6
                r2 = -1
                return r2
            L6:
                java.lang.String r2 = (java.lang.String) r2
                int r2 = r1.m15894(r2)
                return r2
        }

        @Override // Yue.AbstractC0052, Yue.AbstractC0041
        /* JADX INFO: renamed from: ۥ */
        public int mo368() {
                r1 = this;
                Yue.ۥۡ۟۟۟ r0 = r1.f12458
                java.util.regex.MatchResult r0 = Yue.C3919.m15890(r0)
                int r0 = r0.groupCount()
                int r0 = r0 + 1
                return r0
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.lang.String m15892(int r2) {
                r1 = this;
                Yue.ۥۡ۟۟۟ r0 = r1.f12458
                java.util.regex.MatchResult r0 = Yue.C3919.m15890(r0)
                java.lang.String r2 = r0.group(r2)
                if (r2 != 0) goto Le
                java.lang.String r2 = ""
            Le:
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public /* bridge */ int m15893(java.lang.String r1) {
                r0 = this;
                int r1 = super.indexOf(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public /* bridge */ int m15894(java.lang.String r1) {
                r0 = this;
                int r1 = super.lastIndexOf(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public /* bridge */ boolean m15895(java.lang.String r1) {
                r0 = this;
                boolean r1 = super.contains(r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡ۟۟۟$ۥ۟, reason: contains not printable characters */
    public static final class C3921 extends Yue.AbstractC0041<Yue.C3913> implements Yue.InterfaceC3915 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3919 f12459;

        /* JADX INFO: renamed from: Yue.ۥۡ۟۟۟$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C3922 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<java.lang.Integer, Yue.C3913> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.C3919.C3921 f12460;

            public C3922(Yue.C3919.C3921 r1) {
                    r0 = this;
                    r0.f12460 = r1
                    r1 = 1
                    r0.<init>(r1)
                    return
            }

            @Override // Yue.InterfaceC2825
            public /* bridge */ /* synthetic */ Yue.C3913 invoke(java.lang.Integer r1) {
                    r0 = this;
                    java.lang.Number r1 = (java.lang.Number) r1
                    int r1 = r1.intValue()
                    Yue.ۥ۠ۨۨۨ r1 = r0.m15897(r1)
                    return r1
            }

            @Yue.InterfaceC4543
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public final Yue.C3913 m15897(int r2) {
                    r1 = this;
                    Yue.ۥۡ۟۟۟$ۥ۟ r0 = r1.f12460
                    Yue.ۥ۠ۨۨۨ r2 = r0.get(r2)
                    return r2
            }
        }

        public C3921(Yue.C3919 r1) {
                r0 = this;
                r0.f12459 = r1
                r0.<init>()
                return
        }

        @Override // Yue.AbstractC0041, java.util.Collection
        public final /* bridge */ boolean contains(java.lang.Object r2) {
                r1 = this;
                if (r2 != 0) goto L4
                r0 = 1
                goto L6
            L4:
                boolean r0 = r2 instanceof Yue.C3913
            L6:
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                Yue.ۥ۠ۨۨۨ r2 = (Yue.C3913) r2
                boolean r2 = r1.m15896(r2)
                return r2
        }

        @Override // Yue.InterfaceC3914
        @Yue.InterfaceC4543
        public Yue.C3913 get(int r4) {
                r3 = this;
                Yue.ۥۡ۟۟۟ r0 = r3.f12459
                java.util.regex.MatchResult r0 = Yue.C3919.m15890(r0)
                Yue.ۥ۠ۥۣۨ r0 = Yue.C5292.m19978(r0, r4)
                java.lang.Integer r1 = r0.m13748()
                int r1 = r1.intValue()
                if (r1 < 0) goto L29
                Yue.ۥ۠ۨۨۨ r1 = new Yue.ۥ۠ۨۨۨ
                Yue.ۥۡ۟۟۟ r2 = r3.f12459
                java.util.regex.MatchResult r2 = Yue.C3919.m15890(r2)
                java.lang.String r4 = r2.group(r4)
                java.lang.String r2 = "matchResult.group(index)"
                Yue.C3329.m13905(r4, r2)
                r1.<init>(r4, r0)
                goto L2a
            L29:
                r1 = 0
            L2a:
                return r1
        }

        @Override // Yue.InterfaceC3915
        @Yue.InterfaceC4543
        public Yue.C3913 get(@Yue.InterfaceC4418 java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "name"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥۡۤۡۤ r0 = Yue.C4778.f15131
                Yue.ۥۡ۟۟۟ r1 = r2.f12459
                java.util.regex.MatchResult r1 = Yue.C3919.m15890(r1)
                Yue.ۥ۠ۨۨۨ r3 = r0.mo13963(r1, r3)
                return r3
        }

        @Override // Yue.AbstractC0041, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // Yue.AbstractC0041, java.util.Collection, java.lang.Iterable
        @Yue.InterfaceC4418
        public java.util.Iterator<Yue.C3913> iterator() {
                r2 = this;
                Yue.ۥ۠ۥۣۨ r0 = Yue.C1208.m6211(r2)
                Yue.ۥۡۨۢ r0 = Yue.C1219.m6308(r0)
                Yue.ۥۡ۟۟۟$ۥ۟$ۥ r1 = new Yue.ۥۡ۟۟۟$ۥ۟$ۥ
                r1.<init>(r2)
                Yue.ۥۡۨۢ r0 = Yue.C5629.m21101(r0, r1)
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        @Override // Yue.AbstractC0041
        /* JADX INFO: renamed from: ۥ */
        public int mo368() {
                r1 = this;
                Yue.ۥۡ۟۟۟ r0 = r1.f12459
                java.util.regex.MatchResult r0 = Yue.C3919.m15890(r0)
                int r0 = r0.groupCount()
                int r0 = r0 + 1
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public /* bridge */ boolean m15896(Yue.C3913 r1) {
                r0 = this;
                boolean r1 = super.contains(r1)
                return r1
        }
    }

    public C3919(@Yue.InterfaceC4418 java.util.regex.Matcher r2, @Yue.InterfaceC4418 java.lang.CharSequence r3) {
            r1 = this;
            java.lang.String r0 = "matcher"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "input"
            Yue.C3329.m13906(r3, r0)
            r1.<init>()
            r1.f12454 = r2
            r1.f12455 = r3
            Yue.ۥۡ۟۟۟$ۥ۟ r2 = new Yue.ۥۡ۟۟۟$ۥ۟
            r2.<init>(r1)
            r1.f12456 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.regex.MatchResult m15890(Yue.C3919 r0) {
            java.util.regex.MatchResult r0 = r0.m15891()
            return r0
    }

    @Override // Yue.InterfaceC3916
    @Yue.InterfaceC4418
    public Yue.C3279 getRange() {
            r1 = this;
            java.util.regex.MatchResult r0 = r1.m15891()
            Yue.ۥ۠ۥۣۨ r0 = Yue.C5292.m19977(r0)
            return r0
    }

    @Override // Yue.InterfaceC3916
    @Yue.InterfaceC4418
    public java.lang.String getValue() {
            r2 = this;
            java.util.regex.MatchResult r0 = r2.m15891()
            java.lang.String r0 = r0.group()
            java.lang.String r1 = "matchResult.group()"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Override // Yue.InterfaceC3916
    @Yue.InterfaceC4543
    public Yue.InterfaceC3916 next() {
            r3 = this;
            java.util.regex.MatchResult r0 = r3.m15891()
            int r0 = r0.end()
            java.util.regex.MatchResult r1 = r3.m15891()
            int r1 = r1.end()
            java.util.regex.MatchResult r2 = r3.m15891()
            int r2 = r2.start()
            if (r1 != r2) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            int r0 = r0 + r1
            java.lang.CharSequence r1 = r3.f12455
            int r1 = r1.length()
            if (r0 > r1) goto L3e
            java.util.regex.Matcher r1 = r3.f12454
            java.util.regex.Pattern r1 = r1.pattern()
            java.lang.CharSequence r2 = r3.f12455
            java.util.regex.Matcher r1 = r1.matcher(r2)
            java.lang.String r2 = "matcher.pattern().matcher(input)"
            Yue.C3329.m13905(r1, r2)
            java.lang.CharSequence r2 = r3.f12455
            Yue.ۥۡ۟۟ r0 = Yue.C5292.m19975(r1, r0, r2)
            goto L3f
        L3e:
            r0 = 0
        L3f:
            return r0
    }

    @Override // Yue.InterfaceC3916
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.InterfaceC3916.C3918 mo15874() {
            r1 = this;
            Yue.ۥۡ۟۟$ۥ۟ r0 = Yue.InterfaceC3916.C3917.m15877(r1)
            return r0
    }

    @Override // Yue.InterfaceC3916
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ */
    public java.util.List<java.lang.String> mo15875() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.f12457
            if (r0 != 0) goto Lb
            Yue.ۥۡ۟۟۟$ۥ r0 = new Yue.ۥۡ۟۟۟$ۥ
            r0.<init>(r1)
            r1.f12457 = r0
        Lb:
            java.util.List<java.lang.String> r0 = r1.f12457
            Yue.C3329.m13903(r0)
            return r0
    }

    @Override // Yue.InterfaceC3916
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Yue.InterfaceC3914 mo15876() {
            r1 = this;
            Yue.ۥۡ r0 = r1.f12456
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.util.regex.MatchResult m15891() {
            r1 = this;
            java.util.regex.Matcher r0 = r1.f12454
            return r0
    }
}
