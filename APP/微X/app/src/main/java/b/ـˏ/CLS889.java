// Decompiled by JEB v5.42.0.202606242140

package b.ـˏ;

import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ⁱʾ.CLS1274;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS432;
import java.io.File;

public final class CLS889 implements CLS169 {
    public final long FLD1601;
    public final String FLD1602;
    public int FLD1603;
    public File FLD1604;

    public CLS889() {
        this.FLD1601 = 0L;
        this.FLD1603 = -1;
    }

    public CLS889(long v, String s) {
        this.FLD1603 = -1;
        this.FLD1602 = s;
        this.FLD1601 = v;
    }

    public CLS889(File file0) {
        this.FLD1601 = 0L;
        this.FLD1603 = -1;
        this.FLD1604 = file0;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3228() {
        return 3;
    }

    @Override  // b.ـˏ.CLS169
    public final int MTH3229() {
        String s;
        File file0 = this.FLD1604;
        if(file0 == null) {
            s = TextUtils.isEmpty(this.FLD1602) ? null : CLS66.MTH1498(this.FLD1602);
        }
        else {
            s = file0.getAbsolutePath();
        }
        long v = TextUtils.isEmpty(s) ? 0L : CLS31.MTH984(new CLS69(s));
        if(v == 0L) {
            v = 60000L;
        }
        return (int)(Math.max(v, 60000L) + ((long)(this.MTH3232() + 30000)));
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3230(String s) {
        try {
            String s1 = this.FLD1602;
            File file0 = this.FLD1604;
            if(file0 != null) {
                CLS66.MTH1389(file0.getAbsolutePath(), s);
                return;
            }
            if(!TextUtils.isEmpty(s1)) {
                CLS66.MTH1419(this.FLD1601, s1, s);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ـˏ.CLS169
    public final boolean MTH3231() {
        try {
            String s = this.FLD1602;
            File file0 = this.FLD1604;
            if(file0 != null) {
                return CLS31.MTH1015(file0);
            }
            if(!TextUtils.isEmpty(s)) {
                return CLS31.MTH1027(CLS66.MTH1498(s));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    @Override  // b.ـˏ.CLS169
    public final int MTH3232() {
        int v = this.FLD1603;
        return v == -1 ? CLS412.MTH6005(3000, "send_delay_video") : v;
    }

    public final void MTH3261(String s) {
        File file0 = new File(CLS31.MTH980());
        CLS432.MTH6184(file0.getAbsolutePath(), s, ((CLS3)new CLS1274(this, file0, 6)));
    }

    @Override  // b.ـˏ.CLS169
    public final void MTH3233(int v) {
        this.FLD1603 = v;
    }
}

