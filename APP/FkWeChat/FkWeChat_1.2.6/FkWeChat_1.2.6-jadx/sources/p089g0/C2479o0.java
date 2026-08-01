package p089g0;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassification;

/* JADX INFO: renamed from: g0.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2479o0 {

    /* JADX INFO: renamed from: a */
    public static final C2479o0 f6703a = new C2479o0();

    /* JADX INFO: renamed from: a */
    public final void m8935a(Context context, TextClassification textClassification) throws PendingIntent.CanceledException {
        String text = textClassification.getText();
        m8936b(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
    }

    /* JADX INFO: renamed from: b */
    public final void m8936b(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        if (Build.VERSION.SDK_INT >= 34) {
            C2477n0.f6701a.m8934a(pendingIntent);
        } else {
            pendingIntent.send();
        }
    }
}
