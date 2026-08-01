// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import c.ʾˎ.CLS41;
import c.ˉˆ.CLS59;
import c.ˉˆ.CLS61;
import c.ˉˆ.CLS64;
import c.ˉˆ.CLS67;
import c.ˉˆ.CLS70.CLS69;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS97;
import c.ˊﹶ.CLS98;
import c.ˎﹳ.CLS107;
import c.ˏי.CLS111;
import c.ˏᴵ.CLS119;
import c.ˏᴵ.CLS126;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class CLS170 {
    public String FLD670;
    public boolean FLD671;
    public boolean FLD672;
    public boolean FLD673;
    public String FLD674;
    public boolean FLD675;
    public final HashSet FLD676;
    public boolean FLD677;
    public boolean FLD678;
    public boolean FLD679;
    public boolean FLD680;
    public String FLD681;
    public boolean FLD682;
    public boolean FLD683;
    public final Runnable FLD684;
    public ArrayList FLD685;
    public int FLD686;
    public String FLD687;
    public final HashSet FLD688;
    public String FLD689;
    public String FLD690;
    public boolean FLD691;
    public HashSet FLD692;
    public boolean FLD693;
    public boolean FLD694;
    public boolean FLD695;
    public boolean FLD696;
    public boolean FLD697;
    public boolean FLD698;
    public boolean FLD699;
    public CLS139 FLD700;
    public boolean FLD701;
    public boolean FLD702;
    public boolean FLD703;
    public int FLD704;
    public boolean FLD705;
    public boolean FLD706;
    public boolean FLD707;
    public int FLD708;
    public boolean FLD709;
    public boolean FLD710;
    public String FLD711;
    public int FLD712;
    public boolean FLD713;
    public boolean FLD714;
    public boolean FLD715;
    public ArrayList FLD716;
    public boolean FLD717;
    public boolean FLD718;
    public int FLD719;
    public String FLD720;
    public boolean FLD721;
    public ArrayList FLD722;
    public int FLD723;
    public boolean FLD724;
    public String FLD725;
    public boolean FLD726;
    public boolean FLD727;
    public static final CLS170 FLD728;
    public int FLD729;
    public final HashSet FLD730;
    public boolean FLD731;
    public boolean FLD732;
    public boolean FLD733;
    public boolean FLD734;
    public int FLD735;
    public boolean FLD736;
    public int FLD737;
    public final ConcurrentHashMap FLD738;

    static {
        CLS170.FLD728 = new CLS170();
    }

    // 此方法包含解密的字符串
    public CLS170() {
        this.FLD735 = -1;
        this.FLD721 = false;
        this.FLD695 = false;
        this.FLD711 = "";
        this.FLD703 = false;
        this.FLD708 = 0;
        this.FLD697 = true;
        this.FLD710 = false;
        this.FLD712 = 0;
        this.FLD719 = 0;
        this.FLD713 = false;
        this.FLD726 = false;
        this.FLD705 = false;
        this.FLD701 = false;
        this.FLD723 = 0;
        this.FLD675 = false;
        this.FLD729 = 0;
        this.FLD704 = 0;
        this.FLD683 = false;
        this.FLD688 = new HashSet();
        this.FLD738 = new ConcurrentHashMap();
        this.FLD730 = new HashSet();
        this.FLD676 = new HashSet();
        CLS194.MTH2881().MTH2905("downloadFeaturePack", ((CLS141)new CLS512(this))).MTH2905("requestFeaturePackUpdate", ((CLS141)new CLS524(this))).MTH2899("getVerifierData", ((CLS162)new CLS510(this))).MTH2899("getLicData", ((CLS162)new CLS563(this))).MTH2899("getFeaturePacks", ((CLS162)new CLS504(this))).MTH2905("reportInstalledApps", ((CLS141)new CLS520(this))).MTH2905("checkUpdates", ((CLS141)new CLS569(this))).MTH2905("dynamicUpdateCheck", ((CLS141)new CLS495(this))).MTH2899("isUpdateFileAvailable", ((CLS162)new CLS568(this))).MTH2905("downloadCore", ((CLS141)new CLS556(this))).MTH2905("downloadLib", ((CLS141)new CLS570(this))).MTH2899("getDisabledCode", ((CLS162)new CLS502(this))).MTH2899("isRandomFailed", ((CLS162)new CLS516(this))).MTH2899("isDisableDonate", ((CLS162)new CLS540(this)));
        this.FLD684 = () -> this.MTH2375(false);
    }

    public void MTH2351() {
        if(this.FLD732) {
            return;
        }
        this.MTH2406();
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2353() [...]

    public boolean MTH2354() {
        return this.FLD683;
    }

    // 去混淆评级： 中等(90)
    // 此方法包含解密的字符串
    public boolean MTH2356() {
        return this.MTH2360() && this.MTH2512() && this.MTH2517(900000L) && (TextUtils.isEmpty(CLS98.MTH1297().MTH1015("params_S6", "")) || !CLS176.MTH2570(this.MTH2503()));
    }

    // 此方法包含解密的字符串
    public long MTH2357(String s) {
        try {
            JSONObject jSONObject0 = CLS98.MTH1297().MTH1006("LatestVersions", new JSONObject());
            if(jSONObject0.has(s)) {
                return s.equals("apk") ? Long.parseLong(CLS197.MTH2924(jSONObject0.getString(s))[0], 16) : Long.parseLong(jSONObject0.getString(s), 16);
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return -1L;
    }

    public boolean MTH2359() {
        return this.FLD686 != 0;
    }

    // 去混淆评级： 低(40)
    public boolean MTH2360() {
        return !CLS111.MTH1580() || !CLS224.MTH3089() || CLS191.MTH2830().MTH2841() || this.MTH2517(86400000L);
    }

    private void MTH2361(Object[] arr_object) {
        this.MTH2453(((Boolean)arr_object[0]).booleanValue(), ((String)arr_object[1]));
    }

    // 此方法包含解密的字符串
    public final void MTH2362() {
        if(this.MTH2538()) {
            this.FLD724 = true;
            this.FLD731 = true;
            this.FLD680 = true;
            this.MTH2525(807);
        }
        if(!CLS98.MTH1297().MTH994("app_check", false)) {
            return;
        }
        CLS70.MTH1131().MTH1139(((CLS69)() -> // 此方法包含解密的字符串
        {
            HashSet hashSet0 = new HashSet();
            if(hashSet0.isEmpty()) {
                return;
            }
            HashSet hashSet1 = CLS180.MTH2627(CLS98.MTH1323());
            Iterator iterator0 = hashSet0.iterator();
            while(true) {
                boolean z = false;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                String s = ((String)object0).trim();
                if(hashSet1.contains(s) || CLS180.MTH2624(CLS98.MTH1323(), s)) {
                    CLS185.MTH2710(("fapps: " + s));
                    CLS194.MTH2881().MTH2891("disable", new Object[0]);
                    this.FLD724 = true;
                    this.FLD731 = true;
                    this.MTH2525(501);
                    this.FLD730.add(s);
                    z = true;
                    break;
                }
            }
            if(z) {
                this.FLD701 = true;
                return;
            }
            if(this.FLD701) {
                this.FLD703 = true;
                this.FLD705 = true;
            }
        }));
    }

    // 此方法包含解密的字符串
    public void MTH2364(String s) {
        if(!this.FLD724 && !this.FLD706 && !this.FLD738.containsKey("p")) {
            ++this.FLD686;
            this.FLD706 = true;
            CLS214 ᵢᵔ0 = new CLS214();
            ᵢᵔ0.MTH3016(CLS209.MTH2986(this.MTH2486(), "pr/", s));
            ᵢᵔ0.MTH3022(CLS209.MTH2986(this.MTH2487(), "pr/", s));
            ᵢᵔ0.MTH3028(false);
            ᵢᵔ0.MTH3021(((CLS212)new CLS560(this)));
        }
    }

    // 此方法包含解密的字符串
    private void MTH2365(File file0, String s, CLS213 ᵢᵔ$ﾞⁱ0) {
        --this.FLD686;
        this.FLD732 = false;
        byte[] arr_b = CLS209.MTH2985(ᵢᵔ$ﾞⁱ0.FLD859);
        if(arr_b == null) {
            CLS185.MTH2711("download apk failed");
            this.MTH2381();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("apk", file0.getAbsolutePath());
        contentValues0.put("crc", s);
        contentValues0.put("data", arr_b);
        this.MTH2477("apk", contentValues0);
    }

    // 此方法包含解密的字符串
    public final boolean MTH2366() {
        String s = CLS98.MTH1297().MTH1015("s_valid", "");
        if(TextUtils.isEmpty(s)) {
            return true;
        }
        try {
            String s1 = "9n4hZkF" + CLS98.MTH1305();
            String s2 = CLS217.MTH3042(CLS224.MTH3090((CLS98.MTH1295().MTH2950() + s1)), s);
            if(TextUtils.isEmpty(s2)) {
                for(int v = 0; v < 1; ++v) {
                    s2 = CLS217.MTH3042(CLS224.MTH3090((new String[]{""}[v] + s1)), s);
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
            CLS185.MTH2708(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2367(boolean z) {
        if(!this.FLD699 && !this.FLD738.containsKey("lib")) {
            this.FLD717 = true;
            ++this.FLD686;
            this.FLD699 = true;
            CLS214 ᵢᵔ0 = new CLS214(CLS209.MTH2986(this.MTH2486(), this.MTH2430(), CLS97.MTH1263()));
            ᵢᵔ0.MTH3016(this.MTH2384("l"));
            ᵢᵔ0.MTH3022(CLS209.MTH2986(this.MTH2487(), this.MTH2430(), CLS97.MTH1263()));
            ᵢᵔ0.MTH3028(false);
            ᵢᵔ0.MTH3021(((CLS212)new CLS513(this, z)));
        }
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public boolean MTH2368() {
        return !CLS184.MTH2693() && CLS176.MTH2597(new File(Environment.getExternalStorageDirectory(), "X"), "license.txt");
    }

    // 此方法包含解密的字符串
    public final String MTH2369() {
        if(TextUtils.isEmpty(this.FLD674)) {
            String s = CLS98.MTH1297().MTH1015("verifier6", "");
            if(!TextUtils.isEmpty(s)) {
                this.FLD674 = s;
            }
        }
        return this.FLD674;
    }

    // 此方法包含解密的字符串
    private void MTH2370(CLS213 ᵢᵔ$ﾞⁱ0) {
        --this.FLD686;
        this.FLD677 = false;
        byte[] arr_b = CLS209.MTH2985(ᵢᵔ$ﾞⁱ0.FLD859);
        if(arr_b == null) {
            CLS185.MTH2711("download hooks failed");
            this.MTH2381();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("data", arr_b);
        this.MTH2477("hooks", contentValues0);
    }

    // 去混淆评级： 低(40)
    public boolean MTH2372() {
        return this.FLD724 || this.FLD679 || this.FLD672 || this.MTH2490();
    }

    // 检测为 Lambda 实现
    public static void MTH2373() [...]

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public boolean MTH2374() {
        return this.MTH2389(CLS98.MTH1297().MTH1015("usedKeys", ""));
    }

    public void MTH2375(boolean z) {
        this.FLD697 = false;
        this.MTH2496(z);
    }

    // 去混淆评级： 低(35)
    // 此方法包含解密的字符串
    public final boolean MTH2376(String s) {
        String s1 = CLS98.MTH1297().MTH1015("_fapps", "");
        return TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) || !s1.contains(s);
    }

    public final void MTH2377() {
        CLS70.MTH1131().MTH1127(((CLS69)() -> {
            CLS119.MTH1778().MTH1777();
            CLS126.MTH1938().MTH1949();
        }));
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static boolean MTH2380(File file0, String s) {
        return s.endsWith(".apk") || s.contains("dex");
    }

    // 此方法包含解密的字符串
    public final void MTH2381() {
        String s8;
        String s7;
        String s6;
        String s1;
        try {
            if(this.FLD738.containsKey("p")) {
                ContentValues contentValues0 = (ContentValues)this.FLD738.get("p");
                this.FLD738.remove("p");
                this.FLD735 = 0;
                if(CLS176.MTH2589(new File(contentValues0.getAsString("path")), contentValues0.getAsByteArray("data"))) {
                    this.FLD721 = true;
                    this.FLD695 = false;
                    if(!TextUtils.isEmpty(this.FLD689) && Long.parseLong(CLS98.MTH1289("VERSION"), 16) == Long.parseLong(this.FLD689, 16)) {
                        this.FLD721 = false;
                    }
                    CLS98.MTH1297().MTH986("safe_mode");
                    CLS98.MTH1297().MTH986("safe_mode_cnt");
                    CLS185.MTH2711("wexposed params file update success!");
                }
                else {
                    CLS185.MTH2711("wexposed params file update fail!");
                    this.FLD726 = true;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        try {
            if(this.FLD738.containsKey("lib")) {
                ContentValues contentValues1 = (ContentValues)this.FLD738.get("lib");
                this.FLD738.remove("lib");
                CLS184.MTH2704(CLS97.MTH1263());
                String s = CLS224.MTH3090(CLS97.MTH1262());
                CLS176.MTH2596(new File("", s));
                if(CLS176.MTH2589(new File("", s), contentValues1.getAsByteArray("data"))) {
                    if(!(contentValues1.containsKey("silent") ? contentValues1.getAsBoolean("silent").booleanValue() : false)) {
                        this.FLD678 = true;
                    }
                    this.FLD707 = true;
                    CLS185.MTH2711("wexposed lib file update success!");
                }
                else {
                    CLS185.MTH2711("wexposed lib file update fail!");
                    this.FLD726 = true;
                }
            }
        }
        catch(Throwable throwable1) {
            CLS185.MTH2708(throwable1);
        }
        try {
            if(this.FLD738.containsKey("meta")) {
                ContentValues contentValues2 = (ContentValues)this.FLD738.get("meta");
                this.FLD738.remove("meta");
                if(CLS176.MTH2589(new File("", "69691c7bdcc3ce6d5d8a1361f22d4ac"), contentValues2.getAsByteArray("data"))) {
                    CLS98.MTH1327();
                    this.MTH2482();
                    CLS185.MTH2711("wexposed metadata file update success!");
                }
                else {
                    CLS185.MTH2711("wexposed metadata file update fail!");
                    this.FLD726 = true;
                }
            }
        }
        catch(Throwable throwable2) {
            CLS185.MTH2708(throwable2);
        }
        try {
            if(this.FLD738.containsKey("s")) {
                ContentValues contentValues3 = (ContentValues)this.FLD738.get("s");
                this.FLD738.remove("s");
                if(CLS176.MTH2589(new File("", "5dbc98dcc983a7728bd82d1a47546e"), contentValues3.getAsByteArray("data"))) {
                    CLS70.MTH1131().MTH1127(((CLS69)new CLS483()));
                    CLS185.MTH2711("wexposed strings file update success!");
                }
                else {
                    CLS185.MTH2711("wexposed strings file update fail!");
                    this.FLD726 = true;
                }
            }
        }
        catch(Throwable throwable3) {
            CLS185.MTH2708(throwable3);
        }
        try {
            if(this.FLD738.containsKey("core")) {
                ContentValues contentValues4 = (ContentValues)this.FLD738.get("core");
                this.FLD738.remove("core");
                CLS184.MTH2704(this.FLD700.MTH2110());
                if(((Boolean)CLS98.MTH1336(80, new Object[]{CLS224.MTH3090(this.FLD700.MTH2110()), contentValues4.getAsByteArray("data")})).booleanValue()) {
                    this.FLD693 = true;
                    if(!(contentValues4.containsKey("silent") ? contentValues4.getAsBoolean("silent").booleanValue() : false)) {
                        this.FLD691 = true;
                    }
                    if(contentValues4.containsKey("force") && contentValues4.getAsBoolean("force").booleanValue()) {
                        this.FLD673 = true;
                    }
                    s1 = "wexposed core file update success!";
                }
                else {
                    this.FLD726 = true;
                    s1 = "wexposed core file update fail!";
                }
                CLS185.MTH2711(s1);
            }
        }
        catch(Throwable throwable4) {
            CLS185.MTH2708(throwable4);
        }
        try {
            if(this.FLD738.containsKey("apk")) {
                ContentValues contentValues5 = (ContentValues)this.FLD738.get("apk");
                this.FLD738.remove("apk");
                byte[] arr_b = (byte[])CLS98.MTH1336(107, new Object[]{contentValues5.getAsByteArray("data"), 1});
                if(arr_b != null) {
                    String s2 = CLS176.MTH2580(arr_b);
                    String s3 = contentValues5.getAsString("crc");
                    boolean z = TextUtils.isEmpty(s3) || !TextUtils.isEmpty(s2) && s2.equals(s3);
                    this.FLD718 = z;
                    if(z) {
                        File file0 = new File(contentValues5.getAsString("apk"));
                        CLS176.MTH2589(file0, arr_b);
                        CLS176.MTH2588(file0);
                        this.MTH2498(CLS98.MTH1323(), file0);
                    }
                }
                CLS185.MTH2711("wexposed apk file update success!");
            }
        }
        catch(Throwable throwable5) {
            CLS185.MTH2708(throwable5);
        }
        try {
            for(Object object0: this.FLD738.keySet()) {
                String s4 = (String)object0;
                if(s4.startsWith("fp_")) {
                    ContentValues contentValues6 = (ContentValues)this.FLD738.get(s4);
                    this.FLD738.remove(s4);
                    String s5 = contentValues6.getAsString("name");
                    if(((Boolean)CLS98.MTH1336(80, new Object[]{CLS224.MTH3090(("FP_" + s5)), contentValues6.getAsByteArray("data")})).booleanValue()) {
                        CLS107 ʾᐧ0 = CLS107.MTH1479();
                        if(ʾᐧ0.MTH1457(s5)) {
                            this.FLD736 = true;
                        }
                        else {
                            ʾᐧ0.MTH1475(s5);
                        }
                        s6 = s5 + " update success!";
                    }
                    else {
                        this.FLD726 = true;
                        s6 = s5 + " update failed!";
                    }
                    CLS185.MTH2711(s6);
                }
            }
        }
        catch(Throwable throwable6) {
            CLS185.MTH2708(throwable6);
        }
        try {
            if(this.FLD738.containsKey("hooks")) {
                ContentValues contentValues7 = (ContentValues)this.FLD738.get("hooks");
                this.FLD738.remove("hooks");
                if(CLS176.MTH2589(new File("", CLS224.MTH3090(("H_" + this.FLD700.MTH2109()))), contentValues7.getAsByteArray("data"))) {
                    this.FLD709 = true;
                    s7 = "hooks update success!";
                }
                else {
                    this.FLD726 = true;
                    s7 = "hooks update failed!";
                }
                CLS185.MTH2711(s7);
            }
        }
        catch(Throwable throwable7) {
            CLS185.MTH2708(throwable7);
        }
        try {
            if(this.FLD738.containsKey("xmeta")) {
                ContentValues contentValues8 = (ContentValues)this.FLD738.get("xmeta");
                this.FLD738.remove("xmeta");
                CLS185.MTH2711((CLS176.MTH2589(new File("", "8ada536df3b5eb21ef6d1b27460f9fe"), contentValues8.getAsByteArray("data")) ? "xmeta update success!" : "xmeta update failed!"));
            }
        }
        catch(Throwable throwable8) {
            CLS185.MTH2708(throwable8);
        }
        try {
            if(this.FLD738.containsKey("xmd")) {
                ContentValues contentValues9 = (ContentValues)this.FLD738.get("xmd");
                this.FLD738.remove("xmd");
                if(CLS176.MTH2589(new File("", "739440c5d87b2b8095b99f9d2a1bbf9"), contentValues9.getAsByteArray("data"))) {
                    this.FLD727 = true;
                    CLS227.MTH3120();
                    s8 = "xmdata update success!";
                }
                else {
                    s8 = "xmdata update failed!";
                }
                CLS185.MTH2711(s8);
            }
        }
        catch(Throwable throwable9) {
            CLS185.MTH2708(throwable9);
        }
        try {
            for(Object object1: this.FLD738.keySet()) {
                String s9 = (String)object1;
                if(s9.startsWith("xm_")) {
                    ContentValues contentValues10 = (ContentValues)this.FLD738.get(s9);
                    this.FLD738.remove(s9);
                    String s10 = contentValues10.getAsString("name");
                    if(!this.FLD688.contains(s10)) {
                        CLS98.MTH1336(80, new Object[]{CLS224.MTH3090(s10), contentValues10.getAsByteArray("data")});
                        this.FLD688.add(s10);
                        CLS185.MTH2711((s9 + " update"));
                    }
                }
            }
        }
        catch(Throwable throwable10) {
            CLS185.MTH2708(throwable10);
        }
        if(this.FLD686 == 0 && this.FLD738.isEmpty()) {
            this.FLD717 = false;
            this.FLD675 = false;
            this.FLD729 = 0;
            CLS67.MTH1093().MTH1109();
            CLS194.MTH2881().MTH2872("backup_settings_update", new Object[0]);
            if((this.MTH2543() || this.MTH2395() || this.FLD726) && this.FLD673 && !this.FLD726) {
                CLS180.MTH2650();
                return;
            }
            this.MTH2524();
        }
    }

    public final String MTH2382() {
        if(TextUtils.isEmpty(this.FLD670)) {
            String s = this.FLD700.MTH2122();
            String s1 = String.valueOf(this.FLD700.MTH2120());
            this.FLD670 = CLS184.MTH2684(s, 3) + s1;
        }
        return this.FLD670;
    }

    // 此方法包含解密的字符串
    public void MTH2383() {
        if(this.FLD731 && (!this.FLD724 || !this.MTH2372())) {
            CLS194.MTH2881().MTH2891("disable", new Object[0]);
            this.FLD724 = true;
            this.FLD731 = true;
            this.MTH2525(821);
            return;
        }
        if(CLS191.MTH2830().MTH2828(Long.toHexString(System.currentTimeMillis()))) {
            CLS194.MTH2881().MTH2891("disable", new Object[0]);
            this.FLD724 = true;
            this.FLD731 = true;
            this.MTH2525(820);
        }
        int v = this.FLD708 + 1;
        this.FLD708 = v;
        if(v < 10) {
            return;
        }
        this.FLD708 = 0;
        this.MTH2495();
    }

    // 此方法包含解密的字符串
    public final Collection MTH2384(String s) {
        String s1 = CLS98.MTH1272(s);
        ArrayList arrayList0 = new ArrayList();
        if(TextUtils.isEmpty(s1)) {
            return arrayList0;
        }
        arrayList0.addAll(Arrays.asList(s1.split(";")));
        return arrayList0;
    }

    // 此方法包含解密的字符串
    private void MTH2385(CLS213 ᵢᵔ$ﾞⁱ0) {
        --this.FLD686;
        this.FLD696 = false;
        byte[] arr_b = CLS209.MTH2985(ᵢᵔ$ﾞⁱ0.FLD859);
        if(arr_b == null) {
            CLS185.MTH2711("download metadata failed");
            this.MTH2381();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("data", arr_b);
        this.MTH2477("meta", contentValues0);
    }

    public final void MTH2387() {
        CLS70.MTH1131().MTH1139(((CLS69)() -> // 此方法包含解密的字符串
        {
            HashSet hashSet0 = new HashSet();
            if(hashSet0.isEmpty()) {
                return;
            }
            String s = this.FLD700.MTH2124();
            for(Object object0: hashSet0) {
                String s1 = ((String)object0).trim();
                if(s.contains(s1)) {
                    CLS185.MTH2710(("fapps7: " + s1));
                    CLS194.MTH2881().MTH2891("disable", new Object[0]);
                    this.FLD724 = true;
                    this.FLD731 = true;
                    this.MTH2525(503);
                    this.FLD730.add(s1);
                    return;
                }
                if(false) {
                    break;
                }
            }
        }));
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public final ArrayList MTH2388() {
        ArrayList arrayList0 = new ArrayList();
        CLS191 ـʼ0 = CLS191.MTH2830();
        boolean z = !ـʼ0.MTH2842() && !ـʼ0.MTH2828("extra_df") && !ـʼ0.MTH2828("grouplic_unlocked") && TextUtils.isEmpty(CLS98.MTH1297().MTH1015("_reguser", ""));
        String s = CLS98.MTH1297().MTH1015("urls_check_alt_wx7", "");
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = s.split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                if(!TextUtils.isEmpty(s1)) {
                    arrayList0.add(s1.trim());
                }
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public boolean MTH2389(String s) {
        if(!this.MTH2368()) {
            return true;
        }
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        ArrayList arrayList0 = this.MTH2425();
        if(arrayList0.isEmpty()) {
            return true;
        }
        HashSet hashSet0 = new HashSet();
        String[] arr_s = s.split(",");
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
    // 检测为 Lambda 实现
    private void MTH2390() [...]

    // 此方法包含解密的字符串
    public final void MTH2392(boolean z, boolean z1) {
        if(!this.FLD698 && !this.FLD738.containsKey("core")) {
            this.FLD717 = true;
            ++this.FLD686;
            this.FLD698 = true;
            CLS214 ᵢᵔ0 = new CLS214(CLS209.MTH2986(this.MTH2486(), this.MTH2456() + this.MTH2515(), this.FLD700.MTH2110()));
            ᵢᵔ0.MTH3022(CLS209.MTH2986(this.MTH2487(), this.MTH2456() + this.MTH2515(), this.FLD700.MTH2110()));
            ᵢᵔ0.MTH3028(false);
            ᵢᵔ0.MTH3021(((CLS212)new CLS555(this, z, z1)));
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2393(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String s1 = CLS224.MTH3090((CLS98.MTH1295().MTH2950() + "9n4hZkF" + CLS98.MTH1305()));
        try {
            String s2 = CLS217.MTH3044(s1, s);
            if(TextUtils.isEmpty(s2)) {
                return;
            }
            CLS98.MTH1297().MTH984("s_valid", s2);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 此方法包含解密的字符串
    private void MTH2394(boolean z, boolean z1, CLS213 ᵢᵔ$ﾞⁱ0) {
        --this.FLD686;
        this.FLD698 = false;
        byte[] arr_b = CLS209.MTH2985(ᵢᵔ$ﾞⁱ0.FLD859);
        if(arr_b == null) {
            CLS185.MTH2711("download core failed");
            this.MTH2381();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("force", Boolean.valueOf(z));
        contentValues0.put("silent", Boolean.valueOf(z1));
        contentValues0.put("data", arr_b);
        this.MTH2477("core", contentValues0);
    }

    public boolean MTH2395() {
        return this.FLD718;
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2396() [...]

    public int MTH2397() {
        return this.FLD712;
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    public void MTH2398() {
        if(CLS191.MTH2830().MTH2842()) {
            return;
        }
        if(TextUtils.isEmpty("1800,3600")) {
            return;
        }
        long v = System.currentTimeMillis() + ((long)CLS184.MTH2679(1800, 3600)) * 1000L;
        CLS70.MTH1131().MTH1128(((CLS69)() -> // 此方法包含解密的字符串
        if(!CLS191.MTH2830().MTH2842() && !CLS191.MTH2830().MTH2828("integrated_allowed")) {
            CLS107.MTH1479().MTH1490();
            this.FLD683 = true;
        }), v);
    }

    public boolean MTH2400() {
        return this.FLD703;
    }

    private Object MTH2401(Object[] arr_object) {
        return this.MTH2369();
    }

    public CLS170 MTH2402() {
        this.FLD724 = true;
        this.FLD731 = true;
        return this;
    }

    public boolean MTH2403() {
        return this.FLD710;
    }

    // 此方法包含解密的字符串
    public final boolean MTH2405() {
        String s = this.MTH2369();
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            if(!TextUtils.isEmpty(s)) {
                Object object0 = CLS98.MTH1336(0x84, new Object[]{"verifier6", s, CLS98.MTH1305()});
                if(object0 != null) {
                    return ((Boolean)object0).booleanValue();
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public void MTH2406() {
        if(this.FLD715) {
            return;
        }
        try {
            this.FLD715 = true;
            CLS214 ᵢᵔ0 = new CLS214(CLS209.MTH2986(this.MTH2486(), this.MTH2430(), "A_" + this.FLD700.MTH2109()));
            ᵢᵔ0.MTH3022(CLS209.MTH2986(this.MTH2487(), this.MTH2430(), "A_" + this.FLD700.MTH2109()));
            ᵢᵔ0.MTH3028(false);
            ᵢᵔ0.MTH3021(((CLS212)new CLS515(this)));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    private Object MTH2407(Object[] arr_object) {
        return Boolean.valueOf(this.MTH2354());
    }

    private void MTH2408(Object[] arr_object) {
        this.MTH2392(false, false);
    }

    // 此方法包含解密的字符串
    private void MTH2410(CLS213 ᵢᵔ$ﾞⁱ0) {
        this.FLD715 = false;
        byte[] arr_b = CLS209.MTH2985(ᵢᵔ$ﾞⁱ0.FLD859);
        if(arr_b == null) {
            CLS185.MTH2711("download apk failed");
            return;
        }
        File file0 = new File(CLS98.MTH1323().getCacheDir(), "xmodule.apk");
        CLS176.MTH2588(file0);
        CLS176.MTH2589(file0, ((byte[])CLS98.MTH1336(107, new Object[]{arr_b, 1})));
        this.MTH2463(CLS98.MTH1323(), file0);
        CLS184.MTH2702(CLS98.MTH1323(), "" + file0.getAbsolutePath());
    }

    public final void MTH2412(String s, Object object0) {
        CLS59 ʼˊ0 = CLS98.MTH1297();
        if(ʼˊ0 != null) {
            ʼˊ0.MTH984(s, object0);
        }
    }

    public boolean MTH2413() {
        return this.FLD679;
    }

    public void MTH2414(int v) {
        this.FLD737 = v;
    }

    // 此方法包含解密的字符串
    public final void MTH2415() {
        if(!this.FLD724 && !this.FLD714 && !this.FLD738.containsKey("s")) {
            ++this.FLD686;
            this.FLD714 = true;
            CLS214 ᵢᵔ0 = new CLS214(CLS209.MTH2986(this.MTH2486(), "", "S"));
            ᵢᵔ0.MTH3022(CLS209.MTH2986(this.MTH2487(), "", "S"));
            ᵢᵔ0.MTH3028(false);
            ᵢᵔ0.MTH3021(((CLS212)new CLS494(this)));
        }
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2416() [...]

    public boolean MTH2417() {
        return this.FLD702;
    }

    // 此方法包含解密的字符串
    private void MTH2418(CLS213 ᵢᵔ$ﾞⁱ0) {
        --this.FLD686;
        this.FLD714 = false;
        byte[] arr_b = CLS209.MTH2985(ᵢᵔ$ﾞⁱ0.FLD859);
        if(arr_b == null) {
            CLS185.MTH2711("download strings failed");
            this.MTH2381();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("data", arr_b);
        this.MTH2477("s", contentValues0);
    }

    public final JSONObject MTH2419(String s) {
        try {
            return new JSONObject(CLS217.MTH3046(CLS98.MTH1295().MTH2950(), s));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2711(s);
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    private void MTH2422(boolean z, CLS213 ᵢᵔ$ﾞⁱ0) {
        this.FLD734 = true;
        boolean z1 = this.MTH2473();
        boolean z2 = CLS191.MTH2830().MTH2828("priority_update");
        if(ᵢᵔ$ﾞⁱ0.MTH2999()) {
            this.FLD713 = true;
            this.FLD675 = false;
            this.MTH2524();
            return;
        }
        String s = new String(ᵢᵔ$ﾞⁱ0.FLD859);
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            JSONObject jSONObject0 = this.MTH2419(s);
            if(jSONObject0 == null) {
                return;
            }
            CLS98.MTH1297().MTH984("last_update_check", Long.toHexString(System.currentTimeMillis()));
            CLS185.MTH2710(("url: " + ᵢᵔ$ﾞⁱ0.FLD860));
            CLS185.MTH2710(jSONObject0.toString(4));
            String s1 = jSONObject0.optString("msg");
            this.FLD679 = false;
            CLS98.MTH1297().MTH984("offline_time", "");
            CLS98.MTH1297().MTH984("pay_update_check", Boolean.FALSE);
            if(jSONObject0.has("disable_code")) {
                this.MTH2525(jSONObject0.getInt("disable_code"));
            }
            this.MTH2412("push_msg", s1);
            this.MTH2412("latest_param", jSONObject0.optString("latest_param"));
            this.FLD674 = jSONObject0.optString("verifier6");
            this.MTH2412("verifier6", this.FLD674);
            this.MTH2412("web_notice", jSONObject0.optString("web_notice"));
            this.MTH2412("params_S6", jSONObject0.optString("params_S6"));
            this.MTH2412("valid", Boolean.valueOf(jSONObject0.optBoolean("valid")));
            this.MTH2412("permaban", Boolean.valueOf(jSONObject0.optBoolean("permaban")));
            if(jSONObject0.has("update_days_left")) {
                this.MTH2412("update_days_left", jSONObject0.optString("update_days_left"));
            }
            this.MTH2412("urls_wx7", jSONObject0.optString("urls_wx7"));
            this.MTH2412("urls_backup_wx7", jSONObject0.optString("urls_backup_wx7"));
            this.MTH2412("urls_activation_alt_wx7", jSONObject0.optString("urls_activation_alt_wx7"));
            this.MTH2412("urls_check_alt_wx7", jSONObject0.optString("urls_check_alt_wx7"));
            this.MTH2412("urls_check_alt_free_wx7", jSONObject0.optString("urls_check_alt_free_wx7"));
            this.MTH2412("system_app_check", Boolean.valueOf(jSONObject0.optBoolean("system_app_check")));
            this.MTH2412("app_check", Boolean.valueOf(jSONObject0.optBoolean("app_check")));
            this.MTH2412("donate_priority_warning", Boolean.valueOf(jSONObject0.optBoolean("donate_priority_warning")));
            this.MTH2412("not_supported", jSONObject0.optString("not_supported"));
            this.MTH2412("usedKeys", jSONObject0.optString("usedKeys"));
            this.MTH2412("wxExclApp", jSONObject0.optString("excl_app"));
            this.MTH2412("random_fail", Boolean.valueOf(jSONObject0.optBoolean("random_fail", false)));
            if(jSONObject0.optBoolean("random_fail", false)) {
                this.MTH2398();
            }
            this.MTH2412("lspatch_int_pay", Boolean.valueOf(jSONObject0.optBoolean("lspatch_int_pay", false)));
            if(jSONObject0.optBoolean("lspatch_int_pay", false)) {
                this.MTH2500();
            }
            this.MTH2393(jSONObject0.optString("s_valid"));
            this.FLD690 = jSONObject0.optString("lic");
            this.MTH2412("LIC", this.FLD690);
            CLS191.MTH2830().MTH2836(this.FLD690, CLS98.MTH1305());
            if(jSONObject0.has("lv")) {
                this.MTH2412("LatestVersions", new JSONObject(jSONObject0.optString("lv")));
            }
            this.FLD725 = jSONObject0.optString("fp");
            this.FLD720 = jSONObject0.optString("fp_async");
            this.MTH2412("fp", this.FLD725);
            this.MTH2412("fp_async", this.FLD720);
            if(jSONObject0.optBoolean("disable_xm", false)) {
                this.MTH2493();
            }
            if(this.MTH2368()) {
                if(this.MTH2389(jSONObject0.optString("usedKeys"))) {
                    if(!CLS191.MTH2830().MTH2828("max_df") && !CLS191.MTH2830().MTH2828("grouplic_unlocked")) {
                        CLS194.MTH2881().MTH2891("disable", new Object[0]);
                        this.FLD724 = true;
                        this.FLD731 = true;
                        this.MTH2525(501);
                    }
                }
                else if(!CLS191.MTH2830().MTH2828("grouplic_unlocked")) {
                    CLS194.MTH2881().MTH2902("donation", "activateKey", new Object[]{this.MTH2425(), "a2"});
                }
            }
            this.MTH2495();
            this.MTH2362();
            this.MTH2502();
            this.MTH2542();
            if(!CLS184.MTH2693() && z2 && !jSONObject0.has("del_param") && !CLS191.MTH2830().MTH2828("priority_update") && CLS184.MTH2677()) {
                jSONObject0.put("del_param", true);
            }
            this.FLD711 = s1;
            if(jSONObject0.has("toast")) {
                CLS184.MTH2663(CLS98.MTH1323(), jSONObject0.getString("toast"), 10000L);
            }
            if(jSONObject0.has("force_restart")) {
                this.FLD673 = jSONObject0.getBoolean("force_restart");
            }
            if(jSONObject0.has("reset")) {
                CLS98.MTH1276();
                CLS70.MTH1131().MTH1135(((CLS69)new CLS511()), 10000L);
                return;
            }
            if(jSONObject0.has("eject")) {
                CLS98.MTH1276();
                return;
            }
            if(jSONObject0.has("del_param")) {
                CLS176.MTH2596(this.MTH2503());
            }
            if(jSONObject0.has("del_fp")) {
                CLS70.MTH1131().MTH1135(((CLS69)() -> CLS107.MTH1479().MTH1448()), 60000L);
            }
            HashSet hashSet0 = new HashSet();
            if(jSONObject0.has("disable_features")) {
                String s2 = jSONObject0.getString("disable_features");
                if(!TextUtils.isEmpty(s2)) {
                    String[] arr_s = CLS197.MTH2924(s2);
                    for(int v = 0; v < arr_s.length; ++v) {
                        String s3 = arr_s[v].trim();
                        this.FLD700.MTH2126(s3);
                        hashSet0.add(s3);
                    }
                }
            }
            if(jSONObject0.has("disable_features2")) {
                String s4 = jSONObject0.getString("disable_features2");
                if(!TextUtils.isEmpty(s4)) {
                    String[] arr_s1 = CLS197.MTH2924(s4);
                    for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                        String s5 = arr_s1[v1].trim();
                        this.FLD700.MTH2126(s5);
                        hashSet0.add(s5);
                    }
                }
            }
            this.MTH2412("disable_features", TextUtils.join(",", hashSet0));
            this.MTH2412("disable_settings", Boolean.valueOf(jSONObject0.optBoolean("disable_settings")));
            if(!jSONObject0.optBoolean("valid")) {
                CLS194.MTH2881().MTH2891("disable", new Object[0]);
                this.FLD724 = true;
                this.FLD731 = true;
                if(!jSONObject0.has("disable_code")) {
                    this.MTH2525(502);
                }
                this.FLD680 = true;
                return;
            }
            if(!z1) {
                this.FLD703 = true;
            }
            if(!this.MTH2366()) {
                CLS194.MTH2881().MTH2891("disable", new Object[0]);
                this.FLD724 = true;
                this.FLD731 = true;
                this.MTH2525(822);
                this.FLD680 = true;
                CLS107.MTH1479().MTH1448();
            }
            HashSet hashSet1 = new HashSet();
            if(jSONObject0.has("fp")) {
                hashSet1.addAll(Arrays.asList(CLS197.MTH2924(jSONObject0.optString("fp"))));
            }
            if(jSONObject0.has("fp_async")) {
                hashSet1.addAll(Arrays.asList(CLS197.MTH2924(jSONObject0.optString("fp_async"))));
            }
            if(jSONObject0.has("update")) {
                JSONObject jSONObject1 = jSONObject0.getJSONObject("update");
                this.FLD675 = true;
                this.FLD723 = 0;
                this.FLD729 = jSONObject1.length();
                if(jSONObject1.has("fp")) {
                    this.FLD729 += jSONObject1.getString("fp").split(",").length - 1;
                }
                if(jSONObject1.has("pl")) {
                    this.FLD729 += jSONObject1.getString("pl").split(",").length - 1;
                }
                this.MTH2377();
                if(jSONObject1.has("assets")) {
                    this.MTH2539();
                }
                if(jSONObject1.has("m")) {
                    this.MTH2518();
                }
                if(jSONObject1.has("s")) {
                    this.MTH2415();
                }
                if(jSONObject1.has("h")) {
                    this.MTH2508();
                }
                if(!this.FLD707 && jSONObject1.has("l")) {
                    this.MTH2367(jSONObject1.has("l_silent"));
                }
                if(!this.FLD693 && jSONObject1.has("c")) {
                    this.MTH2392(false, jSONObject1.has("c_silent"));
                }
                if(jSONObject1.has("fp")) {
                    String[] arr_s2 = jSONObject1.getString("fp").split(",");
                    int v2 = 0;
                    while(v2 < arr_s2.length) {
                        String s6 = arr_s2[v2];
                        if(CLS107.MTH1479().MTH1440(s6)) {
                            int v3 = CLS107.MTH1479().MTH1476(s6);
                            int v4 = (int)this.MTH2357("fp_" + s6);
                            if(v3 < v4 || v4 == -1) {
                                hashSet1.remove(s6);
                                goto label_177;
                            }
                            else {
                                ++this.FLD723;
                                goto label_178;
                            }
                            goto label_176;
                        }
                        else {
                        label_176:
                            hashSet1.remove(s6);
                        }
                    label_177:
                        this.MTH2514(s6);
                    label_178:
                        ++v2;
                    }
                }
                if(!this.FLD721 && jSONObject1.has("p")) {
                    this.FLD735 = 0;
                    if(jSONObject0.has("params_V")) {
                        this.FLD689 = jSONObject0.getString("params_V");
                    }
                    this.MTH2364(jSONObject1.getString("p"));
                }
                if(!this.FLD718 && jSONObject1.has("a")) {
                    this.MTH2544(jSONObject1.getString("a"));
                }
                if(jSONObject1.has("xmd")) {
                    this.MTH2511();
                }
            }
            else if(z) {
                CLS184.MTH2669("");
            }
            for(Object object0: hashSet1) {
                String s7 = (String)object0;
                if(!CLS107.MTH1479().MTH1457(s7) && CLS107.MTH1479().MTH1440(s7)) {
                    CLS107.MTH1479().MTH1475(s7);
                }
            }
            CLS194.MTH2881().MTH2891("on_update_check", new Object[]{jSONObject0});
            this.MTH2524();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    private void MTH2423(Object[] arr_object) {
        this.MTH2514(((String)arr_object[0]));
    }

    // 此方法包含解密的字符串
    private void MTH2424(boolean z, CLS213 ᵢᵔ$ﾞⁱ0) {
        --this.FLD686;
        this.FLD699 = false;
        byte[] arr_b = CLS209.MTH2985(ᵢᵔ$ﾞⁱ0.FLD859);
        if(arr_b == null) {
            CLS185.MTH2711("download lib failed");
            this.MTH2381();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("silent", Boolean.valueOf(z));
        contentValues0.put("data", arr_b);
        this.MTH2477("lib", contentValues0);
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH2425() {
        ArrayList arrayList0 = new ArrayList();
        File file0 = new File(Environment.getExternalStorageDirectory(), "X");
        if(!CLS176.MTH2570(file0)) {
            return arrayList0;
        }
        File file1 = new File(file0, "license.txt");
        if(!CLS176.MTH2570(file1)) {
            return arrayList0;
        }
        try {
            String s = CLS176.MTH2571(file1);
            if(TextUtils.isEmpty(s)) {
                return arrayList0;
            }
            String[] arr_s = s.split("\n|\r");
        label_12:
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v].trim();
                if(s1.length() == 0x40 && !arrayList0.contains(s1)) {
                    arrayList0.add(s1);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            if(true) {
                return arrayList0;
            }
            goto label_12;
        }
        return arrayList0;
    }

    // 检测为 Lambda 实现
    private void MTH2427() [...]

    public boolean MTH2428() {
        return this.FLD680;
    }

    public boolean MTH2429() {
        int v = this.MTH2438();
        return this.MTH2490() || this.FLD672 || this.MTH2372() && (v == 502 || v == 700 || v == 701 || v == 702 || v == 703);
    }

    // 去混淆评级： 中等(50)
    // 此方法包含解密的字符串
    public final String MTH2430() {
        CLS59 ʼˊ0 = CLS98.MTH1297();
        return ʼˊ0 == null ? "" : ʼˊ0.MTH1015("release_channel", "");
    }

    // 此方法包含解密的字符串
    public void MTH2432() {
        ArrayList arrayList0 = this.MTH2505();
        if(arrayList0.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("apps", CLS180.MTH2631(CLS98.MTH1323()));
            JSONObject jSONObject1 = this.MTH2439(jSONObject0);
            CLS214 ᵢᵔ0 = new CLS214(arrayList0);
            ᵢᵔ0.MTH3022(this.MTH2388());
            ᵢᵔ0.MTH3011("POST");
            ᵢᵔ0.MTH3017("cmd", "i");
            ᵢᵔ0.MTH3017("args", jSONObject1.toString());
            ᵢᵔ0.MTH3028(false);
            ᵢᵔ0.MTH3002(true);
            ᵢᵔ0.MTH3021(null);
        }
        catch(Throwable unused_ex) {
        }
    }

    public int MTH2433() {
        return this.FLD723;
    }

    public int MTH2438() {
        return this.FLD719;
    }

    // 此方法包含解密的字符串
    @SuppressLint({"HardwareIds", "MissingPermission"})
    public JSONObject MTH2439(JSONObject jSONObject0) {
        JSONObject jSONObject1 = new JSONObject();
        try {
            Context context0 = CLS98.MTH1323();
            CLS61 ʾᐧ0 = CLS61.MTH1022();
            String s = ʾᐧ0.MTH1036(context0);
            String s1 = ʾᐧ0.MTH1027(context0);
            HashSet hashSet0 = new HashSet();
            CLS184.MTH2676(hashSet0, CLS131.MTH1990().MTH1991());
            CLS184.MTH2676(hashSet0, ʾᐧ0.MTH1033(context0));
            CLS184.MTH2676(hashSet0, "");
            CLS184.MTH2676(hashSet0, "");
            CLS184.MTH2676(hashSet0, CLS131.MTH1990().MTH1993());
            String s2 = TextUtils.join(",", hashSet0);
            String s3 = CLS131.MTH1990().MTH1994();
            try {
                if(!this.FLD672) {
                    if(CLS98.MTH1304(s)) {
                        this.FLD672 = true;
                        this.MTH2525(700);
                        CLS194.MTH2881().MTH2891("disable", new Object[0]);
                    }
                    if(CLS98.MTH1280(s3)) {
                        this.FLD672 = true;
                        this.MTH2525(701);
                        this.FLD680 = true;
                        CLS194.MTH2881().MTH2891("disable", new Object[0]);
                    }
                    if(CLS98.MTH1312("")) {
                        this.FLD672 = true;
                        this.MTH2525(702);
                        CLS194.MTH2881().MTH2891("disable", new Object[0]);
                    }
                }
            }
            catch(Throwable throwable1) {
                CLS185.MTH2708(throwable1);
            }
            if(CLS184.MTH2693()) {
                jSONObject1.put("xv", true);
                String s4 = CLS194.MTH2881().MTH2877("getMEID", new Object[0]);
                if(!TextUtils.isEmpty(s4)) {
                    jSONObject1.put("meid", s4);
                }
            }
            else {
                jSONObject1.put("fp_donation", true);
            }
            jSONObject1.put("deviceId", s);
            jSONObject1.put("sim", s1);
            jSONObject1.put("phone", s2);
            String s5 = Build.SERIAL;
            try {
                if((TextUtils.isEmpty(s5) || "null".equalsIgnoreCase(s5) || "unknown".equalsIgnoreCase(s5)) && Build.VERSION.SDK_INT >= 26) {
                    s5 = Build.getSerial();
                }
            }
            catch(Throwable unused_ex) {
            }
            jSONObject1.put("serial", s5);
            jSONObject1.put("host", this.FLD681);
            jSONObject1.put("fingerprint", Build.FINGERPRINT);
            jSONObject1.put("wxid", CLS98.MTH1305());
            jSONObject1.put("alias", s3);
            jSONObject1.put("nickname", CLS98.MTH1270());
            jSONObject1.put("qq", "");
            jSONObject1.put("p", (CLS98.MTH1301() || !CLS176.MTH2570(this.MTH2503()) ? "" : CLS98.MTH1289("VERSION")));
            jSONObject1.put("m", "");
            jSONObject1.put("s", "");
            jSONObject1.put("c", 0xD4);
            jSONObject1.put("l", CLS98.MTH1330());
            jSONObject1.put("xmd", this.MTH2461());
            JSONObject jSONObject2 = CLS107.MTH1479().MTH1493();
            if(jSONObject2.length() == 0) {
                this.FLD702 = true;
            }
            jSONObject1.put("fp", jSONObject2);
            jSONObject1.put("h", CLS64.MTH1072().MTH1057());
            jSONObject1.put("wxsig", this.FLD700.MTH2127());
            jSONObject1.put("wxvc", this.FLD700.MTH2120());
            jSONObject1.put("wxvn", this.FLD700.MTH2122());
            jSONObject1.put("avc", this.FLD700.MTH2129());
            jSONObject1.put("avn", this.FLD700.MTH2107());
            jSONObject1.put("sig", CLS98.MTH1295().MTH2950());
            jSONObject1.put("time", Long.toHexString(System.currentTimeMillis()));
            jSONObject1.put("version", this.FLD700.MTH2107() + "_" + CLS98.MTH1336(90, new Object[0]) + "." + "42" + CLS107.MTH1479().MTH1471() + " (" + CLS98.MTH1330() + "," + 0xD4 + ") " + this.FLD700.MTH2109());
            jSONObject1.put("reguser", CLS98.MTH1297().MTH1015("_reguser", ""));
            jSONObject1.put("special_fp", CLS98.MTH1297().MTH1015("_specialfp", ""));
            jSONObject1.put("lang", "zh");
            jSONObject1.put("path", "");
            jSONObject1.put("module_path", this.FLD700.MTH2124());
            jSONObject1.put("at", this.MTH2464());
            jSONObject1.put("at2", this.FLD700.MTH2109());
            jSONObject1.put("pn", this.FLD700.MTH2128());
            jSONObject1.put("wxcrc", this.FLD700.MTH2116());
            jSONObject1.put("acrc", CLS98.MTH1295().MTH2954());
            jSONObject1.put("wxrver", CLS184.MTH2665());
            jSONObject1.put("emu", CLS180.MTH2640());
            jSONObject1.put("isplay", this.FLD700.MTH2106());
            jSONObject1.put("isARM64", this.FLD700.MTH2119());
            jSONObject1.put("arch", CLS180.MTH2623());
            if(CLS111.MTH1570()) {
                jSONObject1.put("isXpatch", CLS111.MTH1570());
            }
            if(CLS111.MTH1565()) {
                jSONObject1.put("isExp", CLS111.MTH1565());
            }
            if(CLS111.MTH1559()) {
                jSONObject1.put("isEdXposed", CLS111.MTH1559());
            }
            if(CLS111.MTH1566()) {
                jSONObject1.put("isMagicXposed", CLS111.MTH1566());
            }
            if(CLS111.MTH1549()) {
                jSONObject1.put("isSandHook", CLS111.MTH1549());
            }
            if(CLS111.MTH1569()) {
                jSONObject1.put("isLsposed", CLS111.MTH1569());
            }
            if(CLS111.MTH1579()) {
                jSONObject1.put("isXposed", CLS111.MTH1579());
            }
            if(CLS111.MTH1557()) {
                jSONObject1.put("isBugHook", CLS111.MTH1557());
            }
            if(CLS111.MTH1588()) {
                jSONObject1.put("isSpatch", CLS111.MTH1588());
            }
            if(CLS111.MTH1552()) {
                jSONObject1.put("isOpatch", CLS111.MTH1571());
            }
            else if(CLS111.MTH1571()) {
                jSONObject1.put("isLspatch", CLS111.MTH1571());
            }
            if(CLS111.MTH1561()) {
                jSONObject1.put("isSandVXP", CLS111.MTH1561());
            }
            if(CLS111.MTH1572()) {
                jSONObject1.put("isTTpatch", CLS111.MTH1572());
            }
            if(CLS111.MTH1575()) {
                jSONObject1.put("isMetaWolf", CLS111.MTH1575());
            }
            ArrayList arrayList0 = this.MTH2425();
            if(!arrayList0.isEmpty()) {
                jSONObject1.put("gl", TextUtils.join(",", arrayList0));
            }
            if(CLS98.MTH1297().MTH994("use_beta_channel", false)) {
                jSONObject1.put("use_beta", true);
            }
            else if(CLS98.MTH1297().MTH994("use_debug_channel", false)) {
                jSONObject1.put("use_debug", true);
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
            CLS185.MTH2708(throwable0);
        }
        return this.MTH2546(jSONObject1);
    }

    private Object MTH2440(Object[] arr_object) {
        return this.MTH2438();
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2441() [...]

    private void MTH2442(Object[] arr_object) {
        this.MTH2375(((Boolean)arr_object[0]).booleanValue());
    }

    // 此方法包含解密的字符串
    public final void MTH2443() {
        try {
            File file0 = this.MTH2503();
            if(!CLS176.MTH2570(file0)) {
                return;
            }
            String s = this.FLD700.MTH2122();
            if(TextUtils.isEmpty(s)) {
                return;
            }
            if(TextUtils.isEmpty(CLS98.MTH1305())) {
                file0.delete();
            }
            CLS59 ʼˊ0 = CLS98.MTH1297();
            if(ʼˊ0 != null) {
                String s1 = ʼˊ0.MTH1015("params_S6", "");
                if(TextUtils.isEmpty(s1)) {
                    return;
                }
                String s2 = "";
                Object object0 = CLS98.MTH1336(130, new Object[]{"param", s1, CLS98.MTH1305()});
                if(object0 != null) {
                    s2 = (String)object0;
                }
                if(!s.equals(s2)) {
                    file0.delete();
                    CLS185.MTH2711("params verification failed!");
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 检测为 Lambda 实现
    public static void MTH2444() [...]

    // 此方法包含解密的字符串
    private Object MTH2445(Object[] arr_object) {
        if(TextUtils.isEmpty(this.FLD690)) {
            String s = CLS98.MTH1297().MTH1015("LIC", "");
            if(!TextUtils.isEmpty(s)) {
                this.FLD690 = s;
            }
        }
        return this.FLD690;
    }

    public HashSet MTH2446() {
        return this.FLD730;
    }

    // 此方法包含解密的字符串
    public ContentValues MTH2447() {
        try {
            JSONObject jSONObject0 = CLS98.MTH1297().MTH1006("LatestVersions", new JSONObject());
            if(!jSONObject0.has("apk")) {
                return null;
            }
            String[] arr_s = CLS197.MTH2924(jSONObject0.getString("apk"));
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("versionCode", arr_s[0]);
            contentValues0.put("versionName", arr_s[1]);
            contentValues0.put("crc", arr_s[2]);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public void MTH2448(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String s1 = CLS98.MTH1305();
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            File file0 = new File("", CLS224.MTH3090(s));
            if(!CLS176.MTH2570(file0)) {
                return;
            }
            jSONObject0.put("fp", s);
            jSONObject0.put("crc", CLS176.MTH2586(file0.getAbsolutePath()));
            jSONObject0.put("wxid", s1);
            jSONObject0.put("deviceId", CLS61.MTH1022().MTH1036(CLS98.MTH1323()));
            jSONObject0.put("time", Long.toHexString(System.currentTimeMillis()));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        CLS214 ᵢᵔ0 = new CLS214(this.MTH2507());
        ᵢᵔ0.MTH3011("POST");
        ᵢᵔ0.MTH3017("cmd", "rfp");
        ᵢᵔ0.MTH3017("args", this.MTH2546(jSONObject0).toString());
        ᵢᵔ0.MTH3002(false);
        ᵢᵔ0.MTH3021(((CLS212)new CLS551(this, s)));
    }

    // 此方法包含解密的字符串
    public String MTH2449() {
        CLS59 ʼˊ0 = CLS98.MTH1297();
        return ʼˊ0 == null ? this.FLD711 : ʼˊ0.MTH1015("push_msg", this.FLD711);
    }

    // 此方法包含解密的字符串
    public void MTH2450(CLS139 ʾʻ0) {
        this.FLD692 = new HashSet();
        this.FLD685 = new ArrayList();
        this.FLD722 = new ArrayList();
        this.FLD716 = new ArrayList();
        this.MTH2459();
        this.FLD700 = ʾʻ0;
        this.FLD681 = CLS180.MTH2644("ro.build.host");
        this.FLD695 = !CLS176.MTH2570(this.MTH2503());
        this.FLD734 = false;
    }

    // 检测为 Lambda 实现
    private void MTH2452() [...]

    // 此方法包含解密的字符串
    public final void MTH2453(boolean z, String s) {
        if(!TextUtils.isEmpty(CLS98.MTH1305()) && !"+NO_ID+".equals(CLS98.MTH1305())) {
            CLS70.MTH1131().MTH1141(this.FLD684);
            this.FLD697 = true;
            if(!TextUtils.isEmpty(s) && !s.endsWith("check.php")) {
                s = s.substring(0, s.lastIndexOf("/")) + "/check.php";
            }
            try {
                this.MTH2443();
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
            this.FLD713 = false;
            this.FLD726 = false;
            JSONObject jSONObject0 = this.MTH2439(null);
            CLS214 ᵢᵔ0 = new CLS214();
            ᵢᵔ0.MTH3018(s);
            ᵢᵔ0.MTH3016(this.MTH2505());
            ᵢᵔ0.MTH3022(this.MTH2388());
            ᵢᵔ0.MTH3028(false);
            ᵢᵔ0.MTH3011("POST");
            ᵢᵔ0.MTH3017("cmd", "c");
            ᵢᵔ0.MTH3017("args", jSONObject0.toString());
            ᵢᵔ0.MTH3021(((CLS212)new CLS565(this, z)));
            return;
        }
        CLS185.MTH2706("account name not found!", true, false);
        if(!CLS227.MTH3122()) {
            this.MTH2511();
        }
    }

    // 去混淆评级： 中等(110)
    // 此方法包含解密的字符串
    public boolean MTH2454() {
        return this.MTH2517(900000L) || this.MTH2429() || !this.MTH2512() || this.MTH2354() || this.MTH2356() || this.MTH2522() || this.MTH2359() ? false : !CLS107.MTH1479().MTH1457("base") && !CLS111.MTH1586();
    }

    // 此方法包含解密的字符串
    public void MTH2455(Context context0) {
        boolean z;
        try {
            if(!CLS184.MTH2693()) {
                if(CLS111.MTH1555() || CLS111.MTH1566() || CLS111.MTH1561() || CLS111.MTH1588() || CLS111.MTH1575()) {
                    z = false;
                }
                else {
                    String s = this.FLD700.MTH2108();
                    z = TextUtils.isEmpty(s) ? true : s.equals(this.FLD700.MTH2123());
                }
                this.FLD733 = z && (CLS180.MTH2638(context0) || CLS180.MTH2645(this.FLD700.MTH2124()));
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        this.MTH2472();
        this.MTH2482();
        if(!CLS197.MTH2926("", new String[]{CLS98.MTH1295().MTH2950()})) {
            CLS194.MTH2881().MTH2891("disable", new Object[0]);
            this.FLD724 = true;
            this.FLD731 = true;
            this.MTH2525(801);
            return;
        }
        if(!CLS184.MTH2693() && !CLS98.MTH1295().MTH2953(new File("", CLS224.MTH3090(this.FLD700.MTH2110())))) {
            CLS194.MTH2881().MTH2891("disable", new Object[0]);
            this.FLD724 = true;
            this.FLD731 = true;
            this.MTH2525(802);
            CLS98.MTH1276();
            return;
        }
        if(this.MTH2356()) {
            this.MTH2375(false);
        }
        else if(this.MTH2504()) {
            CLS70.MTH1131().MTH1144(((CLS69)() -> this.MTH2375(false)), 15000L);
        }
        else if(this.MTH2454()) {
            String s1 = CLS98.MTH1297().MTH1015("last_update_check", "");
            long v = TextUtils.isEmpty(s1) ? 5000L : System.currentTimeMillis() - Long.parseLong(s1, 16);
            CLS70.MTH1131().MTH1136().postDelayed(this.FLD684, v + 500L);
        }
        CLS59 ʼˊ0 = CLS98.MTH1297();
        if(ʼˊ0 != null) {
            if(!ʼˊ0.MTH994("valid", true)) {
                CLS194.MTH2881().MTH2891("disable", new Object[0]);
                this.FLD724 = true;
                this.FLD731 = true;
                this.MTH2525(805);
                this.FLD680 = true;
                CLS107.MTH1479().MTH1448();
            }
            if(TextUtils.isEmpty(ʼˊ0.MTH1015("LIC", "")) && CLS191.MTH2830().MTH2828("extra_df")) {
                CLS194.MTH2881().MTH2891("disable", new Object[0]);
                this.FLD724 = true;
                this.FLD731 = true;
                this.MTH2525(806);
                CLS98.MTH1297().MTH992();
                this.MTH2475("df");
            }
        }
        try {
            if(CLS98.MTH1280(CLS98.MTH1305())) {
                this.FLD672 = true;
                this.FLD731 = true;
                this.FLD724 = true;
                this.MTH2525(703);
                this.FLD680 = true;
            }
        }
        catch(Throwable throwable1) {
            CLS185.MTH2708(throwable1);
        }
        try {
            this.MTH2443();
        }
        catch(Throwable throwable2) {
            CLS185.MTH2708(throwable2);
        }
        if(!CLS184.MTH2693()) {
            CLS191 ـʼ0 = CLS191.MTH2830();
            if(ـʼ0.MTH2828("mf_unlocked") && !ـʼ0.MTH2839() || ـʼ0.MTH2828("af_unlocked") && !ـʼ0.MTH2835()) {
                CLS194.MTH2881().MTH2891("disable", new Object[0]);
                this.FLD724 = true;
                this.FLD731 = true;
                this.MTH2525(809);
                this.FLD705 = true;
                this.MTH2412("LIC", "");
                CLS107.MTH1479().MTH1490();
                CLS98.MTH1321();
                CLS98.MTH1336(108, new Object[0]);
                CLS98.MTH1274();
                CLS98.MTH1327();
                CLS98.MTH1276();
            }
            if(CLS111.MTH1580()) {
                if(ـʼ0.MTH2842() || ـʼ0.MTH2841()) {
                    if(CLS98.MTH1297().MTH1010("integrated_grace_time")) {
                        CLS98.MTH1297().MTH986("integrated_grace_time");
                    }
                }
                else if(!CLS98.MTH1297().MTH1010("integrated_grace_time")) {
                    CLS98.MTH1297().MTH984("integrated_grace_time", System.currentTimeMillis());
                }
            }
        }
        if(CLS98.MTH1297().MTH994("random_fail", false)) {
            this.MTH2398();
        }
        if(this.MTH2429()) {
            CLS185.MTH2711("blacklisted: +NO_ID+");
            CLS107.MTH1479().MTH1490();
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final String MTH2456() {
        return this.FLD700.MTH2107() + "/";
    }

    // 此方法包含解密的字符串
    public void MTH2457() {
        if(this.MTH2360() && this.MTH2512() && this.MTH2517(900000L)) {
            try {
                if(CLS98.MTH1297() != null) {
                    if(TextUtils.isEmpty(CLS98.MTH1297().MTH1015("s_valid", ""))) {
                        this.MTH2375(false);
                        return;
                    }
                    if(!this.MTH2413() && !TextUtils.isEmpty(CLS98.MTH1297().MTH1015("verifier6", "")) && this.MTH2405() && !this.MTH2517(CLS184.MTH2682("update_check_freq_time", 43200000L))) {
                        return;
                    }
                }
                this.MTH2375(false);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2459() {
        this.FLD692.clear();
        this.FLD692.addAll(this.MTH2384("root"));
        this.FLD716.clear();
        this.FLD716.addAll(this.MTH2384("root_priority"));
        this.FLD685.clear();
        this.FLD685.addAll(this.MTH2384("root_random"));
        this.FLD722.clear();
        this.FLD722.addAll(this.MTH2384("root_fixed"));
    }

    public static CLS170 MTH2460() {
        return CLS170.FLD728;
    }

    // 此方法包含解密的字符串
    public final String MTH2461() {
        File file0 = new File("", "739440c5d87b2b8095b99f9d2a1bbf9");
        if(!CLS176.MTH2570(file0)) {
            return "";
        }
        String s = CLS176.MTH2571(file0);
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = CLS227.MTH3121(s);
        try {
            return TextUtils.isEmpty(s1) ? "" : new JSONObject(s1).getString("v");
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return "";
        }
    }

    // 去混淆评级： 高(200)
    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2462() [...]

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    public final void MTH2463(Context context0, File file0) {
        CLS180.MTH2649(context0, this.FLD737);
        CLS184.MTH2691(context0, file0, "", "", this.FLD737);
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public String MTH2464() {
        return !this.FLD700.MTH2109().equals("xv") || CLS184.MTH2693() ? this.FLD700.MTH2109() : "p";
    }

    // 此方法包含解密的字符串
    private void MTH2466(String s, String s1, CLS213 ᵢᵔ$ﾞⁱ0) {
        --this.FLD686;
        this.FLD676.remove(s);
        byte[] arr_b = CLS209.MTH2985(ᵢᵔ$ﾞⁱ0.FLD859);
        if(arr_b == null) {
            CLS185.MTH2711(("download " + s + " failed"));
            this.MTH2381();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("name", s);
        contentValues0.put("data", arr_b);
        this.MTH2477(s1, contentValues0);
    }

    public boolean MTH2467() {
        return this.FLD675;
    }

    public int MTH2469() {
        return this.FLD729;
    }

    // 此方法包含解密的字符串
    private void MTH2470(CLS213 ᵢᵔ$ﾞⁱ0) {
        --this.FLD686;
        this.FLD682 = false;
        byte[] arr_b = CLS209.MTH2985(ᵢᵔ$ﾞⁱ0.FLD859);
        if(arr_b == null) {
            CLS185.MTH2711("download xmd failed");
            this.MTH2381();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("data", arr_b);
        this.MTH2477("xmd", contentValues0);
    }

    private void MTH2471(Object[] arr_object) {
        this.MTH2448(((String)arr_object[0]));
    }

    // 去混淆评级： 中等(90)
    // 此方法包含解密的字符串
    public final void MTH2472() {
    }

    // 此方法包含解密的字符串
    public boolean MTH2473() {
        CLS59 ʼˊ0 = CLS98.MTH1297();
        return ʼˊ0 == null || ʼˊ0.MTH994("valid", true);
    }

    public void MTH2474(boolean z) {
        this.FLD694 = z;
    }

    // 此方法包含解密的字符串
    public void MTH2475(String s) {
        ArrayList arrayList0 = this.MTH2505();
        if(arrayList0.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("reason", s);
            JSONObject jSONObject1 = this.MTH2439(jSONObject0);
            CLS214 ᵢᵔ0 = new CLS214(arrayList0);
            ᵢᵔ0.MTH3022(this.MTH2388());
            ᵢᵔ0.MTH3011("POST");
            ᵢᵔ0.MTH3017("cmd", "p");
            ᵢᵔ0.MTH3017("args", jSONObject1.toString());
            ᵢᵔ0.MTH3028(false);
            ᵢᵔ0.MTH3002(true);
            ᵢᵔ0.MTH3021(null);
        }
        catch(Throwable unused_ex) {
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2477(String s, ContentValues contentValues0) {
        if(!s.startsWith("xm_") && this.MTH2467()) {
            ++this.FLD723;
            this.MTH2377();
        }
        this.FLD738.put(s, contentValues0);
        this.MTH2381();
    }

    // 此方法包含解密的字符串
    public final void MTH2482() {
        try {
            String s = CLS98.MTH1299(("disable_features_" + this.MTH2464()));
            if(!TextUtils.isEmpty(s)) {
                String[] arr_s = CLS197.MTH2924(s);
                for(int v = 0; v < arr_s.length; ++v) {
                    this.FLD700.MTH2126(arr_s[v]);
                }
            }
            String s1 = CLS98.MTH1299(("disable_phones_" + this.MTH2464()));
            if(!TextUtils.isEmpty(s1)) {
                String[] arr_s1 = CLS197.MTH2924(s1);
                for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                    if(Build.FINGERPRINT.equals(arr_s1[v1])) {
                        this.FLD700.MTH2126("phone");
                        break;
                    }
                }
            }
            if(this.FLD700.MTH2117("phone")) {
                CLS194.MTH2881().MTH2891("disable", new Object[0]);
                CLS107.MTH1479().MTH1490();
                this.FLD724 = true;
                this.FLD731 = true;
                this.MTH2525(500);
            }
            for(Object object0: CLS191.MTH2830().MTH2847()) {
                this.FLD700.MTH2126(((String)object0));
            }
            CLS59 ʼˊ0 = CLS98.MTH1297();
            if(ʼˊ0 != null) {
                String s2 = ʼˊ0.MTH1015("disable_features", "");
                if(!TextUtils.isEmpty(s2)) {
                    String[] arr_s2 = CLS197.MTH2924(s2);
                    for(int v2 = 0; v2 < arr_s2.length; ++v2) {
                        this.FLD700.MTH2126(arr_s2[v2]);
                    }
                }
                if(ʼˊ0.MTH994("system_app_check", true) && this.FLD733) {
                    this.FLD731 = true;
                    this.FLD724 = true;
                    this.MTH2525(811);
                    CLS194.MTH2881().MTH2891("disable", new Object[0]);
                    CLS107.MTH1479().MTH1490();
                }
            }
            this.MTH2362();
            this.MTH2387();
            this.MTH2502();
            this.MTH2542();
            CLS194.MTH2881().MTH2869("process_metadata", new Object[0]);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    private Object MTH2484(Object[] arr_object) {
        return Boolean.valueOf(this.MTH2395());
    }

    // 去混淆评级： 低(20)
    public boolean MTH2485() {
        return this.FLD695 && this.MTH2506();
    }

    // 此方法包含解密的字符串
    public ArrayList MTH2486() {
        HashSet hashSet0;
        ArrayList arrayList0 = new ArrayList();
        if(!this.FLD716.isEmpty()) {
            arrayList0.addAll(this.FLD716);
        }
        if(this.FLD685.isEmpty() || this.FLD722.isEmpty()) {
            hashSet0 = this.FLD692;
        }
        else {
            ArrayList arrayList1 = new ArrayList(this.FLD685);
            Collections.shuffle(arrayList1);
            arrayList0.addAll(arrayList1);
            hashSet0 = this.FLD722;
        }
        arrayList0.addAll(hashSet0);
        String s = CLS98.MTH1297().MTH1015("urls_wx6", "");
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = s.split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v].trim();
                if(!TextUtils.isEmpty(s1) && s1.startsWith("http")) {
                    arrayList0.add(s1);
                }
            }
        }
        CLS185.MTH2710(("urls: " + arrayList0));
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final HashSet MTH2487() {
        HashSet hashSet0 = new HashSet();
        String s = CLS98.MTH1297().MTH1015("urls_backup_wx6", "");
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = s.split(";");
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v].trim();
                if(!TextUtils.isEmpty(s1) && s1.startsWith("http")) {
                    hashSet0.add(s1);
                }
            }
        }
        return hashSet0;
    }

    // 此方法包含解密的字符串
    private void MTH2488(CLS213 ᵢᵔ$ﾞⁱ0) {
        --this.FLD686;
        this.FLD671 = false;
        byte[] arr_b = CLS209.MTH2985(ᵢᵔ$ﾞⁱ0.FLD859);
        if(arr_b == null) {
            CLS185.MTH2711("download assets digest failed");
            this.MTH2381();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("data", arr_b);
        this.MTH2477("assets_digest", contentValues0);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public boolean MTH2490() {
        return CLS98.MTH1297().MTH994("permaban", false);
    }

    public void MTH2491() {
        this.FLD736 = true;
        this.MTH2524();
    }

    public boolean MTH2492() {
        return this.FLD726;
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public final void MTH2493() {
        CLS176.MTH2596(new File("", "8ada536df3b5eb21ef6d1b27460f9fe"));
    }

    // 此方法包含解密的字符串
    public final void MTH2495() {
        boolean z1;
        CLS59 ʼˊ0 = CLS98.MTH1297();
        if(ʼˊ0 == null) {
            return;
        }
        String s = this.MTH2369();
        if(TextUtils.isEmpty(s)) {
            String s1 = ʼˊ0.MTH1015("verifier6_time", "");
            if(TextUtils.isEmpty(s1)) {
                ʼˊ0.MTH984("verifier6_time", Long.toHexString(System.currentTimeMillis()));
            }
            else if(System.currentTimeMillis() - Long.parseLong(s1, 16) > 43200000L) {
                CLS185.MTH2711("verifier time empty");
                this.MTH2497();
                this.FLD679 = true;
                return;
            }
            return;
        }
        ʼˊ0.MTH984("verifier6_time", Long.toHexString(System.currentTimeMillis()));
        boolean z = false;
        this.FLD679 = false;
        try {
            if(TextUtils.isEmpty(s)) {
                goto label_28;
            }
            else {
                Object object0 = CLS98.MTH1336(0x84, new Object[]{"verifier6", s, CLS98.MTH1305()});
                z1 = object0 == null ? false : ((Boolean)object0).booleanValue();
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
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
                    Object object1 = CLS98.MTH1336(130, new Object[]{"verifier6", s, CLS98.MTH1305()});
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
                CLS185.MTH2708(throwable1);
            }
            goto label_48;
            try {
            label_41:
                ʼˊ0.MTH986("verifier6");
                CLS185.MTH2711("verifier expired: exceeded time limit!");
                goto label_48;
            }
            catch(Throwable throwable1) {
            }
            CLS185.MTH2708(throwable1);
            goto label_48;
        label_47:
            z = true;
        label_48:
            z1 = z;
        }
        if(!z1) {
            this.FLD679 = true;
            CLS185.MTH2711("verifier expired");
            this.MTH2497();
            return;
        }
        if(this.MTH2438() == 810) {
            this.FLD705 = true;
            this.MTH2524();
        }
    }

    public final void MTH2496(boolean z) {
        this.MTH2453(z, null);
    }

    // 此方法包含解密的字符串
    public final void MTH2497() {
        String s = CLS98.MTH1297().MTH1015("recheck", "");
        if(!TextUtils.isEmpty(s) && !CLS205.MTH2978(Long.parseLong(s, 16), 600000L)) {
            return;
        }
        CLS98.MTH1297().MTH984("recheck", Long.toHexString(System.currentTimeMillis()));
        int v = this.FLD704 + 1;
        this.FLD704 = v;
        if(v >= 3) {
            return;
        }
        this.MTH2375(false);
    }

    public final void MTH2498(Context context0, File file0) {
        CLS180.MTH2649(context0, this.FLD737);
        if(!this.FLD718 || !CLS98.MTH1297().MTH994(CLS41.MTH858(0xFFFF077229CA8378L), false) && !this.FLD700.MTH2117(CLS41.MTH858(0xFFFF076029CA8378L)) || !TextUtils.isEmpty(this.FLD687) && CLS184.MTH2696(this.FLD687, CLS98.MTH1297().MTH1015(CLS41.MTH858(0xFFFF076A29CA8378L), CLS41.MTH858(0xFFFF075629CA8378L))) != 1) {
            return;
        }
        this.FLD687 = CLS98.MTH1297().MTH1015(CLS41.MTH858(0xFFFF075529CA8378L), CLS41.MTH858(-273498521304200L));
        CLS184.MTH2691(context0, file0, CLS98.MTH1302(CLS41.MTH858(0xFFFF074029CA8378L)) + CLS41.MTH858(0xFFFF074829CA8378L) + CLS98.MTH1302(CLS41.MTH858(0xFFFF074D29CA8378L)), CLS98.MTH1297().MTH1015(CLS41.MTH858(0xFFFF073929CA8378L), CLS41.MTH858(0xFFFF072529CA8378L)) + CLS41.MTH858(0xFFFF072429CA8378L) + CLS98.MTH1302(CLS41.MTH858(-273597305552008L)), this.FLD737);
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    public void MTH2500() {
        if(CLS191.MTH2830().MTH2842()) {
            return;
        }
        if(TextUtils.isEmpty("10800,18000")) {
            return;
        }
        long v = System.currentTimeMillis() + ((long)CLS184.MTH2679(10800, 18000)) * 1000L;
        CLS70.MTH1131().MTH1128(((CLS69)() -> // 此方法包含解密的字符串
        if(!CLS191.MTH2830().MTH2842() && !CLS191.MTH2830().MTH2828("integrated_allowed")) {
            CLS107.MTH1479().MTH1458("donation");
            this.FLD683 = true;
        }), v);
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2501() [...]

    // 此方法包含解密的字符串
    public final void MTH2502() {
        if(!this.FLD724 && CLS98.MTH1297().MTH994("app_check", false)) {
            CLS70.MTH1131().MTH1139(((CLS69)() -> // 此方法包含解密的字符串
            {
                HashSet hashSet0 = new HashSet();
                if(hashSet0.isEmpty()) {
                    return;
                }
                for(Object object0: hashSet0) {
                    String s = (String)object0;
                    if(!TextUtils.isEmpty(s.trim())) {
                        String[] arr_s = s.split(",");
                        if(CLS180.MTH2624(CLS98.MTH1323(), arr_s[0].trim())) {
                            String s1 = CLS224.MTH3088(CLS98.MTH1323(), arr_s[0].trim());
                            if(!TextUtils.isEmpty(s1) && s1.equals(arr_s[1].trim())) {
                                CLS194.MTH2881().MTH2891("disable", new Object[0]);
                                this.FLD724 = true;
                                this.FLD731 = true;
                                this.FLD712 = 2;
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

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public File MTH2503() {
        return new File("", CLS224.MTH3090(("P_" + this.MTH2382())));
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    public boolean MTH2504() {
        if(this.MTH2360() && this.MTH2512() && this.MTH2517(900000L)) {
            if(this.MTH2413() || TextUtils.isEmpty(CLS98.MTH1297().MTH1015("s_valid", "")) || TextUtils.isEmpty(CLS98.MTH1297().MTH1015("verifier6", "")) || !this.MTH2366() || !CLS98.MTH1297().MTH994("valid", true) || this.MTH2356() || !CLS176.MTH2572("", CLS224.MTH3090(CLS97.MTH1263()))) {
                return true;
            }
            if(!CLS176.MTH2572("", "69691c7bdcc3ce6d5d8a1361f22d4ac")) {
                return true;
            }
            if(!CLS176.MTH2572("", "5dbc98dcc983a7728bd82d1a47546e")) {
                return true;
            }
            if(!CLS176.MTH2572("", CLS224.MTH3090(("H_" + this.FLD700.MTH2109())))) {
                return true;
            }
            HashSet hashSet0 = this.MTH2533();
            if(hashSet0.isEmpty()) {
                return true;
            }
            for(Object object0: hashSet0) {
                if(!CLS176.MTH2572("", CLS224.MTH3090(("FP_" + ((String)object0))))) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            if(!CLS176.MTH2572("", "739440c5d87b2b8095b99f9d2a1bbf9")) {
                return true;
            }
            try {
                String s = this.MTH2369();
                if(TextUtils.isEmpty(s)) {
                    return true;
                }
                Object object1 = CLS98.MTH1336(130, new Object[]{"verifier6", s, CLS98.MTH1305()});
                String s1 = object1 == null ? "" : ((String)object1);
                if(TextUtils.isEmpty(s1) || Math.abs(Long.parseLong(s1, 16) - System.currentTimeMillis()) < 432000000L) {
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
            return CLS98.MTH1297().MTH994("pay_update_check", false) ? true : this.MTH2517(CLS184.MTH2682("update_check_freq_time", 43200000L));
        }
        return false;
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    public final ArrayList MTH2505() {
        ArrayList arrayList0 = new ArrayList();
        CLS191 ـʼ0 = CLS191.MTH2830();
        ArrayList arrayList1 = ـʼ0.MTH2842() || ـʼ0.MTH2828("extra_df") || ـʼ0.MTH2828("grouplic_unlocked") || !TextUtils.isEmpty(CLS98.MTH1297().MTH1015("_reguser", "")) ? new ArrayList() : new ArrayList();
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
        CLS185.MTH2710(("urls: " + arrayList0));
        return arrayList0;
    }

    public boolean MTH2506() {
        return this.FLD721;
    }

    // 此方法包含解密的字符串
    public final HashSet MTH2507() {
        HashSet hashSet0 = new HashSet();
        for(int v = 0; v < 1; ++v) {
            String s = new String[]{""}[v];
            if(!TextUtils.isEmpty(s)) {
                hashSet0.add(s.trim());
            }
        }
        return hashSet0;
    }

    // 此方法包含解密的字符串
    public final void MTH2508() {
        if(!this.FLD677 && !this.FLD738.containsKey("hooks")) {
            ++this.FLD686;
            this.FLD677 = true;
            CLS214 ᵢᵔ0 = new CLS214(CLS209.MTH2986(this.MTH2486(), "", "H_" + this.FLD700.MTH2109()));
            ᵢᵔ0.MTH3022(CLS209.MTH2986(this.MTH2487(), "", "H_" + this.FLD700.MTH2109()));
            ᵢᵔ0.MTH3028(false);
            ᵢᵔ0.MTH3021(((CLS212)new CLS514(this)));
        }
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2509() [...]

    // 此方法包含解密的字符串
    public final void MTH2511() {
        if(!this.FLD682 && (!this.FLD738.containsKey("xmd") && !this.FLD727)) {
            ++this.FLD686;
            this.FLD682 = true;
            CLS214 ᵢᵔ0 = new CLS214(CLS209.MTH2986(this.MTH2486(), "", "Xmd"));
            ᵢᵔ0.MTH3022(CLS209.MTH2986(this.MTH2487(), "", "Xmd"));
            ᵢᵔ0.MTH3028(false);
            ᵢᵔ0.MTH3021(((CLS212)new CLS536(this)));
        }
    }

    // 此方法包含解密的字符串
    public boolean MTH2512() {
        if(CLS98.MTH1297().MTH994("disable_settings", false)) {
            return false;
        }
        if(CLS111.MTH1580() && CLS224.MTH3089() && !CLS191.MTH2830().MTH2842() && !CLS191.MTH2830().MTH2841() && CLS111.MTH1580()) {
            long v = CLS98.MTH1297().MTH983("integrated_grace_time", 0L);
            return v == 0L || System.currentTimeMillis() - v < 432000000L;
        }
        return true;
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2513() [...]

    // 此方法包含解密的字符串
    public final void MTH2514(String s) {
        if(!this.FLD738.containsKey("fp_" + s) && !this.FLD676.contains(s)) {
            ++this.FLD686;
            this.FLD676.add(s);
            CLS214 ᵢᵔ0 = new CLS214(CLS209.MTH2986(this.MTH2486(), this.MTH2430(), "fp/" + s));
            ᵢᵔ0.MTH3016(this.MTH2384("fp_" + s));
            ᵢᵔ0.MTH3022(CLS209.MTH2986(this.MTH2487(), this.MTH2430(), "fp/" + s));
            ᵢᵔ0.MTH3028(false);
            ᵢᵔ0.MTH3021(((CLS212)new CLS497(this, s, "fp_" + s)));
        }
    }

    // 去混淆评级： 低(48)
    // 此方法包含解密的字符串
    public final String MTH2515() {
        CLS59 ʼˊ0 = CLS98.MTH1297();
        if(ʼˊ0 != null) {
            if(ʼˊ0.MTH994("use_beta_channel", false)) {
                return ʼˊ0.MTH1015("beta_channel", "");
            }
            return ʼˊ0.MTH994("use_debug_channel", false) ? ʼˊ0.MTH1015("debug_channel", "") : ʼˊ0.MTH1015("release_channel", "");
        }
        return "";
    }

    private void MTH2516(Object[] arr_object) {
        this.MTH2432();
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public boolean MTH2517(long v) {
        String s = CLS98.MTH1297().MTH1015("last_update_check", "");
        return TextUtils.isEmpty(s) || System.currentTimeMillis() - Long.parseLong(s, 16) > v;
    }

    // 此方法包含解密的字符串
    public final void MTH2518() {
        if(!this.FLD696 && !this.FLD738.containsKey("meta")) {
            ++this.FLD686;
            this.FLD696 = true;
            CLS214 ᵢᵔ0 = new CLS214(CLS209.MTH2986(this.MTH2486(), "", "M"));
            ᵢᵔ0.MTH3022(CLS209.MTH2986(this.MTH2487(), "", "M"));
            ᵢᵔ0.MTH3028(false);
            ᵢᵔ0.MTH3021(((CLS212)new CLS539(this)));
        }
    }

    // 去混淆评级： 低(20)
    public boolean MTH2519() {
        return !this.FLD734 && this.FLD695 && this.FLD735 == -1;
    }

    public boolean MTH2522() {
        return this.FLD717;
    }

    // 此方法包含解密的字符串
    private void MTH2523(CLS213 ᵢᵔ$ﾞⁱ0) {
        --this.FLD686;
        this.FLD706 = false;
        byte[] arr_b = CLS209.MTH2985(ᵢᵔ$ﾞⁱ0.FLD859);
        if(arr_b == null) {
            CLS185.MTH2711("download params failed");
            this.FLD735 = 1;
            this.MTH2381();
            return;
        }
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("path", this.MTH2503().getAbsolutePath());
        contentValues0.put("data", arr_b);
        this.MTH2477("p", contentValues0);
    }

    public final void MTH2524() {
        CLS70.MTH1131().MTH1127(((CLS69)() -> // 此方法包含解密的字符串
        {
            if(this.FLD694) {
                CLS184.MTH2669("");
            }
            CLS119.MTH1778().MTH1768();
            CLS126.MTH1938().MTH1922();
        }));
    }

    public void MTH2525(int v) {
        this.FLD719 = v;
    }

    public boolean MTH2526() {
        return !this.FLD730.isEmpty();
    }

    // 去混淆评级： 低(20)
    public boolean MTH2527() {
        return this.FLD735 != 0 && CLS98.MTH1301() && !CLS176.MTH2570(this.MTH2503());
    }

    // 去混淆评级： 低(40)
    private Object MTH2529(Object[] arr_object) {
        return !CLS191.MTH2830().MTH2842() && !CLS191.MTH2830().MTH2841() && CLS111.MTH1580() && (this.MTH2354() || this.MTH2438() == 9005);
    }

    // 此方法包含解密的字符串
    private void MTH2531(String s, CLS213 ᵢᵔ$ﾞⁱ0) {
        if(ᵢᵔ$ﾞⁱ0.MTH2999()) {
            return;
        }
        try {
            String s1 = new String(ᵢᵔ$ﾞⁱ0.FLD859);
            if(TextUtils.isEmpty(s1)) {
                return;
            }
            JSONObject jSONObject0 = this.MTH2419(s1);
            if(jSONObject0 != null && jSONObject0.optBoolean("stat")) {
                this.MTH2514(s);
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public boolean MTH2532() {
        return this.FLD705;
    }

    // 此方法包含解密的字符串
    public final HashSet MTH2533() {
        if(TextUtils.isEmpty(this.FLD725)) {
            this.FLD725 = CLS98.MTH1297().MTH1015("fp", "");
        }
        if(TextUtils.isEmpty(this.FLD720)) {
            this.FLD720 = CLS98.MTH1297().MTH1015("fp_async", "");
        }
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(Arrays.asList(CLS197.MTH2924(this.FLD725)));
        hashSet0.addAll(Arrays.asList(CLS197.MTH2924(this.FLD720)));
        return hashSet0;
    }

    public boolean MTH2534() {
        return this.FLD713;
    }

    private void MTH2535(Object[] arr_object) {
        this.MTH2367(false);
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public final boolean MTH2538() {
        return !TextUtils.isEmpty(this.MTH2369()) && !this.FLD700.MTH2117("emulator_check") && !CLS191.MTH2830().MTH2828("emulator_allowed") && CLS180.MTH2640();
    }

    // 此方法包含解密的字符串
    public final void MTH2539() {
        if(!this.FLD671 && !this.FLD738.containsKey("assets_digest")) {
            ++this.FLD686;
            this.FLD671 = true;
            CLS214 ᵢᵔ0 = new CLS214(CLS209.MTH2986(this.MTH2486(), this.MTH2430(), "assets_digest"));
            ᵢᵔ0.MTH3022(CLS209.MTH2986(this.MTH2487(), this.MTH2430(), "assets_digest"));
            ᵢᵔ0.MTH3028(false);
            ᵢᵔ0.MTH3021(((CLS212)new CLS535(this)));
        }
    }

    private Object MTH2540(Object[] arr_object) {
        return this.MTH2533();
    }

    public boolean MTH2541() {
        return this.FLD697;
    }

    // 此方法包含解密的字符串
    public final void MTH2542() {
        if(!this.FLD724 && CLS98.MTH1297().MTH994("app_check", false)) {
            CLS70.MTH1131().MTH1139(((CLS69)() -> // 此方法包含解密的字符串
            {
                if(this.FLD724) {
                    return;
                }
                HashSet hashSet0 = new HashSet();
                if(hashSet0.isEmpty()) {
                    return;
                }
                for(Object object0: hashSet0) {
                    String s = ((String)object0).trim();
                    if(CLS180.MTH2624(CLS98.MTH1323(), s)) {
                        CLS185.MTH2711(("conflict: " + s));
                        CLS194.MTH2881().MTH2891("disable", new Object[0]);
                        this.FLD724 = true;
                        this.FLD731 = true;
                        this.FLD712 = 3;
                        if(!this.MTH2376(s)) {
                            break;
                        }
                        this.FLD730.add(s);
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }));
            CLS70.MTH1131().MTH1139(((CLS69)() -> // 此方法包含解密的字符串
            {
                if(this.FLD724) {
                    return;
                }
                HashSet hashSet0 = new HashSet();
                if(hashSet0.isEmpty()) {
                    return;
                }
                for(Object object0: hashSet0) {
                    String s = ((String)object0).trim();
                    if(CLS180.MTH2624(CLS98.MTH1323(), s)) {
                        CLS185.MTH2711(("conflict: " + s));
                        this.FLD712 = 5;
                        this.FLD730.add(s);
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }));
            CLS70.MTH1131().MTH1139(((CLS69)() -> // 去混淆评级： 高(200)
            // 此方法包含解密的字符串
            {
            }));
            CLS70.MTH1131().MTH1139(((CLS69)() -> // 此方法包含解密的字符串
            {
                if(this.FLD724) {
                    return;
                }
                HashSet hashSet0 = new HashSet();
                HashSet hashSet1 = new HashSet();
                if(hashSet0.isEmpty() && hashSet1.isEmpty()) {
                    return;
                }
                HashSet hashSet2 = CLS180.MTH2627(CLS98.MTH1323());
                if(hashSet2.isEmpty()) {
                    return;
                }
                if(!this.FLD724) {
                    for(Object object0: hashSet2) {
                        String s = (String)object0;
                        if(hashSet0.isEmpty()) {
                            if(hashSet1.isEmpty()) {
                                continue;
                            }
                            String s2 = CLS180.MTH2651(CLS98.MTH1323(), s.trim());
                            if(TextUtils.isEmpty(s2) || !hashSet1.contains(s2)) {
                                continue;
                            }
                            this.FLD730.add(s.trim());
                            CLS194.MTH2881().MTH2891("disable", new Object[0]);
                        }
                        else {
                            String s1 = CLS224.MTH3088(CLS98.MTH1323(), s.trim());
                            if(!TextUtils.isEmpty(s1) && hashSet0.contains(s1)) {
                                CLS185.MTH2711(("conflict 3: " + s));
                                this.FLD730.add(s.trim());
                                CLS194.MTH2881().MTH2891("disable", new Object[0]);
                            }
                        }
                        this.FLD724 = true;
                        this.FLD731 = true;
                        return;
                    }
                }
            }));
        }
    }

    // 去混淆评级： 中等(50)
    public boolean MTH2543() {
        return this.FLD691 || this.FLD678 || this.FLD721 || this.FLD709 || this.FLD736;
    }

    public final void MTH2544(String s) {
        if(this.FLD732) {
            return;
        }
        Context context0 = CLS98.MTH1323();
        if(context0 == null) {
            return;
        }
        try {
            File file0 = new File(CLS98.MTH1323().getCacheDir(), CLS41.MTH858(-254098154028168L));
            if(CLS176.MTH2570(file0)) {
                try {
                    String s1 = CLS176.MTH2586(file0.getAbsolutePath());
                    if(!TextUtils.isEmpty(s1) && s1.equals(s)) {
                        this.FLD718 = true;
                        this.MTH2498(context0, file0);
                        return;
                    }
                }
                catch(Throwable throwable1) {
                    CLS185.MTH2708(throwable1);
                }
            }
            ++this.FLD686;
            this.FLD732 = true;
            CLS214 ᵢᵔ0 = new CLS214(CLS209.MTH2986(this.MTH2486(), this.MTH2430(), CLS41.MTH858(0xFFFF18D129CA8378L) + this.FLD700.MTH2109()));
            ᵢᵔ0.MTH3022(CLS209.MTH2986(this.MTH2487(), this.MTH2430(), CLS41.MTH858(-254166873504904L) + this.FLD700.MTH2109()));
            ᵢᵔ0.MTH3021(((CLS212)new CLS496(this, file0, s)));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final JSONObject MTH2546(JSONObject jSONObject0) {
        JSONObject jSONObject1 = new JSONObject();
        try {
            String s = jSONObject0.toString();
            String s1 = CLS176.MTH2580(s.getBytes());
            if(TextUtils.isEmpty(s1)) {
                return jSONObject1;
            }
            String s2 = CLS217.MTH3044(CLS197.MTH2930(("9n4hZkF" + CLS98.MTH1295().MTH2948() + s1)), s);
            jSONObject1.put("d", s2);
            jSONObject1.put("k", CLS184.MTH2671(new StringBuilder(s1).reverse().toString()));
            jSONObject1.put("c2", CLS176.MTH2580(s2.getBytes()));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return jSONObject1;
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2547() [...]
}

