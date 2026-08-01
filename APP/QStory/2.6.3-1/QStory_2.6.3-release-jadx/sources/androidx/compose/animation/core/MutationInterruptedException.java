package androidx.compose.animation.core;

import androidx.compose.animation.core.internal.PlatformOptimizedCancellationException;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Landroidx/compose/animation/core/MutationInterruptedException;", "Landroidx/compose/animation/core/internal/PlatformOptimizedCancellationException;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "animation-core"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class MutationInterruptedException extends PlatformOptimizedCancellationException {
    public static final int $stable = 8;

    public MutationInterruptedException() {
        super("Mutation interrupted");
    }
}
