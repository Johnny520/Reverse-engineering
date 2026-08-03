package p209o7;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.function.Predicate;
import ke.C2399h;
import p063e9.C0830a;
import p075f6.C1075b;
import p152k7.AbstractC2331a;
import p152k7.InterfaceC2335e;
import p152k7.InterfaceC2336f;
import p174m.C2571a;
import p241q7.C3445b;
import p273s7.C3937f;
import p379z7.C6106b;
import p379z7.C6107c;

/* JADX INFO: renamed from: o7.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3068b extends AbstractC2331a implements InterfaceC2335e {

    /* JADX INFO: renamed from: k */
    public C6107c f9926k = C6107c.f24641o;

    /* JADX INFO: renamed from: l */
    public InterfaceC2336f f9927l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C3067a(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3068b(InterfaceC2336f interfaceC2336f) {
        this.f9927l = interfaceC2336f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: C */
    public final int mo5544C(ByteArrayOutputStream byteArrayOutputStream) {
        int size = size();
        int iM5549K = 0;
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC2331a abstractC2331aM6524Q = m6524Q(i9);
            if (abstractC2331aM6524Q != null) {
                iM5549K = abstractC2331aM6524Q.m5549K(byteArrayOutputStream) + iM5549K;
            }
        }
        return iM5549K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public void mo6518L(int i9, AbstractC2331a abstractC2331a) {
        if (abstractC2331a == null) {
            return;
        }
        m6535g0();
        abstractC2331a.m5546H(i9);
        abstractC2331a.m5548J(this);
        this.f9926k.add(i9, abstractC2331a);
        m6536h0(i9);
        m6528U();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public boolean mo6519M(AbstractC2331a abstractC2331a) {
        if (abstractC2331a == null) {
            return false;
        }
        m6535g0();
        abstractC2331a.m5546H(size());
        abstractC2331a.m5548J(this);
        boolean zAdd = this.f9926k.add(abstractC2331a);
        m6528U();
        return zAdd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final void m6521N() {
        if (this.f9926k.isEmpty()) {
            return;
        }
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC2331a abstractC2331a = (AbstractC2331a) this.f9926k.remove(size() - 1);
            if (abstractC2331a != null) {
                abstractC2331a.m5548J(null);
                abstractC2331a.m5546H(-1);
                m6528U();
            }
        }
        m6526S();
        m6528U();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final void m6522O(int i9) {
        InterfaceC2336f interfaceC2336f = this.f9927l;
        if (i9 > size()) {
            mo5557c0(i9);
        }
        mo6518L(i9, interfaceC2336f.mo1892n());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final AbstractC2331a m6523P() {
        InterfaceC2336f interfaceC2336f = this.f9927l;
        size();
        AbstractC2331a abstractC2331aMo1892n = interfaceC2336f.mo1892n();
        mo6519M(abstractC2331aMo1892n);
        return abstractC2331aMo1892n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final AbstractC2331a m6524Q(int i9) {
        if (i9 >= this.f9926k.size() || i9 < 0) {
            return null;
        }
        return (AbstractC2331a) this.f9926k.f24642g[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public boolean mo6525R() {
        return this instanceof C3937f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final void m6526S() {
        C6107c c6107c = this.f9926k;
        c6107c.getClass();
        if (c6107c instanceof C6106b) {
            return;
        }
        this.f9926k = C6107c.f24641o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public final void m6527T(int i9, AbstractC2331a abstractC2331a) {
        if (i9 < 0) {
            i9 = 0;
        }
        int iM10868f = this.f9926k.m10868f(abstractC2331a, true, abstractC2331a.f7657g);
        C6107c c6107c = this.f9926k;
        int iM10868f2 = c6107c.m10868f(abstractC2331a, false, 0);
        if (iM10868f2 >= 0 && iM10868f2 != i9 && i9 >= 0) {
            int i10 = i9 + 1;
            if (i10 > c6107c.size()) {
                c6107c.mo10862h(i10, false);
            }
            boolean z9 = c6107c.f24647l;
            c6107c.f24647l = true;
            Object[] objArr = c6107c.f24642g;
            Object obj = objArr[iM10868f2];
            if (iM10868f2 > i9) {
                while (iM10868f2 > i9) {
                    objArr[iM10868f2] = objArr[iM10868f2 - 1];
                    iM10868f2--;
                }
            } else {
                while (iM10868f2 < i9) {
                    int i11 = iM10868f2 + 1;
                    objArr[iM10868f2] = objArr[i11];
                    iM10868f2 = i11;
                }
            }
            objArr[i9] = obj;
            c6107c.f24642g = objArr;
            c6107c.f24647l = z9;
            c6107c.f24646k = 0;
        }
        m6537i0(iM10868f, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public void m6528U() {
        this.f9926k.f24646k = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public void mo5141X() {
        m6528U();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public void mo6529Y(C3445b c3445b) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            m6524Q(i9).m5545G(c3445b);
        }
        m6528U();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public void mo6530Z() {
        for (Object obj : this.f9926k) {
            if (obj instanceof InterfaceC2335e) {
                ((InterfaceC2335e) obj).mo5562c();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public final void m6531a0(AbstractC2331a abstractC2331a) {
        if (abstractC2331a == null) {
            return;
        }
        int iM10868f = this.f9926k.m10868f(abstractC2331a, true, abstractC2331a.f7657g);
        if (iM10868f < 0) {
            iM10868f = this.f9926k.m10868f(abstractC2331a, true, 0);
        }
        if (iM10868f < 0) {
            return;
        }
        if (this.f9926k.remove(iM10868f) != null) {
            m6536h0(iM10868f);
            abstractC2331a.m5546H(-1);
            abstractC2331a.m5548J(null);
        }
        m6528U();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public final void m6532b0(InterfaceC2336f interfaceC2336f) {
        this.f9927l = interfaceC2336f;
        C6107c c6107c = this.f9926k;
        c6107c.getClass();
        if (c6107c instanceof C6106b) {
            return;
        }
        InterfaceC2336f interfaceC2336f2 = this.f9927l;
        if (interfaceC2336f2 == null) {
            this.f9926k.f24643h = null;
        } else {
            this.f9926k.f24643h = new C0830a(this, 3, interfaceC2336f2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2335e
    /* JADX INFO: renamed from: c */
    public final void mo5562c() {
        if (this.f7659i) {
            return;
        }
        this.f9926k.mo10863m();
        if (this.f9926k.size() == 0) {
            m6526S();
        }
        mo5143V();
        mo6530Z();
        mo5141X();
        m6528U();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public void mo5557c0(int i9) {
        mo6520d0(i9, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public void mo6520d0(int i9, boolean z9) {
        if (i9 == 0 && !z9) {
            m6526S();
            return;
        }
        if (this.f9927l != null || i9 < size()) {
            m6535g0();
            this.f9926k.mo10862h(i9, z9);
            if (i9 == 0) {
                m6526S();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public boolean m6533e0() {
        if (size() < 2) {
            return false;
        }
        boolean zM10872k = this.f9926k.m10872k(new C2399h(this, 27));
        if (zM10872k) {
            m6536h0(0);
        }
        return zM10872k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f9926k.equals(((C3068b) obj).f9926k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public final void m6534f0(Predicate predicate) {
        int size = size() - 1;
        C6107c c6107c = this.f9926k;
        c6107c.getClass();
        int i9 = 0;
        for (int size2 = c6107c.size() - 1; size2 >= 0 && predicate.test(c6107c.f24642g[size2]); size2--) {
            i9++;
        }
        int i10 = size - i9;
        while (size > i10) {
            AbstractC2331a abstractC2331a = (AbstractC2331a) this.f9926k.remove(size);
            if (abstractC2331a != null) {
                abstractC2331a.m5548J(null);
                abstractC2331a.m5546H(-1);
                m6536h0(size);
                m6528U();
            }
            size--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public final void m6535g0() {
        C6107c c6107c = this.f9926k;
        c6107c.getClass();
        if (c6107c instanceof C6106b) {
            C6107c c6107c2 = new C6107c(0);
            this.f9926k = c6107c2;
            InterfaceC2336f interfaceC2336f = this.f9927l;
            if (interfaceC2336f == null) {
                c6107c2.f24643h = null;
            } else {
                c6107c2.f24643h = new C0830a(this, 3, interfaceC2336f);
            }
            c6107c2.f24648m = new C2571a(this, 9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public final boolean m6536h0(int i9) {
        return m6537i0(i9, size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9926k.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public final boolean m6537i0(int i9, int i10) {
        boolean z9 = false;
        if (i9 < 0) {
            i9 = 0;
        }
        if (i9 > i10) {
            i10 = i9;
            i9 = i10;
        }
        int i11 = i10 + 1;
        int size = size();
        if (i11 > size) {
            i11 = size;
        }
        C6107c c6107c = this.f9926k;
        while (i9 < i11) {
            AbstractC2331a abstractC2331a = (AbstractC2331a) c6107c.f24642g[i9];
            if (abstractC2331a.f7657g != i9) {
                abstractC2331a.m5546H(i9);
                z9 = true;
            }
            i9++;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Iterator iterator() {
        return this.f9926k.iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: p */
    public int mo5551p() {
        int size = size();
        if (size == 0) {
            return 0;
        }
        if (mo6525R()) {
            return m6524Q(0).mo5551p() * size;
        }
        int iMo5551p = 0;
        for (int i9 = 0; i9 < size; i9++) {
            iMo5551p += m6524Q(i9).mo5551p();
        }
        return iMo5551p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public final byte[] mo5552r() {
        Iterator it = this.f9926k.iterator();
        byte[] bArrM5537o = null;
        while (it.hasNext()) {
            bArrM5537o = AbstractC2331a.m5537o(bArrM5537o, ((AbstractC2331a) it.next()).mo5552r());
        }
        return bArrM5537o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean removeIf(Predicate predicate) {
        boolean zRemoveIf = this.f9926k.removeIf(predicate);
        if (zRemoveIf) {
            m6536h0(0);
        }
        return zRemoveIf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int size() {
        return this.f9926k.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "size=" + size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: z */
    public void mo5556z(C1075b c1075b) {
        boolean z9 = c1075b.f3459b;
        AbstractC2331a abstractC2331a = (AbstractC2331a) c1075b.f3461d;
        if (z9) {
            return;
        }
        if (abstractC2331a == this) {
            c1075b.f3459b = true;
            return;
        }
        if (size() != 0 && abstractC2331a != null) {
            if (!mo6525R() || m6524Q(0).getClass() == abstractC2331a.getClass()) {
                int size = size();
                for (int i9 = 0; i9 < size && !c1075b.f3459b; i9++) {
                    AbstractC2331a abstractC2331aM6524Q = m6524Q(i9);
                    if (abstractC2331aM6524Q != null) {
                        abstractC2331aM6524Q.mo5556z(c1075b);
                    }
                }
                return;
            }
        }
        int iMo5551p = mo5551p();
        if (c1075b.f3459b || iMo5551p == 0) {
            return;
        }
        c1075b.f3460c += iMo5551p;
    }

    /* JADX INFO: renamed from: V */
    public void mo5143V() {
    }

    /* JADX INFO: renamed from: W */
    public void mo1894W(AbstractC2331a abstractC2331a) {
    }
}
