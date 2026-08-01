package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.AbstractC0843;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import com.android.dx.io.Opcodes;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
@InterfaceC6862(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2", f = "TextFieldDecoratorModifier.kt", l = {Opcodes.CONST_METHOD_TYPE}, m = "invokeSuspend", v = 1)
public final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6543 $requestFocus;
    final /* synthetic */ InterfaceC1635 $this_SuspendingPointerInputModifierNode;
    final /* synthetic */ AbstractC0843 $this_with;
    int label;
    final /* synthetic */ AbstractC0856 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(AbstractC0856 abstractC0856, AbstractC0843 abstractC0843, InterfaceC1635 interfaceC1635, InterfaceC6543 interfaceC6543, InterfaceC4357<? super TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_SuspendingPointerInputModifierNode = interfaceC1635;
        this.$requestFocus = interfaceC6543;
    }

    private static final C5176 invokeSuspend$lambda$0(AbstractC0856 abstractC0856) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(null, null, this.$this_SuspendingPointerInputModifierNode, this.$requestFocus, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC5185.m10210(obj);
            return C5176.f14739;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
