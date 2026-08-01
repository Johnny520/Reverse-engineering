package io.modelcontextprotocol.kotlin.sdk.client;

import androidx.activity.AbstractC0900;
import io.ktor.util.C5043;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5179;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p072.AbstractC7433;
import p072.C7544;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.client.Client", m556f = "Client.kt", m557l = {82, 90, 101, 103}, m558m = "connect$suspendImpl")
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class Client$connect$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC5119 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Client$connect$1(AbstractC5119 abstractC5119, InterfaceC5189<? super Client$connect$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = abstractC5119;
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
            AbstractC6017.m10769(obj2);
            this.L$0 = null;
            this.label = 1;
            throw null;
        }
        try {
            if (i2 == 1) {
                AbstractC0900.m697(this.L$0);
                AbstractC6017.m10769(obj2);
                throw null;
            }
            if (i2 == 2) {
                AbstractC0900.m697(this.L$0);
                AbstractC6017.m10769(obj2);
                C7544 c7544 = (C7544) obj2;
                if (AbstractC5179.m9396(c7544.f18490, AbstractC7433.f18324)) {
                    throw null;
                }
                throw new IllegalStateException("Server's protocol version is not supported: " + c7544.f18490);
            }
            if (i2 == 3) {
                AbstractC0900.m697(this.L$0);
                AbstractC6017.m10769(obj2);
                return C6008.f15084;
            }
            if (i2 != 4) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th = (Throwable) this.L$0;
            AbstractC6017.m10769(obj2);
            if (th instanceof CancellationException) {
                throw th;
            }
            C5043.m9164(th.getMessage(), "Error connecting to transport: ");
            return null;
        } catch (Throwable th2) {
            this.L$0 = th2;
            this.label = 4;
            throw null;
        }
    }
}
