// Decompiled by JEB v5.42.0.202606242140

package c.ﾞﹶ;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

public final class CLS379 {
    public final byte[] FLD1655;
    public final BarcodeFormat FLD1656;
    public final String FLD1657;
    public final int FLD1658;
    public final long FLD1659;
    public Map FLD1660;
    public CLS380[] FLD1661;

    public CLS379(String s, byte[] arr_b, int v, CLS380[] arr_ٴⁱ, BarcodeFormat barcodeFormat0, long v1) {
        this.FLD1657 = s;
        this.FLD1655 = arr_b;
        this.FLD1658 = v;
        this.FLD1661 = arr_ٴⁱ;
        this.FLD1656 = barcodeFormat0;
        this.FLD1660 = null;
        this.FLD1659 = v1;
    }

    public CLS379(String s, byte[] arr_b, CLS380[] arr_ٴⁱ, BarcodeFormat barcodeFormat0) {
        this(s, arr_b, arr_ٴⁱ, barcodeFormat0, System.currentTimeMillis());
    }

    public CLS379(String s, byte[] arr_b, CLS380[] arr_ٴⁱ, BarcodeFormat barcodeFormat0, long v) {
        this(s, arr_b, (arr_b == null ? 0 : arr_b.length * 8), arr_ٴⁱ, barcodeFormat0, v);
    }

    @Override
    public String toString() {
        return this.FLD1657;
    }

    public BarcodeFormat MTH5115() {
        return this.FLD1656;
    }

    public CLS380[] MTH5116() {
        return this.FLD1661;
    }

    public void MTH5117(CLS380[] arr_ٴⁱ) {
        CLS380[] arr_ٴⁱ1 = this.FLD1661;
        if(arr_ٴⁱ1 == null) {
            this.FLD1661 = arr_ٴⁱ;
            return;
        }
        if(arr_ٴⁱ != null && arr_ٴⁱ.length > 0) {
            CLS380[] arr_ٴⁱ2 = new CLS380[arr_ٴⁱ1.length + arr_ٴⁱ.length];
            System.arraycopy(arr_ٴⁱ1, 0, arr_ٴⁱ2, 0, arr_ٴⁱ1.length);
            System.arraycopy(arr_ٴⁱ, 0, arr_ٴⁱ2, arr_ٴⁱ1.length, arr_ٴⁱ.length);
            this.FLD1661 = arr_ٴⁱ2;
        }
    }

    public byte[] MTH5118() {
        return this.FLD1655;
    }

    public void MTH5119(Map map0) {
        if(map0 != null) {
            Map map1 = this.FLD1660;
            if(map1 == null) {
                this.FLD1660 = map0;
                return;
            }
            map1.putAll(map0);
        }
    }

    public void MTH5120(ResultMetadataType resultMetadataType0, Object object0) {
        if(this.FLD1660 == null) {
            this.FLD1660 = new EnumMap(ResultMetadataType.class);
        }
        this.FLD1660.put(resultMetadataType0, object0);
    }

    public String MTH5121() {
        return this.FLD1657;
    }

    public Map MTH5122() {
        return this.FLD1660;
    }
}

