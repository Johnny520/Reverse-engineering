package Yue;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4749 {
    @InterfaceC4764
    /* JADX INFO: renamed from: ۥ */
    public static /* synthetic */ void m1665() {
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Executor m1666(@InterfaceC6399 AbstractC4232 abstractC4232) {
        Executor executorMo12605;
        AbstractC4746 abstractC4746 = abstractC4232 instanceof AbstractC4746 ? (AbstractC4746) abstractC4232 : null;
        return (abstractC4746 == null || (executorMo12605 = abstractC4746.mo12605()) == null) ? new ExecutorC4422(abstractC4232) : executorMo12605;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "from")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final AbstractC4232 m14311(@InterfaceC6399 Executor executor) {
        AbstractC4232 abstractC4232;
        ExecutorC4422 executorC4422 = executor instanceof ExecutorC4422 ? (ExecutorC4422) executor : null;
        return (executorC4422 == null || (abstractC4232 = executorC4422.f9157) == null) ? new C4748(executor) : abstractC4232;
    }

    @InterfaceC6399
    @InterfaceC5572(name = "from")
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final AbstractC4746 m14312(@InterfaceC6399 ExecutorService executorService) {
        return new C4748(executorService);
    }
}
