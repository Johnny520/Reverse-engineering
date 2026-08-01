package androidx.compose.runtime.composer.linkbuffer;

import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5124;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.runtime.composer.linkbuffer.SlotTable$DebugGroup$children$1", f = "SlotTable.kt", l = {592}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\f\u0012\b\u0012\u00060\u0001R\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Landroidx/compose/runtime/composer/linkbuffer/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/runtime/composer/linkbuffer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 1, 0})
final class SlotTable$DebugGroup$children$1 extends RestrictedSuspendLambda implements InterfaceC6553 {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC1239 this$0;
    final /* synthetic */ C1240 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotTable$DebugGroup$children$1(AbstractC1239 abstractC1239, C1240 c1240, InterfaceC4356<? super SlotTable$DebugGroup$children$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$1 = c1240;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        SlotTable$DebugGroup$children$1 slotTable$DebugGroup$children$1 = new SlotTable$DebugGroup$children$1(null, this.this$1, interfaceC4356);
        slotTable$DebugGroup$children$1.L$0 = obj;
        return slotTable$DebugGroup$children$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(AbstractC5124 abstractC5124, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SlotTable$DebugGroup$children$1) create(abstractC5124, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C1240 c1240;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            int i2 = this.this$1.f3595;
            throw null;
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.I$0;
        int[] iArr = (int[]) this.L$2;
        if (this.L$1 != null) {
            C2941.m6336();
            return null;
        }
        AbstractC5124 abstractC5124 = (AbstractC5124) this.L$0;
        AbstractC5184.m10206(obj);
        do {
            i3 = iArr[i3 + 1];
            if (i3 <= 0) {
                return C5175.f14739;
            }
            c1240 = new C1240(i3);
            this.L$0 = abstractC5124;
            this.L$1 = null;
            this.L$2 = iArr;
            this.I$0 = i3;
            this.label = 1;
        } while (abstractC5124.mo10117(c1240, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
