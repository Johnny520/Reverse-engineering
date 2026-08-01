package kotlin.reflect.jvm.internal;

import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5939;
import kotlin.reflect.InterfaceC5941;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5789 extends C5776 implements InterfaceC5939 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final InterfaceC6016 f14680;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5789(AbstractC5835 abstractC5835, InterfaceC5305 interfaceC5305, C5883 c5883) {
        super(abstractC5835, interfaceC5305, c5883);
        abstractC5835.getClass();
        interfaceC5305.getClass();
        c5883.getClass();
        this.f14680 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5844(this, 6));
    }

    @Override // kotlin.reflect.InterfaceC5939
    public final InterfaceC5941 getSetter() {
        return (C5853) this.f14680.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.C5776
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C5776 mo10506(C5883 c5883) {
        return new C5789(this.f14653, mo10501(), c5883);
    }

    @Override // kotlin.reflect.jvm.internal.C5776, kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC5856 mo10506(C5883 c5883) {
        return new C5789(this.f14653, mo10501(), c5883);
    }
}
