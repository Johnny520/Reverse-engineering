package io.ktor.client.engine.cio;

import com.alibaba.fastjson2.C3775;
import java.util.TimeZone;
import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.InterfaceC6273;
import p079.InterfaceC7691;
import p259.AbstractC8979;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.Endpoint", m556f = "Endpoint.kt", m557l = {65, 71, 72}, m558m = "execute")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class Endpoint$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4703 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$execute$1(C4703 c4703, InterfaceC5189<? super Endpoint$execute$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4703;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4703 c4703 = this.this$0;
        c4703.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new Endpoint$execute$1(c4703, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj2);
            TimeZone timeZone = AbstractC8979.f22819;
            c4703.lastActivity = System.currentTimeMillis();
            throw null;
        }
        if (i2 == 1) {
            AbstractC6017.m10769(obj2);
            return obj2;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            if (this.L$0 == null) {
                AbstractC6017.m10769(obj2);
                return obj2;
            }
            C3775.m6954();
            return null;
        }
        if (this.L$1 != null) {
            C3775.m6954();
            return null;
        }
        InterfaceC6273 interfaceC6273 = (InterfaceC6273) this.L$0;
        AbstractC6017.m10769(obj2);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        Object objM11132 = ((C6270) interfaceC6273).m11132(this);
        return objM11132 == coroutineSingletons ? coroutineSingletons : objM11132;
    }
}
