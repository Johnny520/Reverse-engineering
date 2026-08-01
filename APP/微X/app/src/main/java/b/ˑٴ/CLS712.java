// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS47;
import b.ˆʿ.CLS54;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS79;
import b.ˈˈ.CLS81;
import b.ˈˈ.CLS82;
import b.יﹳ.CLS167;
import b.ـˏ.CLS1645;
import b.ـˏ.CLS169;
import b.ـˏ.CLS886;
import b.ـˏ.CLS887;
import b.ـˏ.CLS888;
import b.ـˏ.CLS889;
import b.ـˏ.CLS892;
import b.ـˏ.CLS893;
import b.ـˏ.CLS894;
import b.ـˏ.CLS895;
import b.ٴـ.CLS896.CLS170;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1255;
import b.ⁱʾ.CLS1274;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONObject;

public final class CLS712 implements CLS35 {
    public final int FLD842;
    public final CLS140 FLD843;
    public final CLS21 FLD844;

    public CLS712(CLS140 ﹶˑ0, CLS21 ʾᵢ0, int v) {
        this.FLD842 = v;
        this.FLD843 = ﹶˑ0;
        this.FLD844 = ʾᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        CLS894 ﾞˎ0;
        ArrayList arrayList1;
        String[] arr_s1;
        CLS21 ʾᵢ0 = this.FLD844;
        CLS140 ﹶˑ0 = this.FLD843;
        if(this.FLD842 == 0) {
            ((CLS794)ﹶˑ0).getClass();
            CLS29 ˎᵢ0 = ((CLS794)ﹶˑ0).FLD1445;
            if(ˎᵢ0.MTH938("chatroom_container", false) || ˎᵢ0.MTH938("chatcontainer_enable", false)) {
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                String s = (String)ᵔʾ0.MTH3204()[0];
                if(s.startsWith("key_")) {
                    s = s.substring(4);
                    int v = s.indexOf("_0");
                    if(v != -1) {
                        s = s.substring(0, v);
                    }
                }
                if(CLS404.MTH5909(s) && !CLS182.MTH3480(4101800047371146037L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                    CLS79 ˎᵢ1 = ((CLS794)ﹶˑ0).FLD1147;
                    JSONObject jSONObject0 = ˎᵢ1.MTH1650(s);
                    CLS371 ʻ0 = ((CLS794)ﹶˑ0).FLD1444;
                    if(jSONObject0 == null) {
                        String s1 = ʻ0.MTH5353(ˎᵢ1.MTH1655(s));
                        if(!TextUtils.isEmpty(s1)) {
                            ᵔʾ0.MTH3204()[0] = s1;
                            return;
                        }
                    }
                    else {
                        if(!jSONObject0.has("username")) {
                            ˎᵢ1.MTH1615(s, jSONObject0, null);
                        }
                        try {
                            String s2 = jSONObject0.optString("username");
                            if(TextUtils.isEmpty(s2)) {
                                s2 = ʻ0.MTH5353(ˎᵢ1.MTH1655(s));
                            }
                            if(!ʾᵢ0.MTH830("isHidden", new Object[]{s2})) {
                                ᵔʾ0.MTH3204()[0] = s2;
                                return;
                            }
                        }
                        catch(Throwable throwable0) {
                            CLS27.MTH893(throwable0);
                        }
                    }
                }
            }
            return;
        }
        ((CLS629)ﹶˑ0).getClass();
        String s3 = (String)arr_object[0];
        if(!TextUtils.isEmpty(s3)) {
            ArrayList arrayList0 = (ArrayList)arr_object[1];
            if(arrayList0 != null && !arrayList0.isEmpty()) {
                boolean z = arr_object.length <= 2 ? false : ((Boolean)arr_object[2]).booleanValue();
                if(arrayList0.size() == 1) {
                    ʾᵢ0.MTH818("mass_send_cv", new Object[]{s3, arrayList0, Boolean.valueOf(z)});
                    return;
                }
                int v1 = CLS404.MTH5907();
                String[] arr_s = CLS502.MTH6941(s3);
                int v2 = arr_s.length;
                int v4 = 0;
                for(int v3 = 0; v3 < v2; ++v3) {
                    String s4 = arr_s[v3];
                    for(Object object0: arrayList0) {
                        ContentValues contentValues0 = (ContentValues)object0;
                        int v5 = contentValues0.containsKey("delay") ? CLS182.MTH3474(4102076630380106549L, contentValues0) : -1;
                        int v6 = CLS182.MTH3474(0x38ED80FC2B3CD335L, contentValues0);
                        CLS139 ﹶʼ0 = ((CLS629)ﹶˑ0).FLD1447;
                        switch(v6) {
                            case -333: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                if(CLS21.FLD76.MTH830("hasTTS", new Object[0])) {
                                    ﾞˎ0 = new CLS894();
                                    ﾞˎ0.MTH3304(contentValues0.getAsString("tts"));
                                }
                                else {
                                    ﾞˎ0 = null;
                                }
                                break;
                            }
                            case -104: {
                                arr_s1 = arr_s;
                                ﾞˎ0 = new CLS895();
                                String s5 = contentValues0.getAsString("url");
                                File file0 = new File(CLS31.MTH980());
                                arrayList1 = arrayList0;
                                CLS432.MTH6184(file0.getAbsolutePath(), s5, ((CLS3)new CLS1274(ﾞˎ0, file0, 4)));
                                break;
                            }
                            case -103: {
                                arr_s1 = arr_s;
                                ﾞˎ0 = new CLS888();
                                ((CLS888)ﾞˎ0).MTH3251(contentValues0.getAsString("url"));
                                arrayList1 = arrayList0;
                                break;
                            }
                            case -102: {
                                arr_s1 = arr_s;
                                ﾞˎ0 = new CLS889();
                                ((CLS889)ﾞˎ0).MTH3261(contentValues0.getAsString("url"));
                                arrayList1 = arrayList0;
                                break;
                            }
                            case -101: {
                                arr_s1 = arr_s;
                                ﾞˎ0 = new CLS886();
                                ((CLS886)ﾞˎ0).MTH3223(contentValues0.getAsString("url"));
                                arrayList1 = arrayList0;
                                break;
                            }
                            case -100: {
                                ﾞˎ0 = new CLS887();
                                arr_s1 = arr_s;
                                CLS1255 ᵢﹶ0 = new CLS1255(ﾞˎ0, contentValues0.getAsString("url"), 9);
                                CLS40.FLD157.MTH1124(((CLS39)ᵢﹶ0));
                                arrayList1 = arrayList0;
                                break;
                            }
                            case -49: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                if(contentValues0.containsKey("path")) {
                                    ﾞˎ0 = new CLS888(contentValues0.getAsString("path"));
                                }
                                else if(contentValues0.containsKey("uri")) {
                                    ﾞˎ0 = new CLS888(Uri.parse(contentValues0.getAsString("uri")));
                                }
                                else {
                                    ﾞˎ0 = null;
                                }
                                break;
                            }
                            case 0xFFFFFFD1: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                ﾞˎ0 = new CLS895(contentValues0.getAsString("img"));
                                break;
                            }
                            case -33: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                if(v4 <= v1 && CLS500.FLD4928.MTH6895("voice_manager")) {
                                    try {
                                        String s6 = contentValues0.getAsString("voice_id");
                                        CLS82 יﹳ0 = CLS54.FLD172.MTH1250(s6);
                                        ArrayList arrayList2 = CLS54.FLD172.MTH1241(יﹳ0);
                                        for(int v7 = 0; v7 < arrayList2.size(); ++v7) {
                                            CLS894 ﾞˎ1 = new CLS894(יﹳ0.MTH1679(v7), ((InputStream)arrayList2.get(v7)));
                                            ﾞˎ1.FLD1624 = v5;
                                            ﹶʼ0.MTH3013(new CLS170(((CLS169)ﾞˎ1), s4), z);
                                        }
                                    }
                                    catch(Throwable throwable1) {
                                        CLS27.MTH893(throwable1);
                                        ﾞˎ0 = null;
                                        break;
                                    }
                                }
                                ﾞˎ0 = null;
                                break;
                            }
                            case -16: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                ﾞˎ0 = new CLS889(new File(contentValues0.getAsString("path")));
                                break;
                            }
                            case -4: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                ﾞˎ0 = new CLS1645(CLS66.MTH1370(contentValues0.getAsString("avatar")));
                                break;
                            }
                            case -3: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                if(v4 <= v1) {
                                    try {
                                        long v8 = (long)contentValues0.getAsLong("code");
                                        CLS81 יᐧ0 = CLS47.FLD167.MTH1199(v8);
                                        ArrayList arrayList3 = CLS47.FLD167.MTH1201(יᐧ0);
                                        for(int v9 = 0; v9 < arrayList3.size(); ++v9) {
                                            CLS894 ﾞˎ2 = new CLS894(((int)(((Integer)יᐧ0.FLD306.get(v9)))) * 1000, ((InputStream)arrayList3.get(v9)));
                                            ﾞˎ2.FLD1624 = v5;
                                            ﹶʼ0.MTH3013(new CLS170(((CLS169)ﾞˎ2), s4), z);
                                        }
                                    }
                                    catch(Throwable throwable1) {
                                        CLS27.MTH893(throwable1);
                                    }
                                }
                                ﾞˎ0 = null;
                                break;
                            }
                            case 1: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                ﾞˎ0 = new CLS887(contentValues0.getAsString("content"));
                                break;
                            }
                            case -2: 
                            case 2: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                ﾞˎ0 = new CLS886(new File(contentValues0.getAsString("img")));
                                break;
                            }
                            case 3: 
                            case 34: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                ﾞˎ0 = v4 <= v1 ? new CLS894(CLS182.MTH3474(4102076230948148021L, contentValues0), contentValues0.getAsString("voice")) : null;
                                break;
                            }
                            case 42: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                ﾞˎ0 = new CLS1645(contentValues0.getAsString("content"));
                                break;
                            }
                            case 0x30: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                ﾞˎ0 = new CLS893(contentValues0.getAsString("lat"), contentValues0.getAsString("lng"), contentValues0.getAsString("addr"), contentValues0.getAsString("poi"));
                                break;
                            }
                            case 43: 
                            case 62: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                String s7 = contentValues0.getAsString("imgPath");
                                ﾞˎ0 = new CLS889(CLS34.MTH1080(4102076999747294005L, contentValues0), s7);
                                if(!TextUtils.isEmpty(s7)) {
                                    CLS466.MTH6507(s7, null, false, 0);
                                }
                                break;
                            }
                            case 49: 
                            case 0x2D000031: 
                            case 0x3A000031: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                ﾞˎ0 = new CLS892(contentValues0.getAsString("content"), contentValues0.getAsByteArray("imgBuf"));
                                break;
                            }
                            default: {
                                arr_s1 = arr_s;
                                arrayList1 = arrayList0;
                                ﾞˎ0 = !contentValues0.containsKey("fav") || !contentValues0.containsKey("localId") ? null : new CLS893(0, contentValues0.getAsString("localId"));
                            }
                        }
                        if(ﾞˎ0 != null) {
                            ((CLS169)ﾞˎ0).MTH3233(v5);
                            ﹶʼ0.MTH3013(new CLS170(((CLS169)ﾞˎ0), s4), z);
                        }
                        arr_s = arr_s1;
                        arrayList0 = arrayList1;
                    }
                    ++v4;
                }
            }
        }
    }
}

