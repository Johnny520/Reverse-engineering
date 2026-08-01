package p247;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8885 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ContentResolver f22579;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22580;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String[] f22578 = {"_data"};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String[] f22577 = {"_data"};

    public /* synthetic */ C8885(ContentResolver contentResolver, int i) {
        this.f22580 = i;
        this.f22579 = contentResolver;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Cursor m14105(Uri uri) {
        switch (this.f22580) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f22579.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f22578, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f22579.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f22577, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
