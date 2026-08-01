package p035;

import android.view.View;
import lin.xposed.hook.javaplugin.JavaPluginLoad;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC6336 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6346 f17454;

    public ViewOnClickListenerC6336(C6346 c6346) {
        this.f17454 = c6346;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JavaPluginLoad.showOnlinePluginDialog(this.f17454.f17473);
    }
}
