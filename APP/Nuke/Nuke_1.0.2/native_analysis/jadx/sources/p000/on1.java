package p000;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class on1 {

    /* JADX INFO: renamed from: a */
    public final String f7733a;

    /* JADX INFO: renamed from: b */
    public final nn1 f7734b;

    /* JADX INFO: renamed from: c */
    public final String f7735c;

    /* JADX INFO: renamed from: d */
    public final int f7736d;

    public on1(String str, nn1 nn1Var, String str2, int i) {
        this.f7733a = str;
        this.f7734b = nn1Var;
        this.f7735c = str2;
        this.f7736d = i;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3574a(yw0 yw0Var) {
        yw0Var.getClass();
        if (t11.m5086l(yw0Var.f13641a, this.f7733a) && yw0Var.f13645e == this.f7736d) {
            String lowerCase = yw0Var.f13644d.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            int iOrdinal = this.f7734b.ordinal();
            if (iOrdinal != 0) {
                String str = this.f7735c;
                if (iOrdinal == 1) {
                    return lowerCase.equals(str);
                }
                if (iOrdinal != 2) {
                    c80.m675s();
                    return false;
                }
                if (lowerCase.equals(str) || !wv2.m6005W(lowerCase, ".".concat(str), false)) {
                }
            }
            return true;
        }
        return false;
    }
}
