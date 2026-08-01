package p167;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p001ui.platform.ViewOnAttachStateChangeListenerC2676;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3103;
import androidx.fragment.app.C3191;
import com.kongzue.dialogx.util.views.C4588;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p180.C8494;

/* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8414 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f20894;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8494 f20895;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C8494 f20896;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f20897 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8415 f20898;

    public C8414(ViewGroup viewGroup) {
        View childAt;
        C8494 c8494 = C8494.f21151;
        this.f20896 = c8494;
        this.f20895 = c8494;
        Drawable background = viewGroup.getBackground();
        this.f20894 = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        C8415 c8415 = new C8415(this, viewGroup.getContext(), viewGroup);
        this.f20898 = c8415;
        c8415.setVisibility(8);
        c8415.setWillNotDraw(true);
        C3191 c3191 = new C3191(this, 21);
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        AbstractC3026.m4564(c8415, c3191);
        AbstractC3103.m4802(c8415, new C4588(this));
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
            viewGroup.addView(c8415, 0);
        } else {
            childAt.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2676(5, viewGroup, c8415));
        }
    }
}
