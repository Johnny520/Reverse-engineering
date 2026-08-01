package androidx.compose.ui;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, 63}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class SessionMutex$withSessionCancellingPrevious$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AtomicReference<C2127> $arg0;
    final /* synthetic */ InterfaceC6553 $session;
    final /* synthetic */ InterfaceC6557 $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionMutex$withSessionCancellingPrevious$2(InterfaceC6557 interfaceC6557, AtomicReference<C2127> atomicReference, InterfaceC6553 interfaceC6553, InterfaceC4356<? super SessionMutex$withSessionCancellingPrevious$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$sessionInitializer = interfaceC6557;
        this.$arg0 = atomicReference;
        this.$session = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, interfaceC4356);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<Object> interfaceC4356) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
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
                AbstractC5184.m10206(obj);
                InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
                c2127 = new C2127(AbstractC5398.m10489(interfaceC5400.mo2420()), this.$sessionInitializer.invoke(interfaceC5400));
                C2127 andSet = this.$arg0.getAndSet(c2127);
                if (andSet != null) {
                    InterfaceC5451 interfaceC5451 = andSet.f6277;
                    this.L$0 = c2127;
                    this.label = 1;
                    if (AbstractC5398.m10502(interfaceC5451, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c21272 = (C2127) this.L$0;
                    try {
                        AbstractC5184.m10206(obj);
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
                AbstractC5184.m10206(obj);
            }
            InterfaceC6553 interfaceC6553 = this.$session;
            Object obj2 = c2127.f6276;
            this.L$0 = c2127;
            this.label = 2;
            obj = interfaceC6553.invoke(obj2, this);
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
