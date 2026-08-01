// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import c.ˊﹶ.CLS98;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class CLS139 {
    public final WeakReference FLD598;
    public String FLD599;
    public int FLD600;
    public String FLD601;
    public final ContentValues FLD602;
    public String FLD603;
    public final HashMap FLD604;

    public CLS139() {
        this(new ContentValues(), null);
    }

    public CLS139(ContentValues contentValues0, Context context0) {
        this.FLD600 = -1;
        this.FLD602 = contentValues0;
        this.FLD604 = new HashMap();
        this.FLD598 = new WeakReference(context0);
    }

    // 此方法包含解密的字符串
    public boolean MTH2105(Context context0) {
        if(this.FLD602.containsKey("isPlay")) {
            return this.FLD602.getAsBoolean("isPlay").booleanValue();
        }
        Bundle bundle0 = CLS180.MTH2653(context0);
        if(bundle0 != null) {
            if(bundle0.containsKey("com.tencent.mm.BuildInfo.BUILD_TAG")) {
                String s = bundle0.getString("com.tencent.mm.BuildInfo.BUILD_TAG");
                if(!TextUtils.isEmpty(s) && s.contains("_GP_")) {
                    return true;
                }
            }
            if(bundle0.containsKey("com.android.stamp.source")) {
                String s1 = bundle0.getString("com.android.stamp.source");
                if(!TextUtils.isEmpty(s1) && s1.contains("play.google.com")) {
                    return true;
                }
            }
        }
        if(this.FLD600 == -1) {
            try {
                String s2 = (String)CLS176.MTH2587(CLS176.MTH2593(context0.getAssets().open("channel.ini"))).get("CHANNEL");
                if(TextUtils.isEmpty(s2)) {
                    this.FLD600 = 0;
                    return false;
                }
                this.FLD600 = Integer.parseInt(s2);
            }
            catch(Throwable unused_ex) {
            }
        }
        return this.FLD600 == 1;
    }

    public boolean MTH2106() {
        return this.MTH2105(CLS98.MTH1323());
    }

    // 此方法包含解密的字符串
    public String MTH2107() {
        if(this.FLD602.containsKey("apkVersionName")) {
            return this.FLD602.getAsString("apkVersionName");
        }
        String s = this.MTH2124();
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        CLS161.MTH2284(s);
        return CLS161.MTH2281();
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public String MTH2108() {
        return this.FLD602.getAsString("processName");
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public String MTH2109() {
        return this.FLD602.getAsString("type");
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public String MTH2110() {
        return this.FLD602.getAsString("core");
    }

    // 去混淆评级： 低(20)
    public final boolean MTH2111(String s) {
        return this.FLD602.containsKey(s) ? this.FLD602.getAsBoolean(s).booleanValue() : false;
    }

    public ContentValues MTH2112() {
        return this.FLD602;
    }

    // 去混淆评级： 中等(100)
    // 此方法包含解密的字符串
    public boolean MTH2113() {
        return this.FLD602.containsKey("playAltHook") ? this.FLD602.getAsBoolean("playAltHook").booleanValue() : false;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public String MTH2114() {
        return this.FLD602.getAsString("trace");
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public String MTH2115() {
        return this.FLD602.containsKey("custom_mark") ? this.FLD602.getAsString("custom_mark") : "";
    }

    // 此方法包含解密的字符串
    public String MTH2116() {
        if(this.FLD602.containsKey("wxCRC")) {
            return this.FLD602.getAsString("wxCRC");
        }
        if(!TextUtils.isEmpty(this.FLD599)) {
            return this.FLD599;
        }
        String s = CLS180.MTH2630();
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = CLS176.MTH2586(s);
        this.FLD599 = s1;
        return s1;
    }

    // 此方法包含解密的字符串
    public boolean MTH2117(String s) {
        if(this.FLD604.containsKey("disable_feature_" + s)) {
            return ((Boolean)this.FLD604.get("disable_feature_" + s)).booleanValue();
        }
        boolean z = this.MTH2111("disable_feature_" + s);
        this.FLD604.put("disable_feature_" + s, Boolean.valueOf(z));
        return z;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public boolean MTH2118() {
        return this.FLD602.containsKey("trace");
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public boolean MTH2119() {
        return this.FLD602.containsKey("isARM64") ? this.FLD602.getAsBoolean("isARM64").booleanValue() : Build.CPU_ABI.toLowerCase().contains("arm64");
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public int MTH2120() {
        return (int)this.FLD602.getAsInteger("wxVersionCode");
    }

    // 此方法包含解密的字符串
    public boolean MTH2121(String s) {
        if(this.FLD604.containsKey("enable_feature_" + s)) {
            return ((Boolean)this.FLD604.get("enable_feature_" + s)).booleanValue();
        }
        boolean z = this.MTH2111("enable_feature_" + s);
        this.FLD604.put("enable_feature_" + s, Boolean.valueOf(z));
        return z;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public String MTH2122() {
        return this.FLD602.getAsString("wxVersionName");
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public String MTH2123() {
        return this.FLD602.getAsString("wxPackageName");
    }

    // 去混淆评级： 低(36)
    // 此方法包含解密的字符串
    public String MTH2124() {
        if(this.FLD602.containsKey("modulePath")) {
            return this.FLD602.getAsString("modulePath");
        }
        return this.FLD598 == null ? "" : ((Context)this.FLD598.get()).getPackageCodePath();
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public String MTH2125(String s) {
        return this.FLD602.containsKey(s) ? this.FLD602.getAsString(s) : "";
    }

    // 此方法包含解密的字符串
    public CLS139 MTH2126(String s) {
        this.FLD604.put("disable_feature_" + s, Boolean.TRUE);
        this.FLD602.put("disable_feature_" + s, Boolean.TRUE);
        return this;
    }

    // 此方法包含解密的字符串
    public String MTH2127() {
        if(this.FLD602.containsKey("wxSig")) {
            return this.FLD602.getAsString("wxSig");
        }
        if(!TextUtils.isEmpty(this.FLD601)) {
            return this.FLD601;
        }
        String s = CLS224.MTH3091(CLS224.MTH3086(CLS180.MTH2630()));
        this.FLD601 = s;
        return s;
    }

    public String MTH2128() {
        if(!TextUtils.isEmpty(this.FLD603)) {
            return this.FLD603;
        }
        String s = this.MTH2124();
        if(!TextUtils.isEmpty(s)) {
            CLS161.MTH2284(s);
        }
        String s1 = CLS161.MTH2279();
        if(!TextUtils.isEmpty(s1)) {
            this.FLD603 = s1;
        }
        if(TextUtils.isEmpty(this.FLD603)) {
            WeakReference weakReference0 = this.FLD598;
            if(weakReference0 != null) {
                this.FLD603 = ((Context)weakReference0.get()).getPackageName();
            }
        }
        return this.FLD603;
    }

    // 去混淆评级： 中等(100)
    // 此方法包含解密的字符串
    public int MTH2129() {
        return this.FLD602.containsKey("apkVersionCode") ? ((int)this.FLD602.getAsInteger("apkVersionCode")) : -1;
    }
}

