package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5094;
import kotlin.reflect.InterfaceC5110;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FunctionReference extends CallableReference implements InterfaceC4383, InterfaceC5110 {
    private final int arity;

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5094 computeReflected() {
        return AbstractC4396.f12975.mo8918(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && AbstractC4395.m8907(getBoundReceiver(), functionReference.getBoundReceiver()) && AbstractC4395.m8907(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof InterfaceC5110) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC4383
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5110 getReflected() {
        return (InterfaceC5110) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.InterfaceC5110
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.InterfaceC5110
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.InterfaceC5110
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.InterfaceC5110
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.InterfaceC5094
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC5094 interfaceC5094Compute = compute();
        if (interfaceC5094Compute != this) {
            return interfaceC5094Compute.toString();
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
