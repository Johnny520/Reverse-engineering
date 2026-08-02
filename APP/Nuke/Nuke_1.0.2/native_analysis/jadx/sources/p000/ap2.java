package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ap2 implements yo2, InterfaceC0701so {

    /* JADX INFO: renamed from: a */
    public final String f321a;

    /* JADX INFO: renamed from: b */
    public final s11 f322b;

    /* JADX INFO: renamed from: c */
    public final int f323c;

    /* JADX INFO: renamed from: d */
    public final HashSet f324d;

    /* JADX INFO: renamed from: e */
    public final String[] f325e;

    /* JADX INFO: renamed from: f */
    public final yo2[] f326f;

    /* JADX INFO: renamed from: g */
    public final List[] f327g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f328h;

    /* JADX INFO: renamed from: i */
    public final Map f329i;

    /* JADX INFO: renamed from: j */
    public final yo2[] f330j;

    /* JADX INFO: renamed from: k */
    public final hx2 f331k;

    public ap2(String str, s11 s11Var, int i, List list, C0105ct c0105ct) {
        this.f321a = str;
        this.f322b = s11Var;
        this.f323c = i;
        ArrayList arrayList = c0105ct.f1715b;
        arrayList.getClass();
        HashSet hashSet = new HashSet(xe1.m6103U(AbstractC0179eu.m1421B(arrayList, 12)));
        AbstractC0142du.m1146D0(arrayList, hashSet);
        this.f324d = hashSet;
        int i2 = 0;
        this.f325e = (String[]) arrayList.toArray(new String[0]);
        this.f326f = AbstractC0738tl.m5318q(c0105ct.f1717d);
        this.f327g = (List[]) c0105ct.f1718e.toArray(new List[0]);
        ArrayList arrayList2 = c0105ct.f1719f;
        arrayList2.getClass();
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            zArr[i3] = ((Boolean) it.next()).booleanValue();
            i3++;
        }
        this.f328h = zArr;
        String[] strArr = this.f325e;
        strArr.getClass();
        ky0 ky0Var = new ky0(i2, new C0727ta(2, strArr));
        ArrayList arrayList3 = new ArrayList(AbstractC0179eu.m1421B(ky0Var, 10));
        Iterator it2 = ky0Var.iterator();
        while (true) {
            vc0 vc0Var = (vc0) it2;
            if (!vc0Var.f11898i.hasNext()) {
                this.f329i = we1.m5880u0(arrayList3);
                this.f330j = AbstractC0738tl.m5318q(list);
                this.f331k = new hx2(new C0727ta(24, this));
                return;
            }
            jy0 jy0Var = (jy0) vc0Var.next();
            arrayList3.add(new ow1(jy0Var.f5274b, Integer.valueOf(jy0Var.f5273a)));
        }
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: a */
    public final int mo249a(String str) {
        str.getClass();
        Integer num = (Integer) this.f329i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: b */
    public final String mo250b() {
        return this.f321a;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: c */
    public final s11 mo251c() {
        return this.f322b;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: d */
    public final int mo252d() {
        return this.f323c;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: e */
    public final String mo253e(int i) {
        return this.f325e[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ap2) {
            yo2 yo2Var = (yo2) obj;
            if (this.f321a.equals(yo2Var.mo250b()) && Arrays.equals(this.f330j, ((ap2) obj).f330j)) {
                int iMo252d = yo2Var.mo252d();
                int i = this.f323c;
                if (i == iMo252d) {
                    for (int i2 = 0; i2 < i; i2++) {
                        yo2[] yo2VarArr = this.f326f;
                        if (t11.m5086l(yo2VarArr[i2].mo250b(), yo2Var.mo256j(i2).mo250b()) && t11.m5086l(yo2VarArr[i2].mo251c(), yo2Var.mo256j(i2).mo251c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0701so
    /* JADX INFO: renamed from: g */
    public final Set mo254g() {
        return this.f324d;
    }

    @Override // p000.yo2
    public final List getAnnotations() {
        return be0.f819h;
    }

    public final int hashCode() {
        return ((Number) this.f331k.getValue()).intValue();
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: i */
    public final List mo255i(int i) {
        return this.f327g[i];
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: j */
    public final yo2 mo256j(int i) {
        return this.f326f[i];
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: k */
    public final boolean mo257k(int i) {
        return this.f328h[i];
    }

    public final String toString() {
        return sp0.m4949k0(this);
    }
}
