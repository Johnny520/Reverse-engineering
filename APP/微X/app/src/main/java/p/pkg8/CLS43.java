// Decompiled by JEB v5.42.0.202606242140

package p.pkg8;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

public final class CLS43 {
    public static final class CLS41 extends AsyncTask {
        public final CLS42 FLD318;

        public CLS41(CLS42 ʼˉ$ﾞᵢ0) {
            this.FLD318 = ʼˉ$ﾞᵢ0;
        }

        @Override  // android.os.AsyncTask
        public final Object doInBackground(Object[] arr_object) {
            Void[] arr_void = (Void[])arr_object;
            try {
                this.FLD318.run();
            }
            catch(Throwable throwable0) {
                CLS44.MTH897(throwable0);
            }
            return null;
        }
    }

    public interface CLS42 {
        void run();
    }

    public Handler FLD319;
    public static final CLS43 FLD320;
    public final HashMap FLD321;
    public Handler FLD322;
    public HandlerThread FLD323;

    static {
        CLS43.FLD320 = new CLS43();
    }

    public CLS43() {
        this.FLD321 = new HashMap();
    }

    public final void MTH879(CLS42 ʼˉ$ﾞᵢ0) {
        this.MTH882().post(new CLS45(ʼˉ$ﾞᵢ0, 0));
    }

    public final void MTH880(CLS42 ʼˉ$ﾞᵢ0) {
        if(this.FLD322 == null) {
            this.FLD322 = new Handler(Looper.getMainLooper());
        }
        this.FLD322.post(new CLS45(ʼˉ$ﾞᵢ0, 3));
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public static HandlerThread MTH881() {
        return new HandlerThread("wx_features_" + "vidurlparser" + "_thread" + "_" + Long.toHexString(System.currentTimeMillis()));
    }

    public final Handler MTH882() {
        try {
            if(this.FLD323 == null || !this.FLD323.isAlive()) {
                HandlerThread handlerThread0 = CLS43.MTH881();
                this.FLD323 = handlerThread0;
                try {
                    if(!handlerThread0.isAlive() && handlerThread0.getState() == Thread.State.NEW) {
                        handlerThread0.start();
                    }
                }
                catch(Throwable throwable1) {
                    CLS44.MTH897(throwable1);
                }
                this.FLD319 = new Handler(this.FLD323.getLooper());
                return this.FLD319;
            }
        }
        catch(Throwable throwable0) {
            CLS44.MTH897(throwable0);
        }
        return this.FLD319;
    }

    public final Object MTH883(Class class0) {
        String s = class0.getName();
        Object object0 = this.FLD321.containsKey(s) ? this.FLD321.get(s) : null;
        return object0 == null ? null : object0;
    }
}

