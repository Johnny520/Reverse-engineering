package p028F;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import nuke.p209ui.HomeActivity;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: F.w */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MenuItemOnMenuItemClickListenerC0362w implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1134a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1135b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ MenuItemOnMenuItemClickListenerC0362w(int i5, Object obj) {
        this.f1134a = i5;
        this.f1135b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
        switch (this.f1134a) {
            case 0:
                PendingIntent actionIntent = ((RemoteAction) this.f1135b).getActionIntent();
                if (Build.VERSION.SDK_INT < 34) {
                    actionIntent.send();
                } else {
                    try {
                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e5) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e5);
                        return true;
                    }
                }
                break;
            default:
                Activity activity = (Activity) this.f1135b;
                AbstractC1665j.m2985e(menuItem, "<unused var>");
                activity.startActivity(new Intent(activity, (Class<?>) HomeActivity.class));
                break;
        }
        return true;
    }
}
