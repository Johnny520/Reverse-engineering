package p040;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import java.io.File;
import p010.AbstractC6154;
import p027.DialogC6300;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6432 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ File f17623;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ DialogC6300 f17624;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ EditText f17625;

    public C6432(EditText editText, File file, DialogC6300 dialogC6300) {
        this.f17625 = editText;
        this.f17623 = file;
        this.f17624 = dialogC6300;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (!editable.toString().contains(AbstractC3056.m6668(-3937560690605426087L)) || editable.toString().equals(AbstractC3056.m6668(-3937561979095614887L))) {
            return;
        }
        EditText editText = this.f17625;
        String strReplace = editText.getText().toString().replace(AbstractC3056.m6668(-3937560690605426087L), AbstractC3056.m6668(-3937561979095614887L));
        StringBuilder sb = new StringBuilder();
        File file = this.f17623;
        sb.append(file.getParentFile());
        sb.append(AbstractC3056.m6668(-3937561854541563303L));
        sb.append(strReplace);
        boolean zExists = new File(sb.toString()).exists();
        DialogC6300 dialogC6300 = this.f17624;
        if (zExists) {
            dialogC6300.dismiss();
            AbstractC3065.m6851(file.getAbsolutePath(), strReplace);
            return;
        }
        if (file.renameTo(new File(file.getParentFile() + AbstractC3056.m6668(-3937561854541563303L) + strReplace))) {
            dialogC6300.dismiss();
        } else {
            editText.setText(strReplace);
            AbstractC6154.m11561(AbstractC3056.m6668(-3937621460097697191L));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
