package p000;

/* JADX INFO: renamed from: qq */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0733qq extends android.database.ContentObserver {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9077;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f9078;

    public C0733qq(p000.m12 r2) {
            r1 = this;
            r0 = 0
            r1.f9077 = r0
            r1.f9078 = r2
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r1.<init>(r2)
            return
    }

    public C0733qq(p000.C0942wc r2, android.os.Handler r3) {
            r1 = this;
            r0 = 1
            r1.f9077 = r0
            r1.f9078 = r2
            r1.<init>(r3)
            return
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
            r1 = this;
            int r0 = r1.f9077
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.deliverSelfNotifications()
            return r1
        La:
            r1 = 1
            return r1
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean r2) {
            r1 = this;
            int r0 = r1.f9077
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.onChange(r2)
            return
        L9:
            java.lang.Object r1 = r1.f9078
            m12 r1 = (p000.m12) r1
            boolean r2 = r1.f9990
            if (r2 == 0) goto L23
            android.database.Cursor r2 = r1.f9991
            if (r2 == 0) goto L23
            boolean r2 = r2.isClosed()
            if (r2 != 0) goto L23
            android.database.Cursor r2 = r1.f9991
            boolean r2 = r2.requery()
            r1.f9989 = r2
        L23:
            return
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean r2, android.net.Uri r3) {
            r1 = this;
            int r0 = r1.f9077
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.onChange(r2, r3)
            return
        L9:
            java.lang.Object r1 = r1.f9078
            wc r1 = (p000.C0942wc) r1
            s62 r2 = p000.s62.f9751
            r1.mo3385(r2)
            return
    }
}
