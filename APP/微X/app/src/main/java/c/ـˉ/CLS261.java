// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import c.ˈⁱ.CLS93;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS102;
import c.ˋˑ.CLS104;
import c.יᴵ.CLS144.CLS142;
import c.יᴵ.CLS144;
import c.יᴵ.CLS147;
import c.יᴵ.CLS148;
import c.יᴵ.CLS150;
import c.יᴵ.CLS156;
import c.יᵢ.CLS157;
import c.יᵢ.CLS169;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class CLS261 {
    public boolean FLD1097;
    public boolean FLD1098;
    public boolean FLD1099;
    public final ConcurrentHashMap FLD1100;
    public String FLD1101;
    public boolean FLD1102;
    public boolean FLD1103;
    public String FLD1104;
    public int FLD1105;
    public boolean FLD1106;
    public boolean FLD1107;
    public boolean FLD1108;
    public String FLD1109;
    public String FLD1110;
    public int FLD1111;
    public final Runnable FLD1112;
    public static final CLS261 FLD1113;
    public boolean FLD1114;
    public boolean FLD1115;
    public final HashSet FLD1116;
    public int FLD1117;
    public boolean FLD1118;
    public boolean FLD1119;
    public boolean FLD1120;
    public int FLD1121;
    public ArrayList FLD1122;
    public String FLD1123;
    public boolean FLD1124;
    public boolean FLD1125;
    public boolean FLD1126;
    public boolean FLD1127;
    public boolean FLD1128;
    public boolean FLD1129;
    public ArrayList FLD1130;
    public boolean FLD1131;
    public int FLD1132;
    public boolean FLD1133;
    public int FLD1134;
    public boolean FLD1135;
    public boolean FLD1136;
    public boolean FLD1137;
    public int FLD1138;
    public boolean FLD1139;
    public boolean FLD1140;
    public String FLD1141;
    public boolean FLD1142;
    public final HashSet FLD1143;
    public int FLD1144;
    public boolean FLD1145;
    public boolean FLD1146;
    public int FLD1147;
    public String FLD1148;
    public boolean FLD1149;
    public boolean FLD1150;
    public boolean FLD1151;
    public boolean FLD1152;
    public HashSet FLD1153;
    public boolean FLD1154;
    public boolean FLD1155;
    public ArrayList FLD1156;
    public String FLD1157;
    public final HashSet FLD1158;
    public boolean FLD1159;
    public boolean FLD1160;
    public boolean FLD1161;
    public CLS231 FLD1162;
    public boolean FLD1163;
    public boolean FLD1164;
    public String FLD1165;

    static {
        CLS261.FLD1113 = new CLS261();
    }

    // 此方法包含解密的字符串
    public CLS261() {
        this.FLD1147 = -1;
        this.FLD1149 = false;
        this.FLD1125 = false;
        this.FLD1165 = "";
        this.FLD1119 = false;
        this.FLD1121 = 0;
        this.FLD1151 = true;
        this.FLD1161 = false;
        this.FLD1105 = 0;
        this.FLD1134 = 0;
        this.FLD1164 = false;
        this.FLD1152 = false;
        this.FLD1135 = false;
        this.FLD1103 = false;
        this.FLD1117 = 0;
        this.FLD1115 = false;
        this.FLD1132 = 0;
        this.FLD1111 = 0;
        this.FLD1108 = false;
        this.FLD1158 = new HashSet();
        this.FLD1100 = new ConcurrentHashMap();
        this.FLD1116 = new HashSet();
        this.FLD1143 = new HashSet();
        CLS213.MTH3304().MTH3331("\uD8E3ownloadFeaturePack", ((CLS178)new CLS713(this))).MTH3331("\uD8E3equestFeaturePackUpdate", ((CLS178)new CLS761(this))).MTH3314("\uD8E3etVerifierData", ((CLS254)new CLS720(this))).MTH3314("\uD8E3etLicData", ((CLS254)new CLS703(this))).MTH3314("\uD8E3etFeaturePacks", ((CLS254)new CLS742(this))).MTH3331("\uD8E3eportInstalledApps", ((CLS178)new CLS724(this))).MTH3331("\uD8E3heckUpdates", ((CLS178)new CLS774(this))).MTH3331("\uD8E3ynamicUpdateCheck", ((CLS178)new CLS780(this))).MTH3314("\uD8E3sUpdateFileAvailable", ((CLS254)new CLS770(this))).MTH3331("\uD8E3ownloadCore", ((CLS178)new CLS750(this))).MTH3331("\uD8E3ownloadLib", ((CLS178)new CLS756(this))).MTH3314("\uD8E3etDisabledCode", ((CLS254)new CLS722(this))).MTH3314("\uD8E3sRandomFailed", ((CLS254)new CLS727(this))).MTH3314("\uD8E3sDisableDonate", ((CLS254)new CLS763(this)));
        this.FLD1112 = () -> this.MTH3858(false);
    }

    public boolean MTH3834() {
        return this.FLD1149;
    }

    // 此方法包含解密的字符串
    public void MTH3835() {
        if(this.FLD1099 && (!this.FLD1136 || !this.MTH4020())) {
            CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
            this.FLD1136 = true;
            this.FLD1099 = true;
            this.MTH3948(821);
            return;
        }
        if(CLS200.MTH3224().MTH3230(Long.toHexString(System.currentTimeMillis()))) {
            CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
            this.FLD1136 = true;
            this.FLD1099 = true;
            this.MTH3948(820);
        }
        int v = this.FLD1121 + 1;
        this.FLD1121 = v;
        if(v < 10) {
            return;
        }
        this.FLD1121 = 0;
        this.MTH4019();
    }

    private Object MTH3836(Object[] arr_object) {
        return Boolean.valueOf(this.MTH4024());
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    public boolean MTH3837() {
        if(this.MTH3929() && this.MTH3969() && this.MTH3953(900000L)) {
            if(this.MTH3870() || TextUtils.isEmpty(CLS95.MTH2031().MTH2733("\uD8E3_valid", "")) || TextUtils.isEmpty(CLS95.MTH2031().MTH2733("\uD8E3erifier6", "")) || !this.MTH3999() || !CLS95.MTH2031().MTH2725("\uD8E3alid", true) || this.MTH3915() || !CLS262.MTH4039("", CLS181.MTH3088(CLS93.MTH1973()))) {
                return true;
            }
            if(!CLS262.MTH4039("", "")) {
                return true;
            }
            if(!CLS262.MTH4039("", "")) {
                return true;
            }
            if(!CLS262.MTH4039("", CLS181.MTH3088(("\uD8E3_" + this.FLD1162.MTH3501())))) {
                return true;
            }
            HashSet hashSet0 = this.MTH3923();
            if(hashSet0.isEmpty()) {
                return true;
            }
            for(Object object0: hashSet0) {
                if(!CLS262.MTH4039("", CLS181.MTH3088(("\uD8E3P_" + ((String)object0))))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            if(!CLS262.MTH4039("", "")) {
                return true;
            }
            try {
                String s = this.MTH3944();
                if(TextUtils.isEmpty(s)) {
                    return true;
                }
                Object object1 = CLS95.MTH1982(130, new Object[]{"\uD8E3erifier6", s, CLS95.MTH2014()});
                String s1 = object1 == null ? "" : ((String)object1);
                if(TextUtils.isEmpty(s1) || Math.abs(Long.parseLong(s1, 16) - System.currentTimeMillis()) < 432000000L) {
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
            return CLS95.MTH2031().MTH2725("\uD8E3ay_update_check", false) ? true : this.MTH3953(CLS224.MTH3468("\uD8E3pdate_check_freq_time", 43200000L));
        }
        return false;
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public final void MTH3838() {
        CLS262.MTH4065(new File("", ""));
    }

    // 此方法包含解密的字符串
    public final void MTH3842() {
        if(!this.FLD1154 && (!this.FLD1100.containsKey("\uD8E3md") && !this.FLD1139)) {
            ++this.FLD1138;
            this.FLD1154 = true;
            CLS189 ˆʾ0 = new CLS189(CLS266.MTH4132(this.MTH3921(), "", "\uD8E3md"));
            ˆʾ0.MTH3137(CLS266.MTH4132(this.MTH3913(), "", "\uD8E3md"));
            ˆʾ0.MTH3129(false);
            ˆʾ0.MTH3144(((CLS187)new CLS710(this)));
        }
    }

    public final void MTH3843() {
        CLS144.MTH2583().MTH2604(((CLS142)() -> // 此方法包含解密的字符串
        {
            if(this.FLD1155) {
                CLS224.MTH3446("");
            }
            CLS169.MTH2922().MTH2918();
            CLS157.MTH2788().MTH2776();
        }));
    }

    public CLS261 MTH3845() {
        this.FLD1136 = true;
        this.FLD1099 = true;
        return this;
    }

    // 此方法包含解密的字符串
    public final String MTH3846() {
        File file0 = new File("", "");
        if(!CLS262.MTH4050(file0)) {
            return "";
        }
        String s = CLS262.MTH4069(file0);
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = CLS240.MTH3585(s);
        try {
            return TextUtils.isEmpty(s1) ? "" : new JSONObject(s1).getString("\uD8E3");
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return "";
        }
    }

    public final String MTH3847() {
        if(TextUtils.isEmpty(this.FLD1148)) {
            String s = this.FLD1162.MTH3518();
            String s1 = String.valueOf(this.FLD1162.MTH3511());
            this.FLD1148 = CLS224.MTH3464(s, 3) + s1;
        }
        return this.FLD1148;
    }

    // 去混淆评级： 低(40)
    private Object MTH3848(Object[] arr_object) {
        return !CLS200.MTH3224().MTH3240() && !CLS200.MTH3224().MTH3225() && CLS102.MTH2153() && (this.MTH3996() || this.MTH4017() == 9005);
    }

    public boolean MTH3849() {
        return this.FLD1135;
    }

    // 此方法包含解密的字符串
    public long MTH3850(String s) {
        try {
            JSONObject jSONObject0 = CLS95.MTH2031().MTH2750("\uD8E3atestVersions", new JSONObject());
            if(jSONObject0.has(s)) {
                return s.equals("\uD8E3pk") ? Long.parseLong(CLS170.MTH3005(jSONObject0.getString(s))[0], 16) : Long.parseLong(jSONObject0.getString(s), 16);
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return -1L;
    }

    private void MTH3851(Object[] arr_object) {
        this.MTH3934();
    }

    // 此方法包含解密的字符串
    public final void MTH3852() {
        try {
            File file0 = this.MTH3978();
            if(!CLS262.MTH4050(file0)) {
                return;
            }
            String s = this.FLD1162.MTH3518();
            if(TextUtils.isEmpty(s)) {
                return;
            }
            if(TextUtils.isEmpty(CLS95.MTH2014())) {
                file0.delete();
            }
            CLS156 ٴʻ0 = CLS95.MTH2031();
            if(ٴʻ0 != null) {
                String s1 = ٴʻ0.MTH2733("\uD8E3arams_S6", "");
                if(TextUtils.isEmpty(s1)) {
                    return;
                }
                String s2 = "";
                Object object0 = CLS95.MTH1982(130, new Object[]{"\uD8E3aram", s1, CLS95.MTH2014()});
                if(object0 != null) {
                    s2 = (String)object0;
                }
                if(!s.equals(s2)) {
                    file0.delete();
                    CLS204.MTH3252("\uD8E3arams verification failed!");
                }
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public void MTH3853() {
        if(this.FLD1098) {
            return;
        }
        try {
            this.FLD1098 = true;
            CLS189 ˆʾ0 = new CLS189(CLS266.MTH4132(this.MTH3921(), this.MTH3984(), "\uD8E3_" + this.FLD1162.MTH3501()));
            ˆʾ0.MTH3137(CLS266.MTH4132(this.MTH3913(), this.MTH3984(), "\uD8E3_" + this.FLD1162.MTH3501()));
            ˆʾ0.MTH3129(false);
            ˆʾ0.MTH3144(((CLS187)new CLS712(this)));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public boolean MTH3854() {
        return this.FLD1152;
    }

    // 此方法包含解密的字符串
    public String MTH3855() {
        CLS156 ٴʻ0 = CLS95.MTH2031();
        return ٴʻ0 == null ? this.FLD1165 : ٴʻ0.MTH2733("\uD8E3ush_msg", this.FLD1165);
    }

    public void MTH3858(boolean z) {
        this.FLD1151 = false;
        this.MTH3865(z);
    }

    public int MTH3859() {
        return this.FLD1105;
    }

    public boolean MTH3860() {
        return this.FLD1115;
    }

    private Object MTH3861(Object[] arr_object) {
        return this.MTH3923();
    }

    public final void MTH3863() {
        CLS144.MTH2583().MTH2604(((CLS142)() -> {
            CLS169.MTH2922().MTH2917();
            CLS157.MTH2788().MTH2813();
        }));
    }

    // 此方法包含解密的字符串
    private void MTH3864(String s, String s1, CLS186 ˆʾ$ʻᵢ0) {
        --this.FLD1138;
        this.FLD1143.remove(s);
        byte[] arr_b = CLS266.MTH4134(ˆʾ$ʻᵢ0.FLD885);
        if(arr_b == null) {
            CLS204.MTH3252(("\uD8E3ownload " + s + "\uD8E3failed"));
            this.MTH3916();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("\uD8E3ame", s);
        contentValues0.put("\uD8E3ata", arr_b);
        this.MTH3911(s1, contentValues0);
    }

    public final void MTH3865(boolean z) {
        this.MTH3866(z, null);
    }

    // 此方法包含解密的字符串
    public final void MTH3866(boolean z, String s) {
        if(!TextUtils.isEmpty(CLS95.MTH2014()) && !"\uD8E3NO_ID+".equals(CLS95.MTH2014())) {
            CLS144.MTH2583().MTH2599(this.FLD1112);
            this.FLD1151 = true;
            if(!TextUtils.isEmpty(s) && !s.endsWith("\uD8E3heck.php")) {
                s = s.substring(0, s.lastIndexOf("\uD8E3")) + "\uD8E3check.php";
            }
            try {
                this.MTH3852();
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
            this.FLD1164 = false;
            this.FLD1152 = false;
            JSONObject jSONObject0 = this.MTH4007(null);
            CLS189 ˆʾ0 = new CLS189();
            ˆʾ0.MTH3134(s);
            ˆʾ0.MTH3124(this.MTH3976());
            ˆʾ0.MTH3137(this.MTH3949());
            ˆʾ0.MTH3129(false);
            ˆʾ0.MTH3123("\uD8E3OST");
            ˆʾ0.MTH3133("\uD8E3md", "\uD8E3");
            ˆʾ0.MTH3133("\uD8E3rgs", jSONObject0.toString());
            ˆʾ0.MTH3144(((CLS187)new CLS704(this, z)));
            return;
        }
        CLS204.MTH3255("\uD8E3ccount name not found!", true, false);
        if(!CLS240.MTH3590()) {
            this.MTH3842();
        }
    }

    // 此方法包含解密的字符串
    private void MTH3867(boolean z, CLS186 ˆʾ$ʻᵢ0) {
        this.FLD1131 = true;
        boolean z1 = this.MTH3902();
        boolean z2 = CLS200.MTH3224().MTH3230("\uD8E3riority_update");
        if(ˆʾ$ʻᵢ0.MTH3106()) {
            this.FLD1164 = true;
            this.FLD1115 = false;
            this.MTH3843();
            return;
        }
        String s = new String(ˆʾ$ʻᵢ0.FLD885);
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            JSONObject jSONObject0 = this.MTH3890(s);
            if(jSONObject0 == null) {
                return;
            }
            CLS95.MTH2031().MTH2749("\uD8E3ast_update_check", Long.toHexString(System.currentTimeMillis()));
            CLS204.MTH3254(("\uD8E3rl: " + ˆʾ$ʻᵢ0.FLD884));
            CLS204.MTH3254(jSONObject0.toString(4));
            String s1 = jSONObject0.optString("\uD8E3sg");
            this.FLD1159 = false;
            CLS95.MTH2031().MTH2749("\uD8E3ffline_time", "");
            CLS95.MTH2031().MTH2749("\uD8E3ay_update_check", Boolean.FALSE);
            if(jSONObject0.has("\uD8E3isable_code")) {
                this.MTH3948(jSONObject0.getInt("\uD8E3isable_code"));
            }
            this.MTH3920("\uD8E3ush_msg", s1);
            this.MTH3920("\uD8E3atest_param", jSONObject0.optString("\uD8E3atest_param"));
            this.FLD1141 = jSONObject0.optString("\uD8E3erifier6");
            this.MTH3920("\uD8E3erifier6", this.FLD1141);
            this.MTH3920("\uD8E3eb_notice", jSONObject0.optString("\uD8E3eb_notice"));
            this.MTH3920("\uD8E3arams_S6", jSONObject0.optString("\uD8E3arams_S6"));
            this.MTH3920("\uD8E3alid", Boolean.valueOf(jSONObject0.optBoolean("\uD8E3alid")));
            this.MTH3920("\uD8E3ermaban", Boolean.valueOf(jSONObject0.optBoolean("\uD8E3ermaban")));
            if(jSONObject0.has("\uD8E3pdate_days_left")) {
                this.MTH3920("\uD8E3pdate_days_left", jSONObject0.optString("\uD8E3pdate_days_left"));
            }
            this.MTH3920("\uD8E3rls_wx7", jSONObject0.optString("\uD8E3rls_wx7"));
            this.MTH3920("\uD8E3rls_backup_wx7", jSONObject0.optString("\uD8E3rls_backup_wx7"));
            this.MTH3920("\uD8E3rls_activation_alt_wx7", jSONObject0.optString("\uD8E3rls_activation_alt_wx7"));
            this.MTH3920("\uD8E3rls_check_alt_wx7", jSONObject0.optString("\uD8E3rls_check_alt_wx7"));
            this.MTH3920("\uD8E3rls_check_alt_free_wx7", jSONObject0.optString("\uD8E3rls_check_alt_free_wx7"));
            this.MTH3920("\uD8E3ystem_app_check", Boolean.valueOf(jSONObject0.optBoolean("\uD8E3ystem_app_check")));
            this.MTH3920("\uD8E3pp_check", Boolean.valueOf(jSONObject0.optBoolean("\uD8E3pp_check")));
            this.MTH3920("\uD8E3onate_priority_warning", Boolean.valueOf(jSONObject0.optBoolean("\uD8E3onate_priority_warning")));
            this.MTH3920("\uD8E3ot_supported", jSONObject0.optString("\uD8E3ot_supported"));
            this.MTH3920("\uD8E3sedKeys", jSONObject0.optString("\uD8E3sedKeys"));
            this.MTH3920("\uD8E3xExclApp", jSONObject0.optString("\uD8E3xcl_app"));
            this.MTH3920("\uD8E3andom_fail", Boolean.valueOf(jSONObject0.optBoolean("\uD8E3andom_fail", false)));
            if(jSONObject0.optBoolean("\uD8E3andom_fail", false)) {
                this.MTH3980();
            }
            this.MTH3920("\uD8E3spatch_int_pay", Boolean.valueOf(jSONObject0.optBoolean("\uD8E3spatch_int_pay", false)));
            if(jSONObject0.optBoolean("\uD8E3spatch_int_pay", false)) {
                this.MTH3960();
            }
            this.MTH3871(jSONObject0.optString("\uD8E3_valid"));
            this.FLD1157 = jSONObject0.optString("\uD8E3ic");
            this.MTH3920("\uD8E3IC", this.FLD1157);
            CLS200.MTH3224().MTH3228(this.FLD1157, CLS95.MTH2014());
            if(jSONObject0.has("\uD8E3v")) {
                this.MTH3920("\uD8E3atestVersions", new JSONObject(jSONObject0.optString("\uD8E3v")));
            }
            this.FLD1101 = jSONObject0.optString("\uD8E3p");
            this.FLD1110 = jSONObject0.optString("\uD8E3p_async");
            this.MTH3920("\uD8E3p", this.FLD1101);
            this.MTH3920("\uD8E3p_async", this.FLD1110);
            if(jSONObject0.optBoolean("\uD8E3isable_xm", false)) {
                this.MTH3838();
            }
            if(this.MTH3951()) {
                if(this.MTH3933(jSONObject0.optString("\uD8E3sedKeys"))) {
                    if(!CLS200.MTH3224().MTH3230("\uD8E3ax_df") && !CLS200.MTH3224().MTH3230("\uD8E3rouplic_unlocked")) {
                        CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                        this.FLD1136 = true;
                        this.FLD1099 = true;
                        this.MTH3948(501);
                    }
                }
                else if(!CLS200.MTH3224().MTH3230("\uD8E3rouplic_unlocked")) {
                    CLS213.MTH3304().MTH3301("\uD8E3onation", "\uD8E3ctivateKey", new Object[]{this.MTH4018(), "\uD8E32"});
                }
            }
            this.MTH4019();
            this.MTH3937();
            this.MTH3896();
            this.MTH4029();
            if(!CLS224.MTH3441() && z2 && !jSONObject0.has("\uD8E3el_param") && !CLS200.MTH3224().MTH3230("\uD8E3riority_update") && CLS224.MTH3451()) {
                jSONObject0.put("\uD8E3el_param", true);
            }
            this.FLD1165 = s1;
            if(jSONObject0.has("\uD8E3oast")) {
                CLS224.MTH3444(CLS95.MTH2017(), jSONObject0.getString("\uD8E3oast"), 10000L);
            }
            if(jSONObject0.has("\uD8E3orce_restart")) {
                this.FLD1145 = jSONObject0.getBoolean("\uD8E3orce_restart");
            }
            if(jSONObject0.has("\uD8E3eset")) {
                CLS95.MTH2023();
                CLS144.MTH2583().MTH2588(((CLS142)new CLS743()), 10000L);
                return;
            }
            if(jSONObject0.has("\uD8E3ject")) {
                CLS95.MTH2023();
                return;
            }
            if(jSONObject0.has("\uD8E3el_param")) {
                CLS262.MTH4065(this.MTH3978());
            }
            if(jSONObject0.has("\uD8E3el_fp")) {
                CLS144.MTH2583().MTH2588(((CLS142)() -> CLS104.MTH2238().MTH2220()), 60000L);
            }
            HashSet hashSet0 = new HashSet();
            if(jSONObject0.has("\uD8E3isable_features")) {
                String s2 = jSONObject0.getString("\uD8E3isable_features");
                if(!TextUtils.isEmpty(s2)) {
                    String[] arr_s = CLS170.MTH3005(s2);
                    for(int v = 0; v < arr_s.length; ++v) {
                        String s3 = arr_s[v].trim();
                        this.FLD1162.MTH3504(s3);
                        hashSet0.add(s3);
                    }
                }
            }
            if(jSONObject0.has("\uD8E3isable_features2")) {
                String s4 = jSONObject0.getString("\uD8E3isable_features2");
                if(!TextUtils.isEmpty(s4)) {
                    String[] arr_s1 = CLS170.MTH3005(s4);
                    for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                        String s5 = arr_s1[v1].trim();
                        this.FLD1162.MTH3504(s5);
                        hashSet0.add(s5);
                    }
                }
            }
            this.MTH3920("\uD8E3isable_features", TextUtils.join("\uD8E3", hashSet0));
            this.MTH3920("\uD8E3isable_settings", Boolean.valueOf(jSONObject0.optBoolean("\uD8E3isable_settings")));
            if(!jSONObject0.optBoolean("\uD8E3alid")) {
                CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                this.FLD1136 = true;
                this.FLD1099 = true;
                if(!jSONObject0.has("\uD8E3isable_code")) {
                    this.MTH3948(502);
                }
                this.FLD1106 = true;
                return;
            }
            if(!z1) {
                this.FLD1119 = true;
            }
            if(!this.MTH3999()) {
                CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                this.FLD1136 = true;
                this.FLD1099 = true;
                this.MTH3948(822);
                this.FLD1106 = true;
                CLS104.MTH2238().MTH2220();
            }
            HashSet hashSet1 = new HashSet();
            if(jSONObject0.has("\uD8E3p")) {
                hashSet1.addAll(Arrays.asList(CLS170.MTH3005(jSONObject0.optString("\uD8E3p"))));
            }
            if(jSONObject0.has("\uD8E3p_async")) {
                hashSet1.addAll(Arrays.asList(CLS170.MTH3005(jSONObject0.optString("\uD8E3p_async"))));
            }
            if(jSONObject0.has("\uD8E3pdate")) {
                JSONObject jSONObject1 = jSONObject0.getJSONObject("\uD8E3pdate");
                this.FLD1115 = true;
                this.FLD1117 = 0;
                this.FLD1132 = jSONObject1.length();
                if(jSONObject1.has("\uD8E3p")) {
                    this.FLD1132 += jSONObject1.getString("\uD8E3p").split("\uD8E3").length - 1;
                }
                if(jSONObject1.has("\uD8E3l")) {
                    this.FLD1132 += jSONObject1.getString("\uD8E3l").split("\uD8E3").length - 1;
                }
                this.MTH3863();
                if(jSONObject1.has("\uD8E3ssets")) {
                    this.MTH3967();
                }
                if(jSONObject1.has("\uD8E3")) {
                    this.MTH3922();
                }
                if(jSONObject1.has("\uD8E3")) {
                    this.MTH3989();
                }
                if(jSONObject1.has("\uD8E3")) {
                    this.MTH3879();
                }
                if(!this.FLD1128 && jSONObject1.has("\uD8E3")) {
                    this.MTH3877(jSONObject1.has("\uD8E3_silent"));
                }
                if(!this.FLD1118 && jSONObject1.has("\uD8E3")) {
                    this.MTH3981(false, jSONObject1.has("\uD8E3_silent"));
                }
                if(jSONObject1.has("\uD8E3p")) {
                    String[] arr_s2 = jSONObject1.getString("\uD8E3p").split("\uD8E3");
                    int v2 = 0;
                    while(v2 < arr_s2.length) {
                        String s6 = arr_s2[v2];
                        if(CLS104.MTH2238().MTH2240(s6)) {
                            int v3 = CLS104.MTH2238().MTH2255(s6);
                            int v4 = (int)this.MTH3850("\uD8E3p_" + s6);
                            if(v3 < v4 || v4 == -1) {
                                hashSet1.remove(s6);
                                goto label_177;
                            }
                            else {
                                ++this.FLD1117;
                                goto label_178;
                            }
                            goto label_176;
                        }
                        else {
                        label_176:
                            hashSet1.remove(s6);
                        }
                    label_177:
                        this.MTH3942(s6);
                    label_178:
                        ++v2;
                    }
                }
                if(!this.FLD1149 && jSONObject1.has("\uD8E3")) {
                    this.FLD1147 = 0;
                    if(jSONObject0.has("\uD8E3arams_V")) {
                        this.FLD1123 = jSONObject0.getString("\uD8E3arams_V");
                    }
                    this.MTH3946(jSONObject1.getString("\uD8E3"));
                }
                if(!this.FLD1097 && jSONObject1.has("\uD8E3")) {
                    this.MTH3952(jSONObject1.getString("\uD8E3"));
                }
                if(jSONObject1.has("\uD8E3md")) {
                    this.MTH3842();
                }
            }
            else if(z) {
                CLS224.MTH3446("");
            }
            for(Object object0: hashSet1) {
                String s7 = (String)object0;
                if(!CLS104.MTH2238().MTH2217(s7) && CLS104.MTH2238().MTH2240(s7)) {
                    CLS104.MTH2238().MTH2251(s7);
                }
            }
            CLS213.MTH3304().MTH3311("\uD8E3n_update_check", new Object[]{jSONObject0});
            this.MTH3843();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public void MTH3868(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String s1 = CLS95.MTH2014();
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            File file0 = new File("", CLS181.MTH3088(s));
            if(!CLS262.MTH4050(file0)) {
                return;
            }
            jSONObject0.put("\uD8E3p", s);
            jSONObject0.put("\uD8E3rc", CLS262.MTH4054(file0.getAbsolutePath()));
            jSONObject0.put("\uD8E3xid", s1);
            jSONObject0.put("\uD8E3eviceId", CLS150.MTH2682().MTH2688(CLS95.MTH2017()));
            jSONObject0.put("\uD8E3ime", Long.toHexString(System.currentTimeMillis()));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        CLS189 ˆʾ0 = new CLS189(this.MTH3897());
        ˆʾ0.MTH3123("\uD8E3OST");
        ˆʾ0.MTH3133("\uD8E3md", "\uD8E3fp");
        ˆʾ0.MTH3133("\uD8E3rgs", this.MTH3895(jSONObject0).toString());
        ˆʾ0.MTH3139(false);
        ˆʾ0.MTH3144(((CLS187)new CLS762(this, s)));
    }

    public boolean MTH3870() {
        return this.FLD1159;
    }

    // 此方法包含解密的字符串
    public final void MTH3871(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String s1 = CLS181.MTH3088((CLS95.MTH2006().MTH3014() + "\uD8E3n4hZkF" + CLS95.MTH2014()));
        try {
            String s2 = CLS198.MTH3215(s1, s);
            if(TextUtils.isEmpty(s2)) {
                return;
            }
            CLS95.MTH2031().MTH2749("\uD8E3_valid", s2);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public boolean MTH3872() {
        return this.FLD1138 != 0;
    }

    // 去混淆评级： 低(48)
    // 此方法包含解密的字符串
    public final String MTH3873() {
        CLS156 ٴʻ0 = CLS95.MTH2031();
        if(ٴʻ0 != null) {
            if(ٴʻ0.MTH2725("\uD8E3se_beta_channel", false)) {
                return ٴʻ0.MTH2733("\uD8E3eta_channel", "");
            }
            return ٴʻ0.MTH2725("\uD8E3se_debug_channel", false) ? ٴʻ0.MTH2733("\uD8E3ebug_channel", "") : ٴʻ0.MTH2733("\uD8E3elease_channel", "");
        }
        return "";
    }

    // 此方法包含解密的字符串
    public final boolean MTH3874() {
        String s = this.MTH3944();
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            if(!TextUtils.isEmpty(s)) {
                Object object0 = CLS95.MTH1982(0x84, new Object[]{"\uD8E3erifier6", s, CLS95.MTH2014()});
                if(object0 != null) {
                    return ((Boolean)object0).booleanValue();
                }
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    private void MTH3876(CLS186 ˆʾ$ʻᵢ0) {
        --this.FLD1138;
        this.FLD1146 = false;
        byte[] arr_b = CLS266.MTH4134(ˆʾ$ʻᵢ0.FLD885);
        if(arr_b == null) {
            CLS204.MTH3252("\uD8E3ownload strings failed");
            this.MTH3916();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("\uD8E3ata", arr_b);
        this.MTH3911("\uD8E3", contentValues0);
    }

    // 此方法包含解密的字符串
    public final void MTH3877(boolean z) {
        if(!this.FLD1142 && !this.FLD1100.containsKey("\uD8E3ib")) {
            this.FLD1114 = true;
            ++this.FLD1138;
            this.FLD1142 = true;
            CLS189 ˆʾ0 = new CLS189(CLS266.MTH4132(this.MTH3921(), this.MTH3984(), CLS93.MTH1973()));
            ˆʾ0.MTH3124(this.MTH4013("\uD8E3"));
            ˆʾ0.MTH3137(CLS266.MTH4132(this.MTH3913(), this.MTH3984(), CLS93.MTH1973()));
            ˆʾ0.MTH3129(false);
            ˆʾ0.MTH3144(((CLS187)new CLS775(this, z)));
        }
    }

    // 此方法包含解密的字符串
    public final void MTH3879() {
        if(!this.FLD1107 && !this.FLD1100.containsKey("\uD8E3ooks")) {
            ++this.FLD1138;
            this.FLD1107 = true;
            CLS189 ˆʾ0 = new CLS189(CLS266.MTH4132(this.MTH3921(), "", "\uD8E3_" + this.FLD1162.MTH3501()));
            ˆʾ0.MTH3137(CLS266.MTH4132(this.MTH3913(), "", "\uD8E3_" + this.FLD1162.MTH3501()));
            ˆʾ0.MTH3129(false);
            ˆʾ0.MTH3144(((CLS187)new CLS718(this)));
        }
    }

    public static CLS261 MTH3881() {
        return CLS261.FLD1113;
    }

    private Object MTH3882(Object[] arr_object) {
        return Boolean.valueOf(this.MTH3996());
    }

    public void MTH3883() {
        this.FLD1150 = true;
        this.MTH3843();
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public boolean MTH3885() {
        return this.MTH3933(CLS95.MTH2031().MTH2733("\uD8E3sedKeys", ""));
    }

    // 此方法包含解密的字符串
    private void MTH3887(CLS186 ˆʾ$ʻᵢ0) {
        --this.FLD1138;
        this.FLD1124 = false;
        byte[] arr_b = CLS266.MTH4134(ˆʾ$ʻᵢ0.FLD885);
        if(arr_b == null) {
            CLS204.MTH3252("\uD8E3ownload metadata failed");
            this.MTH3916();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("\uD8E3ata", arr_b);
        this.MTH3911("\uD8E3eta", contentValues0);
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH3888() [...]

    // 此方法包含解密的字符串
    public void MTH3889(Context context0) {
        boolean z;
        try {
            if(!CLS224.MTH3441()) {
                if(CLS102.MTH2181() || CLS102.MTH2160() || CLS102.MTH2159() || CLS102.MTH2165() || CLS102.MTH2186()) {
                    z = false;
                }
                else {
                    String s = this.FLD1162.MTH3509();
                    z = TextUtils.isEmpty(s) ? true : s.equals(this.FLD1162.MTH3503());
                }
                this.FLD1163 = z && (CLS257.MTH3717(context0) || CLS257.MTH3709(this.FLD1162.MTH3521()));
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        this.MTH3912();
        this.MTH3986();
        if(!CLS170.MTH3011("", new String[]{CLS95.MTH2006().MTH3014()})) {
            CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
            this.FLD1136 = true;
            this.FLD1099 = true;
            this.MTH3948(801);
            return;
        }
        if(!CLS224.MTH3441() && !CLS95.MTH2006().MTH3019(new File("", CLS181.MTH3088(this.FLD1162.MTH3502())))) {
            CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
            this.FLD1136 = true;
            this.FLD1099 = true;
            this.MTH3948(802);
            CLS95.MTH2023();
            return;
        }
        if(this.MTH3915()) {
            this.MTH3858(false);
        }
        else if(this.MTH3837()) {
            CLS144.MTH2583().MTH2608(((CLS142)() -> this.MTH3858(false)), 15000L);
        }
        else if(this.MTH3917()) {
            String s1 = CLS95.MTH2031().MTH2733("\uD8E3ast_update_check", "");
            long v = TextUtils.isEmpty(s1) ? 5000L : System.currentTimeMillis() - Long.parseLong(s1, 16);
            CLS144.MTH2583().MTH2587().postDelayed(this.FLD1112, v + 500L);
        }
        CLS156 ٴʻ0 = CLS95.MTH2031();
        if(ٴʻ0 != null) {
            if(!ٴʻ0.MTH2725("\uD8E3alid", true)) {
                CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                this.FLD1136 = true;
                this.FLD1099 = true;
                this.MTH3948(805);
                this.FLD1106 = true;
                CLS104.MTH2238().MTH2220();
            }
            if(TextUtils.isEmpty(ٴʻ0.MTH2733("\uD8E3IC", "")) && CLS200.MTH3224().MTH3230("\uD8E3xtra_df")) {
                CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                this.FLD1136 = true;
                this.FLD1099 = true;
                this.MTH3948(806);
                CLS95.MTH2031().MTH2747();
                this.MTH3925("\uD8E3f");
            }
        }
        try {
            if(CLS95.MTH1988(CLS95.MTH2014())) {
                this.FLD1160 = true;
                this.FLD1099 = true;
                this.FLD1136 = true;
                this.MTH3948(703);
                this.FLD1106 = true;
            }
        }
        catch(Throwable throwable1) {
            CLS204.MTH3257(throwable1);
        }
        try {
            this.MTH3852();
        }
        catch(Throwable throwable2) {
            CLS204.MTH3257(throwable2);
        }
        if(!CLS224.MTH3441()) {
            CLS200 ˈʽ0 = CLS200.MTH3224();
            if(ˈʽ0.MTH3230("\uD8E3f_unlocked") && !ˈʽ0.MTH3232() || ˈʽ0.MTH3230("\uD8E3f_unlocked") && !ˈʽ0.MTH3229()) {
                CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                this.FLD1136 = true;
                this.FLD1099 = true;
                this.MTH3948(809);
                this.FLD1135 = true;
                this.MTH3920("\uD8E3IC", "");
                CLS104.MTH2238().MTH2225();
                CLS95.MTH2003();
                CLS95.MTH1982(108, new Object[0]);
                CLS95.MTH2021();
                CLS95.MTH2013();
                CLS95.MTH2023();
            }
            if(CLS102.MTH2153()) {
                if(ˈʽ0.MTH3240() || ˈʽ0.MTH3225()) {
                    if(CLS95.MTH2031().MTH2744("\uD8E3ntegrated_grace_time")) {
                        CLS95.MTH2031().MTH2739("\uD8E3ntegrated_grace_time");
                    }
                }
                else if(!CLS95.MTH2031().MTH2744("\uD8E3ntegrated_grace_time")) {
                    CLS95.MTH2031().MTH2749("\uD8E3ntegrated_grace_time", System.currentTimeMillis());
                }
            }
        }
        if(CLS95.MTH2031().MTH2725("\uD8E3andom_fail", false)) {
            this.MTH3980();
        }
        if(this.MTH3894()) {
            CLS204.MTH3252("\uD8E3lacklisted: \uD8E3NO_ID+");
            CLS104.MTH2238().MTH2225();
        }
    }

    public final JSONObject MTH3890(String s) {
        try {
            return new JSONObject(CLS198.MTH3212(CLS95.MTH2006().MTH3014(), s));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3252(s);
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public ContentValues MTH3891() {
        try {
            JSONObject jSONObject0 = CLS95.MTH2031().MTH2750("\uD8E3atestVersions", new JSONObject());
            if(!jSONObject0.has("\uD8E3pk")) {
                return null;
            }
            String[] arr_s = CLS170.MTH3005(jSONObject0.getString("\uD8E3pk"));
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("\uD8E3ersionCode", arr_s[0]);
            contentValues0.put("\uD8E3ersionName", arr_s[1]);
            contentValues0.put("\uD8E3rc", arr_s[2]);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    private void MTH3892(String s, CLS186 ˆʾ$ʻᵢ0) {
        if(ˆʾ$ʻᵢ0.MTH3106()) {
            return;
        }
        try {
            String s1 = new String(ˆʾ$ʻᵢ0.FLD885);
            if(TextUtils.isEmpty(s1)) {
                return;
            }
            JSONObject jSONObject0 = this.MTH3890(s1);
            if(jSONObject0 != null && jSONObject0.optBoolean("\uD8E3tat")) {
                this.MTH3942(s);
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public boolean MTH3894() {
        int v = this.MTH4017();
        return this.MTH3990() || this.FLD1160 || this.MTH4020() && (v == 502 || v == 700 || v == 701 || v == 702 || v == 703);
    }

    // 此方法包含解密的字符串
    public final JSONObject MTH3895(JSONObject jSONObject0) {
        JSONObject jSONObject1 = new JSONObject();
        try {
            String s = jSONObject0.toString();
            String s1 = CLS262.MTH4049(s.getBytes());
            if(TextUtils.isEmpty(s1)) {
                return jSONObject1;
            }
            String s2 = CLS198.MTH3215(CLS170.MTH3004(("\uD8E3n4hZkF" + CLS95.MTH2006().MTH3017() + s1)), s);
            jSONObject1.put("\uD8E3", s2);
            jSONObject1.put("\uD8E3", CLS224.MTH3448(new StringBuilder(s1).reverse().toString()));
            jSONObject1.put("\uD8E32", CLS262.MTH4049(s2.getBytes()));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return jSONObject1;
    }

    // 此方法包含解密的字符串
    public final void MTH3896() {
        if(!this.FLD1136 && CLS95.MTH2031().MTH2725("\uD8E3pp_check", false)) {
            CLS144.MTH2583().MTH2589(((CLS142)() -> // 此方法包含解密的字符串
            {
                HashSet hashSet0 = new HashSet();
                if(hashSet0.isEmpty()) {
                    return;
                }
                for(Object object0: hashSet0) {
                    String s = (String)object0;
                    if(!TextUtils.isEmpty(s.trim())) {
                        String[] arr_s = s.split("\uD8E3");
                        if(CLS257.MTH3741(CLS95.MTH2017(), arr_s[0].trim())) {
                            String s1 = CLS181.MTH3091(CLS95.MTH2017(), arr_s[0].trim());
                            if(!TextUtils.isEmpty(s1) && s1.equals(arr_s[1].trim())) {
                                CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                                this.FLD1136 = true;
                                this.FLD1099 = true;
                                this.FLD1105 = 2;
                                return;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                }
            }));
        }
    }

    // 此方法包含解密的字符串
    public final HashSet MTH3897() {
        HashSet hashSet0 = new HashSet();
        for(int v = 0; v < 1; ++v) {
            String s = new String[]{""}[v];
            if(!TextUtils.isEmpty(s)) {
                hashSet0.add(s.trim());
            }
        }
        return hashSet0;
    }

    public void MTH3898(boolean z) {
        this.FLD1155 = z;
    }

    // 此方法包含解密的字符串
    private void MTH3899(CLS186 ˆʾ$ʻᵢ0) {
        --this.FLD1138;
        this.FLD1133 = false;
        byte[] arr_b = CLS266.MTH4134(ˆʾ$ʻᵢ0.FLD885);
        if(arr_b == null) {
            CLS204.MTH3252("\uD8E3ownload params failed");
            this.FLD1147 = 1;
            this.MTH3916();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("\uD8E3ath", this.MTH3978().getAbsolutePath());
        contentValues0.put("\uD8E3ata", arr_b);
        this.MTH3911("\uD8E3", contentValues0);
    }

    private Object MTH3901(Object[] arr_object) {
        return this.MTH3944();
    }

    // 此方法包含解密的字符串
    public boolean MTH3902() {
        CLS156 ٴʻ0 = CLS95.MTH2031();
        return ٴʻ0 == null || ٴʻ0.MTH2725("\uD8E3alid", true);
    }

    private void MTH3904(Object[] arr_object) {
        this.MTH3942(((String)arr_object[0]));
    }

    // 去混淆评级： 低(35)
    // 此方法包含解密的字符串
    public final boolean MTH3905(String s) {
        String s1 = CLS95.MTH2031().MTH2733("\uD8E3fapps", "");
        return TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) || !s1.contains(s);
    }

    // 此方法包含解密的字符串
    private void MTH3909(boolean z, CLS186 ˆʾ$ʻᵢ0) {
        --this.FLD1138;
        this.FLD1142 = false;
        byte[] arr_b = CLS266.MTH4134(ˆʾ$ʻᵢ0.FLD885);
        if(arr_b == null) {
            CLS204.MTH3252("\uD8E3ownload lib failed");
            this.MTH3916();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("\uD8E3ilent", Boolean.valueOf(z));
        contentValues0.put("\uD8E3ata", arr_b);
        this.MTH3911("\uD8E3ib", contentValues0);
    }

    // 此方法包含解密的字符串
    public final void MTH3911(String s, ContentValues contentValues0) {
        if(!s.startsWith("\uD8E3m_") && this.MTH3860()) {
            ++this.FLD1117;
            this.MTH3863();
        }
        this.FLD1100.put(s, contentValues0);
        this.MTH3916();
    }

    // 去混淆评级： 中等(90)
    // 此方法包含解密的字符串
    public final void MTH3912() {
    }

    // 此方法包含解密的字符串
    public final HashSet MTH3913() {
        HashSet hashSet0 = new HashSet();
        String s = CLS95.MTH2031().MTH2733("\uD8E3rls_backup_wx6", "");
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = s.split("\uD8E3");
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v].trim();
                if(!TextUtils.isEmpty(s1) && s1.startsWith("\uD8E3ttp")) {
                    hashSet0.add(s1);
                }
            }
        }
        return hashSet0;
    }

    // 去混淆评级： 中等(90)
    // 此方法包含解密的字符串
    public boolean MTH3915() {
        return this.MTH3929() && this.MTH3969() && this.MTH3953(900000L) && (TextUtils.isEmpty(CLS95.MTH2031().MTH2733("\uD8E3arams_S6", "")) || !CLS262.MTH4050(this.MTH3978()));
    }

    // 此方法包含解密的字符串
    public final void MTH3916() {
        String s8;
        String s7;
        String s6;
        String s1;
        try {
            if(this.FLD1100.containsKey("\uD8E3")) {
                ContentValues contentValues0 = (ContentValues)this.FLD1100.get("\uD8E3");
                this.FLD1100.remove("\uD8E3");
                this.FLD1147 = 0;
                if(CLS262.MTH4071(new File(contentValues0.getAsString("\uD8E3ath")), contentValues0.getAsByteArray("\uD8E3ata"))) {
                    this.FLD1149 = true;
                    this.FLD1125 = false;
                    if(!TextUtils.isEmpty(this.FLD1123) && Long.parseLong(CLS95.MTH2004("\uD8E3ERSION"), 16) == Long.parseLong(this.FLD1123, 16)) {
                        this.FLD1149 = false;
                    }
                    CLS95.MTH2031().MTH2739("\uD8E3afe_mode");
                    CLS95.MTH2031().MTH2739("\uD8E3afe_mode_cnt");
                    CLS204.MTH3252("\uD8E3exposed params file update success!");
                }
                else {
                    CLS204.MTH3252("\uD8E3exposed params file update fail!");
                    this.FLD1152 = true;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        try {
            if(this.FLD1100.containsKey("\uD8E3ib")) {
                ContentValues contentValues1 = (ContentValues)this.FLD1100.get("\uD8E3ib");
                this.FLD1100.remove("\uD8E3ib");
                CLS224.MTH3472(CLS93.MTH1973());
                String s = CLS181.MTH3088(CLS93.MTH1966());
                CLS262.MTH4065(new File("", s));
                if(CLS262.MTH4071(new File("", s), contentValues1.getAsByteArray("\uD8E3ata"))) {
                    if(!(contentValues1.containsKey("\uD8E3ilent") ? contentValues1.getAsBoolean("\uD8E3ilent").booleanValue() : false)) {
                        this.FLD1126 = true;
                    }
                    this.FLD1128 = true;
                    CLS204.MTH3252("\uD8E3exposed lib file update success!");
                }
                else {
                    CLS204.MTH3252("\uD8E3exposed lib file update fail!");
                    this.FLD1152 = true;
                }
            }
        }
        catch(Throwable throwable1) {
            CLS204.MTH3257(throwable1);
        }
        try {
            if(this.FLD1100.containsKey("\uD8E3eta")) {
                ContentValues contentValues2 = (ContentValues)this.FLD1100.get("\uD8E3eta");
                this.FLD1100.remove("\uD8E3eta");
                if(CLS262.MTH4071(new File("", ""), contentValues2.getAsByteArray("\uD8E3ata"))) {
                    CLS95.MTH2013();
                    this.MTH3986();
                    CLS204.MTH3252("\uD8E3exposed metadata file update success!");
                }
                else {
                    CLS204.MTH3252("\uD8E3exposed metadata file update fail!");
                    this.FLD1152 = true;
                }
            }
        }
        catch(Throwable throwable2) {
            CLS204.MTH3257(throwable2);
        }
        try {
            if(this.FLD1100.containsKey("\uD8E3")) {
                ContentValues contentValues3 = (ContentValues)this.FLD1100.get("\uD8E3");
                this.FLD1100.remove("\uD8E3");
                if(CLS262.MTH4071(new File("", ""), contentValues3.getAsByteArray("\uD8E3ata"))) {
                    CLS144.MTH2583().MTH2604(((CLS142)new CLS765()));
                    CLS204.MTH3252("\uD8E3exposed strings file update success!");
                }
                else {
                    CLS204.MTH3252("\uD8E3exposed strings file update fail!");
                    this.FLD1152 = true;
                }
            }
        }
        catch(Throwable throwable3) {
            CLS204.MTH3257(throwable3);
        }
        try {
            if(this.FLD1100.containsKey("\uD8E3ore")) {
                ContentValues contentValues4 = (ContentValues)this.FLD1100.get("\uD8E3ore");
                this.FLD1100.remove("\uD8E3ore");
                CLS224.MTH3472(this.FLD1162.MTH3502());
                if(((Boolean)CLS95.MTH1982(80, new Object[]{CLS181.MTH3088(this.FLD1162.MTH3502()), contentValues4.getAsByteArray("\uD8E3ata")})).booleanValue()) {
                    this.FLD1118 = true;
                    if(!(contentValues4.containsKey("\uD8E3ilent") ? contentValues4.getAsBoolean("\uD8E3ilent").booleanValue() : false)) {
                        this.FLD1120 = true;
                    }
                    if(contentValues4.containsKey("\uD8E3orce") && contentValues4.getAsBoolean("\uD8E3orce").booleanValue()) {
                        this.FLD1145 = true;
                    }
                    s1 = "\uD8E3exposed core file update success!";
                }
                else {
                    this.FLD1152 = true;
                    s1 = "\uD8E3exposed core file update fail!";
                }
                CLS204.MTH3252(s1);
            }
        }
        catch(Throwable throwable4) {
            CLS204.MTH3257(throwable4);
        }
        try {
            if(this.FLD1100.containsKey("\uD8E3pk")) {
                ContentValues contentValues5 = (ContentValues)this.FLD1100.get("\uD8E3pk");
                this.FLD1100.remove("\uD8E3pk");
                byte[] arr_b = (byte[])CLS95.MTH1982(107, new Object[]{contentValues5.getAsByteArray("\uD8E3ata"), 1});
                if(arr_b != null) {
                    String s2 = CLS262.MTH4049(arr_b);
                    String s3 = contentValues5.getAsString("\uD8E3rc");
                    boolean z = TextUtils.isEmpty(s3) || !TextUtils.isEmpty(s2) && s2.equals(s3);
                    this.FLD1097 = z;
                    if(z) {
                        File file0 = new File(contentValues5.getAsString("\uD8E3pk"));
                        CLS262.MTH4071(file0, arr_b);
                        CLS262.MTH4046(file0);
                        this.MTH3924(CLS95.MTH2017(), file0);
                    }
                }
                CLS204.MTH3252("\uD8E3exposed apk file update success!");
            }
        }
        catch(Throwable throwable5) {
            CLS204.MTH3257(throwable5);
        }
        try {
            for(Object object0: this.FLD1100.keySet()) {
                String s4 = (String)object0;
                if(s4.startsWith("\uD8E3p_")) {
                    ContentValues contentValues6 = (ContentValues)this.FLD1100.get(s4);
                    this.FLD1100.remove(s4);
                    String s5 = contentValues6.getAsString("\uD8E3ame");
                    if(((Boolean)CLS95.MTH1982(80, new Object[]{CLS181.MTH3088(("\uD8E3P_" + s5)), contentValues6.getAsByteArray("\uD8E3ata")})).booleanValue()) {
                        CLS104 ˋᵎ0 = CLS104.MTH2238();
                        if(ˋᵎ0.MTH2217(s5)) {
                            this.FLD1150 = true;
                        }
                        else {
                            ˋᵎ0.MTH2251(s5);
                        }
                        s6 = s5 + "\uD8E3update success!";
                    }
                    else {
                        this.FLD1152 = true;
                        s6 = s5 + "\uD8E3update failed!";
                    }
                    CLS204.MTH3252(s6);
                }
            }
        }
        catch(Throwable throwable6) {
            CLS204.MTH3257(throwable6);
        }
        try {
            if(this.FLD1100.containsKey("\uD8E3ooks")) {
                ContentValues contentValues7 = (ContentValues)this.FLD1100.get("\uD8E3ooks");
                this.FLD1100.remove("\uD8E3ooks");
                if(CLS262.MTH4071(new File("", CLS181.MTH3088(("\uD8E3_" + this.FLD1162.MTH3501()))), contentValues7.getAsByteArray("\uD8E3ata"))) {
                    this.FLD1129 = true;
                    s7 = "\uD8E3ooks update success!";
                }
                else {
                    this.FLD1152 = true;
                    s7 = "\uD8E3ooks update failed!";
                }
                CLS204.MTH3252(s7);
            }
        }
        catch(Throwable throwable7) {
            CLS204.MTH3257(throwable7);
        }
        try {
            if(this.FLD1100.containsKey("\uD8E3meta")) {
                ContentValues contentValues8 = (ContentValues)this.FLD1100.get("\uD8E3meta");
                this.FLD1100.remove("\uD8E3meta");
                CLS204.MTH3252((CLS262.MTH4071(new File("", ""), contentValues8.getAsByteArray("\uD8E3ata")) ? "\uD8E3meta update success!" : "\uD8E3meta update failed!"));
            }
        }
        catch(Throwable throwable8) {
            CLS204.MTH3257(throwable8);
        }
        try {
            if(this.FLD1100.containsKey("\uD8E3md")) {
                ContentValues contentValues9 = (ContentValues)this.FLD1100.get("\uD8E3md");
                this.FLD1100.remove("\uD8E3md");
                if(CLS262.MTH4071(new File("", ""), contentValues9.getAsByteArray("\uD8E3ata"))) {
                    this.FLD1139 = true;
                    CLS240.MTH3588();
                    s8 = "\uD8E3mdata update success!";
                }
                else {
                    s8 = "\uD8E3mdata update failed!";
                }
                CLS204.MTH3252(s8);
            }
        }
        catch(Throwable throwable9) {
            CLS204.MTH3257(throwable9);
        }
        try {
            for(Object object1: this.FLD1100.keySet()) {
                String s9 = (String)object1;
                if(s9.startsWith("\uD8E3m_")) {
                    ContentValues contentValues10 = (ContentValues)this.FLD1100.get(s9);
                    this.FLD1100.remove(s9);
                    String s10 = contentValues10.getAsString("\uD8E3ame");
                    if(!this.FLD1158.contains(s10)) {
                        CLS95.MTH1982(80, new Object[]{CLS181.MTH3088(s10), contentValues10.getAsByteArray("\uD8E3ata")});
                        this.FLD1158.add(s10);
                        CLS204.MTH3252((s9 + "\uD8E3update"));
                    }
                }
            }
        }
        catch(Throwable throwable10) {
            CLS204.MTH3257(throwable10);
        }
        if(this.FLD1138 == 0 && this.FLD1100.isEmpty()) {
            this.FLD1114 = false;
            this.FLD1115 = false;
            this.FLD1132 = 0;
            CLS148.MTH2659().MTH2665();
            CLS213.MTH3304().MTH3320("\uD8E3ackup_settings_update", new Object[0]);
            if((this.MTH3975() || this.MTH4024() || this.FLD1152) && this.FLD1145 && !this.FLD1152) {
                CLS257.MTH3710();
                return;
            }
            this.MTH3843();
        }
    }

    // 去混淆评级： 中等(110)
    // 此方法包含解密的字符串
    public boolean MTH3917() {
        return this.MTH3953(900000L) || this.MTH3894() || !this.MTH3969() || this.MTH3996() || this.MTH3915() || this.MTH4008() || this.MTH3872() ? false : !CLS104.MTH2238().MTH2217("\uD8E3ase") && !CLS102.MTH2163();
    }

    // 检测为 Lambda 实现
    public static void MTH3918() [...]

    public void MTH3919(int v) {
        this.FLD1144 = v;
    }

    public final void MTH3920(String s, Object object0) {
        CLS156 ٴʻ0 = CLS95.MTH2031();
        if(ٴʻ0 != null) {
            ٴʻ0.MTH2749(s, object0);
        }
    }

    // 此方法包含解密的字符串
    public ArrayList MTH3921() {
        HashSet hashSet0;
        ArrayList arrayList0 = new ArrayList();
        if(!this.FLD1130.isEmpty()) {
            arrayList0.addAll(this.FLD1130);
        }
        if(this.FLD1156.isEmpty() || this.FLD1122.isEmpty()) {
            hashSet0 = this.FLD1153;
        }
        else {
            ArrayList arrayList1 = new ArrayList(this.FLD1156);
            Collections.shuffle(arrayList1);
            arrayList0.addAll(arrayList1);
            hashSet0 = this.FLD1122;
        }
        arrayList0.addAll(hashSet0);
        String s = CLS95.MTH2031().MTH2733("\uD8E3rls_wx6", "");
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = s.split("\uD8E3");
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v].trim();
                if(!TextUtils.isEmpty(s1) && s1.startsWith("\uD8E3ttp")) {
                    arrayList0.add(s1);
                }
            }
        }
        CLS204.MTH3254(("\uD8E3rls: " + arrayList0));
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final void MTH3922() {
        if(!this.FLD1124 && !this.FLD1100.containsKey("\uD8E3eta")) {
            ++this.FLD1138;
            this.FLD1124 = true;
            CLS189 ˆʾ0 = new CLS189(CLS266.MTH4132(this.MTH3921(), "", "\uD8E3"));
            ˆʾ0.MTH3137(CLS266.MTH4132(this.MTH3913(), "", "\uD8E3"));
            ˆʾ0.MTH3129(false);
            ˆʾ0.MTH3144(((CLS187)new CLS785(this)));
        }
    }

    // 此方法包含解密的字符串
    public final HashSet MTH3923() {
        if(TextUtils.isEmpty(this.FLD1101)) {
            this.FLD1101 = CLS95.MTH2031().MTH2733("\uD8E3p", "");
        }
        if(TextUtils.isEmpty(this.FLD1110)) {
            this.FLD1110 = CLS95.MTH2031().MTH2733("\uD8E3p_async", "");
        }
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(Arrays.asList(CLS170.MTH3005(this.FLD1101)));
        hashSet0.addAll(Arrays.asList(CLS170.MTH3005(this.FLD1110)));
        return hashSet0;
    }

    // 去混淆评级： 中等(66)
    // 此方法包含解密的字符串
    public final void MTH3924(Context context0, File file0) {
        CLS257.MTH3715(context0, this.FLD1144);
        if(!this.FLD1097 || !CLS95.MTH2031().MTH2725("\uD8E3utoupdate_enable", false) && !this.FLD1162.MTH3507("\uD8E3bout") || !TextUtils.isEmpty(this.FLD1104) && CLS224.MTH3474(this.FLD1104, CLS95.MTH2031().MTH2733("\uD8E3ersionName", "")) != 1) {
            return;
        }
        this.FLD1104 = CLS95.MTH2031().MTH2733("\uD8E3ersionName", "");
        CLS224.MTH3483(context0, file0, "\uD8E3 ", CLS95.MTH2031().MTH2733("\uD8E3ersionName", "") + "\uD8E3" + "", this.FLD1144);
    }

    // 此方法包含解密的字符串
    public void MTH3925(String s) {
        ArrayList arrayList0 = this.MTH3976();
        if(arrayList0.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("\uD8E3eason", s);
            JSONObject jSONObject1 = this.MTH4007(jSONObject0);
            CLS189 ˆʾ0 = new CLS189(arrayList0);
            ˆʾ0.MTH3137(this.MTH3949());
            ˆʾ0.MTH3123("\uD8E3OST");
            ˆʾ0.MTH3133("\uD8E3md", "\uD8E3");
            ˆʾ0.MTH3133("\uD8E3rgs", jSONObject1.toString());
            ˆʾ0.MTH3129(false);
            ˆʾ0.MTH3139(true);
            ˆʾ0.MTH3144(null);
        }
        catch(Throwable unused_ex) {
        }
    }

    // 此方法包含解密的字符串
    private void MTH3927(CLS186 ˆʾ$ʻᵢ0) {
        --this.FLD1138;
        this.FLD1107 = false;
        byte[] arr_b = CLS266.MTH4134(ˆʾ$ʻᵢ0.FLD885);
        if(arr_b == null) {
            CLS204.MTH3252("\uD8E3ownload hooks failed");
            this.MTH3916();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("\uD8E3ata", arr_b);
        this.MTH3911("\uD8E3ooks", contentValues0);
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH3928() [...]

    // 去混淆评级： 低(40)
    public boolean MTH3929() {
        return !CLS102.MTH2153() || !CLS181.MTH3090() || CLS200.MTH3224().MTH3225() || this.MTH3953(86400000L);
    }

    // 此方法包含解密的字符串
    public final void MTH3930() {
        String s = CLS95.MTH2031().MTH2733("\uD8E3echeck", "");
        if(!TextUtils.isEmpty(s) && !CLS259.MTH3823(Long.parseLong(s, 16), 600000L)) {
            return;
        }
        CLS95.MTH2031().MTH2749("\uD8E3echeck", Long.toHexString(System.currentTimeMillis()));
        int v = this.FLD1111 + 1;
        this.FLD1111 = v;
        if(v >= 3) {
            return;
        }
        this.MTH3858(false);
    }

    // 此方法包含解密的字符串
    public void MTH3932() {
        if(this.MTH3929() && this.MTH3969() && this.MTH3953(900000L)) {
            try {
                if(CLS95.MTH2031() != null) {
                    if(TextUtils.isEmpty(CLS95.MTH2031().MTH2733("\uD8E3_valid", ""))) {
                        this.MTH3858(false);
                        return;
                    }
                    if(!this.MTH3870() && !TextUtils.isEmpty(CLS95.MTH2031().MTH2733("\uD8E3erifier6", "")) && this.MTH3874() && !this.MTH3953(CLS224.MTH3468("\uD8E3pdate_check_freq_time", 43200000L))) {
                        return;
                    }
                }
                this.MTH3858(false);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public boolean MTH3933(String s) {
        if(!this.MTH3951()) {
            return true;
        }
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        ArrayList arrayList0 = this.MTH4018();
        if(arrayList0.isEmpty()) {
            return true;
        }
        HashSet hashSet0 = new HashSet();
        String[] arr_s = s.split("\uD8E3");
        for(int v = 0; v < arr_s.length; ++v) {
            hashSet0.add(arr_s[v].trim());
        }
        for(Object object0: arrayList0) {
            if(!hashSet0.contains(((String)object0))) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    // 此方法包含解密的字符串
    public void MTH3934() {
        ArrayList arrayList0 = this.MTH3976();
        if(arrayList0.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("\uD8E3pps", CLS257.MTH3739(CLS95.MTH2017()));
            JSONObject jSONObject1 = this.MTH4007(jSONObject0);
            CLS189 ˆʾ0 = new CLS189(arrayList0);
            ˆʾ0.MTH3137(this.MTH3949());
            ˆʾ0.MTH3123("\uD8E3OST");
            ˆʾ0.MTH3133("\uD8E3md", "\uD8E3");
            ˆʾ0.MTH3133("\uD8E3rgs", jSONObject1.toString());
            ˆʾ0.MTH3129(false);
            ˆʾ0.MTH3139(true);
            ˆʾ0.MTH3144(null);
        }
        catch(Throwable unused_ex) {
        }
    }

    // 此方法包含解密的字符串
    private void MTH3935(CLS186 ˆʾ$ʻᵢ0) {
        this.FLD1098 = false;
        byte[] arr_b = CLS266.MTH4134(ˆʾ$ʻᵢ0.FLD885);
        if(arr_b == null) {
            CLS204.MTH3252("\uD8E3ownload apk failed");
            return;
        }
        File file0 = new File(CLS95.MTH2017().getCacheDir(), "\uD8E3module.apk");
        CLS262.MTH4046(file0);
        CLS262.MTH4071(file0, ((byte[])CLS95.MTH1982(107, new Object[]{arr_b, 1})));
        this.MTH4015(CLS95.MTH2017(), file0);
        CLS224.MTH3482(CLS95.MTH2017(), "" + file0.getAbsolutePath());
    }

    // 此方法包含解密的字符串
    public final void MTH3937() {
        if(this.MTH4003()) {
            this.FLD1136 = true;
            this.FLD1099 = true;
            this.FLD1106 = true;
            this.MTH3948(807);
        }
        if(!CLS95.MTH2031().MTH2725("\uD8E3pp_check", false)) {
            return;
        }
        CLS144.MTH2583().MTH2589(((CLS142)() -> // 此方法包含解密的字符串
        {
            HashSet hashSet0 = new HashSet();
            if(hashSet0.isEmpty()) {
                return;
            }
            HashSet hashSet1 = CLS257.MTH3729(CLS95.MTH2017());
            Iterator iterator0 = hashSet0.iterator();
            while(true) {
                boolean z = false;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                String s = ((String)object0).trim();
                if(hashSet1.contains(s) || CLS257.MTH3741(CLS95.MTH2017(), s)) {
                    CLS204.MTH3254(("\uD8E3apps: " + s));
                    CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                    this.FLD1136 = true;
                    this.FLD1099 = true;
                    this.MTH3948(501);
                    this.FLD1116.add(s);
                    z = true;
                    break;
                }
            }
            if(z) {
                this.FLD1103 = true;
                return;
            }
            if(this.FLD1103) {
                this.FLD1119 = true;
                this.FLD1135 = true;
            }
        }));
    }

    // 此方法包含解密的字符串
    private void MTH3938(CLS186 ˆʾ$ʻᵢ0) {
        --this.FLD1138;
        this.FLD1102 = false;
        byte[] arr_b = CLS266.MTH4134(ˆʾ$ʻᵢ0.FLD885);
        if(arr_b == null) {
            CLS204.MTH3252("\uD8E3ownload assets digest failed");
            this.MTH3916();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("\uD8E3ata", arr_b);
        this.MTH3911("\uD8E3ssets_digest", contentValues0);
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH3939() [...]

    public HashSet MTH3940() {
        return this.FLD1116;
    }

    // 此方法包含解密的字符串
    public final void MTH3942(String s) {
        if(!this.FLD1100.containsKey("\uD8E3p_" + s) && !this.FLD1143.contains(s)) {
            ++this.FLD1138;
            this.FLD1143.add(s);
            CLS189 ˆʾ0 = new CLS189(CLS266.MTH4132(this.MTH3921(), this.MTH3984(), "\uD8E3p/" + s));
            ˆʾ0.MTH3124(this.MTH4013("\uD8E3p_" + s));
            ˆʾ0.MTH3137(CLS266.MTH4132(this.MTH3913(), this.MTH3984(), "\uD8E3p/" + s));
            ˆʾ0.MTH3129(false);
            ˆʾ0.MTH3144(((CLS187)new CLS728(this, s, "\uD8E3p_" + s)));
        }
    }

    // 此方法包含解密的字符串
    public final String MTH3944() {
        if(TextUtils.isEmpty(this.FLD1141)) {
            String s = CLS95.MTH2031().MTH2733("\uD8E3erifier6", "");
            if(!TextUtils.isEmpty(s)) {
                this.FLD1141 = s;
            }
        }
        return this.FLD1141;
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH3945() [...]

    // 此方法包含解密的字符串
    public void MTH3946(String s) {
        if(!this.FLD1136 && !this.FLD1133 && !this.FLD1100.containsKey("\uD8E3")) {
            ++this.FLD1138;
            this.FLD1133 = true;
            CLS189 ˆʾ0 = new CLS189();
            ˆʾ0.MTH3124(CLS266.MTH4132(this.MTH3921(), "\uD8E3r/", s));
            ˆʾ0.MTH3137(CLS266.MTH4132(this.MTH3913(), "\uD8E3r/", s));
            ˆʾ0.MTH3129(false);
            ˆʾ0.MTH3144(((CLS187)new CLS725(this)));
        }
    }

    public void MTH3948(int v) {
        this.FLD1134 = v;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public final ArrayList MTH3949() {
        ArrayList arrayList0 = new ArrayList();
        CLS200 ˈʽ0 = CLS200.MTH3224();
        boolean z = !ˈʽ0.MTH3240() && !ˈʽ0.MTH3230("\uD8E3xtra_df") && !ˈʽ0.MTH3230("\uD8E3rouplic_unlocked") && TextUtils.isEmpty(CLS95.MTH2031().MTH2733("\uD8E3reguser", ""));
        String s = CLS95.MTH2031().MTH2733("\uD8E3rls_check_alt_wx7", "");
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = s.split("\uD8E3");
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                if(!TextUtils.isEmpty(s1)) {
                    arrayList0.add(s1.trim());
                }
            }
        }
        return arrayList0;
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public boolean MTH3951() {
        return !CLS224.MTH3441() && CLS262.MTH4056(new File(Environment.getExternalStorageDirectory(), "\uD8E3"), "\uD8E3icense.txt");
    }

    // 此方法包含解密的字符串
    public final void MTH3952(String s) {
        if(this.FLD1127) {
            return;
        }
        Context context0 = CLS95.MTH2017();
        if(context0 == null) {
            return;
        }
        try {
            File file0 = new File(CLS95.MTH2017().getCacheDir(), "\uD8E3eXposed.apk");
            if(CLS262.MTH4050(file0)) {
                try {
                    String s1 = CLS262.MTH4054(file0.getAbsolutePath());
                    if(!TextUtils.isEmpty(s1) && s1.equals(s)) {
                        this.FLD1097 = true;
                        this.MTH3924(context0, file0);
                        return;
                    }
                }
                catch(Throwable throwable1) {
                    CLS204.MTH3257(throwable1);
                }
            }
            ++this.FLD1138;
            this.FLD1127 = true;
            CLS189 ˆʾ0 = new CLS189(CLS266.MTH4132(this.MTH3921(), this.MTH3984(), "\uD8E3_" + this.FLD1162.MTH3501()));
            ˆʾ0.MTH3137(CLS266.MTH4132(this.MTH3913(), this.MTH3984(), "\uD8E3_" + this.FLD1162.MTH3501()));
            ˆʾ0.MTH3144(((CLS187)new CLS733(this, file0, s)));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public boolean MTH3953(long v) {
        String s = CLS95.MTH2031().MTH2733("\uD8E3ast_update_check", "");
        return TextUtils.isEmpty(s) || System.currentTimeMillis() - Long.parseLong(s, 16) > v;
    }

    private void MTH3954(Object[] arr_object) {
        this.MTH3877(false);
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH3956() [...]

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static boolean MTH3958(File file0, String s) {
        return s.endsWith("\uD8E3apk") || s.contains("\uD8E3ex");
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public void MTH3960() {
        if(CLS200.MTH3224().MTH3240()) {
            return;
        }
        if(TextUtils.isEmpty("\uD8E30800,18000")) {
            return;
        }
        long v = System.currentTimeMillis() + ((long)CLS224.MTH3456(Integer.parseInt(""), Integer.parseInt("0800,18000"))) * 1000L;
        CLS144.MTH2583().MTH2601(((CLS142)() -> // 此方法包含解密的字符串
        if(!CLS200.MTH3224().MTH3240() && !CLS200.MTH3224().MTH3230("\uD8E3ntegrated_allowed")) {
            CLS104.MTH2238().MTH2247("\uD8E3onation");
            this.FLD1108 = true;
        }), v);
    }

    public void MTH3963() {
        if(this.FLD1127) {
            return;
        }
        this.MTH3853();
    }

    public boolean MTH3964() {
        return this.FLD1161;
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH3965() [...]

    // 检测为 Lambda 实现
    private void MTH3966() [...]

    // 此方法包含解密的字符串
    public final void MTH3967() {
        if(!this.FLD1102 && !this.FLD1100.containsKey("\uD8E3ssets_digest")) {
            ++this.FLD1138;
            this.FLD1102 = true;
            CLS189 ˆʾ0 = new CLS189(CLS266.MTH4132(this.MTH3921(), this.MTH3984(), "\uD8E3ssets_digest"));
            ˆʾ0.MTH3137(CLS266.MTH4132(this.MTH3913(), this.MTH3984(), "\uD8E3ssets_digest"));
            ˆʾ0.MTH3129(false);
            ˆʾ0.MTH3144(((CLS187)new CLS711(this)));
        }
    }

    // 此方法包含解密的字符串
    public boolean MTH3969() {
        if(CLS95.MTH2031().MTH2725("\uD8E3isable_settings", false)) {
            return false;
        }
        if(CLS102.MTH2153() && CLS181.MTH3090() && !CLS200.MTH3224().MTH3240() && !CLS200.MTH3224().MTH3225() && CLS102.MTH2153()) {
            long v = CLS95.MTH2031().MTH2743("\uD8E3ntegrated_grace_time", 0L);
            return v == 0L || System.currentTimeMillis() - v < 432000000L;
        }
        return true;
    }

    // 此方法包含解密的字符串
    public void MTH3970(CLS231 ـᵎ0) {
        this.FLD1153 = new HashSet();
        this.FLD1156 = new ArrayList();
        this.FLD1122 = new ArrayList();
        this.FLD1130 = new ArrayList();
        this.MTH4022();
        this.FLD1162 = ـᵎ0;
        this.FLD1109 = CLS257.MTH3734("\uD8E3o.build.host");
        this.FLD1125 = !CLS262.MTH4050(this.MTH3978());
        this.FLD1131 = false;
    }

    public boolean MTH3971() {
        return this.FLD1164;
    }

    private void MTH3972(Object[] arr_object) {
        this.MTH3866(((Boolean)arr_object[0]).booleanValue(), ((String)arr_object[1]));
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public String MTH3973() {
        return !this.FLD1162.MTH3501().equals("\uD8E3v") || CLS224.MTH3441() ? this.FLD1162.MTH3501() : "\uD8E3";
    }

    // 检测为 Lambda 实现
    public static void MTH3974() [...]

    // 去混淆评级： 中等(50)
    public boolean MTH3975() {
        return this.FLD1120 || this.FLD1126 || this.FLD1149 || this.FLD1129 || this.FLD1150;
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    public final ArrayList MTH3976() {
        ArrayList arrayList0 = new ArrayList();
        CLS200 ˈʽ0 = CLS200.MTH3224();
        ArrayList arrayList1 = ˈʽ0.MTH3240() || ˈʽ0.MTH3230("\uD8E3xtra_df") || ˈʽ0.MTH3230("\uD8E3rouplic_unlocked") || !TextUtils.isEmpty(CLS95.MTH2031().MTH2733("\uD8E3reguser", "")) ? new ArrayList() : new ArrayList();
        Collections.shuffle(arrayList1);
        arrayList0.addAll(arrayList1);
        if(arrayList0.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for(int v = 0; v < 1; ++v) {
                String s = new String[]{""}[v];
                if(!TextUtils.isEmpty(s)) {
                    arrayList2.add(s.trim());
                }
            }
            Collections.shuffle(arrayList2);
            arrayList0.addAll(arrayList2);
        }
        CLS204.MTH3254(("\uD8E3rls: " + arrayList0));
        return arrayList0;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public File MTH3978() {
        return new File("", CLS181.MTH3088(("\uD8E3_" + this.MTH3847())));
    }

    public int MTH3979() {
        return this.FLD1132;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public void MTH3980() {
        if(CLS200.MTH3224().MTH3240()) {
            return;
        }
        if(TextUtils.isEmpty("\uD8E3800,3600")) {
            return;
        }
        long v = System.currentTimeMillis() + ((long)CLS224.MTH3456(Integer.parseInt(""), Integer.parseInt("800,3600"))) * 1000L;
        CLS144.MTH2583().MTH2601(((CLS142)() -> // 此方法包含解密的字符串
        if(!CLS200.MTH3224().MTH3240() && !CLS200.MTH3224().MTH3230("\uD8E3ntegrated_allowed")) {
            CLS104.MTH2238().MTH2225();
            this.FLD1108 = true;
        }), v);
    }

    // 此方法包含解密的字符串
    public final void MTH3981(boolean z, boolean z1) {
        if(!this.FLD1140 && !this.FLD1100.containsKey("\uD8E3ore")) {
            this.FLD1114 = true;
            ++this.FLD1138;
            this.FLD1140 = true;
            CLS189 ˆʾ0 = new CLS189(CLS266.MTH4132(this.MTH3921(), this.MTH3982() + this.MTH3873(), this.FLD1162.MTH3502()));
            ˆʾ0.MTH3137(CLS266.MTH4132(this.MTH3913(), this.MTH3982() + this.MTH3873(), this.FLD1162.MTH3502()));
            ˆʾ0.MTH3129(false);
            ˆʾ0.MTH3144(((CLS187)new CLS698(this, z, z1)));
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final String MTH3982() {
        return this.FLD1162.MTH3516() + "\uD8E3";
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH3983() [...]

    // 去混淆评级： 中等(50)
    // 此方法包含解密的字符串
    public final String MTH3984() {
        CLS156 ٴʻ0 = CLS95.MTH2031();
        return ٴʻ0 == null ? "" : ٴʻ0.MTH2733("\uD8E3elease_channel", "");
    }

    public boolean MTH3985() {
        return this.FLD1119;
    }

    // 此方法包含解密的字符串
    public final void MTH3986() {
        try {
            String s = CLS95.MTH2022(("\uD8E3isable_features_" + this.MTH3973()));
            if(!TextUtils.isEmpty(s)) {
                String[] arr_s = CLS170.MTH3005(s);
                for(int v = 0; v < arr_s.length; ++v) {
                    this.FLD1162.MTH3504(arr_s[v]);
                }
            }
            String s1 = CLS95.MTH2022(("\uD8E3isable_phones_" + this.MTH3973()));
            if(!TextUtils.isEmpty(s1)) {
                String[] arr_s1 = CLS170.MTH3005(s1);
                for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                    if(Build.FINGERPRINT.equals(arr_s1[v1])) {
                        this.FLD1162.MTH3504("\uD8E3hone");
                        break;
                    }
                }
            }
            if(this.FLD1162.MTH3507("\uD8E3hone")) {
                CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                CLS104.MTH2238().MTH2225();
                this.FLD1136 = true;
                this.FLD1099 = true;
                this.MTH3948(500);
            }
            for(Object object0: CLS200.MTH3224().MTH3222()) {
                this.FLD1162.MTH3504(((String)object0));
            }
            CLS156 ٴʻ0 = CLS95.MTH2031();
            if(ٴʻ0 != null) {
                String s2 = ٴʻ0.MTH2733("\uD8E3isable_features", "");
                if(!TextUtils.isEmpty(s2)) {
                    String[] arr_s2 = CLS170.MTH3005(s2);
                    for(int v2 = 0; v2 < arr_s2.length; ++v2) {
                        this.FLD1162.MTH3504(arr_s2[v2]);
                    }
                }
                if(ٴʻ0.MTH2725("\uD8E3ystem_app_check", true) && this.FLD1163) {
                    this.FLD1099 = true;
                    this.FLD1136 = true;
                    this.MTH3948(811);
                    CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                    CLS104.MTH2238().MTH2225();
                }
            }
            this.MTH3937();
            this.MTH4009();
            this.MTH3896();
            this.MTH4029();
            CLS213.MTH3304().MTH3323("\uD8E3rocess_metadata", new Object[0]);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    private Object MTH3987(Object[] arr_object) {
        return this.MTH4017();
    }

    private void MTH3988(Object[] arr_object) {
        this.MTH3858(((Boolean)arr_object[0]).booleanValue());
    }

    // 此方法包含解密的字符串
    public final void MTH3989() {
        if(!this.FLD1136 && !this.FLD1146 && !this.FLD1100.containsKey("\uD8E3")) {
            ++this.FLD1138;
            this.FLD1146 = true;
            CLS189 ˆʾ0 = new CLS189(CLS266.MTH4132(this.MTH3921(), "", "\uD8E3"));
            ˆʾ0.MTH3137(CLS266.MTH4132(this.MTH3913(), "", "\uD8E3"));
            ˆʾ0.MTH3129(false);
            ˆʾ0.MTH3144(((CLS187)new CLS736(this)));
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public boolean MTH3990() {
        return CLS95.MTH2031().MTH2725("\uD8E3ermaban", false);
    }

    private void MTH3992(Object[] arr_object) {
        this.MTH3868(((String)arr_object[0]));
    }

    public boolean MTH3993() {
        return this.FLD1106;
    }

    private void MTH3994(Object[] arr_object) {
        this.MTH3981(false, false);
    }

    // 此方法包含解密的字符串
    private Object MTH3995(Object[] arr_object) {
        if(TextUtils.isEmpty(this.FLD1157)) {
            String s = CLS95.MTH2031().MTH2733("\uD8E3IC", "");
            if(!TextUtils.isEmpty(s)) {
                this.FLD1157 = s;
            }
        }
        return this.FLD1157;
    }

    public boolean MTH3996() {
        return this.FLD1108;
    }

    // 此方法包含解密的字符串
    public final boolean MTH3999() {
        String s = CLS95.MTH2031().MTH2733("\uD8E3_valid", "");
        if(TextUtils.isEmpty(s)) {
            return true;
        }
        try {
            String s1 = "\uD8E3n4hZkF" + CLS95.MTH2014();
            String s2 = CLS198.MTH3213(CLS181.MTH3088((CLS95.MTH2006().MTH3014() + s1)), s);
            if(TextUtils.isEmpty(s2)) {
                for(int v = 0; v < 1; ++v) {
                    s2 = CLS198.MTH3213(CLS181.MTH3088((new String[]{""}[v] + s1)), s);
                    if(!TextUtils.isEmpty(s2)) {
                        break;
                    }
                }
            }
            if(TextUtils.isEmpty(s2)) {
                return false;
            }
            long v1 = Long.parseLong(s2, 16);
            return v1 == 0L ? false : System.currentTimeMillis() < v1;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH4000() [...]

    // 去混淆评级： 高(200)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH4001() [...]

    // 去混淆评级： 低(20)
    public boolean MTH4002() {
        return this.FLD1147 != 0 && CLS95.MTH1985() && !CLS262.MTH4050(this.MTH3978());
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public final boolean MTH4003() {
        return !TextUtils.isEmpty(this.MTH3944()) && !this.FLD1162.MTH3507("\uD8E3mulator_check") && !CLS200.MTH3224().MTH3230("\uD8E3mulator_allowed") && CLS257.MTH3725();
    }

    // 检测为 Lambda 实现
    private void MTH4004() [...]

    // 去混淆评级： 低(20)
    public boolean MTH4006() {
        return !this.FLD1131 && this.FLD1125 && this.FLD1147 == -1;
    }

    // 此方法包含解密的字符串
    @SuppressLint({"HardwareIds", "MissingPermission"})
    public JSONObject MTH4007(JSONObject jSONObject0) {
        JSONObject jSONObject1 = new JSONObject();
        try {
            Context context0 = CLS95.MTH2017();
            CLS150 ˋᵎ0 = CLS150.MTH2682();
            String s = ˋᵎ0.MTH2688(context0);
            String s1 = ˋᵎ0.MTH2680(context0);
            HashSet hashSet0 = new HashSet();
            CLS224.MTH3477(hashSet0, CLS216.MTH3352().MTH3362());
            CLS224.MTH3477(hashSet0, ˋᵎ0.MTH2685(context0));
            CLS224.MTH3477(hashSet0, "");
            CLS224.MTH3477(hashSet0, "");
            CLS224.MTH3477(hashSet0, CLS216.MTH3352().MTH3355());
            String s2 = TextUtils.join("\uD8E3", hashSet0);
            String s3 = CLS216.MTH3352().MTH3369();
            try {
                if(!this.FLD1160) {
                    if(CLS95.MTH2016(s)) {
                        this.FLD1160 = true;
                        this.MTH3948(700);
                        CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                    }
                    if(CLS95.MTH1988(s3)) {
                        this.FLD1160 = true;
                        this.MTH3948(701);
                        this.FLD1106 = true;
                        CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                    }
                    if(CLS95.MTH2044("")) {
                        this.FLD1160 = true;
                        this.MTH3948(702);
                        CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                    }
                }
            }
            catch(Throwable throwable1) {
                CLS204.MTH3257(throwable1);
            }
            if(CLS224.MTH3441()) {
                jSONObject1.put("\uD8E3v", true);
                String s4 = CLS213.MTH3304().MTH3299("\uD8E3etMEID", new Object[0]);
                if(!TextUtils.isEmpty(s4)) {
                    jSONObject1.put("\uD8E3eid", s4);
                }
            }
            else {
                jSONObject1.put("\uD8E3p_donation", true);
            }
            jSONObject1.put("\uD8E3eviceId", s);
            jSONObject1.put("\uD8E3im", s1);
            jSONObject1.put("\uD8E3hone", s2);
            String s5 = Build.SERIAL;
            try {
                if((TextUtils.isEmpty(s5) || "\uD8E3ull".equalsIgnoreCase(s5) || "\uD8E3nknown".equalsIgnoreCase(s5)) && Build.VERSION.SDK_INT >= 26) {
                    s5 = Build.getSerial();
                }
            }
            catch(Throwable unused_ex) {
            }
            jSONObject1.put("\uD8E3erial", s5);
            jSONObject1.put("\uD8E3ost", this.FLD1109);
            jSONObject1.put("\uD8E3ingerprint", Build.FINGERPRINT);
            jSONObject1.put("\uD8E3xid", CLS95.MTH2014());
            jSONObject1.put("\uD8E3lias", s3);
            jSONObject1.put("\uD8E3ickname", CLS95.MTH2028());
            jSONObject1.put("\uD8E3q", "");
            jSONObject1.put("\uD8E3", (CLS95.MTH1985() || !CLS262.MTH4050(this.MTH3978()) ? "" : CLS95.MTH2004("\uD8E3ERSION")));
            jSONObject1.put("\uD8E3", "");
            jSONObject1.put("\uD8E3", "");
            jSONObject1.put("\uD8E3", 209);
            jSONObject1.put("\uD8E3", CLS95.MTH2008());
            jSONObject1.put("\uD8E3md", this.MTH3846());
            JSONObject jSONObject2 = CLS104.MTH2238().MTH2221();
            if(jSONObject2.length() == 0) {
                this.FLD1137 = true;
            }
            jSONObject1.put("\uD8E3p", jSONObject2);
            jSONObject1.put("\uD8E3", CLS147.MTH2641().MTH2633());
            jSONObject1.put("\uD8E3xsig", this.FLD1162.MTH3510());
            jSONObject1.put("\uD8E3xvc", this.FLD1162.MTH3511());
            jSONObject1.put("\uD8E3xvn", this.FLD1162.MTH3518());
            jSONObject1.put("\uD8E3vc", this.FLD1162.MTH3500());
            jSONObject1.put("\uD8E3vn", this.FLD1162.MTH3516());
            jSONObject1.put("\uD8E3ig", CLS95.MTH2006().MTH3014());
            jSONObject1.put("\uD8E3ime", Long.toHexString(System.currentTimeMillis()));
            jSONObject1.put("\uD8E3ersion", this.FLD1162.MTH3516() + "\uD8E3" + CLS95.MTH1982(90, new Object[0]) + "\uD8E3" + "\uD8E32" + CLS104.MTH2238().MTH2226() + "\uD8E3(" + CLS95.MTH2008() + "\uD8E3" + 209 + "\uD8E3 " + this.FLD1162.MTH3501());
            jSONObject1.put("\uD8E3eguser", CLS95.MTH2031().MTH2733("\uD8E3reguser", ""));
            jSONObject1.put("\uD8E3pecial_fp", CLS95.MTH2031().MTH2733("\uD8E3specialfp", ""));
            jSONObject1.put("\uD8E3ang", "\uD8E3h");
            jSONObject1.put("\uD8E3ath", "");
            jSONObject1.put("\uD8E3odule_path", this.FLD1162.MTH3521());
            jSONObject1.put("\uD8E3t", this.MTH3973());
            jSONObject1.put("\uD8E3t2", this.FLD1162.MTH3501());
            jSONObject1.put("\uD8E3n", this.FLD1162.MTH3519());
            jSONObject1.put("\uD8E3xcrc", this.FLD1162.MTH3508());
            jSONObject1.put("\uD8E3crc", CLS95.MTH2006().MTH3015());
            jSONObject1.put("\uD8E3xrver", CLS224.MTH3470());
            jSONObject1.put("\uD8E3mu", CLS257.MTH3725());
            jSONObject1.put("\uD8E3splay", this.FLD1162.MTH3517());
            jSONObject1.put("\uD8E3sARM64", this.FLD1162.MTH3515());
            jSONObject1.put("\uD8E3rch", CLS257.MTH3723());
            if(CLS102.MTH2156()) {
                jSONObject1.put("\uD8E3sXpatch", CLS102.MTH2156());
            }
            if(CLS102.MTH2161()) {
                jSONObject1.put("\uD8E3sExp", CLS102.MTH2161());
            }
            if(CLS102.MTH2169()) {
                jSONObject1.put("\uD8E3sEdXposed", CLS102.MTH2169());
            }
            if(CLS102.MTH2160()) {
                jSONObject1.put("\uD8E3sMagicXposed", CLS102.MTH2160());
            }
            if(CLS102.MTH2176()) {
                jSONObject1.put("\uD8E3sSandHook", CLS102.MTH2176());
            }
            if(CLS102.MTH2171()) {
                jSONObject1.put("\uD8E3sLsposed", CLS102.MTH2171());
            }
            if(CLS102.MTH2145()) {
                jSONObject1.put("\uD8E3sXposed", CLS102.MTH2145());
            }
            if(CLS102.MTH2151()) {
                jSONObject1.put("\uD8E3sBugHook", CLS102.MTH2151());
            }
            if(CLS102.MTH2165()) {
                jSONObject1.put("\uD8E3sSpatch", CLS102.MTH2165());
            }
            if(CLS102.MTH2173()) {
                jSONObject1.put("\uD8E3sOpatch", CLS102.MTH2166());
            }
            else if(CLS102.MTH2166()) {
                jSONObject1.put("\uD8E3sLspatch", CLS102.MTH2166());
            }
            if(CLS102.MTH2159()) {
                jSONObject1.put("\uD8E3sSandVXP", CLS102.MTH2159());
            }
            if(CLS102.MTH2164()) {
                jSONObject1.put("\uD8E3sTTpatch", CLS102.MTH2164());
            }
            if(CLS102.MTH2186()) {
                jSONObject1.put("\uD8E3sMetaWolf", CLS102.MTH2186());
            }
            ArrayList arrayList0 = this.MTH4018();
            if(!arrayList0.isEmpty()) {
                jSONObject1.put("\uD8E3l", TextUtils.join("\uD8E3", arrayList0));
            }
            if(CLS95.MTH2031().MTH2725("\uD8E3se_beta_channel", false)) {
                jSONObject1.put("\uD8E3se_beta", true);
            }
            else if(CLS95.MTH2031().MTH2725("\uD8E3se_debug_channel", false)) {
                jSONObject1.put("\uD8E3se_debug", true);
            }
            if(jSONObject0 != null) {
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    jSONObject1.put(((String)object0), jSONObject0.get(((String)object0)));
                }
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return this.MTH3895(jSONObject1);
    }

    public boolean MTH4008() {
        return this.FLD1114;
    }

    public final void MTH4009() {
        CLS144.MTH2583().MTH2589(((CLS142)() -> // 此方法包含解密的字符串
        {
            HashSet hashSet0 = new HashSet();
            if(hashSet0.isEmpty()) {
                return;
            }
            String s = this.FLD1162.MTH3521();
            for(Object object0: hashSet0) {
                String s1 = ((String)object0).trim();
                if(s.contains(s1)) {
                    CLS204.MTH3254(("\uD8E3apps7: " + s1));
                    CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                    this.FLD1136 = true;
                    this.FLD1099 = true;
                    this.MTH3948(503);
                    this.FLD1116.add(s1);
                    return;
                }
                if(false) {
                    break;
                }
            }
        }));
    }

    public boolean MTH4010() {
        return this.FLD1151;
    }

    public boolean MTH4011() {
        return this.FLD1137;
    }

    public boolean MTH4012() {
        return !this.FLD1116.isEmpty();
    }

    // 此方法包含解密的字符串
    public final Collection MTH4013(String s) {
        String s1 = CLS95.MTH2040(s);
        ArrayList arrayList0 = new ArrayList();
        if(TextUtils.isEmpty(s1)) {
            return arrayList0;
        }
        arrayList0.addAll(Arrays.asList(s1.split("\uD8E3")));
        return arrayList0;
    }

    // 此方法包含解密的字符串
    private void MTH4014(File file0, String s, CLS186 ˆʾ$ʻᵢ0) {
        --this.FLD1138;
        this.FLD1127 = false;
        byte[] arr_b = CLS266.MTH4134(ˆʾ$ʻᵢ0.FLD885);
        if(arr_b == null) {
            CLS204.MTH3252("\uD8E3ownload apk failed");
            this.MTH3916();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("\uD8E3pk", file0.getAbsolutePath());
        contentValues0.put("\uD8E3rc", s);
        contentValues0.put("\uD8E3ata", arr_b);
        this.MTH3911("\uD8E3pk", contentValues0);
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    public final void MTH4015(Context context0, File file0) {
        CLS257.MTH3715(context0, this.FLD1144);
        CLS224.MTH3483(context0, file0, "", "", this.FLD1144);
    }

    // 此方法包含解密的字符串
    private void MTH4016(boolean z, boolean z1, CLS186 ˆʾ$ʻᵢ0) {
        --this.FLD1138;
        this.FLD1140 = false;
        byte[] arr_b = CLS266.MTH4134(ˆʾ$ʻᵢ0.FLD885);
        if(arr_b == null) {
            CLS204.MTH3252("\uD8E3ownload core failed");
            this.MTH3916();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("\uD8E3orce", Boolean.valueOf(z));
        contentValues0.put("\uD8E3ilent", Boolean.valueOf(z1));
        contentValues0.put("\uD8E3ata", arr_b);
        this.MTH3911("\uD8E3ore", contentValues0);
    }

    public int MTH4017() {
        return this.FLD1134;
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH4018() {
        ArrayList arrayList0 = new ArrayList();
        File file0 = new File(Environment.getExternalStorageDirectory(), "\uD8E3");
        if(!CLS262.MTH4050(file0)) {
            return arrayList0;
        }
        File file1 = new File(file0, "\uD8E3icense.txt");
        if(!CLS262.MTH4050(file1)) {
            return arrayList0;
        }
        try {
            String s = CLS262.MTH4069(file1);
            if(TextUtils.isEmpty(s)) {
                return arrayList0;
            }
            String[] arr_s = s.split("\uD8E3|\r");
        label_12:
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v].trim();
                if(s1.length() == 0x40 && !arrayList0.contains(s1)) {
                    arrayList0.add(s1);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            if(true) {
                return arrayList0;
            }
            goto label_12;
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final void MTH4019() {
        boolean z1;
        CLS156 ٴʻ0 = CLS95.MTH2031();
        if(ٴʻ0 == null) {
            return;
        }
        String s = this.MTH3944();
        if(TextUtils.isEmpty(s)) {
            String s1 = ٴʻ0.MTH2733("\uD8E3erifier6\uD8E3time", "");
            if(TextUtils.isEmpty(s1)) {
                ٴʻ0.MTH2749("\uD8E3erifier6\uD8E3time", Long.toHexString(System.currentTimeMillis()));
            }
            else if(System.currentTimeMillis() - Long.parseLong(s1, 16) > 43200000L) {
                CLS204.MTH3252("\uD8E3erifier time empty");
                this.MTH3930();
                this.FLD1159 = true;
                return;
            }
            return;
        }
        ٴʻ0.MTH2749("\uD8E3erifier6\uD8E3time", Long.toHexString(System.currentTimeMillis()));
        boolean z = false;
        this.FLD1159 = false;
        try {
            if(TextUtils.isEmpty(s)) {
                goto label_28;
            }
            else {
                Object object0 = CLS95.MTH1982(0x84, new Object[]{"\uD8E3erifier6", s, CLS95.MTH2014()});
                z1 = object0 == null ? false : ((Boolean)object0).booleanValue();
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            z1 = false;
        }
        goto label_29;
    label_28:
        z1 = false;
    label_29:
        String s2 = "";
        if(z1) {
            try {
                if(!TextUtils.isEmpty(s)) {
                    Object object1 = CLS95.MTH1982(130, new Object[]{"\uD8E3erifier6", s, CLS95.MTH2014()});
                    if(object1 != null) {
                        s2 = (String)object1;
                    }
                }
                if(!TextUtils.isEmpty(s2)) {
                    if(Math.abs(Long.parseLong(s2, 16) - System.currentTimeMillis()) > 950400000L) {
                        goto label_41;
                    }
                    else {
                        goto label_47;
                    }
                }
            }
            catch(Throwable throwable1) {
                z = true;
                CLS204.MTH3257(throwable1);
            }
            goto label_48;
            try {
            label_41:
                ٴʻ0.MTH2739("\uD8E3erifier6");
                CLS204.MTH3252("\uD8E3erifier expired: exceeded time limit!");
                goto label_48;
            }
            catch(Throwable throwable1) {
            }
            CLS204.MTH3257(throwable1);
            goto label_48;
        label_47:
            z = true;
        label_48:
            z1 = z;
        }
        if(!z1) {
            this.FLD1159 = true;
            CLS204.MTH3252("\uD8E3erifier expired");
            this.MTH3930();
            return;
        }
        if(this.MTH4017() == 810) {
            this.FLD1135 = true;
            this.MTH3843();
        }
    }

    // 去混淆评级： 低(40)
    public boolean MTH4020() {
        return this.FLD1136 || this.FLD1159 || this.FLD1160 || this.MTH3990();
    }

    public int MTH4021() {
        return this.FLD1117;
    }

    // 此方法包含解密的字符串
    public final void MTH4022() {
        this.FLD1153.clear();
        this.FLD1153.addAll(this.MTH4013("\uD8E3oot"));
        this.FLD1130.clear();
        this.FLD1130.addAll(this.MTH4013("\uD8E3oot_priority"));
        this.FLD1156.clear();
        this.FLD1156.addAll(this.MTH4013("\uD8E3oot_random"));
        this.FLD1122.clear();
        this.FLD1122.addAll(this.MTH4013("\uD8E3oot_fixed"));
    }

    public boolean MTH4024() {
        return this.FLD1097;
    }

    // 去混淆评级： 低(20)
    public boolean MTH4025() {
        return this.FLD1125 && this.MTH3834();
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH4027() [...]

    // 此方法包含解密的字符串
    private void MTH4028(CLS186 ˆʾ$ʻᵢ0) {
        --this.FLD1138;
        this.FLD1154 = false;
        byte[] arr_b = CLS266.MTH4134(ˆʾ$ʻᵢ0.FLD885);
        if(arr_b == null) {
            CLS204.MTH3252("\uD8E3ownload xmd failed");
            this.MTH3916();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("\uD8E3ata", arr_b);
        this.MTH3911("\uD8E3md", contentValues0);
    }

    // 此方法包含解密的字符串
    public final void MTH4029() {
        if(!this.FLD1136 && CLS95.MTH2031().MTH2725("\uD8E3pp_check", false)) {
            CLS144.MTH2583().MTH2589(((CLS142)() -> // 此方法包含解密的字符串
            {
                if(this.FLD1136) {
                    return;
                }
                HashSet hashSet0 = new HashSet();
                if(hashSet0.isEmpty()) {
                    return;
                }
                for(Object object0: hashSet0) {
                    String s = ((String)object0).trim();
                    if(CLS257.MTH3741(CLS95.MTH2017(), s)) {
                        CLS204.MTH3252(("\uD8E3onflict: " + s));
                        CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                        this.FLD1136 = true;
                        this.FLD1099 = true;
                        this.FLD1105 = 3;
                        if(!this.MTH3905(s)) {
                            break;
                        }
                        this.FLD1116.add(s);
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }));
            CLS144.MTH2583().MTH2589(((CLS142)() -> // 此方法包含解密的字符串
            {
                if(this.FLD1136) {
                    return;
                }
                HashSet hashSet0 = new HashSet();
                if(hashSet0.isEmpty()) {
                    return;
                }
                for(Object object0: hashSet0) {
                    String s = ((String)object0).trim();
                    if(CLS257.MTH3741(CLS95.MTH2017(), s)) {
                        CLS204.MTH3252(("\uD8E3onflict: " + s));
                        this.FLD1105 = 5;
                        this.FLD1116.add(s);
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }));
            CLS144.MTH2583().MTH2589(((CLS142)() -> // 去混淆评级： 高(200)
            // 此方法包含解密的字符串
            {
            }));
            CLS144.MTH2583().MTH2589(((CLS142)() -> // 此方法包含解密的字符串
            {
                if(this.FLD1136) {
                    return;
                }
                HashSet hashSet0 = new HashSet();
                HashSet hashSet1 = new HashSet();
                if(hashSet0.isEmpty() && hashSet1.isEmpty()) {
                    return;
                }
                HashSet hashSet2 = CLS257.MTH3729(CLS95.MTH2017());
                if(hashSet2.isEmpty()) {
                    return;
                }
                if(!this.FLD1136) {
                    for(Object object0: hashSet2) {
                        String s = (String)object0;
                        if(hashSet0.isEmpty()) {
                            if(hashSet1.isEmpty()) {
                                continue;
                            }
                            String s2 = CLS257.MTH3724(CLS95.MTH2017(), s.trim());
                            if(TextUtils.isEmpty(s2) || !hashSet1.contains(s2)) {
                                continue;
                            }
                            this.FLD1116.add(s.trim());
                            CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                        }
                        else {
                            String s1 = CLS181.MTH3091(CLS95.MTH2017(), s.trim());
                            if(!TextUtils.isEmpty(s1) && hashSet0.contains(s1)) {
                                CLS204.MTH3252(("\uD8E3onflict 3: " + s));
                                this.FLD1116.add(s.trim());
                                CLS213.MTH3304().MTH3311("\uD8E3isable", new Object[0]);
                            }
                        }
                        this.FLD1136 = true;
                        this.FLD1099 = true;
                        return;
                    }
                }
            }));
        }
    }
}

