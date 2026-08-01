package p031;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.compose.foundation.lazy.layout.C0679;
import com.davemorrissey.labs.subscaleview.R;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import p027.DialogC6300;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogC6311 extends DialogC6300 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0679 f17393;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public String f17394;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final TextView f17395;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String[] f17396;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final RadioGroup f17397;

    public DialogC6311(Activity activity, String[] strArr) {
        super(activity);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(R.layout.simple_dialog_radio_view, (ViewGroup) null);
        this.f17397 = (RadioGroup) linearLayout.findViewById(R.id.dialog_radio_group);
        this.f17395 = (TextView) linearLayout.findViewById(R.id.simple_radio_dialog_title);
        this.f17396 = strArr;
        setContentView(linearLayout);
    }

    @Override // android.app.Dialog
    public final void show() {
        for (String str : this.f17396) {
            RadioButton radioButton = (RadioButton) LayoutInflater.from(getContext()).inflate(R.layout.radio_view, (ViewGroup) null);
            radioButton.setText(str);
            radioButton.setOnClickListener(new ViewOnClickListenerC5561(this, 2, str));
            this.f17397.addView(radioButton, new LinearLayout.LayoutParams(-1, -2));
            if (str.equals(this.f17394)) {
                radioButton.setChecked(true);
            }
        }
        super.show();
    }
}
