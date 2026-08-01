package io.ktor.server.sse;

import io.ktor.utils.io.InterfaceC4247;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C5380;
import kotlinx.coroutines.sync.InterfaceC5383;
import p063.InterfaceC6862;
import p245.C8153;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.sse.DefaultServerSSESession", f = "DefaultServerSSESession.kt", l = {44, 22}, m = "send")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DefaultServerSSESession$send$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4175 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultServerSSESession$send$1(C4175 c4175, InterfaceC4357<? super DefaultServerSSESession$send$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c4175;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C4175 c4175;
        InterfaceC5383 interfaceC5383;
        C8153 c8153;
        Throwable th;
        InterfaceC5383 interfaceC53832;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4175 c41752 = this.this$0;
        c41752.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new DefaultServerSSESession$send$1(c41752, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                AbstractC5185.m10210(obj2);
                C5380 c5380 = c41752.f12636;
                this.L$0 = c41752;
                this.L$1 = null;
                this.L$2 = c5380;
                this.label = 1;
                if (c5380.m10427(this) != coroutineSingletons) {
                    c4175 = c41752;
                    interfaceC5383 = c5380;
                    c8153 = null;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC53832 = (InterfaceC5383) this.L$0;
                try {
                    AbstractC5185.m10210(obj2);
                    ((C5380) interfaceC53832).m10432(null);
                    return C5176.f14739;
                } catch (Throwable th2) {
                    th = th2;
                    ((C5380) interfaceC53832).m10432(null);
                    throw th;
                }
            }
            interfaceC5383 = (InterfaceC5383) this.L$2;
            c8153 = (C8153) this.L$1;
            c4175 = (C4175) this.L$0;
            AbstractC5185.m10210(obj2);
            InterfaceC4247 interfaceC4247 = c4175.f12637;
            this.L$0 = interfaceC5383;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (c4175.m8539(interfaceC4247, c8153, this) != coroutineSingletons) {
                interfaceC53832 = interfaceC5383;
                ((C5380) interfaceC53832).m10432(null);
                return C5176.f14739;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            InterfaceC5383 interfaceC53833 = interfaceC5383;
            th = th3;
            interfaceC53832 = interfaceC53833;
            ((C5380) interfaceC53832).m10432(null);
            throw th;
        }
    }
}
