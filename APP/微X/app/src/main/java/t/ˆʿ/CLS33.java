// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.widget.ImageView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import t.ʻˑ.CLS3;
import t.ʾᵢ.CLS15;
import t.ˊﾞ.CLS106;
import t.ˑٴ.CLS114;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS133;

public final class CLS33 {
    public static final int[] FLD455;
    public static final int[] FLD456;
    public static final int[] FLD457;
    public static final int[] FLD458;

    static {
        CLS33.FLD455 = new int[]{0x7F010000, 0x7F010001, 0x7F010002, 0x7F010003, 0x7F010004, 0x7F010005, 0x7F010006, 0x7F010007, 0x7F010008, 0x7F010009, 0x7F01000A, 0x7F01000B, 0x7F01000C, 0x7F01000D, 0x7F01000E, 0x7F01000F, 0x7F010010, 0x7F010011, 0x7F010012, 0x7F010013};
        CLS33.FLD457 = new int[]{0x7F010014, 0x7F010015, 0x7F010016, 0x7F010017, 0x7F010018, 0x7F010019, 0x7F01001A, 0x7F01001B, 0x7F01001C, 0x7F01001D, 0x7F01001E, 0x7F01001F, 0x7F010020, 0x7F010021, 0x7F010022, 0x7F010023, 0x7F010024, 0x7F010025, 0x7F010026, 0x7F010027, 0x7F010028, 0x7F010029, 0x7F01002A, 0x7F01002B, 0x7F01002C, 0x7F01002D, 0x7F01002E, 0x7F01002F, 0x7F010030, 0x7F010031, 0x7F010032, 0x7F010033, 0x7F010034, 0x7F010035, 0x7F010036, 0x7F010037, 0x7F010038, 0x7F010039, 0x7F01003A};
        CLS33.FLD456 = new int[]{0x7F010041, 0x7F010042, 0x7F010043, 0x7F010044, 0x7F010045, 0x7F010046, 0x7F010047, 0x7F010048, 0x7F010049, 0x7F01004A, 0x7F01004B, 0x7F01004C, 0x7F01004D, 0x7F01004E, 0x7F01004F, 0x7F010050, 0x7F010051, 0x7F010052, 0x7F010053, 0x7F010054, 0x7F010055, 0x7F010057, 0x7F010058, 0x7F010059, 0x7F01005A, 0x7F01005B, 0x7F01005C, 0x7F01005D, 0x7F01005E, 0x7F01005F, 0x7F010060, 0x7F010061};
        CLS33.FLD458 = new int[]{0x7F01003B, 0x7F01003C, 0x7F01003D, 0x7F01003E, 0x7F01003F, 0x7F010040};
    }

    // 此方法包含解密的字符串
    public static String MTH1342() {
        Object object0;
        if(!CLS133.MTH2110("LastLoginInfoClass")) {
            return "";
        }
        Class class0 = CLS133.MTH2111("LastLoginInfoClass");
        if(class0 == null) {
            return "";
        }
        try {
            String s = CLS133.MTH2115("LastLoginInfoClass_field1");
            try {
                object0 = CLS3.MTH997(class0, s).get(null);
            }
            catch(IllegalAccessException illegalAccessException0) {
                CLS133.MTH2113(illegalAccessException0);
                return "";
            }
            return (String)CLS3.MTH991(object0, CLS133.MTH2115("LastLoginInfoClass_getString"), new Object[]{"login_weixin_username", ""});
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1343() [...] // 潜在的解密器

    // 此方法包含解密的字符串
    public static Uri MTH1344(Context context0, File file0) {
        boolean z;
        int v;
        if(Build.VERSION.SDK_INT >= 24) {
            if(context0 == null) {
            label_14:
                v = 0;
            }
            else {
                try {
                    Context context1 = context0.getApplicationContext();
                    if(context1 == null) {
                        goto label_14;
                    }
                    else {
                        ApplicationInfo applicationInfo0 = context1.getApplicationInfo();
                        if(applicationInfo0 == null) {
                            goto label_14;
                        }
                        else {
                            v = applicationInfo0.targetSdkVersion;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                    v = 0;
                }
            }
            z = v >= 24;
        }
        else {
            z = false;
        }
        Uri uri0 = null;
        if(z) {
            Class class0 = CLS133.MTH2111("GetUriClass");
            if(class0 != null) {
                Class class1 = CLS133.MTH2111("GetUriClass2");
                if(class1 == null) {
                    uri0 = (Uri)CLS3.MTH996(class0, CLS133.MTH2115("GetUriMethod"), new Object[]{context0, file0});
                }
                else if(!CLS15.MTH1077(0xFFFFA9F42B3CF2B7L)) {
                    uri0 = (Uri)CLS3.MTH996(class0, CLS133.MTH2115("GetUriMethod_b"), new Object[]{context0, file0});
                }
                else if(!CLS15.MTH1077(-94737663200585L)) {
                    Object object0 = CLS3.MTH988(class1, new Object[]{file0.getAbsolutePath()});
                    uri0 = (Uri)CLS3.MTH996(class0, CLS133.MTH2115("GetUriMethod"), new Object[]{context0, object0});
                }
            }
            if(uri0 == null) {
                uri0 = (Uri)CLS123.FLD912.MTH2003("getUriFromProvider", new Object[]{file0});
            }
        }
        return uri0 == null ? Uri.fromFile(file0) : uri0;
    }

    public static boolean MTH1345(String s, String[] arr_s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(!TextUtils.isEmpty(s1) && s.contains(s1)) {
                return true;
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1346(String s) {
        boolean z2;
        boolean z1;
        boolean z;
        if(!TextUtils.isEmpty(s) && s.startsWith("wx_") && !CLS29.MTH1326(s)) {
            CLS34 ˊⁱ0 = CLS34.FLD463;
            HashSet hashSet0 = ˊⁱ0.FLD462;
            if(hashSet0.contains(s)) {
                z2 = true;
            }
            else {
                if(TextUtils.isEmpty(s)) {
                    goto label_21;
                label_24:
                    z1 = false;
                label_25:
                    CLS133.MTH2113(throwable0);
                label_26:
                    z = z1;
                }
                else if(CLS29.MTH1326(s)) {
                    z = ˊⁱ0.MTH1369(s);
                }
                else {
                    String s1 = CLS133.MTH2116(CLS114.MTH1900((s.endsWith("@stranger") ? -73030898486601L : -73060963257673L)));
                    try {
                        Cursor cursor0 = ˊⁱ0.MTH1364(s1, new String[]{s});
                        if(cursor0 == null) {
                            z = false;
                            goto label_27;
                        label_21:
                            z = false;
                        }
                        else {
                            z1 = !cursor0.moveToFirst() || cursor0.getInt(cursor0.getColumnIndex("type")) == 0 ? false : true;
                            try {
                                cursor0.close();
                                goto label_26;
                            }
                            catch(Throwable throwable0) {
                                goto label_25;
                            }
                        }
                    }
                    catch(Throwable throwable0) {
                        goto label_24;
                    }
                }
            label_27:
                if(z) {
                    hashSet0.add(s);
                    z2 = true;
                }
                else {
                    z2 = false;
                }
            }
            if(!z2 && (CLS133.MTH2103().MTH2131("chatroom_container", false) || CLS133.MTH2103().MTH2131("chatcontainer_enable", false))) {
                if(!CLS133.MTH2103().MTH2134("wx_chatroom_containers", "").contains(s) && !CLS33.MTH1345(s, new String[]{"wx__WORK_", "wx__MUTE_", "wx__OWN_", "wx__GH_"})) {
                    return !CLS32.FLD447.MTH1339("chatroom_container_tags") || !CLS133.MTH2103().MTH2131("chatroom_container_tag_enable", false) ? false : CLS133.MTH2103().MTH2134("chatroom_container_tags", "").contains(s.substring(3));
                }
                return true;
            }
            return false;
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1347(Intent intent0, String s) {
        if(CLS133.MTH2110("PluginHelperClass") && CLS133.MTH2110("PluginHelperMethod3")) {
            Class class0 = CLS133.MTH2111("PluginHelperClass");
            if(class0 != null) {
                try {
                    if(CLS133.MTH2110("PluginHelperMethod3")) {
                        CLS3.MTH996(class0, CLS133.MTH2115("PluginHelperMethod3"), new Object[]{CLS133.MTH2108(), s, intent0, null});
                        return true;
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1348(long v) {
        return String.format("%02d:%02d", ((int)(((int)(v / 1000L)) / 60)), ((int)(((int)(v / 1000L)) % 60)));
    }

    // 此方法包含解密的字符串
    public static boolean MTH1349(String s, String s1, Intent intent0) {
        if(CLS133.MTH2110("PluginHelperClass") && CLS133.MTH2110("PluginHelperMethod1")) {
            Class class0 = CLS133.MTH2111("PluginHelperClass");
            if(class0 == null) {
                return false;
            }
            try {
                if(CLS133.MTH2110("PluginHelperMethod1")) {
                    CLS3.MTH996(class0, CLS133.MTH2115("PluginHelperMethod1"), new Object[]{CLS133.MTH2108(), s, s1, intent0});
                    return true;
                }
                if(CLS133.MTH2110("PluginHelperMethod1_b")) {
                    CLS3.MTH996(class0, CLS133.MTH2115("PluginHelperMethod1_b"), new Object[]{CLS133.MTH2108(), s, s1, intent0, null});
                    return true;
                }
                if(CLS133.MTH2110("PluginHelperMethod1_c")) {
                    CLS3.MTH996(class0, CLS133.MTH2115("PluginHelperMethod1_c"), new Object[]{CLS133.MTH2108(), s, s1, null, intent0});
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static void MTH1350(ImageView imageView0, String s) {
        Class class0 = CLS133.MTH2111("avatarClass3");
        if(class0 == null) {
            return;
        }
        CLS3.MTH996(class0, CLS133.MTH2115("avatarMethod4"), new Object[]{imageView0, s});
    }

    public static void MTH1351(File file0) {
        if(!CLS125.MTH2023(file0) || !file0.isDirectory()) {
            CLS125.MTH2026(new CLS106(file0));
        }
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public static String[] MTH1352(String s) {
        if(TextUtils.isEmpty(s)) {
            return new String[0];
        }
        if(s.contains(",")) {
            return s.split(",");
        }
        if(s.contains(";")) {
            return s.split(";");
        }
        if(s.contains(":")) {
            return s.split(":");
        }
        if(s.contains(" ")) {
            return s.split(" ");
        }
        if(s.contains("，")) {
            return s.split("，");
        }
        if(s.contains("；")) {
            return s.split("；");
        }
        if(s.contains("：")) {
            return s.split("：");
        }
        if(s.contains("\n\r")) {
            return s.split("\n\r");
        }
        return s.contains("\n") ? s.split("\n") : s.split(",");
    }

    // 此方法包含解密的字符串
    public static boolean MTH1353(String s, String s1) {
        Calendar calendar0 = Calendar.getInstance();
        String s2 = new SimpleDateFormat("HH:mm").format(calendar0.getTime());
        int v = s2.compareTo(s);
        if(s.compareTo(s1) < 0) {
            return v >= 0 && s2.compareTo(s1) <= 0;
        }
        int v1 = s2.compareTo(s1);
        return v > 0 ? v1 >= 0 : v1 <= 0;
    }

    public static boolean MTH1354(String s, CharSequence[] arr_charSequence) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        String s1 = s.toLowerCase();
        for(int v = 0; v < arr_charSequence.length; ++v) {
            CharSequence charSequence0 = arr_charSequence[v];
            if(!TextUtils.isEmpty(charSequence0) && s1.contains(charSequence0.toString().toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static byte[] MTH1355(String s) {
        byte[] arr_b1;
        InputStream inputStream0;
        try {
            URL uRL0 = new URL(s);
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            try {
                byte[] arr_b = new byte[0x1000];
                inputStream0 = uRL0.openStream();
                int v;
                while((v = inputStream0.read(arr_b)) > 0) {
                    byteArrayOutputStream0.write(arr_b, 0, v);
                }
                arr_b1 = byteArrayOutputStream0.toByteArray();
            }
            catch(Throwable throwable1) {
                CLS133.MTH2113(throwable1);
                return null;
            }
            try {
                byteArrayOutputStream0.close();
                inputStream0.close();
                return arr_b1;
            }
            catch(Throwable throwable1) {
            }
            CLS133.MTH2113(throwable1);
            return arr_b1;
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
            return null;
        }
    }

    public static boolean MTH1356(InputStream inputStream0, File file0) {
        CLS33.MTH1351(file0);
        try {
            ZipInputStream zipInputStream0 = new ZipInputStream(inputStream0);
            ZipEntry zipEntry0;
            while((zipEntry0 = zipInputStream0.getNextEntry()) != null) {
                if(zipEntry0.isDirectory()) {
                    CLS33.MTH1351(new File(file0, zipEntry0.getName()));
                }
                else {
                    FileOutputStream fileOutputStream0 = new FileOutputStream(new File(file0, zipEntry0.getName()));
                    int v;
                    while((v = zipInputStream0.read()) != -1) {
                        fileOutputStream0.write(v);
                    }
                    zipInputStream0.closeEntry();
                    fileOutputStream0.close();
                }
            }
            zipInputStream0.close();
            return true;
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
            return false;
        }
    }

    public static long MTH1357(long v) {
        int v1 = (short)(((int)(v & 0xFFFFL)));
        int v2 = (short)(((int)(v >>> 16 & 0xFFFFL)));
        int v3 = (short)(v1 + v2);
        int v4 = (short)(v2 ^ v1);
        return (((long)(((short)(v4 >>> 22 | v4 << 10)))) | ((long)(((short)(((short)(v3 >>> 23 | v3 << 9)) + v1)))) << 16) << 16 | ((long)(((short)(((short)(((short)(v1 << 13 | v1 >>> 19)) ^ v4)) ^ v4 << 5))));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Object MTH1358() {
        try {
            if(CLS133.MTH2110("MMKernelClass")) {
                Class class1 = CLS133.MTH2111("MMKernelClass");
                if(class1 != null) {
                    return CLS3.MTH996(class1, CLS133.MTH2115("MMKernelClass_getCoreStorageMethod"), new Object[0]);
                }
            }
            else if(CLS133.MTH2110("favClass1_a") && CLS133.MTH2110("privacySettingsMethod1b")) {
                Class class0 = CLS133.MTH2111("favClass1_a");
                if(class0 != null) {
                    return CLS3.MTH996(class0, CLS133.MTH2115("privacySettingsMethod1b"), new Object[0]);
                }
            }
            else if(CLS133.MTH2110("privacySettingsMethod1")) {
                return CLS3.MTH991(CLS3.MTH996(CLS133.MTH2111("dbClass1"), CLS133.MTH2115("dbMethod1"), new Object[0]), CLS133.MTH2115("privacySettingsMethod1"), new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static Bitmap MTH1359(String s) {
        Bitmap bitmap1;
        Bitmap bitmap0;
        Class class0 = CLS133.MTH2111("avatarClass2");
        if(class0 == null) {
            return null;
        }
        if(CLS133.MTH2110("avatarMethod3")) {
            bitmap0 = (Bitmap)CLS3.MTH996(class0, CLS133.MTH2115("avatarMethod3"), new Object[]{s, Boolean.FALSE, -1});
        }
        else {
            bitmap0 = CLS133.MTH2110("avatarMethod3b") ? ((Bitmap)CLS3.MTH996(class0, CLS133.MTH2115("avatarMethod3b"), new Object[]{s, Boolean.FALSE, -1, null})) : null;
        }
        if(bitmap0 != null && !bitmap0.isRecycled()) {
            return bitmap0;
        }
        Class class1 = CLS133.MTH2111("avatarClass");
        if(class1 != null) {
            if(CLS133.MTH2110("avatarMethod2")) {
                bitmap1 = (Bitmap)CLS3.MTH991(CLS3.MTH996(class1, CLS133.MTH2115("avatarMethod1"), new Object[0]), CLS133.MTH2115("avatarMethod2"), new Object[]{s, Boolean.FALSE, -1});
            }
            else {
                bitmap1 = CLS133.MTH2110("avatarMethod2b") ? ((Bitmap)CLS3.MTH991(CLS3.MTH996(class1, CLS133.MTH2115("avatarMethod1"), new Object[0]), CLS133.MTH2115("avatarMethod2b"), new Object[]{s, Boolean.FALSE, -1, null})) : null;
            }
            if(bitmap1 != null && !bitmap1.isRecycled()) {
                return bitmap1;
            }
            Class class2 = CLS133.MTH2111("avatarClass");
            if(class2 != null && CLS133.MTH2110("getAvatarStorageMethod")) {
                try {
                    Object object0 = CLS3.MTH996(class2, CLS133.MTH2115("getAvatarStorageMethod"), new Object[0]);
                    if(object0 != null) {
                        bitmap1 = (Bitmap)CLS3.MTH991(object0, CLS133.MTH2115("avatarCacheMethod"), new Object[]{s});
                        goto label_25;
                    }
                    return null;
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                    bitmap1 = null;
                }
            label_25:
                if(bitmap1 != null && !bitmap1.isRecycled()) {
                    return bitmap1;
                }
                Class class3 = CLS133.MTH2111("avatarClass");
                if(class3 != null && CLS133.MTH2110("avatarStorage_getAvatarFileMethod")) {
                    try {
                        Object object1 = CLS3.MTH996(class3, CLS133.MTH2115("getAvatarStorageMethod"), new Object[0]);
                        if(object1 != null) {
                            String s1 = (String)CLS3.MTH991(object1, CLS133.MTH2115("avatarStorage_getAvatarFileMethod"), new Object[]{s, Boolean.FALSE});
                            if(!TextUtils.isEmpty(s1)) {
                                if(CLS133.MTH2110("avatarStorage_decodeFileMethod")) {
                                    return CLS3.MTH996(object1.getClass(), CLS133.MTH2115("avatarStorage_decodeFileMethod"), new Object[]{s1, s, Boolean.TRUE});
                                }
                                if(CLS133.MTH2110("avatarStorage_decodeFileMethod_b")) {
                                    return CLS3.MTH996(object1.getClass(), CLS133.MTH2115("avatarStorage_decodeFileMethod_b"), new Object[]{s1, Boolean.TRUE});
                                }
                            }
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS133.MTH2113(throwable1);
                    }
                    return null;
                }
            }
        }
        return null;
    }
}

