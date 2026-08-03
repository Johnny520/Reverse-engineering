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
        String strM915 = "_data";
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
                if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                    String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                    if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                        return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                    }
                } else {
                    if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                        return m954(activity, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                    }
                    if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                        String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                        String str = strArrSplit2[0];
                        if ("image".equals(str)) {
                            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        } else if ("video".equals(str)) {
                            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        } else if ("audio".equals(str)) {
                            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        }
                        return m954(activity, uri2, "_id=?", new String[]{strArrSplit2[1]});
                    }
                }
            }
            if (i >= 29) {
                if (uri.getScheme().equals("file")) {
                    file2 = new File(uri.getPath());
                } else if (uri.getScheme().equals("content")) {
                    ContentResolver contentResolver = activity.getContentResolver();
                    Cursor cursorQuery2 = contentResolver.query(uri, null, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        String string = cursorQuery2.getString(cursorQuery2.getColumnIndex("_display_name"));
                        try {
                            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                            File file3 = new File(activity.getExternalCacheDir().getAbsolutePath() + "/" + System.currentTimeMillis());
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
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if ("com.google.android.apps.photos.content".equals(uri.getAuthority())) {
                    return uri.getLastPathSegment();
                }
                String scheme = uri.getScheme();
                if (scheme == null || "file".equals(scheme)) {
                    path = uri.getPath();
                } else if (!"content".equals(scheme) || (cursorQuery = activity.getContentResolver().query(uri, new String[]{"_data"}, null, null, null)) == null) {
                    path = null;
                } else {
                    String string2 = (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_data")) <= -1) ? null : cursorQuery.getString(columnIndex);
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
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }
}
