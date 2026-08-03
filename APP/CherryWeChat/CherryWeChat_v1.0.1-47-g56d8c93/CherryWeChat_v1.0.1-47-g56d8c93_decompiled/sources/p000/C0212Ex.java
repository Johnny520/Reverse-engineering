package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Ex */
/* JADX INFO: loaded from: classes.dex */
public final class C0212Ex implements InterfaceC0126Cx, InterfaceC0050B6 {

    /* JADX INFO: renamed from: a */
    public final String f618a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1406fG f619b;

    /* JADX INFO: renamed from: c */
    public final int f620c;

    /* JADX INFO: renamed from: d */
    public final HashSet f621d;

    /* JADX INFO: renamed from: e */
    public final String[] f622e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0126Cx[] f623f;

    /* JADX INFO: renamed from: g */
    public final List[] f624g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f625h;

    /* JADX INFO: renamed from: i */
    public final Map f626i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC0126Cx[] f627j;

    /* JADX INFO: renamed from: k */
    public final C1251cA f628k;

    public C0212Ex(String str, AbstractC1406fG abstractC1406fG, int i, List list, C0268G9 c0268g9) {
        this.f618a = str;
        this.f619b = abstractC1406fG;
        this.f620c = i;
        ArrayList arrayList = c0268g9.f860b;
        HashSet hashSet = new HashSet(AbstractC2598uq.m5109K(AbstractC2539ta.m5019d0(arrayList, 12)));
        AbstractC2453ra.m4906p0(arrayList, hashSet);
        this.f621d = hashSet;
        int i2 = 0;
        this.f622e = (String[]) arrayList.toArray(new String[0]);
        this.f623f = AbstractC1293cr.m2551l(c0268g9.f862d);
        this.f624g = (List[]) c0268g9.f863e.toArray(new List[0]);
        ArrayList arrayList2 = c0268g9.f864f;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.f625h = zArr;
        C2107jl c2107jl = new C2107jl(0, new C0693Q4(0, this.f622e));
        ArrayList arrayList3 = new ArrayList(AbstractC2539ta.m5019d0(c2107jl, 10));
        Iterator it2 = c2107jl.iterator();
        while (true) {
            C2694x c2694x = (C2694x) it2;
            if (!((Iterator) c2694x.f9269c).hasNext()) {
                this.f626i = AbstractC2598uq.m5111M(arrayList3);
                this.f627j = AbstractC1293cr.m2551l(list);
                this.f628k = new C1251cA(new C0693Q4(6, this));
                return;
            }
            C1549il c1549il = (C1549il) c2694x.next();
            arrayList3.add(new C0208Et(c1549il.f5503b, Integer.valueOf(c1549il.f5502a)));
        }
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: a */
    public final int mo202a(String str) {
        Integer num = (Integer) this.f626i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: b */
    public final String mo203b() {
        return this.f618a;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: c */
    public final AbstractC1406fG mo204c() {
        return this.f619b;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: d */
    public final int mo205d() {
        return this.f620c;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: e */
    public final String mo206e(int i) {
        return this.f622e[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0212Ex) {
            InterfaceC0126Cx interfaceC0126Cx = (InterfaceC0126Cx) obj;
            if (this.f618a.equals(interfaceC0126Cx.mo203b()) && Arrays.equals(this.f627j, ((C0212Ex) obj).f627j)) {
                int iMo205d = interfaceC0126Cx.mo205d();
                int i = this.f620c;
                if (i == iMo205d) {
                    for (int i2 = 0; i2 < i; i2++) {
                        InterfaceC0126Cx[] interfaceC0126CxArr = this.f623f;
                        if (AbstractC0585Nj.m1134a(interfaceC0126CxArr[i2].mo203b(), interfaceC0126Cx.mo210j(i2).mo203b()) && AbstractC0585Nj.m1134a(interfaceC0126CxArr[i2].mo204c(), interfaceC0126Cx.mo210j(i2).mo204c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: f */
    public final boolean mo207f() {
        return false;
    }

    @Override // p000.InterfaceC0050B6
    /* JADX INFO: renamed from: g */
    public final Set mo89g() {
        return this.f621d;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: h */
    public final boolean mo208h() {
        return false;
    }

    public final int hashCode() {
        return ((Number) this.f628k.getValue()).intValue();
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: i */
    public final List mo209i(int i) {
        return this.f624g[i];
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: j */
    public final InterfaceC0126Cx mo210j(int i) {
        return this.f623f[i];
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: k */
    public final boolean mo211k(int i) {
        return this.f625h[i];
    }

    public final String toString() {
        return AbstractC2453ra.m4901k0(AbstractC0828TB.m1632J(0, this.f620c), ", ", this.f618a.concat("("), ")", new C2479s(6, this), 24);
    }
}
