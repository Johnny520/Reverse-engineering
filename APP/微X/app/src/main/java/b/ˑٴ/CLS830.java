// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS38.CLS37;
import b.יᐧ.CLS158.CLS157;
import b.יᐧ.CLS158;
import b.יﹳ.CLS166;
import b.ⁱᵔ.CLS412;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class CLS830 extends CLS140 {
    public static final class CLS132 {
        public final Object FLD1268;

        // 此方法包含解密的字符串
        public CLS132(Context context0) {
            Object object0;
            this.FLD1268 = null;
            try {
                if(CLS27.MTH890("voicePlayerClass")) {
                    Class class0 = CLS27.MTH894("voicePlayerClass");
                    if(class0 != null) {
                        object0 = CLS166.MTH3188(class0, new Object[]{context0});
                        this.FLD1268 = object0;
                    }
                }
                else if(CLS27.MTH890("voicePlayerClass_b")) {
                    Class class1 = CLS27.MTH894("voicePlayerClass_b");
                    if(class1 != null) {
                        object0 = CLS166.MTH3188(class1, new Object[]{context0, 0});
                        this.FLD1268 = object0;
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }

        // 此方法包含解密的字符串
        public final boolean MTH2848() {
            Object object0 = this.FLD1268;
            if(object0 == null) {
                return false;
            }
            try {
                return ((Boolean)CLS166.MTH3195(object0, CLS27.MTH892("voicePlayer_isPlaying", "isPlaying"), new Object[0])).booleanValue();
            }
            catch(Throwable unused_ex) {
                return false;
            }
        }

        // 此方法包含解密的字符串
        public final void MTH2849() {
            Object object0 = this.FLD1268;
            if(object0 == null) {
                return;
            }
            if(!this.MTH2848()) {
                return;
            }
            try {
                if(CLS27.MTH890("voicePlayer_stop_b")) {
                    CLS166.MTH3195(object0, CLS27.MTH897("voicePlayer_stop_b"), new Object[]{Boolean.FALSE});
                    return;
                }
                CLS166.MTH3195(object0, CLS27.MTH892("voicePlayer_stop", "stop"), new Object[0]);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }

        // 此方法包含解密的字符串
        public final void MTH2850(String s) {
            try {
                Object object0 = this.FLD1268;
                if(object0 == null) {
                    return;
                }
                if(CLS27.MTH890("voicePlayerPlayMethod")) {
                    CLS166.MTH3195(object0, CLS27.MTH897("voicePlayerPlayMethod"), new Object[]{s, Boolean.TRUE});
                    return;
                }
                if(CLS27.MTH890("voicePlayerPlayMethod_b")) {
                    CLS166.MTH3195(object0, CLS27.MTH897("voicePlayerPlayMethod_b"), new Object[]{s, Boolean.TRUE, -1, 0});
                    return;
                }
                if(CLS27.MTH890("voicePlayerPlayMethod_c")) {
                    CLS166.MTH3195(object0, CLS27.MTH897("voicePlayerPlayMethod_c"), new Object[]{s, Boolean.TRUE, Boolean.FALSE, -1});
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    public static final class CLS133 {
        public final int FLD1269;
        public final String FLD1270;

        public CLS133(int v, String s) {
            this.FLD1269 = v;
            this.FLD1270 = s;
        }

        // 去混淆评级： 低(40)
        // 此方法包含解密的字符串
        @Override
        public final String toString() {
            return "type: " + this.FLD1269 + " content: " + this.FLD1270;
        }
    }

    public CLS132 FLD1271;
    public TextToSpeech FLD1272;
    public CLS133 FLD1273;
    public boolean FLD1274;
    public final CLS158 FLD1275;
    public boolean FLD1276;
    public TextToSpeech FLD1277;
    public final ConcurrentHashMap FLD1278;

    public CLS830(CLS139 ﹶʼ0) {
        public final class CLS829 implements CLS157 {
            public final CLS830 FLD1267;

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3145() {
            }

            // 此方法包含解密的字符串
            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3146(CLS158 ⁱʾ0) {
                CLS830 ᵔᵢ0 = CLS830.this;
                if(!ᵔᵢ0.MTH2863() && !ᵔᵢ0.FLD1276) {
                    if(!ᵔᵢ0.FLD1445.MTH938("auto_tts_enable", false)) {
                        if(!ⁱʾ0.MTH3154()) {
                            ⁱʾ0.FLD1557.clear();
                        }
                        return;
                    }
                    if(((AudioManager)CLS27.MTH900().getSystemService("audio")).getMode() == 2) {
                        int v = ᵔᵢ0.FLD1273.FLD1269;
                        if(v == 1) {
                            ᵔᵢ0.MTH2858();
                            ᵔᵢ0.MTH2854();
                            return;
                        }
                        if(v == 34 && ᵔᵢ0.MTH2864().MTH2848()) {
                            ᵔᵢ0.MTH2864().MTH2849();
                        }
                        return;
                    }
                    CLS133 ᵔᵢ$ᵔʾ0 = (CLS133)ⁱʾ0.MTH3152();
                    ᵔᵢ0.FLD1273 = ᵔᵢ$ᵔʾ0;
                    if(ᵔᵢ$ᵔʾ0 == null) {
                        return;
                    }
                    switch(ᵔᵢ$ᵔʾ0.FLD1269) {
                        case 1: {
                            ᵔᵢ0.MTH2856(ᵔᵢ$ᵔʾ0.FLD1270);
                            break;
                        }
                        case 34: {
                            ᵔᵢ0.MTH2864().MTH2850(ᵔᵢ0.FLD1273.FLD1270);
                        }
                    }
                }
            }
        }

        super(ﹶʼ0);
        this.FLD1276 = false;
        CLS158 ⁱʾ0 = new CLS158(((CLS157)new CLS829(this)), 1000L);
        this.FLD1275 = ⁱʾ0;
        ⁱʾ0.FLD1561 = new Handler();
        ⁱʾ0.FLD1556 = true;
        this.FLD1278 = new ConcurrentHashMap();
    }

    // 此方法包含解密的字符串
    public final void MTH2854() {
        if(!this.FLD1445.MTH938("tts_enable", true) && !this.FLD1445.MTH938("auto_tts_enable", false)) {
            return;
        }
        TextToSpeech textToSpeech0 = this.FLD1272;
        if(textToSpeech0 != null) {
            if(textToSpeech0.isSpeaking()) {
                return;
            }
            this.MTH2858();
        }
        try {
            this.FLD1272 = new TextToSpeech(CLS27.MTH900(), new CLS113(this));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final void MTH2855() {
        if(this.FLD1276) {
            return;
        }
        this.FLD1276 = true;
        CLS133 ᵔᵢ$ᵔʾ0 = this.FLD1273;
        if(ᵔᵢ$ᵔʾ0 == null) {
            return;
        }
        int v = ᵔᵢ$ᵔʾ0.FLD1269;
        if(v == 1) {
            this.MTH2858();
            this.MTH2854();
            return;
        }
        if(v == 34 && this.MTH2864().MTH2848()) {
            this.MTH2864().MTH2849();
        }
    }

    public final void MTH2856(String s) {
        if(this.FLD1272 == null) {
            this.MTH2854();
        }
        TextToSpeech textToSpeech0 = this.FLD1272;
        if(textToSpeech0 == null) {
            return;
        }
        try {
            if(Build.VERSION.SDK_INT >= 21) {
                CLS115.MTH2263(textToSpeech0, s);
                return;
            }
            textToSpeech0.speak(s, 0, null);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ˑٴ.CLS140
    public final void MTH3039() {
        CLS412.MTH6001(this.FLD1275.FLD1559);
    }

    public final void MTH2858() {
        TextToSpeech textToSpeech0 = this.FLD1272;
        if(textToSpeech0 != null) {
            try {
                textToSpeech0.stop();
                this.FLD1272.shutdown();
                this.FLD1272 = null;
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        ʾᵢ0.MTH833("sns.menu.options", ((CLS37)new CLS791(this, 0)));
        ʾᵢ0.MTH828("sns.menu.config", ((CLS35)new CLS752(this, 8)));
        ʾᵢ0.MTH828("a.async.sqldb.insert", ((CLS35)new CLS752(this, 9)));
        ʾᵢ0.MTH833("hasTTS", ((CLS37)new CLS791(this, 2)));
        ʾᵢ0.MTH828("startTTS", ((CLS35)new CLS752(this, 10)));
        ʾᵢ0.MTH828("stopTTS", ((CLS35)new CLS752(this, 11)));
        ʾᵢ0.MTH828("tts", ((CLS35)new CLS752(this, 12)));
        ʾᵢ0.MTH828("speak", ((CLS35)new CLS752(this, 13)));
        ʾᵢ0.MTH828("chat.menu.config", ((CLS35)new CLS752(this, 14)));
        ʾᵢ0.MTH833("chat.menu.options", ((CLS37)new CLS791(this, 3)));
        ʾᵢ0.MTH828("on_voiceClass3_setMaxDuration", ((CLS35)new CLS752(this, 0)));
        ʾᵢ0.MTH828("a_VoiceRecorder_startRecord", ((CLS35)new CLS752(this, 1)));
        ʾᵢ0.MTH828("on_voice_record", ((CLS35)new CLS752(this, 2)));
        ʾᵢ0.MTH828("on_voice_length", ((CLS35)new CLS752(this, 3)));
        ʾᵢ0.MTH828("on_voice_length2", ((CLS35)new CLS752(this, 4)));
        ʾᵢ0.MTH828("b.on_LauncherUI_dispatchKeyEvent", ((CLS35)new CLS752(this, 5)));
        ʾᵢ0.MTH833("plus.options", ((CLS37)new CLS791(this, 1)));
        ʾᵢ0.MTH828("plus.config", ((CLS35)new CLS752(this, 6)));
        ʾᵢ0.MTH828("tts2", ((CLS35)new CLS752(this, 7)));
    }

    public final void MTH2860() {
        if(!this.FLD1276) {
            return;
        }
        CLS133 ᵔᵢ$ᵔʾ0 = this.FLD1273;
        if(ᵔᵢ$ᵔʾ0 != null) {
            switch(ᵔᵢ$ᵔʾ0.FLD1269) {
                case 1: {
                    this.MTH2856(ᵔᵢ$ᵔʾ0.FLD1270);
                    break;
                }
                case 34: {
                    this.MTH2864().MTH2850(this.FLD1273.FLD1270);
                }
            }
        }
        this.FLD1276 = false;
    }

    // 此方法包含解密的字符串
    public final void MTH2861(CLS3 ˆٴ0, String s, String s1, String s2) {
        try {
            if(ˆٴ0 != null) {
                this.FLD1278.put(s2, ˆٴ0);
            }
            HashMap hashMap0 = new HashMap();
            String s3 = new File(CLS31.MTH1038(CLS27.MTH900()), s1).getAbsolutePath();
            if(Build.VERSION.SDK_INT >= 21) {
                CLS115.MTH2268(this.FLD1277, s, new File(s3), s2);
                return;
            }
            hashMap0.put("utteranceId", s2);
            this.FLD1277.synthesizeToFile(s, hashMap0, s3);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    @Override  // b.ˑٴ.CLS140
    public final void MTH3043() {
        if(this.FLD1274) {
            return;
        }
        this.FLD1274 = true;
    }

    // 去混淆评级： 中等(50)
    public final boolean MTH2863() {
        return this.FLD1273 == null ? false : this.FLD1273.FLD1269 == 1 && (this.FLD1272 != null && this.FLD1272.isSpeaking()) || this.FLD1273.FLD1269 == 34 && this.MTH2864().MTH2848();
    }

    public final CLS132 MTH2864() {
        if(this.FLD1271 == null) {
            this.FLD1271 = new CLS132(CLS27.MTH900());
        }
        return this.FLD1271;
    }
}

