package defpackage;

import android.view.autofill.AutofillValue;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v10 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ w10 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ v10(w10 w10Var, zn2 zn2Var) {
        this.h = 3;
        this.i = w10Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        boolean z = false;
        w10 w10Var = this.i;
        switch (i) {
            case 0:
                nx1 nx1Var = w10Var.z.t;
                Boolean bool = Boolean.TRUE;
                nx1Var.setValue(bool);
                w10Var.z.s.setValue(bool);
                t91 t91Var = w10Var.z;
                AutofillValue autofillValue = ((v8) obj).a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                w10.P0(t91Var, (String) textValue, w10Var.A, w10Var.B);
                return bool;
            case 1:
                List list = (List) obj;
                if (w10Var.z.d() != null) {
                    z03 z03VarD = w10Var.z.d();
                    z03VarD.getClass();
                    list.add(z03VarD.a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                w10.P0(w10Var.z, ((sd) obj).i, w10Var.A, w10Var.B);
                return Boolean.TRUE;
            default:
                sd sdVar = (sd) obj;
                if (!w10Var.A && w10Var.B) {
                    t03 t03Var = w10Var.z.e;
                    if (t03Var != null) {
                        List listP = eu.P(new ej0(), new ev(sdVar, 1));
                        t91 t91Var2 = w10Var.z;
                        sz0 sz0Var = t91Var2.d;
                        n10 n10Var = t91Var2.v;
                        k03 k03VarQ = sz0Var.q(listP);
                        t03Var.a(null, k03VarQ);
                        n10Var.j(k03VarQ);
                    } else {
                        k03 k03Var = w10Var.y;
                        String str = k03Var.a.i;
                        long j = k03Var.b;
                        int i2 = f13.c;
                        String string = pv2.A0(str, (int) (j >> 32), (int) (j & 4294967295L), sdVar).toString();
                        int length = sdVar.i.length() + ((int) (w10Var.y.b >> 32));
                        w10Var.z.v.j(new k03(string, fg1.i(length, length), 4));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ v10(w10 w10Var, int i) {
        this.h = i;
        this.i = w10Var;
    }
}
