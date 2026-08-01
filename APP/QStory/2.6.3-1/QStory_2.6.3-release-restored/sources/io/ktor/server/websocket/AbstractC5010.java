package io.ktor.server.websocket;

import com.alibaba.fastjson2.AbstractC3738;
import io.ktor.server.application.AbstractC4886;
import io.ktor.server.application.C4890;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.server.engine.C4924;
import io.ktor.util.cio.ChannelIOException;
import io.ktor.websocket.AbstractC5092;
import io.ktor.websocket.C5093;
import io.ktor.websocket.InterfaceC5094;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7383;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5010 {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (io.ktor.websocket.AbstractC5089.m9273(r7, new io.ktor.websocket.C5095(io.ktor.websocket.CloseReason$Codes.NORMAL, ""), r1) == r2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9102(C5093 c5093, InterfaceC4889 interfaceC4889, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) throws ChannelIOException {
        RoutingKt$handleServerSession$1 routingKt$handleServerSession$1;
        InterfaceC5094 interfaceC5094;
        if (continuationImpl instanceof RoutingKt$handleServerSession$1) {
            routingKt$handleServerSession$1 = (RoutingKt$handleServerSession$1) continuationImpl;
            int i = routingKt$handleServerSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routingKt$handleServerSession$1.label = i - Integer.MIN_VALUE;
            } else {
                routingKt$handleServerSession$1 = new RoutingKt$handleServerSession$1(continuationImpl);
            }
        }
        Object obj = routingKt$handleServerSession$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routingKt$handleServerSession$1.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj);
                AbstractC5016.f12998.trace("Starting websocket session for " + AbstractC3738.m6855(interfaceC4889.mo9018()));
                c5093.getClass();
                Object c5012 = new C5012(interfaceC4889, c5093);
                routingKt$handleServerSession$1.L$0 = c5093;
                routingKt$handleServerSession$1.L$1 = interfaceC4889;
                routingKt$handleServerSession$1.label = 1;
                interfaceC5094 = c5093;
                if (interfaceC7383.invoke(c5012, routingKt$handleServerSession$1) == obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            interfaceC4889 = (InterfaceC4889) routingKt$handleServerSession$1.L$1;
            InterfaceC5094 interfaceC50942 = (InterfaceC5094) routingKt$handleServerSession$1.L$0;
            AbstractC6017.m10769(obj);
            interfaceC5094 = interfaceC50942;
            routingKt$handleServerSession$1.L$0 = interfaceC4889;
            routingKt$handleServerSession$1.L$1 = null;
            routingKt$handleServerSession$1.label = 2;
        } catch (ChannelIOException e) {
            throw e;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            C4890 c4890Mo9019 = interfaceC4889.mo9019();
            c4890Mo9019.getClass();
            ((C4924) c4890Mo9019.f12686).f12782.error("Websocket handler failed", th);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9103(InterfaceC5009 interfaceC5009, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        RoutingKt$proceedWebSocket$1 routingKt$proceedWebSocket$1;
        InterfaceC5094 interfaceC5094;
        if (continuationImpl instanceof RoutingKt$proceedWebSocket$1) {
            routingKt$proceedWebSocket$1 = (RoutingKt$proceedWebSocket$1) continuationImpl;
            int i = routingKt$proceedWebSocket$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routingKt$proceedWebSocket$1.label = i - Integer.MIN_VALUE;
            } else {
                routingKt$proceedWebSocket$1 = new RoutingKt$proceedWebSocket$1(continuationImpl);
            }
        }
        Object obj = routingKt$proceedWebSocket$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routingKt$proceedWebSocket$1.label;
        C6008 c6008 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            interfaceC5009.getClass();
            C4890 c4890Mo9019 = interfaceC5009.mo9101().mo9019();
            C5015 c5015 = C5014.f12991;
            long j = ((C5014) AbstractC4886.m9014(c4890Mo9019)).f12997;
            InterfaceC9970 interfaceC9970 = AbstractC5092.f13129;
            if (interfaceC5009 instanceof InterfaceC5094) {
                C6755.m11869("Cannot wrap other DefaultWebSocketSession");
                return null;
            }
            C5093 c5093 = new C5093(interfaceC5009, j);
            c5093.m9278((List) interfaceC5009.mo9101().getAttributes().m9148(C5014.f12993));
            InterfaceC4889 interfaceC4889Mo9101 = interfaceC5009.mo9101();
            routingKt$proceedWebSocket$1.L$0 = c5093;
            routingKt$proceedWebSocket$1.label = 1;
            if (m9102(c5093, interfaceC4889Mo9101, interfaceC7383, routingKt$proceedWebSocket$1) != coroutineSingletons) {
                interfaceC5094 = c5093;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC5094 = (InterfaceC5094) routingKt$proceedWebSocket$1.L$0;
        AbstractC6017.m10769(obj);
        routingKt$proceedWebSocket$1.L$0 = null;
        routingKt$proceedWebSocket$1.label = 2;
        InterfaceC5186 interfaceC5186 = interfaceC5094.mo2990().get(C6285.f15450);
        interfaceC5186.getClass();
        Object objMo11123 = ((InterfaceC6284) interfaceC5186).mo11123(routingKt$proceedWebSocket$1);
        if (objMo11123 != coroutineSingletons) {
            objMo11123 = c6008;
        }
        return objMo11123 == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
