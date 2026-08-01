package p025;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC3317;
import com.davemorrissey.labs.subscaleview.C0328R;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7000 extends AbstractC3317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final TextView f17313;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final TextView f17314;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextView f17315;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7000(View view) {
        super(view);
        AbstractC9234.m14531(1330);
        this.f17315 = (TextView) AbstractC7012.m12129(view, C0328R.id.tv_result_name, 1280);
        this.f17314 = (TextView) AbstractC7012.m12129(view, C0328R.id.tv_result_description, 1280);
        this.f17313 = (TextView) AbstractC7012.m12129(view, C0328R.id.tv_result_type, 1280);
    }
}
