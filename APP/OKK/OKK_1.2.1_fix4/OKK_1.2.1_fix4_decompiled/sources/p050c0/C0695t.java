package p050c0;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.lang.reflect.Method;
import java.util.Comparator;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0695t implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2195b;

    public /* synthetic */ C0695t(int i2, Object obj) {
        this.f2194a = i2;
        this.f2195b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2194a) {
            case 0:
                int iCompare = ((Comparator) this.f2195b).compare(obj, obj2);
                return iCompare != 0 ? iCompare : AbstractC0040p.m112q(Integer.valueOf(((Method) obj).getName().length()), Integer.valueOf(((Method) obj2).getName().length()));
            case 1:
                int iCompare2 = ((Comparator) this.f2195b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : AbstractC0040p.m112q(Boolean.valueOf(AbstractC0307g.m699a(((Method) obj2).getName(), "init")), Boolean.valueOf(AbstractC0307g.m699a(((Method) obj).getName(), "init")));
            case 2:
                int iCompare3 = ((Comparator) this.f2195b).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : AbstractC0040p.m112q(Integer.valueOf(((Method) obj).getParameterTypes().length), Integer.valueOf(((Method) obj2).getParameterTypes().length));
            case 3:
                int iCompare4 = ((Comparator) this.f2195b).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : AbstractC0040p.m112q(Integer.valueOf(((Method) obj).getName().length()), Integer.valueOf(((Method) obj2).getName().length()));
            default:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f2350o).compareTo(Boolean.valueOf(materialButton2.f2350o));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f2195b;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
        }
    }
}
