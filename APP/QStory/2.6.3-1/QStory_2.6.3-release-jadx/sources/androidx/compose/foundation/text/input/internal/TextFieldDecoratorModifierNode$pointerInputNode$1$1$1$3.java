package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.AbstractC1681;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
@InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3", m556f = "TextFieldDecoratorModifier.kt", m557l = {269}, m558m = "invokeSuspend", m559v = 1)
public final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7372 $requestFocus;
    final /* synthetic */ InterfaceC2470 $this_SuspendingPointerInputModifierNode;
    final /* synthetic */ AbstractC1681 $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3(AbstractC1681 abstractC1681, InterfaceC2470 interfaceC2470, InterfaceC7372 interfaceC7372, InterfaceC5189<? super TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_SuspendingPointerInputModifierNode = interfaceC2470;
        this.$requestFocus = interfaceC7372;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3(null, this.$this_SuspendingPointerInputModifierNode, this.$requestFocus, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
