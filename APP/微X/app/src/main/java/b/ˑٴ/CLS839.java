// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS60;
import b.ˆٴ.CLS66;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS502;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS839 extends CLS140 {
    public boolean FLD1301;
    public final ArrayList FLD1302;
    public String FLD1303;
    public CLS60 FLD1304;
    public final HashSet FLD1305;
    public final ArrayDeque FLD1306;
    public final ArrayDeque FLD1307;

    public CLS839(CLS139 ﹶʼ0) {
        super(ﹶʼ0);
        this.FLD1305 = new HashSet();
        this.FLD1307 = new ArrayDeque();
        this.FLD1306 = new ArrayDeque();
        this.FLD1302 = new ArrayList();
    }

    // 此方法包含解密的字符串
    public final void MTH2899(String s) {
        CLS27.MTH906("aam finish");
        if(this.FLD1307.isEmpty()) {
            CLS412.MTH6014(((CLS140)this).MTH3042(), CLS27.MTH889("stop") + CLS27.MTH889("aam"));
        }
        CLS29 ˎᵢ0 = this.FLD1445;
        String s1 = ˎᵢ0.MTH925("$aam_msg", "");
        if(!TextUtils.isEmpty(s1)) {
            CLS27.MTH906(("announce: " + s1));
            CLS66.MTH1376(s, s1);
        }
        String s2 = ˎᵢ0.MTH925("$aam_owner_tag", "");
        CLS371 ʻ0 = this.FLD1444;
        ArrayList arrayList0 = ʻ0.MTH5328(s2);
        if(arrayList0.isEmpty()) {
            return;
        }
        String s3 = (String)arrayList0.get(0);
        if(!ʻ0.MTH5337(s, s3)) {
            return;
        }
        CLS27.MTH906(("transfer to: " + s3));
        Class class0 = CLS27.MTH894("chatroomTransferClass");
        if(class0 != null && !TextUtils.isEmpty(s) && !TextUtils.isEmpty(s3)) {
            try {
                CLS66.MTH1521(CLS166.MTH3188(class0, new Object[]{s, s3}));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    public final CLS60 MTH2900() {
        if(this.FLD1304 == null) {
            this.FLD1304 = new CLS60(CLS27.MTH900());
        }
        return this.FLD1304;
    }

    // 此方法包含解密的字符串
    public final void MTH2901(String s, String s1) {
        if(!this.FLD1447.FLD1438.MTH6895("f_keyword_remark")) {
            return;
        }
        CLS29 ˎᵢ0 = this.FLD1445;
        String s2 = ˎᵢ0.MTH925("keyword_remark", "");
        if(TextUtils.isEmpty(s2)) {
            return;
        }
        String s3 = ˎᵢ0.MTH925("keyword_remark_newremark", "");
        if(TextUtils.isEmpty(s3)) {
            return;
        }
        if(CLS502.MTH6930(s2, s)) {
            CLS372.MTH5408(s1, s3);
        }
    }

    public final void MTH2902(int v, ArrayList arrayList0) {
        if(v < 0) {
            return;
        }
        int v1 = v - arrayList0.size();
        if(v1 < 0) {
            return;
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            ArrayDeque arrayDeque0 = this.FLD1307;
            if(arrayDeque0.isEmpty()) {
                break;
            }
            String s = (String)arrayDeque0.poll();
            if(!TextUtils.isEmpty(s)) {
                arrayList0.add(s);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        ʾᵢ0.MTH828("startAAM", ((CLS35)new CLS659(this, 0)));
        ʾᵢ0.MTH828("oncreate_chatroom", ((CLS35)new CLS659(this, 1)));
        ʾᵢ0.MTH828("on_add_chatroom_member", ((CLS35)new CLS659(this, 2)));
        ʾᵢ0.MTH828("oncreate_chatroom_err", ((CLS35)new CLS659(this, 3)));
        ʾᵢ0.MTH828("a.async.sqldb.insert", ((CLS35)new CLS659(this, 4)));
        ʾᵢ0.MTH828("transfer_money_received", ((CLS35)new CLS659(this, 5)));
        ʾᵢ0.MTH828("red_packet_received", ((CLS35)new CLS659(this, 6)));
        ʾᵢ0.MTH828("mass_invite_chatrooms", ((CLS35)new CLS659(this, 7)));
        ʾᵢ0.MTH828("mass_del_random", ((CLS35)new CLS659(this, 8)));
    }

    // 此方法包含解密的字符串
    public final String MTH2904() {
        String s;
        do {
            s = (String)this.FLD1306.poll();
            if(TextUtils.isEmpty(s)) {
                break;
            }
            String[] arr_s = CLS502.MTH6941(this.FLD1444.MTH5335(s));
            int v = this.FLD1445.MTH927(39, "$aam_tm");
        }
        while(arr_s.length >= v);
        CLS27.MTH906(("next chatroom: " + s));
        return s;
    }

    // 此方法包含解密的字符串
    public final void MTH2905() {
        CLS758 ـˋ0 = new CLS758(this, 1);
        long v = (long)this.FLD1445.MTH927(5000, "$aam_md");
        CLS40.FLD157.MTH1123(((CLS39)ـˋ0), v);
    }
}

