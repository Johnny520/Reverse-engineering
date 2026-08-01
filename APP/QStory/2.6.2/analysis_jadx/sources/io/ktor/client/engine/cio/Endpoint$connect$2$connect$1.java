package io.ktor.client.engine.cio;

import com.android.dx.io.Opcodes;
import io.ktor.network.sockets.AbstractC4017;
import io.ktor.network.sockets.C4028;
import io.ktor.network.sockets.InterfaceC4021;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.engine.cio.Endpoint$connect$2$connect$1", f = "Endpoint.kt", l = {Opcodes.MUL_INT_LIT16}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;"}, k = 3, mv = {2, 0, 0})
final class Endpoint$connect$2$connect$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C4028 $address;
    final /* synthetic */ long $socketTimeout;
    int label;
    final /* synthetic */ C3870 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$connect$2$connect$1(C3870 c3870, C4028 c4028, long j, InterfaceC4356<? super Endpoint$connect$2$connect$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c3870;
        this.$address = c4028;
        this.$socketTimeout = j;
    }

    private static final C5175 invokeSuspend$lambda$0(long j, AbstractC4017 abstractC4017) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new Endpoint$connect$2$connect$1(this.this$0, this.$address, this.$socketTimeout, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super InterfaceC4021> interfaceC4356) {
        return ((Endpoint$connect$2$connect$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return obj;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C3870 c3870 = this.this$0;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3870.f12085;
        c3870.getClass();
        this.label = 1;
        throw null;
    }
}
