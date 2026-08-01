package io.ktor.websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p057.InterfaceC6851;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.websocket.WebSocketReader$readerJob$1", f = "WebSocketReader.kt", l = {41}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class WebSocketReader$readerJob$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6851 $pool;
    Object L$0;
    int label;
    final /* synthetic */ C4268 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketReader$readerJob$1(InterfaceC6851 interfaceC6851, C4268 c4268, InterfaceC4357<? super WebSocketReader$readerJob$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$pool = interfaceC6851;
        this.this$0 = c4268;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new WebSocketReader$readerJob$1(this.$pool, this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((WebSocketReader$readerJob$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
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
                AbstractC5185.m10210(obj);
                ByteBuffer byteBuffer2 = (ByteBuffer) this.$pool.mo8335();
                try {
                    C4268 c4268 = this.this$0;
                    this.L$0 = byteBuffer2;
                    this.label = 1;
                    if (C4268.m8721(c4268, byteBuffer2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (FrameTooBigException e3) {
                    byteBuffer = byteBuffer2;
                    e2 = e3;
                    this.this$0.f12811.m10242(e2, false);
                    this.$pool.mo8334(byteBuffer);
                    this.this$0.f12811.mo8435(null);
                    return C5176.f14739;
                } catch (ProtocolViolationException e4) {
                    byteBuffer = byteBuffer2;
                    e = e4;
                    this.this$0.f12811.m10242(e, false);
                    this.$pool.mo8334(byteBuffer);
                    this.this$0.f12811.mo8435(null);
                    return C5176.f14739;
                } catch (ClosedChannelException | CancellationException unused) {
                } catch (IOException unused2) {
                    byteBuffer = byteBuffer2;
                    this.this$0.f12811.mo10256(null);
                    this.$pool.mo8334(byteBuffer);
                    this.this$0.f12811.mo8435(null);
                    return C5176.f14739;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
                byteBuffer = byteBuffer2;
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                byteBuffer = (ByteBuffer) this.L$0;
                try {
                    AbstractC5185.m10210(obj);
                } catch (FrameTooBigException e5) {
                    e2 = e5;
                    this.this$0.f12811.m10242(e2, false);
                } catch (ProtocolViolationException e6) {
                    e = e6;
                    this.this$0.f12811.m10242(e, false);
                } catch (ClosedChannelException | CancellationException unused3) {
                } catch (IOException unused4) {
                    this.this$0.f12811.mo10256(null);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
            this.$pool.mo8334(byteBuffer);
            this.this$0.f12811.mo8435(null);
            return C5176.f14739;
        } catch (Throwable th4) {
            this.$pool.mo8334(coroutineSingletons);
            this.this$0.f12811.mo8435(null);
            throw th4;
        }
    }
}
