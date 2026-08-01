// Decompiled by JEB v5.42.0.202606242140

package b.ـˏ;

import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS412;

public final class CLS892 implements CLS169 {
    public final String FLD1613;
    public final long FLD1614;
    public final byte[] FLD1615;
    public int FLD1616;

    public CLS892(String s, byte[] arr_b) {
        this.FLD1614 = 0L;
        this.FLD1616 = -1;
        this.FLD1613 = s;
        this.FLD1615 = arr_b;
    }

    public CLS892(String s, byte[] arr_b, long v) {
        this(s, arr_b);
        this.FLD1614 = v;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3228() {
        return 4;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3229() {
        return this.MTH3232() + 15000;
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3230(String s) {
        CLS66.MTH1486(s, this.FLD1613, this.FLD1615, this.FLD1614);
    }

    @Override  // b.ـˏ.CLS169
    public final boolean MTH3231() {
        return true;
    }

    // 此方法包含解密的字符串
    @Override  // b.ـˏ.CLS169
    public final int MTH3232() {
        int v = this.FLD1616;
        return v == -1 ? CLS412.MTH6005(3000, "send_delay_text") : v;
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3233(int v) {
        this.FLD1616 = v;
    }
}

