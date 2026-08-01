package io.modelcontextprotocol.kotlin.sdk.shared;

import com.bumptech.glide.AbstractC3898;
import io.ktor.websocket.AbstractC5112;
import io.ktor.websocket.C5111;
import io.modelcontextprotocol.kotlin.sdk.server.C5126;
import java.nio.charset.CharsetDecoder;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.text.AbstractC5964;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.p010io.C6309;
import p068.InterfaceC7383;
import p072.InterfaceC7490;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import p104.AbstractC7988;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.shared.WebSocketMcpTransport$start$2", m556f = "WebSocketMcpTransport.kt", m557l = {47, 60}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class WebSocketMcpTransport$start$2 extends SuspendLambda implements InterfaceC7383 {
    int label;
    final /* synthetic */ AbstractC5142 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketMcpTransport$start$2(AbstractC5142 abstractC5142, InterfaceC5189<? super WebSocketMcpTransport$start$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC5142;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new WebSocketMcpTransport$start$2(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((WebSocketMcpTransport$start$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[Catch: Exception -> 0x0010, TRY_ENTER, TryCatch #0 {Exception -> 0x0010, blocks: (B:6:0x000c, B:21:0x0039, B:23:0x0043, B:26:0x007a, B:27:0x0081), top: B:34:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0077 -> B:15:0x0020). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        AbstractC5112 abstractC5112;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
        } else {
            if (i == 1) {
                try {
                    AbstractC6017.m10769(obj);
                    abstractC5112 = (AbstractC5112) obj;
                    if (abstractC5112 instanceof C5111) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected text frame, got " + AbstractC5228.f13320.mo9476(abstractC5112.getClass()).getSimpleName() + ": " + abstractC5112);
                        this.this$0.f13221.invoke(illegalArgumentException);
                        throw illegalArgumentException;
                    }
                    AbstractC7988 abstractC7988M9302 = AbstractC5143.m9302();
                    C5111 c5111 = (C5111) abstractC5112;
                    if (!c5111.f13183) {
                        throw new IllegalArgumentException("Text could be only extracted from non-fragmented frame");
                    }
                    CharsetDecoder charsetDecoderNewDecoder = AbstractC5964.f15033.newDecoder();
                    charsetDecoderNewDecoder.getClass();
                    C6309 c6309 = new C6309();
                    byte[] bArr = c5111.f13181;
                    AbstractC7684.m12642(c6309, bArr, 0, bArr.length);
                    String strM7423 = AbstractC3898.m7423(charsetDecoderNewDecoder, c6309);
                    abstractC7988M9302.getClass();
                    InterfaceC7490 interfaceC7490 = (InterfaceC7490) abstractC7988M9302.m12985(strM7423, InterfaceC7490.Companion.serializer());
                    InterfaceC7383 interfaceC7383 = this.this$0.f13219;
                    this.label = 2;
                    if (interfaceC7383.invoke(interfaceC7490, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                } catch (ClosedReceiveChannelException unused) {
                    return C6008.f15084;
                }
            }
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                AbstractC6017.m10769(obj);
            } catch (Exception e) {
                this.this$0.f13221.invoke(e);
                throw e;
            }
        }
        InterfaceC6031 interfaceC6031Mo9106 = ((C5126) this.this$0).f13197.mo9106();
        this.label = 1;
        obj = interfaceC6031Mo9106.mo10803(this);
        if (obj != coroutineSingletons) {
            abstractC5112 = (AbstractC5112) obj;
            if (abstractC5112 instanceof C5111) {
            }
        }
        return coroutineSingletons;
    }
}
