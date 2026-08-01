package io.modelcontextprotocol.kotlin.sdk.client;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4211;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.collections.AbstractC4347;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p056.AbstractC6604;
import p056.C6715;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.client.Client", f = "Client.kt", l = {82, 90, 101, 103}, m = "connect$suspendImpl")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class Client$connect$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4287 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Client$connect$1(AbstractC4287 abstractC4287, InterfaceC4357<? super Client$connect$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = abstractC4287;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new Client$connect$1(null, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(obj2);
            this.L$0 = null;
            this.label = 1;
            throw null;
        }
        try {
            if (i2 == 1) {
                AbstractC0053.m137(this.L$0);
                AbstractC5185.m10210(obj2);
                throw null;
            }
            if (i2 == 2) {
                AbstractC0053.m137(this.L$0);
                AbstractC5185.m10210(obj2);
                C6715 c6715 = (C6715) obj2;
                if (AbstractC4347.m8837(c6715.f18145, AbstractC6604.f17979)) {
                    throw null;
                }
                throw new IllegalStateException("Server's protocol version is not supported: " + c6715.f18145);
            }
            if (i2 == 3) {
                AbstractC0053.m137(this.L$0);
                AbstractC5185.m10210(obj2);
                return C5176.f14739;
            }
            if (i2 != 4) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th = (Throwable) this.L$0;
            AbstractC5185.m10210(obj2);
            if (th instanceof CancellationException) {
                throw th;
            }
            C4211.m8605(th.getMessage(), "Error connecting to transport: ");
            return null;
        } catch (Throwable th2) {
            this.L$0 = th2;
            this.label = 4;
            throw null;
        }
    }
}
