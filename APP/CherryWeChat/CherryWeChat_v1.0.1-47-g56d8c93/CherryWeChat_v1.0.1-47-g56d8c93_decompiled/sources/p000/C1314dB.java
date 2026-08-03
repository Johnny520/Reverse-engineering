package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: dB */
/* JADX INFO: loaded from: classes.dex */
public final class C1314dB implements InterfaceC1357eB {

    /* JADX INFO: renamed from: c */
    public static final String[] f4770c = {"_data"};

    /* JADX INFO: renamed from: d */
    public static final String[] f4771d = {"_data"};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4772a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f4773b;

    public /* synthetic */ C1314dB(ContentResolver contentResolver, int i) {
        this.f4772a = i;
        this.f4773b = contentResolver;
    }

    @Override // p000.InterfaceC1357eB
    /* JADX INFO: renamed from: a */
    public final Cursor mo2569a(Uri uri) {
        switch (this.f4772a) {
            case 0:
                String lastPathSegment = uri.getLastPathSegment();
                return this.f4773b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f4770c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
            default:
                String lastPathSegment2 = uri.getLastPathSegment();
                return this.f4773b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f4771d, "kind = 1 AND video_id = ?", new String[]{lastPathSegment2}, null);
        }
    }
}
