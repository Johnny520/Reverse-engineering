package androidx.compose.ui.platform;

import android.view.View;
import androidx.core.view.AbstractC2267;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1859 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1881 f5364;

    public ViewOnAttachStateChangeListenerC1859(AbstractC1881 abstractC1881) {
        this.f5364 = abstractC1881;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AbstractC1881 abstractC1881 = this.f5364;
        for (Object obj : AbstractC2267.m4229(abstractC1881)) {
            if (obj instanceof View) {
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null ? bool.booleanValue() : false) {
                    return;
                }
            }
        }
        abstractC1881.m3495();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
