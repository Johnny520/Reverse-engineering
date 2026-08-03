package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: nn */
/* JADX INFO: loaded from: classes.dex */
public final class C2286nn extends AbstractC2634vj {
    private static final C2286nn DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile InterfaceC0466Kt PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC0458Kl key_ = C0381Iu.f1312d;
    private int primaryKeyId_;

    static {
        C2286nn c2286nn = new C2286nn();
        DEFAULT_INSTANCE = c2286nn;
        AbstractC2634vj.m5151t(C2286nn.class, c2286nn);
    }

    /* JADX INFO: renamed from: C */
    public static C2153kn m4611C() {
        return (C2153kn) DEFAULT_INSTANCE.m5152h();
    }

    /* JADX INFO: renamed from: D */
    public static C2286nn m4612D(ByteArrayInputStream byteArrayInputStream, C0839Tg c0839Tg) throws C0673Pl {
        AbstractC2634vj abstractC2634vjM5150s = AbstractC2634vj.m5150s(DEFAULT_INSTANCE, new C2096ja(byteArrayInputStream), c0839Tg);
        AbstractC2634vj.m5145g(abstractC2634vjM5150s);
        return (C2286nn) abstractC2634vjM5150s;
    }

    /* JADX INFO: renamed from: E */
    public static C2286nn m4613E(byte[] bArr, C0839Tg c0839Tg) {
        C2286nn c2286nn = DEFAULT_INSTANCE;
        int length = bArr.length;
        AbstractC2634vj abstractC2634vjM5157q = c2286nn.m5157q();
        try {
            C0338Hu c0338Hu = C0338Hu.f1144c;
            c0338Hu.getClass();
            InterfaceC2253mx interfaceC2253mxM725a = c0338Hu.m725a(abstractC2634vjM5157q.getClass());
            C0091C4 c0091c4 = new C0091C4();
            c0839Tg.getClass();
            interfaceC2253mxM725a.mo1077g(abstractC2634vjM5157q, bArr, 0, length, c0091c4);
            interfaceC2253mxM725a.mo1074d(abstractC2634vjM5157q);
            AbstractC2634vj.m5145g(abstractC2634vjM5157q);
            return (C2286nn) abstractC2634vjM5157q;
        } catch (C0673Pl e) {
            if (e.f2146a) {
                throw new C0673Pl(e.getMessage(), e);
            }
            throw e;
        } catch (C0743RC e2) {
            throw new C0673Pl(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof C0673Pl) {
                throw ((C0673Pl) e3.getCause());
            }
            throw new C0673Pl(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw C0673Pl.m1370g();
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m4614w(C2286nn c2286nn, int i) {
        c2286nn.primaryKeyId_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static void m4615x(C2286nn c2286nn, C2243mn c2243mn) {
        c2286nn.getClass();
        InterfaceC0458Kl interfaceC0458Kl = c2286nn.key_;
        if (!((AbstractC0172E) interfaceC0458Kl).f453a) {
            int size = interfaceC0458Kl.size();
            c2286nn.key_ = interfaceC0458Kl.mo716f(size == 0 ? 10 : size * 2);
        }
        c2286nn.key_.add(c2243mn);
    }

    /* JADX INFO: renamed from: A */
    public final List m4616A() {
        return this.key_;
    }

    /* JADX INFO: renamed from: B */
    public final int m4617B() {
        return this.primaryKeyId_;
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
                return new C1236bv(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", C2243mn.class});
            case 3:
                return new C2286nn();
            case 4:
                return new C2153kn(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC0466Kt interfaceC0466Kt = PARSER;
                if (interfaceC0466Kt != null) {
                    return interfaceC0466Kt;
                }
                synchronized (C2286nn.class) {
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
    public final C2243mn m4618y(int i) {
        return (C2243mn) this.key_.get(i);
    }

    /* JADX INFO: renamed from: z */
    public final int m4619z() {
        return this.key_.size();
    }
}
