package androidx.compose.ui.semantics;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p175.AbstractC7738;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1945 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f5752;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5753;

    public /* synthetic */ C1945(Object obj, int i) {
        this.f5753 = i;
        this.f5752 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f5753;
        Object obj3 = this.f5752;
        switch (i) {
            case 0:
                return ((Number) ((InterfaceC6553) obj3).invoke(obj, obj2)).intValue();
            case 1:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f10105).compareTo(Boolean.valueOf(materialButton2.f10105));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
            default:
                for (InterfaceC6557 interfaceC6557 : (InterfaceC6557[]) obj3) {
                    int iM13040 = AbstractC7738.m13040((Comparable) interfaceC6557.invoke(obj), (Comparable) interfaceC6557.invoke(obj2));
                    if (iM13040 != 0) {
                        return iM13040;
                    }
                }
                return 0;
        }
    }
}
