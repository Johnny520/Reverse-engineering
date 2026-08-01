// Decompiled by JEB v5.42.0.202606242140

package t.ᵔʾ;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import t.ˊﾞ.CLS113;

public final class CLS137 {
    public interface CLS136 {
        void run();
    }

    public final HashMap FLD967;
    public Handler FLD968;
    public HandlerThread FLD969;
    public final CLS113 FLD970;
    public Handler FLD971;
    public static final CLS137 FLD972;

    static {
        CLS137.FLD972 = new CLS137();
    }

    public CLS137() {
        this.FLD967 = new HashMap();
        this.FLD970 = new CLS113(15000L);
    }

    public final void MTH2139(CLS136 ⁱᵔ$ˆٴ0, long v) {
        if(v == 0L) {
            this.MTH2145(ⁱᵔ$ˆٴ0);
            return;
        }
        if(this.FLD971 == null) {
            this.FLD971 = new Handler(Looper.getMainLooper());
        }
        this.FLD971.postDelayed(new CLS129(ⁱᵔ$ˆٴ0, 2), v);
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public static HandlerThread MTH2140() {
        return new HandlerThread("wx_features_" + "themes" + "_thread" + "_" + Long.toHexString(System.currentTimeMillis()));
    }

    public final void MTH2141(CLS136 ⁱᵔ$ˆٴ0) {
        this.MTH2142().post(new CLS129(ⁱᵔ$ˆٴ0, 0));
    }

    public final Handler MTH2142() {
        try {
            if(this.FLD969 == null || !this.FLD969.isAlive()) {
                HandlerThread handlerThread0 = CLS137.MTH2140();
                this.FLD969 = handlerThread0;
                try {
                    if(!handlerThread0.isAlive() && handlerThread0.getState() == Thread.State.NEW) {
                        handlerThread0.start();
                    }
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
                this.FLD968 = new Handler(this.FLD969.getLooper());
                return this.FLD968;
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return this.FLD968;
    }

    public final Object MTH2143(Class class0) {
        String s = class0.getName();
        Object object0 = this.FLD967.containsKey(s) ? this.FLD967.get(s) : null;
        return object0 == null ? null : object0;
    }

    public final void MTH2144(String s, Boolean boolean0) {
        this.FLD970.MTH1898(s, boolean0, 5000L);
    }

    public final void MTH2145(CLS136 ⁱᵔ$ˆٴ0) {
        if(this.FLD971 == null) {
            this.FLD971 = new Handler(Looper.getMainLooper());
        }
        this.FLD971.post(new CLS129(ⁱᵔ$ˆٴ0, 1));
    }

    public final void MTH2146(CLS136 ⁱᵔ$ˆٴ0, long v) {
        if(v == 0L) {
            this.MTH2141(ⁱᵔ$ˆٴ0);
            return;
        }
        this.MTH2142().postDelayed(new CLS129(ⁱᵔ$ˆٴ0, 3), v);
    }
}

