package p000;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* JADX INFO: renamed from: Ba */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0060Ba implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f140b;

    public /* synthetic */ C0060Ba(int i, Object obj) {
        this.f139a = i;
        this.f140b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f139a) {
            case 0:
                for (InterfaceC1416fj interfaceC1416fj : (InterfaceC1416fj[]) this.f140b) {
                    int iM1346d = AbstractC0671Pj.m1346d((Comparable) interfaceC1416fj.mo90g(obj), (Comparable) interfaceC1416fj.mo90g(obj2));
                    if (iM1346d != 0) {
                        return iM1346d;
                    }
                }
                return 0;
            default:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f140b;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f4486o).compareTo(Boolean.valueOf(materialButton2.f4486o));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
        }
    }
}
