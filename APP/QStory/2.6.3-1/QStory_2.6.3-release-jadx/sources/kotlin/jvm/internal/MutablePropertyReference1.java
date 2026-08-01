package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.InterfaceC5933;
import kotlin.reflect.InterfaceC5943;
import kotlin.reflect.InterfaceC5944;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements InterfaceC5944 {
    public MutablePropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5926 computeReflected() {
        return AbstractC5228.f13320.mo9472(this);
    }

    public abstract /* synthetic */ Object get(Object obj);

    @Override // kotlin.reflect.InterfaceC5934
    public Object getDelegate(Object obj) {
        return ((InterfaceC5944) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5920
    public InterfaceC5933 getGetter() {
        return ((InterfaceC5944) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.reflect.InterfaceC5939
    public InterfaceC5943 getSetter() {
        return ((InterfaceC5944) getReflected()).getSetter();
    }

    @Override // p068.InterfaceC7387
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
