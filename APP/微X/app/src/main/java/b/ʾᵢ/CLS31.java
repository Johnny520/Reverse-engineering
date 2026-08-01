// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.app.Activity;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Audio.Media;
import android.provider.MediaStore.Downloads;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ˊﾞ.CLS612;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS957;
import b.ᵔʾ.CLS1228;
import b.ᵔʾ.CLS1229;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS442.CLS440;
import b.ⁱᵔ.CLS442.CLS441;
import b.ⁱᵔ.CLS442;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS507.CLS506;
import b.ⁱᵔ.CLS507;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.CRC32;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS31 {
    public static String MTH967(long v) {
        StringBuilder stringBuilder0;
        if(v >> 30 > 0L) {
            stringBuilder0 = new StringBuilder();
            stringBuilder0.append(((double)Math.round(((double)v) * 10.0 / 1073741824.0)) / 10.0);
            return CLS182.MTH3475(4101187434710881077L, stringBuilder0);
        }
        if(v >> 20 > 0L) {
            stringBuilder0 = new StringBuilder();
            stringBuilder0.append(((double)Math.round(((double)v) * 10.0 / 1048576.0)) / 10.0);
            return CLS182.MTH3475(4101188001646564149L, stringBuilder0);
        }
        stringBuilder0 = new StringBuilder();
        if(Long.compare(v >> 9, 0L) <= 0) {
            stringBuilder0.append(v);
            return CLS182.MTH3475(4101188018826433333L, stringBuilder0);
        }
        stringBuilder0.append(((double)Math.round(((double)v) * 10.0 / 1024.0)) / 10.0);
        return CLS182.MTH3475(4101188031711335221L, stringBuilder0);
    }

    // 此方法包含解密的字符串
    public static void MTH968(File file0, String s, String[] arr_s) {
        String s1;
        InputStream inputStream0;
        if(file0 == null) {
            return;
        }
        CLS69 ʾᵢ0 = new CLS69(file0);
        if(!CLS31.MTH1029(ʾᵢ0)) {
            return;
        }
        if(CLS25.MTH868(s, arr_s)) {
            if(CLS31.MTH972(ʾᵢ0.MTH1554()).equals(CLS31.MTH972((arr_s.length <= 0 ? CLS25.MTH867(14, s) : CLS25.MTH870(14, s, new ArrayList(Arrays.asList(arr_s))))))) {
                return;
            }
            inputStream0 = ʾᵢ0.MTH1554();
            if(CLS25.MTH868(s, arr_s)) {
                for(int v = 1; true; ++v) {
                    StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                    stringBuilder0.append(" (");
                    stringBuilder0.append(v);
                    stringBuilder0.append(")");
                    s1 = stringBuilder0.toString();
                    if(!CLS25.MTH868(s1, arr_s)) {
                        break;
                    }
                }
                s = s1;
            }
        }
        else {
            inputStream0 = ʾᵢ0.MTH1554();
            s = CLS31.MTH979(s, CLS31.MTH1006(file0));
        }
        CLS31.MTH1036(inputStream0, CLS25.MTH871(s, CLS31.MTH986(file0), arr_s));
    }

    // 此方法包含解密的字符串
    public static String MTH969(Context context0, Uri uri0) {
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
            CLS27.MTH893(throwable0);
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
            CLS27.MTH893(throwable1);
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

    // 此方法包含解密的字符串
    public static String MTH970(byte[] arr_b) {
        try {
            char[] arr_c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
            messageDigest0.update(arr_b);
            byte[] arr_b1 = messageDigest0.digest();
            char[] arr_c1 = new char[arr_b1.length * 2];
            int v1 = 0;
            for(int v = 0; v < arr_b1.length; ++v) {
                int v2 = arr_b1[v];
                int v3 = v1 + 1;
                arr_c1[v1] = arr_c[v2 >>> 4 & 15];
                v1 = v3 + 1;
                arr_c1[v3] = arr_c[v2 & 15];
            }
            return new String(arr_c1);
        }
        catch(Exception unused_ex) {
            return "";
        }
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public static void MTH971(Activity activity0, CLS12 ᵔʾ0) {
        if(ᵔʾ0 == null) {
            return;
        }
        CLS31.MTH1007(activity0, ((CLS17)new CLS576(ᵔʾ0, 0)), ((CLS17)new CLS576(ᵔʾ0, 1)), null, new String[]{"json", "txt"}, new String[]{"application/json", "text/*"}, CLS31.MTH1008().getAbsolutePath(), CLS27.MTH895().MTH925("settings_save_dir", CLS31.MTH1008().getAbsolutePath()));
    }

    // 此方法包含解密的字符串
    public static String MTH972(InputStream inputStream0) {
        try {
            CRC32 cRC320 = new CRC32();
            byte[] arr_b = new byte[0x1000];
            int v;
            while((v = inputStream0.read(arr_b)) > 0) {
                cRC320.update(arr_b, 0, v);
            }
            inputStream0.close();
            return Long.toHexString(cRC320.getValue());
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return "";
        }
    }

    public static InputStream MTH973(Uri uri0) {
        try {
            return CLS27.MTH900().getContentResolver().openInputStream(uri0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH974(Activity activity0, CLS957 ˆʾ0) {
        CLS31.MTH1007(activity0, ((CLS17)new CLS567(((CLS441)ˆʾ0), 2)), ((CLS17)new CLS567(((CLS441)ˆʾ0), 3)), null, new String[]{"zip"}, new String[]{"application/zip"}, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath(), null);
    }

    // 此方法包含解密的字符串
    public static boolean MTH975(String s) {
        boolean z;
        if(CLS31.MTH1027(s)) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
                mediaMetadataRetriever0.setDataSource(CLS27.MTH900(), CLS66.MTH1491(CLS27.MTH900(), new File(CLS31.MTH992(s))));
                String s1 = mediaMetadataRetriever0.extractMetadata(17);
                mediaMetadataRetriever0.release();
                z = "yes".equals(s1);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                z = false;
            }
            if(z) {
                return true;
            }
        }
        try {
            if(ThumbnailUtils.createVideoThumbnail(s, 1) != null) {
                return true;
            }
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }

    // 去混淆评级： 低(30)
    public static boolean MTH976(String s, String s1) {
        return !TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && CLS31.MTH1025(new File(s), new File(s1));
    }

    // 此方法包含解密的字符串
    public static String MTH977(File file0) {
        byte[] arr_b;
        if(!CLS31.MTH1001(file0)) {
            return "";
        }
        try {
            CLS69 ʾᵢ0 = new CLS69(file0);
            try {
                if(CLS31.MTH1029(ʾᵢ0)) {
                    arr_b = CLS31.MTH1020(ʾᵢ0.MTH1554());
                }
                else {
                    arr_b = null;
                    return arr_b == null ? "" : new String(arr_b).trim();
                }
                return arr_b == null ? "" : new String(arr_b).trim();
            }
            catch(Throwable throwable1) {
                throwable1.printStackTrace();
            }
            arr_b = null;
            return arr_b == null ? "" : new String(arr_b).trim();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static void MTH978(File file0, File file1) {
        CLS69 ʾᵢ4;
        if(file0 != null) {
            CLS69 ʾᵢ0 = new CLS69(file0);
            CLS69 ʾᵢ1 = new CLS69(file1);
            if(!CLS31.MTH1029(ʾᵢ0)) {
                return;
            }
            if(CLS31.MTH1001(file1)) {
                if(CLS31.MTH972(ʾᵢ0.MTH1554()).equals(CLS31.MTH972(ʾᵢ1.MTH1554()))) {
                    return;
                }
                CLS69 ʾᵢ2 = new CLS69(ʾᵢ1.MTH1557());
                String s = ʾᵢ1.MTH1555();
                CLS69 ʾᵢ3 = new CLS69(new File(ʾᵢ2.MTH1567(), s));
                if(CLS31.MTH1029(ʾᵢ3)) {
                    for(int v = 1; true; ++v) {
                        File file2 = ʾᵢ2.MTH1567();
                        StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                        stringBuilder0.append(" (");
                        stringBuilder0.append(v);
                        stringBuilder0.append(")");
                        ʾᵢ4 = new CLS69(new File(file2, stringBuilder0.toString()));
                        if(!CLS31.MTH1029(ʾᵢ4)) {
                            break;
                        }
                    }
                    ʾᵢ3 = ʾᵢ4;
                }
                CLS31.MTH1016(ʾᵢ0, ʾᵢ3);
                return;
            }
            CLS31.MTH1016(ʾᵢ0, ʾᵢ1);
        }
    }

    // 去混淆评级： 低(23)
    // 此方法包含解密的字符串
    public static String MTH979(String s, String s1) {
        if(!s1.startsWith(".")) {
            s1 = "." + s1;
        }
        return TextUtils.isEmpty(s1) || s.endsWith(s1) ? s : s + s1;
    }

    public static String MTH980() {
        String s = CLS31.MTH1013(CLS27.MTH900());
        CLS31.MTH996(s);
        return s;
    }

    // 此方法包含解密的字符串
    public static void MTH981(Activity activity0, CLS12 ᵔʾ0, CLS3 ˆٴ0, String s, String s1) {
        if(CLS21.FLD76.MTH830("hasWriteStoragePermission", new Object[0])) {
            CLS442 ˎᵢ0 = new CLS442(activity0);
            ˎᵢ0.MTH6226(s);
            ˎᵢ0.MTH6225(s1, ((CLS440)new CLS572(ᵔʾ0, ˆٴ0, 0)));
            return;
        }
        CLS575 ⁱᵔ0 = new CLS575(ˆٴ0, 0);
        CLS40.FLD157.MTH1124(((CLS39)ⁱᵔ0));
    }

    // 此方法包含解密的字符串
    public static void MTH982(Activity activity0, CLS12 ᵔʾ0, String s, String s1) {
        if(CLS390.MTH5616(activity0)) {
            CLS568 יᐧ0 = new CLS568(activity0, ᵔʾ0, 0);
            Intent intent0 = new Intent("android.intent.action.GET_CONTENT");
            intent0.setType("*/*");
            CLS21.FLD76.MTH818("startActivityForResult_base", new Object[]{intent0, 1230014, יᐧ0});
            return;
        }
        CLS442 ˎᵢ0 = new CLS442(activity0);
        ˎᵢ0.MTH6226(s);
        ˎᵢ0.MTH6225(s1, ((CLS440)new CLS576(ᵔʾ0, 2)));
    }

    // 此方法包含解密的字符串
    public static void MTH983(CLS573 ⁱʽ0, String[] arr_s) {
        Intent intent0 = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent0.addCategory("android.intent.category.OPENABLE");
        if(arr_s.length > 1) {
            intent0.setType("*/*");
            intent0.putExtra("android.intent.extra.MIME_TYPES", arr_s);
        }
        else {
            intent0.setType(arr_s[0]);
        }
        intent0.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        CLS21.FLD76.MTH818("startActivityForResult_base", new Object[]{intent0, 1230013, ⁱʽ0});
    }

    public static long MTH984(CLS69 ʾᵢ0) {
        return CLS31.MTH1028(CLS66.MTH1491(CLS27.MTH900(), ʾᵢ0.MTH1567()));
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static String MTH985(Context context0, Uri uri0) {
        return uri0.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context0.getContentResolver().getType(uri0)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri0.getPath())).toString());
    }

    // 此方法包含解密的字符串
    public static String MTH986(File file0) {
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

    // This method contains unreflected code
    public static boolean MTH987(File file0) {
        boolean z;
        if(file0 != null && file0.exists()) {
            if(Build.VERSION.SDK_INT >= 26) {
                Path path0 = file0.toPath();
                if(Files.isDirectory(path0, new LinkOption[0])) {
                    DirectoryStream directoryStream0 = Files.newDirectoryStream(path0);
                    try {
                        z = directoryStream0.iterator().hasNext();
                    }
                    catch(Throwable throwable0) {
                        if(directoryStream0 != null) {
                            try {
                                directoryStream0.close();
                            }
                            catch(Throwable throwable1) {
                                try {
                                    throwable0.addSuppressed(throwable1);
                                }
                                catch(Exception unused_ex) {
                                }
                            }
                        }
                        throw throwable0;
                    }
                    directoryStream0.close();
                    return true ^ z;
                }
                return false;
            }
            File[] arr_file = file0.listFiles();
            return arr_file == null || arr_file.length == 0;
        }
        return true;
    }

    // 此方法包含解密的字符串
    public static File MTH988() {
        File file0 = CLS31.MTH989(CLS27.MTH900(), 1);
        if(file0 == null || !CLS31.MTH1001(file0) && !CLS31.MTH1026(file0)) {
            return null;
        }
        return file0.canWrite() ? new File(file0, "BACKUP") : null;
    }

    // 此方法包含解密的字符串
    public static File MTH989(Context context0, int v) {
        try {
            switch(v) {
                case 1: {
                    if(context0 == null) {
                        context0 = CLS27.MTH900();
                    }
                    File file0 = context0.getExternalFilesDir(null);
                    if(file0 != null && file0.canWrite()) {
                        return new File(file0, "X");
                    }
                    break;
                }
                case 2: {
                    File file1 = CLS31.MTH989(context0, 1);
                    if(file1 != null) {
                        if(!CLS31.MTH1001(file1) && !CLS31.MTH1026(file1)) {
                            return null;
                        }
                        if(file1.canWrite()) {
                            return new File(file1, "images");
                        }
                    }
                    break;
                }
                case 3: {
                    File file2 = CLS31.MTH989(context0, 1);
                    if(file2 != null) {
                        if(!CLS31.MTH1001(file2) && !CLS31.MTH1026(file2)) {
                            return null;
                        }
                        if(file2.canWrite()) {
                            return new File(file2, "sounds");
                        }
                    }
                    break;
                }
                case 4: {
                    File file3 = CLS31.MTH989(context0, 1);
                    if(file3 != null) {
                        if(!CLS31.MTH1001(file3) && !CLS31.MTH1026(file3)) {
                            return null;
                        }
                        if(file3.canWrite()) {
                            return new File(file3, "voice_mp3_temp");
                        }
                    }
                    break;
                }
                case 5: {
                    File file4 = CLS31.MTH989(context0, 1);
                    if(file4 != null) {
                        if(!CLS31.MTH1001(file4) && !CLS31.MTH1026(file4)) {
                            return null;
                        }
                        if(file4.canWrite()) {
                            return new File(file4, "downloads");
                        }
                    }
                    break;
                }
                case 6: {
                    File file5 = CLS31.MTH989(context0, 5);
                    if(file5 != null) {
                        if(!CLS31.MTH1001(file5) && !CLS31.MTH1026(file5)) {
                            return null;
                        }
                        if(file5.canWrite()) {
                            return new File(file5, "images");
                        }
                    }
                    break;
                }
                case 7: {
                    File file6 = CLS31.MTH989(context0, 5);
                    if(file6 != null) {
                        if(!CLS31.MTH1001(file6) && !CLS31.MTH1026(file6)) {
                            return null;
                        }
                        if(file6.canWrite()) {
                            return new File(file6, "videos");
                        }
                    }
                    break;
                }
                case 8: {
                    File file7 = CLS31.MTH989(context0, 1);
                    if(file7 != null) {
                        if(!CLS31.MTH1001(file7) && !CLS31.MTH1026(file7)) {
                            return null;
                        }
                        if(file7.canWrite()) {
                            return new File(file7, "cache");
                        }
                    }
                    break;
                }
                case 9: {
                    File file8 = CLS31.MTH989(context0, 1);
                    if(file8 != null) {
                        if(!CLS31.MTH1001(file8) && !CLS31.MTH1026(file8)) {
                            return null;
                        }
                        if(file8.canWrite()) {
                            return new File(file8, "assets");
                        }
                    }
                    break;
                }
                case 10: {
                    File file9 = CLS31.MTH989(context0, 1);
                    if(file9 != null) {
                        if(!CLS31.MTH1001(file9) && !CLS31.MTH1026(file9)) {
                            return null;
                        }
                        if(file9.canWrite()) {
                            return new File(file9, "WxThemes");
                        }
                    }
                    break;
                }
                case 11: {
                    File file10 = CLS31.MTH989(context0, 1);
                    if(file10 != null) {
                        if(!CLS31.MTH1001(file10) && !CLS31.MTH1026(file10)) {
                            return null;
                        }
                        if(file10.canWrite()) {
                            return new File(file10, "voice");
                        }
                    }
                    break;
                }
                case 12: {
                    File file11 = CLS31.MTH989(context0, 1);
                    if(file11 != null) {
                        if(!CLS31.MTH1001(file11) && !CLS31.MTH1026(file11)) {
                            return null;
                        }
                        if(file11.canWrite()) {
                            return new File(file11, "Records");
                        }
                    }
                    break;
                }
                case 13: {
                    File file12 = CLS31.MTH989(context0, 1);
                    if(file12 != null) {
                        if(!CLS31.MTH1001(file12) && !CLS31.MTH1026(file12)) {
                            return null;
                        }
                        if(file12.canWrite()) {
                            return new File(file12, "moments");
                        }
                    }
                    break;
                }
                case 14: {
                    File file13 = CLS31.MTH989(context0, 1);
                    if(file13 != null) {
                        if(!CLS31.MTH1001(file13) && !CLS31.MTH1026(file13)) {
                            return null;
                        }
                        if(file13.canWrite()) {
                            return new File(file13, "chat");
                        }
                    }
                    break;
                }
                default: {
                    return context0.getExternalCacheDir();
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            CLS27.MTH906(("getModuleDirInWechatExternalFiles: " + v));
        }
        return null;
    }

    public static boolean MTH990(File file0, OutputStream outputStream0) {
        return CLS31.MTH1036(new CLS69(file0).MTH1554(), outputStream0);
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static void MTH991(Activity activity0, CLS441 ˎᵢ$ᵔʾ0) {
        CLS31.MTH1007(activity0, ((CLS17)new CLS567(ˎᵢ$ᵔʾ0, 0)), ((CLS17)new CLS567(ˎᵢ$ᵔʾ0, 1)), null, new String[]{"json"}, new String[]{"application/json"}, CLS31.MTH1008().getAbsolutePath(), CLS27.MTH895().MTH925("settings_save_dir", CLS31.MTH1008().getAbsolutePath()));
    }

    // 此方法包含解密的字符串
    public static String MTH992(String s) {
        if(!TextUtils.isEmpty(s) && !new File(s).exists()) {
            if(s.contains("Android/data/com.tencent.mm")) {
                String s1 = s.replace("Android/data/com.tencent.mm", "tencent");
                return new File(s1).exists() ? s1 : new CLS69(s).MTH1563();
            }
            return new CLS69(s).MTH1563();
        }
        return s;
    }

    // 此方法包含解密的字符串
    public static void MTH993(CLS566 ˈˊ0, String[] arr_s) {
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
        CLS21.FLD76.MTH818("startActivityForResult_base", new Object[]{intent0, 1230011, ˈˊ0});
    }

    // 此方法包含解密的字符串
    public static String MTH994(long v) {
        if(v / 0x400L >= 0x400L) {
            return v / 0x400L / 0x400L + " Mb";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v / 0x400L);
        return CLS182.MTH3475(4101189565014659893L, stringBuilder0);
    }

    // 此方法包含解密的字符串
    public static void MTH995(Activity activity0, CLS12 ᵔʾ0, CLS3 ˆٴ0, String s, String s1) {
        if(CLS21.FLD76.MTH830("hasWriteStoragePermission", new Object[0])) {
            CLS442 ˎᵢ0 = new CLS442(activity0);
            ˎᵢ0.MTH6226(s);
            ˎᵢ0.MTH6225(s1, ((CLS440)new CLS572(ᵔʾ0, ˆٴ0, 1)));
            return;
        }
        CLS412.MTH5998(ˆٴ0);
    }

    // 此方法包含解密的字符串
    public static void MTH996(String s) {
        try {
            JSONArray jSONArray0 = CLS27.MTH895().MTH937("cleanup_files", new JSONArray());
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("path", s);
            jSONObject0.put("time", System.currentTimeMillis());
            jSONArray0.put(jSONObject0);
            CLS27.MTH895().MTH922(jSONArray0, "cleanup_files");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static boolean MTH997(CLS69 ʾᵢ0, byte[] arr_b) {
        boolean z;
        if(arr_b != null) {
            try {
                if(CLS31.MTH1019(ʾᵢ0)) {
                    OutputStream outputStream0 = ʾᵢ0.MTH1553();
                    if(outputStream0 == null) {
                        z = false;
                    }
                    else {
                        try {
                            outputStream0.write(arr_b);
                            outputStream0.close();
                            z = true;
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                            z = false;
                            return z || CLS31.MTH1032(ʾᵢ0, ʾᵢ0.MTH1555(), ʾᵢ0.MTH1567().getParent());
                        }
                    }
                    return z || CLS31.MTH1032(ʾᵢ0, ʾᵢ0.MTH1555(), ʾᵢ0.MTH1567().getParent());
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH906(ʾᵢ0.MTH1568());
                CLS27.MTH893(throwable0);
            }
            return false;
        }
        return false;
    }

    public static String MTH998(InputStream inputStream0) {
        byte[] arr_b = CLS31.MTH1020(inputStream0);
        return arr_b == null ? null : new String(arr_b).trim();
    }

    // 此方法包含解密的字符串
    public static void MTH999(Activity activity0, String s, String s1) {
        CLS31.MTH981(activity0, ((CLS12)new CLS1228(s1, s, activity0, 1)), ((CLS3)new CLS574(0, s1, s)), CLS31.MTH1008().getAbsolutePath(), CLS27.MTH895().MTH925("settings_save_dir", CLS31.MTH1008().getAbsolutePath()));
    }

    public static void MTH1000(Activity activity0, CLS17 ﾞٴ0, String[] arr_s, String[] arr_s1, String s, String s1) {
        try {
            if(CLS390.MTH5616(activity0)) {
                CLS31.MTH983(new CLS573(0, ﾞٴ0), arr_s1);
                return;
            }
            CLS507 ﹳˊ0 = new CLS507(activity0);
            ﹳˊ0.FLD4998 = s;
            if(arr_s != null && arr_s.length != 0) {
                Collections.addAll(ﹳˊ0.FLD5003, arr_s);
            }
            ﹳˊ0.MTH6979(s1, ((CLS506)new CLS1229(6, ﾞٴ0)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static boolean MTH1001(File file0) {
        return file0 == null ? false : CLS31.MTH1029(new CLS69(file0));
    }

    // 此方法包含解密的字符串
    public static boolean MTH1002(CLS69 ʾᵢ0) {
        if(!CLS31.MTH1029(ʾᵢ0)) {
            try {
                Object object0 = ʾᵢ0.FLD233;
                return object0 != null ? ((Boolean)CLS166.MTH3195(object0, CLS27.MTH892("VFSFileClass1mkdirsMethod", "mkdirs"), new Object[0])).booleanValue() : ((File)ʾᵢ0.FLD234).mkdirs();
            }
            catch(Throwable throwable0) {
                try {
                    CLS27.MTH893(throwable0);
                    try {
                        return ((File)ʾᵢ0.FLD234).mkdirs();
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                        return false;
                    }
                }
                catch(Throwable throwable1) {
                }
            }
            CLS27.MTH893(throwable1);
        }
        return true;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1003(String s) {
        File file0 = new File(s);
        if(!CLS31.MTH1022(file0)) {
            CLS412.MTH6013(CLS27.MTH900(), String.format(CLS27.MTH889("not_writable"), "(" + file0.getName() + ") " + file0.getAbsolutePath()));
            return false;
        }
        return true;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1004(CLS69 ʾᵢ0) {
        if(!ʾᵢ0.MTH1562()) {
            try {
                CLS31.MTH1026(ʾᵢ0.MTH1567().getParentFile());
                if(!ʾᵢ0.MTH1556()) {
                    return false;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        Object object0 = ʾᵢ0.FLD233;
        if(object0 != null) {
            try {
                return CLS27.MTH890("VFSFileClass1canWriteMethod") ? ((Boolean)CLS166.MTH3195(object0, CLS27.MTH892("VFSFileClass1canWriteMethod", "canWrite"), new Object[0])).booleanValue() : new File(ʾᵢ0.MTH1563()).canWrite();
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
        return ((File)ʾᵢ0.FLD234).canWrite();
    }

    public static void MTH1005(File file0) {
        if(file0 != null && file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            if(arr_file != null) {
                for(int v = 0; v < arr_file.length; ++v) {
                    CLS31.MTH1035(arr_file[v]);
                }
            }
        }
    }

    public static String MTH1006(File file0) {
        return MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(file0).toString());
    }

    public static void MTH1007(Activity activity0, CLS17 ﾞٴ0, CLS17 ﾞٴ1, CLS576 ﾞˎ0, String[] arr_s, String[] arr_s1, String s, String s1) {
        try {
            if(CLS390.MTH5616(activity0)) {
                CLS31.MTH993(new CLS566(activity0, ﾞٴ1, ﾞˎ0, ﾞٴ0, 0), arr_s1);
                return;
            }
            CLS442 ˎᵢ0 = new CLS442(activity0);
            ˎᵢ0.MTH6226(s);
            if(arr_s != null && arr_s.length != 0) {
                Collections.addAll(ˎᵢ0.FLD4221, arr_s);
            }
            ˎᵢ0.MTH6225(s1, ((CLS440)new CLS612(activity0, ﾞٴ1, ﾞˎ0, ﾞٴ0, 1)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static File MTH1008() {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    }

    public static boolean MTH1009(CLS69 ʾᵢ0, File file0) {
        return CLS31.MTH1016(ʾᵢ0, new CLS69(file0));
    }

    public static void MTH1010(OutputStream outputStream0, String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        byte[] arr_b = s.getBytes();
        if(outputStream0 != null && arr_b != null) {
            try {
                outputStream0.write(arr_b);
                outputStream0.close();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    public static void MTH1011(File file0) {
        if(file0 != null && file0.exists()) {
            try {
                file0.delete();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                CLS69 ʾᵢ0 = new CLS69(file0);
                if(CLS31.MTH1029(ʾᵢ0)) {
                    try {
                        ʾᵢ0.MTH1564();
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
            }
        }
    }

    public static String MTH1012(String s) {
        StringBuilder stringBuilder0 = CLS182.MTH3483(s);
        stringBuilder0.append(Long.toHexString(System.currentTimeMillis()));
        return stringBuilder0.toString();
    }

    // 此方法包含解密的字符串
    public static String MTH1013(Context context0) {
        File file0 = CLS31.MTH1038(context0);
        StringBuilder stringBuilder0 = CLS182.MTH3483("tmp_");
        stringBuilder0.append(Long.toHexString(System.currentTimeMillis()));
        return new File(file0, stringBuilder0.toString()).getAbsolutePath();
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH1014(Activity activity0, CLS12 ᵔʾ0, CLS12 ᵔʾ1, String s) {
        CLS31.MTH1007(activity0, null, ((CLS17)new CLS576(ᵔʾ0, 4)), new CLS576(ᵔʾ1, 5), new String[]{"*"}, new String[]{"*/*"}, s, null);
    }

    // 此方法包含解密的字符串
    public static boolean MTH1015(File file0) {
        CLS69 ʾᵢ0 = new CLS69(file0);
        if(CLS31.MTH1029(ʾᵢ0)) {
            if(CLS31.MTH984(ʾᵢ0) != 0L) {
                return true;
            }
            CLS27.MTH906(("video file " + ʾᵢ0 + " corrupted, duration: " + 0L));
        }
        return false;
    }

    public static boolean MTH1016(CLS69 ʾᵢ0, CLS69 ʾᵢ1) {
        try {
            if(CLS31.MTH1029(ʾᵢ0)) {
                return CLS31.MTH1019(ʾᵢ1) ? CLS31.MTH1036(new BufferedInputStream(ʾᵢ0.MTH1554()), new BufferedOutputStream(ʾᵢ1.MTH1553())) || CLS31.MTH1032(ʾᵢ0, ʾᵢ1.MTH1555(), ʾᵢ1.MTH1567().getParent()) : false;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static String MTH1017(String s) {
        CLS69 ʾᵢ0 = new CLS69(s);
        if(CLS31.MTH1029(ʾᵢ0)) {
            try {
                InputStream inputStream0 = ʾᵢ0.MTH1554();
                long v = ʾᵢ0.MTH1558() > 0x19000L ? 0x19000L : ʾᵢ0.MTH1558();
                if(((int)v) > 0) {
                    MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                    StringBuilder stringBuilder0 = new StringBuilder(0x20);
                    byte[] arr_b = new byte[((int)v)];
                    while(true) {
                        int v1 = inputStream0.read(arr_b);
                        if(v1 == -1) {
                            byte[] arr_b1 = messageDigest0.digest();
                            for(int v2 = 0; v2 < arr_b1.length; ++v2) {
                                stringBuilder0.append(Integer.toString((arr_b1[v2] & 0xFF) + 0x100, 16).substring(1));
                            }
                            return stringBuilder0.toString();
                        }
                        messageDigest0.update(arr_b, 0, v1);
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return null;
    }

    public static void MTH1018(File file0) {
        try {
            if(!CLS31.MTH1001(file0)) {
                file0.createNewFile();
            }
            if(!file0.canWrite()) {
                file0.setWritable(true);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH1019(CLS69 ʾᵢ0) {
        if(!CLS31.MTH1004(ʾᵢ0)) {
            CLS412.MTH6013(CLS27.MTH900(), String.format(CLS27.MTH889("not_writable"), "(" + ʾᵢ0.MTH1555() + ") " + ʾᵢ0.MTH1568()));
            return false;
        }
        return true;
    }

    public static byte[] MTH1020(InputStream inputStream0) {
        try {
            if(inputStream0 == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            if(CLS31.MTH1036(inputStream0, byteArrayOutputStream0)) {
                return byteArrayOutputStream0.toByteArray();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return null;
    }

    // 去混淆评级： 低(35)
    // 此方法包含解密的字符串
    public static boolean MTH1021(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        String s1 = s.toLowerCase();
        return s1.endsWith("jpg") || s1.endsWith("jpeg") || s1.endsWith("png") || s1.startsWith("serverid://") && !TextUtils.isEmpty(CLS66.MTH1410(s));
    }

    public static boolean MTH1022(File file0) {
        if(file0 == null) {
            return false;
        }
        if(!file0.exists()) {
            try {
                CLS31.MTH1026(file0.getParentFile());
                if(!file0.createNewFile()) {
                    return false;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return file0.canWrite();
    }

    // 此方法包含解密的字符串
    public static String MTH1023(Uri uri0) {
        if(uri0 != null) {
            try {
                if("file".equals(uri0.getScheme())) {
                    return new File(uri0.getPath()).getName();
                }
                if("content".equals(uri0.getScheme())) {
                    Cursor cursor0 = CLS27.MTH900().getContentResolver().query(uri0, null, null, null, null);
                    if(cursor0 != null && cursor0.moveToFirst()) {
                        String s = cursor0.getString(cursor0.getColumnIndex("_display_name"));
                        cursor0.close();
                        return s;
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return null;
    }

    // 去混淆评级： 低(20)
    public static boolean MTH1024(String s) {
        return TextUtils.isEmpty(s) ? false : CLS31.MTH1001(new File(s));
    }

    public static boolean MTH1025(File file0, File file1) {
        return CLS31.MTH1016(new CLS69(file0), new CLS69(file1));
    }

    public static boolean MTH1026(File file0) {
        return file0 == null ? false : CLS31.MTH1002(new CLS69(file0));
    }

    // 去混淆评级： 低(20)
    public static boolean MTH1027(String s) {
        return !TextUtils.isEmpty(s) && CLS31.MTH1015(new File(s));
    }

    public static long MTH1028(Uri uri0) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
            mediaMetadataRetriever0.setDataSource(CLS27.MTH900(), uri0);
            String s = mediaMetadataRetriever0.extractMetadata(9);
            mediaMetadataRetriever0.release();
            if(!TextUtils.isEmpty(s)) {
                return Long.parseLong(s);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return 0L;
    }

    public static boolean MTH1029(CLS69 ʾᵢ0) {
        try {
            if(ʾᵢ0.MTH1562() && ʾᵢ0.MTH1558() != 0L) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static String MTH1030(File file0, String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        try {
            if(CLS31.MTH1033(file0, s.getBytes())) {
                return file0.getAbsolutePath();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return "";
    }

    public static long MTH1031(File file0) {
        if(file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            long v = 0L;
            if(arr_file != null) {
                for(int v1 = 0; v1 < arr_file.length; ++v1) {
                    v += CLS31.MTH1031(arr_file[v1]);
                }
            }
            return v;
        }
        return file0.length();
    }

    // 此方法包含解密的字符串
    public static boolean MTH1032(CLS69 ʾᵢ0, String s, String s1) {
        File file0 = ʾᵢ0.MTH1567();
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("_display_name", s);
        String s2 = CLS31.MTH986(file0);
        if(TextUtils.isEmpty(s2) || s2.equals("*/*")) {
            s2 = CLS31.MTH986(new File(s1, s));
        }
        contentValues0.put("mime_type", s2);
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            contentValues0.put("relative_path", s1);
        }
        Context context0 = CLS27.MTH900();
        Uri uri0 = v < 29 ? null : context0.getContentResolver().insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues0);
        if(uri0 != null) {
            try {
                OutputStream outputStream0 = context0.getContentResolver().openOutputStream(uri0);
                return CLS31.MTH1036(new FileInputStream(file0), outputStream0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return false;
    }

    public static boolean MTH1033(File file0, byte[] arr_b) {
        return CLS31.MTH997(new CLS69(file0), arr_b);
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public static String MTH1034(String s) {
        return CLS502.MTH6934(s, new String[]{":"}) ? s.replaceAll(":", "-") : s;
    }

    public static void MTH1035(File file0) {
        if(file0 == null) {
            return;
        }
        if(file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            if(arr_file != null) {
                for(int v = 0; v < arr_file.length; ++v) {
                    CLS31.MTH1035(arr_file[v]);
                }
            }
        }
        CLS31.MTH1011(file0);
    }

    public static boolean MTH1036(InputStream inputStream0, OutputStream outputStream0) {
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
                CLS27.MTH893(throwable0);
            }
        }
        return false;
    }

    public static boolean MTH1037(InputStream inputStream0, File file0) {
        CLS69 ʾᵢ0 = new CLS69(file0);
        if(inputStream0 != null) {
            try {
                CLS31.MTH1002(new CLS69(ʾᵢ0.MTH1557()));
                if(CLS31.MTH1019(ʾᵢ0)) {
                    return CLS31.MTH1036(inputStream0, new BufferedOutputStream(ʾᵢ0.MTH1553()));
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return false;
    }

    public static File MTH1038(Context context0) {
        if(context0 != null) {
            File file0 = context0.getCacheDir();
            return file0.canWrite() ? file0 : null;
        }
        return null;
    }
}

