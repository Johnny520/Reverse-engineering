package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.AbstractC5063;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(InterfaceC5091 interfaceC5091, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((InterfaceC4387) interfaceC5091).mo8879(), str, str2, !(interfaceC5091 instanceof InterfaceC5093) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5102
    public Object get(Object obj) {
        return ((AbstractC5063) getGetter()).call(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5112
    public void set(Object obj, Object obj2) {
        ((AbstractC5063) getSetter()).call(obj, obj2);
    }

    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public MutablePropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
