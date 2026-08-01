package io.modelcontextprotocol.kotlin.sdk.client;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4210;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.AbstractC4346;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p056.AbstractC6603;
import p056.C6714;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.client.Client", f = "Client.kt", l = {82, 90, 101, 103}, m = "connect$suspendImpl")
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class Client$connect$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4286 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Client$connect$1(AbstractC4286 abstractC4286, InterfaceC4356<? super Client$connect$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = abstractC4286;
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
            AbstractC5184.m10206(obj2);
            this.L$0 = null;
            this.label = 1;
            throw null;
        }
        try {
            if (i2 == 1) {
                AbstractC0053.m137(this.L$0);
                AbstractC5184.m10206(obj2);
                throw null;
            }
            if (i2 == 2) {
                AbstractC0053.m137(this.L$0);
                AbstractC5184.m10206(obj2);
                C6714 c6714 = (C6714) obj2;
                if (AbstractC4346.m8843(c6714.f18150, AbstractC6603.f17984)) {
                    throw null;
                }
                throw new IllegalStateException("Server's protocol version is not supported: " + c6714.f18150);
            }
            if (i2 == 3) {
                AbstractC0053.m137(this.L$0);
                AbstractC5184.m10206(obj2);
                return C5175.f14739;
            }
            if (i2 != 4) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th = (Throwable) this.L$0;
            AbstractC5184.m10206(obj2);
            if (th instanceof CancellationException) {
                throw th;
            }
            C4210.m8615(th.getMessage(), "Error connecting to transport: ");
            return null;
        } catch (Throwable th2) {
            this.L$0 = th2;
            this.label = 4;
            throw null;
        }
    }
}
