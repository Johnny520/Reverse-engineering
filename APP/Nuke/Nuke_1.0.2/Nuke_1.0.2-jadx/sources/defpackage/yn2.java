package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yn2 {
    public final String a;
    public final mn0 b;
    public final boolean c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yn2(String str, mn0 mn0Var) {
        this.a = str;
        this.b = mn0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r2v0 java.lang.String), (wrap:un2:0x0000: SGET  A[WRAPPED] (LINE:9) un2.p un2) A[MD:(java.lang.String, mn0):void (m)] (LINE:10) call: yn2.<init>(java.lang.String, mn0):void type: THIS */
    public /* synthetic */ yn2(String str) {
        this(str, un2.p);
    }

    public yn2(String str, int i) {
        this(str);
        this.c = true;
    }

    public yn2(String str, boolean z, mn0 mn0Var) {
        this(str, mn0Var);
        this.c = z;
    }
}
