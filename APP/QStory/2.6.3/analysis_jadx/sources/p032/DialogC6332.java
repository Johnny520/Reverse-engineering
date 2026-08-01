package p032;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.davemorrissey.labs.subscaleview.R;
import p018.AbstractC6253;
import p028.DialogC6318;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogC6332 extends DialogC6318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ProgressBar f17454;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextView f17455;

    public DialogC6332(Activity activity) {
        super(activity, R.style.dialog_backgroundDimEnabled);
        View viewInflate = AbstractC6253.m11750(activity).inflate(R.layout.simple_loading_dialog_layout, (ViewGroup) null, false);
        this.f17455 = (TextView) viewInflate.findViewById(R.id.simple_loading_title_text);
        this.f17454 = (ProgressBar) viewInflate.findViewById(R.id.simple_loading);
        setContentView(viewInflate);
        m11833((int) (((double) m11834()) * 0.82d));
    }
}
