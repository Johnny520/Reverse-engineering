package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.InterfaceC5931;
import kotlin.reflect.InterfaceC5932;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference2 extends PropertyReference implements InterfaceC5932 {
    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5926 computeReflected() {
        return AbstractC5228.f13320.mo9486(this);
    }

    public abstract /* synthetic */ Object get(Object obj, Object obj2);

    @Override // kotlin.reflect.InterfaceC5932
    public Object getDelegate(Object obj, Object obj2) {
        return ((InterfaceC5932) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5920
    public InterfaceC5931 getGetter() {
        return ((InterfaceC5932) getReflected()).getGetter();
    }

    @Override // p068.InterfaceC7383
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public PropertyReference2() {
    }
}
