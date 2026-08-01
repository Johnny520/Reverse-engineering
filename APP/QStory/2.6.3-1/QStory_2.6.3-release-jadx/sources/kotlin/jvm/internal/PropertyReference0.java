package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.InterfaceC5929;
import kotlin.reflect.InterfaceC5930;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference0 extends PropertyReference implements InterfaceC5929 {
    public PropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5926 computeReflected() {
        return AbstractC5228.f13320.mo9481(this);
    }

    public abstract /* synthetic */ Object get();

    @Override // kotlin.reflect.InterfaceC5929
    public Object getDelegate() {
        return ((InterfaceC5929) getReflected()).getDelegate();
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5920
    public InterfaceC5930 getGetter() {
        return ((InterfaceC5929) getReflected()).getGetter();
    }

    @Override // p068.InterfaceC7372
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
