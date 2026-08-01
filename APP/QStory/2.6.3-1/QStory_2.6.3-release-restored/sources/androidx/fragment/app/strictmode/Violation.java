package androidx.fragment.app.strictmode;

import androidx.fragment.app.AbstractComponentCallbacksC3171;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5217;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m151d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "fragment", "", "violationMessage", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;Ljava/lang/String;)V", "Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "getFragment", "()Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;", "fragment_release"}, m152k = 1, m153mv = {1, 8, 0}, m155xi = 48)
public abstract class Violation extends RuntimeException {
    private final AbstractComponentCallbacksC3171 fragment;

    public /* synthetic */ Violation(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171, String str, int i, AbstractC5217 abstractC5217) {
        this(abstractComponentCallbacksC3171, (i & 2) != 0 ? null : str);
    }

    public final AbstractComponentCallbacksC3171 getFragment() {
        return this.fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171, String str) {
        super(str);
        abstractComponentCallbacksC3171.getClass();
        this.fragment = abstractComponentCallbacksC3171;
    }
}
