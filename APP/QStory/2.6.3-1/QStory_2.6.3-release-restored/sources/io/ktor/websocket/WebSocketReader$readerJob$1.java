package io.ktor.websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p073.InterfaceC7680;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.websocket.WebSocketReader$readerJob$1", m556f = "WebSocketReader.kt", m557l = {41}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class WebSocketReader$readerJob$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7680 $pool;
    Object L$0;
    int label;
    final /* synthetic */ C5100 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketReader$readerJob$1(InterfaceC7680 interfaceC7680, C5100 c5100, InterfaceC5189<? super WebSocketReader$readerJob$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$pool = interfaceC7680;
        this.this$0 = c5100;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new WebSocketReader$readerJob$1(this.$pool, this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((WebSocketReader$readerJob$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        ByteBuffer byteBuffer;
        ProtocolViolationException e;
        FrameTooBigException e2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                ByteBuffer byteBuffer2 = (ByteBuffer) this.$pool.mo8894();
                try {
                    C5100 c5100 = this.this$0;
                    this.L$0 = byteBuffer2;
                    this.label = 1;
                    if (C5100.m9280(c5100, byteBuffer2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (FrameTooBigException e3) {
                    byteBuffer = byteBuffer2;
                    e2 = e3;
                    this.this$0.f13156.m10801(e2, false);
                    this.$pool.mo8893(byteBuffer);
                    this.this$0.f13156.mo8994(null);
                    return C6008.f15084;
                } catch (ProtocolViolationException e4) {
                    byteBuffer = byteBuffer2;
                    e = e4;
                    this.this$0.f13156.m10801(e, false);
                    this.$pool.mo8893(byteBuffer);
                    this.this$0.f13156.mo8994(null);
                    return C6008.f15084;
                } catch (ClosedChannelException | CancellationException unused) {
                } catch (IOException unused2) {
                    byteBuffer = byteBuffer2;
                    this.this$0.f13156.mo10815(null);
                    this.$pool.mo8893(byteBuffer);
                    this.this$0.f13156.mo8994(null);
                    return C6008.f15084;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
                byteBuffer = byteBuffer2;
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                byteBuffer = (ByteBuffer) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                } catch (FrameTooBigException e5) {
                    e2 = e5;
                    this.this$0.f13156.m10801(e2, false);
                } catch (ProtocolViolationException e6) {
                    e = e6;
                    this.this$0.f13156.m10801(e, false);
                } catch (ClosedChannelException | CancellationException unused3) {
                } catch (IOException unused4) {
                    this.this$0.f13156.mo10815(null);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            this.$pool.mo8893(byteBuffer);
            this.this$0.f13156.mo8994(null);
            return C6008.f15084;
        } catch (Throwable th4) {
            this.$pool.mo8893(coroutineSingletons);
            this.this$0.f13156.mo8994(null);
            throw th4;
        }
    }
}
