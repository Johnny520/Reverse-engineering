// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS38.CLS37;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS565;
import b.ˆʿ.CLS42;
import b.ˆʿ.CLS43;
import b.ˆʿ.CLS48;
import b.ˆʿ.CLS53;
import b.ˆʿ.CLS61;
import b.ˆʿ.CLS62;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS580;
import b.ˈˈ.CLS73;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS79;
import b.יᐧ.CLS163.CLS161;
import b.יᐧ.CLS163.CLS162;
import b.יᐧ.CLS163;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1227;
import b.ᵔʾ.CLS1255;
import b.ᵔʾ.CLS1258;
import b.ᵔʾ.CLS1259;
import b.ᵔʾ.CLS286;
import b.ᵔʾ.CLS314;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CLS794 extends CLS140 {
    public final HashMap FLD1144;
    public final HashMap FLD1145;
    public final HashSet FLD1146;
    public final CLS79 FLD1147;
    public final CLS73 FLD1148;
    public Object FLD1149;
    public final CLS73 FLD1150;
    public final CLS73 FLD1151;
    public SimpleDateFormat FLD1152;
    public CLS43 FLD1153;
    public final HashMap FLD1154;
    public final HashMap FLD1155;
    public boolean FLD1156;
    public final HashMap FLD1157;
    public Pattern FLD1158;
    public Object FLD1159;
    public final CLS163 FLD1160;
    public final HashMap FLD1161;
    public final int FLD1162;
    public final SimpleDateFormat FLD1163;

    // 此方法包含解密的字符串
    public CLS794(CLS139 ﹶʼ0) {
        public final class CLS793 implements CLS162 {
            public final CLS794 FLD1143;

            @Override  // b.יᐧ.CLS163$CLS162
            public final void MTH3162() {
            }

            // 此方法包含解密的字符串
            @Override  // b.יᐧ.CLS163$CLS162
            public final void MTH3163(CLS163 ﾞᐧ0) {
                CLS161 ﾞᐧ$ٴـ0 = (CLS161)ﾞᐧ0.FLD1573.poll();
                ContentValues contentValues0 = (ContentValues)(ﾞᐧ$ٴـ0 == null ? null : ﾞᐧ$ٴـ0.FLD1571);
                if(contentValues0 == null) {
                    ﾞᐧ0.MTH3166();
                    return;
                }
                try {
                    String s = contentValues0.getAsString("imgPath");
                    Long long0 = contentValues0.getAsLong("msgId");
                    long v = contentValues0.containsKey("msgSvrId") ? ((long)contentValues0.getAsLong("msgSvrId")) : 0L;
                    CLS466.MTH6539((contentValues0.containsKey("isSend") ? ((int)contentValues0.getAsInteger("isSend")) : 0), ((long)long0), v, ((CLS0)new CLS1255(this, ﾞᐧ0, 16)), s);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        super(ﹶʼ0);
        this.FLD1156 = false;
        this.FLD1154 = new HashMap();
        this.FLD1157 = new HashMap();
        this.FLD1161 = new HashMap();
        this.FLD1152 = new SimpleDateFormat(CLS27.MTH889("date_format"));
        this.FLD1150 = new CLS73(10);
        this.FLD1151 = new CLS73(10);
        this.FLD1148 = new CLS73(10);
        this.FLD1162 = 900000;
        this.FLD1163 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        this.FLD1145 = new HashMap();
        this.FLD1146 = new HashSet();
        this.FLD1144 = new HashMap();
        this.FLD1155 = new HashMap();
        this.FLD1147 = CLS79.FLD292;
        CLS793 ᴵʽ$ᵔʾ0 = new CLS793(this);
        long v = (long)CLS412.MTH6005(5000, "auto_accept_chatroom_invite_qr_delay");
        CLS163 ﾞᐧ0 = new CLS163();
        ﾞᐧ0.FLD1574 = ᴵʽ$ᵔʾ0;
        if(ﾞᐧ0.FLD1579 != v) {
            ﾞᐧ0.FLD1579 = v;
        }
        this.FLD1160 = ﾞᐧ0;
    }

    // 此方法包含解密的字符串
    // This method was un-flattened
    public final boolean MTH2682(ContentValues contentValues0) {
        CLS61 ﾞٴ7;
        String s40;
        CLS371 ʻ5;
        int v16;
        String s23;
        CLS61 ﾞٴ3;
        CLS371 ʻ2;
        int v8;
        String s22;
        String s21;
        String s20;
        String s11;
        CLS61 ﾞٴ2;
        int v6;
        String[] arr_s2;
        int v5;
        ArrayList arrayList1;
        CLS371 ʻ1;
        HashMap hashMap3;
        String s10;
        int v4;
        String[] arr_s1;
        HashMap hashMap2;
        String s26;
        String s36;
        String s34;
        String[] arr_s6;
        String s33;
        int v14;
        String s32;
        String s31;
        String s30;
        String s29;
        CLS61 ﾞٴ6;
        String s28;
        CLS371 ʻ4;
        CLS61 ﾞٴ5;
        String[] arr_s5;
        int v13;
        int v12;
        String s27;
        int v1;
        CLS29 ˎᵢ0 = this.FLD1445;
        if(ˎᵢ0.MTH938("room_manangement_enable", false)) {
            CLS371 ʻ0 = this.FLD1444;
            if(ʻ0 != null) {
                String s = contentValues0.getAsString("talker");
                if(!TextUtils.isEmpty(s) && CLS426.MTH6126(s) && !s.equals(ˎᵢ0.MTH925("zombie_check_chatroom", ""))) {
                    int v = CLS182.MTH3474(4101873611570991925L, contentValues0);
                    String s1 = contentValues0.getAsString("content");
                    String s2 = CLS426.MTH6109(s1);
                    if(v == 49) {
                        HashMap hashMap0 = CLS392.MTH5633(s1, "msg");
                        if(hashMap0 != null && hashMap0.containsKey(".msg.appmsg.content")) {
                            s1 = (String)hashMap0.get(".msg.appmsg.content");
                        }
                    }
                    String s3 = s1;
                    if(TextUtils.isEmpty(s3)) {
                        return false;
                    }
                    String s4 = CLS426.MTH6106(0, s3, s);
                    String s5 = contentValues0.getAsString("atuserlist");
                    CLS61 ﾞٴ0 = CLS794.MTH2698();
                    boolean z = s2.equals(CLS27.MTH904());
                    boolean z1 = CLS426.MTH6118(s, s2);
                    boolean z2 = ﾞٴ0.MTH1332(s, s2);
                    boolean z3 = CLS426.MTH6118(s, CLS27.MTH904()) && CLS34.MTH1078(0x38ECC8152B3CD335L, s, ˎᵢ0, false);
                    if(z3 && CLS27.MTH891(s2)) {
                        CLS426.MTH6132(s, s2, true);
                    }
                    if(z3 && CLS34.MTH1078(4101873422592430901L, s, ˎᵢ0, false) && !TextUtils.isEmpty(s2) && CLS66.MTH1452(s, s2).equals(CLS66.MTH1452(s, CLS27.MTH904()))) {
                        CLS426.MTH6132(s, s2, true);
                    }
                    boolean z4 = ˎᵢ0.MTH938("chatroom_intro_" + s + "_enable", false);
                    boolean z5 = z3 && CLS34.MTH1078(4101874174211707701L, s, ˎᵢ0, false);
                    boolean z6 = z3 && CLS34.MTH1078(0x38ECC8E52B3CD335L, s, ˎᵢ0, false);
                    boolean z7 = CLS34.MTH1078(0x38ECC8FF2B3CD335L, s, ˎᵢ0, false);
                    switch(v) {
                        case 1: 
                        case 49: {
                            CLS61 ﾞٴ1 = ﾞٴ0;
                            if(!z1 || !CLS502.MTH6934(s3, new String[]{"#cn "})) {
                                v1 = v;
                            }
                            else {
                                v1 = v;
                                CLS565 ˆʿ0 = new CLS565(2, s, s3.substring(s3.indexOf("#cn ") + 3).trim());
                                CLS40.FLD157.MTH1117(((CLS39)ˆʿ0), 3000L);
                            }
                            if(z2 && CLS502.MTH6934(s3, new String[]{"#ga "})) {
                                CLS565 ˆʿ1 = new CLS565(3, s, s3.substring(s3.indexOf("#ga ") + 3).trim());
                                CLS40.FLD157.MTH1117(((CLS39)ˆʿ1), 3000L);
                            }
                            String s6 = "";
                            if(!z3 || TextUtils.isEmpty(s2) || !CLS502.MTH6934(s3, new String[]{"#b", "#ub", "#w", "#uw", "#um", "#dm", "#pb", "#upb"}) || !z1) {
                                s20 = s3;
                                s21 = s2;
                                ﾞٴ3 = ﾞٴ1;
                                s11 = s5;
                                v8 = v1;
                                ʻ2 = ʻ0;
                                s22 = s;
                                s23 = s4;
                            }
                            else {
                                if(CLS502.MTH6934(s3, new String[]{"*~"}) && CLS502.MTH6934(s3, new String[]{"~*"})) {
                                    s6 = s3.substring(s3.indexOf("*~") + 2, s3.indexOf("~*"));
                                }
                                String s7 = s6;
                                String s8 = ˎᵢ0.MTH925("ban_max_time", "");
                                boolean z8 = TextUtils.isEmpty(s5);
                                HashMap hashMap1 = this.FLD1157;
                                if(z8) {
                                    CLS371 ʻ3 = ʻ0;
                                    s11 = s5;
                                    CLS61 ﾞٴ4 = ﾞٴ1;
                                    int v9 = s4.indexOf("*~");
                                    if(v9 != -1) {
                                        s4 = s4.substring(0, v9).trim();
                                    }
                                    if(s4.startsWith("#b") || s4.startsWith("#ub") || s4.startsWith("#w") || s4.startsWith("#uw") || CLS502.MTH6934(s4, new String[]{"#um", "#dm", "#pb", "#upb"})) {
                                        String[] arr_s3 = CLS502.MTH6941(s4);
                                        if(arr_s3.length > 1) {
                                            String[] arr_s4 = arr_s3[1].split(Pattern.quote("|"));
                                            int v10 = arr_s4.length;
                                            int v11 = 0;
                                            while(v11 < v10) {
                                                String s24 = arr_s4[v11];
                                                if(TextUtils.isEmpty(s24) || s24.equals(CLS27.MTH904())) {
                                                    s29 = s4;
                                                    s32 = s2;
                                                    v12 = v11;
                                                    v13 = v10;
                                                    arr_s5 = arr_s3;
                                                    ﾞٴ6 = ﾞٴ4;
                                                    v14 = v1;
                                                    ʻ4 = ʻ3;
                                                }
                                                else {
                                                    String s25 = arr_s3[0];
                                                    switch(s25.hashCode()) {
                                                        case 0x49F: {
                                                            s26 = s4;
                                                            if(s25.equals("#b")) {
                                                                s27 = s3;
                                                                v12 = v11;
                                                                v13 = v10;
                                                                arr_s5 = arr_s3;
                                                                ﾞٴ5 = ﾞٴ4;
                                                                ʻ4 = ʻ3;
                                                                if(!z2) {
                                                                    if(CLS34.MTH1078(4101854211203715893L, s, ˎᵢ0, false) && ﾞٴ5.MTH1337(s, s24)) {
                                                                        s28 = String.format(CLS27.MTH889("ban_onwhitelist"), CLS66.MTH1452(s, s24));
                                                                        CLS794.MTH2683(s, s28, s2);
                                                                        goto label_379;
                                                                    }
                                                                    else if(CLS426.MTH6118(s, s24)) {
                                                                        CLS794.MTH2683(s, String.format(CLS27.MTH889("ban_ismod"), CLS66.MTH1452(s, s24)), s2);
                                                                        goto label_379;
                                                                    }
                                                                }
                                                                else if(ﾞٴ5.MTH1332(s, s24)) {
                                                                    s28 = String.format(CLS27.MTH889("ban_ismod"), CLS66.MTH1452(s, s24));
                                                                    CLS794.MTH2683(s, s28, s2);
                                                                    goto label_379;
                                                                }
                                                                ﾞٴ6 = ﾞٴ5;
                                                                s29 = s26;
                                                                s30 = s8;
                                                                s31 = s27;
                                                                s32 = s2;
                                                                v14 = v1;
                                                                s33 = s7;
                                                                arr_s6 = arr_s4;
                                                                s34 = s;
                                                                this.MTH2704(s, s2, s24, s30, s33);
                                                                goto label_429;
                                                            }
                                                            break;
                                                        }
                                                        case 1204: {
                                                            s26 = s4;
                                                            if(s25.equals("#w")) {
                                                                s27 = s3;
                                                                v12 = v11;
                                                                v13 = v10;
                                                                arr_s5 = arr_s3;
                                                                ﾞٴ5 = ﾞٴ4;
                                                                ʻ4 = ʻ3;
                                                                if(!ʻ4.MTH5337(s, s24) || CLS426.MTH6118(s, s24) || CLS34.MTH1078(0x38ECB7612B3CD335L, s, ˎᵢ0, false) && ﾞٴ5.MTH1337(s, s24) || ﾞٴ5.MTH1304(s, s24)) {
                                                                    goto label_379;
                                                                }
                                                                CLS66.MTH1393(s, CLS426.MTH6125(s, s24) + CLS27.MTH889("add_to_whitelist"), s24);
                                                                ﾞٴ5.MTH1333(s, s24);
                                                                return false;
                                                            }
                                                            break;
                                                        }
                                                        case 0x8FEC: {
                                                            s26 = s4;
                                                            if(s25.equals("#dm") && (z2 && ﾞٴ4.MTH1339(s, s24))) {
                                                                String s35 = CLS27.MTH889("downgrade_moderator");
                                                                Object[] arr_object = new Object[1];
                                                                s36 = s3;
                                                                arr_object[0] = CLS426.MTH6125(s, s24);
                                                                CLS66.MTH1393(s, String.format(s35, arr_object), s24);
                                                                ﾞٴ4.MTH1318(0, s, s24);
                                                                goto label_396;
                                                            }
                                                            break;
                                                        }
                                                        case 37205: {
                                                            s26 = s4;
                                                            if(s25.equals("#pb")) {
                                                                s27 = s3;
                                                                if(z2) {
                                                                    v12 = v11;
                                                                    v13 = v10;
                                                                    arr_s5 = arr_s3;
                                                                    ﾞٴ5 = ﾞٴ4;
                                                                    ﾞٴ4.MTH1331(s, s24, s2, s8, s7);
                                                                    StringBuilder stringBuilder7 = CLS182.MTH3483(CLS426.MTH6125(s, s24));
                                                                    String s37 = CLS182.MTH3481(CLS27.MTH889("banned_by"), new Object[]{CLS66.MTH1452(s, s2), CLS182.MTH3473(4101855418089526069L, ˎᵢ0, s + "_goodbye_text")}, stringBuilder7);
                                                                    if(!TextUtils.isEmpty(s7)) {
                                                                        StringBuilder stringBuilder8 = CLS182.MTH3483(s37);
                                                                        stringBuilder8.append("\n");
                                                                        stringBuilder8.append(CLS27.MTH889("reason"));
                                                                        stringBuilder8.append(": ");
                                                                        stringBuilder8.append(s7);
                                                                        s37 = stringBuilder8.toString();
                                                                    }
                                                                    CLS66.MTH1393(s, s37, s24);
                                                                    this.MTH2702(s24);
                                                                }
                                                                else {
                                                                    v12 = v11;
                                                                    v13 = v10;
                                                                    arr_s5 = arr_s3;
                                                                    ﾞٴ5 = ﾞٴ4;
                                                                }
                                                                goto label_378;
                                                            }
                                                            break;
                                                        }
                                                        case 0x91F0: {
                                                            s26 = s4;
                                                            if(s25.equals("#ub")) {
                                                                s27 = s3;
                                                                v12 = v11;
                                                                v13 = v10;
                                                                arr_s5 = arr_s3;
                                                                ﾞٴ5 = ﾞٴ4;
                                                                ʻ4 = ʻ3;
                                                                if(ﾞٴ5.MTH1304(s, s24)) {
                                                                    ﾞٴ5.MTH1315(s, s24);
                                                                    String s38 = (String)hashMap1.get(s + s24);
                                                                    if(TextUtils.isEmpty(s38)) {
                                                                        s38 = CLS66.MTH1452(s, s24);
                                                                    }
                                                                    CLS794.MTH2689(s, String.format(CLS27.MTH889("unbanned"), s38));
                                                                    CLS426.MTH6120(s, s24, true, null);
                                                                }
                                                                goto label_379;
                                                            }
                                                            break;
                                                        }
                                                        case 0x91FB: {
                                                            s26 = s4;
                                                            if(s25.equals("#um")) {
                                                                s36 = s3;
                                                                if(z2 && !ﾞٴ4.MTH1339(s, s24)) {
                                                                    ﾞٴ4.MTH1340(s, s24);
                                                                    CLS66.MTH1393(s, String.format(CLS27.MTH889("upgrade_to_moderator"), CLS426.MTH6125(s, s24)), s24);
                                                                }
                                                                goto label_396;
                                                            }
                                                            break;
                                                        }
                                                        case 0x9205: {
                                                            s26 = s4;
                                                            if(s25.equals("#uw")) {
                                                                s27 = s3;
                                                                v12 = v11;
                                                                v13 = v10;
                                                                arr_s5 = arr_s3;
                                                                ﾞٴ5 = ﾞٴ4;
                                                                if(z2) {
                                                                    ʻ4 = ʻ3;
                                                                    if(ʻ4.MTH5337(s, s24) && !CLS426.MTH6118(s, s24) && (!CLS34.MTH1078(0x38ECB7042B3CD335L, s, ˎᵢ0, false) || ﾞٴ5.MTH1337(s, s24)) && !ﾞٴ5.MTH1304(s, s24)) {
                                                                        CLS66.MTH1393(s, CLS426.MTH6125(s, s24) + String.format(CLS27.MTH889("removed_from_whitelist"), CLS66.MTH1452(s, s24)), s24);
                                                                        ﾞٴ5.MTH1318(2, s, s24);
                                                                        return false;
                                                                    }
                                                                }
                                                                else {
                                                                label_378:
                                                                    ʻ4 = ʻ3;
                                                                }
                                                            label_379:
                                                                ﾞٴ6 = ﾞٴ5;
                                                                s30 = s8;
                                                                arr_s6 = arr_s4;
                                                                v14 = v1;
                                                                s31 = s27;
                                                                s29 = s26;
                                                                s32 = s2;
                                                                s33 = s7;
                                                                goto label_428;
                                                            }
                                                            break;
                                                        }
                                                        case 0x11AE24: {
                                                            s26 = s4;
                                                            if(s25.equals("#upb")) {
                                                                s36 = s3;
                                                                if(z2 && ﾞٴ4.MTH1304(s, s24)) {
                                                                    ﾞٴ4.MTH1315(s, s24);
                                                                    CLS794.MTH2689(s, String.format(CLS27.MTH889("unbanned"), CLS66.MTH1452(s, s24)));
                                                                    CLS426.MTH6120(s, s24, true, null);
                                                                    ﾞٴ4.MTH1317(s24);
                                                                }
                                                            label_396:
                                                                v12 = v11;
                                                                v13 = v10;
                                                                arr_s5 = arr_s3;
                                                                ﾞٴ6 = ﾞٴ4;
                                                                v14 = v1;
                                                                s31 = s36;
                                                                ʻ4 = ʻ3;
                                                                s29 = s26;
                                                                s30 = s8;
                                                                s32 = s2;
                                                                goto label_426;
                                                            }
                                                            break;
                                                        }
                                                        default: {
                                                            s26 = s4;
                                                        }
                                                    }
                                                    s32 = s2;
                                                    v12 = v11;
                                                    v13 = v10;
                                                    arr_s5 = arr_s3;
                                                    ﾞٴ6 = ﾞٴ4;
                                                    v14 = v1;
                                                    ʻ4 = ʻ3;
                                                    s29 = s26;
                                                }
                                                s30 = s8;
                                                s31 = s3;
                                            label_426:
                                                s33 = s7;
                                                arr_s6 = arr_s4;
                                            label_428:
                                                s34 = s;
                                            label_429:
                                                s = s34;
                                                s8 = s30;
                                                s3 = s31;
                                                s7 = s33;
                                                s2 = s32;
                                                arr_s4 = arr_s6;
                                                v10 = v13;
                                                v11 = v12 + 1;
                                                s4 = s29;
                                                v1 = v14;
                                                ʻ3 = ʻ4;
                                                arr_s3 = arr_s5;
                                                ﾞٴ4 = ﾞٴ6;
                                            }
                                        }
                                    }
                                    s23 = s4;
                                    s20 = s3;
                                    s21 = s2;
                                    s22 = s;
                                    ﾞٴ3 = ﾞٴ4;
                                    v8 = v1;
                                    ʻ2 = ʻ3;
                                }
                                else {
                                    String[] arr_s = CLS502.MTH6941(s5);
                                    ArrayList arrayList0 = new ArrayList();
                                    boolean z9 = CLS502.MTH6934(s3, new String[]{"#b"});
                                    if(z9) {
                                        hashMap2 = hashMap1;
                                        if(arr_s.length > 5) {
                                            return true;
                                        }
                                    }
                                    else {
                                        hashMap2 = hashMap1;
                                    }
                                    int v2 = arr_s.length;
                                    int v3 = 0;
                                    while(v3 < v2) {
                                        String s9 = arr_s[v3];
                                        if(TextUtils.isEmpty(s9)) {
                                        label_109:
                                            arr_s2 = arr_s;
                                            v6 = v2;
                                            ﾞٴ2 = ﾞٴ1;
                                            s10 = s5;
                                            hashMap3 = hashMap2;
                                            ʻ1 = ʻ0;
                                            arrayList1 = arrayList0;
                                            v5 = v3;
                                        }
                                        else {
                                            if(s9.equals(CLS27.MTH904())) {
                                                arr_s1 = arr_s;
                                                v4 = v2;
                                                goto label_79;
                                            }
                                            else if(!z9 || !CLS426.MTH6118(s, s9)) {
                                                arr_s1 = arr_s;
                                                v4 = v2;
                                                if(CLS34.MTH1078(4101874560758764341L, s, ˎᵢ0, false) && ﾞٴ1.MTH1337(s, s9) && !z2) {
                                                    if(z9) {
                                                        CLS794.MTH2683(s, String.format(CLS27.MTH889("ban_onwhitelist"), CLS66.MTH1452(s, s9)), s2);
                                                    }
                                                label_79:
                                                    s10 = s5;
                                                    hashMap3 = hashMap2;
                                                    ʻ1 = ʻ0;
                                                    arrayList1 = arrayList0;
                                                    v5 = v3;
                                                    arr_s2 = arr_s1;
                                                    v6 = v4;
                                                    ﾞٴ2 = ﾞٴ1;
                                                }
                                                else if(!z9 || !ﾞٴ1.FLD186 || !ﾞٴ1.MTH1304(s, s9)) {
                                                    s10 = s5;
                                                    hashMap3 = hashMap2;
                                                    ʻ1 = ʻ0;
                                                    arrayList1 = arrayList0;
                                                    v5 = v3;
                                                    arr_s2 = arr_s1;
                                                    v6 = v4;
                                                    ﾞٴ2 = ﾞٴ1;
                                                    arrayList1.add(s9);
                                                }
                                                else {
                                                    v5 = v3;
                                                    arr_s2 = arr_s1;
                                                    hashMap3 = hashMap2;
                                                    v6 = v4;
                                                    ʻ1 = ʻ0;
                                                    arrayList1 = arrayList0;
                                                    ﾞٴ2 = ﾞٴ1;
                                                    s10 = s5;
                                                    ﾞٴ1.MTH1331(s, s9, s2, s8, s7);
                                                }
                                                goto label_117;
                                            }
                                            else {
                                                arr_s1 = arr_s;
                                                CLS794.MTH2683(s, String.format(CLS27.MTH889("ban_ismod"), CLS66.MTH1452(s, s9)), s2);
                                                v4 = v2;
                                                goto label_79;
                                            }
                                            goto label_109;
                                        }
                                    label_117:
                                        v3 = v5 + 1;
                                        arrayList0 = arrayList1;
                                        ʻ0 = ʻ1;
                                        arr_s = arr_s2;
                                        v2 = v6;
                                        ﾞٴ1 = ﾞٴ2;
                                        s5 = s10;
                                        hashMap2 = hashMap3;
                                    }
                                    s11 = s5;
                                    if(!arrayList0.isEmpty()) {
                                        String s12 = CLS426.MTH6121(s, arrayList0);
                                        if(CLS502.MTH6934(s3, new String[]{"#b"})) {
                                            ﾞٴ1.MTH1327(s, arrayList0, s2, s8, s7);
                                            if(CLS34.MTH1078(0x38ECC9D32B3CD335L, s, ˎᵢ0, true)) {
                                                StringBuilder stringBuilder0 = CLS182.MTH3483(s12);
                                                String s13 = CLS182.MTH3481(CLS27.MTH889("banned_by"), new Object[]{CLS66.MTH1452(s, s2), CLS182.MTH3473(4101874947305820981L, ˎᵢ0, s + "_goodbye_text")}, stringBuilder0);
                                                if(!TextUtils.isEmpty(s7)) {
                                                    StringBuilder stringBuilder1 = CLS182.MTH3483(s13);
                                                    stringBuilder1.append("\n");
                                                    stringBuilder1.append(CLS27.MTH889("reason"));
                                                    stringBuilder1.append(": ");
                                                    stringBuilder1.append(s7);
                                                    s13 = stringBuilder1.toString();
                                                }
                                                if(ﾞٴ1.FLD186 && !TextUtils.isEmpty(s8)) {
                                                    long v7 = Long.parseLong(s8, 16);
                                                    StringBuilder stringBuilder2 = CLS182.MTH3483(s13);
                                                    stringBuilder2.append("\n");
                                                    s13 = CLS182.MTH3481(CLS27.MTH889("auto_unban"), new Object[]{this.FLD1152.format(new Date(v7 + System.currentTimeMillis()))}, stringBuilder2);
                                                }
                                                CLS66.MTH1427(s, s13, arrayList0);
                                            }
                                            CLS751 יﹳ0 = new CLS751(0, s, arrayList0);
                                            CLS40.FLD157.MTH1117(((CLS39)יﹳ0), 5000L);
                                            return false;
                                        }
                                        if(CLS502.MTH6934(s3, new String[]{"#w"})) {
                                            StringBuilder stringBuilder3 = CLS182.MTH3483(s12);
                                            stringBuilder3.append(CLS27.MTH889("add_to_whitelist"));
                                            CLS66.MTH1427(s, stringBuilder3.toString(), arrayList0);
                                            for(Object object0: arrayList0) {
                                                ﾞٴ1.MTH1333(s, ((String)object0));
                                            }
                                            return true;
                                        }
                                        if(!CLS502.MTH6934(s3, new String[]{"#uw"})) {
                                            if(CLS502.MTH6934(s3, new String[]{"#ub"})) {
                                                for(Object object2: arrayList0) {
                                                    String s14 = (String)object2;
                                                    if(ﾞٴ1.MTH1304(s, s14)) {
                                                        ﾞٴ1.MTH1315(s, s14);
                                                        String s15 = (String)hashMap2.get(s + s14);
                                                        if(TextUtils.isEmpty(s15)) {
                                                            s15 = CLS66.MTH1452(s, s14);
                                                        }
                                                        CLS794.MTH2689(s, String.format(CLS27.MTH889("unbanned"), s15));
                                                        CLS426.MTH6120(s, s14, true, null);
                                                    }
                                                }
                                                return true;
                                            }
                                            if(CLS502.MTH6934(s3, new String[]{"#pb"})) {
                                                if(z2) {
                                                    ﾞٴ1.MTH1327(s, arrayList0, s2, s8, s7);
                                                    StringBuilder stringBuilder5 = CLS182.MTH3483(s12);
                                                    String s16 = CLS182.MTH3481(CLS27.MTH889("banned_by"), new Object[]{CLS66.MTH1452(s, s2), CLS182.MTH3473(4101853502534112053L, ˎᵢ0, s + "_goodbye_text")}, stringBuilder5);
                                                    if(!TextUtils.isEmpty(s7)) {
                                                        StringBuilder stringBuilder6 = CLS182.MTH3483(s16);
                                                        stringBuilder6.append("\n");
                                                        stringBuilder6.append(CLS27.MTH889("reason"));
                                                        stringBuilder6.append(": ");
                                                        stringBuilder6.append(s7);
                                                        s16 = stringBuilder6.toString();
                                                    }
                                                    CLS66.MTH1427(s, s16, arrayList0);
                                                    for(Object object3: arrayList0) {
                                                        this.MTH2702(((String)object3));
                                                    }
                                                    return true;
                                                }
                                            }
                                            else if(CLS502.MTH6934(s3, new String[]{"#upb"})) {
                                                if(z2) {
                                                    for(Object object4: arrayList0) {
                                                        String s17 = (String)object4;
                                                        if(ﾞٴ1.MTH1304(s, s17)) {
                                                            ﾞٴ1.MTH1315(s, s17);
                                                            CLS794.MTH2689(s, String.format(CLS27.MTH889("unbanned"), CLS66.MTH1452(s, s17)));
                                                            CLS426.MTH6120(s, s17, true, null);
                                                            ﾞٴ1.MTH1317(s17);
                                                        }
                                                    }
                                                    return true;
                                                }
                                            }
                                            else if(CLS502.MTH6934(s3, new String[]{"#um"})) {
                                                if(z2) {
                                                    for(Object object5: arrayList0) {
                                                        String s18 = (String)object5;
                                                        if(!ﾞٴ1.MTH1339(s, s18)) {
                                                            ﾞٴ1.MTH1340(s, s18);
                                                            CLS66.MTH1393(s, String.format(CLS27.MTH889("upgrade_to_moderator"), CLS426.MTH6125(s, s18)), s18);
                                                        }
                                                    }
                                                    return true;
                                                }
                                            }
                                            else if(CLS502.MTH6934(s3, new String[]{"#dm"}) && z2) {
                                                for(Object object6: arrayList0) {
                                                    String s19 = (String)object6;
                                                    if(ﾞٴ1.MTH1339(s, s19)) {
                                                        CLS66.MTH1393(s, String.format(CLS27.MTH889("downgrade_moderator"), CLS426.MTH6125(s, s19)), s19);
                                                        ﾞٴ1.MTH1318(0, s, s19);
                                                    }
                                                }
                                            }
                                        }
                                        else if(z2) {
                                            StringBuilder stringBuilder4 = CLS182.MTH3483(s12);
                                            stringBuilder4.append(String.format(CLS27.MTH889("removed_from_whitelist"), ""));
                                            CLS66.MTH1427(s, stringBuilder4.toString(), arrayList0);
                                            for(Object object1: arrayList0) {
                                                ﾞٴ1.MTH1318(2, s, ((String)object1));
                                            }
                                            return true;
                                        }
                                        return true;
                                    }
                                    s20 = s3;
                                    s21 = s2;
                                    s22 = s;
                                    v8 = v1;
                                    ʻ2 = ʻ0;
                                    ﾞٴ3 = ﾞٴ1;
                                    s23 = s4;
                                }
                            }
                            if(v8 != 1 || !z3 || TextUtils.isEmpty(s21)) {
                                v16 = v8;
                                s40 = s21;
                            }
                            else if(!CLS426.MTH6123(s22, s21) && !z1 && !z2 && !z && (!CLS34.MTH1078(0x38ECB7902B3CD335L, s22, ˎᵢ0, false) || !ﾞٴ3.MTH1337(s22, s21))) {
                                if(CLS34.MTH1078(4101855267765670709L, s22, ˎᵢ0, false)) {
                                    boolean z10 = CLS502.MTH6934(s11, new String[]{"announcement@all"});
                                    if(z10) {
                                        v16 = 1;
                                        ʻ5 = ʻ2;
                                    }
                                    else {
                                        int v15 = contentValues0.containsKey("membercount") ? CLS182.MTH3474(4101851647108240181L, contentValues0) : CLS502.MTH6941(ʻ2.MTH5335(s22)).length;
                                        v16 = 1;
                                        ʻ5 = ʻ2;
                                        if(contentValues0.containsKey("atusercount")) {
                                            int v17 = CLS182.MTH3474(0x38ECB46F2B3CD335L, contentValues0);
                                            if(v17 > 10 || v17 >= v15 - 1) {
                                                z10 = true;
                                            }
                                        }
                                        if(!z10 && CLS426.MTH6129(s20)) {
                                            int v18 = CLS502.MTH6929(s20);
                                            if(v18 > 10 || v18 >= v15 - 1) {
                                                z10 = true;
                                            }
                                        }
                                    }
                                    if(z10) {
                                        String s39 = ˎᵢ0.MTH925("ban_max_time", "");
                                        ﾞٴ3.MTH1331(s22, s21, CLS27.MTH904(), s39, "");
                                        CLS794.MTH2688(s22, s21);
                                        if(CLS502.MTH6934(s11, new String[]{"announcement@all"})) {
                                            CLS66.MTH1376(s22, ʻ5.MTH5384(s22));
                                        }
                                        return true;
                                    }
                                }
                                else {
                                    v16 = 1;
                                }
                                if(TextUtils.isEmpty(s23) || !CLS34.MTH1078(4101851389410202421L, s22, ˎᵢ0, false) && !CLS34.MTH1078(4101851509669286709L, s22, ˎᵢ0, false)) {
                                    s40 = s21;
                                }
                                else {
                                    s40 = s21;
                                    CLS580 ʻᵎ0 = new CLS580(this, s22, s23, ﾞٴ3, s21, contentValues0, 1);
                                    CLS40.FLD157.MTH1124(((CLS39)ʻᵎ0));
                                }
                            }
                            else {
                                s40 = s21;
                                v16 = 1;
                            }
                            if(s23.startsWith("#b")) {
                                return true;
                            }
                            break;
                        }
                        case 10000: {
                            if(z5 || z7 || z4) {
                                CLS1259 ⁱᵔ0 = new CLS1259(this, s4, s, 6);
                                CLS40.FLD157.MTH1124(((CLS39)ⁱᵔ0));
                            }
                            if(!z3 || !CLS34.MTH1078(0x38ECC8982B3CD335L, s, ˎᵢ0, false) || !CLS502.MTH6934(s4, new String[]{CLS27.MTH882("renameroom"), " changed the group name"})) {
                                ﾞٴ7 = ﾞٴ0;
                            }
                            else {
                                ﾞٴ7 = ﾞٴ0;
                                CLS681 ˈˈ0 = new CLS681(this, s, s4, ﾞٴ7);
                                CLS40.FLD157.MTH1124(((CLS39)ˈˈ0));
                            }
                            goto label_523;
                        }
                        case 10002: {
                            if(z3 || z7 || z4) {
                                HashMap hashMap4 = CLS392.MTH5633(s3, "sysmsg");
                                if(CLS502.MTH6934(s3, new String[]{"delchatroommember"})) {
                                    this.MTH2699(hashMap4, s, z5, z6);
                                }
                                else if(CLS502.MTH6934(s3, new String[]{"sysmsgtemplate"})) {
                                    if(!z3 || !CLS34.MTH1078(0x38ECB4FC2B3CD335L, s, ˎᵢ0, false) || !CLS502.MTH6934(s4, new String[]{CLS27.MTH882("renameroom"), " changed the group name"})) {
                                        this.MTH2692(hashMap4, s, s3);
                                    }
                                    else {
                                        this.MTH2693(s, hashMap4);
                                    }
                                }
                            }
                            if(CLS34.MTH1078(4101852059425100597L, s, ˎᵢ0, false) && CLS502.MTH6934(s3, new String[]{"NewXmlChatRoomAccessVerifyApplication"}) && CLS66.MTH1433(s, CLS27.MTH904())) {
                                this.MTH2701(CLS392.MTH5633(s3, "sysmsg"), s, ((long)contentValues0.getAsLong("msgSvrId")));
                            }
                        label_522:
                            ﾞٴ7 = ﾞٴ0;
                        label_523:
                            s40 = s2;
                            v16 = v;
                            s22 = s;
                            ﾞٴ3 = ﾞٴ7;
                            break;
                        }
                        default: {
                            goto label_522;
                        }
                    }
                    if(z3 && !TextUtils.isEmpty(s40) && (v16 != 10000 && v16 != 10002)) {
                        CLS681 ˈˈ1 = new CLS681(this, ﾞٴ3, s22, s40);
                        CLS40.FLD157.MTH1124(((CLS39)ˈˈ1));
                    }
                    return false;
                }
                return false;
            }
        }
        return false;
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static void MTH2683(String s, String s1, String s2) {
        CLS466.MTH6515(s, s1, "#!" + s2 + ":" + s1 + "!#");
    }

    // 此方法包含解密的字符串
    public final void MTH2684(ContentValues contentValues0, String s) {
        if(!"chatroom".equalsIgnoreCase(s) || (!this.FLD1445.MTH938("nickname_change_notif_enable", false) || TextUtils.isEmpty(CLS27.MTH889("nickname_change")))) {
            return;
        }
        String s1 = contentValues0.getAsString("chatroomname");
        HashSet hashSet0 = this.FLD1146;
        if(!hashSet0.contains(s1)) {
            return;
        }
        hashSet0.remove(s1);
        CLS841 ⁱʽ0 = new CLS841(this, s1, 1);
        CLS40.FLD157.MTH1123(((CLS39)ⁱʽ0), 3000L);
    }

    public final void MTH2685(int v, String s, String s1, String s2, String s3, String s4) {
        String s5 = TextUtils.isEmpty(s4) ? CLS426.MTH6112(s, s3) : s4;
        if(TextUtils.isEmpty(s5)) {
            if(v + 1 == 10) {
                return;
            }
            CLS1227 ʽי0 = new CLS1227(this, s, s1, s2, s3, v + 1, 1);
            CLS40.FLD157.MTH1123(((CLS39)ʽי0), 1000L);
            return;
        }
        CLS682 ˈˊ0 = new CLS682(this, s, s2, s5, s1, s3, 1);
        CLS40.FLD157.MTH1124(((CLS39)ˈˊ0));
    }

    @Override  // b.ˑٴ.CLS140
    public final void MTH3039() {
        CLS412.MTH6001(CLS314.FLD3231.FLD3233);
        CLS412.MTH6001(CLS286.FLD2962.FLD2964);
    }

    public static CLS53 MTH2687() {
        return (CLS53)CLS40.FLD157.MTH1118(CLS53.class);
    }

    public static void MTH2688(String s, String s1) {
        CLS565 ˆʿ0 = new CLS565(1, s, s1);
        CLS40.FLD157.MTH1117(((CLS39)ˆʿ0), 5000L);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH2689(String s, String s1) {
        CLS466.MTH6515(s, s1, "#!" + s1 + "!#");
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        CLS34.MTH1071(this, 0, ʾᵢ0, "b.chat.ontextchanged");
        ʾᵢ0.MTH833("onincomingdata", ((CLS37)new CLS767(this, 0)));
        CLS34.MTH1071(this, 18, ʾᵢ0, "onlauncheruienter");
        CLS34.MTH1071(this, 21, ʾᵢ0, "onlauncheruienter.notactive");
        CLS34.MTH1071(this, 22, ʾᵢ0, "onsettingschange");
        CLS34.MTH1071(this, 23, ʾᵢ0, "bandialog_ban");
        CLS34.MTH1071(this, 24, ʾᵢ0, "bandialog_ban_silent");
        CLS34.MTH1071(this, 25, ʾᵢ0, "bandialog_permaban");
        CLS34.MTH1071(this, 26, ʾᵢ0, "dialogWhitelist");
        CLS34.MTH1071(this, 27, ʾᵢ0, "dialogUnWhitelist");
        CLS34.MTH1071(this, 1, ʾᵢ0, "dialogBan");
        CLS34.MTH1071(this, 2, ʾᵢ0, "dialogUnban");
        CLS34.MTH1071(this, 3, ʾᵢ0, "dialogUpgradeMod");
        CLS34.MTH1071(this, 4, ʾᵢ0, "dialogDowngradeMod");
        CLS34.MTH1071(this, 5, ʾᵢ0, "dialogPermaban");
        CLS34.MTH1071(this, 6, ʾᵢ0, "dialogUnPermaban");
        CLS34.MTH1071(this, 7, ʾᵢ0, "resendcheck");
        CLS34.MTH1071(this, 8, ʾᵢ0, "import_settings");
        CLS34.MTH1071(this, 9, ʾᵢ0, "export_settings");
        ʾᵢ0.MTH828(CLS34.MTH1062(6, ʾᵢ0, "chat_invite", 0x38ECCF532B3CD335L), ((CLS35)new CLS712(((CLS140)this), ʾᵢ0, 0)));
        ʾᵢ0.MTH833("convAdapter", ((CLS37)new CLS767(this, 1)));
        CLS34.MTH1071(this, 10, ʾᵢ0, "permaban");
        CLS34.MTH1071(this, 11, ʾᵢ0, "b.on_MMActivity_onCreate");
        CLS34.MTH1071(this, 12, ʾᵢ0, "refreshConversationList");
        CLS34.MTH1071(this, 13, ʾᵢ0, "new_contact");
        CLS34.MTH1071(this, 14, ʾᵢ0, "new_chatroom");
        CLS34.MTH1071(this, 15, ʾᵢ0, "on_sysmsg_link");
        CLS34.MTH1071(this, 16, ʾᵢ0, "on_conversationMenuClass1b_conversionMenuMethod1");
        CLS34.MTH1071(this, 17, ʾᵢ0, "new_chatroom_member");
        CLS34.MTH1071(this, 19, ʾᵢ0, "chatroom_member_exit");
        CLS34.MTH1071(this, 20, ʾᵢ0, "a.chat.onresume");
        CLS21 ʾᵢ1 = CLS21.FLD76;
        CLS34.MTH1061(this, 15, ʾᵢ1, "b.dbinsert.message");
        CLS34.MTH1061(this, 16, ʾᵢ1, "b.dbinsert.message.notpredb");
        CLS34.MTH1061(this, 17, ʾᵢ1, "a.async.sqldb.insert");
        CLS34.MTH1061(this, 18, ʾᵢ1, "a.async.sqldb.update");
        CLS34.MTH1061(this, 19, ʾᵢ1, "b.sqldb.rawquery");
        CLS34.MTH1061(this, 20, ʾᵢ1, "db.init");
        CLS34.MTH1061(this, 21, ʾᵢ1, "a.dbinsert.message");
        CLS34.MTH1061(this, 4, ʾᵢ1, CLS34.MTH1062(8, ʾᵢ1, "on_GetA8KeyClass", 4101859141826171701L));
        CLS34.MTH1061(this, 7, ʾᵢ1, CLS34.MTH1062(9, ʾᵢ1, CLS34.MTH1062(7, ʾᵢ1, "onchatroominvite", 4101859244905386805L), 0x38ECBB572B3CD335L));
        CLS34.MTH1061(this, 22, ʾᵢ1, CLS34.MTH1062(10, ʾᵢ1, "onaddchatroom", 0x38ECC3BA2B3CD335L));
        CLS34.MTH1061(this, 23, ʾᵢ1, "on_MainUI_onResume");
        CLS34.MTH1061(this, 24, ʾᵢ1, "on_ConversationAdapterClass_getView");
        CLS34.MTH1061(this, 25, ʾᵢ1, "on_LauncherUI_chattingUIStartMethod");
        CLS34.MTH1061(this, 26, ʾᵢ1, "on_setUnreadClass_setUnreadMethod");
        CLS34.MTH1061(this, 27, ʾᵢ1, "on_ConversationAdapter_setNickname");
        CLS34.MTH1061(this, 11, ʾᵢ1, CLS34.MTH1062(14, ʾᵢ1, CLS34.MTH1062(13, ʾᵢ1, CLS34.MTH1062(12, ʾᵢ1, CLS34.MTH1062(11, ʾᵢ1, "a.ConversationWithCacheAdapter_rebulidAllChangeData", 4101865197730059061L), 0x38ECC1512B3CD335L), 0x38ECC1702B3CD335L), 4101865640111690549L));
        CLS34.MTH1061(this, 12, ʾᵢ1, "on_ConvBoxClass2_getData");
        CLS34.MTH1061(this, 13, ʾᵢ1, "on_ConvBoxMenuClass1_createmenu");
        CLS34.MTH1061(this, 14, ʾᵢ1, "on_ConvBoxMenuClass2_menuselected");
        ʾᵢ1.MTH833("chattingui.optionsmenu.options", ((CLS37)new CLS767(this, 6)));
        ʾᵢ1.MTH833("chattingui.optionsmenu.options", ((CLS37)new CLS767(this, 7)));
        ʾᵢ1.MTH833("chattingui.optionsmenu.options", ((CLS37)new CLS767(this, 8)));
        ʾᵢ1.MTH833("chattingui.optionsmenu.options", ((CLS37)new CLS767(this, 9)));
        ʾᵢ1.MTH833("chattingui.optionsmenu.options", ((CLS37)new CLS767(this, 10)));
        CLS34.MTH1061(this, 8, ʾᵢ1, "chattingui.optionsmenu.config");
        ʾᵢ1.MTH833(CLS34.MTH1068(0, ʾᵢ1, "b.chatroominfoui.menu.options", 0x38ECB80E2B3CD335L), ((CLS37)new CLS767(this, 11)));
        ʾᵢ1.MTH833(CLS34.MTH1068(1, ʾᵢ1, "b.chatroominfoui.menu.options", 4101856539075990325L), ((CLS37)new CLS767(this, 12)));
        ʾᵢ1.MTH833("b.chatroominfoui.menu.options", ((CLS37)new CLS767(this, 13)));
        ʾᵢ1.MTH833("b.chatroominfoui.menu.options", ((CLS37)new CLS767(this, 14)));
        CLS34.MTH1061(this, 9, ʾᵢ1, "b.chatroominfoui.menu.config");
        ʾᵢ1.MTH833("b.chatroominfoui.menu.options,b.contactinfoui.menu.options,b.singlechatinfoui.menu.options", ((CLS37)new CLS767(this, 15)));
        CLS34.MTH1061(this, 10, ʾᵢ1, "b.chatroominfoui.menu.config,b.contactinfoui.menu.config,b.singlechatinfoui.menu.config");
        ʾᵢ1.MTH833("plus.options", ((CLS37)new CLS767(this, 4)));
        ʾᵢ1.MTH833("plus.options", ((CLS37)new CLS767(this, 5)));
        CLS34.MTH1061(this, 6, ʾᵢ1, "plus.config");
        ʾᵢ1.MTH833("chat.menu.options", ((CLS37)new CLS767(this, 2)));
        ʾᵢ1.MTH833("chat.menu.options", ((CLS37)new CLS767(this, 3)));
        CLS34.MTH1061(this, 5, ʾᵢ1, "chat.menu.config");
        CLS34.MTH1071(this, 28, ʾᵢ1, "b.conversation.menu.oncreate");
        CLS34.MTH1071(this, 29, ʾᵢ1, "b.conversation.menu.oncreate");
        CLS34.MTH1061(this, 0, ʾᵢ1, "b.conversation.menu.oncreate");
        CLS34.MTH1061(this, 1, ʾᵢ1, "b.conversation.menu.oncreate");
        CLS34.MTH1061(this, 2, ʾᵢ1, "b.conversation.menu.oncreate");
        CLS34.MTH1061(this, 3, ʾᵢ1, "b.conversation.menu.oncreate");
    }

    // 此方法包含解密的字符串
    public final void MTH2691(String s, Map map0, Map map1) {
        if(map0 != null && map1 != null && this.FLD1445.MTH938("nickname_change_notif_enable", false)) {
            String s1 = CLS27.MTH897("chatroomMemberNicknameField");
            for(Object object0: map0.keySet()) {
                String s2 = (String)object0;
                if(map1.containsKey(s2)) {
                    Object object1 = map0.get(s2);
                    Object object2 = map1.get(s2);
                    String s3 = (String)CLS166.MTH3194(object1, s1);
                    String s4 = (String)CLS166.MTH3194(object2, s1);
                    if((!TextUtils.isEmpty(s3) || !TextUtils.isEmpty(s4)) && !s3.equals(s4)) {
                        boolean z = TextUtils.isEmpty(s3);
                        CLS371 ʻ0 = this.FLD1444;
                        if(z) {
                            s3 = ʻ0.MTH5304(s2);
                        }
                        if(TextUtils.isEmpty(s4)) {
                            s4 = ʻ0.MTH5304(s2);
                        }
                        HashMap hashMap0 = this.FLD1155;
                        if(!hashMap0.containsKey(s + s2) || !((String)hashMap0.get(s + s2)).equals(s4)) {
                            CLS404.MTH5900(System.currentTimeMillis(), s, String.format(CLS27.MTH889("nickname_change"), s3, s4, s2));
                            this.FLD1447.MTH3012(this.FLD1447.FLD1434);
                            hashMap0.put(s + s2, s4);
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2692(HashMap hashMap0, String s, String s1) {
        String s5;
        String s6;
        String s7;
        if(!CLS502.MTH6934(s1, new String[]{CLS27.MTH882("invite1")}) && !CLS502.MTH6934(s1, new String[]{CLS27.MTH882("invite2")}) && !CLS502.MTH6934(s1, new String[]{CLS27.MTH882("viascan1")}) && !CLS502.MTH6934(s1, new String[]{"joined the group chat"}) && (!CLS502.MTH6934(s1, new String[]{"invited"}) || !CLS502.MTH6934(s1, new String[]{"to the group chat"})) && !CLS502.MTH6934(s1, new String[]{CLS27.MTH882("viascan2")})) {
            return;
        }
        try {
            if(!hashMap0.containsKey(".sysmsg.sysmsgtemplate.content_template.link_list.link.$name")) {
                return;
            }
            String s2 = "";
            String s3 = "";
            String s4 = "";
            switch(((String)hashMap0.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.$name"))) {
                case "adder": {
                    boolean z = "from".equals(hashMap0.get(".sysmsg.sysmsgtemplate.content_template.link_list.link1.$name"));
                    s3 = (String)hashMap0.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.memberlist.member.username");
                    s4 = (String)hashMap0.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.memberlist.member.nickname");
                    if(z) {
                        s6 = (String)hashMap0.get(".sysmsg.sysmsgtemplate.content_template.link_list.link1.memberlist.member.username");
                        s2 = (String)hashMap0.get(".sysmsg.sysmsgtemplate.content_template.link_list.link1.memberlist.member.nickname");
                        s5 = s6;
                    }
                    else {
                        s7 = CLS27.MTH904();
                        s2 = CLS426.MTH6112(s, CLS27.MTH904());
                        s5 = s7;
                        break;
                    }
                    break;
                }
                case "names": {
                    s7 = CLS27.MTH904();
                    s2 = CLS426.MTH6112(s, CLS27.MTH904());
                    s3 = (String)hashMap0.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.memberlist.member.username");
                    s4 = (String)hashMap0.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.memberlist.member.nickname");
                    s5 = s7;
                    break;
                }
                case "username": {
                    s6 = (String)hashMap0.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.memberlist.member.username");
                    s2 = (String)hashMap0.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.memberlist.member.nickname");
                    s5 = s6;
                    break;
                }
                default: {
                    s5 = "";
                }
            }
            HashSet hashSet0 = new HashSet();
            if(!TextUtils.isEmpty(s3)) {
                hashSet0.add(s3 + "," + s4);
            }
            for(int v = 0; true; ++v) {
                String s8 = v == 0 ? ".sysmsg.sysmsgtemplate.content_template.link_list.link1.memberlist.member" : ".sysmsg.sysmsgtemplate.content_template.link_list.link1.memberlist.member" + v;
                if(!hashMap0.containsKey(s8 + ".username")) {
                    break;
                }
                String s9 = (String)hashMap0.get(s8 + ".username");
                String s10 = (String)hashMap0.get(s8 + ".nickname");
                if(!s5.equals(s9)) {
                    hashSet0.add(s9 + "," + s10);
                }
            }
            for(Object object0: hashSet0) {
                String[] arr_s = ((String)object0).split(",");
                CLS682 ˈˊ0 = new CLS682(this, s, s5, arr_s[0], s2, arr_s[1], 0);
                CLS40.FLD157.MTH1124(((CLS39)ˈˊ0));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2693(String s, HashMap hashMap0) {
        if(hashMap0 != null) {
            try {
                if(!hashMap0.isEmpty()) {
                    String s1 = this.FLD1444.MTH5316(s);
                    String s2 = (String)hashMap0.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.memberlist.member.username");
                    if(CLS27.MTH904().equals(s2) || CLS794.MTH2698().MTH1332(s, s2) || s1.equals(((String)hashMap0.get(".sysmsg.sysmsgtemplate.content_template.link_list.link1.plain")))) {
                        return;
                    }
                    if(!TextUtils.isEmpty(s2)) {
                        CLS426.MTH6132(s, s2, true);
                    }
                    CLS565 ˆʿ0 = new CLS565(4, s, s1);
                    CLS40.FLD157.MTH1117(((CLS39)ˆʿ0), 3000L);
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    public static CLS42 MTH2694() {
        return (CLS42)CLS40.FLD157.MTH1118(CLS42.class);
    }

    public final void MTH2695(String s) {
        public final class CLS792 implements CLS2 {
            public final ArrayList FLD1140;
            public final CLS794 FLD1141;
            public final String FLD1142;

            public CLS792(ArrayList arrayList0, String s) {
                this.FLD1140 = arrayList0;
                this.FLD1142 = s;
                super();
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
                CLS794.this.FLD1447.MTH3022("");
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(this.FLD1140.isEmpty()) {
                    return;
                }
                ArrayList arrayList1 = new ArrayList();
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    arrayList1.add("");
                }
                CLS523.MTH7165(((CLS140)CLS794.this).MTH3042(), CLS27.MTH889("at_multi"), "", "", 1, ((CLS16)new CLS766(this, this.FLD1142, arrayList1, arrayList0, this.FLD1140, 0)));
            }
        }

        String[] arr_s = CLS502.MTH6941(this.FLD1444.MTH5335(s));
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(!s1.equals(CLS27.MTH904())) {
                arrayList0.add(new CLS78(s1, CLS66.MTH1452(s, s1)));
            }
        }
        CLS403.MTH5864(((CLS140)this).MTH3042(), s, arrayList0, ((CLS2)new CLS792(this, arrayList0, s)));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final void MTH2696(ContentValues contentValues0) {
        if((contentValues0.containsKey("isSend") ? CLS182.MTH3474(0x38ECA4C72B3CD335L, contentValues0) : 0) == 1) {
            return;
        }
        if(CLS182.MTH3474(4101834566023303989L, contentValues0) != 10002) {
            return;
        }
        String s = contentValues0.getAsString("talker");
        if(!TextUtils.isEmpty(s) && CLS426.MTH6126(s) && !CLS481.MTH6686(this.FLD1162, contentValues0) && CLS27.MTH895().MTH938("invite_by_keys", false) && CLS500.FLD4928.MTH6895("invite_by_keys")) {
            String s1 = contentValues0.getAsString("content");
            if(!CLS502.MTH6934(s1, new String[]{"sysmsgtemplate"}) || !CLS502.MTH6934(s1, new String[]{CLS27.MTH882("invite1")}) && !CLS502.MTH6934(s1, new String[]{CLS27.MTH882("invite2")}) && !CLS502.MTH6934(s1, new String[]{CLS27.MTH882("viascan1")}) && !CLS502.MTH6934(s1, new String[]{"joined the group chat"}) && (!CLS502.MTH6934(s1, new String[]{"invited"}) || !CLS502.MTH6934(s1, new String[]{"to the group chat"})) && !CLS502.MTH6934(s1, new String[]{CLS27.MTH882("viascan2")})) {
                return;
            }
            HashMap hashMap0 = CLS392.MTH5633(s1, "sysmsg");
            if(!hashMap0.containsKey(".sysmsg.sysmsgtemplate.content_template.link_list.link.$name")) {
                return;
            }
            String s2 = "";
            String s3 = (String)hashMap0.get(".sysmsg.sysmsgtemplate.content_template.link_list.link.$name");
            if(!TextUtils.isEmpty(s3)) {
                switch(s3) {
                    case "adder": {
                        s2 = (String)hashMap0.get(CLS370.MTH5289(4101835347707351861L));
                        break;
                    }
                    case "names": {
                        s2 = (String)hashMap0.get(CLS370.MTH5289(4101834995520033589L));
                    }
                }
            }
            CLS48 ˊﾞ0 = CLS62.FLD190.FLD189;
            ˊﾞ0.getClass();
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s2)) {
                String s4 = CLS27.MTH904();
                Cursor cursor0 = TextUtils.isEmpty(s4) ? null : ˊﾞ0.getReadableDatabase().rawQuery("SELECT * FROM ChatroomKeyInvite WHERE ACCOUNT = ?  AND INVITED_TO_CHATROOM = ? AND USERNAME = ? AND IS_USED <> 1", new String[]{s4, s, s2});
                if(cursor0 != null) {
                    ContentValues contentValues1 = CLS48.MTH1208(cursor0);
                    if(contentValues1 != null && (Build.VERSION.SDK_INT < 30 || !contentValues1.isEmpty())) {
                        contentValues1.put(CLS182.MTH3479(1, contentValues1, "IS_USED", 4100914854611440437L), System.currentTimeMillis());
                        ˊﾞ0.MTH1206(contentValues1, contentValues1.getAsString("SECRETKEY"));
                        if(CLS27.MTH895().MTH938("delete_contact_on_invite", false) && CLS371.FLD3470.MTH5382(s2)) {
                            CLS1258 ⁱˏ0 = new CLS1258(3, s2);
                            CLS40.FLD157.MTH1123(((CLS39)ⁱˏ0), 5000L);
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2697(String s, String s1) {
        String s2 = CLS34.MTH1079(4101861160460800821L, new StringBuilder(), s, 4101860679424463669L);
        CLS29 ˎᵢ0 = this.FLD1445;
        boolean z = false;
        if(ˎᵢ0.MTH938(s2, false)) {
            String s3 = s + s1;
            CLS73 ˈˊ0 = this.FLD1150;
            if(ˈˊ0.MTH1579(s3)) {
                z = true;
            }
            else {
                ˈˊ0.MTH1578(s3);
            }
            if(!z) {
                CLS880 ﾞˎ0 = new CLS880(this, ˎᵢ0.MTH925(CLS34.MTH1079(4101860713784202037L, new StringBuilder(), s, 4101860782503678773L), ""), s, s1, 1);
                CLS40.FLD157.MTH1123(((CLS39)ﾞˎ0), 2000L);
            }
        }
    }

    public static CLS61 MTH2698() {
        return (CLS61)CLS40.FLD157.MTH1118(CLS61.class);
    }

    // 此方法包含解密的字符串
    public final void MTH2699(HashMap hashMap0, String s, boolean z, boolean z1) {
        if(!hashMap0.containsKey(".sysmsg.delchatroommember.link.memberlist.username")) {
            return;
        }
        CLS699 ˊˏ0 = new CLS699(this, hashMap0, s, z, z1);
        CLS40.FLD157.MTH1123(((CLS39)ˊˏ0), 2000L);
    }

    @Override  // b.ˑٴ.CLS140
    public final void MTH3043() {
        CLS695 ˊʼ0 = new CLS695(this, 0);
        CLS40.FLD157.MTH1123(((CLS39)ˊʼ0), 5000L);
    }

    // 此方法包含解密的字符串
    public final void MTH2701(HashMap hashMap0, String s, long v) {
        CharSequence charSequence0;
        String s1 = (String)hashMap0.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.invitationreason");
        String s2 = this.FLD1445.MTH925(s + "_auto_accept_chatroom_verify_application_keywords", "");
        if(TextUtils.isEmpty(s2)) {
            charSequence0 = null;
        }
        else {
            if(s2.endsWith("|")) {
                s2 = s2.substring(0, s2.length() - 1);
            }
            Pattern pattern0 = Pattern.compile(s2, 2);
            if(pattern0 == null) {
                charSequence0 = null;
            }
            else {
                Matcher matcher0 = pattern0.matcher(s1);
                charSequence0 = matcher0.find() ? matcher0.group(0) : null;
            }
        }
        if(TextUtils.isEmpty(charSequence0)) {
            return;
        }
        String s3 = (String)hashMap0.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.inviterusername");
        String s4 = (String)hashMap0.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.ticket");
        int v1 = Integer.parseInt(((String)hashMap0.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.memberlistsize")));
        LinkedList linkedList0 = new LinkedList();
        for(int v2 = 0; true; ++v2) {
            String s5 = ".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member";
            if(v2 >= v1) {
                break;
            }
            if(v2 != 0) {
                s5 = ".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + v2;
            }
            StringBuilder stringBuilder0 = CLS182.MTH3483(s5);
            stringBuilder0.append(".username");
            linkedList0.add(((String)hashMap0.get(stringBuilder0.toString())));
        }
        Class class0 = CLS27.MTH894("ApproveChatroomMemberClass1");
        Class class1 = CLS27.MTH894("ApproveChatroomMemberClass2");
        if(class0 != null && class1 != null && CLS27.MTH894("RunCgiClass1") != null) {
            CLS66.MTH1446((CLS426.MTH6107(s) ? CLS166.MTH3188(class1, new Object[]{s3, s, s4, linkedList0}) : CLS166.MTH3188(class0, new Object[]{v, s3, s, s4, linkedList0})));
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2702(String s) {
        CLS61 ﾞٴ0 = CLS794.MTH2698();
        ﾞٴ0.getClass();
        ﾞٴ0.MTH1344(5, "", s, Long.toHexString(System.currentTimeMillis()), "");
        String s1 = CLS27.MTH904();
        CLS371 ʻ0 = this.FLD1444;
        for(Object object0: ʻ0.MTH5322(s1)) {
            String s2 = (String)object0;
            if(ʻ0.MTH5335(s2).contains(s)) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(s);
                CLS66.MTH1466(s2, arrayList0);
            }
        }
    }

    public final CLS43 MTH2703() {
        if(this.FLD1153 == null) {
            this.FLD1153 = (CLS43)CLS40.FLD157.MTH1118(CLS43.class);
        }
        return this.FLD1153;
    }

    // 此方法包含解密的字符串
    public final void MTH2704(String s, String s1, String s2, String s3, String s4) {
        CLS61 ﾞٴ0 = CLS794.MTH2698();
        if(ﾞٴ0.FLD186 && ﾞٴ0.MTH1304(s, s2)) {
            ﾞٴ0.MTH1331(s, s2, s1, s3, s4);
            return;
        }
        if(this.FLD1444.MTH5337(s, s2)) {
            String s5 = CLS66.MTH1452(s, s2);
            this.FLD1157.put(s + s2, s5);
            ﾞٴ0.MTH1331(s, s2, s1, s3, s4);
            CLS29 ˎᵢ0 = this.FLD1445;
            if(ˎᵢ0.MTH938(s + "_chatroom_ban_sendmsg_enable", true)) {
                StringBuilder stringBuilder0 = CLS182.MTH3483(CLS426.MTH6125(s, s2));
                String s6 = CLS182.MTH3481(CLS27.MTH889("banned_by"), new Object[]{CLS66.MTH1452(s, s1), CLS182.MTH3473(0x38ECB3EB2B3CD335L, ˎᵢ0, s + "_goodbye_text")}, stringBuilder0);
                if(!TextUtils.isEmpty(s4)) {
                    StringBuilder stringBuilder1 = CLS182.MTH3483(s6);
                    stringBuilder1.append("\n");
                    stringBuilder1.append(CLS27.MTH889("reason"));
                    stringBuilder1.append(": ");
                    stringBuilder1.append(s4);
                    s6 = stringBuilder1.toString();
                }
                if(ﾞٴ0.FLD186 && !TextUtils.isEmpty(s3)) {
                    long v = Long.parseLong(s3, 16);
                    StringBuilder stringBuilder2 = CLS182.MTH3483(s6);
                    stringBuilder2.append("\n");
                    s6 = CLS182.MTH3481(CLS27.MTH889("auto_unban"), new Object[]{this.FLD1152.format(new Date(v + System.currentTimeMillis()))}, stringBuilder2);
                }
                CLS66.MTH1393(s, s6, s2);
            }
            CLS794.MTH2688(s, s2);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2705(ContentValues contentValues0) {
        if(this.FLD1445.MTH938("auto_exit_chatroom_enable", false) && this.FLD1447.FLD1438.MTH6895("auto_exit_chatroom")) {
            int v = contentValues0.containsKey("isSend") ? CLS182.MTH3474(0x38ECBAAD2B3CD335L, contentValues0) : 0;
            String s = contentValues0.getAsString("talker");
            int v1 = CLS182.MTH3474(0x38ECBABB2B3CD335L, contentValues0);
            if(v == 0 && (v1 == 1 || v1 == 42) && CLS426.MTH6126(s)) {
                String s1 = this.FLD1444.MTH5343(s);
                if(!TextUtils.isEmpty(s1) && s1.equals(CLS27.MTH904())) {
                    return;
                }
                CLS759 ـˏ0 = new CLS759(this, contentValues0, v1, s, 0);
                CLS40.FLD157.MTH1124(((CLS39)ـˏ0));
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2706(String s, String s1, String s2, String s3, String s4) {
        String s5 = CLS182.MTH3475(4101860314352243509L, CLS182.MTH3483(s));
        if(this.FLD1445.MTH938(s5, false)) {
            CLS73 ˈˊ0 = this.FLD1151;
            if(!ˈˊ0.MTH1579(s + s3)) {
                if(TextUtils.isEmpty(s4)) {
                    s4 = CLS66.MTH1452(s, s3);
                }
                StringBuilder stringBuilder0 = new StringBuilder();
                if(!TextUtils.isEmpty(s3)) {
                    stringBuilder0.append(s4);
                    stringBuilder0.append(" (");
                    stringBuilder0.append(CLS426.MTH6127(s, s3));
                    stringBuilder0.append(") ");
                    stringBuilder0.append("\n");
                }
                int v = stringBuilder0.lastIndexOf("\n");
                if(v != -1) {
                    stringBuilder0.deleteCharAt(v);
                }
                String s6 = "";
                if(!TextUtils.isEmpty(s1)) {
                    if(TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s1)) {
                        s2 = CLS66.MTH1452(s, s1);
                    }
                    StringBuilder stringBuilder1 = CLS182.MTH3483(s2);
                    stringBuilder1.append(" (");
                    stringBuilder1.append(CLS426.MTH6127(s, s1));
                    stringBuilder1.append(") ");
                    s6 = stringBuilder1.toString();
                }
                String s7 = String.format(CLS27.MTH889("invite_info"), s6, stringBuilder0);
                if(!TextUtils.isEmpty(s1)) {
                    StringBuilder stringBuilder2 = CLS182.MTH3483(s7);
                    stringBuilder2.append("\n");
                    s7 = CLS182.MTH3481(CLS27.MTH889("invite_count"), new Object[]{CLS794.MTH2694().MTH1151(s, s1)}, stringBuilder2);
                }
                CLS404.MTH5900(System.currentTimeMillis(), s, s7);
                ˈˊ0.MTH1578(s + s3);
            }
        }
    }
}

