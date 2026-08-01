package defpackage;

/* JADX INFO: renamed from: ᛴᲁᲁᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0771 implements defpackage.InterfaceC0204 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final android.content.ContentResolver f3601;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.net.Uri f3602;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean f3603;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.lang.Object f3604;

    public AbstractC0771(android.content.ContentResolver r1, android.net.Uri r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f3601 = r1
            r0.f3602 = r2
            r0.f3603 = r3
            return
    }

    @Override // defpackage.InterfaceC0204
    public final void cancel() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public abstract java.lang.Object mo645(android.content.ContentResolver r1, android.net.Uri r2);

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo753(defpackage.EnumC1307 r2, defpackage.InterfaceC0784 r3) {
            r1 = this;
            android.net.Uri r2 = r1.f3602     // Catch: java.io.FileNotFoundException -> Le
            android.content.ContentResolver r0 = r1.f3601     // Catch: java.io.FileNotFoundException -> Le
            java.lang.Object r2 = r1.mo645(r0, r2)     // Catch: java.io.FileNotFoundException -> Le
            r1.f3604 = r2     // Catch: java.io.FileNotFoundException -> Le
            r3.mo1362(r2)     // Catch: java.io.FileNotFoundException -> Le
            return
        Le:
            r1 = move-exception
            r2 = 3
            java.lang.String r0 = "LocalUriFetcher"
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L1d
            java.lang.String r2 = "Failed to open Uri"
            android.util.Log.d(r0, r2, r1)
        L1d:
            r3.mo1360(r1)
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo754() {
            r1 = this;
            java.lang.Object r0 = r1.f3604
            if (r0 == 0) goto L7
            r1.mo647(r0)     // Catch: java.io.IOException -> L7
        L7:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public abstract void mo647(java.lang.Object r1);

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final int mo755() {
            r0 = this;
            r0 = 1
            return r0
    }
}
