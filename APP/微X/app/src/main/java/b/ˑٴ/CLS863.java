// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Pair;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS38.CLS37;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS502;

public final class CLS863 implements CLS37 {
    public final int FLD1380;
    public final CLS786 FLD1381;

    public CLS863(CLS786 ᐧᵢ0, int v) {
        this.FLD1380 = v;
        this.FLD1381 = ᐧᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS38$CLS37
    public final Object MTH1108(Object[] arr_object) {
        ContentValues contentValues1;
        CLS786 ᐧᵢ0 = this.FLD1381;
        if(this.FLD1380 == 0) {
            ᐧᵢ0.getClass();
            ContentValues contentValues0 = (ContentValues)arr_object[0];
            if(CLS182.MTH3474(4101902748629127989L, contentValues0) == 49) {
                String s = contentValues0.getAsString("content");
                if(!TextUtils.isEmpty(s)) {
                    if(CLS502.MTH6934(s, new String[]{CLS27.MTH882("rp_url")})) {
                        contentValues1 = new ContentValues(contentValues0);
                        contentValues1.put("type", 0x1A000031);
                        if(!ᐧᵢ0.MTH2657(contentValues1)) {
                            ᐧᵢ0.MTH2649(contentValues1);
                            return null;
                        }
                    }
                    else if(CLS502.MTH6934(s, new String[]{CLS27.MTH882("transfer_url")})) {
                        contentValues1 = new ContentValues(contentValues0);
                        contentValues1.put("type", 0x1A000032);
                        ᐧᵢ0.MTH2649(contentValues1);
                    }
                }
            }
            return null;
        }
        if(!ᐧᵢ0.FLD1447.FLD1407.MTH5947("_config_redpackets")) {
            CLS29 ˎᵢ0 = ᐧᵢ0.FLD1445;
            if(ˎᵢ0.MTH938("grab_red_packet_master_enable", false)) {
                String s1 = (String)arr_object[0];
                return CLS372.MTH5400(s1) || !CLS426.MTH6126(s1) && ˎᵢ0.MTH938("grab_red_packet_notprivate_enable", false) || !CLS426.MTH6126(s1) && !ᐧᵢ0.FLD1444.MTH5382(s1) ? null : Pair.create(CLS27.MTH889("configure_redpackets"), "redpackets");
            }
        }
        return null;
    }
}

