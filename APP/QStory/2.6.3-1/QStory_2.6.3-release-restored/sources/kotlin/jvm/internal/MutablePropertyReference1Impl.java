package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5923;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.AbstractC5895;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(InterfaceC5923 interfaceC5923, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((InterfaceC5219) interfaceC5923).mo9438(), str, str2, !(interfaceC5923 instanceof InterfaceC5925) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5934
    public Object get(Object obj) {
        return ((AbstractC5895) getGetter()).call(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5944
    public void set(Object obj, Object obj2) {
        ((AbstractC5895) getSetter()).call(obj, obj2);
    }

    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public MutablePropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
