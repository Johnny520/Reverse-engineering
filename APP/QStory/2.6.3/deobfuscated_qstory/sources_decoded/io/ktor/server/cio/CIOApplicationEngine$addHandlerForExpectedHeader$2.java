package io.ktor.server.cio;

import androidx.compose.runtime.internal.C1245;
import io.ktor.server.application.AbstractC4060;
import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.utils.io.AbstractC4246;
import io.ktor.utils.io.C4249;
import io.ktor.utils.io.InterfaceC4247;
import java.util.Locale;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import p052.InterfaceC6551;
import p053.AbstractC6561;
import p059.C6857;
import p063.InterfaceC6862;
import p236.AbstractC8115;
import p236.C8097;
import p236.C8098;
import p236.InterfaceC8112;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.cio.CIOApplicationEngine$addHandlerForExpectedHeader$2", f = "CIOApplicationEngine.kt", l = {229, 136, 137}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class CIOApplicationEngine$addHandlerForExpectedHeader$2 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ C4083 $call;
    final /* synthetic */ String $continueResponse;
    final /* synthetic */ String $expectHeaderValue;
    final /* synthetic */ InterfaceC4247 $output;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C4081 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationEngine$addHandlerForExpectedHeader$2(C4083 c4083, C4081 c4081, String str, InterfaceC4247 interfaceC4247, String str2, InterfaceC4357<? super CIOApplicationEngine$addHandlerForExpectedHeader$2> interfaceC4357) {
        super(3, interfaceC4357);
        this.$call = c4083;
        this.this$0 = c4081;
        this.$expectHeaderValue = str;
        this.$output = interfaceC4247;
        this.$continueResponse = str2;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        return new CIOApplicationEngine$addHandlerForExpectedHeader$2(this.$call, this.this$0, this.$expectHeaderValue, this.$output, this.$continueResponse, interfaceC4357).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        InterfaceC4247 interfaceC4247;
        InterfaceC4247 interfaceC42472;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        InterfaceC5087 interfaceC5087M8912 = null;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
            }
            if (i != 2) {
                if (i != 3) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
                return c5176;
            }
            interfaceC4247 = (InterfaceC4247) this.L$1;
            interfaceC42472 = (InterfaceC4247) this.L$0;
            AbstractC5185.m10210(obj);
            this.L$0 = interfaceC42472;
            this.L$1 = null;
            this.label = 3;
            return ((C4249) interfaceC4247).m8700(this) != coroutineSingletons ? coroutineSingletons : c5176;
        }
        AbstractC5185.m10210(obj);
        C4079 c4079 = this.$call.f12401;
        c4079.getClass();
        C8098 c8098M12041 = AbstractC6561.m12041((String) ((C1245) AbstractC8189.m13677(c4079)).f3618);
        InterfaceC8112 interfaceC8112Mo384 = this.$call.f12401.mo384();
        String[] strArr = AbstractC8115.f22413;
        String strMo8356 = interfaceC8112Mo384.mo8356("Expect");
        if (strMo8356 != null) {
            lowerCase = strMo8356.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        this.this$0.getClass();
        String strMo83562 = c4079.mo384().mo8356("Content-Length");
        Long lValueOf = strMo83562 != null ? Long.valueOf(Long.parseLong(strMo83562)) : null;
        boolean z = c4079.mo384().mo8356("Transfer-Encoding") != null || (lValueOf != null && lValueOf.longValue() > 0);
        if (lowerCase != null && !AbstractC4395.m8907(c8098M12041, C8098.f22360) && z) {
            if (lowerCase.equals(this.$expectHeaderValue)) {
                interfaceC4247 = this.$output;
                String str = this.$continueResponse;
                this.L$0 = interfaceC4247;
                this.L$1 = interfaceC4247;
                this.label = 2;
                if (AbstractC4246.m8693(interfaceC4247, str, this) != coroutineSingletons) {
                    interfaceC42472 = interfaceC4247;
                    this.L$0 = interfaceC42472;
                    this.L$1 = null;
                    this.label = 3;
                    if (((C4249) interfaceC4247).m8700(this) != coroutineSingletons) {
                    }
                }
            } else {
                C4083 c4083 = this.$call;
                C8097 c8097 = C8097.f22349;
                InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C8097.class);
                try {
                    interfaceC5087M8912 = AbstractC4396.m8912(C8097.class);
                } catch (Throwable unused) {
                }
                C6857 c6857 = new C6857(interfaceC5093Mo8917, interfaceC5087M8912);
                this.label = 1;
                c4083.getClass();
                if (AbstractC4060.m8464(c4083, c8097, c6857, this) == coroutineSingletons) {
                }
            }
        }
    }
}
