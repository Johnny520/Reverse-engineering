package defpackage;

/* JADX INFO: renamed from: ᲈᛴᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2220 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final java.lang.String[] f9473 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.lang.String[] f9474 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f9475;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.content.ContentResolver f9476;

    static {
            java.lang.String r0 = "_data"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            defpackage.C2220.f9474 = r0
            java.lang.String r0 = "_data"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            defpackage.C2220.f9473 = r0
            return
    }

    public /* synthetic */ C2220(android.content.ContentResolver r1, int r2) {
            r0 = this;
            r0.f9475 = r2
            r0.f9476 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.database.Cursor m3611(android.net.Uri r7) {
            r6 = this;
            int r0 = r6.f9475
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.String r7 = r7.getLastPathSegment()
            android.net.Uri r1 = android.provider.MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI
            java.lang.String[] r4 = new java.lang.String[]{r7}
            r5 = 0
            android.content.ContentResolver r0 = r6.f9476
            java.lang.String[] r2 = defpackage.C2220.f9473
            java.lang.String r3 = "kind = 1 AND video_id = ?"
            android.database.Cursor r6 = r0.query(r1, r2, r3, r4, r5)
            return r6
        L1b:
            java.lang.String r7 = r7.getLastPathSegment()
            android.net.Uri r1 = android.provider.MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI
            java.lang.String[] r4 = new java.lang.String[]{r7}
            r5 = 0
            android.content.ContentResolver r0 = r6.f9476
            java.lang.String[] r2 = defpackage.C2220.f9474
            java.lang.String r3 = "kind = 1 AND image_id = ?"
            android.database.Cursor r6 = r0.query(r1, r2, r3, r4, r5)
            return r6
    }
}
