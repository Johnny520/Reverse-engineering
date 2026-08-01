package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.provider.AbstractC0833;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0834;
import androidx.compose.ui.node.AbstractC1785;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6557;
import p112.C7328;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TextContextMenuGestureNode$1$1 extends FunctionReferenceImpl implements InterfaceC6557 {
    public TextContextMenuGestureNode$1$1(Object obj) {
        super(1, obj, C0821.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0);
    }

    @Override // p052.InterfaceC6557
    public /* synthetic */ Object invoke(Object obj) {
        m1627invokek4lQ0M(((C7328) obj).f19546);
        return C5175.f14739;
    }

    /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m1627invokek4lQ0M(long j) {
        C0821 c0821 = (C0821) this.receiver;
        c0821.getClass();
        InterfaceC0834 interfaceC0834 = (InterfaceC0834) AbstractC1785.m3346(c0821, AbstractC0833.f2368);
        if (interfaceC0834 == null) {
            return;
        }
        AbstractC5398.m10473(c0821.m3857(), null, null, new TextContextMenuGestureNode$tryShowContextMenu$1(c0821, j, interfaceC0834, new C0822(c0821, j), null), 3);
    }
}
