package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5100;
import kotlin.reflect.InterfaceC5101;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class PropertyReference1 extends PropertyReference implements InterfaceC5101 {
    public PropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public InterfaceC5093 computeReflected() {
        return AbstractC4395.f12971.mo8936(this);
    }

    @Override // kotlin.reflect.InterfaceC5101
    public abstract /* synthetic */ Object get(Object obj);

    @Override // kotlin.reflect.InterfaceC5101
    public Object getDelegate(Object obj) {
        return ((InterfaceC5101) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5087
    public InterfaceC5100 getGetter() {
        return ((InterfaceC5101) getReflected()).getGetter();
    }

    @Override // p052.InterfaceC6557
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
