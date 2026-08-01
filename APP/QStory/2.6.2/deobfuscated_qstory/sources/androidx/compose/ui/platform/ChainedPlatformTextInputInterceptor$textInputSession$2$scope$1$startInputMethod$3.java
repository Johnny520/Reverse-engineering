package androidx.compose.ui.platform;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.C5283;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "it", "", "<anonymous>", "(V)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1875 $parentSession;
    final /* synthetic */ InterfaceC1858 $request;
    int label;
    final /* synthetic */ C1923 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(C1923 c1923, InterfaceC1858 interfaceC1858, InterfaceC1875 interfaceC1875, InterfaceC4356<? super ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c1923;
        this.$request = interfaceC1858;
        this.$parentSession = interfaceC1875;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(this.this$0, this.$request, this.$parentSession, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C5175 c5175, InterfaceC4356<?> interfaceC4356) {
        return ((ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3) create(c5175, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            final C1923 c1923 = this.this$0;
            C5283 c5283M2461 = AbstractC1367.m2461(new InterfaceC6542() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3.1
                {
                    super(0);
                }

                @Override // p052.InterfaceC6542
                public final InterfaceC1855 invoke() {
                    if (((AbstractC1347) c1923.f5670).getValue() == null) {
                        return null;
                    }
                    C2941.m6336();
                    return null;
                }

                @Override // p052.InterfaceC6542
                public /* bridge */ /* synthetic */ Object invoke() {
                    invoke();
                    return null;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, null);
            this.label = 1;
            if (AbstractC5321.m10331(c5283M2461, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        C5919.m11250("Interceptors flow should never terminate.");
        return null;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/飘花落叶言子哲世楪兰苏;", "interceptor", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/platform/飘花落叶言子哲世楪兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC1875 $parentSession;
        final /* synthetic */ InterfaceC1858 $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC1858 interfaceC1858, InterfaceC1875 interfaceC1875, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
            this.$request = interfaceC1858;
            this.$parentSession = interfaceC1875;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, interfaceC4356);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p052.InterfaceC6553
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            if (obj == null) {
                return invoke((InterfaceC1855) null, (InterfaceC4356<? super C5175>) obj2);
            }
            C2941.m6336();
            return null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5184.m10206(obj);
                throw new KotlinNothingValueException();
            }
            AbstractC5184.m10206(obj);
            if (this.L$0 != null) {
                throw new ClassCastException();
            }
            this.label = 1;
            throw null;
        }

        public final Object invoke(InterfaceC1855 interfaceC1855, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass2) create(interfaceC1855, interfaceC4356)).invokeSuspend(C5175.f14739);
        }
    }
}
