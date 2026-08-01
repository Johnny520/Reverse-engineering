// Decompiled by JEB v5.42.0.202606242140

package b.יᐧ;

import android.os.Handler;
import android.os.HandlerThread;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS412;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class CLS158 {
    public interface CLS157 {
        void MTH3145();

        void MTH3146(CLS158 arg1);
    }

    public boolean FLD1556;
    public final ConcurrentLinkedQueue FLD1557;
    public CLS157 FLD1558;
    public HandlerThread FLD1559;
    public final CLS156 FLD1560;
    public Handler FLD1561;
    public boolean FLD1562;
    public long FLD1563;

    public CLS158() {
        public final class CLS156 implements Runnable {
            public final CLS158 FLD1555;

            @Override
            public final void run() {
                CLS158 ⁱʾ0;
                try {
                    ⁱʾ0 = CLS158.this;
                    if(ⁱʾ0.MTH3154()) {
                        ⁱʾ0.FLD1562 = false;
                        CLS157 ⁱʾ$ᵔʾ0 = ⁱʾ0.FLD1558;
                        if(ⁱʾ$ᵔʾ0 != null) {
                            ⁱʾ$ᵔʾ0.MTH3145();
                        }
                    }
                    else {
                        CLS157 ⁱʾ$ᵔʾ1 = ⁱʾ0.FLD1558;
                        if(ⁱʾ$ᵔʾ1 != null) {
                            ⁱʾ$ᵔʾ1.MTH3146(ⁱʾ0);
                        }
                    }
                }
                catch(Throwable throwable0) {
                    if(ⁱʾ0.MTH3153() != null) {
                        if(ⁱʾ0.MTH3154()) {
                            ⁱʾ0.MTH3153().removeCallbacks(this);
                            ⁱʾ0.FLD1562 = false;
                            ⁱʾ0.MTH3151();
                        }
                        else if(ⁱʾ0.FLD1557.peek() != null) {
                            ⁱʾ0.MTH3153().postDelayed(this, ⁱʾ0.FLD1563);
                        }
                    }
                    throw throwable0;
                }
                if(ⁱʾ0.MTH3153() != null) {
                    if(ⁱʾ0.MTH3154()) {
                        ⁱʾ0.MTH3153().removeCallbacks(this);
                        ⁱʾ0.FLD1562 = false;
                        ⁱʾ0.MTH3151();
                        return;
                    }
                    if(ⁱʾ0.FLD1557.peek() != null) {
                        ⁱʾ0.MTH3153().postDelayed(this, ⁱʾ0.FLD1563);
                    }
                }
            }
        }

        this.FLD1563 = 0L;
        this.FLD1556 = false;
        this.FLD1557 = new ConcurrentLinkedQueue();
        this.FLD1560 = new CLS156(this);
    }

    public CLS158(CLS157 ⁱʾ$ᵔʾ0, long v) {
        this.FLD1558 = ⁱʾ$ᵔʾ0;
        this.MTH3156(v);
    }

    public final void MTH3149(long v) {
        if(!this.MTH3154() && !this.FLD1562) {
            this.FLD1562 = true;
            this.MTH3153().postDelayed(this.FLD1560, v);
        }
    }

    public final void MTH3150(Object object0) {
        this.FLD1557.offer(object0);
    }

    public final void MTH3151() {
        if(this.FLD1556) {
            return;
        }
        try {
            CLS412.MTH6001(this.FLD1559);
            this.FLD1561 = null;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final Object MTH3152() {
        return this.FLD1557.poll();
    }

    public final Handler MTH3153() {
        if(!this.FLD1556) {
            try {
                if(this.FLD1559 == null || !this.FLD1559.isAlive()) {
                    HandlerThread handlerThread0 = new HandlerThread(CLS412.MTH5999("wx_da"));
                    this.FLD1559 = handlerThread0;
                    CLS412.MTH6000(handlerThread0);
                    this.FLD1561 = new Handler(this.FLD1559.getLooper());
                    return this.FLD1561;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return this.FLD1561;
    }

    public final boolean MTH3154() {
        return this.FLD1557.isEmpty();
    }

    public final void MTH3155() {
        if(!this.MTH3154() && !this.FLD1562) {
            this.FLD1562 = true;
            this.MTH3153().post(this.FLD1560);
        }
    }

    public final void MTH3156(long v) {
        if(this.FLD1563 == v) {
            return;
        }
        this.FLD1563 = v;
    }
}

