package p000;

/* JADX INFO: renamed from: en */
/* JADX INFO: loaded from: classes.dex */
public final class C1376en extends AbstractC2634vj {
    private static final C1376en DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC2744y6 value_ = AbstractC2744y6.f9369b;

    static {
        C1376en c1376en = new C1376en();
        DEFAULT_INSTANCE = c1376en;
        AbstractC2634vj.m5151t(C1376en.class, c1376en);
    }

    /* JADX INFO: renamed from: D */
    public static C1333dn m2660D() {
        return (C1333dn) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: w */
    public static void m2661w(C1376en c1376en, String str) {
        c1376en.getClass();
        str.getClass();
        c1376en.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m2662x(C1376en c1376en, C2701x6 c2701x6) {
        c1376en.getClass();
        c1376en.value_ = c2701x6;
    }

    /* JADX INFO: renamed from: y */
    public static void m2663y(C1376en c1376en, EnumC2773yt enumC2773yt) {
        c1376en.getClass();
        c1376en.outputPrefixType_ = enumC2773yt.m5345b();
    }

    /* JADX INFO: renamed from: z */
    public static C1376en m2664z() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final EnumC2773yt m2665A() {
        EnumC2773yt enumC2773ytM5344a = EnumC2773yt.m5344a(this.outputPrefixType_);
        return enumC2773ytM5344a == null ? EnumC2773yt.UNRECOGNIZED : enumC2773ytM5344a;
    }

    /* JADX INFO: renamed from: B */
    public final String m2666B() {
        return this.typeUrl_;
    }

    /* JADX INFO: renamed from: C */
    public final AbstractC2744y6 m2667C() {
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new C1376en();
            case 4:
                return new C1333dn(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C1376en.class) {
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
