package p032;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.HandlerC0103;
import com.davemorrissey.labs.subscaleview.R;
import lin.xposed.hook.javaplugin.view.RunnableC5541;
import p028.DialogC6318;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogC6331 extends DialogC6318 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f17447;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ProgressBar f17448;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public long f17449;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final HandlerC0103 f17450;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final TextView f17451;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final TextView f17452;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final TextView f17453;

    public DialogC6331(Context context) {
        super(context, R.style.dialog_backgroundDimEnabled);
        this.f17447 = false;
        this.f17450 = new HandlerC0103(this, Looper.getMainLooper());
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.new_simple_loading_dialog_layout, (ViewGroup) null, false);
        this.f17453 = (TextView) viewInflate.findViewById(R.id.new_simple_loading_title_text);
        this.f17452 = (TextView) viewInflate.findViewById(R.id.new_simple_loading_runtime);
        this.f17448 = (ProgressBar) viewInflate.findViewById(R.id.new_simple_loading);
        this.f17451 = (TextView) viewInflate.findViewById(R.id.new_simple_loading_info_text);
        setContentView(viewInflate);
        m11833((int) (((double) m11834()) * 0.8d));
    }

    @Override // p028.DialogC6318, android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.f17447 = true;
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        this.f17449 = System.currentTimeMillis();
        new Thread(new RunnableC5541(this, 1)).start();
    }
}
