package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class om {
    public final zk1 a = new zk1(new pm[16]);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:19:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(o62 o62Var, u00 u00Var) {
        nm nmVar;
        int i;
        o62 o62Var2;
        int i2;
        Object[] objArr;
        if (u00Var instanceof nm) {
            nmVar = (nm) u00Var;
            int i3 = nmVar.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nmVar.q = i3 - Integer.MIN_VALUE;
            } else {
                nmVar = new nm(this, u00Var);
            }
        }
        Object obj = nmVar.o;
        int i4 = nmVar.q;
        if (i4 == 0) {
            fg1.T(obj);
            zk1 zk1Var = this.a;
            Object[] objArr2 = zk1Var.h;
            i = zk1Var.j;
            o62Var2 = o62Var;
            i2 = 0;
            objArr = objArr2;
            if (i2 < i) {
            }
        } else {
            if (i4 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = nmVar.n;
            i2 = nmVar.m;
            objArr = nmVar.l;
            o62 o62Var3 = nmVar.k;
            fg1.T(obj);
            o62Var2 = o62Var3;
            i2++;
            if (i2 < i) {
                pm pmVar = (pm) objArr[i2];
                ta taVar = new ta(3, o62Var2);
                nmVar.k = o62Var2;
                nmVar.l = objArr;
                nmVar.m = i2;
                nmVar.n = i;
                nmVar.q = 1;
                Object objR = rg3.r(pmVar, taVar, nmVar);
                k20 k20Var = k20.h;
                if (objR == k20Var) {
                    return k20Var;
                }
                i2++;
                if (i2 < i) {
                    return a83.a;
                }
            }
        }
    }
}
