// Decompiled by JEB v5.42.0.202606242140

package b.ᐧⁱ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS10;
import b.ʻˑ.CLS14;
import b.ʾᵢ.CLS27;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1255;
import b.ⁱᵔ.CLS423.CLS420;
import b.ⁱᵔ.CLS423;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Random;

public final class CLS1217 implements CLS14 {
    public final char[] FLD2887;
    public final String FLD2888;
    public final String FLD2889;
    public final String FLD2890;

    // 此方法包含解密的字符串
    public CLS1217(String s, String s1, String s2) {
        this.FLD2887 = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        this.FLD2889 = s.trim();
        this.FLD2888 = s1.trim();
        this.FLD2890 = s2.trim();
    }

    // 去混淆评级： 低(28)
    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS14
    public final void MTH793(String s, String s1, String s2, String s3, CLS10 ᐧˉ0) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(this.FLD2889)) {
            String s4 = this.FLD2890;
            if(!TextUtils.isEmpty(s4) && !TextUtils.isEmpty(this.FLD2888)) {
                try {
                    CLS423 ˊⁱ0 = new CLS423(CLS27.MTH882("xiaoiurl") + "?platform=custom");
                    ˊⁱ0.FLD4072 = CLS27.MTH895().MTH927(15000, "ibot_read_timeout");
                    ˊⁱ0.FLD4076 = CLS27.MTH895().MTH927(15000, "ibot_connection_timeout");
                    ˊⁱ0.FLD4078 = "POST";
                    ˊⁱ0.FLD4085 = true;
                    String s5 = CLS27.MTH882("useragent");
                    ˊⁱ0.FLD4083.put("User-Agent", s5);
                    ˊⁱ0.FLD4083.put("Connection", "Keep-Alive");
                    ˊⁱ0.FLD4083.put("Cache-Control", "no-cache");
                    ˊⁱ0.FLD4083.put("Pragma", "no-cache");
                    String s6 = this.MTH4614(new URL(CLS27.MTH882("xiaoiurl") + "?platform=custom"));
                    ˊⁱ0.FLD4083.put("X-Auth", s6);
                    ˊⁱ0.FLD4083.put("Accept", "*/*");
                    ˊⁱ0.MTH6077("Content-Type", CLS27.MTH882("contenttype"));
                    ˊⁱ0.FLD4073 = "question=" + URLEncoder.encode(s, "UTF-8") + "&userId=" + URLEncoder.encode(s4, "UTF-8") + "&type=" + URLEncoder.encode("0", "UTF-8");
                    ˊⁱ0.MTH6078(((CLS420)new CLS1255(this, ᐧˉ0, 6)));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final ArrayList MTH4613(String s) {
        ArrayList arrayList0 = new ArrayList();
        if(!TextUtils.isEmpty(s)) {
            try {
                String s1 = s.trim();
                if(s1.contains(CLS27.MTH882("xiaoi2"))) {
                    s1 = s1.replaceAll(CLS27.MTH882("xiaoi2"), CLS27.MTH884());
                }
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("type", "text");
                contentValues0.put("content", s1);
                arrayList0.add(contentValues0);
                return arrayList0;
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public final String MTH4614(URL uRL0) {
        String s = uRL0.getPath();
        String[] arr_s = new String[3];
        String s1 = this.FLD2889;
        arr_s[0] = s1;
        arr_s[1] = "xiaoi.com";
        arr_s[2] = this.FLD2888;
        String s2 = CLS1217.MTH4615(arr_s);
        StringBuilder stringBuilder0 = new StringBuilder();
        Random random0 = new Random();
        random0.setSeed(System.currentTimeMillis());
        for(int v = 0; v < 40; ++v) {
            stringBuilder0.append(this.FLD2887[random0.nextInt(this.FLD2887.length)]);
        }
        String s3 = stringBuilder0.toString();
        String s4 = CLS1217.MTH4615(new String[]{s2, s3, CLS1217.MTH4615(new String[]{"POST", s})});
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("app_key=\"");
        stringBuilder1.append(s1);
        stringBuilder1.append("\", nonce=\"");
        stringBuilder1.append(s3);
        stringBuilder1.append("\", signature=\"");
        stringBuilder1.append(s4);
        return CLS182.MTH3475(4101530984849920821L, stringBuilder1);
    }

    // 此方法包含解密的字符串
    public static String MTH4615(String[] arr_s) {
        String s = TextUtils.join(":", arr_s);
        try {
            byte[] arr_b = MessageDigest.getInstance("SHA-1").digest(s.getBytes(StandardCharsets.UTF_8));
            StringBuilder stringBuilder0 = new StringBuilder();
            for(int v = 0; v < arr_b.length; ++v) {
                stringBuilder0.append(String.format("%02x", ((byte)arr_b[v])));
            }
            return stringBuilder0.toString();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }
}

