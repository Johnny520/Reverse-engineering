package io.ktor.server.cio;

import androidx.compose.runtime.internal.C1245;
import io.ktor.server.application.AbstractC4059;
import io.ktor.util.pipeline.AbstractC4193;
import io.ktor.utils.io.AbstractC4245;
import io.ktor.utils.io.C4248;
import io.ktor.utils.io.InterfaceC4246;
import java.util.Locale;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import p033.AbstractC6325;
import p052.InterfaceC6550;
import p059.C6856;
import p063.InterfaceC6861;
import p236.AbstractC8114;
import p236.C8096;
import p236.C8097;
import p236.InterfaceC8111;
import p253.AbstractC8188;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.cio.CIOApplicationEngine$addHandlerForExpectedHeader$2", f = "CIOApplicationEngine.kt", l = {229, 136, 137}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class CIOApplicationEngine$addHandlerForExpectedHeader$2 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ C4082 $call;
    final /* synthetic */ String $continueResponse;
    final /* synthetic */ String $expectHeaderValue;
    final /* synthetic */ InterfaceC4246 $output;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C4080 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationEngine$addHandlerForExpectedHeader$2(C4082 c4082, C4080 c4080, String str, InterfaceC4246 interfaceC4246, String str2, InterfaceC4356<? super CIOApplicationEngine$addHandlerForExpectedHeader$2> interfaceC4356) {
        super(3, interfaceC4356);
        this.$call = c4082;
        this.this$0 = c4080;
        this.$expectHeaderValue = str;
        this.$output = interfaceC4246;
        this.$continueResponse = str2;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        return new CIOApplicationEngine$addHandlerForExpectedHeader$2(this.$call, this.this$0, this.$expectHeaderValue, this.$output, this.$continueResponse, interfaceC4356).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        InterfaceC4246 interfaceC4246;
        InterfaceC4246 interfaceC42462;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        InterfaceC5086 interfaceC5086M8922 = null;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
            }
            if (i != 2) {
                if (i != 3) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
                return c5175;
            }
            interfaceC4246 = (InterfaceC4246) this.L$1;
            interfaceC42462 = (InterfaceC4246) this.L$0;
            AbstractC5184.m10206(obj);
            this.L$0 = interfaceC42462;
            this.L$1 = null;
            this.label = 3;
            return ((C4248) interfaceC4246).m8710(this) != coroutineSingletons ? coroutineSingletons : c5175;
        }
        AbstractC5184.m10206(obj);
        C4078 c4078 = this.$call.f12397;
        c4078.getClass();
        C8097 c8097M11848 = AbstractC6325.m11848((String) ((C1245) AbstractC8188.m13653(c4078)).f3617);
        InterfaceC8111 interfaceC8111Mo383 = this.$call.f12397.mo383();
        String[] strArr = AbstractC8114.f22415;
        String strMo8366 = interfaceC8111Mo383.mo8366("Expect");
        if (strMo8366 != null) {
            lowerCase = strMo8366.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        this.this$0.getClass();
        String strMo83662 = c4078.mo383().mo8366("Content-Length");
        Long lValueOf = strMo83662 != null ? Long.valueOf(Long.parseLong(strMo83662)) : null;
        boolean z = c4078.mo383().mo8366("Transfer-Encoding") != null || (lValueOf != null && lValueOf.longValue() > 0);
        if (lowerCase != null && !AbstractC4394.m8917(c8097M11848, C8097.f22362) && z) {
            if (lowerCase.equals(this.$expectHeaderValue)) {
                interfaceC4246 = this.$output;
                String str = this.$continueResponse;
                this.L$0 = interfaceC4246;
                this.L$1 = interfaceC4246;
                this.label = 2;
                if (AbstractC4245.m8703(interfaceC4246, str, this) != coroutineSingletons) {
                    interfaceC42462 = interfaceC4246;
                    this.L$0 = interfaceC42462;
                    this.L$1 = null;
                    this.label = 3;
                    if (((C4248) interfaceC4246).m8710(this) != coroutineSingletons) {
                    }
                }
            } else {
                C4082 c4082 = this.$call;
                C8096 c8096 = C8096.f22351;
                InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C8096.class);
                try {
                    interfaceC5086M8922 = AbstractC4395.m8922(C8096.class);
                } catch (Throwable unused) {
                }
                C6856 c6856 = new C6856(interfaceC5092Mo8927, interfaceC5086M8922);
                this.label = 1;
                c4082.getClass();
                if (AbstractC4059.m8474(c4082, c8096, c6856, this) == coroutineSingletons) {
                }
            }
        }
    }
}
