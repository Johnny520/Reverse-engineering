package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5923;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.AbstractC5895;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(InterfaceC5923 interfaceC5923, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((InterfaceC5219) interfaceC5923).mo9438(), str, str2, !(interfaceC5923 instanceof InterfaceC5925) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference0
    public Object get() {
        return ((AbstractC5895) getGetter()).call(new Object[0]);
    }

    public PropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
