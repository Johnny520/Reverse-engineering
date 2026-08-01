package p374zb;

import java.util.Arrays;
import java.util.ListIterator;
import p052dc.AbstractC1943a;
import p052dc.C1946d;
import p080f9.AbstractC2368o;
import p360yb.InterfaceC9663f;
import p376zd.C10030z0;

/* JADX INFO: renamed from: zb.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9930d extends AbstractC9928b implements InterfaceC9663f {

    /* JADX INFO: renamed from: r */
    public final Object[] f33460r;

    /* JADX INFO: renamed from: s */
    public final Object[] f33461s;

    /* JADX INFO: renamed from: t */
    public final int f33462t;

    /* JADX INFO: renamed from: u */
    public final int f33463u;

    public C9930d(Object[] objArr, Object[] objArr2, int i10, int i11) {
        objArr.getClass();
        objArr2.getClass();
        this.f33460r = objArr;
        this.f33461s = objArr2;
        this.f33462t = i10;
        this.f33463u = i11;
        if (size() > 32) {
            AbstractC1943a.m7049a(size() - AbstractC9934h.m38504d(size()) <= AbstractC2368o.m8582i(objArr2.length, 32));
        } else {
            C10030z0.m38853a("Trie-based persistent vector should have at least 33 elements, got ", size());
            throw null;
        }
    }

    /* JADX INFO: renamed from: l */
    private final Object[] m38492l(int i10) {
        if (m38494q() <= i10) {
            return this.f33461s;
        }
        Object[] objArr = this.f33460r;
        for (int i11 = this.f33463u; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[AbstractC9934h.m38501a(i10, i11)];
            objArr2.getClass();
            objArr = objArr2;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: p */
    private final Object[] m38493p(Object[] objArr, int i10, Object[] objArr2) {
        int iM38501a = AbstractC9934h.m38501a(size() - 1, i10);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i10 == 5) {
            objArrCopyOf[iM38501a] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM38501a] = m38493p((Object[]) objArrCopyOf[iM38501a], i10 - 5, objArr2);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: q */
    private final int m38494q() {
        return AbstractC9934h.m38504d(size());
    }

    @Override // java.util.Collection, java.util.List, p360yb.InterfaceC9663f
    public InterfaceC9663f add(Object obj) {
        int size = size() - m38494q();
        if (size >= 32) {
            return m38495o(this.f33460r, this.f33461s, AbstractC9934h.m38503c(obj));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f33461s, 32);
        objArrCopyOf[size] = obj;
        return new C9930d(this.f33460r, objArrCopyOf, size() + 1, this.f33463u);
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f33462t;
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public Object get(int i10) {
        C1946d.m7053a(i10, size());
        return m38492l(i10)[i10 & 31];
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public ListIterator listIterator(int i10) {
        C1946d.m7054b(i10, size());
        return new C9931e(this.f33460r, this.f33461s, i10, size(), (this.f33463u / 5) + 1);
    }

    /* JADX INFO: renamed from: o */
    public final C9930d m38495o(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f33463u;
        if (size <= (1 << i10)) {
            return new C9930d(m38493p(objArr, i10, objArr2), objArr3, size() + 1, this.f33463u);
        }
        Object[] objArrM38503c = AbstractC9934h.m38503c(objArr);
        int i11 = this.f33463u + 5;
        return new C9930d(m38493p(objArrM38503c, i11, objArr2), objArr3, size() + 1, i11);
    }
}
