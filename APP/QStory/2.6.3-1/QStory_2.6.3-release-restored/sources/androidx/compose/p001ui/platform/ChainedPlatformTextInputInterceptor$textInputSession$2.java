package androidx.compose.p001ui.platform;

import io.ktor.util.C5043;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", m556f = "PlatformTextInputModifierNode.kt", m557l = {248}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/platform/飘花落叶言子哲苏楪世兰;", "", "<anonymous>", "(Landroidx/compose/ui/platform/飘花落叶言子哲苏楪世兰;)Ljava/lang/Void;"}, m152k = 3, m153mv = {2, 1, 0})
final class ChainedPlatformTextInputInterceptor$textInputSession$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $session;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C2758 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2(InterfaceC7383 interfaceC7383, C2758 c2758, InterfaceC5189<? super ChainedPlatformTextInputInterceptor$textInputSession$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$session = interfaceC7383;
        this.this$0 = c2758;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new ChainedPlatformTextInputInterceptor$textInputSession$2(this.$session, this.this$0, interfaceC5189);
        chainedPlatformTextInputInterceptor$textInputSession$2.L$0 = obj;
        return chainedPlatformTextInputInterceptor$textInputSession$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2710 interfaceC2710, InterfaceC5189<?> interfaceC5189) {
        return ((ChainedPlatformTextInputInterceptor$textInputSession$2) create(interfaceC2710, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C2754 c2754 = new C2754((InterfaceC2710) this.L$0, new AtomicReference(null), this.this$0);
            InterfaceC7383 interfaceC7383 = this.$session;
            this.label = 1;
            if (interfaceC7383.invoke(c2754, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        C5043.m9161();
        return null;
    }
}
