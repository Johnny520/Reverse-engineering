package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.InterfaceC5931;
import kotlin.reflect.InterfaceC5935;
import kotlin.reflect.InterfaceC5936;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements InterfaceC5935 {
    public MutablePropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5926 computeReflected() {
        return AbstractC5228.f13320.mo9482(this);
    }

    public abstract /* synthetic */ Object get(Object obj, Object obj2);

    @Override // kotlin.reflect.InterfaceC5932
    public Object getDelegate(Object obj, Object obj2) {
        return ((InterfaceC5935) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5920
    public InterfaceC5931 getGetter() {
        return ((InterfaceC5935) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.reflect.InterfaceC5939
    public InterfaceC5936 getSetter() {
        return ((InterfaceC5935) getReflected()).getSetter();
    }

    @Override // p068.InterfaceC7383
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public abstract /* synthetic */ void set(Object obj, Object obj2, Object obj3);

    public MutablePropertyReference2() {
    }
}
