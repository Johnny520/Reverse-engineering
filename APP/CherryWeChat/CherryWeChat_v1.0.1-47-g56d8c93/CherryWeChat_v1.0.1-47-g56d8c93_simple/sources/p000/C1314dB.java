package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: renamed from: dB */
/* JADX INFO: loaded from: classes.dex */
public final class C1314dB implements InterfaceC1357eB {

    /* JADX INFO: renamed from: c */
    public static final String[] f4770c = null;

    /* JADX INFO: renamed from: d */
    public static final String[] f4771d = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4772a;

    /* JADX INFO: renamed from: b */
    public final ContentResolver f4773b;

    static {
        f4770c = new String[]{"_data"};
        f4771d = new String[]{"_data"};
    }

    public /* synthetic */ C1314dB(ContentResolver r1, int r2) {
        this.f4772a = r2;
        this.f4773b = r1;
    }

    @Override // p000.InterfaceC1357eB
    /* JADX INFO: renamed from: a */
    public final Cursor mo2569a(Uri r7) {
        switch(this.f4772a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        String r72 = r7.getLastPathSegment();
        ContentResolver r0 = this.f4773b;
        String[] r2 = f4771d;
        return r0.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, r2, "kind = 1 AND video_id = ?", new String[]{r72}, null);
    L6:
        String r73 = r7.getLastPathSegment();
        ContentResolver r02 = this.f4773b;
        String[] r22 = f4770c;
        return r02.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, r22, "kind = 1 AND image_id = ?", new String[]{r73}, null);
    }
}
