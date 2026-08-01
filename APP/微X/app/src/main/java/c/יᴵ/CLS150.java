// Decompiled by JEB v5.42.0.202606242140

package c.יᴵ;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import c.ˋʿ.CLS98;
import c.ـˉ.CLS179.CLS178;
import c.ـˉ.CLS204;
import c.ـˉ.CLS213;
import c.ـˉ.CLS255.CLS254;

public class CLS150 {
    public String FLD697;
    public static final CLS150 FLD698;
    public String FLD699;
    public String FLD700;
    public String FLD701;

    static {
        CLS150.FLD698 = new CLS150();
    }

    private void MTH2676(Object[] arr_object) {
        if(TextUtils.isEmpty(this.FLD699)) {
            String s = (String)new CLS98(arr_object[0]).MTH2081();
            if(!TextUtils.isEmpty(s)) {
                this.FLD699 = s;
            }
        }
    }

    private void MTH2678(Object[] arr_object) {
        if(TextUtils.isEmpty(this.FLD701)) {
            this.FLD701 = (String)new CLS98(arr_object[0]).MTH2081();
        }
    }

    // 此方法包含解密的字符串
    public String MTH2680(Context context0) {
        if(!TextUtils.isEmpty(this.FLD700)) {
            return this.FLD700;
        }
        try {
            String s = ((TelephonyManager)context0.getSystemService("\uD8E3hone")).getSimSerialNumber();
            return s.equals(this.FLD700) ? s : this.FLD700;
        }
        catch(Throwable unused_ex) {
            return this.FLD700;
        }
    }

    private void MTH2681(Object[] arr_object) {
        if(TextUtils.isEmpty(this.FLD700)) {
            this.FLD700 = (String)new CLS98(arr_object[0]).MTH2081();
        }
    }

    public static CLS150 MTH2682() {
        return CLS150.FLD698;
    }

    private Object MTH2683(Object[] arr_object) {
        return this.MTH2688(((Context)arr_object[0]));
    }

    // 去混淆评级： 中等(50)
    // 此方法包含解密的字符串
    public void MTH2684(CLS213 ˎʿ0) {
        ˎʿ0.MTH3331("\uD8E3n_TelephonyManager_getDeviceId", ((CLS178)new CLS654(this))).MTH3331("\uD8E3n_TelephonyManager_getSubscriberId", ((CLS178)new CLS643(this))).MTH3331("\uD8E3n_TelephonyManager_getSimSerialNumber", ((CLS178)new CLS653(this))).MTH3331("\uD8E3n_TelephonyManager_getLine1Number", ((CLS178)new CLS650(this))).MTH3314("\uD8E3etDeviceId", ((CLS254)new CLS652(this)));
    }

    // 此方法包含解密的字符串
    public String MTH2685(Context context0) {
        if(!TextUtils.isEmpty(this.FLD701)) {
            return this.FLD701;
        }
        try {
            String s = ((TelephonyManager)context0.getSystemService("\uD8E3hone")).getLine1Number();
            return s.equals(this.FLD701) ? s : this.FLD701;
        }
        catch(Throwable unused_ex) {
            return this.FLD701;
        }
    }

    private void MTH2686(Object[] arr_object) {
        if(TextUtils.isEmpty(this.FLD697)) {
            this.FLD697 = (String)new CLS98(arr_object[0]).MTH2081();
        }
    }

    public String MTH2688(Context context0) {
        String s = this.MTH2690(context0);
        return TextUtils.isEmpty(s) ? this.MTH2689(context0) : s;
    }

    // 此方法包含解密的字符串
    @SuppressLint({"HardwareIds", "MissingPermission"})
    public String MTH2689(Context context0) {
        String s;
        try {
            TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("\uD8E3hone");
            if(telephonyManager0 == null) {
                return "";
            }
            int v = telephonyManager0.getPhoneType();
            int v1 = Build.VERSION.SDK_INT;
            if(v1 < 23) {
                s = telephonyManager0.getDeviceId();
                goto label_19;
            label_18:
                s = null;
            }
            else if(context0.checkSelfPermission("\uD8E3ndroid.permission.READ_PHONE_STATE") != 0) {
                goto label_18;
            }
            else if(v1 < 29) {
                s = telephonyManager0.getDeviceId();
            }
            else {
                try {
                    switch(v) {
                        case 1: {
                            s = telephonyManager0.getImei();
                            goto label_19;
                        }
                        case 2: {
                            s = telephonyManager0.getMeid();
                            goto label_19;
                        }
                        default: {
                            goto label_18;
                        }
                    }
                    s = telephonyManager0.getDeviceId();
                    goto label_19;
                }
                catch(Throwable unused_ex) {
                }
                goto label_18;
            }
        label_19:
            if(TextUtils.isEmpty(s)) {
                s = Settings.Secure.getString(context0.getContentResolver(), "\uD8E3ndroid_id");
            }
            return TextUtils.isEmpty(s) ? "" : s;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public final String MTH2690(Context context0) {
        if(!TextUtils.isEmpty(this.FLD699)) {
            return this.FLD699;
        }
        try {
            String s = ((TelephonyManager)context0.getSystemService("\uD8E3hone")).getDeviceId();
            return TextUtils.isEmpty(s) || s.equals(this.FLD699) || TextUtils.isEmpty(this.FLD699) ? s : this.FLD699;
        }
        catch(Throwable unused_ex) {
            return this.FLD699;
        }
    }
}

