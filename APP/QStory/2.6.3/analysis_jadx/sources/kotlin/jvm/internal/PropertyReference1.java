package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5094;
import kotlin.reflect.InterfaceC5101;
import kotlin.reflect.InterfaceC5102;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference1 extends PropertyReference implements InterfaceC5102 {
    public PropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5094 computeReflected() {
        return AbstractC4396.f12975.mo8926(this);
    }

    @Override // kotlin.reflect.InterfaceC5102
    public abstract /* synthetic */ Object get(Object obj);

    @Override // kotlin.reflect.InterfaceC5102
    public Object getDelegate(Object obj) {
        return ((InterfaceC5102) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5088
    public InterfaceC5101 getGetter() {
        return ((InterfaceC5102) getReflected()).getGetter();
    }

    @Override // p052.InterfaceC6558
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
