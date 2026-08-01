package androidx.fragment.app.strictmode;

import androidx.fragment.app.AbstractComponentCallbacksC3171;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m151d2 = {"Landroidx/fragment/app/strictmode/GetTargetFragmentUsageViolation;", "Landroidx/fragment/app/strictmode/TargetFragmentUsageViolation;", "Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "fragment", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;)V", "fragment_release"}, m152k = 1, m153mv = {1, 8, 0}, m155xi = 48)
public final class GetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTargetFragmentUsageViolation(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        super(abstractComponentCallbacksC3171, "Attempting to get target fragment from fragment " + abstractComponentCallbacksC3171);
        abstractComponentCallbacksC3171.getClass();
    }
}
