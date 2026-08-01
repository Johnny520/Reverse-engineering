package p036;

import android.content.Intent;
import android.view.View;
import top.suzhelan.qstory.ui.activity.SettingActivity;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC6366 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6367 f17521;

    public ViewOnClickListenerC6366(C6367 c6367) {
        this.f17521 = c6367;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C6367 c6367 = this.f17521;
        c6367.f17522.startActivity(new Intent(c6367.f17522, (Class<?>) SettingActivity.class));
    }
}
