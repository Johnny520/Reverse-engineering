// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import c.ˋˑ.CLS104;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class CLS213 {
    public final ConcurrentHashMap FLD973;
    public final ConcurrentHashMap FLD974;
    public final ConcurrentHashMap FLD975;
    public static final CLS213 FLD976;

    static {
        CLS213.FLD976 = new CLS213();
    }

    public CLS213() {
        this.FLD974 = new ConcurrentHashMap();
        this.FLD973 = new ConcurrentHashMap();
        this.FLD975 = new ConcurrentHashMap();
    }

    public CLS213 MTH3293(String s, String s1, int v, Object[] arr_object) {
        this.MTH3307(s1, v, arr_object);
        CLS104.MTH2238().MTH2223(s, s1, v, arr_object);
        return this;
    }

    // 此方法包含解密的字符串
    public CLS213 MTH3294(String s, String s1, Object[] arr_object) {
        if("\uD8E3ore".equals(s)) {
            this.MTH3332(s1, arr_object);
            return this;
        }
        CLS104.MTH2238().MTH2236(s, s1, arr_object);
        return this;
    }

    // 此方法包含解密的字符串
    public CLS213 MTH3295(String s, String s1, Object[] arr_object) {
        if("\uD8E3ore".equals(s)) {
            this.MTH3318(s1, arr_object);
            return this;
        }
        this.MTH3297(s, s1, arr_object);
        return this;
    }

    public CLS213 MTH3296(String s) {
        this.FLD974.remove(s);
        this.FLD973.remove(s);
        this.FLD975.remove(s);
        return this;
    }

    // 此方法包含解密的字符串
    public CLS213 MTH3297(String s, String s1, Object[] arr_object) {
        if("\uD8E3ore".equals(s)) {
            this.MTH3318(s1, arr_object);
            return this;
        }
        CLS104.MTH2238().MTH2246(s, s1, arr_object);
        return this;
    }

    public Object MTH3298(String s, Object[] arr_object) {
        if(this.MTH3300(s)) {
            CLS255 ᵔﹶ0 = (CLS255)this.FLD973.get(s);
            return ᵔﹶ0 == null ? CLS104.MTH2238().MTH2232(s, arr_object) : ᵔﹶ0.MTH3693(arr_object);
        }
        return CLS104.MTH2238().MTH2232(s, arr_object);
    }

    public String MTH3299(String s, Object[] arr_object) {
        if(this.MTH3300(s)) {
            CLS255 ᵔﹶ0 = (CLS255)this.FLD973.get(s);
            return ᵔﹶ0 == null ? CLS104.MTH2238().MTH2230(s, arr_object) : ᵔﹶ0.MTH3690(arr_object);
        }
        return CLS104.MTH2238().MTH2230(s, arr_object);
    }

    public boolean MTH3300(String s) {
        return this.FLD973.containsKey(s);
    }

    // 此方法包含解密的字符串
    public CLS213 MTH3301(String s, String s1, Object[] arr_object) {
        if("\uD8E3ore".equals(s)) {
            this.MTH3321(s1, arr_object);
            return this;
        }
        this.MTH3330(s, s1, arr_object);
        return this;
    }

    public CLS213 MTH3302(String s, String s1, Object[] arr_object) {
        this.MTH3318(s1, arr_object);
        CLS104.MTH2238().MTH2228(s, s1, arr_object);
        return this;
    }

    public CLS213 MTH3303(String s, int v, Object[] arr_object) {
        this.MTH3307(s, v, arr_object);
        CLS104.MTH2238().MTH2206(s, v, arr_object);
        return this;
    }

    public static CLS213 MTH3304() {
        return CLS213.FLD976;
    }

    // 此方法包含解密的字符串
    public CLS213 MTH3305(String s, String s1, int v, Object[] arr_object) {
        if("\uD8E3ore".equals(s)) {
            this.MTH3307(s1, v, arr_object);
            return this;
        }
        CLS104.MTH2238().MTH2252(s, s1, v, arr_object);
        return this;
    }

    public CLS213 MTH3306(String s, String s1, Object[] arr_object) {
        this.MTH3317(s1, arr_object);
        CLS104.MTH2238().MTH2205(s, s1, arr_object);
        return this;
    }

    public CLS213 MTH3307(String s, int v, Object[] arr_object) {
        if(this.MTH3313(s)) {
            CLS179 ʽـ0 = this.MTH3315(s, v);
            if(ʽـ0 != null) {
                ʽـ0.MTH3080(arr_object);
            }
        }
        return this;
    }

    // 此方法包含解密的字符串
    public Object MTH3308(String s, String s1, Object[] arr_object) {
        if("\uD8E3ore".equals(s)) {
            if(this.MTH3300(s1)) {
                CLS255 ᵔﹶ0 = (CLS255)this.FLD973.get(s1);
                return ᵔﹶ0 == null ? null : ᵔﹶ0.MTH3693(arr_object);
            }
            return null;
        }
        return CLS104.MTH2238().MTH2234(s, s1, arr_object);
    }

    public ArrayList MTH3309(String s, String s1, Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        if(this.MTH3300(s1)) {
            CLS255 ᵔﹶ0 = (CLS255)this.FLD973.get(s1);
            if(ᵔﹶ0 != null) {
                arrayList0.addAll(ᵔﹶ0.MTH3688(arr_object));
            }
        }
        arrayList0.addAll(CLS104.MTH2238().MTH2219(s, new Object[]{s1, arr_object}));
        return arrayList0;
    }

    public boolean MTH3310(String s) {
        return this.FLD974.containsKey(s);
    }

    public CLS213 MTH3311(String s, Object[] arr_object) {
        this.MTH3318(s, arr_object);
        CLS104.MTH2238().MTH2244(s, arr_object);
        return this;
    }

    // 此方法包含解密的字符串
    public CLS213 MTH3312(String s, String s1, Object[] arr_object) {
        if("\uD8E3ore".equals(s)) {
            this.MTH3317(s1, arr_object);
            return this;
        }
        CLS104.MTH2238().MTH2254(s, s1, arr_object);
        return this;
    }

    public boolean MTH3313(String s) {
        return this.FLD975.containsKey(s);
    }

    // 此方法包含解密的字符串
    public CLS213 MTH3314(String s, CLS254 ᵔﹶ$ˆٴ0) {
        String[] arr_s = s.split("\uD8E3");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(this.MTH3300(s1)) {
                ((CLS255)this.FLD973.get(s1)).MTH3692(ᵔﹶ$ˆٴ0);
            }
            else {
                CLS255 ᵔﹶ0 = new CLS255();
                ᵔﹶ0.MTH3692(ᵔﹶ$ˆٴ0);
                this.FLD973.put(s1, ᵔﹶ0);
            }
        }
        return this;
    }

    public CLS179 MTH3315(String s, int v) {
        if(!this.MTH3313(s)) {
            return null;
        }
        ArrayList arrayList0 = (ArrayList)this.FLD975.get(s);
        if(arrayList0 == null) {
            return null;
        }
        for(Object object0: arrayList0) {
            CLS179 ʽـ0 = (CLS179)object0;
            if(ʽـ0.MTH3072() == v) {
                return ʽـ0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public Object MTH3316(String s, Object[] arr_object) {
        if(this.MTH3300(s)) {
            CLS255 ᵔﹶ0 = (CLS255)this.FLD973.get(s);
            return ᵔﹶ0 == null ? CLS104.MTH2238().MTH2232(s, arr_object) : ᵔﹶ0.MTH3691(arr_object);
        }
        return CLS104.MTH2238().MTH2232(s, arr_object);
    }

    public CLS213 MTH3317(String s, Object[] arr_object) {
        if(this.MTH3310(s)) {
            ((CLS179)this.FLD974.get(s)).MTH3073(arr_object);
            return this;
        }
        if(this.FLD975.containsKey(s)) {
            ArrayList arrayList0 = (ArrayList)this.FLD975.get(s);
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    ((CLS179)object0).MTH3073(arr_object);
                }
            }
        }
        return this;
    }

    public CLS213 MTH3318(String s, Object[] arr_object) {
        if(this.MTH3310(s)) {
            ((CLS179)this.FLD974.get(s)).MTH3077(arr_object);
            return this;
        }
        if(this.FLD975.containsKey(s)) {
            ArrayList arrayList0 = (ArrayList)this.FLD975.get(s);
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    ((CLS179)object0).MTH3077(arr_object);
                }
            }
        }
        return this;
    }

    public boolean MTH3319(String s, Object[] arr_object) {
        if(this.MTH3300(s)) {
            CLS255 ᵔﹶ0 = (CLS255)this.FLD973.get(s);
            return ᵔﹶ0 == null ? CLS104.MTH2238().MTH2215(s, arr_object) : ᵔﹶ0.MTH3689(arr_object);
        }
        return CLS104.MTH2238().MTH2215(s, arr_object);
    }

    public CLS213 MTH3320(String s, Object[] arr_object) {
        this.MTH3321(s, arr_object);
        CLS104.MTH2238().MTH2253(s, arr_object);
        return this;
    }

    public CLS213 MTH3321(String s, Object[] arr_object) {
        if(this.MTH3310(s)) {
            ((CLS179)this.FLD974.get(s)).MTH3080(arr_object);
            return this;
        }
        if(this.FLD975.containsKey(s)) {
            ArrayList arrayList0 = (ArrayList)this.FLD975.get(s);
            if(arrayList0 != null) {
                for(Object object0: arrayList0) {
                    ((CLS179)object0).MTH3080(arr_object);
                }
            }
        }
        return this;
    }

    public ArrayList MTH3322(String s, String s1, Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        if(this.MTH3300(s1)) {
            CLS255 ᵔﹶ0 = (CLS255)this.FLD973.get(s1);
            if(ᵔﹶ0 != null) {
                arrayList0.addAll(ᵔﹶ0.MTH3694(arr_object));
            }
        }
        arrayList0.addAll(CLS104.MTH2238().MTH2209(s, s1, arr_object));
        return arrayList0;
    }

    public CLS213 MTH3323(String s, Object[] arr_object) {
        this.MTH3317(s, arr_object);
        CLS104.MTH2238().MTH2201(s, arr_object);
        return this;
    }

    public ArrayList MTH3324(String s, Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        if(this.MTH3300(s)) {
            CLS255 ᵔﹶ0 = (CLS255)this.FLD973.get(s);
            if(ᵔﹶ0 != null) {
                arrayList0.addAll(ᵔﹶ0.MTH3688(arr_object));
            }
        }
        arrayList0.addAll(CLS104.MTH2238().MTH2219(s, arr_object));
        return arrayList0;
    }

    public CLS213 MTH3325(String s, String s1, Object[] arr_object) {
        this.MTH3332(s1, arr_object);
        CLS104.MTH2238().MTH2203(s, s1, arr_object);
        return this;
    }

    public ArrayList MTH3326(String s, Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList();
        if(this.MTH3300(s)) {
            CLS255 ᵔﹶ0 = (CLS255)this.FLD973.get(s);
            if(ᵔﹶ0 != null) {
                arrayList0.addAll(ᵔﹶ0.MTH3694(arr_object));
            }
        }
        arrayList0.addAll(CLS104.MTH2238().MTH2219(s, arr_object));
        return arrayList0;
    }

    public int MTH3327(String s, Object[] arr_object) {
        if(this.MTH3300(s)) {
            CLS255 ᵔﹶ0 = (CLS255)this.FLD973.get(s);
            return ᵔﹶ0 == null ? CLS104.MTH2238().MTH2207(s, arr_object) : ᵔﹶ0.MTH3687(arr_object);
        }
        return CLS104.MTH2238().MTH2207(s, arr_object);
    }

    public CLS213 MTH3328(String s, String s1, Object[] arr_object) {
        this.MTH3321(s1, arr_object);
        CLS104.MTH2238().MTH2228(s, s1, arr_object);
        return this;
    }

    public CLS213 MTH3329(String s, Object[] arr_object) {
        this.MTH3332(s, arr_object);
        CLS104.MTH2238().MTH2196(s, arr_object);
        return this;
    }

    // 此方法包含解密的字符串
    public CLS213 MTH3330(String s, String s1, Object[] arr_object) {
        if("\uD8E3ore".equals(s)) {
            this.MTH3321(s1, arr_object);
            return this;
        }
        CLS104.MTH2238().MTH2242(s, s1, arr_object);
        return this;
    }

    // 此方法包含解密的字符串
    public CLS213 MTH3331(String s, CLS178 ʽـ$ˆٴ0) {
        String[] arr_s = s.split("\uD8E3");
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(this.MTH3310(s1)) {
                ((CLS179)this.FLD974.get(s1)).MTH3075(ʽـ$ˆٴ0);
            }
            else {
                CLS179 ʽـ0 = new CLS179();
                ʽـ0.MTH3075(ʽـ$ˆٴ0);
                this.FLD974.put(s1, ʽـ0);
            }
        }
        return this;
    }

    public CLS213 MTH3332(String s, Object[] arr_object) {
        if(this.MTH3310(s)) {
            ((CLS179)this.FLD974.get(s)).MTH3078(arr_object);
        }
        return this;
    }
}

