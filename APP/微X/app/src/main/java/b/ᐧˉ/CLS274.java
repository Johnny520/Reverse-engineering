// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS523;
import java.lang.ref.WeakReference;

public final class CLS274 implements View.OnClickListener {
    public final int FLD2860;
    public final String FLD2861;
    public final CLS1030 FLD2862;

    public CLS274(CLS1030 ˎᵢ0, String s, int v) {
        this.FLD2860 = v;
        this.FLD2862 = ˎᵢ0;
        this.FLD2861 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s = this.FLD2861;
        CLS1030 ˎᵢ0 = this.FLD2862;
        switch(this.FLD2860) {
            case 0: {
                Activity activity0 = ((CLS219)ˎᵢ0).MTH3883();
                CLS523.MTH7133(activity0, CLS27.MTH889("config_robot"), ((CLS379)new CLS1063(ˎᵢ0, s, activity0, 1)), null, null);
                return;
            }
            case 1: {
                CLS210 ˋʼ1 = ˎᵢ0.MTH3861();
                String s2 = CLS27.MTH889("config_responses");
                if(TextUtils.isEmpty(s)) {
                    s = "_ANY_";
                }
                ˋʼ1.MTH3749(s2, s, false);
                return;
            }
            case 2: {
                if(ˎᵢ0.FLD2137 == null) {
                    ˎᵢ0.FLD2137 = new CLS244(((CLS219)ˎᵢ0).MTH3883(), CLS27.MTH904());
                }
                CLS244 ᴵʻ0 = ˎᵢ0.FLD2137;
                Activity activity1 = ((CLS219)ˎᵢ0).MTH3883();
                ᴵʻ0.getClass();
                ᴵʻ0.FLD2537 = new WeakReference(activity1);
                CLS244 ᴵʻ1 = ˎᵢ0.FLD2137;
                if(TextUtils.isEmpty(s)) {
                    s = "_ANY_";
                }
                ᴵʻ1.MTH4271(s);
                return;
            }
            case 3: {
                CLS210 ˋʼ2 = ˎᵢ0.MTH3861();
                String s3 = CLS27.MTH889("config_responses");
                StringBuilder stringBuilder1 = CLS182.MTH3483(s);
                stringBuilder1.append("_TYPE_IMAGE_");
                ˋʼ2.MTH3749(s3, stringBuilder1.toString(), true);
                return;
            }
            case 4: {
                CLS210 ˋʼ3 = ˎᵢ0.MTH3861();
                String s4 = CLS27.MTH889("config_responses");
                StringBuilder stringBuilder2 = CLS182.MTH3483(s);
                stringBuilder2.append("_TYPE_VOICE_");
                ˋʼ3.MTH3749(s4, stringBuilder2.toString(), true);
                return;
            }
            case 5: {
                CLS210 ˋʼ4 = ˎᵢ0.MTH3861();
                String s5 = CLS27.MTH889("config_responses");
                StringBuilder stringBuilder3 = CLS182.MTH3483(s);
                stringBuilder3.append("_TYPE_VIDEO_");
                ˋʼ4.MTH3749(s5, stringBuilder3.toString(), true);
                return;
            }
            case 6: {
                CLS210 ˋʼ5 = ˎᵢ0.MTH3861();
                String s6 = CLS27.MTH889("config_responses");
                StringBuilder stringBuilder4 = CLS182.MTH3483(s);
                stringBuilder4.append("_TYPE_VIDEOCALLFAIL_");
                ˋʼ5.MTH3749(s6, stringBuilder4.toString(), true);
                return;
            }
            case 7: {
                CLS210 ˋʼ6 = ˎᵢ0.MTH3861();
                String s7 = CLS27.MTH889("config_responses");
                StringBuilder stringBuilder5 = CLS182.MTH3483(s);
                stringBuilder5.append("_TYPE_VOICECALLFAIL_");
                ˋʼ6.MTH3749(s7, stringBuilder5.toString(), true);
                return;
            }
            default: {
                CLS210 ˋʼ0 = ˎᵢ0.MTH3861();
                String s1 = CLS27.MTH889("config_responses");
                StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                stringBuilder0.append("_TYPE_VIDEO_");
                ˋʼ0.MTH3749(s1, stringBuilder0.toString(), true);
            }
        }
    }
}

