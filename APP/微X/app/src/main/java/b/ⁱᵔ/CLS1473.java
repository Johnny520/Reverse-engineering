// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS534.CLS533;
import b.ﾞˎ.CLS556.CLS555;

public final class CLS1473 implements CLS533, CLS538, CLS539, CLS555 {
    public final int FLD4393;
    public final CLS29 FLD4394;

    public CLS1473(CLS29 ˎᵢ0, int v) {
        this.FLD4393 = v;
        this.FLD4394 = ˎᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS29 ˎᵢ0 = this.FLD4394;
        int v = 60;
        if(this.FLD4393 == 1) {
            if(!TextUtils.isEmpty(s)) {
                try {
                    v = Integer.parseInt(s);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                ˎᵢ0.MTH922(v, "mp3_split");
            }
            return;
        }
        if(!TextUtils.isEmpty(s)) {
            try {
                v = Integer.parseInt(s);
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
            ˎᵢ0.MTH922(v, "mp3_split");
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS534$CLS533
    public final void MTH7225(int v, String s) {
        if(s.equals(CLS27.MTH889("empty"))) {
            s = "";
        }
        this.FLD4394.MTH922(s, "watermark_img");
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        CLS29 ˎᵢ0 = this.FLD4394;
        if(this.FLD4393 == 5) {
            ˎᵢ0.MTH922(((int)v), "mass_friend_acc_delay");
            return;
        }
        ˎᵢ0.MTH922(((int)v), "nearby_friend_accept_delay");
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS556$CLS555
    public final void MTH7428(int v, String s) {
        CLS29 ˎᵢ0 = this.FLD4394;
        if(this.FLD4393 == 3) {
            ˎᵢ0.MTH922(s, "chatroom_container_toolbar_color");
            return;
        }
        ˎᵢ0.MTH922(s, "chatroom_container_toolbar_text_color");
    }
}

