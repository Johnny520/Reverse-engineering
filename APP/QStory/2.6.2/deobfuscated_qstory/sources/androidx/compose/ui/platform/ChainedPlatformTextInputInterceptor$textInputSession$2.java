package androidx.compose.ui.platform;

import io.ktor.util.C4210;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {248}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/飘花落叶言子哲苏楪世兰;", "", "<anonymous>", "(Landroidx/compose/ui/platform/飘花落叶言子哲苏楪世兰;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
final class ChainedPlatformTextInputInterceptor$textInputSession$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $session;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1923 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainedPlatformTextInputInterceptor$textInputSession$2(InterfaceC6553 interfaceC6553, C1923 c1923, InterfaceC4356<? super ChainedPlatformTextInputInterceptor$textInputSession$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$session = interfaceC6553;
        this.this$0 = c1923;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new ChainedPlatformTextInputInterceptor$textInputSession$2(this.$session, this.this$0, interfaceC4356);
        chainedPlatformTextInputInterceptor$textInputSession$2.L$0 = obj;
        return chainedPlatformTextInputInterceptor$textInputSession$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC1875 interfaceC1875, InterfaceC4356<?> interfaceC4356) {
        return ((ChainedPlatformTextInputInterceptor$textInputSession$2) create(interfaceC1875, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C1919 c1919 = new C1919((InterfaceC1875) this.L$0, new AtomicReference(null), this.this$0);
            InterfaceC6553 interfaceC6553 = this.$session;
            this.label = 1;
            if (interfaceC6553.invoke(c1919, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        C4210.m8612();
        return null;
    }
}
