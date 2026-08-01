// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS40.CLS39;
import b.ˊﾞ.CLS100;
import b.ˊﾞ.CLS101;
import b.ﾞᐧ.CLS557;

public final class CLS1537 implements CLS39 {
    public final String FLD4769;
    public final int FLD4770;
    public final CLS7 FLD4771;
    public final int FLD4772;
    public final int FLD4773;

    public CLS1537(String s, int v, CLS7 יᐧ0, int v1, int v2) {
        this.FLD4769 = s;
        this.FLD4772 = v;
        this.FLD4771 = יᐧ0;
        this.FLD4773 = v1;
        this.FLD4770 = v2;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS557 ˆٴ0;
        String s = this.FLD4769;
        int v = this.FLD4772;
        CLS7 יᐧ0 = this.FLD4771;
        if(s.endsWith("wav")) {
            ˆٴ0 = new CLS557(s);
            יᐧ0.MTH784(CLS101.MTH1944(ˆٴ0, v));
        }
        else {
            ˆٴ0 = s.endsWith(".mp4") || s.endsWith(".mkv") ? CLS101.MTH1947(this.FLD4773, this.FLD4770, s) : new CLS100().MTH1941(((long)this.FLD4773), ((long)this.FLD4770), s);
        }
        if(ˆٴ0 != null) {
            יᐧ0.MTH784(CLS101.MTH1944(ˆٴ0, v));
        }
    }
}

