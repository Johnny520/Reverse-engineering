// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.speech.tts.TextToSpeech.OnInitListener;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import java.util.Locale;

public final class CLS112 implements TextToSpeech.OnInitListener {
    public final CLS830 FLD736;
    public final String FLD737;

    public CLS112(CLS830 ᵔᵢ0, String s) {
        this.FLD736 = ᵔᵢ0;
        this.FLD737 = s;
    }

    // 此方法包含解密的字符串
    @Override  // android.speech.tts.TextToSpeech$OnInitListener
    public final void onInit(int v) {
        Locale locale0;
        String s = this.FLD737;
        CLS830 ᵔᵢ0 = this.FLD736;
        ᵔᵢ0.getClass();
        if(v != -1) {
            try {
                if(TextUtils.isEmpty(s)) {
                    locale0 = Locale.CHINA;
                }
                else {
                    locale0 = "e".equalsIgnoreCase(s) ? Locale.ENGLISH : new Locale(s);
                }
                ᵔᵢ0.FLD1277.setLanguage(locale0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

