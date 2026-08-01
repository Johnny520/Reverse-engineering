package androidx.compose.animation;

import androidx.compose.animation.core.C0354;
import androidx.compose.animation.core.C0364;
import androidx.compose.animation.core.InterfaceC0311;
import androidx.compose.animation.core.InterfaceC0353;
import androidx.compose.ui.InterfaceC2118;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p205.AbstractC7897;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0397 extends AbstractC0381 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final InterfaceC6558 f1326;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public long f1327 = -9223372034707292160L;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C0391 f1328;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final InterfaceC6558 f1329;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public InterfaceC2118 f1330;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C0364 f1331;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public InterfaceC6543 f1332;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public AbstractC0394 f1333;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public AbstractC0396 f1334;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C0354 f1335;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C0354 f1336;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C0354 f1337;

    public C0397(C0364 c0364, C0354 c0354, C0354 c03542, C0354 c03543, AbstractC0396 abstractC0396, AbstractC0394 abstractC0394, InterfaceC6543 interfaceC6543, C0391 c0391) {
        this.f1331 = c0364;
        this.f1337 = c0354;
        this.f1336 = c03542;
        this.f1335 = c03543;
        this.f1334 = abstractC0396;
        this.f1333 = abstractC0394;
        this.f1332 = interfaceC6543;
        this.f1328 = c0391;
        AbstractC7897.m13324(0, 0, 0, 0, 15);
        this.f1329 = new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$sizeTransitionSpec$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public final InterfaceC0311 invoke(InterfaceC0353 interfaceC0353) {
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                InterfaceC0311 interfaceC0311 = null;
                if (interfaceC0353.m1058(enterExitState, enterExitState2)) {
                    C0405 c0405 = ((C0395) this.this$0.f1334).f1324.f1392;
                    if (c0405 != null) {
                        interfaceC0311 = c0405.f1348;
                    }
                } else if (interfaceC0353.m1058(enterExitState2, EnterExitState.PostExit)) {
                    C0405 c04052 = ((C0393) this.this$0.f1333).f1321.f1392;
                    if (c04052 != null) {
                        interfaceC0311 = c04052.f1348;
                    }
                } else {
                    interfaceC0311 = AbstractC0387.f1299;
                }
                return interfaceC0311 == null ? AbstractC0387.f1299 : interfaceC0311;
            }
        };
        this.f1326 = new InterfaceC6558() { // from class: androidx.compose.animation.EnterExitTransitionModifierNode$slideSpec$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public final InterfaceC0311 invoke(InterfaceC0353 interfaceC0353) {
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (interfaceC0353.m1058(enterExitState, enterExitState2)) {
                    C0433 c0433 = ((C0395) this.this$0.f1334).f1324.f1393;
                    return c0433 != null ? c0433.f1396 : AbstractC0387.f1300;
                }
                if (!interfaceC0353.m1058(enterExitState2, EnterExitState.PostExit)) {
                    return AbstractC0387.f1300;
                }
                C0433 c04332 = ((C0393) this.this$0.f1333).f1321.f1393;
                return c04332 != null ? c04332.f1396 : AbstractC0387.f1300;
            }
        };
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final InterfaceC2118 m1100() {
        if (this.f1331.m1063().m1058(EnterExitState.PreEnter, EnterExitState.Visible)) {
            C0405 c0405 = ((C0395) this.f1334).f1324.f1392;
            if (c0405 != null) {
                return c0405.f1350;
            }
            C0405 c04052 = ((C0393) this.f1333).f1321.f1392;
            if (c04052 != null) {
                return c04052.f1350;
            }
            return null;
        }
        C0405 c04053 = ((C0393) this.f1333).f1321.f1392;
        if (c04053 != null) {
            return c04053.f1350;
        }
        C0405 c04054 = ((C0395) this.f1334).f1324.f1392;
        if (c04054 != null) {
            return c04054.f1350;
        }
        return null;
    }

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final void mo1101() {
        this.f1327 = -9223372034707292160L;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.layout.InterfaceC1657 mo1102(androidx.compose.ui.layout.InterfaceC1653 r23, androidx.compose.ui.layout.InterfaceC1655 r24, long r25) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.C0397.mo1102(androidx.compose.ui.layout.飘花落叶言子世兰哲楪苏, androidx.compose.ui.layout.飘花落叶言子世兰楪哲苏, long):androidx.compose.ui.layout.飘花落叶言子世兰苏哲楪");
    }
}
