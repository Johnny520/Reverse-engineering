package androidx.compose.foundation.text.contextmenu.internal;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import android.util.Log;
import kotlin.C6008;
import p068.InterfaceC7372;
import p137.InterfaceC8221;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1634 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2617;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2618;

    public /* synthetic */ C1634(Object obj, int i) {
        this.f2618 = i;
        this.f2617 = obj;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() throws PendingIntent.CanceledException {
        int i = this.f2618;
        C6008 c6008 = C6008.f15084;
        Object obj = this.f2617;
        switch (i) {
            case 0:
                break;
            case 1:
                ((InterfaceC8221) obj).close();
                break;
            default:
                PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                if (Build.VERSION.SDK_INT < 34) {
                    actionIntent.send();
                } else {
                    try {
                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                    }
                }
                break;
        }
        return c6008;
    }
}
