package p038;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.io.File;
import p026.AbstractC7014;
import p044.DialogC7148;
import p332.C9496;

/* JADX INFO: renamed from: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7134 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ File f17755;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ DialogC7148 f17756;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ EditText f17757;

    public C7134(EditText editText, File file, DialogC7148 dialogC7148) {
        this.f17757 = editText;
        this.f17755 = file;
        this.f17756 = dialogC7148;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (!editable.toString().contains("\n") || editable.toString().equals("")) {
            return;
        }
        EditText editText = this.f17757;
        String strReplace = editText.getText().toString().replace("\n", "");
        StringBuilder sb = new StringBuilder();
        File file = this.f17755;
        sb.append(file.getParentFile());
        sb.append("/");
        sb.append(strReplace);
        boolean zExists = new File(sb.toString()).exists();
        DialogC7148 dialogC7148 = this.f17756;
        if (zExists) {
            dialogC7148.dismiss();
            C9496.m14923(file.getAbsolutePath(), strReplace);
            return;
        }
        if (file.renameTo(new File(file.getParentFile() + "/" + strReplace))) {
            dialogC7148.dismiss();
        } else {
            editText.setText(strReplace);
            AbstractC7014.m12151("重命名失败 可能已经有重名文件或格式错误");
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
