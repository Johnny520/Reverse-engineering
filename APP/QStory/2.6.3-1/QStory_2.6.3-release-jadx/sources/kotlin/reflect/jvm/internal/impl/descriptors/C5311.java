package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p062.InterfaceC7310;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5311 implements InterfaceC5295 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5328 f13453;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f13454;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5295 f13455;

    public C5311(InterfaceC5295 interfaceC5295, InterfaceC5328 interfaceC5328, int i) {
        this.f13455 = interfaceC5295;
        this.f13453 = interfaceC5328;
        this.f13454 = i;
    }

    @Override // p062.InterfaceC7308
    public final InterfaceC7310 getAnnotations() {
        return this.f13455.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295
    public final int getIndex() {
        return this.f13455.getIndex() + this.f13454;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    public final C5523 getName() {
        C5523 name = this.f13455.getName();
        name.getClass();
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295
    public final List getUpperBounds() {
        List upperBounds = this.f13455.getUpperBounds();
        upperBounds.getClass();
        return upperBounds;
    }

    public final String toString() {
        return this.f13455 + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final boolean mo9558() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final C5677 mo9559() {
        C5677 c5677Mo9559 = this.f13455.mo9559();
        c5677Mo9559.getClass();
        return c5677Mo9559;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC5705 mo9560() {
        InterfaceC5705 interfaceC5705Mo9560 = this.f13455.mo9560();
        interfaceC5705Mo9560.getClass();
        return interfaceC5705Mo9560;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5294 mo9585() {
        InterfaceC5294 interfaceC5294Mo9585 = this.f13455.mo9585();
        interfaceC5294Mo9585.getClass();
        return interfaceC5294Mo9585;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5309 mo9561() {
        return this.f13455.mo9561();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object mo9586(InterfaceC5329 interfaceC5329, Object obj) {
        return this.f13455.mo9586(interfaceC5329, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Variance mo9562() {
        Variance varianceMo9562 = this.f13455.mo9562();
        varianceMo9562.getClass();
        return varianceMo9562;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final boolean mo9563() {
        return this.f13455.mo9563();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC5331 mo9587() {
        return this.f13453;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final AbstractC5710 mo9584() {
        AbstractC5710 abstractC5710Mo9584 = this.f13455.mo9584();
        abstractC5710Mo9584.getClass();
        return abstractC5710Mo9584;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5331 mo9561() {
        return this.f13455.mo9561();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5295 mo9561() {
        return this.f13455.mo9561();
    }
}
