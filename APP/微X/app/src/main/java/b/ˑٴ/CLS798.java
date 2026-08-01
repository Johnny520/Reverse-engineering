// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS34;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS434;
import b.ⁱᵔ.CLS502;
import java.util.HashMap;

public final class CLS798 implements CLS16 {
    public final CLS770 FLD1175;
    public final Object FLD1176;
    public final String FLD1177;
    public final String FLD1178;
    public final HashMap FLD1179;
    public final long FLD1180;

    public CLS798(CLS770 ٴʿ0, String s, String s1, HashMap hashMap0, Object object0, long v) {
        this.FLD1175 = ٴʿ0;
        this.FLD1178 = s;
        this.FLD1177 = s1;
        this.FLD1179 = hashMap0;
        this.FLD1176 = object0;
        this.FLD1180 = v;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        String s2;
        String s1;
        CLS770 ٴʿ0 = this.FLD1175;
        ٴʿ0.getClass();
        if(CLS502.MTH6934(s, new String[]{"#"})) {
            String[] arr_s = s.split("#");
            s1 = arr_s[0];
            s2 = arr_s[1];
        }
        else {
            s1 = s.trim();
            s2 = "";
        }
        if(!TextUtils.isEmpty(s1)) {
            try {
                Double.parseDouble(s1);
            }
            catch(Throwable unused_ex) {
                return;
            }
            String s3 = CLS34.MTH1079(0x38EC52922B3CD335L, new StringBuilder(), s1, 0x38EC529D2B3CD335L);
            String s4 = CLS502.MTH6932(this.FLD1178, "feedesc", s3);
            String s5 = this.FLD1177;
            HashMap hashMap0 = this.FLD1179;
            if(!s2.equals(s5)) {
                s4 = CLS502.MTH6932(s4, "pay_memo", "<![CDATA[" + s2 + "]]>");
                hashMap0.put(".msg.appmsg.wcpayinfo.pay_memo", s2);
            }
            if(!hashMap0.containsKey(".msg.appmsg.backup")) {
                hashMap0.put(".msg.appmsg.backup", CLS182.MTH3484(0x38EC53082B3CD335L, CLS182.MTH3483(((String)hashMap0.get(".msg.appmsg.wcpayinfo.feedesc"))), s5));
            }
            hashMap0.put(".msg.appmsg.wcpayinfo.feedesc", "￥" + s1);
            String s6 = CLS434.MTH6192(hashMap0);
            CLS166.MTH3198(this.FLD1176, "field_content", s4);
            CLS166.MTH3198(this.FLD1176, "field_reserved", s6);
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("content", s4);
            contentValues0.put("reserved", s6);
            ٴʿ0.FLD1444.MTH5366(this.FLD1180, contentValues0);
            ٴʿ0.FLD1447.MTH3012(ٴʿ0.FLD1447.FLD1434);
        }
    }
}

