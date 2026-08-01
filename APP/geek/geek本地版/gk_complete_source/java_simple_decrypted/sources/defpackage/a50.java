package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class a50 extends z40 {
    public static Double A(String r2) {
        ip.o("<this>", r2);
        i00 r0 = x10.a;     // Catch: NumberFormatException -> L9
        r0.getClass();     // Catch: NumberFormatException -> L9
        if (((Pattern) r0.b).matcher(r2).matches() == false) goto L7;
        return Double.valueOf(Double.parseDouble(r2));
    L7:
        return null;
    L12:
        return null;
    }
}
