package p000;

import android.app.PendingIntent;
import android.content.Context;

/* JADX INFO: renamed from: mf */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0459mf implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6592h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f6593i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f6594j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f6595k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f6596l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f6597m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f6598n;

    public /* synthetic */ C0459mf(bc2 bc2Var, wc2 wc2Var, fc2 fc2Var, String str, Object obj, Object[] objArr) {
        this.f6592h = 1;
        this.f6594j = bc2Var;
        this.f6595k = wc2Var;
        this.f6596l = fc2Var;
        this.f6593i = str;
        this.f6597m = obj;
        this.f6598n = objArr;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() throws PendingIntent.CanceledException {
        boolean z;
        int i = this.f6592h;
        a83 a83Var = a83.f116a;
        Object obj = this.f6597m;
        Object obj2 = this.f6596l;
        Object obj3 = this.f6598n;
        Object obj4 = this.f6593i;
        Object obj5 = this.f6595k;
        Object obj6 = this.f6594j;
        switch (i) {
            case 0:
                String str = (String) obj4;
                b73 b73Var = (b73) obj5;
                String str2 = (String) obj6;
                in0 in0Var = (in0) obj2;
                c73 c73Var = (c73) obj;
                xk1 xk1Var = (xk1) obj3;
                if (str != null) {
                    in0Var.mo5j(c73.m662a(c73Var, 0, 0, false, new b73(str.equals(str2) ? null : str, AbstractC0570p7.m3763S(str, str2, b73Var.f725b)), 7));
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
                if (bc2Var.f779i != fc2Var) {
                    bc2Var.f779i = fc2Var;
                    z = true;
                } else {
                    z = false;
                }
                if (t11.m5086l(bc2Var.f780j, str3)) {
                    z2 = z;
                } else {
                    bc2Var.f780j = str3;
                }
                bc2Var.f778h = wc2Var;
                bc2Var.f781k = obj;
                bc2Var.f782l = objArr;
                ec2 ec2Var = bc2Var.f783m;
                if (ec2Var != null && z2) {
                    ((C0043b5) ec2Var).m415H();
                    bc2Var.f783m = null;
                    bc2Var.m511b();
                }
                break;
            case 2:
                xk1 xk1Var2 = (xk1) obj3;
                xk1Var2.setValue(Boolean.TRUE);
                AbstractC0570p7.m3745A((j20) obj4, null, new C0729tc((cq1) obj6, (xk1) obj5, (xk1) obj2, (Context) obj, xk1Var2, null), 3);
                break;
            case 3:
                xk1 xk1Var3 = (xk1) obj3;
                xk1Var3.setValue(Boolean.TRUE);
                AbstractC0570p7.m3745A((j20) obj4, null, new vi2((vy1) obj6, (xk1) obj5, (xk1) obj2, (Context) obj, xk1Var3, (t00) null, 2), 3);
                break;
            default:
                xk1 xk1Var4 = (xk1) obj2;
                xk1 xk1Var5 = (xk1) obj;
                ((xk1) obj3).setValue((kf2) obj6);
                Object obj7 = (j31) ((uq1) obj5).f11443c.f9545b.get((String) obj4);
                xk1Var4.setValue(obj7 == null ? "" : obj7 instanceof z21 ? AbstractC0142du.m1165u0((Iterable) obj7, "\n", null, null, new xc2(29), 30) : obj7 instanceof i41 ? ((i41) obj7).mo2263a() : obj7.toString());
                xk1Var5.setValue(null);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ C0459mf(j20 j20Var, xk1 xk1Var, Object obj, xk1 xk1Var2, xk1 xk1Var3, Context context, int i) {
        this.f6592h = i;
        this.f6593i = j20Var;
        this.f6598n = xk1Var;
        this.f6594j = obj;
        this.f6595k = xk1Var2;
        this.f6596l = xk1Var3;
        this.f6597m = context;
    }

    public /* synthetic */ C0459mf(kf2 kf2Var, uq1 uq1Var, String str, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3) {
        this.f6592h = 4;
        this.f6594j = kf2Var;
        this.f6595k = uq1Var;
        this.f6593i = str;
        this.f6598n = xk1Var;
        this.f6596l = xk1Var2;
        this.f6597m = xk1Var3;
    }

    public /* synthetic */ C0459mf(String str, b73 b73Var, String str2, in0 in0Var, c73 c73Var, xk1 xk1Var) {
        this.f6592h = 0;
        this.f6593i = str;
        this.f6595k = b73Var;
        this.f6594j = str2;
        this.f6596l = in0Var;
        this.f6597m = c73Var;
        this.f6598n = xk1Var;
    }
}
