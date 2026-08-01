// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS29;
import b.ˈˈ.CLS71;
import b.ᐧˉ.CLS182;
import b.ﾞˎ.CLS525;

public final class CLS1394 implements CLS7, CLS16, CLS378 {
    public final Activity FLD3951;
    public final boolean FLD3952;
    public final CLS29 FLD3953;

    public CLS1394(Activity activity0, CLS29 ˎᵢ0, boolean z) {
        this.FLD3951 = activity0;
        this.FLD3953 = ˎᵢ0;
        this.FLD3952 = z;
        super();
    }

    public CLS1394(CLS29 ˎᵢ0, boolean z, Activity activity0) {
        this.FLD3953 = ˎᵢ0;
        this.FLD3952 = z;
        this.FLD3951 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        ʻˑ0.MTH7187("add", ((CLS3)new CLS1293(this.FLD3951, this.FLD3953, this.FLD3952)));
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        CLS29 ˎᵢ0;
        String s1;
        if(!TextUtils.isEmpty(s)) {
            for(int v = 0; true; ++v) {
                StringBuilder stringBuilder0 = CLS182.MTH3483("regioncode_");
                stringBuilder0.append(v);
                s1 = stringBuilder0.toString();
                ˎᵢ0 = this.FLD3953;
                if(!ˎᵢ0.MTH928(s1)) {
                    break;
                }
            }
            ˎᵢ0.MTH922(s, s1);
            if(CLS395.FLD3768 != null && CLS395.FLD3768.isShowing()) {
                CLS395.FLD3768.dismiss();
            }
            CLS395.MTH5741(this.FLD3951, this.FLD3952);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        CLS71 ˆٴ0 = new CLS71(this.FLD3951, null);
        ˆٴ0.MTH1572("delete", ((CLS3)new CLS1602(this.FLD3951, this.FLD3953, ((String)object0), this.FLD3952, 0)));
        ˆٴ0.MTH1572("modify", ((CLS3)new CLS1602(this.FLD3951, this.FLD3953, ((String)object0), this.FLD3952, 1)));
        ˆٴ0.MTH1573();
    }
}

