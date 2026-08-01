package androidx.compose.p001ui;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", m556f = "SessionMutex.kt", m557l = {61, 63}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m151d2 = {"R", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class SessionMutex$withSessionCancellingPrevious$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AtomicReference<C2960> $arg0;
    final /* synthetic */ InterfaceC7383 $session;
    final /* synthetic */ InterfaceC7387 $sessionInitializer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionMutex$withSessionCancellingPrevious$2(InterfaceC7387 interfaceC7387, AtomicReference<C2960> atomicReference, InterfaceC7383 interfaceC7383, InterfaceC5189<? super SessionMutex$withSessionCancellingPrevious$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$sessionInitializer = interfaceC7387;
        this.$arg0 = atomicReference;
        this.$session = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SessionMutex$withSessionCancellingPrevious$2 sessionMutex$withSessionCancellingPrevious$2 = new SessionMutex$withSessionCancellingPrevious$2(this.$sessionInitializer, this.$arg0, this.$session, interfaceC5189);
        sessionMutex$withSessionCancellingPrevious$2.L$0 = obj;
        return sessionMutex$withSessionCancellingPrevious$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<Object> interfaceC5189) {
        return ((SessionMutex$withSessionCancellingPrevious$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2960 c2960;
        C2960 c29602;
        AtomicReference<C2960> atomicReference;
        AtomicReference<C2960> atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
                c2960 = new C2960(AbstractC6231.m11052(interfaceC6233.mo2990()), this.$sessionInitializer.invoke(interfaceC6233));
                C2960 andSet = this.$arg0.getAndSet(c2960);
                if (andSet != null) {
                    InterfaceC6284 interfaceC6284 = andSet.f6623;
                    this.L$0 = c2960;
                    this.label = 1;
                    if (AbstractC6231.m11065(interfaceC6284, this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c29602 = (C2960) this.L$0;
                    try {
                        AbstractC6017.m10769(obj);
                        atomicReference2 = this.$arg0;
                        while (!atomicReference2.compareAndSet(c29602, null) && atomicReference2.get() == c29602) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        atomicReference = this.$arg0;
                        while (!atomicReference.compareAndSet(c29602, null) && atomicReference.get() == c29602) {
                        }
                        throw th;
                    }
                }
                c2960 = (C2960) this.L$0;
                AbstractC6017.m10769(obj);
            }
            InterfaceC7383 interfaceC7383 = this.$session;
            Object obj2 = c2960.f6622;
            this.L$0 = c2960;
            this.label = 2;
            obj = interfaceC7383.invoke(obj2, this);
            if (obj != coroutineSingletons) {
                c29602 = c2960;
                atomicReference2 = this.$arg0;
                while (!atomicReference2.compareAndSet(c29602, null)) {
                }
                return obj;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            c29602 = c2960;
            atomicReference = this.$arg0;
            while (!atomicReference.compareAndSet(c29602, null)) {
            }
            throw th;
        }
    }
}
