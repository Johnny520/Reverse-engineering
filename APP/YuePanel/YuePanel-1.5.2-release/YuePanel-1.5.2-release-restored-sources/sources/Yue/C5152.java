package Yue;

import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: renamed from: Yue.ۥۣۣ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5152 extends AbstractC3648 implements InterfaceC5149, InterfaceC5590 {
    private final int arity;

    @InterfaceC7470(version = "1.4")
    private final int flags;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5152(int i) {
        this(i, AbstractC3648.NO_RECEIVER, null, null, null, 0);
    }

    @Override // Yue.AbstractC3648
    @InterfaceC7470(version = "1.1")
    public InterfaceC5584 computeReflected() {
        return C7071.m21995(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5152) {
            C5152 c5152 = (C5152) obj;
            return getName().equals(c5152.getName()) && getSignature().equals(c5152.getSignature()) && this.flags == c5152.flags && this.arity == c5152.arity && C5499.m17094(getBoundReceiver(), c5152.getBoundReceiver()) && C5499.m17094(getOwner(), c5152.getOwner());
        }
        if (obj instanceof InterfaceC5590) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // Yue.InterfaceC5149
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // Yue.InterfaceC5590
    @InterfaceC7470(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // Yue.InterfaceC5590
    @InterfaceC7470(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // Yue.InterfaceC5590
    @InterfaceC7470(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // Yue.InterfaceC5590
    @InterfaceC7470(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // Yue.AbstractC3648, Yue.InterfaceC5584
    @InterfaceC7470(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC5584 interfaceC5584Compute = compute();
        if (interfaceC5584Compute != this) {
            return interfaceC5584Compute.toString();
        }
        if (MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + C7071.f2662;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC7470(version = "1.1")
    public C5152(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getReflected()LYue/ۥ۠ۦۢۡ; */
    @Override // Yue.AbstractC3648
    @InterfaceC7470(version = "1.1")
    public InterfaceC5590 getReflected() {
        return (InterfaceC5590) super.getReflected();
    }

    @InterfaceC7470(version = "1.4")
    public C5152(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
