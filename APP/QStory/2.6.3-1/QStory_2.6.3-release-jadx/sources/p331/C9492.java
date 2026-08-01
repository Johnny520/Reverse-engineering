package p331;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC3317;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪苏子世哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9492 extends AbstractC3317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SparseArray f24794;

    /* JADX WARN: Illegal instructions before constructor call */
    public C9492(int i, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        viewInflate.getClass();
        this(viewInflate);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14918(int i, CharSequence charSequence) {
        ((TextView) m14919(i)).setText(charSequence);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View m14919(int i) {
        SparseArray sparseArray = this.f24794;
        View viewFindViewById = (View) sparseArray.get(i);
        if (viewFindViewById == null) {
            viewFindViewById = this.itemView.findViewById(i);
            if (viewFindViewById != null) {
                sparseArray.put(i, viewFindViewById);
            } else {
                viewFindViewById = null;
            }
        }
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        C6755.m11871(AbstractC7012.m12147(i, "No view found with id "));
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9492(View view) {
        super(view);
        view.getClass();
        this.f24794 = new SparseArray();
    }
}
