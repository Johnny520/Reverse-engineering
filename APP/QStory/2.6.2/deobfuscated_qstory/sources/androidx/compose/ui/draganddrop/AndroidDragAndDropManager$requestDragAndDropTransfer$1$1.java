package androidx.compose.ui.draganddrop;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0}, xi = 48)
final class AndroidDragAndDropManager$requestDragAndDropTransfer$1$1 extends Lambda implements InterfaceC6542 {
    final /* synthetic */ Ref$BooleanRef $isTransferStarted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDragAndDropManager$requestDragAndDropTransfer$1$1(Ref$BooleanRef ref$BooleanRef) {
        super(0);
        this.$isTransferStarted = ref$BooleanRef;
    }

    @Override // p052.InterfaceC6542
    public final Boolean invoke() {
        return Boolean.valueOf(this.$isTransferStarted.element);
    }
}
