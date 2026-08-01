package p083Q1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: Q1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1172a implements InterfaceC1174c {

    /* JADX INFO: renamed from: c */
    public static final String[] f3852c = {"_data"};

    /* JADX INFO: renamed from: d */
    public static final String[] f3853d = {"_data"};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3854a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f3855b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1172a(ContentResolver contentResolver, int i5) {
        this.f3854a = i5;
        this.f3855b = contentResolver;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p083Q1.InterfaceC1174c
    /* JADX INFO: renamed from: a */
    public final Cursor mo2217a(Uri uri) {
        switch (this.f3854a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f3855b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f3852c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f3855b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f3853d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
