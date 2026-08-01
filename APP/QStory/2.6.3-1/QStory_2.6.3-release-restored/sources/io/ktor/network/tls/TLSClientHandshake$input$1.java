package io.ktor.network.tls;

import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C6036;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.InterfaceC6028;
import kotlinx.p010io.InterfaceC6313;
import p025.AbstractC7012;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.tls.TLSClientHandshake$input$1", m556f = "TLSClientHandshake.kt", m557l = {61, 91}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class TLSClientHandshake$input$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC5084 $rawInput;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC4873 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSClientHandshake$input$1(InterfaceC5084 interfaceC5084, AbstractC4873 abstractC4873, InterfaceC5189<? super TLSClientHandshake$input$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$rawInput = interfaceC5084;
        this.this$0 = abstractC4873;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TLSClientHandshake$input$1 tLSClientHandshake$input$1 = new TLSClientHandshake$input$1(this.$rawInput, this.this$0, interfaceC5189);
        tLSClientHandshake$input$1.L$0 = obj;
        return tLSClientHandshake$input$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TLSClientHandshake$input$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0119: CHECK_CAST (r5 I:kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世) = (kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世) (r5 I:??[OBJECT, ARRAY]), block:B:63:0x0119 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0125: CHECK_CAST (r5 I:kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世) = (kotlinx.coroutines.channels.飘花落叶言子楪哲兰苏世) (r5 I:??[OBJECT, ARRAY]), block:B:66:0x0125 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[Catch: all -> 0x0017, ClosedReceiveChannelException -> 0x0125, TryCatch #1 {ClosedReceiveChannelException -> 0x0125, blocks: (B:7:0x0013, B:17:0x0033, B:20:0x0042, B:22:0x0046, B:25:0x0056, B:29:0x0072, B:32:0x007a, B:33:0x0095, B:34:0x0096, B:35:0x009d, B:36:0x009e, B:39:0x00ad, B:45:0x00ba, B:46:0x00c2, B:49:0x00cf, B:54:0x00e2, B:58:0x00ea, B:53:0x00da, B:61:0x0115, B:14:0x0026), top: B:71:0x0007, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115 A[Catch: all -> 0x0017, ClosedReceiveChannelException -> 0x0125, TRY_ENTER, TRY_LEAVE, TryCatch #1 {ClosedReceiveChannelException -> 0x0125, blocks: (B:7:0x0013, B:17:0x0033, B:20:0x0042, B:22:0x0046, B:25:0x0056, B:29:0x0072, B:32:0x007a, B:33:0x0095, B:34:0x0096, B:35:0x009d, B:36:0x009e, B:39:0x00ad, B:45:0x00ba, B:46:0x00c2, B:49:0x00cf, B:54:0x00e2, B:58:0x00ea, B:53:0x00da, B:61:0x0115, B:14:0x0026), top: B:71:0x0007, outer: #0 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006d -> B:17:0x0033). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0078 -> B:17:0x0033). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C6036 c6036;
        C6036 c60362;
        int i;
        InterfaceC6028 interfaceC6028;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        Throwable th = null;
        try {
            try {
                if (i2 == 0) {
                    AbstractC6017.m10769(obj);
                    i = 0;
                    interfaceC6028 = (InterfaceC6028) this.L$0;
                } else if (i2 == 1) {
                    i = this.I$0;
                    interfaceC6028 = (InterfaceC6028) this.L$0;
                    AbstractC6017.m10769(obj);
                    C4875 c4875 = (C4875) obj;
                    if (i == 0) {
                        th.getClass();
                        throw null;
                    }
                    InterfaceC6313 interfaceC6313 = c4875.f12666;
                    TLSRecordType tLSRecordType = c4875.f12668;
                    int i3 = AbstractC4874.f12665[tLSRecordType.ordinal()];
                    if (i3 == 1) {
                        C4865 c4865 = TLSAlertLevel.Companion;
                        byte b = interfaceC6313.readByte();
                        c4865.getClass();
                        TLSAlertLevel tLSAlertLevel = (b < 0 || b >= 256) ? null : TLSAlertLevel.byCode[b];
                        if (tLSAlertLevel == null) {
                            C6755.m11869(AbstractC7012.m12147(b, "Invalid TLS record type code: "));
                            tLSAlertLevel = null;
                        }
                        C4864 c4864 = TLSAlertType.Companion;
                        byte b2 = interfaceC6313.readByte();
                        c4864.getClass();
                        TLSAlertType tLSAlertType = (b2 < 0 || b2 >= 256) ? null : TLSAlertType.byCode[b2];
                        if (tLSAlertType == null) {
                            C6755.m11869(AbstractC7012.m12147(b2, "Invalid TLS record type code: "));
                            tLSAlertType = null;
                        }
                        if (tLSAlertType == TLSAlertType.CloseNotify) {
                            th.getClass();
                            throw null;
                        }
                        TLSException tLSException = new TLSException("Received alert during handshake. Level: " + tLSAlertLevel + ", code: " + tLSAlertType, null, 2, null);
                        C6036 c60363 = (C6036) interfaceC6028;
                        c60363.getClass();
                        c60363.mo8994(tLSException);
                        th.getClass();
                        throw null;
                    }
                    if (i3 != 2) {
                        C6036 c60364 = (C6036) interfaceC6028;
                        c60364.getClass();
                        C4875 c48752 = new C4875(tLSRecordType, interfaceC6313);
                        this.L$0 = interfaceC6028;
                        this.I$0 = i;
                        this.label = 2;
                        if (c60364.f15143.mo8992(c48752, this) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    byte b3 = interfaceC6313.readByte();
                    if (b3 != 1) {
                        throw new TLSException("Expected flag: 1, received " + ((int) b3) + " in ChangeCipherSpec", null, 2, null);
                    }
                    i = 1;
                } else {
                    if (i2 != 2) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.I$0;
                    interfaceC6028 = (InterfaceC6028) this.L$0;
                    AbstractC6017.m10769(obj);
                }
                InterfaceC5084 interfaceC5084 = this.$rawInput;
                this.L$0 = interfaceC6028;
                this.I$0 = i;
                this.label = 1;
                obj = AbstractC4867.m8998(interfaceC5084, this);
                if (obj != coroutineSingletons) {
                    C4875 c48753 = (C4875) obj;
                    if (i == 0) {
                    }
                }
                return coroutineSingletons;
            } catch (ClosedReceiveChannelException unused) {
                C6036 c60365 = c60362;
                c60365.getClass();
                c60365.mo8994(null);
                th.getClass();
                throw null;
            }
        } catch (Throwable th2) {
            C6036 c60366 = c6036;
            c60366.getClass();
            c60366.mo8994(th2);
            th.getClass();
            throw null;
        }
    }
}
