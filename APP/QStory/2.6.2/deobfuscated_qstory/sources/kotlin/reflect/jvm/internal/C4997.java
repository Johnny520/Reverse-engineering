package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5106;
import kotlin.reflect.InterfaceC5108;
import kotlin.reflect.jvm.internal.impl.km.C4535;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4997 extends C4983 implements InterfaceC5106 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC5183 f14414;

    public C4997(AbstractC5002 abstractC5002, String str, Object obj, C4535 c4535) {
        super(abstractC5002, str, obj, c4535);
        this.f14414 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C5011(this, 11));
    }

    @Override // kotlin.reflect.InterfaceC5106
    public final InterfaceC5108 getSetter() {
        return (C4998) this.f14414.getValue();
    }
}
