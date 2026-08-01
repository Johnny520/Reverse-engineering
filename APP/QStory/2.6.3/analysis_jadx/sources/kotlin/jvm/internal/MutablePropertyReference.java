package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.InterfaceC5107;
import kotlin.reflect.InterfaceC5109;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MutablePropertyReference extends PropertyReference implements InterfaceC5107 {
    public MutablePropertyReference() {
    }

    @Override // kotlin.jvm.internal.PropertyReference, kotlin.reflect.InterfaceC5088
    public abstract /* synthetic */ InterfaceC5106 getGetter();

    @Override // kotlin.reflect.InterfaceC5107
    public abstract /* synthetic */ InterfaceC5109 getSetter();

    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
