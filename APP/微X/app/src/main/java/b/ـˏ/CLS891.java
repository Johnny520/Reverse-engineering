// Decompiled by JEB v5.42.0.202606242140

package b.ـˏ;

import b.ᵔʾ.CLS1229;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS518.CLS516;
import b.ⁱᵔ.CLS518;

public final class CLS891 implements CLS169 {
    public final String FLD1607;
    public int FLD1608;
    public final String FLD1609;
    public final String FLD1610;
    public byte[] FLD1611;
    public boolean FLD1612;

    public CLS891(String s, String s1, String s2, String s3) {
        this.FLD1611 = null;
        this.FLD1608 = -1;
        this.FLD1607 = s;
        this.FLD1610 = s1;
        this.FLD1609 = s2;
        this.FLD1612 = false;
        CLS518.MTH7068(s3, ((CLS516)new CLS1229(13, this)));
    }

    public CLS891(String s, String s1, String s2, byte[] arr_b) {
        this.FLD1608 = -1;
        this.FLD1612 = true;
        this.FLD1607 = s;
        this.FLD1610 = s1;
        this.FLD1609 = s2;
        this.FLD1611 = arr_b;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3228() {
        return 12;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3229() {
        return this.MTH3232() + 15000;
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3230(String s) {
        CLS466.MTH6520(s, this.FLD1610, this.FLD1609, this.FLD1607, this.FLD1611, "");
    }

    @Override  // b.ـˏ.CLS169
    public final boolean MTH3231() {
        return this.FLD1612;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3232() {
        int v = this.FLD1608;
        return v == -1 ? CLS412.MTH6005(3000, "send_delay_text") : v;
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3233(int v) {
        this.FLD1608 = v;
    }
}

