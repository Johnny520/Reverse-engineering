package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p046.InterfaceC6480;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4478 implements InterfaceC4462 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4495 f13104;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f13105;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4462 f13106;

    public C4478(InterfaceC4462 interfaceC4462, InterfaceC4495 interfaceC4495, int i) {
        this.f13106 = interfaceC4462;
        this.f13104 = interfaceC4495;
        this.f13105 = i;
    }

    @Override // p046.InterfaceC6478
    public final InterfaceC6480 getAnnotations() {
        return this.f13106.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462
    public final int getIndex() {
        return this.f13106.getIndex() + this.f13105;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    public final C4690 getName() {
        C4690 name = this.f13106.getName();
        name.getClass();
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462
    public final List getUpperBounds() {
        List upperBounds = this.f13106.getUpperBounds();
        upperBounds.getClass();
        return upperBounds;
    }

    public final String toString() {
        return this.f13106 + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final boolean mo9009() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final C4844 mo9010() {
        C4844 c4844Mo9010 = this.f13106.mo9010();
        c4844Mo9010.getClass();
        return c4844Mo9010;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4872 mo9011() {
        InterfaceC4872 interfaceC4872Mo9011 = this.f13106.mo9011();
        interfaceC4872Mo9011.getClass();
        return interfaceC4872Mo9011;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4461 mo9036() {
        InterfaceC4461 interfaceC4461Mo9036 = this.f13106.mo9036();
        interfaceC4461Mo9036.getClass();
        return interfaceC4461Mo9036;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4476 mo9012() {
        return this.f13106.mo9012();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object mo9037(InterfaceC4496 interfaceC4496, Object obj) {
        return this.f13106.mo9037(interfaceC4496, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Variance mo9013() {
        Variance varianceMo9013 = this.f13106.mo9013();
        varianceMo9013.getClass();
        return varianceMo9013;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo9014() {
        return this.f13106.mo9014();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC4498 mo9038() {
        return this.f13104;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final AbstractC4877 mo9035() {
        AbstractC4877 abstractC4877Mo9035 = this.f13106.mo9035();
        abstractC4877Mo9035.getClass();
        return abstractC4877Mo9035;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4498 mo9012() {
        return this.f13106.mo9012();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4462 mo9012() {
        return this.f13106.mo9012();
    }
}
