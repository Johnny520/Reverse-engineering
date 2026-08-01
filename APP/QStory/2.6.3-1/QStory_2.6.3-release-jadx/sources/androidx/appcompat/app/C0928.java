package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p335.C9508;
import p335.RunnableC9509;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0928 extends BroadcastReceiver {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f579;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f580;

    public /* synthetic */ C0928(Object obj, int i) {
        this.f580 = i;
        this.f579 = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.f580;
        Object obj = this.f579;
        switch (i) {
            case 0:
                ((AbstractC0927) obj).mo874();
                break;
            default:
                C9508 c9508 = (C9508) obj;
                c9508.f24829.execute(new RunnableC9509(c9508, 1));
                C9508.m14959(context);
                break;
        }
    }
}
