package p273;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.C1093;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.C2475;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5533;
import p034.C6352;
import p039.ViewOnLongClickListenerC6416;
import p230.C8049;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8340 extends AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final SparseArray f23001;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SparseArray f23002;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f23003;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8049 f23004;

    public AbstractC8340(List list) {
        list.getClass();
        this.f23003 = list;
        this.f23002 = new SparseArray();
        this.f23001 = new SparseArray();
        C8049 c8049 = new C8049(9, false);
        c8049.f22219 = new SparseArray();
        this.f23004 = c8049;
    }

    public final void setOnItemClickListener(InterfaceC8341 interfaceC8341) {
        interfaceC8341.getClass();
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo4792(int i) {
        SparseArray sparseArray = this.f23002;
        if (i < sparseArray.size()) {
            return sparseArray.keyAt(i);
        }
        if (m13855(i)) {
            int size = i - sparseArray.size();
            int iMo4794 = mo4794() - sparseArray.size();
            SparseArray sparseArray2 = this.f23001;
            return sparseArray2.keyAt(size - (iMo4794 - sparseArray2.size()));
        }
        C8049 c8049 = this.f23004;
        if (((SparseArray) c8049.f22219).size() <= 0) {
            return 0;
        }
        this.f23003.get(i - sparseArray.size());
        sparseArray.size();
        SparseArray sparseArray3 = (SparseArray) c8049.f22219;
        int size2 = sparseArray3.size() - 1;
        if (-1 >= size2) {
            return 0;
        }
        ((C8343) sparseArray3.valueAt(size2)).getClass();
        return sparseArray3.keyAt(size2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4794() {
        return this.f23001.size() + this.f23002.size() + this.f23003.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean m13855(int i) {
        SparseArray sparseArray = this.f23002;
        return i >= ((mo4794() - sparseArray.size()) - this.f23001.size()) + sparseArray.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m13856(C8339 c8339, Object obj, List list) {
        c8339.getAdapterPosition();
        this.f23002.size();
        C8049 c8049 = this.f23004;
        c8049.getClass();
        SparseArray sparseArray = (SparseArray) c8049.f22219;
        if (sparseArray.size() > 0) {
            C8343 c8343 = (C8343) sparseArray.valueAt(0);
            c8343.getClass();
            C6352 c6352 = c8343.f23006;
            if (list == null || list.isEmpty()) {
                c6352.m11937(c8339, obj);
            } else {
                c6352.m11937(c8339, obj);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4798(int i, ViewGroup viewGroup) {
        SparseArray sparseArray = this.f23002;
        if (sparseArray.get(i) != null) {
            int i2 = C8339.f22999;
            Object obj = sparseArray.get(i);
            obj.getClass();
            return new C8339((View) obj);
        }
        SparseArray sparseArray2 = this.f23001;
        if (sparseArray2.get(i) != null) {
            int i3 = C8339.f22999;
            Object obj2 = sparseArray2.get(i);
            obj2.getClass();
            return new C8339((View) obj2);
        }
        Object obj3 = ((SparseArray) this.f23004.f22219).get(i);
        obj3.getClass();
        int i4 = ((C8343) obj3).f23006.f23005;
        int i5 = C8339.f22999;
        Context context = viewGroup.getContext();
        context.getClass();
        View viewInflate = LayoutInflater.from(context).cloneInContext(context).inflate(i4, viewGroup, false);
        viewInflate.getClass();
        C8339 c8339 = new C8339(viewInflate);
        View view = c8339.f23000;
        view.getClass();
        view.setOnClickListener(new ViewOnClickListenerC5533(this, c8339));
        view.setOnLongClickListener(new ViewOnLongClickListenerC6416(this, c8339));
        return c8339;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo4802(AbstractC2484 abstractC2484) {
        ViewGroup.LayoutParams layoutParams;
        C8339 c8339 = (C8339) abstractC2484;
        int layoutPosition = c8339.getLayoutPosition();
        if ((layoutPosition >= this.f23002.size() && !m13855(layoutPosition)) || (layoutParams = c8339.itemView.getLayoutParams()) == null || !(layoutParams instanceof C2475)) {
            return;
        }
        ((C2475) layoutParams).f7424 = true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4805(AbstractC2484 abstractC2484, int i) {
        C8339 c8339 = (C8339) abstractC2484;
        SparseArray sparseArray = this.f23002;
        if (i >= sparseArray.size() && !m13855(i)) {
            m13856(c8339, this.f23003.get(i - sparseArray.size()), null);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo4806(AbstractC2484 abstractC2484, int i, List list) {
        C8339 c8339 = (C8339) abstractC2484;
        list.getClass();
        SparseArray sparseArray = this.f23002;
        if (i >= sparseArray.size() && !m13855(i)) {
            m13856(c8339, this.f23003.get(i - sparseArray.size()), list);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo4808(RecyclerView recyclerView) {
        C1093 c1093 = new C1093(this, 9);
        AbstractC2519 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.mo4632(new C8338(c1093, gridLayoutManager, gridLayoutManager.f7152));
            gridLayoutManager.m4630(gridLayoutManager.f7142);
        }
    }

    public final void setMOnItemClickListener(InterfaceC8341 interfaceC8341) {
    }
}
