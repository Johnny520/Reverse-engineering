package io.ktor.network.tls;

import androidx.collection.C1123;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C6036;
import kotlinx.coroutines.channels.InterfaceC6028;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.C6309;
import kotlinx.p010io.InterfaceC6313;
import p025.AbstractC7012;
import p068.InterfaceC7383;
import p074.AbstractC7684;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.tls.TLSClientHandshake$handshakes$1", m556f = "TLSClientHandshake.kt", m557l = {136, 151}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lio/ktor/network/tls/飘花落叶言子楪苏哲世兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class TLSClientHandshake$handshakes$1 extends SuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC4873 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSClientHandshake$handshakes$1(AbstractC4873 abstractC4873, InterfaceC5189<? super TLSClientHandshake$handshakes$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC4873;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TLSClientHandshake$handshakes$1 tLSClientHandshake$handshakes$1 = new TLSClientHandshake$handshakes$1(this.this$0, interfaceC5189);
        tLSClientHandshake$handshakes$1.L$0 = obj;
        return tLSClientHandshake$handshakes$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TLSClientHandshake$handshakes$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00dd -> B:41:0x00e0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        InterfaceC6028 interfaceC6028;
        InterfaceC6313 interfaceC6313;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC6028 = (InterfaceC6028) this.L$0;
        } else if (i == 1) {
            InterfaceC6028 interfaceC60282 = (InterfaceC6028) this.L$0;
            AbstractC6017.m10769(obj);
            C4875 c4875 = (C4875) obj;
            TLSRecordType tLSRecordType = c4875.f12668;
            TLSRecordType tLSRecordType2 = TLSRecordType.Handshake;
            InterfaceC6313 interfaceC63132 = c4875.f12666;
            if (tLSRecordType != tLSRecordType2) {
                interfaceC63132.close();
                C1123.m1405(c4875.f12668, "TLS handshake expected, got ");
                return null;
            }
            interfaceC6028 = interfaceC60282;
            interfaceC6313 = interfaceC63132;
            while (!interfaceC6313.mo11163()) {
            }
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C4877 c4877 = (C4877) this.L$2;
            interfaceC6313 = (InterfaceC6313) this.L$1;
            interfaceC6028 = (InterfaceC6028) this.L$0;
            AbstractC6017.m10769(obj);
            if (c4877.f12670 == TLSHandshakeType.Finished) {
                interfaceC6313.close();
                return C6008.f15084;
            }
            while (!interfaceC6313.mo11163()) {
                c4877 = new C4877();
                TLSHandshakeType tLSHandshakeType = TLSHandshakeType.HelloRequest;
                c4877.f12670 = tLSHandshakeType;
                c4877.f12669 = AbstractC7684.f18641;
                int i2 = interfaceC6313.readInt();
                int i3 = i2 >>> 24;
                TLSHandshakeType.Companion.getClass();
                TLSHandshakeType tLSHandshakeType2 = (i3 < 0 || i3 >= 256) ? null : TLSHandshakeType.byCode[i3];
                if (tLSHandshakeType2 == null) {
                    C6755.m11869(AbstractC7012.m12147(i3, "Invalid TLS handshake type code: "));
                    return null;
                }
                c4877.f12670 = tLSHandshakeType2;
                C6309 c6309 = new C6309();
                byte[] bArrM11191 = AbstractC6310.m11191(interfaceC6313, i2 & 16777215);
                AbstractC7684.m12642(c6309, bArrM11191, 0, bArrM11191.length);
                c4877.f12669 = c6309;
                TLSHandshakeType tLSHandshakeType3 = c4877.f12670;
                if (tLSHandshakeType3 != tLSHandshakeType) {
                    if (tLSHandshakeType3 != TLSHandshakeType.Finished) {
                        obj2.getClass();
                        if (tLSHandshakeType3 == tLSHandshakeType) {
                            C6755.m11870("Check failed.");
                            return null;
                        }
                        C6309 c63092 = new C6309();
                        int iM12638 = (int) AbstractC7684.m12638(c6309);
                        tLSHandshakeType3.getClass();
                        if (iM12638 > 16777215) {
                            throw new TLSException(AbstractC7012.m12147(iM12638, "TLS handshake size limit exceeded: "), null, 2, null);
                        }
                        c63092.m11174(iM12638 | (tLSHandshakeType3.getCode() << 24));
                        if (AbstractC7684.m12638(c4877.f12669) <= 0) {
                            throw null;
                        }
                        AbstractC7684.m12644(c63092, AbstractC7684.m12640(c4877.f12669));
                        throw null;
                    }
                    C6036 c6036 = (C6036) interfaceC6028;
                    c6036.getClass();
                    this.L$0 = interfaceC6028;
                    this.L$1 = interfaceC6313;
                    this.L$2 = c4877;
                    this.label = 2;
                    if (c6036.f15143.mo8992(c4877, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (c4877.f12670 == TLSHandshakeType.Finished) {
                    }
                    while (!interfaceC6313.mo11163()) {
                    }
                }
            }
        }
        obj2.getClass();
        this.L$0 = interfaceC6028;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        throw null;
    }
}
