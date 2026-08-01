// Decompiled by JEB v5.42.0.202606242140

package c.ˎﹳ;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import c.ʾˎ.CLS41;
import c.ˉˆ.CLS59;
import c.ˉˆ.CLS64;
import c.ˉˆ.CLS70.CLS69;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS98;
import c.ˏי.CLS110;
import c.ˏי.CLS111;
import c.ˏᴵ.CLS119;
import c.ˏᵎ.CLS139;
import c.ˏᵎ.CLS142.CLS141;
import c.ˏᵎ.CLS163.CLS162;
import c.ˏᵎ.CLS170;
import c.ˏᵎ.CLS176;
import c.ˏᵎ.CLS185;
import c.ˏᵎ.CLS194;
import c.ˏᵎ.CLS197;
import c.ˏᵎ.CLS224;
import com.android.xc.Wrapper.FPB;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class CLS107 {
    public final CLS59 FLD369;
    public final ConcurrentHashMap FLD370;
    public final ConcurrentHashMap FLD371;
    public final ConcurrentHashMap FLD372;
    public static final CLS107 FLD373;
    public final FPB FLD374;
    public final ConcurrentHashMap FLD375;
    public final CLS139 FLD376;

    static {
        CLS107.FLD373 = new CLS107();
    }

    // 此方法包含解密的字符串
    public CLS107() {
        this.FLD374 = new FPB();
        this.FLD376 = (CLS139)CLS70.MTH1131().MTH1147(CLS139.class);
        this.FLD369 = (CLS59)CLS70.MTH1131().MTH1147(CLS59.class);
        this.FLD371 = new ConcurrentHashMap();
        this.FLD370 = new ConcurrentHashMap();
        this.FLD372 = new ConcurrentHashMap();
        this.FLD375 = new ConcurrentHashMap();
        CLS194.MTH2881().MTH2905("unloadFeature", ((CLS141)new CLS436(this))).MTH2905("invokeOriginalMethod", ((CLS141)new CLS438())).MTH2899("invokeOriginalMethodWithReturn", ((CLS162)new CLS430())).MTH2899("findMethodBestMatch", ((CLS162)new CLS432())).MTH2899("findConstructorBestMatch", ((CLS162)new CLS431())).MTH2899("is_XC_MethodHook", ((CLS162)new CLS433()));
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public boolean MTH1440(String s) {
        return CLS176.MTH2570(new File("", CLS224.MTH3090(("FP_" + s))));
    }

    public CLS107 MTH1441(String s, Object[] arr_object) {
        if(!CLS170.MTH2460().MTH2372() && !this.FLD371.isEmpty()) {
            for(Object object0: this.FLD371.values()) {
                CLS435 ᵢʼ0 = (CLS435)object0;
                if(!this.MTH1485(ᵢʼ0.MTH1520(), s)) {
                    ᵢʼ0.MTH1518(s, arr_object);
                }
            }
        }
        return this;
    }

    public static Object MTH1442(Object[] arr_object) {
        return Boolean.valueOf(CLS111.MTH1573(arr_object[0]));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public JSONObject MTH1443() {
        return ((CLS59)CLS70.MTH1131().MTH1147(CLS59.class)).MTH1006("FPVersions_v7", new JSONObject());
    }

    public void MTH1444(String s, String s1) {
        try {
            if(!this.MTH1457(s)) {
                return;
            }
            CLS108 ˊﹶ0 = (CLS108)this.FLD371.get(s);
            if(ˊﹶ0 == null) {
                return;
            }
            ˊﹶ0.MTH1504();
            this.FLD371.remove(s);
            CLS185.MTH2711(s1);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public final boolean MTH1445(String s, String s1) {
        if(this.FLD375.containsKey(s)) {
            Set set0 = (Set)this.FLD375.get(s);
            return set0 == null || !set0.contains(s1);
        }
        return true;
    }

    public CLS107 MTH1447(String s, int v, Object[] arr_object) {
        if(!CLS170.MTH2460().MTH2372() && !this.FLD371.isEmpty()) {
            for(Object object0: this.FLD371.values()) {
                CLS435 ᵢʼ0 = (CLS435)object0;
                if(!this.MTH1445(ᵢʼ0.MTH1520(), s)) {
                    ᵢʼ0.MTH1515(s, v, arr_object);
                }
            }
        }
        return this;
    }

    // 此方法包含解密的字符串
    public void MTH1448() {
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(Arrays.asList(CLS197.MTH2924(CLS98.MTH1297().MTH1015("fp", ""))));
        hashSet0.addAll(Arrays.asList(CLS197.MTH2924(CLS98.MTH1297().MTH1015("fp_async", ""))));
        for(Object object0: hashSet0) {
            this.MTH1486(((String)object0));
        }
    }

    public static void MTH1449(Object[] arr_object) {
        CLS111.MTH1562(arr_object[0], ((Object[])arr_object[1]));
    }

    public CLS107 MTH1450(String s, String s1, Object[] arr_object) {
        if(!CLS170.MTH2460().MTH2372() && !this.FLD371.isEmpty()) {
            for(Object object0: this.FLD371.values()) {
                CLS435 ᵢʼ0 = (CLS435)object0;
                String s2 = ᵢʼ0.MTH1520();
                if(!s2.equals(s) && !this.MTH1485(s2, s1)) {
                    ᵢʼ0.MTH1518(s1, arr_object);
                }
            }
        }
        return this;
    }

    public int MTH1451(String s, Object[] arr_object) {
        Object object0 = this.MTH1465(s, arr_object);
        if(object0 == null) {
            return 0;
        }
        return object0 instanceof String ? Integer.parseInt(((String)object0)) : ((int)(((Integer)object0)));
    }

    public CLS107 MTH1452(String s, String s1, Object[] arr_object) {
        if(!CLS170.MTH2460().MTH2372() && !this.FLD371.isEmpty() && this.MTH1457(s) && !this.MTH1485(s, s1)) {
            CLS435 ᵢʼ0 = (CLS435)this.FLD371.get(s);
            if(ᵢʼ0 == null) {
                return this;
            }
            ᵢʼ0.MTH1511(s1, arr_object);
        }
        return this;
    }

    // 此方法包含解密的字符串
    public String MTH1454(String s, Object[] arr_object) {
        Object object0 = this.MTH1465(s, arr_object);
        return object0 == null ? "" : ((String)object0);
    }

    public CLS107 MTH1455(String s, String s1, Object[] arr_object) {
        if(!CLS170.MTH2460().MTH2372() && !this.FLD371.isEmpty()) {
            for(Object object0: this.FLD371.values()) {
                CLS435 ᵢʼ0 = (CLS435)object0;
                String s2 = ᵢʼ0.MTH1520();
                if(!s2.equals(s) && !this.MTH1485(s2, s1)) {
                    arr_object[0] = (int)(((int)(((Integer)arr_object[0]))) + 100);
                    ᵢʼ0.MTH1512(s1, arr_object);
                }
            }
        }
        return this;
    }

    public boolean MTH1457(String s) {
        return this.FLD371.containsKey(s);
    }

    // 此方法包含解密的字符串
    public void MTH1458(String s) {
        for(Object object0: new HashSet(this.FLD371.keySet())) {
            String s1 = (String)object0;
            if(!s1.equals(s)) {
                this.MTH1444(s1, "");
            }
        }
    }

    public boolean MTH1459(String s, Object[] arr_object) {
        Object object0 = this.MTH1465(s, arr_object);
        if(object0 == null) {
            return false;
        }
        return object0 instanceof String ? Boolean.parseBoolean(((String)object0)) : ((Boolean)object0).booleanValue();
    }

    // 此方法包含解密的字符串
    private void MTH1461(Object[] arr_object) {
        this.MTH1444(((String)arr_object[0]), (arr_object.length <= 1 ? "" : ((String)arr_object[1])));
    }

    public ArrayList MTH1462(String s, Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        if(!this.FLD371.isEmpty()) {
            for(Object object0: this.FLD371.values()) {
                CLS435 ᵢʼ0 = (CLS435)object0;
                if(!this.MTH1489(ᵢʼ0.MTH1520(), s)) {
                    ArrayList arrayList1 = ᵢʼ0.MTH1521(s, arr_object);
                    if(arrayList1 != null && !arrayList1.isEmpty()) {
                        arrayList0.addAll(arrayList1);
                    }
                }
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public String MTH1463() {
        if(this.FLD371.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("(");
        for(Object object0: this.FLD371.values()) {
            ContentValues contentValues0 = ((CLS435)object0).MTH1516();
            if(contentValues0.getAsBoolean("showVersion").booleanValue()) {
                stringBuilder0.append(contentValues0.getAsString("shortName"));
                stringBuilder0.append(contentValues0.getAsString("versionName"));
                stringBuilder0.append(",");
            }
        }
        stringBuilder0.append(")");
        int v = stringBuilder0.lastIndexOf(",");
        if(v != -1) {
            stringBuilder0.deleteCharAt(v);
        }
        return stringBuilder0.toString();
    }

    // 此方法包含解密的字符串
    public void MTH1464(String s) {
        long v;
        StringBuilder stringBuilder0;
        if(!this.MTH1457(s) && !CLS170.MTH2460().MTH2372()) {
            CLS185.MTH2711(("loading: " + s));
            boolean z = false;
            if(!this.MTH1440(s)) {
                z = true;
                stringBuilder0 = new StringBuilder();
                v = 0xFFFF60E529CA8378L;
            }
            else if(!"donation".equals(s) && CLS111.MTH1586()) {
                z = true;
                stringBuilder0 = new StringBuilder();
                v = 0xFFFF60CB29CA8378L;
            }
            if(z) {
                stringBuilder0.append(CLS41.MTH858(v));
                stringBuilder0.append(s);
                CLS185.MTH2711(stringBuilder0.toString());
                return;
            }
            if(CLS98.MTH1325(s)) {
                CLS185.MTH2711((s + ": expired, requesting update"));
                CLS194.MTH2881().MTH2896("requestFeaturePackUpdate", new Object[]{s});
            }
            try {
                Context context0 = CLS98.MTH1323();
                Context context1 = CLS98.MTH1273();
                Object object0 = this.MTH1477(s);
                if(object0 == null) {
                    CLS185.MTH2711(("loading " + s + " failed!"));
                    return;
                }
                CLS435 ᵢʼ0 = new CLS435(object0, s);
                if(ᵢʼ0.MTH1517(context1, new Object[]{this.FLD374, "", context0, this.FLD376.MTH2112(), CLS98.MTH1293(), CLS98.MTH1298(), CLS98.MTH1307(), CLS64.MTH1072().MTH1077(), CLS98.MTH1297().MTH991()})) {
                    this.MTH1487(ᵢʼ0.MTH1516());
                    this.FLD371.put(s, ᵢʼ0);
                    Set set0 = ᵢʼ0.MTH1510();
                    if(set0 != null) {
                        this.FLD370.put(s, set0);
                    }
                    Set set1 = ᵢʼ0.MTH1514();
                    if(set0 != null) {
                        this.FLD372.put(s, set1);
                    }
                    Set set2 = ᵢʼ0.MTH1513();
                    if(set0 != null) {
                        this.FLD375.put(s, set2);
                    }
                    CLS70.MTH1131().MTH1127(((CLS69)() -> CLS119.MTH1778().MTH1768()));
                    return;
                }
                CLS185.MTH2711((s + " init failed!"));
            }
            catch(Throwable throwable0) {
                CLS185.MTH2711(("loading " + s + " failed!"));
                CLS185.MTH2708(throwable0);
            }
        }
    }

    public Object MTH1465(String s, Object[] arr_object) {
        ArrayList arrayList0 = this.MTH1462(s, arr_object);
        return arrayList0.isEmpty() ? null : arrayList0.get(0);
    }

    public Object MTH1466(String s, String s1, Object[] arr_object) {
        if(!CLS170.MTH2460().MTH2372() && !this.FLD371.isEmpty() && this.MTH1457(s) && !this.MTH1489(s, s1)) {
            CLS435 ᵢʼ0 = (CLS435)this.FLD371.get(s);
            if(ᵢʼ0 != null) {
                ArrayList arrayList0 = ᵢʼ0.MTH1521(s1, arr_object);
                return arrayList0.isEmpty() ? null : arrayList0.get(0);
            }
        }
        return null;
    }

    public CLS107 MTH1467(String s, String s1, int v, Object[] arr_object) {
        if(!CLS170.MTH2460().MTH2372() && !this.FLD371.isEmpty() && this.MTH1457(s) && !this.MTH1445(s, s1)) {
            CLS435 ᵢʼ0 = (CLS435)this.FLD371.get(s);
            if(ᵢʼ0 == null) {
                return this;
            }
            ᵢʼ0.MTH1515(s1, v, arr_object);
        }
        return this;
    }

    public CLS107 MTH1468(String s, String s1, Object[] arr_object) {
        if(this.FLD371.isEmpty()) {
            return this;
        }
        for(Object object0: this.FLD371.values()) {
            CLS435 ᵢʼ0 = (CLS435)object0;
            String s2 = ᵢʼ0.MTH1520();
            if(!s2.equals(s) && !this.MTH1485(s2, s1)) {
                ᵢʼ0.MTH1511(s1, arr_object);
            }
        }
        return this;
    }

    public static Object MTH1469(Object[] arr_object) {
        return CLS111.MTH1562(arr_object[0], ((Object[])arr_object[1]));
    }

    // 去混淆评级： 低(20)
    public CLS107 MTH1470(String s, String s1, Object[] arr_object) {
        return CLS170.MTH2460().MTH2372() ? this : this.MTH1468(s, s1, arr_object);
    }

    // 此方法包含解密的字符串
    public String MTH1471() {
        if(this.FLD371.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("(");
        for(Object object0: this.FLD371.values()) {
            ContentValues contentValues0 = ((CLS435)object0).MTH1516();
            stringBuilder0.append(contentValues0.getAsString("shortName"));
            stringBuilder0.append(contentValues0.getAsString("versionName"));
            stringBuilder0.append(",");
        }
        stringBuilder0.append(")");
        int v = stringBuilder0.lastIndexOf(",");
        if(v != -1) {
            stringBuilder0.deleteCharAt(v);
        }
        return stringBuilder0.toString();
    }

    // 检测为 Lambda 实现
    private void MTH1472(String s) [...]

    public static Object MTH1473(Object[] arr_object) {
        return CLS111.MTH1558(((Class)arr_object[0]), ((Class[])arr_object[1]));
    }

    public CLS107 MTH1474(String s, String s1, int v, Object[] arr_object) {
        if(!CLS170.MTH2460().MTH2372() && !this.FLD371.isEmpty()) {
            for(Object object0: this.FLD371.values()) {
                CLS435 ᵢʼ0 = (CLS435)object0;
                String s2 = ᵢʼ0.MTH1520();
                if(!s2.equals(s) && !this.MTH1445(s2, s1)) {
                    ᵢʼ0.MTH1515(s1, v, arr_object);
                }
            }
        }
        return this;
    }

    public void MTH1475(String s) {
        CLS70.MTH1131().MTH1139(((CLS69)() -> this.MTH1464(s)));
    }

    // 此方法包含解密的字符串
    public int MTH1476(String s) {
        if(!this.MTH1457(s)) {
            try {
                return this.MTH1443().optInt(s, -1);
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
                return -1;
            }
        }
        CLS435 ᵢʼ0 = (CLS435)this.FLD371.get(s);
        return ᵢʼ0 == null ? -1 : ((int)ᵢʼ0.MTH1516().getAsInteger("versionCode"));
    }

    // 此方法包含解密的字符串
    public final Object MTH1477(String s) {
        try {
            File file0 = new File("", CLS224.MTH3090(("FP_" + s)));
            if(!CLS176.MTH2570(file0)) {
                return null;
            }
            String s1 = CLS98.MTH1297().MTH1015("FP_cls_" + s, "");
            Class class0 = TextUtils.isEmpty(s1) ? null : this.MTH1483(file0, s1);
            if(class0 == null) {
                String[] arr_s = CLS98.MTH1299(("FP_cls_" + s)).split(";");
                for(int v = 0; v < arr_s.length; ++v) {
                    class0 = this.MTH1483(file0, arr_s[v].trim());
                    if(class0 != null) {
                        break;
                    }
                }
            }
            if(class0 == null) {
                return null;
            }
            CLS98.MTH1297().MTH984("FP_cls_" + s, s1);
            return CLS110.MTH1541(class0, new Object[0]);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    public CLS107 MTH1478(String s, String s1, Object[] arr_object) {
        if(!CLS170.MTH2460().MTH2372() && !this.FLD371.isEmpty() && this.MTH1457(s) && !this.MTH1485(s, s1)) {
            CLS435 ᵢʼ0 = (CLS435)this.FLD371.get(s);
            if(ᵢʼ0 == null) {
                return this;
            }
            ᵢʼ0.MTH1518(s1, arr_object);
        }
        return this;
    }

    public static CLS107 MTH1479() {
        return CLS107.FLD373;
    }

    public static Object MTH1480(Object[] arr_object) {
        return CLS111.MTH1563(((Class)arr_object[0]), ((String)arr_object[1]), ((Class[])arr_object[2]));
    }

    public ArrayList MTH1481(String s, String s1, Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        if(!this.FLD371.isEmpty()) {
            for(Object object0: this.FLD371.values()) {
                CLS435 ᵢʼ0 = (CLS435)object0;
                String s2 = ᵢʼ0.MTH1520();
                if(!s2.equals(s) && !this.MTH1489(s2, s1)) {
                    ArrayList arrayList1 = ᵢʼ0.MTH1521(s1, arr_object);
                    if(arrayList1 != null && !arrayList1.isEmpty()) {
                        arrayList0.addAll(arrayList1);
                    }
                }
            }
        }
        return arrayList0;
    }

    public CLS107 MTH1482(String s, Object[] arr_object) {
        if(CLS170.MTH2460().MTH2372()) {
            return this;
        }
        if(this.FLD371.isEmpty()) {
            return this;
        }
        for(Object object0: this.FLD371.values()) {
            CLS435 ᵢʼ0 = (CLS435)object0;
            if(!this.MTH1485(ᵢʼ0.MTH1520(), s)) {
                arr_object[0] = (int)(((int)(((Integer)arr_object[0]))) + 100);
                ᵢʼ0.MTH1512(s, arr_object);
            }
        }
        return this;
    }

    public final Class MTH1483(File file0, String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            int v = Build.VERSION.SDK_INT < 26 ? 1 : 2;
            return (Class)CLS98.MTH1336(102, new Object[]{file0.getAbsolutePath(), v, s, CLS98.MTH1278()});
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    public final boolean MTH1485(String s, String s1) {
        if(this.FLD372.containsKey(s)) {
            Set set0 = (Set)this.FLD372.get(s);
            return set0 == null || !set0.contains(s1);
        }
        return true;
    }

    // 此方法包含解密的字符串
    public void MTH1486(String s) {
        this.MTH1444(s, null);
        CLS176.MTH2596(new File("", CLS224.MTH3090(("FP_" + s))));
    }

    // 此方法包含解密的字符串
    public final void MTH1487(ContentValues contentValues0) {
        try {
            JSONObject jSONObject0 = this.MTH1443();
            jSONObject0.put(contentValues0.getAsString("featureName"), contentValues0.getAsInteger("versionCode"));
            ((CLS59)CLS70.MTH1131().MTH1147(CLS59.class)).MTH984("FPVersions_v7", jSONObject0);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
    }

    public CLS107 MTH1488(String s, Object[] arr_object) {
        if(this.FLD371.isEmpty()) {
            return this;
        }
        for(Object object0: this.FLD371.values()) {
            CLS435 ᵢʼ0 = (CLS435)object0;
            if(!this.MTH1485(ᵢʼ0.MTH1520(), s)) {
                ᵢʼ0.MTH1511(s, arr_object);
            }
        }
        return this;
    }

    public final boolean MTH1489(String s, String s1) {
        if(this.FLD370.containsKey(s)) {
            Set set0 = (Set)this.FLD370.get(s);
            return set0 == null || !set0.contains(s1);
        }
        return true;
    }

    public void MTH1490() {
        if(this.FLD371.isEmpty()) {
            return;
        }
        for(Object object0: this.FLD371.values()) {
            CLS108 ˊﹶ0 = (CLS108)object0;
            try {
                ˊﹶ0.MTH1504();
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
        }
        this.FLD371.clear();
    }

    // 此方法包含解密的字符串
    public void MTH1492() {
        ArrayList arrayList0 = new ArrayList(Arrays.asList(CLS197.MTH2924(this.FLD369.MTH1015("fp_async", ""))));
        HashSet hashSet0 = new HashSet(arrayList0);
        if(!arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                this.MTH1475(((String)object0));
            }
        }
        String s = this.FLD369.MTH1015("fp", "");
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = CLS197.MTH2924(s);
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                if(!hashSet0.contains(s1)) {
                    this.MTH1464(s1);
                }
            }
        }
    }

    public JSONObject MTH1493() {
        try {
            JSONObject jSONObject0 = this.MTH1443();
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(!this.MTH1440(((String)object0))) {
                    iterator0.remove();
                }
            }
            return jSONObject0;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    // 去混淆评级： 低(20)
    public CLS107 MTH1494(String s, Object[] arr_object) {
        return CLS170.MTH2460().MTH2372() ? this : this.MTH1488(s, arr_object);
    }

    // 检测为 Lambda 实现
    public static void MTH1495() [...]

    // 去混淆评级： 低(20)
    public CLS107 MTH1497(String s, String s1, Object[] arr_object) {
        return CLS170.MTH2460().MTH2372() ? this : this.MTH1452(s, s1, arr_object);
    }

    public CLS107 MTH1498(String s, String s1, Object[] arr_object) {
        if(!CLS170.MTH2460().MTH2372() && !this.FLD371.isEmpty() && this.MTH1457(s) && !this.MTH1445(s, s1)) {
            CLS435 ᵢʼ0 = (CLS435)this.FLD371.get(s);
            if(ᵢʼ0 == null) {
                return this;
            }
            arr_object[0] = (int)(((int)(((Integer)arr_object[0]))) + 100);
            ᵢʼ0.MTH1512(s1, arr_object);
        }
        return this;
    }
}

