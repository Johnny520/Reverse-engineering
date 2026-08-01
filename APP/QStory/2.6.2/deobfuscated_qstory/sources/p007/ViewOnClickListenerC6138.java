package p007;

import android.view.View;
import android.widget.EditText;
import com.bumptech.glide.AbstractC3065;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC6138 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f16729;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ String f16730;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16731;

    public /* synthetic */ ViewOnClickListenerC6138(EditText editText, String str, int i) {
        this.f16731 = i;
        this.f16729 = editText;
        this.f16730 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f16731;
        String str = this.f16730;
        EditText editText = this.f16729;
        switch (i) {
            case 0:
                editText.setText(str);
                editText.setSelection(str.length());
                break;
            default:
                AbstractC3065.m6853(str, editText.getText().toString());
                break;
        }
    }
}
