package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l23 {

    /* JADX INFO: renamed from: c */
    public static final String[] f5893c = {"_data"};

    /* JADX INFO: renamed from: d */
    public static final String[] f5894d = {"_data"};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5895a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f5896b;

    public /* synthetic */ l23(ContentResolver contentResolver, int i) {
        this.f5895a = i;
        this.f5896b = contentResolver;
    }

    /* JADX INFO: renamed from: a */
    public final Cursor m2787a(Uri uri) {
        switch (this.f5895a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f5896b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f5893c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f5896b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f5894d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
