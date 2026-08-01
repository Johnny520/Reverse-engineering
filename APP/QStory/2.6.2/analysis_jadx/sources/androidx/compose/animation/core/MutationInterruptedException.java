package androidx.compose.animation.core;

import androidx.compose.animation.core.internal.PlatformOptimizedCancellationException;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/core/MutationInterruptedException;", "Landroidx/compose/animation/core/internal/PlatformOptimizedCancellationException;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MutationInterruptedException extends PlatformOptimizedCancellationException {
    public static final int $stable = 8;

    public MutationInterruptedException() {
        super("Mutation interrupted");
    }
}
