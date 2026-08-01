// Decompiled by JEB v5.42.0.202606242140

package b.ٴـ;

import android.content.Context;
import android.net.wifi.WifiManager.WifiLock;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS95;
import b.ـˏ.CLS168;
import b.ـˏ.CLS169;
import b.ـˏ.CLS886;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS502;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class CLS896 extends CLS171 {
    public static final class CLS170 {
        public final ArrayList FLD1627;
        public final int FLD1628;
        public final CLS169 FLD1629;
        public long FLD1630;

        public CLS170() {
            this.FLD1627 = new ArrayList();
            this.FLD1630 = 0L;
        }

        public CLS170(CLS169 ˆٴ0, int v) {
            this.FLD1627 = new ArrayList();
            this.FLD1630 = 0L;
            this.FLD1629 = ˆٴ0;
            this.FLD1628 = v;
        }

        // 此方法包含解密的字符串
        public CLS170(CLS169 ˆٴ0, int v, ArrayList arrayList0) {
            this(ˆٴ0, v);
            Iterator iterator0 = arrayList0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                this.FLD1627.add("");
            }
        }

        public CLS170(CLS169 ˆٴ0, String s) {
            this(ˆٴ0, 2);
            if(!TextUtils.isEmpty(s)) {
                List list0 = Arrays.asList(CLS502.MTH6941(s));
                this.FLD1627.addAll(list0);
            }
        }

        public CLS170(CLS169 ˆٴ0, String s, int v) {
            this(ˆٴ0, 3);
            if(!TextUtils.isEmpty(s)) {
                List list0 = Arrays.asList(CLS502.MTH6941(s));
                this.FLD1627.addAll(list0);
            }
        }
    }

    public final ArrayDeque FLD1631;
    public final ArrayList FLD1632;
    public final ArrayDeque FLD1633;

    public CLS896(String s) {
        super(s);
        this.FLD1633 = new ArrayDeque();
        this.FLD1631 = new ArrayDeque();
        this.FLD1632 = new ArrayList();
    }

    public final void MTH3324(CLS170 ˆٴ$ˆٴ0) {
        this.MTH3327(ˆٴ$ˆٴ0, false);
    }

    @Override  // b.ٴـ.CLS171
    public final void MTH3331() {
        CLS170 ˆٴ$ˆٴ0;
        ArrayDeque arrayDeque0 = this.FLD1644;
        if(!arrayDeque0.isEmpty()) {
            return;
        }
        ArrayList arrayList0 = this.FLD1632;
        if(!arrayList0.isEmpty()) {
            Iterator iterator0 = arrayList0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                ˆٴ$ˆٴ0 = (CLS170)object0;
                if(ˆٴ$ˆٴ0 != null) {
                    if(ˆٴ$ˆٴ0.FLD1630 == 0L) {
                        ˆٴ$ˆٴ0.FLD1630 = System.currentTimeMillis();
                    }
                    CLS169 ˆٴ0 = ˆٴ$ˆٴ0.FLD1629;
                    if(ˆٴ0.MTH3231()) {
                        iterator0.remove();
                        goto label_21;
                    }
                    if(System.currentTimeMillis() - ˆٴ$ˆٴ0.FLD1630 > 500000L) {
                        iterator0.remove();
                        CLS27.MTH906(("item not ready after timeout, removed, type: " + CLS168.MTH3227(ˆٴ0.MTH3228())));
                    }
                }
            }
        }
        ˆٴ$ˆٴ0 = null;
    label_21:
        if(ˆٴ$ˆٴ0 == null) {
            ˆٴ$ˆٴ0 = this.MTH3326(this.FLD1631);
            if(ˆٴ$ˆٴ0 == null) {
                ˆٴ$ˆٴ0 = this.MTH3326(this.FLD1633);
            }
        }
        if(ˆٴ$ˆٴ0 == null) {
            return;
        }
        CLS169 ˆٴ1 = ˆٴ$ˆٴ0.FLD1629;
        int v = ˆٴ1.MTH3228();
        int v1 = ˆٴ$ˆٴ0.FLD1628;
        int v2 = v != 13 || v1 == 3 ? -1 : CLS404.MTH5907();
        ArrayList arrayList1 = ˆٴ$ˆٴ0.FLD1627;
        for(int v3 = 0; v3 < arrayList1.size(); ++v3) {
            String s = (String)arrayList1.get(v3);
            if(v == 13 && v2 != -1 && v3 >= v2) {
                break;
            }
            if(ˆٴ1.MTH3228() == 2) {
                ++((CLS886)ˆٴ1).FLD1592;
            }
            arrayDeque0.add(new CLS95(ˆٴ1, v1, s));
        }
    }

    public final CLS170 MTH3326(ArrayDeque arrayDeque0) {
        if(arrayDeque0.isEmpty()) {
            return null;
        }
        CLS170 ˆٴ$ˆٴ0 = (CLS170)arrayDeque0.peekFirst();
        if(ˆٴ$ˆٴ0 != null) {
            if(ˆٴ$ˆٴ0.FLD1630 == 0L) {
                ˆٴ$ˆٴ0.FLD1630 = System.currentTimeMillis();
            }
            CLS169 ˆٴ0 = ˆٴ$ˆٴ0.FLD1629;
            if(ˆٴ0.MTH3231()) {
                return (CLS170)arrayDeque0.pollFirst();
            }
            if(System.currentTimeMillis() - ˆٴ$ˆٴ0.FLD1630 < 180000L) {
                return null;
            }
            if(System.currentTimeMillis() - ˆٴ$ˆٴ0.FLD1630 >= ((long)ˆٴ0.MTH3232())) {
                CLS170 ˆٴ$ˆٴ1 = (CLS170)arrayDeque0.poll();
                if(ˆٴ$ˆٴ1 != null) {
                    ˆٴ$ˆٴ1.FLD1630 = System.currentTimeMillis();
                    this.FLD1632.add(ˆٴ$ˆٴ1);
                }
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH3327(CLS170 ˆٴ$ˆٴ0, boolean z) {
        (z ? this.FLD1631 : this.FLD1633).addLast(ˆٴ$ˆٴ0);
        try {
            if(this.FLD1640 == null || !this.FLD1640.isAlive()) {
                HandlerThread handlerThread0 = new HandlerThread(CLS412.MTH5999(this.FLD1646));
                this.FLD1640 = handlerThread0;
                CLS412.MTH6000(handlerThread0);
                this.FLD1636 = new Handler(this.FLD1640.getLooper());
                this.FLD1635 = new Handler(this.FLD1640.getLooper());
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        if(!this.FLD1634) {
            this.FLD1634 = true;
            this.FLD1636.post(this.FLD1637);
            Context context0 = CLS27.MTH900();
            if(context0 != null) {
                try {
                    if(this.FLD1638 == null || !this.FLD1638.isHeld()) {
                        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
                        if(powerManager0 != null) {
                            PowerManager.WakeLock powerManager$WakeLock0 = powerManager0.newWakeLock(1, "X:send_proc");
                            this.FLD1638 = powerManager$WakeLock0;
                            powerManager$WakeLock0.acquire(5000L);
                        }
                    }
                    if(this.FLD1642 == null || !this.FLD1642.isHeld()) {
                        WifiManager wifiManager0 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
                        if(wifiManager0 != null) {
                            WifiManager.WifiLock wifiManager$WifiLock0 = wifiManager0.createWifiLock("X:send_proc");
                            this.FLD1642 = wifiManager$WifiLock0;
                            wifiManager$WifiLock0.acquire();
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
            }
        }
    }
}

