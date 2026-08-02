package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class or2 extends w92 implements mn0 {
    public Object j;
    public Iterator k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Iterator r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or2(int i, int i2, Iterator it, t00 t00Var) {
        super(2, t00Var);
        this.p = i;
        this.q = i2;
        this.r = it;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((or2) p((t00) obj2, (vo2) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        or2 or2Var = new or2(this.p, this.q, this.r, t00Var);
        or2Var.o = obj;
        return or2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138 A[SYNTHETIC] */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        int i;
        int i2;
        int i3;
        Iterator it;
        na2 na2Var;
        ArrayList arrayList;
        int i4;
        Iterator it2;
        int i5;
        int i6;
        na2 na2Var2;
        boolean z;
        vo2 vo2Var = (vo2) this.o;
        int i7 = this.n;
        int i8 = this.q;
        boolean z2 = true;
        int i9 = this.p;
        k20 k20Var = k20.h;
        if (i7 == 0) {
            fg1.T(obj);
            int i10 = i9 <= 1024 ? i9 : 1024;
            i = i8 - i9;
            Iterator it3 = this.r;
            if (i >= 0) {
                arrayList = new ArrayList(i10);
                i4 = i10;
                it2 = it3;
                i5 = 0;
                while (it2.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                }
            } else {
                na2 na2Var3 = new na2(0, new Object[i10]);
                i2 = i10;
                i3 = i;
                it = it3;
                na2Var = na2Var3;
                while (true) {
                    int i11 = na2Var.i;
                    Object[] objArr = na2Var.h;
                    if (it.hasNext()) {
                    }
                    z2 = z;
                }
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
            } else if (i7 == 3) {
                i3 = this.m;
                i2 = this.l;
                it = this.k;
                na2Var = (na2) this.j;
                fg1.T(obj);
                na2Var.b(i8);
                while (true) {
                    int i112 = na2Var.i;
                    Object[] objArr2 = na2Var.h;
                    if (it.hasNext()) {
                        i6 = i2;
                        na2Var2 = na2Var;
                        break;
                    }
                    Object next = it.next();
                    z = z2;
                    if (na2Var.a() == i112) {
                        s.l("ring buffer is full");
                        return null;
                    }
                    int i12 = na2Var.j;
                    int i13 = na2Var.k;
                    objArr2[(i12 + i13) % i112] = next;
                    na2Var.k = i13 + 1;
                    if (na2Var.a() == i112) {
                        if (na2Var.k >= i9) {
                            ArrayList arrayList2 = new ArrayList(na2Var);
                            this.o = vo2Var;
                            this.j = na2Var;
                            this.k = it;
                            this.l = i2;
                            this.m = i3;
                            this.n = 3;
                            vo2Var.b(this, arrayList2);
                            return k20Var;
                        }
                        int i14 = i112 + (i112 >> 1) + 1;
                        if (i14 > i9) {
                            i14 = i9;
                        }
                        na2Var = new na2(na2Var.k, na2Var.j == 0 ? Arrays.copyOf(objArr2, i14) : na2Var.toArray(new Object[i14]));
                    }
                    z2 = z;
                }
            } else if (i7 == 4) {
                i3 = this.m;
                i6 = this.l;
                na2Var2 = (na2) this.j;
                fg1.T(obj);
                na2Var2.b(i8);
                if (na2Var2.k > i8) {
                    ArrayList arrayList3 = new ArrayList(na2Var2);
                    this.o = vo2Var;
                    this.j = na2Var2;
                    this.k = null;
                    this.l = i6;
                    this.m = i3;
                    this.n = 4;
                    vo2Var.b(this, arrayList3);
                    return k20Var;
                }
                if (!na2Var2.isEmpty()) {
                    this.o = null;
                    this.j = null;
                    this.k = null;
                    this.l = i6;
                    this.m = i3;
                    this.n = 5;
                    vo2Var.b(this, na2Var2);
                    return k20Var;
                }
            } else {
                if (i7 != 5) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            fg1.T(obj);
        } else {
            i5 = this.m;
            i4 = this.l;
            it2 = this.k;
            fg1.T(obj);
            arrayList = new ArrayList(i9);
            i = i5;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next2);
                    if (arrayList.size() == i9) {
                        this.o = vo2Var;
                        this.j = arrayList;
                        this.k = it2;
                        this.l = i4;
                        this.m = i;
                        this.n = 1;
                        vo2Var.b(this, arrayList);
                        return k20Var;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.o = null;
                this.j = null;
                this.k = null;
                this.l = i4;
                this.m = i;
                this.n = 2;
                vo2Var.b(this, arrayList);
                return k20Var;
            }
        }
        return a83.a;
    }
}
