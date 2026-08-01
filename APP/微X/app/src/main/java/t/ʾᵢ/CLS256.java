// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.json.JSONObject;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS55.CLS54;
import t.ٴـ.CLS117;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS297;
import t.ᵔʾ.CLS304;
import t.ⁱʾ.CLS145;
import t.ﾞٴ.CLS322;
import t.ﾞᐧ.CLS157;
import t.ﾞᐧ.CLS177.CLS176;
import t.ﾞᐧ.CLS181;
import t.ﾞᐧ.CLS335;
import t.ﾞᐧ.CLS337;
import t.ﾞᐧ.CLS338;
import t.ﾞᐧ.CLS340;
import t.ﾞᐧ.CLS341;
import t.ﾞᐧ.CLS344;
import t.ﾞᐧ.CLS345;

public final class CLS256 implements CLS54 {
    public final int FLD355;
    public final Activity FLD356;
    public final CLS216 FLD357;
    public final JSONObject FLD358;

    public CLS256(CLS216 ˎﾞ0, Activity activity0, JSONObject jSONObject0, int v) {
        this.FLD355 = v;
        this.FLD357 = ˎﾞ0;
        this.FLD356 = activity0;
        this.FLD358 = jSONObject0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ˆʿ.CLS55$CLS54
    public final void MTH1477(LinearLayout linearLayout0) {
        JSONObject jSONObject0 = this.FLD358;
        CLS216 ˎﾞ0 = this.FLD357;
        if(this.FLD355 == 0) {
            ˎﾞ0.getClass();
            CLS337 ˎᵢ0 = new CLS337(this.FLD356);
            ˎᵢ0.MTH2172(CLS133.MTH2099("select_time"));
            ˎᵢ0.MTH2381(jSONObject0.optString("t"));
            ˎᵢ0.MTH2387(new CLS14(ˎﾞ0, jSONObject0, this.FLD356, ˎᵢ0, 0));
            CLS43.MTH1432(linearLayout0, ˎᵢ0.MTH2173());
            CLS335 ˉᐧ0 = new CLS335(this.FLD356);
            CLS297 ˈˈ0 = new CLS297(jSONObject0, 6);
            CLS181 ⁱᵔ0 = new CLS181(ˉᐧ0.FLD1139, ((CLS176)ˈˈ0));
            ˉᐧ0.FLD1139.FLD1257.setOnItemSelectedListener(ⁱᵔ0);
            CLS117.FLD842.getClass();
            ˉᐧ0.MTH2364(new ArrayList(CLS117.FLD842.FLD841.keySet()));
            String s = jSONObject0.optString("n");
            ˉᐧ0.FLD1139.MTH2445(s);
            CLS344 ⁱˉ0 = new CLS344(this.FLD356);
            ⁱˉ0.MTH2481(new Object[]{ˎᵢ0, ˉᐧ0});
            CLS43.MTH1428(linearLayout0, ((CLS145)ⁱˉ0), CLS43.MTH1439(10));
            return;
        }
        ˎﾞ0.getClass();
        int v = CLS43.MTH1439(10);
        Activity activity0 = this.FLD356;
        ImageView imageView0 = new ImageView(activity0);
        CLS322 ٴـ0 = new CLS322(jSONObject0, activity0, imageView0, 2);
        CLS344 ⁱˉ1 = new CLS344(activity0);
        CLS338 יᐧ0 = new CLS338(activity0);
        יᐧ0.MTH2172(CLS133.MTH2099("select_img"));
        יᐧ0.MTH2400(new CLS157(ˎﾞ0, jSONObject0, ٴـ0, 4));
        ⁱˉ1.MTH2482(((CLS145)יᐧ0));
        CLS345 ﹳˊ0 = new CLS345(activity0);
        ﹳˊ0.MTH2172(CLS133.MTH2099("overlay_color"));
        ﹳˊ0.FLD1310 = "#00FFFFFF";
        ﹳˊ0.MTH2493(jSONObject0.optString("c", "#00FFFFFF"));
        ﹳˊ0.FLD1303 = new CLS304(jSONObject0, ٴـ0, 11);
        ⁱˉ1.MTH2482(((CLS145)ﹳˊ0));
        if(jSONObject0.has("a")) {
            CLS340 ـﹳ0 = new CLS340(activity0);
            ـﹳ0.MTH2172(CLS133.MTH2099("transparency"));
            ـﹳ0.FLD1227.setMax(0xFF);
            int v1 = jSONObject0.optInt("a", 0xFF);
            ـﹳ0.FLD1227.setProgress(v1);
            CLS23 ᵎⁱ0 = new CLS23(jSONObject0, ٴـ0);
            ـﹳ0.FLD1227.setOnSeekBarChangeListener(ᵎⁱ0);
            ⁱˉ1.MTH2482(((CLS145)ـﹳ0));
        }
        CLS340 ـﹳ1 = new CLS340(activity0);
        ـﹳ1.MTH2172(CLS133.MTH2099("blur"));
        ـﹳ1.FLD1227.setMax(25);
        int v2 = jSONObject0.optInt("b", 0);
        ـﹳ1.FLD1227.setProgress(v2);
        CLS18 ˏʽ0 = new CLS18(jSONObject0, ٴـ0);
        ـﹳ1.FLD1227.setOnSeekBarChangeListener(ˏʽ0);
        ⁱˉ1.MTH2482(((CLS145)ـﹳ1));
        CLS341 ᵔˉ0 = new CLS341(activity0);
        ᵔˉ0.FLD1272.add(imageView0);
        ⁱˉ1.MTH2482(((CLS145)ᵔˉ0));
        CLS43.MTH1428(linearLayout0, ((CLS145)ⁱˉ1), v);
        ٴـ0.MTH2169();
    }
}

