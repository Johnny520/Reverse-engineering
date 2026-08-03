package p000;

/* JADX INFO: renamed from: mn */
/* JADX INFO: loaded from: classes.dex */
public final class C2243mn extends AbstractC2634vj {
    private static final C2243mn DEFAULT_INSTANCE;
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
        C2243mn c2243mn = new C2243mn();
        DEFAULT_INSTANCE = c2243mn;
        AbstractC2634vj.m5151t(C2243mn.class, c2243mn);
    }

    /* JADX INFO: renamed from: F */
    public static C2200ln m4551F() {
        return (C2200ln) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: w */
    public static void m4552w(C2243mn c2243mn, C0931Vm c0931Vm) {
        c2243mn.getClass();
        c2243mn.keyData_ = c0931Vm;
    }

    /* JADX INFO: renamed from: x */
    public static void m4553x(C2243mn c2243mn, EnumC2773yt enumC2773yt) {
        c2243mn.getClass();
        c2243mn.outputPrefixType_ = enumC2773yt.m5345b();
    }

    /* JADX INFO: renamed from: y */
    public static void m4554y(C2243mn c2243mn) {
        c2243mn.getClass();
        c2243mn.status_ = EnumC1271cn.ENABLED.m2409a();
    }

    /* JADX INFO: renamed from: z */
    public static void m4555z(C2243mn c2243mn, int i) {
        c2243mn.keyId_ = i;
    }

    /* JADX INFO: renamed from: A */
    public final C0931Vm m4556A() {
        C0931Vm c0931Vm = this.keyData_;
        return c0931Vm == null ? C0931Vm.m1790z() : c0931Vm;
    }

    /* JADX INFO: renamed from: B */
    public final int m4557B() {
        return this.keyId_;
    }

    /* JADX INFO: renamed from: C */
    public final EnumC2773yt m4558C() {
        EnumC2773yt enumC2773ytM5344a = EnumC2773yt.m5344a(this.outputPrefixType_);
        return enumC2773ytM5344a == null ? EnumC2773yt.UNRECOGNIZED : enumC2773ytM5344a;
    }

    /* JADX INFO: renamed from: D */
    public final EnumC1271cn m4559D() {
        int i = this.status_;
        EnumC1271cn enumC1271cn = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : EnumC1271cn.DESTROYED : EnumC1271cn.DISABLED : EnumC1271cn.ENABLED : EnumC1271cn.UNKNOWN_STATUS;
        return enumC1271cn == null ? EnumC1271cn.UNRECOGNIZED : enumC1271cn;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m4560E() {
        return this.keyData_ != null;
    }

    @Override // p000.AbstractC2634vj
    /* JADX INFO: renamed from: i */
    public final Object mo44i(int i) {
        InterfaceC0466Kt c2591uj;
        switch (AbstractC0213Ey.m424v(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new C2243mn();
            case 4:
                return new C2200ln(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C2243mn.class) {
                    try {
                        c2591uj = PARSER;
                        if (c2591uj == null) {
                            c2591uj = new C2591uj();
                            PARSER = c2591uj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c2591uj;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
