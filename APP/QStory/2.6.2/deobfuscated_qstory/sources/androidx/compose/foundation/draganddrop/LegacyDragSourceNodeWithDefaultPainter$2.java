package androidx.compose.foundation.draganddrop;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.draganddrop.LegacyDragSourceNodeWithDefaultPainter$2", f = "LegacyDragAndDropSourceWithDefaultPainter.android.kt", l = {96}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世兰哲苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世兰哲苏;)V"}, k = 3, mv = {2, 1, 0})
final class LegacyDragSourceNodeWithDefaultPainter$2 extends SuspendLambda implements InterfaceC6553 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC0456 this$0;

    public LegacyDragSourceNodeWithDefaultPainter$2(AbstractC0456 abstractC0456, InterfaceC4356<? super LegacyDragSourceNodeWithDefaultPainter$2> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        LegacyDragSourceNodeWithDefaultPainter$2 legacyDragSourceNodeWithDefaultPainter$2 = new LegacyDragSourceNodeWithDefaultPainter$2(null, interfaceC4356);
        legacyDragSourceNodeWithDefaultPainter$2.L$0 = obj;
        return legacyDragSourceNodeWithDefaultPainter$2;
    }

    @Override // p052.InterfaceC6553
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (obj == null) {
            return invoke((InterfaceC0450) null, (InterfaceC4356<? super C5175>) obj2);
        }
        C2941.m6336();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw AbstractC0053.m158(this.L$0);
        }
        if (i == 1) {
            AbstractC5184.m10206(obj);
            return C5175.f14739;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public final Object invoke(InterfaceC0450 interfaceC0450, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((LegacyDragSourceNodeWithDefaultPainter$2) create(interfaceC0450, interfaceC4356)).invokeSuspend(C5175.f14739);
    }
}
