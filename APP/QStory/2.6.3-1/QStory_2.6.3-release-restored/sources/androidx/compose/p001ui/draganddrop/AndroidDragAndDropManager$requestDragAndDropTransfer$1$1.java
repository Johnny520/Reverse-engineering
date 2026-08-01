package androidx.compose.p001ui.draganddrop;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class AndroidDragAndDropManager$requestDragAndDropTransfer$1$1 extends Lambda implements InterfaceC7372 {
    final /* synthetic */ Ref$BooleanRef $isTransferStarted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDragAndDropManager$requestDragAndDropTransfer$1$1(Ref$BooleanRef ref$BooleanRef) {
        super(0);
        this.$isTransferStarted = ref$BooleanRef;
    }

    @Override // p068.InterfaceC7372
    public final Boolean invoke() {
        return Boolean.valueOf(this.$isTransferStarted.element);
    }
}
