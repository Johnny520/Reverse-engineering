package p216;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC2484;
import com.davemorrissey.labs.subscaleview.R;

/* JADX INFO: renamed from: 飘花落叶言楪世兰哲苏子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7959 extends AbstractC2484 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final View f22035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View f22036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View f22037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f22038;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7959(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.brvah_trailing_load_more, viewGroup, false);
        viewInflate.getClass();
        super(viewInflate);
        View viewFindViewById = this.itemView.findViewById(R.id.load_more_load_complete_view);
        viewFindViewById.getClass();
        this.f22038 = viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.load_more_loading_view);
        viewFindViewById2.getClass();
        this.f22037 = viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.load_more_load_fail_view);
        viewFindViewById3.getClass();
        this.f22036 = viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.load_more_load_end_view);
        viewFindViewById4.getClass();
        this.f22035 = viewFindViewById4;
    }
}
