package androidx.compose.p001ui.viewinterop;

import androidx.compose.foundation.lazy.layout.C1542;
import androidx.compose.p001ui.focus.InterfaceC2291;
import androidx.compose.p001ui.layout.InterfaceC2545;
import androidx.compose.p001ui.node.AbstractC2620;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7383;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final /* synthetic */ class FocusTargetInteropNode$focusTargetNode$1 extends FunctionReferenceImpl implements InterfaceC7383 {
    public FocusTargetInteropNode$focusTargetNode$1(Object obj) {
        super(2, obj, C2914.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    public final void invoke(InterfaceC2291 interfaceC2291, InterfaceC2291 interfaceC22912) {
        boolean zIsFocused;
        C2914 c2914 = (C2914) this.receiver;
        if (c2914.f6624 && (zIsFocused = interfaceC22912.isFocused()) != interfaceC2291.isFocused()) {
            C1542 c1542 = null;
            if (!zIsFocused) {
                C1542 c15422 = c2914.f6524;
                if (c15422 != null) {
                    c15422.m2059();
                }
                c2914.f6524 = null;
                return;
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            AbstractC2620.m3904(c2914, new FocusTargetInteropNode$retrievePinnableContainer$1(ref$ObjectRef, c2914));
            InterfaceC2545 interfaceC2545 = (InterfaceC2545) ref$ObjectRef.element;
            if (interfaceC2545 != null) {
                c1542 = (C1542) interfaceC2545;
                c1542.m2060();
            }
            c2914.f6524 = c1542;
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2291) obj, (InterfaceC2291) obj2);
        return C6008.f15084;
    }
}
