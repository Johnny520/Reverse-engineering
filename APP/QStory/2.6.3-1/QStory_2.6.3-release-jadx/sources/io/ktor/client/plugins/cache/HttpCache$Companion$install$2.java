package io.ktor.client.plugins.cache;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.C3775;
import com.android.p002dx.p005io.Opcodes;
import io.ktor.client.AbstractC4781;
import io.ktor.client.plugins.cache.storage.AbstractC4722;
import io.ktor.client.statement.AbstractC4778;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.cache.HttpCache$Companion$install$2", m556f = "HttpCache.kt", m557l = {Opcodes.ADD_DOUBLE_2ADDR, Opcodes.RSUB_INT, Opcodes.ADD_INT_LIT8, Opcodes.SHL_INT_LIT8, 229}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpCache$Companion$install$2 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ AbstractC4725 $plugin;
    final /* synthetic */ AbstractC4781 $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public HttpCache$Companion$install$2(AbstractC4725 abstractC4725, AbstractC4781 abstractC4781, InterfaceC5189<? super HttpCache$Companion$install$2> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, AbstractC4778 abstractC4778, InterfaceC5189<? super C6008> interfaceC5189) {
        HttpCache$Companion$install$2 httpCache$Companion$install$2 = new HttpCache$Companion$install$2(null, null, interfaceC5189);
        httpCache$Companion$install$2.L$0 = abstractC5026;
        httpCache$Companion$install$2.L$1 = abstractC4778;
        return httpCache$Companion$install$2.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw AbstractC0900.m719(this.L$1);
        }
        C6008 c6008 = C6008.f15084;
        if (i == 1) {
            AbstractC6017.m10769(obj);
            return c6008;
        }
        if (i == 2) {
            if (this.L$1 != null) {
                C3775.m6954();
                return null;
            }
            AbstractC6017.m10769(obj);
            ((AbstractC4722) obj).getClass();
            throw null;
        }
        if (i == 3) {
            AbstractC6017.m10769(obj);
            return c6008;
        }
        if (i != 4) {
            if (i == 5) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (this.L$1 != null) {
            C3775.m6954();
            return null;
        }
        AbstractC6017.m10769(obj);
        obj.getClass();
        C3775.m6954();
        return null;
    }
}
