package p031;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.davemorrissey.labs.subscaleview.R;
import p027.DialogC6299;
import p053.AbstractC6560;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogC6313 extends DialogC6299 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ProgressBar f17405;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextView f17406;

    public DialogC6313(Activity activity) {
        super(activity, R.style.dialog_backgroundDimEnabled);
        View viewInflate = AbstractC6560.m12028(activity).inflate(R.layout.simple_loading_dialog_layout, (ViewGroup) null, false);
        this.f17406 = (TextView) viewInflate.findViewById(R.id.simple_loading_title_text);
        this.f17405 = (ProgressBar) viewInflate.findViewById(R.id.simple_loading);
        setContentView(viewInflate);
        m11805((int) (((double) m11806()) * 0.82d));
    }
}
