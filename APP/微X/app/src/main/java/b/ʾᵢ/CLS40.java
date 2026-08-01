// Decompiled by JEB v5.42.0.202606242140

package b.ʾᵢ;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import b.ˈˈ.CLS92;
import b.ⁱᵔ.CLS412;
import java.util.HashMap;

public final class CLS40 {
    public interface CLS39 {
        void run();
    }

    public final HashMap FLD152;
    public Handler FLD153;
    public HandlerThread FLD154;
    public final CLS92 FLD155;
    public Handler FLD156;
    public static final CLS40 FLD157;

    static {
        CLS40.FLD157 = new CLS40();
    }

    public CLS40() {
        this.FLD152 = new HashMap();
        this.FLD155 = new CLS92(15000L);
    }

    public final void MTH1115(Object object0) {
        String s = object0.getClass().getName();
        this.FLD152.put(s, object0);
    }

    public final void MTH1116(CLS39 ﾞᵎ$ˆٴ0) {
        this.MTH1122().post(new CLS20(ﾞᵎ$ˆٴ0, 3));
    }

    public final void MTH1117(CLS39 ﾞᵎ$ˆٴ0, long v) {
        if(v == 0L) {
            this.MTH1116(ﾞᵎ$ˆٴ0);
            return;
        }
        this.MTH1122().postDelayed(new CLS20(ﾞᵎ$ˆٴ0, 2), v);
    }

    public final Object MTH1118(Class class0) {
        String s = class0.getName();
        Object object0 = this.FLD152.containsKey(s) ? this.FLD152.get(s) : null;
        return object0 == null ? null : object0;
    }

    public final void MTH1119(long v, Object object0, String s) {
        this.FLD155.MTH1743(s, object0, v);
    }

    public static CLS40 MTH1120() {
        return CLS40.FLD157;
    }

    // 此方法包含解密的字符串
    public final Handler MTH1121() {
        try {
            if(this.FLD154 == null || !this.FLD154.isAlive()) {
                HandlerThread handlerThread0 = new HandlerThread(CLS412.MTH5999("wx_features_base_thread"));
                this.FLD154 = handlerThread0;
                CLS412.MTH6000(handlerThread0);
                this.FLD153 = new Handler(this.FLD154.getLooper());
                return this.FLD153;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return this.FLD153;
    }

    public final Handler MTH1122() {
        if(this.FLD156 == null) {
            this.FLD156 = new Handler(Looper.getMainLooper());
        }
        return this.FLD156;
    }

    public final void MTH1123(CLS39 ﾞᵎ$ˆٴ0, long v) {
        if(v == 0L) {
            this.MTH1124(ﾞᵎ$ˆٴ0);
            return;
        }
        this.MTH1121().postDelayed(new CLS20(ﾞᵎ$ˆٴ0, 1), v);
    }

    public final void MTH1124(CLS39 ﾞᵎ$ˆٴ0) {
        this.MTH1121().post(new CLS20(ﾞᵎ$ˆٴ0, 0));
    }
}

