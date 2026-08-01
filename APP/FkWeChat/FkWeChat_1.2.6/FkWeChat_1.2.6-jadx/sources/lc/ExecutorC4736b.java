package lc;

import ec.AbstractC2149k0;
import ec.AbstractC2170p1;
import java.util.concurrent.Executor;
import p080f9.AbstractC2368o;
import p145jc.AbstractC3803e0;
import p145jc.AbstractC3807g0;
import p228p8.C5981k;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: lc.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC4736b extends AbstractC2170p1 implements Executor {

    /* JADX INFO: renamed from: t */
    public static final ExecutorC4736b f14046t = new ExecutorC4736b();

    /* JADX INFO: renamed from: u */
    public static final AbstractC2149k0 f14047u = AbstractC2149k0.m7819d0(C4745k.f14064s, AbstractC3807g0.m15167e("kotlinx.coroutines.io.parallelism", AbstractC2368o.m8578e(64, AbstractC3803e0.m15152a()), 0, 0, 12, null), null, 2, null);

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: F */
    public void mo7820F(InterfaceC5980j interfaceC5980j, Runnable runnable) {
        f14047u.mo7820F(interfaceC5980j, runnable);
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: b0 */
    public AbstractC2149k0 mo7753b0(int i10, String str) {
        return C4745k.f14064s.mo7753b0(i10, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo7807x(C5981k.f18917q, runnable);
    }

    @Override // ec.AbstractC2149k0
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // ec.AbstractC2149k0
    /* JADX INFO: renamed from: x */
    public void mo7807x(InterfaceC5980j interfaceC5980j, Runnable runnable) {
        f14047u.mo7807x(interfaceC5980j, runnable);
    }
}
