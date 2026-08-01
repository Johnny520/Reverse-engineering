package androidx.activity.compose;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.p001ui.platform.C2740;
import androidx.compose.runtime.internal.C2077;
import androidx.lifecycle.AbstractC3268;
import com.bumptech.glide.AbstractC3889;
import com.davemorrissey.labs.subscaleview.C0328R;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0854 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ViewGroup.LayoutParams f361 = new ViewGroup.LayoutParams(-2, -2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m577(ComponentActivity componentActivity, C2077 c2077) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C2740 c2740 = childAt instanceof C2740 ? (C2740) childAt : null;
        if (c2740 != null) {
            c2740.setParentCompositionContext(null);
            c2740.setContent(c2077);
            return;
        }
        C2740 c27402 = new C2740(componentActivity);
        c27402.setParentCompositionContext(null);
        c27402.setContent(c2077);
        View decorView = componentActivity.getWindow().getDecorView();
        if (AbstractC3268.m5089(decorView) == null) {
            decorView.setTag(C0328R.id.view_tree_lifecycle_owner, componentActivity);
        }
        if (AbstractC3268.m5088(decorView) == null) {
            decorView.setTag(C0328R.id.view_tree_view_model_store_owner, componentActivity);
        }
        if (AbstractC3889.m7318(decorView) == null) {
            decorView.setTag(C0328R.id.view_tree_saved_state_registry_owner, componentActivity);
        }
        componentActivity.setContentView(c27402, f361);
    }
}
