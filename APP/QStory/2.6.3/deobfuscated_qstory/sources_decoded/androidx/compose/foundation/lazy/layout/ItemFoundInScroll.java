package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C0350;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "", "itemOffset", "Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;", "", "Landroidx/compose/animation/core/飘花落叶言子楪苏兰世哲;", "previousAnimation", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILandroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;)V", "I", "getItemOffset", "()I", "Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;", "getPreviousAnimation", "()Landroidx/compose/animation/core/飘花落叶言子楪苏哲兰世;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ItemFoundInScroll extends CancellationException {
    private final int itemOffset;
    private final C0350 previousAnimation;

    public ItemFoundInScroll(int i, C0350 c0350) {
        this.itemOffset = i;
        this.previousAnimation = c0350;
    }

    public final int getItemOffset() {
        return this.itemOffset;
    }

    public final C0350 getPreviousAnimation() {
        return this.previousAnimation;
    }
}
