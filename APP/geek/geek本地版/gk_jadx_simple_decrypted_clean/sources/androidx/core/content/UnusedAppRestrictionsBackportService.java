package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.t80;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {
    public final t80 a;

    public UnusedAppRestrictionsBackportService() {
        this.a = new t80(this);
    }

    public abstract void a();

    @Override // android.app.Service
    public final IBinder onBind(Intent r1) {
        return this.a;
    }
}
