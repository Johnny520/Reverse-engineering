package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m151d2 = {"Landroidx/fragment/app/strictmode/FragmentTagUsageViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "fragment", "Landroid/view/ViewGroup;", "parentContainer", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Landroid/view/ViewGroup;)V", "Landroid/view/ViewGroup;", "getParentContainer", "()Landroid/view/ViewGroup;", "fragment_release"}, m152k = 1, m153mv = {1, 8, 0}, m155xi = 48)
public final class FragmentTagUsageViolation extends Violation {
    private final ViewGroup parentContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentTagUsageViolation(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171, ViewGroup viewGroup) {
        super(abstractComponentCallbacksC3171, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC3171 + " to container " + viewGroup);
        abstractComponentCallbacksC3171.getClass();
        this.parentContainer = viewGroup;
    }

    public final ViewGroup getParentContainer() {
        return this.parentContainer;
    }
}
