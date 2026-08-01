package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5094;
import kotlin.reflect.InterfaceC5099;
import kotlin.reflect.InterfaceC5100;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference2 extends PropertyReference implements InterfaceC5100 {
    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5094 computeReflected() {
        return AbstractC4396.f12975.mo8927(this);
    }

    public abstract /* synthetic */ Object get(Object obj, Object obj2);

    @Override // kotlin.reflect.InterfaceC5100
    public Object getDelegate(Object obj, Object obj2) {
        return ((InterfaceC5100) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5088
    public InterfaceC5099 getGetter() {
        return ((InterfaceC5100) getReflected()).getGetter();
    }

    @Override // p052.InterfaceC6554
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public PropertyReference2() {
    }
}
