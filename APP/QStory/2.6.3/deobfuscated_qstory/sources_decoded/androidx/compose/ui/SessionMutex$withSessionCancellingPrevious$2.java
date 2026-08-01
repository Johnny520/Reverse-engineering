package androidx.compose.ui;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, 63}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class SessionMutex$withSessionCancellingPrevious$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AtomicReference<C2127> $arg0;
    final /* synthetic */ InterfaceC6554 $session;
    final /* synthetic */ InterfaceC6558 $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionMutex$withSessionCancellingPrevious$2(InterfaceC6558 interfaceC6558, AtomicReference<C2127> atomicReference, InterfaceC6554 interfaceC6554, InterfaceC4357<? super SessionMutex$withSessionCancellingPrevious$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$sessionInitializer = interfaceC6558;
        this.$arg0 = atomicReference;
        this.$session = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, interfaceC4357);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<Object> interfaceC4357) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2127 c2127;
        C2127 c21272;
        AtomicReference<C2127> atomicReference;
        AtomicReference<C2127> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
                InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
                c2127 = new C2127(AbstractC5399.m10493(interfaceC5401.mo2430()), this.$sessionInitializer.invoke(interfaceC5401));
                C2127 andSet = this.$arg0.getAndSet(c2127);
                if (andSet != null) {
                    InterfaceC5452 interfaceC5452 = andSet.f6278;
                    this.L$0 = c2127;
                    this.label = 1;
                    if (AbstractC5399.m10506(interfaceC5452, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c21272 = (C2127) this.L$0;
                    try {
                        AbstractC5185.m10210(obj);
                        atomicReference2 = this.$arg0;
                        while (!atomicReference2.compareAndSet(c21272, null) && atomicReference2.get() == c21272) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        atomicReference = this.$arg0;
                        while (!atomicReference.compareAndSet(c21272, null) && atomicReference.get() == c21272) {
                        }
                        throw th;
                    }
                }
                c2127 = (C2127) this.L$0;
                AbstractC5185.m10210(obj);
            }
            InterfaceC6554 interfaceC6554 = this.$session;
            Object obj2 = c2127.f6277;
            this.L$0 = c2127;
            this.label = 2;
            obj = interfaceC6554.invoke(obj2, this);
            if (obj != coroutineSingletons) {
                c21272 = c2127;
                atomicReference2 = this.$arg0;
                while (!atomicReference2.compareAndSet(c21272, null)) {
                }
                return obj;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            c21272 = c2127;
            atomicReference = this.$arg0;
            while (!atomicReference.compareAndSet(c21272, null)) {
            }
            throw th;
        }
    }
}
