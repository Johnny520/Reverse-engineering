// Decompiled by JEB v5.42.0.202606242140

package c.ᐧˎ;

import c.ⁱי.CLS338;
import c.ⁱי.CLS340;

public final class CLS264 {
    public final CLS340 FLD1047;
    public final CLS338 FLD1048;
    public final boolean FLD1049;
    public final CLS340 FLD1050;

    public CLS264(CLS340 ﾞⁱ0, CLS340 ﾞⁱ1, CLS338 ʾʻ0, boolean z) {
        this.FLD1050 = ﾞⁱ0;
        this.FLD1047 = ﾞⁱ1;
        this.FLD1048 = ʾʻ0;
        this.FLD1049 = z;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof CLS264 ? CLS264.MTH3444(this.FLD1050, ((CLS264)object0).FLD1050) && CLS264.MTH3444(this.FLD1047, ((CLS264)object0).FLD1047) && CLS264.MTH3444(this.FLD1048, ((CLS264)object0).FLD1048) : false;
    }

    @Override
    public int hashCode() {
        return CLS264.MTH3441(this.FLD1050) ^ CLS264.MTH3441(this.FLD1047) ^ CLS264.MTH3441(this.FLD1048);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[ ");
        stringBuilder0.append(this.FLD1050);
        stringBuilder0.append(" , ");
        stringBuilder0.append(this.FLD1047);
        stringBuilder0.append(" : ");
        CLS338 ʾʻ0 = this.FLD1048;
        String s = ʾʻ0 == null ? "null" : ʾʻ0.MTH4785();
        stringBuilder0.append(s);
        stringBuilder0.append(" ]");
        return stringBuilder0.toString();
    }

    public CLS340 MTH3440() {
        return this.FLD1050;
    }

    public static int MTH3441(Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    public CLS340 MTH3442() {
        return this.FLD1047;
    }

    public boolean MTH3443() {
        return this.FLD1047 == null;
    }

    public static boolean MTH3444(Object object0, Object object1) {
        return object0 == null ? object1 == null : object0.equals(object1);
    }

    public CLS338 MTH3445() {
        return this.FLD1048;
    }
}

