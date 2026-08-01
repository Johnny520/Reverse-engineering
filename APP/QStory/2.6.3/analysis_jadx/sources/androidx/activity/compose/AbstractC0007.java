package androidx.activity.compose;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.ui.platform.C1905;
import androidx.lifecycle.AbstractC2435;
import com.bumptech.glide.AbstractC3057;

/* JADX INFO: renamed from: androidx.activity.compose.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0007 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ViewGroup.LayoutParams f16 = new ViewGroup.LayoutParams(-2, -2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m17(ComponentActivity componentActivity, C1242 c1242) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C1905 c1905 = childAt instanceof C1905 ? (C1905) childAt : null;
        if (c1905 != null) {
            c1905.setParentCompositionContext(null);
            c1905.setContent(c1242);
            return;
        }
        C1905 c19052 = new C1905(componentActivity);
        c19052.setParentCompositionContext(null);
        c19052.setContent(c1242);
        View decorView = componentActivity.getWindow().getDecorView();
        if (AbstractC2435.m4529(decorView) == null) {
            decorView.setTag(com.davemorrissey.labs.subscaleview.R.id.view_tree_lifecycle_owner, componentActivity);
        }
        if (AbstractC2435.m4528(decorView) == null) {
            decorView.setTag(com.davemorrissey.labs.subscaleview.R.id.view_tree_view_model_store_owner, componentActivity);
        }
        if (AbstractC3057.m6758(decorView) == null) {
            decorView.setTag(com.davemorrissey.labs.subscaleview.R.id.view_tree_saved_state_registry_owner, componentActivity);
        }
        componentActivity.setContentView(c19052, f16);
    }
}
