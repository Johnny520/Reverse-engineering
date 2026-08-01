package kotlin.reflect.jvm.internal.impl.utils;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class WrappedValues$WrappedProcessCanceledException extends RuntimeException {
    public WrappedValues$WrappedProcessCanceledException(Throwable th) {
        super("Rethrow stored exception", th);
    }
}
