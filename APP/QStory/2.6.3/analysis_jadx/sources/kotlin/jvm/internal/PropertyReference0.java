package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5094;
import kotlin.reflect.InterfaceC5097;
import kotlin.reflect.InterfaceC5098;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference0 extends PropertyReference implements InterfaceC5097 {
    public PropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5094 computeReflected() {
        return AbstractC4396.f12975.mo8922(this);
    }

    public abstract /* synthetic */ Object get();

    @Override // kotlin.reflect.InterfaceC5097
    public Object getDelegate() {
        return ((InterfaceC5097) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5088
    public InterfaceC5098 getGetter() {
        return ((InterfaceC5097) getReflected()).getGetter();
    }

    @Override // p052.InterfaceC6543
    public Object invoke() {
        return get();
    }

    public PropertyReference0(Object obj) {
        super(obj);
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
