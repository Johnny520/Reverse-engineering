package defpackage;

import android.app.PendingIntent;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mf implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ mf(bc2 bc2Var, wc2 wc2Var, fc2 fc2Var, String str, Object obj, Object[] objArr) {
        this.h = 1;
        this.j = bc2Var;
        this.k = wc2Var;
        this.l = fc2Var;
        this.i = str;
        this.m = obj;
        this.n = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() throws PendingIntent.CanceledException {
        boolean z;
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj = this.m;
        Object obj2 = this.l;
        Object obj3 = this.n;
        Object obj4 = this.i;
        Object obj5 = this.k;
        Object obj6 = this.j;
        switch (i) {
            case 0:
                String str = (String) obj4;
                b73 b73Var = (b73) obj5;
                String str2 = (String) obj6;
                in0 in0Var = (in0) obj2;
                c73 c73Var = (c73) obj;
                xk1 xk1Var = (xk1) obj3;
                if (str != null) {
                    in0Var.j(c73.a(c73Var, 0, 0, false, new b73(str.equals(str2) ? null : str, p7.S(str, str2, b73Var.b)), 7));
                    xk1Var.setValue(Boolean.FALSE);
                }
                break;
            case 1:
                bc2 bc2Var = (bc2) obj6;
                wc2 wc2Var = (wc2) obj5;
                fc2 fc2Var = (fc2) obj2;
                String str3 = (String) obj4;
                Object[] objArr = (Object[]) obj3;
                boolean z2 = true;
                if (bc2Var.i != fc2Var) {
                    bc2Var.i = fc2Var;
                    z = true;
                } else {
                    z = false;
                }
                if (t11.l(bc2Var.j, str3)) {
                    z2 = z;
                } else {
                    bc2Var.j = str3;
                }
                bc2Var.h = wc2Var;
                bc2Var.k = obj;
                bc2Var.l = objArr;
                ec2 ec2Var = bc2Var.m;
                if (ec2Var != null && z2) {
                    ((b5) ec2Var).H();
                    bc2Var.m = null;
                    bc2Var.b();
                }
                break;
            case 2:
                xk1 xk1Var2 = (xk1) obj3;
                xk1Var2.setValue(Boolean.TRUE);
                p7.A((j20) obj4, null, new tc((cq1) obj6, (xk1) obj5, (xk1) obj2, (Context) obj, xk1Var2, null), 3);
                break;
            case 3:
                xk1 xk1Var3 = (xk1) obj3;
                xk1Var3.setValue(Boolean.TRUE);
                p7.A((j20) obj4, null, new vi2((vy1) obj6, (xk1) obj5, (xk1) obj2, (Context) obj, xk1Var3, (t00) null, 2), 3);
                break;
            default:
                xk1 xk1Var4 = (xk1) obj2;
                xk1 xk1Var5 = (xk1) obj;
                ((xk1) obj3).setValue((kf2) obj6);
                Object obj7 = (j31) ((uq1) obj5).c.b.get((String) obj4);
                xk1Var4.setValue(obj7 == null ? "" : obj7 instanceof z21 ? du.u0((Iterable) obj7, "\n", null, null, new xc2(29), 30) : obj7 instanceof i41 ? ((i41) obj7).a() : obj7.toString());
                xk1Var5.setValue(null);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ mf(j20 j20Var, xk1 xk1Var, Object obj, xk1 xk1Var2, xk1 xk1Var3, Context context, int i) {
        this.h = i;
        this.i = j20Var;
        this.n = xk1Var;
        this.j = obj;
        this.k = xk1Var2;
        this.l = xk1Var3;
        this.m = context;
    }

    public /* synthetic */ mf(kf2 kf2Var, uq1 uq1Var, String str, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3) {
        this.h = 4;
        this.j = kf2Var;
        this.k = uq1Var;
        this.i = str;
        this.n = xk1Var;
        this.l = xk1Var2;
        this.m = xk1Var3;
    }

    public /* synthetic */ mf(String str, b73 b73Var, String str2, in0 in0Var, c73 c73Var, xk1 xk1Var) {
        this.h = 0;
        this.i = str;
        this.k = b73Var;
        this.j = str2;
        this.l = in0Var;
        this.m = c73Var;
        this.n = xk1Var;
    }
}
