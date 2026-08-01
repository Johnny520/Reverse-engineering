package androidx.compose.animation;

import androidx.compose.animation.core.C1210;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2223;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C6116;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", m556f = "AnimatedVisibility.kt", m557l = {746}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Landroidx/compose/runtime/飘花落叶言子苏哲世楪兰;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/runtime/飘花落叶言子苏哲世楪兰;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class C0005xd7829780 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1210 $childTransition;
    final /* synthetic */ InterfaceC2168 $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0005xd7829780(C1210 c1210, InterfaceC2168 interfaceC2168, InterfaceC5189<? super C0005xd7829780> interfaceC5189) {
        super(2, interfaceC5189);
        this.$childTransition = c1210;
        this.$shouldDisposeBlockUpdated$delegate = interfaceC2168;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        C0005xd7829780 c0005xd7829780 = new C0005xd7829780(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, interfaceC5189);
        c0005xd7829780.L$0 = obj;
        return c0005xd7829780;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2223 interfaceC2223, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((C0005xd7829780) create(interfaceC2223, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC2223 interfaceC2223 = (InterfaceC2223) this.L$0;
            final C1210 c1210 = this.$childTransition;
            C6116 c6116M3030 = AbstractC2202.m3030(new InterfaceC7372() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.1
                {
                    super(0);
                }

                @Override // p068.InterfaceC7372
                public final Boolean invoke() {
                    C1210 c12102 = c1210;
                    Object objM1626 = c12102.m1626();
                    EnterExitState enterExitState = EnterExitState.PostExit;
                    return Boolean.valueOf(objM1626 == enterExitState && ((AbstractC2182) c12102.f1586).getValue() == enterExitState);
                }
            });
            C1258 c1258 = new C1258(interfaceC2223, this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, 0);
            this.label = 1;
            if (c6116M3030.mo9012(c1258, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
