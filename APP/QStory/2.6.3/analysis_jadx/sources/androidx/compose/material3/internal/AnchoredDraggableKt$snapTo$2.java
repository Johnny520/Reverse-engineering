package androidx.compose.material3.internal;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6552;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "Landroidx/compose/material3/internal/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/material3/internal/飘花落叶言子楪哲世兰苏;", "anchors", "latestTarget", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
final class AnchoredDraggableKt$snapTo$2 extends SuspendLambda implements InterfaceC6552 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    public AnchoredDraggableKt$snapTo$2(InterfaceC4357<? super AnchoredDraggableKt$snapTo$2> interfaceC4357) {
        super(4, interfaceC4357);
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
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5185.m10210(obj);
        if (this.L$0 == null) {
            throw AbstractC0053.m159(this.L$1);
        }
        throw new ClassCastException();
    }

    public final Object invoke(InterfaceC1122 interfaceC1122, InterfaceC1125 interfaceC1125, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new AnchoredDraggableKt$snapTo$2(interfaceC4357);
        anchoredDraggableKt$snapTo$2.L$0 = interfaceC1122;
        anchoredDraggableKt$snapTo$2.L$1 = interfaceC1125;
        anchoredDraggableKt$snapTo$2.L$2 = obj;
        return anchoredDraggableKt$snapTo$2.invokeSuspend(C5176.f14739);
    }
}
