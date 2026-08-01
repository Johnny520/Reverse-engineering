package io.ktor.client.plugins.cache;

import androidx.collection.C1123;
import io.ktor.client.AbstractC4781;
import io.ktor.http.content.AbstractC4819;
import io.ktor.http.content.AbstractC4829;
import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.C5060;
import java.io.IOException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.p010io.C6309;
import p050.AbstractC7173;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p252.AbstractC8944;
import p252.C8920;
import p252.C8922;
import p252.C8926;
import p252.C8927;
import p252.C8928;
import p252.C8945;
import p252.C8946;
import p252.InterfaceC8941;
import p257.C8968;
import p257.C8969;
import p259.AbstractC8979;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$1", m556f = "HttpCache.kt", m557l = {161, 165, 171, 180, 185}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "content", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpCache$Companion$install$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ AbstractC4725 $plugin;
    final /* synthetic */ AbstractC4781 $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public HttpCache$Companion$install$1(AbstractC4725 abstractC4725, AbstractC4781 abstractC4781, InterfaceC5189<? super HttpCache$Companion$install$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        HttpCache$Companion$install$1 httpCache$Companion$install$1 = new HttpCache$Companion$install$1(null, null, interfaceC5189);
        httpCache$Companion$install$1.L$0 = abstractC5026;
        httpCache$Companion$install$1.L$1 = obj;
        return httpCache$Companion$install$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        C8968 c8968;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5026 abstractC5026 = (AbstractC5026) this.L$0;
            if ((this.L$1 instanceof AbstractC4829) && AbstractC5227.m9466(((C8969) abstractC5026.f13009).f22804, C8928.f22715)) {
                C8920 c8920M14131 = ((C8969) abstractC5026.f13009).f22805.m14131();
                InterfaceC9970 interfaceC9970 = AbstractC4723.f12440;
                if (c8920M14131.f22667.equals("http") || c8920M14131.f22667.equals("https")) {
                    throw null;
                }
            }
        } else {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            if (i != 2) {
                if (i == 3) {
                    AbstractC6017.m10769(obj);
                    return c6008;
                }
                if (i == 4) {
                    AbstractC6017.m10769(obj);
                    return c6008;
                }
                if (i == 5) {
                    AbstractC6017.m10769(obj);
                    return c6008;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5026 abstractC50262 = (AbstractC5026) this.L$0;
            AbstractC6017.m10769(obj);
            InterfaceC9970 interfaceC99702 = AbstractC4723.f12440;
            StringBuilder sb = new StringBuilder("No cached response for ");
            Object obj2 = abstractC50262.f13009;
            sb.append(((C8969) obj2).f22805);
            sb.append(" found");
            interfaceC99702.trace(sb.toString());
            C8969 c8969 = (C8969) obj2;
            C8945 c8945 = c8969.f22803;
            String[] strArr = AbstractC8944.f22758;
            if (AbstractC7173.m12435(c8945.m2973("Cache-Control")).contains(AbstractC4726.f12443)) {
                interfaceC99702.trace("No cache found and \"only-if-cached\" set for " + c8969.f22805);
                int i2 = AbstractC4725.f12441;
                this.L$0 = null;
                this.label = 3;
                abstractC50262.mo9127();
                C8969 c89692 = (C8969) abstractC50262.f13009;
                C8922 c8922M14132 = c89692.f22805.m14132();
                C8928 c8928 = c89692.f22804;
                C8946 c8946M14144 = c89692.f22803.m14144();
                Object obj3 = c89692.f22802;
                AbstractC4819 abstractC4819 = obj3 instanceof AbstractC4819 ? (AbstractC4819) obj3 : null;
                if (abstractC4819 != null) {
                    c8968 = new C8968(c8922M14132, c8928, c8946M14144, abstractC4819, c89692.f22801, c89692.f22800);
                } else {
                    C1123.m1405(c89692.f22802, "No request transformation found: ");
                    c8968 = null;
                }
                C8926 c8926 = C8926.f22692;
                AbstractC8979.m14159(null);
                InterfaceC8941.f22754.getClass();
                byte[] bArr = new byte[0];
                int length = bArr.length;
                C6309 c6309 = new C6309();
                c6309.write(bArr, 0, length);
                new C5060(c6309);
                InterfaceC6284 interfaceC6284 = c8968.f22795;
                c8926.getClass();
                C8927.f22706.getClass();
                interfaceC6284.getClass();
                AbstractC8979.m14159(null);
                throw null;
            }
        }
        return c6008;
    }
}
