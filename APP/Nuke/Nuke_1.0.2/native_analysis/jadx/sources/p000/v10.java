package p000;

import android.view.autofill.AutofillValue;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v10 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f11596h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ w10 f11597i;

    public /* synthetic */ v10(w10 w10Var, zn2 zn2Var) {
        this.f11596h = 3;
        this.f11597i = w10Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f11596h;
        boolean z = false;
        w10 w10Var = this.f11597i;
        switch (i) {
            case 0:
                nx1 nx1Var = w10Var.f12269z.f10641t;
                Boolean bool = Boolean.TRUE;
                nx1Var.setValue(bool);
                w10Var.f12269z.f10640s.setValue(bool);
                t91 t91Var = w10Var.f12269z;
                AutofillValue autofillValue = ((C0801v8) obj).f11816a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                w10.m5825P0(t91Var, (String) textValue, w10Var.f12260A, w10Var.f12261B);
                return bool;
            case 1:
                List list = (List) obj;
                if (w10Var.f12269z.m5146d() != null) {
                    z03 z03VarM5146d = w10Var.f12269z.m5146d();
                    z03VarM5146d.getClass();
                    list.add(z03VarM5146d.f13697a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                w10.m5825P0(w10Var.f12269z, ((C0690sd) obj).f10051i, w10Var.f12260A, w10Var.f12261B);
                return Boolean.TRUE;
            default:
                C0690sd c0690sd = (C0690sd) obj;
                if (!w10Var.f12260A && w10Var.f12261B) {
                    t03 t03Var = w10Var.f12269z.f10626e;
                    if (t03Var != null) {
                        List listM1435P = AbstractC0179eu.m1435P(new ej0(), new C0180ev(c0690sd, 1));
                        t91 t91Var2 = w10Var.f12269z;
                        sz0 sz0Var = t91Var2.f10625d;
                        n10 n10Var = t91Var2.f10643v;
                        k03 k03VarM5042q = sz0Var.m5042q(listM1435P);
                        t03Var.m5048a(null, k03VarM5042q);
                        n10Var.mo5j(k03VarM5042q);
                    } else {
                        k03 k03Var = w10Var.f12268y;
                        String str = k03Var.f5296a.f10051i;
                        long j = k03Var.f5297b;
                        int i2 = f13.f2738c;
                        String string = pv2.m3985A0(str, (int) (j >> 32), (int) (j & 4294967295L), c0690sd).toString();
                        int length = c0690sd.f10051i.length() + ((int) (w10Var.f12268y.f5297b >> 32));
                        w10Var.f12269z.f10643v.mo5j(new k03(string, fg1.m1636i(length, length), 4));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ v10(w10 w10Var, int i) {
        this.f11596h = i;
        this.f11597i = w10Var;
    }
}
