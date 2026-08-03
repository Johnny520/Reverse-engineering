package p001;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.p000os.FileUtils;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ۟.w2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0437w2 {
    /* JADX INFO: renamed from: ۥ */
    public static String m954(Activity activity, Uri uri, String str, String[] strArr) throws Throwable {
        Throwable th;
        String strM915 = C0341oa.m915(new byte[]{39, 65, 41, -45, 121}, new byte[]{120, 37, 72, -89, 24, 60});
        Cursor cursor = null;
        try {
            Cursor cursorQuery = activity.getContentResolver().query(uri, new String[]{strM915}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(strM915));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(6:91|(6:124|92|(1:94)(1:126)|115|100|101)|95|115|100|101) */
    /* JADX INFO: renamed from: ۥ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m955(Activity activity, Uri uri) {
        String path;
        Cursor cursorQuery;
        int columnIndex;
        InputStream inputStreamOpenInputStream;
        File file;
        FileOutputStream fileOutputStream;
        File file2 = null;
        Uri uri2 = null;
        file2 = null;
        file2 = null;
        if (uri != null) {
            int i = Build.VERSION.SDK_INT;
            if (i < 29 && DocumentsContract.isDocumentUri(activity, uri)) {
                if (C0341oa.m915(new byte[]{-1, -41, -95, -110, -20, -124, -8, -54, -93, -43, -23, -60, -7, -64, -72, -39, -1, -124, -3, -44, -65, -56, -30, -104, -3, -33, -87, -110, -23, -123, -1, -51, -95, -39, -29, -98, -17}, new byte[]{-100, -72, -52, -68, -115, -22}).equals(uri.getAuthority())) {
                    String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(C0341oa.m915(new byte[]{-48}, new byte[]{-22, 20, 9, 15, -89, 77}));
                    if (C0341oa.m915(new byte[]{39, -25, 106, 17, 24, -24, 46}, new byte[]{87, -107, 3, 124, 121, -102}).equalsIgnoreCase(strArrSplit[0])) {
                        return Environment.getExternalStorageDirectory() + C0341oa.m915(new byte[]{59}, new byte[]{20, -122, 12, 55, -40, -14}) + strArrSplit[1];
                    }
                } else {
                    if (C0341oa.m915(new byte[]{-19, 107, 112, 20, -97, 67, -22, 118, 114, 83, -102, 3, -2, 118, 114, 76, -105, 73, -21, 118, 110, 20, -102, 66, -7, 106, 113, 85, -97, 73, -3, 42, 121, 85, -99, 88, -29, 97, 115, 78, -115}, new byte[]{-114, 4, 29, 58, -2, 45}).equals(uri.getAuthority())) {
                        return m954(activity, ContentUris.withAppendedId(Uri.parse(C0341oa.m915(new byte[]{-109, -113, -110, 61, 124, -95, -124, -38, -45, 102, 125, -96, -121, -114, -112, 38, 120, -85, -125, -49, -116, 60, 123, -93, -103, -125, -93, 45, 118, -72, -98, -116, -109, 40, 125, -68}, new byte[]{-16, -32, -4, 73, 25, -49})), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                    }
                    if (C0341oa.m915(new byte[]{93, -48, -23, 5, -37, -8, 90, -51, -21, 66, -34, -72, 78, -51, -21, 93, -45, -14, 91, -51, -9, 5, -41, -13, 90, -42, -27, 5, -34, -7, 93, -54, -23, 78, -44, -30, 77}, new byte[]{62, -65, -124, 43, -70, -106}).equals(uri.getAuthority())) {
                        String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(C0341oa.m915(new byte[]{-121}, new byte[]{-67, 125, -115, -56, -28, 69}));
                        String str = strArrSplit2[0];
                        if (C0341oa.m915(new byte[]{-19, 69, 72, 46, -37}, new byte[]{-124, 40, 41, 73, -66, -11}).equals(str)) {
                            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        } else if (C0341oa.m915(new byte[]{-122, 45, 120, 53, -95}, new byte[]{-16, 68, 28, 80, -50, 116}).equals(str)) {
                            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        } else if (C0341oa.m915(new byte[]{-73, 21, -34, -111, -52}, new byte[]{-42, 96, -70, -8, -93, 107}).equals(str)) {
                            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        }
                        return m954(activity, uri2, C0341oa.m915(new byte[]{-37, 57, 85, -5, -33}, new byte[]{-124, 80, 49, -58, -32, 75}), new String[]{strArrSplit2[1]});
                    }
                }
            }
            if (i >= 29) {
                if (uri.getScheme().equals(C0341oa.m915(new byte[]{5, -118, -59, -122}, new byte[]{99, -29, -87, -29, -114, -106}))) {
                    file2 = new File(uri.getPath());
                } else if (uri.getScheme().equals(C0341oa.m915(new byte[]{88, -70, 56, 74, -30, 14, 79}, new byte[]{59, -43, 86, 62, -121, 96}))) {
                    ContentResolver contentResolver = activity.getContentResolver();
                    Cursor cursorQuery2 = contentResolver.query(uri, null, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        String string = cursorQuery2.getString(cursorQuery2.getColumnIndex(C0341oa.m915(new byte[]{114, -15, 48, -31, -117, -97, 76, -20, 6, -4, -102, -98, 72}, new byte[]{45, -107, 89, -110, -5, -13})));
                        try {
                            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                            File file3 = new File(activity.getExternalCacheDir().getAbsolutePath() + C0341oa.m915(new byte[]{0}, new byte[]{47, -100, -76, -22, -60, 72}) + System.currentTimeMillis());
                            if (!file3.exists()) {
                                file3.mkdir();
                            }
                            file = new File(file3.getPath(), string);
                            fileOutputStream = new FileOutputStream(file);
                            FileUtils.copy(inputStreamOpenInputStream, fileOutputStream);
                        } catch (IOException e) {
                            e = e;
                        }
                        try {
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            file2 = file;
                        } catch (IOException e2) {
                            e = e2;
                            file2 = file;
                            e.printStackTrace();
                        }
                    }
                }
                return file2.getAbsolutePath();
            }
            if (C0341oa.m915(new byte[]{-9, -93, 12, 79, -63, 3, -32}, new byte[]{-108, -52, 98, 59, -92, 109}).equalsIgnoreCase(uri.getScheme())) {
                if (C0341oa.m915(new byte[]{93, 42, 82, 46, 112, -111, 81, 34, 83, 101, 57, -97, 80, 33, 77, 111, 126, -102, 16, 36, 79, 112, 100, -48, 78, 45, 80, 116, 120, -115, 16, 38, 80, 110, 99, -101, 80, 49}, new byte[]{62, 69, 63, 0, 23, -2}).equals(uri.getAuthority())) {
                    return uri.getLastPathSegment();
                }
                String scheme = uri.getScheme();
                if (scheme == null || C0341oa.m915(new byte[]{75, 26, -85, 95}, new byte[]{45, 115, -57, 58, 57, -36}).equals(scheme)) {
                    path = uri.getPath();
                } else if (!C0341oa.m915(new byte[]{-104, 41, 122, 127, 64, -10, -113}, new byte[]{-5, 70, 20, 11, 37, -104}).equals(scheme) || (cursorQuery = activity.getContentResolver().query(uri, new String[]{C0341oa.m915(new byte[]{-25, -25, -61, -43, -35}, new byte[]{-72, -125, -94, -95, -68, 19})}, null, null, null)) == null) {
                    path = null;
                } else {
                    String string2 = (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex(C0341oa.m915(new byte[]{82, -58, -85, -53, -20}, new byte[]{13, -94, -54, -65, -115, -69}))) <= -1) ? null : cursorQuery.getString(columnIndex);
                    cursorQuery.close();
                    path = string2;
                }
                if (!TextUtils.isEmpty(path)) {
                    return path;
                }
                File filesDir = activity.getApplicationContext().getFilesDir();
                String path2 = uri.getPath();
                int iLastIndexOf = path2.lastIndexOf(47);
                String strSubstring = iLastIndexOf != -1 ? path2.substring(iLastIndexOf + 1) : null;
                if (TextUtils.isEmpty(strSubstring)) {
                    return null;
                }
                File file4 = new File(filesDir + File.separator + strSubstring);
                try {
                    InputStream inputStreamOpenInputStream2 = activity.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream2 != null) {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file4);
                        byte[] bArr = new byte[2048];
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamOpenInputStream2, 2048);
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2, 2048);
                        while (true) {
                            try {
                                int i2 = bufferedInputStream.read(bArr, 0, 2048);
                                if (i2 == -1) {
                                    break;
                                }
                                bufferedOutputStream.write(bArr, 0, i2);
                            } catch (Exception unused) {
                            } catch (Throwable th) {
                                try {
                                    bufferedOutputStream.close();
                                    bufferedInputStream.close();
                                } catch (Exception unused2) {
                                }
                                throw th;
                            }
                            bufferedOutputStream.close();
                            bufferedInputStream.close();
                            inputStreamOpenInputStream2.close();
                            fileOutputStream2.close();
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        bufferedInputStream.close();
                        inputStreamOpenInputStream2.close();
                        fileOutputStream2.close();
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                return file4.getAbsolutePath();
            }
            if (C0341oa.m915(new byte[]{-17, 105, -20, 66}, new byte[]{-119, 0, -128, 39, -125, 61}).equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }
}
