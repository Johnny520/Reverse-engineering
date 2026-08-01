package p009;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC2484;
import com.davemorrissey.labs.subscaleview.R;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6171 extends AbstractC2484 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final TextView f16968;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final TextView f16969;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextView f16970;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6171(View view) {
        super(view);
        AbstractC8405.m13972(1330);
        this.f16970 = (TextView) AbstractC6183.m11570(view, R.id.tv_result_name, 1280);
        this.f16969 = (TextView) AbstractC6183.m11570(view, R.id.tv_result_description, 1280);
        this.f16968 = (TextView) AbstractC6183.m11570(view, R.id.tv_result_type, 1280);
    }
}
