package kotlin.reflect.jvm.internal;

import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5941;
import kotlin.reflect.InterfaceC5943;
import kotlin.reflect.InterfaceC5944;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5854 extends C5782 implements InterfaceC5944 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final InterfaceC6016 f14828;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5854(AbstractC5835 abstractC5835, InterfaceC5305 interfaceC5305, C5883 c5883) {
        super(abstractC5835, interfaceC5305, c5883);
        abstractC5835.getClass();
        interfaceC5305.getClass();
        c5883.getClass();
        this.f14828 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5844(this, 4));
    }

    @Override // kotlin.reflect.InterfaceC5939
    public final InterfaceC5941 getSetter() {
        return (C5850) this.f14828.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5944
    public final void set(Object obj, Object obj2) {
        ((C5850) this.f14828.getValue()).call(obj, obj2);
    }

    @Override // kotlin.reflect.jvm.internal.C5782
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final C5782 mo10506(C5883 c5883) {
        return new C5854(this.f14653, mo10501(), c5883);
    }

    @Override // kotlin.reflect.jvm.internal.C5782, kotlin.reflect.jvm.internal.AbstractC5856
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final AbstractC5856 mo10506(C5883 c5883) {
        return new C5854(this.f14653, mo10501(), c5883);
    }

    @Override // kotlin.reflect.InterfaceC5944, kotlin.reflect.InterfaceC5939
    public final InterfaceC5943 getSetter() {
        return (C5850) this.f14828.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5854(AbstractC5835 abstractC5835, String str, String str2, Object obj) {
        super(abstractC5835, str, str2, obj);
        str.getClass();
        str2.getClass();
        this.f14828 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5844(this, 4));
    }
}
