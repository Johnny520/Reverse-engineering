package androidx.compose.ui.platform;

import android.view.View;
import androidx.collection.AbstractC0290;
import androidx.collection.C0236;
import androidx.compose.runtime.AbstractC1372;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1838 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0236 f5340;

    static {
        long[] jArr = AbstractC0290.f1007;
        f5340 = new C0236();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC1372 m3473(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof AbstractC1372) {
            return (AbstractC1372) tag;
        }
        return null;
    }
}
