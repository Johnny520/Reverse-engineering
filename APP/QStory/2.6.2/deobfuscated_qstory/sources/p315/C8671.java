package p315;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC2484;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪苏子世哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8671 extends AbstractC2484 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SparseArray f24458;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8671(int i, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        viewInflate.getClass();
        this(viewInflate);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14341(int i, CharSequence charSequence) {
        ((TextView) m14342(i)).setText(charSequence);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View m14342(int i) {
        SparseArray sparseArray = this.f24458;
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
        C5919.m11251(AbstractC6136.m11556(i, "No view found with id "));
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8671(View view) {
        super(view);
        view.getClass();
        this.f24458 = new SparseArray();
    }
}
