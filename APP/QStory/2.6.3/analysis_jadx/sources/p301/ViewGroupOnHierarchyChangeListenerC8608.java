package p301;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C2242;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C3153;

/* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC8608 implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC8607 f24147;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ViewGroup.OnHierarchyChangeListener f24148;

    public ViewGroupOnHierarchyChangeListenerC8608(AbstractC8607 abstractC8607) {
        this.f24147 = abstractC8607;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        AbstractC8607 abstractC8607 = this.f24147;
        if (view == abstractC8607 && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            C3153 c3153 = abstractC8607.f24143;
            Chip chip = (Chip) view2;
            c3153.f10501.put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                c3153.m7176(chip);
            }
            chip.setInternalOnCheckedChangeListener(new C2242(c3153, 12));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24148;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        AbstractC8607 abstractC8607 = this.f24147;
        if (view == abstractC8607 && (view2 instanceof Chip)) {
            C3153 c3153 = abstractC8607.f24143;
            Chip chip = (Chip) view2;
            c3153.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            c3153.f10501.remove(Integer.valueOf(chip.getId()));
            c3153.f10500.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24148;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
