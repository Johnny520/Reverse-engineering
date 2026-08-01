package androidx.fragment.app.strictmode;

import androidx.fragment.app.AbstractComponentCallbacksC2338;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/strictmode/SetRetainInstanceUsageViolation;", "Landroidx/fragment/app/strictmode/RetainInstanceUsageViolation;", "Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "fragment", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetRetainInstanceUsageViolation(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        super(abstractComponentCallbacksC2338, "Attempting to set retain instance for fragment " + abstractComponentCallbacksC2338);
        abstractComponentCallbacksC2338.getClass();
    }
}
