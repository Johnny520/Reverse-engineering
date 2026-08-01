package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5090;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.AbstractC5062;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class MutablePropertyReference0Impl extends MutablePropertyReference0 {
    public MutablePropertyReference0Impl(InterfaceC5090 interfaceC5090, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((InterfaceC4386) interfaceC5090).mo8889(), str, str2, !(interfaceC5090 instanceof InterfaceC5092) ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0
    public Object get() {
        return ((AbstractC5062) getGetter()).call(new Object[0]);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0
    public void set(Object obj) {
        ((AbstractC5062) getSetter()).call(obj);
    }

    public MutablePropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public MutablePropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
