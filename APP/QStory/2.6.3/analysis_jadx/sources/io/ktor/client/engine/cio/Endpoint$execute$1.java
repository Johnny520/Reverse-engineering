package io.ktor.client.engine.cio;

import com.alibaba.fastjson2.C2942;
import java.util.TimeZone;
import kotlin.AbstractC5185;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C5438;
import kotlinx.coroutines.InterfaceC5441;
import p063.InterfaceC6862;
import p243.AbstractC8150;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.engine.cio.Endpoint", f = "Endpoint.kt", l = {65, 71, 72}, m = "execute")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class Endpoint$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C3871 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$execute$1(C3871 c3871, InterfaceC4357<? super Endpoint$execute$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c3871;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C3871 c3871 = this.this$0;
        c3871.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new Endpoint$execute$1(c3871, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC5185.m10210(obj2);
            TimeZone timeZone = AbstractC8150.f22474;
            c3871.lastActivity = System.currentTimeMillis();
            throw null;
        }
        if (i2 == 1) {
            AbstractC5185.m10210(obj2);
            return obj2;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            if (this.L$0 == null) {
                AbstractC5185.m10210(obj2);
                return obj2;
            }
            C2942.m6394();
            return null;
        }
        if (this.L$1 != null) {
            C2942.m6394();
            return null;
        }
        InterfaceC5441 interfaceC5441 = (InterfaceC5441) this.L$0;
        AbstractC5185.m10210(obj2);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        Object objM10573 = ((C5438) interfaceC5441).m10573(this);
        return objM10573 == coroutineSingletons ? coroutineSingletons : objM10573;
    }
}
