// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;

public final class CLS1107 implements CLS538, CLS539 {
    public final int FLD2434;
    public final String FLD2435;
    public final CLS1019 FLD2436;

    public CLS1107(CLS1019 ˎʻ0, String s, int v) {
        this.FLD2434 = v;
        this.FLD2436 = ˎʻ0;
        this.FLD2435 = s;
        super();
    }

    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        int v = 0;
        String s1 = this.FLD2435;
        CLS1019 ˎʻ0 = this.FLD2436;
        switch(this.FLD2434) {
            case 1: {
                ˎʻ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    v = Integer.parseInt(s);
                }
                String s3 = CLS182.MTH3475(0x38E8AAFF2B3CD335L, CLS182.MTH3483(s1));
                ˎʻ0.FLD2151.MTH922(v, s3);
                return;
            }
            case 2: {
                String s4 = CLS182.MTH3475(4100715357675508533L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s4);
                return;
            }
            case 3: {
                String s5 = CLS182.MTH3475(4100693633730925365L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s5);
                return;
            }
            case 5: {
                ˎʻ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    v = Integer.parseInt(s);
                }
                String s6 = CLS182.MTH3475(4100693796939682613L, CLS182.MTH3483(s1));
                ˎʻ0.FLD2151.MTH922(v, s6);
                return;
            }
            default: {
                String s2 = CLS182.MTH3475(4100693135514719029L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s2);
            }
        }
    }

    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        String s = this.FLD2435;
        CLS1019 ˎʻ0 = this.FLD2436;
        if(this.FLD2434 == 0) {
            String s1 = CLS182.MTH3475(4100715778582303541L, CLS182.MTH3482(ˎʻ0, s));
            ˎʻ0.FLD2151.MTH922(Long.toHexString(v), s1);
            return;
        }
        String s2 = CLS182.MTH3475(0x38E8970D2B3CD335L, CLS182.MTH3482(ˎʻ0, s));
        ˎʻ0.FLD2151.MTH922(Long.toHexString(v), s2);
    }
}

