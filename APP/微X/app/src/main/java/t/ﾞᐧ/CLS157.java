// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout;
import org.json.JSONObject;
import t.ʾᵢ.CLS216.CLS212;
import t.ʾᵢ.CLS216;
import t.ʾᵢ.CLS230;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS55;
import t.ˈˊ.CLS88;
import t.ˊﾞ.CLS295;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS297;
import t.ᵔʾ.CLS304;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS144;
import t.ⁱʾ.CLS147;
import t.ﾞٴ.CLS309;

public final class CLS157 implements View.OnClickListener {
    public final int FLD1094;
    public final Object FLD1095;
    public final Object FLD1096;
    public final Object FLD1097;

    public CLS157(Object object0, Object object1, Object object2, int v) {
        this.FLD1094 = v;
        this.FLD1097 = object0;
        this.FLD1096 = object1;
        this.FLD1095 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Object object0 = this.FLD1095;
        Object object1 = this.FLD1096;
        Object object2 = this.FLD1097;
        switch(this.FLD1094) {
            case 0: {
                CLS345 ﹳˊ0 = (CLS345)object2;
                Activity activity0 = (Activity)object1;
                CLS337 ˎᵢ0 = (CLS337)object0;
                ﹳˊ0.getClass();
                try {
                    CLS172 ـˏ0 = new CLS172(activity0, (TextUtils.isEmpty(ﹳˊ0.FLD1302) ? ﹳˊ0.FLD1310 : ﹳˊ0.FLD1302), ﹳˊ0.FLD1310, new CLS304(ﹳˊ0, ˎᵢ0, 4), ﹳˊ0.FLD1309);
                    Activity activity1 = (Activity)ـˏ0.FLD1219.get();
                    CLS43.MTH1425(activity1, CLS133.MTH2099("select_color"), ((CLS144)new CLS304(ـˏ0, activity1, 3)), ((CLS141)new CLS334(ـˏ0)));
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                return;
            }
            case 1: {
                if(((CLS333)object2).FLD1112 == null) {
                    CLS55 ⁱˉ0 = new CLS55(((Activity)object1), ((CLS333)object2).FLD1118);
                    ((CLS333)object2).FLD1112 = ⁱˉ0;
                    ⁱˉ0.FLD514 = new CLS297(((CLS333)object2), 3);
                }
                CLS55 ⁱˉ1 = ((CLS333)object2).FLD1112;
                if(ⁱˉ1 != null && !ⁱˉ1.isShowing()) {
                    ((CLS333)object2).FLD1112.show();
                }
                return;
            }
            case 2: {
                ((CLS333)object2).getClass();
                if(((LinearLayout)object1).getVisibility() == 0) {
                    ((LinearLayout)object1).setVisibility(8);
                    if(((CLS337)object0).FLD1165) {
                        ((CLS337)object0).FLD1175.setRotation(90.0f);
                        return;
                    }
                }
                else {
                    ((LinearLayout)object1).setVisibility(0);
                    if(((CLS337)object0).FLD1165) {
                        ((CLS337)object0).FLD1175.setRotation(-90.0f);
                    }
                }
                return;
            }
            case 3: {
                ((CLS309)object2).getClass();
                ((CLS88)object1).MTH1719(true);
                ((CLS309)object2).MTH2238(((CLS147)(((CLS295)object0))));
                return;
            }
            case 4: {
                ((CLS216)object2).getClass();
                Object[] arr_object1 = {new CLS230(((JSONObject)object1), ((CLS143)object0)), ((JSONObject)object1).optString("p2"), ((JSONObject)object1).optString("p3")};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object1);
                return;
            }
            default: {
                ((CLS216)object2).getClass();
                Object[] arr_object = {new CLS212(((String[])object1), ((CLS143)object0)), ((String[])object1)[0]};
                CLS123.FLD912.MTH1999("themes_selectImg2", arr_object);
            }
        }
    }
}

