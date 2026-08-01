package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.AbstractC0843;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", f = "TextFieldDecoratorModifier.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TextFieldDecoratorModifierNode$pointerInputNode$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC1635 $this_SuspendingPointerInputModifierNode;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC0856 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1(AbstractC0856 abstractC0856, InterfaceC1635 interfaceC1635, InterfaceC4357<? super TextFieldDecoratorModifierNode$pointerInputNode$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_SuspendingPointerInputModifierNode = interfaceC1635;
    }

    private static final C5176 invokeSuspend$lambda$0$0(AbstractC0843 abstractC0843, AbstractC0856 abstractC0856) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TextFieldDecoratorModifierNode$pointerInputNode$1$1 textFieldDecoratorModifierNode$pointerInputNode$1$1 = new TextFieldDecoratorModifierNode$pointerInputNode$1$1(null, this.$this_SuspendingPointerInputModifierNode, interfaceC4357);
        textFieldDecoratorModifierNode$pointerInputNode$1$1.L$0 = obj;
        return textFieldDecoratorModifierNode$pointerInputNode$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5185.m10210(obj);
        throw null;
    }
}
