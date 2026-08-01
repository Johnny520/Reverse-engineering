// Decompiled by JEB v5.42.0.202606242140

package b.ⁱʾ;

import android.text.TextUtils;
import android.widget.TextView;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS79;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.ⁱˉ.CLS370;

public final class CLS1267 implements CLS39 {
    public final int FLD3263;
    public final CLS321 FLD3264;
    public final CLS323 FLD3265;
    public final Object FLD3266;

    public CLS1267(CLS323 ˈˈ0, CLS321 ˈˈ$ٴـ0, Object object0, int v) {
        this.FLD3263 = v;
        this.FLD3265 = ˈˈ0;
        this.FLD3264 = ˈˈ$ٴـ0;
        this.FLD3266 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CharSequence charSequence0;
        Object object0 = this.FLD3266;
        CLS321 ˈˈ$ٴـ0 = this.FLD3264;
        CLS323 ˈˈ0 = this.FLD3265;
        if(this.FLD3263 == 0) {
            ˈˈ0.getClass();
            ˈˈ$ٴـ0.FLD3273.setText(ˈˈ0.FLD3279.MTH1642(object0));
            return;
        }
        ˈˈ0.getClass();
        TextView textView0 = ˈˈ$ٴـ0.FLD3274;
        CLS79 ˎᵢ0 = ˈˈ0.FLD3279;
        ˎᵢ0.getClass();
        Object object1 = CLS79.MTH1621();
        if(object1 == null) {
            charSequence0 = CLS370.MTH5289(4101524894586295093L);
        }
        else {
            try {
                if(ˎᵢ0.FLD293 == null) {
                    ˎᵢ0.FLD293 = CLS164.MTH3174(object1, null, CharSequence.class, new Object[]{""});
                }
                if(ˎᵢ0.FLD293 == null) {
                    goto label_31;
                }
                else if(!TextUtils.isEmpty(CLS27.MTH897("ConversationAdapterMethod3"))) {
                    Object object2 = CLS166.MTH3195(object1, CLS27.MTH897("ConversationAdapterMethod3"), new Object[]{object0});
                    charSequence0 = (CharSequence)CLS166.MTH3194(object2, CLS27.MTH897("ConversationAdapterClass2_field3"));
                    if(charSequence0 == null) {
                        charSequence0 = (CharSequence)CLS164.MTH3178(object1, ˎᵢ0.FLD293, new Object[]{object0});
                        CLS166.MTH3198(object2, CLS27.MTH897("ConversationAdapterClass2_field3"), charSequence0);
                    }
                }
                else {
                    charSequence0 = (CharSequence)CLS164.MTH3178(object1, ˎᵢ0.FLD293, new Object[]{object0});
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                charSequence0 = CLS370.MTH5289(4101525418572305205L);
            }
            textView0.setText(charSequence0);
            return;
        label_31:
            charSequence0 = CLS370.MTH5289(4101525418572305205L);
        }
        textView0.setText(charSequence0);
    }
}

