package androidx.compose.ui.viewinterop;

import androidx.compose.foundation.lazy.layout.C0701;
import androidx.compose.ui.focus.InterfaceC1456;
import androidx.compose.ui.layout.InterfaceC1710;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6554;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class FocusTargetInteropNode$focusTargetNode$1 extends FunctionReferenceImpl implements InterfaceC6554 {
    public FocusTargetInteropNode$focusTargetNode$1(Object obj) {
        super(2, obj, C2081.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    public final void invoke(InterfaceC1456 interfaceC1456, InterfaceC1456 interfaceC14562) {
        boolean zIsFocused;
        C2081 c2081 = (C2081) this.receiver;
        if (c2081.f6279 && (zIsFocused = interfaceC14562.isFocused()) != interfaceC1456.isFocused()) {
            C0701 c0701 = null;
            if (!zIsFocused) {
                C0701 c07012 = c2081.f6179;
                if (c07012 != null) {
                    c07012.m1499();
                }
                c2081.f6179 = null;
                return;
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            AbstractC1785.m3344(c2081, new FocusTargetInteropNode$retrievePinnableContainer$1(ref$ObjectRef, c2081));
            InterfaceC1710 interfaceC1710 = (InterfaceC1710) ref$ObjectRef.element;
            if (interfaceC1710 != null) {
                c0701 = (C0701) interfaceC1710;
                c0701.m1500();
            }
            c2081.f6179 = c0701;
        }
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1456) obj, (InterfaceC1456) obj2);
        return C5176.f14739;
    }
}
