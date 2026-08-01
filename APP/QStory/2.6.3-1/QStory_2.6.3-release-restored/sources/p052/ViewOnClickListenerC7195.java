package p052;

import android.content.Intent;
import android.view.View;
import top.suzhelan.qstory.p015ui.activity.SettingActivity;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC7195 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C7196 f17866;

    public ViewOnClickListenerC7195(C7196 c7196) {
        this.f17866 = c7196;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C7196 c7196 = this.f17866;
        c7196.f17867.startActivity(new Intent(c7196.f17867, (Class<?>) SettingActivity.class));
    }
}
