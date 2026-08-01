// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS534.CLS533;

public final class CLS1052 implements CLS39, CLS378, CLS379, CLS533, CLS538, CLS539 {
    public final int FLD2247;
    public final CLS931 FLD2248;

    public CLS1052(CLS931 ʼﹳ0, int v) {
        this.FLD2247 = v;
        this.FLD2248 = ʼﹳ0;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        this.FLD2248.FLD1733.clear();
        CLS371.FLD3470.MTH5308(this.FLD2248.FLD2157, this.FLD2248.FLD1733);
    }

    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        this.FLD2248.getClass();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS931 ʼﹳ0 = this.FLD2248;
        ʼﹳ0.getClass();
        try {
            if(!TextUtils.isEmpty(s)) {
                Integer integer0 = Integer.valueOf(s);
                ʼﹳ0.FLD2151.MTH922(integer0, "mass_send_max_items");
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS534$CLS533
    public final void MTH7225(int v, String s) {
        CLS931 ʼﹳ0 = this.FLD2248;
        ʼﹳ0.getClass();
        if(s.equals(CLS27.MTH889("empty"))) {
            s = "";
        }
        ʼﹳ0.FLD2151.MTH922(s, "watermark_img");
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        CLS931 ʼﹳ0 = this.FLD2248;
        if(this.FLD2247 == 2) {
            ʼﹳ0.getClass();
            ʼﹳ0.FLD2151.MTH922(((int)v), "mass_send_delay");
            return;
        }
        ʼﹳ0.getClass();
        ʼﹳ0.FLD2151.MTH922(((int)v), "mass_send_delay2");
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        this.FLD2248.getClass();
        String s = (String)CLS21.FLD76.MTH815("getNotice", new Object[0]);
        CLS1626 ـﹳ0 = new CLS1626(((CLS219)this.FLD2248).MTH3883());
        ـﹳ0.MTH798(s);
        ـﹳ0.FLD5295 = false;
        CLS523.MTH7154(linearLayout0, ((CLS18)ـﹳ0), CLS523.MTH7137(10));
        if(TextUtils.isEmpty(s)) {
            ـﹳ0.MTH801(8);
        }
    }
}

