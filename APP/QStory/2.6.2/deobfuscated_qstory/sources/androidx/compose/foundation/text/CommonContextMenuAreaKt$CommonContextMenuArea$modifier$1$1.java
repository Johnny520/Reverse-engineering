package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.AbstractC0843;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1", f = "CommonContextMenuArea.kt", l = {82, 83}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "clickLocation", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AbstractC0843 $selectionState;
    /* synthetic */ long J$0;
    int label;

    public CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(AbstractC0843 abstractC0843, InterfaceC4356<? super CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 = new CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(null, interfaceC4356);
        commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1.J$0 = ((C7328) obj).f19546;
        return commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1;
    }

    @Override // p052.InterfaceC6553
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1571invoke3MmeM6k(((C7328) obj).f19546, (InterfaceC4356) obj2);
    }

    /* JADX INFO: renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m1571invoke3MmeM6k(long j, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1) create(new C7328(j), interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            this.J$0 = this.J$0;
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i == 2) {
            AbstractC5184.m10206(obj);
            return C5175.f14739;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
