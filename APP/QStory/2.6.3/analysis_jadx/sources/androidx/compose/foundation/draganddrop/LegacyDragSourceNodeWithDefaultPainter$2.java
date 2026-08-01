package androidx.compose.foundation.draganddrop;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2", f = "LegacyDragAndDropSourceWithDefaultPainter.android.kt", l = {96}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世兰哲苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世兰哲苏;)V"}, k = 3, mv = {2, 1, 0})
final class LegacyDragSourceNodeWithDefaultPainter$2 extends SuspendLambda implements InterfaceC6554 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC0456 this$0;

    public LegacyDragSourceNodeWithDefaultPainter$2(AbstractC0456 abstractC0456, InterfaceC4357<? super LegacyDragSourceNodeWithDefaultPainter$2> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        LegacyDragSourceNodeWithDefaultPainter$2 legacyDragSourceNodeWithDefaultPainter$2 = new LegacyDragSourceNodeWithDefaultPainter$2(null, interfaceC4357);
        legacyDragSourceNodeWithDefaultPainter$2.L$0 = obj;
        return legacyDragSourceNodeWithDefaultPainter$2;
    }

    @Override // p052.InterfaceC6554
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (obj == null) {
            return invoke((InterfaceC0450) null, (InterfaceC4357<? super C5176>) obj2);
        }
        C2942.m6394();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw AbstractC0053.m159(this.L$0);
        }
        if (i == 1) {
            AbstractC5185.m10210(obj);
            return C5176.f14739;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public final Object invoke(InterfaceC0450 interfaceC0450, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((LegacyDragSourceNodeWithDefaultPainter$2) create(interfaceC0450, interfaceC4357)).invokeSuspend(C5176.f14739);
    }
}
