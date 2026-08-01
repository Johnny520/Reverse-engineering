package kotlin.reflect.jvm.internal;

import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.impl.p009km.AbstractC5377;
import kotlin.reflect.jvm.internal.impl.p009km.C5358;
import kotlin.text.AbstractC5971;
import lin.xposed.hook.javaplugin.C6385;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5812 extends AbstractC5892 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f14714;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final KParameter$Kind f14715;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC6016 f14716;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5358 f14717;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f14718;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC5839 f14719;

    public C5812(AbstractC5839 abstractC5839, C5358 c5358, int i, KParameter$Kind kParameter$Kind, C5902 c5902) {
        abstractC5839.getClass();
        c5358.getClass();
        kParameter$Kind.getClass();
        c5902.getClass();
        this.f14719 = abstractC5839;
        this.f14717 = c5358;
        this.f14718 = i;
        this.f14715 = kParameter$Kind;
        String str = c5358.f13532;
        this.f14714 = AbstractC5971.m10698(str, "<", false) ? null : str;
        this.f14716 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C5860(this, 2, c5902));
    }

    @Override // kotlin.reflect.InterfaceC5940
    public final int getIndex() {
        return this.f14718;
    }

    @Override // kotlin.reflect.InterfaceC5940
    public final KParameter$Kind getKind() {
        return this.f14715;
    }

    @Override // kotlin.reflect.InterfaceC5940
    public final String getName() {
        return this.f14714;
    }

    @Override // kotlin.reflect.InterfaceC5940
    public final InterfaceC5919 getType() {
        return (InterfaceC5919) this.f14716.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5940
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo10513() {
        AbstractC5839 abstractC5839 = this.f14719;
        if (!(abstractC5839 instanceof AbstractC5814) && !(abstractC5839.mo10502() instanceof C5824) && !AbstractC5894.m10599(abstractC5839)) {
            C6385.m11431(abstractC5839, "Only constructors and top-level callables are supported for now: ");
            return false;
        }
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        C5358 c5358 = this.f14717;
        c5358.getClass();
        return AbstractC5377.f13598.m1137(c5358, AbstractC5377.f13608[54]);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5892
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5896 mo10514() {
        return this.f14719;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5892
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo10515() {
        InterfaceC5920[] interfaceC5920Arr = AbstractC5377.f13608;
        C5358 c5358 = this.f14717;
        c5358.getClass();
        return AbstractC5377.f13598.m1137(c5358, AbstractC5377.f13608[54]);
    }

    @Override // kotlin.reflect.InterfaceC5940
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo10517() {
        return this.f14717.f13530 != null;
    }
}
