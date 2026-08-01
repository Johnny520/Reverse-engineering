package io.ktor.client.engine.cio;

import io.ktor.utils.io.InterfaceC4247;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p241.C8139;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.engine.cio.UtilsKt$writeRequest$2", f = "utils.kt", l = {31, 32}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class UtilsKt$writeRequest$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC4360 $callContext;
    final /* synthetic */ boolean $closeChannel;
    final /* synthetic */ InterfaceC4247 $output;
    final /* synthetic */ boolean $overProxy;
    final /* synthetic */ C8139 $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$writeRequest$2(C8139 c8139, InterfaceC4247 interfaceC4247, boolean z, boolean z2, InterfaceC4360 interfaceC4360, InterfaceC4357<? super UtilsKt$writeRequest$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$request = c8139;
        this.$output = interfaceC4247;
        this.$overProxy = z;
        this.$closeChannel = z2;
        this.$callContext = interfaceC4360;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new UtilsKt$writeRequest$2(this.$request, this.$output, this.$overProxy, this.$closeChannel, this.$callContext, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((UtilsKt$writeRequest$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C8139 c8139 = this.$request;
            InterfaceC4247 interfaceC4247 = this.$output;
            boolean z = this.$overProxy;
            boolean z2 = this.$closeChannel;
            this.label = 1;
            if (AbstractC3870.m8253(c8139, interfaceC4247, z, z2, this) != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C8139 c81392 = this.$request;
        InterfaceC4247 interfaceC42472 = this.$output;
        InterfaceC4360 interfaceC4360 = this.$callContext;
        this.label = 2;
        AbstractC3870.m8254(c81392, interfaceC42472, interfaceC4360);
        return c5176 == coroutineSingletons ? coroutineSingletons : c5176;
    }
}
