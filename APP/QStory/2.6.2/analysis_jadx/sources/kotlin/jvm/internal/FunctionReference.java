package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5109;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class FunctionReference extends CallableReference implements InterfaceC4382, InterfaceC5109 {
    private final int arity;

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5093 computeReflected() {
        return AbstractC4395.f12971.mo8928(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && AbstractC4394.m8917(getBoundReceiver(), functionReference.getBoundReceiver()) && AbstractC4394.m8917(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof InterfaceC5109) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC4382
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5109 getReflected() {
        return (InterfaceC5109) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.InterfaceC5109
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.InterfaceC5109
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.InterfaceC5109
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.InterfaceC5109
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.InterfaceC5093
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC5093 interfaceC5093Compute = compute();
        if (interfaceC5093Compute != this) {
            return interfaceC5093Compute.toString();
        }
        if (MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, null, null, null, 0);
    }
}
