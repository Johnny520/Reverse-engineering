// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import t.ˆʿ.CLS43;
import t.ⁱʾ.CLS145;
import t.ﾞᐧ.CLS338;
import t.ﾞᐧ.CLS345;

public final class CLS9 implements CompoundButton.OnCheckedChangeListener {
    public final CLS216 FLD130;
    public final CLS338 FLD131;
    public final CLS338 FLD132;
    public final CLS345 FLD133;
    public final CLS338 FLD134;

    public CLS9(CLS216 ˎﾞ0, CLS345 ﹳˊ0, CLS338 יᐧ0, CLS338 יᐧ1, CLS338 יᐧ2) {
        this.FLD130 = ˎﾞ0;
        this.FLD133 = ﹳˊ0;
        this.FLD132 = יᐧ0;
        this.FLD134 = יᐧ1;
        this.FLD131 = יᐧ2;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        this.FLD130.FLD236.MTH1805("DrawerBackgroundWhole", z);
        CLS43.MTH1431(z, new CLS145[]{this.FLD133, this.FLD132, this.FLD134});
        CLS43.MTH1431(!z, new CLS145[]{this.FLD131});
    }
}

