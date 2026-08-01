// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ˆٴ.CLS66;
import b.ᵔʾ.CLS290;
import b.ⁱˉ.CLS370;
import java.io.StringReader;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public final class CLS502 {
    public static final HashSet FLD4955;
    public static final HashSet FLD4956;

    static {
        CLS502.FLD4955 = new HashSet();
        CLS502.FLD4956 = new HashSet();
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public static String MTH6921(String s) {
        return CLS502.MTH6934(s, new String[]{"<body>"}) ? s.substring(s.indexOf("<body") + 6, s.indexOf("</body>")) : s;
    }

    public static String MTH6922(String s) {
        return CLS34.MTH1079(4101204124953793333L, new StringBuilder(), s, 4101204167903466293L);
    }

    public static String MTH6923(String s) {
        return CLS502.MTH6944(20, s);
    }

    // 此方法包含解密的字符串
    public static String MTH6924(String s, String s1) {
        String s2 = s.substring(s1.length() + s.indexOf(s1) + 2);
        return s2.substring(0, s2.indexOf("\""));
    }

    // 此方法包含解密的字符串
    public static String MTH6925(String s) {
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
            messageDigest0.update(s.getBytes());
            byte[] arr_b = messageDigest0.digest();
            StringBuilder stringBuilder0 = new StringBuilder();
            for(int v = 0; v < arr_b.length; ++v) {
                stringBuilder0.append(Integer.toHexString(arr_b[v] & 0xFF | 0x100).substring(1, 3));
            }
            return stringBuilder0.toString();
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static HashSet MTH6926() {
        HashSet hashSet0 = CLS502.FLD4955;
        if(!hashSet0.isEmpty()) {
            return hashSet0;
        }
        hashSet0.add("￀");
        hashSet0.add("￀");
        hashSet0.add("￀");
        hashSet0.add("￀");
        hashSet0.add("￀");
        hashSet0.add("￀");
        HashSet hashSet1 = CLS502.FLD4956;
        if(hashSet1.isEmpty()) {
            hashSet1.add("￀");
            hashSet1.add("﻿");
            hashSet1.add("￀");
            hashSet1.add("￀");
            hashSet1.add("￀");
        }
        hashSet0.addAll(hashSet1);
        return hashSet0;
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static boolean MTH6927(String s) {
        String s1 = s.trim();
        return s1.startsWith("^") && s1.endsWith("$");
    }

    // 此方法包含解密的字符串
    public static String MTH6928(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        String s1 = CLS502.MTH6931(s);
        if(s1.contains("·")) {
            s1 = s1.replaceAll("·", "");
        }
        if(s1.contains("￀")) {
            s1 = s1.replaceAll("￀", "");
        }
        HashSet hashSet0 = new HashSet();
        hashSet0.addAll(CLS502.MTH6926());
        for(Object object0: hashSet0) {
            s1 = s1.replaceAll(((String)object0), "");
        }
        return s1.trim();
    }

    public static int MTH6929(String s) {
        int v1 = 0;
        for(int v = 0; v < s.length(); ++v) {
            if(s.charAt(v) == 0x40) {
                ++v1;
            }
        }
        return v1;
    }

    // 去混淆评级： 低(20)
    public static boolean MTH6930(String s, String s1) {
        return TextUtils.isEmpty(s) ? false : CLS502.MTH6935(Pattern.compile(s, 2), s1);
    }

    // 去混淆评级： 低(36)
    // 此方法包含解密的字符串
    public static String MTH6931(String s) {
        if(TextUtils.isEmpty(s)) {
            return "";
        }
        if(s.contains(CLS27.MTH882("deletedMark"))) {
            return s.replaceAll("\\[已删除\\]", "").trim().trim();
        }
        return s.contains("[Deleted]") ? s.replaceAll("\\[Deleted\\]", "").trim().trim() : s.trim();
    }

    // 去混淆评级： 中等(80)
    // 此方法包含解密的字符串
    public static String MTH6932(String s, String s1, String s2) {
        return s.substring(0, s1.length() + s.indexOf("<" + s1 + ">") + 2) + s2 + s.substring(s.indexOf("</" + s1 + ">"));
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static boolean MTH6933(String s) {
        return TextUtils.isEmpty(s) || "null".equalsIgnoreCase(s);
    }

    public static boolean MTH6934(String s, String[] arr_s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(!TextUtils.isEmpty(s1) && s.contains(s1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean MTH6935(Pattern pattern0, String s) {
        return pattern0 == null ? false : pattern0.matcher(s).find();
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static String MTH6936(CharSequence charSequence0) {
        return TextUtils.isEmpty(charSequence0) ? "" : charSequence0.toString();
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static String MTH6937(String s) {
        return CLS502.MTH6933(s) ? "" : s;
    }

    public static boolean MTH6938(String s, CharSequence[] arr_charSequence) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        for(int v = 0; v < arr_charSequence.length; ++v) {
            CharSequence charSequence0 = arr_charSequence[v];
            if(!TextUtils.isEmpty(charSequence0) && s.contains(charSequence0)) {
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    public static String MTH6939(String s, String s1, String s2) {
        String s7;
        long v1;
        String s5;
        String s3;
        if(CLS502.MTH6934(s, new String[]{"#N#"}) && !TextUtils.isEmpty(s1)) {
            if(CLS500.FLD4928.MTH6895("text_rep_nickname")) {
                try {
                    if(CLS426.MTH6126(s1)) {
                        s3 = TextUtils.isEmpty(s2) ? "" : CLS66.MTH1452(s1, s2);
                    }
                    else {
                        s3 = CLS371.FLD3470.MTH5304(s1);
                    }
                    s = s.replaceAll("#N#", s3);
                    goto label_9;
                }
                catch(Throwable unused_ex) {
                }
                goto label_8;
            }
            else {
            label_8:
                s = s.replaceAll("#N#", "");
            }
        }
    label_9:
        if(CLS502.MTH6934(s, new String[]{"#N2#"}) && !TextUtils.isEmpty(s1)) {
            if(CLS500.FLD4928.MTH6895("text_rep_nickname")) {
                try {
                    if(!CLS426.MTH6126(s1)) {
                        s = s.replaceAll("#N2#", CLS371.FLD3470.MTH5311(s1));
                    }
                    else if(!TextUtils.isEmpty(s2)) {
                        String s4 = CLS371.FLD3470.MTH5323(s2);
                        if(TextUtils.isEmpty(s4)) {
                            s4 = CLS66.MTH1452(s1, s2);
                        }
                        s = s.replaceAll("#N2#", s4);
                    }
                    else {
                        s = s.replaceAll("#N2#", "");
                    }
                }
                catch(Throwable unused_ex) {
                    s = s.replaceAll("#N2#", "");
                }
            }
            else {
                s = s.replaceAll("#N2#", "");
            }
        }
        if(CLS502.MTH6934(s, new String[]{"#ID#"}) && !TextUtils.isEmpty(s1)) {
            if(CLS500.FLD4928.MTH6895("text_rep_nickname")) {
                try {
                    s = s.replaceAll("#ID#", (CLS426.MTH6126(s1) && !TextUtils.isEmpty(s2) ? s2 : s1));
                    goto label_26;
                }
                catch(Throwable unused_ex) {
                }
                goto label_25;
            }
            else {
            label_25:
                s = s.replaceAll("#ID#", "");
            }
        }
    label_26:
        if(CLS502.MTH6934(s, new String[]{"#ALIAS#"}) && !TextUtils.isEmpty(s1)) {
            if(CLS500.FLD4928.MTH6895("text_rep_nickname")) {
                try {
                    if(CLS426.MTH6126(s1)) {
                        s5 = TextUtils.isEmpty(s2) ? "" : CLS371.FLD3470.MTH5350(s2);
                    }
                    else {
                        s5 = CLS371.FLD3470.MTH5350(s1);
                    }
                    s = s.replaceAll("#ALIAS#", s5);
                    goto label_35;
                }
                catch(Throwable unused_ex) {
                }
                goto label_34;
            }
            else {
            label_34:
                s = s.replaceAll("#ALIAS#", "");
            }
        }
    label_35:
        if(CLS502.MTH6934(s, new String[]{"#SEX#"}) && !TextUtils.isEmpty(s1)) {
            if(CLS500.FLD4928.MTH6895("text_rep_nickname")) {
                int v = CLS426.MTH6126(s1) ? CLS66.MTH1499(s2) : CLS66.MTH1499(s1);
                if(v == 1) {
                    v1 = 4101203463528829749L;
                }
                else {
                    v1 = v == 2 ? 4101203485003666229L : 4101203515068437301L;
                }
                String s6 = CLS27.MTH889(CLS370.MTH5289(v1));
                try {
                    s = s.replaceAll("#SEX#", s6);
                    goto label_46;
                }
                catch(Throwable unused_ex) {
                }
                goto label_45;
            }
            else {
            label_45:
                s = s.replaceAll("#SEX#", "");
            }
        }
    label_46:
        if(CLS502.MTH6934(s, new String[]{"#R#"}) && !TextUtils.isEmpty(s1)) {
            if(CLS500.FLD4928.MTH6895("text_rep_nickname")) {
                try {
                    if(CLS426.MTH6126(s1)) {
                        s7 = TextUtils.isEmpty(s2) ? "" : CLS290.FLD3007.MTH4759(s2);
                    }
                    else {
                        s7 = CLS290.FLD3007.MTH4759(s1);
                    }
                    s = s.replaceAll("#R#", s7);
                    goto label_55;
                }
                catch(Throwable unused_ex) {
                }
                goto label_54;
            }
            else {
            label_54:
                s = s.replaceAll("#R#", "");
            }
        }
    label_55:
        if(CLS502.MTH6934(s, new String[]{"#T#"}) || CLS502.MTH6934(s, new String[]{"$T["}) && CLS502.MTH6934(s, new String[]{"]#"})) {
            if(CLS500.FLD4928.MTH6895("text_rep_nickname")) {
                int v2 = s.indexOf("#T");
                String s8 = s.substring(v2, (CLS502.MTH6934(s, new String[]{"#T["}) ? s.indexOf("]#") + 2 : v2 + 3));
                SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                if(CLS502.MTH6934(s8, new String[]{"["}) && CLS502.MTH6934(s8, new String[]{"]"})) {
                    simpleDateFormat0 = new SimpleDateFormat(s8.substring(s8.indexOf("[") + 1, s8.indexOf("]")));
                }
                return s.replace(s8, simpleDateFormat0.format(new Date()));
            }
            return s.replaceAll("#T#", "");
        }
        return s;
    }

    public static boolean MTH6940(String s, CharSequence[] arr_charSequence) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        String s1 = s.toLowerCase();
        for(int v = 0; v < arr_charSequence.length; ++v) {
            CharSequence charSequence0 = arr_charSequence[v];
            if(!TextUtils.isEmpty(charSequence0) && s1.contains(charSequence0.toString().toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public static String[] MTH6941(String s) {
        if(TextUtils.isEmpty(s)) {
            return new String[0];
        }
        if(s.contains(",")) {
            return s.split(",");
        }
        if(s.contains(";")) {
            return s.split(";");
        }
        if(s.contains(":")) {
            return s.split(":");
        }
        if(s.contains(" ")) {
            return s.split(" ");
        }
        if(s.contains("，")) {
            return s.split("，");
        }
        if(s.contains("；")) {
            return s.split("；");
        }
        if(s.contains("：")) {
            return s.split("：");
        }
        if(s.contains("\n\r")) {
            return s.split("\n\r");
        }
        return s.contains("\n") ? s.split("\n") : s.split(",");
    }

    // 此方法包含解密的字符串
    public static HashMap MTH6942(String s) {
        HashMap hashMap0 = new HashMap();
        if(s.startsWith("<") && s.endsWith(">")) {
            try {
                XmlPullParser xmlPullParser0 = XmlPullParserFactory.newInstance().newPullParser();
                xmlPullParser0.setInput(new StringReader(s));
                int v = xmlPullParser0.getEventType();
                int v1 = s.indexOf("appid");
                if(v1 != -1) {
                    try {
                        String s1 = s.substring(v1);
                        String s2 = s1.substring(s1.indexOf("\"") + 1, s1.indexOf(" "));
                        hashMap0.put("appid", s2.substring(0, s2.indexOf("\"")));
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            alab1:
                while(true) {
                    switch(v) {
                        case 1: {
                            break alab1;
                        }
                        case 2: {
                            try {
                                String s3 = xmlPullParser0.getName();
                                if("appmsg".equalsIgnoreCase(s3)) {
                                    hashMap0.put("appid", xmlPullParser0.getAttributeValue(0));
                                }
                                else {
                                    String s4 = xmlPullParser0.nextText();
                                    if(hashMap0.containsKey(s3)) {
                                        break;
                                    }
                                    hashMap0.put(s3, s4);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            v = xmlPullParser0.next();
                            break;
                        }
                        default: {
                            v = xmlPullParser0.next();
                            break;
                        }
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return hashMap0;
    }

    public static boolean MTH6943(String s, String[] arr_s) {
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = arr_s[v];
            if(!TextUtils.isEmpty(s1) && s.equalsIgnoreCase(s1)) {
                return true;
            }
        }
        return false;
    }

    public static String MTH6944(int v, String s) {
        if(TextUtils.isEmpty(s)) {
            return s;
        }
        return s.length() <= v ? s : CLS34.MTH1074(new StringBuilder(), s.substring(0, v), 4101222589018198837L);
    }

    // 此方法包含解密的字符串
    public static String MTH6945(String s, String s1, String s2, String s3, String s4, String s5, int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("<url type=\"1\" ");
        if(!TextUtils.isEmpty(s2)) {
            stringBuilder0.append("md5=\"");
            stringBuilder0.append(s2);
            stringBuilder0.append("\" ");
        }
        if(!TextUtils.isEmpty(s3)) {
            stringBuilder0.append("key=\"");
            stringBuilder0.append(s3);
            stringBuilder0.append("\" ");
        }
        if(!TextUtils.isEmpty(s4)) {
            stringBuilder0.append("token=\"");
            stringBuilder0.append(s4);
            stringBuilder0.append("\" ");
        }
        if(v > 0) {
            stringBuilder0.append("enc_idx=\"");
            stringBuilder0.append(v);
            stringBuilder0.append("\"");
        }
        stringBuilder0.append(">");
        stringBuilder0.append("<![CDATA[");
        stringBuilder0.append(s);
        stringBuilder0.append("]]></url>");
        stringBuilder0.append("<thumb type=\"1\" ");
        if(!TextUtils.isEmpty(s3)) {
            stringBuilder0.append("key=\"");
            stringBuilder0.append(s3);
            stringBuilder0.append("\" ");
        }
        if(!TextUtils.isEmpty(s5)) {
            stringBuilder0.append("token=\"");
            stringBuilder0.append(s5);
            stringBuilder0.append("\" ");
        }
        if(v > 0) {
            stringBuilder0.append("enc_idx=\"");
            stringBuilder0.append(v);
            stringBuilder0.append("\"");
        }
        stringBuilder0.append(">");
        stringBuilder0.append("<![CDATA[");
        stringBuilder0.append(s1);
        stringBuilder0.append("]]></thumb>");
        return stringBuilder0.toString();
    }
}

