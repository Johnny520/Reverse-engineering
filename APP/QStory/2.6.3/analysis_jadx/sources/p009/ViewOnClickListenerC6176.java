package p009;

import android.view.View;
import android.widget.EditText;
import p316.C8667;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC6176 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f16985;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ String f16986;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16987;

    public /* synthetic */ ViewOnClickListenerC6176(EditText editText, String str, int i) {
        this.f16987 = i;
        this.f16985 = editText;
        this.f16986 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f16987;
        String str = this.f16986;
        EditText editText = this.f16985;
        switch (i) {
            case 0:
                editText.setText(str);
                editText.setSelection(str.length());
                break;
            default:
                C8667.m14362(str, editText.getText().toString());
                break;
        }
    }
}
