package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class kq extends vi {
    public kq() {
    }

    @Override // defpackage.vi, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity r1, Bundle r2) {
        ip.o("activity", r1);
        int r22 = p00.b;
        n00.b(r1);
    }
}
