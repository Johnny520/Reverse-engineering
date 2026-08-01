package androidx.room;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends android.app.Service {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.RemoteCallbackListC1041 f338;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.LinkedHashMap f339;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f340;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.BinderC1374 f341;

    public MultiInstanceInvalidationService() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.f339 = r0
            ᛶᛳᛶᛴ r0 = new ᛶᛳᛶᛴ
            r0.<init>(r1)
            r1.f338 = r0
            ᛷᲁᲀᛲ r0 = new ᛷᲁᲀᛲ
            r0.<init>(r1)
            r1.f341 = r0
            return
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent r1) {
            r0 = this;
            ᛷᲁᲀᛲ r0 = r0.f341
            return r0
    }
}
