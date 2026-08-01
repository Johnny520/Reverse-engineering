package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.AbstractC5063;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    public MutablePropertyReference2Impl(InterfaceC5091 interfaceC5091, String str, String str2) {
        super(((InterfaceC4387) interfaceC5091).mo8879(), str, str2, !(interfaceC5091 instanceof InterfaceC5093) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference2
    public Object get(Object obj, Object obj2) {
        return ((AbstractC5063) getGetter()).call(obj, obj2);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference2
    public void set(Object obj, Object obj2, Object obj3) {
        ((AbstractC5063) getSetter()).call(obj, obj2, obj3);
    }

    public MutablePropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }
}
