// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ˈˈ.CLS82;
import b.ⁱᵔ.CLS432;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;

public final class CLS968 implements CLS7, CLS16, CLS538, CLS539 {
    public final int FLD1892;
    public final CLS210 FLD1893;

    public CLS968(CLS210 ˋʼ0, int v) {
        this.FLD1892 = v;
        this.FLD1893 = ˋʼ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS210 ˋʼ0 = this.FLD1893;
        if(this.FLD1892 == 1) {
            ˋʼ0.getClass();
            try {
                if(TextUtils.isEmpty(s)) {
                    ˋʼ0.FLD2018.put("amount", 0);
                    return;
                }
                double f = Double.parseDouble(s);
                ˋʼ0.FLD2018.put("amount", ((int)(f * 100.0)));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        ˋʼ0.getClass();
        try {
            if(TextUtils.isEmpty(s)) {
                ˋʼ0.FLD2018.put("amount", 0);
                return;
            }
            double f1 = Double.parseDouble(s);
            ˋʼ0.FLD2018.put("amount", ((int)(f1 * 100.0)));
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }

    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        CLS210 ˋʼ0 = this.FLD1893;
        if(this.FLD1892 == 0) {
            String s = CLS34.MTH1074(new StringBuilder(), ˋʼ0.FLD1998, 4100600523134915381L);
            ˋʼ0.FLD2017.MTH922(((int)v), s);
            return;
        }
        String s1 = CLS34.MTH1074(new StringBuilder(), ˋʼ0.FLD1998, 4100627100392543029L);
        ˋʼ0.FLD2017.MTH922(((int)v), s1);
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS210 ˋʼ0 = this.FLD1893;
        switch(this.FLD1892) {
            case 5: {
                ˋʼ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS1205(ˋʼ0, s, 2)));
                }
                return;
            }
            case 6: {
                ˋʼ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS1205(ˋʼ0, s, 1)));
                }
                return;
            }
            case 7: {
                ˋʼ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    String s1 = CLS182.MTH3484(4100624321548702517L, new StringBuilder(), s);
                    ˋʼ0.FLD2007.MTH7277(s1);
                }
                return;
            }
            case 8: {
                ˋʼ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS1205(ˋʼ0, s, 4)));
                }
                return;
            }
            case 9: {
                ˋʼ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS1205(ˋʼ0, s, 3)));
                }
                return;
            }
            default: {
                ˋʼ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS1205(ˋʼ0, s, 0)));
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        CLS210 ˋʼ0 = this.FLD1893;
        if(this.FLD1892 == 4) {
            ˋʼ0.getClass();
            ˋʼ0.FLD2007.MTH7277("#voice " + ((CLS82)object0).FLD314);
            return;
        }
        ˋʼ0.getClass();
        String s = CLS182.MTH3489(4100625390995559221L, new StringBuilder(), object0);
        ˋʼ0.FLD2007.MTH7277(s);
    }
}

