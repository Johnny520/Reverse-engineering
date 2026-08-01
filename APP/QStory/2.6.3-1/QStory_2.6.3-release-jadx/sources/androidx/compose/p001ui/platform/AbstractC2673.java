package androidx.compose.p001ui.platform;

import android.view.View;
import androidx.collection.AbstractC1137;
import androidx.collection.C1083;
import androidx.compose.runtime.AbstractC2207;
import com.davemorrissey.labs.subscaleview.C0328R;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2673 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1083 f5685;

    static {
        long[] jArr = AbstractC1137.f1352;
        f5685 = new C1083();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC2207 m4033(View view) {
        Object tag = view.getTag(C0328R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC2207) {
            return (AbstractC2207) tag;
        }
        return null;
    }
}
