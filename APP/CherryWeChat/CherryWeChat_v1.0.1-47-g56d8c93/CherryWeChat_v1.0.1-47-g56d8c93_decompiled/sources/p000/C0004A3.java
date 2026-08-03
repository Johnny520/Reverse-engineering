package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: A3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0004A3 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0047B3 f1a;

    public C0004A3(AbstractC0047B3 abstractC0047B3) {
        this.f1a = abstractC0047B3;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f1a.mo86m();
    }
}
