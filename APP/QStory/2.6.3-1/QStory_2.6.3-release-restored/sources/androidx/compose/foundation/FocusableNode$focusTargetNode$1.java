package androidx.compose.foundation;

import androidx.activity.compose.C0851;
import androidx.compose.foundation.interaction.C1407;
import androidx.compose.foundation.interaction.C1419;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.foundation.lazy.layout.C1542;
import androidx.compose.p001ui.focus.InterfaceC2291;
import androidx.compose.p001ui.layout.InterfaceC2545;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2629;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final /* synthetic */ class FocusableNode$focusTargetNode$1 extends FunctionReferenceImpl implements InterfaceC7383 {
    public FocusableNode$focusTargetNode$1(Object obj) {
        super(2, obj, C1862.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    public final void invoke(InterfaceC2291 interfaceC2291, InterfaceC2291 interfaceC22912) {
        boolean zIsFocused;
        C1542 c1542;
        C1862 c1862 = (C1862) this.receiver;
        if (c1862.f6624 && (zIsFocused = interfaceC22912.isFocused()) != interfaceC2291.isFocused()) {
            InterfaceC7387 interfaceC7387 = c1862.f3345;
            if (interfaceC7387 != null) {
                interfaceC7387.invoke(Boolean.valueOf(zIsFocused));
            }
            C1924 c1924 = AbstractC1861.f3339;
            if (zIsFocused) {
                AbstractC6231.m11036(c1862.m4427(), null, null, new FocusableNode$onFocusStateChange$1(c1862, null), 3);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                AbstractC2620.m3904(c1862, new C0851(ref$ObjectRef, 2, c1862));
                InterfaceC2545 interfaceC2545 = (InterfaceC2545) ref$ObjectRef.element;
                if (interfaceC2545 != null) {
                    c1542 = (C1542) interfaceC2545;
                    c1542.m2060();
                } else {
                    c1542 = null;
                }
                c1862.f3343 = c1542;
                AbstractC2629 abstractC2629 = c1862.f3342;
                if (abstractC2629 != null && abstractC2629.mo3842().f6624 && c1862.f6624) {
                    AbstractC2620.m3921(c1862, c1924);
                }
            } else {
                C1542 c15422 = c1862.f3343;
                if (c15422 != null) {
                    c15422.m2059();
                }
                c1862.f3343 = null;
                if (c1862.f6624) {
                    AbstractC2620.m3921(c1862, c1924);
                }
            }
            AbstractC2620.m3914(c1862);
            InterfaceC1421 interfaceC1421 = c1862.f3346;
            if (interfaceC1421 != null) {
                C1407 c1407 = c1862.f3344;
                if (!zIsFocused) {
                    if (c1407 != null) {
                        c1862.m2487(interfaceC1421, new C1419(c1407));
                        c1862.f3344 = null;
                        return;
                    }
                    return;
                }
                if (c1407 != null) {
                    c1862.m2487(interfaceC1421, new C1419(c1407));
                    c1862.f3344 = null;
                }
                C1407 c14072 = new C1407();
                c1862.m2487(interfaceC1421, c14072);
                c1862.f3344 = c14072;
            }
        }
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2291) obj, (InterfaceC2291) obj2);
        return C6008.f15084;
    }
}
