package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/strictmode/WrongFragmentContainerViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "fragment", "Landroid/view/ViewGroup;", "container", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Landroid/view/ViewGroup;)V", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WrongFragmentContainerViolation extends Violation {
    private final ViewGroup container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, ViewGroup viewGroup) {
        super(abstractComponentCallbacksC2338, "Attempting to add fragment " + abstractComponentCallbacksC2338 + " to container " + viewGroup + " which is not a FragmentContainerView");
        abstractComponentCallbacksC2338.getClass();
        viewGroup.getClass();
        this.container = viewGroup;
    }

    public final ViewGroup getContainer() {
        return this.container;
    }
}
