// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ˆٴ.CLS66;
import java.util.Comparator;

public final class CLS497 implements Comparator {
    public final String FLD4899;
    public final Object FLD4900;

    public CLS497(Object object0, String s) {
        this.FLD4899 = s;
        this.FLD4900 = object0;
    }

    // 此方法包含解密的字符串
    @Override
    public final int compare(Object object0, Object object1) {
        String s = ((ContentValues)object0).getAsString("wxid");
        String s1 = ((ContentValues)object1).getAsString("wxid");
        String s2 = this.FLD4899;
        if(!s2.equals(s)) {
            if(s2.equals(s1)) {
                return 1;
            }
            boolean z = CLS66.MTH1405(this.FLD4900, s);
            boolean z1 = CLS66.MTH1405(this.FLD4900, s1);
            if(z && z1) {
                return ((ContentValues)object0).getAsString("nickname").toLowerCase().compareTo(((ContentValues)object1).getAsString("nickname").toLowerCase());
            }
            if(!z) {
                return z1 ? 1 : ((ContentValues)object0).getAsString("nickname").toLowerCase().compareTo(((ContentValues)object1).getAsString("nickname").toLowerCase());
            }
        }
        return -1;
    }
}

