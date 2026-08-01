package p039;

import android.view.View;
import android.widget.EditText;
import p010.AbstractC6185;
import p028.DialogC6319;
import p029.C6320;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC6404 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C6395 f17569;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ DialogC6319 f17570;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ EditText f17571;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ EditText f17572;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ EditText f17573;

    public ViewOnClickListenerC6404(C6395 c6395, EditText editText, EditText editText2, EditText editText3, DialogC6319 dialogC6319) {
        this.f17569 = c6395;
        this.f17573 = editText;
        this.f17571 = editText2;
        this.f17572 = editText3;
        this.f17570 = dialogC6319;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6320 c6320 = this.f17569.f17559;
        c6320.m11836(this.f17573.getText().toString(), AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵喵喵呜呜呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵呜喵呜喵喵"));
        c6320.m11836(this.f17571.getText().toString(), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵呜喵呜喵喵"));
        c6320.m11836(this.f17572.getText().toString(), AbstractC8405.m13972(243));
        c6320.mo11835();
        AbstractC6185.m11592(AbstractC8405.m13972(244));
        this.f17570.dismiss();
    }
}
