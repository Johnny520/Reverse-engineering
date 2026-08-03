package p000;

/* JADX INFO: renamed from: sn */
/* JADX INFO: loaded from: classes.dex */
public final class C2509sn extends AbstractC2634vj {
    private static final C2509sn DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC0458Kl keyInfo_ = C0381Iu.f1312d;
    private int primaryKeyId_;

    static {
        C2509sn c2509sn = new C2509sn();
        DEFAULT_INSTANCE = c2509sn;
        AbstractC2634vj.m5151t(C2509sn.class, c2509sn);
    }

    /* JADX INFO: renamed from: w */
    public static void m4990w(C2509sn c2509sn, int i) {
        c2509sn.primaryKeyId_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static void m4991x(C2509sn c2509sn, C2466rn c2466rn) {
        c2509sn.getClass();
        InterfaceC0458Kl interfaceC0458Kl = c2509sn.keyInfo_;
        if (!((AbstractC0172E) interfaceC0458Kl).f453a) {
            int size = interfaceC0458Kl.size();
            c2509sn.keyInfo_ = interfaceC0458Kl.mo716f(size == 0 ? 10 : size * 2);
        }
        c2509sn.keyInfo_.add(c2466rn);
    }

    /* JADX INFO: renamed from: z */
    public static C2380pn m4992z() {
        return (C2380pn) DEFAULT_INSTANCE.m5152h();
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", C2466rn.class});
            case 3:
                return new C2509sn();
            case 4:
                return new C2380pn(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C2509sn.class) {
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

    /* JADX INFO: renamed from: y */
    public final C2466rn m4993y() {
        return (C2466rn) this.keyInfo_.get(0);
    }
}
