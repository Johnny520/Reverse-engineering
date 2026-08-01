package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5094;
import kotlin.reflect.InterfaceC5101;
import kotlin.reflect.InterfaceC5111;
import kotlin.reflect.InterfaceC5112;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements InterfaceC5112 {
    public MutablePropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5094 computeReflected() {
        return AbstractC4396.f12975.mo8913(this);
    }

    public abstract /* synthetic */ Object get(Object obj);

    @Override // kotlin.reflect.InterfaceC5102
    public Object getDelegate(Object obj) {
        return ((InterfaceC5112) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5088
    public InterfaceC5101 getGetter() {
        return ((InterfaceC5112) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference, kotlin.reflect.InterfaceC5107
    public InterfaceC5111 getSetter() {
        return ((InterfaceC5112) getReflected()).getSetter();
    }

    @Override // p052.InterfaceC6558
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
