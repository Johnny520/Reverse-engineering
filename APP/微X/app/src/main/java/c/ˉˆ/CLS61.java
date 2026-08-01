// Decompiled by JEB v5.42.0.202606242140

package c.ˉˆ;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import c.ˏי.CLS113;
import c.ˏᵎ.CLS142.CLS141;
import c.ˏᵎ.CLS163.CLS162;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS194;

public class CLS61 {
    public String FLD204;
    public static final CLS61 FLD205;
    public String FLD206;
    public String FLD207;
    public String FLD208;

    static {
        CLS61.FLD205 = new CLS61();
    }

    public static CLS61 MTH1022() {
        return CLS61.FLD205;
    }

    private void MTH1023(Object[] arr_object) {
        if(TextUtils.isEmpty(this.FLD207)) {
            String s = (String)new CLS113(arr_object[0]).MTH1636();
            if(!TextUtils.isEmpty(s)) {
                this.FLD207 = s;
            }
        }
    }

    private void MTH1025(Object[] arr_object) {
        if(TextUtils.isEmpty(this.FLD208)) {
            this.FLD208 = (String)new CLS113(arr_object[0]).MTH1636();
        }
    }

    // 此方法包含解密的字符串
    public String MTH1027(Context context0) {
        if(!TextUtils.isEmpty(this.FLD204)) {
            return this.FLD204;
        }
        try {
            String s = ((TelephonyManager)context0.getSystemService("phone")).getSimSerialNumber();
            return s.equals(this.FLD204) ? s : this.FLD204;
        }
        catch(Throwable unused_ex) {
            return this.FLD204;
        }
    }

    // 此方法包含解密的字符串
    public final String MTH1028(Context context0) {
        if(!TextUtils.isEmpty(this.FLD207)) {
            return this.FLD207;
        }
        try {
            String s = ((TelephonyManager)context0.getSystemService("phone")).getDeviceId();
            return TextUtils.isEmpty(s) || s.equals(this.FLD207) || TextUtils.isEmpty(this.FLD207) ? s : this.FLD207;
        }
        catch(Throwable unused_ex) {
            return this.FLD207;
        }
    }

    private void MTH1029(Object[] arr_object) {
        if(TextUtils.isEmpty(this.FLD204)) {
            this.FLD204 = (String)new CLS113(arr_object[0]).MTH1636();
        }
    }

    // 去混淆评级： 中等(50)
    // 此方法包含解密的字符串
    public void MTH1030(CLS194 ٴˑ0) {
        ٴˑ0.MTH2905("on_TelephonyManager_getDeviceId", ((CLS141)new CLS417(this))).MTH2905("on_TelephonyManager_getSubscriberId", ((CLS141)new CLS416(this))).MTH2905("on_TelephonyManager_getSimSerialNumber", ((CLS141)new CLS419(this))).MTH2905("on_TelephonyManager_getLine1Number", ((CLS141)new CLS427(this))).MTH2899("getDeviceId", ((CLS162)new CLS425(this)));
    }

    private void MTH1031(Object[] arr_object) {
        if(TextUtils.isEmpty(this.FLD206)) {
            this.FLD206 = (String)new CLS113(arr_object[0]).MTH1636();
        }
    }

    // 此方法包含解密的字符串
    @SuppressLint({"HardwareIds", "MissingPermission"})
    public String MTH1032(Context context0) {
        String s;
        try {
            TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
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
            else if(context0.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
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
                s = Settings.Secure.getString(context0.getContentResolver(), "android_id");
            }
            return TextUtils.isEmpty(s) ? "" : s;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public String MTH1033(Context context0) {
        if(!TextUtils.isEmpty(this.FLD206)) {
            return this.FLD206;
        }
        try {
            String s = ((TelephonyManager)context0.getSystemService("phone")).getLine1Number();
            return s.equals(this.FLD206) ? s : this.FLD206;
        }
        catch(Throwable unused_ex) {
            return this.FLD206;
        }
    }

    private Object MTH1035(Object[] arr_object) {
        return this.MTH1036(((Context)arr_object[0]));
    }

    public String MTH1036(Context context0) {
        String s = this.MTH1028(context0);
        return TextUtils.isEmpty(s) ? this.MTH1032(context0) : s;
    }
}

