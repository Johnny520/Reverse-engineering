// Decompiled by JEB v5.42.0.202606242140

package p.pkg9;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import javax.annotation.Nullable;
import p.pkg10.CLS66;
import p.pkg6.CLS36;
import p.pkg7.CLS37;
import p.pkg7.CLS39;

public final class CLS64 implements Cloneable, Iterable {
    public int FLD416;
    public Object[] FLD417;
    public String[] FLD418;

    public CLS64() {
        this.FLD416 = 0;
        this.FLD418 = new String[3];
        this.FLD417 = new Object[3];
    }

    @Override
    public final Object clone() {
        return this.MTH1114();
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(CLS64.class != class0 || this.FLD416 != ((CLS64)object0).FLD416) {
                return false;
            }
            for(int v = 0; v < this.FLD416; ++v) {
                int v1 = ((CLS64)object0).MTH1115(this.FLD418[v]);
                if(v1 == -1) {
                    return false;
                }
                Object object1 = this.FLD417[v];
                Object object2 = ((CLS64)object0).FLD417[v1];
                if(object1 == null) {
                    if(object2 != null) {
                        return false;
                    }
                }
                else if(!object1.equals(object2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.FLD416 * 0x1F;
        int v1 = Arrays.hashCode(this.FLD418);
        return Arrays.hashCode(this.FLD417) + (v + v1) * 0x1F;
    }

    @Override
    public final Iterator iterator() {
        public final class CLS63 implements Iterator {
            public int FLD414;
            public final CLS64 FLD415;

            public CLS63() {
                this.FLD414 = 0;
            }

            @Override
            public final boolean hasNext() {
                CLS64 ﾞᵢ0;
                while(true) {
                    ﾞᵢ0 = CLS64.this;
                    if(this.FLD414 >= ﾞᵢ0.FLD416 || !CLS64.MTH1110(ﾞᵢ0.FLD418[this.FLD414])) {
                        break;
                    }
                    ++this.FLD414;
                }
                return this.FLD414 < ﾞᵢ0.FLD416;
            }

            @Override
            public final Object next() {
                CLS61 ٴʼ0 = new CLS61(CLS64.this.FLD418[this.FLD414], ((String)CLS64.this.FLD417[this.FLD414]), CLS64.this);
                ++this.FLD414;
                return ٴʼ0;
            }

            @Override
            public final void remove() {
                int v = this.FLD414 - 1;
                this.FLD414 = v;
                CLS64.this.MTH1106(v);
            }
        }

        return new CLS63(this);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = CLS36.MTH850();
        try {
            this.MTH1107(stringBuilder0, new CLS207("").FLD412);
            return CLS36.MTH848(stringBuilder0);
        }
        catch(IOException iOException0) {
            throw new CLS66(iOException0);
        }
    }

    public final String MTH1105(String s) [...] // 潜在的解密器

    public final void MTH1106(int v) {
        int v1 = this.FLD416;
        if(v >= v1) {
            throw new CLS37("Must be false");
        }
        int v2 = v1 - v - 1;
        if(v2 > 0) {
            System.arraycopy(this.FLD418, v + 1, this.FLD418, v, v2);
            System.arraycopy(this.FLD417, v + 1, this.FLD417, v, v2);
        }
        int v3 = this.FLD416 - 1;
        this.FLD416 = v3;
        this.FLD418[v3] = null;
        this.FLD417[v3] = null;
    }

    public final void MTH1107(Appendable appendable0, CLS62 ﾞˈ$ٴʼ0) {
        int v = this.FLD416;
        for(int v1 = 0; v1 < v; ++v1) {
            if(!CLS64.MTH1110(this.FLD418[v1])) {
                String s = CLS61.MTH1066(this.FLD418[v1], ﾞˈ$ٴʼ0.FLD407);
                if(s != null) {
                    CLS61.MTH1067(s, ((String)this.FLD417[v1]), appendable0.append(' '), ﾞˈ$ٴʼ0);
                }
            }
        }
    }

    public final String MTH1108(String s) [...] // 潜在的解密器

    public final void MTH1109(String s, @Nullable String s1) {
        CLS39.MTH871(s);
        int v = this.MTH1115(s);
        if(v != -1) {
            this.FLD417[v] = s1;
            return;
        }
        this.MTH1111(s1, s);
    }

    public static boolean MTH1110(String s) {
        return s != null && s.length() > 1 && s.charAt(0) == 0x2F;
    }

    public final void MTH1111(@Nullable Object object0, String s) {
        this.MTH1116(this.FLD416 + 1);
        int v = this.FLD416;
        this.FLD418[v] = s;
        this.FLD417[v] = object0;
        this.FLD416 = v + 1;
    }

    public final void MTH1112(CLS61 ٴʼ0) {
        this.MTH1109(ٴʼ0.FLD397, (ٴʼ0.FLD401 == null ? "" : ٴʼ0.FLD401));
        ٴʼ0.FLD399 = this;
    }

    public final int MTH1113(String s) {
        CLS39.MTH871(s);
        for(int v = 0; v < this.FLD416; ++v) {
            if(s.equalsIgnoreCase(this.FLD418[v])) {
                return v;
            }
        }
        return -1;
    }

    public final CLS64 MTH1114() {
        CLS64 ﾞᵢ0;
        try {
            ﾞᵢ0 = (CLS64)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
        ﾞᵢ0.FLD416 = this.FLD416;
        ﾞᵢ0.FLD418 = (String[])Arrays.copyOf(this.FLD418, this.FLD416);
        ﾞᵢ0.FLD417 = Arrays.copyOf(this.FLD417, this.FLD416);
        return ﾞᵢ0;
    }

    public final int MTH1115(String s) {
        CLS39.MTH871(s);
        for(int v = 0; v < this.FLD416; ++v) {
            if(s.equals(this.FLD418[v])) {
                return v;
            }
        }
        return -1;
    }

    public final void MTH1116(int v) {
        int v1 = 3;
        CLS39.MTH870(v >= this.FLD416);
        String[] arr_s = this.FLD418;
        if(arr_s.length >= v) {
            return;
        }
        if(arr_s.length >= 3) {
            v1 = this.FLD416 * 2;
        }
        if(v <= v1) {
            v = v1;
        }
        this.FLD418 = (String[])Arrays.copyOf(arr_s, v);
        this.FLD417 = Arrays.copyOf(this.FLD417, v);
    }
}

