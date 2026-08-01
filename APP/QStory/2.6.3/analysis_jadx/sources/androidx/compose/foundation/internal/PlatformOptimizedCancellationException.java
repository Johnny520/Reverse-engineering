package androidx.compose.foundation.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4385;
import net.bytebuddy.description.method.MethodDescription;
import p176.AbstractC7740;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b!\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/internal/PlatformOptimizedCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "message", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "fillInStackTrace", "", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public static final int $stable = 8;

    public /* synthetic */ PlatformOptimizedCancellationException(String str, int i, AbstractC4385 abstractC4385) {
        this((i & 1) != 0 ? null : str);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(AbstractC7740.f21001);
        return this;
    }

    public PlatformOptimizedCancellationException(String str) {
        super(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformOptimizedCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
