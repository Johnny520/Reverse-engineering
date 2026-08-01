package androidx.compose.runtime;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", f = "Recomposer.kt", l = {100, 102}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class RecomposerKt$withRunningRecomposer$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6551 $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", f = "Recomposer.kt", l = {99}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ C1383 $recomposer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1383 c1383, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$recomposer = c1383;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$recomposer, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                C1383 c1383 = this.$recomposer;
                this.label = 1;
                if (c1383.m2513(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomposerKt$withRunningRecomposer$2(InterfaceC6551 interfaceC6551, InterfaceC4357<? super RecomposerKt$withRunningRecomposer$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$block = interfaceC6551;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        RecomposerKt$withRunningRecomposer$2 recomposerKt$withRunningRecomposer$2 = new RecomposerKt$withRunningRecomposer$2(this.$block, interfaceC4357);
        recomposerKt$withRunningRecomposer$2.L$0 = obj;
        return recomposerKt$withRunningRecomposer$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<Object> interfaceC4357) {
        return ((RecomposerKt$withRunningRecomposer$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C1383 c1383;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
            c1383 = new C1383(interfaceC5401.mo2430());
            AbstractC5399.m10477(interfaceC5401, null, null, new AnonymousClass1(c1383, null), 3);
            InterfaceC6551 interfaceC6551 = this.$block;
            this.L$0 = c1383;
            this.label = 1;
            obj = interfaceC6551.invoke(interfaceC5401, c1383, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = this.L$0;
            AbstractC5185.m10210(obj);
            return obj2;
        }
        c1383 = (C1383) this.L$0;
        AbstractC5185.m10210(obj);
        if (c1383.f4002.m10588(C5176.f14739)) {
            synchronized (c1383.f3996) {
                c1383.f4000 = true;
            }
        }
        this.L$0 = obj;
        this.label = 2;
        return c1383.m2515(this) == coroutineSingletons ? coroutineSingletons : obj;
    }
}
