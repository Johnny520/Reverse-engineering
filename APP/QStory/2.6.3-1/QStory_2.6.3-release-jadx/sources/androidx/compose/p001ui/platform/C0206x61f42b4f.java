package androidx.compose.p001ui.platform;

import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6116;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", m556f = "PlatformTextInputModifierNode.kt", m557l = {237}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "it", "", "<anonymous>", "(V)Ljava/lang/Void;"}, m152k = 3, m153mv = {2, 1, 0})
final class C0206x61f42b4f extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2710 $parentSession;
    final /* synthetic */ InterfaceC2693 $request;
    int label;
    final /* synthetic */ C2758 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0206x61f42b4f(C2758 c2758, InterfaceC2693 interfaceC2693, InterfaceC2710 interfaceC2710, InterfaceC5189<? super C0206x61f42b4f> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c2758;
        this.$request = interfaceC2693;
        this.$parentSession = interfaceC2710;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new C0206x61f42b4f(this.this$0, this.$request, this.$parentSession, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C6008 c6008, InterfaceC5189<?> interfaceC5189) {
        return ((C0206x61f42b4f) create(c6008, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            final C2758 c2758 = this.this$0;
            C6116 c6116M3030 = AbstractC2202.m3030(new InterfaceC7372() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3.1
                {
                    super(0);
                }

                @Override // p068.InterfaceC7372
                public final InterfaceC2690 invoke() {
                    if (((AbstractC2182) c2758.f6016).getValue() == null) {
                        return null;
                    }
                    C3775.m6954();
                    return null;
                }

                @Override // p068.InterfaceC7372
                public /* bridge */ /* synthetic */ Object invoke() {
                    invoke();
                    return null;
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, null);
            this.label = 1;
            if (AbstractC6154.m10894(c6116M3030, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        C6755.m11870("Interceptors flow should never terminate.");
        return null;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Landroidx/compose/ui/platform/飘花落叶言子哲世楪兰苏;", "interceptor", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/platform/飘花落叶言子哲世楪兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", m556f = "PlatformTextInputModifierNode.kt", m557l = {238}, m558m = "invokeSuspend", m559v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC2710 $parentSession;
        final /* synthetic */ InterfaceC2693 $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC2693 interfaceC2693, InterfaceC2710 interfaceC2710, InterfaceC5189<? super AnonymousClass2> interfaceC5189) {
            super(2, interfaceC5189);
            this.$request = interfaceC2693;
            this.$parentSession = interfaceC2710;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$request, this.$parentSession, interfaceC5189);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // p068.InterfaceC7383
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            if (obj == null) {
                return invoke((InterfaceC2690) null, (InterfaceC5189<? super C6008>) obj2);
            }
            C3775.m6954();
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
                AbstractC6017.m10769(obj);
                throw new KotlinNothingValueException();
            }
            AbstractC6017.m10769(obj);
            if (this.L$0 != null) {
                throw new ClassCastException();
            }
            this.label = 1;
            throw null;
        }

        public final Object invoke(InterfaceC2690 interfaceC2690, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((AnonymousClass2) create(interfaceC2690, interfaceC5189)).invokeSuspend(C6008.f15084);
        }
    }
}
