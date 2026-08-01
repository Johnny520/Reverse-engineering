package p038;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import p044.DialogC7148;
import p303.AbstractC9234;
import p332.C9496;

/* JADX INFO: renamed from: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7129 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Button f17740;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Button f17741;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f17742;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ DialogC7148 f17743;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ EditText f17744;

    public C7129(EditText editText, String str, DialogC7148 dialogC7148, Button button, Button button2) {
        this.f17744 = editText;
        this.f17742 = str;
        this.f17743 = dialogC7148;
        this.f17741 = button;
        this.f17740 = button2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zContains = editable.toString().contains(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
        DialogC7148 dialogC7148 = this.f17743;
        if (zContains && !editable.toString().equals("")) {
            C9496.m14941(this.f17742, this.f17744.getText().toString().replace(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"), ""));
            dialogC7148.dismiss();
        } else {
            this.f17741.setText(AbstractC9234.m14532("呜喵喵呜喵呜呜呜~呜呜喵喵呜喵呜喵~呜呜呜喵喵呜呜呜~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵喵喵~呜呜呜呜喵呜喵喵"));
            String strM14532 = AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜呜喵呜喵呜~呜呜呜喵喵呜呜呜~呜喵喵喵喵喵喵喵~呜呜呜喵喵呜喵呜~呜呜呜喵呜呜呜呜");
            Button button = this.f17740;
            button.setText(strM14532);
            button.setOnClickListener(new ViewOnClickListenerC4015(dialogC7148, 13));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
