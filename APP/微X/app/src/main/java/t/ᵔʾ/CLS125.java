// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Audio.Media;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;
import t.ʻˑ.CLS3;
import t.ˊﾞ.CLS106;

public final class CLS125 {
    // 此方法包含解密的字符串
    public static boolean MTH2022(CLS106 ٴـ0) {
        boolean z;
        Serializable serializable0 = ٴـ0.FLD790;
        Object object0 = ٴـ0.FLD789;
        if(object0 == null) {
            goto label_7;
        }
        else {
            try {
                z = ((Boolean)CLS3.MTH991(object0, CLS133.MTH2100("VFSFileClass1ExistsMethod", "exists"), new Object[0])).booleanValue();
            }
            catch(Throwable throwable0) {
                try {
                    CLS133.MTH2113(throwable0);
                    try {
                    label_7:
                        z = ((File)serializable0).exists();
                    }
                    catch(Throwable throwable2) {
                        CLS133.MTH2113(throwable2);
                        z = false;
                    }
                label_12:
                    if(z) {
                        if(object0 != null) {
                            try {
                                return ((long)(((Long)CLS3.MTH991(object0, CLS133.MTH2100("VFSFileClass1LengthMethod", "length"), new Object[0])))) != 0L;
                            }
                            catch(Throwable throwable3) {
                                CLS133.MTH2113(throwable3);
                            }
                        }
                        try {
                            return ((File)serializable0).length() != 0L;
                        }
                        catch(Throwable throwable4) {
                            CLS133.MTH2113(throwable4);
                            return false;
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
                return false;
            }
        }
        goto label_12;
    }

    public static boolean MTH2023(File file0) {
        return file0 == null ? false : CLS125.MTH2022(new CLS106(file0));
    }

    // 去混淆评级： 低(20)
    public static boolean MTH2024(String s) {
        return TextUtils.isEmpty(s) ? false : CLS125.MTH2023(new File(s));
    }

    // 去混淆评级： 低(23)
    // 此方法包含解密的字符串
    public static String MTH2025(String s, String s1) {
        if(!s1.startsWith(".")) {
            s1 = "." + s1;
        }
        return TextUtils.isEmpty(s1) || s.endsWith(s1) ? s : s + s1;
    }

    // 此方法包含解密的字符串
    public static boolean MTH2026(CLS106 ٴـ0) {
        if(!CLS125.MTH2022(ٴـ0)) {
            try {
                Object object0 = ٴـ0.FLD789;
                return object0 != null ? ((Boolean)CLS3.MTH991(object0, CLS133.MTH2100("VFSFileClass1mkdirsMethod", "mkdirs"), new Object[0])).booleanValue() : ((File)ٴـ0.FLD790).mkdirs();
            }
            catch(Throwable throwable0) {
                try {
                    CLS133.MTH2113(throwable0);
                    try {
                        return ((File)ٴـ0.FLD790).mkdirs();
                    }
                    catch(Throwable throwable2) {
                        CLS133.MTH2113(throwable2);
                        return false;
                    }
                }
                catch(Throwable throwable1) {
                }
            }
            CLS133.MTH2113(throwable1);
        }
        return true;
    }

    public static InputStream MTH2027(Uri uri0) {
        try {
            return CLS133.MTH2108().getContentResolver().openInputStream(uri0);
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static String MTH2028(Context context0) {
        if(context0 != null) {
            File file0 = context0.getCacheDir();
            return file0.canWrite() ? new File(file0, "tmp_" + Long.toHexString(System.currentTimeMillis())).getAbsolutePath() : new File(null, "tmp_" + Long.toHexString(System.currentTimeMillis())).getAbsolutePath();
        }
        return new File(null, "tmp_" + Long.toHexString(System.currentTimeMillis())).getAbsolutePath();
    }

    public static long MTH2029(Uri uri0) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
            mediaMetadataRetriever0.setDataSource(CLS133.MTH2108(), uri0);
            String s = mediaMetadataRetriever0.extractMetadata(9);
            mediaMetadataRetriever0.release();
            if(!TextUtils.isEmpty(s)) {
                return Long.parseLong(s);
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return 0L;
    }

    // 此方法包含解密的字符串
    public static void MTH2030(CLS302 ᐧⁱ0, String[] arr_s) {
        if(arr_s.length == 0) {
            return;
        }
        Intent intent0 = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent0.addCategory("android.intent.category.OPENABLE");
        if(arr_s.length > 1) {
            intent0.setType("*/*");
            intent0.putExtra("android.intent.extra.MIME_TYPES", arr_s);
        }
        else {
            intent0.setType(arr_s[0]);
        }
        CLS123.FLD912.MTH1999("startActivityForResult_themes", new Object[]{intent0, 1230041, ᐧⁱ0});
    }

    public static boolean MTH2031(File file0, byte[] arr_b) {
        CLS106 ٴـ0 = new CLS106(file0);
        try {
            if(!CLS125.MTH2022(ٴـ0)) {
                File file1 = new File(ٴـ0.MTH1848()).getParentFile();
                if(file1 != null) {
                    CLS125.MTH2026(new CLS106(file1));
                }
                try {
                    ٴـ0.MTH1843();
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
            }
            OutputStream outputStream0 = ٴـ0.MTH1844();
            if(outputStream0 != null) {
                try {
                    outputStream0.write(arr_b);
                    outputStream0.close();
                    return true;
                }
                catch(Throwable throwable2) {
                    CLS133.MTH2113(throwable2);
                    return false;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2109(ٴـ0.MTH1845());
            CLS133.MTH2113(throwable0);
        }
        return false;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static String MTH2032(Context context0, Uri uri0) {
        return uri0.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context0.getContentResolver().getType(uri0)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri0.getPath())).toString());
    }

    public static void MTH2033(String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            File file0 = new File(s);
            File file1 = new File(s1);
            CLS106 ٴـ0 = new CLS106(file0);
            CLS106 ٴـ1 = new CLS106(file1);
            try {
                if(CLS125.MTH2022(ٴـ0)) {
                    CLS125.MTH2026(new CLS106(ٴـ1.MTH1849()));
                    if(!CLS125.MTH2022(ٴـ1)) {
                        ٴـ1.MTH1843();
                    }
                    CLS125.MTH2038(new BufferedInputStream(ٴـ0.MTH1847()), new BufferedOutputStream(ٴـ1.MTH1844()));
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static String MTH2034(File file0) {
        String s = MimeTypeMap.getFileExtensionFromUrl(file0.toString());
        String s1 = s == null ? null : MimeTypeMap.getSingleton().getMimeTypeFromExtension(s.toLowerCase());
        if(TextUtils.isEmpty(s1)) {
            switch(s.toLowerCase()) {
                case "json": {
                    return "application/json";
                }
                case "txt": {
                    return "plain/text";
                }
                default: {
                    return "*/*";
                }
            }
        }
        return s1;
    }

    public static File MTH2035(File file0, String s) {
        if(!file0.isDirectory()) {
            return null;
        }
        File[] arr_file = file0.listFiles();
        if(arr_file == null) {
            return null;
        }
        for(int v = 0; v < arr_file.length; ++v) {
            File file1 = arr_file[v];
            if(file1.isFile()) {
                if(file1.getName().equals(s)) {
                    return file1;
                }
            }
            else if(file1.isDirectory()) {
                File file2 = CLS125.MTH2035(file1, s);
                if(file2 != null) {
                    return file2;
                }
            }
        }
        return null;
    }

    public static void MTH2036(InputStream inputStream0, File file0) {
        CLS106 ٴـ0 = new CLS106(file0);
        if(inputStream0 != null) {
            try {
                CLS125.MTH2026(new CLS106(ٴـ0.MTH1849()));
                if(!CLS125.MTH2022(ٴـ0)) {
                    ٴـ0.MTH1843();
                }
                CLS125.MTH2038(inputStream0, new BufferedOutputStream(ٴـ0.MTH1844()));
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH2037(String s) {
        try {
            JSONArray jSONArray0 = CLS133.MTH2103().MTH2135("cleanup_files", new JSONArray());
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("path", s);
            jSONObject0.put("time", System.currentTimeMillis());
            jSONArray0.put(jSONObject0);
            CLS133.MTH2103().MTH2125(jSONArray0, "cleanup_files");
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    public static boolean MTH2038(InputStream inputStream0, OutputStream outputStream0) {
        if(inputStream0 != null && outputStream0 != null) {
            try {
                byte[] arr_b = new byte[0x100000];
                int v;
                while((v = inputStream0.read(arr_b)) > 0) {
                    outputStream0.write(arr_b, 0, v);
                }
                inputStream0.close();
                outputStream0.flush();
                outputStream0.close();
                return true;
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static String MTH2039(Uri uri0) {
        try {
            if("file".equals(uri0.getScheme())) {
                return new File(uri0.getPath()).getName();
            }
            if("content".equals(uri0.getScheme())) {
                Cursor cursor0 = CLS133.MTH2108().getContentResolver().query(uri0, null, null, null, null);
                if(cursor0 != null && cursor0.moveToFirst()) {
                    String s = cursor0.getString(cursor0.getColumnIndex("_display_name"));
                    cursor0.close();
                    return s;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static String MTH2040(Context context0, Uri uri0) {
        String s3;
        String[] arr_s3;
        Uri uri1;
        String[] arr_s1;
        String s1;
        try {
            if(Build.VERSION.SDK_INT < 19 || !DocumentsContract.isDocumentUri(context0.getApplicationContext(), uri0)) {
                s1 = null;
                arr_s1 = null;
            }
            else {
                if("com.android.externalstorage.documents".equals(uri0.getAuthority())) {
                    String[] arr_s = DocumentsContract.getDocumentId(uri0).split(":");
                    return Environment.getExternalStorageDirectory() + "/" + arr_s[1];
                }
                if("com.android.providers.downloads.documents".equals(uri0.getAuthority())) {
                    String s = DocumentsContract.getDocumentId(uri0);
                    if(TextUtils.isDigitsOnly(s)) {
                        uri0 = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(s));
                    }
                    s1 = null;
                    arr_s1 = null;
                }
                else if("com.android.providers.media.documents".equals(uri0.getAuthority())) {
                    String[] arr_s2 = DocumentsContract.getDocumentId(uri0).split(":");
                    String s2 = arr_s2[0];
                    if("image".equals(s2)) {
                        uri0 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    }
                    else if("video".equals(s2)) {
                        uri0 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    }
                    else if("audio".equals(s2)) {
                        uri0 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    s1 = "_id=?";
                    try {
                        arr_s1 = new String[]{arr_s2[1]};
                    }
                    catch(Throwable throwable0) {
                        goto label_35;
                    }
                }
                else {
                    s1 = null;
                    arr_s1 = null;
                }
            }
            goto label_40;
        }
        catch(Throwable throwable0) {
            s1 = null;
        }
        try {
        label_35:
            CLS133.MTH2113(throwable0);
            uri1 = uri0;
            arr_s3 = null;
            s3 = s1;
            goto label_43;
        label_40:
            uri1 = uri0;
            s3 = s1;
            arr_s3 = arr_s1;
        label_43:
            if("content".equalsIgnoreCase(uri1.getScheme())) {
                goto label_49;
            }
            if("file".equalsIgnoreCase(uri1.getScheme())) {
                return uri1.getPath();
            }
        }
        catch(Throwable throwable1) {
            CLS133.MTH2113(throwable1);
        }
        return null;
        try {
        label_49:
            Cursor cursor0 = context0.getContentResolver().query(uri1, new String[]{"_data"}, s3, arr_s3, null);
            int v = cursor0.getColumnIndexOrThrow("_data");
            String s4 = cursor0.moveToFirst() ? cursor0.getString(v) : null;
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
            return s4;
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public static void MTH2041(File file0) {
        if(file0 != null && file0.exists()) {
            try {
                file0.delete();
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
                CLS106 ٴـ0 = new CLS106(file0);
                if(CLS125.MTH2022(ٴـ0)) {
                    try {
                        ٴـ0.MTH1846();
                    }
                    catch(Throwable throwable1) {
                        CLS133.MTH2113(throwable1);
                    }
                }
            }
        }
    }

    public static void MTH2042(File file0) {
        if(file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            if(arr_file != null) {
                for(int v = 0; v < arr_file.length; ++v) {
                    CLS125.MTH2042(arr_file[v]);
                }
            }
        }
        CLS125.MTH2041(file0);
    }
}

