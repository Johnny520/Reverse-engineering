package p301;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C2242;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C3152;

/* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC8616 implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8615 f24156;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ViewGroup.OnHierarchyChangeListener f24157;

    public ViewGroupOnHierarchyChangeListenerC8616(AbstractC8615 abstractC8615) {
        this.f24156 = abstractC8615;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        AbstractC8615 abstractC8615 = this.f24156;
        if (view == abstractC8615 && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            C3152 c3152 = abstractC8615.f24152;
            Chip chip = (Chip) view2;
            c3152.f10496.put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                c3152.m7189(chip);
            }
            chip.setInternalOnCheckedChangeListener(new C2242(c3152, 12));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24157;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        AbstractC8615 abstractC8615 = this.f24156;
        if (view == abstractC8615 && (view2 instanceof Chip)) {
            C3152 c3152 = abstractC8615.f24152;
            Chip chip = (Chip) view2;
            c3152.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            c3152.f10496.remove(Integer.valueOf(chip.getId()));
            c3152.f10495.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24157;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
