package androidx.compose.material3;

import androidx.compose.animation.core.InterfaceC1195;
import androidx.compose.material3.internal.InterfaceC1957;
import androidx.compose.material3.internal.InterfaceC1960;
import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p068.InterfaceC7381;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.ModalWideNavigationRailState$animateTo$2", m556f = "WideNavigationRailState.kt", m557l = {240}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m151d2 = {"Landroidx/compose/material3/internal/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/material3/internal/飘花落叶言子楪哲世兰苏;", "Landroidx/compose/material3/WideNavigationRailValue;", "anchors", "latestTarget", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/material3/internal/飘花落叶言子楪世苏哲兰;Landroidx/compose/material3/internal/飘花落叶言子楪哲世兰苏;Landroidx/compose/material3/WideNavigationRailValue;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ModalWideNavigationRailState$animateTo$2 extends SuspendLambda implements InterfaceC7381 {
    final /* synthetic */ InterfaceC1195 $animationSpec;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ AbstractC1991 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalWideNavigationRailState$animateTo$2(AbstractC1991 abstractC1991, float f, InterfaceC1195 interfaceC1195, InterfaceC5189<? super ModalWideNavigationRailState$animateTo$2> interfaceC5189) {
        super(4, interfaceC5189);
        this.$velocity = f;
        this.$animationSpec = interfaceC1195;
    }

    private static final C6008 invokeSuspend$lambda$0(InterfaceC1957 interfaceC1957, Ref$FloatRef ref$FloatRef, float f, float f2) {
        interfaceC1957.m2575();
        ref$FloatRef.element = f;
        return C6008.f15084;
    }

    @Override // p068.InterfaceC7381
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj != null) {
            C3775.m6954();
            return null;
        }
        if (obj2 == null) {
            return invoke((InterfaceC1957) null, (InterfaceC1960) null, (WideNavigationRailValue) obj3, (InterfaceC5189<? super C6008>) obj4);
        }
        C3775.m6954();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        if (this.L$0 != null) {
            C3775.m6954();
            return null;
        }
        if (this.L$1 != null) {
            C3775.m6954();
            return null;
        }
        throw null;
    }

    public final Object invoke(InterfaceC1957 interfaceC1957, InterfaceC1960 interfaceC1960, WideNavigationRailValue wideNavigationRailValue, InterfaceC5189<? super C6008> interfaceC5189) {
        ModalWideNavigationRailState$animateTo$2 modalWideNavigationRailState$animateTo$2 = new ModalWideNavigationRailState$animateTo$2(null, this.$velocity, this.$animationSpec, interfaceC5189);
        modalWideNavigationRailState$animateTo$2.L$0 = interfaceC1957;
        modalWideNavigationRailState$animateTo$2.L$1 = interfaceC1960;
        modalWideNavigationRailState$animateTo$2.L$2 = wideNavigationRailValue;
        return modalWideNavigationRailState$animateTo$2.invokeSuspend(C6008.f15084);
    }
}
