package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6398 extends Error {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C6398() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6398(@InterfaceC6399 String str) {
        super(str);
        C5499.m17103(str, "message");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("An operation is not implemented.") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:3) call: Yue.ۥۡۢۥ۟.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ C6398(String str, int i, C4335 c4335) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}
