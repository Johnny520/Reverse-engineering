package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class dg2 extends Exception {
    public final si2 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dg2(String str, si2 si2Var, String str2, String str3, Throwable th) {
        StringBuilder sb = new StringBuilder("[");
        String lowerCase = si2Var.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        sb.append(lowerCase);
        sb.append("] ");
        if (str != null) {
            sb.append(str);
            sb.append(": ");
        }
        if (str2 != null) {
            sb.append(str2);
            sb.append(": ");
        }
        sb.append(str3);
        super(sb.toString(), th);
        this.h = si2Var;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r3v0 java.lang.String)
  (r4v0 si2)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r8v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (r6v0 java.lang.String)
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0006: ARITH (r8v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r7v0 java.lang.Throwable))
 A[MD:(java.lang.String, si2, java.lang.String, java.lang.String, java.lang.Throwable):void (m)] (LINE:60) call: dg2.<init>(java.lang.String, si2, java.lang.String, java.lang.String, java.lang.Throwable):void type: THIS */
    public /* synthetic */ dg2(String str, si2 si2Var, String str2, String str3, Throwable th, int i) {
        this(str, si2Var, (i & 4) != 0 ? null : str2, str3, (i & 16) != 0 ? null : th);
    }
}
