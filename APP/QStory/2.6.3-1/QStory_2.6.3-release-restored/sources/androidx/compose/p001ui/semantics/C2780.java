package androidx.compose.p001ui.semantics;

import com.bumptech.glide.AbstractC3888;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import p068.InterfaceC7383;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2780 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f6098;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6099;

    public /* synthetic */ C2780(Object obj, int i) {
        this.f6099 = i;
        this.f6098 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f6099;
        Object obj3 = this.f6098;
        switch (i) {
            case 0:
                return ((Number) ((InterfaceC7383) obj3).invoke(obj, obj2)).intValue();
            case 1:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f10455).compareTo(Boolean.valueOf(materialButton2.f10455));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
            default:
                for (InterfaceC7387 interfaceC7387 : (InterfaceC7387[]) obj3) {
                    int iM7277 = AbstractC3888.m7277((Comparable) interfaceC7387.invoke(obj), (Comparable) interfaceC7387.invoke(obj2));
                    if (iM7277 != 0) {
                        return iM7277;
                    }
                }
                return 0;
        }
    }
}
