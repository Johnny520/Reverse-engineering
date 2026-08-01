// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ˈˈ.CLS82;
import java.util.function.Function;

public final class CLS521 implements Function {
    public final int FLD5106;

    public CLS521(int v) {
        this.FLD5106 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override
    public final Object apply(Object object0) {
        switch(this.FLD5106) {
            case 0: {
                return "";
            }
            case 1: {
                return ((CLS82)object0).FLD317;
            }
            case 2: {
                return ((ContentValues)object0).getAsString("nickname").toLowerCase();
            }
            default: {
                return ((ContentValues)object0).getAsInteger("createTime");
            }
        }
    }
}

