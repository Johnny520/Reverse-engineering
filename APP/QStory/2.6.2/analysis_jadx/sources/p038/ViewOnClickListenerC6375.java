package p038;

import android.view.View;
import android.widget.EditText;
import com.bumptech.glide.AbstractC3056;
import p010.AbstractC6154;
import p027.DialogC6300;
import p028.C6301;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC6375 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C6376 f17507;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ DialogC6300 f17508;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f17509;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ EditText f17510;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ EditText f17511;

    public ViewOnClickListenerC6375(C6376 c6376, EditText editText, EditText editText2, EditText editText3, DialogC6300 dialogC6300) {
        this.f17507 = c6376;
        this.f17511 = editText;
        this.f17509 = editText2;
        this.f17510 = editText3;
        this.f17508 = dialogC6300;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6301 c6301 = this.f17507.f17513;
        c6301.m11808(this.f17511.getText().toString(), AbstractC3056.m6668(-3937585468271756711L));
        c6301.m11808(this.f17509.getText().toString(), AbstractC3056.m6668(-3937585360897574311L));
        c6301.m11808(this.f17510.getText().toString(), AbstractC3056.m6668(-3937585390962345383L));
        c6301.mo11807();
        AbstractC6154.m11561(AbstractC3056.m6668(-3937585270703261095L));
        this.f17508.dismiss();
    }
}
