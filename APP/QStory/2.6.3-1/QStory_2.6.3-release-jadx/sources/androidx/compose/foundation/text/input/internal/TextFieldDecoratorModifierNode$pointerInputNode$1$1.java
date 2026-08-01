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
import p068.InterfaceC7383;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", m556f = "TextFieldDecoratorModifier.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TextFieldDecoratorModifierNode$pointerInputNode$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2470 $this_SuspendingPointerInputModifierNode;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC1694 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1(AbstractC1694 abstractC1694, InterfaceC2470 interfaceC2470, InterfaceC5189<? super TextFieldDecoratorModifierNode$pointerInputNode$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_SuspendingPointerInputModifierNode = interfaceC2470;
    }

    private static final C6008 invokeSuspend$lambda$0$0(AbstractC1681 abstractC1681, AbstractC1694 abstractC1694) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TextFieldDecoratorModifierNode$pointerInputNode$1$1 textFieldDecoratorModifierNode$pointerInputNode$1$1 = new TextFieldDecoratorModifierNode$pointerInputNode$1$1(null, this.$this_SuspendingPointerInputModifierNode, interfaceC5189);
        textFieldDecoratorModifierNode$pointerInputNode$1$1.L$0 = obj;
        return textFieldDecoratorModifierNode$pointerInputNode$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        throw null;
    }
}
