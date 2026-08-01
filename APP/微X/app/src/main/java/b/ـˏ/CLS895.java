// Decompiled by JEB v5.42.0.202606242140

package b.ـˏ;

import b.ʾᵢ.CLS31;
import b.ˆٴ.CLS66;
import b.ⁱᵔ.CLS412;
import java.io.File;

public final class CLS895 implements CLS169 {
    public int FLD1625;
    public String FLD1626;

    public CLS895() {
        this.FLD1625 = -1;
    }

    public CLS895(File file0) {
        this(file0.getAbsolutePath());
    }

    public CLS895(String s) {
        this.FLD1625 = -1;
        this.FLD1626 = s;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3228() {
        return 10;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3229() {
        return this.MTH3232() + 30000;
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3230(String s) {
        CLS66.MTH1385(s, this.FLD1626);
    }

    @Override  // b.ـˏ.CLS169
    public final boolean MTH3231() {
        return CLS31.MTH1024(this.FLD1626);
    }

    // 此方法包含解密的字符串
    @Override  // b.ـˏ.CLS169
    public final int MTH3232() {
        int v = this.FLD1625;
        return v == -1 ? CLS412.MTH6005(3000, "send_delay_text") : v;
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3233(int v) {
        this.FLD1625 = v;
    }
}

