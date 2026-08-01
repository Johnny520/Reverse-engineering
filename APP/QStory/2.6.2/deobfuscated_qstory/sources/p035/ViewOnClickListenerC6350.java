package p035;

import android.content.Intent;
import android.view.View;
import top.suzhelan.qstory.ui.activity.SettingActivity;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC6350 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6347 f17476;

    public ViewOnClickListenerC6350(C6347 c6347) {
        this.f17476 = c6347;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6347 c6347 = this.f17476;
        c6347.f17474.startActivity(new Intent(c6347.f17474, (Class<?>) SettingActivity.class));
    }
}
