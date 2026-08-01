package defpackage;

/* JADX INFO: renamed from: ᛵᛳᛸᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0853 extends android.database.ContentObserver {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.ViewOnClickListenerC2050 f3892;

    public C0853(defpackage.ViewOnClickListenerC2050 r1) {
            r0 = this;
            r0.f3892 = r1
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            r0.<init>(r1)
            return
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r1) {
            r0 = this;
            ᲇᛵᛶᛸ r0 = r0.f3892
            boolean r1 = r0.f1071
            if (r1 == 0) goto L18
            android.database.Cursor r1 = r0.f1070
            if (r1 == 0) goto L18
            boolean r1 = r1.isClosed()
            if (r1 != 0) goto L18
            android.database.Cursor r1 = r0.f1070
            boolean r1 = r1.requery()
            r0.f1072 = r1
        L18:
            return
    }
}
