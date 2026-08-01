package p000;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* JADX INFO: renamed from: rt */
/* JADX INFO: loaded from: classes.dex */
public final class C0682rt implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialButtonToggleGroup f4169a;

    public C0682rt(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f4169a = materialButtonToggleGroup;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MaterialButton materialButton = (MaterialButton) obj;
        MaterialButton materialButton2 = (MaterialButton) obj2;
        int iCompareTo = Boolean.valueOf(materialButton.f1007o).compareTo(Boolean.valueOf(materialButton2.f1007o));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f4169a;
        return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
    }
}
