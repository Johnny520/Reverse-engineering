package io.ktor.client.engine.cio;

import androidx.activity.AbstractC0900;
import io.ktor.http.cio.C4793;
import io.ktor.http.cio.C4795;
import io.ktor.network.sockets.C4858;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.EOFException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.InterfaceC6044;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p252.C8945;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.ConnectionPipeline$responseHandler$1", m556f = "ConnectionPipeline.kt", m557l = {74, 77, 122, 132, 137, 142, 142}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ConnectionPipeline$responseHandler$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C4858 $connection;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AbstractC4705 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPipeline$responseHandler$1(AbstractC4705 abstractC4705, C4858 c4858, InterfaceC5189<? super ConnectionPipeline$responseHandler$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC4705;
        this.$connection = c4858;
    }

    private static final C6008 invokeSuspend$lambda$0(C4795 c4795, C8945 c8945) {
        c8945.m2985(new C4793(c4795.f12562));
        c4795.f12562.m8936();
        return C6008.f15084;
    }

    private static final C6008 invokeSuspend$lambda$1(InterfaceC5084 interfaceC5084, Throwable th) {
        AbstractC5076.m9226(interfaceC5084);
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ConnectionPipeline$responseHandler$1 connectionPipeline$responseHandler$1 = new ConnectionPipeline$responseHandler$1(this.this$0, this.$connection, interfaceC5189);
        connectionPipeline$responseHandler$1.L$0 = obj;
        return connectionPipeline$responseHandler$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ConnectionPipeline$responseHandler$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r8 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                AbstractC6017.m10769(obj);
                throw null;
            case 1:
                InterfaceC6044 interfaceC6044 = (InterfaceC6044) this.L$1;
                AbstractC6017.m10769(obj);
                obj2 = interfaceC6044;
                if (!((Boolean) obj).booleanValue()) {
                    throw null;
                }
                ((AbstractC4704) ((C6023) obj2).m10821()).getClass();
                throw null;
            case 2:
                AbstractC0900.m697(this.L$3);
                AbstractC6017.m10769(obj);
                if (((C4795) obj) != null) {
                    throw null;
                }
                throw new EOFException("Failed to parse HTTP response: unexpected EOF");
            case 3:
                int i = this.I$0;
                InterfaceC5079 interfaceC5079 = (InterfaceC5079) this.L$4;
                InterfaceC6284 interfaceC6284 = (InterfaceC6284) this.L$3;
                AbstractC0900.m697(this.L$2);
                InterfaceC6044 interfaceC60442 = (InterfaceC6044) this.L$1;
                InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    if (interfaceC6284 == null) {
                        throw null;
                    }
                    this.L$0 = interfaceC6233;
                    this.L$1 = interfaceC60442;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.I$0 = i;
                    this.label = 4;
                    if (interfaceC6284.mo11123(this) != coroutineSingletons) {
                        throw null;
                    }
                    return coroutineSingletons;
                } finally {
                }
            case 4:
                AbstractC0900.m697(this.L$2);
                AbstractC6017.m10769(obj);
                throw null;
            case 5:
                int i2 = this.I$0;
                InterfaceC6044 interfaceC60443 = (InterfaceC6044) this.L$1;
                InterfaceC6233 interfaceC62332 = (InterfaceC6233) this.L$0;
                AbstractC6017.m10769(obj);
                if (i2 != 0) {
                    throw null;
                }
                this.L$0 = interfaceC62332;
                this.L$1 = interfaceC60443;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = i2;
                this.label = 1;
                C6023 c6023 = (C6023) interfaceC60443;
                obj = c6023.m10823(this);
                obj2 = c6023;
                break;
                break;
            case 6:
                AbstractC6017.m10769(obj);
                this.$connection.f12637.close();
                return C6008.f15084;
            case 7:
                Throwable th = (Throwable) this.L$0;
                AbstractC6017.m10769(obj);
                this.$connection.f12637.close();
                throw th;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
