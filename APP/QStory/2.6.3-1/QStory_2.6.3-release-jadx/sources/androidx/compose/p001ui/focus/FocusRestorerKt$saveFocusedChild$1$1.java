package androidx.compose.p001ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m151d2 = {"<anonymous>", "", "invoke"}, m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class FocusRestorerKt$saveFocusedChild$1$1 extends Lambda implements InterfaceC7372 {
    final /* synthetic */ int $previouslyFocusedChildHash;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusRestorerKt$saveFocusedChild$1$1(int i) {
        super(0);
        this.$previouslyFocusedChildHash = i;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        return Integer.valueOf(this.$previouslyFocusedChildHash);
    }
}
