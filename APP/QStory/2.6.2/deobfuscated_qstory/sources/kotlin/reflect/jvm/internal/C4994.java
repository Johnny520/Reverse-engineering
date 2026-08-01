package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.InterfaceC5110;
import kotlin.reflect.InterfaceC5111;
import kotlin.reflect.jvm.internal.impl.km.C4535;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4994 extends C4982 implements InterfaceC5111 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC5183 f14411;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4994(AbstractC5002 abstractC5002, String str, Object obj, C4535 c4535) {
        super(abstractC5002, str, obj, c4535);
        str.getClass();
        c4535.getClass();
        this.f14411 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C5011(this, 10));
    }

    @Override // kotlin.reflect.InterfaceC5106
    public final InterfaceC5108 getSetter() {
        return (C4993) this.f14411.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5111
    public final void set(Object obj, Object obj2) {
        ((C4993) this.f14411.getValue()).call(obj, obj2);
    }

    @Override // kotlin.reflect.InterfaceC5111, kotlin.reflect.InterfaceC5106
    public final InterfaceC5110 getSetter() {
        return (C4993) this.f14411.getValue();
    }
}
