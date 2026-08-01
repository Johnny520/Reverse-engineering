package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5105;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference extends CallableReference implements InterfaceC5087 {
    private final boolean syntheticJavaProperty;

    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5093 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && AbstractC4394.m8917(getBoundReceiver(), propertyReference.getBoundReceiver());
        }
        if (obj instanceof InterfaceC5087) {
            return obj.equals(compute());
        }
        return false;
    }

    public abstract /* synthetic */ InterfaceC5105 getGetter();

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5087 getReflected() {
        if (!this.syntheticJavaProperty) {
            return (InterfaceC5087) super.getReflected();
        }
        C5919.m11247("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.InterfaceC5087
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.InterfaceC5087
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        InterfaceC5093 interfaceC5093Compute = compute();
        if (interfaceC5093Compute != this) {
            return interfaceC5093Compute.toString();
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
