package androidx.compose.animation;

import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2408;
import androidx.compose.p001ui.graphics.InterfaceC2415;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/layout/飘花落叶言子苏世兰哲楪;)V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class SkipToLookaheadSizeNode$measure$2 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ long $constrainedSize;

    /* JADX INFO: renamed from: $p */
    final /* synthetic */ AbstractC2559 f1$p;
    final /* synthetic */ InterfaceC2488 $this_measure;
    final /* synthetic */ AbstractC1283 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkipToLookaheadSizeNode$measure$2(AbstractC1283 abstractC1283, AbstractC2559 abstractC2559, long j, InterfaceC2488 interfaceC2488) {
        super(1);
        this.this$0 = abstractC1283;
        this.f1$p = abstractC2559;
        this.$constrainedSize = j;
        this.$this_measure = interfaceC2488;
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC2543) obj);
        return C6008.f15084;
    }

    public final void invoke(AbstractC2543 abstractC2543) {
        throw null;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.SkipToLookaheadSizeNode$measure$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/graphics/飘花落叶言子世楪兰苏哲;)V", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
    public static final class C00181 extends Lambda implements InterfaceC7387 {
        final /* synthetic */ long $resolvedScale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00181(long j) {
            super(1);
            this.$resolvedScale = j;
        }

        public final void invoke(InterfaceC2415 interfaceC2415) {
            C2408 c2408 = (C2408) interfaceC2415;
            c2408.m3425(Float.intBitsToFloat((int) (this.$resolvedScale >> 32)));
            c2408.m3426(Float.intBitsToFloat((int) (this.$resolvedScale & 4294967295L)));
            c2408.m3421(AbstractC2416.m3460(0.0f, 0.0f));
        }

        @Override // p068.InterfaceC7387
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC2415) obj);
            return C6008.f15084;
        }
    }
}
