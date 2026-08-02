package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fr0 extends q43 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3118a;

    public /* synthetic */ fr0(int i) {
        this.f3118a = i;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        switch (this.f3118a) {
            case 0:
                if (l41Var.m2814I() != 9) {
                    return Double.valueOf(l41Var.m2836u());
                }
                l41Var.m2810E();
                return null;
            case 1:
                if (l41Var.m2814I() != 9) {
                    return Float.valueOf((float) l41Var.m2836u());
                }
                l41Var.m2810E();
                return null;
            default:
                l41Var.m2821P();
                return null;
        }
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        switch (this.f3118a) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    ir0.m2384a(dDoubleValue);
                    o41Var.m3503v(dDoubleValue);
                } else {
                    o41Var.m3498p();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    ir0.m2384a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    o41Var.m3486B(numberValueOf);
                } else {
                    o41Var.m3498p();
                }
                break;
            default:
                o41Var.m3498p();
                break;
        }
    }

    public String toString() {
        switch (this.f3118a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
