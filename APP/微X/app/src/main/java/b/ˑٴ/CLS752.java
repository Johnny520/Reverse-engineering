// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import android.view.KeyEvent;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS36.CLS35;
import b.ˆٴ.CLS66;
import b.יᐧ.CLS158;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.lang.reflect.Field;

public final class CLS752 implements CLS35 {
    public final int FLD983;
    public final CLS830 FLD984;

    public CLS752(CLS830 ᵔᵢ0, int v) {
        this.FLD983 = v;
        this.FLD984 = ᵔᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        String s13;
        String s10;
        boolean z;
        Boolean boolean0;
        Object object0 = null;
        CLS830 ᵔᵢ0 = this.FLD984;
        switch(this.FLD983) {
            case 0: {
                ᵔᵢ0.getClass();
                CLS29 ˎᵢ0 = ᵔᵢ0.FLD1445;
                if(ˎᵢ0.MTH938("voice_duration_change_enable", false)) {
                    Object object2 = arr_object[0];
                    try {
                        Field field0 = object2.getClass().getDeclaredField("args");
                        if(field0 != null) {
                            field0.setAccessible(true);
                            object0 = field0.get(object2);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    ((Object[])object0)[0] = (int)(ˎᵢ0.MTH927(60000, "voice_duration") + 10000);
                }
                return;
            }
            case 1: {
                ᵔᵢ0.getClass();
                CLS29 ˎᵢ1 = ᵔᵢ0.FLD1445;
                if(ˎᵢ1.MTH938("voice_duration_change_enable", false)) {
                    int v2 = Math.max(ˎᵢ1.MTH927(60000, "voice_duration") + 10000, 70000);
                    Object object3 = arr_object[0];
                    try {
                        Field field1 = object3.getClass().getDeclaredField("thisObject");
                        if(field1 != null) {
                            field1.setAccessible(true);
                            object0 = field1.get(object3);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    Object object4 = CLS182.MTH3492(4101448607377183541L, object0);
                    Object object5 = CLS182.MTH3492(4101448757701038901L, object4);
                    if(object5 != null) {
                        CLS166.MTH3195(object5, "setMaxDuration", new Object[]{v2});
                    }
                    CLS166.MTH3190(v2, object4, CLS27.MTH897("voiceClass3_maxDurationField"));
                }
                return;
            }
            case 2: {
                ᵔᵢ0.getClass();
                CLS29 ˎᵢ2 = ᵔᵢ0.FLD1445;
                if(ˎᵢ2.MTH938("voice_duration_change_enable", false)) {
                    CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                    try {
                        Object object6 = TextUtils.isEmpty(CLS27.MTH897("voiceField1")) ? CLS164.MTH3175(ᵔʾ0.MTH3205(), CLS27.MTH897("voiceClass4b")) : CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("voiceField1"));
                        if(object6 != null) {
                            long v3 = (long)(((Long)(CLS27.MTH890("voiceMethod4a") ? CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3194(object6, CLS27.MTH897("voiceField2")), CLS27.MTH897("voiceMethod4a"), new Object[0]), CLS27.MTH897("voiceMethod4"), new Object[0]) : CLS166.MTH3195(CLS166.MTH3194(object6, CLS27.MTH897("voiceField2")), CLS27.MTH897("voiceMethod4"), new Object[0]))));
                            int v4 = ˎᵢ2.MTH927(60000, "voice_duration");
                            int v5 = (int)((((long)v4) - v3) / 1000L);
                            if(v3 >= ((long)(v4 - 10000)) && v3 <= ((long)v4)) {
                                Object object7 = CLS166.MTH3194(object6, CLS27.MTH897("voiceField4"));
                                if(!CLS166.MTH3183(object6, CLS27.MTH897("voiceField3"))) {
                                    CLS390.MTH5614(500L);
                                    CLS166.MTH3189(object6, CLS27.MTH897("voiceField3"), true);
                                }
                                if(!CLS27.MTH890("chatfooter_setVoiceReactArea")) {
                                    CLS166.MTH3195(object7, CLS27.MTH892("voiceMethod8", "setRecordNormalWording"), new Object[]{String.format(CLS27.MTH889("voice_time_left"), v5)});
                                }
                            }
                            Object object8 = CLS166.MTH3194(object6, CLS27.MTH897("voiceField4"));
                            if(CLS27.MTH890("chatfooter_setVoiceReactArea")) {
                                CLS166.MTH3195(object8, CLS27.MTH897("chatfooter_setVoiceReactArea"), new Object[]{v5});
                            }
                            if(v3 < ((long)v4)) {
                                boolean0 = Boolean.TRUE;
                            }
                            else {
                                CLS166.MTH3195(object6, CLS27.MTH897("voiceMethod5"), new Object[0]);
                                CLS166.MTH3195(CLS166.MTH3194(object6, CLS27.MTH897("voiceField4")), CLS27.MTH897("voiceMethod6"), new Object[0]);
                                MediaPlayer mediaPlayer0 = new MediaPlayer();
                                try {
                                    AssetFileDescriptor assetFileDescriptor0 = ((CLS140)ᵔᵢ0).MTH3042().getAssets().openFd("sound/time_limit.mp3");
                                    mediaPlayer0.setDataSource(assetFileDescriptor0.getFileDescriptor(), assetFileDescriptor0.getStartOffset(), assetFileDescriptor0.getLength());
                                    mediaPlayer0.setLooping(false);
                                    mediaPlayer0.prepare();
                                    mediaPlayer0.start();
                                    mediaPlayer0.setOnErrorListener(new CLS118());
                                    mediaPlayer0.setOnCompletionListener(new CLS131());
                                }
                                catch(Exception exception0) {
                                    CLS27.MTH893(exception0);
                                }
                                boolean0 = Boolean.FALSE;
                            }
                            ᵔʾ0.MTH3207(boolean0);
                            return;
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                return;
            }
            case 3: {
                ᵔᵢ0.getClass();
                CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                CLS29 ˎᵢ3 = ᵔᵢ0.FLD1445;
                if(ˎᵢ3.MTH938("voice_duration_change_enable", false)) {
                    Object[] arr_object1 = ᵔʾ1.MTH3204();
                    arr_object1[1] = Math.min(((int)(((Integer)ᵔʾ1.MTH3204()[1]))), 60000);
                }
                if(ˎᵢ3.MTH938("voice_wrong_length_enable", false)) {
                    Object[] arr_object2 = ᵔʾ1.MTH3204();
                    arr_object2[1] = CLS412.MTH6007(1000, 60000, ˎᵢ3.MTH927(1000, "voice_length"));
                }
                return;
            }
            case 4: {
                ᵔᵢ0.getClass();
                CLS167 ᵔʾ2 = new CLS167(arr_object[0]);
                CLS29 ˎᵢ4 = ᵔᵢ0.FLD1445;
                if(ˎᵢ4.MTH938("voice_duration_change_enable", false)) {
                    Object[] arr_object3 = ᵔʾ2.MTH3204();
                    arr_object3[0] = Math.min(((int)(((Integer)ᵔʾ2.MTH3204()[1]))), 60000);
                }
                if(ˎᵢ4.MTH938("voice_wrong_length_enable", false)) {
                    Object[] arr_object4 = ᵔʾ2.MTH3204();
                    arr_object4[0] = CLS412.MTH6007(1000, 60000, ˎᵢ4.MTH927(1000, "voice_length"));
                }
                return;
            }
            case 5: {
                ᵔᵢ0.getClass();
                if(ᵔᵢ0.FLD1445.MTH938("auto_tts_enable", false) && ᵔᵢ0.FLD1445.MTH938("auto_tts_volume_control", false)) {
                    CLS167 ᵔʾ3 = new CLS167(arr_object[0]);
                    KeyEvent keyEvent0 = (KeyEvent)ᵔʾ3.MTH3204()[0];
                    if(ᵔᵢ0.FLD1276) {
                        if(keyEvent0.getAction() == 1) {
                            switch(keyEvent0.getKeyCode()) {
                                case 24: {
                                    ᵔᵢ0.MTH2860();
                                    break;
                                }
                                case 25: {
                                    ᵔᵢ0.MTH2855();
                                    ᵔᵢ0.FLD1273 = null;
                                    ᵔᵢ0.MTH2860();
                                    break;
                                }
                                default: {
                                    return;
                                }
                            }
                            ᵔʾ3.MTH3207(Boolean.TRUE);
                            return;
                        }
                    }
                    else if(ᵔᵢ0.MTH2863() && keyEvent0.getAction() == 1 && keyEvent0.getKeyCode() == 25) {
                        ᵔᵢ0.MTH2855();
                        ᵔʾ3.MTH3207(Boolean.TRUE);
                    }
                }
                return;
            }
            case 6: {
                ᵔᵢ0.getClass();
                if("tts_shortcut".equals(((String)arr_object[0]))) {
                    Activity activity0 = ((CLS140)ᵔᵢ0).MTH3042();
                    CLS523.MTH7150(activity0, CLS27.MTH889("tts_shortcut_enable"), ((CLS17)new CLS796(activity0, 1)));
                }
                return;
            }
            case 7: {
                ᵔᵢ0.getClass();
                ᵔᵢ0.MTH2861(((CLS3)arr_object[3]), ((String)arr_object[0]), ((String)arr_object[1]), ((String)arr_object[2]));
                return;
            }
            case 8: {
                ᵔᵢ0.getClass();
                if("tts_play_as_voice".equals(((String)arr_object[0]))) {
                    String s4 = CLS502.MTH6931(ᵔᵢ0.FLD1446.MTH5752(((long)(((Long)arr_object[1])))));
                    if(!TextUtils.isEmpty(s4)) {
                        try {
                            ᵔᵢ0.MTH2856(s4);
                            return;
                        }
                        catch(Throwable throwable2) {
                            CLS27.MTH893(throwable2);
                        }
                    }
                }
                return;
            }
            case 9: {
                if(!ᵔᵢ0.FLD1447.FLD1410 && "message".equalsIgnoreCase(((String)arr_object[2]))) {
                    ContentValues contentValues0 = (ContentValues)arr_object[3];
                    CLS29 ˎᵢ5 = ᵔᵢ0.FLD1445;
                    if(ˎᵢ5.MTH938("auto_tts_enable", false)) {
                        int v6 = CLS182.MTH3474(4101470683509084981L, contentValues0);
                        int v7 = contentValues0.containsKey("isSend") ? CLS182.MTH3474(4101470735048692533L, contentValues0) : 0;
                        if(v7 != 1) {
                            String s5 = contentValues0.getAsString("talker");
                            if(!CLS372.MTH5400(s5) && CLS502.MTH6934(ˎᵢ5.MTH925("tts_play_voice_include_list", ""), new String[]{s5})) {
                                if(ˎᵢ5.MTH938("auto_tts_do_not_disturb", false)) {
                                    String s6 = ˎᵢ5.MTH925("auto_tts_do_not_disturb_start", "23:0");
                                    String s7 = ˎᵢ5.MTH925("auto_tts_do_not_disturb_end", "8:0");
                                    String[] arr_s = s6.split(":");
                                    String[] arr_s1 = s7.split(":");
                                    int v8 = Integer.parseInt(arr_s1[0]);
                                    int v9 = Integer.parseInt(arr_s1[1]);
                                    z = CLS481.MTH6687(String.format("%02d:%02d", Integer.parseInt(arr_s[0]), Integer.parseInt(arr_s[1])), String.format("%02d:%02d", v8, v9));
                                }
                                else {
                                    z = false;
                                }
                                if(!z && !CLS372.MTH5396(s5)) {
                                    String s8 = contentValues0.getAsString("content");
                                    CLS371 ʻ0 = ᵔᵢ0.FLD1444;
                                    CLS158 ⁱʾ0 = ᵔᵢ0.FLD1275;
                                    switch(v6) {
                                        case 1: {
                                            if(ˎᵢ5.MTH938("tts_enable", true)) {
                                                if(ˎᵢ5.MTH938("auto_tts_announce_speaker", false)) {
                                                    if(CLS426.MTH6126(s5)) {
                                                        String s9 = CLS426.MTH6109(s8);
                                                        s10 = ʻ0.MTH5323(s9);
                                                        if(TextUtils.isEmpty(s10)) {
                                                            s10 = CLS66.MTH1452(s5, s9);
                                                        }
                                                    }
                                                    else {
                                                        s10 = ʻ0.MTH5311(s5);
                                                    }
                                                    if(!TextUtils.isEmpty(s10)) {
                                                        StringBuilder stringBuilder0 = CLS182.MTH3483(s10);
                                                        stringBuilder0.append(CLS27.MTH889("talk"));
                                                        stringBuilder0.append(CLS426.MTH6106(v7, s8, s5));
                                                        s8 = stringBuilder0.toString();
                                                    }
                                                }
                                                else {
                                                    s8 = CLS426.MTH6106(v7, s8, s5);
                                                }
                                                ⁱʾ0.MTH3150(new CLS133(1, s8));
                                            }
                                            break;
                                        }
                                        case 34: {
                                            ⁱʾ0.MTH3150(new CLS133(34, contentValues0.getAsString("imgPath")));
                                            break;
                                        }
                                        case 0x1000031: 
                                        case 0x31000031: {
                                            String s11 = (String)CLS392.MTH5633(s8, "msg").get(".msg.appmsg.title");
                                            if(ˎᵢ5.MTH938("auto_tts_announce_speaker", false)) {
                                                if(CLS426.MTH6126(s5)) {
                                                    String s12 = CLS426.MTH6109(s8);
                                                    s13 = ʻ0.MTH5323(s12);
                                                    if(TextUtils.isEmpty(s13)) {
                                                        s13 = CLS66.MTH1452(s5, s12);
                                                    }
                                                }
                                                else {
                                                    s13 = ʻ0.MTH5311(s5);
                                                }
                                                if(!TextUtils.isEmpty(s13)) {
                                                    StringBuilder stringBuilder1 = CLS182.MTH3483(s13);
                                                    stringBuilder1.append(CLS27.MTH889("talk"));
                                                    stringBuilder1.append(s11);
                                                    s11 = stringBuilder1.toString();
                                                }
                                            }
                                            ⁱʾ0.MTH3150(new CLS133(1, s11));
                                        }
                                    }
                                    ⁱʾ0.MTH3149(1500L);
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 10: {
                ᵔᵢ0.getClass();
                String s14 = (String)arr_object[0];
                try {
                    TextToSpeech textToSpeech0 = new TextToSpeech(CLS27.MTH900(), new CLS112(ᵔᵢ0, s14));
                    ᵔᵢ0.FLD1277 = textToSpeech0;
                    textToSpeech0.setOnUtteranceProgressListener(new CLS107(ᵔᵢ0));
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                CLS412.MTH6014(((CLS140)ᵔᵢ0).MTH3042(), CLS27.MTH889("tts_start"));
                return;
            }
            case 11: {
                ᵔᵢ0.getClass();
                TextToSpeech textToSpeech1 = ᵔᵢ0.FLD1277;
                if(textToSpeech1 != null) {
                    try {
                        textToSpeech1.stop();
                        ᵔᵢ0.FLD1277.shutdown();
                        ᵔᵢ0.FLD1277 = null;
                        CLS412.MTH6014(((CLS140)ᵔᵢ0).MTH3042(), CLS27.MTH889("tts_stop"));
                        return;
                    }
                    catch(Throwable throwable4) {
                        CLS27.MTH893(throwable4);
                    }
                }
                return;
            }
            case 12: {
                ᵔᵢ0.getClass();
                ᵔᵢ0.MTH2861(null, ((String)arr_object[0]), "WechatXposedTTS.wav", "WECHATXPOSEDTTS");
                return;
            }
            case 13: {
                ᵔᵢ0.getClass();
                ᵔᵢ0.MTH2856(((String)arr_object[0]));
                return;
            }
            default: {
                ᵔᵢ0.getClass();
                String s = (String)arr_object[0];
                Object object1 = arr_object[1];
                int v = CLS166.MTH3181(object1, "field_type");
                String s1 = (String)CLS166.MTH3194(object1, "field_content");
                String s2 = (String)CLS166.MTH3194(object1, "field_talker");
                int v1 = CLS166.MTH3181(object1, "field_isSend");
                try {
                    if(s.equals("tts")) {
                        String s3 = CLS426.MTH6106(v1, s1, s2);
                        if(v == 0x1000031 || v == 0x31000031) {
                            s3 = (String)CLS392.MTH5633(s3, "msg").get(".msg.appmsg.title");
                        }
                        ᵔᵢ0.MTH2856(s3);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

