package p000;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class h50 extends g50 {
    /* JADX INFO: renamed from: y */
    public static Double m1357y(String str) {
        AbstractC0493mp.m1857g("<this>", str);
        try {
            p00 p00Var = e20.f1488a;
            p00Var.getClass();
            if (((Pattern) p00Var.f3560b).matcher(str).matches()) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
