package androidx.fragment.app.strictmode;

import androidx.fragment.app.AbstractComponentCallbacksC2338;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Landroidx/fragment/app/strictmode/SetUserVisibleHintViolation;", "Landroidx/fragment/app/strictmode/Violation;", "Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "fragment", "", "isVisibleToUser", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Z)V", "Z", "()Z", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SetUserVisibleHintViolation extends Violation {
    private final boolean isVisibleToUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, boolean z) {
        super(abstractComponentCallbacksC2338, "Attempting to set user visible hint to " + z + " for fragment " + abstractComponentCallbacksC2338);
        abstractComponentCallbacksC2338.getClass();
        this.isVisibleToUser = z;
    }

    /* JADX INFO: renamed from: isVisibleToUser, reason: from getter */
    public final boolean getIsVisibleToUser() {
        return this.isVisibleToUser;
    }
}
