package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class ue extends ContentObserver {
    public final /* synthetic */ e50 a;

    public ue(e50 r1) {
        this.a = r1;
        super(new Handler());
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r2) {
        e50 r22 = this.a;
        if (r22.b == false) goto L10;
        Cursor r0 = r22.c;
        if (r0 != null) goto L7;
        return;
    L7:
        if (r0.isClosed() == true) goto L12;
        r22.a = r22.c.requery();
        return;
    L12:
        return;
    }
}
