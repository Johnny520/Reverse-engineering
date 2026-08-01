package io.ktor.server.application;

import io.ktor.http.content.C4824;
import io.ktor.server.plugins.CannotTransformContentToTypeException;
import io.ktor.server.request.AbstractC4963;
import io.ktor.server.request.C4960;
import io.ktor.server.request.C4962;
import io.ktor.server.request.RequestAlreadyConsumedException;
import io.ktor.server.response.AbstractC4964;
import io.ktor.server.response.C4967;
import io.ktor.server.response.InterfaceC4966;
import io.ktor.server.routing.AbstractC4976;
import io.ktor.server.routing.C4977;
import io.ktor.server.routing.C4986;
import io.ktor.util.C5036;
import io.ktor.util.C5041;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5919;
import p075.C7686;
import p256.C8964;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4892 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8964 f12703 = new C8964();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8964 f12702 = new C8964();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8964 f12701 = new C8964();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8964 f12700 = new C8964();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8964 f12699 = new C8964();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8964 f12698 = new C8964();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Object m9023(InterfaceC4897 interfaceC4897, Object obj, C7686 c7686, InterfaceC5189 interfaceC5189) {
        InterfaceC4966 interfaceC4966Mo9020 = interfaceC4897.mo9020();
        C5041 c5041 = AbstractC4964.f12873;
        interfaceC4966Mo9020.getClass();
        interfaceC4966Mo9020.mo941().getAttributes().m9145(c5041, c7686);
        C4967 c4967Mo940 = interfaceC4897.mo9020().mo940();
        if (obj == null) {
            obj = C4824.f12592;
        }
        Object objM9133 = c4967Mo940.m9133(interfaceC4897, obj, interfaceC5189);
        return objM9133 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM9133 : C6008.f15084;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m9024(InterfaceC4897 interfaceC4897, C7686 c7686, ContinuationImpl continuationImpl) throws CannotTransformContentToTypeException {
        PipelineCall$receiveNullable$1 pipelineCall$receiveNullable$1;
        if (continuationImpl instanceof PipelineCall$receiveNullable$1) {
            pipelineCall$receiveNullable$1 = (PipelineCall$receiveNullable$1) continuationImpl;
            int i = pipelineCall$receiveNullable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pipelineCall$receiveNullable$1.label = i - Integer.MIN_VALUE;
            } else {
                pipelineCall$receiveNullable$1 = new PipelineCall$receiveNullable$1(continuationImpl);
            }
        }
        Object objM9133 = pipelineCall$receiveNullable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pipelineCall$receiveNullable$1.label;
        C4960 c4960 = C4960.f12866;
        if (i2 == 0) {
            AbstractC6017.m10769(objM9133);
            C5036 attributes = interfaceC4897.getAttributes();
            C5041 c5041 = AbstractC4963.f12871;
            Object objMo956 = (C4960) attributes.m9146(c5041);
            if (objMo956 == null) {
                interfaceC4897.getAttributes().m9145(c5041, c4960);
            }
            C5041 c50412 = AbstractC4898.f12706;
            c7686.getClass();
            interfaceC4897.getAttributes().m9145(AbstractC4898.f12706, c7686);
            if (objMo956 == null) {
                objMo956 = interfaceC4897.mo9018().mo956();
            }
            C4962 c4962Mo939 = interfaceC4897.mo9018().mo939();
            pipelineCall$receiveNullable$1.L$0 = c7686;
            pipelineCall$receiveNullable$1.label = 1;
            objM9133 = c4962Mo939.m9133(interfaceC4897, objMo956, pipelineCall$receiveNullable$1);
            if (objM9133 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c7686 = (C7686) pipelineCall$receiveNullable$1.L$0;
            AbstractC6017.m10769(objM9133);
        }
        if (AbstractC5227.m9466(objM9133, C4824.f12592)) {
            return null;
        }
        if (objM9133 == c4960) {
            throw new RequestAlreadyConsumedException();
        }
        if (c7686.f18643.isInstance(objM9133)) {
            return objM9133;
        }
        InterfaceC5919 interfaceC5919 = c7686.f18642;
        interfaceC5919.getClass();
        throw new CannotTransformContentToTypeException(interfaceC5919);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m9025(C4986 c4986, InterfaceC4895 interfaceC4895) {
        c4986.getClass();
        interfaceC4895.getClass();
        C4986 c49862 = c4986;
        while (true) {
            Object objM9013 = AbstractC4886.m9013(c49862, interfaceC4895);
            if (objM9013 != null) {
                return objM9013;
            }
            C4986 c49863 = c49862.f12923;
            if (c49863 == null) {
                if (c49862 instanceof C4977) {
                    return AbstractC4886.m9013(AbstractC4976.m9091(c4986), interfaceC4895);
                }
                return null;
            }
            c49863.getClass();
            c49862 = c49863;
        }
    }
}
