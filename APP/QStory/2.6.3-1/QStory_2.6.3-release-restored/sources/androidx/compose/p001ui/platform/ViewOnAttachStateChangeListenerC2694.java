package androidx.compose.p001ui.platform;

import android.view.View;
import androidx.core.view.AbstractC3100;
import com.davemorrissey.labs.subscaleview.C0328R;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2694 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2716 f5709;

    public ViewOnAttachStateChangeListenerC2694(AbstractC2716 abstractC2716) {
        this.f5709 = abstractC2716;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AbstractC2716 abstractC2716 = this.f5709;
        for (Object obj : AbstractC3100.m4789(abstractC2716)) {
            if (obj instanceof View) {
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(C0328R.id.is_pooling_container_tag);
                Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                if (bool != null ? bool.booleanValue() : false) {
                    return;
                }
            }
        }
        abstractC2716.m4055();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
