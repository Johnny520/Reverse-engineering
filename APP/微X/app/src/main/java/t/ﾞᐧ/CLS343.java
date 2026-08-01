// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.media.MediaPlayer;
import android.text.TextUtils;
import java.io.File;
import t.ʻˑ.CLS3;
import t.ˆʿ.CLS28;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS34;
import t.ˆʿ.CLS38;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS143;
import t.ﾞٴ.CLS309;

public final class CLS343 implements CLS143 {
    public final int FLD1290;
    public final Object FLD1291;

    public CLS343(Object object0, int v) {
        this.FLD1290 = v;
        this.FLD1291 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        Object object0 = this.FLD1291;
        switch(this.FLD1290) {
            case 0: {
                ((CLS172)object0).FLD1220 = ((CLS172)object0).FLD1211;
                ((CLS172)object0).MTH2421(((CLS172)object0).FLD1211);
                ((CLS172)object0).MTH2420();
                return;
            }
            case 1: {
                CLS34 ˊⁱ0 = CLS34.FLD463;
                ˊⁱ0.getClass();
                String[] arr_s = {((String)object0)};
                try {
                    if(ˊⁱ0.MTH1371()) {
                        Object object1 = ˊⁱ0.MTH1370();
                        if(object1 == null) {
                            goto label_25;
                        }
                        else {
                            ((Integer)CLS3.MTH991(object1, CLS133.MTH2115("SqliteDB_delete"), new Object[]{"rconversation", "username=?", arr_s})).intValue();
                        }
                    }
                    else {
                        goto label_25;
                    }
                    goto label_32;
                }
                catch(Throwable throwable1) {
                    CLS133.MTH2113(throwable1);
                }
                try {
                label_25:
                    if(ˊⁱ0.MTH1372()) {
                        Object object2 = ˊⁱ0.MTH1368();
                        if(object2 != null) {
                            ((Integer)CLS3.MTH991(object2, "delete", new Object[]{"rconversation", "username=?", arr_s})).intValue();
                        }
                    }
                }
                catch(Throwable throwable2) {
                    CLS133.MTH2113(throwable2);
                }
            label_32:
                CLS123 ʾᵢ0 = CLS123.FLD912;
                String s = "base";
                ʾᵢ0.getClass();
                if(CLS28.MTH1318() && CLS33.MTH1345("base", new String[]{"base", "af", "mf", "donation"})) {
                    s = "xv";
                }
                ʾᵢ0.MTH2004(s, "refreshConversationList", new Object[0]);
                return;
            }
            case 2: {
                ((CLS309)object0).getClass();
                ((CLS309)object0).MTH2245(CLS133.MTH2115("SettingsPersonalInfoUI"));
                return;
            }
            case 3: {
                if(!TextUtils.isEmpty(((CLS38)object0).FLD476)) {
                    File file0 = new File(((CLS38)object0).FLD476);
                    ((CLS38)object0).FLD486 = file0;
                    ((CLS38)object0).FLD481 = file0;
                    ((CLS38)object0).MTH1385();
                }
                return;
            }
            default: {
                MediaPlayer mediaPlayer0 = (MediaPlayer)object0;
                try {
                    if(mediaPlayer0.isPlaying()) {
                        mediaPlayer0.pause();
                        mediaPlayer0.stop();
                    }
                    mediaPlayer0.release();
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
        }
    }
}

