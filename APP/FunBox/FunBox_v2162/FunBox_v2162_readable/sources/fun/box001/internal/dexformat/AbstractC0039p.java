package fun.box001.internal.dexformat;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.output.InterfaceC0199a;
import fun.box001.internal.dexformat.util.C0067q;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.code.AbstractC0183m;
import fun.box001.internal.dexformat.writer.code.AbstractC0184n;
import fun.box001.internal.dexformat.writer.code.C0181k;
import java.util.BitSet;

/* JADX INFO: renamed from: e.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0039p {
    /* JADX INFO: renamed from: a */
    protected static String m161a(AbstractC0033j abstractC0033j) {
        int iM87A = ((C0022F) abstractC0033j).m87A();
        int i2 = 0;
        if (iM87A == ((short) iM87A)) {
            char[] cArr = new char[5];
            if (iM87A < 0) {
                cArr[0] = '-';
                iM87A = -iM87A;
            } else {
                cArr[0] = '+';
            }
            while (i2 < 4) {
                cArr[4 - i2] = Character.forDigit(iM87A & 15, 16);
                iM87A >>= 4;
                i2++;
            }
            return new String(cArr);
        }
        char[] cArr2 = new char[9];
        if (iM87A < 0) {
            cArr2[0] = '-';
            iM87A = -iM87A;
        } else {
            cArr2[0] = '+';
        }
        while (i2 < 8) {
            cArr2[8 - i2] = Character.forDigit(iM87A & 15, 16);
            iM87A >>= 4;
            i2++;
        }
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: c */
    protected static String m162c(AbstractC0033j abstractC0033j) {
        int iM90z = ((C0022F) abstractC0033j).m90z();
        return iM90z == ((char) iM90z) ? RuntimeDexGenerator.m11q(iM90z) : RuntimeDexGenerator.m13s(iM90z);
    }

    /* JADX INFO: renamed from: e */
    protected static short m163e(int i2, int i3) {
        if ((i2 & 255) != i2) {
            throw new IllegalArgumentException("low out of range 0..255");
        }
        if ((i3 & 255) == i3) {
            return (short) (i2 | (i3 << 8));
        }
        throw new IllegalArgumentException("high out of range 0..255");
    }

    /* JADX INFO: renamed from: j */
    protected static String m164j(AbstractC0184n abstractC0184n, int i2) {
        String str;
        StringBuilder sb = new StringBuilder(20);
        sb.append("#");
        long jMo439i = abstractC0184n instanceof AbstractC0183m ? ((AbstractC0183m) abstractC0184n).mo439i() : abstractC0184n.mo438h();
        if (i2 == 4) {
            str = new String(new char[]{Character.forDigit(((int) jMo439i) & 15, 16)});
        } else if (i2 == 8) {
            str = RuntimeDexGenerator.m10p((int) jMo439i);
        } else if (i2 == 16) {
            str = RuntimeDexGenerator.m11q((int) jMo439i);
        } else if (i2 == 32) {
            str = RuntimeDexGenerator.m13s((int) jMo439i);
        } else {
            if (i2 != 64) {
                throw new RuntimeException("shouldn't happen");
            }
            str = RuntimeDexGenerator.m14t(jMo439i);
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    protected static String m165k(AbstractC0184n abstractC0184n) {
        String strMo107a;
        StringBuilder sb = new StringBuilder(100);
        sb.append('#');
        if (abstractC0184n instanceof C0181k) {
            strMo107a = "null";
        } else {
            sb.append(abstractC0184n.mo427f());
            sb.append(' ');
            strMo107a = abstractC0184n.mo107a();
        }
        sb.append(strMo107a);
        return sb.toString();
    }

    /* JADX INFO: renamed from: l */
    protected static int m166l(int i2, int i3) {
        if ((i2 & 15) != i2) {
            throw new IllegalArgumentException("low out of range 0..15");
        }
        if ((i3 & 15) == i3) {
            return i2 | (i3 << 4);
        }
        throw new IllegalArgumentException("high out of range 0..15");
    }

    /* JADX INFO: renamed from: m */
    protected static short m167m(int i2, AbstractC0033j abstractC0033j) {
        if ((i2 & 255) != i2) {
            throw new IllegalArgumentException("arg out of range 0..255");
        }
        int iM155e = abstractC0033j.m138k().m155e();
        if ((iM155e & 255) == iM155e) {
            return (short) ((i2 << 8) | iM155e);
        }
        throw new IllegalArgumentException("opcode out of range 0..255");
    }

    /* JADX INFO: renamed from: n */
    protected static String m168n(C0164o c0164o) {
        int iM504B = c0164o.m504B();
        StringBuilder sb = new StringBuilder((iM504B * 5) + 2);
        sb.append('{');
        for (int i2 = 0; i2 < iM504B; i2++) {
            if (i2 != 0) {
                sb.append(", ");
            }
            sb.append(c0164o.m513p(i2).m388o());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    protected static String m169o(C0164o c0164o) {
        String strM388o;
        int iM504B = c0164o.m504B();
        StringBuilder sb = new StringBuilder(30);
        sb.append("{");
        if (iM504B != 0) {
            if (iM504B != 1) {
                C0162m c0162mP = c0164o.m513p(iM504B - 1);
                if (c0162mP.m382g() == 2) {
                    c0162mP = c0162mP.m389q(1);
                }
                sb.append(c0164o.m513p(0).m388o());
                sb.append("..");
                strM388o = c0162mP.m388o();
            } else {
                strM388o = c0164o.m513p(0).m388o();
            }
            sb.append(strM388o);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    protected static boolean m170p(int i2) {
        return i2 == (i2 & 255);
    }

    /* JADX INFO: renamed from: q */
    protected static boolean m171q(int i2) {
        return i2 == (i2 & 15);
    }

    /* JADX INFO: renamed from: r */
    protected static boolean m172r(int i2) {
        return i2 == (65535 & i2);
    }

    /* JADX INFO: renamed from: s */
    protected static void m173s(InterfaceC0199a interfaceC0199a, short s, short s2) {
        C0202d c0202d = (C0202d) interfaceC0199a;
        c0202d.m498r(s);
        c0202d.m498r(s2);
    }

    /* JADX INFO: renamed from: t */
    protected static void m174t(C0202d c0202d, short s, int i2) {
        c0202d.m498r(s);
        c0202d.m498r((short) i2);
        c0202d.m498r((short) (i2 >> 16));
    }

    /* JADX INFO: renamed from: b */
    public boolean mo175b(C0022F c0022f) {
        return this instanceof C0067q;
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo176d();

    /* JADX INFO: renamed from: f */
    public BitSet mo177f(AbstractC0033j abstractC0033j) {
        return new BitSet();
    }

    /* JADX INFO: renamed from: g */
    public abstract String mo178g(AbstractC0033j abstractC0033j);

    /* JADX INFO: renamed from: h */
    public abstract String mo179h(AbstractC0033j abstractC0033j);

    /* JADX INFO: renamed from: i */
    public abstract boolean mo180i(AbstractC0033j abstractC0033j);

    /* JADX INFO: renamed from: u */
    public abstract void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j);
}
