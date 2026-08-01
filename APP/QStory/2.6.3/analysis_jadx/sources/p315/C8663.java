package p315;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC2484;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪苏子世哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8663 extends AbstractC2484 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SparseArray f24449;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8663(int i, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        viewInflate.getClass();
        this(viewInflate);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14359(int i, CharSequence charSequence) {
        ((TextView) m14360(i)).setText(charSequence);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View m14360(int i) {
        SparseArray sparseArray = this.f24449;
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
        C5925.m11312(AbstractC6183.m11588(i, "No view found with id "));
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8663(View view) {
        super(view);
        view.getClass();
        this.f24449 = new SparseArray();
    }
}
