package p001;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import p001.AbstractC0469y8;
import p001.C0481z7;

/* JADX INFO: renamed from: ۟.s5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0388s5 extends C0370r0 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String[] f1079 = {"orientation"};

    public C0388s5(Context context) {
        super(context);
    }

    @Override // p001.C0370r0, p001.AbstractC0469y8
    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean mo831(C0443w8 c0443w8) {
        Uri uri = c0443w8.f1842;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c A[PHI: r2
  0x003c: PHI (r2v2 android.database.Cursor) = (r2v1 android.database.Cursor), (r2v12 android.database.Cursor) binds: [B:19:0x003a, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    @Override // p001.C0370r0, p001.AbstractC0469y8
    /* JADX INFO: renamed from: ۥ۟ۡ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0469y8.a mo1030(C0443w8 c0443w8) throws Throwable {
        Cursor cursorQuery;
        int i;
        Bitmap bitmap;
        int i2;
        int i3;
        Bitmap thumbnail;
        int iM1035;
        long j;
        C0481z7.e eVar = C0481z7.e.DISK;
        ContentResolver contentResolver = this.f1052.getContentResolver();
        Cursor cursor = null;
        try {
            cursorQuery = contentResolver.query(c0443w8.f1842, f1079, null, null, null);
        } catch (RuntimeException unused) {
            cursorQuery = null;
        } catch (Throwable th) {
            th = th;
        }
        if (cursorQuery != null) {
            try {
            } catch (RuntimeException unused2) {
                if (cursorQuery != null) {
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            if (cursorQuery.moveToFirst()) {
                int i4 = cursorQuery.getInt(0);
                cursorQuery.close();
                i = i4;
                String type = contentResolver.getType(c0443w8.f1842);
                boolean z = type != null && type.startsWith("video/");
                if (c0443w8.m957()) {
                    int i5 = c0443w8.f1845;
                    int i6 = c0443w8.f1846;
                    if (i5 > 96 || i6 > 96) {
                        i2 = 2;
                        if (i5 > 512 || i6 > 384) {
                            i3 = 3;
                        }
                        if (z && i3 == 3) {
                            return new AbstractC0469y8.a(null, m1194(c0443w8), eVar, i);
                        }
                        long id = ContentUris.parseId(c0443w8.f1842);
                        BitmapFactory.Options optionsM1276 = AbstractC0469y8.m1276(c0443w8);
                        optionsM1276.inJustDecodeBounds = true;
                        bitmap = null;
                        AbstractC0469y8.m968(c0443w8.f1845, c0443w8.f1846, C0167c4.m1037(i3), C0167c4.m1036(i3), optionsM1276, c0443w8);
                        if (z) {
                            thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id, C0167c4.m1035(i3), optionsM1276);
                        } else {
                            if (i3 == 3) {
                                j = id;
                                iM1035 = 1;
                            } else {
                                iM1035 = C0167c4.m1035(i3);
                                j = id;
                            }
                            thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, j, iM1035, optionsM1276);
                        }
                        if (thumbnail != null) {
                            return new AbstractC0469y8.a(thumbnail, null, eVar, i);
                        }
                    } else {
                        i2 = 1;
                    }
                    i3 = i2;
                    if (z) {
                    }
                    long id2 = ContentUris.parseId(c0443w8.f1842);
                    BitmapFactory.Options optionsM12762 = AbstractC0469y8.m1276(c0443w8);
                    optionsM12762.inJustDecodeBounds = true;
                    bitmap = null;
                    AbstractC0469y8.m968(c0443w8.f1845, c0443w8.f1846, C0167c4.m1037(i3), C0167c4.m1036(i3), optionsM12762, c0443w8);
                    if (z) {
                    }
                    if (thumbnail != null) {
                    }
                } else {
                    bitmap = null;
                }
                return new AbstractC0469y8.a(bitmap, m1194(c0443w8), eVar, i);
            }
            i = 0;
            String type2 = contentResolver.getType(c0443w8.f1842);
            if (type2 != null) {
            }
            if (c0443w8.m957()) {
            }
            return new AbstractC0469y8.a(bitmap, m1194(c0443w8), eVar, i);
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        i = 0;
        String type22 = contentResolver.getType(c0443w8.f1842);
        if (type22 != null) {
        }
        if (c0443w8.m957()) {
        }
        return new AbstractC0469y8.a(bitmap, m1194(c0443w8), eVar, i);
    }
}
