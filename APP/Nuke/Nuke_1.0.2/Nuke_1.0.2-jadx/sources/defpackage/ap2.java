package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ap2 implements yo2, so {
    public final String a;
    public final s11 b;
    public final int c;
    public final HashSet d;
    public final String[] e;
    public final yo2[] f;
    public final List[] g;
    public final boolean[] h;
    public final Map i;
    public final yo2[] j;
    public final hx2 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ap2(String str, s11 s11Var, int i, List list, ct ctVar) {
        this.a = str;
        this.b = s11Var;
        this.c = i;
        ArrayList arrayList = ctVar.b;
        arrayList.getClass();
        HashSet hashSet = new HashSet(xe1.U(eu.B(arrayList, 12)));
        du.D0(arrayList, hashSet);
        this.d = hashSet;
        int i2 = 0;
        this.e = (String[]) arrayList.toArray(new String[0]);
        this.f = tl.q(ctVar.d);
        this.g = (List[]) ctVar.e.toArray(new List[0]);
        ArrayList arrayList2 = ctVar.f;
        arrayList2.getClass();
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            zArr[i3] = ((Boolean) it.next()).booleanValue();
            i3++;
        }
        this.h = zArr;
        String[] strArr = this.e;
        strArr.getClass();
        ky0 ky0Var = new ky0(i2, new ta(2, strArr));
        ArrayList arrayList3 = new ArrayList(eu.B(ky0Var, 10));
        Iterator it2 = ky0Var.iterator();
        while (true) {
            vc0 vc0Var = (vc0) it2;
            if (!vc0Var.i.hasNext()) {
                this.i = we1.u0(arrayList3);
                this.j = tl.q(list);
                this.k = new hx2(new ta(24, this));
                return;
            }
            jy0 jy0Var = (jy0) vc0Var.next();
            arrayList3.add(new ow1(jy0Var.b, Integer.valueOf(jy0Var.a)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final int a(String str) {
        str.getClass();
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final String b() {
        return this.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final s11 c() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final int d() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final String e(int i) {
        return this.e[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ap2) {
            yo2 yo2Var = (yo2) obj;
            if (this.a.equals(yo2Var.b()) && Arrays.equals(this.j, ((ap2) obj).j)) {
                int iD = yo2Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        yo2[] yo2VarArr = this.f;
                        if (t11.l(yo2VarArr[i2].b(), yo2Var.j(i2).b()) && t11.l(yo2VarArr[i2].c(), yo2Var.j(i2).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.so
    public final Set g() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final List getAnnotations() {
        return be0.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final List i(int i) {
        return this.g[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final yo2 j(int i) {
        return this.f[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yo2
    public final boolean k(int i) {
        return this.h[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return sp0.k0(this);
    }
}
