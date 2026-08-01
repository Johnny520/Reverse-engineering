package kotlin.reflect.jvm.internal.impl.types.checker;

import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4895;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import kotlin.reflect.jvm.internal.impl.types.C4905;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p049.AbstractC6529;
import p069.C6896;
import p073.C6939;
import p097.InterfaceC7218;
import p097.InterfaceC7219;
import p097.InterfaceC7220;
import p097.InterfaceC7222;
import p097.InterfaceC7223;
import p097.InterfaceC7225;
import p097.InterfaceC7226;
import p097.InterfaceC7227;
import p097.InterfaceC7229;
import p097.InterfaceC7230;
import p098.C7239;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4857 implements InterfaceC4852 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4857 f14136 = new C4857();

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final InterfaceC7230 mo9612(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        InterfaceC7218 interfaceC7218M9716 = AbstractC4859.m9716(interfaceC7219);
        if (interfaceC7218M9716 == null) {
            interfaceC7218M9716 = mo9615(interfaceC7219);
        }
        return AbstractC4859.m9729(interfaceC7218M9716);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final /* bridge */ AbstractC4877 mo9601(AbstractC4881 abstractC4881) {
        return AbstractC4859.m9716(abstractC4881);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final /* bridge */ boolean mo9613(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9695(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final boolean mo9614(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return interfaceC7219 instanceof C6939;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final InterfaceC7218 mo9615(InterfaceC7219 interfaceC7219) {
        AbstractC4877 abstractC4877M9677;
        interfaceC7219.getClass();
        AbstractC4895 abstractC4895M9717 = AbstractC4859.m9717(interfaceC7219);
        if (abstractC4895M9717 != null && (abstractC4877M9677 = AbstractC4859.m9677(abstractC4895M9717)) != null) {
            return abstractC4877M9677;
        }
        AbstractC4877 abstractC4877M9716 = AbstractC4859.m9716(interfaceC7219);
        abstractC4877M9716.getClass();
        return abstractC4877M9716;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final /* bridge */ boolean mo9616(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9692(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final /* bridge */ boolean mo9617(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9693(interfaceC7219);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean mo9618(InterfaceC7222 interfaceC7222) {
        return interfaceC7222 instanceof C6896;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final /* bridge */ boolean mo9619(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9688(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void mo9620(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        AbstractC4859.m9717(interfaceC7219);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC7222 mo9621(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9699(this, m9641(interfaceC7218));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC7218 mo9622(InterfaceC7219 interfaceC7219) {
        AbstractC4877 abstractC4877M9727;
        interfaceC7219.getClass();
        AbstractC4895 abstractC4895M9717 = AbstractC4859.m9717(interfaceC7219);
        if (abstractC4895M9717 != null && (abstractC4877M9727 = AbstractC4859.m9727(abstractC4895M9717)) != null) {
            return abstractC4877M9727;
        }
        AbstractC4877 abstractC4877M9716 = AbstractC4859.m9716(interfaceC7219);
        abstractC4877M9716.getClass();
        return abstractC4877M9716;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7222 mo9623(InterfaceC7226 interfaceC7226) {
        return AbstractC4859.m9699(this, interfaceC7226);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7229 mo9624(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9720(interfaceC7219);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final boolean mo9625(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        return AbstractC4859.m9692(mo9612(interfaceC7218)) && !AbstractC4859.m9683(interfaceC7218);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7219 mo9626(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9722(this, interfaceC7219);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final /* bridge */ boolean mo9627(InterfaceC7229 interfaceC7229) {
        return AbstractC4859.m9684(interfaceC7229);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC7219 mo9628(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9679(interfaceC7219);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final boolean mo9629(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return AbstractC4859.m9693(mo9615(interfaceC7219)) != AbstractC4859.m9693(mo9622(interfaceC7219));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final /* bridge */ int mo9630(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9678(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final boolean mo9631(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9695(AbstractC4859.m9729(interfaceC7218));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public final /* bridge */ AbstractC4913 mo9602(InterfaceC7226 interfaceC7226, InterfaceC7226 interfaceC72262) {
        return AbstractC4859.m9711(this, interfaceC7226, interfaceC72262);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7230 mo9632(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9729(interfaceC7218);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final int mo9633(InterfaceC7225 interfaceC7225) {
        interfaceC7225.getClass();
        if (interfaceC7225 instanceof InterfaceC7218) {
            return AbstractC4859.m9701((InterfaceC7219) interfaceC7225);
        }
        if (interfaceC7225 instanceof ArgumentList) {
            return ((ArgumentList) interfaceC7225).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC7225);
        C4210.m8630(AbstractC4395.f12971.mo8927(interfaceC7225.getClass()), sb);
        return 0;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo9634(InterfaceC7227 interfaceC7227, InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9691(interfaceC7227, interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final /* bridge */ boolean mo9635(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9694(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7220 mo9636(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9717(interfaceC7219);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7218 mo9637(InterfaceC7218 interfaceC7218, CaptureStatus captureStatus) {
        return AbstractC4859.m9721(interfaceC7218, captureStatus);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852, p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final /* bridge */ AbstractC4877 mo9603(InterfaceC7220 interfaceC7220) {
        return AbstractC4859.m9727(interfaceC7220);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852, p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final /* bridge */ AbstractC4877 mo9604(InterfaceC7220 interfaceC7220) {
        return AbstractC4859.m9677(interfaceC7220);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852, p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final /* bridge */ AbstractC4877 mo9605(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9723(interfaceC7218, true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4852
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6529 mo9606() {
        throw new UnsupportedOperationException("Not supported");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4871 m9638() {
        return AbstractC4859.m9719(false, this, null, 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7219 m9639(InterfaceC7219 interfaceC7219) {
        AbstractC4877 abstractC4877M9723;
        interfaceC7219.getClass();
        AbstractC4877 abstractC4877M9716 = AbstractC4859.m9716(interfaceC7219);
        return (abstractC4877M9716 == null || (abstractC4877M9723 = AbstractC4859.m9723(abstractC4877M9716, true)) == null) ? interfaceC7219 : abstractC4877M9723;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* bridge */ int mo9640(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9701(interfaceC7219);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC7226 m9641(InterfaceC7218 interfaceC7218) {
        AbstractC4877 abstractC4877;
        C4905 c4905M9698 = AbstractC4859.m9698(interfaceC7218);
        return (c4905M9698 == null || (abstractC4877 = c4905M9698.f14226) == null) ? (InterfaceC7226) interfaceC7218 : abstractC4877;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7225 mo9642(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9700(interfaceC7218);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final boolean mo9643(InterfaceC7218 interfaceC7218) {
        AbstractC4877 abstractC4877M9716 = AbstractC4859.m9716(interfaceC7218);
        return (abstractC4877M9716 != null ? AbstractC4859.m9699(this, m9641(abstractC4877M9716)) : null) != null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean mo9644(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return !AbstractC4394.m8917(AbstractC4859.m9729(mo9615(interfaceC7219)), AbstractC4859.m9729(mo9622(interfaceC7219)));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* bridge */ CaptureStatus mo9645(InterfaceC7222 interfaceC7222) {
        return AbstractC4859.m9718(interfaceC7222);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final /* bridge */ boolean mo9646(InterfaceC7230 interfaceC7230, InterfaceC7230 interfaceC72302) {
        return AbstractC4859.m9702(interfaceC7230, interfaceC72302);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean mo9647(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        AbstractC4877 abstractC4877M9716 = AbstractC4859.m9716(interfaceC7219);
        return (abstractC4877M9716 != null ? AbstractC4859.m9698(abstractC4877M9716) : null) != null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* bridge */ boolean mo9648(InterfaceC7218 interfaceC7218, InterfaceC7218 interfaceC72182) {
        return AbstractC4859.m9690(interfaceC7218, interfaceC72182);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* bridge */ void mo9649(InterfaceC7218 interfaceC7218) {
        AbstractC4859.m9680(interfaceC7218);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7219 mo9650(InterfaceC7229 interfaceC7229) {
        return AbstractC4859.m9704(this, interfaceC7229);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7218 mo9652(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9716(interfaceC7219);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7223 mo9653(InterfaceC7222 interfaceC7222) {
        return AbstractC4859.m9726(interfaceC7222);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC7229 mo9654(InterfaceC7218 interfaceC7218, int i) {
        if (i < 0 || i >= AbstractC4859.m9701(interfaceC7218)) {
            return null;
        }
        return AbstractC4859.m9714(interfaceC7218, i);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final /* bridge */ void mo9655(InterfaceC7218 interfaceC7218) {
        AbstractC4859.m9681(interfaceC7218);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* bridge */ AbstractC4892 mo9656(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9724(this, interfaceC7218);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* bridge */ TypeVariance mo9657(InterfaceC7229 interfaceC7229) {
        return AbstractC4859.m9709(interfaceC7229);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final /* bridge */ boolean mo9658(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9689(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo9659(InterfaceC7219 interfaceC7219) {
        return AbstractC4859.m9697(interfaceC7219);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final InterfaceC7229 mo9660(InterfaceC7225 interfaceC7225, int i) {
        interfaceC7225.getClass();
        if (interfaceC7225 instanceof InterfaceC7226) {
            return AbstractC4859.m9714((InterfaceC7219) interfaceC7225, i);
        }
        if (interfaceC7225 instanceof ArgumentList) {
            InterfaceC7229 interfaceC7229 = ((ArgumentList) interfaceC7225).get(i);
            interfaceC7229.getClass();
            return interfaceC7229;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC7225);
        C4210.m8630(AbstractC4395.f12971.mo8927(interfaceC7225.getClass()), sb);
        return null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7219 mo9661(InterfaceC7222 interfaceC7222) {
        return AbstractC4859.m9676(interfaceC7222);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final /* bridge */ boolean mo9662(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9687(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7227 mo9663(InterfaceC7230 interfaceC7230, int i) {
        return AbstractC4859.m9712(interfaceC7230, i);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final boolean mo9664(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        return AbstractC4859.m9698(interfaceC7218) != null;
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo9665(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9686(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final /* bridge */ boolean mo9666(InterfaceC7222 interfaceC7222) {
        return AbstractC4859.m9685(interfaceC7222);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7229 mo9667(InterfaceC7223 interfaceC7223) {
        return AbstractC4859.m9675(interfaceC7223);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final /* bridge */ TypeVariance mo9668(InterfaceC7227 interfaceC7227) {
        return AbstractC4859.m9706(interfaceC7227);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final /* bridge */ Collection mo9669(InterfaceC7230 interfaceC7230) {
        return AbstractC4859.m9728(interfaceC7230);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7229 mo9670(InterfaceC7219 interfaceC7219, int i) {
        return AbstractC4859.m9714(interfaceC7219, i);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final InterfaceC7219 mo9671(ArrayList arrayList) {
        AbstractC4877 abstractC4877;
        int size = arrayList.size();
        if (size == 0) {
            C5919.m11250("Expected some types");
            return null;
        }
        if (size == 1) {
            return (AbstractC4913) AbstractC4343.m8822(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC4913 abstractC4913 = (AbstractC4913) it.next();
            z = z || AbstractC4892.m9835(abstractC4913);
            if (abstractC4913 instanceof AbstractC4877) {
                abstractC4877 = (AbstractC4877) abstractC4913;
            } else {
                if (!(abstractC4913 instanceof AbstractC4895)) {
                    C4210.m8621();
                    return null;
                }
                abstractC4877 = ((AbstractC4895) abstractC4913).f14212;
                z2 = true;
            }
            arrayList2.add(abstractC4877);
        }
        if (z) {
            return C7239.m12443(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        C4856 c4856 = C4856.f14135;
        if (!z2) {
            return c4856.m9611(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC4892.m9813((AbstractC4913) it2.next()));
        }
        return AbstractC4892.m9815(c4856.m9611(arrayList2), c4856.m9611(arrayList3));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final /* bridge */ Collection mo9672(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9674(this, interfaceC7218);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final boolean mo9673(InterfaceC7218 interfaceC7218) {
        interfaceC7218.getClass();
        return AbstractC4859.m9688(AbstractC4859.m9729(interfaceC7218));
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final /* bridge */ InterfaceC7218 mo9603(InterfaceC7220 interfaceC7220) {
        return AbstractC4859.m9727(interfaceC7220);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final /* bridge */ InterfaceC7218 mo9604(InterfaceC7220 interfaceC7220) {
        return AbstractC4859.m9677(interfaceC7220);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final /* bridge */ InterfaceC7218 mo9605(InterfaceC7218 interfaceC7218) {
        return AbstractC4859.m9723(interfaceC7218, false);
    }

    @Override // p097.InterfaceC7228
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo9651(InterfaceC7218 interfaceC7218, InterfaceC7230 interfaceC7230) {
    }
}
