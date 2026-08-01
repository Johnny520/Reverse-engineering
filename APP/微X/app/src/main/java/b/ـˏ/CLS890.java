// Decompiled by JEB v5.42.0.202606242140

package b.ـˏ;

import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS412;

public final class CLS890 implements CLS169 {
    public final long FLD1605;
    public int FLD1606;

    public CLS890(long v) {
        this.FLD1605 = v;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3228() {
        return 5;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3229() {
        return this.MTH3232() + 15000;
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3230(String s) {
        try {
            Object object0 = CLS66.MTH1495(this.FLD1605);
            CLS66.MTH1382(CLS27.MTH900(), object0, s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ـˏ.CLS169
    public final boolean MTH3231() {
        return true;
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    @Override  // b.ـˏ.CLS169
    public final int MTH3232() {
        return this.FLD1606 == -1 ? -1 : CLS412.MTH6005(3000, "send_delay_text");
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3233(int v) {
        this.FLD1606 = v;
    }
}

