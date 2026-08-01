package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.InterfaceC5110;
import kotlin.reflect.InterfaceC5111;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5021 extends C4949 implements InterfaceC5111 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final InterfaceC5183 f14481;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5021(AbstractC5002 abstractC5002, InterfaceC4472 interfaceC4472, C5050 c5050) {
        super(abstractC5002, interfaceC4472, c5050);
        abstractC5002.getClass();
        interfaceC4472.getClass();
        c5050.getClass();
        this.f14481 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C5011(this, 4));
    }

    @Override // kotlin.reflect.InterfaceC5106
    public final InterfaceC5108 getSetter() {
        return (C5017) this.f14481.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5111
    public final void set(Object obj, Object obj2) {
        ((C5017) this.f14481.getValue()).call(obj, obj2);
    }

    @Override // kotlin.reflect.jvm.internal.C4949
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C4949 mo9950(C5050 c5050) {
        return new C5021(this.f14306, mo9945(), c5050);
    }

    @Override // kotlin.reflect.jvm.internal.C4949, kotlin.reflect.jvm.internal.AbstractC5023
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC5023 mo9950(C5050 c5050) {
        return new C5021(this.f14306, mo9945(), c5050);
    }

    @Override // kotlin.reflect.InterfaceC5111, kotlin.reflect.InterfaceC5106
    public final InterfaceC5110 getSetter() {
        return (C5017) this.f14481.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5021(AbstractC5002 abstractC5002, String str, String str2, Object obj) {
        super(abstractC5002, str, str2, obj);
        str.getClass();
        str2.getClass();
        this.f14481 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C5011(this, 4));
    }
}
