package androidx.compose.runtime.composer.linkbuffer;

import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.AbstractC5125;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.runtime.composer.linkbuffer.SlotTable$DebugGroup$children$1", f = "SlotTable.kt", l = {592}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\f\u0012\b\u0012\u00060\u0001R\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "Landroidx/compose/runtime/composer/linkbuffer/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/runtime/composer/linkbuffer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 1, 0})
final class SlotTable$DebugGroup$children$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC1239 this$0;
    final /* synthetic */ C1240 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotTable$DebugGroup$children$1(AbstractC1239 abstractC1239, C1240 c1240, InterfaceC4357<? super SlotTable$DebugGroup$children$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$1 = c1240;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SlotTable$DebugGroup$children$1 slotTable$DebugGroup$children$1 = new SlotTable$DebugGroup$children$1(null, this.this$1, interfaceC4357);
        slotTable$DebugGroup$children$1.L$0 = obj;
        return slotTable$DebugGroup$children$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SlotTable$DebugGroup$children$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C1240 c1240;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            int i2 = this.this$1.f3596;
            throw null;
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.I$0;
        int[] iArr = (int[]) this.L$2;
        if (this.L$1 != null) {
            C2942.m6394();
            return null;
        }
        AbstractC5125 abstractC5125 = (AbstractC5125) this.L$0;
        AbstractC5185.m10210(obj);
        do {
            i3 = iArr[i3 + 1];
            if (i3 <= 0) {
                return C5176.f14739;
            }
            c1240 = new C1240(i3);
            this.L$0 = abstractC5125;
            this.L$1 = null;
            this.L$2 = iArr;
            this.I$0 = i3;
            this.label = 1;
        } while (abstractC5125.mo10121(c1240, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
