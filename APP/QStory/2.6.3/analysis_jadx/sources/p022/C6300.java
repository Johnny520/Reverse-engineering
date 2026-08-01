package p022;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import p028.DialogC6319;
import p287.AbstractC8405;
import p316.C8667;

/* JADX INFO: renamed from: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6300 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Button f17395;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Button f17396;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f17397;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ DialogC6319 f17398;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ EditText f17399;

    public C6300(EditText editText, String str, DialogC6319 dialogC6319, Button button, Button button2) {
        this.f17399 = editText;
        this.f17397 = str;
        this.f17398 = dialogC6319;
        this.f17396 = button;
        this.f17395 = button2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zContains = editable.toString().contains(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
        DialogC6319 dialogC6319 = this.f17398;
        if (zContains && !editable.toString().equals("")) {
            C8667.m14382(this.f17397, this.f17399.getText().toString().replace(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"), ""));
            dialogC6319.dismiss();
        } else {
            this.f17396.setText(AbstractC8405.m13973("呜喵喵呜喵呜呜呜~呜呜喵喵呜喵呜喵~呜呜呜喵喵呜呜呜~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵喵喵~呜呜呜呜喵呜喵喵"));
            String strM13973 = AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜呜喵呜喵呜~呜呜呜喵喵呜呜呜~呜喵喵喵喵喵喵喵~呜呜呜喵喵呜喵呜~呜呜呜喵呜呜呜呜");
            Button button = this.f17395;
            button.setText(strM13973);
            button.setOnClickListener(new ViewOnClickListenerC3183(dialogC6319, 13));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
