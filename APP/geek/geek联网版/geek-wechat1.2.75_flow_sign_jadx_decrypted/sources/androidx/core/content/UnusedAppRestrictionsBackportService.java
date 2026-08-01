package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p000.y80;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* JADX INFO: renamed from: a */
    public final y80 f415a = new y80(this);

    /* JADX INFO: renamed from: a */
    public abstract void m217a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f415a;
    }
}
