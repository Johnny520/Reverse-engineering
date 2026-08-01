package androidx.compose.foundation.text.contextmenu.internal;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import kotlin.C5175;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6542;
import p121.C7386;
import p121.InterfaceC7391;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0793 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2268;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2269;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2270;

    public /* synthetic */ C0793(Object obj, int i, Object obj2) {
        this.f2270 = i;
        this.f2269 = obj;
        this.f2268 = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // p052.InterfaceC6542
    public final Object invoke() throws PendingIntent.CanceledException {
        int i = this.f2270;
        C5175 c5175 = C5175.f14739;
        Object obj = this.f2268;
        Object obj2 = this.f2269;
        switch (i) {
            case 0:
                ((Ref$ObjectRef) obj2).element = ((InterfaceC6542) obj).invoke();
                break;
            case 1:
                break;
            case 2:
                ((C7386) obj2).f20035.invoke((InterfaceC7391) obj);
                break;
            default:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT < 34) {
                    activity.send();
                } else {
                    try {
                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                    }
                }
                break;
        }
        return c5175;
    }
}
