package p099gc;

import ec.AbstractC2162n1;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: gc.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2745n {
    /* JADX INFO: renamed from: a */
    public static final void m9864a(InterfaceC2753v interfaceC2753v, Throwable th) {
        if (th != null) {
            cancellationExceptionM7845a = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionM7845a == null) {
                cancellationExceptionM7845a = AbstractC2162n1.m7845a("Channel was consumed, consumer had failed", th);
            }
        }
        interfaceC2753v.mo9773n(cancellationExceptionM7845a);
    }
}
