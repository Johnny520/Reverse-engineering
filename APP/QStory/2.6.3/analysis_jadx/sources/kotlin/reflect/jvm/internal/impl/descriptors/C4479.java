package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p046.InterfaceC6481;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4479 implements InterfaceC4463 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4496 f13108;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f13109;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4463 f13110;

    public C4479(InterfaceC4463 interfaceC4463, InterfaceC4496 interfaceC4496, int i) {
        this.f13110 = interfaceC4463;
        this.f13108 = interfaceC4496;
        this.f13109 = i;
    }

    @Override // p046.InterfaceC6479
    public final InterfaceC6481 getAnnotations() {
        return this.f13110.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463
    public final int getIndex() {
        return this.f13110.getIndex() + this.f13109;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    public final C4691 getName() {
        C4691 name = this.f13110.getName();
        name.getClass();
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463
    public final List getUpperBounds() {
        List upperBounds = this.f13110.getUpperBounds();
        upperBounds.getClass();
        return upperBounds;
    }

    public final String toString() {
        return this.f13110 + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final boolean mo8999() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final C4845 mo9000() {
        C4845 c4845Mo9000 = this.f13110.mo9000();
        c4845Mo9000.getClass();
        return c4845Mo9000;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4873 mo9001() {
        InterfaceC4873 interfaceC4873Mo9001 = this.f13110.mo9001();
        interfaceC4873Mo9001.getClass();
        return interfaceC4873Mo9001;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4462 mo9026() {
        InterfaceC4462 interfaceC4462Mo9026 = this.f13110.mo9026();
        interfaceC4462Mo9026.getClass();
        return interfaceC4462Mo9026;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4477 mo9002() {
        return this.f13110.mo9002();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object mo9027(InterfaceC4497 interfaceC4497, Object obj) {
        return this.f13110.mo9027(interfaceC4497, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Variance mo9003() {
        Variance varianceMo9003 = this.f13110.mo9003();
        varianceMo9003.getClass();
        return varianceMo9003;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo9004() {
        return this.f13110.mo9004();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC4499 mo9028() {
        return this.f13108;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final AbstractC4878 mo9025() {
        AbstractC4878 abstractC4878Mo9025 = this.f13110.mo9025();
        abstractC4878Mo9025.getClass();
        return abstractC4878Mo9025;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4499 mo9002() {
        return this.f13110.mo9002();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC4463 mo9002() {
        return this.f13110.mo9002();
    }
}
