package p002a1;

import androidx.compose.runtime.AbstractC0464b3;
import java.util.Arrays;
import java.util.ListIterator;
import p010a9.InterfaceC0184l;
import p041d1.AbstractC1851a;
import p041d1.C1854d;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5102r;
import p364z0.InterfaceC9827e;

/* JADX INFO: renamed from: a1.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0015f extends AbstractC0012c implements InterfaceC9827e {

    /* JADX INFO: renamed from: r */
    public final Object[] f14r;

    /* JADX INFO: renamed from: s */
    public final Object[] f15s;

    /* JADX INFO: renamed from: t */
    public final int f16t;

    /* JADX INFO: renamed from: u */
    public final int f17u;

    public C0015f(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.f14r = objArr;
        this.f15s = objArr2;
        this.f16t = i10;
        this.f17u = i11;
        if (!(size() > 32)) {
            AbstractC0464b3.m1535a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        AbstractC1851a.m6548a(size() - AbstractC0023n.m99d(size()) <= AbstractC2368o.m8582i(objArr2.length, 32));
    }

    @Override // java.util.List, p364z0.InterfaceC9827e
    public InterfaceC9827e add(int i10, Object obj) {
        C1854d.m6553b(i10, size());
        if (i10 == size()) {
            return add(obj);
        }
        int iM44x = m44x();
        if (i10 >= iM44x) {
            return m37q(this.f14r, i10 - iM44x, obj);
        }
        C0014e c0014e = new C0014e(null);
        return m37q(m36p(this.f14r, this.f17u, i10, obj, c0014e), 0, c0014e.m29a());
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f16t;
    }

    @Override // p364z0.InterfaceC9827e
    /* JADX INFO: renamed from: f */
    public InterfaceC9827e mo32f(InterfaceC0184l interfaceC0184l) {
        C0017h c0017hBuilder = builder();
        c0017hBuilder.m64N(interfaceC0184l);
        return c0017hBuilder.build();
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public Object get(int i10) {
        C1854d.m6552a(i10, size());
        return m34l(i10)[i10 & 31];
    }

    @Override // p364z0.InterfaceC9827e
    /* JADX INFO: renamed from: k */
    public InterfaceC9827e mo33k(int i10) {
        C1854d.m6552a(i10, size());
        int iM44x = m44x();
        Object[] objArr = this.f14r;
        return i10 >= iM44x ? m43w(objArr, iM44x, this.f17u, i10 - iM44x) : m43w(m42v(objArr, this.f17u, i10, new C0014e(this.f15s[0])), iM44x, this.f17u, 0);
    }

    /* JADX INFO: renamed from: l */
    public final Object[] m34l(int i10) {
        if (m44x() <= i10) {
            return this.f15s;
        }
        Object[] objArr = this.f14r;
        for (int i11 = this.f17u; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[AbstractC0023n.m96a(i10, i11)];
            objArr2.getClass();
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public ListIterator listIterator(int i10) {
        C1854d.m6553b(i10, size());
        return new C0018i(this.f14r, this.f15s, i10, size(), (this.f17u / 5) + 1);
    }

    @Override // p364z0.InterfaceC9827e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C0017h builder() {
        return new C0017h(this, this.f14r, this.f15s, this.f17u);
    }

    /* JADX INFO: renamed from: p */
    public final Object[] m36p(Object[] objArr, int i10, int i11, Object obj, C0014e c0014e) {
        int iM96a = AbstractC0023n.m96a(i11, i10);
        if (i10 == 0) {
            Object[] objArrCopyOf = iM96a == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC5102r.m20660l(objArr, objArrCopyOf, iM96a + 1, iM96a, 31);
            c0014e.m30b(objArr[31]);
            objArrCopyOf[iM96a] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i12 = i10 - 5;
        Object obj2 = objArr[iM96a];
        obj2.getClass();
        objArrCopyOf2[iM96a] = m36p((Object[]) obj2, i12, i11, obj, c0014e);
        while (true) {
            iM96a++;
            if (iM96a >= 32 || objArrCopyOf2[iM96a] == null) {
                break;
            }
            Object obj3 = objArr[iM96a];
            obj3.getClass();
            objArrCopyOf2[iM96a] = m36p((Object[]) obj3, i12, 0, c0014e.m29a(), c0014e);
        }
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: q */
    public final C0015f m37q(Object[] objArr, int i10, Object obj) {
        int size = size() - m44x();
        Object[] objArrCopyOf = Arrays.copyOf(this.f15s, 32);
        Object[] objArr2 = this.f15s;
        if (size < 32) {
            AbstractC5102r.m20660l(objArr2, objArrCopyOf, i10 + 1, i10, size);
            objArrCopyOf[i10] = obj;
            return new C0015f(objArr, objArrCopyOf, size() + 1, this.f17u);
        }
        Object obj2 = objArr2[31];
        AbstractC5102r.m20660l(objArr2, objArrCopyOf, i10 + 1, i10, size - 1);
        objArrCopyOf[i10] = obj;
        return m40t(objArr, objArrCopyOf, AbstractC0023n.m98c(obj2));
    }

    /* JADX INFO: renamed from: r */
    public final Object[] m38r(Object[] objArr, int i10, int i11, C0014e c0014e) {
        Object[] objArrM38r;
        int iM96a = AbstractC0023n.m96a(i11, i10);
        if (i10 == 5) {
            c0014e.m30b(objArr[iM96a]);
            objArrM38r = null;
        } else {
            Object obj = objArr[iM96a];
            obj.getClass();
            objArrM38r = m38r((Object[]) obj, i10 - 5, i11, c0014e);
        }
        if (objArrM38r == null && iM96a == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iM96a] = objArrM38r;
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC9827e m39s(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new C0021l(objArr);
        }
        C0014e c0014e = new C0014e(null);
        Object[] objArrM38r = m38r(objArr, i11, i10 - 1, c0014e);
        objArrM38r.getClass();
        Object objM29a = c0014e.m29a();
        objM29a.getClass();
        Object[] objArr2 = (Object[]) objM29a;
        if (objArrM38r[1] != null) {
            return new C0015f(objArrM38r, objArr2, i10, i11);
        }
        Object obj = objArrM38r[0];
        obj.getClass();
        return new C0015f((Object[]) obj, objArr2, i10, i11 - 5);
    }

    @Override // p185m8.AbstractC5078f, java.util.List, p364z0.InterfaceC9827e
    public InterfaceC9827e set(int i10, Object obj) {
        C1854d.m6552a(i10, size());
        if (m44x() > i10) {
            return new C0015f(m45y(this.f14r, this.f17u, i10, obj), this.f15s, size(), this.f17u);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f15s, 32);
        objArrCopyOf[i10 & 31] = obj;
        return new C0015f(this.f14r, objArrCopyOf, size(), this.f17u);
    }

    /* JADX INFO: renamed from: t */
    public final C0015f m40t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f17u;
        if (size <= (1 << i10)) {
            return new C0015f(m41u(objArr, i10, objArr2), objArr3, size() + 1, this.f17u);
        }
        Object[] objArrM98c = AbstractC0023n.m98c(objArr);
        int i11 = this.f17u + 5;
        return new C0015f(m41u(objArrM98c, i11, objArr2), objArr3, size() + 1, i11);
    }

    /* JADX INFO: renamed from: u */
    public final Object[] m41u(Object[] objArr, int i10, Object[] objArr2) {
        int iM96a = AbstractC0023n.m96a(size() - 1, i10);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i10 == 5) {
            objArrCopyOf[iM96a] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM96a] = m41u((Object[]) objArrCopyOf[iM96a], i10 - 5, objArr2);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: v */
    public final Object[] m42v(Object[] objArr, int i10, int i11, C0014e c0014e) {
        int iM96a = AbstractC0023n.m96a(i11, i10);
        if (i10 == 0) {
            Object[] objArrCopyOf = iM96a == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            AbstractC5102r.m20660l(objArr, objArrCopyOf, iM96a, iM96a + 1, 32);
            objArrCopyOf[31] = c0014e.m29a();
            c0014e.m30b(objArr[iM96a]);
            return objArrCopyOf;
        }
        int iM96a2 = objArr[31] == null ? AbstractC0023n.m96a(m44x() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i12 = i10 - 5;
        int i13 = iM96a + 1;
        if (i13 <= iM96a2) {
            while (true) {
                Object obj = objArrCopyOf2[iM96a2];
                obj.getClass();
                objArrCopyOf2[iM96a2] = m42v((Object[]) obj, i12, 0, c0014e);
                if (iM96a2 == i13) {
                    break;
                }
                iM96a2--;
            }
        }
        Object obj2 = objArrCopyOf2[iM96a];
        obj2.getClass();
        objArrCopyOf2[iM96a] = m42v((Object[]) obj2, i12, i11, c0014e);
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC9827e m43w(Object[] objArr, int i10, int i11, int i12) {
        int size = size() - i10;
        AbstractC1851a.m6548a(i12 < size);
        if (size == 1) {
            return m39s(objArr, i10, i11);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f15s, 32);
        int i13 = size - 1;
        if (i12 < i13) {
            AbstractC5102r.m20660l(this.f15s, objArrCopyOf, i12, i12 + 1, size);
        }
        objArrCopyOf[i13] = null;
        return new C0015f(objArr, objArrCopyOf, (i10 + size) - 1, i11);
    }

    /* JADX INFO: renamed from: x */
    public final int m44x() {
        return AbstractC0023n.m99d(size());
    }

    /* JADX INFO: renamed from: y */
    public final Object[] m45y(Object[] objArr, int i10, int i11, Object obj) {
        int iM96a = AbstractC0023n.m96a(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i10 == 0) {
            objArrCopyOf[iM96a] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iM96a];
        obj2.getClass();
        objArrCopyOf[iM96a] = m45y((Object[]) obj2, i10 - 5, i11, obj);
        return objArrCopyOf;
    }

    @Override // java.util.Collection, java.util.List, p364z0.InterfaceC9827e
    public InterfaceC9827e add(Object obj) {
        int size = size() - m44x();
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f15s, 32);
            objArrCopyOf[size] = obj;
            return new C0015f(this.f14r, objArrCopyOf, size() + 1, this.f17u);
        }
        return m40t(this.f14r, this.f15s, AbstractC0023n.m98c(obj));
    }
}
