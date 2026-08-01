package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5094;
import kotlin.reflect.InterfaceC5098;
import kotlin.reflect.InterfaceC5113;
import kotlin.reflect.InterfaceC5114;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements InterfaceC5114 {
    public MutablePropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5094 computeReflected() {
        return AbstractC4396.f12975.mo8914(this);
    }

    public abstract /* synthetic */ Object get();

    @Override // kotlin.reflect.InterfaceC5097
    public Object getDelegate() {
        return ((InterfaceC5114) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5088
    public InterfaceC5098 getGetter() {
        return ((InterfaceC5114) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.reflect.InterfaceC5107
    public InterfaceC5113 getSetter() {
        return ((InterfaceC5114) getReflected()).getSetter();
    }

    @Override // p052.InterfaceC6543
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
