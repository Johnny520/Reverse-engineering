// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.speech.tts.UtteranceProgressListener;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ᵔʾ.CLS1229;
import java.util.concurrent.ConcurrentHashMap;

public final class CLS107 extends UtteranceProgressListener {
    public final CLS830 FLD645;

    public CLS107(CLS830 ᵔᵢ0) {
        this.FLD645 = ᵔᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.speech.tts.UtteranceProgressListener
    public final void onDone(String s) {
        CLS830 ᵔᵢ0 = this.FLD645;
        if("WECHATXPOSEDTTS".equals(s)) {
            ᵔᵢ0.getClass();
            if(!CLS27.MTH901()) {
                CLS1229 ˆٴ0 = new CLS1229(22, ᵔᵢ0);
                CLS40.FLD157.MTH1124(((CLS39)ˆٴ0));
            }
        }
        else {
            ConcurrentHashMap concurrentHashMap0 = ᵔᵢ0.FLD1278;
            if(ᵔᵢ0.FLD1278.containsKey(s)) {
                try {
                    ((CLS3)concurrentHashMap0.get(s)).MTH774();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                concurrentHashMap0.remove(s);
            }
        }
    }

    @Override  // android.speech.tts.UtteranceProgressListener
    public final void onError(String s) {
    }

    @Override  // android.speech.tts.UtteranceProgressListener
    public final void onStart(String s) {
    }
}

