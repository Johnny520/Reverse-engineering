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
import p009.AbstractC6183;
import p151.AbstractC7589;
import p151.C7585;
import p151.C7587;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Object f6461 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7587 f6462;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f6463;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f6463 = new ArrayList();
    }

    private C7585 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof C7585) {
            return (C7585) tag;
        }
        C7585 c7585 = new C7585(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, c7585);
        return c7585;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f6461) {
            C7587 c7587 = this.f6462;
            int childCount = getChildCount() - (c7587 != null ? c7587.f20561.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3992();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3991();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof C7585) {
            C7585 c7585 = (C7585) tag;
            if (c7585.f20552.isEmpty()) {
                c7585.f20553.post(new RunnableC1107(c7585, 20));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<AbstractC7589> list) {
        ArrayList arrayList = this.f6463;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            m3992();
            requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3991() {
        if (this.f6462 != null) {
            removeViews(getChildCount() - this.f6462.f20561.size(), this.f6462.f20561.size());
            int size = this.f6462.f20561.size();
            C7587 c7587 = this.f6462;
            if (size > 0) {
                ((AbstractC7589) c7587.f20561.get(0)).getClass();
                throw null;
            }
            ArrayList arrayList = c7587.f20561;
            if (!c7587.f20556) {
                c7587.f20556 = true;
                c7587.f20560.f20552.remove(c7587);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((AbstractC7589) arrayList.get(size2)).f20570 = null;
                }
                arrayList.clear();
            }
            this.f6462 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3992() {
        ArrayList arrayList = this.f6463;
        if (arrayList.isEmpty()) {
            m3991();
            return;
        }
        C7585 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        m3991();
        this.f6462 = new C7587(orInstallSystemBarStateMonitor, arrayList);
        getChildCount();
        if (this.f6462.f20561.size() <= 0) {
            return;
        }
        AbstractC7589 abstractC7589 = (AbstractC7589) this.f6462.f20561.get(0);
        getContext();
        abstractC7589.getClass();
        C5925.m11310(AbstractC6183.m11588(0, "Unexpected side: "));
    }
}
