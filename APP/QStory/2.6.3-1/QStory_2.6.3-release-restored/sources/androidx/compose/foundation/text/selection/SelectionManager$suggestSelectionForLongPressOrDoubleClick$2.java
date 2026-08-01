package androidx.compose.foundation.text.selection;

import androidx.compose.p001ui.text.C2869;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.SelectionManager$suggestSelectionForLongPressOrDoubleClick$2", m556f = "SelectionManager.kt", m557l = {455}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class SelectionManager$suggestSelectionForLongPressOrDoubleClick$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Ref$ObjectRef<C2869> $selectionInSelectable;
    final /* synthetic */ Ref$LongRef $targetSelectableId;
    final /* synthetic */ Ref$ObjectRef<CharSequence> $textInSelectable;
    int label;
    final /* synthetic */ AbstractC1737 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$suggestSelectionForLongPressOrDoubleClick$2(AbstractC1737 abstractC1737, Ref$ObjectRef<CharSequence> ref$ObjectRef, Ref$ObjectRef<C2869> ref$ObjectRef2, Ref$LongRef ref$LongRef, InterfaceC5189<? super SelectionManager$suggestSelectionForLongPressOrDoubleClick$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$textInSelectable = ref$ObjectRef;
        this.$selectionInSelectable = ref$ObjectRef2;
        this.$targetSelectableId = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new SelectionManager$suggestSelectionForLongPressOrDoubleClick$2(null, this.$textInSelectable, this.$selectionInSelectable, this.$targetSelectableId, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SelectionManager$suggestSelectionForLongPressOrDoubleClick$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C2869 c2869 = (C2869) obj;
        if (c2869 == null || c2869.equals(this.$selectionInSelectable.element)) {
            return C6008.f15084;
        }
        throw null;
    }
}
