package p000;

/* JADX INFO: renamed from: om */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0548om {

    /* JADX INFO: renamed from: a */
    public final zk1 f7729a = new zk1(new C0585pm[16]);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:19:0x0062). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3573a(o62 o62Var, u00 u00Var) {
        C0503nm c0503nm;
        int i;
        o62 o62Var2;
        int i2;
        Object[] objArr;
        if (u00Var instanceof C0503nm) {
            c0503nm = (C0503nm) u00Var;
            int i3 = c0503nm.f7231q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0503nm.f7231q = i3 - Integer.MIN_VALUE;
            } else {
                c0503nm = new C0503nm(this, u00Var);
            }
        }
        Object obj = c0503nm.f7229o;
        int i4 = c0503nm.f7231q;
        if (i4 == 0) {
            fg1.m1627T(obj);
            zk1 zk1Var = this.f7729a;
            Object[] objArr2 = zk1Var.f13934h;
            i = zk1Var.f13936j;
            o62Var2 = o62Var;
            i2 = 0;
            objArr = objArr2;
            if (i2 < i) {
            }
        } else {
            if (i4 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c0503nm.f7228n;
            i2 = c0503nm.f7227m;
            objArr = c0503nm.f7226l;
            o62 o62Var3 = c0503nm.f7225k;
            fg1.m1627T(obj);
            o62Var2 = o62Var3;
            i2++;
            if (i2 < i) {
                C0585pm c0585pm = (C0585pm) objArr[i2];
                C0727ta c0727ta = new C0727ta(3, o62Var2);
                c0503nm.f7225k = o62Var2;
                c0503nm.f7226l = objArr;
                c0503nm.f7227m = i2;
                c0503nm.f7228n = i;
                c0503nm.f7231q = 1;
                Object objM4482r = rg3.m4482r(c0585pm, c0727ta, c0503nm);
                k20 k20Var = k20.f5323h;
                if (objM4482r == k20Var) {
                    return k20Var;
                }
                i2++;
                if (i2 < i) {
                    return a83.f116a;
                }
            }
        }
    }
}
