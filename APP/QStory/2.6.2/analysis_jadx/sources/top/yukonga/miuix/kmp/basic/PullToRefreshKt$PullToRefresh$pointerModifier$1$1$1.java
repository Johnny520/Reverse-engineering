package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.C1358;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.ui.input.pointer.C1621;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1", f = "PullToRefresh.kt", l = {146}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
final class PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1 extends RestrictedSuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5400 $coroutineScope;
    final /* synthetic */ InterfaceC1333 $currentOnRefresh$delegate;
    final /* synthetic */ AbstractC5997 $pullToRefreshState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1$2", f = "PullToRefresh.kt", l = {152}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC1333 $currentOnRefresh$delegate;
        final /* synthetic */ AbstractC5997 $pullToRefreshState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC5997 abstractC5997, InterfaceC1333 interfaceC1333, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
            this.$currentOnRefresh$delegate = interfaceC1333;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass2(null, this.$currentOnRefresh$delegate, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
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
            InterfaceC1333 interfaceC1333 = this.$currentOnRefresh$delegate;
            C1358 c1358 = AbstractC6012.f16431;
            this.label = 1;
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1(AbstractC5997 abstractC5997, InterfaceC5400 interfaceC5400, InterfaceC1333 interfaceC1333, InterfaceC4356<? super PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$coroutineScope = interfaceC5400;
        this.$currentOnRefresh$delegate = interfaceC1333;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1 pullToRefreshKt$PullToRefresh$pointerModifier$1$1$1 = new PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1(null, this.$coroutineScope, this.$currentOnRefresh$delegate, interfaceC4356);
        pullToRefreshKt$PullToRefresh$pointerModifier$1$1$1.L$0 = obj;
        return pullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1) create(interfaceC1633, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1633 interfaceC1633 = (InterfaceC1633) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            this.L$0 = interfaceC1633;
            this.label = 1;
            obj = ((C1621) interfaceC1633).m2989(PointerEventPass.Main, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        throw null;
    }
}
