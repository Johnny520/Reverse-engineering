package yyds;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: yyds.ᛸᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1889 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final String[] f9527 = {"_data"};

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final String[] f9528 = {"_data"};

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f9529;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ContentResolver f9530;

    public /* synthetic */ C1889(ContentResolver contentResolver, int i) {
        this.f9529 = i;
        this.f9530 = contentResolver;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Cursor m3676(Uri uri) {
        switch (this.f9529) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f9530.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f9527, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f9530.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f9528, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
