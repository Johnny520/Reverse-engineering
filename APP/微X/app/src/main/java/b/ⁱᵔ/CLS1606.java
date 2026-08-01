// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS575;
import b.ˆٴ.CLS66;
import b.ᐧˉ.CLS182;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629.CLS548;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;
import java.util.HashMap;
import org.json.JSONObject;

public final class CLS1606 implements CLS13, CLS17, CLS39, CLS516, CLS548 {
    public final int FLD5088;
    public final Object FLD5089;
    public final Object FLD5090;

    public CLS1606(Object object0, Object object1, int v) {
        this.FLD5088 = v;
        this.FLD5090 = object0;
        this.FLD5089 = object1;
        super();
    }

    public CLS1606(String s, CLS3 ˆٴ0) {
        this.FLD5088 = 3;
        super();
        this.FLD5089 = s;
        this.FLD5090 = ˆٴ0;
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        Object object0 = this.FLD5090;
        Object object1 = this.FLD5089;
        if(this.FLD5088 == 3) {
            if(CLS432.MTH6181(((String)object1))) {
                ((CLS3)object0).getClass();
                CLS575 ⁱᵔ0 = new CLS575(((CLS3)object0), 6);
                CLS40.FLD157.MTH1116(((CLS39)ⁱᵔ0));
            }
            return;
        }
        ((CLS13)object0).MTH770(((String)object1));
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        JSONObject jSONObject0 = (JSONObject)this.FLD5090;
        CLS1625 ـˏ0 = (CLS1625)this.FLD5089;
        try {
            switch(s) {
                case "not_show_selected": {
                    jSONObject0.put("shareType", 3);
                    break;
                }
                case "only_selected": {
                    jSONObject0.put("shareType", 2);
                    break;
                }
                case "private": {
                    jSONObject0.put("shareType", 1);
                    ـˏ0.MTH801(8);
                    return;
                }
                case "public": {
                    jSONObject0.put("shareType", 0);
                    ـˏ0.MTH801(8);
                    return;
                }
                default: {
                    return;
                }
            }
            ـˏ0.MTH801(0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ʻˑ.CLS13
    public final void MTH770(String s) {
        String s1 = (String)this.FLD5089;
        if(!TextUtils.isEmpty(s)) {
            CLS466.MTH6522(s, CLS66.MTH1451(this.FLD5090), s1);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Object object0 = this.FLD5089;
        Object object1 = this.FLD5090;
        if(this.FLD5088 == 0) {
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_phone"), "phone");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_neigbor"), "neigbor");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_qq"), "qq");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_qq_friend"), "qq_friend");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_email"), "email");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_request"), "request");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_verify"), "verify");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_friendcard"), "friendcard");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_radar"), "radar");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_scan"), "scan");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_chatroom"), "chatroom");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_public_account"), "public_account");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_lbsroom"), "lbsroom");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_mobile_number"), "mobile_number");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("req_unknown"), "unknown");
            ((CLS1629)object1).MTH7372(CLS27.MTH889("unchanged"), "");
            ((CLS1629)object1).MTH7375(((String)object0));
            CLS523.MTH7147(linearLayout0, ((CLS18)(((CLS1629)object1))), true);
            return;
        }
        LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
        CLS1626 ـﹳ0 = new CLS1626(((Activity)object1));
        ـﹳ0.FLD5295 = false;
        CLS1635 ﾞᵎ0 = new CLS1635(((Activity)object1));
        ﾞᵎ0.MTH800(CLS27.MTH889("random_fake_comments"));
        ﾞᵎ0.MTH7437(((CLS29)object0).MTH938("random_fake_comments", true));
        ﾞᵎ0.MTH7438(new CLS373(((CLS29)object0), 8));
        CLS1635 ﾞᵎ1 = new CLS1635(((Activity)object1));
        ﾞᵎ1.MTH800(CLS27.MTH889("save_comments"));
        ﾞᵎ1.MTH7437(((CLS29)object0).MTH938("save_comments", false));
        ﾞᵎ1.MTH7438(new CLS373(((CLS29)object0), 9));
        CLS1625 ـˏ0 = new CLS1625(((Activity)object1));
        ـˏ0.MTH800(CLS27.MTH889("add_comment"));
        CLS443.FLD4310 = "";
        if(((CLS29)object0).MTH938("save_comments", false)) {
            String s = ((CLS29)object0).MTH925("fake_comments", "");
            CLS443.FLD4310 = s;
            ـﹳ0.MTH800(s.replaceAll("\\|", "\n"));
        }
        ـˏ0.MTH7320(new CLS375(((Activity)object1), ـﹳ0, 0));
        CLS1623 יᐧ0 = new CLS1623(((Activity)object1));
        CLS182.MTH3498(יᐧ0, new Object[]{ـﹳ0, ﾞᵎ0, ﾞᵎ1, ـˏ0}, 10, linearLayout1, יᐧ0);
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS518$CLS516
    public final void MTH7045(Bitmap bitmap0) {
        HashMap hashMap0 = (HashMap)this.FLD5090;
        CLS12 ᵔʾ0 = (CLS12)this.FLD5089;
        hashMap0.put("thumbData", CLS518.MTH7054(bitmap0));
        if(ᵔʾ0 != null) {
            try {
                ᵔʾ0.MTH791(hashMap0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

