package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fr0 extends q43 {
    public final /* synthetic */ int a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ir0.<init>(ah0, int, java.util.Map, boolean, rm0, java.util.List, int, int, java.util.List):void] */
    public /* synthetic */ fr0(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        switch (this.a) {
            case 0:
                if (l41Var.I() != 9) {
                    return Double.valueOf(l41Var.u());
                }
                l41Var.E();
                return null;
            case 1:
                if (l41Var.I() != 9) {
                    return Float.valueOf((float) l41Var.u());
                }
                l41Var.E();
                return null;
            default:
                l41Var.P();
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    ir0.a(dDoubleValue);
                    o41Var.v(dDoubleValue);
                } else {
                    o41Var.p();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    ir0.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    o41Var.B(numberValueOf);
                } else {
                    o41Var.p();
                }
                break;
            default:
                o41Var.p();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
