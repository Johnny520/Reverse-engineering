package p321w;

import bsh.org.objectweb.asm.Opcodes;
import ci.C0575c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p015b0.C0152r;
import p015b0.C0154t;
import p063e9.C0830a;
import p071f1.AbstractC0996c0;
import p072f2.AbstractC1052o;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1833g1;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.C1876r1;
import p119i2.AbstractC1938m;
import p119i2.C1918c;
import p119i2.C1920d;
import p119i2.C1922e;
import p119i2.C1925f0;
import p119i2.C1926g;
import p119i2.C1935k0;
import p119i2.C1937l0;
import p144k.AbstractC2192n;
import p174m.C2576b;
import p187n.C2857k;
import p222p.AbstractC3241o;
import p259r9.C3766p;
import p267s1.AbstractC3913s;
import p267s1.InterfaceC3911q;
import p276sf.C3967n;
import p322w0.C4665p;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;
import p357y1.C5919p0;
import sh.C4056v1;
import tf.AbstractC4171r;

/* JADX INFO: renamed from: w.n1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4621n1 {

    /* JADX INFO: renamed from: a */
    public final C1845j1 f15299a = AbstractC1874r.m4639u(null);

    /* JADX INFO: renamed from: b */
    public C1926g f15300b;

    /* JADX INFO: renamed from: c */
    public final C4665p f15301c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4621n1(C1926g c1926g) {
        C3766p c3766p = new C3766p(27);
        c1926g.getClass();
        C1920d c1920d = new C1920d(c1926g);
        ArrayList arrayList = c1920d.f6472i;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            List list = (List) c3766p.invoke(((C1918c) arrayList.get(i9)).m4773a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                C1922e c1922e = (C1922e) list.get(i10);
                Object obj = c1922e.f6503a;
                arrayList3.add(new C1918c(c1922e.f6506d, c1922e.f6504b, c1922e.f6505c, obj));
            }
            AbstractC4171r.m8432h1(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f15300b = c1920d.m4780e();
        this.f15301c = new C4665p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C1922e m9044c(C1922e c1922e, C1935k0 c1935k0) {
        int iM4826c = c1935k0.f6562b.m4826c(r3.f6588f - 1, false);
        if (c1922e.f6504b < iM4826c) {
            return C1922e.m4782a(c1922e, null, Math.min(c1922e.f6505c, iM4826c), 11);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m9045a(C1836h0 c1836h0, int i9) {
        char c10;
        boolean z9;
        c1836h0.m4527b0(1154651354);
        char c11 = 2;
        int i10 = (c1836h0.m4538h(this) ? 4 : 2) | i9;
        if (c1836h0.m4516S(i10 & 1, (i10 & 3) != 2)) {
            C5919p0 c5919p0 = (C5919p0) c1836h0.m4542j(AbstractC5888h1.f23937s);
            C1926g c1926g = this.f15300b;
            List listM4794a = c1926g.m4794a(c1926g.f6529h.length());
            int size = listM4794a.size();
            int i11 = 0;
            while (i11 < size) {
                C1922e c1922e = (C1922e) listM4794a.get(i11);
                int i12 = c1922e.f6504b;
                Object obj = c1922e.f6503a;
                if (i12 != c1922e.f6505c) {
                    c1836h0.m4525a0(725478935);
                    Object objM4514P = c1836h0.m4514P();
                    Object obj2 = C1851l.f6155a;
                    Object obj3 = objM4514P;
                    if (objM4514P == obj2) {
                        Object c2857k = new C2857k();
                        c1836h0.m4545k0(c2857k);
                        obj3 = c2857k;
                    }
                    C2857k c2857k2 = (C2857k) obj3;
                    c10 = c11;
                    InterfaceC5853o interfaceC5853oM2516m = AbstractC0996c0.m2516m(C5850l.f23787a, new C2576b(this, 25, c1922e));
                    Object objM4514P2 = c1836h0.m4514P();
                    Object obj4 = objM4514P2;
                    if (objM4514P2 == obj2) {
                        Object c3766p = new C3766p(28);
                        c1836h0.m4545k0(c3766p);
                        obj4 = c3766p;
                    }
                    InterfaceC5853o interfaceC5853oM5437n = AbstractC2192n.m5437n(AbstractC1052o.m2648a(interfaceC5853oM2516m, (InterfaceC1231l) obj4).mo10549d(new C4627p1(new C0830a(this, 12, c1922e))), c2857k2, true);
                    InterfaceC3911q.f12829a.getClass();
                    InterfaceC5853o interfaceC5853oM8114g = AbstractC3913s.m8114g(interfaceC5853oM5437n, AbstractC3913s.f12832c);
                    boolean zM4538h = c1836h0.m4538h(this) | c1836h0.m4534f(c1922e) | c1836h0.m4538h(c5919p0);
                    Object objM4514P3 = c1836h0.m4514P();
                    Object obj5 = objM4514P3;
                    if (zM4538h || objM4514P3 == obj2) {
                        Object c4056v1 = new C4056v1(this, c1922e, c5919p0);
                        c1836h0.m4545k0(c4056v1);
                        obj5 = c4056v1;
                    }
                    AbstractC3241o.m6927a(AbstractC2192n.m5434k(interfaceC5853oM8114g, c2857k2, (InterfaceC1220a) obj5), c1836h0, 0);
                    AbstractC1938m abstractC1938m = (AbstractC1938m) obj;
                    C1937l0 c1937l0Mo4800a = abstractC1938m.mo4800a();
                    if (c1937l0Mo4800a == null || (c1937l0Mo4800a.f6569a == null && c1937l0Mo4800a.f6570b == null && c1937l0Mo4800a.f6571c == null && c1937l0Mo4800a.f6572d == null)) {
                        z9 = false;
                        c1836h0.m4525a0(728331710);
                        c1836h0.m4553p(false);
                    } else {
                        c1836h0.m4525a0(726303039);
                        Object objM4514P4 = c1836h0.m4514P();
                        Object obj6 = objM4514P4;
                        if (objM4514P4 == obj2) {
                            Object c4632r0 = new C4632r0(c2857k2);
                            c1836h0.m4545k0(c4632r0);
                            obj6 = c4632r0;
                        }
                        C4632r0 c4632r02 = (C4632r0) obj6;
                        Object objM4514P5 = c1836h0.m4514P();
                        boolean z10 = false;
                        Object obj7 = objM4514P5;
                        if (objM4514P5 == obj2) {
                            Object c0575c = new C0575c(c4632r02, z10 ? 1 : 0, 12);
                            c1836h0.m4545k0(c0575c);
                            obj7 = c0575c;
                        }
                        AbstractC1874r.m4624f((InterfaceC1235p) obj7, c1836h0, C3967n.f12976a);
                        C1833g1 c1833g1 = c4632r02.f15362b;
                        C1833g1 c1833g12 = c4632r02.f15362b;
                        Boolean boolValueOf = Boolean.valueOf((c1833g1.m4492g() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((c1833g12.m4492g() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((c1833g12.m4492g() & 4) != 0);
                        C1937l0 c1937l0Mo4800a2 = abstractC1938m.mo4800a();
                        C1925f0 c1925f0 = c1937l0Mo4800a2 != null ? c1937l0Mo4800a2.f6569a : null;
                        C1937l0 c1937l0Mo4800a3 = abstractC1938m.mo4800a();
                        C1925f0 c1925f02 = c1937l0Mo4800a3 != null ? c1937l0Mo4800a3.f6570b : null;
                        C1937l0 c1937l0Mo4800a4 = abstractC1938m.mo4800a();
                        C1925f0 c1925f03 = c1937l0Mo4800a4 != null ? c1937l0Mo4800a4.f6571c : null;
                        C1937l0 c1937l0Mo4800a5 = abstractC1938m.mo4800a();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, c1925f0, c1925f02, c1925f03, c1937l0Mo4800a5 != null ? c1937l0Mo4800a5.f6572d : null};
                        boolean zM4538h2 = c1836h0.m4538h(this) | c1836h0.m4534f(c1922e);
                        Object objM4514P6 = c1836h0.m4514P();
                        Object obj8 = objM4514P6;
                        if (zM4538h2 || objM4514P6 == obj2) {
                            Object c2576b = new C2576b(this, c1922e, c4632r02, 24);
                            c1836h0.m4545k0(c2576b);
                            obj8 = c2576b;
                        }
                        m9046b(objArr, (InterfaceC1231l) obj8, c1836h0, (i10 << 6) & 896);
                        z9 = false;
                        c1836h0.m4553p(false);
                    }
                    c1836h0.m4553p(z9);
                } else {
                    c10 = c11;
                    c1836h0.m4525a0(728345598);
                    c1836h0.m4553p(false);
                }
                i11++;
                c11 = c10;
            }
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0154t(i9, 24, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m9046b(Object[] objArr, InterfaceC1231l interfaceC1231l, C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(-2083052099);
        int i10 = (i9 & 48) == 0 ? (c1836h0.m4538h(interfaceC1231l) ? 32 : 16) | i9 : i9;
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4538h(this) ? Opcodes.ACC_NATIVE : 128;
        }
        c1836h0.m4520W(-358306546, Integer.valueOf(objArr.length), null, 0);
        int i11 = i10 | (c1836h0.m4530d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i11 |= c1836h0.m4538h(obj) ? 4 : 0;
        }
        c1836h0.m4553p(false);
        if ((i11 & 14) == 0) {
            i11 |= 2;
        }
        if (c1836h0.m4516S(i11 & 1, (i11 & 147) != 146)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(interfaceC1231l);
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zM4538h = c1836h0.m4538h(this) | ((i11 & 112) == 32);
            Object objM4514P = c1836h0.m4514P();
            if (zM4538h || objM4514P == C1851l.f6155a) {
                objM4514P = new C4610k(this, interfaceC1231l, 1);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC1874r.m4623e(array, (InterfaceC1231l) objM4514P, c1836h0);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0152r(this, objArr, interfaceC1231l, i9, 10);
        }
    }
}
