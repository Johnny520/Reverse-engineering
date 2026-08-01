package io.ktor.client.plugins;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.C3775;
import io.ktor.client.call.C4700;
import io.ktor.client.plugins.api.AbstractC4715;
import io.ktor.client.plugins.api.AbstractC4719;
import io.ktor.util.C5036;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p257.C8969;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1", m556f = "HttpRequestRetry.kt", m557l = {296, 300, 317}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpRequestRetryKt$HttpRequestRetry$2$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7383 $delay;
    final /* synthetic */ InterfaceC7383 $delayMillis;
    final /* synthetic */ int $maxRetries;
    final /* synthetic */ InterfaceC7383 $modifyRequest;
    final /* synthetic */ InterfaceC7380 $shouldRetry;
    final /* synthetic */ InterfaceC7380 $shouldRetryOnException;
    final /* synthetic */ AbstractC4719 $this_createClientPlugin;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestRetryKt$HttpRequestRetry$2$1(InterfaceC7380 interfaceC7380, InterfaceC7380 interfaceC73802, int i, InterfaceC7383 interfaceC7383, InterfaceC7383 interfaceC73832, AbstractC4719 abstractC4719, InterfaceC7383 interfaceC73833, InterfaceC5189<? super HttpRequestRetryKt$HttpRequestRetry$2$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$shouldRetry = interfaceC7380;
        this.$shouldRetryOnException = interfaceC73802;
        this.$maxRetries = i;
        this.$delayMillis = interfaceC7383;
        this.$modifyRequest = interfaceC73832;
        this.$delay = interfaceC73833;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC4715 abstractC4715, C8969 c8969, InterfaceC5189<? super C4700> interfaceC5189) {
        HttpRequestRetryKt$HttpRequestRetry$2$1 httpRequestRetryKt$HttpRequestRetry$2$1 = new HttpRequestRetryKt$HttpRequestRetry$2$1(this.$shouldRetry, this.$shouldRetryOnException, this.$maxRetries, this.$delayMillis, this.$modifyRequest, null, this.$delay, interfaceC5189);
        httpRequestRetryKt$HttpRequestRetry$2$1.L$0 = abstractC4715;
        httpRequestRetryKt$HttpRequestRetry$2$1.L$1 = c8969;
        return httpRequestRetryKt$HttpRequestRetry$2$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        InterfaceC7383 interfaceC7383;
        InterfaceC7383 interfaceC73832;
        InterfaceC7380 interfaceC7380;
        InterfaceC7380 interfaceC73802;
        C8969 c8969;
        C8969 c89692;
        InterfaceC7380 interfaceC73803;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int iIntValue = this.label;
        int i2 = 1;
        if (iIntValue != 0) {
            try {
                if (iIntValue == 1) {
                    int i3 = this.I$1;
                    int i4 = this.I$0;
                    if (this.L$0 != null) {
                        C3775.m6954();
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                    C4700 c4700 = (C4700) obj;
                    InterfaceC9970 interfaceC9970 = AbstractC4764.f12494;
                    if (i4 >= i3) {
                        c4700.m8809();
                        throw null;
                    }
                    c4700.m8810();
                    throw null;
                }
                if (iIntValue == 2) {
                    int i5 = this.I$1;
                    int i6 = this.I$0;
                    C4700 c47002 = (C4700) this.L$6;
                    if (this.L$0 == null) {
                        AbstractC6017.m10769(obj);
                        return c47002;
                    }
                    C3775.m6954();
                    return null;
                }
                if (iIntValue != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iIntValue = this.I$1;
                i = this.I$0;
                AbstractC0900.m697(this.L$6);
                interfaceC7383 = (InterfaceC7383) this.L$5;
                interfaceC73832 = (InterfaceC7383) this.L$4;
                interfaceC7380 = (InterfaceC7380) this.L$3;
                interfaceC73802 = (InterfaceC7380) this.L$2;
                c8969 = (C8969) this.L$1;
                if (this.L$0 != null) {
                    C3775.m6954();
                    return null;
                }
                AbstractC6017.m10769(obj);
                AbstractC4764.f12494.trace("Retrying request " + c8969.f22805 + " attempt: " + i);
            } catch (Throwable th) {
                th = th;
                InterfaceC9970 interfaceC99702 = AbstractC4764.f12494;
                if (i2 < iIntValue || !((Boolean) interfaceC73803.invoke(new C4756(), c89692, th)).booleanValue()) {
                    throw th;
                }
                c89692.getClass();
                throw null;
            }
        } else {
            AbstractC6017.m10769(obj);
            if (this.L$0 != null) {
                C3775.m6954();
                return null;
            }
            c8969 = (C8969) this.L$1;
            C5036 c5036 = c8969.f22800;
            InterfaceC7380 interfaceC73804 = (InterfaceC7380) c5036.m9146(AbstractC4764.f12492);
            if (interfaceC73804 == null) {
                interfaceC73804 = this.$shouldRetry;
            }
            interfaceC73802 = interfaceC73804;
            InterfaceC7380 interfaceC73805 = (InterfaceC7380) c5036.m9146(AbstractC4764.f12491);
            if (interfaceC73805 == null) {
                interfaceC73805 = this.$shouldRetryOnException;
            }
            interfaceC7380 = interfaceC73805;
            Integer num = (Integer) c5036.m9146(AbstractC4764.f12493);
            iIntValue = num != null ? num.intValue() : this.$maxRetries;
            InterfaceC7383 interfaceC73833 = (InterfaceC7383) c5036.m9146(AbstractC4764.f12489);
            if (interfaceC73833 == null) {
                interfaceC73833 = this.$delayMillis;
            }
            interfaceC73832 = interfaceC73833;
            InterfaceC7383 interfaceC73834 = (InterfaceC7383) c5036.m9146(AbstractC4764.f12490);
            if (interfaceC73834 == null) {
                interfaceC73834 = this.$modifyRequest;
            }
            interfaceC7383 = interfaceC73834;
            i = 0;
        }
        c89692 = new C8969();
        c89692.m14152(c8969);
        c8969.f22801.mo11118(new C4749(c89692, 1));
        try {
            this.L$0 = null;
            this.L$1 = c8969;
            this.L$2 = interfaceC73802;
            this.L$3 = interfaceC7380;
            this.L$4 = interfaceC73832;
            this.L$5 = interfaceC7383;
            this.L$6 = c89692;
            this.I$0 = i;
            this.I$1 = iIntValue;
            this.label = 1;
            throw null;
        } catch (Throwable th2) {
            th = th2;
            i2 = i;
            interfaceC73803 = interfaceC7380;
            InterfaceC9970 interfaceC997022 = AbstractC4764.f12494;
            if (i2 < iIntValue) {
            }
            throw th;
        }
    }
}
