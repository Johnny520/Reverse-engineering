package p145jc;

import ec.InterfaceC2153l0;
import java.util.Collection;
import java.util.ServiceLoader;
import sb.AbstractC7291q;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: jc.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3802e {

    /* JADX INFO: renamed from: a */
    public static final Collection f10977a = AbstractC7294t.m28908P(AbstractC7291q.m28879g(ServiceLoader.load(InterfaceC2153l0.class, InterfaceC2153l0.class.getClassLoader()).iterator()));

    /* JADX INFO: renamed from: a */
    public static final Collection m15150a() {
        return f10977a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m15151b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
