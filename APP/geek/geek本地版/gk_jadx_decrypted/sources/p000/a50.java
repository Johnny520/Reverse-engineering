package p000;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class a50 extends z40 {
    /* JADX INFO: renamed from: A */
    public static Double m17A(String str) {
        AbstractC0346ip.m1503o("<this>", str);
        try {
            i00 i00Var = x10.f5083a;
            i00Var.getClass();
            if (((Pattern) i00Var.f2326b).matcher(str).matches()) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
