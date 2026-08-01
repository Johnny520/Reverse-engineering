// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import c.ˈⁱ.CLS95;
import c.ˑʼ.CLS129;
import c.ٴˑ.CLS299;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;

public class CLS243 {
    public static CLS129 FLD1058;
    public static CLS129 FLD1059;

    static {
        CLS243.FLD1059 = new CLS129(300000L);
        CLS243.FLD1058 = new CLS129(300000L);
    }

    public static boolean MTH3601(Context context0, File file0, int v, ArrayList arrayList0) {
        CLS299 ـᵎ0 = CLS243.MTH3619(context0, v, arrayList0);
        if(ـᵎ0 != null && file0 != null) {
            CLS205.MTH3260();
            return CLS205.MTH3261(ـᵎ0, file0);
        }
        return false;
    }

    public static InputStream MTH3602(Context context0, int v, ArrayList arrayList0, String s) {
        Uri uri0 = CLS243.MTH3603(context0, v, arrayList0, s);
        return uri0 == null ? null : CLS262.MTH4062(uri0);
    }

    public static Uri MTH3603(Context context0, int v, ArrayList arrayList0, String s) {
        String s1 = arrayList0 == null || arrayList0.isEmpty() ? v + s : v + s + TextUtils.join("_", arrayList0);
        if(CLS243.FLD1059.MTH2483(s1)) {
            return (Uri)CLS243.FLD1059.MTH2486(s1);
        }
        CLS299 ـᵎ0 = CLS243.MTH3643(context0, v, s, arrayList0);
        if(ـᵎ0 != null) {
            Uri uri0 = ـᵎ0.MTH4379();
            CLS243.FLD1059.MTH2484(s1, uri0);
            return uri0;
        }
        return null;
    }

    public static void MTH3604(CLS299 ـᵎ0, CLS299 ـᵎ1) {
        if(CLS262.MTH4064(ـᵎ0, ـᵎ1)) {
            return;
        }
        if(ـᵎ0.MTH4376()) {
            CLS299[] arr_ـᵎ = ـᵎ0.MTH4387();
            if(arr_ـᵎ != null && arr_ـᵎ.length != 0) {
                for(int v = 0; v < arr_ـᵎ.length; ++v) {
                    CLS299 ـᵎ2 = arr_ـᵎ[v];
                    if(ـᵎ2.MTH4376()) {
                        CLS299 ـᵎ3 = ـᵎ1.MTH4388(ـᵎ2.MTH4378());
                        if(ـᵎ3 == null) {
                            ـᵎ3 = ـᵎ1.MTH4386(ـᵎ2.MTH4378());
                        }
                        CLS243.MTH3604(ـᵎ2, ـᵎ3);
                    }
                    else {
                        CLS243.MTH3604(ـᵎ2, ـᵎ1);
                    }
                }
                return;
            }
            return;
        }
        if(ـᵎ1.MTH4388(ـᵎ0.MTH4378()) == null) {
            CLS299 ـᵎ4 = ـᵎ1.MTH4391(CLS262.MTH4059(ـᵎ0.MTH4379()), ـᵎ0.MTH4378());
            try {
                CLS262.MTH4068(CLS243.MTH3631(ـᵎ0), CLS243.MTH3607(ـᵎ4));
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
    }

    public static ArrayList MTH3605(Context context0, int v) {
        return CLS243.MTH3608(context0, v, null);
    }

    public static boolean MTH3606(Context context0, int v, String s, String s1) {
        return CLS243.MTH3609(context0, v, null, s, s1);
    }

    public static OutputStream MTH3607(CLS299 ـᵎ0) {
        return CLS262.MTH4072(ـᵎ0.MTH4379());
    }

    public static ArrayList MTH3608(Context context0, int v, ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        CLS299 ـᵎ0 = CLS243.MTH3619(context0, v, arrayList0);
        if(ـᵎ0 != null) {
            CLS299[] arr_ـᵎ = ـᵎ0.MTH4387();
            for(int v1 = 0; v1 < arr_ـᵎ.length; ++v1) {
                arrayList1.add(arr_ـᵎ[v1].MTH4378());
            }
        }
        return arrayList1;
    }

    public static boolean MTH3609(Context context0, int v, ArrayList arrayList0, String s, String s1) {
        CLS299 ـᵎ0 = CLS243.MTH3643(context0, v, s, arrayList0);
        return ـᵎ0 == null ? false : ـᵎ0.MTH4385(s1);
    }

    public static CLS299 MTH3610(CLS299 ـᵎ0, String s) {
        CLS299 ـᵎ1 = ـᵎ0.MTH4388(s);
        if(ـᵎ1 != null) {
            return ـᵎ1;
        }
        CLS299[] arr_ـᵎ = ـᵎ0.MTH4387();
        for(int v = 0; v < arr_ـᵎ.length; ++v) {
            CLS299 ـᵎ2 = arr_ـᵎ[v];
            String s1 = ـᵎ2.MTH4378();
            if(!TextUtils.isEmpty(s1) && s1.startsWith(s)) {
                return ـᵎ2;
            }
        }
        return null;
    }

    public static void MTH3611(File file0, CLS299 ـᵎ0) {
        CLS243.MTH3641(file0, ـᵎ0, null, false);
    }

    public static File MTH3612() {
        File file0 = CLS243.MTH3630();
        File file1 = null;
        if(file0 != null) {
            if(!CLS262.MTH4050(file0) && !CLS262.MTH4057(file0)) {
                return null;
            }
            if(file0.canWrite()) {
                file1 = new File(file0, "BACKUP_DATABASE");
                if(!CLS262.MTH4050(file1)) {
                    CLS262.MTH4057(file1);
                }
            }
        }
        return file1;
    }

    public static void MTH3613(Context context0, int v, String s, String s1, ArrayList arrayList0) {
        CLS299 ـᵎ0 = CLS243.MTH3619(context0, v, arrayList0);
        if(ـᵎ0 == null) {
            return;
        }
        CLS299 ـᵎ1 = ـᵎ0.MTH4388(s);
        if(ـᵎ1 == null) {
            return;
        }
        if(CLS243.MTH3616(ـᵎ0, s1)) {
            return;
        }
        CLS243.MTH3604(ـᵎ1, ـᵎ0.MTH4386(s1));
    }

    public static CLS299 MTH3614(Context context0, int v) {
        CLS299 ـᵎ0;
        try {
            Context context1 = context0;
            switch(v) {
                case 1: {
                    if(context1 == null) {
                        context1 = CLS95.MTH2017();
                    }
                    if(context1 == null) {
                        ـᵎ0 = null;
                    }
                    else {
                        String s = CLS95.MTH2031().MTH2733("module_dir_uri", "");
                        ـᵎ0 = CLS257.MTH3744(context1, s) ? CLS299.MTH4383(CLS95.MTH2017(), Uri.parse(s)) : null;
                    }
                    return ـᵎ0 != null && ـᵎ0.MTH4373() ? ـᵎ0 : null;
                }
                case 2: {
                    CLS299 ـᵎ1 = CLS243.MTH3614(context1, 1);
                    if(ـᵎ1 != null) {
                        return CLS243.MTH3616(ـᵎ1, "images") ? ـᵎ1.MTH4388("images") : ـᵎ1.MTH4386("images");
                    }
                    return null;
                }
                case 3: {
                    CLS299 ـᵎ2 = CLS243.MTH3614(context1, 1);
                    if(ـᵎ2 != null) {
                        return CLS243.MTH3616(ـᵎ2, "sounds") ? ـᵎ2.MTH4388("sounds") : ـᵎ2.MTH4386("sounds");
                    }
                    return null;
                }
                case 4: {
                    CLS299 ـᵎ3 = CLS243.MTH3614(context1, 1);
                    if(ـᵎ3 != null) {
                        return CLS243.MTH3616(ـᵎ3, "voice_mp3_temp") ? ـᵎ3.MTH4388("voice_mp3_temp") : ـᵎ3.MTH4386("voice_mp3_temp");
                    }
                    return null;
                }
                case 5: {
                    CLS299 ـᵎ4 = CLS243.MTH3614(context1, 1);
                    if(ـᵎ4 != null) {
                        return CLS243.MTH3616(ـᵎ4, "downloads") ? ـᵎ4.MTH4388("downloads") : ـᵎ4.MTH4386("downloads");
                    }
                    return null;
                }
                case 6: {
                    CLS299 ـᵎ5 = CLS243.MTH3614(context1, 5);
                    if(ـᵎ5 != null) {
                        return CLS243.MTH3616(ـᵎ5, "images") ? ـᵎ5.MTH4388("images") : ـᵎ5.MTH4386("images");
                    }
                    return null;
                }
                case 7: {
                    CLS299 ـᵎ6 = CLS243.MTH3614(context1, 5);
                    if(ـᵎ6 != null) {
                        return CLS243.MTH3616(ـᵎ6, "videos") ? ـᵎ6.MTH4388("videos") : ـᵎ6.MTH4386("videos");
                    }
                    return null;
                }
                case 8: {
                    CLS299 ـᵎ7 = CLS243.MTH3614(context1, 1);
                    if(ـᵎ7 != null) {
                        return CLS243.MTH3616(ـᵎ7, "cache") ? ـᵎ7.MTH4388("cache") : ـᵎ7.MTH4386("cache");
                    }
                    return null;
                }
                case 9: {
                    CLS299 ـᵎ8 = CLS243.MTH3614(context1, 1);
                    if(ـᵎ8 != null) {
                        return CLS243.MTH3616(ـᵎ8, "assets") ? ـᵎ8.MTH4388("assets") : ـᵎ8.MTH4386("assets");
                    }
                    return null;
                }
                case 10: {
                    CLS299 ـᵎ9 = CLS243.MTH3614(context1, 1);
                    if(ـᵎ9 != null) {
                        return CLS243.MTH3616(ـᵎ9, "WxThemes") ? ـᵎ9.MTH4388("WxThemes") : ـᵎ9.MTH4386("WxThemes");
                    }
                    return null;
                }
                case 11: {
                    CLS299 ـᵎ10 = CLS243.MTH3614(context1, 1);
                    if(ـᵎ10 != null) {
                        return CLS243.MTH3616(ـᵎ10, "voice") ? ـᵎ10.MTH4388("voice") : ـᵎ10.MTH4386("voice");
                    }
                    return null;
                }
                case 12: {
                    CLS299 ـᵎ11 = CLS243.MTH3614(context1, 1);
                    if(ـᵎ11 != null) {
                        return CLS243.MTH3616(ـᵎ11, "Records") ? ـᵎ11.MTH4388("Records") : ـᵎ11.MTH4386("Records");
                    }
                    return null;
                }
                case 13: {
                    CLS299 ـᵎ12 = CLS243.MTH3614(context1, 1);
                    if(ـᵎ12 != null) {
                        return CLS243.MTH3616(ـᵎ12, "moments") ? ـᵎ12.MTH4388("moments") : ـᵎ12.MTH4386("moments");
                    }
                    return null;
                }
                case 14: {
                    CLS299 ـᵎ13 = CLS243.MTH3614(context1, 1);
                    if(ـᵎ13 != null) {
                        return CLS243.MTH3616(ـᵎ13, "chat") ? ـᵎ13.MTH4388("chat") : ـᵎ13.MTH4386("chat");
                    }
                    return null;
                }
                case 15: {
                    CLS299 ـᵎ14 = CLS243.MTH3614(context1, 1);
                    if(ـᵎ14 != null) {
                        return CLS243.MTH3616(ـᵎ14, "WebFavImgCache") ? ـᵎ14.MTH4388("WebFavImgCache") : ـᵎ14.MTH4386("WebFavImgCache");
                    }
                    return null;
                }
                default: {
                    return CLS299.MTH4389(context0.getExternalCacheDir());
                }
            }
        }
        catch(Throwable throwable0) {
        }
        CLS204.MTH3253(throwable0, false, true);
        CLS204.MTH3255(("getModuleDirUserSelected: " + v), false, true);
        return null;
    }

    public static InputStream MTH3615(Context context0, int v, String s) {
        return CLS243.MTH3602(context0, v, null, s);
    }

    public static boolean MTH3616(CLS299 ـᵎ0, String s) {
        if(ـᵎ0 == null) {
            return false;
        }
        try {
            if(ـᵎ0.MTH4388(s) != null) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return false;
    }

    public static OutputStream MTH3617(Context context0, int v, String s, String s1) {
        return CLS243.MTH3644(context0, v, null, s, s1);
    }

    // 此方法包含解密的字符串
    public static File MTH3618(Context context0, int v) {
        try {
            switch(v) {
                case 1: {
                    if(context0 == null) {
                        context0 = CLS95.MTH2017();
                    }
                    if(context0 != null) {
                        return new File(context0.getFilesDir(), "\uD8E3");
                    }
                    goto label_6;
                }
                case 2: {
                label_6:
                    File file0 = CLS243.MTH3618(context0, 1);
                    if(file0 != null) {
                        if(!CLS262.MTH4050(file0) && !CLS262.MTH4057(file0)) {
                            return null;
                        }
                        if(file0.canWrite()) {
                            return new File(file0, "images");
                        }
                    }
                    break;
                }
                case 3: {
                    File file1 = CLS243.MTH3618(context0, 1);
                    if(file1 != null) {
                        if(!CLS262.MTH4050(file1) && !CLS262.MTH4057(file1)) {
                            return null;
                        }
                        if(file1.canWrite()) {
                            return new File(file1, "sounds");
                        }
                    }
                    break;
                }
                case 4: {
                    File file2 = CLS243.MTH3618(context0, 1);
                    if(file2 != null) {
                        if(!CLS262.MTH4050(file2) && !CLS262.MTH4057(file2)) {
                            return null;
                        }
                        if(file2.canWrite()) {
                            return new File(file2, "voice_mp3_temp");
                        }
                    }
                    break;
                }
                case 5: {
                    File file3 = CLS243.MTH3618(context0, 1);
                    if(file3 != null) {
                        if(!CLS262.MTH4050(file3) && !CLS262.MTH4057(file3)) {
                            return null;
                        }
                        if(file3.canWrite()) {
                            return new File(file3, "downloads");
                        }
                    }
                    break;
                }
                case 6: {
                    File file4 = CLS243.MTH3618(context0, 5);
                    if(file4 != null) {
                        if(!CLS262.MTH4050(file4) && !CLS262.MTH4057(file4)) {
                            return null;
                        }
                        if(file4.canWrite()) {
                            return new File(file4, "images");
                        }
                    }
                    break;
                }
                case 7: {
                    File file5 = CLS243.MTH3618(context0, 5);
                    if(file5 != null) {
                        if(!CLS262.MTH4050(file5) && !CLS262.MTH4057(file5)) {
                            return null;
                        }
                        if(file5.canWrite()) {
                            return new File(file5, "videos");
                        }
                    }
                    break;
                }
                case 8: {
                    File file6 = CLS243.MTH3618(context0, 1);
                    if(file6 != null) {
                        if(!CLS262.MTH4050(file6) && !CLS262.MTH4057(file6)) {
                            return null;
                        }
                        if(file6.canWrite()) {
                            return new File(file6, "cache");
                        }
                    }
                    break;
                }
                case 9: {
                    File file7 = CLS243.MTH3618(context0, 1);
                    if(file7 != null) {
                        if(!CLS262.MTH4050(file7) && !CLS262.MTH4057(file7)) {
                            return null;
                        }
                        if(file7.canWrite()) {
                            return new File(file7, "assets");
                        }
                    }
                    break;
                }
                case 10: {
                    File file8 = CLS243.MTH3618(context0, 1);
                    if(file8 != null) {
                        if(!CLS262.MTH4050(file8) && !CLS262.MTH4057(file8)) {
                            return null;
                        }
                        if(file8.canWrite()) {
                            return new File(file8, "WxThemes");
                        }
                    }
                    break;
                }
                case 11: {
                    File file9 = CLS243.MTH3618(context0, 1);
                    if(file9 != null) {
                        if(!CLS262.MTH4050(file9) && !CLS262.MTH4057(file9)) {
                            return null;
                        }
                        if(file9.canWrite()) {
                            return new File(file9, "voice");
                        }
                    }
                    break;
                }
                case 12: {
                    File file10 = CLS243.MTH3618(context0, 1);
                    if(file10 != null) {
                        if(!CLS262.MTH4050(file10) && !CLS262.MTH4057(file10)) {
                            return null;
                        }
                        if(file10.canWrite()) {
                            return new File(file10, "Records");
                        }
                    }
                    break;
                }
                case 13: {
                    File file11 = CLS243.MTH3618(context0, 1);
                    if(file11 != null) {
                        if(!CLS262.MTH4050(file11) && !CLS262.MTH4057(file11)) {
                            return null;
                        }
                        if(file11.canWrite()) {
                            return new File(file11, "moments");
                        }
                    }
                    break;
                }
                case 14: {
                    File file12 = CLS243.MTH3618(context0, 1);
                    if(file12 != null) {
                        if(!CLS262.MTH4050(file12) && !CLS262.MTH4057(file12)) {
                            return null;
                        }
                        if(file12.canWrite()) {
                            return new File(file12, "chat");
                        }
                    }
                    break;
                }
                default: {
                    return context0.getCacheDir();
                }
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3253(throwable0, false, true);
            CLS204.MTH3255(("getModuleDirInWechatFiles: " + v), false, true);
        }
        return null;
    }

    public static CLS299 MTH3619(Context context0, int v, ArrayList arrayList0) {
        CLS299 ـᵎ0 = CLS243.MTH3632(context0, v);
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                String s = (String)object0;
                CLS299 ـᵎ1 = ـᵎ0.MTH4388(s);
                ـᵎ0 = ـᵎ1 == null ? ـᵎ0.MTH4386(s) : ـᵎ1;
            }
        }
        return ـᵎ0;
    }

    public static File MTH3620(Context context0) {
        return new File(context0.getFilesDir().getParentFile(), "databases");
    }

    public static boolean MTH3621(CLS299 ـᵎ0) {
        if(ـᵎ0 == null) {
            return false;
        }
        try {
            if(ـᵎ0.MTH4376()) {
                CLS299[] arr_ـᵎ = ـᵎ0.MTH4387();
                for(int v = 0; v < arr_ـᵎ.length; ++v) {
                    CLS243.MTH3621(arr_ـᵎ[v]);
                }
                ـᵎ0.MTH4375();
                return false;
            }
            return ـᵎ0.MTH4375();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return false;
        }
    }

    public static CLS299 MTH3622(Uri uri0) {
        return CLS299.MTH4380(CLS95.MTH2017(), uri0);
    }

    // 此方法包含解密的字符串
    public static File MTH3623(Context context0, int v, boolean z) {
        try {
            switch(v) {
                case 1: {
                    return CLS175.MTH3057(context0, "\uD8E3");
                }
                case 2: {
                    File file0 = CLS243.MTH3623(context0, 1, z);
                    if(file0 != null) {
                        if(!CLS262.MTH4050(file0)) {
                            CLS262.MTH4057(file0);
                        }
                        if(z || file0.canWrite()) {
                            return new File(file0, "images");
                        }
                    }
                    break;
                }
                case 3: {
                    File file1 = CLS243.MTH3623(context0, 1, z);
                    if(file1 != null) {
                        if(!CLS262.MTH4050(file1)) {
                            CLS262.MTH4057(file1);
                        }
                        if(z || file1.canWrite()) {
                            return new File(file1, "sounds");
                        }
                    }
                    break;
                }
                case 4: {
                    File file2 = CLS243.MTH3623(context0, 1, z);
                    if(file2 != null) {
                        if(!CLS262.MTH4050(file2)) {
                            CLS262.MTH4057(file2);
                        }
                        if(z || file2.canWrite()) {
                            return new File(file2, "voice_mp3_temp");
                        }
                    }
                    break;
                }
                case 5: {
                    File file3 = CLS243.MTH3623(context0, 1, z);
                    if(file3 != null) {
                        if(!CLS262.MTH4050(file3)) {
                            CLS262.MTH4057(file3);
                        }
                        if(z || file3.canWrite()) {
                            return new File(file3, "downloads");
                        }
                    }
                    break;
                }
                case 6: {
                    File file4 = CLS243.MTH3623(context0, 5, z);
                    if(file4 != null) {
                        if(!CLS262.MTH4050(file4)) {
                            CLS262.MTH4057(file4);
                        }
                        if(z || file4.canWrite()) {
                            return new File(file4, "images");
                        }
                    }
                    break;
                }
                case 7: {
                    File file5 = CLS243.MTH3623(context0, 5, z);
                    if(file5 != null) {
                        if(!CLS262.MTH4050(file5)) {
                            CLS262.MTH4057(file5);
                        }
                        if(z || file5.canWrite()) {
                            return new File(file5, "videos");
                        }
                    }
                    break;
                }
                case 8: {
                    File file6 = CLS243.MTH3623(context0, 1, z);
                    if(file6 != null) {
                        if(!CLS262.MTH4050(file6)) {
                            CLS262.MTH4057(file6);
                        }
                        if(z || file6.canWrite()) {
                            return new File(file6, "cache");
                        }
                    }
                    break;
                }
                case 9: {
                    File file7 = CLS243.MTH3623(context0, 1, z);
                    if(file7 != null) {
                        if(!CLS262.MTH4050(file7)) {
                            CLS262.MTH4057(file7);
                        }
                        if(z || file7.canWrite()) {
                            return new File(file7, "assets");
                        }
                    }
                    break;
                }
                case 10: {
                    File file8 = CLS243.MTH3623(context0, 1, z);
                    if(file8 != null) {
                        if(!CLS262.MTH4050(file8)) {
                            CLS262.MTH4057(file8);
                        }
                        if(z || file8.canWrite()) {
                            return new File(file8, "WxThemes");
                        }
                    }
                    break;
                }
                case 11: {
                    File file9 = CLS243.MTH3623(context0, 1, z);
                    if(file9 != null) {
                        if(!CLS262.MTH4050(file9)) {
                            CLS262.MTH4057(file9);
                        }
                        if(z || file9.canWrite()) {
                            return new File(file9, "voice");
                        }
                    }
                    break;
                }
                case 12: {
                    File file10 = CLS243.MTH3623(context0, 1, z);
                    if(file10 != null) {
                        if(!CLS262.MTH4050(file10)) {
                            CLS262.MTH4057(file10);
                        }
                        if(z || file10.canWrite()) {
                            return new File(file10, "Records");
                        }
                    }
                    break;
                }
                case 13: {
                    File file11 = CLS243.MTH3623(context0, 1, z);
                    if(file11 != null) {
                        if(!CLS262.MTH4050(file11)) {
                            CLS262.MTH4057(file11);
                        }
                        if(z || file11.canWrite()) {
                            return new File(file11, "moments");
                        }
                    }
                    break;
                }
                case 14: {
                    File file12 = CLS243.MTH3623(context0, 1, z);
                    if(file12 != null) {
                        if(!CLS262.MTH4050(file12)) {
                            CLS262.MTH4057(file12);
                        }
                        if(z || file12.canWrite()) {
                            return new File(file12, "chat");
                        }
                    }
                    break;
                }
                default: {
                    return CLS262.MTH4041(context0);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3253(throwable0, false, true);
            CLS204.MTH3255(("getModuleDirInternal: " + v), false, true);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static void MTH3624(CLS299 ـᵎ0) {
        if(ـᵎ0 == null) {
            return;
        }
        Uri uri0 = ـᵎ0.MTH4379();
        Intent intent0 = new Intent("android.intent.action.SEND");
        intent0.setType(ـᵎ0.MTH4384());
        intent0.putExtra("android.intent.extra.STREAM", uri0);
        CLS246.MTH3657().startActivity(Intent.createChooser(intent0, ""));
    }

    public static File MTH3625(Context context0, int v) {
        return CLS243.MTH3623(context0, v, false);
    }

    public static CLS299 MTH3626(String s) {
        return CLS243.MTH3622(Uri.parse(s));
    }

    public static CLS299 MTH3627(Context context0, int v) {
        File file0 = CLS243.MTH3637(context0, v);
        if(!CLS262.MTH4050(file0)) {
            CLS262.MTH4057(file0);
        }
        if(file0 == null || !file0.canWrite()) {
            file0 = CLS243.MTH3618(context0, v);
            CLS262.MTH4057(file0);
        }
        return file0 == null || !file0.canWrite() ? null : CLS299.MTH4389(file0);
    }

    public static void MTH3628(Activity activity0, int v) {
        CLS218 ˑٴ0 = new CLS218(activity0);
        ˑٴ0.MTH3406();
        ˑٴ0.MTH3403();
        ˑٴ0.MTH3423();
        ˑٴ0.MTH3407(CLS243.MTH3632(activity0, v), null);
    }

    public static boolean MTH3629(ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            try {
                for(Object object0: arrayList0) {
                    CLS243.MTH3621(((CLS299)object0));
                }
                return true;
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        return false;
    }

    public static File MTH3630() {
        File file0 = CLS243.MTH3637(CLS95.MTH2017(), 1);
        File file1 = null;
        if(file0 != null) {
            if(!CLS262.MTH4050(file0) && !CLS262.MTH4057(file0)) {
                return null;
            }
            if(file0.canWrite()) {
                file1 = new File(file0, "BACKUP");
                if(!CLS262.MTH4050(file1)) {
                    CLS262.MTH4057(file1);
                }
            }
        }
        return file1;
    }

    public static InputStream MTH3631(CLS299 ـᵎ0) {
        return CLS262.MTH4062(ـᵎ0.MTH4379());
    }

    public static CLS299 MTH3632(Context context0, int v) {
        if(CLS257.MTH3721()) {
            return CLS243.MTH3614(context0, v);
        }
        if(Build.VERSION.SDK_INT >= 30 && CLS257.MTH3730(context0) >= 30 && context0 != null) {
            return CLS243.MTH3627(context0, v);
        }
        if(Environment.getExternalStorageDirectory().canWrite()) {
            File file0 = CLS243.MTH3625(context0, v);
            return file0 == null || !file0.canWrite() ? CLS243.MTH3627(context0, v) : CLS299.MTH4389(file0);
        }
        if(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).canWrite()) {
            File file1 = CLS243.MTH3649(context0, v);
            return file1 == null || !file1.canWrite() ? CLS243.MTH3627(context0, v) : CLS299.MTH4389(file1);
        }
        return CLS243.MTH3627(context0, v);
    }

    public static void MTH3633(File file0, int v) {
        CLS243.MTH3611(file0, CLS243.MTH3632(CLS95.MTH2017(), v));
    }

    // 此方法包含解密的字符串
    public static File MTH3634(Context context0, int v, boolean z) {
        try {
            switch(v) {
                case 1: {
                    return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "\uD8E3");
                }
                case 2: {
                    File file0 = CLS243.MTH3634(context0, 1, z);
                    if(file0 != null) {
                        if(!CLS262.MTH4050(file0)) {
                            CLS262.MTH4057(file0);
                        }
                        if(z || file0.canWrite()) {
                            return new File(file0, "images");
                        }
                    }
                    break;
                }
                case 3: {
                    File file1 = CLS243.MTH3634(context0, 1, z);
                    if(file1 != null) {
                        if(!CLS262.MTH4050(file1)) {
                            CLS262.MTH4057(file1);
                        }
                        if(z || file1.canWrite()) {
                            return new File(file1, "sounds");
                        }
                    }
                    break;
                }
                case 4: {
                    File file2 = CLS243.MTH3634(context0, 1, z);
                    if(file2 != null) {
                        if(!CLS262.MTH4050(file2)) {
                            CLS262.MTH4057(file2);
                        }
                        if(z || file2.canWrite()) {
                            return new File(file2, "voice_mp3_temp");
                        }
                    }
                    break;
                }
                case 5: {
                    File file3 = CLS243.MTH3634(context0, 1, z);
                    if(file3 != null) {
                        if(!CLS262.MTH4050(file3)) {
                            CLS262.MTH4057(file3);
                        }
                        if(z || file3.canWrite()) {
                            return new File(file3, "downloads");
                        }
                    }
                    break;
                }
                case 6: {
                    File file4 = CLS243.MTH3634(context0, 5, z);
                    if(file4 != null) {
                        if(!CLS262.MTH4050(file4)) {
                            CLS262.MTH4057(file4);
                        }
                        if(z || file4.canWrite()) {
                            return new File(file4, "images");
                        }
                    }
                    break;
                }
                case 7: {
                    File file5 = CLS243.MTH3634(context0, 5, z);
                    if(file5 != null) {
                        if(!CLS262.MTH4050(file5)) {
                            CLS262.MTH4057(file5);
                        }
                        if(z || file5.canWrite()) {
                            return new File(file5, "videos");
                        }
                    }
                    break;
                }
                case 8: {
                    File file6 = CLS243.MTH3634(context0, 1, z);
                    if(file6 != null) {
                        if(!CLS262.MTH4050(file6)) {
                            CLS262.MTH4057(file6);
                        }
                        if(z || file6.canWrite()) {
                            return new File(file6, "cache");
                        }
                    }
                    break;
                }
                case 9: {
                    File file7 = CLS243.MTH3634(context0, 1, z);
                    if(file7 != null) {
                        if(!CLS262.MTH4050(file7)) {
                            CLS262.MTH4057(file7);
                        }
                        if(z || file7.canWrite()) {
                            return new File(file7, "assets");
                        }
                    }
                    break;
                }
                case 10: {
                    File file8 = CLS243.MTH3634(context0, 1, z);
                    if(file8 != null) {
                        if(!CLS262.MTH4050(file8)) {
                            CLS262.MTH4057(file8);
                        }
                        if(z || file8.canWrite()) {
                            return new File(file8, "WxThemes");
                        }
                    }
                    break;
                }
                case 11: {
                    File file9 = CLS243.MTH3634(context0, 1, z);
                    if(file9 != null) {
                        if(!CLS262.MTH4050(file9)) {
                            CLS262.MTH4057(file9);
                        }
                        if(z || file9.canWrite()) {
                            return new File(file9, "voice");
                        }
                    }
                    break;
                }
                case 12: {
                    File file10 = CLS243.MTH3634(context0, 1, z);
                    if(file10 != null) {
                        if(!CLS262.MTH4050(file10)) {
                            CLS262.MTH4057(file10);
                        }
                        if(z || file10.canWrite()) {
                            return new File(file10, "Records");
                        }
                    }
                    break;
                }
                case 13: {
                    File file11 = CLS243.MTH3634(context0, 1, z);
                    if(file11 != null) {
                        if(!CLS262.MTH4050(file11)) {
                            CLS262.MTH4057(file11);
                        }
                        if(z || file11.canWrite()) {
                            return new File(file11, "moments");
                        }
                    }
                    break;
                }
                case 14: {
                    File file12 = CLS243.MTH3634(context0, 1, z);
                    if(file12 != null) {
                        if(!CLS262.MTH4050(file12)) {
                            CLS262.MTH4057(file12);
                        }
                        if(z || file12.canWrite()) {
                            return new File(file12, "chat");
                        }
                    }
                    break;
                }
                default: {
                    return CLS262.MTH4041(context0);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3253(throwable0, false, true);
            CLS204.MTH3255(("getModuleDirBackup: " + v), false, true);
        }
        return null;
    }

    public static long MTH3635(Context context0, int v, String s, ArrayList arrayList0) {
        CLS299 ـᵎ0 = CLS243.MTH3643(context0, v, s, arrayList0);
        return ـᵎ0 == null ? 0L : ـᵎ0.MTH4382();
    }

    public static boolean MTH3636(Context context0, int v, String s) {
        return CLS243.MTH3638(context0, v, s, null);
    }

    // 此方法包含解密的字符串
    public static File MTH3637(Context context0, int v) {
        try {
            switch(v) {
                case 1: {
                    if(context0 == null) {
                        context0 = CLS95.MTH2017();
                    }
                    File file0 = context0 == null ? null : context0.getExternalFilesDir(null);
                    return file0 != null && file0.canWrite() ? new File(file0, "\uD8E3") : null;
                }
                case 2: {
                    File file1 = CLS243.MTH3637(context0, 1);
                    if(file1 != null) {
                        if(!CLS262.MTH4050(file1) && !CLS262.MTH4057(file1)) {
                            return null;
                        }
                        if(file1.canWrite()) {
                            return new File(file1, "images");
                        }
                    }
                    return null;
                }
                case 3: {
                    File file2 = CLS243.MTH3637(context0, 1);
                    if(file2 != null) {
                        if(!CLS262.MTH4050(file2) && !CLS262.MTH4057(file2)) {
                            return null;
                        }
                        if(file2.canWrite()) {
                            return new File(file2, "sounds");
                        }
                    }
                    return null;
                }
                case 4: {
                    File file3 = CLS243.MTH3637(context0, 1);
                    if(file3 != null) {
                        if(!CLS262.MTH4050(file3) && !CLS262.MTH4057(file3)) {
                            return null;
                        }
                        if(file3.canWrite()) {
                            return new File(file3, "voice_mp3_temp");
                        }
                    }
                    return null;
                }
                case 5: {
                    File file4 = CLS243.MTH3637(context0, 1);
                    if(file4 != null) {
                        if(!CLS262.MTH4050(file4) && !CLS262.MTH4057(file4)) {
                            return null;
                        }
                        if(file4.canWrite()) {
                            return new File(file4, "downloads");
                        }
                    }
                    return null;
                }
                case 6: {
                    File file5 = CLS243.MTH3637(context0, 5);
                    if(file5 != null) {
                        if(!CLS262.MTH4050(file5) && !CLS262.MTH4057(file5)) {
                            return null;
                        }
                        if(file5.canWrite()) {
                            return new File(file5, "images");
                        }
                    }
                    return null;
                }
                case 7: {
                    File file6 = CLS243.MTH3637(context0, 5);
                    if(file6 != null) {
                        if(!CLS262.MTH4050(file6) && !CLS262.MTH4057(file6)) {
                            return null;
                        }
                        if(file6.canWrite()) {
                            return new File(file6, "videos");
                        }
                    }
                    return null;
                }
                case 8: {
                    File file7 = CLS243.MTH3637(context0, 1);
                    if(file7 != null) {
                        if(!CLS262.MTH4050(file7) && !CLS262.MTH4057(file7)) {
                            return null;
                        }
                        if(file7.canWrite()) {
                            return new File(file7, "cache");
                        }
                    }
                    return null;
                }
                case 9: {
                    File file8 = CLS243.MTH3637(context0, 1);
                    if(file8 != null) {
                        if(!CLS262.MTH4050(file8) && !CLS262.MTH4057(file8)) {
                            return null;
                        }
                        if(file8.canWrite()) {
                            return new File(file8, "assets");
                        }
                    }
                    return null;
                }
                case 10: {
                    File file9 = CLS243.MTH3637(context0, 1);
                    if(file9 != null) {
                        if(!CLS262.MTH4050(file9) && !CLS262.MTH4057(file9)) {
                            return null;
                        }
                        if(file9.canWrite()) {
                            return new File(file9, "WxThemes");
                        }
                    }
                    return null;
                }
                case 11: {
                    File file10 = CLS243.MTH3637(context0, 1);
                    if(file10 != null) {
                        if(!CLS262.MTH4050(file10) && !CLS262.MTH4057(file10)) {
                            return null;
                        }
                        if(file10.canWrite()) {
                            return new File(file10, "voice");
                        }
                    }
                    return null;
                }
                case 12: {
                    File file11 = CLS243.MTH3637(context0, 1);
                    if(file11 != null) {
                        if(!CLS262.MTH4050(file11) && !CLS262.MTH4057(file11)) {
                            return null;
                        }
                        if(file11.canWrite()) {
                            return new File(file11, "Records");
                        }
                    }
                    return null;
                }
                case 13: {
                    File file12 = CLS243.MTH3637(context0, 1);
                    if(file12 != null) {
                        if(!CLS262.MTH4050(file12) && !CLS262.MTH4057(file12)) {
                            return null;
                        }
                        if(file12.canWrite()) {
                            return new File(file12, "moments");
                        }
                    }
                    return null;
                }
                case 14: {
                    File file13 = CLS243.MTH3637(context0, 1);
                    if(file13 != null) {
                        if(!CLS262.MTH4050(file13) && !CLS262.MTH4057(file13)) {
                            return null;
                        }
                        if(file13.canWrite()) {
                            return new File(file13, "chat");
                        }
                    }
                    return null;
                }
                default: {
                    return context0.getExternalCacheDir();
                }
            }
        }
        catch(Throwable throwable0) {
        }
        CLS204.MTH3253(throwable0, false, true);
        CLS204.MTH3255(("getModuleDirInWechatExternalFiles: " + v), false, true);
        return null;
    }

    public static boolean MTH3638(Context context0, int v, String s, ArrayList arrayList0) {
        String s1 = arrayList0 == null || arrayList0.isEmpty() ? v + s : v + s + TextUtils.join("_", arrayList0);
        CLS243.FLD1058.MTH2487(s1);
        CLS243.FLD1059.MTH2487(s1);
        CLS299 ـᵎ0 = CLS243.MTH3643(context0, v, s, arrayList0);
        return ـᵎ0 == null ? false : CLS243.MTH3621(ـᵎ0);
    }

    public static Uri MTH3639(Context context0, int v, String s) {
        return CLS243.MTH3603(context0, v, null, s);
    }

    public static boolean MTH3640(Context context0, int v, ArrayList arrayList0, String s) {
        return CLS243.MTH3643(context0, v, s, arrayList0) != null;
    }

    public static void MTH3641(File file0, CLS299 ـᵎ0, HashSet hashSet0, boolean z) {
        if(CLS262.MTH4050(file0) && ـᵎ0 != null && !CLS262.MTH4047(file0, ـᵎ0)) {
            if(file0.isDirectory()) {
                File[] arr_file = file0.listFiles();
                if(arr_file != null && arr_file.length != 0) {
                    for(int v = 0; v < arr_file.length; ++v) {
                        File file1 = arr_file[v];
                        if(hashSet0 == null || !hashSet0.contains(file1.getName())) {
                            if(file1.isDirectory()) {
                                CLS299 ـᵎ1 = ـᵎ0.MTH4388(file1.getName());
                                if(ـᵎ1 == null) {
                                    ـᵎ1 = ـᵎ0.MTH4386(file1.getName());
                                }
                                CLS243.MTH3611(file1, ـᵎ1);
                            }
                            else {
                                CLS243.MTH3611(file1, ـᵎ0);
                            }
                            if(z) {
                                CLS262.MTH4067(file1);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            CLS299 ـᵎ2 = ـᵎ0.MTH4388(file0.getName());
            if(ـᵎ2 == null) {
                ـᵎ2 = ـᵎ0.MTH4391(CLS262.MTH4048(file0), file0.getName());
            }
            else if(file0.lastModified() <= ـᵎ2.MTH4382()) {
                return;
            }
            if(ـᵎ2 == null) {
                return;
            }
            try {
                CLS262.MTH4068(new FileInputStream(file0), CLS243.MTH3607(ـᵎ2));
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
    }

    public static void MTH3642(File file0, int v, ArrayList arrayList0) {
        CLS243.MTH3611(file0, CLS243.MTH3619(CLS95.MTH2017(), v, arrayList0));
    }

    public static CLS299 MTH3643(Context context0, int v, String s, ArrayList arrayList0) {
        String s1 = arrayList0 == null || arrayList0.isEmpty() ? v + s : v + s + TextUtils.join("_", arrayList0);
        if(CLS243.FLD1058.MTH2483(s1)) {
            CLS299 ـᵎ0 = (CLS299)CLS243.FLD1058.MTH2486(s1);
            if(ـᵎ0.MTH4390()) {
                return ـᵎ0;
            }
        }
        CLS299 ـᵎ1 = CLS243.MTH3619(context0, v, arrayList0);
        if(ـᵎ1 == null) {
            return null;
        }
        CLS299 ـᵎ2 = CLS243.MTH3610(ـᵎ1, s);
        if(ـᵎ2 != null) {
            CLS243.FLD1058.MTH2484(s1, ـᵎ2);
        }
        return ـᵎ2;
    }

    public static OutputStream MTH3644(Context context0, int v, ArrayList arrayList0, String s, String s1) {
        CLS299 ـᵎ0 = CLS243.MTH3619(context0, v, arrayList0);
        if(ـᵎ0 != null) {
            CLS299 ـᵎ1 = CLS243.MTH3610(ـᵎ0, s);
            if(ـᵎ1 == null) {
                ـᵎ1 = ـᵎ0.MTH4391(s1, s);
            }
            return CLS243.MTH3607(ـᵎ1);
        }
        return null;
    }

    public static File MTH3645() {
        File file0 = CLS243.MTH3630();
        File file1 = null;
        if(file0 != null) {
            if(!CLS262.MTH4050(file0) && !CLS262.MTH4057(file0)) {
                return null;
            }
            if(file0.canWrite()) {
                file1 = new File(file0, "BACKUP_MODULE");
                if(!CLS262.MTH4050(file1)) {
                    CLS262.MTH4057(file1);
                }
            }
        }
        return file1;
    }

    // 此方法包含解密的字符串
    public static void MTH3646(ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                CLS299 ـᵎ0 = (CLS299)object0;
                if(ـᵎ0 != null) {
                    arrayList1.add(ـᵎ0.MTH4379());
                }
            }
            Intent intent0 = new Intent("android.intent.action.SEND_MULTIPLE");
            intent0.setType("*/*");
            intent0.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList1);
            CLS246.MTH3657().startActivity(Intent.createChooser(intent0, ""));
        }
    }

    public static boolean MTH3647(CLS299 ـᵎ0) {
        if(ـᵎ0 == null) {
            return true;
        }
        if(ـᵎ0.MTH4376()) {
            CLS299[] arr_ـᵎ = ـᵎ0.MTH4387();
            return arr_ـᵎ == null || arr_ـᵎ.length == 0;
        }
        return false;
    }

    public static boolean MTH3648(Context context0, int v, String s) {
        return CLS243.MTH3640(context0, v, null, s);
    }

    public static File MTH3649(Context context0, int v) {
        return CLS243.MTH3634(context0, v, false);
    }
}

