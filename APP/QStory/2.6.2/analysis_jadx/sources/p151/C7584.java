package p151;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1841;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2270;
import androidx.fragment.app.C2358;
import com.kongzue.dialogx.util.views.C3755;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p164.C7664;

/* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7584 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f20554;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7664 f20555;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7664 f20556;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f20557 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7585 f20558;

    public C7584(ViewGroup viewGroup) {
        View childAt;
        C7664 c7664 = C7664.f20811;
        this.f20556 = c7664;
        this.f20555 = c7664;
        Drawable background = viewGroup.getBackground();
        this.f20554 = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        C7585 c7585 = new C7585(this, viewGroup.getContext(), viewGroup);
        this.f20558 = c7585;
        c7585.setVisibility(8);
        c7585.setWillNotDraw(true);
        C2358 c2358 = new C2358(this, 21);
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        AbstractC2193.m3994(c7585, c2358);
        AbstractC2270.m4232(c7585, new C3755(this));
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (childAt.isAttachedToWindow() != viewGroup.isAttachedToWindow()) {
                break;
            } else {
                childCount--;
            }
        }
        if (childAt == null) {
            viewGroup.addView(c7585, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1841(5, viewGroup, c7585));
        }
    }
}
