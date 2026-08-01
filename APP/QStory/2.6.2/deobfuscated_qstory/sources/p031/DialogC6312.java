package p031;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.HandlerC0103;
import com.davemorrissey.labs.subscaleview.R;
import lin.xposed.hook.javaplugin.view.RunnableC5540;
import p027.DialogC6299;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogC6312 extends DialogC6299 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f17398;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ProgressBar f17399;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public long f17400;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final HandlerC0103 f17401;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final TextView f17402;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final TextView f17403;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextView f17404;

    public DialogC6312(Context context) {
        super(context, R.style.dialog_backgroundDimEnabled);
        this.f17398 = false;
        this.f17401 = new HandlerC0103(this, Looper.getMainLooper());
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.new_simple_loading_dialog_layout, (ViewGroup) null, false);
        this.f17404 = (TextView) viewInflate.findViewById(R.id.new_simple_loading_title_text);
        this.f17403 = (TextView) viewInflate.findViewById(R.id.new_simple_loading_runtime);
        this.f17399 = (ProgressBar) viewInflate.findViewById(R.id.new_simple_loading);
        this.f17402 = (TextView) viewInflate.findViewById(R.id.new_simple_loading_info_text);
        setContentView(viewInflate);
        m11805((int) (((double) m11806()) * 0.8d));
    }

    @Override // p027.DialogC6299, android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.f17398 = true;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        this.f17400 = System.currentTimeMillis();
        new Thread(new RunnableC5540(this, 1)).start();
    }
}
