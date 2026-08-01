// Decompiled by JEB v5.42.0.202606242140

package b.ٴـ;

import android.net.wifi.WifiManager.WifiLock;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager.WakeLock;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS95;
import b.יﹳ.CLS166;
import b.ـˏ.CLS169;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS412;
import java.util.ArrayDeque;
import java.util.HashSet;

public abstract class CLS171 {
    public boolean FLD1634;
    public Handler FLD1635;
    public Handler FLD1636;
    public final CLS172 FLD1637;
    public PowerManager.WakeLock FLD1638;
    public final HashSet FLD1639;
    public HandlerThread FLD1640;
    public final CLS172 FLD1641;
    public WifiManager.WifiLock FLD1642;
    public final HashSet FLD1643;
    public final ArrayDeque FLD1644;
    public final HashSet FLD1645;
    public final String FLD1646;

    public CLS171(String s) {
        this.FLD1646 = s;
        this.FLD1644 = new ArrayDeque();
        this.FLD1643 = new HashSet();
        this.FLD1639 = new HashSet();
        this.FLD1645 = new HashSet();
        this.FLD1637 = new CLS172(this, 0);
        this.FLD1641 = new CLS172(this, 1);
    }

    // 此方法包含解密的字符串
    public final void MTH3329(long v, int v1) {
        long v2;
        Handler handler0;
        HashSet hashSet0 = this.FLD1643;
        if(!hashSet0.contains(v)) {
            return;
        }
        hashSet0.remove(v);
        if(!hashSet0.isEmpty()) {
            return;
        }
        if(v1 == 5) {
            String s = (String)CLS166.MTH3194(CLS66.MTH1495(v), "field_talker");
            if(CLS21.FLD76.MTH830("isZombie", new Object[]{s})) {
                this.FLD1645.add(s);
            }
        }
        CLS172 ᵔʾ0 = this.FLD1637;
        this.FLD1636.removeCallbacks(ᵔʾ0);
        ArrayDeque arrayDeque0 = this.FLD1644;
        CLS95 ⁱᵔ0 = (CLS95)arrayDeque0.peek();
        if(ⁱᵔ0 != null) {
            handler0 = this.FLD1636;
            v2 = (long)ⁱᵔ0.MTH1759();
            handler0.postDelayed(ᵔʾ0, v2);
            return;
        }
        this.MTH3331();
        v2 = 1000L;
        if(arrayDeque0.isEmpty()) {
            handler0 = this.FLD1636;
            handler0.postDelayed(ᵔʾ0, v2);
            return;
        }
        CLS95 ⁱᵔ1 = (CLS95)arrayDeque0.peek();
        if(ⁱᵔ1 == null) {
            this.FLD1636.postDelayed(ᵔʾ0, 1000L);
            return;
        }
        this.FLD1636.postDelayed(ᵔʾ0, ((long)ⁱᵔ1.MTH1759()));
    }

    // 此方法包含解密的字符串
    public final void MTH3330() {
        long v3;
        CLS29 ˎᵢ0;
        this.FLD1634 = true;
        this.MTH3331();
        ArrayDeque arrayDeque0 = this.FLD1644;
        CLS172 ᵔʾ0 = this.FLD1641;
        CLS172 ᵔʾ1 = this.FLD1637;
        if(arrayDeque0.isEmpty()) {
            this.FLD1635.removeCallbacks(ᵔʾ0);
            if(!((CLS896)this).FLD1633.isEmpty() || !((CLS896)this).FLD1632.isEmpty() || !((CLS896)this).FLD1631.isEmpty()) {
                this.FLD1636.postDelayed(ᵔʾ1, 1000L);
            }
            else {
                this.FLD1634 = false;
                if(this.FLD1638 != null && this.FLD1638.isHeld()) {
                    this.FLD1638.release();
                }
                if(this.FLD1642 != null && this.FLD1642.isHeld()) {
                    this.FLD1642.release();
                    return;
                }
            }
            return;
        }
        CLS95 ⁱᵔ0 = (CLS95)arrayDeque0.peek();
        if(ⁱᵔ0 == null) {
            arrayDeque0.poll();
            this.FLD1636.postDelayed(ᵔʾ1, 1000L);
            return;
        }
        int v1 = ⁱᵔ0.FLD407;
        int v2 = v1 == 2 ? CLS412.MTH6005(5, "mass_send_max_items") : 1;
        if(ⁱᵔ0.MTH1760() == 1) {
            v2 = Math.min(v2, 2);
        }
        if(v1 == 3) {
            switch(ⁱᵔ0.MTH1760()) {
                case 1: {
                    v2 = 1;
                    break;
                }
                case 3: 
                case 13: {
                    v2 = 3;
                    break;
                }
                default: {
                    v2 = 10;
                }
            }
        }
        if(v1 == 0 || v1 == 1) {
            switch(ⁱᵔ0.MTH1760()) {
                case 1: {
                    ˎᵢ0 = CLS27.MTH895();
                    v3 = 0x38EB6F6A2B3CD335L;
                    break;
                }
                case 2: {
                    ˎᵢ0 = CLS27.MTH895();
                    v3 = 0x38EB6F772B3CD335L;
                    break;
                }
                case 3: {
                    ˎᵢ0 = CLS27.MTH895();
                    v3 = 4101494327304049461L;
                    break;
                }
                case 13: {
                    ˎᵢ0 = CLS27.MTH895();
                    v3 = 0x38EB6F4E2B3CD335L;
                    break;
                }
                default: {
                    ˎᵢ0 = CLS27.MTH895();
                    v3 = 0x38EB6F052B3CD335L;
                }
            }
            v2 = ˎᵢ0.MTH927(1, CLS370.MTH5289(v3));
        }
        int v4 = Math.min(v2, arrayDeque0.size()) == 0 ? arrayDeque0.size() : Math.min(v2, arrayDeque0.size());
        int v5 = 0;
        for(int v = 0; v < v4; ++v) {
            CLS95 ⁱᵔ1 = (CLS95)arrayDeque0.poll();
            if(ⁱᵔ1 != null) {
                CLS169 ˆٴ0 = ⁱᵔ1.FLD405;
                if(ˆٴ0.MTH3231()) {
                    String s = ⁱᵔ1.FLD406;
                    if(!this.FLD1645.contains(s)) {
                        this.FLD1639.add(s);
                        try {
                            ˆٴ0.MTH3230(s);
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                        ++v5;
                    }
                }
            }
        }
        if(v5 == 0) {
            this.FLD1636.postDelayed(ᵔʾ1, 1000L);
            return;
        }
        int v6 = ⁱᵔ0.FLD405.MTH3229();
        this.FLD1635.removeCallbacks(ᵔʾ0);
        this.FLD1635.postDelayed(ᵔʾ0, ((long)v6) * ((long)v5));
    }

    public abstract void MTH3331();
}

