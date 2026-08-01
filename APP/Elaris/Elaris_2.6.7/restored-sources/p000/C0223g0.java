package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;

/* JADX INFO: renamed from: g0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0223g0 extends BroadcastReceiver {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "com.mr.elaris.action.ANTI_RECALL_STATUS_CHANGED".equals(intent.getAction()) && AbstractC0429r0.f774c && HookEntry.runtimeBool(Prefs.KEY_MESSAGE_RECALL_GUARD)) {
            AbstractC0429r0.m836p();
            AbstractC0429r0.m841u();
        }
    }
}
