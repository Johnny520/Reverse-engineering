package androidx.compose.foundation.text.contextmenu.internal;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import android.util.Log;
import kotlin.C5175;
import p052.InterfaceC6542;
import p121.InterfaceC7391;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0794 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2271;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2272;

    public /* synthetic */ C0794(Object obj, int i) {
        this.f2272 = i;
        this.f2271 = obj;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() throws PendingIntent.CanceledException {
        int i = this.f2272;
        C5175 c5175 = C5175.f14739;
        Object obj = this.f2271;
        switch (i) {
            case 0:
                break;
            case 1:
                ((InterfaceC7391) obj).close();
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
        return c5175;
    }
}
