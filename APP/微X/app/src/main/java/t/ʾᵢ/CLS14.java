// Decompiled by JEB v5.42.0.202606242140

package t.ʾᵢ;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.view.View.OnClickListener;
import android.view.View;
import java.util.Calendar;
import org.json.JSONObject;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS143;
import t.ﾞᐧ.CLS337;

public final class CLS14 implements View.OnClickListener {
    public final int FLD157;
    public final Object FLD158;
    public final Object FLD159;
    public final CLS216 FLD160;
    public final Object FLD161;

    public CLS14(CLS216 ˎﾞ0, Object object0, Object object1, Object object2, int v) {
        this.FLD157 = v;
        this.FLD160 = ˎﾞ0;
        this.FLD159 = object0;
        this.FLD161 = object1;
        this.FLD158 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS216 ˎﾞ0 = this.FLD160;
        Object object0 = this.FLD158;
        Object object1 = this.FLD161;
        Object object2 = this.FLD159;
        if(this.FLD157 == 0) {
            JSONObject jSONObject0 = (JSONObject)object2;
            Activity activity0 = (Activity)object1;
            CLS337 ˎᵢ0 = (CLS337)object0;
            ˎﾞ0.getClass();
            try {
                Calendar calendar0 = Calendar.getInstance();
                String s = jSONObject0.optString("t");
                calendar0.setTime(ˎﾞ0.FLD240.parse(s));
                new TimePickerDialog(activity0, new CLS13(ˎﾞ0, jSONObject0, ˎᵢ0), calendar0.get(11), calendar0.get(12), true).show();
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
            return;
        }
        ˎﾞ0.getClass();
        Object[] arr_object = {new CLS208(((String[])object2), ((CLS143)object1)), ((String)object0)};
        CLS123.FLD912.MTH1999("themes_selectImg2", arr_object);
    }
}

