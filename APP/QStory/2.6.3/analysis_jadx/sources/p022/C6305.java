package p022;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.io.File;
import p010.AbstractC6185;
import p028.DialogC6319;
import p287.AbstractC8405;
import p316.C8667;

/* JADX INFO: renamed from: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6305 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ File f17410;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ DialogC6319 f17411;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ EditText f17412;

    public C6305(EditText editText, File file, DialogC6319 dialogC6319) {
        this.f17412 = editText;
        this.f17410 = file;
        this.f17411 = dialogC6319;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (!editable.toString().contains(AbstractC8405.m13973("喵呜呜呜呜喵喵呜")) || editable.toString().equals("")) {
            return;
        }
        EditText editText = this.f17412;
        String strReplace = editText.getText().toString().replace(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"), "");
        StringBuilder sb = new StringBuilder();
        File file = this.f17410;
        sb.append(file.getParentFile());
        sb.append(AbstractC8405.m13973("喵呜喵呜呜呜喵喵"));
        sb.append(strReplace);
        boolean zExists = new File(sb.toString()).exists();
        DialogC6319 dialogC6319 = this.f17411;
        if (zExists) {
            dialogC6319.dismiss();
            C8667.m14364(file.getAbsolutePath(), strReplace);
            return;
        }
        if (file.renameTo(new File(file.getParentFile() + AbstractC8405.m13973("喵呜喵呜呜呜喵喵") + strReplace))) {
            dialogC6319.dismiss();
        } else {
            editText.setText(strReplace);
            AbstractC6185.m11592(AbstractC8405.m13972(558));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
