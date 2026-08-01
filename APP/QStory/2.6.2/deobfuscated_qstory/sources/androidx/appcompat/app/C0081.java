package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p320.C8712;
import p320.RunnableC8713;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0081 extends BroadcastReceiver {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f234;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f235;

    public /* synthetic */ C0081(Object obj, int i) {
        this.f235 = i;
        this.f234 = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.f235;
        Object obj = this.f234;
        switch (i) {
            case 0:
                ((AbstractC0080) obj).mo313();
                break;
            default:
                C8712 c8712 = (C8712) obj;
                c8712.f24574.execute(new RunnableC8713(c8712, 1));
                C8712.m14389(context);
                break;
        }
    }
}
