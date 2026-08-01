package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.InterfaceC5942;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class FunctionReference extends CallableReference implements InterfaceC5215, InterfaceC5942 {
    private final int arity;

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5926 computeReflected() {
        return AbstractC5228.f13320.mo9477(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && AbstractC5227.m9466(getBoundReceiver(), functionReference.getBoundReceiver()) && AbstractC5227.m9466(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof InterfaceC5942) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC5215
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5942 getReflected() {
        return (InterfaceC5942) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.InterfaceC5942
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.InterfaceC5942
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.InterfaceC5942
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.InterfaceC5942
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.InterfaceC5926
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC5926 interfaceC5926Compute = compute();
        if (interfaceC5926Compute != this) {
            return interfaceC5926Compute.toString();
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
