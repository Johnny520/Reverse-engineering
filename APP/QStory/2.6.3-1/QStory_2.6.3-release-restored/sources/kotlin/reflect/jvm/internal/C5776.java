package kotlin.reflect.jvm.internal;

import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5938;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5776 extends AbstractC5774 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC6016 f14657;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5776(AbstractC5835 abstractC5835, InterfaceC5305 interfaceC5305, C5883 c5883) {
        super(abstractC5835, interfaceC5305, c5883);
        abstractC5835.getClass();
        interfaceC5305.getClass();
        c5883.getClass();
        this.f14657 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5844(this, 7));
    }

    @Override // kotlin.reflect.InterfaceC5920
    public final InterfaceC5938 getGetter() {
        return (C5777) this.f14657.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C5776 mo10506(C5883 c5883) {
        return new C5776(this.f14653, mo10501(), c5883);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5774
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC5795 mo10495() {
        return (C5777) this.f14657.getValue();
    }
}
