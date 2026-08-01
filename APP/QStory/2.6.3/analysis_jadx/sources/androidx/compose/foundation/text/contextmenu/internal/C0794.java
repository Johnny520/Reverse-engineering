package androidx.compose.foundation.text.contextmenu.internal;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import android.util.Log;
import kotlin.C5176;
import p052.InterfaceC6543;
import p121.InterfaceC7392;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0794 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2272;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2273;

    public /* synthetic */ C0794(Object obj, int i) {
        this.f2273 = i;
        this.f2272 = obj;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() throws PendingIntent.CanceledException {
        int i = this.f2273;
        C5176 c5176 = C5176.f14739;
        Object obj = this.f2272;
        switch (i) {
            case 0:
                break;
            case 1:
                ((InterfaceC7392) obj).close();
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
        return c5176;
    }
}
