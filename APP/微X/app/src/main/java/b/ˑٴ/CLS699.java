// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆʿ.CLS61;
import b.ⁱᵔ.CLS426;
import java.util.HashMap;

public final class CLS699 implements CLS39 {
    public final CLS794 FLD804;
    public final boolean FLD805;
    public final String FLD806;
    public final HashMap FLD807;
    public final boolean FLD808;

    public CLS699(CLS794 ᴵʽ0, HashMap hashMap0, String s, boolean z, boolean z1) {
        this.FLD804 = ᴵʽ0;
        this.FLD807 = hashMap0;
        this.FLD806 = s;
        this.FLD808 = z;
        this.FLD805 = z1;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS794 ᴵʽ0 = this.FLD804;
        ᴵʽ0.getClass();
        HashMap hashMap0 = this.FLD807;
        String s = (String)hashMap0.get(".sysmsg.delchatroommember.link.memberlist.username");
        if(!TextUtils.isEmpty(s)) {
            String s1 = (String)hashMap0.get(".sysmsg.delchatroommember.plain");
            String s2 = "";
            String s3 = this.FLD806;
            ContentValues contentValues0 = CLS426.MTH6111(s3, s1);
            if(contentValues0 != null) {
                s2 = contentValues0.getAsString("inviter_id");
            }
            CLS61 ﾞٴ0 = CLS794.MTH2698();
            if(!TextUtils.isEmpty(s) && ᴵʽ0.FLD1444.MTH5337(s3, s)) {
                if(this.FLD808 && !TextUtils.isEmpty(s2) && !s2.equals(CLS27.MTH904()) && !CLS426.MTH6118(s3, s2) && !ﾞٴ0.MTH1302(s3, s2)) {
                    CLS794.MTH2689(s3, CLS27.MTH889("mod_invite_only"));
                    CLS426.MTH6108(s3, s);
                    if(this.FLD805) {
                        CLS426.MTH6108(s3, s2);
                    }
                }
                else if(ﾞٴ0.MTH1304(s3, s) && !CLS426.MTH6118(s3, s2)) {
                    CLS426.MTH6132(s3, s, false);
                }
            }
            ᴵʽ0.MTH2697(s3, s);
        }
    }
}

