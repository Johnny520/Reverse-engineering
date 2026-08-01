package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5105;
import kotlin.reflect.jvm.internal.impl.km.C4535;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4983 extends AbstractC4981 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f14386;

    public C4983(AbstractC5002 abstractC5002, String str, Object obj, C4535 c4535) {
        super(abstractC5002, str, obj, c4535);
        this.f14386 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C5011(this, 15));
    }

    @Override // kotlin.reflect.InterfaceC5087
    public final InterfaceC5105 getGetter() {
        return (C4984) this.f14386.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC4981
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final AbstractC4978 mo9963() {
        return (C4984) this.f14386.getValue();
    }
}
