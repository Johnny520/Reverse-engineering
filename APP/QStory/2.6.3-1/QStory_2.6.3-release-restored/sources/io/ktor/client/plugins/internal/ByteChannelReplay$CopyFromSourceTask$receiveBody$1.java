package io.ktor.client.plugins.internal;

import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5058;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.p010io.C6304;
import kotlinx.p010io.C6309;
import kotlinx.p010io.InterfaceC6313;
import kotlinx.p010io.InterfaceC6316;
import p068.InterfaceC7383;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.internal.ByteChannelReplay$CopyFromSourceTask$receiveBody$1", m556f = "ByteChannelReplay.kt", m557l = {59, 60, 64, 65}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ByteChannelReplay$CopyFromSourceTask$receiveBody$1 extends SuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC4730 this$0;
    final /* synthetic */ AbstractC4731 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelReplay$CopyFromSourceTask$receiveBody$1(AbstractC4730 abstractC4730, AbstractC4731 abstractC4731, InterfaceC5189<? super ByteChannelReplay$CopyFromSourceTask$receiveBody$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC4730;
        this.this$1 = abstractC4731;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ByteChannelReplay$CopyFromSourceTask$receiveBody$1 byteChannelReplay$CopyFromSourceTask$receiveBody$1 = new ByteChannelReplay$CopyFromSourceTask$receiveBody$1(this.this$0, this.this$1, interfaceC5189);
        byteChannelReplay$CopyFromSourceTask$receiveBody$1.L$0 = obj;
        return byteChannelReplay$CopyFromSourceTask$receiveBody$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5058 c5058, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ByteChannelReplay$CopyFromSourceTask$receiveBody$1) create(c5058, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r4).m9259(r8) == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6316 interfaceC6316;
        C5058 c5058;
        InterfaceC6313 interfaceC6313;
        InterfaceC6313 interfaceC63132;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = this.label;
        try {
            if (obj2 == 0) {
                AbstractC6017.m10769(obj);
                new C6309();
                throw null;
            }
            if (obj2 == 1) {
                AbstractC6017.m10769(obj);
                throw null;
            }
            if (obj2 == 2) {
                interfaceC6316 = (InterfaceC6316) this.L$1;
                c5058 = (C5058) this.L$0;
                AbstractC6017.m10769(obj);
                interfaceC6313 = (InterfaceC6313) obj;
                try {
                    if (!((C5081) c5058.f13071).m9262()) {
                        InterfaceC5079 interfaceC5079 = c5058.f13071;
                        C6304 c6304Peek = interfaceC6313.peek();
                        this.L$0 = c5058;
                        this.L$1 = interfaceC6316;
                        this.L$2 = interfaceC6313;
                        this.label = 3;
                        if (AbstractC5078.m9246(interfaceC5079, c6304Peek, this) == coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                } catch (Exception unused) {
                    interfaceC63132 = interfaceC6313;
                    interfaceC6313 = interfaceC63132;
                    AbstractC7684.m12644(interfaceC6316, interfaceC6313);
                    throw null;
                }
                AbstractC7684.m12644(interfaceC6316, interfaceC6313);
                throw null;
            }
            if (obj2 == 3) {
                InterfaceC6313 interfaceC63133 = (InterfaceC6313) this.L$2;
                InterfaceC6316 interfaceC63162 = (InterfaceC6316) this.L$1;
                c5058 = (C5058) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    interfaceC6313 = interfaceC63133;
                    interfaceC6316 = interfaceC63162;
                } catch (Exception unused2) {
                    interfaceC63132 = interfaceC63133;
                    interfaceC6316 = interfaceC63162;
                } catch (Throwable unused3) {
                    obj2 = interfaceC63162;
                    obj2.getClass();
                    this.this$1.getClass();
                    throw null;
                }
            } else {
                if (obj2 != 4) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC63132 = (InterfaceC6313) this.L$2;
                interfaceC6316 = (InterfaceC6316) this.L$1;
                try {
                    AbstractC6017.m10769(obj);
                } catch (Exception unused4) {
                }
            }
            interfaceC6313 = interfaceC63132;
            AbstractC7684.m12644(interfaceC6316, interfaceC6313);
            throw null;
            InterfaceC5079 interfaceC50792 = c5058.f13071;
            this.L$0 = c5058;
            this.L$1 = interfaceC6316;
            this.L$2 = interfaceC6313;
            this.label = 4;
        } catch (Throwable unused5) {
        }
    }
}
