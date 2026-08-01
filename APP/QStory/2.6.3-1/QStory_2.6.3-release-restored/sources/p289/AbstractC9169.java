package p289;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.C1931;
import androidx.recyclerview.widget.AbstractC3283;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.AbstractC3352;
import androidx.recyclerview.widget.C3308;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC6365;
import p050.C7181;
import p055.ViewOnLongClickListenerC7245;
import p246.C8878;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9169 extends AbstractC3283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final SparseArray f23346;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SparseArray f23347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f23348;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8878 f23349;

    public AbstractC9169(List list) {
        list.getClass();
        this.f23348 = list;
        this.f23347 = new SparseArray();
        this.f23346 = new SparseArray();
        C8878 c8878 = new C8878(9, false);
        c8878.f22564 = new SparseArray();
        this.f23349 = c8878;
    }

    public final void setOnItemClickListener(InterfaceC9170 interfaceC9170) {
        interfaceC9170.getClass();
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo5352(int i) {
        SparseArray sparseArray = this.f23347;
        if (i < sparseArray.size()) {
            return sparseArray.keyAt(i);
        }
        if (m14414(i)) {
            int size = i - sparseArray.size();
            int iMo5354 = mo5354() - sparseArray.size();
            SparseArray sparseArray2 = this.f23346;
            return sparseArray2.keyAt(size - (iMo5354 - sparseArray2.size()));
        }
        C8878 c8878 = this.f23349;
        if (((SparseArray) c8878.f22564).size() <= 0) {
            return 0;
        }
        this.f23348.get(i - sparseArray.size());
        sparseArray.size();
        SparseArray sparseArray3 = (SparseArray) c8878.f22564;
        int size2 = sparseArray3.size() - 1;
        if (-1 >= size2) {
            return 0;
        }
        ((C9172) sparseArray3.valueAt(size2)).getClass();
        return sparseArray3.keyAt(size2);
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo5354() {
        return this.f23346.size() + this.f23347.size() + this.f23348.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean m14414(int i) {
        SparseArray sparseArray = this.f23347;
        return i >= ((mo5354() - sparseArray.size()) - this.f23346.size()) + sparseArray.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m14415(C9168 c9168, Object obj, List list) {
        c9168.getAdapterPosition();
        this.f23347.size();
        C8878 c8878 = this.f23349;
        c8878.getClass();
        SparseArray sparseArray = (SparseArray) c8878.f22564;
        if (sparseArray.size() > 0) {
            C9172 c9172 = (C9172) sparseArray.valueAt(0);
            c9172.getClass();
            C7181 c7181 = c9172.f23351;
            if (list == null || list.isEmpty()) {
                c7181.m12496(c9168, obj);
            } else {
                c7181.m12496(c9168, obj);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC3317 mo5358(int i, ViewGroup viewGroup) {
        SparseArray sparseArray = this.f23347;
        if (sparseArray.get(i) != null) {
            int i2 = C9168.f23344;
            Object obj = sparseArray.get(i);
            obj.getClass();
            return new C9168((View) obj);
        }
        SparseArray sparseArray2 = this.f23346;
        if (sparseArray2.get(i) != null) {
            int i3 = C9168.f23344;
            Object obj2 = sparseArray2.get(i);
            obj2.getClass();
            return new C9168((View) obj2);
        }
        Object obj3 = ((SparseArray) this.f23349.f22564).get(i);
        obj3.getClass();
        int i4 = ((C9172) obj3).f23351.f23350;
        int i5 = C9168.f23344;
        Context context = viewGroup.getContext();
        context.getClass();
        View viewInflate = LayoutInflater.from(context).cloneInContext(context).inflate(i4, viewGroup, false);
        viewInflate.getClass();
        C9168 c9168 = new C9168(viewInflate);
        View view = c9168.f23345;
        view.getClass();
        view.setOnClickListener(new ViewOnClickListenerC6365(this, c9168));
        view.setOnLongClickListener(new ViewOnLongClickListenerC7245(this, c9168));
        return c9168;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo5362(AbstractC3317 abstractC3317) {
        ViewGroup.LayoutParams layoutParams;
        C9168 c9168 = (C9168) abstractC3317;
        int layoutPosition = c9168.getLayoutPosition();
        if ((layoutPosition >= this.f23347.size() && !m14414(layoutPosition)) || (layoutParams = c9168.itemView.getLayoutParams()) == null || !(layoutParams instanceof C3308)) {
            return;
        }
        ((C3308) layoutParams).f7769 = true;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo5365(AbstractC3317 abstractC3317, int i) {
        C9168 c9168 = (C9168) abstractC3317;
        SparseArray sparseArray = this.f23347;
        if (i >= sparseArray.size() && !m14414(i)) {
            m14415(c9168, this.f23348.get(i - sparseArray.size()), null);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo5366(AbstractC3317 abstractC3317, int i, List list) {
        C9168 c9168 = (C9168) abstractC3317;
        list.getClass();
        SparseArray sparseArray = this.f23347;
        if (i >= sparseArray.size() && !m14414(i)) {
            m14415(c9168, this.f23348.get(i - sparseArray.size()), list);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo5368(RecyclerView recyclerView) {
        C1931 c1931 = new C1931(this, 9);
        AbstractC3352 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.mo5192(new C9167(c1931, gridLayoutManager, gridLayoutManager.f7497));
            gridLayoutManager.m5190(gridLayoutManager.f7487);
        }
    }

    public final void setMOnItemClickListener(InterfaceC9170 interfaceC9170) {
    }
}
