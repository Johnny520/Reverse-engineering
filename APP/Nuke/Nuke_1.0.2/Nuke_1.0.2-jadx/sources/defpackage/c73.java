package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c73 {
    public static final x63 Companion = new x63();
    public final int a;
    public final int b;
    public final boolean c;
    public final b73 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ c73(int i, int i2, int i3, boolean z, b73 b73Var) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = new b73();
        } else {
            this.d = b73Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c73 a(c73 c73Var, int i, int i2, boolean z, b73 b73Var, int i3) {
        if ((i3 & 1) != 0) {
            i = c73Var.a;
        }
        if ((i3 & 2) != 0) {
            i2 = c73Var.b;
        }
        if ((i3 & 4) != 0) {
            z = c73Var.c;
        }
        if ((i3 & 8) != 0) {
            b73Var = c73Var.d;
        }
        c73Var.getClass();
        b73Var.getClass();
        return new c73(i, i2, z, b73Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c73)) {
            return false;
        }
        c73 c73Var = (c73) obj;
        return this.a == c73Var.a && this.b == c73Var.b && this.c == c73Var.c && t11.l(this.d, c73Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.d.hashCode() + hk1.d(vi0.d(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbK = hk1.k("UIConfig(appearanceMode=", this.a, this.b, ", languageMode=", ", clickHapticEnabled=");
        sbK.append(this.c);
        sbK.append(", theme=");
        sbK.append(this.d);
        sbK.append(")");
        return sbK.toString();
    }

    public c73(int i, int i2, boolean z, b73 b73Var) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = b73Var;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (0 int)
  (0 int)
  false
  (wrap:b73:0x0002: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:52) call: b73.<init>():void type: CONSTRUCTOR)
 A[MD:(int, int, boolean, b73):void (m)] (LINE:53) call: c73.<init>(int, int, boolean, b73):void type: THIS */
    public /* synthetic */ c73() {
        this(0, 0, false, new b73());
    }
}
