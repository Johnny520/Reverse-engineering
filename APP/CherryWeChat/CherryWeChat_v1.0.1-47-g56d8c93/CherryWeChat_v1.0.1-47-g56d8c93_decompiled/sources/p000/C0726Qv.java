package p000;

/* JADX INFO: renamed from: Qv */
/* JADX INFO: loaded from: classes.dex */
public final class C0726Qv extends AbstractC2634vj {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final C0726Qv DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER;
    private String configName_ = "";
    private InterfaceC0458Kl entry_ = C0381Iu.f1312d;

    static {
        C0726Qv c0726Qv = new C0726Qv();
        DEFAULT_INSTANCE = c0726Qv;
        AbstractC2634vj.m5151t(C0726Qv.class, c0726Qv);
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", C1464gn.class});
            case 3:
                return new C0726Qv();
            case 4:
                return new C1441g7(DEFAULT_INSTANCE, 4);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0726Qv.class) {
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
