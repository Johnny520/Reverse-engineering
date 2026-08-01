package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.InterfaceC0552;
import androidx.compose.foundation.interaction.InterfaceC0580;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2", f = "TextFieldSelectionState.kt", l = {1821}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC0580 $interactionSource;
    final /* synthetic */ AbstractC0843 $this_defaultDetectTextFieldTapGestures;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2(InterfaceC0580 interfaceC0580, AbstractC0843 abstractC0843, InterfaceC4357<? super TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2> interfaceC4357) {
        super(3, interfaceC4357);
        this.$interactionSource = interfaceC0580;
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m1662invoked4ec7I((InterfaceC0552) obj, ((C7329) obj2).f19541, (InterfaceC4357) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m1662invoked4ec7I(InterfaceC0552 interfaceC0552, long j, InterfaceC4357<? super C5176> interfaceC4357) {
        TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 = new TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2(this.$interactionSource, null, interfaceC4357);
        textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.L$0 = interfaceC0552;
        textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.J$0 = j;
        return textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC0552 interfaceC0552 = (InterfaceC0552) this.L$0;
            long j = this.J$0;
            InterfaceC0580 interfaceC0580 = this.$interactionSource;
            if (interfaceC0580 != null) {
                TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 = new TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1(interfaceC0552, null, j, interfaceC0580, null);
                this.label = 1;
                if (AbstractC5399.m10507(textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
