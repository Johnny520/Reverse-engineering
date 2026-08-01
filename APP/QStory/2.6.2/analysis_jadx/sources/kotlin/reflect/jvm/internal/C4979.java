package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4544;
import kotlin.reflect.jvm.internal.impl.km.C4525;
import kotlin.text.AbstractC5138;
import lin.xposed.hook.javaplugin.C5553;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4979 extends AbstractC5059 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f14367;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final KParameter$Kind f14368;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5183 f14369;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4525 f14370;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f14371;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC5006 f14372;

    public C4979(AbstractC5006 abstractC5006, C4525 c4525, int i, KParameter$Kind kParameter$Kind, C5069 c5069) {
        abstractC5006.getClass();
        c4525.getClass();
        kParameter$Kind.getClass();
        c5069.getClass();
        this.f14372 = abstractC5006;
        this.f14370 = c4525;
        this.f14371 = i;
        this.f14368 = kParameter$Kind;
        String str = c4525.f13183;
        this.f14367 = AbstractC5138.m10125(str, "<", false) ? null : str;
        this.f14369 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C5027(this, 2, c5069));
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final int getIndex() {
        return this.f14371;
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final KParameter$Kind getKind() {
        return this.f14368;
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final String getName() {
        return this.f14367;
    }

    @Override // kotlin.reflect.InterfaceC5107
    public final InterfaceC5086 getType() {
        return (InterfaceC5086) this.f14369.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5107
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo9957() {
        AbstractC5006 abstractC5006 = this.f14372;
        if (!(abstractC5006 instanceof AbstractC4981) && !(abstractC5006.mo9946() instanceof C4991) && !AbstractC5061.m10027(abstractC5006)) {
            C5553.m10815(abstractC5006, "Only constructors and top-level callables are supported for now: ");
            return false;
        }
        InterfaceC5087[] interfaceC5087Arr = AbstractC4544.f13259;
        C4525 c4525 = this.f14370;
        c4525.getClass();
        return AbstractC4544.f13249.m576(c4525, AbstractC4544.f13259[54]);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5059
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5063 mo9958() {
        return this.f14372;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5059
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo9959() {
        InterfaceC5087[] interfaceC5087Arr = AbstractC4544.f13259;
        C4525 c4525 = this.f14370;
        c4525.getClass();
        return AbstractC4544.f13249.m576(c4525, AbstractC4544.f13259[54]);
    }

    @Override // kotlin.reflect.InterfaceC5107
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo9961() {
        return this.f14370.f13181 != null;
    }
}
