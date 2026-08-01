package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p319.C8679;
import p319.RunnableC8680;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
                ((AbstractC0080) obj).mo314();
                break;
            default:
                C8679 c8679 = (C8679) obj;
                c8679.f24484.execute(new RunnableC8680(c8679, 1));
                C8679.m14400(context);
                break;
        }
    }
}
