package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5217;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m151d2 = {"Landroidx/compose/foundation/gestures/GestureCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "message", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "foundation"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class GestureCancellationException extends CancellationException {
    public static final int $stable = 8;

    public /* synthetic */ GestureCancellationException(String str, int i, AbstractC5217 abstractC5217) {
        this((i & 1) != 0 ? null : str);
    }

    public GestureCancellationException(String str) {
        super(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GestureCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
