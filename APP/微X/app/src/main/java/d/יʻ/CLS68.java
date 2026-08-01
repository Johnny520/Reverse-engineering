// Decompiled by JEB v5.42.0.202606242140

package d.יʻ;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import d.ᵎʻ.CLS118;
import java.util.HashMap;

public final class CLS68 {
    public interface CLS67 {
        void run();
    }

    public final CLS118 FLD321;
    public Handler FLD322;
    public final HashMap FLD323;
    public Handler FLD324;
    public HandlerThread FLD325;
    public static final CLS68 FLD326;

    static {
        CLS68.FLD326 = new CLS68();
    }

    public CLS68() {
        this.FLD323 = new HashMap();
        this.FLD321 = new CLS118(15000L);
    }

    public final Object MTH786(Class class0) {
        String s = class0.getName();
        Object object0 = this.FLD323.containsKey(s) ? this.FLD323.get(s) : null;
        return object0 == null ? null : object0;
    }

    public final void MTH787(CLS67 ٴˆ$ᐧי0) {
        this.MTH790().post(new CLS57(ٴˆ$ᐧי0, 0));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static HandlerThread MTH788() {
        StringBuilder stringBuilder0 = CLS71.MTH830(("wx_features_" + "donation" + "_thread"));
        stringBuilder0.append("_");
        stringBuilder0.append(Long.toHexString(System.currentTimeMillis()));
        return new HandlerThread(stringBuilder0.toString());
    }

    public final void MTH789(String s, Object object0, long v) {
        this.FLD321.MTH1156(s, object0, v);
    }

    public final Handler MTH790() {
        try {
            if(this.FLD325 == null || !this.FLD325.isAlive()) {
                HandlerThread handlerThread0 = CLS68.MTH788();
                this.FLD325 = handlerThread0;
                try {
                    if(!handlerThread0.isAlive() && handlerThread0.getState() == Thread.State.NEW) {
                        handlerThread0.start();
                    }
                }
                catch(Throwable throwable1) {
                    CLS69.MTH797(throwable1);
                }
                this.FLD322 = new Handler(this.FLD325.getLooper());
                return this.FLD322;
            }
        }
        catch(Throwable throwable0) {
            CLS69.MTH797(throwable0);
        }
        return this.FLD322;
    }

    public final void MTH791(CLS67 ٴˆ$ᐧי0) {
        if(this.FLD324 == null) {
            this.FLD324 = new Handler(Looper.getMainLooper());
        }
        this.FLD324.post(new CLS57(ٴˆ$ᐧי0, 2));
    }
}

