package top.yukonga.miuix.kmp.basic;

import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.runtime.C2193;
import androidx.compose.runtime.InterfaceC2168;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1", m556f = "PullToRefresh.kt", m557l = {146}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6233 $coroutineScope;
    final /* synthetic */ InterfaceC2168 $currentOnRefresh$delegate;
    final /* synthetic */ AbstractC6833 $pullToRefreshState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1$2", m556f = "PullToRefresh.kt", m557l = {152}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08182 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC2168 $currentOnRefresh$delegate;
        final /* synthetic */ AbstractC6833 $pullToRefreshState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08182(AbstractC6833 abstractC6833, InterfaceC2168 interfaceC2168, InterfaceC5189<? super C08182> interfaceC5189) {
            super(2, interfaceC5189);
            this.$currentOnRefresh$delegate = interfaceC2168;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08182(null, this.$currentOnRefresh$delegate, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08182) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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
            InterfaceC2168 interfaceC2168 = this.$currentOnRefresh$delegate;
            C2193 c2193 = AbstractC6848.f16785;
            this.label = 1;
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1(AbstractC6833 abstractC6833, InterfaceC6233 interfaceC6233, InterfaceC2168 interfaceC2168, InterfaceC5189<? super PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$coroutineScope = interfaceC6233;
        this.$currentOnRefresh$delegate = interfaceC2168;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1 pullToRefreshKt$PullToRefresh$pointerModifier$1$1$1 = new PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1(null, this.$coroutineScope, this.$currentOnRefresh$delegate, interfaceC5189);
        pullToRefreshKt$PullToRefresh$pointerModifier$1$1$1.L$0 = obj;
        return pullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468 = (InterfaceC2468) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.L$0 = interfaceC2468;
            this.label = 1;
            obj = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        throw null;
    }
}
