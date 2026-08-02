package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qt2 implements fj0 {
    public final float a;
    public final float b;
    public final Object c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qt2(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hd
    public final x93 a(n43 n43Var) {
        Object obj = this.c;
        return new hh1(this.a, this.b, obj == null ? null : (nd) n43Var.a.j(obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof qt2) {
            qt2 qt2Var = (qt2) obj;
            if (qt2Var.a == this.a && qt2Var.b == this.b && t11.l(qt2Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + vi0.c(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR (1.0f float), (1500.0f float), (r3v0 java.lang.Object) A[MD:(float, float, java.lang.Object):void (m)] (LINE:11) call: qt2.<init>(float, float, java.lang.Object):void type: THIS */
    public /* synthetic */ qt2(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
