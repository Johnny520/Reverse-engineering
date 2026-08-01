package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.InterfaceC5933;
import kotlin.reflect.InterfaceC5934;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference1 extends PropertyReference implements InterfaceC5934 {
    public PropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5926 computeReflected() {
        return AbstractC5228.f13320.mo9485(this);
    }

    @Override // kotlin.reflect.InterfaceC5934
    public abstract /* synthetic */ Object get(Object obj);

    @Override // kotlin.reflect.InterfaceC5934
    public Object getDelegate(Object obj) {
        return ((InterfaceC5934) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5920
    public InterfaceC5933 getGetter() {
        return ((InterfaceC5934) getReflected()).getGetter();
    }

    @Override // p068.InterfaceC7387
    public Object invoke(Object obj) {
        return get(obj);
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
