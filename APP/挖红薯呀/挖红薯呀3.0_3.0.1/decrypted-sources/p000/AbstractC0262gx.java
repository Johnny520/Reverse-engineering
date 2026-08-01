package p000;

/* JADX INFO: renamed from: gx */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0262gx extends AbstractC0647qc implements InterfaceC0225fx, o40 {
    private final int arity;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0262gx(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0647qc
    public m40 computeReflected() {
        au0.f267a.getClass();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0262gx) {
            AbstractC0262gx abstractC0262gx = (AbstractC0262gx) obj;
            return getName().equals(abstractC0262gx.getName()) && getSignature().equals(abstractC0262gx.getSignature()) && p30.m3002l(getBoundReceiver(), abstractC0262gx.getBoundReceiver()) && p30.m3002l(getOwner(), abstractC0262gx.getOwner());
        }
        if (obj instanceof o40) {
            return obj.equals(compute());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0225fx
    public int getArity() {
        return this.arity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: getReflected()Lm40; */
    @Override // p000.AbstractC0647qc
    public o40 getReflected() {
        m40 m40VarCompute = compute();
        if (m40VarCompute != this) {
            return (o40) m40VarCompute;
        }
        throw new C0096cl("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.o40
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.o40
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.o40
    public boolean isInline() {
        return getReflected().isInline();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.o40
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.o40
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        m40 m40VarCompute = compute();
        if (m40VarCompute != this) {
            return m40VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
