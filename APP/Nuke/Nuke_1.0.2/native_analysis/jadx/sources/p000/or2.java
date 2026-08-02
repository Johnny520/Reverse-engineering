package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class or2 extends w92 implements mn0 {

    /* JADX INFO: renamed from: j */
    public Object f7809j;

    /* JADX INFO: renamed from: k */
    public Iterator f7810k;

    /* JADX INFO: renamed from: l */
    public int f7811l;

    /* JADX INFO: renamed from: m */
    public int f7812m;

    /* JADX INFO: renamed from: n */
    public int f7813n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f7814o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f7815p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ int f7816q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Iterator f7817r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or2(int i, int i2, Iterator it, t00 t00Var) {
        super(2, t00Var);
        this.f7815p = i;
        this.f7816q = i2;
        this.f7817r = it;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        return ((or2) mo13p((t00) obj2, (vo2) obj)).mo7r(a83.f116a);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        or2 or2Var = new or2(this.f7815p, this.f7816q, this.f7817r, t00Var);
        or2Var.f7814o = obj;
        return or2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138 A[SYNTHETIC] */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
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
        vo2 vo2Var = (vo2) this.f7814o;
        int i7 = this.f7813n;
        int i8 = this.f7816q;
        boolean z2 = true;
        int i9 = this.f7815p;
        k20 k20Var = k20.f5323h;
        if (i7 == 0) {
            fg1.m1627T(obj);
            int i10 = i9 <= 1024 ? i9 : 1024;
            i = i8 - i9;
            Iterator it3 = this.f7817r;
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
                    int i11 = na2Var.f7087i;
                    Object[] objArr = na2Var.f7086h;
                    if (it.hasNext()) {
                    }
                    z2 = z;
                }
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
            } else if (i7 == 3) {
                i3 = this.f7812m;
                i2 = this.f7811l;
                it = this.f7810k;
                na2Var = (na2) this.f7809j;
                fg1.m1627T(obj);
                na2Var.m3264b(i8);
                while (true) {
                    int i112 = na2Var.f7087i;
                    Object[] objArr2 = na2Var.f7086h;
                    if (it.hasNext()) {
                        i6 = i2;
                        na2Var2 = na2Var;
                        break;
                    }
                    Object next = it.next();
                    z = z2;
                    if (na2Var.mo529a() == i112) {
                        C0676s.m4653l("ring buffer is full");
                        return null;
                    }
                    int i12 = na2Var.f7088j;
                    int i13 = na2Var.f7089k;
                    objArr2[(i12 + i13) % i112] = next;
                    na2Var.f7089k = i13 + 1;
                    if (na2Var.mo529a() == i112) {
                        if (na2Var.f7089k >= i9) {
                            ArrayList arrayList2 = new ArrayList(na2Var);
                            this.f7814o = vo2Var;
                            this.f7809j = na2Var;
                            this.f7810k = it;
                            this.f7811l = i2;
                            this.f7812m = i3;
                            this.f7813n = 3;
                            vo2Var.m5746b(this, arrayList2);
                            return k20Var;
                        }
                        int i14 = i112 + (i112 >> 1) + 1;
                        if (i14 > i9) {
                            i14 = i9;
                        }
                        na2Var = new na2(na2Var.f7089k, na2Var.f7088j == 0 ? Arrays.copyOf(objArr2, i14) : na2Var.toArray(new Object[i14]));
                    }
                    z2 = z;
                }
            } else if (i7 == 4) {
                i3 = this.f7812m;
                i6 = this.f7811l;
                na2Var2 = (na2) this.f7809j;
                fg1.m1627T(obj);
                na2Var2.m3264b(i8);
                if (na2Var2.f7089k > i8) {
                    ArrayList arrayList3 = new ArrayList(na2Var2);
                    this.f7814o = vo2Var;
                    this.f7809j = na2Var2;
                    this.f7810k = null;
                    this.f7811l = i6;
                    this.f7812m = i3;
                    this.f7813n = 4;
                    vo2Var.m5746b(this, arrayList3);
                    return k20Var;
                }
                if (!na2Var2.isEmpty()) {
                    this.f7814o = null;
                    this.f7809j = null;
                    this.f7810k = null;
                    this.f7811l = i6;
                    this.f7812m = i3;
                    this.f7813n = 5;
                    vo2Var.m5746b(this, na2Var2);
                    return k20Var;
                }
            } else {
                if (i7 != 5) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            fg1.m1627T(obj);
        } else {
            i5 = this.f7812m;
            i4 = this.f7811l;
            it2 = this.f7810k;
            fg1.m1627T(obj);
            arrayList = new ArrayList(i9);
            i = i5;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next2);
                    if (arrayList.size() == i9) {
                        this.f7814o = vo2Var;
                        this.f7809j = arrayList;
                        this.f7810k = it2;
                        this.f7811l = i4;
                        this.f7812m = i;
                        this.f7813n = 1;
                        vo2Var.m5746b(this, arrayList);
                        return k20Var;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f7814o = null;
                this.f7809j = null;
                this.f7810k = null;
                this.f7811l = i4;
                this.f7812m = i;
                this.f7813n = 2;
                vo2Var.m5746b(this, arrayList);
                return k20Var;
            }
        }
        return a83.f116a;
    }
}
