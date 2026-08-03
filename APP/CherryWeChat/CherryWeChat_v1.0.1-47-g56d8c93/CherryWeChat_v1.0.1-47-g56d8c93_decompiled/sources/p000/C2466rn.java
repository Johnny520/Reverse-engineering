package p000;

/* JADX INFO: renamed from: rn */
/* JADX INFO: loaded from: classes.dex */
public final class C2466rn extends AbstractC2634vj {
    private static final C2466rn DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        C2466rn c2466rn = new C2466rn();
        DEFAULT_INSTANCE = c2466rn;
        AbstractC2634vj.m5151t(C2466rn.class, c2466rn);
    }

    /* JADX INFO: renamed from: B */
    public static C2423qn m4954B() {
        return (C2423qn) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: w */
    public static void m4955w(C2466rn c2466rn, String str) {
        c2466rn.getClass();
        str.getClass();
        c2466rn.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static void m4956x(C2466rn c2466rn, EnumC2773yt enumC2773yt) {
        c2466rn.getClass();
        c2466rn.outputPrefixType_ = enumC2773yt.m5345b();
    }

    /* JADX INFO: renamed from: y */
    public static void m4957y(C2466rn c2466rn, EnumC1271cn enumC1271cn) {
        c2466rn.getClass();
        c2466rn.status_ = enumC1271cn.m2409a();
    }

    /* JADX INFO: renamed from: z */
    public static void m4958z(C2466rn c2466rn, int i) {
        c2466rn.keyId_ = i;
    }

    /* JADX INFO: renamed from: A */
    public final int m4959A() {
        return this.keyId_;
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new C2466rn();
            case 4:
                return new C2423qn(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C2466rn.class) {
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
