package p009;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6181 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f17005;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17006;

    public /* synthetic */ ViewOnClickListenerC6181(EditText editText, int i) {
        this.f17006 = i;
        this.f17005 = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17006;
        EditText editText = this.f17005;
        switch (i) {
            case 0:
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                break;
            case 1:
                editText.getText().clear();
                break;
            default:
                editText.getText().clear();
                break;
        }
    }
}
