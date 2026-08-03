package p247qe;

import ae.C0074e;
import ae.C0076g;
import af.C0083f;
import af.C0084g;
import bsh.org.objectweb.asm.Opcodes;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import md.EnumC2824a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p025bc.C0257g;
import p025bc.C0260j;
import p044d4.C0689b;
import p066ed.C0909b;
import p068eh.AbstractC0921a;
import p074f5.C1071g;
import p083fe.C1214a;
import p222p.AbstractC3199a;
import p227p4.C3315t;
import p233pd.AbstractC3391b;
import p233pd.C3390a;
import p233pd.C3399j;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3497a;
import p246qd.C3503g;
import p246qd.C3505i;
import p246qd.C3514r;
import p246qd.C3515s;
import p246qd.EnumC3513q;
import p259r9.AbstractC3754e0;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;
import p302ud.InterfaceC4317m;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: qe.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3541x {

    /* JADX INFO: renamed from: e */
    public static final InterfaceC2844b f11516e = AbstractC2846d.m6274b(C3541x.class);

    /* JADX INFO: renamed from: a */
    public final C4325u f11517a;

    /* JADX INFO: renamed from: b */
    public final EnumMap f11518b;

    /* JADX INFO: renamed from: c */
    public final C3528k f11519c;

    /* JADX INFO: renamed from: d */
    public final C0257g f11520d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3541x(C4325u c4325u) {
        this.f11517a = c4325u;
        this.f11520d = c4325u.f14435a;
        EnumMap enumMap = new EnumMap(EnumC3400k.class);
        enumMap.put(EnumC3400k.f10977g, new C3537t(this, 0));
        enumMap.put(EnumC3400k.f10983m, new C3537t(this, 2));
        enumMap.put(EnumC3400k.f10972X, new C3537t(this, 3));
        enumMap.put(EnumC3400k.f10955G, new C3537t(this, 4));
        enumMap.put(EnumC3400k.f10956H, new C3537t(this, 5));
        enumMap.put(EnumC3400k.f10992v, new C3537t(this, 6));
        enumMap.put(EnumC3400k.f10980j, new C3537t(this, 7));
        enumMap.put(EnumC3400k.f10981k, new C3537t(this, 8));
        enumMap.put(EnumC3400k.f10982l, new C3537t(this, 8));
        enumMap.put(EnumC3400k.f10949A, new C3537t(this, 9));
        enumMap.put(EnumC3400k.f10963O, new C3537t(this, 1));
        enumMap.put(EnumC3400k.f10967S, new C3537t(this, 1));
        this.f11518b = enumMap;
        this.f11519c = new C3528k(c4325u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m7448a(C3541x c3541x, C1071g c1071g, C4320p c4320p, AbstractC3508l abstractC3508l, AbstractC3506j abstractC3506j) {
        InterfaceC4317m interfaceC4317mM3342g;
        C4325u c4325u = c3541x.f11517a;
        AbstractC3391b abstractC3391b = (AbstractC3391b) c4320p;
        if (m7451h(abstractC3391b, abstractC3508l) || abstractC3391b.mo7171k0() != abstractC3508l || (interfaceC4317mM3342g = c4325u.f14442h.m3342g(abstractC3391b)) == null) {
            return 2;
        }
        final C1214a c1214a = c4325u.f14443i;
        C4322r c4322r = (C4322r) c1071g.f3452d;
        c1214a.getClass();
        Set setM3336e = C1214a.m3336e(c4322r);
        final Map mapM3343i = c1214a.m3343i(abstractC3506j);
        final AbstractC3506j abstractC3506jMo2220e = interfaceC4317mM3342g.mo2220e();
        List listMo2218c = interfaceC4317mM3342g.mo2218c();
        int size = listMo2218c.size();
        return mapM3343i.isEmpty() ? c3541x.m7454d(c1071g, abstractC3391b, size, setM3336e, new Supplier() { // from class: qe.u
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.Supplier
            public final Object get() {
                return abstractC3506jMo2220e;
            }
        }, new C0260j(listMo2218c, 11)) : c3541x.m7454d(c1071g, abstractC3391b, size, setM3336e, new Supplier() { // from class: qe.v
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.Supplier
            public final Object get() {
                return c1214a.m3346m(abstractC3506jMo2220e, mapM3343i);
            }
        }, new C0689b(c1214a, abstractC3506j, listMo2218c, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m7449e(AbstractC3506j abstractC3506j, AbstractC3506j abstractC3506j2) {
        if (abstractC3506j == AbstractC3506j.f11404u) {
            return true;
        }
        abstractC3506j2.getClass();
        boolean z9 = abstractC3506j2 instanceof C3497a;
        abstractC3506j.getClass();
        if ((abstractC3506j instanceof C3497a) && z9) {
            return m7449e(abstractC3506j.mo7340g(), abstractC3506j2.mo7340g());
        }
        if (z9 && abstractC3506j.mo7349a(EnumC3513q.ARRAY)) {
            return true;
        }
        if (abstractC3506j2.mo7351v() && abstractC3506j.mo7349a(EnumC3513q.OBJECT)) {
            return true;
        }
        return (abstractC3506j2 instanceof C3503g) && abstractC3506j.mo7349a(abstractC3506j2.mo7343o());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static AbstractC3506j m7450g(Set set, AbstractC3506j abstractC3506j) {
        if (abstractC3506j == null || (abstractC3506j instanceof C3505i)) {
            return null;
        }
        if (!abstractC3506j.m7365c() || (!set.isEmpty() && ((Boolean) abstractC3506j.m7363C(new C3540w(set, 0))) == null)) {
            return abstractC3506j;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m7451h(C4320p c4320p, AbstractC3508l abstractC3508l) {
        return c4320p.f14397l == abstractC3508l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m7452b(C1071g c1071g, C4320p c4320p, AbstractC3508l abstractC3508l, AbstractC3506j abstractC3506j) {
        if (!m7451h(c4320p, abstractC3508l)) {
            return m7458k(c1071g, c4320p.f14397l, abstractC3506j);
        }
        boolean z9 = true;
        for (AbstractC3508l abstractC3508l2 : c4320p.f14398m) {
            if (abstractC3508l2 != abstractC3508l) {
                int iM7458k = m7458k(c1071g, abstractC3508l2, abstractC3506j);
                if (iM7458k == 1) {
                    return iM7458k;
                }
                if (iM7458k != 2) {
                    z9 = false;
                }
            }
        }
        return z9 ? 2 : 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m7453c(C4322r c4322r, C3515s c3515s, AbstractC3506j abstractC3506j, C3517a0 c3517a0) {
        if (abstractC3506j != null) {
            try {
                if (abstractC3506j.mo7345w()) {
                    C1071g c1071g = new C1071g(c4322r, c3517a0, this.f11520d);
                    IdentityHashMap identityHashMap = (IdentityHashMap) c1071g.f3454f;
                    int iM7458k = m7458k(c1071g, c3515s.f11444i, abstractC3506j);
                    if (iM7458k == 1) {
                        return iM7458k;
                    }
                    if (identityHashMap.isEmpty()) {
                        return 2;
                    }
                    identityHashMap.values().stream().sorted().forEach(new C0074e(26));
                    return 3;
                }
            } catch (Exception e6) {
                c4322r.m6384M(AbstractC0255e.m1021j("Type update failed for variable: ", String.valueOf(c3515s), ", new type: ", String.valueOf(abstractC3506j)), e6);
            }
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077 A[RETURN] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m7454d(C1071g c1071g, AbstractC3391b abstractC3391b, int i9, Set set, Supplier supplier, Function function) {
        boolean z9;
        int i10;
        AbstractC3506j abstractC3506jM7450g;
        AbstractC3506j abstractC3506jM7450g2;
        C3514r c3514r = abstractC3391b.f14397l;
        C3528k c3528k = this.f11519c;
        if (c3514r == null || c3514r.mo7382P() || (abstractC3506jM7450g2 = m7450g(set, (AbstractC3506j) supplier.get())) == null) {
            z9 = true;
            int iMo7170j0 = abstractC3391b.mo7170j0();
            for (i10 = 0; i10 < i9; i10++) {
                AbstractC3508l abstractC3508lMo7179S = abstractC3391b.mo7179S(iMo7170j0 + i10);
                if (!abstractC3508lMo7179S.mo7382P() && (abstractC3506jM7450g = m7450g(set, (AbstractC3506j) function.apply(Integer.valueOf(i10)))) != null) {
                    int iM7458k = m7458k(c1071g, abstractC3508lMo7179S, abstractC3506jM7450g);
                    if (iM7458k != 1 || !c3528k.m7432d(abstractC3506jM7450g, abstractC3508lMo7179S.mo7375I()).m7435c()) {
                        if (iM7458k == 3) {
                            z9 = false;
                        }
                    }
                }
            }
            return !z9 ? 2 : 3;
        }
        int iM7458k2 = m7458k(c1071g, c3514r, abstractC3506jM7450g2);
        if (iM7458k2 != 1 || !c3528k.m7432d(abstractC3506jM7450g2, c3514r.mo7375I()).m7436d()) {
            if (iM7458k2 == 3) {
                z9 = false;
            }
            int iMo7170j02 = abstractC3391b.mo7170j0();
            while (i10 < i9) {
            }
            if (!z9) {
            }
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045 A[RETURN] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7455f(AbstractC3506j abstractC3506j, InterfaceC3521d interfaceC3521d, AbstractC3506j abstractC3506j2) {
        C3528k c3528k = this.f11519c;
        EnumC3529l enumC3529lM7432d = c3528k.m7432d(abstractC3506j, abstractC3506j2);
        switch (enumC3529lM7432d.ordinal()) {
            case 0:
            case 2:
            case 4:
                return true;
            case 1:
                if (interfaceC3521d.mo7424b() == 1 && (abstractC3506j2.mo7345w() || !m7449e(abstractC3506j2, abstractC3506j))) {
                    return false;
                }
                break;
            case 3:
                if (interfaceC3521d.mo7424b() == 2) {
                    return false;
                }
                break;
            case 5:
            case 6:
                return false;
            case 7:
                f11516e.mo6265s(abstractC3506j, "Can't compare types, unknown hierarchy: {} and {}", abstractC3506j2);
                c3528k.m7432d(abstractC3506j, abstractC3506j2);
                return true;
            default:
                C0086a.m452k("Not processed type compare enum: ".concat(String.valueOf(enumC3529lM7432d)));
                return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[PHI: r1
  0x0032: PHI (r1v16 int) = 
  (r1v4 int)
  (r1v4 int)
  (r1v9 int)
  (r1v9 int)
  (r1v9 int)
  (r1v9 int)
  (r1v11 int)
  (r1v11 int)
  (r1v11 int)
  (r1v11 int)
  (r1v11 int)
  (r1v4 int)
  (r1v12 int)
  (r1v12 int)
  (r1v12 int)
  (r1v13 int)
  (r1v4 int)
  (r1v4 int)
  (r1v4 int)
  (r1v4 int)
  (r1v4 int)
  (r1v4 int)
  (r1v4 int)
  (r1v4 int)
 binds: [B:13:0x0030, B:140:0x021e, B:145:0x022e, B:147:0x023a, B:149:0x023e, B:151:0x0244, B:129:0x01ef, B:131:0x01fd, B:133:0x0201, B:135:0x020c, B:137:0x0216, B:124:0x01c7, B:116:0x01ad, B:118:0x01b7, B:122:0x01c3, B:109:0x0192, B:102:0x017c, B:107:0x018e, B:85:0x0149, B:89:0x0157, B:76:0x0131, B:80:0x013f, B:59:0x00e7, B:23:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m7456i(C1071g c1071g, AbstractC3508l abstractC3508l, AbstractC3506j abstractC3506j) {
        int iM7448a;
        EnumC3529l enumC3529lM7432d;
        IdentityHashMap identityHashMap = (IdentityHashMap) c1071g.f3454f;
        int iM7458k = 3;
        if (identityHashMap.containsKey(abstractC3508l)) {
            return 3;
        }
        int i9 = c1071g.f3451c;
        c1071g.f3451c = i9 + 1;
        C3542y c3542y = (C3542y) identityHashMap.put(abstractC3508l, new C3542y(i9, abstractC3508l, abstractC3506j));
        if (c3542y != null) {
            String strValueOf = String.valueOf(abstractC3508l);
            String strValueOf2 = String.valueOf(c3542y.f11523i);
            String strValueOf3 = String.valueOf(abstractC3506j);
            String strValueOf4 = String.valueOf(abstractC3508l.f11420j);
            StringBuilder sbM1027p = AbstractC0255e.m1027p("Unexpected type update override for arg: ", strValueOf, " types: prev=", strValueOf2, ", new=");
            sbM1027p.append(strValueOf3);
            sbM1027p.append(", insn: ");
            sbM1027p.append(strValueOf4);
            throw new C0084g(sbM1027p.toString());
        }
        int i10 = c1071g.f3451c;
        if (i10 > c1071g.f3450b) {
            throw new C0083f(AbstractC0921a.m2250m(i10, "Type inference error: updates count limit reached with updateSeq = ", ". Try increasing type updates limit count."));
        }
        if (i10 % 100 == 0) {
            AbstractC5798s.m10507a();
        }
        C4320p c4320p = abstractC3508l.f11420j;
        int iM7458k2 = 2;
        if (c4320p != null) {
            C3537t c3537t = (C3537t) this.f11518b.get(c4320p.f14396k);
            if (c3537t != null) {
                int i11 = c3537t.f11508a;
                EnumC3529l enumC3529l = EnumC3529l.f11484j;
                switch (i11) {
                    case 0:
                        C3541x c3541x = c3537t.f11509b;
                        AbstractC3508l abstractC3508lMo7179S = m7451h(c4320p, abstractC3508l) ? c4320p.mo7179S(0) : c4320p.f14397l;
                        C3542y c3542y2 = (C3542y) ((IdentityHashMap) c1071g.f3454f).get(abstractC3508lMo7179S);
                        if (!(c3542y2 != null ? c3542y2.f11523i.equals(abstractC3506j) : false)) {
                            iM7458k = c3541x.m7458k(c1071g, abstractC3508lMo7179S, abstractC3506j);
                        }
                        break;
                    case 1:
                        iM7448a = m7448a(c3537t.f11509b, c1071g, c4320p, abstractC3508l, abstractC3506j);
                        iM7458k = iM7448a;
                        break;
                    case 2:
                        C3541x c3541x2 = c3537t.f11509b;
                        AbstractC3508l abstractC3508lMo7179S2 = c4320p.f14397l;
                        if (abstractC3508lMo7179S2 != null) {
                            boolean z9 = abstractC3508lMo7179S2 == abstractC3508l;
                            if (z9) {
                                abstractC3508lMo7179S2 = c4320p.mo7179S(0);
                            }
                            EnumC3529l enumC3529lM7432d2 = c3541x2.f11519c.m7432d(abstractC3506j, abstractC3508lMo7179S2.mo7375I());
                            if (enumC3529lM7432d2.m7434b() || (!z9 ? enumC3529lM7432d2.m7435c() : enumC3529lM7432d2.m7436d())) {
                                z = true;
                            }
                            iM7448a = c3541x2.m7458k(c1071g, abstractC3508lMo7179S2, abstractC3506j);
                            if (iM7448a == 2 && !z) {
                                iM7458k = 1;
                            } else if (iM7448a != 1 || !z) {
                                iM7458k = iM7448a;
                            }
                        }
                        break;
                    case 3:
                        iM7448a = c3537t.f11509b.m7452b(c1071g, c4320p, abstractC3508l, abstractC3506j);
                        iM7458k = iM7448a;
                        break;
                    case 4:
                        C3541x c3541x3 = c3537t.f11509b;
                        C3528k c3528k = c3541x3.f11519c;
                        if (m7451h(c4320p, abstractC3508l)) {
                            AbstractC3508l abstractC3508lMo7179S3 = c4320p.mo7179S(0);
                            C3503g c3503g = AbstractC3506j.f11385b;
                            iM7458k2 = c3541x3.m7458k(c1071g, abstractC3508lMo7179S3, new C3497a(abstractC3506j));
                            if (iM7458k2 == 1) {
                                AbstractC3506j abstractC3506jMo7375I = c4320p.mo7179S(0).mo7375I();
                                if (!abstractC3506jMo7375I.mo7345w() || !(abstractC3506jMo7375I instanceof C3497a)) {
                                    iM7458k = iM7458k2;
                                    break;
                                } else {
                                    AbstractC3506j abstractC3506jMo7340g = abstractC3506jMo7375I.mo7340g();
                                    abstractC3506jMo7340g.getClass();
                                    if (!(abstractC3506jMo7340g instanceof C3503g) || c3528k.m7432d(abstractC3506j, abstractC3506jMo7375I.mo7340g()) != enumC3529l) {
                                    }
                                }
                            }
                        } else if (c4320p.mo7179S(0) == abstractC3508l) {
                            AbstractC3506j abstractC3506jMo7340g2 = abstractC3506j.mo7340g();
                            if (abstractC3506jMo7340g2 != null) {
                                iM7458k2 = c3541x3.m7458k(c1071g, c4320p.f14397l, abstractC3506jMo7340g2);
                                if (iM7458k2 == 1) {
                                    AbstractC3506j abstractC3506jMo7375I2 = c4320p.f14397l.mo7375I();
                                    if (!abstractC3506jMo7375I2.mo7345w() || !(abstractC3506jMo7375I2 instanceof C3503g) || c3528k.m7432d(abstractC3506jMo7375I2, abstractC3506jMo7340g2) != enumC3529l) {
                                    }
                                }
                            }
                        }
                        break;
                    case 5:
                        C3541x c3541x4 = c3537t.f11509b;
                        AbstractC3508l abstractC3508lMo7179S4 = c4320p.mo7179S(0);
                        AbstractC3508l abstractC3508lMo7179S5 = c4320p.mo7179S(2);
                        if (abstractC3508lMo7179S4 == abstractC3508l) {
                            AbstractC3506j abstractC3506jMo7340g3 = abstractC3506j.mo7340g();
                            if (abstractC3506jMo7340g3 != null) {
                                iM7458k2 = c3541x4.m7458k(c1071g, abstractC3508lMo7179S5, abstractC3506jMo7340g3);
                                if (iM7458k2 == 1) {
                                    AbstractC3506j abstractC3506jMo7375I3 = abstractC3508lMo7179S5.mo7375I();
                                    if (!abstractC3506jMo7375I3.mo7345w() || ((enumC3529lM7432d = c3541x4.f11519c.m7432d(abstractC3506jMo7340g3, abstractC3506jMo7375I3)) != enumC3529l && enumC3529lM7432d != EnumC3529l.f11485k)) {
                                    }
                                }
                            }
                        } else if (abstractC3508lMo7179S4 == abstractC3508lMo7179S5) {
                            C3503g c3503g2 = AbstractC3506j.f11385b;
                            iM7458k = c3541x4.m7458k(c1071g, abstractC3508lMo7179S4, new C3497a(abstractC3506j));
                            break;
                        }
                        break;
                    case 6:
                        C3541x c3541x5 = c3537t.f11509b;
                        AbstractC3508l abstractC3508lMo7179S6 = c4320p.mo7179S(0);
                        AbstractC3508l abstractC3508lMo7179S7 = c4320p.mo7179S(1);
                        if (abstractC3508lMo7179S6 == abstractC3508l) {
                            abstractC3508lMo7179S6 = abstractC3508lMo7179S7;
                        }
                        int iM7458k3 = c3541x5.m7458k(c1071g, abstractC3508lMo7179S6, abstractC3506j);
                        if (iM7458k3 == 1) {
                            AbstractC3506j abstractC3506jMo7375I4 = abstractC3508lMo7179S6.mo7375I();
                            if ((!abstractC3506j.mo7351v() || (!abstractC3506jMo7375I4.mo7351v() && (abstractC3506jMo7375I4.mo7345w() || !abstractC3506jMo7375I4.mo7349a(EnumC3513q.OBJECT)))) && (!(abstractC3506j instanceof C3497a) || (!(abstractC3506jMo7375I4 instanceof C3497a) && (abstractC3506jMo7375I4.mo7345w() || !abstractC3506jMo7375I4.mo7349a(EnumC3513q.ARRAY))))) {
                                if (abstractC3506j instanceof C3503g) {
                                    EnumC3513q enumC3513q = ((C3503g) abstractC3506j).f11372K;
                                    if (((abstractC3506jMo7375I4 instanceof C3503g) && ((C3503g) abstractC3506jMo7375I4).f11372K == enumC3513q) || (!abstractC3506jMo7375I4.mo7345w() && abstractC3506jMo7375I4.mo7349a(enumC3513q))) {
                                        z = true;
                                    }
                                    if (!z && (!abstractC3506jMo7375I4.mo7345w() || abstractC3506j.m7366p() != abstractC3506jMo7375I4.m7366p())) {
                                        iM7458k2 = iM7458k3;
                                    }
                                }
                            }
                            iM7458k = iM7458k2;
                            break;
                        }
                        break;
                    case 7:
                        C3541x c3541x6 = c3537t.f11509b;
                        iM7448a = (abstractC3506j == AbstractC3506j.f11386c && AbstractC3199a.m6829b(((C3390a) c4320p).f10928o)) ? c3541x6.m7452b(c1071g, c4320p, abstractC3508l, abstractC3506j) : c3541x6.m7457j(c1071g, c4320p, abstractC3508l, abstractC3506j);
                        iM7458k = iM7448a;
                        break;
                    case 8:
                        iM7448a = c3537t.f11509b.m7457j(c1071g, c4320p, abstractC3508l, abstractC3506j);
                        iM7458k = iM7448a;
                        break;
                    default:
                        C3541x c3541x7 = c3537t.f11509b;
                        C3399j c3399j = (C3399j) c4320p;
                        if (m7451h(c4320p, abstractC3508l)) {
                            iM7458k = c3541x7.m7458k(c1071g, c4320p.mo7179S(0), abstractC3506j);
                            if (iM7458k == 1) {
                            }
                        } else {
                            AbstractC3506j abstractC3506j2 = (AbstractC3506j) c3399j.f10948o;
                            EnumC3529l enumC3529lM7432d3 = c3541x7.f11519c.m7432d(abstractC3506j, abstractC3506j2);
                            if (enumC3529lM7432d3 == EnumC3529l.f11486l) {
                                C4325u c4325u = c3541x7.f11517a;
                                if (abstractC3506j.mo7351v() && abstractC3506j2.mo7351v()) {
                                    C0909b c0909bM2214c = c4325u.f14453s.m2214c(abstractC3506j);
                                    C0909b c0909bM2214c2 = c4325u.f14453s.m2214c(abstractC3506j2);
                                    if ((c0909bM2214c == null || AbstractC3754e0.m7864G(c0909bM2214c.f2827b, Opcodes.ACC_INTERFACE)) && ((c0909bM2214c2 == null || AbstractC3754e0.m7864G(c0909bM2214c2.f2827b, Opcodes.ACC_INTERFACE)) && (c0909bM2214c == null || c0909bM2214c2 == null || (AbstractC3754e0.m7864G(c0909bM2214c2.f2827b, Opcodes.ACC_INTERFACE) && AbstractC3754e0.m7864G(c0909bM2214c.f2827b, Opcodes.ACC_INTERFACE))))) {
                                        if (enumC3529lM7432d3 == EnumC3529l.f11487m) {
                                            if (!c4320p.f9217g.mo6235a(EnumC2824a.f9139Y)) {
                                            }
                                        }
                                        if (enumC3529lM7432d3 == EnumC3529l.f11483i && abstractC3506j.m7364b()) {
                                            iM7458k = c3541x7.m7458k(c1071g, c3399j.f14397l, abstractC3506j);
                                            break;
                                        } else if (abstractC3506j.equals(c3399j.mo7179S(0).mo7375I())) {
                                        }
                                    }
                                }
                                iM7458k = 1;
                                break;
                            }
                        }
                        break;
                }
            }
        }
        if (iM7458k == 1) {
            c1071g.m2700c(abstractC3508l);
        }
        return iM7458k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m7457j(C1071g c1071g, C4320p c4320p, AbstractC3508l abstractC3508l, AbstractC3506j abstractC3506j) {
        int iM7458k;
        C3514r c3514r;
        if (!m7451h(c4320p, abstractC3508l) && (c3514r = c4320p.f14397l) != null) {
            m7458k(c1071g, c3514r, abstractC3506j);
        }
        boolean z9 = true;
        for (AbstractC3508l abstractC3508l2 : c4320p.f14398m) {
            if (abstractC3508l2 != abstractC3508l && (iM7458k = m7458k(c1071g, abstractC3508l2, abstractC3506j)) != 1 && iM7458k != 2) {
                z9 = false;
            }
        }
        return z9 ? 2 : 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m7458k(C1071g c1071g, AbstractC3508l abstractC3508l, AbstractC3506j abstractC3506j) {
        int i9;
        if (abstractC3506j == null) {
            C0086a.m452k("Null type update for arg: ".concat(String.valueOf(abstractC3508l)));
            return 0;
        }
        if (((IdentityHashMap) c1071g.f3454f).containsKey(abstractC3508l)) {
            return 3;
        }
        AbstractC3506j abstractC3506jMo7375I = abstractC3508l.mo7375I();
        C3517a0 c3517a0 = (C3517a0) c1071g.f3453e;
        if (Objects.equals(abstractC3506jMo7375I, abstractC3506j)) {
            i9 = !c3517a0.f11455a.contains(EnumC3543z.f11525h) ? 2 : 0;
        } else {
            if (!(abstractC3506j instanceof C3505i)) {
                EnumC3529l enumC3529lM7432d = this.f11519c.m7432d(abstractC3506j, abstractC3506jMo7375I);
                enumC3529lM7432d.getClass();
                if (enumC3529lM7432d != EnumC3529l.f11486l && enumC3529lM7432d != EnumC3529l.f11487m && (enumC3529lM7432d != EnumC3529l.f11488n || !c3517a0.f11455a.contains(EnumC3543z.f11526i))) {
                    if (!abstractC3508l.mo7382P() || abstractC3506jMo7375I == AbstractC3506j.f11404u) {
                        if ((enumC3529lM7432d != EnumC3529l.f11485k || !c3517a0.f11455a.contains(EnumC3543z.f11527j)) && (!enumC3529lM7432d.m7436d() || c3517a0.f11455a.contains(EnumC3543z.f11524g))) {
                            if (abstractC3506j.m7365c()) {
                                C1214a c1214a = this.f11517a.f14443i;
                                C4322r c4322r = (C4322r) c1071g.f3452d;
                                c1214a.getClass();
                                if (((AbstractC3506j) abstractC3506j.m7363C(new C3540w(C1214a.m3336e(c4322r), 1))) != null) {
                                }
                            }
                        }
                    } else if (enumC3529lM7432d == EnumC3529l.f11481g) {
                    }
                }
            }
            i9 = 1;
        }
        if (i9 != 0) {
            return i9;
        }
        if (!(abstractC3508l instanceof C3514r)) {
            return m7456i(c1071g, abstractC3508l, abstractC3506j);
        }
        C3515s c3515s = ((C3514r) abstractC3508l).f11440m;
        C3315t c3315t = c3515s.f11447l;
        ArrayList arrayList = c3515s.f11445j;
        AbstractC3506j abstractC3506jM7400d = c3515s.m7400d();
        if (abstractC3506jM7400d == null || abstractC3506jM7400d.equals(abstractC3506j)) {
            for (InterfaceC3521d interfaceC3521d : (LinkedHashSet) c3315t.f10678i) {
                AbstractC3506j abstractC3506jMo7425a = interfaceC3521d instanceof InterfaceC3522e ? ((InterfaceC3522e) interfaceC3521d).mo7425a(c1071g) : interfaceC3521d.getType();
                if (abstractC3506jMo7425a == null || m7455f(abstractC3506j, interfaceC3521d, abstractC3506jMo7425a)) {
                }
            }
            int iM7456i = m7456i(c1071g, c3515s.f11444i, abstractC3506j);
            boolean z9 = iM7456i == 2;
            if (iM7456i != 1) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (iM7456i = m7456i(c1071g, (C3514r) it.next(), abstractC3506j)) != 1) {
                    if (iM7456i != 2) {
                        z9 = false;
                    }
                }
            }
            if (iM7456i != 1) {
                return z9 ? 2 : 3;
            }
            c1071g.m2700c(c3515s.f11444i);
            arrayList.forEach(new C0076g(c1071g, 17));
            return 1;
        }
        return 1;
    }
}
