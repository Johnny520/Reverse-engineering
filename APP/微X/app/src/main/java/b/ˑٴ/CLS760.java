// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS73;
import b.ˊﾞ.CLS613;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS396;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518.CLS516;
import b.ⁱᵔ.CLS518;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public final class CLS760 extends CLS140 {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS124 extends Enum {
        public static final enum CLS124 FLD1017;
        public static final CLS124[] FLD1018;
        public static final enum CLS124 FLD1019;
        public static final enum CLS124 FLD1020;
        public static final enum CLS124 FLD1021;

        static {
            String[] arr_s = CLS370.FLD3464;
            long v = CLS613.MTH1969((v1 * 0x62A9D9ED799705F5L ^ v1 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v2 = CLS613.MTH1969(v);
            int v3 = (int)(v1 >>> 0x20 ^ v >>> 0x20 & 0xFFFFL ^ v2 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v4 = CLS613.MTH1969(v2) ^ ((long)arr_s[v3 / 0x1FFF].charAt(v3 % 0x1FFF)) << 0x20;
            int v5 = (int)(v4 >>> 0x20 & 0xFFFFL);
            char[] arr_c = new char[v5];
            for(int v6 = 0; v6 < v5; ++v6) {
                int v7 = v3 + v6 + 1;
                v4 = CLS613.MTH1969(v4) ^ ((long)arr_s[v7 / 0x1FFF].charAt(v7 % 0x1FFF)) << 0x20;
                arr_c[v6] = (char)(((int)(v4 >>> 0x20 & 0xFFFFL)));
            }
            CLS124.FLD1017 = new CLS124(0, new String(arr_c));
            String[] arr_s1 = CLS370.FLD3464;
            long v8 = CLS613.MTH1969((v9 * 0x62A9D9ED799705F5L ^ v9 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v10 = CLS613.MTH1969(v8);
            int v11 = (int)(v9 >>> 0x20 ^ v8 >>> 0x20 & 0xFFFFL ^ v10 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v12 = CLS613.MTH1969(v10) ^ ((long)arr_s1[v11 / 0x1FFF].charAt(v11 % 0x1FFF)) << 0x20;
            int v13 = (int)(v12 >>> 0x20 & 0xFFFFL);
            char[] arr_c1 = new char[v13];
            for(int v14 = 0; v14 < v13; ++v14) {
                int v15 = v11 + v14 + 1;
                v12 = CLS613.MTH1969(v12) ^ ((long)arr_s1[v15 / 0x1FFF].charAt(v15 % 0x1FFF)) << 0x20;
                arr_c1[v14] = (char)(((int)(v12 >>> 0x20 & 0xFFFFL)));
            }
            CLS124.FLD1020 = new CLS124(1, new String(arr_c1));
            String[] arr_s2 = CLS370.FLD3464;
            long v16 = CLS613.MTH1969((v17 * 0x62A9D9ED799705F5L ^ v17 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v18 = CLS613.MTH1969(v16);
            int v19 = (int)(v17 >>> 0x20 ^ v16 >>> 0x20 & 0xFFFFL ^ v18 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v20 = CLS613.MTH1969(v18) ^ ((long)arr_s2[v19 / 0x1FFF].charAt(v19 % 0x1FFF)) << 0x20;
            int v21 = (int)(v20 >>> 0x20 & 0xFFFFL);
            char[] arr_c2 = new char[v21];
            for(int v22 = 0; v22 < v21; ++v22) {
                int v23 = v19 + v22 + 1;
                v20 = CLS613.MTH1969(v20) ^ ((long)arr_s2[v23 / 0x1FFF].charAt(v23 % 0x1FFF)) << 0x20;
                arr_c2[v22] = (char)(((int)(v20 >>> 0x20 & 0xFFFFL)));
            }
            CLS124.FLD1019 = new CLS124(2, new String(arr_c2));
            String[] arr_s3 = CLS370.FLD3464;
            long v24 = CLS613.MTH1969((v25 * 0x62A9D9ED799705F5L ^ v25 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v26 = CLS613.MTH1969(v24);
            int v27 = (int)(v25 >>> 0x20 ^ v24 >>> 0x20 & 0xFFFFL ^ v26 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v28 = CLS613.MTH1969(v26) ^ ((long)arr_s3[v27 / 0x1FFF].charAt(v27 % 0x1FFF)) << 0x20;
            int v29 = (int)(v28 >>> 0x20 & 0xFFFFL);
            char[] arr_c3 = new char[v29];
            for(int v30 = 0; v30 < v29; ++v30) {
                int v31 = v27 + v30 + 1;
                v28 = CLS613.MTH1969(v28) ^ ((long)arr_s3[v31 / 0x1FFF].charAt(v31 % 0x1FFF)) << 0x20;
                arr_c3[v30] = (char)(((int)(v28 >>> 0x20 & 0xFFFFL)));
            }
            CLS124.FLD1021 = new CLS124(3, new String(arr_c3));
            CLS124.FLD1018 = new CLS124[]{CLS124.FLD1017, CLS124.FLD1020, CLS124.FLD1019, CLS124.FLD1021};
        }

        public CLS124(int v, String s) {
            super(s, v);
        }

        public static CLS124 valueOf(String s) {
            return (CLS124)Enum.valueOf(CLS124.class, s);
        }

        public static CLS124[] values() {
            return (CLS124[])CLS124.FLD1018.clone();
        }
    }

    public Set FLD1022;
    public final Pattern FLD1023;
    public CLS124 FLD1024;
    public int FLD1025;
    public final HashMap FLD1026;
    public String FLD1027;
    public Pattern FLD1028;
    public final CLS29 FLD1029;
    public final CLS73 FLD1030;

    // 此方法包含解密的字符串
    public CLS760(CLS139 ﹶʼ0) {
        super(ﹶʼ0);
        this.FLD1026 = new HashMap();
        this.FLD1023 = Pattern.compile(CLS27.MTH882("deletedmarkedpattern"));
        this.FLD1030 = new CLS73();
        this.FLD1029 = CLS27.MTH895();
    }

    // 此方法包含解密的字符串
    public final void MTH2533(CLS167 ᵔʾ0, String s, ContentValues contentValues0) {
        String s22;
        String s21;
        String s17;
        Intent intent0;
        Bitmap bitmap1;
        CLS139 ﹶʼ1;
        String s16;
        String s8;
        String s2;
        boolean z;
        try {
            CLS371 ʻ0 = this.FLD1444;
            CLS29 ˎᵢ0 = this.FLD1029;
            if(!ˎᵢ0.MTH938("prevent_msg_recall", true) || !"message".equalsIgnoreCase(s) || !contentValues0.containsKey("type")) {
                return;
            }
            int v = (int)contentValues0.getAsInteger("type");
            if(v != 10000 && v != 10002 && v != 0x10002710 && v != 0x10002712) {
                return;
            }
            String s1 = contentValues0.getAsString("content");
            if(v != 10000 && v != 0x10002710) {
                switch(v) {
                    case 10002: {
                        HashMap hashMap0 = CLS392.MTH5633(s1, "sysmsg");
                        if(hashMap0 == null || hashMap0.isEmpty() || hashMap0.containsKey(".sysmsg.$type") && !"invokeMessage".equals(hashMap0.get(".sysmsg.$type"))) {
                            return;
                        }
                        z = true;
                        break;
                    }
                    case 0x10002712: {
                        z = true;
                        break;
                    }
                    default: {
                        z = false;
                    }
                }
            }
            else {
                if(!CLS502.MTH6934(s1, new String[]{CLS27.MTH882("recall1"), CLS27.MTH882("recall2"), "recall", CLS27.MTH889("auto_recall")})) {
                    return;
                }
                z = s1.startsWith(CLS27.MTH882("you")) || s1.toLowerCase().startsWith("you") || CLS502.MTH6934(s1, new String[]{CLS27.MTH889("auto_recall")});
            }
            ContentValues contentValues1 = CLS371.MTH5368(ʻ0.MTH5361(((long)contentValues0.getAsLong("msgId"))));
            if(contentValues1 == null) {
                return;
            }
            long v1 = (long)contentValues0.getAsLong("msgId");
            s2 = contentValues1.getAsString("talker");
            String s3 = contentValues1.getAsString("content");
            int v2 = (int)contentValues1.getAsInteger("isSend");
            int v3 = (int)contentValues1.getAsInteger("type");
            if(v3 == 10000 || v3 == 10002) {
                return;
            }
            long v4 = (long)contentValues1.getAsLong("createTime");
            if(contentValues1.containsKey("talkerId")) {
                contentValues1.getAsInteger("talkerId").intValue();
            }
            long v5 = (long)contentValues1.getAsLong("msgSvrId");
            String s4 = contentValues1.getAsString("imgPath");
            boolean z1 = CLS27.MTH901();
            CLS139 ﹶʼ0 = this.FLD1447;
            CLS73 ˈˊ0 = this.FLD1030;
            if(!z1 && z && ˎᵢ0.MTH938("keep_self_recall", false)) {
                ᵔʾ0.MTH3207(-1);
                if(!ˎᵢ0.MTH938("show_recalled_hint", true) || ˈˊ0.MTH1579(v1)) {
                    return;
                }
                ˈˊ0.MTH1578(v1);
                CLS404.MTH5900(v4 + 1L, s2, CLS27.MTH889("recalled_above_msg"));
                ﹶʼ0.MTH3012(ﹶʼ0.FLD1434);
                return;
            }
            if(z) {
                return;
            }
            if(!CLS27.MTH901()) {
                ᵔʾ0.MTH3207(-1);
                if(ˈˊ0.MTH1579(v1)) {
                    return;
                }
                ˈˊ0.MTH1578(v1);
                String s5 = ˎᵢ0.MTH925("recalled", CLS27.MTH889("recalled_msg_content"));
                if(CLS426.MTH6126(s2)) {
                    String s6 = CLS426.MTH6109(s3);
                    String s7 = CLS613.MTH1971(CLS66.MTH1452(s2, s6));
                    if(!TextUtils.isEmpty(s7)) {
                        s6 = s7;
                    }
                    s8 = String.format(("\"%s\"" + s5), s6);
                }
                else {
                    s8 = String.format(("\"%s\"" + s5), ʻ0.MTH5311(s2));
                }
                if(v3 == 1 && ˎᵢ0.MTH938("show_content", false) && !TextUtils.isEmpty(s3)) {
                    s8 = s8 + ": " + CLS502.MTH6944(100, CLS426.MTH6106(v2, s3, s2));
                }
                if(!ˎᵢ0.MTH938("msg_recall_notification_enable", false) || !TextUtils.isEmpty(ﹶʼ0.FLD1434) && s2.equals(ﹶʼ0.FLD1434) || CLS372.MTH5396(s2)) {
                    ﹶʼ1 = ﹶʼ0;
                }
                else {
                    String s9 = CLS426.MTH6126(s2) ? String.format(("(%s)" + s8), ʻ0.MTH5316(s2)) : s8;
                    String s10 = null;
                    Bitmap bitmap0 = CLS372.MTH5411(s2);
                    switch(v3) {
                        case 1: {
                            ﹶʼ1 = ﹶʼ0;
                            String s19 = CLS426.MTH6106(v2, s3, s2);
                            this.MTH2541().MTH6723(s2, s9, s19, bitmap0);
                            break;
                        }
                        case 3: {
                            ﹶʼ1 = ﹶʼ0;
                            String s18 = CLS66.MTH1367(v5);
                            if(TextUtils.isEmpty(s18) || !s18.endsWith("jpg")) {
                                s18 = CLS66.MTH1426(s4);
                            }
                            bitmap1 = CLS518.MTH7061(s18);
                            intent0 = new Intent();
                            intent0.putExtra("img_gallery_talker", s2);
                            intent0.putExtra("img_gallery_msg_svr_id", v5);
                            s17 = CLS27.MTH889("img_summary");
                            this.MTH2541().MTH6738(s2, s9, bitmap1, intent0, s17, bitmap0, s4);
                            break;
                        }
                        case 34: {
                            ﹶʼ1 = ﹶʼ0;
                            this.MTH2541().MTH6723(s2, s9, CLS27.MTH889("audio"), bitmap0);
                            break;
                        }
                        case 0x2F: {
                            String s12 = CLS426.MTH6126(s2) ? CLS613.MTH1971(CLS66.MTH1452(s2, CLS426.MTH6109(s3))) : null;
                            String s13 = CLS66.MTH1417(s4);
                            String s14 = TextUtils.isEmpty(s12) ? s13 : s12 + ": " + s13;
                            HashMap hashMap2 = CLS392.MTH5633(s3, "emoji");
                            String s15 = hashMap2.containsKey(".emoji.$thumburl") ? ((String)hashMap2.get(".emoji.$thumburl")).replace("*#*", ":") : null;
                            if(TextUtils.isEmpty(s15)) {
                                if(hashMap2.containsKey(".emoji.$cdnurl")) {
                                    s10 = ((String)hashMap2.get(".emoji.$cdnurl")).replace("*#*", ":");
                                }
                                s16 = s10;
                            }
                            else {
                                s16 = s15;
                            }
                            ﹶʼ1 = ﹶʼ0;
                            CLS518.MTH7068(s16, ((CLS516)new CLS636(this, s2, s9, s14, bitmap0, 0)));
                            break;
                        }
                        case 49: {
                            HashMap hashMap1 = CLS392.MTH5633(s3, "appmsg");
                            String s11 = CLS27.MTH889((Integer.parseInt(((String)hashMap1.get(".appmsg.type"))) == 3 ? "music" : "link"));
                            this.MTH2541().MTH6723(s2, s9, s11 + ((String)hashMap1.get(".appmsg.title")), bitmap0);
                            ﹶʼ1 = ﹶʼ0;
                            break;
                        }
                        case 43: 
                        case 62: {
                            ﹶʼ1 = ﹶʼ0;
                            bitmap1 = CLS518.MTH7061(CLS66.MTH1482(s4));
                            intent0 = new Intent();
                            intent0.putExtra("img_gallery_talker", s2);
                            intent0.putExtra("img_gallery_msg_svr_id", v5);
                            s17 = CLS27.MTH889("video_summary");
                            this.MTH2541().MTH6738(s2, s9, bitmap1, intent0, s17, bitmap0, CLS66.MTH1449(s4));
                            break;
                        }
                        default: {
                            ﹶʼ1 = ﹶʼ0;
                            break;
                        }
                    }
                }
                if(ˎᵢ0.MTH938("show_recalled_hint", true)) {
                    CLS404.MTH5900(v4 + 1L, s2, s8);
                    ﹶʼ1.MTH3012(ﹶʼ1.FLD1434);
                }
                return;
            }
            if(ˈˊ0.MTH1579(v1)) {
                return;
            }
            ˈˊ0.MTH1578(v1);
            String s20 = ˎᵢ0.MTH925("recalled", CLS27.MTH889("recalled_msg_content"));
            s21 = CLS426.MTH6126(s2) ? String.format(("\"%s\"" + s20), ʻ0.MTH5311(CLS426.MTH6109(s3))) : String.format(("\"%s\"" + s20), ʻ0.MTH5311(s2));
            if(v3 == 1) {
                s22 = CLS502.MTH6944(50, CLS426.MTH6106(v2, s3, s2));
                if(ˎᵢ0.MTH938("show_recalled_hint", true)) {
                    contentValues0.put("content", s21 + ": " + s22);
                }
                else {
                    contentValues0.put("content", s22);
                }
                contentValues0.put("type", 1);
            }
            else {
                ᵔʾ0.MTH3207(-1);
                s22 = "";
            }
            if(CLS426.MTH6126(s2)) {
                s21 = String.format(("[%s]" + s21), ʻ0.MTH5316(s2));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return;
        }
        try {
            Bitmap bitmap2 = CLS372.MTH5411(s2);
            this.MTH2541().MTH6723(s2, s21, s22, bitmap2);
        }
        catch(Throwable unused_ex) {
        }
    }

    // 去混淆评级： 低(20)
    public final boolean MTH2534(String s) {
        return !TextUtils.isEmpty(s) && CLS502.MTH6935(this.FLD1023, s);
    }

    // 此方法包含解密的字符串
    public final void MTH2535(CLS167 ᵔʾ0, String s, Map map0) {
        String s18;
        CLS139 ﹶʼ1;
        String s15;
        String s21;
        ContentValues contentValues1;
        String s8;
        if(!CLS27.MTH901()) {
            CLS29 ˎᵢ0 = this.FLD1029;
            if(!ˎᵢ0.MTH938("prevent_msg_recall", true) || TextUtils.isEmpty(s) || !"revokemsg".equals(s) || map0 == null || !map0.containsKey(".sysmsg.$type")) {
                return;
            }
            if(!"revokemsg".equals(((String)map0.get(".sysmsg.$type")))) {
                return;
            }
            String s1 = (String)map0.get(".sysmsg.revokemsg.session");
            String s2 = (String)map0.get(".sysmsg.revokemsg.replacemsg");
            String s3 = (String)map0.get(".sysmsg.revokemsg.newmsgid");
            if(!s2.startsWith("你") && !s2.toLowerCase().startsWith("you")) {
                ᵔʾ0.MTH3207(null);
                CLS73 ˈˊ0 = this.FLD1030;
                CLS371 ʻ0 = this.FLD1444;
                try {
                    ʻ0.getClass();
                    ContentValues contentValues0 = CLS371.MTH5368(ʻ0.MTH5307(CLS27.MTH882("q_db7"), new String[]{s3}));
                    if(contentValues0 != null) {
                        int v = (int)contentValues0.getAsInteger("type");
                        if(v != 10000) {
                            long v1 = (long)contentValues0.getAsLong("msgId");
                            if(!ˈˊ0.MTH1579(v1)) {
                                ˈˊ0.MTH1578(v1);
                                String s4 = ˎᵢ0.MTH925("recalled", CLS27.MTH889("recalled_msg_content"));
                                String s5 = contentValues0.getAsString("content");
                                int v2 = (int)contentValues0.getAsInteger("isSend");
                                if(CLS426.MTH6126(s1)) {
                                    String s6 = CLS426.MTH6109(s5);
                                    String s7 = CLS613.MTH1971(CLS66.MTH1452(s1, s6));
                                    if(!TextUtils.isEmpty(s7)) {
                                        s6 = s7;
                                    }
                                    s8 = String.format(("\"%s\"" + s4), s6);
                                }
                                else {
                                    s8 = String.format(("\"%s\"" + s4), ʻ0.MTH5311(s1));
                                }
                                if(v == 1 && ˎᵢ0.MTH938("show_content", false) && !TextUtils.isEmpty(s5)) {
                                    s8 = s8 + ": " + CLS502.MTH6944(100, CLS426.MTH6106(v2, s5, s1));
                                }
                                boolean z = ˎᵢ0.MTH938("msg_recall_notification_enable", false);
                                CLS139 ﹶʼ0 = this.FLD1447;
                                if(!z || (!TextUtils.isEmpty(ﹶʼ0.FLD1434) && s1.equals(ﹶʼ0.FLD1434) || CLS372.MTH5396(s1))) {
                                label_96:
                                    ﹶʼ1 = ﹶʼ0;
                                    s21 = s8;
                                    contentValues1 = contentValues0;
                                    s18 = s1;
                                }
                                else {
                                    long v3 = Long.parseLong(s3);
                                    String s9 = CLS426.MTH6126(s1) ? String.format(("(%s)" + s8), ʻ0.MTH5316(s1)) : s8;
                                    Bitmap bitmap0 = CLS372.MTH5411(s1);
                                    switch(v) {
                                        case 1: {
                                            ﹶʼ1 = ﹶʼ0;
                                            s21 = s8;
                                            contentValues1 = contentValues0;
                                            s18 = s1;
                                            String s22 = CLS426.MTH6106(v2, s5, s18);
                                            this.MTH2541().MTH6723(s18, s9, s22, bitmap0);
                                            break;
                                        }
                                        case 3: {
                                            ﹶʼ1 = ﹶʼ0;
                                            s18 = s1;
                                            String s19 = CLS66.MTH1367(v3);
                                            if(TextUtils.isEmpty(s19) || !s19.endsWith("jpg")) {
                                                s19 = CLS66.MTH1426(contentValues0.getAsString("imgPath"));
                                            }
                                            Bitmap bitmap2 = CLS518.MTH7061(s19);
                                            Intent intent1 = new Intent();
                                            intent1.putExtra("img_gallery_talker", s18);
                                            intent1.putExtra("img_gallery_msg_svr_id", v3);
                                            String s20 = CLS27.MTH889("img_summary");
                                            this.MTH2541().MTH6738(s18, s9, bitmap2, intent1, s20, bitmap0, s19);
                                            contentValues1 = contentValues0;
                                            s21 = s8;
                                            break;
                                        }
                                        case 34: {
                                            ﹶʼ1 = ﹶʼ0;
                                            s18 = s1;
                                            this.MTH2541().MTH6723(s18, s9, CLS27.MTH889("audio"), bitmap0);
                                            contentValues1 = contentValues0;
                                            s21 = s8;
                                            break;
                                        }
                                        case 0x2F: {
                                            if(!TextUtils.isEmpty(CLS27.MTH897("emojiMethod4"))) {
                                                String s11 = contentValues0.getAsString("imgPath");
                                                String s12 = CLS426.MTH6126(s1) ? CLS613.MTH1971(CLS66.MTH1452(s1, CLS426.MTH6109(s5))) : null;
                                                String s13 = CLS66.MTH1417(s11);
                                                if(!TextUtils.isEmpty(s12)) {
                                                    s13 = s12 + ": " + s13;
                                                }
                                                HashMap hashMap1 = CLS392.MTH5633(s5, "emoji");
                                                if(hashMap1 != null) {
                                                    String s14 = hashMap1.containsKey(".emoji.$thumburl") ? ((String)hashMap1.get(".emoji.$thumburl")).replace("*#*", ":") : null;
                                                    if(TextUtils.isEmpty(s14)) {
                                                        s15 = hashMap1.containsKey(".emoji.$cdnurl") ? ((String)hashMap1.get(".emoji.$cdnurl")).replace("*#*", ":") : null;
                                                    }
                                                    else {
                                                        s15 = s14;
                                                    }
                                                    CLS518.MTH7068(s15, ((CLS516)new CLS636(this, s1, s9, s13, bitmap0, 1)));
                                                }
                                            }
                                            goto label_96;
                                        }
                                        case 49: {
                                            HashMap hashMap0 = CLS392.MTH5633(s5, "appmsg");
                                            String s10 = CLS27.MTH889((Integer.parseInt(((String)hashMap0.get(".appmsg.type"))) == 3 ? "music" : "link"));
                                            this.MTH2541().MTH6723(s1, s9, s10 + ((String)hashMap0.get(".appmsg.title")), bitmap0);
                                            goto label_96;
                                        }
                                        case 43: 
                                        case 62: {
                                            String s16 = contentValues0.getAsString("imgPath");
                                            Bitmap bitmap1 = CLS518.MTH7061(CLS66.MTH1482(s16));
                                            Intent intent0 = new Intent();
                                            intent0.putExtra("img_gallery_talker", s1);
                                            intent0.putExtra("img_gallery_msg_svr_id", v3);
                                            String s17 = CLS27.MTH889("video_summary");
                                            ﹶʼ1 = ﹶʼ0;
                                            s18 = s1;
                                            this.MTH2541().MTH6738(s1, s9, bitmap1, intent0, s17, bitmap0, CLS66.MTH1449(s16));
                                            contentValues1 = contentValues0;
                                            s21 = s8;
                                            break;
                                        }
                                        default: {
                                            goto label_96;
                                        }
                                    }
                                }
                                if(ˎᵢ0.MTH938("show_recalled_hint", true)) {
                                    CLS404.MTH5900(((long)contentValues1.getAsLong("createTime")) + 1L, s18, s21);
                                    ﹶʼ1.MTH3012(ﹶʼ1.FLD1434);
                                }
                            }
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2536(long v) {
        try {
            String s = CLS27.MTH889("auto_recall");
            CLS66.MTH1440(v, this.FLD1029.MTH925("auto_recalled_message", s));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        ʾᵢ0.MTH828("b.on_MMFragmentActivity_onResume,b.on_VASActivity_onResume", ((CLS35)new CLS761(this, 0)));
        ʾᵢ0.MTH828("b.sqldb.update", ((CLS35)new CLS761(this, 7)));
        ʾᵢ0.MTH828("a.async.sqldb.insert", ((CLS35)new CLS761(this, 8)));
        ʾᵢ0.MTH828("onsettingschange,onlauncheruienter.notactive", ((CLS35)new CLS761(this, 9)));
        ʾᵢ0.MTH828("a.msgitem", ((CLS35)new CLS761(this, 10)));
        ʾᵢ0.MTH828("b.sqldb.exec", ((CLS35)new CLS761(this, 11)));
        ʾᵢ0.MTH828("unrecallSnsComments", ((CLS35)new CLS761(this, 12)));
        ʾᵢ0.MTH828("unrecallSnsMoments", ((CLS35)new CLS761(this, 13)));
        ʾᵢ0.MTH828("setAutoRecallDelay", ((CLS35)new CLS761(this, 14)));
        ʾᵢ0.MTH828("revokeLastMsg", ((CLS35)new CLS761(this, 15)));
        ʾᵢ0.MTH828("updateChatMap", ((CLS35)new CLS761(this, 1)));
        ʾᵢ0.MTH828("on_unrecallClass1_unrecallMethod1", ((CLS35)new CLS761(this, 2)));
        ʾᵢ0.MTH828("on_unrecallClass1_unrecallMethod2", ((CLS35)new CLS761(this, 3)));
        ʾᵢ0.MTH828("on_unrecallClass3_unrecallMethod1", ((CLS35)new CLS761(this, 4)));
        ʾᵢ0.MTH828("on_revoke_msg_3", ((CLS35)new CLS761(this, 5)));
        ʾᵢ0.MTH828("on_msg_delete", ((CLS35)new CLS761(this, 6)));
    }

    // 此方法包含解密的字符串
    public final void MTH2538(ContentValues contentValues0) {
        try {
            ContentValues contentValues1 = new ContentValues();
            if(!CLS27.MTH901()) {
                Class class0 = CLS27.MTH894("snsContentClass");
                if(class0 == null) {
                    return;
                }
                Object object0 = CLS66.MTH1381(class0, contentValues0.getAsByteArray("content"));
                if(object0 == null) {
                    return;
                }
                String s = CLS66.MTH1511(object0);
                if(!this.MTH2534(s)) {
                    CLS166.MTH3198(object0, CLS27.MTH897("snsContentField"), CLS27.MTH889("deletedTag") + "\n" + s);
                    contentValues1.put("content", CLS396.MTH5764(object0));
                }
            }
            contentValues1.put("sourceType", contentValues0.getAsInteger("sourceType"));
            String[] arr_s = {contentValues0.getAsString("snsId")};
            this.FLD1446.MTH5767("SnsInfo", contentValues1, "snsId = ?", arr_s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2539(ContentValues contentValues0) {
        try {
            ContentValues contentValues1 = new ContentValues();
            if(!CLS27.MTH901() || this.FLD1029.MTH938("show_comment_deleted_tag", false)) {
                Class class0 = CLS27.MTH894("commentClass");
                if(class0 == null) {
                    return;
                }
                Object object0 = CLS66.MTH1381(class0, contentValues0.getAsByteArray("curActionBuf"));
                String s = CLS502.MTH6931(((String)CLS166.MTH3194(object0, CLS27.MTH897("snsCommentContentField"))));
                CLS166.MTH3198(object0, CLS27.MTH897("snsCommentContentField"), s + " " + CLS27.MTH889("deletedTag"));
                contentValues1.put("curActionBuf", CLS396.MTH5764(object0));
            }
            contentValues1.put("commentflag", 0);
            String[] arr_s = {contentValues0.getAsString("commentSvrID")};
            this.FLD1446.MTH5767("SnsComment", contentValues1, "commentSvrID = ?", arr_s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2540(Set set0) {
        if(set0 != null && !set0.isEmpty()) {
            StringBuilder stringBuilder0 = new StringBuilder("sourceType != 0 ");
            for(Object object0: set0) {
                stringBuilder0.append("AND userName = \'");
                stringBuilder0.append(((String)object0));
                stringBuilder0.append("\' ");
            }
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("sourceType", 8);
            this.FLD1446.MTH5767("SnsInfo", contentValues0, stringBuilder0.toString(), null);
        }
    }

    public final CLS485 MTH2541() {
        return (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
    }
}

