// Decompiled by JEB v5.42.0.202606242140

package c.ˋˑ;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import c.ˈⁱ.CLS95;
import c.ˋʿ.CLS102;
import c.ˋʿ.CLS99;
import c.יᴵ.CLS144.CLS142;
import c.יᴵ.CLS144;
import c.יᴵ.CLS147;
import c.יᴵ.CLS156;
import c.יᵢ.CLS169;
import c.ـˉ.CLS170;
import c.ـˉ.CLS179.CLS178;
import c.ـˉ.CLS181;
import c.ـˉ.CLS204;
import c.ـˉ.CLS213;
import c.ـˉ.CLS231;
import c.ـˉ.CLS255.CLS254;
import c.ـˉ.CLS261;
import c.ـˉ.CLS262;
import com.android.xc.Wrapper.FPB;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class CLS104 {
    public final CLS231 FLD540;
    public final ConcurrentHashMap FLD541;
    public final FPB FLD542;
    public final CLS156 FLD543;
    public final ConcurrentHashMap FLD544;
    public static final CLS104 FLD545;
    public final ConcurrentHashMap FLD546;
    public final ConcurrentHashMap FLD547;

    static {
        CLS104.FLD545 = new CLS104();
    }

    // 此方法包含解密的字符串
    public CLS104() {
        this.FLD542 = new FPB();
        this.FLD540 = (CLS231)CLS144.MTH2583().MTH2605(CLS231.class);
        this.FLD543 = (CLS156)CLS144.MTH2583().MTH2605(CLS156.class);
        this.FLD547 = new ConcurrentHashMap();
        this.FLD541 = new ConcurrentHashMap();
        this.FLD546 = new ConcurrentHashMap();
        this.FLD544 = new ConcurrentHashMap();
        CLS213.MTH3304().MTH3331("\uD8E3nloadFeature", ((CLS178)new CLS618(this))).MTH3331("\uD8E3nvokeOriginalMethod", ((CLS178)new CLS616())).MTH3314("\uD8E3nvokeOriginalMethodWithReturn", ((CLS254)new CLS620())).MTH3314("\uD8E3indMethodBestMatch", ((CLS254)new CLS624())).MTH3314("\uD8E3indConstructorBestMatch", ((CLS254)new CLS617())).MTH3314("\uD8E3s_XC_MethodHook", ((CLS254)new CLS623()));
    }

    public CLS104 MTH2196(String s, Object[] arr_object) {
        if(CLS261.MTH3881().MTH4020()) {
            return this;
        }
        if(this.FLD547.isEmpty()) {
            return this;
        }
        for(Object object0: this.FLD547.values()) {
            CLS619 י0 = (CLS619)object0;
            if(!this.MTH2212(י0.MTH2265(), s)) {
                arr_object[0] = (int)(((int)(((Integer)arr_object[0]))) + 100);
                י0.MTH2258(s, arr_object);
            }
        }
        return this;
    }

    public static Object MTH2197(Object[] arr_object) {
        return CLS102.MTH2179(((Class)arr_object[0]), ((String)arr_object[1]), ((Class[])arr_object[2]));
    }

    // 此方法包含解密的字符串
    public void MTH2198() {
        ArrayList arrayList0 = new ArrayList(Arrays.asList(CLS170.MTH3005(this.FLD543.MTH2733("\uD8E3p_async", ""))));
        HashSet hashSet0 = new HashSet(arrayList0);
        if(!arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                this.MTH2251(((String)object0));
            }
        }
        String s = this.FLD543.MTH2733("\uD8E3p", "");
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = CLS170.MTH3005(s);
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                if(!hashSet0.contains(s1)) {
                    this.MTH2243(s1);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2200(ContentValues contentValues0) {
        try {
            JSONObject jSONObject0 = this.MTH2237();
            jSONObject0.put(contentValues0.getAsString("\uD8E3eatureName"), contentValues0.getAsInteger("\uD8E3ersionCode"));
            ((CLS156)CLS144.MTH2583().MTH2605(CLS156.class)).MTH2749("\uD8E3PVersions", jSONObject0);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public CLS104 MTH2201(String s, Object[] arr_object) {
        if(!CLS261.MTH3881().MTH4020() && !this.FLD547.isEmpty()) {
            for(Object object0: this.FLD547.values()) {
                CLS619 י0 = (CLS619)object0;
                if(!this.MTH2212(י0.MTH2265(), s)) {
                    י0.MTH2263(s, arr_object);
                }
            }
        }
        return this;
    }

    public CLS104 MTH2202(String s, String s1, Object[] arr_object) {
        if(this.FLD547.isEmpty()) {
            return this;
        }
        for(Object object0: this.FLD547.values()) {
            CLS619 י0 = (CLS619)object0;
            String s2 = י0.MTH2265();
            if(!s2.equals(s) && !this.MTH2212(s2, s1)) {
                י0.MTH2262(s1, arr_object);
            }
        }
        return this;
    }

    public CLS104 MTH2203(String s, String s1, Object[] arr_object) {
        if(!CLS261.MTH3881().MTH4020() && !this.FLD547.isEmpty()) {
            for(Object object0: this.FLD547.values()) {
                CLS619 י0 = (CLS619)object0;
                String s2 = י0.MTH2265();
                if(!s2.equals(s) && !this.MTH2212(s2, s1)) {
                    arr_object[0] = (int)(((int)(((Integer)arr_object[0]))) + 100);
                    י0.MTH2258(s1, arr_object);
                }
            }
        }
        return this;
    }

    // 此方法包含解密的字符串
    public final Object MTH2204(String s) {
        try {
            File file0 = new File("", CLS181.MTH3088(("\uD8E3P_" + s)));
            if(!CLS262.MTH4050(file0)) {
                return null;
            }
            String s1 = CLS95.MTH2031().MTH2733("\uD8E3P_cls_" + s, "");
            Class class0 = TextUtils.isEmpty(s1) ? null : this.MTH2227(file0, s1);
            if(class0 == null) {
                String[] arr_s = CLS95.MTH2022(("\uD8E3P_cls_" + s)).split("\uD8E3");
                for(int v = 0; v < arr_s.length; ++v) {
                    class0 = this.MTH2227(file0, arr_s[v].trim());
                    if(class0 != null) {
                        break;
                    }
                }
            }
            if(class0 == null) {
                return null;
            }
            CLS95.MTH2031().MTH2749("\uD8E3P_cls_" + s, s1);
            return CLS99.MTH2086(class0, new Object[0]);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    public CLS104 MTH2205(String s, String s1, Object[] arr_object) {
        if(!CLS261.MTH3881().MTH4020() && !this.FLD547.isEmpty()) {
            for(Object object0: this.FLD547.values()) {
                CLS619 י0 = (CLS619)object0;
                String s2 = י0.MTH2265();
                if(!s2.equals(s) && !this.MTH2212(s2, s1)) {
                    י0.MTH2263(s1, arr_object);
                }
            }
        }
        return this;
    }

    public CLS104 MTH2206(String s, int v, Object[] arr_object) {
        if(!CLS261.MTH3881().MTH4020() && !this.FLD547.isEmpty()) {
            for(Object object0: this.FLD547.values()) {
                CLS619 י0 = (CLS619)object0;
                if(!this.MTH2210(י0.MTH2265(), s)) {
                    י0.MTH2261(s, v, arr_object);
                }
            }
        }
        return this;
    }

    public int MTH2207(String s, Object[] arr_object) {
        Object object0 = this.MTH2232(s, arr_object);
        if(object0 == null) {
            return 0;
        }
        return object0 instanceof String ? Integer.parseInt(((String)object0)) : ((int)(((Integer)object0)));
    }

    public ArrayList MTH2209(String s, String s1, Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        if(!this.FLD547.isEmpty()) {
            for(Object object0: this.FLD547.values()) {
                CLS619 י0 = (CLS619)object0;
                String s2 = י0.MTH2265();
                if(!s2.equals(s) && !this.MTH2231(s2, s1)) {
                    ArrayList arrayList1 = י0.MTH2257(s1, arr_object);
                    if(arrayList1 != null && !arrayList1.isEmpty()) {
                        arrayList0.addAll(arrayList1);
                    }
                }
            }
        }
        return arrayList0;
    }

    public final boolean MTH2210(String s, String s1) {
        if(this.FLD544.containsKey(s)) {
            Set set0 = (Set)this.FLD544.get(s);
            return set0 == null || !set0.contains(s1);
        }
        return true;
    }

    public final boolean MTH2212(String s, String s1) {
        if(this.FLD546.containsKey(s)) {
            Set set0 = (Set)this.FLD546.get(s);
            return set0 == null || !set0.contains(s1);
        }
        return true;
    }

    // 此方法包含解密的字符串
    private void MTH2213(Object[] arr_object) {
        this.MTH2233(((String)arr_object[0]), (arr_object.length <= 1 ? "" : ((String)arr_object[1])));
    }

    public static Object MTH2214(Object[] arr_object) {
        return CLS102.MTH2157(arr_object[0], ((Object[])arr_object[1]));
    }

    public boolean MTH2215(String s, Object[] arr_object) {
        Object object0 = this.MTH2232(s, arr_object);
        if(object0 == null) {
            return false;
        }
        return object0 instanceof String ? Boolean.parseBoolean(((String)object0)) : ((Boolean)object0).booleanValue();
    }

    public static Object MTH2216(Object[] arr_object) {
        return CLS102.MTH2152(((Class)arr_object[0]), ((Class[])arr_object[1]));
    }

    public boolean MTH2217(String s) {
        return this.FLD547.containsKey(s);
    }

    // 此方法包含解密的字符串
    public String MTH2218() {
        if(this.FLD547.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\uD8E3");
        for(Object object0: this.FLD547.values()) {
            ContentValues contentValues0 = ((CLS619)object0).MTH2267();
            if(contentValues0.getAsBoolean("\uD8E3howVersion").booleanValue()) {
                stringBuilder0.append(contentValues0.getAsString("\uD8E3hortName"));
                stringBuilder0.append(contentValues0.getAsString("\uD8E3ersionName"));
                stringBuilder0.append("\uD8E3");
            }
        }
        stringBuilder0.append("\uD8E3");
        int v = stringBuilder0.lastIndexOf("\uD8E3");
        if(v != -1) {
            stringBuilder0.deleteCharAt(v);
        }
        return stringBuilder0.toString();
    }

    public ArrayList MTH2219(String s, Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        if(!this.FLD547.isEmpty()) {
            for(Object object0: this.FLD547.values()) {
                CLS619 י0 = (CLS619)object0;
                if(!this.MTH2231(י0.MTH2265(), s)) {
                    ArrayList arrayList1 = י0.MTH2257(s, arr_object);
                    if(arrayList1 != null && !arrayList1.isEmpty()) {
                        arrayList0.addAll(arrayList1);
                    }
                }
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public void MTH2220() {
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(Arrays.asList(CLS170.MTH3005(CLS95.MTH2031().MTH2733("\uD8E3p", ""))));
        hashSet0.addAll(Arrays.asList(CLS170.MTH3005(CLS95.MTH2031().MTH2733("\uD8E3p_async", ""))));
        for(Object object0: hashSet0) {
            this.MTH2229(((String)object0));
        }
    }

    public JSONObject MTH2221() {
        try {
            JSONObject jSONObject0 = this.MTH2237();
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(!this.MTH2240(((String)object0))) {
                    iterator0.remove();
                }
            }
            return jSONObject0;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    // 检测为 Lambda 实现
    private void MTH2222(String s) [...]

    public CLS104 MTH2223(String s, String s1, int v, Object[] arr_object) {
        if(!CLS261.MTH3881().MTH4020() && !this.FLD547.isEmpty()) {
            for(Object object0: this.FLD547.values()) {
                CLS619 י0 = (CLS619)object0;
                String s2 = י0.MTH2265();
                if(!s2.equals(s) && !this.MTH2210(s2, s1)) {
                    י0.MTH2261(s1, v, arr_object);
                }
            }
        }
        return this;
    }

    // 检测为 Lambda 实现
    public static void MTH2224() [...]

    public void MTH2225() {
        if(this.FLD547.isEmpty()) {
            return;
        }
        for(Object object0: this.FLD547.values()) {
            CLS103 ˈⁱ0 = (CLS103)object0;
            try {
                ˈⁱ0.MTH2193();
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
        }
        this.FLD547.clear();
    }

    // 此方法包含解密的字符串
    public String MTH2226() {
        if(this.FLD547.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("\uD8E3");
        for(Object object0: this.FLD547.values()) {
            ContentValues contentValues0 = ((CLS619)object0).MTH2267();
            stringBuilder0.append(contentValues0.getAsString("\uD8E3hortName"));
            stringBuilder0.append(contentValues0.getAsString("\uD8E3ersionName"));
            stringBuilder0.append("\uD8E3");
        }
        stringBuilder0.append("\uD8E3");
        int v = stringBuilder0.lastIndexOf("\uD8E3");
        if(v != -1) {
            stringBuilder0.deleteCharAt(v);
        }
        return stringBuilder0.toString();
    }

    public final Class MTH2227(File file0, String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            int v = Build.VERSION.SDK_INT < 26 ? 1 : 2;
            return (Class)CLS95.MTH1982(102, new Object[]{file0.getAbsolutePath(), v, s, CLS95.MTH2007()});
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    // 去混淆评级： 低(20)
    public CLS104 MTH2228(String s, String s1, Object[] arr_object) {
        return CLS261.MTH3881().MTH4020() ? this : this.MTH2202(s, s1, arr_object);
    }

    // 此方法包含解密的字符串
    public void MTH2229(String s) {
        this.MTH2233(s, null);
        CLS262.MTH4065(new File("", CLS181.MTH3088(("\uD8E3P_" + s))));
    }

    // 此方法包含解密的字符串
    public String MTH2230(String s, Object[] arr_object) {
        Object object0 = this.MTH2232(s, arr_object);
        return object0 == null ? "" : ((String)object0);
    }

    public final boolean MTH2231(String s, String s1) {
        if(this.FLD541.containsKey(s)) {
            Set set0 = (Set)this.FLD541.get(s);
            return set0 == null || !set0.contains(s1);
        }
        return true;
    }

    public Object MTH2232(String s, Object[] arr_object) {
        ArrayList arrayList0 = this.MTH2219(s, arr_object);
        return arrayList0.isEmpty() ? null : arrayList0.get(0);
    }

    public void MTH2233(String s, String s1) {
        try {
            if(!this.MTH2217(s)) {
                return;
            }
            CLS103 ˈⁱ0 = (CLS103)this.FLD547.get(s);
            if(ˈⁱ0 == null) {
                return;
            }
            ˈⁱ0.MTH2193();
            this.FLD547.remove(s);
            CLS204.MTH3252(s1);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
    }

    public Object MTH2234(String s, String s1, Object[] arr_object) {
        if(!CLS261.MTH3881().MTH4020() && !this.FLD547.isEmpty() && this.MTH2217(s) && !this.MTH2231(s, s1)) {
            CLS619 י0 = (CLS619)this.FLD547.get(s);
            if(י0 != null) {
                ArrayList arrayList0 = י0.MTH2257(s1, arr_object);
                return arrayList0.isEmpty() ? null : arrayList0.get(0);
            }
        }
        return null;
    }

    public CLS104 MTH2236(String s, String s1, Object[] arr_object) {
        if(!CLS261.MTH3881().MTH4020() && !this.FLD547.isEmpty() && this.MTH2217(s) && !this.MTH2210(s, s1)) {
            CLS619 י0 = (CLS619)this.FLD547.get(s);
            if(י0 == null) {
                return this;
            }
            arr_object[0] = (int)(((int)(((Integer)arr_object[0]))) + 100);
            י0.MTH2258(s1, arr_object);
        }
        return this;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public JSONObject MTH2237() {
        return ((CLS156)CLS144.MTH2583().MTH2605(CLS156.class)).MTH2750("\uD8E3PVersions", new JSONObject());
    }

    public static CLS104 MTH2238() {
        return CLS104.FLD545;
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public boolean MTH2240(String s) {
        return CLS262.MTH4050(new File("", CLS181.MTH3088(("\uD8E3P_" + s))));
    }

    // 去混淆评级： 低(20)
    public CLS104 MTH2242(String s, String s1, Object[] arr_object) {
        return CLS261.MTH3881().MTH4020() ? this : this.MTH2246(s, s1, arr_object);
    }

    // 此方法包含解密的字符串
    public void MTH2243(String s) {
        if(!CLS261.MTH3881().MTH4020() && !this.MTH2217(s) && this.MTH2240(s) && ("\uD8E3onation".equals(s) || !CLS102.MTH2163())) {
            if(CLS95.MTH2032(s)) {
                CLS213.MTH3304().MTH3321("\uD8E3equestFeaturePackUpdate", new Object[]{s});
                return;
            }
            try {
                Context context0 = CLS95.MTH2017();
                Context context1 = CLS95.MTH2025();
                Object object0 = this.MTH2204(s);
                if(object0 == null) {
                    CLS204.MTH3252(("\uD8E3oading " + s + "\uD8E3failed!"));
                    return;
                }
                CLS619 י0 = new CLS619(object0, s);
                if(י0.MTH2266(context1, new Object[]{this.FLD542, "", context0, this.FLD540.MTH3523(), CLS95.MTH1999(), CLS95.MTH2020(), CLS95.MTH2002(), CLS147.MTH2641().MTH2639(), CLS95.MTH2031().MTH2736()})) {
                    this.MTH2200(י0.MTH2267());
                    this.FLD547.put(s, י0);
                    Set set0 = י0.MTH2264();
                    if(set0 != null) {
                        this.FLD541.put(s, set0);
                    }
                    Set set1 = י0.MTH2268();
                    if(set0 != null) {
                        this.FLD546.put(s, set1);
                    }
                    Set set2 = י0.MTH2259();
                    if(set0 != null) {
                        this.FLD544.put(s, set2);
                    }
                    CLS144.MTH2583().MTH2604(((CLS142)() -> CLS169.MTH2922().MTH2918()));
                    return;
                }
                CLS204.MTH3252((s + "\uD8E3init failed!"));
            }
            catch(Throwable throwable0) {
                CLS204.MTH3252(("\uD8E3oading " + s + "\uD8E3failed!"));
                CLS204.MTH3257(throwable0);
            }
        }
    }

    public CLS104 MTH2244(String s, Object[] arr_object) {
        if(this.FLD547.isEmpty()) {
            return this;
        }
        for(Object object0: this.FLD547.values()) {
            CLS619 י0 = (CLS619)object0;
            if(!this.MTH2212(י0.MTH2265(), s)) {
                י0.MTH2262(s, arr_object);
            }
        }
        return this;
    }

    public CLS104 MTH2246(String s, String s1, Object[] arr_object) {
        if(!CLS261.MTH3881().MTH4020() && !this.FLD547.isEmpty() && this.MTH2217(s) && !this.MTH2212(s, s1)) {
            CLS619 י0 = (CLS619)this.FLD547.get(s);
            if(י0 == null) {
                return this;
            }
            י0.MTH2262(s1, arr_object);
        }
        return this;
    }

    // 此方法包含解密的字符串
    public void MTH2247(String s) {
        for(Object object0: new HashSet(this.FLD547.keySet())) {
            String s1 = (String)object0;
            if(!s1.equals(s)) {
                this.MTH2233(s1, "");
            }
        }
    }

    public static void MTH2249(Object[] arr_object) {
        CLS102.MTH2157(arr_object[0], ((Object[])arr_object[1]));
    }

    public static Object MTH2250(Object[] arr_object) {
        return Boolean.valueOf(CLS102.MTH2158(arr_object[0]));
    }

    public void MTH2251(String s) {
        CLS144.MTH2583().MTH2589(((CLS142)() -> this.MTH2243(s)));
    }

    public CLS104 MTH2252(String s, String s1, int v, Object[] arr_object) {
        if(!CLS261.MTH3881().MTH4020() && !this.FLD547.isEmpty() && this.MTH2217(s) && !this.MTH2210(s, s1)) {
            CLS619 י0 = (CLS619)this.FLD547.get(s);
            if(י0 == null) {
                return this;
            }
            י0.MTH2261(s1, v, arr_object);
        }
        return this;
    }

    // 去混淆评级： 低(20)
    public CLS104 MTH2253(String s, Object[] arr_object) {
        return CLS261.MTH3881().MTH4020() ? this : this.MTH2244(s, arr_object);
    }

    public CLS104 MTH2254(String s, String s1, Object[] arr_object) {
        if(!CLS261.MTH3881().MTH4020() && !this.FLD547.isEmpty() && this.MTH2217(s) && !this.MTH2212(s, s1)) {
            CLS619 י0 = (CLS619)this.FLD547.get(s);
            if(י0 == null) {
                return this;
            }
            י0.MTH2263(s1, arr_object);
        }
        return this;
    }

    // 此方法包含解密的字符串
    public int MTH2255(String s) {
        if(!this.MTH2217(s)) {
            try {
                return this.MTH2237().optInt(s, -1);
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
                return -1;
            }
        }
        CLS619 י0 = (CLS619)this.FLD547.get(s);
        return י0 == null ? -1 : ((int)י0.MTH2267().getAsInteger("\uD8E3ersionCode"));
    }
}

