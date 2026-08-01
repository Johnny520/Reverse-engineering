// Decompiled by JEB v5.42.0.202606242140

package c.יᴵ;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import c.ˈⁱ.CLS93;
import c.ˈⁱ.CLS95;
import c.ـˉ.CLS170;
import c.ـˉ.CLS175;
import c.ـˉ.CLS181;
import c.ـˉ.CLS198;
import c.ـˉ.CLS204;
import c.ـˉ.CLS231;
import c.ـˉ.CLS243;
import c.ـˉ.CLS257;
import c.ـˉ.CLS262;
import c.ٴˑ.CLS299;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

public class CLS148 {
    public static final CLS148 FLD695;

    static {
        CLS148.FLD695 = new CLS148();
    }

    // 此方法包含解密的字符串
    public final String MTH2648() {
        File file0 = CLS243.MTH3645();
        if(file0 != null && file0.canWrite()) {
            File file1 = new File(file0, "");
            if(!CLS262.MTH4050(file1)) {
                CLS262.MTH4057(file1);
            }
            return file1.getAbsolutePath();
        }
        return null;
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2650(String s) [...]

    // 此方法包含解密的字符串
    public final JSONObject MTH2652(String s) {
        File file0 = new File(s, "");
        if(CLS262.MTH4050(file0)) {
            String s1 = this.MTH2667(CLS262.MTH4069(file0));
            if(!TextUtils.isEmpty(s1)) {
                try {
                    return new JSONObject(s1);
                }
                catch(Throwable throwable0) {
                    CLS204.MTH3257(throwable0);
                }
            }
        }
        return new JSONObject();
    }

    // 此方法包含解密的字符串
    public final void MTH2653(JSONObject jSONObject0) {
        try {
            CLS198.MTH3215(CLS170.MTH3004((CLS95.MTH2006().MTH3014() + "\uD8E3@$%fK2h4nG&*(^")), jSONObject0.toString());
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2654() [...]

    public final void MTH2655(String s, String s1, String s2) {
        CLS95.MTH1982(180, new Object[]{s, s1, s2});
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2656() [...]

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    private void MTH2657(String s, File file0) [...]

    public final void MTH2658(String s, String s1, String s2) {
        CLS95.MTH1982(170, new Object[]{s, s1, s2});
    }

    public static CLS148 MTH2659() {
        return CLS148.FLD695;
    }

    public CLS148 MTH2660() {
        CLS144.MTH2583().MTH2589(((CLS142)() -> // 此方法包含解密的字符串
        {
            File file0 = CLS243.MTH3620(CLS95.MTH2017());
            File file1 = CLS243.MTH3612();
            if(file1 == null) {
                return;
            }
            if(CLS262.MTH4061(file1)) {
                return;
            }
            boolean z = false;
            Iterator iterator0 = this.MTH2652(file1.getAbsolutePath()).keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)object0;
                if(!CLS262.MTH4050(new File(file0, s))) {
                    this.MTH2655(file1.getAbsolutePath(), file0.getAbsolutePath(), s);
                    z = true;
                }
            }
            if(z) {
                CLS204.MTH3252("\uD8E3estore settings db");
            }
        }));
        return this;
    }

    // 此方法包含解密的字符串
    public CLS148 MTH2661() {
        try {
            String s = this.MTH2648();
            if(TextUtils.isEmpty(s)) {
                return this;
            }
            File file0 = new File(s);
            File file1 = new File("");
            if(CLS262.MTH4061(file0)) {
                return this;
            }
            CLS144.MTH2583().MTH2589(((CLS142)() -> // 此方法包含解密的字符串
            {
                Iterator iterator0 = this.MTH2652(s).keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s1 = (String)object0;
                    if(!CLS262.MTH4050(new File(file1, s1))) {
                        this.MTH2655(s, "", s1);
                    }
                }
            }));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return this;
    }

    public final void MTH2663() {
        CLS144.MTH2583().MTH2589(((CLS142)() -> // 此方法包含解密的字符串
        {
            File file0 = new File(CLS243.MTH3618(CLS95.MTH2017(), 1), "\uD8E3isableWxid.json");
            boolean z = CLS262.MTH4050(file0);
            boolean z1 = CLS243.MTH3648(CLS95.MTH2017(), 1, "\uD8E3isableWxid.json");
            if(z || z1) {
                if(!z || !z1) {
                    if(z) {
                        CLS243.MTH3633(file0, 1);
                        return;
                    }
                    CLS262.MTH4060(CLS243.MTH3615(CLS95.MTH2017(), 1, "\uD8E3isableWxid.json"), file0);
                }
                else {
                    if(CLS262.MTH4054(file0.getAbsolutePath()).equals(CLS262.MTH4051(CLS243.MTH3615(CLS95.MTH2017(), 1, "\uD8E3isableWxid.json")))) {
                        return;
                    }
                    long v = file0.lastModified();
                    long v1 = CLS243.MTH3635(CLS95.MTH2017(), 1, "\uD8E3isableWxid.json", null);
                    if(v != v1) {
                        if(v > v1) {
                            CLS243.MTH3633(file0, 1);
                            return;
                        }
                        if(v < v1) {
                            CLS262.MTH4060(CLS243.MTH3615(CLS95.MTH2017(), 1, "\uD8E3isableWxid.json"), file0);
                        }
                    }
                }
            }
        }));
    }

    // 此方法包含解密的字符串
    // 检测为 Lambda 实现
    public static void MTH2664() [...]

    public CLS148 MTH2665() {
        try {
            String s = this.MTH2648();
            if(TextUtils.isEmpty(s)) {
                return this;
            }
            CLS144.MTH2583().MTH2589(((CLS142)() -> // 此方法包含解密的字符串
            {
                File[] arr_file = new File("").listFiles();
                if(arr_file == null) {
                    return;
                }
                JSONObject jSONObject0 = this.MTH2652(s);
                String s1 = CLS181.MTH3088(CLS93.MTH1966());
                String s2 = CLS181.MTH3088((CLS93.MTH1973() + "\uD8E3backup"));
                String s3 = CLS181.MTH3088((((CLS231)CLS144.MTH2583().MTH2605(CLS231.class)).MTH3502() + "\uD8E3backup"));
                for(int v = 0; v < arr_file.length; ++v) {
                    File file0 = arr_file[v];
                    String s4 = file0.getName();
                    if(!s4.equals(s1) && !s4.equals("") && !s4.contains("\uD8E3backup_") && !s4.equals(s2) && !s4.equals(s3)) {
                        File file1 = new File(s, CLS170.MTH3004(s4));
                        if(!CLS262.MTH4050(file1) || file0.lastModified() > file1.lastModified()) {
                            this.MTH2658("", s, s4);
                            try {
                                JSONObject jSONObject1 = new JSONObject();
                                jSONObject1.put("\uD8E3ame", CLS170.MTH3004(s4));
                                jSONObject1.put("\uD8E3ime", file0.lastModified());
                                jSONObject0.put(s4, jSONObject1);
                            }
                            catch(Throwable throwable0) {
                                CLS204.MTH3257(throwable0);
                            }
                        }
                    }
                }
                this.MTH2653(jSONObject0);
            }));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return this;
    }

    // 此方法包含解密的字符串
    public CLS148 MTH2666(Context context0) {
        try {
            HashSet hashSet0 = new HashSet();
            hashSet0.add("\uD8E3ACKUP");
            hashSet0.add("\uD8E3ssets");
            CLS299 ـᵎ0 = CLS243.MTH3632(context0, 1);
            CLS243.MTH3641(new File(context0.getExternalFilesDir(null), "\uD8E3echatXposed"), ـᵎ0, hashSet0, false);
            CLS243.MTH3641(new File(context0.getFilesDir(), "\uD8E3echatXposed"), ـᵎ0, hashSet0, false);
            CLS243.MTH3641(CLS175.MTH3057(context0, "\uD8E3echatXposed"), ـᵎ0, hashSet0, false);
            CLS243.MTH3641(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "\uD8E3echatXposed"), ـᵎ0, hashSet0, false);
            if(!CLS257.MTH3721()) {
                File file0 = CLS175.MTH3057(context0, "\uD8E3");
                File file1 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "\uD8E3");
                if(CLS262.MTH4050(file0) && !CLS262.MTH4047(file0, ـᵎ0)) {
                    CLS243.MTH3641(file0, ـᵎ0, hashSet0, false);
                    if(file0.canWrite()) {
                        CLS262.MTH4067(file0);
                    }
                }
                if(CLS262.MTH4050(file1) && !CLS262.MTH4047(file1, ـᵎ0)) {
                    CLS243.MTH3641(file1, ـᵎ0, hashSet0, false);
                    if(file1.canWrite()) {
                        CLS262.MTH4067(file1);
                        return this;
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return this;
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public final String MTH2667(String s) {
        return TextUtils.isEmpty(s) ? "" : CLS198.MTH3213(CLS170.MTH3004((CLS95.MTH2006().MTH3014() + "\uD8E3@$%fK2h4nG&*(^")), s);
    }

    public CLS148 MTH2668() {
        CLS144.MTH2583().MTH2589(((CLS142)() -> // 此方法包含解密的字符串
        {
            File file0 = CLS243.MTH3620(CLS95.MTH2017());
            if(!CLS262.MTH4050(file0)) {
                return;
            }
            File[] arr_file = file0.listFiles();
            if(arr_file == null) {
                return;
            }
            File file1 = CLS243.MTH3612();
            JSONObject jSONObject0 = this.MTH2652(file1.getAbsolutePath());
            for(int v = 0; v < arr_file.length; ++v) {
                File file2 = arr_file[v];
                if(file2.isFile() && file2.getName().startsWith("\uD8E3KZ")) {
                    String s = file0.getName();
                    File file3 = new File(file1, CLS170.MTH3004(s));
                    if(!CLS262.MTH4050(file3) || file0.lastModified() > file3.lastModified()) {
                        this.MTH2658(file0.getAbsolutePath(), file1.getAbsolutePath(), s);
                        try {
                            JSONObject jSONObject1 = new JSONObject();
                            jSONObject1.put("\uD8E3ame", CLS170.MTH3004(s));
                            jSONObject1.put("\uD8E3ime", file0.lastModified());
                            jSONObject0.put(s, jSONObject1);
                        }
                        catch(Throwable throwable0) {
                            CLS204.MTH3257(throwable0);
                        }
                    }
                }
            }
            this.MTH2653(jSONObject0);
        }));
        return this;
    }

    // 此方法包含解密的字符串
    public CLS148 MTH2670() {
        if(CLS262.MTH4061(new File(""))) {
            CLS148.MTH2659().MTH2661();
            CLS204.MTH3252("\uD8E3estore module files");
        }
        this.MTH2668();
        this.MTH2660();
        this.MTH2663();
        return this;
    }
}

