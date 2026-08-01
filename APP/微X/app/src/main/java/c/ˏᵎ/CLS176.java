// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import c.ˊﹶ.CLS98;
import c.ᵎʾ.CLS299;
import c.ﾞʿ.CLS367;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.CRC32;
import org.json.JSONArray;
import org.json.JSONObject;

public class CLS176 {
    public static boolean MTH2566(CLS367 ʾʻ0, CLS367 ʾʻ1) {
        return ʾʻ0 == null || ʾʻ1 == null ? false : ʾʻ0.MTH5057().toString().equals(ʾʻ1.MTH5057().toString());
    }

    // 此方法包含解密的字符串
    public static void MTH2567(String s) {
        try {
            JSONArray jSONArray0 = CLS98.MTH1297().MTH1001("cleanup_files", new JSONArray());
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("path", s);
            jSONObject0.put("time", System.currentTimeMillis());
            jSONArray0.put(jSONObject0);
            CLS98.MTH1297().MTH984("cleanup_files", jSONArray0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public static boolean MTH2568(File file0) {
        if(!CLS176.MTH2570(file0)) {
            return true;
        }
        if(file0.isDirectory()) {
            String[] arr_s = file0.list();
            return arr_s == null || arr_s.length == 0;
        }
        return false;
    }

    public static boolean MTH2569(InputStream inputStream0, File file0) {
        if(inputStream0 != null && file0 != null) {
            try {
                CLS176.MTH2574(file0.getParentFile());
                return CLS176.MTH2575(inputStream0, new BufferedOutputStream(new FileOutputStream(file0)));
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return false;
    }

    public static boolean MTH2570(File file0) {
        if(file0 == null) {
            return false;
        }
        try {
            return file0.exists();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public static String MTH2571(File file0) {
        if(!CLS176.MTH2570(file0)) {
            return "";
        }
        try {
            byte[] arr_b = CLS176.MTH2579(file0);
            return arr_b == null ? "" : new String(arr_b).trim();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return "";
        }
    }

    // 去混淆评级： 低(20)
    public static boolean MTH2572(String s, String s1) {
        return TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) ? false : CLS176.MTH2597(new File(s), s1);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH2573(Context context0) {
        return new File(CLS176.MTH2594(context0), "tmp_" + Long.toHexString(System.currentTimeMillis())).getAbsolutePath();
    }

    public static boolean MTH2574(File file0) {
        if(!CLS176.MTH2570(file0) && file0 != null) {
            try {
                return file0.mkdirs();
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return true;
    }

    public static boolean MTH2575(InputStream inputStream0, OutputStream outputStream0) {
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
                CLS185.MTH2708(throwable0);
            }
        }
        return false;
    }

    public static boolean MTH2576(File file0, CLS367 ʾʻ0) {
        return !CLS176.MTH2570(file0) || ʾʻ0 == null ? false : CLS176.MTH2566(CLS367.MTH5062(file0), ʾʻ0);
    }

    // 去混淆评级： 低(20)
    public static boolean MTH2577(String s) {
        return TextUtils.isEmpty(s) ? false : CLS176.MTH2570(new File(s));
    }

    public static void MTH2578(File file0) {
        if(!CLS176.MTH2570(file0)) {
            return;
        }
        if(file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            if(arr_file != null) {
                for(int v = 0; v < arr_file.length; ++v) {
                    CLS176.MTH2578(arr_file[v]);
                }
            }
        }
        CLS176.MTH2596(file0);
    }

    public static byte[] MTH2579(File file0) {
        try {
            return CLS176.MTH2570(file0) ? CLS176.MTH2585(new FileInputStream(file0)) : null;
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
            return null;
        }
    }

    public static String MTH2580(byte[] arr_b) {
        if(arr_b == null) {
            return null;
        }
        try {
            CRC32 cRC320 = new CRC32();
            cRC320.update(arr_b);
            return Long.toHexString(cRC320.getValue());
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static String MTH2581(File file0) {
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

    // 此方法包含解密的字符串
    public static void MTH2582(File file0) {
        if(!CLS176.MTH2570(file0)) {
            return;
        }
        Activity activity0 = CLS179.MTH2615();
        if(activity0 == null) {
            return;
        }
        Uri uri0 = CLS299.MTH4277(activity0, file0);
        if(uri0 == null) {
            return;
        }
        Intent intent0 = new Intent("android.intent.action.SEND");
        intent0.setType(URLConnection.guessContentTypeFromName(file0.getName()));
        intent0.putExtra("android.intent.extra.STREAM", uri0);
        activity0.startActivity(Intent.createChooser(intent0, ""));
    }

    public static long MTH2583(Uri uri0) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
            mediaMetadataRetriever0.setDataSource(CLS98.MTH1323(), uri0);
            String s = mediaMetadataRetriever0.extractMetadata(9);
            mediaMetadataRetriever0.release();
            if(!TextUtils.isEmpty(s)) {
                return Long.parseLong(s);
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return 0L;
    }

    // 此方法包含解密的字符串
    public static String MTH2584(Uri uri0) {
        if("content".equals(uri0.getScheme())) {
            return CLS98.MTH1323().getContentResolver().getType(uri0);
        }
        String s = MimeTypeMap.getFileExtensionFromUrl(uri0.toString());
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(s.toLowerCase());
    }

    public static byte[] MTH2585(InputStream inputStream0) {
        try {
            if(inputStream0 == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            if(CLS176.MTH2575(inputStream0, byteArrayOutputStream0)) {
                return byteArrayOutputStream0.toByteArray();
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static String MTH2586(String s) {
        try {
            return TextUtils.isEmpty(s) ? "" : CLS176.MTH2600(new FileInputStream(s));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static Map MTH2587(String s) {
        HashMap hashMap0 = new HashMap();
        if(TextUtils.isEmpty(s)) {
            return hashMap0;
        }
        String[] arr_s = s.split("\n");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(s1 != null && s1.length() > 0) {
                String[] arr_s1 = s1.trim().split("=", 2);
                if(arr_s1 != null && arr_s1.length >= 2) {
                    String s2 = arr_s1[0];
                    String s3 = arr_s1[1];
                    if(s2 != null && s2.length() > 0 && s2.matches("^[a-zA-Z0-9_.]*")) {
                        hashMap0.put(s2, s3);
                    }
                }
            }
        }
        return hashMap0;
    }

    public static void MTH2588(File file0) {
        CLS176.MTH2567(file0.getAbsolutePath());
    }

    public static boolean MTH2589(File file0, byte[] arr_b) {
        if(arr_b == null) {
            return false;
        }
        try {
            if(!CLS176.MTH2570(file0)) {
                return file0.createNewFile() ? CLS176.MTH2595(new FileOutputStream(file0), arr_b) : false;
            }
            if(!file0.canWrite()) {
                file0.setWritable(true);
            }
            return CLS176.MTH2595(new FileOutputStream(file0), arr_b);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2711(file0.getAbsolutePath());
            CLS185.MTH2708(throwable0);
            return false;
        }
    }

    public static OutputStream MTH2590(Uri uri0) {
        try {
            return CLS98.MTH1323().getContentResolver().openOutputStream(uri0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    public static boolean MTH2591(OutputStream outputStream0, String s) {
        return CLS176.MTH2595(outputStream0, s.getBytes());
    }

    public static InputStream MTH2592(Uri uri0) {
        try {
            return CLS98.MTH1323().getContentResolver().openInputStream(uri0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static String MTH2593(InputStream inputStream0) {
        byte[] arr_b = CLS176.MTH2585(inputStream0);
        return arr_b == null ? "" : new String(arr_b);
    }

    public static File MTH2594(Context context0) {
        if(context0 != null) {
            File file0 = context0.getCacheDir();
            return file0.canWrite() ? file0 : null;
        }
        return null;
    }

    public static boolean MTH2595(OutputStream outputStream0, byte[] arr_b) {
        if(arr_b != null && outputStream0 != null) {
            try {
                outputStream0.write(arr_b);
                outputStream0.close();
                return true;
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return false;
    }

    public static boolean MTH2596(File file0) {
        if(!CLS176.MTH2570(file0)) {
            return false;
        }
        try {
            return file0.delete();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return false;
        }
    }

    // 去混淆评级： 低(20)
    public static boolean MTH2597(File file0, String s) {
        return !CLS176.MTH2570(file0) || TextUtils.isEmpty(s) ? false : CLS176.MTH2570(new File(file0, s));
    }

    // 此方法包含解密的字符串
    public static String MTH2598(String s, String s1) {
        if(!TextUtils.isEmpty(s1) && !s.endsWith(s1)) {
            if(s1.startsWith(".")) {
                s1 = s1.substring(1);
            }
            return s + "." + s1;
        }
        return s;
    }

    // 此方法包含解密的字符串
    public static String MTH2599(File file0, String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        try {
            if(CLS176.MTH2589(file0, s.getBytes())) {
                return file0.getAbsolutePath();
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return "";
    }

    // 此方法包含解密的字符串
    public static String MTH2600(InputStream inputStream0) {
        try {
            if(inputStream0 == null) {
                return "";
            }
            byte[] arr_b = new byte[0x1000];
            CRC32 cRC320 = new CRC32();
            int v;
            while((v = inputStream0.read(arr_b)) != -1) {
                cRC320.update(arr_b, 0, v);
            }
            inputStream0.close();
            return Long.toHexString(cRC320.getValue());
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return "";
        }
    }

    public static boolean MTH2601(File file0, File file1) {
        return CLS176.MTH2586(file0.getAbsolutePath()).equals(CLS176.MTH2586(file1.getAbsolutePath()));
    }

    public static void MTH2602(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        CLS176.MTH2578(new File(s));
    }

    public static boolean MTH2603(File file0, File file1) {
        if(file0 != null && file1 != null) {
            try {
                if(!CLS176.MTH2570(file0)) {
                    return false;
                }
                CLS176.MTH2574(file1.getParentFile());
                if(CLS176.MTH2570(file1)) {
                    if(CLS176.MTH2601(file0, file1)) {
                        return false;
                    }
                    CLS176.MTH2596(file1);
                }
                file1.createNewFile();
                return CLS176.MTH2575(new BufferedInputStream(new FileInputStream(file0)), new BufferedOutputStream(new FileOutputStream(file1)));
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return false;
    }
}

