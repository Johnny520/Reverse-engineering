package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.material.ripple.RunnableC1107;
import com.davemorrissey.labs.subscaleview.R;
import java.util.ArrayList;
import java.util.List;
import p007.AbstractC6136;
import p151.AbstractC7588;
import p151.C7584;
import p151.C7586;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Object f6460 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7586 f6461;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f6462;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f6462 = new ArrayList();
    }

    private C7584 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof C7584) {
            return (C7584) tag;
        }
        C7584 c7584 = new C7584(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, c7584);
        return c7584;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f6460) {
            C7586 c7586 = this.f6461;
            int childCount = getChildCount() - (c7586 != null ? c7586.f20566.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3982();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3981();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof C7584) {
            C7584 c7584 = (C7584) tag;
            if (c7584.f20557.isEmpty()) {
                c7584.f20558.post(new RunnableC1107(c7584, 20));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<AbstractC7588> list) {
        ArrayList arrayList = this.f6462;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            m3982();
            requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3981() {
        if (this.f6461 != null) {
            removeViews(getChildCount() - this.f6461.f20566.size(), this.f6461.f20566.size());
            int size = this.f6461.f20566.size();
            C7586 c7586 = this.f6461;
            if (size > 0) {
                ((AbstractC7588) c7586.f20566.get(0)).getClass();
                throw null;
            }
            ArrayList arrayList = c7586.f20566;
            if (!c7586.f20561) {
                c7586.f20561 = true;
                c7586.f20565.f20557.remove(c7586);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((AbstractC7588) arrayList.get(size2)).f20575 = null;
                }
                arrayList.clear();
            }
            this.f6461 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3982() {
        ArrayList arrayList = this.f6462;
        if (arrayList.isEmpty()) {
            m3981();
            return;
        }
        C7584 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        m3981();
        this.f6461 = new C7586(orInstallSystemBarStateMonitor, arrayList);
        getChildCount();
        if (this.f6461.f20566.size() <= 0) {
            return;
        }
        AbstractC7588 abstractC7588 = (AbstractC7588) this.f6461.f20566.get(0);
        getContext();
        abstractC7588.getClass();
        C5919.m11249(AbstractC6136.m11556(0, "Unexpected side: "));
    }
}
