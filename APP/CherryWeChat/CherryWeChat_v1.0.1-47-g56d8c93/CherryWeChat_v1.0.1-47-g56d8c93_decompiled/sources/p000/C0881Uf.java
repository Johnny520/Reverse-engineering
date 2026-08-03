package p000;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: Uf */
/* JADX INFO: loaded from: classes.dex */
public final class C0881Uf extends AbstractC2634vj {
    private static final C0881Uf DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile InterfaceC0466Kt PARSER;
    private AbstractC2744y6 encryptedKeyset_ = AbstractC2744y6.f9369b;
    private C2509sn keysetInfo_;

    static {
        C0881Uf c0881Uf = new C0881Uf();
        DEFAULT_INSTANCE = c0881Uf;
        AbstractC2634vj.m5151t(C0881Uf.class, c0881Uf);
    }

    /* JADX INFO: renamed from: A */
    public static C0881Uf m1727A(ByteArrayInputStream byteArrayInputStream, C0839Tg c0839Tg) throws C0673Pl {
        AbstractC2634vj abstractC2634vjM5150s = AbstractC2634vj.m5150s(DEFAULT_INSTANCE, new C2096ja(byteArrayInputStream), c0839Tg);
        AbstractC2634vj.m5145g(abstractC2634vjM5150s);
        return (C0881Uf) abstractC2634vjM5150s;
    }

    /* JADX INFO: renamed from: w */
    public static void m1728w(C0881Uf c0881Uf, C2701x6 c2701x6) {
        c0881Uf.getClass();
        c0881Uf.encryptedKeyset_ = c2701x6;
    }

    /* JADX INFO: renamed from: x */
    public static void m1729x(C0881Uf c0881Uf, C2509sn c2509sn) {
        c0881Uf.getClass();
        c0881Uf.keysetInfo_ = c2509sn;
    }

    /* JADX INFO: renamed from: z */
    public static C0838Tf m1730z() {
        return (C0838Tf) DEFAULT_INSTANCE.m5152h();
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new C0881Uf();
            case 4:
                return new C0838Tf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C0881Uf.class) {
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
    public final AbstractC2744y6 m1731y() {
        return this.encryptedKeyset_;
    }
}
