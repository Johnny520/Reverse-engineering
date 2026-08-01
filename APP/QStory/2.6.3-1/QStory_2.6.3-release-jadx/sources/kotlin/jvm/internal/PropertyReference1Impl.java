package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5923;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.AbstractC5895;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(InterfaceC5923 interfaceC5923, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((InterfaceC5219) interfaceC5923).mo9438(), str, str2, !(interfaceC5923 instanceof InterfaceC5925) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1, kotlin.reflect.InterfaceC5934
    public Object get(Object obj) {
        return ((AbstractC5895) getGetter()).call(obj);
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
