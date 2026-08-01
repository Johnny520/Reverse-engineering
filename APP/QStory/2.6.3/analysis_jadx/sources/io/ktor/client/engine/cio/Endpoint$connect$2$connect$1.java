package io.ktor.client.engine.cio;

import com.android.dx.io.Opcodes;
import io.ktor.network.sockets.AbstractC4018;
import io.ktor.network.sockets.C4029;
import io.ktor.network.sockets.InterfaceC4022;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.engine.cio.Endpoint$connect$2$connect$1", f = "Endpoint.kt", l = {Opcodes.MUL_INT_LIT16}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;"}, k = 3, mv = {2, 0, 0})
final class Endpoint$connect$2$connect$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C4029 $address;
    final /* synthetic */ long $socketTimeout;
    int label;
    final /* synthetic */ C3871 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$connect$2$connect$1(C3871 c3871, C4029 c4029, long j, InterfaceC4357<? super Endpoint$connect$2$connect$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c3871;
        this.$address = c4029;
        this.$socketTimeout = j;
    }

    private static final C5176 invokeSuspend$lambda$0(long j, AbstractC4018 abstractC4018) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new Endpoint$connect$2$connect$1(this.this$0, this.$address, this.$socketTimeout, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super InterfaceC4022> interfaceC4357) {
        return ((Endpoint$connect$2$connect$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return obj;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C3871 c3871 = this.this$0;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3871.f12090;
        c3871.getClass();
        this.label = 1;
        throw null;
    }
}
