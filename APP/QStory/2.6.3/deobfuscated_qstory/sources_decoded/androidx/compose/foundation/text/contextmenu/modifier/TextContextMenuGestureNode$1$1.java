package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.provider.AbstractC0833;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0834;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6558;
import p112.C7329;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TextContextMenuGestureNode$1$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    public TextContextMenuGestureNode$1$1(Object obj) {
        super(1, obj, C0821.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0);
    }

    @Override // p052.InterfaceC6558
    public /* synthetic */ Object invoke(Object obj) {
        m1637invokek4lQ0M(((C7329) obj).f19541);
        return C5176.f14739;
    }

    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m1637invokek4lQ0M(long j) {
        C0821 c0821 = (C0821) this.receiver;
        c0821.getClass();
        InterfaceC0834 interfaceC0834 = (InterfaceC0834) AbstractC1785.m3356(c0821, AbstractC0833.f2369);
        if (interfaceC0834 == null) {
            return;
        }
        AbstractC5399.m10477(c0821.m3867(), null, null, new TextContextMenuGestureNode$tryShowContextMenu$1(c0821, j, interfaceC0834, new C0822(c0821, j), null), 3);
    }
}
