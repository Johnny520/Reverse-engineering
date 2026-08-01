package p035;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.RunnableC0062;
import lin.xposed.hook.view.main.MainSettingActivity;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC6337 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Activity f17455;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17456;

    public /* synthetic */ ViewOnClickListenerC6337(Activity activity, int i) {
        this.f17456 = i;
        this.f17455 = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f17456) {
            case 0:
                Activity activity = this.f17455;
                activity.startActivity(new Intent(activity, (Class<?>) MainSettingActivity.class));
                break;
            default:
                new Handler(Looper.getMainLooper()).post(new RunnableC0062(this, 16));
                break;
        }
    }
}
