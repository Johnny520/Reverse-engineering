// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

import c.ˎﹳ.CLS107;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class CLS194 {
    public final ConcurrentHashMap FLD812;
    public static final CLS194 FLD813;
    public final ConcurrentHashMap FLD814;
    public final ConcurrentHashMap FLD815;

    static {
        CLS194.FLD813 = new CLS194();
    }

    public CLS194() {
        this.FLD814 = new ConcurrentHashMap();
        this.FLD815 = new ConcurrentHashMap();
        this.FLD812 = new ConcurrentHashMap();
    }

    public CLS194 MTH2869(String s, Object[] arr_object) {
        this.MTH2887(s, arr_object);
        CLS107.MTH1479().MTH1441(s, arr_object);
        return this;
    }

    public CLS194 MTH2870(String s) {
        this.FLD814.remove(s);
        this.FLD815.remove(s);
        this.FLD812.remove(s);
        return this;
    }

    public CLS194 MTH2871(String s, Object[] arr_object) {
        this.MTH2894(s, arr_object);
        CLS107.MTH1479().MTH1482(s, arr_object);
        return this;
    }

    public CLS194 MTH2872(String s, Object[] arr_object) {
        this.MTH2896(s, arr_object);
        CLS107.MTH1479().MTH1494(s, arr_object);
        return this;
    }

    public boolean MTH2873(String s, Object[] arr_object) {
        if(this.MTH2898(s)) {
            CLS163 ˉˎ0 = (CLS163)this.FLD815.get(s);
            return ˉˎ0 == null ? CLS107.MTH1479().MTH1459(s, arr_object) : ˉˎ0.MTH2293(arr_object);
        }
        return CLS107.MTH1479().MTH1459(s, arr_object);
    }

    public ArrayList MTH2874(String s, String s1, Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        if(this.MTH2898(s1)) {
            CLS163 ˉˎ0 = (CLS163)this.FLD815.get(s1);
            if(ˉˎ0 != null) {
                arrayList0.addAll(ˉˎ0.MTH2289(arr_object));
            }
        }
        arrayList0.addAll(CLS107.MTH1479().MTH1462(s, new Object[]{s1, arr_object}));
        return arrayList0;
    }

    public CLS194 MTH2875(String s, String s1, Object[] arr_object) {
        this.MTH2896(s1, arr_object);
        CLS107.MTH1479().MTH1470(s, s1, arr_object);
        return this;
    }

    public Object MTH2876(String s, Object[] arr_object) {
        if(this.MTH2898(s)) {
            CLS163 ˉˎ0 = (CLS163)this.FLD815.get(s);
            return ˉˎ0 == null ? CLS107.MTH1479().MTH1465(s, arr_object) : ˉˎ0.MTH2291(arr_object);
        }
        return CLS107.MTH1479().MTH1465(s, arr_object);
    }

    public String MTH2877(String s, Object[] arr_object) {
        if(this.MTH2898(s)) {
            CLS163 ˉˎ0 = (CLS163)this.FLD815.get(s);
            return ˉˎ0 == null ? CLS107.MTH1479().MTH1454(s, arr_object) : ˉˎ0.MTH2288(arr_object);
        }
        return CLS107.MTH1479().MTH1454(s, arr_object);
    }

    public Object MTH2878(String s, Object[] arr_object) {
        if(this.MTH2898(s)) {
            CLS163 ˉˎ0 = (CLS163)this.FLD815.get(s);
            return ˉˎ0 == null ? CLS107.MTH1479().MTH1465(s, arr_object) : ˉˎ0.MTH2294(arr_object);
        }
        return CLS107.MTH1479().MTH1465(s, arr_object);
    }

    public int MTH2879(String s, Object[] arr_object) {
        if(this.MTH2898(s)) {
            CLS163 ˉˎ0 = (CLS163)this.FLD815.get(s);
            return ˉˎ0 == null ? CLS107.MTH1479().MTH1451(s, arr_object) : ˉˎ0.MTH2295(arr_object);
        }
        return CLS107.MTH1479().MTH1451(s, arr_object);
    }

    public CLS194 MTH2880(String s, String s1, Object[] arr_object) {
        this.MTH2887(s1, arr_object);
        CLS107.MTH1479().MTH1450(s, s1, arr_object);
        return this;
    }

    public static CLS194 MTH2881() {
        return CLS194.FLD813;
    }

    public ArrayList MTH2882(String s, Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        if(this.MTH2898(s)) {
            CLS163 ˉˎ0 = (CLS163)this.FLD815.get(s);
            if(ˉˎ0 != null) {
                arrayList0.addAll(ˉˎ0.MTH2290(arr_object));
            }
        }
        arrayList0.addAll(CLS107.MTH1479().MTH1462(s, arr_object));
        return arrayList0;
    }

    public CLS194 MTH2883(String s, String s1, Object[] arr_object) {
        this.MTH2888(s1, arr_object);
        CLS107.MTH1479().MTH1470(s, s1, arr_object);
        return this;
    }

    // 此方法包含解密的字符串
    public Object MTH2884(String s, String s1, Object[] arr_object) {
        if("core".equals(s)) {
            if(this.MTH2898(s1)) {
                CLS163 ˉˎ0 = (CLS163)this.FLD815.get(s1);
                return ˉˎ0 == null ? null : ˉˎ0.MTH2291(arr_object);
            }
            return null;
        }
        return CLS107.MTH1479().MTH1466(s, s1, arr_object);
    }

    public CLS194 MTH2885(String s, int v, Object[] arr_object) {
        if(this.MTH2890(s)) {
            CLS142 ʾˎ0 = this.MTH2901(s, v);
            if(ʾˎ0 != null) {
                ʾˎ0.MTH2140(arr_object);
            }
        }
        return this;
    }

    public CLS194 MTH2886(String s, String s1, Object[] arr_object) {
        this.MTH2894(s1, arr_object);
        CLS107.MTH1479().MTH1455(s, s1, arr_object);
        return this;
    }

    public CLS194 MTH2887(String s, Object[] arr_object) {
        if(this.MTH2904(s)) {
            ((CLS142)this.FLD814.get(s)).MTH2139(arr_object);
            return this;
        }
        if(this.FLD812.containsKey(s)) {
            ArrayList arrayList0 = (ArrayList)this.FLD812.get(s);
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    ((CLS142)object0).MTH2139(arr_object);
                }
            }
        }
        return this;
    }

    public CLS194 MTH2888(String s, Object[] arr_object) {
        if(this.MTH2904(s)) {
            ((CLS142)this.FLD814.get(s)).MTH2144(arr_object);
            return this;
        }
        if(this.FLD812.containsKey(s)) {
            ArrayList arrayList0 = (ArrayList)this.FLD812.get(s);
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    ((CLS142)object0).MTH2144(arr_object);
                }
            }
        }
        return this;
    }

    public CLS194 MTH2889(String s, int v, Object[] arr_object) {
        this.MTH2885(s, v, arr_object);
        CLS107.MTH1479().MTH1447(s, v, arr_object);
        return this;
    }

    public boolean MTH2890(String s) {
        return this.FLD812.containsKey(s);
    }

    public CLS194 MTH2891(String s, Object[] arr_object) {
        this.MTH2888(s, arr_object);
        CLS107.MTH1479().MTH1488(s, arr_object);
        return this;
    }

    // 此方法包含解密的字符串
    public CLS194 MTH2892(String s, String s1, int v, Object[] arr_object) {
        if("core".equals(s)) {
            this.MTH2885(s1, v, arr_object);
            return this;
        }
        CLS107.MTH1479().MTH1467(s, s1, v, arr_object);
        return this;
    }

    // 此方法包含解密的字符串
    public CLS194 MTH2893(String s, String s1, Object[] arr_object) {
        if("core".equals(s)) {
            this.MTH2896(s1, arr_object);
            return this;
        }
        CLS107.MTH1479().MTH1497(s, s1, arr_object);
        return this;
    }

    public CLS194 MTH2894(String s, Object[] arr_object) {
        if(this.MTH2904(s)) {
            ((CLS142)this.FLD814.get(s)).MTH2142(arr_object);
        }
        return this;
    }

    // 此方法包含解密的字符串
    public CLS194 MTH2895(String s, String s1, Object[] arr_object) {
        if("core".equals(s)) {
            this.MTH2888(s1, arr_object);
            return this;
        }
        CLS107.MTH1479().MTH1452(s, s1, arr_object);
        return this;
    }

    public CLS194 MTH2896(String s, Object[] arr_object) {
        if(this.MTH2904(s)) {
            ((CLS142)this.FLD814.get(s)).MTH2140(arr_object);
            return this;
        }
        if(this.FLD812.containsKey(s)) {
            ArrayList arrayList0 = (ArrayList)this.FLD812.get(s);
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    ((CLS142)object0).MTH2140(arr_object);
                }
            }
        }
        return this;
    }

    public CLS194 MTH2897(String s, String s1, int v, Object[] arr_object) {
        this.MTH2885(s1, v, arr_object);
        CLS107.MTH1479().MTH1474(s, s1, v, arr_object);
        return this;
    }

    public boolean MTH2898(String s) {
        return this.FLD815.containsKey(s);
    }

    // 此方法包含解密的字符串
    public CLS194 MTH2899(String s, CLS162 ˉˎ$ⁱˋ0) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(this.MTH2898(s1)) {
                ((CLS163)this.FLD815.get(s1)).MTH2292(ˉˎ$ⁱˋ0);
            }
            else {
                CLS163 ˉˎ0 = new CLS163();
                ˉˎ0.MTH2292(ˉˎ$ⁱˋ0);
                this.FLD815.put(s1, ˉˎ0);
            }
        }
        return this;
    }

    public ArrayList MTH2900(String s, Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        if(this.MTH2898(s)) {
            CLS163 ˉˎ0 = (CLS163)this.FLD815.get(s);
            if(ˉˎ0 != null) {
                arrayList0.addAll(ˉˎ0.MTH2289(arr_object));
            }
        }
        arrayList0.addAll(CLS107.MTH1479().MTH1462(s, arr_object));
        return arrayList0;
    }

    public CLS142 MTH2901(String s, int v) {
        if(!this.MTH2890(s)) {
            return null;
        }
        ArrayList arrayList0 = (ArrayList)this.FLD812.get(s);
        if(arrayList0 == null) {
            return null;
        }
        for(Object object0: arrayList0) {
            CLS142 ʾˎ0 = (CLS142)object0;
            if(ʾˎ0.MTH2145() == v) {
                return ʾˎ0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public CLS194 MTH2902(String s, String s1, Object[] arr_object) {
        if("core".equals(s)) {
            this.MTH2896(s1, arr_object);
            return this;
        }
        this.MTH2893(s, s1, arr_object);
        return this;
    }

    // 此方法包含解密的字符串
    public CLS194 MTH2903(String s, String s1, Object[] arr_object) {
        if("core".equals(s)) {
            this.MTH2894(s1, arr_object);
            return this;
        }
        CLS107.MTH1479().MTH1498(s, s1, arr_object);
        return this;
    }

    public boolean MTH2904(String s) {
        return this.FLD814.containsKey(s);
    }

    // 此方法包含解密的字符串
    public CLS194 MTH2905(String s, CLS141 ʾˎ$ⁱˋ0) {
        String[] arr_s = s.split(",");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(this.MTH2904(s1)) {
                ((CLS142)this.FLD814.get(s1)).MTH2138(ʾˎ$ⁱˋ0);
            }
            else {
                CLS142 ʾˎ0 = new CLS142();
                ʾˎ0.MTH2138(ʾˎ$ⁱˋ0);
                this.FLD814.put(s1, ʾˎ0);
            }
        }
        return this;
    }

    // 此方法包含解密的字符串
    public CLS194 MTH2906(String s, String s1, Object[] arr_object) {
        if("core".equals(s)) {
            this.MTH2887(s1, arr_object);
            return this;
        }
        CLS107.MTH1479().MTH1478(s, s1, arr_object);
        return this;
    }

    public ArrayList MTH2907(String s, String s1, Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        if(this.MTH2898(s1)) {
            CLS163 ˉˎ0 = (CLS163)this.FLD815.get(s1);
            if(ˉˎ0 != null) {
                arrayList0.addAll(ˉˎ0.MTH2290(arr_object));
            }
        }
        arrayList0.addAll(CLS107.MTH1479().MTH1481(s, s1, arr_object));
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public CLS194 MTH2908(String s, String s1, Object[] arr_object) {
        if("core".equals(s)) {
            this.MTH2888(s1, arr_object);
            return this;
        }
        this.MTH2895(s, s1, arr_object);
        return this;
    }
}

