package androidx.compose.material3.internal;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6552;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {682}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "Landroidx/compose/material3/internal/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/material3/internal/飘花落叶言子楪哲世兰苏;", "anchors", "latestTarget", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
final class AnchoredDraggableKt$animateTo$2 extends SuspendLambda implements InterfaceC6552 {
    final /* synthetic */ AbstractC1117 $this_animateTo;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(AbstractC1117 abstractC1117, float f, InterfaceC4357<? super AnchoredDraggableKt$animateTo$2> interfaceC4357) {
        super(4, interfaceC4357);
        this.$velocity = f;
    }

    private static final C5176 invokeSuspend$lambda$0(InterfaceC1122 interfaceC1122, Ref$FloatRef ref$FloatRef, float f, float f2) {
        interfaceC1122.m2015();
        ref$FloatRef.element = f;
        return C5176.f14739;
    }

    @Override // p052.InterfaceC6552
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj != null) {
            C2942.m6394();
            return null;
        }
        if (obj2 == null) {
            return invoke((InterfaceC1122) null, (InterfaceC1125) null, obj3, (InterfaceC4357<? super C5176>) obj4);
        }
        C2942.m6394();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return C5176.f14739;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        if (this.L$0 == null) {
            throw AbstractC0053.m159(this.L$1);
        }
        C2942.m6394();
        return null;
    }

    public final Object invoke(InterfaceC1122 interfaceC1122, InterfaceC1125 interfaceC1125, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(null, this.$velocity, interfaceC4357);
        anchoredDraggableKt$animateTo$2.L$0 = interfaceC1122;
        anchoredDraggableKt$animateTo$2.L$1 = interfaceC1125;
        anchoredDraggableKt$animateTo$2.L$2 = obj;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(C5176.f14739);
    }
}
