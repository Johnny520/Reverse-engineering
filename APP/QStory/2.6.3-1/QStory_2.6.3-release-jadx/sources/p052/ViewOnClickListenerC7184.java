package p052;

import android.view.View;
import lin.xposed.hook.javaplugin.JavaPluginLoad;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC7184 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C7183 f17848;

    public ViewOnClickListenerC7184(C7183 c7183) {
        this.f17848 = c7183;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JavaPluginLoad.showOnlinePluginDialog(this.f17848.f17847);
    }
}
