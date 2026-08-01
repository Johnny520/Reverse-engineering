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
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5532;
import p033.C6331;
import p038.ViewOnLongClickListenerC6386;
import p230.C8048;

/* JADX INFO: renamed from: 飘花落叶言楪哲苏世兰子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8339 extends AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final SparseArray f23002;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SparseArray f23003;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f23004;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8048 f23005;

    public AbstractC8339(List list) {
        list.getClass();
        this.f23004 = list;
        this.f23003 = new SparseArray();
        this.f23002 = new SparseArray();
        C8048 c8048 = new C8048(9, false);
        c8048.f22221 = new SparseArray();
        this.f23005 = c8048;
    }

    public final void setOnItemClickListener(InterfaceC8340 interfaceC8340) {
        interfaceC8340.getClass();
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo4782(int i) {
        SparseArray sparseArray = this.f23003;
        if (i < sparseArray.size()) {
            return sparseArray.keyAt(i);
        }
        if (m13838(i)) {
            int size = i - sparseArray.size();
            int iMo4784 = mo4784() - sparseArray.size();
            SparseArray sparseArray2 = this.f23002;
            return sparseArray2.keyAt(size - (iMo4784 - sparseArray2.size()));
        }
        C8048 c8048 = this.f23005;
        if (((SparseArray) c8048.f22221).size() <= 0) {
            return 0;
        }
        this.f23004.get(i - sparseArray.size());
        sparseArray.size();
        SparseArray sparseArray3 = (SparseArray) c8048.f22221;
        int size2 = sparseArray3.size() - 1;
        if (-1 >= size2) {
            return 0;
        }
        ((C8342) sparseArray3.valueAt(size2)).getClass();
        return sparseArray3.keyAt(size2);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4784() {
        return this.f23002.size() + this.f23003.size() + this.f23004.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean m13838(int i) {
        SparseArray sparseArray = this.f23003;
        return i >= ((mo4784() - sparseArray.size()) - this.f23002.size()) + sparseArray.size();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m13839(C8338 c8338, Object obj, List list) {
        c8338.getAdapterPosition();
        this.f23003.size();
        C8048 c8048 = this.f23005;
        c8048.getClass();
        SparseArray sparseArray = (SparseArray) c8048.f22221;
        if (sparseArray.size() > 0) {
            C8342 c8342 = (C8342) sparseArray.valueAt(0);
            c8342.getClass();
            C6331 c6331 = c8342.f23007;
            if (list == null || list.isEmpty()) {
                c6331.m11885(c8338, obj);
            } else {
                c6331.m11885(c8338, obj);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4788(int i, ViewGroup viewGroup) {
        SparseArray sparseArray = this.f23003;
        if (sparseArray.get(i) != null) {
            int i2 = C8338.f23000;
            Object obj = sparseArray.get(i);
            obj.getClass();
            return new C8338((View) obj);
        }
        SparseArray sparseArray2 = this.f23002;
        if (sparseArray2.get(i) != null) {
            int i3 = C8338.f23000;
            Object obj2 = sparseArray2.get(i);
            obj2.getClass();
            return new C8338((View) obj2);
        }
        Object obj3 = ((SparseArray) this.f23005.f22221).get(i);
        obj3.getClass();
        int i4 = ((C8342) obj3).f23007.f23006;
        int i5 = C8338.f23000;
        Context context = viewGroup.getContext();
        context.getClass();
        View viewInflate = LayoutInflater.from(context).cloneInContext(context).inflate(i4, viewGroup, false);
        viewInflate.getClass();
        C8338 c8338 = new C8338(viewInflate);
        View view = c8338.f23001;
        view.getClass();
        view.setOnClickListener(new ViewOnClickListenerC5532(this, c8338));
        view.setOnLongClickListener(new ViewOnLongClickListenerC6386(this, c8338));
        return c8338;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo4792(AbstractC2484 abstractC2484) {
        ViewGroup.LayoutParams layoutParams;
        C8338 c8338 = (C8338) abstractC2484;
        int layoutPosition = c8338.getLayoutPosition();
        if ((layoutPosition >= this.f23003.size() && !m13838(layoutPosition)) || (layoutParams = c8338.itemView.getLayoutParams()) == null || !(layoutParams instanceof C2475)) {
            return;
        }
        ((C2475) layoutParams).f7423 = true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4795(AbstractC2484 abstractC2484, int i) {
        C8338 c8338 = (C8338) abstractC2484;
        SparseArray sparseArray = this.f23003;
        if (i >= sparseArray.size() && !m13838(i)) {
            m13839(c8338, this.f23004.get(i - sparseArray.size()), null);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo4796(AbstractC2484 abstractC2484, int i, List list) {
        C8338 c8338 = (C8338) abstractC2484;
        list.getClass();
        SparseArray sparseArray = this.f23003;
        if (i >= sparseArray.size() && !m13838(i)) {
            m13839(c8338, this.f23004.get(i - sparseArray.size()), list);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo4798(RecyclerView recyclerView) {
        C1093 c1093 = new C1093(this, 9);
        AbstractC2519 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.mo4622(new C8337(c1093, gridLayoutManager, gridLayoutManager.f7151));
            gridLayoutManager.m4620(gridLayoutManager.f7141);
        }
    }

    public final void setMOnItemClickListener(InterfaceC8340 interfaceC8340) {
    }
}
