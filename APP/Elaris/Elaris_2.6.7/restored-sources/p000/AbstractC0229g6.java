package p000;

/* JADX INFO: renamed from: g6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0229g6 extends AbstractC0192e1 implements InterfaceC0215f8 {
    private final int arity;
    private final int flags;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0229g6(int i, Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, false);
        this.arity = i;
        this.flags = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0192e1
    public InterfaceC0183d8 computeReflected() {
        AbstractC0472tb.f927a.getClass();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0229g6) {
            AbstractC0229g6 abstractC0229g6 = (AbstractC0229g6) obj;
            return getName().equals(abstractC0229g6.getName()) && getSignature().equals(abstractC0229g6.getSignature()) && this.flags == abstractC0229g6.flags && this.arity == abstractC0229g6.arity && AbstractC0260i5.m643p(getBoundReceiver(), abstractC0229g6.getBoundReceiver()) && AbstractC0260i5.m643p(getOwner(), abstractC0229g6.getOwner());
        }
        if (obj instanceof InterfaceC0215f8) {
            return obj.equals(compute());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getArity() {
        return this.arity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: getReflected()Ld8; */
    @Override // p000.AbstractC0192e1
    public InterfaceC0215f8 getReflected() {
        InterfaceC0183d8 interfaceC0183d8Compute = compute();
        if (interfaceC0183d8Compute != this) {
            return (InterfaceC0215f8) interfaceC0183d8Compute;
        }
        throw new C0042c9("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0215f8
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0215f8
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0215f8
    public boolean isInline() {
        return getReflected().isInline();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0215f8
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0215f8
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        InterfaceC0183d8 interfaceC0183d8Compute = compute();
        if (interfaceC0183d8Compute != this) {
            return interfaceC0183d8Compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
