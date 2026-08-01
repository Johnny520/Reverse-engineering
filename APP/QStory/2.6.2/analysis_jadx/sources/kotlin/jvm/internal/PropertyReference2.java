package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5098;
import kotlin.reflect.InterfaceC5099;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference2 extends PropertyReference implements InterfaceC5099 {
    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5093 computeReflected() {
        return AbstractC4395.f12971.mo8937(this);
    }

    public abstract /* synthetic */ Object get(Object obj, Object obj2);

    @Override // kotlin.reflect.InterfaceC5099
    public Object getDelegate(Object obj, Object obj2) {
        return ((InterfaceC5099) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5087
    public InterfaceC5098 getGetter() {
        return ((InterfaceC5099) getReflected()).getGetter();
    }

    @Override // p052.InterfaceC6553
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public PropertyReference2() {
    }
}
