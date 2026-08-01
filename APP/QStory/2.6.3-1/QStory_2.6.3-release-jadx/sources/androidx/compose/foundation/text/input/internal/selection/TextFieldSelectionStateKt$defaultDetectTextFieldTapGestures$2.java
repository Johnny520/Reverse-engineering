package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.InterfaceC1393;
import androidx.compose.foundation.interaction.InterfaceC1421;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2", m556f = "TextFieldSelectionState.kt", m557l = {1821}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC1421 $interactionSource;
    final /* synthetic */ AbstractC1681 $this_defaultDetectTextFieldTapGestures;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2(InterfaceC1421 interfaceC1421, AbstractC1681 abstractC1681, InterfaceC5189<? super TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2> interfaceC5189) {
        super(3, interfaceC5189);
        this.$interactionSource = interfaceC1421;
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m2222invoked4ec7I((InterfaceC1393) obj, ((C8158) obj2).f19886, (InterfaceC5189) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m2222invoked4ec7I(InterfaceC1393 interfaceC1393, long j, InterfaceC5189<? super C6008> interfaceC5189) {
        TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 = new TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2(this.$interactionSource, null, interfaceC5189);
        textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.L$0 = interfaceC1393;
        textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.J$0 = j;
        return textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC1393 interfaceC1393 = (InterfaceC1393) this.L$0;
            long j = this.J$0;
            InterfaceC1421 interfaceC1421 = this.$interactionSource;
            if (interfaceC1421 != null) {
                C0114xc08eaea3 c0114xc08eaea3 = new C0114xc08eaea3(interfaceC1393, null, j, interfaceC1421, null);
                this.label = 1;
                if (AbstractC6231.m11066(c0114xc08eaea3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
