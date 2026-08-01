package kotlin.reflect.jvm.internal.impl.types.checker;

import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4896;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.C4872;
import kotlin.reflect.jvm.internal.impl.types.C4906;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p049.AbstractC6530;
import p069.C6897;
import p073.C6940;
import p097.InterfaceC7219;
import p097.InterfaceC7220;
import p097.InterfaceC7221;
import p097.InterfaceC7223;
import p097.InterfaceC7224;
import p097.InterfaceC7226;
import p097.InterfaceC7227;
import p097.InterfaceC7228;
import p097.InterfaceC7230;
import p097.InterfaceC7231;
import p098.C7240;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4858 implements InterfaceC4853 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4858 f14140 = new C4858();

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final InterfaceC7231 mo9602(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        InterfaceC7219 interfaceC7219M9706 = AbstractC4860.m9706(interfaceC7220);
        if (interfaceC7219M9706 == null) {
            interfaceC7219M9706 = mo9605(interfaceC7220);
        }
        return AbstractC4860.m9719(interfaceC7219M9706);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4853
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final /* bridge */ AbstractC4878 mo9591(AbstractC4882 abstractC4882) {
        return AbstractC4860.m9706(abstractC4882);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final /* bridge */ boolean mo9603(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9685(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final boolean mo9604(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        return interfaceC7220 instanceof C6940;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final InterfaceC7219 mo9605(InterfaceC7220 interfaceC7220) {
        AbstractC4878 abstractC4878M9667;
        interfaceC7220.getClass();
        AbstractC4896 abstractC4896M9707 = AbstractC4860.m9707(interfaceC7220);
        if (abstractC4896M9707 != null && (abstractC4878M9667 = AbstractC4860.m9667(abstractC4896M9707)) != null) {
            return abstractC4878M9667;
        }
        AbstractC4878 abstractC4878M9706 = AbstractC4860.m9706(interfaceC7220);
        abstractC4878M9706.getClass();
        return abstractC4878M9706;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final /* bridge */ boolean mo9606(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9682(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final /* bridge */ boolean mo9607(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9683(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean mo9608(InterfaceC7223 interfaceC7223) {
        return interfaceC7223 instanceof C6897;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo9609(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        AbstractC4860.m9707(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC7223 mo9610(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9689(this, m9646(interfaceC7219));
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC7219 mo9611(InterfaceC7220 interfaceC7220) {
        AbstractC4878 abstractC4878M9717;
        interfaceC7220.getClass();
        AbstractC4896 abstractC4896M9707 = AbstractC4860.m9707(interfaceC7220);
        if (abstractC4896M9707 != null && (abstractC4878M9717 = AbstractC4860.m9717(abstractC4896M9707)) != null) {
            return abstractC4878M9717;
        }
        AbstractC4878 abstractC4878M9706 = AbstractC4860.m9706(interfaceC7220);
        abstractC4878M9706.getClass();
        return abstractC4878M9706;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7223 mo9612(InterfaceC7227 interfaceC7227) {
        return AbstractC4860.m9689(this, interfaceC7227);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean mo9613(InterfaceC7219 interfaceC7219) {
        AbstractC4878 abstractC4878M9706 = AbstractC4860.m9706(interfaceC7219);
        return (abstractC4878M9706 != null ? AbstractC4860.m9689(this, m9646(abstractC4878M9706)) : null) != null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7230 mo9614(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9710(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final boolean mo9615(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return AbstractC4860.m9682(mo9602(interfaceC7219)) && !AbstractC4860.m9673(interfaceC7219);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7220 mo9616(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9712(this, interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo9617(InterfaceC7230 interfaceC7230) {
        return AbstractC4860.m9674(interfaceC7230);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC7220 mo9618(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9669(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo9619(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9678(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final boolean mo9620(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        return AbstractC4860.m9683(mo9605(interfaceC7220)) != AbstractC4860.m9683(mo9611(interfaceC7220));
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final /* bridge */ int mo9621(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9668(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final boolean mo9622(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9685(AbstractC4860.m9719(interfaceC7219));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4853
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public final /* bridge */ AbstractC4914 mo9592(InterfaceC7227 interfaceC7227, InterfaceC7227 interfaceC72272) {
        return AbstractC4860.m9701(this, interfaceC7227, interfaceC72272);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7231 mo9623(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9719(interfaceC7219);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final int mo9624(InterfaceC7226 interfaceC7226) {
        interfaceC7226.getClass();
        if (interfaceC7226 instanceof InterfaceC7219) {
            return AbstractC4860.m9691((InterfaceC7220) interfaceC7226);
        }
        if (interfaceC7226 instanceof ArgumentList) {
            return ((ArgumentList) interfaceC7226).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC7226);
        C4211.m8620(AbstractC4396.f12975.mo8917(interfaceC7226.getClass()), sb);
        return 0;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final /* bridge */ boolean mo9625(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9684(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7221 mo9626(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9707(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7219 mo9627(InterfaceC7219 interfaceC7219, CaptureStatus captureStatus) {
        return AbstractC4860.m9711(interfaceC7219, captureStatus);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4853, p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final /* bridge */ AbstractC4878 mo9593(InterfaceC7221 interfaceC7221) {
        return AbstractC4860.m9717(interfaceC7221);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4853, p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final /* bridge */ AbstractC4878 mo9594(InterfaceC7221 interfaceC7221) {
        return AbstractC4860.m9667(interfaceC7221);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4853, p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final /* bridge */ AbstractC4878 mo9595(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9713(interfaceC7219, true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC4853
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6530 mo9596() {
        throw new UnsupportedOperationException("Not supported");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4872 m9628() {
        return AbstractC4860.m9709(false, this, null, 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7220 m9629(InterfaceC7220 interfaceC7220) {
        AbstractC4878 abstractC4878M9713;
        interfaceC7220.getClass();
        AbstractC4878 abstractC4878M9706 = AbstractC4860.m9706(interfaceC7220);
        return (abstractC4878M9706 == null || (abstractC4878M9713 = AbstractC4860.m9713(abstractC4878M9706, true)) == null) ? interfaceC7220 : abstractC4878M9713;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* bridge */ void mo9630(InterfaceC7219 interfaceC7219) {
        AbstractC4860.m9670(interfaceC7219);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* bridge */ CaptureStatus mo9631(InterfaceC7223 interfaceC7223) {
        return AbstractC4860.m9708(interfaceC7223);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7226 mo9632(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9690(interfaceC7219);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* bridge */ int mo9633(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9691(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean mo9634(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        return !AbstractC4395.m8907(AbstractC4860.m9719(mo9605(interfaceC7220)), AbstractC4860.m9719(mo9611(interfaceC7220)));
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean mo9635(InterfaceC7220 interfaceC7220) {
        interfaceC7220.getClass();
        AbstractC4878 abstractC4878M9706 = AbstractC4860.m9706(interfaceC7220);
        return (abstractC4878M9706 != null ? AbstractC4860.m9688(abstractC4878M9706) : null) != null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final /* bridge */ void mo9636(InterfaceC7219 interfaceC7219) {
        AbstractC4860.m9671(interfaceC7219);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* bridge */ boolean mo9638(InterfaceC7219 interfaceC7219, InterfaceC7219 interfaceC72192) {
        return AbstractC4860.m9680(interfaceC7219, interfaceC72192);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo9639(InterfaceC7231 interfaceC7231, InterfaceC7231 interfaceC72312) {
        return AbstractC4860.m9692(interfaceC7231, interfaceC72312);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7220 mo9640(InterfaceC7230 interfaceC7230) {
        return AbstractC4860.m9694(this, interfaceC7230);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7219 mo9641(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9706(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7224 mo9642(InterfaceC7223 interfaceC7223) {
        return AbstractC4860.m9716(interfaceC7223);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final /* bridge */ TypeVariance mo9643(InterfaceC7230 interfaceC7230) {
        return AbstractC4860.m9699(interfaceC7230);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC7230 mo9644(InterfaceC7219 interfaceC7219, int i) {
        if (i < 0 || i >= AbstractC4860.m9691(interfaceC7219)) {
            return null;
        }
        return AbstractC4860.m9704(interfaceC7219, i);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* bridge */ AbstractC4893 mo9645(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9714(this, interfaceC7219);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC7227 m9646(InterfaceC7219 interfaceC7219) {
        AbstractC4878 abstractC4878;
        C4906 c4906M9688 = AbstractC4860.m9688(interfaceC7219);
        return (c4906M9688 == null || (abstractC4878 = c4906M9688.f14230) == null) ? (InterfaceC7227) interfaceC7219 : abstractC4878;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final /* bridge */ boolean mo9647(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9679(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo9648(InterfaceC7220 interfaceC7220) {
        return AbstractC4860.m9687(interfaceC7220);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final InterfaceC7230 mo9649(InterfaceC7226 interfaceC7226, int i) {
        interfaceC7226.getClass();
        if (interfaceC7226 instanceof InterfaceC7227) {
            return AbstractC4860.m9704((InterfaceC7220) interfaceC7226, i);
        }
        if (interfaceC7226 instanceof ArgumentList) {
            InterfaceC7230 interfaceC7230 = ((ArgumentList) interfaceC7226).get(i);
            interfaceC7230.getClass();
            return interfaceC7230;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC7226);
        C4211.m8620(AbstractC4396.f12975.mo8917(interfaceC7226.getClass()), sb);
        return null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7220 mo9650(InterfaceC7223 interfaceC7223) {
        return AbstractC4860.m9666(interfaceC7223);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final /* bridge */ boolean mo9651(InterfaceC7228 interfaceC7228, InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9681(interfaceC7228, interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final /* bridge */ boolean mo9652(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9677(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7228 mo9653(InterfaceC7231 interfaceC7231, int i) {
        return AbstractC4860.m9702(interfaceC7231, i);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final boolean mo9654(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return AbstractC4860.m9688(interfaceC7219) != null;
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo9655(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9676(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final /* bridge */ boolean mo9656(InterfaceC7223 interfaceC7223) {
        return AbstractC4860.m9675(interfaceC7223);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7230 mo9657(InterfaceC7224 interfaceC7224) {
        return AbstractC4860.m9665(interfaceC7224);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final /* bridge */ TypeVariance mo9658(InterfaceC7228 interfaceC7228) {
        return AbstractC4860.m9696(interfaceC7228);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final /* bridge */ Collection mo9659(InterfaceC7231 interfaceC7231) {
        return AbstractC4860.m9718(interfaceC7231);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7230 mo9660(InterfaceC7220 interfaceC7220, int i) {
        return AbstractC4860.m9704(interfaceC7220, i);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final InterfaceC7220 mo9661(ArrayList arrayList) {
        AbstractC4878 abstractC4878;
        int size = arrayList.size();
        if (size == 0) {
            C5925.m11311("Expected some types");
            return null;
        }
        if (size == 1) {
            return (AbstractC4914) AbstractC4344.m8780(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC4914 abstractC4914 = (AbstractC4914) it.next();
            z = z || AbstractC4893.m9829(abstractC4914);
            if (abstractC4914 instanceof AbstractC4878) {
                abstractC4878 = (AbstractC4878) abstractC4914;
            } else {
                if (!(abstractC4914 instanceof AbstractC4896)) {
                    C4211.m8611();
                    return null;
                }
                abstractC4878 = ((AbstractC4896) abstractC4914).f14216;
                z2 = true;
            }
            arrayList2.add(abstractC4878);
        }
        if (z) {
            return C7240.m12470(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        C4857 c4857 = C4857.f14139;
        if (!z2) {
            return c4857.m9601(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC4893.m9807((AbstractC4914) it2.next()));
        }
        return AbstractC4893.m9809(c4857.m9601(arrayList2), c4857.m9601(arrayList3));
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final /* bridge */ Collection mo9662(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9664(this, interfaceC7219);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final boolean mo9663(InterfaceC7219 interfaceC7219) {
        interfaceC7219.getClass();
        return AbstractC4860.m9678(AbstractC4860.m9719(interfaceC7219));
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final /* bridge */ InterfaceC7219 mo9593(InterfaceC7221 interfaceC7221) {
        return AbstractC4860.m9717(interfaceC7221);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final /* bridge */ InterfaceC7219 mo9594(InterfaceC7221 interfaceC7221) {
        return AbstractC4860.m9667(interfaceC7221);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final /* bridge */ InterfaceC7219 mo9595(InterfaceC7219 interfaceC7219) {
        return AbstractC4860.m9713(interfaceC7219, false);
    }

    @Override // p097.InterfaceC7229
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo9637(InterfaceC7219 interfaceC7219, InterfaceC7231 interfaceC7231) {
    }
}
