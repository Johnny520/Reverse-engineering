package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends BroadcastReceiver {
    public final /* synthetic */ o3 a;

    public n3(o3 r1) {
        this.a = r1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context r1, Intent r2) {
        this.a.h();
    }
}
