package p232;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC3317;
import com.davemorrissey.labs.subscaleview.C0328R;

/* JADX INFO: renamed from: 飘花落叶言楪世兰哲苏子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8789 extends AbstractC3317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final View f22377;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final View f22378;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final View f22379;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f22380;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8789(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0328R.layout.brvah_trailing_load_more, viewGroup, false);
        viewInflate.getClass();
        super(viewInflate);
        View viewFindViewById = this.itemView.findViewById(C0328R.id.load_more_load_complete_view);
        viewFindViewById.getClass();
        this.f22380 = viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(C0328R.id.load_more_loading_view);
        viewFindViewById2.getClass();
        this.f22379 = viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(C0328R.id.load_more_load_fail_view);
        viewFindViewById3.getClass();
        this.f22378 = viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(C0328R.id.load_more_load_end_view);
        viewFindViewById4.getClass();
        this.f22377 = viewFindViewById4;
    }
}
