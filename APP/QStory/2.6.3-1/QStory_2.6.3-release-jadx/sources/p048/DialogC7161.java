package p048;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.davemorrissey.labs.subscaleview.C0328R;
import p034.AbstractC7082;
import p044.DialogC7147;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogC7161 extends DialogC7147 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ProgressBar f17799;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextView f17800;

    public DialogC7161(Activity activity) {
        super(activity, C0328R.style.dialog_backgroundDimEnabled);
        View viewInflate = AbstractC7082.m12309(activity).inflate(C0328R.layout.simple_loading_dialog_layout, (ViewGroup) null, false);
        this.f17800 = (TextView) viewInflate.findViewById(C0328R.id.simple_loading_title_text);
        this.f17799 = (ProgressBar) viewInflate.findViewById(C0328R.id.simple_loading);
        setContentView(viewInflate);
        m12392((int) (((double) m12393()) * 0.82d));
    }
}
