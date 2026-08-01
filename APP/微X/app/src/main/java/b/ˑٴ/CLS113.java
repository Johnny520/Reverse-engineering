// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.speech.tts.TextToSpeech.OnInitListener;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import java.util.Locale;

public final class CLS113 implements TextToSpeech.OnInitListener {
    public final CLS830 FLD764;

    public CLS113(CLS830 ᵔᵢ0) {
        this.FLD764 = ᵔᵢ0;
    }

    // 此方法包含解密的字符串
    @Override  // android.speech.tts.TextToSpeech$OnInitListener
    public final void onInit(int v) {
        CLS830 ᵔᵢ0 = this.FLD764;
        ᵔᵢ0.getClass();
        if(v != -1) {
            try {
                String s = ᵔᵢ0.FLD1445.MTH925("tts_lang", "");
                if(TextUtils.isEmpty(s)) {
                    ᵔᵢ0.FLD1272.setLanguage(Locale.CHINA);
                    return;
                }
                ᵔᵢ0.FLD1272.setLanguage(new Locale(s));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }
}

