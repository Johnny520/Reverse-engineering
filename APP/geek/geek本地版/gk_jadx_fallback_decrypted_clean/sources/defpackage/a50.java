package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class a50 extends defpackage.z40 {
    public static java.lang.Double A(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            defpackage.ip.o(r0, r2)
            i00 r0 = defpackage.x10.a     // Catch: java.lang.NumberFormatException -> L21
            r0.getClass()     // Catch: java.lang.NumberFormatException -> L21
            java.lang.Object r0 = r0.b     // Catch: java.lang.NumberFormatException -> L21
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0     // Catch: java.lang.NumberFormatException -> L21
            java.util.regex.Matcher r0 = r0.matcher(r2)     // Catch: java.lang.NumberFormatException -> L21
            boolean r0 = r0.matches()     // Catch: java.lang.NumberFormatException -> L21
            if (r0 == 0) goto L21
            double r0 = java.lang.Double.parseDouble(r2)     // Catch: java.lang.NumberFormatException -> L21
            java.lang.Double r2 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L21
            return r2
        L21:
            r2 = 0
            return r2
    }
}
