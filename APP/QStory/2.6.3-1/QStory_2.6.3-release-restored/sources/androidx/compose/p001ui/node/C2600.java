package androidx.compose.p001ui.node;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.layout.InterfaceC2493;
import androidx.compose.p001ui.platform.InterfaceC2698;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.InterfaceC2201;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p221.InterfaceC8725;
import p226.AbstractC8765;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2600 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC7383 f5526;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC7383 f5527;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final InterfaceC7383 f5528;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC7372 f5529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC7372 f5530;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ C2600 f5531 = new C2600();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final InterfaceC7387 f5532;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final InterfaceC7383 f5533;

    static {
        C2586 c2586 = C2583.f5434;
        f5530 = C2583.f5436;
        f5529 = new InterfaceC7372() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            @Override // p068.InterfaceC7372
            public final C2583 invoke() {
                return new C2583(2);
            }
        };
        f5528 = new InterfaceC7383() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2619) obj, (InterfaceC2962) obj2);
                return C6008.f15084;
            }

            public final void invoke(InterfaceC2619 interfaceC2619, InterfaceC2962 interfaceC2962) {
                ((C2583) interfaceC2619).m3830(interfaceC2962);
            }
        };
        ComposeUiNode$Companion$SetDensity$1 composeUiNode$Companion$SetDensity$1 = new InterfaceC7383() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2619) obj, (InterfaceC8725) obj2);
                return C6008.f15084;
            }

            public final void invoke(InterfaceC2619 interfaceC2619, InterfaceC8725 interfaceC8725) {
                ((C2583) interfaceC2619).m3835(interfaceC8725);
            }
        };
        f5527 = new InterfaceC7383() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2619) obj, (InterfaceC2201) obj2);
                return C6008.f15084;
            }

            public final void invoke(InterfaceC2619 interfaceC2619, InterfaceC2201 interfaceC2201) {
                ((C2583) interfaceC2619).m3834(interfaceC2201);
            }
        };
        f5526 = new InterfaceC7383() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2619) obj, (InterfaceC2493) obj2);
                return C6008.f15084;
            }

            public final void invoke(InterfaceC2619 interfaceC2619, InterfaceC2493 interfaceC2493) {
                ((C2583) interfaceC2619).m3831(interfaceC2493);
            }
        };
        ComposeUiNode$Companion$SetLayoutDirection$1 composeUiNode$Companion$SetLayoutDirection$1 = new InterfaceC7383() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            public final void invoke(InterfaceC2619 interfaceC2619, LayoutDirection layoutDirection) {
                C2583 c2583 = (C2583) interfaceC2619;
                if (c2583.f5445 != layoutDirection) {
                    c2583.f5445 = layoutDirection;
                    c2583.m3806();
                    C2583 c2583M3816 = c2583.m3816();
                    if (c2583M3816 != null) {
                        c2583M3816.m3796();
                    } else {
                        InterfaceC2636 interfaceC2636 = c2583.f5450;
                        if (interfaceC2636 != null) {
                            ((ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636).invalidate();
                        }
                    }
                    c2583.m3795();
                    for (AbstractC2961 abstractC2961 = c2583.f5439.f5628; abstractC2961 != null; abstractC2961 = abstractC2961.f6633) {
                        abstractC2961.mo2433();
                    }
                }
            }

            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2619) obj, (LayoutDirection) obj2);
                return C6008.f15084;
            }
        };
        ComposeUiNode$Companion$SetViewConfiguration$1 composeUiNode$Companion$SetViewConfiguration$1 = new InterfaceC7383() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2619) obj, (InterfaceC2698) obj2);
                return C6008.f15084;
            }

            public final void invoke(InterfaceC2619 interfaceC2619, InterfaceC2698 interfaceC2698) {
                ((C2583) interfaceC2619).m3829(interfaceC2698);
            }
        };
        f5533 = new InterfaceC7383() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((InterfaceC2619) obj, ((Number) obj2).intValue());
                return C6008.f15084;
            }

            public final void invoke(InterfaceC2619 interfaceC2619, int i) {
                ((C2583) interfaceC2619).getClass();
            }
        };
        f5532 = new InterfaceC7387() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1
            public final void invoke(InterfaceC2619 interfaceC2619) {
                C2583 c2583 = interfaceC2619 instanceof C2583 ? (C2583) interfaceC2619 : null;
                if (c2583 == null || !c2583.f5471) {
                    return;
                }
                AbstractC8765.m13982("Apply is called on deactivated node " + interfaceC2619);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2619) obj);
                return C6008.f15084;
            }
        };
    }
}
