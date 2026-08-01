package kotlin.reflect.jvm.internal.impl.types.checker;

import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5728;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.C5704;
import kotlin.reflect.jvm.internal.impl.types.C5738;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p065.AbstractC7359;
import p085.C7726;
import p089.C7769;
import p113.InterfaceC8048;
import p113.InterfaceC8049;
import p113.InterfaceC8050;
import p113.InterfaceC8052;
import p113.InterfaceC8053;
import p113.InterfaceC8055;
import p113.InterfaceC8056;
import p113.InterfaceC8057;
import p113.InterfaceC8059;
import p113.InterfaceC8060;
import p114.C8069;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5690 implements InterfaceC5685 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5690 f14485 = new C5690();

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final InterfaceC8060 mo10161(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        InterfaceC8048 interfaceC8048M10265 = AbstractC5692.m10265(interfaceC8049);
        if (interfaceC8048M10265 == null) {
            interfaceC8048M10265 = mo10164(interfaceC8049);
        }
        return AbstractC5692.m10278(interfaceC8048M10265);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5685
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final /* bridge */ AbstractC5710 mo10150(AbstractC5714 abstractC5714) {
        return AbstractC5692.m10265(abstractC5714);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final /* bridge */ boolean mo10162(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10244(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final boolean mo10163(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        return interfaceC8049 instanceof C7769;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final InterfaceC8048 mo10164(InterfaceC8049 interfaceC8049) {
        AbstractC5710 abstractC5710M10226;
        interfaceC8049.getClass();
        AbstractC5728 abstractC5728M10266 = AbstractC5692.m10266(interfaceC8049);
        if (abstractC5728M10266 != null && (abstractC5710M10226 = AbstractC5692.m10226(abstractC5728M10266)) != null) {
            return abstractC5710M10226;
        }
        AbstractC5710 abstractC5710M10265 = AbstractC5692.m10265(interfaceC8049);
        abstractC5710M10265.getClass();
        return abstractC5710M10265;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final /* bridge */ boolean mo10165(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10241(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final /* bridge */ boolean mo10166(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10242(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final boolean mo10167(InterfaceC8052 interfaceC8052) {
        return interfaceC8052 instanceof C7726;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo10168(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        AbstractC5692.m10266(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final InterfaceC8052 mo10169(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10248(this, m10205(interfaceC8048));
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC8048 mo10170(InterfaceC8049 interfaceC8049) {
        AbstractC5710 abstractC5710M10276;
        interfaceC8049.getClass();
        AbstractC5728 abstractC5728M10266 = AbstractC5692.m10266(interfaceC8049);
        if (abstractC5728M10266 != null && (abstractC5710M10276 = AbstractC5692.m10276(abstractC5728M10266)) != null) {
            return abstractC5710M10276;
        }
        AbstractC5710 abstractC5710M10265 = AbstractC5692.m10265(interfaceC8049);
        abstractC5710M10265.getClass();
        return abstractC5710M10265;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* bridge */ InterfaceC8052 mo10171(InterfaceC8056 interfaceC8056) {
        return AbstractC5692.m10248(this, interfaceC8056);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean mo10172(InterfaceC8048 interfaceC8048) {
        AbstractC5710 abstractC5710M10265 = AbstractC5692.m10265(interfaceC8048);
        return (abstractC5710M10265 != null ? AbstractC5692.m10248(this, m10205(abstractC5710M10265)) : null) != null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final /* bridge */ InterfaceC8059 mo10173(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10269(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final boolean mo10174(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        return AbstractC5692.m10241(mo10161(interfaceC8048)) && !AbstractC5692.m10232(interfaceC8048);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final /* bridge */ InterfaceC8049 mo10175(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10271(this, interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo10176(InterfaceC8059 interfaceC8059) {
        return AbstractC5692.m10233(interfaceC8059);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC8049 mo10177(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10228(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo10178(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10237(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final boolean mo10179(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        return AbstractC5692.m10242(mo10164(interfaceC8049)) != AbstractC5692.m10242(mo10170(interfaceC8049));
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final /* bridge */ int mo10180(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10227(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final boolean mo10181(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10244(AbstractC5692.m10278(interfaceC8048));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5685
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪 */
    public final /* bridge */ AbstractC5746 mo10151(InterfaceC8056 interfaceC8056, InterfaceC8056 interfaceC80562) {
        return AbstractC5692.m10260(this, interfaceC8056, interfaceC80562);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC8060 mo10182(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10278(interfaceC8048);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final int mo10183(InterfaceC8055 interfaceC8055) {
        interfaceC8055.getClass();
        if (interfaceC8055 instanceof InterfaceC8048) {
            return AbstractC5692.m10250((InterfaceC8049) interfaceC8055);
        }
        if (interfaceC8055 instanceof ArgumentList) {
            return ((ArgumentList) interfaceC8055).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC8055);
        C5043.m9179(AbstractC5228.f13320.mo9476(interfaceC8055.getClass()), sb);
        return 0;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final /* bridge */ boolean mo10184(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10243(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC8050 mo10185(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10266(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final /* bridge */ InterfaceC8048 mo10186(InterfaceC8048 interfaceC8048, CaptureStatus captureStatus) {
        return AbstractC5692.m10270(interfaceC8048, captureStatus);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5685, p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final /* bridge */ AbstractC5710 mo10152(InterfaceC8050 interfaceC8050) {
        return AbstractC5692.m10276(interfaceC8050);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5685, p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final /* bridge */ AbstractC5710 mo10153(InterfaceC8050 interfaceC8050) {
        return AbstractC5692.m10226(interfaceC8050);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5685, p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final /* bridge */ AbstractC5710 mo10154(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10272(interfaceC8048, true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5685
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC7359 mo10155() {
        throw new UnsupportedOperationException("Not supported");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5704 m10187() {
        return AbstractC5692.m10268(false, this, null, 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8049 m10188(InterfaceC8049 interfaceC8049) {
        AbstractC5710 abstractC5710M10272;
        interfaceC8049.getClass();
        AbstractC5710 abstractC5710M10265 = AbstractC5692.m10265(interfaceC8049);
        return (abstractC5710M10265 == null || (abstractC5710M10272 = AbstractC5692.m10272(abstractC5710M10265, true)) == null) ? interfaceC8049 : abstractC5710M10272;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* bridge */ void mo10189(InterfaceC8048 interfaceC8048) {
        AbstractC5692.m10229(interfaceC8048);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* bridge */ CaptureStatus mo10190(InterfaceC8052 interfaceC8052) {
        return AbstractC5692.m10267(interfaceC8052);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* bridge */ InterfaceC8055 mo10191(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10249(interfaceC8048);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* bridge */ int mo10192(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10250(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean mo10193(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        return !AbstractC5227.m9466(AbstractC5692.m10278(mo10164(interfaceC8049)), AbstractC5692.m10278(mo10170(interfaceC8049)));
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean mo10194(InterfaceC8049 interfaceC8049) {
        interfaceC8049.getClass();
        AbstractC5710 abstractC5710M10265 = AbstractC5692.m10265(interfaceC8049);
        return (abstractC5710M10265 != null ? AbstractC5692.m10247(abstractC5710M10265) : null) != null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final /* bridge */ void mo10195(InterfaceC8048 interfaceC8048) {
        AbstractC5692.m10230(interfaceC8048);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* bridge */ boolean mo10197(InterfaceC8048 interfaceC8048, InterfaceC8048 interfaceC80482) {
        return AbstractC5692.m10239(interfaceC8048, interfaceC80482);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo10198(InterfaceC8060 interfaceC8060, InterfaceC8060 interfaceC80602) {
        return AbstractC5692.m10251(interfaceC8060, interfaceC80602);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* bridge */ InterfaceC8049 mo10199(InterfaceC8059 interfaceC8059) {
        return AbstractC5692.m10253(this, interfaceC8059);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* bridge */ InterfaceC8048 mo10200(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10265(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC8053 mo10201(InterfaceC8052 interfaceC8052) {
        return AbstractC5692.m10275(interfaceC8052);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final /* bridge */ TypeVariance mo10202(InterfaceC8059 interfaceC8059) {
        return AbstractC5692.m10258(interfaceC8059);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC8059 mo10203(InterfaceC8048 interfaceC8048, int i) {
        if (i < 0 || i >= AbstractC5692.m10250(interfaceC8048)) {
            return null;
        }
        return AbstractC5692.m10263(interfaceC8048, i);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* bridge */ AbstractC5725 mo10204(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10273(this, interfaceC8048);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC8056 m10205(InterfaceC8048 interfaceC8048) {
        AbstractC5710 abstractC5710;
        C5738 c5738M10247 = AbstractC5692.m10247(interfaceC8048);
        return (c5738M10247 == null || (abstractC5710 = c5738M10247.f14575) == null) ? (InterfaceC8056) interfaceC8048 : abstractC5710;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final /* bridge */ boolean mo10206(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10238(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo10207(InterfaceC8049 interfaceC8049) {
        return AbstractC5692.m10246(interfaceC8049);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final InterfaceC8059 mo10208(InterfaceC8055 interfaceC8055, int i) {
        interfaceC8055.getClass();
        if (interfaceC8055 instanceof InterfaceC8056) {
            return AbstractC5692.m10263((InterfaceC8049) interfaceC8055, i);
        }
        if (interfaceC8055 instanceof ArgumentList) {
            InterfaceC8059 interfaceC8059 = ((ArgumentList) interfaceC8055).get(i);
            interfaceC8059.getClass();
            return interfaceC8059;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(interfaceC8055);
        C5043.m9179(AbstractC5228.f13320.mo9476(interfaceC8055.getClass()), sb);
        return null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final /* bridge */ InterfaceC8049 mo10209(InterfaceC8052 interfaceC8052) {
        return AbstractC5692.m10225(interfaceC8052);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final /* bridge */ boolean mo10210(InterfaceC8057 interfaceC8057, InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10240(interfaceC8057, interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final /* bridge */ boolean mo10211(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10236(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final /* bridge */ InterfaceC8057 mo10212(InterfaceC8060 interfaceC8060, int i) {
        return AbstractC5692.m10261(interfaceC8060, i);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final boolean mo10213(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        return AbstractC5692.m10247(interfaceC8048) != null;
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo10214(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10235(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final /* bridge */ boolean mo10215(InterfaceC8052 interfaceC8052) {
        return AbstractC5692.m10234(interfaceC8052);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final /* bridge */ InterfaceC8059 mo10216(InterfaceC8053 interfaceC8053) {
        return AbstractC5692.m10224(interfaceC8053);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final /* bridge */ TypeVariance mo10217(InterfaceC8057 interfaceC8057) {
        return AbstractC5692.m10255(interfaceC8057);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final /* bridge */ Collection mo10218(InterfaceC8060 interfaceC8060) {
        return AbstractC5692.m10277(interfaceC8060);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final /* bridge */ InterfaceC8059 mo10219(InterfaceC8049 interfaceC8049, int i) {
        return AbstractC5692.m10263(interfaceC8049, i);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final InterfaceC8049 mo10220(ArrayList arrayList) {
        AbstractC5710 abstractC5710;
        int size = arrayList.size();
        if (size == 0) {
            C6755.m11870("Expected some types");
            return null;
        }
        if (size == 1) {
            return (AbstractC5746) AbstractC5176.m9339(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC5746 abstractC5746 = (AbstractC5746) it.next();
            z = z || AbstractC5725.m10388(abstractC5746);
            if (abstractC5746 instanceof AbstractC5710) {
                abstractC5710 = (AbstractC5710) abstractC5746;
            } else {
                if (!(abstractC5746 instanceof AbstractC5728)) {
                    C5043.m9170();
                    return null;
                }
                abstractC5710 = ((AbstractC5728) abstractC5746).f14561;
                z2 = true;
            }
            arrayList2.add(abstractC5710);
        }
        if (z) {
            return C8069.m13029(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        C5689 c5689 = C5689.f14484;
        if (!z2) {
            return c5689.m10160(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC5725.m10366((AbstractC5746) it2.next()));
        }
        return AbstractC5725.m10368(c5689.m10160(arrayList2), c5689.m10160(arrayList3));
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final /* bridge */ Collection mo10221(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10223(this, interfaceC8048);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final boolean mo10222(InterfaceC8048 interfaceC8048) {
        interfaceC8048.getClass();
        return AbstractC5692.m10237(AbstractC5692.m10278(interfaceC8048));
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final /* bridge */ InterfaceC8048 mo10152(InterfaceC8050 interfaceC8050) {
        return AbstractC5692.m10276(interfaceC8050);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final /* bridge */ InterfaceC8048 mo10153(InterfaceC8050 interfaceC8050) {
        return AbstractC5692.m10226(interfaceC8050);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final /* bridge */ InterfaceC8048 mo10154(InterfaceC8048 interfaceC8048) {
        return AbstractC5692.m10272(interfaceC8048, false);
    }

    @Override // p113.InterfaceC8058
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo10196(InterfaceC8048 interfaceC8048, InterfaceC8060 interfaceC8060) {
    }
}
