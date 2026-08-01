package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.selection.C0922;
import androidx.compose.foundation.text.selection.InterfaceC0917;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$maybeSuggestSelectionRange$1", f = "TextFieldSelectionState.kt", l = {1120}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TextFieldSelectionState$maybeSuggestSelectionRange$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC0917 $platformSelectionBehaviors;
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    int label;
    final /* synthetic */ AbstractC0843 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$maybeSuggestSelectionRange$1(InterfaceC0917 interfaceC0917, CharSequence charSequence, long j, AbstractC0843 abstractC0843, InterfaceC4357<? super TextFieldSelectionState$maybeSuggestSelectionRange$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$platformSelectionBehaviors = interfaceC0917;
        this.$text = charSequence;
        this.$selection = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new TextFieldSelectionState$maybeSuggestSelectionRange$1(this.$platformSelectionBehaviors, this.$text, this.$selection, null, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TextFieldSelectionState$maybeSuggestSelectionRange$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC0917 interfaceC0917 = this.$platformSelectionBehaviors;
            CharSequence charSequence = this.$text;
            long j = this.$selection;
            this.label = 1;
            obj = ((C0922) interfaceC0917).m1860(charSequence, j, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        throw null;
    }
}
