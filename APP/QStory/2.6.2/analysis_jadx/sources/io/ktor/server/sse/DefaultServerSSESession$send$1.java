package io.ktor.server.sse;

import io.ktor.utils.io.InterfaceC4246;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C5379;
import kotlinx.coroutines.sync.InterfaceC5382;
import p063.InterfaceC6861;
import p245.C8152;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.sse.DefaultServerSSESession", f = "DefaultServerSSESession.kt", l = {44, 22}, m = "send")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class DefaultServerSSESession$send$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4174 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultServerSSESession$send$1(C4174 c4174, InterfaceC4356<? super DefaultServerSSESession$send$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c4174;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C4174 c4174;
        InterfaceC5382 interfaceC5382;
        C8152 c8152;
        Throwable th;
        InterfaceC5382 interfaceC53822;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C4174 c41742 = this.this$0;
        c41742.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new DefaultServerSSESession$send$1(c41742, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                AbstractC5184.m10206(obj2);
                C5379 c5379 = c41742.f12632;
                this.L$0 = c41742;
                this.L$1 = null;
                this.L$2 = c5379;
                this.label = 1;
                if (c5379.m10423(this) != coroutineSingletons) {
                    c4174 = c41742;
                    interfaceC5382 = c5379;
                    c8152 = null;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC53822 = (InterfaceC5382) this.L$0;
                try {
                    AbstractC5184.m10206(obj2);
                    ((C5379) interfaceC53822).m10428(null);
                    return C5175.f14739;
                } catch (Throwable th2) {
                    th = th2;
                    ((C5379) interfaceC53822).m10428(null);
                    throw th;
                }
            }
            interfaceC5382 = (InterfaceC5382) this.L$2;
            c8152 = (C8152) this.L$1;
            c4174 = (C4174) this.L$0;
            AbstractC5184.m10206(obj2);
            InterfaceC4246 interfaceC4246 = c4174.f12633;
            this.L$0 = interfaceC5382;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (c4174.m8549(interfaceC4246, c8152, this) != coroutineSingletons) {
                interfaceC53822 = interfaceC5382;
                ((C5379) interfaceC53822).m10428(null);
                return C5175.f14739;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            InterfaceC5382 interfaceC53823 = interfaceC5382;
            th = th3;
            interfaceC53822 = interfaceC53823;
            ((C5379) interfaceC53822).m10428(null);
            throw th;
        }
    }
}
