// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import d.יʻ.CLS62;
import d.יʻ.CLS63;
import d.יʻ.CLS69;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.zip.CRC32;

public final class CLS36 {
    public final HashMap FLD190;
    public final ContentValues FLD191;
    public String FLD192;
    public final WeakReference FLD193;

    public CLS36(ContentValues contentValues0, Context context0) {
        this.FLD191 = contentValues0;
        this.FLD190 = new HashMap();
        this.FLD193 = new WeakReference(context0);
    }

    // 此方法包含解密的字符串
    public final String MTH593() {
        ContentValues contentValues0 = this.FLD191;
        if(contentValues0.containsKey("modulePath")) {
            return contentValues0.getAsString("modulePath");
        }
        return this.FLD193 == null ? null : ((Context)this.FLD193.get()).getPackageCodePath();
    }

    // 此方法包含解密的字符串
    public final boolean MTH594(String s) {
        HashMap hashMap0 = this.FLD190;
        if(hashMap0.containsKey("disable_feature_" + s)) {
            return ((Boolean)hashMap0.get("disable_feature_" + s)).booleanValue();
        }
        boolean z = this.FLD191.containsKey("disable_feature_" + s) ? this.FLD191.getAsBoolean("disable_feature_" + s).booleanValue() : false;
        hashMap0.put("disable_feature_" + s, Boolean.valueOf(z));
        return z;
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public final String MTH595() {
        return this.FLD191.containsKey("custom_mark") ? this.FLD191.getAsString("custom_mark") : "";
    }

    // 此方法包含解密的字符串
    public final String MTH596() {
        String s1;
        String s;
        ContentValues contentValues0 = this.FLD191;
        if(contentValues0.containsKey("wxCRC")) {
            return contentValues0.getAsString("wxCRC");
        }
        if(!TextUtils.isEmpty(this.FLD192)) {
            return this.FLD192;
        }
        try {
            Context context0 = CLS69.MTH810();
            if(context0 == null) {
                context0 = (Context)CLS62.FLD317.MTH757("getCurrentActivity", new Object[0]);
            }
            if(context0 == null) {
                s = "";
            }
            else {
                ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
                if(applicationInfo0 == null || TextUtils.isEmpty(applicationInfo0.nativeLibraryDir)) {
                    s = context0.getPackageCodePath();
                }
                else {
                    File file0 = new File(applicationInfo0.nativeLibraryDir).getParentFile();
                    if(file0 == null) {
                        s = context0.getPackageCodePath();
                    }
                    else {
                        File file1 = file0.getParentFile();
                        if(file1 == null) {
                            s = context0.getPackageCodePath();
                        }
                        else {
                            File file2 = new File(file1, "base.apk");
                            s = CLS63.MTH771(file2) ? file2.getAbsolutePath() : context0.getPackageCodePath();
                        }
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
            s = "";
        }
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        try {
            if(TextUtils.isEmpty(s)) {
                s1 = "";
            }
            else {
                byte[] arr_b = new byte[0x1000];
                FileInputStream fileInputStream0 = new FileInputStream(s);
                CRC32 cRC320 = new CRC32();
                int v;
                while((v = fileInputStream0.read(arr_b)) != -1) {
                    cRC320.update(arr_b, 0, v);
                }
                fileInputStream0.close();
                s1 = Long.toHexString(cRC320.getValue());
            }
        }
        catch(Throwable throwable1) {
            CLS69.MTH797(throwable1);
            s1 = "";
        }
        this.FLD192 = s1;
        return s1;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final String MTH597() {
        return this.FLD191.getAsString("type");
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public final boolean MTH598() {
        return this.FLD191.containsKey("isPlay") ? this.FLD191.getAsBoolean("isPlay").booleanValue() : false;
    }
}

