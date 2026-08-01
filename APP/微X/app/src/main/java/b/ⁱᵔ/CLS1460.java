// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS69;
import b.ⁱʾ.CLS335;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS534.CLS533;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS1460 implements CLS533 {
    public final ArrayList FLD4319;
    public final ArrayList FLD4320;
    public final CLS1624 FLD4321;
    public final CLS69 FLD4322;
    public final CLS1625 FLD4323;
    public final CLS1625 FLD4324;
    public final JSONObject FLD4325;
    public final CLS1625 FLD4326;
    public final CLS335 FLD4327;
    public final CLS1625 FLD4328;

    public CLS1460(CLS69 ʾᵢ0, JSONObject jSONObject0, CLS1625 ـˏ0, CLS1625 ـˏ1, CLS1625 ـˏ2, CLS1625 ـˏ3, CLS335 ˑٴ0, ArrayList arrayList0, CLS1624 יﹳ0, ArrayList arrayList1) {
        this.FLD4322 = ʾᵢ0;
        this.FLD4325 = jSONObject0;
        this.FLD4324 = ـˏ0;
        this.FLD4326 = ـˏ1;
        this.FLD4323 = ـˏ2;
        this.FLD4328 = ـˏ3;
        this.FLD4327 = ˑٴ0;
        this.FLD4320 = arrayList0;
        this.FLD4321 = יﹳ0;
        this.FLD4319 = arrayList1;
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS534$CLS533
    public final void MTH7225(int v, String s) {
        try {
            ArrayList arrayList0 = this.FLD4320;
            ArrayList arrayList1 = this.FLD4319;
            int v1 = (int)(((Integer)this.FLD4322.MTH1565(s)));
            this.FLD4325.put("type", v1);
            CLS1625 ـˏ0 = this.FLD4324;
            CLS1625 ـˏ1 = this.FLD4326;
            CLS1625 ـˏ2 = this.FLD4323;
            CLS1625 ـˏ3 = this.FLD4328;
            CLS335 ˑٴ0 = this.FLD4327;
            CLS1624 יﹳ0 = this.FLD4321;
            if(v1 == 1) {
                ـˏ0.MTH800(CLS27.MTH889("add_img_path"));
                ـˏ0.MTH801(0);
                ـˏ1.MTH800(CLS27.MTH889("add_multi_img"));
                ـˏ1.MTH801(0);
                ـˏ2.MTH801(0);
                ـˏ3.MTH801(0);
                ˑٴ0.MTH5111(arrayList0);
                יﹳ0.MTH801(0);
                return;
            }
            if(v1 == 15) {
                ـˏ0.MTH800(CLS27.MTH889("set_vid_path"));
                ˑٴ0.MTH5111(arrayList1);
                ـˏ0.MTH801(0);
                ـˏ2.MTH801(0);
                ـˏ3.MTH801(0);
                יﹳ0.MTH801(0);
            }
            else {
                ـˏ0.MTH801(8);
                יﹳ0.MTH801(8);
                ـˏ3.MTH801(0);
                ـˏ2.MTH801(8);
            }
            ـˏ1.MTH801(8);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

