package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.1")
public final class C5612 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0814 f13570 = new C0814(null);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final C5612 f13571 = new C5612(null, null);

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public final EnumC5613 f1568;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public final InterfaceC5609 f1569;

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۤۦ$ۥ */
    public static final class C0814 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۦۤۦ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0814(C4335 c4335) {
            this();
        }

        @InterfaceC6839
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m17401() {
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ */
        public final C5612 m2321(@InterfaceC6399 InterfaceC5609 interfaceC5609) {
            C5499.m17103(interfaceC5609, "type");
            return new C5612(EnumC5613.f13573, interfaceC5609);
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟ */
        public final C5612 m2322(@InterfaceC6399 InterfaceC5609 interfaceC5609) {
            C5499.m17103(interfaceC5609, "type");
            return new C5612(EnumC5613.f13574, interfaceC5609);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C5612 m17402() {
            return C5612.f13571;
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C5612 m17403(@InterfaceC6399 InterfaceC5609 interfaceC5609) {
            C5499.m17103(interfaceC5609, "type");
            return new C5612(EnumC5613.f13572, interfaceC5609);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0814() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۦۤۦ$ۥ۟ */
    public /* synthetic */ class C0815 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f1570;

        static {
            int[] iArr = new int[EnumC5613.values().length];
            try {
                iArr[EnumC5613.f13572.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5613.f13573.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5613.f13574.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1570 = iArr;
        }
    }

    public C5612(@InterfaceC6489 EnumC5613 enumC5613, @InterfaceC6489 InterfaceC5609 interfaceC5609) {
        String str;
        this.f1568 = enumC5613;
        this.f1569 = interfaceC5609;
        if ((enumC5613 == null) == (interfaceC5609 == null)) {
            return;
        }
        if (enumC5613 == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + enumC5613 + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final C5612 m17394(@InterfaceC6399 InterfaceC5609 interfaceC5609) {
        return f13570.m2321(interfaceC5609);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ C5612 m17395(C5612 c5612, EnumC5613 enumC5613, InterfaceC5609 interfaceC5609, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC5613 = c5612.f1568;
        }
        if ((i & 2) != 0) {
            interfaceC5609 = c5612.f1569;
        }
        return c5612.m17398(enumC5613, interfaceC5609);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final C5612 m17396(@InterfaceC6399 InterfaceC5609 interfaceC5609) {
        return f13570.m2322(interfaceC5609);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C5612 m17397(@InterfaceC6399 InterfaceC5609 interfaceC5609) {
        return f13570.m17403(interfaceC5609);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5612)) {
            return false;
        }
        C5612 c5612 = (C5612) obj;
        return this.f1568 == c5612.f1568 && C5499.m17094(this.f1569, c5612.f1569);
    }

    public int hashCode() {
        EnumC5613 enumC5613 = this.f1568;
        int iHashCode = (enumC5613 == null ? 0 : enumC5613.hashCode()) * 31;
        InterfaceC5609 interfaceC5609 = this.f1569;
        return iHashCode + (interfaceC5609 != null ? interfaceC5609.hashCode() : 0);
    }

    @InterfaceC6399
    public String toString() {
        EnumC5613 enumC5613 = this.f1568;
        int i = enumC5613 == null ? -1 : C0815.f1570[enumC5613.ordinal()];
        if (i == -1) {
            return InterfaceC5949.f14892;
        }
        if (i == 1) {
            return String.valueOf(this.f1569);
        }
        if (i == 2) {
            return "in " + this.f1569;
        }
        if (i != 3) {
            throw new C6380();
        }
        return "out " + this.f1569;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final EnumC5613 m2319() {
        return this.f1568;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final InterfaceC5609 m2320() {
        return this.f1569;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final C5612 m17398(@InterfaceC6489 EnumC5613 enumC5613, @InterfaceC6489 InterfaceC5609 interfaceC5609) {
        return new C5612(enumC5613, interfaceC5609);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final InterfaceC5609 m17399() {
        return this.f1569;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final EnumC5613 m17400() {
        return this.f1568;
    }
}
