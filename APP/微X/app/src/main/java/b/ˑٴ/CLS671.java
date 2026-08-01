// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ˆٴ.CLS66;
import b.ˊﾞ.CLS613;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS502;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CLS671 implements CLS35 {
    public final int FLD703;
    public final CLS631 FLD704;

    public CLS671(CLS631 ʻˑ0, int v) {
        this.FLD703 = v;
        this.FLD704 = ʻˑ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        ContentValues contentValues3;
        ContentValues contentValues2;
        CLS631 ʻˑ0 = this.FLD704;
        switch(this.FLD703) {
            case 0: {
                if(!ʻˑ0.FLD1447.FLD1410 && "message".equalsIgnoreCase(((String)arr_object[2]))) {
                    ContentValues contentValues1 = (ContentValues)arr_object[3];
                    if(!CLS481.MTH6686(ʻˑ0.FLD561, contentValues1)) {
                        CLS29 ˎᵢ0 = ʻˑ0.FLD1445;
                        if(ˎᵢ0.MTH938("enable_bombprevention", false)) {
                            String s2 = contentValues1.getAsString("talker");
                            int v = contentValues1.containsKey("isSend") ? CLS182.MTH3474(4101736052358435637L, contentValues1) : 0;
                            if(v != 1 && !CLS372.MTH5400(s2) && CLS502.MTH6934(ˎᵢ0.MTH925("bomb_prevention_list", ""), new String[]{s2})) {
                                int v1 = CLS182.MTH3474(4101736726668301109L, contentValues1);
                                if(v1 == 1 || v1 == 49 || v1 == 0x13000031 || v1 == 0x1000031) {
                                    String s3 = contentValues1.getAsString("content");
                                    String s4 = CLS426.MTH6106(v, s3, s2);
                                    if((!s4.startsWith("#*") || !s4.endsWith("*#")) && !CLS502.MTH6934(s4, new String[]{"#ga ", "#cn "})) {
                                        String s5 = contentValues1.getAsString("msgId");
                                        HashMap hashMap1 = ʻˑ0.FLD560;
                                        CLS371 ʻ0 = ʻˑ0.FLD1444;
                                        if(v1 == 49) {
                                            int v2 = s3.indexOf("</des>");
                                            if(v2 != -1) {
                                                int v3 = s3.indexOf("<des>");
                                                if(v3 != -1) {
                                                    s4 = s3.substring(v3 + 5, v2);
                                                }
                                                if(s4.length() <= 500 && (!CLS502.MTH6934(s4, new String[]{"return"}) || !CLS502.MTH6934(s4, new String[]{"Exception"}) || !CLS502.MTH6934(s4, new String[]{"{"}) || !CLS502.MTH6934(s4, new String[]{"}"}))) {
                                                    goto label_72;
                                                }
                                                contentValues2 = new ContentValues(contentValues1);
                                                contentValues1.put(CLS34.MTH1063(4101736473265230645L, contentValues1, 10000, 4101736494740067125L), "");
                                                contentValues1.put("content", String.format(CLS27.MTH889("text_bomb_prevented"), (CLS426.MTH6126(s2) ? CLS613.MTH1971(CLS66.MTH1452(s2, CLS426.MTH6109(s3))) : ʻ0.MTH5311(s2)), s5));
                                                contentValues2.put("content", s3.substring(0, v3 + 5) + s3.substring(v2));
                                                hashMap1.put(s5, contentValues2);
                                                return;
                                            }
                                        }
                                        else {
                                            switch(v1) {
                                                case 0x1000031: {
                                                    if(s3.length() > 10000) {
                                                        contentValues2 = new ContentValues(contentValues1);
                                                        contentValues1.put(CLS34.MTH1063(4101732917032309557L, contentValues1, 10000, 4101732938507146037L), "");
                                                        contentValues1.put("content", String.format(CLS27.MTH889("text_bomb_prevented"), (CLS426.MTH6126(s2) ? CLS613.MTH1971(CLS66.MTH1452(s2, CLS426.MTH6109(s3))) : ʻ0.MTH5311(s2)), s5));
                                                        contentValues2.put(CLS370.MTH5289(4101732551960089397L), s3);
                                                        hashMap1.put(s5, contentValues2);
                                                        return;
                                                    }
                                                    int v4 = s3.indexOf("<title>");
                                                    int v5 = s3.indexOf("</title>");
                                                    if(v4 != -1 && v5 != -1) {
                                                        if(s3.substring(v4, v5).length() <= 2000) {
                                                            goto label_72;
                                                        }
                                                        contentValues2 = new ContentValues(contentValues1);
                                                        contentValues1.put(CLS34.MTH1063(0x38EC48D22B3CD335L, contentValues1, 10000, 4101733449608254261L), "");
                                                        contentValues1.put("content", String.format(CLS27.MTH889("text_bomb_prevented"), (CLS426.MTH6126(s2) ? CLS613.MTH1971(CLS66.MTH1452(s2, CLS426.MTH6109(s3))) : ʻ0.MTH5311(s2)), s5));
                                                        contentValues2.put(CLS370.MTH5289(4101733612817011509L), s3);
                                                        hashMap1.put(s5, contentValues2);
                                                        return;
                                                    }
                                                    contentValues2 = new ContentValues(contentValues1);
                                                    contentValues1.put(CLS34.MTH1063(0x38EC481F2B3CD335L, contentValues1, 10000, 4101732680809108277L), "");
                                                    contentValues1.put("content", String.format(CLS27.MTH889("text_bomb_prevented"), (CLS426.MTH6126(s2) ? CLS613.MTH1971(CLS66.MTH1452(s2, CLS426.MTH6109(s3))) : ʻ0.MTH5311(s2)), s5));
                                                    contentValues2.put(CLS370.MTH5289(0x38EC48CA2B3CD335L), s3);
                                                    hashMap1.put(s5, contentValues2);
                                                    return;
                                                }
                                                case 0x13000031: {
                                                    int v6 = s4.indexOf("<value>");
                                                    if(v6 != -1) {
                                                        s4 = s4.substring(v6, s4.indexOf("</value>"));
                                                    label_72:
                                                        if(!TextUtils.isEmpty(s4)) {
                                                            int v7 = s4.length();
                                                            if(v7 > 6000 || v7 > 500 && !TextUtils.isEmpty(s4) && CLS502.MTH6935(ʻˑ0.FLD562, s4)) {
                                                                contentValues3 = new ContentValues(contentValues1);
                                                                contentValues1.put(CLS34.MTH1063(4101733097420935989L, contentValues1, 10000, 0x38EC488A2B3CD335L), "");
                                                                contentValues1.put("content", String.format(CLS27.MTH889("text_bomb_prevented"), (CLS426.MTH6126(s2) ? CLS613.MTH1971(CLS66.MTH1452(s2, CLS426.MTH6109(s3))) : ʻ0.MTH5311(s2)), s5));
                                                                hashMap1.put(s5, contentValues3);
                                                            }
                                                            else if(v7 > 3000) {
                                                                Pattern pattern0 = ʻˑ0.FLD564;
                                                                if(pattern0 != null) {
                                                                    String s6 = s4.replaceAll(" |\n|\r", "");
                                                                    if(!TextUtils.isEmpty(s6)) {
                                                                        Matcher matcher0 = pattern0.matcher(s6);
                                                                        HashMap hashMap2 = new HashMap();
                                                                        while(matcher0.find()) {
                                                                            for(int v8 = 1; v8 <= matcher0.groupCount(); ++v8) {
                                                                                String s7 = matcher0.group(v8);
                                                                                if(TextUtils.isEmpty(s7) || !CLS502.MTH6935(ʻˑ0.FLD563, s7)) {
                                                                                    if(hashMap2.containsKey(matcher0.group(v8))) {
                                                                                        int v9 = (int)(((Integer)hashMap2.get(s7)));
                                                                                        hashMap2.put(s7, ((int)(v9 + 1)));
                                                                                        if(s7.length() > 100 || v9 + 1 >= 10) {
                                                                                            contentValues3 = new ContentValues(contentValues1);
                                                                                            contentValues1.put(CLS34.MTH1063(4101733312169300789L, contentValues1, 10000, 0x38EC48BC2B3CD335L), "");
                                                                                            contentValues1.put("content", String.format(CLS27.MTH889("text_bomb_prevented"), (CLS426.MTH6126(s2) ? CLS613.MTH1971(CLS66.MTH1452(s2, CLS426.MTH6109(s3))) : ʻ0.MTH5311(s2)), s5));
                                                                                            hashMap1.put(s5, contentValues3);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        hashMap2.put(s7, 1);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        char[] arr_c = s6.toCharArray();
                                                                        int v11 = 0;
                                                                        for(int v10 = 0; v10 < arr_c.length; ++v10) {
                                                                            String s8 = "" + Character.UnicodeBlock.of(arr_c[v10]);
                                                                            if(s8.equals("PRIVATE_USE_AREA") || s8.equals("CYRILLIC_EXTENDED_B")) {
                                                                                ++v11;
                                                                                if(v11 >= 10) {
                                                                                    contentValues3 = new ContentValues(contentValues1);
                                                                                    contentValues1.put(CLS34.MTH1063(4101733660061651765L, contentValues1, 10000, 0x38EC490D2B3CD335L), "");
                                                                                    contentValues1.put("content", String.format(CLS27.MTH889("text_bomb_prevented"), (CLS426.MTH6126(s2) ? CLS613.MTH1971(CLS66.MTH1452(s2, CLS426.MTH6109(s3))) : ʻ0.MTH5311(s2)), s5));
                                                                                    hashMap1.put(s5, contentValues3);
                                                                                    return;
                                                                                }
                                                                            }
                                                                        }
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    break;
                                                }
                                                default: {
                                                    goto label_72;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 1: {
                if(!ʻˑ0.FLD1447.FLD1410) {
                    CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                    CLS29 ˎᵢ1 = ʻˑ0.FLD1445;
                    if(ˎᵢ1.MTH938("enable_bombprevention", false)) {
                        int v12 = CLS166.MTH3181(ᵔʾ0.MTH3205(), "field_isSend");
                        String s9 = (String)CLS166.MTH3194(ᵔʾ0.MTH3205(), "field_talker");
                        if(v12 != 1 && !CLS372.MTH5400(s9) && CLS502.MTH6934(ˎᵢ1.MTH925("bomb_prevention_list", ""), new String[]{s9})) {
                            int v13 = CLS166.MTH3181(ᵔʾ0.MTH3205(), "field_type");
                            long v14 = CLS166.MTH3185(ᵔʾ0.MTH3205(), "field_msgId");
                            String s10 = (String)CLS166.MTH3194(ᵔʾ0.MTH3205(), "field_content");
                            String s11 = CLS426.MTH6106(v12, s10, s9);
                            if((!s11.startsWith("#*") || !s11.endsWith("*#")) && !CLS502.MTH6934(s11, new String[]{"#ga ", "#cn "})) {
                                CLS371 ʻ1 = ʻˑ0.FLD1444;
                                if(v13 == 49) {
                                    int v15 = s10.indexOf("</des>");
                                    if(v15 != -1) {
                                        int v16 = s10.indexOf("<des>");
                                        String s12 = v16 == -1 ? "" : s10.substring(v16 + 5, v15);
                                        if(s12.length() > 2000 || CLS502.MTH6934(s12, new String[]{"return"}) && CLS502.MTH6934(s12, new String[]{"Exception"}) && CLS502.MTH6934(s12, new String[]{"{"}) && CLS502.MTH6934(s12, new String[]{"}"}) && CLS502.MTH6934(s12, new String[]{"public"})) {
                                            CLS166.MTH3196(10000, ᵔʾ0.MTH3205(), "field_type");
                                            CLS166.MTH3198(ᵔʾ0.MTH3205(), "field_content", String.format(CLS27.MTH889("text_bomb_prevented2"), (CLS426.MTH6126(s9) ? CLS613.MTH1971(CLS66.MTH1452(s9, CLS426.MTH6109(s10))) : ʻ1.MTH5311(s9)), v14));
                                            return;
                                        }
                                    }
                                }
                                else if(v13 == 0x1000031) {
                                    if(s10.length() > 10000) {
                                        CLS166.MTH3196(10000, ᵔʾ0.MTH3205(), "field_type");
                                        CLS166.MTH3198(ᵔʾ0.MTH3205(), "field_content", String.format(CLS27.MTH889("text_bomb_prevented2"), (CLS426.MTH6126(s9) ? CLS613.MTH1971(CLS66.MTH1452(s9, CLS426.MTH6109(s10))) : ʻ1.MTH5311(s9)), v14));
                                        return;
                                    }
                                    int v17 = s10.indexOf("<title>");
                                    int v18 = s10.indexOf("</title>");
                                    if(v17 == -1 || v18 == -1) {
                                        CLS166.MTH3196(10000, ᵔʾ0.MTH3205(), "field_type");
                                        CLS166.MTH3198(ᵔʾ0.MTH3205(), "field_content", String.format(CLS27.MTH889("text_bomb_prevented2"), (CLS426.MTH6126(s9) ? CLS613.MTH1971(CLS66.MTH1452(s9, CLS426.MTH6109(s10))) : ʻ1.MTH5311(s9)), v14));
                                    }
                                    else if(s10.substring(v17, v18).length() > 2000) {
                                        CLS166.MTH3196(10000, ᵔʾ0.MTH3205(), "field_type");
                                        CLS166.MTH3198(ᵔʾ0.MTH3205(), "field_content", String.format(CLS27.MTH889("text_bomb_prevented2"), (CLS426.MTH6126(s9) ? CLS613.MTH1971(CLS66.MTH1452(s9, CLS426.MTH6109(s10))) : ʻ1.MTH5311(s9)), v14));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            default: {
                ʻˑ0.getClass();
                if("bomb".equals(((String)arr_object[0]))) {
                    String s = (String)arr_object[1];
                    HashMap hashMap0 = ʻˑ0.FLD560;
                    try {
                        if(hashMap0.containsKey(s)) {
                            ContentValues contentValues0 = (ContentValues)hashMap0.get(s);
                            ʻˑ0.FLD1444.MTH5342("message", contentValues0, "msgId = ?", new String[]{s});
                            String s1 = contentValues0.getAsString("talker");
                            ʻˑ0.FLD1447.MTH3012(s1);
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }
    }
}

