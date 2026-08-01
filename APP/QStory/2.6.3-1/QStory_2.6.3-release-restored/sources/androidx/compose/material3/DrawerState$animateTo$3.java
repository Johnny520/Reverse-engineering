package androidx.compose.material3;

import androidx.compose.animation.core.InterfaceC1195;
import androidx.compose.foundation.gestures.InterfaceC1302;
import androidx.compose.foundation.gestures.InterfaceC1364;
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
@InterfaceC7691(m555c = "androidx.compose.material3.DrawerState$animateTo$3", m556f = "NavigationDrawer.kt", m557l = {274}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/material3/DrawerValue;", "anchors", "latestTarget", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;Landroidx/compose/material3/DrawerValue;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DrawerState$animateTo$3 extends SuspendLambda implements InterfaceC7381 {
    final /* synthetic */ InterfaceC1195 $animationSpec;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ AbstractC2024 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerState$animateTo$3(AbstractC2024 abstractC2024, float f, InterfaceC1195 interfaceC1195, InterfaceC5189<? super DrawerState$animateTo$3> interfaceC5189) {
        super(4, interfaceC5189);
        this.$velocity = f;
        this.$animationSpec = interfaceC1195;
    }

    private static final C6008 invokeSuspend$lambda$0(InterfaceC1364 interfaceC1364, Ref$FloatRef ref$FloatRef, float f, float f2) {
        interfaceC1364.m1875();
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
            return invoke((InterfaceC1364) null, (InterfaceC1302) null, (DrawerValue) obj3, (InterfaceC5189<? super C6008>) obj4);
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

    public final Object invoke(InterfaceC1364 interfaceC1364, InterfaceC1302 interfaceC1302, DrawerValue drawerValue, InterfaceC5189<? super C6008> interfaceC5189) {
        DrawerState$animateTo$3 drawerState$animateTo$3 = new DrawerState$animateTo$3(null, this.$velocity, this.$animationSpec, interfaceC5189);
        drawerState$animateTo$3.L$0 = interfaceC1364;
        drawerState$animateTo$3.L$1 = interfaceC1302;
        drawerState$animateTo$3.L$2 = drawerValue;
        return drawerState$animateTo$3.invokeSuspend(C6008.f15084);
    }
}
