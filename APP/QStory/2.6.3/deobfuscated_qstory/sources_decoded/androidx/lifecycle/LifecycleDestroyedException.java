package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/LifecycleDestroyedException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "lifecycle-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LifecycleDestroyedException extends CancellationException {
    public LifecycleDestroyedException() {
        super(null);
    }
}
