package androidx.compose.animation;

import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1573;
import androidx.compose.ui.graphics.InterfaceC1580;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class SkipToLookaheadSizeNode$measure$2 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ long $constrainedSize;
    final /* synthetic */ AbstractC1724 $p;
    final /* synthetic */ InterfaceC1653 $this_measure;
    final /* synthetic */ AbstractC0437 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkipToLookaheadSizeNode$measure$2(AbstractC0437 abstractC0437, AbstractC1724 abstractC1724, long j, InterfaceC1653 interfaceC1653) {
        super(1);
        this.this$0 = abstractC0437;
        this.$p = abstractC1724;
        this.$constrainedSize = j;
        this.$this_measure = interfaceC1653;
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC1708) obj);
        return C5176.f14739;
    }

    public final void invoke(AbstractC1708 abstractC1708) {
        throw null;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.SkipToLookaheadSizeNode$measure$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class AnonymousClass1 extends Lambda implements InterfaceC6558 {
        final /* synthetic */ long $resolvedScale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j) {
            super(1);
            this.$resolvedScale = j;
        }

        public final void invoke(InterfaceC1580 interfaceC1580) {
            C1573 c1573 = (C1573) interfaceC1580;
            c1573.m2865(Float.intBitsToFloat((int) (this.$resolvedScale >> 32)));
            c1573.m2866(Float.intBitsToFloat((int) (this.$resolvedScale & 4294967295L)));
            c1573.m2861(AbstractC1581.m2900(0.0f, 0.0f));
        }

        @Override // p052.InterfaceC6558
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1580) obj);
            return C5176.f14739;
        }
    }
}
