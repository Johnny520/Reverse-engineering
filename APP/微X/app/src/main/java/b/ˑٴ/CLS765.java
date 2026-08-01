// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import b.ʻˑ.CLS0;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆʿ.CLS42;
import b.ˆʿ.CLS61;
import b.ˆٴ.CLS66;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS466;
import java.util.Date;
import java.util.HashMap;

public final class CLS765 implements CLS39 {
    public final int FLD1039;
    public final CLS794 FLD1040;
    public final CLS61 FLD1041;
    public final String FLD1042;
    public final ContentValues FLD1043;
    public final String FLD1044;
    public final String FLD1045;
    public final int FLD1046;

    public CLS765(CLS794 ᴵʽ0, ContentValues contentValues0, String s, String s1, CLS61 ﾞٴ0, int v, String s2, int v1) {
        this.FLD1040 = ᴵʽ0;
        this.FLD1043 = contentValues0;
        this.FLD1042 = s;
        this.FLD1044 = s1;
        this.FLD1041 = ﾞٴ0;
        this.FLD1046 = v;
        this.FLD1045 = s2;
        this.FLD1039 = v1;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        boolean z5;
        int v19;
        int v18;
        boolean z4;
        int v13;
        boolean z3;
        HashMap hashMap2;
        int v8;
        boolean z2;
        int v5;
        HashMap hashMap1;
        int v4;
        String s = this.FLD1042;
        CLS794 ᴵʽ0 = this.FLD1040;
        ᴵʽ0.getClass();
        ContentValues contentValues0 = this.FLD1043;
        long v = (long)contentValues0.getAsLong("createTime");
        boolean z = CLS426.MTH6118(s, CLS27.MTH904());
        CLS29 ˎᵢ0 = ᴵʽ0.FLD1445;
        if(z && CLS182.MTH3480(4101826409880408885L, CLS182.MTH3483(s), ˎᵢ0, false)) {
            String s1 = this.FLD1044;
            if(!TextUtils.isEmpty(s1)) {
                boolean z1 = CLS426.MTH6118(s, s1);
                CLS61 ﾞٴ0 = this.FLD1041;
                if(!z1 && !ﾞٴ0.MTH1332(s, s1) && (!CLS182.MTH3480(0x38EC9D732B3CD335L, CLS182.MTH3483(s), ˎᵢ0, false) || !ﾞٴ0.MTH1337(s, s1)) && !s1.equals(CLS27.MTH904()) && !CLS426.MTH6123(s, s1)) {
                    int v1 = this.FLD1046;
                    if(v1 == 49) {
                        if(CLS182.MTH3480(4101826006153483061L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                            HashMap hashMap0 = CLS392.MTH5633(contentValues0.getAsString("content"), "appmsg");
                            int v2 = Integer.parseInt(((String)hashMap0.get(".appmsg.type")));
                            if(v2 == 5) {
                                if(CLS182.MTH3480(4101826250966618933L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                                    int v3 = CLS34.MTH1064(0x38EC9DE32B3CD335L, CLS182.MTH3483(s), ˎᵢ0, 3);
                                    v4 = 5;
                                    hashMap1 = hashMap0;
                                    v5 = 49;
                                    int v6 = CLS794.MTH2694().MTH1146(v3, v, s, s1, "_ARTICLE_BANWARNING_");
                                    z2 = v6 > v3 - 1;
                                    if(!z2) {
                                        StringBuilder stringBuilder0 = new StringBuilder();
                                        stringBuilder0.append(ˎᵢ0.MTH925(CLS182.MTH3475(4101826646103610165L, CLS182.MTH3483(s)), CLS27.MTH889("warning_default_text")));
                                        stringBuilder0.append(" (");
                                        stringBuilder0.append(v6 + 1);
                                        stringBuilder0.append("/");
                                        stringBuilder0.append(v3);
                                        String s2 = CLS182.MTH3475(0x38EC9A4F2B3CD335L, stringBuilder0);
                                        String s3 = CLS426.MTH6125(s, s1);
                                        CLS66.MTH1393(s, s3 + s2, s1);
                                    }
                                }
                                else {
                                    v4 = 5;
                                    hashMap1 = hashMap0;
                                    v5 = 49;
                                    z2 = true;
                                }
                                if(z2) {
                                    String s4 = ˎᵢ0.MTH925(CLS182.MTH3475(4101823034036114229L, CLS182.MTH3483(s)), "");
                                    String s5 = CLS182.MTH3473(4101823218719707957L, ˎᵢ0, CLS182.MTH3475(4101823132820362037L, CLS182.MTH3483(s)));
                                    ﾞٴ0.MTH1331(s, s1, CLS27.MTH904(), s4, s5);
                                    if(ˎᵢ0.MTH938(s + "_chatroom_ban_sendmsg_enable", true)) {
                                        String s6 = CLS182.MTH3476(CLS426.MTH6125(s, s1), s5);
                                        if(ﾞٴ0.FLD186 && !TextUtils.isEmpty(s4)) {
                                            long v7 = Long.parseLong(s4, 16);
                                            StringBuilder stringBuilder2 = CLS182.MTH3483(s6);
                                            stringBuilder2.append("\n");
                                            s6 = CLS182.MTH3481(CLS27.MTH889("auto_unban"), new Object[]{ᴵʽ0.FLD1152.format(new Date(v7 + System.currentTimeMillis()))}, stringBuilder2);
                                        }
                                        CLS66.MTH1393(s, s6, s1);
                                    }
                                    CLS426.MTH6132(s, s1, false);
                                }
                            }
                            else {
                                v4 = v2;
                                hashMap1 = hashMap0;
                                v5 = 49;
                            }
                            v8 = v4;
                            hashMap2 = hashMap1;
                        }
                        else {
                            v5 = 49;
                            hashMap2 = null;
                            v8 = -1;
                        }
                        if(CLS182.MTH3480(4101822930956899125L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                            if(hashMap2 == null) {
                                hashMap2 = CLS392.MTH5633(contentValues0.getAsString("content"), "appmsg");
                            }
                            if(v8 == -1) {
                                v8 = Integer.parseInt(((String)hashMap2.get(".appmsg.type")));
                            }
                            if(v8 == 33 || v8 == 36) {
                                if(CLS182.MTH3480(4101823708345979701L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                                    int v9 = CLS34.MTH1064(4101823300324086581L, CLS182.MTH3483(s), ˎᵢ0, 3);
                                    int v10 = CLS794.MTH2694().MTH1146(v9, v, s, s1, "_APP_BANWARNING_");
                                    z3 = v10 > v9 - 1;
                                    if(!z3) {
                                        StringBuilder stringBuilder3 = new StringBuilder();
                                        stringBuilder3.append(ˎᵢ0.MTH925(CLS182.MTH3475(4101823502187549493L, CLS182.MTH3483(s)), CLS27.MTH889("warning_default_text")));
                                        stringBuilder3.append(" (");
                                        stringBuilder3.append(v10 + 1);
                                        stringBuilder3.append("/");
                                        stringBuilder3.append(v9);
                                        String s7 = CLS182.MTH3475(0x38EC9B6F2B3CD335L, stringBuilder3);
                                        String s8 = CLS426.MTH6125(s, s1);
                                        CLS66.MTH1393(s, s8 + s7, s1);
                                    }
                                }
                                else {
                                    z3 = true;
                                }
                                if(z3) {
                                    String s9 = ˎᵢ0.MTH925(CLS182.MTH3475(4101824270986695477L, CLS182.MTH3483(s)), "");
                                    String s10 = CLS182.MTH3473(0x38EC9B142B3CD335L, ˎᵢ0, CLS182.MTH3475(4101823802835260213L, CLS182.MTH3483(s)));
                                    ﾞٴ0.MTH1331(s, s1, CLS27.MTH904(), s9, s10);
                                    if(ˎᵢ0.MTH938(s + "_chatroom_ban_sendmsg_enable", true)) {
                                        String s11 = CLS182.MTH3476(CLS426.MTH6125(s, s1), s10);
                                        if(ﾞٴ0.FLD186 && !TextUtils.isEmpty(s9)) {
                                            long v11 = Long.parseLong(s9, 16);
                                            StringBuilder stringBuilder5 = CLS182.MTH3483(s11);
                                            stringBuilder5.append("\n");
                                            s11 = CLS182.MTH3481(CLS27.MTH889("auto_unban"), new Object[]{ᴵʽ0.FLD1152.format(new Date(v11 + System.currentTimeMillis()))}, stringBuilder5);
                                        }
                                        CLS66.MTH1393(s, s11, s1);
                                    }
                                    CLS426.MTH6132(s, s1, false);
                                }
                            }
                        }
                    }
                    else {
                        v5 = v1;
                    }
                    if(v5 != 42 || !CLS182.MTH3480(4101824666123686709L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                        v13 = v5;
                    }
                    else {
                        if(CLS182.MTH3480(4101824803562640181L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                            int v12 = CLS34.MTH1064(4101824425605518133L, CLS182.MTH3483(s), ˎᵢ0, 3);
                            v13 = 42;
                            int v14 = CLS794.MTH2694().MTH1146(v12, v, s, s1, "_FRIENDCARD_BANWARNING_");
                            z4 = v14 > v12 - 1;
                            if(!z4) {
                                StringBuilder stringBuilder6 = new StringBuilder();
                                stringBuilder6.append(ˎᵢ0.MTH925(CLS182.MTH3475(4101820839307825973L, CLS182.MTH3483(s)), CLS27.MTH889("warning_default_text")));
                                stringBuilder6.append(" (");
                                stringBuilder6.append(v14 + 1);
                                stringBuilder6.append("/");
                                stringBuilder6.append(v12);
                                String s12 = CLS182.MTH3475(4101820530070180661L, stringBuilder6);
                                String s13 = CLS426.MTH6125(s, s1);
                                CLS66.MTH1393(s, s13 + s12, s1);
                            }
                        }
                        else {
                            v13 = 42;
                            z4 = true;
                        }
                        if(z4) {
                            String s14 = ˎᵢ0.MTH925(CLS182.MTH3475(4101820538660115253L, CLS182.MTH3483(s)), "");
                            String s15 = CLS182.MTH3473(4101820749113512757L, ˎᵢ0, CLS182.MTH3475(4101820650329264949L, CLS182.MTH3483(s)));
                            ﾞٴ0.MTH1331(s, s1, CLS27.MTH904(), s14, s15);
                            if(ˎᵢ0.MTH938(s + "_chatroom_ban_sendmsg_enable", true)) {
                                String s16 = CLS182.MTH3476(CLS426.MTH6125(s, s1), s15);
                                if(ﾞٴ0.FLD186 && !TextUtils.isEmpty(s14)) {
                                    long v15 = Long.parseLong(s14, 16);
                                    StringBuilder stringBuilder8 = CLS182.MTH3483(s16);
                                    stringBuilder8.append("\n");
                                    s16 = CLS182.MTH3481(CLS27.MTH889("auto_unban"), new Object[]{ᴵʽ0.FLD1152.format(new Date(v15 + System.currentTimeMillis()))}, stringBuilder8);
                                }
                                CLS66.MTH1393(s, s16, s1);
                            }
                            CLS426.MTH6132(s, s1, false);
                        }
                    }
                    switch(v13) {
                        case 43: 
                        case 62: 
                        case 10000: 
                        case 10002: 
                        case 0x19000031: 
                        case 0x1A000031: 
                        case 0x1C000031: {
                            v18 = v13;
                            break;
                        }
                        default: {
                            if(CLS182.MTH3480(0x38EC98FD2B3CD335L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                                int v16 = CLS34.MTH1064(4101821144250503989L, CLS182.MTH3483(s), ˎᵢ0, 5);
                                String s17 = CLS426.MTH6106(this.FLD1039, this.FLD1045, s);
                                CLS42 ʾᵢ0 = CLS794.MTH2694();
                                Cursor cursor0 = CLS42.MTH1145(ʾᵢ0.getReadableDatabase(), s, "_REPEAT_" + s1);
                                if(cursor0 == null || cursor0.getCount() <= 0) {
                                    v18 = v13;
                                    ʾᵢ0.MTH1139(0, v, s, "_REPEAT_" + s1, s17);
                                    v19 = 0;
                                }
                                else if(cursor0.moveToFirst()) {
                                    String s18 = CLS182.MTH3472(4100898800023687989L, cursor0);
                                    int v17 = CLS182.MTH3490(4100912595458642741L, cursor0);
                                    v18 = v13;
                                    if(!s17.equals(s18) || v - CLS34.MTH1076(4100912621228446517L, cursor0) >= 5000L) {
                                        ʾᵢ0.MTH1139(0, v, s, "_REPEAT_" + s1, s17);
                                        cursor0.close();
                                        v19 = 0;
                                    }
                                    else {
                                        v19 = v17 + 1;
                                        ʾᵢ0.MTH1139(v19, v, s, "_REPEAT_" + s1, s17);
                                        if(v19 < v16 - 1) {
                                            cursor0.close();
                                            v19 = 0;
                                        }
                                    }
                                }
                                else {
                                    v18 = v13;
                                    cursor0.close();
                                    v19 = 0;
                                }
                                if(v19 == v16) {
                                    String s19 = ˎᵢ0.MTH925(CLS182.MTH3475(4101821234444817205L, CLS182.MTH3483(s)), "");
                                    String s20 = CLS182.MTH3473(4101821960294290229L, ˎᵢ0, CLS182.MTH3475(4101821878689911605L, CLS182.MTH3483(s)));
                                    ﾞٴ0.MTH1331(s, s1, CLS27.MTH904(), s19, s20);
                                    if(ˎᵢ0.MTH938(s + "_chatroom_ban_sendmsg_enable", true)) {
                                        String s21 = CLS182.MTH3476(CLS426.MTH6125(s, s1), s20);
                                        if(ﾞٴ0.FLD186 && !TextUtils.isEmpty(s19)) {
                                            long v20 = Long.parseLong(s19, 16);
                                            StringBuilder stringBuilder9 = CLS182.MTH3483(s21);
                                            stringBuilder9.append("\n");
                                            s21 = CLS182.MTH3481(CLS27.MTH889("auto_unban"), new Object[]{ᴵʽ0.FLD1152.format(new Date(v20 + System.currentTimeMillis()))}, stringBuilder9);
                                        }
                                        CLS66.MTH1393(s, s21, s1);
                                    }
                                    CLS426.MTH6132(s, s1, false);
                                }
                            }
                            else {
                                v18 = v13;
                            }
                        }
                    }
                    if(v18 == 3) {
                        if(CLS182.MTH3480(4101821668236514101L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                            if(CLS182.MTH3480(0x38EC992F2B3CD335L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                                int v21 = CLS34.MTH1064(4101822492870234933L, CLS182.MTH3483(s), ˎᵢ0, 3);
                                int v22 = CLS794.MTH2694().MTH1146(v21, v, s, s1, "_IMAGES_BANWARNING_");
                                z5 = v22 > v21 - 1;
                                if(!z5) {
                                    StringBuilder stringBuilder10 = new StringBuilder();
                                    stringBuilder10.append(ˎᵢ0.MTH925(CLS182.MTH3475(4101822170747687733L, CLS182.MTH3483(s)), CLS27.MTH889("warning_default_text")));
                                    stringBuilder10.append(" (");
                                    stringBuilder10.append(v22 + 1);
                                    stringBuilder10.append("/");
                                    stringBuilder10.append(v21);
                                    String s22 = CLS182.MTH3475(4101822394085987125L, stringBuilder10);
                                    String s23 = CLS426.MTH6125(s, s1);
                                    CLS66.MTH1393(s, s23 + s22, s1);
                                }
                            }
                            else {
                                z5 = true;
                            }
                            if(z5) {
                                String s24 = ˎᵢ0.MTH925(CLS182.MTH3475(4101822402675921717L, CLS182.MTH3483(s)), "");
                                String s25 = CLS182.MTH3473(4101801138292839221L, ˎᵢ0, CLS182.MTH3475(4101801056688460597L, CLS182.MTH3483(s)));
                                ﾞٴ0.MTH1331(s, s1, CLS27.MTH904(), s24, s25);
                                if(ˎᵢ0.MTH938(s + "_chatroom_ban_sendmsg_enable", true)) {
                                    String s26 = CLS182.MTH3476(CLS426.MTH6125(s, s1), s25);
                                    if(ﾞٴ0.FLD186 && !TextUtils.isEmpty(s24)) {
                                        long v23 = Long.parseLong(s24, 16);
                                        StringBuilder stringBuilder12 = CLS182.MTH3483(s26);
                                        stringBuilder12.append("\n");
                                        s26 = CLS182.MTH3481(CLS27.MTH889("auto_unban"), new Object[]{ᴵʽ0.FLD1152.format(new Date(v23 + System.currentTimeMillis()))}, stringBuilder12);
                                    }
                                    CLS66.MTH1393(s, s26, s1);
                                }
                                CLS426.MTH6132(s, s1, false);
                            }
                        }
                        if(!CLS412.MTH6002() && CLS182.MTH3480(4101831851603972917L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                            String s27 = contentValues0.getAsString("imgPath");
                            Long long0 = contentValues0.getAsLong("msgId");
                            long v24 = contentValues0.containsKey("msgSvrId") ? CLS34.MTH1080(0x38ECA2092B3CD335L, contentValues0) : 0L;
                            CLS466.MTH6531((contentValues0.containsKey("isSend") ? CLS182.MTH3474(4101831589610967861L, contentValues0) : 0), s27, ((long)long0), v24, ((CLS0)new CLS748(ᴵʽ0, s, s1, CLS34.MTH1080(0x38ECA2202B3CD335L, contentValues0))), 10);
                        }
                    }
                }
            }
        }
    }
}

