// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS82;
import b.ⁱʾ.CLS356.CLS354;
import b.ⁱʾ.CLS356;
import b.ⁱᵔ.CLS432;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS1624.CLS540;

public final class CLS939 implements CLS7, CLS16, CLS539, CLS540 {
    public final int FLD1772;
    public final CLS244 FLD1773;

    public CLS939(CLS244 ᴵʻ0, int v) {
        this.FLD1772 = v;
        this.FLD1773 = ᴵʻ0;
        super();
    }

    @Override  // b.ﾞˎ.CLS1624$CLS540
    public final void onQueryTextChange(String s) {
        CLS356 ⁱʾ0 = this.FLD1773.FLD2543;
        ⁱʾ0.getClass();
        new CLS354(ⁱʾ0).filter(s);
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS244 ᴵʻ0 = this.FLD1773;
        switch(this.FLD1772) {
            case 0: {
                ᴵʻ0.getClass();
                ᴵʻ0.FLD2552.MTH922(s, "autoreply_members");
                return;
            }
            case 2: {
                ᴵʻ0.getClass();
                try {
                    if(TextUtils.isEmpty(s)) {
                        ᴵʻ0.FLD2551.put("amount", 0);
                        return;
                    }
                    double f1 = Double.parseDouble(s);
                    ᴵʻ0.FLD2551.put("amount", ((int)(f1 * 100.0)));
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            default: {
                ᴵʻ0.getClass();
                try {
                    if(TextUtils.isEmpty(s)) {
                        ᴵʻ0.FLD2551.put("amount", 0);
                        return;
                    }
                    double f = Double.parseDouble(s);
                    ᴵʻ0.FLD2551.put("amount", ((int)(f * 100.0)));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS244 ᴵʻ0 = this.FLD1773;
        switch(this.FLD1772) {
            case 4: {
                ᴵʻ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS1080(ᴵʻ0, s, 1)));
                }
                return;
            }
            case 6: {
                ᴵʻ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS1080(ᴵʻ0, s, 0)));
                }
                return;
            }
            case 7: {
                ᴵʻ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS1080(ᴵʻ0, s, 3)));
                }
                return;
            }
            case 8: {
                ᴵʻ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS1080(ᴵʻ0, s, 4)));
                }
                return;
            }
            case 10: {
                ᴵʻ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    CLS432.MTH6173(s, ((CLS3)new CLS1080(ᴵʻ0, s, 2)));
                }
                return;
            }
            default: {
                ᴵʻ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    String s1 = CLS182.MTH3484(4100663135168156469L, new StringBuilder(), s);
                    ᴵʻ0.FLD2540.MTH7277(s1);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        CLS244 ᴵʻ0 = this.FLD1773;
        if(this.FLD1772 == 5) {
            ᴵʻ0.getClass();
            ᴵʻ0.FLD2540.MTH7277("#voice " + ((CLS82)object0).FLD314);
            return;
        }
        ᴵʻ0.getClass();
        String s = CLS182.MTH3489(4100659853813142325L, new StringBuilder(), object0);
        ᴵʻ0.FLD2540.MTH7277(s);
    }
}

