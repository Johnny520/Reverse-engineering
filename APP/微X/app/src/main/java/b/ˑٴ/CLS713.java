// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS34;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS434;
import b.ⁱᵔ.CLS502;
import java.util.HashMap;

public final class CLS713 implements CLS3 {
    public final CLS770 FLD845;
    public final long FLD846;
    public final String FLD847;
    public final HashMap FLD848;
    public final Object FLD849;

    public CLS713(CLS770 ٴʿ0, HashMap hashMap0, String s, Object object0, long v) {
        this.FLD845 = ٴʿ0;
        this.FLD848 = hashMap0;
        this.FLD847 = s;
        this.FLD849 = object0;
        this.FLD846 = v;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        CLS770 ٴʿ0 = this.FLD845;
        ٴʿ0.getClass();
        HashMap hashMap0 = this.FLD848;
        String s = (String)hashMap0.get(".msg.appmsg.backup");
        String s1 = "";
        if(!TextUtils.isEmpty(s) && CLS502.MTH6934(s, new String[]{";"})) {
            String[] arr_s = s.split(";");
            String s2 = arr_s[0];
            if(arr_s.length > 1) {
                s1 = arr_s[1];
            }
            hashMap0.put(".msg.appmsg.wcpayinfo.feedesc", s2);
            String s3 = CLS34.MTH1079(0x38EC53A92B3CD335L, new StringBuilder(), s2, 0x38EC53B32B3CD335L);
            String s4 = CLS502.MTH6932(CLS502.MTH6932(this.FLD847, "feedesc", s3), "pay_memo", "<![CDATA[" + s1 + "]]>");
            hashMap0.put(".msg.appmsg.wcpayinfo.pay_memo", s1);
            hashMap0.remove(".msg.appmsg.backup");
            String s5 = CLS434.MTH6192(hashMap0);
            CLS166.MTH3198(this.FLD849, "field_content", s4);
            CLS166.MTH3198(this.FLD849, "field_reserved", s5);
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("content", s4);
            contentValues0.put("reserved", s5);
            ٴʿ0.FLD1444.MTH5366(this.FLD846, contentValues0);
            ٴʿ0.FLD1447.MTH3012(ٴʿ0.FLD1447.FLD1434);
        }
    }
}

