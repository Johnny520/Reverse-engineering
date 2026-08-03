package Yue;

import Yue.C7148;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4235 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final List<InterfaceC4234> f750 = C7342.m23081(C7332.m22869(ServiceLoader.load(InterfaceC4234.class, InterfaceC4234.class.getClassLoader()).iterator()));

    /* JADX INFO: renamed from: ۥ */
    public static final void m1199(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Throwable th) {
        Iterator<InterfaceC4234> it = f750.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo6569(interfaceC4225, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, C4236.m12176(th, th2));
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            C7148.C1189 c1189 = C7148.f21560;
            C4741.m1656(th, new C4388(interfaceC4225));
            C7148.m3438(C8107.f3222);
        } catch (Throwable th3) {
            C7148.C1189 c11892 = C7148.f21560;
            C7148.m3438(C7149.m3441(th3));
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
