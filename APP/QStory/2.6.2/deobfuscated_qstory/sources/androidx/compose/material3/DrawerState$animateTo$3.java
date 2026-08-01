package androidx.compose.material3;

import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.foundation.gestures.InterfaceC0461;
import androidx.compose.foundation.gestures.InterfaceC0523;
import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6551;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.DrawerState$animateTo$3", f = "NavigationDrawer.kt", l = {274}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/material3/DrawerValue;", "anchors", "latestTarget", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;Landroidx/compose/material3/DrawerValue;)V"}, k = 3, mv = {2, 0, 0})
final class DrawerState$animateTo$3 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC0349 $animationSpec;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ AbstractC1189 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerState$animateTo$3(AbstractC1189 abstractC1189, float f, InterfaceC0349 interfaceC0349, InterfaceC4356<? super DrawerState$animateTo$3> interfaceC4356) {
        super(4, interfaceC4356);
        this.$velocity = f;
        this.$animationSpec = interfaceC0349;
    }

    private static final C5175 invokeSuspend$lambda$0(InterfaceC0523 interfaceC0523, Ref$FloatRef ref$FloatRef, float f, float f2) {
        interfaceC0523.m1305();
        ref$FloatRef.element = f;
        return C5175.f14739;
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj != null) {
            C2941.m6336();
            return null;
        }
        if (obj2 == null) {
            return invoke((InterfaceC0523) null, (InterfaceC0461) null, (DrawerValue) obj3, (InterfaceC4356<? super C5175>) obj4);
        }
        C2941.m6336();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return C5175.f14739;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        if (this.L$0 != null) {
            C2941.m6336();
            return null;
        }
        if (this.L$1 != null) {
            C2941.m6336();
            return null;
        }
        throw null;
    }

    public final Object invoke(InterfaceC0523 interfaceC0523, InterfaceC0461 interfaceC0461, DrawerValue drawerValue, InterfaceC4356<? super C5175> interfaceC4356) {
        DrawerState$animateTo$3 drawerState$animateTo$3 = new DrawerState$animateTo$3(null, this.$velocity, this.$animationSpec, interfaceC4356);
        drawerState$animateTo$3.L$0 = interfaceC0523;
        drawerState$animateTo$3.L$1 = interfaceC0461;
        drawerState$animateTo$3.L$2 = drawerValue;
        return drawerState$animateTo$3.invokeSuspend(C5175.f14739);
    }
}
