package androidx.compose.foundation;

import androidx.activity.compose.C0004;
import androidx.compose.foundation.interaction.C0566;
import androidx.compose.foundation.interaction.C0578;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.foundation.lazy.layout.C0701;
import androidx.compose.ui.focus.InterfaceC1456;
import androidx.compose.ui.layout.InterfaceC1710;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1794;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class FocusableNode$focusTargetNode$1 extends FunctionReferenceImpl implements InterfaceC6554 {
    public FocusableNode$focusTargetNode$1(Object obj) {
        super(2, obj, C1024.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    public final void invoke(InterfaceC1456 interfaceC1456, InterfaceC1456 interfaceC14562) {
        boolean zIsFocused;
        C0701 c0701;
        C1024 c1024 = (C1024) this.receiver;
        if (c1024.f6279 && (zIsFocused = interfaceC14562.isFocused()) != interfaceC1456.isFocused()) {
            InterfaceC6558 interfaceC6558 = c1024.f3000;
            if (interfaceC6558 != null) {
                interfaceC6558.invoke(Boolean.valueOf(zIsFocused));
            }
            C1086 c1086 = AbstractC1023.f2994;
            if (zIsFocused) {
                AbstractC5399.m10477(c1024.m3867(), null, null, new FocusableNode$onFocusStateChange$1(c1024, null), 3);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                AbstractC1785.m3344(c1024, new C0004(ref$ObjectRef, 2, c1024));
                InterfaceC1710 interfaceC1710 = (InterfaceC1710) ref$ObjectRef.element;
                if (interfaceC1710 != null) {
                    c0701 = (C0701) interfaceC1710;
                    c0701.m1500();
                } else {
                    c0701 = null;
                }
                c1024.f2998 = c0701;
                AbstractC1794 abstractC1794 = c1024.f2997;
                if (abstractC1794 != null && abstractC1794.mo3282().f6279 && c1024.f6279) {
                    AbstractC1785.m3361(c1024, c1086);
                }
            } else {
                C0701 c07012 = c1024.f2998;
                if (c07012 != null) {
                    c07012.m1499();
                }
                c1024.f2998 = null;
                if (c1024.f6279) {
                    AbstractC1785.m3361(c1024, c1086);
                }
            }
            AbstractC1785.m3354(c1024);
            InterfaceC0580 interfaceC0580 = c1024.f3001;
            if (interfaceC0580 != null) {
                C0566 c0566 = c1024.f2999;
                if (!zIsFocused) {
                    if (c0566 != null) {
                        c1024.m1927(interfaceC0580, new C0578(c0566));
                        c1024.f2999 = null;
                        return;
                    }
                    return;
                }
                if (c0566 != null) {
                    c1024.m1927(interfaceC0580, new C0578(c0566));
                    c1024.f2999 = null;
                }
                C0566 c05662 = new C0566();
                c1024.m1927(interfaceC0580, c05662);
                c1024.f2999 = c05662;
            }
        }
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC1456) obj, (InterfaceC1456) obj2);
        return C5176.f14739;
    }
}
