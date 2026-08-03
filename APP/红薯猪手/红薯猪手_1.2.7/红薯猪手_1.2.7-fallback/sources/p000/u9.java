package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u9 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final p000.t8 f1082 = null;

    static {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[\\x00-\\x20]*[+-]?(NaN|Infinity|(("
            r0.append(r1)
            java.lang.String r1 = "((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+))"
            r0.append(r1)
            java.lang.String r1 = ")[fFdD]?))[\\x00-\\x20]*"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            ۟.t8 r1 = new ۟.t8
            r1.<init>(r0)
            p000.u9.f1082 = r1
            return
    }
}
