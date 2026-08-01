// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.app.Activity;
import android.content.Intent;
import t.ˆʿ.CLS29;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS56;
import t.ˑٴ.CLS114;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS143;

public final class CLS324 implements CLS143 {
    public final int FLD1063;
    public final String FLD1064;
    public final CLS309 FLD1065;

    public CLS324(CLS309 ʽﹶ0, String s, int v) {
        this.FLD1063 = v;
        this.FLD1065 = ʽﹶ0;
        this.FLD1064 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        long v;
        String s = this.FLD1064;
        CLS309 ʽﹶ0 = this.FLD1065;
        if(this.FLD1063 == 0) {
            ʽﹶ0.getClass();
            Intent intent0 = new Intent();
            intent0.putExtra("fromChatting", true);
            if(CLS29.MTH1326(s)) {
                intent0.putExtra("Is_Chatroom", true);
                intent0.putExtra("Chat_User", s);
                intent0.putExtra("RoomInfo_Id", s);
                v = 0xFFFF4C942B3CF2B7L;
            }
            else {
                intent0.putExtra("Single_Chat_Talker", s);
                v = 0xFFFF4C722B3CF2B7L;
            }
            ʽﹶ0.MTH2222(intent0, CLS133.MTH2115(CLS114.MTH1900(v)));
            return;
        }
        Activity activity0 = ((CLS155)ʽﹶ0).MTH2306();
        try {
            Intent intent1 = new Intent();
            intent1.putExtra("sns_userName", s);
            if(!CLS33.MTH1349("sns", ".ui.SnsUserUI", intent1)) {
                intent1.setClassName(CLS56.MTH1484(activity0), CLS133.MTH2115("SnsUserUI"));
                activity0.startActivity(intent1);
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }
}

