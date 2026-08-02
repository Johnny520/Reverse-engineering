package nuke.module.wechat.ai;

import defpackage.a1;
import defpackage.c50;
import defpackage.hk1;
import defpackage.t11;
import defpackage.z41;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
@z41
public final class AIChatError {
    public static final int $stable = 0;
    private final a1 code;
    private final Integer httpCode;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AIChatError(a1 a1Var, String str, Integer num) {
        a1Var.getClass();
        str.getClass();
        this.code = a1Var;
        this.message = str;
        this.httpCode = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ AIChatError copy$default(AIChatError aIChatError, a1 a1Var, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            a1Var = aIChatError.code;
        }
        if ((i & 2) != 0) {
            str = aIChatError.message;
        }
        if ((i & 4) != 0) {
            num = aIChatError.httpCode;
        }
        return aIChatError.copy(a1Var, str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final a1 component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String component2() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer component3() {
        return this.httpCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AIChatError copy(a1 a1Var, String str, Integer num) {
        a1Var.getClass();
        str.getClass();
        return new AIChatError(a1Var, str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatError)) {
            return false;
        }
        AIChatError aIChatError = (AIChatError) obj;
        return this.code == aIChatError.code && t11.l(this.message, aIChatError.message) && t11.l(this.httpCode, aIChatError.httpCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final a1 getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer getHttpCode() {
        return this.httpCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iF = hk1.f(this.message, this.code.hashCode() * 31, 31);
        Integer num = this.httpCode;
        return iF + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "AIChatError(code=" + this.code + ", message=" + this.message + ", httpCode=" + this.httpCode + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 a1)
  (r2v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(a1, java.lang.String, java.lang.Integer):void (m)] (LINE:17) call: nuke.module.wechat.ai.AIChatError.<init>(a1, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ AIChatError(a1 a1Var, String str, Integer num, int i, c50 c50Var) {
        this(a1Var, str, (i & 4) != 0 ? null : num);
    }
}
