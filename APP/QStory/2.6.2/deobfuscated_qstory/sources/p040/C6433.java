package p040;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import p027.DialogC6300;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C6433 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Button f17626;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Button f17627;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f17628;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ DialogC6300 f17629;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ EditText f17630;

    public C6433(EditText editText, String str, DialogC6300 dialogC6300, Button button, Button button2) {
        this.f17630 = editText;
        this.f17628 = str;
        this.f17629 = dialogC6300;
        this.f17627 = button;
        this.f17626 = button2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zContains = editable.toString().contains("\n");
        DialogC6300 dialogC6300 = this.f17629;
        if (zContains && !editable.toString().equals("")) {
            AbstractC3065.m6825(this.f17628, this.f17630.getText().toString().replace("\n", ""));
            dialogC6300.dismiss();
        } else {
            this.f17627.setText("\u4fdd\u5b58");
            String strM6668 = "\u601d\u8003";
            Button button = this.f17626;
            button.setText(strM6668);
            button.setOnClickListener(new ViewOnClickListenerC3182(dialogC6300, 17));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
