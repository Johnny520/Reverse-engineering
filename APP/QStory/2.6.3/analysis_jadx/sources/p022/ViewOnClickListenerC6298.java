package p022;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.RunnableC0062;
import lin.xposed.hook.view.main.MainSettingActivity;

/* JADX INFO: renamed from: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC6298 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Activity f17392;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17393;

    public /* synthetic */ ViewOnClickListenerC6298(Activity activity, int i) {
        this.f17393 = i;
        this.f17392 = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f17393) {
            case 0:
                new Handler(Looper.getMainLooper()).post(new RunnableC0062(this, 15));
                break;
            default:
                Activity activity = this.f17392;
                activity.startActivity(new Intent(activity, (Class<?>) MainSettingActivity.class));
                break;
        }
    }
}
