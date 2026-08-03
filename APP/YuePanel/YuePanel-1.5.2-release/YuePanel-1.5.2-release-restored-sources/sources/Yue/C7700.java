package Yue;

import android.content.res.Resources;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7700 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1330 f23203 = new C1330(null);

    /* JADX INFO: renamed from: ۥ */
    public final int f3030;

    /* JADX INFO: renamed from: ۥ۟ */
    public final int f3031;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f23204;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5124<Resources, Boolean> f23205;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۦۨ$ۥ */
    public static final class C1330 {

        /* JADX INFO: renamed from: Yue.ۥۢ۠ۦۨ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C7701 extends AbstractC5673 implements InterfaceC5124<Resources, Boolean> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public static final C7701 f23206 = new C7701();

            public C7701() {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5124
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final Boolean invoke(@InterfaceC6399 Resources resources) {
                C5499.m17103(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۢ۠ۦۨ$ۥ$ۥ۟, reason: contains not printable characters */
        public static final class C7702 extends AbstractC5673 implements InterfaceC5124<Resources, Boolean> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public static final C7702 f23207 = new C7702();

            public C7702() {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5124
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final Boolean invoke(@InterfaceC6399 Resources resources) {
                C5499.m17103(resources, "<anonymous parameter 0>");
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۢ۠ۦۨ$ۥ$ۥ۟۟, reason: contains not printable characters */
        public static final class C7703 extends AbstractC5673 implements InterfaceC5124<Resources, Boolean> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public static final C7703 f23208 = new C7703();

            public C7703() {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5124
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final Boolean invoke(@InterfaceC6399 Resources resources) {
                C5499.m17103(resources, "<anonymous parameter 0>");
                return Boolean.FALSE;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۢ۠ۦۨ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1330(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥۢ۠ۦۨ$ۥ */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static /* synthetic */ C7700 m24494(C1330 c1330, int i, int i2, InterfaceC5124 interfaceC5124, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                interfaceC5124 = C7701.f23206;
            }
            return c1330.m3804(i, i2, interfaceC5124);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5573
        /* JADX INFO: renamed from: ۥ */
        public final C7700 m3803(@InterfaceC3897 int i, @InterfaceC3897 int i2) {
            return m24494(this, i, i2, null, 4, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        @InterfaceC5573
        /* JADX INFO: renamed from: ۥ۟ */
        public final C7700 m3804(@InterfaceC3897 int i, @InterfaceC3897 int i2, @InterfaceC6399 InterfaceC5124<? super Resources, Boolean> interfaceC5124) {
            C5499.m17103(interfaceC5124, "detectDarkMode");
            return new C7700(i, i2, 0, interfaceC5124, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C7700 m24495(@InterfaceC3897 int i) {
            return new C7700(i, i, 2, C7702.f23207, null);
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C7700 m24496(@InterfaceC3897 int i, @InterfaceC3897 int i2) {
            return new C7700(i, i2, 1, C7703.f23208, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1330() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int), (r2v0 int), (r3v0 int), (r4v0 Yue.ۥۣ۠ۡ۟) A[MD:(int, int, int, Yue.ۥۣ۠ۡ۟<? super android.content.res.Resources, java.lang.Boolean>):void (m)] (LINE:1) call: Yue.ۥۢ۠ۦۨ.<init>(int, int, int, Yue.ۥۣ۠ۡ۟):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C7700(int i, int i2, int i3, InterfaceC5124 interfaceC5124, C4335 c4335) {
        this(i, i2, i3, interfaceC5124);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ */
    public static final C7700 m3801(@InterfaceC3897 int i, @InterfaceC3897 int i2) {
        return f23203.m3803(i, i2);
    }

    @InterfaceC6399
    @InterfaceC5578
    @InterfaceC5573
    /* JADX INFO: renamed from: ۥ۟ */
    public static final C7700 m3802(@InterfaceC3897 int i, @InterfaceC3897 int i2, @InterfaceC6399 InterfaceC5124<? super Resources, Boolean> interfaceC5124) {
        return f23203.m3804(i, i2, interfaceC5124);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final C7700 m24487(@InterfaceC3897 int i) {
        return f23203.m24495(i);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C7700 m24488(@InterfaceC3897 int i, @InterfaceC3897 int i2) {
        return f23203.m24496(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m24489() {
        return this.f3031;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final InterfaceC5124<Resources, Boolean> m24490() {
        return this.f23205;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m24491() {
        return this.f23204;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m24492(boolean z) {
        return z ? this.f3031 : this.f3030;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m24493(boolean z) {
        if (this.f23204 == 0) {
            return 0;
        }
        return z ? this.f3031 : this.f3030;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠ۡ۟<? super android.content.res.Resources, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7700(int i, int i2, int i3, InterfaceC5124<? super Resources, Boolean> interfaceC5124) {
        this.f3030 = i;
        this.f3031 = i2;
        this.f23204 = i3;
        this.f23205 = interfaceC5124;
    }
}
