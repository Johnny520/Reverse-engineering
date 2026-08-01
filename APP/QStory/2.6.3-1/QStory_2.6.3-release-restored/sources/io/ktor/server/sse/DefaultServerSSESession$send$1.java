package io.ktor.server.sse;

import io.ktor.utils.p007io.InterfaceC5079;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C6212;
import kotlinx.coroutines.sync.InterfaceC6215;
import p079.InterfaceC7691;
import p261.C8982;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.sse.DefaultServerSSESession", m556f = "DefaultServerSSESession.kt", m557l = {44, 22}, m558m = "send")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class DefaultServerSSESession$send$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5007 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultServerSSESession$send$1(C5007 c5007, InterfaceC5189<? super DefaultServerSSESession$send$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c5007;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5007 c5007;
        InterfaceC6215 interfaceC6215;
        C8982 c8982;
        Throwable th;
        InterfaceC6215 interfaceC62152;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C5007 c50072 = this.this$0;
        c50072.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new DefaultServerSSESession$send$1(c50072, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj2);
                C6212 c6212 = c50072.f12981;
                this.L$0 = c50072;
                this.L$1 = null;
                this.L$2 = c6212;
                this.label = 1;
                if (c6212.m10986(this) != coroutineSingletons) {
                    c5007 = c50072;
                    interfaceC6215 = c6212;
                    c8982 = null;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC62152 = (InterfaceC6215) this.L$0;
                try {
                    AbstractC6017.m10769(obj2);
                    ((C6212) interfaceC62152).m10991(null);
                    return C6008.f15084;
                } catch (Throwable th2) {
                    th = th2;
                    ((C6212) interfaceC62152).m10991(null);
                    throw th;
                }
            }
            interfaceC6215 = (InterfaceC6215) this.L$2;
            c8982 = (C8982) this.L$1;
            c5007 = (C5007) this.L$0;
            AbstractC6017.m10769(obj2);
            InterfaceC5079 interfaceC5079 = c5007.f12982;
            this.L$0 = interfaceC6215;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (c5007.m9098(interfaceC5079, c8982, this) != coroutineSingletons) {
                interfaceC62152 = interfaceC6215;
                ((C6212) interfaceC62152).m10991(null);
                return C6008.f15084;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            InterfaceC6215 interfaceC62153 = interfaceC6215;
            th = th3;
            interfaceC62152 = interfaceC62153;
            ((C6212) interfaceC62152).m10991(null);
            throw th;
        }
    }
}
