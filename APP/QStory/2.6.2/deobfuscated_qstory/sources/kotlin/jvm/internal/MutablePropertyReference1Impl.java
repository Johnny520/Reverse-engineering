package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5090;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.AbstractC5062;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(InterfaceC5090 interfaceC5090, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((InterfaceC4386) interfaceC5090).mo8889(), str, str2, !(interfaceC5090 instanceof InterfaceC5092) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5101
    public Object get(Object obj) {
        return ((AbstractC5062) getGetter()).call(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1, kotlin.reflect.InterfaceC5111
    public void set(Object obj, Object obj2) {
        ((AbstractC5062) getSetter()).call(obj, obj2);
    }

    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public MutablePropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
