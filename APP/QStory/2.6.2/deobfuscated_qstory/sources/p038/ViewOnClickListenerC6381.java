package p038;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bumptech.glide.AbstractC3056;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6381 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f17521;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Activity f17522;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17523;

    public /* synthetic */ ViewOnClickListenerC6381(String str, Activity activity, int i) {
        this.f17523 = i;
        this.f17521 = str;
        this.f17522 = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17523;
        Activity activity = this.f17522;
        String str = this.f17521;
        switch (i) {
            case 0:
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqq://card/show_pslcard?src_type=internal&source=sharecard&version=1&uin=".concat(str))));
                break;
            default:
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqq://card/show_pslcard?src_type=internal&source=sharecard&version=1&uin=".concat(str))));
                break;
        }
    }
}
