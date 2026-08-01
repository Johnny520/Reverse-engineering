package androidx.compose.animation;

import androidx.compose.ui.graphics.C1599;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/EnterExitState;", "it", "Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;", "invoke-vNxB06k", "(Landroidx/compose/animation/EnterExitState;)J", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class VeilModifierNode$draw$veilColor$2 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ AbstractC0431 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VeilModifierNode$draw$veilColor$2(AbstractC0431 abstractC0431) {
        super(1);
        this.this$0 = abstractC0431;
    }

    @Override // p052.InterfaceC6558
    public /* synthetic */ Object invoke(Object obj) {
        return new C1599(m921invokevNxB06k((EnterExitState) obj));
    }

    /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
    public final long m921invokevNxB06k(EnterExitState enterExitState) {
        int i = AbstractC0432.f1395[enterExitState.ordinal()];
        if (i == 1) {
            this.this$0.getClass();
            throw null;
        }
        if (i == 2) {
            this.this$0.getClass();
            throw null;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.getClass();
        throw null;
    }
}
