package Yue;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3543<T> extends AbstractC2980<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final Thread f6040;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6489
    public final AbstractC4714 f6041;

    public C3543(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Thread thread, @InterfaceC6489 AbstractC4714 abstractC4714) {
        super(interfaceC4225, true, true);
        this.f6040 = thread;
        this.f6041 = abstractC4714;
    }

    @Override // Yue.C5557
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void mo9504(@InterfaceC6489 Object obj) {
        C8107 c8107;
        if (C5499.m17094(Thread.currentThread(), this.f6040)) {
            return;
        }
        Thread thread = this.f6040;
        AbstractC3018 abstractC3018M84 = C3019.m84();
        if (abstractC3018M84 != null) {
            abstractC3018M84.m5896(thread);
            c8107 = C8107.f3222;
        } else {
            c8107 = null;
        }
        if (c8107 == null) {
            LockSupport.unpark(thread);
        }
    }

    @Override // Yue.C5557
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public boolean mo9505() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public final T m9506() throws Throwable {
        C8107 c8107;
        AbstractC3018 abstractC3018M84 = C3019.m84();
        if (abstractC3018M84 != null) {
            abstractC3018M84.m5893();
        }
        try {
            AbstractC4714 abstractC4714 = this.f6041;
            if (abstractC4714 != null) {
                AbstractC4714.m14077(abstractC4714, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC4714 abstractC47142 = this.f6041;
                    long jMo14087 = abstractC47142 != null ? abstractC47142.mo14087() : Long.MAX_VALUE;
                    if (mo17157()) {
                        AbstractC4714 abstractC47143 = this.f6041;
                        if (abstractC47143 != null) {
                            AbstractC4714.m14076(abstractC47143, false, 1, null);
                        }
                        T t = (T) C5561.m17327(m17273());
                        C4050 c4050 = t instanceof C4050 ? (C4050) t : null;
                        if (c4050 == null) {
                            return t;
                        }
                        throw c4050.f637;
                    }
                    AbstractC3018 abstractC3018M842 = C3019.m84();
                    if (abstractC3018M842 != null) {
                        abstractC3018M842.m5892(this, jMo14087);
                        c8107 = C8107.f3222;
                    } else {
                        c8107 = null;
                    }
                    if (c8107 == null) {
                        LockSupport.parkNanos(this, jMo14087);
                    }
                } catch (Throwable th) {
                    AbstractC4714 abstractC47144 = this.f6041;
                    if (abstractC47144 != null) {
                        AbstractC4714.m14076(abstractC47144, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m17255(interruptedException);
            throw interruptedException;
        } finally {
            AbstractC3018 abstractC3018M843 = C3019.m84();
            if (abstractC3018M843 != null) {
                abstractC3018M843.m5897();
            }
        }
    }
}
