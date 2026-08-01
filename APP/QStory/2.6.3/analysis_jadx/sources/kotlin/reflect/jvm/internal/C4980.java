package kotlin.reflect.jvm.internal;

import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.jvm.internal.impl.km.AbstractC4545;
import kotlin.reflect.jvm.internal.impl.km.C4526;
import kotlin.text.AbstractC5139;
import lin.xposed.hook.javaplugin.C5554;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4980 extends AbstractC5060 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f14369;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final KParameter$Kind f14370;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5184 f14371;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4526 f14372;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f14373;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC5007 f14374;

    public C4980(AbstractC5007 abstractC5007, C4526 c4526, int i, KParameter$Kind kParameter$Kind, C5070 c5070) {
        abstractC5007.getClass();
        c4526.getClass();
        kParameter$Kind.getClass();
        c5070.getClass();
        this.f14374 = abstractC5007;
        this.f14372 = c4526;
        this.f14373 = i;
        this.f14370 = kParameter$Kind;
        String str = c4526.f13187;
        this.f14369 = AbstractC5139.m10139(str, "<", false) ? null : str;
        this.f14371 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C5028(this, 2, c5070));
    }

    @Override // kotlin.reflect.InterfaceC5108
    public final int getIndex() {
        return this.f14373;
    }

    @Override // kotlin.reflect.InterfaceC5108
    public final KParameter$Kind getKind() {
        return this.f14370;
    }

    @Override // kotlin.reflect.InterfaceC5108
    public final String getName() {
        return this.f14369;
    }

    @Override // kotlin.reflect.InterfaceC5108
    public final InterfaceC5087 getType() {
        return (InterfaceC5087) this.f14371.getValue();
    }

    @Override // kotlin.reflect.InterfaceC5108
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo9954() {
        AbstractC5007 abstractC5007 = this.f14374;
        if (!(abstractC5007 instanceof AbstractC4982) && !(abstractC5007.mo9943() instanceof C4992) && !AbstractC5062.m10040(abstractC5007)) {
            C5554.m10872(abstractC5007, "Only constructors and top-level callables are supported for now: ");
            return false;
        }
        InterfaceC5088[] interfaceC5088Arr = AbstractC4545.f13263;
        C4526 c4526 = this.f14372;
        c4526.getClass();
        return AbstractC4545.f13253.m577(c4526, AbstractC4545.f13263[54]);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5060
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5064 mo9955() {
        return this.f14374;
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC5060
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo9956() {
        InterfaceC5088[] interfaceC5088Arr = AbstractC4545.f13263;
        C4526 c4526 = this.f14372;
        c4526.getClass();
        return AbstractC4545.f13253.m577(c4526, AbstractC4545.f13263[54]);
    }

    @Override // kotlin.reflect.InterfaceC5108
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo9958() {
        return this.f14372.f13185 != null;
    }
}
