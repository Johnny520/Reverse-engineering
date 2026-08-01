package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5105;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.InterfaceC5108;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference extends PropertyReference implements InterfaceC5106 {
    public MutablePropertyReference() {
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5087
    public abstract /* synthetic */ InterfaceC5105 getGetter();

    @Override // kotlin.reflect.InterfaceC5106
    public abstract /* synthetic */ InterfaceC5108 getSetter();

    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
