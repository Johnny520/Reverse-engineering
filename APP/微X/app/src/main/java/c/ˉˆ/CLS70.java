// Decompiled by JEB v5.42.0.202606242140

package c.ˉˆ;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import c.ˏᵎ.CLS184;
import c.ˏᵎ.CLS185;
import c.יⁱ.CLS255;
import java.util.HashMap;

public class CLS70 {
    public static class CLS68 extends AsyncTask {
        public final CLS69 FLD246;

        public CLS68(CLS69 ᵎʾ$ﾞⁱ0) {
            this.FLD246 = ᵎʾ$ﾞⁱ0;
        }

        @Override  // android.os.AsyncTask
        public Object doInBackground(Object[] arr_object) {
            return this.MTH1123(((Void[])arr_object));
        }

        public Void MTH1123(Void[] arr_void) {
            try {
                this.FLD246.run();
            }
            catch(Throwable throwable0) {
                CLS185.MTH2708(throwable0);
            }
            return null;
        }
    }

    public interface CLS69 {
        void run();
    }

    public HandlerThread FLD247;
    public Handler FLD248;
    public Handler FLD249;
    public static final CLS70 FLD250;
    public final CLS255 FLD251;
    public final HashMap FLD252;

    static {
        CLS70.FLD250 = new CLS70();
    }

    public CLS70() {
        this.FLD252 = new HashMap();
        this.FLD251 = new CLS255(15000L);
    }

    public CLS70 MTH1127(CLS69 ᵎʾ$ﾞⁱ0) {
        this.MTH1133().post(() -> try {
            ᵎʾ$ﾞⁱ0.run();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        });
        return this;
    }

    public Runnable MTH1128(CLS69 ᵎʾ$ﾞⁱ0, long v) {
        Runnable runnable0 = () -> try {
            ᵎʾ$ﾞⁱ0.run();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        };
        long v1 = v - System.currentTimeMillis();
        if(v1 < 0L) {
            return null;
        }
        this.MTH1136().postDelayed(runnable0, v1);
        return runnable0;
    }

    // 去混淆评级： 低(20)
    public Object MTH1130(String s) {
        return this.FLD252.containsKey(s) ? this.FLD252.get(s) : null;
    }

    public static CLS70 MTH1131() {
        return CLS70.FLD250;
    }

    public Handler MTH1133() {
        if(this.FLD249 == null) {
            this.FLD249 = new Handler(Looper.getMainLooper());
        }
        return this.FLD249;
    }

    public CLS70 MTH1135(CLS69 ᵎʾ$ﾞⁱ0, long v) {
        this.MTH1133().postDelayed(() -> try {
            ᵎʾ$ﾞⁱ0.run();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }, v);
        return this;
    }

    public Handler MTH1136() {
        try {
            if(this.FLD247 == null || !this.FLD247.isAlive()) {
                HandlerThread handlerThread0 = this.MTH1137();
                this.FLD247 = handlerThread0;
                CLS184.MTH2698(handlerThread0);
                this.FLD248 = new Handler(this.FLD247.getLooper());
                return this.FLD248;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return this.FLD248;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final HandlerThread MTH1137() {
        return new HandlerThread(CLS184.MTH2689("wx_global_thread"));
    }

    // 检测为 Lambda 实现
    public static void MTH1138(CLS69 ᵎʾ$ﾞⁱ0) [...]

    public CLS70 MTH1139(CLS69 ᵎʾ$ﾞⁱ0) {
        this.MTH1136().post(() -> try {
            ᵎʾ$ﾞⁱ0.run();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        });
        return this;
    }

    public void MTH1140(String s, Object object0, long v) {
        this.FLD251.MTH3351(s, object0, v);
    }

    public CLS70 MTH1141(Runnable runnable0) {
        this.MTH1136().removeCallbacks(runnable0);
        return this;
    }

    // 检测为 Lambda 实现
    public static void MTH1142(CLS69 ᵎʾ$ﾞⁱ0) [...]

    public CLS70 MTH1143(String s, Object object0) {
        this.FLD252.put(s, object0);
        return this;
    }

    public CLS70 MTH1144(CLS69 ᵎʾ$ﾞⁱ0, long v) {
        this.MTH1136().postDelayed(() -> try {
            ᵎʾ$ﾞⁱ0.run();
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }, v);
        return this;
    }

    // 检测为 Lambda 实现
    public static void MTH1145(CLS69 ᵎʾ$ﾞⁱ0) [...]

    // 检测为 Lambda 实现
    public static void MTH1146(CLS69 ᵎʾ$ﾞⁱ0) [...]

    public Object MTH1147(Class class0) {
        Object object0 = this.MTH1130(class0.getName());
        return object0 == null ? null : object0;
    }

    public Object MTH1148(String s) {
        return this.FLD251.MTH3348(s);
    }

    // 检测为 Lambda 实现
    public static void MTH1150(CLS69 ᵎʾ$ﾞⁱ0) [...]

    public CLS70 MTH1151(Object object0) {
        this.MTH1143(object0.getClass().getName(), object0);
        return this;
    }

    public CLS70 MTH1152(CLS69 ᵎʾ$ﾞⁱ0) {
        new CLS68(ᵎʾ$ﾞⁱ0).execute(new Void[0]);
        return this;
    }
}

