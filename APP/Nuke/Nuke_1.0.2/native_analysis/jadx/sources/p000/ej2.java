package p000;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ej2 extends IllegalStateException {

    /* JADX INFO: renamed from: h */
    public final fj2 f2460h;

    public ej2(String str, xj2 xj2Var, fj2 fj2Var, String str2, Throwable th) {
        str.getClass();
        xj2Var.getClass();
        String lowerCase = xj2Var.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        StringBuilder sb = new StringBuilder("[");
        sb.append(lowerCase);
        sb.append("] ");
        sb.append(str);
        super(hk1.m2211j(sb, ": ", str2), th);
        this.f2460h = fj2Var;
    }
}
