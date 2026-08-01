package p160f3;

import java.util.concurrent.locks.LockSupport;
import p074O2.InterfaceC1051i;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: f3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2127c extends AbstractC2123a {

    /* JADX INFO: renamed from: g */
    public final Thread f7067g;

    /* JADX INFO: renamed from: h */
    public final AbstractC2109L f7068h;

    public C2127c(InterfaceC1051i interfaceC1051i, Thread thread, AbstractC2109L abstractC2109L) {
        super(interfaceC1051i, true);
        this.f7067g = thread;
        this.f7068h = abstractC2109L;
    }

    @Override // p160f3.C2122Z
    /* JADX INFO: renamed from: q */
    public final void mo3875q(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f7067g;
        if (AbstractC1665j.m2981a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
