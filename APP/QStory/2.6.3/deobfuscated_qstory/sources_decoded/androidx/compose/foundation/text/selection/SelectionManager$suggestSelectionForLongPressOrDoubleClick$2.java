package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.C2035;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.selection.SelectionManager$suggestSelectionForLongPressOrDoubleClick$2", f = "SelectionManager.kt", l = {455}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class SelectionManager$suggestSelectionForLongPressOrDoubleClick$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Ref$ObjectRef<C2035> $selectionInSelectable;
    final /* synthetic */ Ref$LongRef $targetSelectableId;
    final /* synthetic */ Ref$ObjectRef<CharSequence> $textInSelectable;
    int label;
    final /* synthetic */ AbstractC0899 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$suggestSelectionForLongPressOrDoubleClick$2(AbstractC0899 abstractC0899, Ref$ObjectRef<CharSequence> ref$ObjectRef, Ref$ObjectRef<C2035> ref$ObjectRef2, Ref$LongRef ref$LongRef, InterfaceC4357<? super SelectionManager$suggestSelectionForLongPressOrDoubleClick$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$textInSelectable = ref$ObjectRef;
        this.$selectionInSelectable = ref$ObjectRef2;
        this.$targetSelectableId = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new SelectionManager$suggestSelectionForLongPressOrDoubleClick$2(null, this.$textInSelectable, this.$selectionInSelectable, this.$targetSelectableId, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SelectionManager$suggestSelectionForLongPressOrDoubleClick$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C2035 c2035 = (C2035) obj;
        if (c2035 == null || c2035.equals(this.$selectionInSelectable.element)) {
            return C5176.f14739;
        }
        throw null;
    }
}
