// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS1;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS565;
import b.ˆʿ.CLS61;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS1156;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS290;
import b.ᵔʾ.CLS314;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS426 {
    public static final HashMap FLD4116;

    static {
        CLS426.FLD4116 = new HashMap();
    }

    public static ContentValues MTH6105(String s, String s1) {
        String s3;
        String s2 = "";
        if(TextUtils.isEmpty(s1)) {
            return null;
        }
        ContentValues contentValues0 = new ContentValues();
        try {
            if(s1.contains(CLS27.MTH882("invite1"))) {
                s3 = s1.substring(s1.indexOf(CLS27.MTH882("invite1")) + 2, s1.indexOf(CLS27.MTH882("join")));
            }
            else if(s1.contains("invited")) {
                s3 = s1.substring(s1.indexOf("invited") + 7, s1.indexOf("to")).trim();
            }
            else if(s1.contains(CLS27.MTH882("invite2"))) {
                s3 = s1.substring(s1.indexOf(CLS27.MTH882("invite2")) + 2, s1.indexOf(CLS27.MTH882("join")));
            }
            else if(s1.contains(CLS27.MTH882("viascan1"))) {
                s3 = s1.substring(0, s1.indexOf(CLS27.MTH882("viascan1")));
            }
            else if(s1.contains(CLS27.MTH882("viascan2"))) {
                s3 = s1.substring(0, s1.indexOf(CLS27.MTH882("viascan2")));
            }
            else if(s1.contains("via the QR Code")) {
                s3 = s1.substring(0, s1.indexOf("joined"));
            }
            else if(s1.contains(CLS27.MTH882("viagame1"))) {
                s3 = s1.substring(0, s1.indexOf(CLS27.MTH882("viagame1")));
            }
            else {
                s3 = "";
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH906(s1);
            CLS27.MTH893(throwable0);
            s3 = "";
        }
        if(!TextUtils.isEmpty(s3)) {
            s3 = s3.replaceAll("\"", "");
            s2 = CLS426.MTH6112(s, s3);
        }
        contentValues0.put("invitee_nick", s3);
        contentValues0.put("invitee_id", s2);
        return contentValues0;
    }

    public static String MTH6106(int v, String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        if(CLS426.MTH6126(s1) && v == 0 && s.contains(":")) {
            String s2 = " ";
            s = s.substring(s.indexOf(":") + 1).trim();
            if(CLS426.MTH6129(s)) {
                if(!s.contains(" ")) {
                    s2 = " ";
                    if(!s.contains(" ")) {
                        s2 = null;
                    }
                }
                if(!TextUtils.isEmpty(s2)) {
                    String[] arr_s = s.split(s2);
                    ArrayList arrayList0 = new ArrayList();
                    for(int v1 = 0; v1 < arr_s.length; ++v1) {
                        String s3 = arr_s[v1];
                        if(!s3.startsWith("@")) {
                            int v2 = s3.indexOf("@");
                            if(v2 != -1) {
                                s3 = s3.substring(0, v2);
                            }
                            arrayList0.add(s3);
                        }
                    }
                    return TextUtils.join("", arrayList0);
                }
            }
        }
        return s;
    }

    // 去混淆评级： 低(20)
    public static boolean MTH6107(String s) {
        return s.endsWith("@im.chatroom") ? true : CLS426.MTH6114(-1, s);
    }

    public static void MTH6108(String s, String s1) {
        if(CLS426.MTH6118(s, s1)) {
            return;
        }
        CLS426.MTH6132(s, s1, false);
    }

    public static String MTH6109(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        if(s.contains(":")) {
            String s1 = s.split(":")[0].trim();
            return s1.contains("<appmsg") ? "" : s1;
        }
        return "";
    }

    public static String MTH6110(String s, String s1, String s2) {
        StringBuilder stringBuilder0;
        String s3 = "";
        if(CLS27.MTH895().MTH938("show_realname_label_enable", false) && CLS500.FLD4928.MTH6895("show_realname")) {
            CLS290 ˊˎ0 = CLS290.FLD3007;
            String s4 = ˊˎ0.MTH4759(s2);
            if(TextUtils.isEmpty(s4)) {
                HashSet hashSet0 = ˊˎ0.FLD3009;
                if(!hashSet0.contains(s2) && !ˊˎ0.FLD3014.containsKey(s2)) {
                    hashSet0.add(s2);
                    ˊˎ0.FLD3008.addLast(s2);
                    if(!ˊˎ0.FLD3013 && !ˊˎ0.FLD3008.isEmpty()) {
                        ˊˎ0.FLD3013 = true;
                        ˊˎ0.MTH4761();
                    }
                }
            }
            if(!TextUtils.isEmpty(s4)) {
                s3 = s + " " + "(" + s4 + ")";
            }
        }
        if(CLS27.MTH895().MTH938("show_chatroom_mod_label", false)) {
            if(CLS426.MTH6123(s1, s2)) {
                if(TextUtils.isEmpty(s3)) {
                    s3 = s + " ";
                }
                stringBuilder0 = CLS182.MTH3483(s3);
                stringBuilder0.append(CLS27.MTH895().MTH925("chatroom_owner_lbl", CLS27.MTH889("chatroom_owner_lbl")));
                s3 = stringBuilder0.toString();
                return TextUtils.isEmpty(s3) ? s : s3;
            }
            if(CLS66.MTH1383(s1, s2)) {
                if(TextUtils.isEmpty(s3)) {
                    s3 = s + " ";
                }
                stringBuilder0 = CLS182.MTH3483(s3);
                stringBuilder0.append(CLS27.MTH895().MTH925("chatroom_mod_lbl", CLS27.MTH889("chatroom_mod_lbl")));
                s3 = stringBuilder0.toString();
            }
        }
        return TextUtils.isEmpty(s3) ? s : s3;
    }

    public static ContentValues MTH6111(String s, String s1) {
        String s4;
        String s3;
        String s5;
        String s2 = "";
        if(TextUtils.isEmpty(s1)) {
            return null;
        }
        ContentValues contentValues0 = new ContentValues();
        try {
            if(s1.contains(CLS27.MTH882("invite1"))) {
                s4 = s1.substring(0, s1.indexOf(CLS27.MTH882("invite1")));
            }
            else if(s1.contains("invited")) {
                s4 = s1.substring(0, s1.indexOf("invited")).trim();
            }
            else if(s1.contains(CLS27.MTH882("invite2"))) {
                s4 = s1.substring(0, s1.indexOf(CLS27.MTH882("invite2")));
            }
            else if(s1.contains(CLS27.MTH882("viascan1"))) {
                s3 = s1.substring(s1.indexOf(CLS27.MTH882("viascan1")) + 4);
                try {
                    s4 = s3.substring(0, s3.indexOf(CLS27.MTH882("share")));
                }
                catch(Throwable throwable1) {
                    s5 = s3;
                    throwable0 = throwable1;
                    goto label_34;
                }
            }
            else if(s1.contains(CLS27.MTH882("viascan2"))) {
                s3 = s1.substring(s1.indexOf("viascan2") + 4);
                s4 = s3.substring(0, s3.indexOf(CLS27.MTH882("share")));
            }
            else if(s1.contains("via the QR Code")) {
                s4 = s1.substring(s1.indexOf("shared by") + 10, s1.length() - 1);
            }
            else if(s1.contains("via your shared QR Code")) {
                s4 = "you";
            }
            else {
                s4 = "";
            }
            goto label_36;
        }
        catch(Throwable throwable0) {
            s5 = "";
        }
    label_34:
        CLS27.MTH893(throwable0);
        s4 = s5;
    label_36:
        if(!TextUtils.isEmpty(s4)) {
            s4 = s4.replaceAll("\"", "");
            if(s4.equals(CLS27.MTH882("you")) || s4.equalsIgnoreCase("you")) {
                s4 = CLS66.MTH1452(s, CLS27.MTH904());
                s2 = CLS27.MTH904();
            }
            else {
                s2 = CLS426.MTH6112(s, s4);
            }
        }
        contentValues0.put("inviter_nick", s4);
        contentValues0.put("inviter_id", s2);
        return contentValues0;
    }

    public static String MTH6112(String s, String s1) {
        String s2;
        int v;
        if(TextUtils.isEmpty(s1)) {
            return "";
        }
        String[] arr_s = CLS502.MTH6941(CLS371.FLD3470.MTH5335(s));
        try {
            Object object0 = CLS66.MTH1505(s);
            if(object0 == null) {
                return "";
            }
            for(v = 0; true; ++v) {
            label_7:
                if(v >= arr_s.length) {
                    return "";
                }
                s2 = arr_s[v];
                String s3 = (String)CLS166.MTH3195(object0, CLS27.MTH897("AtSomeoneMethod2"), new Object[]{s2});
                if(TextUtils.isEmpty(s3)) {
                    s3 = CLS371.FLD3470.MTH5304(s2);
                }
                if(s1.equals(s3)) {
                    return s2;
                }
                if(s1.equals(CLS371.FLD3470.MTH5323(s2))) {
                    break;
                }
            }
            return s2;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return "";
        }
        ++v;
        goto label_7;
    }

    // 此方法包含解密的字符串
    public static void MTH6113(String s, ArrayList arrayList0, boolean z) {
        String s3;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        CLS61 ﾞٴ0 = (CLS61)CLS40.FLD157.MTH1118(CLS61.class);
        Iterator iterator0 = arrayList0.iterator();
        if(!z) {
            String s1 = CLS371.FLD3470.MTH5335(s);
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s2 = (String)object0;
                long v = System.currentTimeMillis() - ﾞٴ0.MTH1336(s, s2);
                boolean z1 = v <= 3600000L;
                if(ﾞٴ0.MTH1304(s, s2) || s1.contains(s2) || z1) {
                    iterator0.remove();
                }
                if(s1.contains(s2)) {
                    s3 = String.format(CLS27.MTH889("invitation_already_is_member"), CLS371.FLD3470.MTH5311(s2));
                }
                else {
                    if(!z1) {
                        continue;
                    }
                    long v1 = 3600000L - v - ((long)(((int)((3600000L - v) / 86400000L)) * 86400000));
                    s3 = String.format(CLS27.MTH889("invitation_try_again"), ((int)(v1 / 3600000L)), ((int)(((int)(v1 - ((long)(3600000 * ((int)(v1 / 3600000L)))))) / 60000)));
                }
                CLS466.MTH6542(s2, s3);
            }
        }
        if(arrayList0.isEmpty()) {
            return;
        }
        CLS21.FLD76.MTH818("chat_invite", new Object[]{s, arrayList0});
        if(!z) {
            String s4 = String.valueOf(System.currentTimeMillis());
            for(Object object1: arrayList0) {
                ﾞٴ0.getClass();
                ﾞٴ0.MTH1344(3, s, ((String)object1), s4, "");
            }
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH6114(int v, String s) {
        boolean z = false;
        if(!s.endsWith("@chatroom")) {
            return false;
        }
        HashMap hashMap0 = CLS426.FLD4116;
        if(hashMap0.containsKey(s)) {
            Object object0 = hashMap0.get(s);
            return Boolean.TRUE.equals(object0);
        }
        if(v == -1) {
            CLS371.FLD3470.getClass();
            try {
                Cursor cursor0 = CLS371.FLD3470.MTH5307("SELECT chatroomStatus FROM chatroom WHERE chatroomname = ?", new String[]{s});
                if(cursor0 == null) {
                    goto label_20;
                }
                else {
                    int v1 = cursor0.moveToFirst() ? cursor0.getInt(cursor0.getColumnIndex("chatroomStatus")) : 0;
                    if(!cursor0.isClosed()) {
                        cursor0.close();
                    }
                    v = v1;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                v = 0;
            }
            goto label_21;
        label_20:
            v = 0;
        }
    label_21:
        if((v & 0x20000) == 0x20000) {
            z = true;
        }
        hashMap0.put(s, Boolean.valueOf(z));
        return z;
    }

    public static void MTH6115(String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            String s1 = CLS371.FLD3470.MTH5335(s);
            ArrayList arrayList0 = new ArrayList();
            String s2 = CLS27.MTH904();
            boolean z = CLS426.MTH6123(s, s2);
            boolean z1 = CLS66.MTH1383(s, s2);
            String[] arr_s = CLS502.MTH6941(s1);
            for(int v = 0; v < arr_s.length; ++v) {
                String s3 = arr_s[v];
                if(!s3.equals(s2) && (z || !z1 || !CLS66.MTH1433(s, s3))) {
                    arrayList0.add(s3);
                }
            }
            CLS426.MTH6131(s, arrayList0, false);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static String MTH6116(String s, String s1) {
        CLS371 ʻ0 = CLS371.FLD3470;
        String s2 = ʻ0.MTH5323(s1);
        if(TextUtils.isEmpty(s2)) {
            s2 = CLS66.MTH1452(s, s1);
        }
        return TextUtils.isEmpty(s2) ? ʻ0.MTH5311(s1) : s2;
    }

    // 此方法包含解密的字符串
    public static void MTH6117(String s) {
        public final class CLS1415 implements CLS2 {
            public final CLS61 FLD4112;
            public final String FLD4113;

            public CLS1415(CLS61 ﾞٴ0, String s) {
                this.FLD4113 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS61 ﾞٴ0 = this.FLD4112;
                String s2 = this.FLD4113;
                if(ﾞٴ0.MTH1314(s2)) {
                    ﾞٴ0.MTH1335(1, s2);
                    ﾞٴ0.MTH1335(3, s2);
                }
                for(Object object0: arrayList0) {
                    CLS78 ˊﾞ0 = (CLS78)object0;
                    if(!CLS66.MTH1433("", s2) && CLS66.MTH1455("")) {
                        CLS523.MTH7165(CLS404.MTH5891(), "", CLS27.MTH889("reason"), "", 1, ((CLS16)new CLS1156(ˊﾞ0, s2, 14)));
                    }
                    else {
                        CLS314.FLD3231.MTH5004("", s2, null);
                    }
                }
                CLS314.FLD3231.MTH5002();
            }
        }


        public final class CLS1416 implements CLS2 {
            public final CLS61 FLD4114;
            public final String FLD4115;

            public CLS1416(CLS61 ﾞٴ0, String s) {
                this.FLD4115 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS61 ﾞٴ0 = this.FLD4114;
                String s2 = this.FLD4115;
                if(ﾞٴ0.MTH1314(s2)) {
                    ﾞٴ0.MTH1335(1, s2);
                    ﾞٴ0.MTH1335(3, s2);
                }
                if(CLS66.MTH1433(s, s2) || !CLS66.MTH1455(s)) {
                    CLS314.FLD3231.MTH5004(s, s2, null);
                }
                else {
                    CLS523.MTH7165(CLS404.MTH5891(), CLS27.MTH889("reason"), "", "", 1, ((CLS16)new CLS565(13, s, s2)));
                }
                CLS314.FLD3231.MTH5002();
            }
        }

        ArrayList arrayList0 = new ArrayList();
        String s1 = CLS27.MTH904();
        CLS371.FLD3470.MTH5313(s1, arrayList0);
        CLS372.MTH5405(arrayList0);
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(!hashSet0.contains("")) {
                CLS371 ʻ0 = CLS371.FLD3470;
                if(!"".contains(s) && CLS502.MTH6941("").length != 500) {
                    ˊﾞ0.FLD275 = "" + " (" + ʻ0.MTH5369("") + ")";
                    hashSet0.add("");
                    arrayList1.add(ˊﾞ0);
                }
            }
        }
        CLS61 ﾞٴ0 = (CLS61)CLS40.FLD157.MTH1118(CLS61.class);
        if(CLS500.FLD4928.MTH6895("chatroom_send_multi_invites")) {
            CLS387.MTH5585(false, CLS404.MTH5891(), arrayList1, ((CLS2)new CLS1415(ﾞٴ0, s)), "", -1);
            return;
        }
        CLS387.MTH5600(false, CLS404.MTH5891(), arrayList1, ((CLS2)new CLS1416(ﾞٴ0, s)));
    }

    // 去混淆评级： 低(20)
    public static boolean MTH6118(String s, String s1) {
        return ((CLS61)CLS40.FLD157.MTH1118(CLS61.class)).MTH1339(s, s1) || CLS66.MTH1433(s, s1);
    }

    public static String MTH6119(ContentValues contentValues0) {
        String s = contentValues0.getAsString("SECRETKEY");
        String s1 = contentValues0.getAsString("USERNAME");
        String s2 = contentValues0.getAsString("INVITED_TO_CHATROOM");
        StringBuilder stringBuilder0 = CLS182.MTH3483(s);
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        if(!TextUtils.isEmpty(s1)) {
            stringBuilder0.append("<br><small><i>");
            stringBuilder0.append(s1);
            CLS371 ʻ0 = CLS371.FLD3470;
            String s3 = ʻ0.MTH5311(s1);
            if(!TextUtils.isEmpty(s3) && !s3.equals(s1)) {
                stringBuilder0.append(" (");
                stringBuilder0.append(s3);
                stringBuilder0.append(")");
            }
            if(!TextUtils.isEmpty(s2)) {
                stringBuilder0.append(": ");
                stringBuilder0.append(ʻ0.MTH5316(s2));
            }
            if(contentValues0.containsKey("USE_TIME")) {
                stringBuilder0.append("<br>");
                stringBuilder0.append(simpleDateFormat0.format(new Date(((long)contentValues0.getAsLong("USE_TIME")))));
            }
            stringBuilder0.append("</i></small>");
        }
        return stringBuilder0.toString();
    }

    public static void MTH6120(String s, String s1, boolean z, String s2) {
        try {
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(s1);
                if(!CLS371.FLD3470.MTH5382(s1)) {
                    CLS372.MTH5399(s1, ((CLS1)new CLS1508(s, s2, arrayList0, z)));
                    return;
                }
                CLS426.MTH6133(s, s2, arrayList0, z);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static String MTH6121(String s, ArrayList arrayList0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: arrayList0) {
            stringBuilder0.append(CLS426.MTH6125(s, ((String)object0)));
        }
        return stringBuilder0.toString();
    }

    public static String MTH6122() {
        CLS500 ᵢﹶ0 = CLS500.FLD4928;
        if(ᵢﹶ0.MTH6895("text_rep_nickname")) {
            String s = CLS27.MTH889("exit_room_notice");
            if(CLS27.MTH895().MTH938("show_realname_label_enable", false) && ᵢﹶ0.MTH6895("show_realname")) {
                StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                stringBuilder0.append(CLS27.MTH889("exit_room_notice_realname"));
                s = stringBuilder0.toString();
            }
            StringBuilder stringBuilder1 = CLS182.MTH3483(s);
            stringBuilder1.append(CLS27.MTH889("exit_room_notice_time"));
            return stringBuilder1.toString();
        }
        return "";
    }

    public static boolean MTH6123(String s, String s1) {
        if(!TextUtils.isEmpty(s) && CLS426.MTH6126(s)) {
            String s2 = CLS371.FLD3470.MTH5343(s);
            return !TextUtils.isEmpty(s2) && s2.equals(s1);
        }
        return false;
    }

    public static String MTH6124(int v, int v1, String s, String s1) {
        String s2;
        if(v == 0x13000031) {
            try {
                s2 = null;
                HashMap hashMap0 = CLS392.MTH5633(s1, "msg");
                s2 = hashMap0.containsKey(".msg.fromusername") ? ((String)hashMap0.get(".msg.fromusername")) : CLS426.MTH6109(s1);
                if(TextUtils.isEmpty(s2)) {
                    int v2 = s1.indexOf("<fromusername>");
                    return v2 == -1 ? s2 : s1.substring(v2 + 14, s1.indexOf("</fromusername>"));
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return s2;
        }
        if(!CLS426.MTH6126(s)) {
            return v1 == 1 ? CLS27.MTH904() : s;
        }
        return CLS426.MTH6109(s1);
    }

    public static String MTH6125(String s, String s1) {
        String s2 = CLS66.MTH1452(s, s1);
        return TextUtils.isEmpty(s2) ? "" : "@" + s2 + " ";
    }

    // 去混淆评级： 低(30)
    public static boolean MTH6126(String s) {
        return !TextUtils.isEmpty(s) && (s.endsWith("@chatroom") || CLS426.MTH6107(s));
    }

    // 此方法包含解密的字符串
    public static String MTH6127(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return "";
        }
        String s2 = s.substring(0, s.indexOf("@"));
        if(s.endsWith("@im.chatroom")) {
            s2 = s2 + "_im";
        }
        return String.format(CLS27.MTH882("sysmsg_link"), "#16EAFF", "chatroom_userinfo", s2 + "__" + s1, s1);
    }

    // 去混淆评级： 低(20)
    public static boolean MTH6128(String s) {
        return TextUtils.isEmpty(s) || !CLS426.MTH6126(s) ? false : CLS66.MTH1433(s, CLS27.MTH904());
    }

    // 去混淆评级： 中等(50)
    public static boolean MTH6129(String s) {
        return !TextUtils.isEmpty(s) && s.contains("@") && !s.contains("<msg>") && (s.contains(" ") || s.contains(" "));
    }

    public static String[] MTH6130(String s) {
        String s1 = s.contains(":") ? s.split(":")[1].trim() : s;
        String s2 = s.contains(" ") || s.contains(" ") ? " " : null;
        if(TextUtils.isEmpty(s2)) {
            return null;
        }
        int v = s1.lastIndexOf(s2);
        return v == -1 ? null : s1.substring(0, v).replaceAll("@", "").split(s2);
    }

    public static void MTH6131(String s, ArrayList arrayList0, boolean z) {
        try {
            if(!arrayList0.isEmpty() && !TextUtils.isEmpty(s) && !CLS27.MTH901()) {
                String s1 = CLS371.FLD3470.MTH5343(s);
                String s2 = CLS27.MTH904();
                CLS61 ﾞٴ0 = (CLS61)CLS40.FLD157.MTH1118(CLS61.class);
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s3 = (String)object0;
                    if(s3.equals(s1) || s3.equals(s2)) {
                        iterator0.remove();
                    }
                    else if(z) {
                        ﾞٴ0.MTH1310(s, s3);
                    }
                }
                CLS66.MTH1466(s, arrayList0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static void MTH6132(String s, String s1, boolean z) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(s1);
            CLS426.MTH6131(s, arrayList0, z);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6133(String s, String s1, ArrayList arrayList0, boolean z) {
        String s4;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Iterator iterator0 = arrayList0.iterator();
        Object object0 = CLS40.FLD157.MTH1118(CLS61.class);
        if(!z) {
            String s2 = CLS371.FLD3470.MTH5335(s);
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                String s3 = (String)object1;
                long v = System.currentTimeMillis() - ((CLS61)object0).MTH1336(s, s3);
                long v1 = (long)CLS412.MTH6005(3600000, "chatroom_invite_timeout");
                boolean z1 = v <= v1;
                if(((CLS61)object0).MTH1304(s, s3) || s2.contains(s3) || z1) {
                    iterator0.remove();
                }
                if(s2.contains(s3)) {
                    s4 = String.format(CLS27.MTH889("invitation_already_is_member"), CLS371.FLD3470.MTH5311(s3));
                }
                else {
                    if(!z1) {
                        continue;
                    }
                    long v2 = v1 - v - ((long)(((int)((v1 - v) / 86400000L)) * 86400000));
                    s4 = String.format(CLS27.MTH889("invitation_try_again"), ((int)(v2 / 3600000L)), ((int)(((int)(v2 - ((long)(3600000 * ((int)(v2 / 3600000L)))))) / 60000)));
                }
                CLS466.MTH6542(s3, s4);
            }
        }
        if(arrayList0.isEmpty()) {
            return;
        }
        if(!TextUtils.isEmpty(s) && !arrayList0.isEmpty()) {
            try {
                CLS21.FLD76.MTH818("chat_invite", new Object[]{s, arrayList0, s1});
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        if(!z) {
            String s5 = String.valueOf(System.currentTimeMillis());
            for(Object object2: arrayList0) {
                ((CLS61)object0).getClass();
                ((CLS61)object0).MTH1344(3, s, ((String)object2), s5, "");
            }
        }
    }
}

