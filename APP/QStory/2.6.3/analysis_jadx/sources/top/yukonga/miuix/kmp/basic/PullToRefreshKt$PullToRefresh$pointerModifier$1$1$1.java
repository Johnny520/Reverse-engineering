package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.C1358;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.ui.input.pointer.C1621;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1", f = "PullToRefresh.kt", l = {146}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
final class PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5401 $coroutineScope;
    final /* synthetic */ InterfaceC1333 $currentOnRefresh$delegate;
    final /* synthetic */ AbstractC6003 $pullToRefreshState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1$2", f = "PullToRefresh.kt", l = {152}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC1333 $currentOnRefresh$delegate;
        final /* synthetic */ AbstractC6003 $pullToRefreshState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC6003 abstractC6003, InterfaceC1333 interfaceC1333, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$currentOnRefresh$delegate = interfaceC1333;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass2(null, this.$currentOnRefresh$delegate, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    AbstractC5185.m10210(obj);
                    return C5176.f14739;
                }
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            InterfaceC1333 interfaceC1333 = this.$currentOnRefresh$delegate;
            C1358 c1358 = AbstractC6018.f16440;
            this.label = 1;
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1(AbstractC6003 abstractC6003, InterfaceC5401 interfaceC5401, InterfaceC1333 interfaceC1333, InterfaceC4357<? super PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$coroutineScope = interfaceC5401;
        this.$currentOnRefresh$delegate = interfaceC1333;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1 pullToRefreshKt$PullToRefresh$pointerModifier$1$1$1 = new PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1(null, this.$coroutineScope, this.$currentOnRefresh$delegate, interfaceC4357);
        pullToRefreshKt$PullToRefresh$pointerModifier$1$1$1.L$0 = obj;
        return pullToRefreshKt$PullToRefresh$pointerModifier$1$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((PullToRefreshKt$PullToRefresh$pointerModifier$1$1$1) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1633 interfaceC1633 = (InterfaceC1633) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            this.L$0 = interfaceC1633;
            this.label = 1;
            obj = ((C1621) interfaceC1633).m2999(PointerEventPass.Main, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        throw null;
    }
}
