package p048;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.compose.foundation.lazy.layout.C1520;
import com.davemorrissey.labs.subscaleview.C0328R;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p044.DialogC7148;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class DialogC7159 extends DialogC7148 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C1520 f17787;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public String f17788;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final TextView f17789;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String[] f17790;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final RadioGroup f17791;

    public DialogC7159(Activity activity, String[] strArr) {
        super(activity);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(activity).inflate(C0328R.layout.simple_dialog_radio_view, (ViewGroup) null);
        this.f17791 = (RadioGroup) linearLayout.findViewById(C0328R.id.dialog_radio_group);
        this.f17789 = (TextView) linearLayout.findViewById(C0328R.id.simple_radio_dialog_title);
        this.f17790 = strArr;
        setContentView(linearLayout);
    }

    @Override // android.app.Dialog
    public final void show() {
        for (String str : this.f17790) {
            RadioButton radioButton = (RadioButton) LayoutInflater.from(getContext()).inflate(C0328R.layout.radio_view, (ViewGroup) null);
            radioButton.setText(str);
            radioButton.setOnClickListener(new ViewOnClickListenerC6392(this, 4, str));
            this.f17791.addView(radioButton, new LinearLayout.LayoutParams(-1, -2));
            if (str.equals(this.f17788)) {
                radioButton.setChecked(true);
            }
        }
        super.show();
    }
}
