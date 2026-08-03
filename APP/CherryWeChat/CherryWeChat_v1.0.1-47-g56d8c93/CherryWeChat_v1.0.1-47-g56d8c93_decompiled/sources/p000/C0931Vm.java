package p000;

/* JADX INFO: renamed from: Vm */
/* JADX INFO: loaded from: classes.dex */
public final class C0931Vm extends AbstractC2634vj {
    private static final C0931Vm DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC2744y6 value_ = AbstractC2744y6.f9369b;

    static {
        C0931Vm c0931Vm = new C0931Vm();
        DEFAULT_INSTANCE = c0931Vm;
        AbstractC2634vj.m5151t(C0931Vm.class, c0931Vm);
    }

    /* JADX INFO: renamed from: D */
    public static C0845Tm m1786D() {
        return (C0845Tm) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: w */
    public static void m1787w(C0931Vm c0931Vm, String str) {
        c0931Vm.getClass();
        str.getClass();
        c0931Vm.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m1788x(C0931Vm c0931Vm, C2701x6 c2701x6) {
        c0931Vm.getClass();
        c0931Vm.value_ = c2701x6;
    }

    /* JADX INFO: renamed from: y */
    public static void m1789y(C0931Vm c0931Vm, EnumC0888Um enumC0888Um) {
        c0931Vm.getClass();
        if (enumC0888Um != EnumC0888Um.UNRECOGNIZED) {
            c0931Vm.keyMaterialType_ = enumC0888Um.f2783a;
        } else {
            enumC0888Um.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: renamed from: z */
    public static C0931Vm m1790z() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final EnumC0888Um m1791A() {
        int i = this.keyMaterialType_;
        EnumC0888Um enumC0888Um = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : EnumC0888Um.REMOTE : EnumC0888Um.ASYMMETRIC_PUBLIC : EnumC0888Um.ASYMMETRIC_PRIVATE : EnumC0888Um.SYMMETRIC : EnumC0888Um.UNKNOWN_KEYMATERIAL;
        return enumC0888Um == null ? EnumC0888Um.UNRECOGNIZED : enumC0888Um;
    }

    /* JADX INFO: renamed from: B */
    public final String m1792B() {
        return this.typeUrl_;
    }

    /* JADX INFO: renamed from: C */
    public final AbstractC2744y6 m1793C() {
        return this.value_;
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new C0931Vm();
            case 4:
                return new C0845Tm(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0931Vm.class) {
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
