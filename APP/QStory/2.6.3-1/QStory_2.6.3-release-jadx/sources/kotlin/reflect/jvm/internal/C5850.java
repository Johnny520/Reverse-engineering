package kotlin.reflect.jvm.internal;

import kotlin.C6008;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.InterfaceC5943;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5850 extends AbstractC5792 implements InterfaceC5943 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C5854 f14824;

    public C5850(C5854 c5854) {
        this.f14824 = c5854;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        this.f14824.set(obj, obj2);
        return C6008.f15084;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5785
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final AbstractC5774 mo10508() {
        return this.f14824;
    }

    @Override // kotlin.reflect.InterfaceC5937
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5920 mo10509() {
        return this.f14824;
    }
}
