package p036;

import android.view.View;
import lin.xposed.hook.javaplugin.JavaPluginLoad;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC6363 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6362 f17518;

    public ViewOnClickListenerC6363(C6362 c6362) {
        this.f17518 = c6362;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JavaPluginLoad.showPluginDialog(this.f17518.f17517);
    }
}
