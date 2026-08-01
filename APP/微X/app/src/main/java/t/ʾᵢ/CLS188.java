// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.json.JSONObject;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS55.CLS54;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS145;
import t.ﾞᐧ.CLS332;
import t.ﾞᐧ.CLS338;
import t.ﾞᐧ.CLS340;
import t.ﾞᐧ.CLS341;
import t.ﾞᐧ.CLS344;
import t.ﾞᐧ.CLS345;

public final class CLS188 implements CLS54 {
    public final String FLD107;
    public final CLS216 FLD108;
    public final String[] FLD109;
    public final JSONObject FLD110;
    public final CLS332 FLD111;
    public final Activity FLD112;
    public final int[] FLD113;
    public final String[] FLD114;

    public CLS188(CLS216 ˎﾞ0, CLS332 ʻᵎ0, JSONObject jSONObject0, Activity activity0, String[] arr_s, String[] arr_s1, int[] arr_v, String s) {
        this.FLD108 = ˎﾞ0;
        this.FLD111 = ʻᵎ0;
        this.FLD110 = jSONObject0;
        this.FLD112 = activity0;
        this.FLD109 = arr_s;
        this.FLD114 = arr_s1;
        this.FLD113 = arr_v;
        this.FLD107 = s;
    }

    // 此方法包含解密的字符串
    @Override  // t.ˆʿ.CLS55$CLS54
    public final void MTH1477(LinearLayout linearLayout0) {
        this.FLD108.getClass();
        int v = CLS43.MTH1439(10);
        String s = CLS133.MTH2099("enable");
        this.FLD111.MTH2172(s);
        boolean z = this.FLD110.optBoolean("e", false);
        this.FLD111.MTH2328(z);
        CLS43.MTH1423(linearLayout0, ((CLS145)this.FLD111), true);
        ImageView imageView0 = new ImageView(this.FLD112);
        CLS259 ⁱᵔ0 = new CLS259(this.FLD109, this.FLD114, this.FLD112, this.FLD113, imageView0);
        CLS344 ⁱˉ0 = new CLS344(this.FLD112);
        CLS345 ﹳˊ0 = new CLS345(this.FLD112);
        ﹳˊ0.MTH2172(CLS133.MTH2099("overlay_color"));
        ﹳˊ0.FLD1310 = "#00FFFFFF";
        ﹳˊ0.MTH2493(this.FLD114[0]);
        ﹳˊ0.FLD1303 = new CLS235(this.FLD114, ((CLS143)ⁱᵔ0), 0);
        CLS340 ـﹳ0 = new CLS340(this.FLD112);
        ـﹳ0.MTH2172(CLS133.MTH2099("blur"));
        ـﹳ0.FLD1227.setMax(25);
        int v1 = this.FLD110.optInt("b", 0);
        ـﹳ0.FLD1227.setProgress(v1);
        CLS17 ˎﾞ$ʻˑ0 = new CLS17(this.FLD113, ⁱᵔ0);
        ـﹳ0.FLD1227.setOnSeekBarChangeListener(ˎﾞ$ʻˑ0);
        ⁱᵔ0.MTH2169();
        CLS338 יᐧ0 = new CLS338(this.FLD112);
        יᐧ0.MTH2172(CLS133.MTH2099("select_img"));
        יᐧ0.MTH2400(new CLS14(this.FLD108, this.FLD109, ⁱᵔ0, this.FLD107, 1));
        CLS341 ᵔˉ0 = new CLS341(this.FLD112);
        ᵔˉ0.FLD1272.add(imageView0);
        ⁱˉ0.MTH2481(new Object[]{יᐧ0, ﹳˊ0, ـﹳ0, ᵔˉ0});
        CLS43.MTH1428(linearLayout0, ((CLS145)ⁱˉ0), v);
    }
}

