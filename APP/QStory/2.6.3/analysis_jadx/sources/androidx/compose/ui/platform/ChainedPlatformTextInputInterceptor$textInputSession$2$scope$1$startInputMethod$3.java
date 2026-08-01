package androidx.compose.ui.platform;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC5322;
import kotlinx.coroutines.flow.C5284;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "it", "", "<anonymous>", "(V)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC1875 $parentSession;
    final /* synthetic */ InterfaceC1858 $request;
    int label;
    final /* synthetic */ C1923 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(C1923 c1923, InterfaceC1858 interfaceC1858, InterfaceC1875 interfaceC1875, InterfaceC4357<? super ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c1923;
        this.$request = interfaceC1858;
        this.$parentSession = interfaceC1875;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3(this.this$0, this.$request, this.$parentSession, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C5176 c5176, InterfaceC4357<?> interfaceC4357) {
        return ((ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3) create(c5176, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            final C1923 c1923 = this.this$0;
            C5284 c5284M2470 = AbstractC1367.m2470(new InterfaceC6543() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3.1
                {
                    super(0);
                }

                @Override // p052.InterfaceC6543
                public final InterfaceC1855 invoke() {
                    if (((AbstractC1347) c1923.f5671).getValue() == null) {
                        return null;
                    }
                    C2942.m6394();
                    return null;
                }

                @Override // p052.InterfaceC6543
                public /* bridge */ /* synthetic */ Object invoke() {
                    invoke();
                    return null;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, null);
            this.label = 1;
            if (AbstractC5322.m10335(c5284M2470, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        C5925.m11311("Interceptors flow should never terminate.");
        return null;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/飘花落叶言子哲世楪兰苏;", "interceptor", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/platform/飘花落叶言子哲世楪兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC1875 $parentSession;
        final /* synthetic */ InterfaceC1858 $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC1858 interfaceC1858, InterfaceC1875 interfaceC1875, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$request = interfaceC1858;
            this.$parentSession = interfaceC1875;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, interfaceC4357);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p052.InterfaceC6554
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            if (obj == null) {
                return invoke((InterfaceC1855) null, (InterfaceC4357<? super C5176>) obj2);
            }
            C2942.m6394();
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
                AbstractC5185.m10210(obj);
                throw new KotlinNothingValueException();
            }
            AbstractC5185.m10210(obj);
            if (this.L$0 != null) {
                throw new ClassCastException();
            }
            this.label = 1;
            throw null;
        }

        public final Object invoke(InterfaceC1855 interfaceC1855, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(interfaceC1855, interfaceC4357)).invokeSuspend(C5176.f14739);
        }
    }
}
