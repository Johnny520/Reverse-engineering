package io.ktor.client.engine.cio;

import io.ktor.utils.io.InterfaceC4246;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p241.C8138;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.engine.cio.UtilsKt$writeRequest$2", f = "utils.kt", l = {31, 32}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class UtilsKt$writeRequest$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC4359 $callContext;
    final /* synthetic */ boolean $closeChannel;
    final /* synthetic */ InterfaceC4246 $output;
    final /* synthetic */ boolean $overProxy;
    final /* synthetic */ C8138 $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$writeRequest$2(C8138 c8138, InterfaceC4246 interfaceC4246, boolean z, boolean z2, InterfaceC4359 interfaceC4359, InterfaceC4356<? super UtilsKt$writeRequest$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$request = c8138;
        this.$output = interfaceC4246;
        this.$overProxy = z;
        this.$closeChannel = z2;
        this.$callContext = interfaceC4359;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new UtilsKt$writeRequest$2(this.$request, this.$output, this.$overProxy, this.$closeChannel, this.$callContext, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((UtilsKt$writeRequest$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C8138 c8138 = this.$request;
            InterfaceC4246 interfaceC4246 = this.$output;
            boolean z = this.$overProxy;
            boolean z2 = this.$closeChannel;
            this.label = 1;
            if (AbstractC3869.m8266(c8138, interfaceC4246, z, z2, this) != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C8138 c81382 = this.$request;
        InterfaceC4246 interfaceC42462 = this.$output;
        InterfaceC4359 interfaceC4359 = this.$callContext;
        this.label = 2;
        AbstractC3869.m8267(c81382, interfaceC42462, interfaceC4359);
        return c5175 == coroutineSingletons ? coroutineSingletons : c5175;
    }
}
