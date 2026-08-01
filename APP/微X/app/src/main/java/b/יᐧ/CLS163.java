// Decompiled by JEB v5.42.0.202606242140

package b.יᐧ;

import android.os.Handler;
import android.os.HandlerThread;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS412;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class CLS163 {
    public static final class CLS161 {
        public final Object FLD1571;
        public final long FLD1572;

        public CLS161(long v, Object object0) {
            this.FLD1571 = object0;
            this.FLD1572 = v;
        }
    }

    public interface CLS162 {
        void MTH3162();

        void MTH3163(CLS163 arg1);
    }

    public final ConcurrentLinkedQueue FLD1573;
    public CLS162 FLD1574;
    public HandlerThread FLD1575;
    public final CLS160 FLD1576;
    public Handler FLD1577;
    public boolean FLD1578;
    public long FLD1579;

    public CLS163() {
        public final class CLS160 implements Runnable {
            public final CLS163 FLD1570;

            @Override
            public final void run() {
                CLS163 ﾞᐧ0;
                try {
                    ﾞᐧ0 = CLS163.this;
                    if(ﾞᐧ0.MTH3167()) {
                        ﾞᐧ0.FLD1578 = false;
                        CLS162 ﾞᐧ$ᵔʾ0 = ﾞᐧ0.FLD1574;
                        if(ﾞᐧ$ᵔʾ0 != null) {
                            ﾞᐧ$ᵔʾ0.MTH3162();
                        }
                    }
                    else {
                        CLS162 ﾞᐧ$ᵔʾ1 = ﾞᐧ0.FLD1574;
                        if(ﾞᐧ$ᵔʾ1 != null) {
                            ﾞᐧ$ᵔʾ1.MTH3163(ﾞᐧ0);
                        }
                    }
                }
                finally {
                    if(ﾞᐧ0.MTH3165() != null && ﾞᐧ0.MTH3167()) {
                        ﾞᐧ0.MTH3165().removeCallbacks(this);
                        ﾞᐧ0.FLD1578 = false;
                        ﾞᐧ0.MTH3168();
                    }
                }
            }
        }

        this.FLD1579 = 0L;
        this.FLD1573 = new ConcurrentLinkedQueue();
        this.FLD1576 = new CLS160(this);
    }

    public final Handler MTH3165() {
        try {
            if(this.FLD1575 == null || !this.FLD1575.isAlive()) {
                HandlerThread handlerThread0 = new HandlerThread(CLS412.MTH5999("wx_sa"));
                this.FLD1575 = handlerThread0;
                CLS412.MTH6000(handlerThread0);
                this.FLD1577 = new Handler(this.FLD1575.getLooper());
                return this.FLD1577;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return this.FLD1577;
    }

    public final void MTH3166() {
        if(this.MTH3167()) {
            this.FLD1578 = false;
            this.MTH3168();
            return;
        }
        CLS161 ﾞᐧ$ٴـ0 = (CLS161)this.FLD1573.peek();
        if(ﾞᐧ$ٴـ0 != null) {
            this.MTH3165().postDelayed(this.FLD1576, ﾞᐧ$ٴـ0.FLD1572);
        }
    }

    public final boolean MTH3167() {
        return this.FLD1573.isEmpty();
    }

    public final void MTH3168() {
        if(this.FLD1577 == null) {
            return;
        }
        try {
            CLS412.MTH6001(this.FLD1575);
            this.FLD1577 = null;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

