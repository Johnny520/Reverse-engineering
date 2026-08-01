// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS565;
import b.ʾᵢ.CLS566;
import b.ʾᵢ.CLS568;
import b.ʾᵢ.CLS576;
import b.ˆʿ.CLS48;
import b.ˆʿ.CLS53;
import b.ˆʿ.CLS61;
import b.ˆʿ.CLS62;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS583;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS79;
import b.ˊﾞ.CLS613;
import b.יᐧ.CLS163.CLS161;
import b.יᐧ.CLS163;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS1049;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1227;
import b.ᵔʾ.CLS1246;
import b.ᵔʾ.CLS1255;
import b.ᵔʾ.CLS1258;
import b.ᵔʾ.CLS1259;
import b.ᵔʾ.CLS283;
import b.ᵔʾ.CLS286;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1580;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS481;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class CLS874 implements CLS35 {
    public final int FLD1466;
    public final CLS794 FLD1467;

    public CLS874(CLS794 ᴵʽ0, int v) {
        this.FLD1466 = v;
        this.FLD1467 = ᴵʽ0;
        super();
    }

    // 此方法包含解密的字符串
    private final void MTH3058(Object[] arr_object) {
        Object object1;
        CLS794 ᴵʽ0 = this.FLD1467;
        ᴵʽ0.getClass();
        Object object0 = arr_object[0];
        if(ᴵʽ0.FLD1159 == null) {
            try {
                Field field0 = object0.getClass().getDeclaredField("thisObject");
                object1 = null;
                if(field0 != null) {
                    field0.setAccessible(true);
                    object1 = field0.get(object0);
                }
            }
            catch(Throwable unused_ex) {
            }
            ᴵʽ0.FLD1159 = object1;
        }
        if(!ᴵʽ0.FLD1156) {
            ᴵʽ0.FLD1156 = true;
            ᴵʽ0.FLD1147.getClass();
            CLS583 ـﹳ0 = new CLS583(ᴵʽ0.FLD1147, 1);
            CLS40.FLD157.MTH1124(((CLS39)ـﹳ0));
        }
    }

    // 此方法包含解密的字符串
    private final void MTH3059(Object[] arr_object) {
        String s6;
        String s4;
        String s3;
        String s2;
        CLS794 ᴵʽ0 = this.FLD1467;
        ᴵʽ0.getClass();
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        int v = (int)(((Integer)arr_object[1]));
        String s = (String)arr_object[2];
        if(v == 1) {
            s = (String)ᵔʾ0.MTH3204()[1];
        }
        else if(v == 2) {
            s = (String)ᵔʾ0.MTH3204()[0];
        }
        CLS79 ˎᵢ0 = ᴵʽ0.FLD1147;
        ˎᵢ0.getClass();
        try {
            String s1 = s.toLowerCase();
            if(CLS502.MTH6934(s1, new String[]{"from rconversation"})) {
                boolean z = ˎᵢ0.MTH1643().MTH938("chatroom_container", false);
                boolean z1 = ˎᵢ0.MTH1643().MTH938("chatcontainer_enable", false);
                if(!z1 && !z) {
                    s6 = "";
                }
                else if(CLS502.MTH6934(s1, new String[]{"( parentref is null  or parentref = \'\' ", "((parentref is null) or (parentref in (\'\', \'message_fold\')))", "((parentref is null) or (parentref=\'\'))"}) && CLS502.MTH6934(s1, new String[]{"rconversation.username like \'%@chatroom\'"})) {
                    boolean z2 = ˎᵢ0.MTH1643().MTH938("chatroom_container_all_enable", true);
                    boolean z3 = ˎᵢ0.MTH1643().MTH938("chatroom_container_public_enable", false);
                    if(z) {
                        if(z2) {
                            s2 = s.replaceAll("or rconversation.username like \'%@chatroom\'", "");
                            s3 = "or rconversation.username like \'%@im.chatroom\'";
                            s4 = "";
                        }
                        else {
                            s2 = s.replaceAll("or rconversation.username like \'%@im.chatroom\'", "");
                            s3 = "or rconversation.username like \'%@chatroom\'";
                            s4 = " or (rconversation.username like \'%@chatroom\' " + ˎᵢ0.FLD291 + ")";
                        }
                        s = s2.replaceAll(s3, s4);
                    }
                    if(s1.endsWith("order by flag desc")) {
                        String s5 = s.substring(0, s.indexOf("order by"));
                        if(z && z3 && !TextUtils.isEmpty(ˎᵢ0.FLD286)) {
                            s5 = s5 + ˎᵢ0.FLD286;
                        }
                        if(z1 && !TextUtils.isEmpty(ˎᵢ0.FLD295)) {
                            s5 = s5 + ˎᵢ0.FLD295;
                        }
                        s6 = s5 + " order by flag desc";
                    }
                    else {
                        if(z && z3 && !TextUtils.isEmpty(ˎᵢ0.FLD286)) {
                            s = s + ˎᵢ0.FLD286;
                        }
                        s6 = !z1 || TextUtils.isEmpty(ˎᵢ0.FLD295) ? s : s + ˎᵢ0.FLD295;
                    }
                }
                else if(CLS502.MTH6934(s1, new String[]{"rconversation inner join rcontact"})) {
                    boolean z4 = ˎᵢ0.MTH1643().MTH938("chatroom_container_all_enable", true);
                    boolean z5 = ˎᵢ0.MTH1643().MTH938("chatroom_container_public_enable", false);
                    if(z && z4) {
                        s = s.replaceAll("4 , 2 ,", "");
                    }
                    String s7 = s.substring(0, s.indexOf("from"));
                    String s8 = s.substring(s.indexOf("from"));
                    if(s1.endsWith("order by rconversation.flag desc")) {
                        String s9 = s7 + ", rconversation.flag from rconversation where rconversation.username like \'wx^_^_%\' ESCAPE \'^\' union " + s7 + ", rconversation.flag " + s8;
                        String s10 = s9.substring(0, s9.indexOf("order by"));
                        if(z && !z4) {
                            s10 = s10 + ˎᵢ0.FLD291;
                        }
                        if(z && z5 && !TextUtils.isEmpty(ˎᵢ0.FLD286)) {
                            s10 = s10 + ˎᵢ0.FLD286;
                        }
                        if(z1 && !TextUtils.isEmpty(ˎᵢ0.FLD295)) {
                            s10 = s10 + ˎᵢ0.FLD295;
                        }
                        s6 = s10 + " order by rconversation.flag desc";
                    }
                    else {
                        s = s7 + " from rconversation where rconversation.username like \'wx^_^_%\' ESCAPE \'^\' union " + s;
                        s = !z || z4 ? s7 + " from rconversation where rconversation.username like \'wx^_^_%\' ESCAPE \'^\' union " + s : s + ˎᵢ0.FLD291;
                        if(z && z5 && !TextUtils.isEmpty(ˎᵢ0.FLD286)) {
                            s = s + ˎᵢ0.FLD286;
                        }
                        s6 = !z1 || TextUtils.isEmpty(ˎᵢ0.FLD295) ? s : s + ˎᵢ0.FLD295;
                    }
                }
                else {
                    s6 = "";
                }
            }
            else {
                s6 = "";
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            s6 = "";
        }
        if(!TextUtils.isEmpty(s6) && !TextUtils.isEmpty(s6)) {
            switch(v) {
                case 1: {
                    ᵔʾ0.MTH3204()[1] = s6;
                    return;
                }
                case 2: {
                    ᵔʾ0.MTH3204()[0] = s6;
                    break;
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH3060(Object[] arr_object) {
        int v18;
        String[] arr_s1;
        String s14;
        int v13;
        int v11;
        long v8;
        boolean z;
        long v6;
        int v5;
        CLS794 ᴵʽ0 = this.FLD1467;
        ᴵʽ0.getClass();
        ContentValues contentValues0 = (ContentValues)arr_object[1];
        int v = contentValues0.containsKey("isSend") ? CLS182.MTH3474(0x38ECA6BA2B3CD335L, contentValues0) : 0;
        int v1 = ᴵʽ0.FLD1162;
        if(v != 1) {
            int v2 = CLS182.MTH3474(0x38ECA7412B3CD335L, contentValues0);
            if(v2 == 1 || v2 == 3) {
            label_10:
                String s = contentValues0.getAsString("talker");
                if(CLS426.MTH6126(s) && !CLS481.MTH6686(v1, contentValues0)) {
                    CLS29 ˎᵢ0 = CLS27.MTH895();
                    if(CLS182.MTH3480(4101837310507406133L, CLS182.MTH3483(s), ˎᵢ0, false)) {
                        String s1 = contentValues0.getAsString("content");
                        String s2 = CLS426.MTH6109(s1);
                        if(!TextUtils.isEmpty(s2)) {
                            CLS29 ˎᵢ1 = CLS27.MTH895();
                            if(CLS182.MTH3480(0x38ECA7652B3CD335L, CLS182.MTH3483(s), ˎᵢ1, false)) {
                            label_22:
                                CLS53 ٴـ0 = CLS794.MTH2687();
                                ٴـ0.getClass();
                                long v3 = System.currentTimeMillis();
                                Cursor cursor0 = CLS53.MTH1235(ٴـ0.getReadableDatabase(), s, s2);
                                long v4 = 0L;
                                if(cursor0 == null || cursor0.getCount() == 0) {
                                    v11 = 1;
                                label_61:
                                    Cursor cursor1 = CLS53.MTH1235(ٴـ0.getReadableDatabase(), s, s2);
                                    if(cursor1 == null) {
                                        ٴـ0.MTH1236(v11, v3, s, s2);
                                    }
                                    else {
                                        int v12 = cursor1.getCount();
                                        cursor1.close();
                                        if(v12 > 0) {
                                            ٴـ0.MTH1237(v11, v3, s, s2);
                                        }
                                        else {
                                            ٴـ0.MTH1236(v11, v3, s, s2);
                                        }
                                    }
                                    z = true;
                                }
                                else {
                                    if(cursor0.moveToFirst()) {
                                        v5 = CLS182.MTH3490(4100943347424482101L, cursor0);
                                        v6 = CLS34.MTH1076(4100943922950099765L, cursor0);
                                    }
                                    else {
                                        v5 = 0;
                                        v6 = 0L;
                                    }
                                    if(!cursor0.isClosed()) {
                                        cursor0.close();
                                    }
                                    if(v6 == 0L) {
                                        v11 = 1;
                                        goto label_61;
                                    }
                                    else {
                                        Calendar calendar0 = Calendar.getInstance();
                                        calendar0.setTimeInMillis(v6);
                                        int v7 = calendar0.get(6);
                                        Calendar calendar1 = Calendar.getInstance();
                                        calendar1.setTimeInMillis(v3);
                                        if(v7 == calendar1.get(6)) {
                                            z = false;
                                        }
                                        else {
                                            Date date0 = calendar0.getTime();
                                            Date date1 = calendar1.getTime();
                                            if(Build.VERSION.SDK_INT >= 26) {
                                                v8 = ChronoUnit.DAYS.between(date0.toInstant(), date1.toInstant());
                                            }
                                            else {
                                                long v9 = date0.getTime();
                                                long v10 = date1.getTime();
                                                v8 = TimeUnit.DAYS.convert(v9 - v10, TimeUnit.MILLISECONDS);
                                            }
                                            v11 = ((int)v8) < 2 ? v5 + 1 : 1;
                                            goto label_61;
                                        }
                                    }
                                }
                                if(z) {
                                    Cursor cursor2 = CLS53.MTH1235(CLS794.MTH2687().getReadableDatabase(), s, s2);
                                    if(cursor2 == null) {
                                        v13 = 0;
                                    }
                                    else {
                                        int v14 = cursor2.moveToFirst() ? CLS182.MTH3490(4100943300179841845L, cursor2) : 0;
                                        if(!cursor2.isClosed()) {
                                            cursor2.close();
                                        }
                                        v13 = v14;
                                    }
                                    Cursor cursor3 = CLS53.MTH1235(CLS794.MTH2687().getReadableDatabase(), s, s2);
                                    if(cursor3 != null) {
                                        if(cursor3.moveToFirst()) {
                                            v4 = CLS34.MTH1076(4100943325949645621L, cursor3);
                                        }
                                        if(!cursor3.isClosed()) {
                                            cursor3.close();
                                        }
                                    }
                                    String s4 = CLS66.MTH1452(s, s2);
                                    String s5 = CLS182.MTH3473(4101878460589069109L, CLS27.MTH895(), CLS182.MTH3475(4101878404754494261L, CLS182.MTH3483(s)));
                                    Date date2 = new Date(v4);
                                    CLS466.MTH6542(s, s5.replaceAll("#T", ᴵʽ0.FLD1163.format(date2)).replaceAll("#N", s4).replaceAll("#C", String.valueOf(v13)));
                                }
                            }
                            else if(CLS182.MTH3474(4101837503780934453L, contentValues0) == 1) {
                                String s3 = CLS182.MTH3473(4101837048514401077L, CLS27.MTH895(), CLS182.MTH3475(0x38ECA77F2B3CD335L, CLS182.MTH3483(s)));
                                if(!TextUtils.isEmpty(s3) && CLS426.MTH6106(v, s1, s).equals(s3)) {
                                    goto label_22;
                                }
                            }
                        }
                    }
                }
            }
            else {
                switch(v2) {
                    case 34: 
                    case 43: 
                    case 0x2F: 
                    case 49: 
                    case 62: 
                    case 0x100031: 
                    case 0x1000031: 
                    case 0x2D000031: 
                    case 0x30000031: 
                    case 0x31000031: 
                    case 0x3A000031: 
                    case 0x3E000031: 
                    case 0x41000031: 
                    case 0x54000031: 
                    case 0x55000031: {
                        goto label_10;
                    }
                }
            }
        }
        if(!CLS412.MTH6002()) {
            if((contentValues0.containsKey("isSend") ? CLS182.MTH3474(0x38ECA72F2B3CD335L, contentValues0) : 0) != 1 && CLS182.MTH3474(0x38ECA7362B3CD335L, contentValues0) == 3 && !CLS481.MTH6686(v1, contentValues0)) {
                CLS29 ˎᵢ2 = ᴵʽ0.FLD1445;
                if(ˎᵢ2.MTH938("auto_accept_chatroom_invite_qr_enable", false) && ᴵʽ0.FLD1447.FLD1438.MTH6895("auto_accept_chatroom_invite_qr")) {
                    String s6 = contentValues0.getAsString("talker");
                    String s7 = ˎᵢ2.MTH925("auto_accept_chatroom_invite_qr_config_include", "");
                    if(!TextUtils.isEmpty(s7)) {
                        if(CLS502.MTH6934(s7, new String[]{s6})) {
                        label_101:
                            long v15 = (long)CLS412.MTH6005(5000, "auto_accept_chatroom_invite_qr_delay");
                            CLS163 ﾞᐧ0 = ᴵʽ0.FLD1160;
                            CLS161 ﾞᐧ$ٴـ0 = new CLS161(v15, contentValues0);
                            ﾞᐧ0.FLD1573.offer(ﾞᐧ$ٴـ0);
                            if(!ﾞᐧ0.MTH3167() && !ﾞᐧ0.FLD1578) {
                                ﾞᐧ0.FLD1578 = true;
                                ﾞᐧ0.MTH3165().post(ﾞᐧ0.FLD1576);
                            }
                        }
                    }
                    else if(CLS502.MTH6934(ˎᵢ2.MTH925("auto_accept_chatroom_invite_qr_excl", ""), new String[]{s6})) {
                    }
                    else {
                        goto label_101;
                    }
                }
            }
            if((contentValues0.containsKey("isSend") ? CLS182.MTH3474(0x38ECA4072B3CD335L, contentValues0) : 0) != 1 && CLS182.MTH3474(0x38ECA40E2B3CD335L, contentValues0) == 1) {
                String s8 = contentValues0.getAsString("talker");
                if(!TextUtils.isEmpty(s8) && !CLS426.MTH6126(s8) && !CLS481.MTH6686(v1, contentValues0) && CLS27.MTH895().MTH938("invite_by_keys", false) && CLS500.FLD4928.MTH6895("invite_by_keys")) {
                    String s9 = contentValues0.getAsString("content");
                    CLS48 ˊﾞ0 = CLS62.FLD190.FLD189;
                    ˊﾞ0.getClass();
                    ContentValues contentValues1 = CLS48.MTH1208(ˊﾞ0.MTH1207(s9.trim()));
                    if(contentValues1 != null && (Build.VERSION.SDK_INT < 30 || !contentValues1.isEmpty())) {
                        CLS27.MTH906(("" + contentValues1));
                        if(((int)contentValues1.getAsInteger("IS_USED")) == 1) {
                            Object[] arr_object1 = {CLS27.MTH889("secret_key_is_used"), s8};
                            CLS21.FLD76.MTH818("sendMessage", arr_object1);
                            return;
                        }
                        String s10 = contentValues1.getAsString("TAG");
                        String s11 = CLS27.MTH895().MTH921("invite_key_tags").optString(s10);
                        String s12 = contentValues1.getAsString("SECRETKEY");
                        String s13 = contentValues1.getAsString("INVITED_TO_CHATROOM");
                        long v16 = CLS34.MTH1080(4100918333534950197L, contentValues1);
                        CLS27.MTH906(("invitedToChatroom: " + s13));
                        String[] arr_s = CLS502.MTH6941(s11);
                        for(int v17 = 0; true; ++v17) {
                            s14 = "";
                            if(v17 >= arr_s.length) {
                                break;
                            }
                            String s15 = arr_s[v17];
                            if(CLS371.FLD3470.MTH5337(s15.trim(), s8)) {
                                s14 = s15.trim();
                                break;
                            }
                        }
                        if(TextUtils.isEmpty(s13)) {
                            if(!TextUtils.isEmpty(s14)) {
                                CLS466.MTH6542(s8, String.format(CLS27.MTH889("invitation_already_is_member"), CLS371.FLD3470.MTH5311(s8), CLS371.FLD3470.MTH5316(s14)));
                                return;
                            }
                            arr_s1 = CLS502.MTH6941(s11);
                            v18 = 0;
                        }
                        else {
                            if(!TextUtils.isEmpty(s14)) {
                                CLS466.MTH6542(s8, String.format(CLS27.MTH889("invitation_already_is_member"), CLS371.FLD3470.MTH5311(s8), CLS371.FLD3470.MTH5316(s14)));
                                ˊﾞ0.MTH1212(s8, s14, s12);
                                return;
                            }
                            if(CLS481.MTH6688(v16, 3600000L)) {
                                arr_s1 = CLS502.MTH6941(s11);
                                v18 = 0;
                            }
                            else {
                                CLS371 ʻ0 = CLS371.FLD3470;
                                if(!ʻ0.MTH5337(s13, s8)) {
                                    if(CLS502.MTH6941(ʻ0.MTH5335(s13)).length < 500) {
                                        CLS48.MTH1213(s13, s8);
                                        return;
                                    }
                                    arr_s1 = CLS502.MTH6941(s11);
                                    v18 = 0;
                                    goto label_163;
                                }
                                CLS466.MTH6542(s8, String.format(CLS27.MTH889("invitation_already_is_member"), ʻ0.MTH5311(s8), ʻ0.MTH5316(s13)));
                                ˊﾞ0.MTH1212(s8, s13, s12);
                                return;
                            }
                        }
                    label_163:
                        while(v18 < arr_s1.length) {
                            String s16 = arr_s1[v18].trim();
                            if(CLS371.FLD3470.MTH5383(s16) && CLS502.MTH6941(CLS371.FLD3470.MTH5335(s16)).length < 500) {
                                CLS48.MTH1213(s16, s8);
                                ContentValues contentValues2 = CLS48.MTH1208(ˊﾞ0.MTH1207(s12));
                                contentValues2.put("USERNAME", s8);
                                contentValues2.put("INVITED_TO_CHATROOM", s16);
                                contentValues2.put("USE_TIME", System.currentTimeMillis());
                                ˊﾞ0.MTH1206(contentValues2, s12);
                                return;
                            }
                            ++v18;
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        Object object8;
        boolean z5;
        String s19;
        String s18;
        String s17;
        String s16;
        String s15;
        String s14;
        CLS794 ᴵʽ0 = this.FLD1467;
        switch(this.FLD1466) {
            case 0: {
                ᴵʽ0.getClass();
                int v = (int)(((Integer)arr_object[0]));
                int v1 = (int)(((Integer)arr_object[1]));
                ContextMenu contextMenu0 = (ContextMenu)arr_object[2];
                String s = (String)arr_object[3];
                if(s.startsWith("wx__c_") && (ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false) && contextMenu0.findItem(v) == null)) {
                    CLS779 ᐧˉ0 = new CLS779(ᴵʽ0, s, 3);
                    contextMenu0.add(v1, v, 0, CLS27.MTH889("remove_chatcontainer")).setOnMenuItemClickListener(new CLS142(((CLS3)ᐧˉ0), 4));
                    CLS882 ﾞٴ0 = new CLS882(((CLS3)ᐧˉ0), 4);
                    CLS21.FLD76.MTH824("onconversationmenu_click", v, ((CLS35)ﾞٴ0));
                }
                return;
            }
            case 1: {
                ᴵʽ0.getClass();
                int v2 = (int)(((Integer)arr_object[0]));
                int v3 = (int)(((Integer)arr_object[1]));
                ContextMenu contextMenu1 = (ContextMenu)arr_object[2];
                String s1 = (String)arr_object[3];
                if(CLS426.MTH6126(s1) && (ᴵʽ0.FLD1445.MTH938("chatroom_tags", false) && contextMenu1.findItem(v2) == null)) {
                    CLS779 ᐧˉ1 = new CLS779(ᴵʽ0, s1, 1);
                    contextMenu1.add(v3, v2, 0, CLS27.MTH889("add_to_chatroom_tags")).setOnMenuItemClickListener(new CLS142(((CLS3)ᐧˉ1), 2));
                    CLS882 ﾞٴ1 = new CLS882(((CLS3)ᐧˉ1), 2);
                    CLS21.FLD76.MTH824("onconversationmenu_click", v2, ((CLS35)ﾞٴ1));
                }
                return;
            }
            case 2: {
                ᴵʽ0.getClass();
                int v4 = (int)(((Integer)arr_object[0]));
                int v5 = (int)(((Integer)arr_object[1]));
                ContextMenu contextMenu2 = (ContextMenu)arr_object[2];
                String s2 = (String)arr_object[3];
                if(CLS404.MTH5909(s2) && ((ᴵʽ0.FLD1445.MTH938("chatroom_tags", false) || ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false)) && contextMenu2.findItem(v4) == null)) {
                    CLS779 ᐧˉ2 = new CLS779(ᴵʽ0, s2, 2);
                    contextMenu2.add(v5, v4, 0, CLS27.MTH889("container_settings")).setOnMenuItemClickListener(new CLS142(((CLS3)ᐧˉ2), 3));
                    CLS882 ﾞٴ2 = new CLS882(((CLS3)ᐧˉ2), 3);
                    CLS21.FLD76.MTH824("onconversationmenu_click", v4, ((CLS35)ﾞٴ2));
                }
                return;
            }
            case 3: {
                ᴵʽ0.getClass();
                if(CLS27.MTH902("invite_member_shortcut")) {
                    boolean z = CLS412.MTH6002();
                    boolean z1 = ᴵʽ0.FLD1445.MTH938("room_manangement_enable", z);
                    if(ᴵʽ0.FLD1445.MTH938("invite_member_shortcut_enable", z1)) {
                        int v6 = (int)(((Integer)arr_object[0]));
                        int v7 = (int)(((Integer)arr_object[1]));
                        ContextMenu contextMenu3 = (ContextMenu)arr_object[2];
                        String s3 = (String)arr_object[3];
                        if(!CLS426.MTH6126(s3) && !CLS372.MTH5400(s3) && !CLS372.MTH5410(s3) && !CLS372.MTH5406(s3) && !CLS404.MTH5909(s3) && !s3.equals(CLS27.MTH904()) && contextMenu3.findItem(v6) == null) {
                            CLS692 ˉᐧ0 = new CLS692(0, s3);
                            contextMenu3.add(v7, v6, 0, CLS27.MTH889("invite_member")).setOnMenuItemClickListener(new CLS142(((CLS3)ˉᐧ0), 5));
                            CLS882 ﾞٴ3 = new CLS882(((CLS3)ˉᐧ0), 5);
                            CLS21.FLD76.MTH824("onconversationmenu_click", v6, ((CLS35)ﾞٴ3));
                        }
                    }
                }
                return;
            }
            case 4: {
                ᴵʽ0.getClass();
                String s4 = (String)arr_object[2];
                ContentValues contentValues0 = (ContentValues)arr_object[3];
                if("chatroom".equals(s4) && contentValues0.containsKey("chatroomname")) {
                    String s5 = contentValues0.getAsString("chatroomname");
                    if(!s5.equals(ᴵʽ0.FLD1445.MTH925("zombie_check_chatroom", ""))) {
                        Object object0 = CLS66.MTH1505(s5);
                        if(object0 != null) {
                            HashMap hashMap0 = ᴵʽ0.FLD1145;
                            if(hashMap0.containsKey(s5)) {
                                Map map0 = CLS66.MTH1403(hashMap0.get(s5));
                                Map map1 = CLS66.MTH1403(object0);
                                if(map0 != null && map1 != null && map0.size() != 0 && map1.size() != 0 && map0.size() != map1.size()) {
                                    if(map1.size() > map0.size()) {
                                        Set set0 = map0.keySet();
                                        for(Object object1: map1.keySet()) {
                                            String s6 = (String)object1;
                                            if(!set0.contains(s6)) {
                                                String s7 = CLS613.MTH1971(CLS66.MTH1421(s5, s6, map1));
                                                if(TextUtils.isEmpty(s7)) {
                                                    s7 = CLS66.MTH1452(s5, s6);
                                                }
                                                CLS21.FLD76.MTH818("new_chatroom_member", new Object[]{s5, s6, s7});
                                            }
                                        }
                                    }
                                    else {
                                        Set set1 = map0.keySet();
                                        Set set2 = map1.keySet();
                                        for(Object object2: set1) {
                                            String s8 = (String)object2;
                                            if(!set2.contains(s8)) {
                                                String s9 = CLS613.MTH1971(CLS66.MTH1421(s5, s8, map0));
                                                if(TextUtils.isEmpty(s9)) {
                                                    s9 = CLS66.MTH1452(s5, s8);
                                                }
                                                CLS21.FLD76.MTH818("chatroom_member_exit", new Object[]{s5, s8, s9});
                                            }
                                        }
                                    }
                                }
                                CLS1259 ⁱᵔ0 = new CLS1259(ᴵʽ0, s5, map1, 7);
                                CLS40.FLD157.MTH1123(((CLS39)ⁱᵔ0), 3000L);
                            }
                            hashMap0.put(s5, object0);
                        }
                    }
                }
                return;
            }
            case 5: {
                CLS371 ʻ0 = ᴵʽ0.FLD1444;
                String s10 = (String)arr_object[0];
                Object object3 = arr_object[1];
                int v8 = CLS166.MTH3181(object3, "field_type");
                String s11 = (String)CLS166.MTH3194(object3, "field_content");
                String s12 = (String)CLS166.MTH3194(object3, "field_talker");
                int v9 = CLS166.MTH3181(object3, "field_isSend");
                CLS61 ﾞٴ4 = CLS794.MTH2698();
                String s13 = CLS426.MTH6124(v8, v9, s12, s11);
                try {
                    switch(s10) {
                        case "chatroom_management": {
                            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                            boolean z2 = ﾞٴ4.MTH1304(s12, s13);
                            if(ʻ0.MTH5337(s12, s13)) {
                                linkedHashMap0.put(CLS27.MTH889("delete_member"), "delete_member");
                            }
                            else if(z2 || ʻ0.MTH5382(s13)) {
                                linkedHashMap0.put(CLS27.MTH889((z2 ? "unban" : "invite_member")), "unban");
                            }
                            if(!z2) {
                                linkedHashMap0.put(CLS27.MTH889("add_blacklist"), "ban");
                            }
                            if(ﾞٴ4.MTH1339(s12, s13)) {
                                s14 = CLS27.MTH889("remove_chatroom_moderator");
                                s15 = "downgrade_mod";
                            }
                            else {
                                s14 = CLS27.MTH889("add_chatroom_moderator");
                                s15 = "upgrade_mod";
                            }
                            linkedHashMap0.put(s14, s15);
                            if(ᴵʽ0.FLD1445.MTH938(s12 + "_whitelist_enable", false)) {
                                if(ﾞٴ4.MTH1337(s12, s13)) {
                                    s16 = CLS27.MTH889("remove_whitelist");
                                    s17 = "remove_whitelist";
                                }
                                else {
                                    s16 = CLS27.MTH889("add_whitelist");
                                    s17 = "add_whitelist";
                                }
                                linkedHashMap0.put(s16, s17);
                            }
                            if(ﾞٴ4.MTH1307(s13)) {
                                s18 = CLS27.MTH889("remove_permaban");
                                s19 = "remove_permaban";
                            }
                            else {
                                s18 = CLS27.MTH889("add_permaban");
                                s19 = "add_permaban";
                            }
                            linkedHashMap0.put(s18, s19);
                            if(!linkedHashMap0.isEmpty()) {
                                CLS523.MTH7159(((CLS140)ᴵʽ0).MTH3042(), null, linkedHashMap0, ((CLS7)new CLS1246(ᴵʽ0, ﾞٴ4, s12, s13, z2)));
                                return;
                            }
                            break;
                        }
                        case "send_mod_cmd": {
                            Activity activity0 = ((CLS140)ᴵʽ0).MTH3042();
                            CLS523.MTH7145(activity0, CLS27.MTH889("send_mod_cmd"), ((CLS17)new CLS1049(activity0, s12, s13, 23)), null);
                            return;
                        }
                        default: {
                            return;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 6: {
                ᴵʽ0.getClass();
                switch(((String)arr_object[0])) {
                    case "config_chatroomtag": {
                        CLS403.MTH5872(false, ((CLS140)ᴵʽ0).MTH3042(), new ArrayList(), null);
                        return;
                    }
                    case "mass_announce_shortcut": {
                        ArrayList arrayList0 = new ArrayList();
                        boolean z3 = ᴵʽ0.FLD1445.MTH938("mod_cmd_enable", false);
                        CLS371 ʻ1 = ᴵʽ0.FLD1444;
                        if(z3) {
                            ʻ1.MTH5313(CLS27.MTH904(), arrayList0);
                        }
                        else {
                            ʻ1.MTH5365(CLS27.MTH904(), arrayList0);
                        }
                        if(!arrayList0.isEmpty()) {
                            for(Object object4: arrayList0) {
                                ((CLS78)object4).FLD275 = " (" + CLS371.FLD3470.MTH5369("") + ")";
                            }
                            CLS523.MTH7165(((CLS140)ᴵʽ0).MTH3042(), CLS27.MTH889("mass_announce"), "", "", 1, ((CLS16)new CLS1255(ᴵʽ0, arrayList0, 15)));
                            return;
                        }
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            case 7: {
                ᴵʽ0.getClass();
                if(CLS27.MTH895().MTH927((CLS412.MTH6002() ? 3 : 0), "scan_zombie_method") != 0 || !CLS283.FLD2946.FLD2943) {
                    CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                    String s20 = (String)ᵔʾ0.MTH3204()[0];
                    if(CLS27.MTH904().equals(ᴵʽ0.FLD1444.MTH5343(s20))) {
                        for(Object object5: ((List)ᵔʾ0.MTH3204()[1])) {
                            String s21 = (String)object5;
                            if(CLS794.MTH2698().MTH1304(s20, s21)) {
                                CLS794.MTH2698().MTH1315(s20, s21);
                            }
                        }
                    }
                }
                return;
            }
            case 8: {
                ᴵʽ0.getClass();
                String s22 = (String)arr_object[0];
                String s23 = (String)arr_object[1];
                switch(s22) {
                    case "at_multi": {
                        ᴵʽ0.MTH2695(s23);
                        return;
                    }
                    case "chatroom_management": {
                        CLS21.FLD76.MTH818("showChatroomManagementDialog", new Object[]{s23});
                        return;
                    }
                    case "chatroom_tags": {
                        CLS403.MTH5872(false, ((CLS140)ᴵʽ0).MTH3042(), new ArrayList(), null);
                        return;
                    }
                    case "invite_member": {
                        CLS426.MTH6117(s23);
                        return;
                    }
                    case "pat_all": {
                        ArrayList arrayList1 = new ArrayList();
                        ᴵʽ0.FLD1444.MTH5349(s23, arrayList1);
                        CLS387.MTH5585(false, ((CLS140)ᴵʽ0).MTH3042(), arrayList1, ((CLS2)new CLS706(ᴵʽ0, s23)), "", -1);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            case 9: {
                ᴵʽ0.getClass();
                String s24 = (String)arr_object[0];
                String s25 = (String)arr_object[1];
                switch(s24) {
                    case "add_to_chatroom_tags": {
                        CLS403.MTH5866(((CLS140)ᴵʽ0).MTH3042(), s25);
                        return;
                    }
                    case "chatroom_friend_req": {
                        if(!CLS412.MTH6002() && !CLS27.MTH895().MTH938("add_contacts_warn_disable", false)) {
                            CLS395.MTH5745(((CLS140)ᴵʽ0).MTH3042(), ((CLS11)new CLS744(ᴵʽ0, s25)), CLS27.MTH889("add_contacts_disclaimer"), "add_contacts_warn_disable");
                            return;
                        }
                        CLS387.MTH5591(((CLS140)ᴵʽ0).MTH3042(), s25);
                        return;
                    }
                    case "copy_chatroomid": {
                        CLS412.MTH6014(((CLS140)ᴵʽ0).MTH3042(), String.format(CLS27.MTH889("view_copy_id"), s25));
                        CLS412.MTH6017(((CLS140)ᴵʽ0).MTH3042(), s25);
                        return;
                    }
                    case "memberslist": {
                        Activity activity1 = ((CLS140)ᴵʽ0).MTH3042();
                        CLS371 ʻ2 = CLS371.FLD3470;
                        ʻ2.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        String s28 = ʻ2.MTH5335(s25);
                        if(!TextUtils.isEmpty(s28)) {
                            String[] arr_s = CLS502.MTH6941(s28);
                            HashMap hashMap1 = CLS66.MTH1400(s25, Arrays.asList(arr_s), false);
                            String s29 = ʻ2.MTH5343(s25);
                            Object object6 = CLS66.MTH1505(s25);
                            int v10 = 0;
                            while(v10 < arr_s.length) {
                                String s30 = arr_s[v10];
                                if(!TextUtils.isEmpty(s30)) {
                                    String s31 = (String)hashMap1.get(s30);
                                    String s32 = ʻ2.MTH5311(s30);
                                    if(TextUtils.isEmpty(s31)) {
                                        s31 = s32;
                                    }
                                    if(!s32.equals(s31)) {
                                        s31 = CLS34.MTH1079(0x38EAB9982B3CD335L, CLS182.MTH3483(s31), s32, 4101294486770733877L);
                                    }
                                    boolean z4 = s30.equals(s29);
                                    String s33 = CLS34.MTH1079(4101294495360668469L, new StringBuilder(), s31, 4101294512540537653L);
                                    if(z4) {
                                        StringBuilder stringBuilder0 = CLS182.MTH3483(s33);
                                        stringBuilder0.append("<br><i>");
                                        stringBuilder0.append(CLS27.MTH889("chatroom_owner"));
                                        stringBuilder0.append("</i>");
                                        s33 = stringBuilder0.toString();
                                    }
                                    else if(CLS66.MTH1405(object6, s30)) {
                                        StringBuilder stringBuilder1 = CLS182.MTH3483(s33);
                                        stringBuilder1.append("<br><i>");
                                        stringBuilder1.append(CLS27.MTH889("chatroom_moderator"));
                                        stringBuilder1.append("</i>");
                                        s33 = stringBuilder1.toString();
                                        z5 = true;
                                        goto label_261;
                                    }
                                    z5 = false;
                                label_261:
                                    ContentValues contentValues1 = new ContentValues();
                                    contentValues1.put("nickname", s31);
                                    contentValues1.put("desc", s33);
                                    contentValues1.put("wxid", s30);
                                    contentValues1.put("name", ʻ2.MTH5304(s30));
                                    String s34 = ʻ2.MTH5323(s30);
                                    if(!TextUtils.isEmpty(s34)) {
                                        contentValues1.put("remark", s34);
                                    }
                                    if(!TextUtils.isEmpty(((String)hashMap1.get(s30)))) {
                                        contentValues1.put("nicknameInChatroom", s31);
                                    }
                                    contentValues1.put("isOwner", Boolean.valueOf(z4));
                                    contentValues1.put("isMod", Boolean.valueOf(z5));
                                    arrayList3.add(contentValues1);
                                }
                                ++v10;
                            }
                        }
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(CLS371.FLD3470.MTH5316(s25));
                        stringBuilder2.append(" (");
                        stringBuilder2.append(arrayList3.size());
                        CLS523.MTH7150(activity1, CLS182.MTH3475(4101201913045635893L, stringBuilder2), ((CLS17)new CLS1580(activity1, s25, arrayList3, 0)));
                        return;
                    }
                    case "room_management": {
                        CLS21.FLD76.MTH818("showChatroomManagementDialog", new Object[]{s25});
                        return;
                    }
                    case "send_invites": {
                        ArrayList arrayList2 = new ArrayList();
                        String s26 = CLS27.MTH904();
                        ᴵʽ0.FLD1444.MTH5381(s26, arrayList2);
                        String s27 = ᴵʽ0.FLD1444.MTH5335(s25);
                        Iterator iterator4 = arrayList2.iterator();
                        while(iterator4.hasNext()) {
                            iterator4.next();
                            if(CLS502.MTH6934(s27, new String[]{""})) {
                                iterator4.remove();
                            }
                        }
                        CLS387.MTH5585(false, ((CLS140)ᴵʽ0).MTH3042(), arrayList2, ((CLS2)new CLS647(ᴵʽ0, s25)), null, -1);
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            case 10: {
                ᴵʽ0.getClass();
                String s35 = (String)arr_object[0];
                String s36 = (String)arr_object[1];
                if(s35.equals("chatcontainer")) {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(s36);
                    CLS403.MTH5870(((CLS140)ᴵʽ0).MTH3042(), arrayList4, null, null, false);
                    return;
                }
                if(s35.startsWith("chatcontainer_actions")) {
                    ArrayList arrayList5 = new ArrayList(Arrays.asList(s35.substring(s35.indexOf("#") + 1).split(",")));
                    CLS568 יᐧ0 = new CLS568(ᴵʽ0, s36, 3);
                    if(arrayList5.size() > 1) {
                        CLS523.MTH7163(false, ((CLS140)ᴵʽ0).MTH3042(), CLS27.MTH889("chatcontainer"), arrayList5, ((CLS7)new CLS576(((CLS12)יᐧ0), 6)));
                        return;
                    }
                    יᐧ0.MTH791(arrayList5.get(0));
                }
                return;
            }
            case 11: {
                ᴵʽ0.getClass();
                if(ᴵʽ0.FLD1445.MTH938("chatroom_container", false) || ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false)) {
                    CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                    ᴵʽ0.FLD1149 = ᵔʾ1.MTH3205();
                    Activity activity2 = ((CLS140)ᴵʽ0).MTH3042();
                    if(activity2 != null) {
                        Intent intent0 = activity2.getIntent();
                        if(intent0.hasExtra("Contact_User")) {
                            String s37 = intent0.getStringExtra("Contact_User");
                            if(!"conversationboxservice".equals(s37)) {
                                String s38 = s37.substring(3);
                                CLS79 ˎᵢ0 = ᴵʽ0.FLD1147;
                                String s39 = ˎᵢ0.MTH1625(s37);
                                if("_GH_".equals(s38)) {
                                    s39 = CLS27.MTH889("public_accounts");
                                }
                                CLS844 ⁱˉ0 = new CLS844(ᴵʽ0, 0);
                                CLS841 ⁱʽ0 = new CLS841(ᴵʽ0, s37, 2);
                                CLS40.FLD157.MTH1123(((CLS39)ⁱʽ0), 2000L);
                                CLS166.MTH3195(ᵔʾ1.MTH3205(), "setMMTitle", new Object[]{s39 + " (" + ˎᵢ0.MTH1634(s37).size() + ")"});
                                CLS166.MTH3195(ᵔʾ1.MTH3205(), CLS27.MTH897("addTextOptionMenu"), new Object[]{1000, CLS27.MTH889("menu"), new CLS128(ᴵʽ0, activity2, s39, s37, ⁱˉ0, s38)});
                            }
                        }
                    }
                }
                return;
            }
            case 12: {
                this.MTH3068(arr_object);
                return;
            }
            case 13: {
                this.MTH3066(arr_object);
                return;
            }
            case 14: {
                ᴵʽ0.getClass();
                if((ᴵʽ0.FLD1445.MTH938("chatroom_container", false) || ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false)) && ᴵʽ0.FLD1149 != null) {
                    Activity activity3 = ((CLS140)ᴵʽ0).MTH3042();
                    if(activity3 != null) {
                        Intent intent1 = activity3.getIntent();
                        if(intent1.hasExtra("Contact_User")) {
                            String s40 = intent1.getStringExtra("Contact_User");
                            if(!"conversationboxservice".equals(s40)) {
                                Object object7 = arr_object[0];
                                try {
                                    Field field0 = object7.getClass().getDeclaredField("args");
                                    object8 = null;
                                    if(field0 != null) {
                                        field0.setAccessible(true);
                                        object8 = field0.get(object7);
                                    }
                                }
                                catch(Throwable unused_ex) {
                                }
                                MenuItem menuItem0 = (MenuItem)((Object[])object8)[0];
                                String s41 = (String)CLS182.MTH3492(0x38EC80662B3CD335L, ᴵʽ0.FLD1149);
                                CLS844 ⁱˉ1 = new CLS844(ᴵʽ0, 1);
                                switch(menuItem0.getItemId()) {
                                    case 2001: {
                                        CLS21.FLD76.MTH818("showBlacklistAddMemberDialog", new Object[]{s41, null});
                                        return;
                                    }
                                    case 2002: {
                                        CLS403.MTH5866(activity3, s41);
                                        return;
                                    }
                                    case 2003: {
                                        CLS404.MTH5895(activity3, s41);
                                        return;
                                    }
                                    case 2004: {
                                        CLS523.MTH7142(activity3, ((CLS11)new CLS840(ᴵʽ0, s41, s40, ⁱˉ1)));
                                        return;
                                    }
                                    case 2005: {
                                        ᴵʽ0.FLD1147.MTH1620(s40, s41);
                                        ⁱˉ1.MTH774();
                                        ArrayList arrayList6 = ᴵʽ0.FLD1147.MTH1634(s40);
                                        ArrayList arrayList7 = new ArrayList();
                                        Iterator iterator5 = arrayList6.iterator();
                                        while(iterator5.hasNext()) {
                                            iterator5.next();
                                            arrayList7.add("");
                                        }
                                        CLS404.MTH5896(s40, arrayList7, arrayList6);
                                        return;
                                    }
                                    case 2006: {
                                        ArrayList arrayList8 = new ArrayList();
                                        arrayList8.add(s41);
                                        if(s40.startsWith("wx__c_")) {
                                            CLS403.MTH5870(activity3, arrayList8, s40, ((CLS12)new CLS566(ᴵʽ0, s40, arrayList8, ⁱˉ1, 1)), false);
                                            return;
                                        }
                                        CLS403.MTH5872(false, activity3, arrayList8, ((CLS12)new CLS648(ᴵʽ0, s40, arrayList8, 0)));
                                        return;
                                    }
                                    case 2007: {
                                        CLS404.MTH5903(s41);
                                        break;
                                    }
                                    case 2008: {
                                        CLS404.MTH5888(s41);
                                        break;
                                    }
                                    case 2009: {
                                        CLS426.MTH6117(s41);
                                        return;
                                    }
                                    case 2010: {
                                        String s42 = CLS371.FLD3470.MTH5323(s41);
                                        CLS523.MTH7165(activity3, CLS27.MTH889("remark"), "", s42, 1, ((CLS16)new CLS883(s42, s41, ((CLS3)ⁱˉ1))));
                                        return;
                                    }
                                    case 2011: {
                                        CLS372.MTH5412(s41, !CLS372.MTH5396(s41));
                                        break;
                                    }
                                    case 2012: {
                                        CLS66.MTH1368(s41, !CLS66.MTH1392(s41));
                                        return;
                                    }
                                    default: {
                                        return;
                                    }
                                }
                                CLS66.MTH1447(s41);
                                ⁱˉ1.MTH774();
                                return;
                            }
                        }
                    }
                }
                return;
            }
            case 15: {
                this.MTH3069(arr_object);
                return;
            }
            case 16: {
                this.MTH3064(arr_object);
                return;
            }
            case 17: {
                this.MTH3072(arr_object);
                return;
            }
            case 18: {
                this.MTH3071(arr_object);
                return;
            }
            case 19: {
                this.MTH3059(arr_object);
                return;
            }
            case 20: {
                ᴵʽ0.getClass();
                if(ᴵʽ0.FLD1445.MTH938("chatroom_container", false) || ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false)) {
                    ᴵʽ0.FLD1147.MTH1617();
                }
                return;
            }
            case 21: {
                this.MTH3060(arr_object);
                return;
            }
            case 22: {
                this.MTH3058(arr_object);
                return;
            }
            case 23: {
                this.MTH3062(arr_object);
                return;
            }
            case 24: {
                this.MTH3067(arr_object);
                return;
            }
            case 25: {
                this.MTH3065(arr_object);
                return;
            }
            case 26: {
                this.MTH3070(arr_object);
                return;
            }
            default: {
                this.MTH3063(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH3062(Object[] arr_object) {
        Object object1;
        CLS794 ᴵʽ0 = this.FLD1467;
        ᴵʽ0.getClass();
        Object object0 = arr_object[0];
        if(ᴵʽ0.FLD1159 == null) {
            try {
                Field field0 = object0.getClass().getDeclaredField("thisObject");
                object1 = null;
                if(field0 != null) {
                    field0.setAccessible(true);
                    object1 = field0.get(object0);
                }
            }
            catch(Throwable unused_ex) {
            }
            Object object2 = CLS164.MTH3175(object1, CLS27.MTH897("ConversationAdapterClass"));
            if(object2 != null) {
                ᴵʽ0.FLD1159 = object2;
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH3063(Object[] arr_object) {
        CLS794 ᴵʽ0 = this.FLD1467;
        ᴵʽ0.getClass();
        if(ᴵʽ0.FLD1445.MTH938("chatroom_container", false) || ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false)) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            Object object0 = ᵔʾ0.MTH3204()[0];
            String s = (String)CLS182.MTH3492((CLS27.MTH890("ConversationAdapterClass3_displayNameField") ? 4101804896389223221L : 4101805081072816949L), object0);
            if(CLS404.MTH5909(s)) {
                CLS166.MTH3198(ᵔʾ0.MTH3204()[0], CLS27.MTH897("ConversationAdapterClass3_field1"), ᴵʽ0.FLD1147.MTH1625(s));
                ᵔʾ0.MTH3207(null);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH3064(Object[] arr_object) {
        CLS794 ᴵʽ0 = this.FLD1467;
        ᴵʽ0.getClass();
        ContentValues contentValues0 = (ContentValues)arr_object[1];
        Object object0 = arr_object[0];
        ᴵʽ0.MTH2705(contentValues0);
        if(!CLS412.MTH6002()) {
            ᴵʽ0.MTH2696(contentValues0);
        }
        if(ᴵʽ0.MTH2682(contentValues0)) {
            try {
                Method method0 = object0.getClass().getDeclaredMethod("setResult", Object.class);
                method0.setAccessible(true);
                method0.invoke(object0, -1L);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH3065(Object[] arr_object) {
        CLS794 ᴵʽ0 = this.FLD1467;
        ᴵʽ0.getClass();
        if(ᴵʽ0.FLD1445.MTH938("chatroom_container", false) || ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false)) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            String s = (String)ᵔʾ0.MTH3204()[0];
            Activity activity0 = ((CLS140)ᴵʽ0).MTH3042();
            CLS79 ˎᵢ0 = ᴵʽ0.FLD1147;
            ˎᵢ0.getClass();
            try {
                if(!TextUtils.isEmpty(s) && CLS404.MTH5909(s)) {
                    String s1 = ˎᵢ0.MTH1624();
                    if(!TextUtils.isEmpty(s1) && CLS502.MTH6934(s1, new String[]{s})) {
                        if(ˎᵢ0.MTH1639()) {
                            ˎᵢ0.MTH1630(activity0, s);
                        }
                        else {
                            ˎᵢ0.MTH1640(activity0, s);
                        }
                        ᵔʾ0.MTH3207(null);
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    private final void MTH3066(Object[] arr_object) {
        int v;
        String s2;
        Object object1;
        CLS794 ᴵʽ0 = this.FLD1467;
        ᴵʽ0.getClass();
        if((ᴵʽ0.FLD1445.MTH938("chatroom_container", false) || ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false)) && ᴵʽ0.FLD1149 != null) {
            Activity activity0 = ((CLS140)ᴵʽ0).MTH3042();
            if(activity0 != null) {
                Intent intent0 = activity0.getIntent();
                if(intent0.hasExtra("Contact_User")) {
                    String s = intent0.getStringExtra("Contact_User");
                    if(!"conversationboxservice".equals(s)) {
                        Object object0 = arr_object[0];
                        try {
                            Field field0 = object0.getClass().getDeclaredField("args");
                            object1 = null;
                            if(field0 != null) {
                                field0.setAccessible(true);
                                object1 = field0.get(object0);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        ContextMenu contextMenu0 = (ContextMenu)((Object[])object1)[0];
                        String s1 = (String)CLS182.MTH3492(0x38EC80B52B3CD335L, ᴵʽ0.FLD1149);
                        if(!CLS404.MTH5909(s1)) {
                            if(CLS27.MTH895().MTH938("blacklist_enable", CLS412.MTH6002())) {
                                contextMenu0.add(0, 2001, 0, CLS27.MTH889("auto_block_chat"));
                            }
                            if(CLS426.MTH6126(s1) && CLS27.MTH895().MTH938("chatroom_tags", false)) {
                                contextMenu0.add(0, 2002, 0, CLS27.MTH889("add_to_chatroom_tags"));
                            }
                            if(CLS27.MTH895().MTH938("moments_shortcut", CLS412.MTH6002()) && !CLS372.MTH5410(s1) && !CLS426.MTH6126(s1) && !CLS372.MTH5400(s1) && !CLS404.MTH5909(s1)) {
                                contextMenu0.add(0, 2003, 0, CLS27.MTH889("moments"));
                            }
                            if(CLS27.MTH895().MTH938("delete_contact_shortcut", false) && !CLS372.MTH5410(s1) && !CLS372.MTH5400(s1) && !CLS404.MTH5909(s1)) {
                                contextMenu0.add(0, 2004, 0, CLS27.MTH889(CLS370.MTH5289((CLS426.MTH6126(s1) ? 4101796040166658869L : 4101796104591168309L))));
                            }
                            if(CLS27.MTH902("invite_member_shortcut") && CLS27.MTH895().MTH938("invite_member_shortcut_enable", CLS27.MTH895().MTH938("room_manangement_enable", CLS412.MTH6002())) && !CLS426.MTH6126(s1) && !CLS372.MTH5400(s1) && !CLS372.MTH5410(s1) && !CLS372.MTH5406(s1) && !s1.equals(CLS27.MTH904())) {
                                contextMenu0.add(0, 2009, 0, CLS27.MTH889("invite_member"));
                            }
                            if(CLS27.MTH895().MTH938("remark_contact_shortcut", CLS412.MTH6002()) && !CLS372.MTH5410(s1) && !CLS372.MTH5400(s1) && !CLS426.MTH6126(s1)) {
                                contextMenu0.add(0, 2010, 0, CLS27.MTH889("remark"));
                            }
                            if(CLS27.MTH895().MTH938("mute_shortcut", false) && !CLS372.MTH5410(s1) && !CLS372.MTH5400(s1)) {
                                contextMenu0.add(0, 2011, 0, CLS27.MTH889(CLS370.MTH5289((CLS372.MTH5396(s1) ? 4101809951565730613L : 4101809981630501685L))));
                            }
                            if(CLS27.MTH895().MTH938("set_star_contact_shortcut", false) && !CLS372.MTH5410(s1) && !CLS372.MTH5400(s1)) {
                                contextMenu0.add(0, 2012, 0, CLS27.MTH889(CLS370.MTH5289((CLS66.MTH1392(s1) ? 4101809565018673973L : 4101809646623052597L))));
                            }
                        }
                        if(s.startsWith("wx__c_")) {
                            contextMenu0.add(0, 2005, 0, CLS27.MTH889("move_out"));
                        }
                        if(!CLS404.MTH5909(s1) || s.startsWith("wx__c_")) {
                            contextMenu0.add(0, 2006, 0, CLS27.MTH889("move_to"));
                        }
                        if(!CLS404.MTH5909(s1)) {
                            if(CLS66.MTH1364(s1)) {
                                s2 = CLS27.MTH889("remove_sticky_top");
                                v = 2007;
                            }
                            else {
                                s2 = CLS27.MTH889("sticky_top");
                                v = 2008;
                            }
                            contextMenu0.add(0, v, 0, s2);
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH3067(Object[] arr_object) {
        String s4;
        StringBuilder stringBuilder0;
        CLS794 ᴵʽ0 = this.FLD1467;
        ᴵʽ0.getClass();
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        if(ᴵʽ0.FLD1159 == null) {
            ᴵʽ0.FLD1159 = ᵔʾ0.MTH3205();
        }
        CLS79 ˎᵢ0 = ᴵʽ0.FLD1147;
        if(!ᴵʽ0.FLD1156) {
            ᴵʽ0.FLD1156 = true;
            ˎᵢ0.getClass();
            CLS583 ـﹳ0 = new CLS583(ˎᵢ0, 1);
            CLS40.FLD157.MTH1124(((CLS39)ـﹳ0));
        }
        View view0 = (View)ᵔʾ0.MTH3204()[1];
        int v = (int)(((Integer)ᵔʾ0.MTH3204()[0]));
        if(ᴵʽ0.FLD1445.MTH938("chatroom_container", false) || ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false)) {
            Object object0 = ᵔʾ0.MTH3205();
            ˎᵢ0.getClass();
            if(view0 != null) {
                try {
                    Object object1 = view0.getTag();
                    if(object1 != null) {
                        Object object2 = CLS166.MTH3195(object0, "getItem", new Object[]{v});
                        if(object2 != null) {
                            String s = (String)CLS166.MTH3194(object2, "field_username");
                            String s1 = ˎᵢ0.MTH1624();
                            if(!TextUtils.isEmpty(s1) && CLS502.MTH6934(s1, new String[]{s})) {
                                Object object3 = CLS166.MTH3194(object1, CLS27.MTH897("convContenViewField"));
                                Object object4 = CLS166.MTH3194(object1, CLS27.MTH897("convNameViewField"));
                                TextView textView0 = (TextView)CLS166.MTH3194(object1, CLS27.MTH897("convUnreadViewField"));
                                JSONObject jSONObject0 = ˎᵢ0.MTH1650(s);
                                String s2 = jSONObject0.optString("username");
                                int v1 = jSONObject0.optInt("unreadCount");
                                int v2 = jSONObject0.optInt("unread");
                                if(v1 <= 0 || !ˎᵢ0.MTH1643().MTH938("wx_container_show_unread_" + s, true)) {
                                    textView0.setVisibility(8);
                                }
                                else {
                                    textView0.setVisibility(0);
                                    textView0.setText((v1 <= 99 ? String.valueOf(v1) : "..."));
                                }
                                boolean z = ˎᵢ0.MTH1643().MTH938("show_preview_" + s, false);
                                CLS371 ʻ0 = ˎᵢ0.FLD280;
                                if(z) {
                                    if(!TextUtils.isEmpty(s2)) {
                                        if(s.startsWith("wx__c_")) {
                                            stringBuilder0 = new StringBuilder();
                                            stringBuilder0.append(ʻ0.MTH5311(s2));
                                            s4 = ": ";
                                        }
                                        else if(CLS426.MTH6126(s2)) {
                                            stringBuilder0 = new StringBuilder();
                                            s4 = "";
                                        }
                                        else {
                                            stringBuilder0 = new StringBuilder();
                                            stringBuilder0.append(ʻ0.MTH5311(s2));
                                            s4 = ": ";
                                        }
                                        stringBuilder0.append(s4);
                                        stringBuilder0.append(ˎᵢ0.MTH1642(ˎᵢ0.MTH1652(s2)));
                                        CLS166.MTH3195(object3, "setText", new Object[]{stringBuilder0.toString()});
                                    }
                                }
                                else if(v2 > 0) {
                                    String s3 = CLS27.MTH889((s.equals("wx__GH_") ? "unread_public" : "unread_chatrooms"));
                                    if(!s.startsWith("wx__c_")) {
                                        CLS166.MTH3195(object3, "setText", new Object[]{String.format(s3, v2)});
                                    }
                                    else if(TextUtils.isEmpty(s2)) {
                                        CLS166.MTH3195(object3, "setText", new Object[]{String.format(CLS27.MTH889("unread_chat"), v2)});
                                    }
                                    else {
                                        CLS166.MTH3195(object3, "setText", new Object[]{ʻ0.MTH5311(s2) + ": " + ˎᵢ0.MTH1642(ˎᵢ0.MTH1652(s2))});
                                    }
                                }
                                else {
                                    CLS166.MTH3195(object3, "setText", new Object[]{""});
                                }
                                CLS166.MTH3195(object4, "setText", new Object[]{ˎᵢ0.MTH1625(s)});
                            }
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        Object[] arr_object1 = {ᵔʾ0.MTH3205(), v, view0, ᵔʾ0.FLD1585};
        CLS21.FLD76.MTH817("themes", "onGetViewConversationAdapter", arr_object1);
    }

    // 此方法包含解密的字符串
    private final void MTH3068(Object[] arr_object) {
        CLS794 ᴵʽ0 = this.FLD1467;
        ᴵʽ0.getClass();
        if(ᴵʽ0.FLD1445.MTH938("chatroom_container", false) || ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false)) {
            CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
            Activity activity0 = ((CLS140)ᴵʽ0).MTH3042();
            if(activity0 != null) {
                Intent intent0 = activity0.getIntent();
                if(intent0.hasExtra("Contact_User")) {
                    String s = intent0.getStringExtra("Contact_User");
                    if(!"conversationboxservice".equals(s)) {
                        ᵔʾ0.MTH3207(null);
                        ArrayList arrayList0 = ᴵʽ0.FLD1147.MTH1634(s);
                        ArrayList arrayList1 = new ArrayList();
                        Iterator iterator0 = arrayList0.iterator();
                        while(iterator0.hasNext()) {
                            iterator0.next();
                            if(!CLS371.FLD3470.MTH5358("")) {
                                CLS404.MTH5898("", 0L, CLS66.MTH1364(""));
                            }
                        }
                        Cursor cursor0 = CLS371.FLD3470.MTH5345(arrayList0, true);
                        if(cursor0 != null) {
                            if(cursor0.getCount() != arrayList0.size()) {
                                HashSet hashSet0 = new HashSet();
                                if(cursor0.moveToFirst()) {
                                    while(true) {
                                        hashSet0.add(cursor0.getString(cursor0.getColumnIndex("username")));
                                        if(!cursor0.moveToNext()) {
                                            break;
                                        }
                                    }
                                }
                                if(!cursor0.isClosed()) {
                                    cursor0.close();
                                }
                                Iterator iterator1 = arrayList0.iterator();
                                while(iterator1.hasNext()) {
                                    Object object0 = iterator1.next();
                                    CLS78 ˊﾞ0 = (CLS78)object0;
                                    if(!hashSet0.contains("")) {
                                        arrayList1.add(ˊﾞ0);
                                        iterator1.remove();
                                    }
                                }
                                CLS371 ʻ0 = CLS371.FLD3470;
                                ʻ0.getClass();
                                HashSet hashSet1 = new HashSet();
                                if(!arrayList0.isEmpty()) {
                                    for(int v = 0; v < arrayList0.size(); ++v) {
                                        if(((CLS78)arrayList0.get(v)) != null && !CLS404.MTH5909("")) {
                                            hashSet1.add("");
                                        }
                                    }
                                }
                                StringBuilder stringBuilder0 = hashSet1.isEmpty() ? new StringBuilder("select * from rconversation where username = \'\'") : new StringBuilder("select * from rconversation where username in (\'" + TextUtils.join("\',\'", hashSet1) + "\')");
                                if(!arrayList1.isEmpty()) {
                                    Iterator iterator2 = arrayList1.iterator();
                                    while(iterator2.hasNext()) {
                                        iterator2.next();
                                        stringBuilder0.append(" or username like \'");
                                        stringBuilder0.append("");
                                        stringBuilder0.append("\'");
                                    }
                                }
                                stringBuilder0.append(" order by flag desc");
                                cursor0 = ʻ0.MTH5307(stringBuilder0.toString(), null);
                            }
                            CLS166.MTH3195(ᵔʾ0.MTH3205(), CLS27.MTH897("ConvBoxSetCursorMethod"), new Object[]{cursor0});
                            CLS166.MTH3195(ᵔʾ0.MTH3205(), "notifyDataSetChanged", new Object[0]);
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH3069(Object[] arr_object) {
        String s2;
        CLS794 ᴵʽ0 = this.FLD1467;
        ᴵʽ0.getClass();
        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
        ContentValues contentValues0 = (ContentValues)arr_object[1];
        int v = contentValues0.containsKey("isSend") ? CLS182.MTH3474(0x38ECCABA2B3CD335L, contentValues0) : 0;
        if(contentValues0.containsKey("talker")) {
            String s = contentValues0.getAsString("talker");
            if(CLS426.MTH6126(s)) {
                CLS29 ˎᵢ0 = ᴵʽ0.FLD1445;
                if(!s.equals(ˎᵢ0.MTH925("zombie_check_chatroom", "")) && contentValues0.containsKey("type")) {
                    int v1 = CLS182.MTH3474(4101877021775024949L, contentValues0);
                    String s1 = contentValues0.getAsString("content");
                    if(v1 != 1 || !CLS426.MTH6129(s1)) {
                    label_44:
                        if(v != 1) {
                            CLS61 ﾞٴ0 = CLS794.MTH2698();
                            String s5 = CLS426.MTH6109(s1);
                            if(!CLS426.MTH6128(s)) {
                                if(v1 == 1 || v1 == 0x1000031) {
                                    if(v1 == 0x1000031) {
                                        HashMap hashMap0 = CLS392.MTH5633(s1, "msg");
                                        if(hashMap0.containsKey(".msg.appmsg.content")) {
                                            s1 = (String)hashMap0.get(".msg.appmsg.content");
                                        }
                                    }
                                    if(!TextUtils.isEmpty(s1)) {
                                        String s6 = CLS426.MTH6106(v, s1, s);
                                        if(v1 == 0x1000031 && (s6.startsWith("#b") || s6.startsWith("#ub") || s6.startsWith("#w") || s6.startsWith("#uw") || s6.startsWith("#um") || s6.startsWith("#dm") || s6.startsWith("#pb") || s6.startsWith("#upb"))) {
                                            ᵔʾ0.MTH3207(-1L);
                                            return;
                                        }
                                        if(v1 == 0x1000031 && s6.startsWith("#!") && s6.endsWith("!#") && CLS27.MTH904().equals(s5)) {
                                            String s7 = s6.substring(2, s6.length() - 2);
                                            String s8 = CLS426.MTH6109(s7);
                                            if(!TextUtils.isEmpty(s8) && !CLS27.MTH904().equals(s8)) {
                                                ᵔʾ0.MTH3207(-1L);
                                            }
                                            contentValues0.put("content", CLS426.MTH6106(v, s7, s));
                                            contentValues0.put("type", 10000);
                                        }
                                    }
                                }
                            }
                            else if(ˎᵢ0.MTH938("room_manangement_enable", false)) {
                                CLS765 ـﹳ0 = new CLS765(ᴵʽ0, contentValues0, s, s5, ﾞٴ0, v1, s1, v);
                                CLS40.FLD157.MTH1124(((CLS39)ـﹳ0));
                            }
                        }
                    }
                    else {
                        if(CLS502.MTH6934(s1, new String[]{"￀"})) {
                            s2 = CLS370.MTH5289(4101877086199534389L);
                        }
                        else {
                            s2 = CLS502.MTH6934(s1, new String[]{" "}) ? CLS370.MTH5289(4101877103379403573L) : null;
                        }
                        if(TextUtils.isEmpty(s2)) {
                            goto label_44;
                        }
                        else {
                            String[] arr_s = s1.split(s2);
                            int v2 = arr_s[arr_s.length - 1].startsWith("@") ? arr_s.length : arr_s.length - 1;
                            if(v2 <= 2 || v2 != CLS502.MTH6941(ᴵʽ0.FLD1444.MTH5335(s)).length - 1) {
                                goto label_44;
                            }
                            else {
                                for(int v3 = 1; v3 < v2; ++v3) {
                                    if(!arr_s[v3].startsWith("@")) {
                                        return;
                                    }
                                }
                                String s3 = s1.substring(s1.lastIndexOf(s2) + 1);
                                StringBuilder stringBuilder0 = new StringBuilder();
                                stringBuilder0.append(s1.substring(0, s1.indexOf("@") + 1));
                                stringBuilder0.append(CLS27.MTH889("all"));
                                stringBuilder0.append(s2);
                                stringBuilder0.append("\n");
                                if(CLS502.MTH6934(s3, new String[]{"@"})) {
                                    s3 = "";
                                }
                                stringBuilder0.append(s3);
                                String s4 = stringBuilder0.toString();
                                if(v == 0) {
                                    contentValues0.put("content", s4);
                                    return;
                                }
                                ContentValues contentValues1 = new ContentValues(contentValues0);
                                contentValues1.put("content", s4);
                                Long long0 = contentValues0.getAsLong("msgId");
                                ᴵʽ0.FLD1161.put(long0, contentValues1);
                            }
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH3070(Object[] arr_object) {
        CLS794 ᴵʽ0 = this.FLD1467;
        ᴵʽ0.getClass();
        boolean z = ᴵʽ0.FLD1445.MTH938("chatroom_container", false);
        boolean z1 = ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false);
        boolean z2 = ᴵʽ0.FLD1445.MTH938("hc_show_count", false);
        if(!z && !z1 && !z2) {
            CLS21.FLD76.MTH817("themes", "onSetUnreadMainTab", new Object[]{arr_object[0]});
            return;
        }
        Object object0 = arr_object[0];
        HashSet hashSet0 = new HashSet();
        if(CLS500.FLD4928.MTH6896(2) && !z2) {
            Set set0 = (Set)CLS21.FLD76.MTH836("getHiddenUserNames", new Object[0]);
            if(set0 != null && !set0.isEmpty()) {
                hashSet0.addAll(set0);
            }
        }
        HashSet hashSet1 = new HashSet();
        if(z1 && CLS27.MTH895().MTH938("chatcontainer_unread_disable", false)) {
            hashSet1.addAll(ᴵʽ0.FLD1147.MTH1616());
        }
        CLS371 ʻ0 = ᴵʽ0.FLD1444;
        ʻ0.getClass();
        ArrayList arrayList0 = new ArrayList();
        String s = "select rconversation.unReadCount, rconversation.username from rconversation, rcontact where ";
        if(!hashSet0.isEmpty()) {
            StringBuilder stringBuilder0 = CLS182.MTH3483("select rconversation.unReadCount, rconversation.username from rconversation, rcontact where ");
            stringBuilder0.append("rconversation.username not in (\'");
            stringBuilder0.append(TextUtils.join("\',\'", hashSet0));
            stringBuilder0.append("\') and");
            s = stringBuilder0.toString();
        }
        StringBuilder stringBuilder1 = CLS182.MTH3483(s);
        stringBuilder1.append(" rconversation.unReadCount > 0 AND rconversation.username = rcontact.username AND (rconversation.parentRef is null or parentRef = \'\' ) AND ( type & 512 ) == 0 AND rcontact.username != \'officialaccounts\'");
        Object object1 = null;
        Cursor cursor0 = ʻ0.MTH5307(stringBuilder1.toString(), null);
        if(cursor0 != null) {
            if(cursor0.moveToFirst()) {
                while(true) {
                    int v = CLS182.MTH3490(4101275288266920757L, cursor0);
                    String s1 = CLS182.MTH3472(4101275399936070453L, cursor0);
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put(CLS182.MTH3496(4101276048476132149L, contentValues0, s1, 4101276087130837813L), v);
                    arrayList0.add(contentValues0);
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
        }
        int v1 = 0;
        for(Object object2: arrayList0) {
            ContentValues contentValues1 = (ContentValues)object2;
            String s2 = contentValues1.getAsString("username");
            if(!"conversationboxservice".equals(s2) && !CLS372.MTH5396(s2) && !hashSet1.contains(s2)) {
                v1 += (int)contentValues1.getAsInteger("unReadCount");
            }
        }
        try {
            Field field0 = object0.getClass().getDeclaredField("args");
            if(field0 != null) {
                field0.setAccessible(true);
                object1 = field0.get(object0);
            }
        }
        catch(Throwable unused_ex) {
        }
        ((Object[])object1)[0] = v1;
        CLS21.FLD76.MTH817("themes", "onSetUnreadMainTab", new Object[]{arr_object[0]});
    }

    // 此方法包含解密的字符串
    private final void MTH3071(Object[] arr_object) {
        Object object1;
        CLS794 ᴵʽ0 = this.FLD1467;
        ᴵʽ0.getClass();
        Object object0 = arr_object[0];
        String s = (String)arr_object[2];
        ContentValues contentValues0 = (ContentValues)arr_object[3];
        ᴵʽ0.MTH2684(contentValues0, s);
        if(ᴵʽ0.FLD1445.MTH938("chatroom_container", false) || ᴵʽ0.FLD1445.MTH938("chatcontainer_enable", false)) {
            try {
                Field field0 = object0.getClass().getDeclaredField("args");
                object1 = null;
                if(field0 != null) {
                    field0.setAccessible(true);
                    object1 = field0.get(object0);
                }
            }
            catch(Throwable unused_ex) {
            }
            ᴵʽ0.FLD1147.MTH1647(s, contentValues0, ((String[])((Object[])object1)[3]));
        }
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    private final void MTH3072(Object[] arr_object) {
        CLS565 ˆʿ0;
        CLS40 ﾞᵎ0;
        CLS794 ᴵʽ0 = this.FLD1467;
        CLS139 ﹶʼ0 = ᴵʽ0.FLD1447;
        if(!ﹶʼ0.FLD1410) {
            String s = (String)arr_object[2];
            ContentValues contentValues0 = (ContentValues)arr_object[3];
            ᴵʽ0.MTH2684(contentValues0, s);
            ᴵʽ0.FLD1147.MTH1647(s, contentValues0, null);
            if("message".equalsIgnoreCase(s) && contentValues0 != null) {
                boolean z = contentValues0.containsKey("type");
                CLS29 ˎᵢ0 = ᴵʽ0.FLD1445;
                if((z || contentValues0.containsKey("content")) && contentValues0.containsKey("isSend") && CLS182.MTH3474(4101861448223609653L, contentValues0) != 1 && CLS182.MTH3474(4101861478288380725L, contentValues0) == 49 && ˎᵢ0.MTH938("auto_accept_chatroom_invite", false)) {
                    String s1 = contentValues0.getAsString("talker");
                    String s2 = ˎᵢ0.MTH925("auto_accept_chatroom_invite_config_include", "");
                    if(!TextUtils.isEmpty(s2)) {
                        if(CLS502.MTH6934(s2, new String[]{s1})) {
                        label_17:
                            if(ﹶʼ0.FLD1438.MTH6895("auto_accept_chatroom_invite") || ﹶʼ0.FLD1438.MTH6895("aa_chatroom_invite")) {
                                HashMap hashMap0 = CLS392.MTH5633(contentValues0.getAsString("content"), "msg");
                                if(hashMap0.containsKey(".msg.appmsg.type") && Integer.parseInt(((String)hashMap0.get(".msg.appmsg.type"))) == 5) {
                                    Object object0 = hashMap0.get(".msg.appmsg.url");
                                    if(CLS502.MTH6934(((String)object0), new String[]{"addchatroombyinvite", "addopenimchatroombyinvite"}) && (!CLS502.MTH6934(((String)object0), new String[]{"addopenimchatroombyinvite"}) || ˎᵢ0.MTH938("autojoin_openim_chatroom_enable", false))) {
                                        Object object1 = hashMap0.get(".msg.appmsg.thumburl");
                                        if(ˎᵢ0.MTH938("autojoinchatroom_delay_enable", false)) {
                                            int v = ˎᵢ0.MTH927(0, "autojoinchatroom_delay");
                                            if(v == 0) {
                                                CLS286.FLD2962.MTH4706(1, ((String)object0));
                                            }
                                            else if(CLS500.FLD4928.MTH6895("auto_accept_chatroom_invite") && ((long)v) > 60000) {
                                                CLS737 ˑٴ0 = new CLS737(((String)object1), ((String)object0), hashMap0, v, 0);
                                                CLS40.FLD157.MTH1124(((CLS39)ˑٴ0));
                                            }
                                            else {
                                                CLS1258 ⁱˏ0 = new CLS1258(4, ((String)object0));
                                                CLS40.FLD157.MTH1123(((CLS39)ⁱˏ0), ((long)v));
                                            }
                                        }
                                        else {
                                            CLS286.FLD2962.MTH4706(1, ((String)object0));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else if(CLS502.MTH6934(ˎᵢ0.MTH925("auto_accept_chatroom_invite_excl", ""), new String[]{s1})) {
                    }
                    else {
                        goto label_17;
                    }
                }
                if(CLS182.MTH3474(4101836477283750709L, contentValues0) == 1 && CLS182.MTH3474(0x38ECA6902B3CD335L, contentValues0) != 1 && ˎᵢ0.MTH938("show_mods", false)) {
                    String s3 = contentValues0.getAsString("talker");
                    if(CLS426.MTH6126(s3)) {
                        long v1 = System.currentTimeMillis();
                        if((!ᴵʽ0.FLD1144.containsKey(s3) || v1 - ((long)(((Long)ᴵʽ0.FLD1144.get(s3)))) >= 60000L) && !CLS481.MTH6686(ᴵʽ0.FLD1162, contentValues0) && CLS426.MTH6128(s3)) {
                            String s4 = contentValues0.getAsString("content");
                            if(CLS502.MTH6934(s4, new String[]{"#m"})) {
                                CLS748 יᐧ0 = new CLS748(ᴵʽ0, s4, s3, v1);
                                CLS40.FLD157.MTH1124(((CLS39)יᐧ0));
                            }
                        }
                    }
                }
                if((contentValues0.containsKey("isSend") ? CLS182.MTH3474(4101864106808365877L, contentValues0) : 0) == 1 && CLS182.MTH3474(0x38ECBFB32B3CD335L, contentValues0) == 1) {
                    String s5 = contentValues0.getAsString("talker");
                    if(!TextUtils.isEmpty(s5) && CLS426.MTH6126(s5) && ˎᵢ0.MTH938("room_manangement_enable", false) && ᴵʽ0.FLD1444 != null && !s5.equals(ˎᵢ0.MTH925("zombie_check_chatroom", "")) && CLS426.MTH6128(s5)) {
                        String s6 = contentValues0.getAsString("content");
                        String s7 = CLS27.MTH904();
                        if(!TextUtils.isEmpty(s6)) {
                            boolean z1 = false;
                            if(CLS502.MTH6934(s6, new String[]{"#cn "})) {
                                z1 = true;
                                ﾞᵎ0 = CLS40.FLD157;
                                ˆʿ0 = new CLS565(6, s5, s6.substring(s6.indexOf("#cn ") + 3).trim());
                            }
                            else if(CLS502.MTH6934(s6, new String[]{"#ga "})) {
                                z1 = true;
                                ﾞᵎ0 = CLS40.FLD157;
                                ˆʿ0 = new CLS565(7, s5, s6.substring(s6.indexOf("#ga ") + 3).trim());
                            }
                            if(z1) {
                                ﾞᵎ0.MTH1117(((CLS39)ˆʿ0), 3000L);
                                return;
                            }
                            if(CLS34.MTH1078(4101860112488780597L, s5, ˎᵢ0, false) && (CLS502.MTH6934(s6, new String[]{"#b"}) || CLS502.MTH6934(s6, new String[]{"#ub"}) || CLS502.MTH6934(s6, new String[]{"#w"}) || CLS502.MTH6934(s6, new String[]{"#uw"}) || CLS502.MTH6934(s6, new String[]{"#um"}) || CLS502.MTH6934(s6, new String[]{"#dm"}) || CLS502.MTH6934(s6, new String[]{"#pb"}) || CLS502.MTH6934(s6, new String[]{"#upb"}))) {
                                CLS1227 ʽי0 = new CLS1227(ᴵʽ0, s6, s5, 1, contentValues0, s7);
                                CLS40.FLD157.MTH1124(((CLS39)ʽי0));
                            }
                        }
                    }
                }
            }
        }
    }
}

