package kotlin.reflect.jvm.internal;

import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5938;
import kotlin.reflect.jvm.internal.impl.p009km.C5368;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5816 extends AbstractC5814 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC6016 f14733;

    public C5816(AbstractC5835 abstractC5835, String str, Object obj, C5368 c5368) {
        super(abstractC5835, str, obj, c5368);
        this.f14733 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5844(this, 15));
    }

    @Override // kotlin.reflect.InterfaceC5920
    public final InterfaceC5938 getGetter() {
        return (C5817) this.f14733.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5814
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final AbstractC5811 mo10519() {
        return (C5817) this.f14733.getValue();
    }
}
