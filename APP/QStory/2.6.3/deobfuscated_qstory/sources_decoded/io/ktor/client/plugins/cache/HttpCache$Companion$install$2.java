package io.ktor.client.plugins.cache;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2942;
import com.android.dx.io.Opcodes;
import io.ktor.client.AbstractC3949;
import io.ktor.client.plugins.cache.storage.AbstractC3890;
import io.ktor.client.statement.AbstractC3946;
import io.ktor.util.pipeline.AbstractC4194;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$2", f = "HttpCache.kt", l = {Opcodes.ADD_DOUBLE_2ADDR, Opcodes.RSUB_INT, Opcodes.ADD_INT_LIT8, Opcodes.SHL_INT_LIT8, 229}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)V"}, k = 3, mv = {2, 0, 0})
final class HttpCache$Companion$install$2 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ AbstractC3893 $plugin;
    final /* synthetic */ AbstractC3949 $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public HttpCache$Companion$install$2(AbstractC3893 abstractC3893, AbstractC3949 abstractC3949, InterfaceC4357<? super HttpCache$Companion$install$2> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, AbstractC3946 abstractC3946, InterfaceC4357<? super C5176> interfaceC4357) {
        HttpCache$Companion$install$2 httpCache$Companion$install$2 = new HttpCache$Companion$install$2(null, null, interfaceC4357);
        httpCache$Companion$install$2.L$0 = abstractC4194;
        httpCache$Companion$install$2.L$1 = abstractC3946;
        return httpCache$Companion$install$2.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw AbstractC0053.m159(this.L$1);
        }
        C5176 c5176 = C5176.f14739;
        if (i == 1) {
            AbstractC5185.m10210(obj);
            return c5176;
        }
        if (i == 2) {
            if (this.L$1 != null) {
                C2942.m6394();
                return null;
            }
            AbstractC5185.m10210(obj);
            ((AbstractC3890) obj).getClass();
            throw null;
        }
        if (i == 3) {
            AbstractC5185.m10210(obj);
            return c5176;
        }
        if (i != 4) {
            if (i == 5) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (this.L$1 != null) {
            C2942.m6394();
            return null;
        }
        AbstractC5185.m10210(obj);
        obj.getClass();
        C2942.m6394();
        return null;
    }
}
