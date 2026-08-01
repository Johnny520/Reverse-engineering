package p317;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C3075;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C3985;

/* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC9437 implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9436 f24492;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ViewGroup.OnHierarchyChangeListener f24493;

    public ViewGroupOnHierarchyChangeListenerC9437(AbstractC9436 abstractC9436) {
        this.f24492 = abstractC9436;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        AbstractC9436 abstractC9436 = this.f24492;
        if (view == abstractC9436 && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            C3985 c3985 = abstractC9436.f24488;
            Chip chip = (Chip) view2;
            c3985.f10846.put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                c3985.m7735(chip);
            }
            chip.setInternalOnCheckedChangeListener(new C3075(c3985, 12));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24493;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        AbstractC9436 abstractC9436 = this.f24492;
        if (view == abstractC9436 && (view2 instanceof Chip)) {
            C3985 c3985 = abstractC9436.f24488;
            Chip chip = (Chip) view2;
            c3985.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            c3985.f10846.remove(Integer.valueOf(chip.getId()));
            c3985.f10845.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24493;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
