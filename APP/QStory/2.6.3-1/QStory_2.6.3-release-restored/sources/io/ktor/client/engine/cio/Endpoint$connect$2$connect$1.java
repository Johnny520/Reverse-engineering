package io.ktor.client.engine.cio;

import com.android.p002dx.p005io.Opcodes;
import io.ktor.network.sockets.AbstractC4850;
import io.ktor.network.sockets.C4861;
import io.ktor.network.sockets.InterfaceC4854;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.Endpoint$connect$2$connect$1", m556f = "Endpoint.kt", m557l = {Opcodes.MUL_INT_LIT16}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;"}, m152k = 3, m153mv = {2, 0, 0})
final class Endpoint$connect$2$connect$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C4861 $address;
    final /* synthetic */ long $socketTimeout;
    int label;
    final /* synthetic */ C4703 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$connect$2$connect$1(C4703 c4703, C4861 c4861, long j, InterfaceC5189<? super Endpoint$connect$2$connect$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c4703;
        this.$address = c4861;
        this.$socketTimeout = j;
    }

    private static final C6008 invokeSuspend$lambda$0(long j, AbstractC4850 abstractC4850) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new Endpoint$connect$2$connect$1(this.this$0, this.$address, this.$socketTimeout, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super InterfaceC4854> interfaceC5189) {
        return ((Endpoint$connect$2$connect$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return obj;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C4703 c4703 = this.this$0;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C4703.f12435;
        c4703.getClass();
        this.label = 1;
        throw null;
    }
}
