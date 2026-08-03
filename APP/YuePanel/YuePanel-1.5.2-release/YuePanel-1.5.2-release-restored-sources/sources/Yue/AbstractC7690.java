package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
public abstract class AbstractC7690 extends AbstractC4201 implements InterfaceC5149<Object>, InterfaceC7688 {
    private final int arity;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC7690(int i, @InterfaceC6489 InterfaceC4199<Object> interfaceC4199) {
        super(interfaceC4199);
        this.arity = i;
    }

    @Override // Yue.InterfaceC5149
    public int getArity() {
        return this.arity;
    }

    @Override // Yue.AbstractC3513
    @InterfaceC6399
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strM22015 = C7071.m22015(this);
        C5499.m17102(strM22015, "renderLambdaToString(this)");
        return strM22015;
    }

    public AbstractC7690(int i) {
        this(i, null);
    }
}
