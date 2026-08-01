package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.AbstractC0843;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import com.android.dx.io.Opcodes;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
@InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2", f = "TextFieldDecoratorModifier.kt", l = {Opcodes.CONST_METHOD_TYPE}, m = "invokeSuspend", v = 1)
public final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6542 $requestFocus;
    final /* synthetic */ InterfaceC1635 $this_SuspendingPointerInputModifierNode;
    final /* synthetic */ AbstractC0843 $this_with;
    int label;
    final /* synthetic */ AbstractC0856 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(AbstractC0856 abstractC0856, AbstractC0843 abstractC0843, InterfaceC1635 interfaceC1635, InterfaceC6542 interfaceC6542, InterfaceC4356<? super TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_SuspendingPointerInputModifierNode = interfaceC1635;
        this.$requestFocus = interfaceC6542;
    }

    private static final C5175 invokeSuspend$lambda$0(AbstractC0856 abstractC0856) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(null, null, this.$this_SuspendingPointerInputModifierNode, this.$requestFocus, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC5184.m10206(obj);
            return C5175.f14739;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
