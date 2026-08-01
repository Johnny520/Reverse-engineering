package androidx.compose.ui;

import androidx.compose.ui.internal.PlatformOptimizedCancellationException;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/ModifierNodeDetachedCancellationException;", "Landroidx/compose/ui/internal/PlatformOptimizedCancellationException;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModifierNodeDetachedCancellationException extends PlatformOptimizedCancellationException {
    public static final int $stable = 8;

    public ModifierNodeDetachedCancellationException() {
        super("The Modifier.Node was detached");
    }
}
