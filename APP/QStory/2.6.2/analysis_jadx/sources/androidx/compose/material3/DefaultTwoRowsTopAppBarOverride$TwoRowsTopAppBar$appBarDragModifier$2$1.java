package androidx.compose.material3;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1", f = "AppBar.kt", l = {2782}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "velocity", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;F)V"}, k = 3, mv = {2, 0, 0})
final class DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ AbstractC1167 $this_TwoRowsTopAppBar;
    /* synthetic */ float F$0;
    int label;

    public DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1(AbstractC1167 abstractC1167, InterfaceC4356<? super DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC5400) obj, ((Number) obj2).floatValue(), (InterfaceC4356<? super C5175>) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC5184.m10206(obj);
            return C5175.f14739;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public final Object invoke(InterfaceC5400 interfaceC5400, float f, InterfaceC4356<? super C5175> interfaceC4356) {
        DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1 defaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1 = new DefaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1(null, interfaceC4356);
        defaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1.F$0 = f;
        return defaultTwoRowsTopAppBarOverride$TwoRowsTopAppBar$appBarDragModifier$2$1.invokeSuspend(C5175.f14739);
    }
}
