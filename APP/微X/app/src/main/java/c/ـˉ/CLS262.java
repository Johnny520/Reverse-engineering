// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import c.ˆˆ.CLS65;
import c.ˈⁱ.CLS95;
import c.ٴˑ.CLS299;
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

public class CLS262 {
    // 此方法包含解密的字符串
    public static String MTH4035(InputStream inputStream0) {
        byte[] arr_b = CLS262.MTH4044(inputStream0);
        return arr_b == null ? "" : new String(arr_b);
    }

    // 此方法包含解密的字符串
    public static String MTH4036(File file0, String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        try {
            if(CLS262.MTH4071(file0, s.getBytes())) {
                return file0.getAbsolutePath();
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return "";
    }

    public static boolean MTH4037(File file0, File file1) {
        if(file0 != null && file1 != null) {
            try {
                if(!CLS262.MTH4050(file0)) {
                    return false;
                }
                CLS262.MTH4057(file1.getParentFile());
                if(CLS262.MTH4050(file1)) {
                    if(CLS262.MTH4053(file0, file1)) {
                        return false;
                    }
                    CLS262.MTH4065(file1);
                }
                file1.createNewFile();
                return CLS262.MTH4068(new BufferedInputStream(new FileInputStream(file0)), new BufferedOutputStream(new FileOutputStream(file1)));
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return false;
    }

    public static boolean MTH4038(OutputStream outputStream0, String s) {
        return CLS262.MTH4055(outputStream0, s.getBytes());
    }

    // 去混淆评级： 低(20)
    public static boolean MTH4039(String s, String s1) {
        return TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) ? false : CLS262.MTH4056(new File(s), s1);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH4040(Context context0) {
        return new File(CLS262.MTH4041(context0), "\uD8E3mp_" + Long.toHexString(System.currentTimeMillis())).getAbsolutePath();
    }

    public static File MTH4041(Context context0) {
        if(context0 != null) {
            File file0 = context0.getCacheDir();
            return file0.canWrite() ? file0 : null;
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static String MTH4042(String s, String s1) {
        if(!TextUtils.isEmpty(s1) && !s.endsWith(s1)) {
            if(s1.startsWith("\uD8E3")) {
                s1 = s1.substring(1);
            }
            return s + "\uD8E3" + s1;
        }
        return s;
    }

    public static byte[] MTH4043(File file0) {
        try {
            return CLS262.MTH4050(file0) ? CLS262.MTH4044(new FileInputStream(file0)) : null;
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
            return null;
        }
    }

    public static byte[] MTH4044(InputStream inputStream0) {
        try {
            if(inputStream0 == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            if(CLS262.MTH4068(inputStream0, byteArrayOutputStream0)) {
                return byteArrayOutputStream0.toByteArray();
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return null;
    }

    // 去混淆评级： 低(20)
    public static boolean MTH4045(String s) {
        return TextUtils.isEmpty(s) ? false : CLS262.MTH4050(new File(s));
    }

    public static void MTH4046(File file0) {
        CLS262.MTH4070(file0.getAbsolutePath());
    }

    public static boolean MTH4047(File file0, CLS299 ـᵎ0) {
        return !CLS262.MTH4050(file0) || ـᵎ0 == null ? false : CLS262.MTH4064(CLS299.MTH4389(file0), ـᵎ0);
    }

    // 此方法包含解密的字符串
    public static String MTH4048(File file0) {
        String s = MimeTypeMap.getFileExtensionFromUrl(file0.toString());
        String s1 = s == null ? null : MimeTypeMap.getSingleton().getMimeTypeFromExtension(s.toLowerCase());
        if(TextUtils.isEmpty(s1)) {
            String s2 = s.toLowerCase();
            switch(s2.hashCode()) {
                case 0x1C270: {
                    return s2.equals("\uD8E3xt") ? "\uD8E3lain/text" : "\uD8E3/*";
                }
                case 0x31ECE8: {
                    return s2.equals("\uD8E3son") ? "\uD8E3pplication/json" : "\uD8E3/*";
                }
                default: {
                    return "\uD8E3/*";
                }
            }
        }
        return s1;
    }

    public static String MTH4049(byte[] arr_b) {
        if(arr_b == null) {
            return null;
        }
        try {
            CRC32 cRC320 = new CRC32();
            cRC320.update(arr_b);
            return Long.toHexString(cRC320.getValue());
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    public static boolean MTH4050(File file0) {
        if(file0 == null) {
            return false;
        }
        try {
            return file0.exists();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public static String MTH4051(InputStream inputStream0) {
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
            CLS204.MTH3257(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static Map MTH4052(String s) {
        HashMap hashMap0 = new HashMap();
        if(TextUtils.isEmpty(s)) {
            return hashMap0;
        }
        String[] arr_s = s.split("\uD8E3");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(s1 != null && s1.length() > 0) {
                String[] arr_s1 = s1.trim().split("\uD8E3", 2);
                if(arr_s1 != null && arr_s1.length >= 2) {
                    String s2 = arr_s1[0];
                    String s3 = arr_s1[1];
                    if(s2 != null && s2.length() > 0 && s2.matches("\uD8E3[a-zA-Z0-9_.]*")) {
                        hashMap0.put(s2, s3);
                    }
                }
            }
        }
        return hashMap0;
    }

    public static boolean MTH4053(File file0, File file1) {
        return CLS262.MTH4054(file0.getAbsolutePath()).equals(CLS262.MTH4054(file1.getAbsolutePath()));
    }

    // 此方法包含解密的字符串
    public static String MTH4054(String s) {
        try {
            return TextUtils.isEmpty(s) ? "" : CLS262.MTH4051(new FileInputStream(s));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return "";
        }
    }

    public static boolean MTH4055(OutputStream outputStream0, byte[] arr_b) {
        if(arr_b != null && outputStream0 != null) {
            try {
                outputStream0.write(arr_b);
                outputStream0.close();
                return true;
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public static boolean MTH4056(File file0, String s) {
        return !CLS262.MTH4050(file0) || TextUtils.isEmpty(s) ? false : CLS262.MTH4050(new File(file0, s));
    }

    public static boolean MTH4057(File file0) {
        if(!CLS262.MTH4050(file0) && file0 != null) {
            try {
                return file0.mkdirs();
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return true;
    }

    public static long MTH4058(Uri uri0) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
            mediaMetadataRetriever0.setDataSource(CLS95.MTH2017(), uri0);
            String s = mediaMetadataRetriever0.extractMetadata(9);
            mediaMetadataRetriever0.release();
            if(!TextUtils.isEmpty(s)) {
                return Long.parseLong(s);
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return 0L;
    }

    // 此方法包含解密的字符串
    public static String MTH4059(Uri uri0) {
        if("\uD8E3ontent".equals(uri0.getScheme())) {
            return CLS95.MTH2017().getContentResolver().getType(uri0);
        }
        String s = MimeTypeMap.getFileExtensionFromUrl(uri0.toString());
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(s.toLowerCase());
    }

    public static boolean MTH4060(InputStream inputStream0, File file0) {
        if(inputStream0 != null && file0 != null) {
            try {
                CLS262.MTH4057(file0.getParentFile());
                return CLS262.MTH4068(inputStream0, new BufferedOutputStream(new FileOutputStream(file0)));
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return false;
    }

    public static boolean MTH4061(File file0) {
        if(!CLS262.MTH4050(file0)) {
            return true;
        }
        if(file0.isDirectory()) {
            String[] arr_s = file0.list();
            return arr_s == null || arr_s.length == 0;
        }
        return false;
    }

    public static InputStream MTH4062(Uri uri0) {
        try {
            return CLS95.MTH2017().getContentResolver().openInputStream(uri0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    public static void MTH4063(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        CLS262.MTH4067(new File(s));
    }

    public static boolean MTH4064(CLS299 ـᵎ0, CLS299 ـᵎ1) {
        return ـᵎ0 == null || ـᵎ1 == null ? false : ـᵎ0.MTH4379().toString().equals(ـᵎ1.MTH4379().toString());
    }

    public static boolean MTH4065(File file0) {
        if(!CLS262.MTH4050(file0)) {
            return false;
        }
        try {
            return file0.delete();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH4066(File file0) {
        if(!CLS262.MTH4050(file0)) {
            return;
        }
        Activity activity0 = CLS246.MTH3657();
        if(activity0 == null) {
            return;
        }
        Uri uri0 = CLS65.MTH1219(activity0, file0);
        if(uri0 == null) {
            return;
        }
        Intent intent0 = new Intent("\uD8E3ndroid.intent.action.SEND");
        intent0.setType(URLConnection.guessContentTypeFromName(file0.getName()));
        intent0.putExtra("\uD8E3ndroid.intent.extra.STREAM", uri0);
        activity0.startActivity(Intent.createChooser(intent0, ""));
    }

    public static void MTH4067(File file0) {
        if(!CLS262.MTH4050(file0)) {
            return;
        }
        if(file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            if(arr_file != null) {
                for(int v = 0; v < arr_file.length; ++v) {
                    CLS262.MTH4067(arr_file[v]);
                }
            }
        }
        CLS262.MTH4065(file0);
    }

    public static boolean MTH4068(InputStream inputStream0, OutputStream outputStream0) {
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
                CLS204.MTH3257(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static String MTH4069(File file0) {
        if(!CLS262.MTH4050(file0)) {
            return "";
        }
        try {
            byte[] arr_b = CLS262.MTH4043(file0);
            return arr_b == null ? "" : new String(arr_b).trim();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static void MTH4070(String s) {
        try {
            JSONArray jSONArray0 = CLS95.MTH2031().MTH2738("\uD8E3leanup_files", new JSONArray());
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("\uD8E3ath", s);
            jSONObject0.put("\uD8E3ime", System.currentTimeMillis());
            jSONArray0.put(jSONObject0);
            CLS95.MTH2031().MTH2749("\uD8E3leanup_files", jSONArray0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public static boolean MTH4071(File file0, byte[] arr_b) {
        if(arr_b == null) {
            return false;
        }
        try {
            if(!CLS262.MTH4050(file0)) {
                return file0.createNewFile() ? CLS262.MTH4055(new FileOutputStream(file0), arr_b) : false;
            }
            if(!file0.canWrite()) {
                file0.setWritable(true);
            }
            return CLS262.MTH4055(new FileOutputStream(file0), arr_b);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3252(file0.getAbsolutePath());
            CLS204.MTH3257(throwable0);
            return false;
        }
    }

    public static OutputStream MTH4072(Uri uri0) {
        try {
            return CLS95.MTH2017().getContentResolver().openOutputStream(uri0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }
}

