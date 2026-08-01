package p151;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1841;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2270;
import androidx.fragment.app.C2358;
import com.kongzue.dialogx.util.views.C3756;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p164.C7665;

/* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7585 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f20549;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7665 f20550;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7665 f20551;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f20552 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7586 f20553;

    public C7585(ViewGroup viewGroup) {
        View childAt;
        C7665 c7665 = C7665.f20806;
        this.f20551 = c7665;
        this.f20550 = c7665;
        Drawable background = viewGroup.getBackground();
        this.f20549 = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        C7586 c7586 = new C7586(this, viewGroup.getContext(), viewGroup);
        this.f20553 = c7586;
        c7586.setVisibility(8);
        c7586.setWillNotDraw(true);
        C2358 c2358 = new C2358(this, 21);
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        AbstractC2193.m4004(c7586, c2358);
        AbstractC2270.m4242(c7586, new C3756(this));
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
            viewGroup.addView(c7586, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1841(5, viewGroup, c7586));
        }
    }
}
