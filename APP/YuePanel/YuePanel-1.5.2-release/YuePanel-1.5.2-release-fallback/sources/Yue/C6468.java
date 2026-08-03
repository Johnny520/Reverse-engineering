package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.4")
@Yue.InterfaceC5840({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
public final class C6468 implements Yue.InterfaceC3476 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C6468.C6469 f22767 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.Object f22768;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.String f22769;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.EnumC3480 f22770;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean f22771;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public volatile java.util.List<? extends Yue.InterfaceC3473> f22772;

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۡ$ۥ, reason: contains not printable characters */
    public static final class C6469 {

        /* JADX INFO: renamed from: Yue.ۥۣۢۢۡ$ۥ$ۥ, reason: contains not printable characters */
        public /* synthetic */ class C6470 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public static final /* synthetic */ int[] f22773 = null;

            static {
                    Yue.ۥ۠ۦۤۧ[] r0 = Yue.EnumC3480.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    Yue.ۥ۠ۦۤۧ r1 = Yue.EnumC3480.f10905     // Catch: java.lang.NoSuchFieldError -> L10
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                    r2 = 1
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
                L10:
                    Yue.ۥ۠ۦۤۧ r1 = Yue.EnumC3480.f10906     // Catch: java.lang.NoSuchFieldError -> L19
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                    r2 = 2
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
                L19:
                    Yue.ۥ۠ۦۤۧ r1 = Yue.EnumC3480.f10907     // Catch: java.lang.NoSuchFieldError -> L22
                    int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                    r2 = 3
                    r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                L22:
                    Yue.C6468.C6469.C6470.f22773 = r0
                    return
            }
        }

        public C6469() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C6469(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String m23857(@Yue.InterfaceC4418 Yue.InterfaceC3476 r4) {
                r3 = this;
                java.lang.String r0 = "typeParameter"
                Yue.C3329.m13906(r4, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                Yue.ۥ۠ۦۤۧ r1 = r4.mo14258()
                int[] r2 = Yue.C6468.C6469.C6470.f22773
                int r1 = r1.ordinal()
                r1 = r2[r1]
                r2 = 2
                if (r1 == r2) goto L23
                r2 = 3
                if (r1 == r2) goto L1d
                goto L28
            L1d:
                java.lang.String r1 = "out "
                r0.append(r1)
                goto L28
            L23:
                java.lang.String r1 = "in "
                r0.append(r1)
            L28:
                java.lang.String r4 = r4.getName()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
                Yue.C3329.m13905(r4, r0)
                return r4
        }
    }

    static {
            Yue.ۥۣۢۢۡ$ۥ r0 = new Yue.ۥۣۢۢۡ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C6468.f22767 = r0
            return
    }

    public C6468(@Yue.InterfaceC4543 java.lang.Object r2, @Yue.InterfaceC4418 java.lang.String r3, @Yue.InterfaceC4418 Yue.EnumC3480 r4, boolean r5) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "variance"
            Yue.C3329.m13906(r4, r0)
            r1.<init>()
            r1.f22768 = r2
            r1.f22769 = r3
            r1.f22770 = r4
            r1.f22771 = r5
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m23855() {
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C6468
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.f22768
            Yue.ۥۣۢۢۡ r3 = (Yue.C6468) r3
            java.lang.Object r1 = r3.f22768
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L20
            java.lang.String r0 = r2.getName()
            java.lang.String r3 = r3.getName()
            boolean r3 = Yue.C3329.m13897(r0, r3)
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            return r3
    }

    @Override // Yue.InterfaceC3476
    @Yue.InterfaceC4418
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f22769
            return r0
    }

    @Override // Yue.InterfaceC3476
    @Yue.InterfaceC4418
    public java.util.List<Yue.InterfaceC3473> getUpperBounds() {
            r1 = this;
            java.util.List<? extends Yue.ۥ۠ۦۣۤ> r0 = r1.f22772
            if (r0 != 0) goto L10
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            Yue.ۥ۠ۦۣۤ r0 = Yue.C5277.m19899(r0)
            java.util.List r0 = Yue.C1207.m6190(r0)
            r1.f22772 = r0
        L10:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.f22768
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            int r0 = r0 * 31
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            Yue.ۥۣۢۢۡ$ۥ r0 = Yue.C6468.f22767
            java.lang.String r0 = r0.m23857(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m23856(@Yue.InterfaceC4418 java.util.List<? extends Yue.InterfaceC3473> r3) {
            r2 = this;
            java.lang.String r0 = "upperBounds"
            Yue.C3329.m13906(r3, r0)
            java.util.List<? extends Yue.ۥ۠ۦۣۤ> r0 = r2.f22772
            if (r0 != 0) goto Lc
            r2.f22772 = r3
            return
        Lc:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Upper bounds of type parameter '"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "' have already been initialized."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // Yue.InterfaceC3476
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public boolean mo14257() {
            r1 = this;
            boolean r0 = r1.f22771
            return r0
    }

    @Override // Yue.InterfaceC3476
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public Yue.EnumC3480 mo14258() {
            r1 = this;
            Yue.ۥ۠ۦۤۧ r0 = r1.f22770
            return r0
    }
}
