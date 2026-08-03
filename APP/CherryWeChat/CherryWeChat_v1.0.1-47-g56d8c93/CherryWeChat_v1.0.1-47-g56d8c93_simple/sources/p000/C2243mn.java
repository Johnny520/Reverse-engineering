package p000;

/* JADX INFO: renamed from: mn */
/* JADX INFO: loaded from: classes.dex */
public final class C2243mn extends AbstractC2634vj {
    private static final C2243mn DEFAULT_INSTANCE = null;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private C0931Vm keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        C2243mn r0 = new C2243mn();
        DEFAULT_INSTANCE = r0;
        AbstractC2634vj.m5151t(C2243mn.class, r0);
    }

    /* JADX INFO: renamed from: F */
    public static C2200ln m4551F() {
        return (C2200ln) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: w */
    public static void m4552w(C2243mn r0, C0931Vm r1) {
        r0.getClass();
        r0.keyData_ = r1;
    }

    /* JADX INFO: renamed from: x */
    public static void m4553x(C2243mn r0, EnumC2773yt r1) {
        r0.getClass();
        r0.outputPrefixType_ = r1.m5345b();
    }

    /* JADX INFO: renamed from: y */
    public static void m4554y(C2243mn r1) {
        r1.getClass();
        r1.status_ = EnumC1271cn.f4327c.m2409a();
    }

    /* JADX INFO: renamed from: z */
    public static void m4555z(C2243mn r0, int r1) {
        r0.keyId_ = r1;
    }

    /* JADX INFO: renamed from: A */
    public final C0931Vm m4556A() {
        C0931Vm r0 = this.keyData_;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return C0931Vm.m1790z();
    }

    /* JADX INFO: renamed from: B */
    public final int m4557B() {
        return this.keyId_;
    }

    /* JADX INFO: renamed from: C */
    public final EnumC2773yt m4558C() {
        EnumC2773yt r0 = EnumC2773yt.m5344a(this.outputPrefixType_);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return EnumC2773yt.f9422g;
    }

    /* JADX INFO: renamed from: D */
    public final EnumC1271cn m4559D() {
        int r0 = this.status_;
        if (r0 != 0) goto L5;
        EnumC1271cn r02 = EnumC1271cn.f4326b;
    L15:
        if (r02 == null) goto L17;
        return r02;
    L17:
        return EnumC1271cn.f4330f;
    L5:
        if (r0 != 1) goto L7;
        r02 = EnumC1271cn.f4327c;
        goto L15
    L7:
        if (r0 != 2) goto L9;
        r02 = EnumC1271cn.f4328d;
        goto L15
    L9:
        if (r0 == 3) goto L11;
        r02 = null;
        goto L15
    L11:
        r02 = EnumC1271cn.f4329e;
        goto L15
    }

    /* JADX INFO: renamed from: E */
    public final boolean m4560E() {
        if (this.keyData_ == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p000.AbstractC2634vj
    /* JADX INFO: renamed from: i */
    public final Object mo44i(int r4) {
        switch(AbstractC0213Ey.m424v(r4)) {
            case 0: goto L31;
            case 1: goto L28;
            case 2: goto L26;
            case 3: goto L25;
            case 4: goto L23;
            case 5: goto L21;
            case 6: goto L6;
            default: goto L5;
        };
    L6:
        InterfaceC0466Kt r42 = PARSER;
        if (r42 == null) goto L9;
        return r42;
    L9:
        monitor-enter(C2243mn.class);
        InterfaceC0466Kt r43 = PARSER;     // Catch: Throwable -> L13
        if (r43 != null) goto L15;
        r43 = new C2591uj();     // Catch: Throwable -> L13
        PARSER = r43;     // Catch: Throwable -> L13
    L15:
        monitor-exit(C2243mn.class);     // Catch: Throwable -> L13
        return r43;
    L13:
        th = move-exception;
        throw th;
    L26:
        C2243mn r1 = DEFAULT_INSTANCE;
        return new C1236bv(r1, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
    L28:
        return null;
    L5:
        throw new UnsupportedOperationException();
    L21:
        return DEFAULT_INSTANCE;
    L23:
        return new C2200ln(DEFAULT_INSTANCE);
    L25:
        return new C2243mn();
    L31:
        return (byte) 1;
    }
}
