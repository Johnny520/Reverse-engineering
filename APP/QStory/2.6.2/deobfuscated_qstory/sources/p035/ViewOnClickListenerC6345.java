package p035;

import android.view.View;
import lin.xposed.hook.javaplugin.JavaPluginLoad;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC6345 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6349 f17472;

    public ViewOnClickListenerC6345(C6349 c6349) {
        this.f17472 = c6349;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JavaPluginLoad.showPluginDialog(this.f17472.f17475);
    }
}
