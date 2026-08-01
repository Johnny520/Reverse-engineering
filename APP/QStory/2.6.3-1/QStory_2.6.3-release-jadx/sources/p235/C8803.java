package p235;

import android.util.Pair;
import androidx.appcompat.widget.C1037;
import androidx.recyclerview.widget.AbstractC3283;
import androidx.recyclerview.widget.AbstractC3334;
import androidx.recyclerview.widget.C3294;
import androidx.recyclerview.widget.C3325;
import androidx.recyclerview.widget.C3326;
import com.chad.library.adapter4.layoutmanager.QuickGridLayoutManager;
import p233.AbstractC8798;
import p236.InterfaceC8804;

/* JADX INFO: renamed from: 飘花落叶言楪世兰苏哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8803 extends AbstractC3334 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ QuickGridLayoutManager f22392;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC3334 f22393;

    public C8803(QuickGridLayoutManager quickGridLayoutManager) {
        this.f22392 = quickGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.AbstractC3334
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo5520(int i) {
        QuickGridLayoutManager quickGridLayoutManager = this.f22392;
        AbstractC3283 abstractC3283 = quickGridLayoutManager.f10172;
        if (abstractC3283 == null) {
            return 1;
        }
        if (!(abstractC3283 instanceof C3326)) {
            if (abstractC3283 instanceof InterfaceC8804) {
                return quickGridLayoutManager.f7487;
            }
            if (!(abstractC3283 instanceof AbstractC8798)) {
                AbstractC3334 abstractC3334 = this.f22393;
                if (abstractC3334 != null) {
                    return abstractC3334.mo5520(i);
                }
                return 1;
            }
            AbstractC8798 abstractC8798 = (AbstractC8798) abstractC3283;
            if (abstractC8798.mo14015(abstractC8798.mo5352(i))) {
                return quickGridLayoutManager.f7487;
            }
            AbstractC3334 abstractC33342 = this.f22393;
            if (abstractC33342 != null) {
                return abstractC33342.mo5520(i);
            }
            return 1;
        }
        C3325 c3325 = ((C3326) abstractC3283).f7810;
        C1037 c1037M5492 = c3325.m5492(i);
        Pair pair = new Pair(((C3294) c1037M5492.f1088).f7677, Integer.valueOf(c1037M5492.f1090));
        c1037M5492.f1089 = false;
        c1037M5492.f1088 = null;
        c1037M5492.f1090 = -1;
        c3325.f7802 = c1037M5492;
        AbstractC3283 abstractC32832 = (AbstractC3283) pair.first;
        if (abstractC32832 instanceof InterfaceC8804) {
            return quickGridLayoutManager.f7487;
        }
        if (!(abstractC32832 instanceof AbstractC8798)) {
            AbstractC3334 abstractC33343 = this.f22393;
            if (abstractC33343 != null) {
                return abstractC33343.mo5520(i);
            }
            return 1;
        }
        AbstractC8798 abstractC87982 = (AbstractC8798) abstractC32832;
        Object obj = pair.second;
        obj.getClass();
        if (abstractC87982.mo14015(abstractC87982.mo5352(((Number) obj).intValue()))) {
            return quickGridLayoutManager.f7487;
        }
        AbstractC3334 abstractC33344 = this.f22393;
        if (abstractC33344 != null) {
            return abstractC33344.mo5520(i);
        }
        return 1;
    }
}
