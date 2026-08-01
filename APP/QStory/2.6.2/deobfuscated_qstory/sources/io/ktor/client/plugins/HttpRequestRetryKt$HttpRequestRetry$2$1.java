package io.ktor.client.plugins;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2941;
import io.ktor.client.call.C3867;
import io.ktor.client.plugins.api.AbstractC3882;
import io.ktor.client.plugins.api.AbstractC3886;
import io.ktor.util.C4203;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p241.C8139;
import p400.InterfaceC9156;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1", f = "HttpRequestRetry.kt", l = {296, 300, 317}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;"}, k = 3, mv = {2, 0, 0})
final class HttpRequestRetryKt$HttpRequestRetry$2$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC6553 $delay;
    final /* synthetic */ InterfaceC6553 $delayMillis;
    final /* synthetic */ int $maxRetries;
    final /* synthetic */ InterfaceC6553 $modifyRequest;
    final /* synthetic */ InterfaceC6550 $shouldRetry;
    final /* synthetic */ InterfaceC6550 $shouldRetryOnException;
    final /* synthetic */ AbstractC3886 $this_createClientPlugin;
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
    public HttpRequestRetryKt$HttpRequestRetry$2$1(InterfaceC6550 interfaceC6550, InterfaceC6550 interfaceC65502, int i, InterfaceC6553 interfaceC6553, InterfaceC6553 interfaceC65532, AbstractC3886 abstractC3886, InterfaceC6553 interfaceC65533, InterfaceC4356<? super HttpRequestRetryKt$HttpRequestRetry$2$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$shouldRetry = interfaceC6550;
        this.$shouldRetryOnException = interfaceC65502;
        this.$maxRetries = i;
        this.$delayMillis = interfaceC6553;
        this.$modifyRequest = interfaceC65532;
        this.$delay = interfaceC65533;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC3882 abstractC3882, C8139 c8139, InterfaceC4356<? super C3867> interfaceC4356) {
        HttpRequestRetryKt$HttpRequestRetry$2$1 httpRequestRetryKt$HttpRequestRetry$2$1 = new HttpRequestRetryKt$HttpRequestRetry$2$1(this.$shouldRetry, this.$shouldRetryOnException, this.$maxRetries, this.$delayMillis, this.$modifyRequest, null, this.$delay, interfaceC4356);
        httpRequestRetryKt$HttpRequestRetry$2$1.L$0 = abstractC3882;
        httpRequestRetryKt$HttpRequestRetry$2$1.L$1 = c8139;
        return httpRequestRetryKt$HttpRequestRetry$2$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        InterfaceC6553 interfaceC6553;
        InterfaceC6553 interfaceC65532;
        InterfaceC6550 interfaceC6550;
        InterfaceC6550 interfaceC65502;
        C8139 c8139;
        C8139 c81392;
        InterfaceC6550 interfaceC65503;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int iIntValue = this.label;
        int i2 = 1;
        if (iIntValue != 0) {
            try {
                if (iIntValue == 1) {
                    int i3 = this.I$1;
                    int i4 = this.I$0;
                    if (this.L$0 != null) {
                        C2941.m6336();
                        return null;
                    }
                    AbstractC5184.m10206(obj);
                    C3867 c3867 = (C3867) obj;
                    InterfaceC9156 interfaceC9156 = AbstractC3931.f12144;
                    if (i4 >= i3) {
                        c3867.m8263();
                        throw null;
                    }
                    c3867.m8264();
                    throw null;
                }
                if (iIntValue == 2) {
                    int i5 = this.I$1;
                    int i6 = this.I$0;
                    C3867 c38672 = (C3867) this.L$6;
                    if (this.L$0 == null) {
                        AbstractC5184.m10206(obj);
                        return c38672;
                    }
                    C2941.m6336();
                    return null;
                }
                if (iIntValue != 3) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iIntValue = this.I$1;
                i = this.I$0;
                AbstractC0053.m137(this.L$6);
                interfaceC6553 = (InterfaceC6553) this.L$5;
                interfaceC65532 = (InterfaceC6553) this.L$4;
                interfaceC6550 = (InterfaceC6550) this.L$3;
                interfaceC65502 = (InterfaceC6550) this.L$2;
                c8139 = (C8139) this.L$1;
                if (this.L$0 != null) {
                    C2941.m6336();
                    return null;
                }
                AbstractC5184.m10206(obj);
                AbstractC3931.f12144.trace("Retrying request " + c8139.f22462 + " attempt: " + i);
            } catch (Throwable th) {
                th = th;
                InterfaceC9156 interfaceC91562 = AbstractC3931.f12144;
                if (i2 < iIntValue || !((Boolean) interfaceC65503.invoke(new C3923(), c81392, th)).booleanValue()) {
                    throw th;
                }
                c81392.getClass();
                throw null;
            }
        } else {
            AbstractC5184.m10206(obj);
            if (this.L$0 != null) {
                C2941.m6336();
                return null;
            }
            c8139 = (C8139) this.L$1;
            C4203 c4203 = c8139.f22457;
            InterfaceC6550 interfaceC65504 = (InterfaceC6550) c4203.m8597(AbstractC3931.f12142);
            if (interfaceC65504 == null) {
                interfaceC65504 = this.$shouldRetry;
            }
            interfaceC65502 = interfaceC65504;
            InterfaceC6550 interfaceC65505 = (InterfaceC6550) c4203.m8597(AbstractC3931.f12141);
            if (interfaceC65505 == null) {
                interfaceC65505 = this.$shouldRetryOnException;
            }
            interfaceC6550 = interfaceC65505;
            Integer num = (Integer) c4203.m8597(AbstractC3931.f12143);
            iIntValue = num != null ? num.intValue() : this.$maxRetries;
            InterfaceC6553 interfaceC65533 = (InterfaceC6553) c4203.m8597(AbstractC3931.f12139);
            if (interfaceC65533 == null) {
                interfaceC65533 = this.$delayMillis;
            }
            interfaceC65532 = interfaceC65533;
            InterfaceC6553 interfaceC65534 = (InterfaceC6553) c4203.m8597(AbstractC3931.f12140);
            if (interfaceC65534 == null) {
                interfaceC65534 = this.$modifyRequest;
            }
            interfaceC6553 = interfaceC65534;
            i = 0;
        }
        c81392 = new C8139();
        c81392.m13564(c8139);
        c8139.f22458.mo10554(new C3916(c81392, 1));
        try {
            this.L$0 = null;
            this.L$1 = c8139;
            this.L$2 = interfaceC65502;
            this.L$3 = interfaceC6550;
            this.L$4 = interfaceC65532;
            this.L$5 = interfaceC6553;
            this.L$6 = c81392;
            this.I$0 = i;
            this.I$1 = iIntValue;
            this.label = 1;
            throw null;
        } catch (Throwable th2) {
            th = th2;
            i2 = i;
            interfaceC65503 = interfaceC6550;
            InterfaceC9156 interfaceC915622 = AbstractC3931.f12144;
            if (i2 < iIntValue) {
            }
            throw th;
        }
    }
}
