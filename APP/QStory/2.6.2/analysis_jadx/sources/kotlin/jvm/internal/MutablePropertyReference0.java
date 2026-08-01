package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5097;
import kotlin.reflect.InterfaceC5112;
import kotlin.reflect.InterfaceC5113;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements InterfaceC5113 {
    public MutablePropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5093 computeReflected() {
        return AbstractC4395.f12971.mo8924(this);
    }

    public abstract /* synthetic */ Object get();

    @Override // kotlin.reflect.InterfaceC5096
    public Object getDelegate() {
        return ((InterfaceC5113) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5087
    public InterfaceC5097 getGetter() {
        return ((InterfaceC5113) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.reflect.InterfaceC5106
    public InterfaceC5112 getSetter() {
        return ((InterfaceC5113) getReflected()).getSetter();
    }

    @Override // p052.InterfaceC6542
    public Object invoke() {
        return get();
    }

    public abstract /* synthetic */ void set(Object obj);

    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
