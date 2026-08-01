package p045d5;

import p269s5.C7188c;
import p269s5.InterfaceC7189d;
import p309v5.AbstractC8826h;

/* JADX INFO: renamed from: d5.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1897s {
    /* JADX INFO: renamed from: a */
    public static boolean m6830a(InterfaceC7189d interfaceC7189d, InterfaceC7189d interfaceC7189d2) {
        C7188c type = interfaceC7189d.getType();
        C7188c type2 = interfaceC7189d2.getType();
        if (type.equals(type2)) {
            return true;
        }
        int iMo6841i = type.mo6841i();
        int iMo6841i2 = type2.mo6841i();
        if (iMo6841i == 10) {
            type = C7188c.f23837P;
            iMo6841i = 9;
        }
        if (iMo6841i2 == 10) {
            type2 = C7188c.f23837P;
            iMo6841i2 = 9;
        }
        if (iMo6841i != 9 || iMo6841i2 != 9) {
            return type.m28409C() && type2.m28409C();
        }
        C7188c c7188c = C7188c.f23829H;
        if (type == c7188c) {
            return false;
        }
        if (type2 == c7188c || type == C7188c.f23837P) {
            return true;
        }
        if (!type.m28422y()) {
            return !type2.m28422y() || type == C7188c.f23838Q || type == C7188c.f23833L;
        }
        if (!type2.m28422y()) {
            return false;
        }
        do {
            type = type.m28418n();
            type2 = type2.m28418n();
            if (!type.m28422y()) {
                break;
            }
        } while (type2.m28422y());
        return m6830a(type, type2);
    }

    /* JADX INFO: renamed from: b */
    public static C1898t m6831b(C1898t c1898t, C1898t c1898t2) {
        if (c1898t == c1898t2) {
            return c1898t;
        }
        int iM6836G = c1898t.m6836G();
        if (c1898t2.m6836G() != iM6836G) {
            throw new C1902x("mismatched maxLocals values");
        }
        C1898t c1898tMo6819x = null;
        for (int i10 = 0; i10 < iM6836G; i10++) {
            InterfaceC7189d interfaceC7189dM6837H = c1898t.m6837H(i10);
            InterfaceC7189d interfaceC7189dM6833d = m6833d(interfaceC7189dM6837H, c1898t2.m6837H(i10));
            if (interfaceC7189dM6833d != interfaceC7189dM6837H) {
                if (c1898tMo6819x == null) {
                    c1898tMo6819x = c1898t.mo6819x();
                }
                if (interfaceC7189dM6833d == null) {
                    c1898tMo6819x.m6838I(i10);
                } else {
                    c1898tMo6819x.mo6816D(i10, interfaceC7189dM6833d);
                }
            }
        }
        if (c1898tMo6819x == null) {
            return c1898t;
        }
        c1898tMo6819x.mo6829t();
        return c1898tMo6819x;
    }

    /* JADX INFO: renamed from: c */
    public static C1890l m6832c(C1890l c1890l, C1890l c1890l2) {
        if (c1890l == c1890l2) {
            return c1890l;
        }
        int size = c1890l.size();
        if (c1890l2.size() != size) {
            throw new C1902x("mismatched stack depths");
        }
        C1890l c1890lM6776z = null;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC7189d interfaceC7189dM6767C = c1890l.m6767C(i10);
            InterfaceC7189d interfaceC7189dM6767C2 = c1890l2.m6767C(i10);
            InterfaceC7189d interfaceC7189dM6833d = m6833d(interfaceC7189dM6767C, interfaceC7189dM6767C2);
            if (interfaceC7189dM6833d != interfaceC7189dM6767C) {
                if (c1890lM6776z == null) {
                    c1890lM6776z = c1890l.m6776z();
                }
                if (interfaceC7189dM6833d == null) {
                    throw new C1902x("incompatible: " + interfaceC7189dM6767C + ", " + interfaceC7189dM6767C2);
                }
                try {
                    c1890lM6776z.m6774x(i10, interfaceC7189dM6833d);
                } catch (C1902x e10) {
                    e10.m3685a("...while merging stack[" + AbstractC8826h.m33898g(i10) + "]");
                    throw e10;
                }
                e10.m3685a("...while merging stack[" + AbstractC8826h.m33898g(i10) + "]");
                throw e10;
            }
        }
        if (c1890lM6776z == null) {
            return c1890l;
        }
        c1890lM6776z.mo6829t();
        return c1890lM6776z;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC7189d m6833d(InterfaceC7189d interfaceC7189d, InterfaceC7189d interfaceC7189d2) {
        if (interfaceC7189d == null || interfaceC7189d.equals(interfaceC7189d2)) {
            return interfaceC7189d;
        }
        if (interfaceC7189d2 == null) {
            return null;
        }
        C7188c type = interfaceC7189d.getType();
        C7188c type2 = interfaceC7189d2.getType();
        if (type == type2) {
            return type;
        }
        if (!type.m28411E() || !type2.m28411E()) {
            if (type.m28409C() && type2.m28409C()) {
                return C7188c.f23825D;
            }
            return null;
        }
        C7188c c7188c = C7188c.f23829H;
        if (type == c7188c) {
            return type2;
        }
        if (type2 == c7188c) {
            return type;
        }
        if (!type.m28422y() || !type2.m28422y()) {
            return C7188c.f23837P;
        }
        InterfaceC7189d interfaceC7189dM6833d = m6833d(type.m28418n(), type2.m28418n());
        return interfaceC7189dM6833d == null ? C7188c.f23837P : ((C7188c) interfaceC7189dM6833d).m28415h();
    }
}
