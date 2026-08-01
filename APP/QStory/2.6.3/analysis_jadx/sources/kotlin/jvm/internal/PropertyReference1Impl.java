package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.AbstractC5063;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(InterfaceC5091 interfaceC5091, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((InterfaceC4387) interfaceC5091).mo8879(), str, str2, !(interfaceC5091 instanceof InterfaceC5093) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1, kotlin.reflect.InterfaceC5102
    public Object get(Object obj) {
        return ((AbstractC5063) getGetter()).call(obj);
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
