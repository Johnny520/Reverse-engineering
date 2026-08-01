package androidx.compose.material3;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1", m556f = "AppBar.kt", m557l = {1344}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "velocity", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;F)V"}, m152k = 3, m153mv = {2, 0, 0})
final class AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC2012 $activeScrollBehavior;
    /* synthetic */ float F$0;
    int label;

    public AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1(InterfaceC2012 interfaceC2012, InterfaceC5189<? super AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC6233) obj, ((Number) obj2).floatValue(), (InterfaceC5189<? super C6008>) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public final Object invoke(InterfaceC6233 interfaceC6233, float f, InterfaceC5189<? super C6008> interfaceC5189) {
        AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1 appBarKt$BottomAppBarLayout$appBarDragModifier$2$1 = new AppBarKt$BottomAppBarLayout$appBarDragModifier$2$1(null, interfaceC5189);
        appBarKt$BottomAppBarLayout$appBarDragModifier$2$1.F$0 = f;
        return appBarKt$BottomAppBarLayout$appBarDragModifier$2$1.invokeSuspend(C6008.f15084);
    }
}
