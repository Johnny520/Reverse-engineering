package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5938;
import kotlin.reflect.InterfaceC5939;
import kotlin.reflect.InterfaceC5941;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference extends PropertyReference implements InterfaceC5939 {
    public MutablePropertyReference() {
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5920
    public abstract /* synthetic */ InterfaceC5938 getGetter();

    @Override // kotlin.reflect.InterfaceC5939
    public abstract /* synthetic */ InterfaceC5941 getSetter();

    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
