package p007;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6139 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f16732;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16733;

    public /* synthetic */ ViewOnClickListenerC6139(EditText editText, int i) {
        this.f16733 = i;
        this.f16732 = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f16733;
        EditText editText = this.f16732;
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
