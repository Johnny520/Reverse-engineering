// Decompiled by JEB v5.42.0.202606242140

package c.ˉˆ;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import c.ˊﹶ.CLS97;
import c.ˊﹶ.CLS98;
import c.ˏᵎ.CLS139;
import c.ˏᵎ.CLS176;
import c.ˏᵎ.CLS180;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS186;
import c.ˏᵎ.CLS197;
import c.ˏᵎ.CLS215;
import c.ˏᵎ.CLS217;
import c.ˏᵎ.CLS224;
import c.ﾞʿ.CLS367;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public class CLS67 {
    public static final CLS67 FLD238;

    static {
        CLS67.FLD238 = new CLS67();
    }

    // 此方法包含解密的字符串
    public CLS67 MTH1087(Context context0) {
        try {
            HashSet hashSet0 = new HashSet();
            hashSet0.add("BACKUP");
            hashSet0.add("Assets");
            CLS367 ʾʻ0 = CLS186.MTH2747(context0, 1);
            CLS186.MTH2755(new File(context0.getExternalFilesDir(null), "WechatXposed"), ʾʻ0, hashSet0, false);
            CLS186.MTH2755(new File(context0.getFilesDir(), "WechatXposed"), ʾʻ0, hashSet0, false);
            CLS186.MTH2755(CLS215.MTH3031(context0, "WechatXposed"), ʾʻ0, hashSet0, false);
            CLS186.MTH2755(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "WechatXposed"), ʾʻ0, hashSet0, false);
            if(!CLS180.MTH2634()) {
                File file0 = CLS215.MTH3031(context0, "X");
                File file1 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "X");
                if(CLS176.MTH2570(file0) && !CLS176.MTH2576(file0, ʾʻ0)) {
                    CLS186.MTH2755(file0, ʾʻ0, hashSet0, false);
                    if(file0.canWrite()) {
                        CLS176.MTH2578(file0);
                    }
                }
                if(CLS176.MTH2570(file1) && !CLS176.MTH2576(file1, ʾʻ0)) {
                    CLS186.MTH2755(file1, ʾʻ0, hashSet0, false);
                    if(file1.canWrite()) {
                        CLS176.MTH2578(file1);
                        return this;
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return this;
    }

    public final void MTH1088() {
        CLS70.MTH1131().MTH1139(((CLS69)() -> // 此方法包含解密的字符串
        {
            File file0 = new File(CLS186.MTH2743(CLS98.MTH1323(), 1), "DisableWxid.json");
            boolean z = CLS176.MTH2570(file0);
            boolean z1 = CLS186.MTH2741(CLS98.MTH1323(), 1, "DisableWxid.json");
            if(z || z1) {
                if(!z || !z1) {
                    if(z) {
                        CLS186.MTH2725(file0, 1);
                        return;
                    }
                    CLS176.MTH2569(CLS186.MTH2744(CLS98.MTH1323(), 1, "DisableWxid.json"), file0);
                }
                else {
                    if(CLS176.MTH2586(file0.getAbsolutePath()).equals(CLS176.MTH2600(CLS186.MTH2744(CLS98.MTH1323(), 1, "DisableWxid.json")))) {
                        return;
                    }
                    long v = file0.lastModified();
                    long v1 = CLS186.MTH2737(CLS98.MTH1323(), 1, "DisableWxid.json", null);
                    if(v != v1) {
                        if(v > v1) {
                            CLS186.MTH2725(file0, 1);
                            return;
                        }
                        if(v < v1) {
                            CLS176.MTH2569(CLS186.MTH2744(CLS98.MTH1323(), 1, "DisableWxid.json"), file0);
                        }
                    }
                }
            }
        }));
    }

    public final void MTH1090(String s, String s1, String s2) {
        CLS98.MTH1336(180, new Object[]{s, s1, s2});
    }

    // 此方法包含解密的字符串
    public final String MTH1091() {
        File file0 = CLS186.MTH2754();
        if(file0 != null && file0.canWrite()) {
            File file1 = new File(file0, "3e853bc2d96793634914f7e810687305");
            if(!CLS176.MTH2570(file1)) {
                CLS176.MTH2574(file1);
            }
            return file1.getAbsolutePath();
        }
        return null;
    }

    public static CLS67 MTH1093() {
        return CLS67.FLD238;
    }

    // 此方法包含解密的字符串
    public final JSONObject MTH1095(String s) {
        File file0 = new File(s, "bf972fe6e8da8e690e684de1077983b2");
        if(CLS176.MTH2570(file0)) {
            String s1 = this.MTH1105(CLS176.MTH2571(file0));
            if(!TextUtils.isEmpty(s1)) {
                try {
                    return new JSONObject(s1);
                }
                catch(Throwable throwable0) {
                    CLS185.MTH2708(throwable0);
                }
            }
        }
        return new JSONObject();
    }

    public CLS67 MTH1096() {
        CLS70.MTH1131().MTH1139(((CLS69)() -> // 此方法包含解密的字符串
        {
            File file0 = CLS186.MTH2760(CLS98.MTH1323());
            if(!CLS176.MTH2570(file0)) {
                return;
            }
            File[] arr_file = file0.listFiles();
            if(arr_file == null) {
                return;
            }
            File file1 = CLS186.MTH2742();
            JSONObject jSONObject0 = this.MTH1095(file1.getAbsolutePath());
            for(int v = 0; v < arr_file.length; ++v) {
                File file2 = arr_file[v];
                if(file2.isFile() && file2.getName().startsWith("FKZ")) {
                    String s = file0.getName();
                    File file3 = new File(file1, CLS197.MTH2930(s));
                    if(!CLS176.MTH2570(file3) || file0.lastModified() > file3.lastModified()) {
                        this.MTH1106(file0.getAbsolutePath(), file1.getAbsolutePath(), s);
                        try {
                            JSONObject jSONObject1 = new JSONObject();
                            jSONObject1.put("name", CLS197.MTH2930(s));
                            jSONObject1.put("time", file0.lastModified());
                            jSONObject0.put(s, jSONObject1);
                        }
                        catch(Throwable throwable0) {
                            CLS185.MTH2708(throwable0);
                        }
                    }
                }
            }
            this.MTH1098(jSONObject0);
        }));
        return this;
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1097() [...]

    // 此方法包含解密的字符串
    public final void MTH1098(JSONObject jSONObject0) {
        try {
            CLS217.MTH3044(CLS197.MTH2930((CLS98.MTH1295().MTH2950() + "!@$%fK2h4nG&*(^")), jSONObject0.toString());
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public CLS67 MTH1099() {
        CLS70.MTH1131().MTH1139(((CLS69)() -> // 此方法包含解密的字符串
        {
            File file0 = CLS186.MTH2760(CLS98.MTH1323());
            File file1 = CLS186.MTH2742();
            if(file1 == null) {
                return;
            }
            if(CLS176.MTH2568(file1)) {
                return;
            }
            boolean z = false;
            Iterator iterator0 = this.MTH1095(file1.getAbsolutePath()).keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)object0;
                if(!CLS176.MTH2570(new File(file0, s))) {
                    this.MTH1090(file1.getAbsolutePath(), file0.getAbsolutePath(), s);
                    z = true;
                }
            }
            if(z) {
                CLS185.MTH2711("restore settings db");
            }
        }));
        return this;
    }

    // 此方法包含解密的字符串
    public CLS67 MTH1100() {
        try {
            String s = this.MTH1091();
            if(TextUtils.isEmpty(s)) {
                return this;
            }
            File file0 = new File(s);
            File file1 = new File("");
            if(CLS176.MTH2568(file0)) {
                return this;
            }
            CLS70.MTH1131().MTH1139(((CLS69)() -> // 此方法包含解密的字符串
            {
                Iterator iterator0 = this.MTH1095(s).keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s1 = (String)object0;
                    if(!CLS176.MTH2570(new File(file1, s1))) {
                        this.MTH1090(s, "", s1);
                    }
                }
            }));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return this;
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1101(String s, File file0) [...]

    // 此方法包含解密的字符串
    public CLS67 MTH1102() {
        if(CLS176.MTH2568(new File(""))) {
            CLS67.MTH1093().MTH1100();
            CLS185.MTH2711("restore module files");
        }
        this.MTH1096();
        this.MTH1099();
        this.MTH1088();
        return this;
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH1103() [...]

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1104(String s) [...]

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public final String MTH1105(String s) {
        return TextUtils.isEmpty(s) ? "" : CLS217.MTH3042(CLS197.MTH2930((CLS98.MTH1295().MTH2950() + "!@$%fK2h4nG&*(^")), s);
    }

    public final void MTH1106(String s, String s1, String s2) {
        CLS98.MTH1336(170, new Object[]{s, s1, s2});
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH1108() [...]

    public CLS67 MTH1109() {
        try {
            String s = this.MTH1091();
            if(TextUtils.isEmpty(s)) {
                return this;
            }
            CLS70.MTH1131().MTH1139(((CLS69)() -> // 此方法包含解密的字符串
            {
                File[] arr_file = new File("").listFiles();
                if(arr_file == null) {
                    return;
                }
                JSONObject jSONObject0 = this.MTH1095(s);
                String s1 = CLS224.MTH3090(CLS97.MTH1262());
                String s2 = CLS224.MTH3090((CLS97.MTH1263() + "_backup"));
                String s3 = CLS224.MTH3090((((CLS139)CLS70.MTH1131().MTH1147(CLS139.class)).MTH2110() + "_backup"));
                for(int v = 0; v < arr_file.length; ++v) {
                    File file0 = arr_file[v];
                    String s4 = file0.getName();
                    if(!s4.equals(s1) && !s4.equals("eda52b14c68f0393693a57a6fea5e") && !s4.contains("_backup_") && !s4.equals(s2) && !s4.equals(s3)) {
                        File file1 = new File(s, CLS197.MTH2930(s4));
                        if(!CLS176.MTH2570(file1) || file0.lastModified() > file1.lastModified()) {
                            this.MTH1106("", s, s4);
                            try {
                                JSONObject jSONObject1 = new JSONObject();
                                jSONObject1.put("name", CLS197.MTH2930(s4));
                                jSONObject1.put("time", file0.lastModified());
                                jSONObject0.put(s4, jSONObject1);
                            }
                            catch(Throwable throwable0) {
                                CLS185.MTH2708(throwable0);
                            }
                        }
                    }
                }
                this.MTH1098(jSONObject0);
            }));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return this;
    }
}

