package io.ktor.client.plugins.cache;

import androidx.collection.C0276;
import io.ktor.client.AbstractC3948;
import io.ktor.http.content.AbstractC3986;
import io.ktor.http.content.AbstractC3996;
import io.ktor.util.pipeline.AbstractC4193;
import io.ktor.utils.io.C4227;
import java.io.IOException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.io.C5476;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p236.AbstractC8114;
import p236.C8090;
import p236.C8092;
import p236.C8096;
import p236.C8097;
import p236.C8098;
import p236.C8115;
import p236.C8116;
import p236.InterfaceC8111;
import p241.C8138;
import p241.C8139;
import p243.AbstractC8149;
import p400.InterfaceC9156;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$1", f = "HttpCache.kt", l = {161, 165, 171, 180, 185}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "content", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class HttpCache$Companion$install$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ AbstractC3892 $plugin;
    final /* synthetic */ AbstractC3948 $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public HttpCache$Companion$install$1(AbstractC3892 abstractC3892, AbstractC3948 abstractC3948, InterfaceC4356<? super HttpCache$Companion$install$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC4193 abstractC4193, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        HttpCache$Companion$install$1 httpCache$Companion$install$1 = new HttpCache$Companion$install$1(null, null, interfaceC4356);
        httpCache$Companion$install$1.L$0 = abstractC4193;
        httpCache$Companion$install$1.L$1 = obj;
        return httpCache$Companion$install$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        C8138 c8138;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            AbstractC4193 abstractC4193 = (AbstractC4193) this.L$0;
            if ((this.L$1 instanceof AbstractC3996) && AbstractC4394.m8917(((C8139) abstractC4193.f12660).f22461, C8098.f22372)) {
                C8090 c8090M13543 = ((C8139) abstractC4193.f12660).f22462.m13543();
                InterfaceC9156 interfaceC9156 = AbstractC3890.f12090;
                if (c8090M13543.f22324.equals("http") || c8090M13543.f22324.equals("https")) {
                    throw null;
                }
            }
        } else {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            if (i != 2) {
                if (i == 3) {
                    AbstractC5184.m10206(obj);
                    return c5175;
                }
                if (i == 4) {
                    AbstractC5184.m10206(obj);
                    return c5175;
                }
                if (i == 5) {
                    AbstractC5184.m10206(obj);
                    return c5175;
                }
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4193 abstractC41932 = (AbstractC4193) this.L$0;
            AbstractC5184.m10206(obj);
            InterfaceC9156 interfaceC91562 = AbstractC3890.f12090;
            StringBuilder sb = new StringBuilder("No cached response for ");
            Object obj2 = abstractC41932.f12660;
            sb.append(((C8139) obj2).f22462);
            sb.append(" found");
            interfaceC91562.trace(sb.toString());
            C8139 c8139 = (C8139) obj2;
            C8115 c8115 = c8139.f22460;
            String[] strArr = AbstractC8114.f22415;
            if (AbstractC4921.m9883(c8115.m2403("Cache-Control")).contains(AbstractC3893.f12093)) {
                interfaceC91562.trace("No cache found and \"only-if-cached\" set for " + c8139.f22462);
                int i2 = AbstractC3892.f12091;
                this.L$0 = null;
                this.label = 3;
                abstractC41932.mo8578();
                C8139 c81392 = (C8139) abstractC41932.f12660;
                C8092 c8092M13544 = c81392.f22462.m13544();
                C8098 c8098 = c81392.f22461;
                C8116 c8116M13556 = c81392.f22460.m13556();
                Object obj3 = c81392.f22459;
                AbstractC3986 abstractC3986 = obj3 instanceof AbstractC3986 ? (AbstractC3986) obj3 : null;
                if (abstractC3986 != null) {
                    c8138 = new C8138(c8092M13544, c8098, c8116M13556, abstractC3986, c81392.f22458, c81392.f22457);
                } else {
                    C0276.m844(c81392.f22459, "No request transformation found: ");
                    c8138 = null;
                }
                C8096 c8096 = C8096.f22349;
                AbstractC8149.m13571(null);
                InterfaceC8111.f22411.getClass();
                byte[] bArr = new byte[0];
                int length = bArr.length;
                C5476 c5476 = new C5476();
                c5476.write(bArr, 0, length);
                new C4227(c5476);
                InterfaceC5451 interfaceC5451 = c8138.f22452;
                c8096.getClass();
                C8097.f22363.getClass();
                interfaceC5451.getClass();
                AbstractC8149.m13571(null);
                throw null;
            }
        }
        return c5175;
    }
}
