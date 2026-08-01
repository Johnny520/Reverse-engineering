// Decompiled by JEB v5.42.0.202606242140

package c.ᐧᵎ;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

public final class CLS271 {
    public final int FLD1063;
    public final BarcodeFormat FLD1064;
    public CLS268[] FLD1065;
    public Map FLD1066;
    public final String FLD1067;
    public final long FLD1068;
    public final byte[] FLD1069;

    public CLS271(String s, byte[] arr_b, int v, CLS268[] arr_ᵔʼ, BarcodeFormat barcodeFormat0, long v1) {
        this.FLD1067 = s;
        this.FLD1069 = arr_b;
        this.FLD1063 = v;
        this.FLD1065 = arr_ᵔʼ;
        this.FLD1064 = barcodeFormat0;
        this.FLD1066 = null;
        this.FLD1068 = v1;
    }

    public CLS271(String s, byte[] arr_b, CLS268[] arr_ᵔʼ, BarcodeFormat barcodeFormat0) {
        this(s, arr_b, arr_ᵔʼ, barcodeFormat0, System.currentTimeMillis());
    }

    public CLS271(String s, byte[] arr_b, CLS268[] arr_ᵔʼ, BarcodeFormat barcodeFormat0, long v) {
        this(s, arr_b, (arr_b == null ? 0 : arr_b.length * 8), arr_ᵔʼ, barcodeFormat0, v);
    }

    @Override
    public String toString() {
        return this.FLD1067;
    }

    public byte[] MTH3485() {
        return this.FLD1069;
    }

    public CLS268[] MTH3486() {
        return this.FLD1065;
    }

    public Map MTH3487() {
        return this.FLD1066;
    }

    public String MTH3488() {
        return this.FLD1067;
    }

    public void MTH3489(ResultMetadataType resultMetadataType0, Object object0) {
        if(this.FLD1066 == null) {
            this.FLD1066 = new EnumMap(ResultMetadataType.class);
        }
        this.FLD1066.put(resultMetadataType0, object0);
    }

    public void MTH3490(CLS268[] arr_ᵔʼ) {
        CLS268[] arr_ᵔʼ1 = this.FLD1065;
        if(arr_ᵔʼ1 == null) {
            this.FLD1065 = arr_ᵔʼ;
            return;
        }
        if(arr_ᵔʼ != null && arr_ᵔʼ.length > 0) {
            CLS268[] arr_ᵔʼ2 = new CLS268[arr_ᵔʼ1.length + arr_ᵔʼ.length];
            System.arraycopy(arr_ᵔʼ1, 0, arr_ᵔʼ2, 0, arr_ᵔʼ1.length);
            System.arraycopy(arr_ᵔʼ, 0, arr_ᵔʼ2, arr_ᵔʼ1.length, arr_ᵔʼ.length);
            this.FLD1065 = arr_ᵔʼ2;
        }
    }

    public void MTH3491(Map map0) {
        if(map0 != null) {
            Map map1 = this.FLD1066;
            if(map1 == null) {
                this.FLD1066 = map0;
                return;
            }
            map1.putAll(map0);
        }
    }

    public BarcodeFormat MTH3492() {
        return this.FLD1064;
    }
}

