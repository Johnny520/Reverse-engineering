package p154k5;

import bsh.C1193i2;
import java.util.BitSet;
import p239q5.C6267r;
import p239q5.C6268s;
import p254r5.AbstractC6515t;
import p254r5.AbstractC6516u;
import p254r5.C6513r;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;
import p376zd.C9987e;

/* JADX INFO: renamed from: k5.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3982p {
    /* JADX INFO: renamed from: A */
    public static void m15804A(InterfaceC8819a interfaceC8819a, short s10, long j10) {
        m15808E(interfaceC8819a, s10, (short) j10, (short) (j10 >> 16), (short) (j10 >> 32), (short) (j10 >> 48));
    }

    /* JADX INFO: renamed from: B */
    public static void m15805B(InterfaceC8819a interfaceC8819a, short s10, short s11) {
        interfaceC8819a.writeShort(s10);
        interfaceC8819a.writeShort(s11);
    }

    /* JADX INFO: renamed from: C */
    public static void m15806C(InterfaceC8819a interfaceC8819a, short s10, short s11, short s12) {
        interfaceC8819a.writeShort(s10);
        interfaceC8819a.writeShort(s11);
        interfaceC8819a.writeShort(s12);
    }

    /* JADX INFO: renamed from: D */
    public static void m15807D(InterfaceC8819a interfaceC8819a, short s10, short s11, short s12, short s13) {
        interfaceC8819a.writeShort(s10);
        interfaceC8819a.writeShort(s11);
        interfaceC8819a.writeShort(s12);
        interfaceC8819a.writeShort(s13);
    }

    /* JADX INFO: renamed from: E */
    public static void m15808E(InterfaceC8819a interfaceC8819a, short s10, short s11, short s12, short s13, short s14) {
        interfaceC8819a.writeShort(s10);
        interfaceC8819a.writeShort(s11);
        interfaceC8819a.writeShort(s12);
        interfaceC8819a.writeShort(s13);
        interfaceC8819a.writeShort(s14);
    }

    /* JADX INFO: renamed from: a */
    public static String m15809a(AbstractC3976j abstractC3976j) {
        int iM15744C = ((C3969e0) abstractC3976j).m15744C();
        return iM15744C == ((short) iM15744C) ? AbstractC8826h.m33894c(iM15744C) : AbstractC8826h.m33895d(iM15744C);
    }

    /* JADX INFO: renamed from: c */
    public static String m15810c(AbstractC3976j abstractC3976j) {
        int iM15743B = ((C3969e0) abstractC3976j).m15743B();
        return iM15743B == ((char) iM15743B) ? AbstractC8826h.m33898g(iM15743B) : AbstractC8826h.m33901j(iM15743B);
    }

    /* JADX INFO: renamed from: e */
    public static short m15811e(int i10, int i11) {
        if ((i10 & 255) != i10) {
            C9987e.m38645a("low out of range 0..255");
            return (short) 0;
        }
        if ((i11 & 255) == i11) {
            return (short) (i10 | (i11 << 8));
        }
        C9987e.m38645a("high out of range 0..255");
        return (short) 0;
    }

    /* JADX INFO: renamed from: f */
    public static short m15812f(int i10, int i11, int i12, int i13) {
        if ((i10 & 15) != i10) {
            C9987e.m38645a("n0 out of range 0..15");
            return (short) 0;
        }
        if ((i11 & 15) != i11) {
            C9987e.m38645a("n1 out of range 0..15");
            return (short) 0;
        }
        if ((i12 & 15) != i12) {
            C9987e.m38645a("n2 out of range 0..15");
            return (short) 0;
        }
        if ((i13 & 15) == i13) {
            return (short) (i10 | (i11 << 4) | (i12 << 8) | (i13 << 12));
        }
        C9987e.m38645a("n3 out of range 0..15");
        return (short) 0;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m15813k(C6268s c6268s) {
        int size = c6268s.size();
        if (size < 2) {
            return true;
        }
        int iM24754t = c6268s.m24769G(0).m24754t();
        for (int i10 = 0; i10 < size; i10++) {
            C6267r c6267rM24769G = c6268s.m24769G(i10);
            if (c6267rM24769G.m24754t() != iM24754t) {
                return false;
            }
            iM24754t += c6267rM24769G.m24751n();
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static String m15814m(AbstractC6516u abstractC6516u, int i10) {
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append("#");
        long jMo25797t = abstractC6516u instanceof AbstractC6515t ? ((AbstractC6515t) abstractC6516u).mo25797t() : abstractC6516u.mo25796s();
        if (i10 == 4) {
            sb2.append(AbstractC8826h.m33903l((int) jMo25797t));
        } else if (i10 == 8) {
            sb2.append(AbstractC8826h.m33897f((int) jMo25797t));
        } else if (i10 == 16) {
            sb2.append(AbstractC8826h.m33898g((int) jMo25797t));
        } else if (i10 == 32) {
            sb2.append(AbstractC8826h.m33901j((int) jMo25797t));
        } else {
            if (i10 != 64) {
                C1193i2.m4438a("shouldn't happen");
                return null;
            }
            sb2.append(AbstractC8826h.m33902k(jMo25797t));
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: n */
    public static String m15815n(AbstractC6516u abstractC6516u) {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append('#');
        if (abstractC6516u instanceof C6513r) {
            sb2.append("null");
        } else {
            sb2.append(abstractC6516u.mo25729j());
            sb2.append(' ');
            sb2.append(abstractC6516u.mo6828g());
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: o */
    public static int m15816o(int i10, int i11) {
        if ((i10 & 15) != i10) {
            C9987e.m38645a("low out of range 0..15");
            return 0;
        }
        if ((i11 & 15) == i11) {
            return i10 | (i11 << 4);
        }
        C9987e.m38645a("high out of range 0..15");
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public static short m15817p(AbstractC3976j abstractC3976j, int i10) {
        if ((i10 & 255) != i10) {
            C9987e.m38645a("arg out of range 0..255");
            return (short) 0;
        }
        int iM15796e = abstractC3976j.m15776l().m15796e();
        if ((iM15796e & 255) == iM15796e) {
            return (short) (iM15796e | (i10 << 8));
        }
        C9987e.m38645a("opcode out of range 0..255");
        return (short) 0;
    }

    /* JADX INFO: renamed from: q */
    public static String m15818q(C6268s c6268s) {
        int size = c6268s.size();
        StringBuilder sb2 = new StringBuilder((size * 5) + 2);
        sb2.append('{');
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(c6268s.m24769G(i10).m24741E());
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: r */
    public static String m15819r(C6268s c6268s) {
        int size = c6268s.size();
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("{");
        if (size != 0) {
            if (size != 1) {
                C6267r c6267rM24769G = c6268s.m24769G(size - 1);
                if (c6267rM24769G.m24751n() == 2) {
                    c6267rM24769G = c6267rM24769G.m24744I(1);
                }
                sb2.append(c6268s.m24769G(0).m24741E());
                sb2.append("..");
                sb2.append(c6267rM24769G.m24741E());
            } else {
                sb2.append(c6268s.m24769G(0).m24741E());
            }
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: s */
    public static boolean m15820s(int i10) {
        return ((byte) i10) == i10;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m15821t(int i10) {
        return i10 >= -8 && i10 <= 7;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m15822u(int i10) {
        return ((short) i10) == i10;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m15823v(int i10) {
        return i10 == (i10 & 255);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m15824w(int i10) {
        return i10 == (i10 & 15);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m15825x(int i10) {
        return i10 == (65535 & i10);
    }

    /* JADX INFO: renamed from: y */
    public static void m15826y(InterfaceC8819a interfaceC8819a, short s10) {
        interfaceC8819a.writeShort(s10);
    }

    /* JADX INFO: renamed from: z */
    public static void m15827z(InterfaceC8819a interfaceC8819a, short s10, int i10) {
        m15806C(interfaceC8819a, s10, (short) i10, (short) (i10 >> 16));
    }

    /* JADX INFO: renamed from: F */
    public abstract void mo15828F(InterfaceC8819a interfaceC8819a, AbstractC3976j abstractC3976j);

    /* JADX INFO: renamed from: b */
    public boolean mo15829b(C3969e0 c3969e0) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo15830d();

    /* JADX INFO: renamed from: g */
    public BitSet mo15831g(AbstractC3976j abstractC3976j) {
        return new BitSet();
    }

    /* JADX INFO: renamed from: h */
    public abstract String mo15832h(AbstractC3976j abstractC3976j);

    /* JADX INFO: renamed from: i */
    public abstract String mo15833i(AbstractC3976j abstractC3976j, boolean z10);

    /* JADX INFO: renamed from: j */
    public abstract boolean mo15834j(AbstractC3976j abstractC3976j);

    /* JADX INFO: renamed from: l */
    public final String m15835l(AbstractC3976j abstractC3976j, boolean z10) {
        String strM15794c = abstractC3976j.m15776l().m15794c();
        String strMo15832h = mo15832h(abstractC3976j);
        String strMo15833i = mo15833i(abstractC3976j, z10);
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(strM15794c);
        if (strMo15832h.length() != 0) {
            sb2.append(' ');
            sb2.append(strMo15832h);
        }
        if (strMo15833i.length() != 0) {
            sb2.append(" // ");
            sb2.append(strMo15833i);
        }
        return sb2.toString();
    }
}
