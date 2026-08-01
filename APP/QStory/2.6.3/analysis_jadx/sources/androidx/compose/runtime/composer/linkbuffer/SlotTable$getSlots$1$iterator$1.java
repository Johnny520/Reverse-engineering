package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.C1310;
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
@InterfaceC6862(c = "androidx.compose.runtime.composer.linkbuffer.SlotTable$getSlots$1$iterator$1", f = "SlotTable.kt", l = {580}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 1, 0})
final class SlotTable$getSlots$1$iterator$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AbstractC1239 this$0;

    public SlotTable$getSlots$1$iterator$1(AbstractC1239 abstractC1239, InterfaceC4357<? super SlotTable$getSlots$1$iterator$1> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SlotTable$getSlots$1$iterator$1 slotTable$getSlots$1$iterator$1 = new SlotTable$getSlots$1$iterator$1(null, interfaceC4357);
        slotTable$getSlots$1$iterator$1.L$0 = obj;
        return slotTable$getSlots$1$iterator$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC5125 abstractC5125, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SlotTable$getSlots$1$iterator$1) create(abstractC5125, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i2 != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.I$5;
        int i4 = this.I$3;
        int i5 = this.I$2;
        int i6 = this.I$1;
        int i7 = this.I$0;
        if (this.L$4 != null) {
            C2942.m6394();
            return null;
        }
        int[] iArr = (int[]) this.L$3;
        C1310 c1310 = (C1310) this.L$2;
        if (this.L$1 != null) {
            C2942.m6394();
            return null;
        }
        AbstractC5185.m10210(obj);
        if (i3 + 1 < i4) {
            throw null;
        }
        if ((i5 != i7 || i6 != 0) && (i = iArr[i5 + 1]) >= 0) {
            c1310.m2307(i);
        }
        if (iArr[i5 + 3] >= 0) {
            throw null;
        }
        if (c1310.f3802 == 0) {
            return C5176.f14739;
        }
        c1310.m2308();
        throw null;
    }
}
