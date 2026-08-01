package io.ktor.websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p057.InterfaceC6850;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.websocket.WebSocketReader$readerJob$1", f = "WebSocketReader.kt", l = {41}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class WebSocketReader$readerJob$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6850 $pool;
    Object L$0;
    int label;
    final /* synthetic */ C4267 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketReader$readerJob$1(InterfaceC6850 interfaceC6850, C4267 c4267, InterfaceC4356<? super WebSocketReader$readerJob$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$pool = interfaceC6850;
        this.this$0 = c4267;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new WebSocketReader$readerJob$1(this.$pool, this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((WebSocketReader$readerJob$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
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
                AbstractC5184.m10206(obj);
                ByteBuffer byteBuffer2 = (ByteBuffer) this.$pool.mo8345();
                try {
                    C4267 c4267 = this.this$0;
                    this.L$0 = byteBuffer2;
                    this.label = 1;
                    if (C4267.m8731(c4267, byteBuffer2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (FrameTooBigException e3) {
                    byteBuffer = byteBuffer2;
                    e2 = e3;
                    this.this$0.f12807.m10238(e2, false);
                    this.$pool.mo8344(byteBuffer);
                    this.this$0.f12807.mo8446(null);
                    return C5175.f14739;
                } catch (ProtocolViolationException e4) {
                    byteBuffer = byteBuffer2;
                    e = e4;
                    this.this$0.f12807.m10238(e, false);
                    this.$pool.mo8344(byteBuffer);
                    this.this$0.f12807.mo8446(null);
                    return C5175.f14739;
                } catch (ClosedChannelException | CancellationException unused) {
                } catch (IOException unused2) {
                    byteBuffer = byteBuffer2;
                    this.this$0.f12807.mo10252(null);
                    this.$pool.mo8344(byteBuffer);
                    this.this$0.f12807.mo8446(null);
                    return C5175.f14739;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
                byteBuffer = byteBuffer2;
            } else {
                if (i != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                byteBuffer = (ByteBuffer) this.L$0;
                try {
                    AbstractC5184.m10206(obj);
                } catch (FrameTooBigException e5) {
                    e2 = e5;
                    this.this$0.f12807.m10238(e2, false);
                } catch (ProtocolViolationException e6) {
                    e = e6;
                    this.this$0.f12807.m10238(e, false);
                } catch (ClosedChannelException | CancellationException unused3) {
                } catch (IOException unused4) {
                    this.this$0.f12807.mo10252(null);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            this.$pool.mo8344(byteBuffer);
            this.this$0.f12807.mo8446(null);
            return C5175.f14739;
        } catch (Throwable th4) {
            this.$pool.mo8344(coroutineSingletons);
            this.this$0.f12807.mo8446(null);
            throw th4;
        }
    }
}
