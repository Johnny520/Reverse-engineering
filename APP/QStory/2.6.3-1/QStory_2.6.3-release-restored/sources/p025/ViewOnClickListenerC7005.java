package p025;

import android.view.View;
import android.widget.EditText;
import p332.C9496;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC7005 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f17330;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ String f17331;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17332;

    public /* synthetic */ ViewOnClickListenerC7005(EditText editText, String str, int i) {
        this.f17332 = i;
        this.f17330 = editText;
        this.f17331 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17332;
        String str = this.f17331;
        EditText editText = this.f17330;
        switch (i) {
            case 0:
                editText.setText(str);
                editText.setSelection(str.length());
                break;
            default:
                C9496.m14921(str, editText.getText().toString());
                break;
        }
    }
}
