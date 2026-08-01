package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.material.ripple.RunnableC1945;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.ArrayList;
import java.util.List;
import p025.AbstractC7012;
import p167.AbstractC8418;
import p167.C8414;
import p167.C8416;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final Object f6806 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C8416 f6807;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f6808;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f6808 = new ArrayList();
    }

    private C8414 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(C0328R.id.tag_system_bar_state_monitor);
        if (tag instanceof C8414) {
            return (C8414) tag;
        }
        C8414 c8414 = new C8414(viewGroup);
        viewGroup.setTag(C0328R.id.tag_system_bar_state_monitor, c8414);
        return c8414;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f6806) {
            C8416 c8416 = this.f6807;
            int childCount = getChildCount() - (c8416 != null ? c8416.f20906.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4552();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4551();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(C0328R.id.tag_system_bar_state_monitor);
        if (tag instanceof C8414) {
            C8414 c8414 = (C8414) tag;
            if (c8414.f20897.isEmpty()) {
                c8414.f20898.post(new RunnableC1945(c8414, 20));
                viewGroup.setTag(C0328R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<AbstractC8418> list) {
        ArrayList arrayList = this.f6808;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            m4552();
            requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4551() {
        if (this.f6807 != null) {
            removeViews(getChildCount() - this.f6807.f20906.size(), this.f6807.f20906.size());
            int size = this.f6807.f20906.size();
            C8416 c8416 = this.f6807;
            if (size > 0) {
                ((AbstractC8418) c8416.f20906.get(0)).getClass();
                throw null;
            }
            ArrayList arrayList = c8416.f20906;
            if (!c8416.f20901) {
                c8416.f20901 = true;
                c8416.f20905.f20897.remove(c8416);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((AbstractC8418) arrayList.get(size2)).f20915 = null;
                }
                arrayList.clear();
            }
            this.f6807 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4552() {
        ArrayList arrayList = this.f6808;
        if (arrayList.isEmpty()) {
            m4551();
            return;
        }
        C8414 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        m4551();
        this.f6807 = new C8416(orInstallSystemBarStateMonitor, arrayList);
        getChildCount();
        if (this.f6807.f20906.size() <= 0) {
            return;
        }
        AbstractC8418 abstractC8418 = (AbstractC8418) this.f6807.f20906.get(0);
        getContext();
        abstractC8418.getClass();
        C6755.m11869(AbstractC7012.m12147(0, "Unexpected side: "));
    }
}
