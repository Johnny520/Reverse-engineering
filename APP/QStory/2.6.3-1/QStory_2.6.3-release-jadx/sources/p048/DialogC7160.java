package p048;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.HandlerC0950;
import com.davemorrissey.labs.subscaleview.C0328R;
import lin.xposed.hook.javaplugin.view.RunnableC6372;
import p044.DialogC7147;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogC7160 extends DialogC7147 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f17792;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ProgressBar f17793;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public long f17794;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final HandlerC0950 f17795;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final TextView f17796;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final TextView f17797;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextView f17798;

    public DialogC7160(Context context) {
        super(context, C0328R.style.dialog_backgroundDimEnabled);
        this.f17792 = false;
        this.f17795 = new HandlerC0950(this, Looper.getMainLooper());
        View viewInflate = LayoutInflater.from(context).inflate(C0328R.layout.new_simple_loading_dialog_layout, (ViewGroup) null, false);
        this.f17798 = (TextView) viewInflate.findViewById(C0328R.id.new_simple_loading_title_text);
        this.f17797 = (TextView) viewInflate.findViewById(C0328R.id.new_simple_loading_runtime);
        this.f17793 = (ProgressBar) viewInflate.findViewById(C0328R.id.new_simple_loading);
        this.f17796 = (TextView) viewInflate.findViewById(C0328R.id.new_simple_loading_info_text);
        setContentView(viewInflate);
        m12392((int) (((double) m12393()) * 0.8d));
    }

    @Override // p044.DialogC7147, android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.f17792 = true;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        this.f17794 = System.currentTimeMillis();
        new Thread(new RunnableC6372(this, 1)).start();
    }
}
