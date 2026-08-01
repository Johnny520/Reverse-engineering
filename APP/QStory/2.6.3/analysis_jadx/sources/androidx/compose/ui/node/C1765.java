package androidx.compose.ui.node;

import androidx.compose.runtime.InterfaceC1366;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.InterfaceC2129;
import androidx.compose.ui.layout.InterfaceC1658;
import androidx.compose.ui.platform.InterfaceC1863;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p205.InterfaceC7896;
import p210.AbstractC7936;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1765 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC6554 f5181;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC6554 f5182;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC6554 f5183;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC6543 f5184;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC6543 f5185;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ C1765 f5186 = new C1765();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final InterfaceC6558 f5187;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final InterfaceC6554 f5188;

    static {
        C1751 c1751 = C1748.f5089;
        f5185 = C1748.f5091;
        f5184 = new InterfaceC6543() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            @Override // p052.InterfaceC6543
            public final C1748 invoke() {
                return new C1748(2);
            }
        };
        f5183 = new InterfaceC6554() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            @Override // p052.InterfaceC6554
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC1784) obj, (InterfaceC2129) obj2);
                return C5176.f14739;
            }

            public final void invoke(InterfaceC1784 interfaceC1784, InterfaceC2129 interfaceC2129) {
                ((C1748) interfaceC1784).m3270(interfaceC2129);
            }
        };
        ComposeUiNode$Companion$SetDensity$1 composeUiNode$Companion$SetDensity$1 = new InterfaceC6554() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            @Override // p052.InterfaceC6554
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC1784) obj, (InterfaceC7896) obj2);
                return C5176.f14739;
            }

            public final void invoke(InterfaceC1784 interfaceC1784, InterfaceC7896 interfaceC7896) {
                ((C1748) interfaceC1784).m3275(interfaceC7896);
            }
        };
        f5182 = new InterfaceC6554() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
            @Override // p052.InterfaceC6554
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC1784) obj, (InterfaceC1366) obj2);
                return C5176.f14739;
            }

            public final void invoke(InterfaceC1784 interfaceC1784, InterfaceC1366 interfaceC1366) {
                ((C1748) interfaceC1784).m3274(interfaceC1366);
            }
        };
        f5181 = new InterfaceC6554() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            @Override // p052.InterfaceC6554
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC1784) obj, (InterfaceC1658) obj2);
                return C5176.f14739;
            }

            public final void invoke(InterfaceC1784 interfaceC1784, InterfaceC1658 interfaceC1658) {
                ((C1748) interfaceC1784).m3271(interfaceC1658);
            }
        };
        ComposeUiNode$Companion$SetLayoutDirection$1 composeUiNode$Companion$SetLayoutDirection$1 = new InterfaceC6554() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            public final void invoke(InterfaceC1784 interfaceC1784, LayoutDirection layoutDirection) {
                C1748 c1748 = (C1748) interfaceC1784;
                if (c1748.f5100 != layoutDirection) {
                    c1748.f5100 = layoutDirection;
                    c1748.m3246();
                    C1748 c1748M3256 = c1748.m3256();
                    if (c1748M3256 != null) {
                        c1748M3256.m3236();
                    } else {
                        InterfaceC1801 interfaceC1801 = c1748.f5105;
                        if (interfaceC1801 != null) {
                            ((ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801).invalidate();
                        }
                    }
                    c1748.m3235();
                    for (AbstractC2128 abstractC2128 = c1748.f5094.f5283; abstractC2128 != null; abstractC2128 = abstractC2128.f6288) {
                        abstractC2128.mo1873();
                    }
                }
            }

            @Override // p052.InterfaceC6554
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC1784) obj, (LayoutDirection) obj2);
                return C5176.f14739;
            }
        };
        ComposeUiNode$Companion$SetViewConfiguration$1 composeUiNode$Companion$SetViewConfiguration$1 = new InterfaceC6554() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            @Override // p052.InterfaceC6554
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC1784) obj, (InterfaceC1863) obj2);
                return C5176.f14739;
            }

            public final void invoke(InterfaceC1784 interfaceC1784, InterfaceC1863 interfaceC1863) {
                ((C1748) interfaceC1784).m3269(interfaceC1863);
            }
        };
        f5188 = new InterfaceC6554() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
            @Override // p052.InterfaceC6554
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC1784) obj, ((Number) obj2).intValue());
                return C5176.f14739;
            }

            public final void invoke(InterfaceC1784 interfaceC1784, int i) {
                ((C1748) interfaceC1784).getClass();
            }
        };
        f5187 = new InterfaceC6558() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1
            public final void invoke(InterfaceC1784 interfaceC1784) {
                C1748 c1748 = interfaceC1784 instanceof C1748 ? (C1748) interfaceC1784 : null;
                if (c1748 == null || !c1748.f5126) {
                    return;
                }
                AbstractC7936.m13423("Apply is called on deactivated node " + interfaceC1784);
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1784) obj);
                return C5176.f14739;
            }
        };
    }
}
