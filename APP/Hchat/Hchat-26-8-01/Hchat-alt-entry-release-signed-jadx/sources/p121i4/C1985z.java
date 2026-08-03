package p121i4;

import androidx.lifecycle.C0119x;
import bsh.C0353j;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import p000a.AbstractC0000a;
import p020b5.C0184c;
import p071f1.C1005h;
import p096g8.C1361b;
import p104h4.C1589c;
import p104h4.C1607u;
import p136j8.C2104o;
import p163l4.InterfaceC2473b;
import p192n4.C2893a;
import p295u4.AbstractC4259i;
import p295u4.AbstractC4269s;
import p295u4.C4252b;
import p295u4.C4253c;
import p295u4.C4261k;
import p295u4.C4262l;
import p295u4.C4263m;
import p295u4.C4265o;
import p295u4.C4266p;
import p295u4.C4268r;
import p295u4.C4270t;
import p295u4.C4271u;
import p295u4.C4272v;
import p295u4.InterfaceC4251a;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4466o;
import p326w4.C4681a;
import p326w4.C4682b;
import p326w4.C4683c;
import p326w4.InterfaceC4684d;
import p326w4.InterfaceC4685e;
import p343x6.AbstractC5700d;
import p376z4.C6093g;

/* JADX INFO: renamed from: i4.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1985z {

    /* JADX INFO: renamed from: a */
    public final C1972m f6720a;

    /* JADX INFO: renamed from: b */
    public final C1964e f6721b;

    /* JADX INFO: renamed from: c */
    public final int f6722c;

    /* JADX INFO: renamed from: d */
    public final int f6723d;

    /* JADX INFO: renamed from: e */
    public final C1958a0 f6724e;

    /* JADX INFO: renamed from: f */
    public final C1962c0 f6725f;

    /* JADX INFO: renamed from: g */
    public final C0184c[] f6726g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f6727h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f6728i;

    /* JADX INFO: renamed from: j */
    public final C1971l[] f6729j;

    /* JADX INFO: renamed from: k */
    public boolean f6730k;

    /* JADX INFO: renamed from: l */
    public final C1005h[] f6731l;

    /* JADX INFO: renamed from: m */
    public boolean f6732m;

    /* JADX INFO: renamed from: n */
    public final C1983x f6733n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1985z(C1972m c1972m, C1607u c1607u, C2893a c2893a) {
        C1966g c1966g;
        C1589c c1589c = c1972m.f6689c;
        this.f6720a = c1972m;
        C1957a c1957a = new C1957a();
        c1957a.f6623h = c1972m;
        int i9 = ((C1361b) c1972m.f6689c.f5258d.f6685g).f4512c + 1;
        c1957a.f6624i = AbstractC5700d.m10255L(i9);
        c1957a.f6625j = AbstractC5700d.m10255L(i9);
        c1957a.f6626k = AbstractC5700d.m10255L(i9);
        c1957a.f6627l = new C6093g[i9];
        c1957a.f6628m = new C1966g[i9];
        c1957a.f6622g = -1;
        int[] iArr = (int[]) c1957a.f6625j;
        C1971l c1971l = c1589c.f5258d;
        C1966g c1966g2 = c1589c.f5259e;
        int length = c1966g2.f24601h.length;
        int[] iArr2 = (int[]) c1957a.f6624i;
        AbstractC5700d.m10278g0(iArr2, 0);
        int[] iArr3 = (int[]) c1957a.f6626k;
        AbstractC5700d.m10278g0(iArr3, 0);
        loop0: while (true) {
            for (int i10 : iArr2) {
                if (i10 != 0) {
                    try {
                        c1971l.getClass();
                        while (true) {
                            int iM10297x = AbstractC5700d.m10297x(iArr2, 0);
                            if (iM10297x < 0) {
                                break;
                            }
                            AbstractC5700d.m10290q(iArr2, iM10297x);
                            c1971l.m4870a(iM10297x, c1957a);
                            c1957a.f6622g = iM10297x;
                        }
                        for (int i11 = 0; i11 < length; i11++) {
                            C1965f c1965f = (C1965f) c1966g2.m10840l(i11);
                            int i12 = c1965f.f6674a;
                            int i13 = c1965f.f6675b;
                            int iM10297x2 = AbstractC5700d.m10297x(iArr, i12);
                            if (iM10297x2 >= 0 && iM10297x2 < i13) {
                                AbstractC5700d.m10278g0(iArr3, i12);
                                AbstractC5700d.m10278g0(iArr3, i13);
                                c1957a.m4843e(c1965f.f6676c, true);
                            }
                        }
                    } catch (IllegalArgumentException e6) {
                        throw new C1960b0("flow of control falls off end of method", e6);
                    }
                }
            }
            break loop0;
        }
        C1963d[] c1963dArr = new C1963d[((C1361b) ((C1972m) c1957a.f6623h).f6689c.f5258d.f6685g).f4512c];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int iM10297x3 = AbstractC5700d.m10297x(iArr3, i15 + 1);
            if (iM10297x3 < 0) {
                break;
            }
            if (AbstractC5700d.m10299z(iArr, i15)) {
                int i16 = iM10297x3 - 1;
                C6093g c6093gM10843o = null;
                while (true) {
                    if (i16 < i15) {
                        i16 = -1;
                        break;
                    }
                    c6093gM10843o = ((C6093g[]) c1957a.f6627l)[i16];
                    if (c6093gM10843o != null) {
                        break;
                    } else {
                        i16--;
                    }
                }
                if (c6093gM10843o == null) {
                    c6093gM10843o = C6093g.m10843o(iM10297x3);
                    c1966g = C1966g.f6678i;
                } else {
                    c1966g = ((C1966g[]) c1957a.f6628m)[i16];
                    if (c1966g == null) {
                        c1966g = C1966g.f6678i;
                    }
                }
                c1963dArr[i14] = new C1963d(i15, i15, iM10297x3, c6093gM10843o, c1966g);
                i14++;
            }
            i15 = iM10297x3;
        }
        C1964e c1964e = new C1964e(i14);
        for (int i17 = 0; i17 < i14; i17++) {
            c1964e.m10853q(i17, c1963dArr[i17]);
        }
        this.f6721b = c1964e;
        int iM10851o = c1964e.m10851o();
        this.f6723d = iM10851o;
        int i18 = c1589c.f5257c;
        this.f6722c = i18;
        C1958a0 c1958a0 = new C1958a0(this, c1972m, c1607u);
        this.f6724e = c1958a0;
        this.f6725f = new C1962c0(c1958a0, c1972m, c2893a);
        C0184c[] c0184cArr = new C0184c[iM10851o];
        this.f6726g = c0184cArr;
        this.f6731l = new C1005h[iM10851o];
        this.f6727h = new ArrayList((c1964e.f24601h.length * 2) + 10);
        this.f6728i = new ArrayList((c1964e.f24601h.length * 2) + 10);
        this.f6729j = new C1971l[iM10851o];
        this.f6730k = false;
        c0184cArr[0] = new C0184c((AbstractC1978s) new C1980u(i18), new C1973n(c1589c.f5256b, 0), C6093g.f24608k);
        C1983x c1983x = new C1983x(iM10851o);
        c1983x.f6712h = iM10851o + this.f6720a.f6689c.f5259e.f24601h.length;
        this.f6733n = c1983x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C1005h m4912b(C1972m c1972m, C1607u c1607u, C2893a c2893a) {
        try {
            C1985z c1985z = new C1985z(c1972m, c1607u, c2893a);
            c1985z.m4914c();
            ArrayList arrayList = c1985z.f6727h;
            int size = arrayList.size();
            C4253c c4253c = new C4253c(size);
            for (int i9 = 0; i9 < size; i9++) {
                c4253c.m10853q(i9, (C4252b) arrayList.get(i9));
                c4253c.f13934j = -1;
            }
            c4253c.f24613g = false;
            return new C1005h(c4253c, c1985z.m4917f(-1));
        } catch (C1960b0 e6) {
            e6.m2687a("...while working on method ".concat(c1972m.f6687a.mo4878d().mo4901a()));
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4913a(C4252b c4252b, C6093g c6093g) {
        this.f6727h.add(c4252b);
        c6093g.m10856k();
        this.f6728i.add(c6093g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.String, u4.k, u4.o] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11, types: [int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r4v0, types: [i4.m] */
    /* JADX WARN: Type inference failed for: r8v24, types: [h4.u, z4.e, z4.j] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public final void m4914c() {
        int i9;
        int i10;
        ?? r10;
        int i11;
        InterfaceC2473b interfaceC2473b;
        ?? r12;
        boolean z9;
        C4266p c4266pM8567p;
        ?? r122;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        C4265o c4265o;
        C4266p c4266p;
        boolean z11;
        C1607u c1607u;
        boolean z12;
        C4265o c4265oM8557k;
        int i12 = this.f6723d;
        int[] iArrM10255L = AbstractC5700d.m10255L(i12);
        int i13 = 0;
        AbstractC5700d.m10278g0(iArrM10255L, 0);
        ?? r42 = this.f6720a;
        C1977r c1977r = r42.f6691e;
        C4270t c4270tM4880f = r42.m4880f(0);
        InterfaceC2473b interfaceC2473b2 = r42.f6687a;
        C4682b c4682b = interfaceC2473b2.mo4875a().f15571i;
        int length = c4682b.f24601h.length;
        C1607u c1607u2 = new C1607u(length + 1);
        int i14 = 0;
        int iM9188i = 0;
        while (true) {
            if (i14 >= length) {
                break;
            }
            C4683c c4683c = (C4683c) c4682b.m10840l(i14);
            C1976q c1976qM4891o = c1977r.m4891o(i13, iM9188i);
            if (c1976qM4891o == null) {
                c4265oM8557k = C4265o.m8557k(iM9188i, c4683c, null);
            } else {
                C4451c0 c4451c0 = c1976qM4891o.f6701c;
                C4451c0 c4451c02 = c1976qM4891o.f6703e;
                c4265oM8557k = C4265o.m8557k(iM9188i, c4683c, (c4451c0 == null && c4451c02 == null) ? null : new C4261k(c4451c0, c4451c02));
            }
            int i15 = i14;
            int i16 = iM9188i;
            c1607u2.m10841m(i15, new C4262l(AbstractC4269s.m8583h(c4683c), c4270tM4880f, c4265oM8557k, C4266p.f13968i, C4466o.m8909o(i16)));
            iM9188i = c4683c.m9188i() + i16;
            i14 = i15 + 1;
            i13 = 0;
        }
        C4268r c4268r = AbstractC4269s.f14148s;
        C4266p c4266p2 = C4266p.f13968i;
        c1607u2.m10841m(length, new C4263m(c4268r, c4270tM4880f, (C4265o) null, c4266p2));
        c1607u2.f24613g = false;
        boolean zM4920i = m4920i();
        int iM4917f = zM4920i ? m4917f(-4) : 0;
        C4252b c4252b = new C4252b(m4917f(-1), c1607u2, C6093g.m10843o(iM4917f), iM4917f);
        C6093g c6093g = C6093g.f24608k;
        m4913a(c4252b, c6093g);
        int i17 = this.f6722c;
        if (zM4920i) {
            int i18 = r42.f6689c.f5256b + i17;
            if (i18 < 1) {
                i18 = 1;
            }
            C4265o c4265oM8557k2 = C4265o.m8557k(i18, C4683c.f15613E, null);
            if (m4918g()) {
                c4266p = c4266p2;
                i10 = i17;
                C4272v c4272v = new C4272v(AbstractC4269s.f14140q, c4270tM4880f, c4266p, C4682b.f15591i, interfaceC2473b2.mo4876b());
                c1607u = new C1607u(1);
                c1607u.m10841m(0, c4272v);
                i9 = i12;
                c4265o = c4265oM8557k2;
                i11 = 1;
                interfaceC2473b = interfaceC2473b2;
                z10 = false;
                z11 = false;
            } else {
                i10 = i17;
                C1607u c1607u3 = new C1607u(2);
                i9 = i12;
                i11 = 1;
                interfaceC2473b = interfaceC2473b2;
                z10 = false;
                c4265o = c4265oM8557k2;
                c4266p = c4266p2;
                c1607u3.m10841m(0, new C4262l(AbstractC4269s.f14120l, c4270tM4880f, c4265oM8557k2, c4266p2, C4466o.f14803j));
                z11 = false;
                c1607u3.m10841m(1, new C4263m(c4268r, c4270tM4880f, (C4265o) null, c4266p));
                c1607u = c1607u3;
            }
            int iM4917f2 = m4917f(-5);
            c1607u.f24613g = z10;
            m4913a(new C4252b(iM4917f, c1607u, C6093g.m10843o(iM4917f2), iM4917f2), c6093g);
            C1607u c1607u4 = new C1607u(m4918g() ? 2 : i11);
            if (m4918g()) {
                z12 = false;
                c1607u4.m10841m(0, new C4263m(AbstractC4269s.m8585j(c4265o), c4270tM4880f, c4265o, c4266p));
            } else {
                z12 = false;
            }
            c1607u4.m10841m(m4918g() ? 1 : 0, new C4271u(AbstractC4269s.f13996E1, c4270tM4880f, C4266p.m8567p(c4265o), C4682b.f15591i));
            c1607u4.f24613g = z12;
            m4913a(new C4252b(iM4917f2, c1607u4, C6093g.m10843o(z12 ? 1 : 0), z12 ? 1 : 0), c6093g);
            r10 = z11;
            r12 = z12;
        } else {
            i9 = i12;
            i10 = i17;
            r10 = 0;
            i11 = 1;
            interfaceC2473b = interfaceC2473b2;
            r12 = 0;
        }
        C4681a c4681aMo4875a = interfaceC2473b.mo4875a();
        C0184c[] c0184cArr = this.f6726g;
        C0184c c0184c = c0184cArr[r12];
        C4682b c4682b2 = c4681aMo4875a.f15571i;
        c0184c.getClass();
        int length2 = c4682b2.f24601h.length;
        int iM9188i2 = 0;
        for (int i19 = 0; i19 < length2; i19++) {
            C4683c c4683c2 = (C4683c) c4682b2.m10840l(i19);
            ((AbstractC1978s) c0184c.f469a).mo4899s(iM9188i2, c4683c2);
            iM9188i2 += c4683c2.m9188i();
        }
        int i20 = 0;
        C0184c c0184c2 = c0184cArr[0];
        ((AbstractC1978s) c0184c2.f469a).mo4882i();
        ((C1973n) c0184c2.f470b).f24613g = false;
        while (true) {
            int iM10297x = AbstractC5700d.m10297x(iArrM10255L, i20);
            if (iM10297x < 0) {
                C1958a0 c1958a0 = this.f6724e;
                C4268r c4268r2 = c1958a0.f6632C;
                if (c4268r2 == null) {
                    r122 = 0;
                } else {
                    C4270t c4270t = c1958a0.f6633D;
                    int iM4917f3 = m4917f(-2);
                    if (m4920i()) {
                        C1607u c1607u5 = new C1607u(i11);
                        C4268r c4268r3 = AbstractC4269s.f14000F1;
                        int i21 = r42.f6689c.f5256b + i10;
                        if (i21 < i11) {
                            i21 = i11;
                        }
                        c1607u5.m10841m(0, new C4271u(c4268r3, c4270t, C4266p.m8567p(C4265o.m8557k(i21, C4683c.f15613E, r10)), C4682b.f15591i));
                        c1607u5.f24613g = false;
                        int iM4917f4 = m4917f(-3);
                        m4913a(new C4252b(iM4917f3, c1607u5, C6093g.m10843o(iM4917f4), iM4917f4), C6093g.f24608k);
                        iM4917f3 = iM4917f4;
                    }
                    C1607u c1607u6 = new C1607u(i11);
                    InterfaceC4685e interfaceC4685e = c4268r2.f13973c;
                    if (interfaceC4685e.size() == 0) {
                        c4266pM8567p = C4266p.f13968i;
                        z9 = false;
                    } else {
                        z9 = false;
                        c4266pM8567p = C4266p.m8567p(C4265o.m8557k(0, interfaceC4685e.getType(0), r10));
                    }
                    c1607u6.m10841m(z9 ? 1 : 0, new C4263m(c4268r2, c4270t, (C4265o) r10, c4266pM8567p));
                    c1607u6.f24613g = z9;
                    C6093g c6093g2 = C6093g.f24608k;
                    m4913a(new C4252b(iM4917f3, c1607u6, c6093g2, -1), c6093g2);
                    r122 = z9;
                }
                if (this.f6730k) {
                    C4270t c4270tM4880f2 = r42.m4880f(r122);
                    C4683c c4683c3 = C4683c.f15616H;
                    C4265o c4265oM8557k3 = C4265o.m8557k(r122, c4683c3, r10);
                    ?? c1607u7 = new C1607u(2);
                    c4683c3.getClass();
                    C4682b c4682b3 = C4682b.f15591i;
                    c1607u7.m10841m(r122, new C4263m(new C4268r(4, c4683c3, c4682b3, r10), c4270tM4880f2, c4265oM8557k3, C4266p.f13968i));
                    C4268r c4268r4 = AbstractC4269s.f14000F1;
                    int i22 = i10 + r42.f6689c.f5256b;
                    if (i22 < i11) {
                        i22 = i11;
                    }
                    c1607u7.m10841m(i11, new C4271u(c4268r4, c4270tM4880f2, C4266p.m8567p(C4265o.m8557k(i22, C4683c.f15613E, r10)), c4682b3));
                    c1607u7.f24613g = false;
                    int iM4917f5 = m4917f(-7);
                    C4252b c4252b2 = new C4252b(m4917f(-6), c1607u7, C6093g.m10843o(iM4917f5), iM4917f5);
                    C6093g c6093g3 = C6093g.f24608k;
                    m4913a(c4252b2, c6093g3);
                    C1607u c1607u8 = new C1607u(i11);
                    c1607u8.m10841m(0, new C4271u(AbstractC4269s.f13992D1, c4270tM4880f2, C4266p.m8567p(c4265oM8557k3), c4682b3));
                    c1607u8.f24613g = false;
                    m4913a(new C4252b(iM4917f5, c1607u8, c6093g3, -1), c6093g3);
                }
                C1971l[] c1971lArr = this.f6729j;
                int length3 = c1971lArr.length;
                for (int i23 = 0; i23 < length3; i23++) {
                    C1971l c1971l = c1971lArr[i23];
                    if (c1971l != null) {
                        for (C1982w c1982w : ((HashMap) c1971l.f6685g).values()) {
                            C4270t c4270t2 = ((AbstractC4259i) m4921j(i23).f13931b.m10840l(0)).f13948h;
                            C1607u c1607u9 = new C1607u(2);
                            C4683c c4683c4 = c1982w.f6710a;
                            c4683c4.getClass();
                            C4268r c4268r5 = new C4268r(4, c4683c4, C4682b.f15591i, r10);
                            C4265o c4265oM8557k4 = C4265o.m8557k(i10, c1982w.f6710a, r10);
                            C4266p c4266p3 = C4266p.f13968i;
                            c1607u9.m10841m(0, new C4263m(c4268r5, c4270t2, c4265oM8557k4, c4266p3));
                            c1607u9.m10841m(1, new C4263m(AbstractC4269s.f14148s, c4270t2, (C4265o) r10, c4266p3));
                            c1607u9.f24613g = false;
                            m4913a(new C4252b(c1982w.f6711b, c1607u9, C6093g.m10843o(i23), i23), (C6093g) c0184cArr[i23].f471c);
                        }
                    }
                }
                if (this.f6732m) {
                    C6093g c6093g4 = new C6093g(4);
                    int i24 = i9;
                    m4915d(m4921j(0), new C1971l(this, c6093g4), new BitSet(i24));
                    int iM4916e = m4916e();
                    ArrayList arrayList3 = new ArrayList(iM4916e);
                    for (int i25 = 0; i25 < iM4916e; i25++) {
                        arrayList3.add(r10);
                    }
                    int i26 = 0;
                    while (true) {
                        arrayList = this.f6727h;
                        int size = arrayList.size();
                        arrayList2 = this.f6728i;
                        if (i26 >= size) {
                            break;
                        }
                        C4252b c4252b3 = (C4252b) arrayList.get(i26);
                        if (c4252b3 != null) {
                            arrayList3.set(c4252b3.f13930a, (C6093g) arrayList2.get(i26));
                        }
                        i26++;
                    }
                    int i27 = c6093g4.f24610i;
                    for (int i28 = 0; i28 < i27; i28++) {
                        new C1984y(this, new C1968i(m4916e()), arrayList3).m4909a(m4921j(c6093g4.m10846n(i28)));
                    }
                    C6093g c6093g5 = new C6093g(arrayList.size());
                    arrayList2.clear();
                    m4915d(m4921j(m4917f(-1)), new C0119x(c6093g5, 25), new BitSet(i24));
                    c6093g5.m10850s();
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        int iM10845m = c6093g5.m10845m(((C4252b) arrayList.get(size2)).f13930a);
                        if (iM10845m < 0) {
                            iM10845m = -1;
                        }
                        if (iM10845m < 0) {
                            arrayList.remove(size2);
                        }
                    }
                    return;
                }
                return;
            }
            int i29 = i9;
            i20 = 0;
            int i30 = i11;
            AbstractC5700d.m10290q(iArrM10255L, iM10297x);
            C1964e c1964e = this.f6721b;
            int iM10852p = c1964e.m10852p(iM10297x);
            if (iM10852p < 0) {
                C2104o.m5294t("no such label: ".concat(AbstractC0000a.m46X0(iM10297x)));
                return;
            }
            try {
                m4924m((C1963d) c1964e.m10840l(iM10852p), c0184cArr[iM10297x], iArrM10255L);
                i11 = i30;
                i9 = i29;
            } catch (C1960b0 e6) {
                e6.m2687a("...while working on block ".concat(AbstractC0000a.m46X0(iM10297x)));
                throw e6;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4915d(C4252b c4252b, InterfaceC4251a interfaceC4251a, BitSet bitSet) {
        int iM4922k;
        interfaceC4251a.mo599d(c4252b);
        bitSet.set(c4252b.f13930a);
        C6093g c6093g = c4252b.f13932c;
        int i9 = c6093g.f24610i;
        for (int i10 = 0; i10 < i9; i10++) {
            int iM10846n = c6093g.m10846n(i10);
            if (!bitSet.get(iM10846n) && ((!m4919h(c4252b) || i10 <= 0) && (iM4922k = m4922k(iM10846n)) >= 0)) {
                m4915d((C4252b) this.f6727h.get(iM4922k), interfaceC4251a, bitSet);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m4916e() {
        int length = this.f6723d + this.f6720a.f6689c.f5259e.f24601h.length + 7;
        Iterator it = this.f6727h.iterator();
        while (it.hasNext()) {
            int i9 = ((C4252b) it.next()).f13930a;
            if (i9 >= length) {
                length = i9 + 1;
            }
        }
        return length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m4917f(int i9) {
        return this.f6723d + this.f6720a.f6689c.f5259e.f24601h.length + (~i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m4918g() {
        return (this.f6720a.f6687a.mo4877c() & 8) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m4919h(C4252b c4252b) {
        C6093g c6093g = c4252b.f13932c;
        if (c6093g.f24610i < 2) {
            return false;
        }
        int iM10846n = c6093g.m10846n(1);
        C1005h[] c1005hArr = this.f6731l;
        return iM10846n < c1005hArr.length && c1005hArr[iM10846n] != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m4920i() {
        return (this.f6720a.f6687a.mo4877c() & 32) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final C4252b m4921j(int i9) {
        int iM4922k = m4922k(i9);
        if (iM4922k >= 0) {
            return (C4252b) this.f6727h.get(iM4922k);
        }
        C2104o.m5294t("no such label ".concat(AbstractC0000a.m46X0(i9)));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final int m4922k(int i9) {
        ArrayList arrayList = this.f6727h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C4252b) arrayList.get(i10)).f13930a == i9) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m4923l(int i9, int i10, C1005h c1005h, C0184c c0184c, int[] iArr) {
        C6093g c6093g;
        C0184c c0184c2;
        C6093g c6093g2 = (C6093g) c0184c.f471c;
        C1973n c1973n = (C1973n) c0184c.f470b;
        AbstractC1978s abstractC1978s = (AbstractC1978s) c0184c.f469a;
        C0184c[] c0184cArr = this.f6726g;
        C0184c c0184c3 = c0184cArr[i9];
        if (c0184c3 == null) {
            if (c1005h != null) {
                c6093g2.m10847p().m10844l(i9);
                c0184cArr[i9] = new C0184c((AbstractC1978s) abstractC1978s.mo4895o(), c1973n, C6093g.m10843o(i9)).m789F(i9, i10, c0184c);
            } else {
                c0184cArr[i9] = c0184c;
            }
            AbstractC5700d.m10278g0(iArr, i9);
            return;
        }
        if (c1005h != null) {
            c0184c2 = c0184c3.m789F(c1005h.f3181h, i10, c0184c);
        } else {
            AbstractC1978s abstractC1978s2 = (AbstractC1978s) c0184c3.f469a;
            AbstractC1978s abstractC1978sMo4897q = abstractC1978s2.mo4897q(abstractC1978s);
            C1973n c1973n2 = (C1973n) c0184c3.f470b;
            c1973n2.getClass();
            try {
                C1973n c1973nM10257N = AbstractC5700d.m10257N(c1973n2, c1973n);
                C6093g c6093g3 = (C6093g) c0184c3.f471c;
                if (c6093g3.equals(c6093g2)) {
                    c6093g = c6093g3;
                } else {
                    c6093g = new C6093g(4);
                    int i11 = c6093g3.f24610i;
                    int i12 = c6093g2.f24610i;
                    for (int i13 = 0; i13 < i11 && i13 < i12 && c6093g3.m10846n(i13) == c6093g2.m10846n(i13); i13++) {
                        c6093g.m10844l(i13);
                    }
                    c6093g.f24613g = false;
                }
                boolean z9 = abstractC1978sMo4897q instanceof C1979t;
                AbstractC1978s abstractC1978s3 = abstractC1978sMo4897q;
                if (z9) {
                    C1979t c1979t = (C1979t) abstractC1978sMo4897q;
                    abstractC1978s3 = c1979t;
                    if (c6093g.f24610i == 0) {
                        abstractC1978s3 = c1979t.f6706h;
                    }
                }
                c0184c2 = (abstractC1978s3 == abstractC1978s2 && c1973nM10257N == c1973n2 && c6093g3 == c6093g) ? c0184c3 : new C0184c(abstractC1978s3, c1973nM10257N, c6093g);
            } catch (C1960b0 e6) {
                e6.m2687a("underlay stack:");
                c1973n2.m4883l(e6);
                e6.m2687a("overlay stack:");
                c1973n.m4883l(e6);
                throw e6;
            }
        }
        if (c0184c2 != c0184c3) {
            c0184cArr[i9] = c0184c2;
            AbstractC5700d.m10278g0(iArr, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a1 A[Catch: NullPointerException -> 0x01db, IndexOutOfBoundsException -> 0x01e1, TRY_LEAVE, TryCatch #7 {IndexOutOfBoundsException -> 0x01e1, NullPointerException -> 0x01db, blocks: (B:46:0x0186, B:48:0x01a1, B:56:0x01d5, B:57:0x01da), top: B:194:0x0186 }] */
    /* JADX WARN: Type inference failed for: r10v8, types: [u4.o] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [i4.s] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [i4.z] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [b5.c] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r2v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v49, types: [w4.d[]] */
    /* JADX WARN: Type inference failed for: r4v12, types: [i4.z] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4924m(C1963d c1963d, C0184c c0184c, int[] iArr) {
        C4682b c4682b;
        int i9;
        int[] iArr2;
        int i10;
        int i11;
        C0184c c0184c2;
        int i12;
        int i13;
        C6093g c6093g;
        C1005h c1005h;
        int i14;
        ?? r22;
        ?? r12;
        ?? r222;
        C6093g c6093gM10847p;
        C6093g c6093gM10843o;
        int i15;
        int iM10846n;
        int i16;
        int i17;
        C6093g c6093gM10843o2;
        C1963d c1963d2 = c1963d;
        C1966g c1966g = c1963d2.f6673e;
        int i18 = c1963d2.f6669a;
        int length = c1966g.f24601h.length;
        if (length == 0) {
            c4682b = C4682b.f15591i;
        } else {
            C4682b c4682b2 = new C4682b(length);
            for (int i19 = 0; i19 < length; i19++) {
                C4453d0 c4453d0 = ((C1965f) c1966g.m10840l(i19)).f6677d;
                if (c4453d0 == null) {
                    c4453d0 = C4453d0.f14767j;
                }
                c4682b2.m10841m(i19, c4453d0.f14784g);
            }
            c4682b2.f24613g = false;
            c4682b = c4682b2;
        }
        C1958a0 c1958a0 = this.f6724e;
        c1958a0.f6654u = c4682b;
        ArrayList arrayList = c1958a0.f6653t;
        arrayList.clear();
        c1958a0.f6655v = false;
        c1958a0.f6656w = false;
        c1958a0.f6657x = 0;
        c1958a0.f6658y = 0;
        c1958a0.f6630A = false;
        c1958a0.f6659z = false;
        C1005h c1005h2 = null;
        c1958a0.f6631B = null;
        C0184c c0184c3 = new C0184c(((AbstractC1978s) c0184c.f469a).mo4893m(), ((C1973n) c0184c.f470b).m4885n(), (C6093g) c0184c.f471c);
        AbstractC1978s abstractC1978s = (AbstractC1978s) c0184c3.f469a;
        C1973n c1973n = (C1973n) c0184c3.f470b;
        C6093g c6093g2 = (C6093g) c0184c3.f471c;
        C1962c0 c1962c0 = this.f6725f;
        c1962c0.getClass();
        int i20 = c1963d2.f6671c;
        C1005h c1005h3 = (C1005h) c1962c0.f6667e;
        c1005h3.f3183j = c0184c3;
        try {
            int i21 = c1963d2.f6670b;
            while (i21 < i20) {
                C1005h c1005h4 = c1005h2;
                int iM4870a = ((C1971l) c1962c0.f6664b).m4870a(i21, c1005h3);
                c1005h3.f3181h = i21;
                i21 += iM4870a;
                c1005h2 = c1005h4;
            }
            C1005h c1005h5 = c1005h2;
            abstractC1978s.mo4882i();
            c1973n.f24613g = false;
            int i22 = c1958a0.f6658y;
            int size = arrayList.size();
            int length2 = c1966g.f24601h.length;
            C6093g c6093g3 = c1963d2.f6672d;
            boolean z9 = c1958a0.f6659z;
            C1005h[] c1005hArr = this.f6731l;
            if (z9) {
                int iM10846n2 = c6093g3.m10846n(1);
                if (c1005hArr[iM10846n2] == null) {
                    i9 = 1;
                    c1005hArr[iM10846n2] = new C1005h(this, iM10846n2);
                } else {
                    i9 = 1;
                }
                ((BitSet) c1005hArr[iM10846n2].f3182i).set(i18);
                C1005h c1005h6 = c1005hArr[iM10846n2];
                iArr2 = iArr;
                i10 = size;
                i11 = length2;
                c6093g = c6093g3;
                c0184c2 = c0184c3;
                c1005h = c1005h6;
                i12 = i18;
                i13 = i22;
                i14 = i9;
            } else {
                i9 = 1;
                C1981v c1981v = c1958a0.f6631B;
                if (c1981v != null) {
                    int i23 = c1981v.f6709g;
                    C1005h c1005h7 = c1005hArr[i23];
                    if (c1005h7 == null) {
                        C1005h c1005h8 = new C1005h(this, i23);
                        ((BitSet) c1005h8.f3183j).set(i18);
                        c1005hArr[i23] = c1005h8;
                    } else {
                        ((BitSet) c1005h7.f3183j).set(i18);
                    }
                    C1005h c1005h9 = c1005hArr[i23];
                    c1005h9.getClass();
                    BitSet bitSet = (BitSet) c1005h9.f3182i;
                    i10 = size;
                    c6093g = new C6093g(bitSet.size());
                    int iNextSetBit = bitSet.nextSetBit(0);
                    while (iNextSetBit >= 0) {
                        c6093g.m10844l(((C1985z) c1005h9.f3184k).m4921j(iNextSetBit).f13932c.m10846n(0));
                        iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
                        length2 = length2;
                    }
                    i11 = length2;
                    int i24 = 0;
                    c6093g.f24613g = false;
                    C1005h c1005h10 = c1005hArr[i23];
                    BitSet bitSet2 = (BitSet) c1005h10.f3182i;
                    C1985z c1985z = (C1985z) c1005h10.f3184k;
                    int iNextSetBit2 = bitSet2.nextSetBit(0);
                    ?? r42 = c1985z;
                    while (iNextSetBit2 >= 0) {
                        C0184c c0184c4 = c0184c3;
                        int iM10846n3 = r42.m4921j(iNextSetBit2).f13932c.m10846n(i24);
                        int i25 = c1005h10.f3181h;
                        C1005h c1005h11 = c1005h10;
                        try {
                            if (abstractC1978s instanceof C1979t) {
                                ArrayList arrayList2 = ((C1979t) abstractC1978s).f6707i;
                                ?? r223 = r42;
                                r22 = r223;
                                if (iNextSetBit2 < arrayList2.size()) {
                                    r12 = (AbstractC1978s) arrayList2.get(iNextSetBit2);
                                    r222 = r223;
                                }
                                c6093gM10847p = c6093g2.m10847p();
                                c6093gM10847p.m10855j();
                                int i26 = i22;
                                int i27 = i18;
                                c6093gM10847p.f24610i--;
                                if (c6093gM10847p.m10846n(c6093gM10847p.f24610i - 1) == i25) {
                                    throw new RuntimeException("returning from invalid subroutine");
                                }
                                c6093gM10847p.f24613g = false;
                                ?? c0184c5 = r12 == 0 ? c1005h5 : new C0184c((AbstractC1978s) r12, c1973n, c6093gM10847p);
                                if (c0184c5 != 0) {
                                    r222.m4923l(iM10846n3, -1, null, c0184c5, iArr);
                                } else {
                                    AbstractC5700d.m10278g0(iArr, iNextSetBit2);
                                }
                                iNextSetBit2 = bitSet2.nextSetBit(iNextSetBit2 + 1);
                                c1005h10 = c1005h11;
                                c0184c3 = c0184c4;
                                r42 = r222;
                                i22 = i26;
                                i18 = i27;
                                i24 = 0;
                            } else {
                                r22 = r42;
                            }
                            c6093gM10847p = c6093g2.m10847p();
                            c6093gM10847p.m10855j();
                            int i262 = i22;
                            int i272 = i18;
                            c6093gM10847p.f24610i--;
                            if (c6093gM10847p.m10846n(c6093gM10847p.f24610i - 1) == i25) {
                            }
                        } catch (IndexOutOfBoundsException unused) {
                            C0353j.m1309g("returning from invalid subroutine");
                            return;
                        } catch (NullPointerException unused2) {
                            C0353j.m1305c("can't return from non-subroutine");
                            return;
                        }
                        r12 = c1005h5;
                        r222 = r22;
                    }
                    iArr2 = iArr;
                    c0184c2 = c0184c3;
                    i12 = i18;
                    i13 = i22;
                    i14 = c6093g.f24610i;
                    c1005h = c1005h5;
                } else {
                    iArr2 = iArr;
                    i10 = size;
                    i11 = length2;
                    c0184c2 = c0184c3;
                    i12 = i18;
                    i13 = i22;
                    if (c1958a0.f6655v) {
                        c6093g = c6093g3;
                        c1005h = c1005h5;
                        i14 = i11;
                    } else {
                        c6093g = c6093g3;
                        c1005h = c1005h5;
                        i14 = 0;
                    }
                }
            }
            int i28 = c6093g.f24610i;
            int i29 = i14;
            while (i29 < i28) {
                int iM10846n4 = c6093g.m10846n(i29);
                try {
                    int i30 = i28;
                    int i31 = i10;
                    C0184c c0184c6 = c0184c2;
                    C6093g c6093g4 = c6093g;
                    int i32 = i11;
                    try {
                        m4923l(iM10846n4, c1963d2.f6669a, c1005h, c0184c6, iArr2);
                        c0184c2 = c0184c6;
                        i29++;
                        iArr2 = iArr;
                        i11 = i32;
                        c6093g = c6093g4;
                        i10 = i31;
                        i28 = i30;
                    } catch (C1960b0 e6) {
                        e = e6;
                        e.m2687a("...while merging to block ".concat(AbstractC0000a.m46X0(iM10846n4)));
                        throw e;
                    }
                } catch (C1960b0 e7) {
                    e = e7;
                }
            }
            C1985z c1985z2 = this;
            int i33 = i28;
            int i34 = i10;
            C6093g c6093g5 = c6093g;
            int i35 = i11;
            if (i33 == 0 && c1958a0.f6656w) {
                c6093gM10843o = C6093g.m10843o(c1985z2.m4917f(-2));
                i15 = i9;
            } else {
                c6093gM10843o = c6093g5;
                i15 = i33;
            }
            if (i15 == 0) {
                iM10846n = -1;
            } else {
                iM10846n = c1958a0.f6657x;
                if (iM10846n >= 0) {
                    iM10846n = c6093gM10843o.m10846n(iM10846n);
                }
            }
            int i36 = (c1985z2.m4920i() && c1958a0.f6630A) ? i9 : 0;
            if (i36 == 0 && i35 == 0) {
                i16 = iM10846n;
            } else {
                C6093g c6093g6 = new C6093g(i15);
                int i37 = 0;
                int i38 = 0;
                while (i37 < i35) {
                    C1965f c1965f = (C1965f) c1966g.m10840l(i37);
                    C4453d0 c4453d02 = c1965f.f6677d;
                    if (c4453d02 == null) {
                        c4453d02 = C4453d0.f14767j;
                    }
                    int i39 = c1965f.f6676c;
                    int i40 = i38 | (c4453d02 == C4453d0.f14767j ? i9 : 0);
                    C1973n c1973nM4885n = c1973n.m4885n();
                    c1973nM4885n.m10855j();
                    C6093g c6093g7 = c6093g6;
                    for (int i41 = 0; i41 < c1973nM4885n.f6693i; i41++) {
                        ((InterfaceC4684d[]) c1973nM4885n.f6694j)[i41] = c1005h5;
                        ((boolean[]) c1973nM4885n.f6695k)[i41] = false;
                    }
                    c1973nM4885n.f6693i = 0;
                    c1973nM4885n.m4888q(c4453d02);
                    C0184c c0184c7 = new C0184c(abstractC1978s, c1973nM4885n, c6093g2);
                    int i42 = i37;
                    try {
                        int i43 = iM10846n;
                        C1966g c1966g2 = c1966g;
                        i17 = i39;
                        c1985z2 = this;
                        try {
                            c1985z2.m4923l(i17, c1963d2.f6669a, null, c0184c7, iArr);
                            C1971l[] c1971lArr = c1985z2.f6729j;
                            C1971l c1971l = c1971lArr[i17];
                            if (c1971l == null) {
                                c1971l = new C1971l(c1985z2);
                                c1971lArr[i17] = c1971l;
                            }
                            C4683c c4683c = c4453d02.f14784g;
                            HashMap map = (HashMap) c1971l.f6685g;
                            C1982w c1982w = (C1982w) map.get(c4683c);
                            if (c1982w == null) {
                                int iMo4868k = ((C1985z) c1971l.f6686h).f6733n.mo4868k();
                                c1982w = new C1982w();
                                c1982w.f6710a = c4683c;
                                c1982w.f6711b = iMo4868k;
                                map.put(c4683c, c1982w);
                            }
                            c6093g7.m10844l(c1982w.f6711b);
                            i37 = i42 + 1;
                            iM10846n = i43;
                            c6093g6 = c6093g7;
                            i38 = i40;
                            c1966g = c1966g2;
                            c1963d2 = c1963d;
                        } catch (C1960b0 e10) {
                            e = e10;
                            e.m2687a("...while merging exception to block ".concat(AbstractC0000a.m46X0(i17)));
                            throw e;
                        }
                    } catch (C1960b0 e11) {
                        e = e11;
                        i17 = i39;
                    }
                }
                C6093g c6093g8 = c6093g6;
                i16 = iM10846n;
                if (i36 != 0 && i38 == 0) {
                    c6093g8.m10844l(c1985z2.m4917f(-6));
                    ?? r2 = i9;
                    c1985z2.f6730k = r2;
                    for (int i44 = (i34 - i13) - (r2 == true ? 1 : 0); i44 < i34; i44++) {
                        AbstractC4259i abstractC4259i = (AbstractC4259i) arrayList.get(i44);
                        if (abstractC4259i.f13947g.m8575a()) {
                            arrayList.set(i44, abstractC4259i.mo8555i(C4683c.f15613E));
                        }
                    }
                }
                if (i16 >= 0) {
                    c6093g8.m10844l(i16);
                }
                c6093g8.f24613g = false;
                c6093gM10843o = c6093g8;
            }
            int iM10845m = c6093gM10843o.m10845m(i16);
            int i45 = iM10845m >= 0 ? iM10845m : -1;
            int i46 = i16;
            C6093g c6093gM10847p2 = c6093gM10843o;
            int i47 = i34;
            while (i13 > 0) {
                i47--;
                AbstractC4259i abstractC4259i2 = (AbstractC4259i) arrayList.get(i47);
                boolean z10 = abstractC4259i2.f13947g.f13975e == 1;
                C1607u c1607u = new C1607u(z10 ? 2 : 1);
                c1607u.m10841m(0, abstractC4259i2);
                if (z10) {
                    c1607u.m10841m(1, new C4263m(AbstractC4269s.f14148s, abstractC4259i2.f13948h, (C4265o) c1005h5, C4266p.f13968i));
                    c6093gM10843o2 = C6093g.m10843o(i46);
                } else {
                    c6093gM10843o2 = c6093gM10847p2;
                }
                c1607u.f24613g = false;
                int iM4916e = c1985z2.m4916e();
                c1985z2.m4913a(new C4252b(iM4916e, c1607u, c6093gM10843o2, i46), c6093g2);
                c6093gM10847p2 = c6093gM10847p2.m10847p();
                c6093gM10847p2.m10848q(i45, iM4916e);
                c6093gM10847p2.f24613g = false;
                i13--;
                i46 = iM4916e;
                c1005h5 = null;
            }
            AbstractC4259i abstractC4259i3 = i47 == 0 ? null : (AbstractC4259i) arrayList.get(i47 - 1);
            if (abstractC4259i3 == null || abstractC4259i3.f13947g.f13975e == 1) {
                arrayList.add(new C4263m(AbstractC4269s.f14148s, abstractC4259i3 == null ? C4270t.f14180d : abstractC4259i3.f13948h, (C4265o) null, C4266p.f13968i));
                i47++;
            }
            C1607u c1607u2 = new C1607u(i47);
            for (int i48 = 0; i48 < i47; i48++) {
                c1607u2.m10841m(i48, (AbstractC4259i) arrayList.get(i48));
            }
            c1607u2.f24613g = false;
            C4252b c4252b = new C4252b(i12, c1607u2, c6093gM10847p2, i46);
            int iM4922k = c1985z2.m4922k(c4252b.f13930a);
            if (iM4922k >= 0) {
                c1985z2.m4925n(iM4922k);
            }
            c1985z2.f6727h.add(c4252b);
            c6093g2.m10856k();
            c1985z2.f6728i.add(c6093g2);
        } catch (C1960b0 e12) {
            abstractC1978s.mo4892l(e12);
            c1973n.m4883l(e12);
            throw e12;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m4925n(int i9) {
        int length = this.f6723d + this.f6720a.f6689c.f5259e.f24601h.length + 7;
        ArrayList arrayList = this.f6727h;
        C6093g c6093g = ((C4252b) arrayList.get(i9)).f13932c;
        int i10 = c6093g.f24610i;
        arrayList.remove(i9);
        this.f6728i.remove(i9);
        for (int i11 = 0; i11 < i10; i11++) {
            int iM10846n = c6093g.m10846n(i11);
            if (iM10846n >= length) {
                int iM4922k = m4922k(iM10846n);
                if (iM4922k < 0) {
                    C0353j.m1309g("Invalid label ".concat(AbstractC0000a.m46X0(iM10846n)));
                    return;
                }
                m4925n(iM4922k);
            }
        }
    }
}
