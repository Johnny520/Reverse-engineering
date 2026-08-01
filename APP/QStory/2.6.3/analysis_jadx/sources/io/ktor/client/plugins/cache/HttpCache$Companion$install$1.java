package io.ktor.client.plugins.cache;

import androidx.collection.C0276;
import io.ktor.client.AbstractC3949;
import io.ktor.http.content.AbstractC3987;
import io.ktor.http.content.AbstractC3997;
import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.utils.io.C4228;
import java.io.IOException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.io.C5477;
import p034.AbstractC6344;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p236.AbstractC8115;
import p236.C8091;
import p236.C8093;
import p236.C8097;
import p236.C8098;
import p236.C8099;
import p236.C8116;
import p236.C8117;
import p236.InterfaceC8112;
import p241.C8139;
import p241.C8140;
import p243.AbstractC8150;
import p398.InterfaceC9141;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$1", f = "HttpCache.kt", l = {161, 165, 171, 180, 185}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "content", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class HttpCache$Companion$install$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ AbstractC3893 $plugin;
    final /* synthetic */ AbstractC3949 $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public HttpCache$Companion$install$1(AbstractC3893 abstractC3893, AbstractC3949 abstractC3949, InterfaceC4357<? super HttpCache$Companion$install$1> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        HttpCache$Companion$install$1 httpCache$Companion$install$1 = new HttpCache$Companion$install$1(null, null, interfaceC4357);
        httpCache$Companion$install$1.L$0 = abstractC4194;
        httpCache$Companion$install$1.L$1 = obj;
        return httpCache$Companion$install$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        C8139 c8139;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            AbstractC4194 abstractC4194 = (AbstractC4194) this.L$0;
            if ((this.L$1 instanceof AbstractC3997) && AbstractC4395.m8907(((C8140) abstractC4194.f12664).f22459, C8099.f22370)) {
                C8091 c8091M13572 = ((C8140) abstractC4194.f12664).f22460.m13572();
                InterfaceC9141 interfaceC9141 = AbstractC3891.f12095;
                if (c8091M13572.f22322.equals("http") || c8091M13572.f22322.equals("https")) {
                    throw null;
                }
            }
        } else {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            if (i != 2) {
                if (i == 3) {
                    AbstractC5185.m10210(obj);
                    return c5176;
                }
                if (i == 4) {
                    AbstractC5185.m10210(obj);
                    return c5176;
                }
                if (i == 5) {
                    AbstractC5185.m10210(obj);
                    return c5176;
                }
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC4194 abstractC41942 = (AbstractC4194) this.L$0;
            AbstractC5185.m10210(obj);
            InterfaceC9141 interfaceC91412 = AbstractC3891.f12095;
            StringBuilder sb = new StringBuilder("No cached response for ");
            Object obj2 = abstractC41942.f12664;
            sb.append(((C8140) obj2).f22460);
            sb.append(" found");
            interfaceC91412.trace(sb.toString());
            C8140 c8140 = (C8140) obj2;
            C8116 c8116 = c8140.f22458;
            String[] strArr = AbstractC8115.f22413;
            if (AbstractC6344.m11876(c8116.m2413("Cache-Control")).contains(AbstractC3894.f12098)) {
                interfaceC91412.trace("No cache found and \"only-if-cached\" set for " + c8140.f22460);
                int i2 = AbstractC3893.f12096;
                this.L$0 = null;
                this.label = 3;
                abstractC41942.mo8568();
                C8140 c81402 = (C8140) abstractC41942.f12664;
                C8093 c8093M13573 = c81402.f22460.m13573();
                C8099 c8099 = c81402.f22459;
                C8117 c8117M13585 = c81402.f22458.m13585();
                Object obj3 = c81402.f22457;
                AbstractC3987 abstractC3987 = obj3 instanceof AbstractC3987 ? (AbstractC3987) obj3 : null;
                if (abstractC3987 != null) {
                    c8139 = new C8139(c8093M13573, c8099, c8117M13585, abstractC3987, c81402.f22456, c81402.f22455);
                } else {
                    C0276.m845(c81402.f22457, "No request transformation found: ");
                    c8139 = null;
                }
                C8097 c8097 = C8097.f22347;
                AbstractC8150.m13600(null);
                InterfaceC8112.f22409.getClass();
                byte[] bArr = new byte[0];
                int length = bArr.length;
                C5477 c5477 = new C5477();
                c5477.write(bArr, 0, length);
                new C4228(c5477);
                InterfaceC5452 interfaceC5452 = c8139.f22450;
                c8097.getClass();
                C8098.f22361.getClass();
                interfaceC5452.getClass();
                AbstractC8150.m13600(null);
                throw null;
            }
        }
        return c5176;
    }
}
