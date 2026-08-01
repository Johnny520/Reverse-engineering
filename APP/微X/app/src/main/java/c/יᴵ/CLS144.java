// Decompiled by JEB v5.42.0.202606242140

package c.יᴵ;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import c.ˑʼ.CLS129;
import c.ـˉ.CLS204;
import c.ـˉ.CLS224;
import java.util.HashMap;

public class CLS144 {
    public interface CLS142 {
        void run();
    }

    public static class CLS143 extends AsyncTask {
        public final CLS142 FLD665;

        public CLS143(CLS142 ˆˆ$ʻᵢ0) {
            this.FLD665 = ˆˆ$ʻᵢ0;
        }

        @Override  // android.os.AsyncTask
        public Object doInBackground(Object[] arr_object) {
            return this.MTH2579(((Void[])arr_object));
        }

        public Void MTH2579(Void[] arr_void) {
            try {
                this.FLD665.run();
            }
            catch(Throwable throwable0) {
                CLS204.MTH3257(throwable0);
            }
            return null;
        }
    }

    public final HashMap FLD666;
    public Handler FLD667;
    public final CLS129 FLD668;
    public HandlerThread FLD669;
    public static final CLS144 FLD670;
    public Handler FLD671;

    static {
        CLS144.FLD670 = new CLS144();
    }

    public CLS144() {
        this.FLD666 = new HashMap();
        this.FLD668 = new CLS129(15000L);
    }

    public static CLS144 MTH2583() {
        return CLS144.FLD670;
    }

    // 检测为 Lambda 实现
    public static void MTH2585(CLS142 ˆˆ$ʻᵢ0) [...]

    public Handler MTH2587() {
        try {
            if(this.FLD669 == null || !this.FLD669.isAlive()) {
                HandlerThread handlerThread0 = this.MTH2606();
                this.FLD669 = handlerThread0;
                CLS224.MTH3476(handlerThread0);
                this.FLD667 = new Handler(this.FLD669.getLooper());
                return this.FLD667;
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return this.FLD667;
    }

    public CLS144 MTH2588(CLS142 ˆˆ$ʻᵢ0, long v) {
        this.MTH2597().postDelayed(() -> try {
            ˆˆ$ʻᵢ0.run();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }, v);
        return this;
    }

    public CLS144 MTH2589(CLS142 ˆˆ$ʻᵢ0) {
        this.MTH2587().post(() -> try {
            ˆˆ$ʻᵢ0.run();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        });
        return this;
    }

    // 检测为 Lambda 实现
    public static void MTH2590(CLS142 ˆˆ$ʻᵢ0) [...]

    // 去混淆评级： 低(20)
    public Object MTH2591(String s) {
        return this.FLD666.containsKey(s) ? this.FLD666.get(s) : null;
    }

    // 检测为 Lambda 实现
    public static void MTH2592(CLS142 ˆˆ$ʻᵢ0) [...]

    public CLS144 MTH2593(String s, Object object0) {
        this.FLD666.put(s, object0);
        return this;
    }

    public CLS144 MTH2594(Object object0) {
        this.MTH2593(object0.getClass().getName(), object0);
        return this;
    }

    // 检测为 Lambda 实现
    public static void MTH2595(CLS142 ˆˆ$ʻᵢ0) [...]

    public Object MTH2596(String s) {
        return this.FLD668.MTH2486(s);
    }

    public Handler MTH2597() {
        if(this.FLD671 == null) {
            this.FLD671 = new Handler(Looper.getMainLooper());
        }
        return this.FLD671;
    }

    public void MTH2598(String s, Object object0, long v) {
        this.FLD668.MTH2488(s, object0, v);
    }

    public CLS144 MTH2599(Runnable runnable0) {
        this.MTH2587().removeCallbacks(runnable0);
        return this;
    }

    public Runnable MTH2601(CLS142 ˆˆ$ʻᵢ0, long v) {
        Runnable runnable0 = () -> try {
            ˆˆ$ʻᵢ0.run();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        };
        long v1 = v - System.currentTimeMillis();
        if(v1 < 0L) {
            return null;
        }
        this.MTH2587().postDelayed(runnable0, v1);
        return runnable0;
    }

    // 检测为 Lambda 实现
    public static void MTH2602(CLS142 ˆˆ$ʻᵢ0) [...]

    public CLS144 MTH2603(CLS142 ˆˆ$ʻᵢ0) {
        new CLS143(ˆˆ$ʻᵢ0).execute(new Void[0]);
        return this;
    }

    public CLS144 MTH2604(CLS142 ˆˆ$ʻᵢ0) {
        this.MTH2597().post(() -> try {
            ˆˆ$ʻᵢ0.run();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        });
        return this;
    }

    public Object MTH2605(Class class0) {
        Object object0 = this.MTH2591(class0.getName());
        return object0 == null ? null : object0;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final HandlerThread MTH2606() {
        return new HandlerThread(CLS224.MTH3484("\uD8E3x_global_thread"));
    }

    public CLS144 MTH2608(CLS142 ˆˆ$ʻᵢ0, long v) {
        this.MTH2587().postDelayed(() -> try {
            ˆˆ$ʻᵢ0.run();
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }, v);
        return this;
    }
}

