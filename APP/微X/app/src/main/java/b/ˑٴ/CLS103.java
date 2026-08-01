// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.יﹳ.CLS166;

public final class CLS103 implements MenuItem.OnMenuItemClickListener {
    public final int FLD576;
    public final Class FLD577;
    public final CLS770 FLD578;
    public final Object FLD579;

    public CLS103(CLS770 ٴʿ0, Class class0, Object object0, int v) {
        this.FLD576 = v;
        this.FLD578 = ٴʿ0;
        this.FLD577 = class0;
        this.FLD579 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        CLS770 ٴʿ0 = this.FLD578;
        Object object0 = this.FLD579;
        Class class0 = this.FLD577;
        if(this.FLD576 == 0) {
            ٴʿ0.getClass();
            try {
                String s = CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0})));
                if(CLS31.MTH1024(s)) {
                    ٴʿ0.MTH2586(s);
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return true;
        }
        ٴʿ0.getClass();
        try {
            String s1 = CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object0})));
            if(CLS31.MTH1024(s1)) {
                ٴʿ0.MTH2586(s1);
                return true;
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
        return true;
    }
}

