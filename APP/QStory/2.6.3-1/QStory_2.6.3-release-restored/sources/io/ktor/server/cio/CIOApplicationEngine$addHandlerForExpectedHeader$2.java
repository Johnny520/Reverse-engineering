package io.ktor.server.cio;

import androidx.compose.runtime.internal.C2080;
import io.ktor.server.application.AbstractC4892;
import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import java.util.Locale;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7380;
import p069.AbstractC7390;
import p075.C7686;
import p079.InterfaceC7691;
import p252.AbstractC8944;
import p252.C8926;
import p252.C8927;
import p252.InterfaceC8941;
import p269.AbstractC9018;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.cio.CIOApplicationEngine$addHandlerForExpectedHeader$2", m556f = "CIOApplicationEngine.kt", m557l = {229, 136, 137}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class CIOApplicationEngine$addHandlerForExpectedHeader$2 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ C4915 $call;
    final /* synthetic */ String $continueResponse;
    final /* synthetic */ String $expectHeaderValue;
    final /* synthetic */ InterfaceC5079 $output;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C4913 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationEngine$addHandlerForExpectedHeader$2(C4915 c4915, C4913 c4913, String str, InterfaceC5079 interfaceC5079, String str2, InterfaceC5189<? super CIOApplicationEngine$addHandlerForExpectedHeader$2> interfaceC5189) {
        super(3, interfaceC5189);
        this.$call = c4915;
        this.this$0 = c4913;
        this.$expectHeaderValue = str;
        this.$output = interfaceC5079;
        this.$continueResponse = str2;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        return new CIOApplicationEngine$addHandlerForExpectedHeader$2(this.$call, this.this$0, this.$expectHeaderValue, this.$output, this.$continueResponse, interfaceC5189).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        InterfaceC5079 interfaceC5079;
        InterfaceC5079 interfaceC50792;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        InterfaceC5919 interfaceC5919M9471 = null;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
            }
            if (i != 2) {
                if (i != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                return c6008;
            }
            interfaceC5079 = (InterfaceC5079) this.L$1;
            interfaceC50792 = (InterfaceC5079) this.L$0;
            AbstractC6017.m10769(obj);
            this.L$0 = interfaceC50792;
            this.L$1 = null;
            this.label = 3;
            return ((C5081) interfaceC5079).m9259(this) != coroutineSingletons ? coroutineSingletons : c6008;
        }
        AbstractC6017.m10769(obj);
        C4911 c4911 = this.$call.f12746;
        c4911.getClass();
        C8927 c8927M12600 = AbstractC7390.m12600((String) ((C2080) AbstractC9018.m14236(c4911)).f3963);
        InterfaceC8941 interfaceC8941Mo944 = this.$call.f12746.mo944();
        String[] strArr = AbstractC8944.f22758;
        String strMo8915 = interfaceC8941Mo944.mo8915("Expect");
        if (strMo8915 != null) {
            lowerCase = strMo8915.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } else {
            lowerCase = null;
        }
        this.this$0.getClass();
        String strMo89152 = c4911.mo944().mo8915("Content-Length");
        Long lValueOf = strMo89152 != null ? Long.valueOf(Long.parseLong(strMo89152)) : null;
        boolean z = c4911.mo944().mo8915("Transfer-Encoding") != null || (lValueOf != null && lValueOf.longValue() > 0);
        if (lowerCase != null && !AbstractC5227.m9466(c8927M12600, C8927.f22705) && z) {
            if (lowerCase.equals(this.$expectHeaderValue)) {
                interfaceC5079 = this.$output;
                String str = this.$continueResponse;
                this.L$0 = interfaceC5079;
                this.L$1 = interfaceC5079;
                this.label = 2;
                if (AbstractC5078.m9252(interfaceC5079, str, this) != coroutineSingletons) {
                    interfaceC50792 = interfaceC5079;
                    this.L$0 = interfaceC50792;
                    this.L$1 = null;
                    this.label = 3;
                    if (((C5081) interfaceC5079).m9259(this) != coroutineSingletons) {
                    }
                }
            } else {
                C4915 c4915 = this.$call;
                C8926 c8926 = C8926.f22694;
                InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C8926.class);
                try {
                    interfaceC5919M9471 = AbstractC5228.m9471(C8926.class);
                } catch (Throwable unused) {
                }
                C7686 c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M9471);
                this.label = 1;
                c4915.getClass();
                if (AbstractC4892.m9023(c4915, c8926, c7686, this) == coroutineSingletons) {
                }
            }
        }
    }
}
