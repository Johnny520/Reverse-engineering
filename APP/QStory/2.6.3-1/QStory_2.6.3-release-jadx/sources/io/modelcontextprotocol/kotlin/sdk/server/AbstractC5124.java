package io.modelcontextprotocol.kotlin.sdk.server;

import androidx.window.area.C3391;
import com.alibaba.fastjson2.C3775;
import io.ktor.server.routing.C4987;
import io.ktor.server.routing.C4989;
import io.ktor.server.routing.C4995;
import io.ktor.server.sse.InterfaceC5004;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.text.AbstractC5976;
import p072.AbstractC7432;
import p075.C7686;
import p246.C8878;
import p252.C8926;
import p265.InterfaceC8989;
import p414.AbstractC9968;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5124 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC8989 f13194;

    static {
        InterfaceC8989 c8878;
        String name = AbstractC7432.class.getName();
        if (AbstractC5976.m10735(name, "Kt$", false)) {
            name = AbstractC5976.m10713(name, "Kt$");
        } else if (AbstractC5976.m10735(name, "$", false)) {
            name = AbstractC5976.m10713(name, "$");
        }
        if (System.getProperty("kotlin-logging-to-android-native") != null) {
            c8878 = new C5317(name, 5);
        } else {
            InterfaceC9970 interfaceC9970M15262 = AbstractC9968.m15262(name);
            interfaceC9970M15262.getClass();
            c8878 = new C8878(interfaceC9970M15262, 2);
        }
        f13194 = c8878;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9289(C4987 c4987, ContinuationImpl continuationImpl) {
        KtorServerKt$mcpPostEndpoint$1 ktorServerKt$mcpPostEndpoint$1;
        if (continuationImpl instanceof KtorServerKt$mcpPostEndpoint$1) {
            ktorServerKt$mcpPostEndpoint$1 = (KtorServerKt$mcpPostEndpoint$1) continuationImpl;
            int i = ktorServerKt$mcpPostEndpoint$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ktorServerKt$mcpPostEndpoint$1.label = i - Integer.MIN_VALUE;
            } else {
                ktorServerKt$mcpPostEndpoint$1 = new KtorServerKt$mcpPostEndpoint$1(continuationImpl);
            }
        }
        Object obj = ktorServerKt$mcpPostEndpoint$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ktorServerKt$mcpPostEndpoint$1.label;
        InterfaceC5919 interfaceC5919M9471 = null;
        InterfaceC8989 interfaceC8989 = f13194;
        C6008 c6008 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            String strMo8915 = ((C4989) c4987.f12928.f12960.getValue()).f12938.mo8915("sessionId");
            if (strMo8915 != null) {
                interfaceC8989.mo9607(new C5125(strMo8915, 0));
                throw null;
            }
            C4995 c4995 = c4987.f12928;
            c4995.mo9020().mo958(C8926.f22698);
            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(String.class);
            try {
                interfaceC5919M9471 = AbstractC5228.m9471(String.class);
            } catch (Throwable unused) {
            }
            C7686 c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M9471);
            ktorServerKt$mcpPostEndpoint$1.label = 1;
            return c4995.mo9021("sessionId query parameter is not provided", c7686, ktorServerKt$mcpPostEndpoint$1) == coroutineSingletons ? coroutineSingletons : c6008;
        }
        if (i2 == 1) {
            AbstractC6017.m10769(obj);
            return c6008;
        }
        if (i2 == 2) {
            AbstractC6017.m10769(obj);
            return c6008;
        }
        if (i2 != 3) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str = (String) ktorServerKt$mcpPostEndpoint$1.L$0;
        AbstractC6017.m10769(obj);
        interfaceC8989.mo9606(new C5125(str, 1));
        return c6008;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9290(InterfaceC5004 interfaceC5004, String str, ContinuationImpl continuationImpl) {
        KtorServerKt$mcpSseEndpoint$1 ktorServerKt$mcpSseEndpoint$1;
        if (continuationImpl instanceof KtorServerKt$mcpSseEndpoint$1) {
            ktorServerKt$mcpSseEndpoint$1 = (KtorServerKt$mcpSseEndpoint$1) continuationImpl;
            int i = ktorServerKt$mcpSseEndpoint$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ktorServerKt$mcpSseEndpoint$1.label = i - Integer.MIN_VALUE;
            } else {
                ktorServerKt$mcpSseEndpoint$1 = new KtorServerKt$mcpSseEndpoint$1(continuationImpl);
            }
        }
        Object obj = ktorServerKt$mcpSseEndpoint$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ktorServerKt$mcpSseEndpoint$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            interfaceC5004.getClass();
            str.getClass();
            throw null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        } else {
            if (ktorServerKt$mcpSseEndpoint$1.L$0 != null) {
                C3775.m6954();
                return;
            }
            AbstractC6017.m10769(obj);
            f13194.mo9607(new C3391(8));
        }
    }
}
