package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ue extends android.database.ContentObserver {
    public final /* synthetic */ defpackage.e50 a;

    public ue(defpackage.e50 r1) {
            r0 = this;
            r0.a = r1
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            r0.<init>(r1)
            return
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r2) {
            r1 = this;
            e50 r2 = r1.a
            boolean r0 = r2.b
            if (r0 == 0) goto L18
            android.database.Cursor r0 = r2.c
            if (r0 == 0) goto L18
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L18
            android.database.Cursor r0 = r2.c
            boolean r0 = r0.requery()
            r2.a = r0
        L18:
            return
    }
}
