package p055;

import android.view.View;
import android.widget.EditText;
import p026.AbstractC7014;
import p044.DialogC7148;
import p045.C7149;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC7233 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C7224 f17914;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ DialogC7148 f17915;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f17916;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ EditText f17917;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ EditText f17918;

    public ViewOnClickListenerC7233(C7224 c7224, EditText editText, EditText editText2, EditText editText3, DialogC7148 dialogC7148) {
        this.f17914 = c7224;
        this.f17918 = editText;
        this.f17916 = editText2;
        this.f17917 = editText3;
        this.f17915 = dialogC7148;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7149 c7149 = this.f17914.f17904;
        c7149.m12395(this.f17918.getText().toString(), "prefix");
        c7149.m12395(this.f17916.getText().toString(), "suffix");
        c7149.m12395(this.f17917.getText().toString(), "time_format");
        c7149.mo12394();
        AbstractC7014.m12151("保存成功");
        this.f17915.dismiss();
    }
}
