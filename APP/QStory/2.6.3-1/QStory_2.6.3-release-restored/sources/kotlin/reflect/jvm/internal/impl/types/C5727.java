package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5727 extends AbstractC5739 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5710 f14559;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC5710 f14560;

    public C5727(AbstractC5710 abstractC5710, AbstractC5710 abstractC57102) {
        abstractC5710.getClass();
        abstractC57102.getClass();
        this.f14559 = abstractC5710;
        this.f14560 = abstractC57102;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final AbstractC5710 mo10329(C5706 c5706) {
        c5706.getClass();
        return new C5727(this.f14559.mo10329(c5706), this.f14560);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739, kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C5727 mo10289(AbstractC5693 abstractC5693) {
        abstractC5693.getClass();
        AbstractC5710 abstractC5710 = this.f14559;
        abstractC5710.getClass();
        AbstractC5710 abstractC57102 = this.f14560;
        abstractC57102.getClass();
        return new C5727(abstractC5710, abstractC57102);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5710, kotlin.reflect.jvm.internal.impl.types.AbstractC5746
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C5727 mo10290(boolean z) {
        return new C5727(this.f14559.mo10290(z), this.f14560.mo10290(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public final AbstractC5739 mo10330(AbstractC5710 abstractC5710) {
        return new C5727(abstractC5710, this.f14560);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5739
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪 */
    public final AbstractC5710 mo10340() {
        return this.f14559;
    }
}
