package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.InterfaceC5938;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference extends CallableReference implements InterfaceC5920 {
    private final boolean syntheticJavaProperty;

    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5926 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && AbstractC5227.m9466(getBoundReceiver(), propertyReference.getBoundReceiver());
        }
        if (obj instanceof InterfaceC5920) {
            return obj.equals(compute());
        }
        return false;
    }

    public abstract /* synthetic */ InterfaceC5938 getGetter();

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5920 getReflected() {
        if (!this.syntheticJavaProperty) {
            return (InterfaceC5920) super.getReflected();
        }
        C6755.m11867("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.InterfaceC5920
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.InterfaceC5920
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC5926 interfaceC5926Compute = compute();
        if (interfaceC5926Compute != this) {
            return interfaceC5926Compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public PropertyReference(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }
}
