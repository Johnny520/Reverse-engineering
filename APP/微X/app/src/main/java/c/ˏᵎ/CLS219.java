// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.text.TextUtils;
import c.ﾞʿ.CLS367;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CLS219 {
    public static HashSet FLD894;

    public static boolean MTH3064(CLS367 ʾʻ0, File file0) {
        try {
            return CLS219.MTH3066(ʾʻ0, new FileOutputStream(file0));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return false;
        }
    }

    public static void MTH3065(ZipOutputStream zipOutputStream0, String s, CLS367 ʾʻ0) {
        try {
            if(ʾʻ0.MTH5061()) {
                zipOutputStream0.putNextEntry(new ZipEntry(s));
                return;
            }
            byte[] arr_b = new byte[0x1800];
            InputStream inputStream0 = CLS186.MTH2734(ʾʻ0);
            BufferedInputStream bufferedInputStream0 = new BufferedInputStream(inputStream0, 0x1800);
            zipOutputStream0.putNextEntry(new ZipEntry(s));
            int v;
            while((v = bufferedInputStream0.read(arr_b, 0, 0x1800)) != -1) {
                zipOutputStream0.write(arr_b, 0, v);
            }
            bufferedInputStream0.close();
            inputStream0.close();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public static boolean MTH3066(CLS367 ʾʻ0, OutputStream outputStream0) {
        try {
            ZipOutputStream zipOutputStream0 = new ZipOutputStream(new BufferedOutputStream(outputStream0));
            CLS219.MTH3067(zipOutputStream0, "", ʾʻ0);
            zipOutputStream0.close();
            return true;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return false;
        }
    }

    public static void MTH3067(ZipOutputStream zipOutputStream0, String s, CLS367 ʾʻ0) {
        if(ʾʻ0.MTH5061()) {
            CLS367[] arr_ʾʻ = ʾʻ0.MTH5060();
            if(arr_ʾʻ != null) {
                for(int v = 0; v < arr_ʾʻ.length; ++v) {
                    CLS367 ʾʻ1 = arr_ʾʻ[v];
                    String s1 = ʾʻ1.MTH5055();
                    if(!CLS219.MTH3069(s1)) {
                        if(!TextUtils.isEmpty(s)) {
                            s1 = s + "/" + s1;
                        }
                        if(ʾʻ1.MTH5061()) {
                            CLS219.MTH3065(zipOutputStream0, s1 + "/", ʾʻ1);
                            CLS219.MTH3067(zipOutputStream0, s1, ʾʻ1);
                        }
                        else {
                            CLS219.MTH3065(zipOutputStream0, s1, ʾʻ1);
                        }
                    }
                }
            }
        }
        else {
            String s2 = ʾʻ0.MTH5055();
            if(!TextUtils.isEmpty(s)) {
                s2 = s + "/" + s2;
            }
            CLS219.MTH3065(zipOutputStream0, s2, ʾʻ0);
        }
    }

    public static void MTH3068() {
        HashSet hashSet0 = CLS219.FLD894;
        if(hashSet0 != null) {
            hashSet0.clear();
        }
    }

    public static boolean MTH3069(String s) {
        return CLS219.FLD894 == null ? false : CLS219.FLD894.contains(s);
    }
}

