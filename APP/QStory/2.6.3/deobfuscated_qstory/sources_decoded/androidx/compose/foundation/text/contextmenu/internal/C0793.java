package androidx.compose.foundation.text.contextmenu.internal;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import kotlin.C5176;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6543;
import p121.C7387;
import p121.InterfaceC7392;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0793 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f2269;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2270;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2271;

    public /* synthetic */ C0793(Object obj, int i, Object obj2) {
        this.f2271 = i;
        this.f2270 = obj;
        this.f2269 = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // p052.InterfaceC6543
    public final Object invoke() throws PendingIntent.CanceledException {
        int i = this.f2271;
        C5176 c5176 = C5176.f14739;
        Object obj = this.f2269;
        Object obj2 = this.f2270;
        switch (i) {
            case 0:
                ((Ref$ObjectRef) obj2).element = ((InterfaceC6543) obj).invoke();
                break;
            case 1:
                break;
            case 2:
                ((C7387) obj2).f20030.invoke((InterfaceC7392) obj);
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
        return c5176;
    }
}
