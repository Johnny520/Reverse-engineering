package io.ktor.client.plugins;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2942;
import io.ktor.client.call.C3868;
import io.ktor.client.plugins.api.AbstractC3883;
import io.ktor.client.plugins.api.AbstractC3887;
import io.ktor.util.C4204;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p241.C8140;
import p398.InterfaceC9141;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1", f = "HttpRequestRetry.kt", l = {296, 300, 317}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;"}, k = 3, mv = {2, 0, 0})
final class HttpRequestRetryKt$HttpRequestRetry$2$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6554 $delay;
    final /* synthetic */ InterfaceC6554 $delayMillis;
    final /* synthetic */ int $maxRetries;
    final /* synthetic */ InterfaceC6554 $modifyRequest;
    final /* synthetic */ InterfaceC6551 $shouldRetry;
    final /* synthetic */ InterfaceC6551 $shouldRetryOnException;
    final /* synthetic */ AbstractC3887 $this_createClientPlugin;
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
    public HttpRequestRetryKt$HttpRequestRetry$2$1(InterfaceC6551 interfaceC6551, InterfaceC6551 interfaceC65512, int i, InterfaceC6554 interfaceC6554, InterfaceC6554 interfaceC65542, AbstractC3887 abstractC3887, InterfaceC6554 interfaceC65543, InterfaceC4357<? super HttpRequestRetryKt$HttpRequestRetry$2$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$shouldRetry = interfaceC6551;
        this.$shouldRetryOnException = interfaceC65512;
        this.$maxRetries = i;
        this.$delayMillis = interfaceC6554;
        this.$modifyRequest = interfaceC65542;
        this.$delay = interfaceC65543;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC3883 abstractC3883, C8140 c8140, InterfaceC4357<? super C3868> interfaceC4357) {
        HttpRequestRetryKt$HttpRequestRetry$2$1 httpRequestRetryKt$HttpRequestRetry$2$1 = new HttpRequestRetryKt$HttpRequestRetry$2$1(this.$shouldRetry, this.$shouldRetryOnException, this.$maxRetries, this.$delayMillis, this.$modifyRequest, null, this.$delay, interfaceC4357);
        httpRequestRetryKt$HttpRequestRetry$2$1.L$0 = abstractC3883;
        httpRequestRetryKt$HttpRequestRetry$2$1.L$1 = c8140;
        return httpRequestRetryKt$HttpRequestRetry$2$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        InterfaceC6554 interfaceC6554;
        InterfaceC6554 interfaceC65542;
        InterfaceC6551 interfaceC6551;
        InterfaceC6551 interfaceC65512;
        C8140 c8140;
        C8140 c81402;
        InterfaceC6551 interfaceC65513;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int iIntValue = this.label;
        int i2 = 1;
        if (iIntValue != 0) {
            try {
                if (iIntValue == 1) {
                    int i3 = this.I$1;
                    int i4 = this.I$0;
                    if (this.L$0 != null) {
                        C2942.m6394();
                        return null;
                    }
                    AbstractC5185.m10210(obj);
                    C3868 c3868 = (C3868) obj;
                    InterfaceC9141 interfaceC9141 = AbstractC3932.f12149;
                    if (i4 >= i3) {
                        c3868.m8250();
                        throw null;
                    }
                    c3868.m8251();
                    throw null;
                }
                if (iIntValue == 2) {
                    int i5 = this.I$1;
                    int i6 = this.I$0;
                    C3868 c38682 = (C3868) this.L$6;
                    if (this.L$0 == null) {
                        AbstractC5185.m10210(obj);
                        return c38682;
                    }
                    C2942.m6394();
                    return null;
                }
                if (iIntValue != 3) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iIntValue = this.I$1;
                i = this.I$0;
                AbstractC0053.m137(this.L$6);
                interfaceC6554 = (InterfaceC6554) this.L$5;
                interfaceC65542 = (InterfaceC6554) this.L$4;
                interfaceC6551 = (InterfaceC6551) this.L$3;
                interfaceC65512 = (InterfaceC6551) this.L$2;
                c8140 = (C8140) this.L$1;
                if (this.L$0 != null) {
                    C2942.m6394();
                    return null;
                }
                AbstractC5185.m10210(obj);
                AbstractC3932.f12149.trace("Retrying request " + c8140.f22460 + " attempt: " + i);
            } catch (Throwable th) {
                th = th;
                InterfaceC9141 interfaceC91412 = AbstractC3932.f12149;
                if (i2 < iIntValue || !((Boolean) interfaceC65513.invoke(new C3924(), c81402, th)).booleanValue()) {
                    throw th;
                }
                c81402.getClass();
                throw null;
            }
        } else {
            AbstractC5185.m10210(obj);
            if (this.L$0 != null) {
                C2942.m6394();
                return null;
            }
            c8140 = (C8140) this.L$1;
            C4204 c4204 = c8140.f22455;
            InterfaceC6551 interfaceC65514 = (InterfaceC6551) c4204.m8587(AbstractC3932.f12147);
            if (interfaceC65514 == null) {
                interfaceC65514 = this.$shouldRetry;
            }
            interfaceC65512 = interfaceC65514;
            InterfaceC6551 interfaceC65515 = (InterfaceC6551) c4204.m8587(AbstractC3932.f12146);
            if (interfaceC65515 == null) {
                interfaceC65515 = this.$shouldRetryOnException;
            }
            interfaceC6551 = interfaceC65515;
            Integer num = (Integer) c4204.m8587(AbstractC3932.f12148);
            iIntValue = num != null ? num.intValue() : this.$maxRetries;
            InterfaceC6554 interfaceC65543 = (InterfaceC6554) c4204.m8587(AbstractC3932.f12144);
            if (interfaceC65543 == null) {
                interfaceC65543 = this.$delayMillis;
            }
            interfaceC65542 = interfaceC65543;
            InterfaceC6554 interfaceC65544 = (InterfaceC6554) c4204.m8587(AbstractC3932.f12145);
            if (interfaceC65544 == null) {
                interfaceC65544 = this.$modifyRequest;
            }
            interfaceC6554 = interfaceC65544;
            i = 0;
        }
        c81402 = new C8140();
        c81402.m13593(c8140);
        c8140.f22456.mo10559(new C3917(c81402, 1));
        try {
            this.L$0 = null;
            this.L$1 = c8140;
            this.L$2 = interfaceC65512;
            this.L$3 = interfaceC6551;
            this.L$4 = interfaceC65542;
            this.L$5 = interfaceC6554;
            this.L$6 = c81402;
            this.I$0 = i;
            this.I$1 = iIntValue;
            this.label = 1;
            throw null;
        } catch (Throwable th2) {
            th = th2;
            i2 = i;
            interfaceC65513 = interfaceC6551;
            InterfaceC9141 interfaceC914122 = AbstractC3932.f12149;
            if (i2 < iIntValue) {
            }
            throw th;
        }
    }
}
