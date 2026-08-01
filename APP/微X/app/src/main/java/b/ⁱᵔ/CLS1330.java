// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS8;

public final class CLS1330 implements CLS11 {
    public final CLS8 FLD3692;
    public final ContentValues FLD3693;

    public CLS1330(CLS8 ـˏ0, ContentValues contentValues0) {
        this.FLD3692 = ـˏ0;
        this.FLD3693 = contentValues0;
        super();
    }

    @Override  // b.ʻˑ.CLS11
    public final void MTH789() {
    }

    // 去混淆评级： 低(35)
    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS11
    public final void MTH790() {
        CLS8 ـˏ0 = this.FLD3692;
        if(ـˏ0 != null) {
            ـˏ0.MTH786(this.FLD3693.getAsInteger("startH") + ":" + this.FLD3693.getAsInteger("startM") + ";" + this.FLD3693.getAsInteger("endH") + ":" + this.FLD3693.getAsInteger("endM"));
        }
    }
}

