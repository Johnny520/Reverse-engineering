package io.modelcontextprotocol.kotlin.sdk.shared;

import androidx.window.area.C3391;
import io.modelcontextprotocol.kotlin.sdk.ErrorCode$Defined;
import io.modelcontextprotocol.kotlin.sdk.McpError;
import io.modelcontextprotocol.kotlin.sdk.server.AbstractC5127;
import io.modelcontextprotocol.kotlin.sdk.server.C5122;
import io.modelcontextprotocol.kotlin.sdk.server.C5128;
import java.util.LinkedHashMap;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.C5989;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.C6292;
import kotlinx.coroutines.InterfaceC6273;
import kotlinx.coroutines.RunnableC6245;
import kotlinx.coroutines.TimeoutCancellationException;
import p068.InterfaceC7383;
import p072.AbstractC7433;
import p072.C7507;
import p072.C7508;
import p072.C7527;
import p072.C7543;
import p072.InterfaceC7625;
import p072.InterfaceC7645;
import p072.InterfaceC7665;
import p072.InterfaceC7669;
import p079.InterfaceC7691;
import p104.AbstractC7988;
import p104.AbstractC7997;
import p104.C7981;
import p265.InterfaceC8989;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol", m556f = "Protocol.kt", m557l = {393, 397, 400}, m558m = "request")
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class Protocol$request$1<T extends InterfaceC7625> extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5139 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Protocol$request$1(AbstractC5139 abstractC5139, InterfaceC5189<? super Protocol$request$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = abstractC5139;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Protocol$request$1<T> protocol$request$1;
        TimeoutCancellationException timeoutCancellationException;
        InterfaceC5192 interfaceC5192;
        Protocol$request$5 protocol$request$5;
        long jM11040;
        InterfaceC7383 interfaceC7383;
        InterfaceC6273 interfaceC6273;
        InterfaceC7669 interfaceC7669;
        long j;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        AbstractC5139 abstractC5139 = this.this$0;
        abstractC5139.getClass();
        if (this instanceof Protocol$request$1) {
            int i = this.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                this.label = i - Integer.MIN_VALUE;
                protocol$request$1 = this;
            } else {
                protocol$request$1 = new Protocol$request$1<>(abstractC5139, this);
            }
        }
        Object obj2 = protocol$request$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        long j2 = protocol$request$1.label;
        C7543 c7543 = null;
        try {
        } catch (TimeoutCancellationException e) {
            e = e;
        }
        if (j2 == 0) {
            AbstractC6017.m10769(obj2);
            AbstractC5143.f13236.mo9606(new C5140(null, 3));
            final C6270 c6270M11049 = AbstractC6231.m11049();
            InterfaceC5141 interfaceC5141 = abstractC5139.f13227;
            if (interfaceC5141 == null) {
                throw new Error("Not connected");
            }
            if (abstractC5139.f13228.f13208) {
                InterfaceC7645 interfaceC7645 = c7543.f18482;
                C5128 c5128 = (C5128) abstractC5139;
                interfaceC7645.getClass();
                InterfaceC8989 interfaceC8989 = AbstractC5127.f13198;
                interfaceC8989.mo9606(new C5122(1, interfaceC7645));
                String value = interfaceC7645.getValue();
                int iHashCode = value.hashCode();
                if (iHashCode != -597942244) {
                    if (iHashCode == 3441010) {
                        value.equals("ping");
                    } else if (iHashCode == 473012035 && value.equals("sampling/createMessage")) {
                        C7527 c7527 = c5128.f13206;
                        if ((c7527 != null ? c7527.f18456 : null) == null) {
                            interfaceC8989.mo9617(new C3391(11));
                            throw new IllegalStateException("Client does not support sampling (required for " + interfaceC7645.getValue() + ')');
                        }
                    }
                } else if (value.equals("roots/list")) {
                    C7527 c75272 = c5128.f13206;
                    if ((c75272 != null ? c75272.f18455 : null) == null) {
                        throw new IllegalStateException("Client does not support listing roots (required for " + interfaceC7645.getValue() + ')');
                    }
                }
            }
            String[] strArr = AbstractC7433.f18324;
            c7543.getClass();
            String value2 = c7543.f18482.getValue();
            AbstractC7988 abstractC7988M9302 = AbstractC5143.m9302();
            abstractC7988M9302.getClass();
            C7507 c7507 = new C7507(value2, abstractC7988M9302.m12984(InterfaceC7669.Companion.serializer(), null));
            LinkedHashMap linkedHashMap = abstractC5139.f13224;
            InterfaceC7383 interfaceC73832 = new InterfaceC7383() { // from class: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪世哲兰苏
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj3, Object obj4) {
                    C7508 c7508 = (C7508) obj3;
                    Exception exc = (Exception) obj4;
                    C6270 c6270 = c6270M11049;
                    if (exc != null) {
                        c6270.m11088(exc);
                    } else {
                        if ((c7508 != null ? c7508.f18431 : null) != null) {
                            c6270.m11088(new IllegalStateException(c7508.f18431.toString()));
                        } else {
                            try {
                                c7508.getClass();
                                InterfaceC7625 interfaceC7625 = c7508.f18432;
                                interfaceC7625.getClass();
                                c6270.m11147(interfaceC7625);
                            } catch (Throwable th) {
                                c6270.m11088(th);
                            }
                        }
                    }
                    return C6008.f15084;
                }
            };
            InterfaceC7665 interfaceC7665 = c7507.f18429;
            linkedHashMap.put(interfaceC7665, interfaceC73832);
            Protocol$request$cancel$1 protocol$request$cancel$1 = new Protocol$request$cancel$1(abstractC5139, interfaceC7665, interfaceC5141, c6270M11049, null);
            long j3 = AbstractC5143.f13234;
            try {
                protocol$request$5 = new Protocol$request$5(abstractC5139, c7507, interfaceC7665, null);
                protocol$request$1.L$0 = null;
                protocol$request$1.L$1 = c6270M11049;
                protocol$request$1.L$2 = protocol$request$cancel$1;
                protocol$request$1.J$0 = j3;
                protocol$request$1.label = 1;
                jM11040 = AbstractC6231.m11040(j3);
            } catch (TimeoutCancellationException e2) {
                e = e2;
                j2 = j3;
                AbstractC5143.f13236.mo9617(new C5134(j2, (InterfaceC7669) null));
                McpError mcpError = new McpError(ErrorCode$Defined.RequestTimeout.getCode(), "Request timed out", new C7981(AbstractC5171.m9327(new Pair("timeout", AbstractC7997.m12992(new Long(C5989.m10748(j2)))))));
                protocol$request$1.L$0 = c6270M11049;
                protocol$request$1.L$1 = e;
                protocol$request$1.L$2 = null;
                protocol$request$1.label = 3;
                if (protocol$request$cancel$1.invoke((Object) mcpError, (Object) protocol$request$1) != coroutineSingletons) {
                    timeoutCancellationException = e;
                    interfaceC5192 = c6270M11049;
                    ((C6292) interfaceC5192).mo10815(timeoutCancellationException);
                    throw timeoutCancellationException;
                }
            }
            if (jM11040 <= 0) {
                throw new TimeoutCancellationException("Timed out immediately");
            }
            if (AbstractC6231.m11042(new RunnableC6245(jM11040, protocol$request$1), protocol$request$5) != coroutineSingletons) {
                interfaceC7383 = protocol$request$cancel$1;
                interfaceC6273 = c6270M11049;
                interfaceC7669 = null;
                j = j3;
            }
            return coroutineSingletons;
        }
        if (j2 != 1) {
            if (j2 == 2) {
                long j4 = protocol$request$1.J$0;
                AbstractC6017.m10769(obj2);
                return obj2;
            }
            if (j2 != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            timeoutCancellationException = (TimeoutCancellationException) protocol$request$1.L$1;
            interfaceC5192 = (InterfaceC6273) protocol$request$1.L$0;
            AbstractC6017.m10769(obj2);
            ((C6292) interfaceC5192).mo10815(timeoutCancellationException);
            throw timeoutCancellationException;
        }
        j = protocol$request$1.J$0;
        interfaceC7383 = (InterfaceC7383) protocol$request$1.L$2;
        interfaceC6273 = (InterfaceC6273) protocol$request$1.L$1;
        interfaceC7669 = (InterfaceC7669) protocol$request$1.L$0;
        AbstractC6017.m10769(obj2);
        protocol$request$1.L$0 = interfaceC7669;
        protocol$request$1.L$1 = interfaceC6273;
        protocol$request$1.L$2 = interfaceC7383;
        protocol$request$1.J$0 = j;
        protocol$request$1.label = 2;
        Object objM11132 = ((C6270) interfaceC6273).m11132(protocol$request$1);
        if (objM11132 != coroutineSingletons) {
            return objM11132;
        }
        return coroutineSingletons;
    }
}
