// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import c.ˊﹶ.CLS98;
import c.יⁱ.CLS255;
import c.ﾞʿ.CLS367;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;

public class CLS186 {
    public static CLS255 FLD761;
    public static CLS255 FLD762;

    static {
        CLS186.FLD761 = new CLS255(300000L);
        CLS186.FLD762 = new CLS255(300000L);
    }

    public static File MTH2715(Context context0, int v) {
        return CLS186.MTH2729(context0, v, false);
    }

    public static CLS367 MTH2716(Context context0, int v) {
        File file0 = CLS186.MTH2762(context0, v);
        if(!CLS176.MTH2570(file0)) {
            CLS176.MTH2574(file0);
        }
        if(file0 == null || !file0.canWrite()) {
            file0 = CLS186.MTH2743(context0, v);
            CLS176.MTH2574(file0);
        }
        return file0 == null || !file0.canWrite() ? null : CLS367.MTH5062(file0);
    }

    public static InputStream MTH2717(Context context0, int v, ArrayList arrayList0, String s) {
        Uri uri0 = CLS186.MTH2748(context0, v, arrayList0, s);
        return uri0 == null ? null : CLS176.MTH2592(uri0);
    }

    public static CLS367 MTH2718(Context context0, int v, ArrayList arrayList0) {
        CLS367 ʾʻ0 = CLS186.MTH2747(context0, v);
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                String s = (String)object0;
                CLS367 ʾʻ1 = ʾʻ0.MTH5066(s);
                ʾʻ0 = ʾʻ1 == null ? ʾʻ0.MTH5049(s) : ʾʻ1;
            }
        }
        return ʾʻ0;
    }

    public static void MTH2719(Context context0, int v, String s, String s1, ArrayList arrayList0) {
        CLS367 ʾʻ0 = CLS186.MTH2718(context0, v, arrayList0);
        if(ʾʻ0 == null) {
            return;
        }
        CLS367 ʾʻ1 = ʾʻ0.MTH5066(s);
        if(ʾʻ1 == null) {
            return;
        }
        if(CLS186.MTH2726(ʾʻ0, s1)) {
            return;
        }
        CLS186.MTH2728(ʾʻ1, ʾʻ0.MTH5049(s1));
    }

    public static void MTH2720(Activity activity0, int v) {
        CLS189 יᵎ0 = new CLS189(activity0);
        יᵎ0.MTH2804();
        יᵎ0.MTH2818();
        יᵎ0.MTH2807();
        יᵎ0.MTH2813(CLS186.MTH2747(activity0, v), null);
    }

    public static boolean MTH2721(Context context0, int v, String s) {
        return CLS186.MTH2756(context0, v, s, null);
    }

    // 此方法包含解密的字符串
    public static File MTH2722(Context context0, int v, boolean z) {
        try {
            switch(v) {
                case 1: {
                    return CLS215.MTH3031(context0, "X");
                }
                case 2: {
                    File file0 = CLS186.MTH2722(context0, 1, z);
                    if(file0 != null) {
                        if(!CLS176.MTH2570(file0)) {
                            CLS176.MTH2574(file0);
                        }
                        if(z || file0.canWrite()) {
                            return new File(file0, "images");
                        }
                    }
                    break;
                }
                case 3: {
                    File file1 = CLS186.MTH2722(context0, 1, z);
                    if(file1 != null) {
                        if(!CLS176.MTH2570(file1)) {
                            CLS176.MTH2574(file1);
                        }
                        if(z || file1.canWrite()) {
                            return new File(file1, "sounds");
                        }
                    }
                    break;
                }
                case 4: {
                    File file2 = CLS186.MTH2722(context0, 1, z);
                    if(file2 != null) {
                        if(!CLS176.MTH2570(file2)) {
                            CLS176.MTH2574(file2);
                        }
                        if(z || file2.canWrite()) {
                            return new File(file2, "voice_mp3_temp");
                        }
                    }
                    break;
                }
                case 5: {
                    File file3 = CLS186.MTH2722(context0, 1, z);
                    if(file3 != null) {
                        if(!CLS176.MTH2570(file3)) {
                            CLS176.MTH2574(file3);
                        }
                        if(z || file3.canWrite()) {
                            return new File(file3, "downloads");
                        }
                    }
                    break;
                }
                case 6: {
                    File file4 = CLS186.MTH2722(context0, 5, z);
                    if(file4 != null) {
                        if(!CLS176.MTH2570(file4)) {
                            CLS176.MTH2574(file4);
                        }
                        if(z || file4.canWrite()) {
                            return new File(file4, "images");
                        }
                    }
                    break;
                }
                case 7: {
                    File file5 = CLS186.MTH2722(context0, 5, z);
                    if(file5 != null) {
                        if(!CLS176.MTH2570(file5)) {
                            CLS176.MTH2574(file5);
                        }
                        if(z || file5.canWrite()) {
                            return new File(file5, "videos");
                        }
                    }
                    break;
                }
                case 8: {
                    File file6 = CLS186.MTH2722(context0, 1, z);
                    if(file6 != null) {
                        if(!CLS176.MTH2570(file6)) {
                            CLS176.MTH2574(file6);
                        }
                        if(z || file6.canWrite()) {
                            return new File(file6, "cache");
                        }
                    }
                    break;
                }
                case 9: {
                    File file7 = CLS186.MTH2722(context0, 1, z);
                    if(file7 != null) {
                        if(!CLS176.MTH2570(file7)) {
                            CLS176.MTH2574(file7);
                        }
                        if(z || file7.canWrite()) {
                            return new File(file7, "assets");
                        }
                    }
                    break;
                }
                case 10: {
                    File file8 = CLS186.MTH2722(context0, 1, z);
                    if(file8 != null) {
                        if(!CLS176.MTH2570(file8)) {
                            CLS176.MTH2574(file8);
                        }
                        if(z || file8.canWrite()) {
                            return new File(file8, "WxThemes");
                        }
                    }
                    break;
                }
                case 11: {
                    File file9 = CLS186.MTH2722(context0, 1, z);
                    if(file9 != null) {
                        if(!CLS176.MTH2570(file9)) {
                            CLS176.MTH2574(file9);
                        }
                        if(z || file9.canWrite()) {
                            return new File(file9, "voice");
                        }
                    }
                    break;
                }
                case 12: {
                    File file10 = CLS186.MTH2722(context0, 1, z);
                    if(file10 != null) {
                        if(!CLS176.MTH2570(file10)) {
                            CLS176.MTH2574(file10);
                        }
                        if(z || file10.canWrite()) {
                            return new File(file10, "Records");
                        }
                    }
                    break;
                }
                case 13: {
                    File file11 = CLS186.MTH2722(context0, 1, z);
                    if(file11 != null) {
                        if(!CLS176.MTH2570(file11)) {
                            CLS176.MTH2574(file11);
                        }
                        if(z || file11.canWrite()) {
                            return new File(file11, "moments");
                        }
                    }
                    break;
                }
                case 14: {
                    File file12 = CLS186.MTH2722(context0, 1, z);
                    if(file12 != null) {
                        if(!CLS176.MTH2570(file12)) {
                            CLS176.MTH2574(file12);
                        }
                        if(z || file12.canWrite()) {
                            return new File(file12, "chat");
                        }
                    }
                    break;
                }
                default: {
                    return CLS176.MTH2594(context0);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2707(throwable0, false, true);
            CLS185.MTH2706(("getModuleDirInternal: " + v), false, true);
        }
        return null;
    }

    public static boolean MTH2723(CLS367 ʾʻ0) {
        if(ʾʻ0 == null) {
            return true;
        }
        if(ʾʻ0.MTH5061()) {
            CLS367[] arr_ʾʻ = ʾʻ0.MTH5060();
            return arr_ʾʻ == null || arr_ʾʻ.length == 0;
        }
        return false;
    }

    public static boolean MTH2724(ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            try {
                for(Object object0: arrayList0) {
                    CLS186.MTH2730(((CLS367)object0));
                }
                return true;
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        return false;
    }

    public static void MTH2725(File file0, int v) {
        CLS186.MTH2763(file0, CLS186.MTH2747(CLS98.MTH1323(), v));
    }

    public static boolean MTH2726(CLS367 ʾʻ0, String s) {
        if(ʾʻ0 == null) {
            return false;
        }
        try {
            if(ʾʻ0.MTH5066(s) != null) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static void MTH2727(ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                CLS367 ʾʻ0 = (CLS367)object0;
                if(ʾʻ0 != null) {
                    arrayList1.add(ʾʻ0.MTH5057());
                }
            }
            Intent intent0 = new Intent("android.intent.action.SEND_MULTIPLE");
            intent0.setType("*/*");
            intent0.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList1);
            CLS179.MTH2615().startActivity(Intent.createChooser(intent0, ""));
        }
    }

    public static void MTH2728(CLS367 ʾʻ0, CLS367 ʾʻ1) {
        if(CLS176.MTH2566(ʾʻ0, ʾʻ1)) {
            return;
        }
        if(ʾʻ0.MTH5061()) {
            CLS367[] arr_ʾʻ = ʾʻ0.MTH5060();
            if(arr_ʾʻ != null && arr_ʾʻ.length != 0) {
                for(int v = 0; v < arr_ʾʻ.length; ++v) {
                    CLS367 ʾʻ2 = arr_ʾʻ[v];
                    if(ʾʻ2.MTH5061()) {
                        CLS367 ʾʻ3 = ʾʻ1.MTH5066(ʾʻ2.MTH5055());
                        if(ʾʻ3 == null) {
                            ʾʻ3 = ʾʻ1.MTH5049(ʾʻ2.MTH5055());
                        }
                        CLS186.MTH2728(ʾʻ2, ʾʻ3);
                    }
                    else {
                        CLS186.MTH2728(ʾʻ2, ʾʻ1);
                    }
                }
                return;
            }
            return;
        }
        if(ʾʻ1.MTH5066(ʾʻ0.MTH5055()) == null) {
            CLS367 ʾʻ4 = ʾʻ1.MTH5054(CLS176.MTH2584(ʾʻ0.MTH5057()), ʾʻ0.MTH5055());
            try {
                CLS176.MTH2575(CLS186.MTH2734(ʾʻ0), CLS186.MTH2761(ʾʻ4));
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static File MTH2729(Context context0, int v, boolean z) {
        try {
            switch(v) {
                case 1: {
                    return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "X");
                }
                case 2: {
                    File file0 = CLS186.MTH2729(context0, 1, z);
                    if(file0 != null) {
                        if(!CLS176.MTH2570(file0)) {
                            CLS176.MTH2574(file0);
                        }
                        if(z || file0.canWrite()) {
                            return new File(file0, "images");
                        }
                    }
                    break;
                }
                case 3: {
                    File file1 = CLS186.MTH2729(context0, 1, z);
                    if(file1 != null) {
                        if(!CLS176.MTH2570(file1)) {
                            CLS176.MTH2574(file1);
                        }
                        if(z || file1.canWrite()) {
                            return new File(file1, "sounds");
                        }
                    }
                    break;
                }
                case 4: {
                    File file2 = CLS186.MTH2729(context0, 1, z);
                    if(file2 != null) {
                        if(!CLS176.MTH2570(file2)) {
                            CLS176.MTH2574(file2);
                        }
                        if(z || file2.canWrite()) {
                            return new File(file2, "voice_mp3_temp");
                        }
                    }
                    break;
                }
                case 5: {
                    File file3 = CLS186.MTH2729(context0, 1, z);
                    if(file3 != null) {
                        if(!CLS176.MTH2570(file3)) {
                            CLS176.MTH2574(file3);
                        }
                        if(z || file3.canWrite()) {
                            return new File(file3, "downloads");
                        }
                    }
                    break;
                }
                case 6: {
                    File file4 = CLS186.MTH2729(context0, 5, z);
                    if(file4 != null) {
                        if(!CLS176.MTH2570(file4)) {
                            CLS176.MTH2574(file4);
                        }
                        if(z || file4.canWrite()) {
                            return new File(file4, "images");
                        }
                    }
                    break;
                }
                case 7: {
                    File file5 = CLS186.MTH2729(context0, 5, z);
                    if(file5 != null) {
                        if(!CLS176.MTH2570(file5)) {
                            CLS176.MTH2574(file5);
                        }
                        if(z || file5.canWrite()) {
                            return new File(file5, "videos");
                        }
                    }
                    break;
                }
                case 8: {
                    File file6 = CLS186.MTH2729(context0, 1, z);
                    if(file6 != null) {
                        if(!CLS176.MTH2570(file6)) {
                            CLS176.MTH2574(file6);
                        }
                        if(z || file6.canWrite()) {
                            return new File(file6, "cache");
                        }
                    }
                    break;
                }
                case 9: {
                    File file7 = CLS186.MTH2729(context0, 1, z);
                    if(file7 != null) {
                        if(!CLS176.MTH2570(file7)) {
                            CLS176.MTH2574(file7);
                        }
                        if(z || file7.canWrite()) {
                            return new File(file7, "assets");
                        }
                    }
                    break;
                }
                case 10: {
                    File file8 = CLS186.MTH2729(context0, 1, z);
                    if(file8 != null) {
                        if(!CLS176.MTH2570(file8)) {
                            CLS176.MTH2574(file8);
                        }
                        if(z || file8.canWrite()) {
                            return new File(file8, "WxThemes");
                        }
                    }
                    break;
                }
                case 11: {
                    File file9 = CLS186.MTH2729(context0, 1, z);
                    if(file9 != null) {
                        if(!CLS176.MTH2570(file9)) {
                            CLS176.MTH2574(file9);
                        }
                        if(z || file9.canWrite()) {
                            return new File(file9, "voice");
                        }
                    }
                    break;
                }
                case 12: {
                    File file10 = CLS186.MTH2729(context0, 1, z);
                    if(file10 != null) {
                        if(!CLS176.MTH2570(file10)) {
                            CLS176.MTH2574(file10);
                        }
                        if(z || file10.canWrite()) {
                            return new File(file10, "Records");
                        }
                    }
                    break;
                }
                case 13: {
                    File file11 = CLS186.MTH2729(context0, 1, z);
                    if(file11 != null) {
                        if(!CLS176.MTH2570(file11)) {
                            CLS176.MTH2574(file11);
                        }
                        if(z || file11.canWrite()) {
                            return new File(file11, "moments");
                        }
                    }
                    break;
                }
                case 14: {
                    File file12 = CLS186.MTH2729(context0, 1, z);
                    if(file12 != null) {
                        if(!CLS176.MTH2570(file12)) {
                            CLS176.MTH2574(file12);
                        }
                        if(z || file12.canWrite()) {
                            return new File(file12, "chat");
                        }
                    }
                    break;
                }
                default: {
                    return CLS176.MTH2594(context0);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2707(throwable0, false, true);
            CLS185.MTH2706(("getModuleDirBackup: " + v), false, true);
        }
        return null;
    }

    public static boolean MTH2730(CLS367 ʾʻ0) {
        if(ʾʻ0 == null) {
            return false;
        }
        try {
            if(ʾʻ0.MTH5061()) {
                CLS367[] arr_ʾʻ = ʾʻ0.MTH5060();
                for(int v = 0; v < arr_ʾʻ.length; ++v) {
                    CLS186.MTH2730(arr_ʾʻ[v]);
                }
                ʾʻ0.MTH5052();
                return false;
            }
            return ʾʻ0.MTH5052();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return false;
        }
    }

    public static void MTH2731(File file0, int v, ArrayList arrayList0) {
        CLS186.MTH2763(file0, CLS186.MTH2718(CLS98.MTH1323(), v, arrayList0));
    }

    public static File MTH2732(Context context0, int v) {
        return CLS186.MTH2722(context0, v, false);
    }

    public static CLS367 MTH2733(CLS367 ʾʻ0, String s) {
        CLS367 ʾʻ1 = ʾʻ0.MTH5066(s);
        if(ʾʻ1 != null) {
            return ʾʻ1;
        }
        CLS367[] arr_ʾʻ = ʾʻ0.MTH5060();
        for(int v = 0; v < arr_ʾʻ.length; ++v) {
            CLS367 ʾʻ2 = arr_ʾʻ[v];
            String s1 = ʾʻ2.MTH5055();
            if(!TextUtils.isEmpty(s1) && s1.startsWith(s)) {
                return ʾʻ2;
            }
        }
        return null;
    }

    public static InputStream MTH2734(CLS367 ʾʻ0) {
        return CLS176.MTH2592(ʾʻ0.MTH5057());
    }

    public static OutputStream MTH2735(Context context0, int v, String s, String s1) {
        return CLS186.MTH2759(context0, v, null, s, s1);
    }

    public static CLS367 MTH2736(String s) {
        return CLS186.MTH2750(Uri.parse(s));
    }

    public static long MTH2737(Context context0, int v, String s, ArrayList arrayList0) {
        CLS367 ʾʻ0 = CLS186.MTH2751(context0, v, s, arrayList0);
        return ʾʻ0 == null ? 0L : ʾʻ0.MTH5059();
    }

    public static boolean MTH2738(Context context0, int v, ArrayList arrayList0, String s, String s1) {
        CLS367 ʾʻ0 = CLS186.MTH2751(context0, v, s, arrayList0);
        return ʾʻ0 == null ? false : ʾʻ0.MTH5058(s1);
    }

    public static boolean MTH2739(Context context0, int v, ArrayList arrayList0, String s) {
        return CLS186.MTH2751(context0, v, s, arrayList0) != null;
    }

    public static CLS367 MTH2740(Context context0, int v) {
        CLS367 ʾʻ0;
        try {
            Context context1 = context0;
            switch(v) {
                case 1: {
                    if(context1 == null) {
                        context1 = CLS98.MTH1323();
                    }
                    if(context1 == null) {
                        ʾʻ0 = null;
                    }
                    else {
                        String s = CLS98.MTH1297().MTH1015("module_dir_uri", "");
                        ʾʻ0 = CLS180.MTH2643(context1, s) ? CLS367.MTH5063(CLS98.MTH1323(), Uri.parse(s)) : null;
                    }
                    return ʾʻ0 != null && ʾʻ0.MTH5067() ? ʾʻ0 : null;
                }
                case 2: {
                    CLS367 ʾʻ1 = CLS186.MTH2740(context1, 1);
                    if(ʾʻ1 != null) {
                        return CLS186.MTH2726(ʾʻ1, "images") ? ʾʻ1.MTH5066("images") : ʾʻ1.MTH5049("images");
                    }
                    return null;
                }
                case 3: {
                    CLS367 ʾʻ2 = CLS186.MTH2740(context1, 1);
                    if(ʾʻ2 != null) {
                        return CLS186.MTH2726(ʾʻ2, "sounds") ? ʾʻ2.MTH5066("sounds") : ʾʻ2.MTH5049("sounds");
                    }
                    return null;
                }
                case 4: {
                    CLS367 ʾʻ3 = CLS186.MTH2740(context1, 1);
                    if(ʾʻ3 != null) {
                        return CLS186.MTH2726(ʾʻ3, "voice_mp3_temp") ? ʾʻ3.MTH5066("voice_mp3_temp") : ʾʻ3.MTH5049("voice_mp3_temp");
                    }
                    return null;
                }
                case 5: {
                    CLS367 ʾʻ4 = CLS186.MTH2740(context1, 1);
                    if(ʾʻ4 != null) {
                        return CLS186.MTH2726(ʾʻ4, "downloads") ? ʾʻ4.MTH5066("downloads") : ʾʻ4.MTH5049("downloads");
                    }
                    return null;
                }
                case 6: {
                    CLS367 ʾʻ5 = CLS186.MTH2740(context1, 5);
                    if(ʾʻ5 != null) {
                        return CLS186.MTH2726(ʾʻ5, "images") ? ʾʻ5.MTH5066("images") : ʾʻ5.MTH5049("images");
                    }
                    return null;
                }
                case 7: {
                    CLS367 ʾʻ6 = CLS186.MTH2740(context1, 5);
                    if(ʾʻ6 != null) {
                        return CLS186.MTH2726(ʾʻ6, "videos") ? ʾʻ6.MTH5066("videos") : ʾʻ6.MTH5049("videos");
                    }
                    return null;
                }
                case 8: {
                    CLS367 ʾʻ7 = CLS186.MTH2740(context1, 1);
                    if(ʾʻ7 != null) {
                        return CLS186.MTH2726(ʾʻ7, "cache") ? ʾʻ7.MTH5066("cache") : ʾʻ7.MTH5049("cache");
                    }
                    return null;
                }
                case 9: {
                    CLS367 ʾʻ8 = CLS186.MTH2740(context1, 1);
                    if(ʾʻ8 != null) {
                        return CLS186.MTH2726(ʾʻ8, "assets") ? ʾʻ8.MTH5066("assets") : ʾʻ8.MTH5049("assets");
                    }
                    return null;
                }
                case 10: {
                    CLS367 ʾʻ9 = CLS186.MTH2740(context1, 1);
                    if(ʾʻ9 != null) {
                        return CLS186.MTH2726(ʾʻ9, "WxThemes") ? ʾʻ9.MTH5066("WxThemes") : ʾʻ9.MTH5049("WxThemes");
                    }
                    return null;
                }
                case 11: {
                    CLS367 ʾʻ10 = CLS186.MTH2740(context1, 1);
                    if(ʾʻ10 != null) {
                        return CLS186.MTH2726(ʾʻ10, "voice") ? ʾʻ10.MTH5066("voice") : ʾʻ10.MTH5049("voice");
                    }
                    return null;
                }
                case 12: {
                    CLS367 ʾʻ11 = CLS186.MTH2740(context1, 1);
                    if(ʾʻ11 != null) {
                        return CLS186.MTH2726(ʾʻ11, "Records") ? ʾʻ11.MTH5066("Records") : ʾʻ11.MTH5049("Records");
                    }
                    return null;
                }
                case 13: {
                    CLS367 ʾʻ12 = CLS186.MTH2740(context1, 1);
                    if(ʾʻ12 != null) {
                        return CLS186.MTH2726(ʾʻ12, "moments") ? ʾʻ12.MTH5066("moments") : ʾʻ12.MTH5049("moments");
                    }
                    return null;
                }
                case 14: {
                    CLS367 ʾʻ13 = CLS186.MTH2740(context1, 1);
                    if(ʾʻ13 != null) {
                        return CLS186.MTH2726(ʾʻ13, "chat") ? ʾʻ13.MTH5066("chat") : ʾʻ13.MTH5049("chat");
                    }
                    return null;
                }
                case 15: {
                    CLS367 ʾʻ14 = CLS186.MTH2740(context1, 1);
                    if(ʾʻ14 != null) {
                        return CLS186.MTH2726(ʾʻ14, "WebFavImgCache") ? ʾʻ14.MTH5066("WebFavImgCache") : ʾʻ14.MTH5049("WebFavImgCache");
                    }
                    return null;
                }
                default: {
                    return CLS367.MTH5062(context0.getExternalCacheDir());
                }
            }
        }
        catch(Throwable throwable0) {
        }
        CLS185.MTH2707(throwable0, false, true);
        CLS185.MTH2706(("getModuleDirUserSelected: " + v), false, true);
        return null;
    }

    public static boolean MTH2741(Context context0, int v, String s) {
        return CLS186.MTH2739(context0, v, null, s);
    }

    public static File MTH2742() {
        File file0 = CLS186.MTH2752();
        File file1 = null;
        if(file0 != null) {
            if(!CLS176.MTH2570(file0) && !CLS176.MTH2574(file0)) {
                return null;
            }
            if(file0.canWrite()) {
                file1 = new File(file0, "BACKUP_DATABASE");
                if(!CLS176.MTH2570(file1)) {
                    CLS176.MTH2574(file1);
                }
            }
        }
        return file1;
    }

    // 此方法包含解密的字符串
    public static File MTH2743(Context context0, int v) {
        try {
            switch(v) {
                case 1: {
                    if(context0 == null) {
                        context0 = CLS98.MTH1323();
                    }
                    if(context0 != null) {
                        return new File(context0.getFilesDir(), "X");
                    }
                    goto label_6;
                }
                case 2: {
                label_6:
                    File file0 = CLS186.MTH2743(context0, 1);
                    if(file0 != null) {
                        if(!CLS176.MTH2570(file0) && !CLS176.MTH2574(file0)) {
                            return null;
                        }
                        if(file0.canWrite()) {
                            return new File(file0, "images");
                        }
                    }
                    break;
                }
                case 3: {
                    File file1 = CLS186.MTH2743(context0, 1);
                    if(file1 != null) {
                        if(!CLS176.MTH2570(file1) && !CLS176.MTH2574(file1)) {
                            return null;
                        }
                        if(file1.canWrite()) {
                            return new File(file1, "sounds");
                        }
                    }
                    break;
                }
                case 4: {
                    File file2 = CLS186.MTH2743(context0, 1);
                    if(file2 != null) {
                        if(!CLS176.MTH2570(file2) && !CLS176.MTH2574(file2)) {
                            return null;
                        }
                        if(file2.canWrite()) {
                            return new File(file2, "voice_mp3_temp");
                        }
                    }
                    break;
                }
                case 5: {
                    File file3 = CLS186.MTH2743(context0, 1);
                    if(file3 != null) {
                        if(!CLS176.MTH2570(file3) && !CLS176.MTH2574(file3)) {
                            return null;
                        }
                        if(file3.canWrite()) {
                            return new File(file3, "downloads");
                        }
                    }
                    break;
                }
                case 6: {
                    File file4 = CLS186.MTH2743(context0, 5);
                    if(file4 != null) {
                        if(!CLS176.MTH2570(file4) && !CLS176.MTH2574(file4)) {
                            return null;
                        }
                        if(file4.canWrite()) {
                            return new File(file4, "images");
                        }
                    }
                    break;
                }
                case 7: {
                    File file5 = CLS186.MTH2743(context0, 5);
                    if(file5 != null) {
                        if(!CLS176.MTH2570(file5) && !CLS176.MTH2574(file5)) {
                            return null;
                        }
                        if(file5.canWrite()) {
                            return new File(file5, "videos");
                        }
                    }
                    break;
                }
                case 8: {
                    File file6 = CLS186.MTH2743(context0, 1);
                    if(file6 != null) {
                        if(!CLS176.MTH2570(file6) && !CLS176.MTH2574(file6)) {
                            return null;
                        }
                        if(file6.canWrite()) {
                            return new File(file6, "cache");
                        }
                    }
                    break;
                }
                case 9: {
                    File file7 = CLS186.MTH2743(context0, 1);
                    if(file7 != null) {
                        if(!CLS176.MTH2570(file7) && !CLS176.MTH2574(file7)) {
                            return null;
                        }
                        if(file7.canWrite()) {
                            return new File(file7, "assets");
                        }
                    }
                    break;
                }
                case 10: {
                    File file8 = CLS186.MTH2743(context0, 1);
                    if(file8 != null) {
                        if(!CLS176.MTH2570(file8) && !CLS176.MTH2574(file8)) {
                            return null;
                        }
                        if(file8.canWrite()) {
                            return new File(file8, "WxThemes");
                        }
                    }
                    break;
                }
                case 11: {
                    File file9 = CLS186.MTH2743(context0, 1);
                    if(file9 != null) {
                        if(!CLS176.MTH2570(file9) && !CLS176.MTH2574(file9)) {
                            return null;
                        }
                        if(file9.canWrite()) {
                            return new File(file9, "voice");
                        }
                    }
                    break;
                }
                case 12: {
                    File file10 = CLS186.MTH2743(context0, 1);
                    if(file10 != null) {
                        if(!CLS176.MTH2570(file10) && !CLS176.MTH2574(file10)) {
                            return null;
                        }
                        if(file10.canWrite()) {
                            return new File(file10, "Records");
                        }
                    }
                    break;
                }
                case 13: {
                    File file11 = CLS186.MTH2743(context0, 1);
                    if(file11 != null) {
                        if(!CLS176.MTH2570(file11) && !CLS176.MTH2574(file11)) {
                            return null;
                        }
                        if(file11.canWrite()) {
                            return new File(file11, "moments");
                        }
                    }
                    break;
                }
                case 14: {
                    File file12 = CLS186.MTH2743(context0, 1);
                    if(file12 != null) {
                        if(!CLS176.MTH2570(file12) && !CLS176.MTH2574(file12)) {
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
            CLS185.MTH2707(throwable0, false, true);
            CLS185.MTH2706(("getModuleDirInWechatFiles: " + v), false, true);
        }
        return null;
    }

    public static InputStream MTH2744(Context context0, int v, String s) {
        return CLS186.MTH2717(context0, v, null, s);
    }

    public static boolean MTH2745(Context context0, int v, String s, String s1) {
        return CLS186.MTH2738(context0, v, null, s, s1);
    }

    public static Uri MTH2746(Context context0, int v, String s) {
        return CLS186.MTH2748(context0, v, null, s);
    }

    public static CLS367 MTH2747(Context context0, int v) {
        if(CLS180.MTH2634()) {
            return CLS186.MTH2740(context0, v);
        }
        if(Build.VERSION.SDK_INT >= 30 && CLS180.MTH2636(context0) >= 30 && context0 != null) {
            return CLS186.MTH2716(context0, v);
        }
        if(Environment.getExternalStorageDirectory().canWrite()) {
            File file0 = CLS186.MTH2732(context0, v);
            return file0 == null || !file0.canWrite() ? CLS186.MTH2716(context0, v) : CLS367.MTH5062(file0);
        }
        if(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).canWrite()) {
            File file1 = CLS186.MTH2715(context0, v);
            return file1 == null || !file1.canWrite() ? CLS186.MTH2716(context0, v) : CLS367.MTH5062(file1);
        }
        return CLS186.MTH2716(context0, v);
    }

    public static Uri MTH2748(Context context0, int v, ArrayList arrayList0, String s) {
        String s1 = arrayList0 == null || arrayList0.isEmpty() ? v + s : v + s + TextUtils.join("_", arrayList0);
        if(CLS186.FLD761.MTH3354(s1)) {
            return (Uri)CLS186.FLD761.MTH3348(s1);
        }
        CLS367 ʾʻ0 = CLS186.MTH2751(context0, v, s, arrayList0);
        if(ʾʻ0 != null) {
            Uri uri0 = ʾʻ0.MTH5057();
            CLS186.FLD761.MTH3349(s1, uri0);
            return uri0;
        }
        return null;
    }

    public static ArrayList MTH2749(Context context0, int v) {
        return CLS186.MTH2757(context0, v, null);
    }

    public static CLS367 MTH2750(Uri uri0) {
        return CLS367.MTH5050(CLS98.MTH1323(), uri0);
    }

    public static CLS367 MTH2751(Context context0, int v, String s, ArrayList arrayList0) {
        String s1 = arrayList0 == null || arrayList0.isEmpty() ? v + s : v + s + TextUtils.join("_", arrayList0);
        if(CLS186.FLD762.MTH3354(s1)) {
            CLS367 ʾʻ0 = (CLS367)CLS186.FLD762.MTH3348(s1);
            if(ʾʻ0.MTH5056()) {
                return ʾʻ0;
            }
        }
        CLS367 ʾʻ1 = CLS186.MTH2718(context0, v, arrayList0);
        if(ʾʻ1 == null) {
            return null;
        }
        CLS367 ʾʻ2 = CLS186.MTH2733(ʾʻ1, s);
        if(ʾʻ2 != null) {
            CLS186.FLD762.MTH3349(s1, ʾʻ2);
        }
        return ʾʻ2;
    }

    public static File MTH2752() {
        File file0 = CLS186.MTH2762(CLS98.MTH1323(), 1);
        File file1 = null;
        if(file0 != null) {
            if(!CLS176.MTH2570(file0) && !CLS176.MTH2574(file0)) {
                return null;
            }
            if(file0.canWrite()) {
                file1 = new File(file0, "BACKUP");
                if(!CLS176.MTH2570(file1)) {
                    CLS176.MTH2574(file1);
                }
            }
        }
        return file1;
    }

    // 此方法包含解密的字符串
    public static void MTH2753(CLS367 ʾʻ0) {
        if(ʾʻ0 == null) {
            return;
        }
        Uri uri0 = ʾʻ0.MTH5057();
        Intent intent0 = new Intent("android.intent.action.SEND");
        intent0.setType(ʾʻ0.MTH5053());
        intent0.putExtra("android.intent.extra.STREAM", uri0);
        CLS179.MTH2615().startActivity(Intent.createChooser(intent0, ""));
    }

    public static File MTH2754() {
        File file0 = CLS186.MTH2752();
        File file1 = null;
        if(file0 != null) {
            if(!CLS176.MTH2570(file0) && !CLS176.MTH2574(file0)) {
                return null;
            }
            if(file0.canWrite()) {
                file1 = new File(file0, "BACKUP_MODULE");
                if(!CLS176.MTH2570(file1)) {
                    CLS176.MTH2574(file1);
                }
            }
        }
        return file1;
    }

    public static void MTH2755(File file0, CLS367 ʾʻ0, HashSet hashSet0, boolean z) {
        if(CLS176.MTH2570(file0) && ʾʻ0 != null && !CLS176.MTH2576(file0, ʾʻ0)) {
            if(file0.isDirectory()) {
                File[] arr_file = file0.listFiles();
                if(arr_file != null && arr_file.length != 0) {
                    for(int v = 0; v < arr_file.length; ++v) {
                        File file1 = arr_file[v];
                        if(hashSet0 == null || !hashSet0.contains(file1.getName())) {
                            if(file1.isDirectory()) {
                                CLS367 ʾʻ1 = ʾʻ0.MTH5066(file1.getName());
                                if(ʾʻ1 == null) {
                                    ʾʻ1 = ʾʻ0.MTH5049(file1.getName());
                                }
                                CLS186.MTH2763(file1, ʾʻ1);
                            }
                            else {
                                CLS186.MTH2763(file1, ʾʻ0);
                            }
                            if(z) {
                                CLS176.MTH2578(file1);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            CLS367 ʾʻ2 = ʾʻ0.MTH5066(file0.getName());
            if(ʾʻ2 == null) {
                ʾʻ2 = ʾʻ0.MTH5054(CLS176.MTH2581(file0), file0.getName());
            }
            else if(file0.lastModified() <= ʾʻ2.MTH5059()) {
                return;
            }
            if(ʾʻ2 == null) {
                return;
            }
            try {
                CLS176.MTH2575(new FileInputStream(file0), CLS186.MTH2761(ʾʻ2));
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
    }

    public static boolean MTH2756(Context context0, int v, String s, ArrayList arrayList0) {
        String s1 = arrayList0 == null || arrayList0.isEmpty() ? v + s : v + s + TextUtils.join("_", arrayList0);
        CLS186.FLD762.MTH3353(s1);
        CLS186.FLD761.MTH3353(s1);
        CLS367 ʾʻ0 = CLS186.MTH2751(context0, v, s, arrayList0);
        return ʾʻ0 == null ? false : CLS186.MTH2730(ʾʻ0);
    }

    public static ArrayList MTH2757(Context context0, int v, ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        CLS367 ʾʻ0 = CLS186.MTH2718(context0, v, arrayList0);
        if(ʾʻ0 != null) {
            CLS367[] arr_ʾʻ = ʾʻ0.MTH5060();
            for(int v1 = 0; v1 < arr_ʾʻ.length; ++v1) {
                arrayList1.add(arr_ʾʻ[v1].MTH5055());
            }
        }
        return arrayList1;
    }

    public static void MTH2758() {
        CLS186.FLD761.MTH3352();
        CLS186.FLD762.MTH3352();
    }

    public static OutputStream MTH2759(Context context0, int v, ArrayList arrayList0, String s, String s1) {
        CLS367 ʾʻ0 = CLS186.MTH2718(context0, v, arrayList0);
        if(ʾʻ0 != null) {
            CLS367 ʾʻ1 = CLS186.MTH2733(ʾʻ0, s);
            if(ʾʻ1 == null) {
                ʾʻ1 = ʾʻ0.MTH5054(s1, s);
            }
            String s2 = arrayList0 == null || arrayList0.isEmpty() ? v + s : v + s + TextUtils.join("_", arrayList0);
            CLS186.FLD761.MTH3353(s2);
            CLS186.FLD762.MTH3353(s2);
            return CLS186.MTH2761(ʾʻ1);
        }
        return null;
    }

    public static File MTH2760(Context context0) {
        return new File(context0.getFilesDir().getParentFile(), "databases");
    }

    public static OutputStream MTH2761(CLS367 ʾʻ0) {
        return CLS176.MTH2590(ʾʻ0.MTH5057());
    }

    // 此方法包含解密的字符串
    public static File MTH2762(Context context0, int v) {
        try {
            switch(v) {
                case 1: {
                    if(context0 == null) {
                        context0 = CLS98.MTH1323();
                    }
                    File file0 = context0 == null ? null : context0.getExternalFilesDir(null);
                    return file0 != null && file0.canWrite() ? new File(file0, "X") : null;
                }
                case 2: {
                    File file1 = CLS186.MTH2762(context0, 1);
                    if(file1 != null) {
                        if(!CLS176.MTH2570(file1) && !CLS176.MTH2574(file1)) {
                            return null;
                        }
                        if(file1.canWrite()) {
                            return new File(file1, "images");
                        }
                    }
                    return null;
                }
                case 3: {
                    File file2 = CLS186.MTH2762(context0, 1);
                    if(file2 != null) {
                        if(!CLS176.MTH2570(file2) && !CLS176.MTH2574(file2)) {
                            return null;
                        }
                        if(file2.canWrite()) {
                            return new File(file2, "sounds");
                        }
                    }
                    return null;
                }
                case 4: {
                    File file3 = CLS186.MTH2762(context0, 1);
                    if(file3 != null) {
                        if(!CLS176.MTH2570(file3) && !CLS176.MTH2574(file3)) {
                            return null;
                        }
                        if(file3.canWrite()) {
                            return new File(file3, "voice_mp3_temp");
                        }
                    }
                    return null;
                }
                case 5: {
                    File file4 = CLS186.MTH2762(context0, 1);
                    if(file4 != null) {
                        if(!CLS176.MTH2570(file4) && !CLS176.MTH2574(file4)) {
                            return null;
                        }
                        if(file4.canWrite()) {
                            return new File(file4, "downloads");
                        }
                    }
                    return null;
                }
                case 6: {
                    File file5 = CLS186.MTH2762(context0, 5);
                    if(file5 != null) {
                        if(!CLS176.MTH2570(file5) && !CLS176.MTH2574(file5)) {
                            return null;
                        }
                        if(file5.canWrite()) {
                            return new File(file5, "images");
                        }
                    }
                    return null;
                }
                case 7: {
                    File file6 = CLS186.MTH2762(context0, 5);
                    if(file6 != null) {
                        if(!CLS176.MTH2570(file6) && !CLS176.MTH2574(file6)) {
                            return null;
                        }
                        if(file6.canWrite()) {
                            return new File(file6, "videos");
                        }
                    }
                    return null;
                }
                case 8: {
                    File file7 = CLS186.MTH2762(context0, 1);
                    if(file7 != null) {
                        if(!CLS176.MTH2570(file7) && !CLS176.MTH2574(file7)) {
                            return null;
                        }
                        if(file7.canWrite()) {
                            return new File(file7, "cache");
                        }
                    }
                    return null;
                }
                case 9: {
                    File file8 = CLS186.MTH2762(context0, 1);
                    if(file8 != null) {
                        if(!CLS176.MTH2570(file8) && !CLS176.MTH2574(file8)) {
                            return null;
                        }
                        if(file8.canWrite()) {
                            return new File(file8, "assets");
                        }
                    }
                    return null;
                }
                case 10: {
                    File file9 = CLS186.MTH2762(context0, 1);
                    if(file9 != null) {
                        if(!CLS176.MTH2570(file9) && !CLS176.MTH2574(file9)) {
                            return null;
                        }
                        if(file9.canWrite()) {
                            return new File(file9, "WxThemes");
                        }
                    }
                    return null;
                }
                case 11: {
                    File file10 = CLS186.MTH2762(context0, 1);
                    if(file10 != null) {
                        if(!CLS176.MTH2570(file10) && !CLS176.MTH2574(file10)) {
                            return null;
                        }
                        if(file10.canWrite()) {
                            return new File(file10, "voice");
                        }
                    }
                    return null;
                }
                case 12: {
                    File file11 = CLS186.MTH2762(context0, 1);
                    if(file11 != null) {
                        if(!CLS176.MTH2570(file11) && !CLS176.MTH2574(file11)) {
                            return null;
                        }
                        if(file11.canWrite()) {
                            return new File(file11, "Records");
                        }
                    }
                    return null;
                }
                case 13: {
                    File file12 = CLS186.MTH2762(context0, 1);
                    if(file12 != null) {
                        if(!CLS176.MTH2570(file12) && !CLS176.MTH2574(file12)) {
                            return null;
                        }
                        if(file12.canWrite()) {
                            return new File(file12, "moments");
                        }
                    }
                    return null;
                }
                case 14: {
                    File file13 = CLS186.MTH2762(context0, 1);
                    if(file13 != null) {
                        if(!CLS176.MTH2570(file13) && !CLS176.MTH2574(file13)) {
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
        CLS185.MTH2707(throwable0, false, true);
        CLS185.MTH2706(("getModuleDirInWechatExternalFiles: " + v), false, true);
        return null;
    }

    public static void MTH2763(File file0, CLS367 ʾʻ0) {
        CLS186.MTH2755(file0, ʾʻ0, null, false);
    }

    public static boolean MTH2764(Context context0, File file0, int v, ArrayList arrayList0) {
        CLS367 ʾʻ0 = CLS186.MTH2718(context0, v, arrayList0);
        if(ʾʻ0 != null && file0 != null) {
            CLS219.MTH3068();
            return CLS219.MTH3064(ʾʻ0, file0);
        }
        return false;
    }

    public static void MTH2765(String s) {
        CLS186.FLD761.MTH3353(s);
        CLS186.FLD762.MTH3353(s);
    }
}

