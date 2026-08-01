package p231;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ContentResolver f22236;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22237;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String[] f22235 = {"_data"};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String[] f22234 = {"_data"};

    public /* synthetic */ C8055(ContentResolver contentResolver, int i) {
        this.f22237 = i;
        this.f22236 = contentResolver;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Cursor m13517(Uri uri) {
        switch (this.f22237) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f22236.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f22235, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f22236.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f22234, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
