package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
final class FocusRestorerKt$saveFocusedChild$1$1 extends Lambda implements InterfaceC6542 {
    final /* synthetic */ int $previouslyFocusedChildHash;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusRestorerKt$saveFocusedChild$1$1(int i) {
        super(0);
        this.$previouslyFocusedChildHash = i;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        return Integer.valueOf(this.$previouslyFocusedChildHash);
    }
}
