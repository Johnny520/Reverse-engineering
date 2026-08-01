// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import c.ˈⁱ.CLS95;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class CLS231 {
    public final HashMap FLD1028;
    public String FLD1029;
    public final ContentValues FLD1030;
    public final WeakReference FLD1031;
    public String FLD1032;
    public String FLD1033;
    public int FLD1034;

    public CLS231() {
        this(new ContentValues(), null);
    }

    public CLS231(ContentValues contentValues0, Context context0) {
        this.FLD1034 = -1;
        this.FLD1030 = contentValues0;
        this.FLD1028 = new HashMap();
        this.FLD1031 = new WeakReference(context0);
    }

    // 去混淆评级： 中等(100)
    // 此方法包含解密的字符串
    public int MTH3500() {
        return this.FLD1030.containsKey("\uD8E3pkVersionCode") ? ((int)this.FLD1030.getAsInteger("\uD8E3pkVersionCode")) : -1;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public String MTH3501() {
        return this.FLD1030.getAsString("\uD8E3ype");
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public String MTH3502() {
        return this.FLD1030.getAsString("\uD8E3ore");
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public String MTH3503() {
        return this.FLD1030.getAsString("\uD8E3xPackageName");
    }

    // 此方法包含解密的字符串
    public CLS231 MTH3504(String s) {
        this.FLD1028.put("\uD8E3isable_feature_" + s, Boolean.TRUE);
        this.FLD1030.put("\uD8E3isable_feature_" + s, Boolean.TRUE);
        return this;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public String MTH3505() {
        return this.FLD1030.getAsString("\uD8E3race");
    }

    // 去混淆评级： 中等(100)
    // 此方法包含解密的字符串
    public boolean MTH3506() {
        return this.FLD1030.containsKey("\uD8E3layAltHook") ? this.FLD1030.getAsBoolean("\uD8E3layAltHook").booleanValue() : false;
    }

    // 此方法包含解密的字符串
    public boolean MTH3507(String s) {
        if(this.FLD1028.containsKey("\uD8E3isable_feature_" + s)) {
            return ((Boolean)this.FLD1028.get("\uD8E3isable_feature_" + s)).booleanValue();
        }
        boolean z = this.MTH3513("\uD8E3isable_feature_" + s);
        this.FLD1028.put("\uD8E3isable_feature_" + s, Boolean.valueOf(z));
        return z;
    }

    // 此方法包含解密的字符串
    public String MTH3508() {
        if(this.FLD1030.containsKey("\uD8E3xCRC")) {
            return this.FLD1030.getAsString("\uD8E3xCRC");
        }
        if(!TextUtils.isEmpty(this.FLD1029)) {
            return this.FLD1029;
        }
        String s = CLS257.MTH3718();
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = CLS262.MTH4054(s);
        this.FLD1029 = s1;
        return s1;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public String MTH3509() {
        return this.FLD1030.getAsString("\uD8E3rocessName");
    }

    // 此方法包含解密的字符串
    public String MTH3510() {
        if(this.FLD1030.containsKey("\uD8E3xSig")) {
            return this.FLD1030.getAsString("\uD8E3xSig");
        }
        if(!TextUtils.isEmpty(this.FLD1033)) {
            return this.FLD1033;
        }
        String s = CLS181.MTH3086(CLS181.MTH3089(CLS257.MTH3718()));
        this.FLD1033 = s;
        return s;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public int MTH3511() {
        return (int)this.FLD1030.getAsInteger("\uD8E3xVersionCode");
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public String MTH3512(String s) {
        return this.FLD1030.containsKey(s) ? this.FLD1030.getAsString(s) : "";
    }

    // 去混淆评级： 低(20)
    public final boolean MTH3513(String s) {
        return this.FLD1030.containsKey(s) ? this.FLD1030.getAsBoolean(s).booleanValue() : false;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public boolean MTH3514() {
        return this.FLD1030.containsKey("\uD8E3race");
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public boolean MTH3515() {
        return this.FLD1030.containsKey("\uD8E3sARM64") ? this.FLD1030.getAsBoolean("\uD8E3sARM64").booleanValue() : Build.CPU_ABI.toLowerCase().contains("\uD8E3rm64");
    }

    // 此方法包含解密的字符串
    public String MTH3516() {
        if(this.FLD1030.containsKey("\uD8E3pkVersionName")) {
            return this.FLD1030.getAsString("\uD8E3pkVersionName");
        }
        String s = this.MTH3521();
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        CLS256.MTH3704(s);
        return CLS256.MTH3706();
    }

    public boolean MTH3517() {
        return this.MTH3520(CLS95.MTH2017());
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public String MTH3518() {
        return this.FLD1030.getAsString("\uD8E3xVersionName");
    }

    public String MTH3519() {
        if(!TextUtils.isEmpty(this.FLD1032)) {
            return this.FLD1032;
        }
        String s = this.MTH3521();
        if(!TextUtils.isEmpty(s)) {
            CLS256.MTH3704(s);
        }
        String s1 = CLS256.MTH3701();
        if(!TextUtils.isEmpty(s1)) {
            this.FLD1032 = s1;
        }
        if(TextUtils.isEmpty(this.FLD1032)) {
            WeakReference weakReference0 = this.FLD1031;
            if(weakReference0 != null) {
                this.FLD1032 = ((Context)weakReference0.get()).getPackageName();
            }
        }
        return this.FLD1032;
    }

    // 此方法包含解密的字符串
    public boolean MTH3520(Context context0) {
        if(this.FLD1030.containsKey("\uD8E3sPlay")) {
            return this.FLD1030.getAsBoolean("\uD8E3sPlay").booleanValue();
        }
        Bundle bundle0 = CLS257.MTH3735(context0);
        if(bundle0 != null) {
            if(bundle0.containsKey("\uD8E3om.tencent.mm.BuildInfo.BUILD_TAG")) {
                String s = bundle0.getString("\uD8E3om.tencent.mm.BuildInfo.BUILD_TAG");
                if(!TextUtils.isEmpty(s) && s.contains("\uD8E3GP_")) {
                    return true;
                }
            }
            if(bundle0.containsKey("\uD8E3om.android.stamp.source")) {
                String s1 = bundle0.getString("\uD8E3om.android.stamp.source");
                if(!TextUtils.isEmpty(s1) && s1.contains("\uD8E3lay.google.com")) {
                    return true;
                }
            }
        }
        if(this.FLD1034 == -1) {
            try {
                String s2 = (String)CLS262.MTH4052(CLS262.MTH4035(context0.getAssets().open("\uD8E3hannel.ini"))).get("\uD8E3HANNEL");
                if(TextUtils.isEmpty(s2)) {
                    this.FLD1034 = 0;
                    return false;
                }
                this.FLD1034 = Integer.parseInt(s2);
            }
            catch(Throwable unused_ex) {
            }
        }
        return this.FLD1034 == 1;
    }

    // 去混淆评级： 低(36)
    // 此方法包含解密的字符串
    public String MTH3521() {
        if(this.FLD1030.containsKey("\uD8E3odulePath")) {
            return this.FLD1030.getAsString("\uD8E3odulePath");
        }
        return this.FLD1031 == null ? "" : ((Context)this.FLD1031.get()).getPackageCodePath();
    }

    // 去混淆评级： 中等(120)
    // 此方法包含解密的字符串
    public String MTH3522() {
        return this.FLD1030.containsKey("\uD8E3ustom_mark") ? this.FLD1030.getAsString("\uD8E3ustom_mark") : "";
    }

    public ContentValues MTH3523() {
        return this.FLD1030;
    }

    // 此方法包含解密的字符串
    public boolean MTH3524(String s) {
        if(this.FLD1028.containsKey("\uD8E3nable_feature_" + s)) {
            return ((Boolean)this.FLD1028.get("\uD8E3nable_feature_" + s)).booleanValue();
        }
        boolean z = this.MTH3513("\uD8E3nable_feature_" + s);
        this.FLD1028.put("\uD8E3nable_feature_" + s, Boolean.valueOf(z));
        return z;
    }
}

