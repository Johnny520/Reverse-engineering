package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5090;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.AbstractC5062;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    public MutablePropertyReference2Impl(InterfaceC5090 interfaceC5090, String str, String str2) {
        super(((InterfaceC4386) interfaceC5090).mo8889(), str, str2, !(interfaceC5090 instanceof InterfaceC5092) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference2
    public Object get(Object obj, Object obj2) {
        return ((AbstractC5062) getGetter()).call(obj, obj2);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference2
    public void set(Object obj, Object obj2, Object obj3) {
        ((AbstractC5062) getSetter()).call(obj, obj2, obj3);
    }

    public MutablePropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }
}
