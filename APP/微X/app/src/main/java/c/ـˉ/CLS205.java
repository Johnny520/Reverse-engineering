// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.text.TextUtils;
import c.ٴˑ.CLS299;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CLS205 {
    public static HashSet FLD954;

    public static boolean MTH3258(String s) {
        return CLS205.FLD954 == null ? false : CLS205.FLD954.contains(s);
    }

    public static void MTH3259(ZipOutputStream zipOutputStream0, String s, CLS299 ـᵎ0) {
        try {
            if(ـᵎ0.MTH4376()) {
                zipOutputStream0.putNextEntry(new ZipEntry(s));
                return;
            }
            byte[] arr_b = new byte[0x1800];
            InputStream inputStream0 = CLS243.MTH3631(ـᵎ0);
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
            CLS204.MTH3257(throwable0);
        }
    }

    public static void MTH3260() {
        HashSet hashSet0 = CLS205.FLD954;
        if(hashSet0 != null) {
            hashSet0.clear();
        }
    }

    public static boolean MTH3261(CLS299 ـᵎ0, File file0) {
        try {
            return CLS205.MTH3263(ـᵎ0, new FileOutputStream(file0));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return false;
        }
    }

    public static void MTH3262(ZipOutputStream zipOutputStream0, String s, CLS299 ـᵎ0) {
        if(ـᵎ0.MTH4376()) {
            CLS299[] arr_ـᵎ = ـᵎ0.MTH4387();
            if(arr_ـᵎ != null) {
                for(int v = 0; v < arr_ـᵎ.length; ++v) {
                    CLS299 ـᵎ1 = arr_ـᵎ[v];
                    String s1 = ـᵎ1.MTH4378();
                    if(!CLS205.MTH3258(s1)) {
                        if(!TextUtils.isEmpty(s)) {
                            s1 = s + "/" + s1;
                        }
                        if(ـᵎ1.MTH4376()) {
                            CLS205.MTH3259(zipOutputStream0, s1 + "/", ـᵎ1);
                            CLS205.MTH3262(zipOutputStream0, s1, ـᵎ1);
                        }
                        else {
                            CLS205.MTH3259(zipOutputStream0, s1, ـᵎ1);
                        }
                    }
                }
            }
        }
        else {
            String s2 = ـᵎ0.MTH4378();
            if(!TextUtils.isEmpty(s)) {
                s2 = s + "/" + s2;
            }
            CLS205.MTH3259(zipOutputStream0, s2, ـᵎ0);
        }
    }

    public static boolean MTH3263(CLS299 ـᵎ0, OutputStream outputStream0) {
        try {
            ZipOutputStream zipOutputStream0 = new ZipOutputStream(new BufferedOutputStream(outputStream0));
            CLS205.MTH3262(zipOutputStream0, "", ـᵎ0);
            zipOutputStream0.close();
            return true;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return false;
        }
    }
}

