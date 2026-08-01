// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import t.ˆʿ.CLS33;
import t.ˊﾞ.CLS102;
import t.ˊﾞ.CLS105;
import t.ٴـ.CLS117;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS132;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS135;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ᵔʾ.CLS139.CLS138;

public final class CLS315 implements CLS138 {
    public final int FLD1041;
    public final Object FLD1042;
    public final Object FLD1043;

    public CLS315(Object object0, Object object1, int v) {
        this.FLD1041 = v;
        this.FLD1043 = object0;
        this.FLD1042 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS139$CLS138
    public final void MTH2153(Object[] arr_object) {
        Object object0 = this.FLD1042;
        Object object1 = this.FLD1043;
        switch(this.FLD1041) {
            case 0: {
                ((CLS309)object1).MTH2236();
                CLS318 יᐧ0 = new CLS318(((CLS123)object0), 1);
                CLS137.FLD972.MTH2139(((CLS136)יᐧ0), 2000L);
                return;
            }
            case 1: {
                CLS123 ʾᵢ0 = (CLS123)object0;
                ((CLS309)object1).getClass();
                CLS117.FLD842.getClass();
                if(CLS117.MTH1906()) {
                    CLS135 ⁱˉ0 = ((CLS309)object1).FLD1084;
                    if(ⁱˉ0.MTH2131("auto_change_theme", false)) {
                        try {
                            JSONArray jSONArray0 = ⁱˉ0.MTH2135("theme_change_time", new JSONArray());
                            if(jSONArray0.length() >= 2) {
                                ArrayList arrayList0 = new ArrayList();
                                HashMap hashMap0 = new HashMap();
                                for(int v = 0; v < jSONArray0.length(); ++v) {
                                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                                    String s = jSONObject0.getString("t");
                                    String s1 = jSONObject0.getString("n");
                                    arrayList0.add(s);
                                    hashMap0.put(s, s1);
                                }
                                boolean z = false;
                                Collections.sort(arrayList0, new CLS151(0));
                                String s2 = "";
                                for(int v1 = 0; v1 < arrayList0.size() - 1; ++v1) {
                                    if(CLS33.MTH1353(((String)arrayList0.get(v1)), ((String)arrayList0.get(v1 + 1)))) {
                                        s2 = (String)hashMap0.get(arrayList0.get(v1));
                                        z = true;
                                        break;
                                    }
                                }
                                if(!z && CLS33.MTH1353(((String)arrayList0.get(arrayList0.size() - 1)), ((String)arrayList0.get(0)))) {
                                    s2 = (String)hashMap0.get(arrayList0.get(arrayList0.size() - 1));
                                    z = true;
                                }
                                if(z && !ⁱˉ0.MTH2134("current_theme", "").equals(s2)) {
                                    CLS117.FLD842.getClass();
                                    if(CLS132.MTH2090("settings.json", new String[]{s2})) {
                                        ⁱˉ0.MTH2125(s2, "current_theme");
                                        ʾᵢ0.MTH1999("apply_theme_no_settings", new Object[]{s2});
                                        return;
                                    }
                                }
                            }
                        }
                        catch(Throwable throwable0) {
                            CLS133.MTH2113(throwable0);
                        }
                    }
                }
                return;
            }
            case 2: {
                ((CLS309)object1).MTH2236();
                CLS318 יᐧ1 = new CLS318(((CLS123)object0), 0);
                CLS137.FLD972.MTH2145(((CLS136)יᐧ1));
                return;
            }
            default: {
                ((CLS105)object1).getClass();
                if(((CLS102)object0).MTH1818("DrawerMoveMainOnSlide", false)) {
                    ((CLS105)object1).FLD781.setTranslationX(0.0f);
                }
                ImageView imageView0 = ((CLS105)object1).FLD782;
                if(imageView0 != null) {
                    imageView0.setVisibility(4);
                }
            }
        }
    }
}

