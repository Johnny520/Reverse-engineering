// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import java.util.ArrayDeque;

public final class CLS287 implements Runnable {
    public final int FLD2972;
    public final CLS288 FLD2973;

    public CLS287(CLS288 ˈˊ0, int v) {
        this.FLD2972 = v;
        this.FLD2973 = ˈˊ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override
    public final void run() {
        CLS288 ˈˊ0 = this.FLD2973;
        if(this.FLD2972 == 0) {
            ArrayDeque arrayDeque0 = ˈˊ0.FLD2976;
            if(!arrayDeque0.isEmpty()) {
                String s = (String)arrayDeque0.poll();
                if(!TextUtils.isEmpty(s)) {
                    CLS66.MTH1512(s, "wx");
                }
            }
            return;
        }
        ˈˊ0.getClass();
        try {
            ˈˊ0.MTH4745();
            ˈˊ0.MTH4741(ˈˊ0.MTH4736());
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

