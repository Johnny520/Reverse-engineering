package androidx.compose.foundation.text.selection;

import com.android.dx.io.Opcodes;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.selection.SelectionManager$contextMenuAreaModifier$2", f = "SelectionManager.kt", l = {Opcodes.XOR_INT_LIT16}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
final class SelectionManager$contextMenuAreaModifier$2 extends SuspendLambda implements InterfaceC6557 {
    int label;
    final /* synthetic */ AbstractC0899 this$0;

    public SelectionManager$contextMenuAreaModifier$2(AbstractC0899 abstractC0899, InterfaceC4356<? super SelectionManager$contextMenuAreaModifier$2> interfaceC4356) {
        super(1, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(InterfaceC4356<?> interfaceC4356) {
        return new SelectionManager$contextMenuAreaModifier$2(null, interfaceC4356);
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SelectionManager$contextMenuAreaModifier$2) create(interfaceC4356)).invokeSuspend(C5175.f14739);
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
