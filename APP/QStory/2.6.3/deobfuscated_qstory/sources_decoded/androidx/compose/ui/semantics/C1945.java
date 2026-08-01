package androidx.compose.ui.semantics;

import com.bumptech.glide.AbstractC3056;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import p052.InterfaceC6554;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1945 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f5753;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5754;

    public /* synthetic */ C1945(Object obj, int i) {
        this.f5754 = i;
        this.f5753 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f5754;
        Object obj3 = this.f5753;
        switch (i) {
            case 0:
                return ((Number) ((InterfaceC6554) obj3).invoke(obj, obj2)).intValue();
            case 1:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f10110).compareTo(Boolean.valueOf(materialButton2.f10110));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
            default:
                for (InterfaceC6558 interfaceC6558 : (InterfaceC6558[]) obj3) {
                    int iM6717 = AbstractC3056.m6717((Comparable) interfaceC6558.invoke(obj), (Comparable) interfaceC6558.invoke(obj2));
                    if (iM6717 != 0) {
                        return iM6717;
                    }
                }
                return 0;
        }
    }
}
