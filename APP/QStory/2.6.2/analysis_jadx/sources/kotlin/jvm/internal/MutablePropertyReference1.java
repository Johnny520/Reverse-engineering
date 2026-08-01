package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5100;
import kotlin.reflect.InterfaceC5110;
import kotlin.reflect.InterfaceC5111;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements InterfaceC5111 {
    public MutablePropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5093 computeReflected() {
        return AbstractC4395.f12971.mo8923(this);
    }

    public abstract /* synthetic */ Object get(Object obj);

    @Override // kotlin.reflect.InterfaceC5101
    public Object getDelegate(Object obj) {
        return ((InterfaceC5111) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5087
    public InterfaceC5100 getGetter() {
        return ((InterfaceC5111) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.reflect.InterfaceC5106
    public InterfaceC5110 getSetter() {
        return ((InterfaceC5111) getReflected()).getSetter();
    }

    @Override // p052.InterfaceC6557
    public Object invoke(Object obj) {
        return get(obj);
    }

    public abstract /* synthetic */ void set(Object obj, Object obj2);

    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
