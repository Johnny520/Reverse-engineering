package androidx.fragment.app.strictmode;

import androidx.fragment.app.AbstractComponentCallbacksC2338;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/strictmode/WrongNestedHierarchyViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "fragment", "expectedParentFragment", "", "containerId", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;I)V", "Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "getExpectedParentFragment", "()Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "I", "getContainerId", "()I", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WrongNestedHierarchyViolation extends Violation {
    private final int containerId;
    private final AbstractComponentCallbacksC2338 expectedParentFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongNestedHierarchyViolation(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, AbstractComponentCallbacksC2338 abstractComponentCallbacksC23382, int i) {
        super(abstractComponentCallbacksC2338, "Attempting to nest fragment " + abstractComponentCallbacksC2338 + " within the view of parent fragment " + abstractComponentCallbacksC23382 + " via container with ID " + i + " without using parent's childFragmentManager");
        abstractComponentCallbacksC2338.getClass();
        abstractComponentCallbacksC23382.getClass();
        this.expectedParentFragment = abstractComponentCallbacksC23382;
        this.containerId = i;
    }

    public final int getContainerId() {
        return this.containerId;
    }

    public final AbstractComponentCallbacksC2338 getExpectedParentFragment() {
        return this.expectedParentFragment;
    }
}
