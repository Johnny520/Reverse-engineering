// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS10;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS573;
import b.ˆʿ.CLS59;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS77.CLS76;
import b.ˈˈ.CLS77;
import b.ˈˈ.CLS79;
import b.ˈˈ.CLS82;
import b.ˈˈ.CLS94;
import b.ˈˈ.CLS97;
import b.ˊﾞ.CLS613;
import b.ˑٴ.CLS139;
import b.ˑٴ.CLS140;
import b.ˑٴ.CLS629;
import b.ˑٴ.CLS654;
import b.ˑٴ.CLS698;
import b.ˑٴ.CLS770;
import b.ˑٴ.CLS794.CLS793;
import b.ˑٴ.CLS794;
import b.ˑٴ.CLS839;
import b.ˑٴ.CLS881;
import b.יᐧ.CLS163;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ـˏ.CLS885;
import b.ـˏ.CLS887;
import b.ـˏ.CLS894;
import b.ᐧˉ.CLS1030;
import b.ᐧˉ.CLS1178;
import b.ᐧˉ.CLS1186;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS262;
import b.ᐧⁱ.CLS1217;
import b.ᐧⁱ.CLS1221;
import b.ᐧⁱ.CLS1222;
import b.ᐧⁱ.CLS1223.CLS278;
import b.ᐧⁱ.CLS1223;
import b.ᐧⁱ.CLS1224;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS353.CLS352;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS423.CLS420;
import b.ⁱᵔ.CLS423.CLS422;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS442.CLS440;
import b.ⁱᵔ.CLS468;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518.CLS516;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS522;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1617.CLS526;
import b.ﾞˎ.CLS1619;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1627;
import b.ﾞˎ.CLS1628;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS534;
import b.ﾞˎ.CLS537;
import b.ﾞˎ.CLS544.CLS543;
import b.ﾞˎ.CLS544;
import b.ﾞˎ.CLS547;
import b.ﾞˎ.CLS556.CLS551;
import b.ﾞˎ.CLS556.CLS552;
import b.ﾞˎ.CLS556.CLS553;
import b.ﾞˎ.CLS556.CLS554;
import b.ﾞˎ.CLS556.CLS555;
import b.ﾞˎ.CLS556;
import b.ﾞᐧ.CLS557;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy.Type;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS1255 implements CLS0, CLS7, CLS13, CLS16, CLS17, CLS39, CLS420, CLS440, CLS516, CLS526, CLS555 {
    public final int FLD3179;
    public final Object FLD3180;
    public final Object FLD3181;

    public CLS1255(Object object0, Object object1, int v) {
        this.FLD3179 = v;
        this.FLD3181 = object0;
        this.FLD3180 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        int v;
        String s = null;
        Object object0 = this.FLD3180;
        Object object1 = this.FLD3181;
        switch(this.FLD3179) {
            case 1: {
                CLS166.MTH3195(((CLS352)object1).FLD3396, CLS27.MTH897("MMAnimateViewClassSetImageFilePathMethod"), new Object[]{((ContentValues)object0).getAsString("file")});
                return;
            }
            case 2: {
                ((CLS35)object1).MTH1102(((Object[])object0));
                return;
            }
            case 7: {
                ((CLS97)object1).FLD412.MTH791(object0);
                return;
            }
            case 9: {
                CLS887 ˈˈ0 = (CLS887)object1;
                String s7 = (String)object0;
                ˈˈ0.getClass();
                try {
                    byte[] arr_b = CLS432.MTH6171(s7);
                    if(arr_b != null) {
                        String s8 = new String(arr_b);
                        if(!TextUtils.isEmpty(s8)) {
                            ˈˈ0.FLD1597 = CLS502.MTH6921(s8);
                            return;
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 10: {
                File file0 = (File)object0;
                ((CLS894)object1).getClass();
                try {
                    MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
                    mediaMetadataRetriever0.setDataSource(file0.getAbsolutePath());
                    s = mediaMetadataRetriever0.extractMetadata(9);
                    mediaMetadataRetriever0.release();
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                int v1 = Math.max((TextUtils.isEmpty(s) ? 1000 : Integer.parseInt(s)), 1000);
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                CLS613.MTH1977(new CLS557(file0.getAbsolutePath()), byteArrayOutputStream0);
                ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
                if(arr_b1.length < 25000) {
                    byte[] arr_b2 = new byte[25000];
                    System.arraycopy(arr_b1, 0, arr_b2, 0, arr_b1.length);
                    arr_b1 = arr_b2;
                }
                if(CLS613.MTH1966(arr_b1, byteArrayOutputStream1) != 0L) {
                    ((CLS894)object1).FLD1623 = v1;
                    ((CLS894)object1).FLD1621 = byteArrayOutputStream1.toByteArray();
                }
                file0.delete();
                return;
            }
            case 13: {
                ((CLS77)object1).MTH1597(((CLS76)object0));
                return;
            }
            case 14: {
                ((CLS79)object1).getClass();
                try {
                    if(CLS79.MTH1649()) {
                        try {
                            Object object2 = CLS166.MTH3194(object0, CLS27.MTH897("ConversationAdapterField1"));
                            if(object2 != null) {
                                CLS166.MTH3195(object2, "clear", new Object[0]);
                            }
                        }
                        catch(Throwable throwable4) {
                            CLS27.MTH893(throwable4);
                        }
                        CLS166.MTH3195(object0, CLS27.MTH897("ConversationAdapterMethod1"), new Object[]{Boolean.TRUE});
                        try {
                            CLS166.MTH3195(object0, "notifyDataSetChanged", new Object[0]);
                        }
                        catch(Throwable throwable5) {
                            CLS27.MTH893(throwable5);
                        }
                        return;
                    }
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 18: {
                CLS794 ᴵʽ0 = ((CLS698)object1).FLD803;
                CLS79 ˎᵢ0 = ᴵʽ0.FLD1147;
                ˎᵢ0.getClass();
                if(!TextUtils.isEmpty(((String)object0))) {
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(((String)object0));
                    ˎᵢ0.MTH1618("wx_chatroom_containers", arrayList0);
                }
                ˎᵢ0.MTH1627();
                ˎᵢ0.MTH1657(((String)object0));
                ᴵʽ0.FLD1147.MTH1633();
                return;
            }
            case 19: {
                ((CLS839)object1).getClass();
                Class class0 = CLS27.MTH894("getChatroomNameClass");
                if(class0 != null) {
                    boolean z = CLS182.MTH3470(0x38EB4B022B3CD335L);
                    Object object3 = ((CLS167)object0).MTH3205();
                    Object object4 = z ? CLS292.MTH4772(4101455320411067189L, "createChatroomField6", CLS292.MTH4772(0x38EB4BC12B3CD335L, "createChatroomField5", CLS292.MTH4772(4101454500072313653L, "createChatroomField4", object3))) : CLS166.MTH3195(CLS182.MTH3492(4101455359065772853L, object3), CLS27.MTH897("radarMethod"), new Object[0]);
                    CLS139 ﹶʼ0 = ((CLS839)object1).FLD1447;
                    CLS29 ˎᵢ1 = ((CLS839)object1).FLD1445;
                    if(object4 != null) {
                        String s9 = (String)CLS166.MTH3192(class0, CLS27.MTH897("getChatroomNameMethod"), new Object[]{CLS182.MTH3492(0x38EB4B962B3CD335L, object4)});
                        ((CLS839)object1).FLD1303 = s9;
                        if(TextUtils.isEmpty(s9)) {
                            ((CLS839)object1).FLD1301 = false;
                            ˎᵢ1.MTH922(Boolean.FALSE, "$aam_start");
                            return;
                        }
                        ˎᵢ1.MTH922(((CLS839)object1).FLD1303, "$aam_chatroom");
                        ((CLS839)object1).FLD1305.add(((CLS839)object1).FLD1303);
                        ˎᵢ1.MTH922(TextUtils.join(",", ((CLS839)object1).FLD1305), "$aam_chatroom_history");
                        if(ﹶʼ0.FLD1438.MTH6895("auto_add_members1")) {
                            CLS66.MTH1523(((CLS839)object1).FLD1303, ˎᵢ1.MTH925("$aam_name", ""));
                        }
                    }
                    boolean z1 = ﹶʼ0.FLD1438.MTH6895("auto_add_members1");
                    ArrayDeque arrayDeque0 = ((CLS839)object1).FLD1307;
                    if(z1) {
                        if(arrayDeque0.isEmpty()) {
                            ((CLS839)object1).FLD1301 = false;
                            ˎᵢ1.MTH922(Boolean.FALSE, "$aam_start");
                            ((CLS839)object1).MTH2899(((CLS839)object1).FLD1303);
                        }
                        else {
                            ((CLS839)object1).MTH2905();
                        }
                    }
                    if(ﹶʼ0.FLD1438.MTH6895("auto_add_members2")) {
                        CLS27.MTH906(("members left: " + arrayDeque0.size()));
                        if(arrayDeque0.isEmpty()) {
                            ((CLS839)object1).FLD1301 = false;
                            ˎᵢ1.MTH922(Boolean.FALSE, "$aam_start");
                            CLS412.MTH6014(((CLS140)(((CLS839)object1))).MTH3042(), CLS27.MTH889("stop") + CLS27.MTH889("aam"));
                            return;
                        }
                        ((CLS839)object1).MTH2905();
                    }
                }
                return;
            }
            case 20: {
                ((CLS629)object1).getClass();
                String s10 = ((CLS629)object1).FLD1445.MTH925("mass_send_exclude", "");
                String s11 = (String)CLS182.MTH3492(4102098130986390325L, ((CLS167)object0).MTH3205());
                HashSet hashSet0 = new HashSet();
                String[] arr_s2 = CLS502.MTH6941(s11);
                for(int v2 = 0; v2 < arr_s2.length; ++v2) {
                    String s12 = arr_s2[v2];
                    if(!CLS502.MTH6934(s10, new String[]{s12})) {
                        hashSet0.add(s12);
                    }
                }
                ((CLS629)object1).MTH2053(TextUtils.join(";", hashSet0));
                return;
            }
            case 22: {
                CLS629.this.MTH2053(((String)object0));
                return;
            }
            case 25: {
                ((CLS770)object1).getClass();
                ((CLS770)object1).MTH2586(((File)object0).getAbsolutePath());
                return;
            }
            case 26: {
                File file1 = (File)object0;
                CLS29 ˎᵢ2 = ((CLS139)object1).FLD1431;
                try {
                    ˎᵢ2.MTH922(Long.toHexString(System.currentTimeMillis()), "backup_time");
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("version", 2);
                    jSONObject0.put("module", "wechatxposed");
                    jSONObject0.put("wxdata", ˎᵢ2.MTH940());
                    CLS21.FLD76.MTH819("export_settings", new Object[]{jSONObject0});
                    if(CLS31.MTH1022(file1)) {
                        CLS31.MTH1030(file1, jSONObject0.toString());
                        return;
                    }
                }
                catch(Throwable throwable6) {
                    CLS27.MTH893(throwable6);
                }
                return;
            }
            default: {
                String s1 = "";
                String s2 = "";
                if(CLS27.MTH895().MTH938("openai_use_proxy", false)) {
                    if("http".equals(CLS27.MTH895().MTH925("openai_proxy_type", "http"))) {
                        String s3 = CLS27.MTH895().MTH925("openai_proxy_http", "");
                        if(!TextUtils.isEmpty(s3)) {
                            s1 = s3;
                        }
                    }
                    else {
                        String s4 = CLS27.MTH895().MTH925("openai_proxy_socks", "");
                        if(!TextUtils.isEmpty(s4)) {
                            s2 = s4;
                        }
                    }
                }
                String s5 = CLS27.MTH882("openai_chatgpt_api_url");
                String s6 = CLS27.MTH895().MTH925("", "");
                if(!TextUtils.isEmpty(s6)) {
                    s5 = s6;
                }
                try {
                    URL uRL0 = new URL(s5);
                    HttpURLConnection.setFollowRedirects(true);
                    if(TextUtils.isEmpty(s1)) {
                        if(!TextUtils.isEmpty(s2) && s2.contains(":")) {
                            String[] arr_s1 = s2.split(":");
                            s = (HttpURLConnection)uRL0.openConnection(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(arr_s1[0], Integer.parseInt(arr_s1[1]))));
                        }
                    }
                    else if(s1.contains(":")) {
                        String[] arr_s = s1.split(":");
                        s = (HttpURLConnection)uRL0.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(arr_s[0], Integer.parseInt(arr_s[1]))));
                    }
                    if(s == null) {
                        s = (HttpURLConnection)uRL0.openConnection();
                    }
                    ((URLConnection)s).setConnectTimeout(3000);
                    ((HttpURLConnection)s).setRequestMethod("HEAD");
                    ((URLConnection)s).setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 6.0; en-US; rv:1.9.1.2) Gecko/20090729 Firefox/3.5.2 (.NET CLR 3.5.30729)");
                    v = ((HttpURLConnection)s).getResponseCode();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                    v = -1;
                }
                if(v == -1 && "openai".equals(CLS404.MTH5890(((String)object1)))) {
                    CLS1186 ⁱᵔ0 = new CLS1186(((CLS1625)object0), 0);
                    CLS40.FLD157.MTH1116(((CLS39)ⁱᵔ0));
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS423$CLS420
    public final void MTH6065(CLS422 ˊⁱ$ᵔʾ0) {
        String s1;
        String s7;
        String s4;
        Object object0 = this.FLD3180;
        Object object1 = this.FLD3181;
        switch(this.FLD3179) {
            case 3: {
                CLS1221 ᵔʾ0 = (CLS1221)object1;
                CLS10 ᐧˉ1 = (CLS10)object0;
                ᵔʾ0.getClass();
                String s3 = ˊⁱ$ᵔʾ0.FLD4070;
                int v1 = ˊⁱ$ᵔʾ0.FLD4071;
                if(v1 != 200) {
                    s4 = CLS27.MTH889("mly_bot") + " err: " + v1;
                    if(!TextUtils.isEmpty(s3)) {
                        s4 = CLS182.MTH3484(4101536486703026997L, CLS182.MTH3483(s4), s3);
                    }
                    if(TextUtils.isEmpty(ˊⁱ$ᵔʾ0.MTH6071())) {
                        CLS412.MTH6011(s4);
                        return;
                    }
                    StringBuilder stringBuilder1 = CLS182.MTH3483(s4);
                    stringBuilder1.append(" ");
                    stringBuilder1.append(ˊⁱ$ᵔʾ0.MTH6071());
                    s4 = stringBuilder1.toString();
                    CLS412.MTH6011(s4);
                    return;
                }
                String s5 = ˊⁱ$ᵔʾ0.MTH6071();
                if(TextUtils.isEmpty(s5)) {
                    if(!TextUtils.isEmpty(s3)) {
                        s4 = CLS27.MTH889("mly_bot") + " err: " + s3;
                        CLS412.MTH6011(s4);
                        return;
                    }
                }
                else if(ᐧˉ1 != null) {
                    try {
                        ᐧˉ1.MTH788(ᵔʾ0.MTH4626(s5));
                        return;
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                return;
            }
            case 4: {
                CLS1222 ⁱʾ0 = (CLS1222)object1;
                CLS10 ᐧˉ2 = (CLS10)object0;
                ⁱʾ0.getClass();
                String s6 = ˊⁱ$ᵔʾ0.FLD4070;
                int v2 = ˊⁱ$ᵔʾ0.FLD4071;
                if(v2 != 200) {
                    s7 = CLS27.MTH889("turing_robot") + " err: " + v2;
                    if(!TextUtils.isEmpty(s6)) {
                        s7 = CLS182.MTH3484(0x38EB97F82B3CD335L, CLS182.MTH3483(s7), s6);
                    }
                    if(TextUtils.isEmpty(ˊⁱ$ᵔʾ0.MTH6071())) {
                        CLS412.MTH6011(s7);
                        return;
                    }
                    StringBuilder stringBuilder2 = CLS182.MTH3483(s7);
                    stringBuilder2.append(" ");
                    stringBuilder2.append(ˊⁱ$ᵔʾ0.MTH6071());
                    s7 = stringBuilder2.toString();
                    CLS412.MTH6011(s7);
                    return;
                }
                String s8 = ˊⁱ$ᵔʾ0.MTH6071();
                if(TextUtils.isEmpty(s8)) {
                    if(!TextUtils.isEmpty(s6)) {
                        s7 = CLS27.MTH889("turing_robot") + " err: " + s6;
                        CLS412.MTH6011(s7);
                        return;
                    }
                }
                else if(ᐧˉ2 != null) {
                    try {
                        ᐧˉ2.MTH788(ⁱʾ0.MTH4629(s8));
                        return;
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                }
                return;
            }
            case 5: {
                CLS1223 ﾞٴ0 = (CLS1223)object1;
                CLS278 ﾞٴ$ˆٴ0 = (CLS278)object0;
                ﾞٴ0.getClass();
                byte[] arr_b = ˊⁱ$ᵔʾ0.FLD4069;
                if(arr_b != null) {
                    String s9 = new String(arr_b);
                    if(!TextUtils.isEmpty(s9)) {
                        try {
                            JSONObject jSONObject0 = new JSONObject(s9);
                            String s10 = jSONObject0.optString("signature");
                            int v3 = jSONObject0.getInt("expiresIn");
                            ﾞٴ0.FLD2900 = s10;
                            ﾞٴ0.FLD2902 = ((long)v3) * 1000L + System.currentTimeMillis();
                            ((CLS1224)ﾞٴ$ˆٴ0).MTH4636(ﾞٴ0.FLD2900);
                            return;
                        }
                        catch(Throwable throwable3) {
                            CLS27.MTH893(throwable3);
                        }
                    }
                }
                return;
            }
            default: {
                CLS1217 ʾᵢ0 = (CLS1217)object1;
                CLS10 ᐧˉ0 = (CLS10)object0;
                ʾᵢ0.getClass();
                String s = ˊⁱ$ᵔʾ0.FLD4070;
                int v = ˊⁱ$ᵔʾ0.FLD4071;
                if(v != 200) {
                    s1 = CLS27.MTH889("ibot_cloud") + " err: " + v;
                    if(!TextUtils.isEmpty(s)) {
                        s1 = CLS182.MTH3484(4101531805188674357L, CLS182.MTH3483(s1), s);
                    }
                    if(TextUtils.isEmpty(ˊⁱ$ᵔʾ0.MTH6071())) {
                        CLS412.MTH6011(s1);
                        return;
                    }
                    StringBuilder stringBuilder0 = CLS182.MTH3483(s1);
                    stringBuilder0.append(" ");
                    stringBuilder0.append(ˊⁱ$ᵔʾ0.MTH6071());
                    s1 = stringBuilder0.toString();
                    CLS412.MTH6011(s1);
                    return;
                }
                String s2 = ˊⁱ$ᵔʾ0.MTH6071();
                if(TextUtils.isEmpty(s2)) {
                    if(!TextUtils.isEmpty(s)) {
                        s1 = CLS27.MTH889("ibot_cloud") + " err: " + s;
                        CLS412.MTH6011(s1);
                    }
                }
                else if(ᐧˉ0 != null) {
                    try {
                        ᐧˉ0.MTH788(ʾᵢ0.MTH4613(s2));
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS442$CLS440
    public final void MTH6221(File file0) {
        CLS881 ﾞˏ0 = (CLS881)this.FLD3181;
        ImageView imageView0 = (ImageView)this.FLD3180;
        ﾞˏ0.getClass();
        if(file0.isFile()) {
            String s = file0.getAbsolutePath();
            ﾞˏ0.FLD1501 = s;
            imageView0.setImageBitmap(CLS518.MTH7074(0x200, 0x200, s));
            CLS1626 ـﹳ0 = ﾞˏ0.FLD1493;
            if(ـﹳ0 != null) {
                ـﹳ0.MTH798(ﾞˏ0.FLD1501);
            }
        }
    }

    @Override  // b.ʻˑ.CLS0, b.ʻˑ.CLS13
    public final void MTH770(String s) {
        ArrayList arrayList0;
        Object object0 = this.FLD3180;
        Object object1 = this.FLD3181;
        if(this.FLD3179 == 16) {
            ((CLS793)object1).getClass();
            ((CLS163)object0).MTH3166();
            String s1 = CLS66.MTH1410(s);
            if(CLS31.MTH1024(s1)) {
                CLS573 ⁱʽ0 = new CLS573(1, ((CLS793)object1));
                if(!CLS66.MTH1416(s1, ((CLS12)ⁱʽ0))) {
                    Object[] arr_object = {s1, new CLS468(ⁱʽ0)};
                    CLS21.FLD76.MTH836("scanQRImage", arr_object);
                }
            }
            return;
        }
        if(CLS31.MTH1024(s)) {
            String s2 = CLS66.MTH1451(object0);
            if(!TextUtils.isEmpty(s2)) {
                CLS69 ʾᵢ0 = new CLS69(s2);
                if(!CLS31.MTH1029(ʾᵢ0)) {
                    CLS518.MTH7050(ʾᵢ0.MTH1553(), s);
                }
            }
            arrayList0 = new ArrayList();
            arrayList0.add(s2);
        }
        else {
            arrayList0 = null;
        }
        ((CLS12)object1).MTH791(arrayList0);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Object object0 = this.FLD3180;
        Object object1 = this.FLD3181;
        if(this.FLD3179 == 0) {
            ((CLS298)object1).getClass();
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            CLS1624 יﹳ0 = new CLS1624(((Activity)object0));
            CLS335 ˑٴ0 = new CLS335(((Activity)object0));
            ArrayList arrayList0 = new ArrayList();
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            JSONArray jSONArray0 = CLS27.MTH895().MTH937("MrTasks", new JSONArray());
            for(int v = 0; v < jSONArray0.length(); ++v) {
                try {
                    JSONObject jSONObject0 = jSONArray0.getJSONObject(v);
                    if(jSONObject0.has("id")) {
                        ContentValues contentValues0 = new ContentValues();
                        contentValues0.put("id", jSONObject0.getString("id"));
                        StringBuilder stringBuilder0 = new StringBuilder();
                        int v1 = jSONObject0.getInt("type");
                        if(v1 == 0) {
                            stringBuilder0.append("<b>");
                            stringBuilder0.append(CLS27.MTH889("send"));
                            stringBuilder0.append("</b><br>");
                        }
                        else if(v1 == 1) {
                            stringBuilder0.append("<b>");
                            stringBuilder0.append(CLS27.MTH889("delete"));
                            stringBuilder0.append("</b><br>");
                        }
                        else if(v1 == 2) {
                            stringBuilder0.append("<b>");
                            stringBuilder0.append(CLS27.MTH889("forward"));
                            stringBuilder0.append("</b><br>");
                        }
                        if(jSONObject0.has("executeTime")) {
                            long v2 = jSONObject0.optLong("executeTime");
                            if(v2 != 0L) {
                                stringBuilder0.append("<i>");
                                stringBuilder0.append(CLS27.MTH889("last_execution_time"));
                                stringBuilder0.append(simpleDateFormat0.format(v2));
                                stringBuilder0.append("</i><br>");
                            }
                        }
                        if(jSONObject0.has("schedule")) {
                            long v3 = jSONObject0.getLong("schedule");
                            if(v3 != 0L) {
                                stringBuilder0.append("<i>");
                                stringBuilder0.append(CLS27.MTH889("next_execution_time"));
                                stringBuilder0.append(simpleDateFormat0.format(v3));
                                stringBuilder0.append("</i><br>");
                            }
                        }
                        if(jSONObject0.has("repeat")) {
                            int v4 = jSONObject0.getInt("repeat");
                            stringBuilder0.append("<i>");
                            stringBuilder0.append(CLS27.MTH889("repeat_number"));
                            stringBuilder0.append(": ");
                            stringBuilder0.append(v4);
                            stringBuilder0.append("</i><br>");
                        }
                        if(jSONObject0.has("content")) {
                            stringBuilder0.append("<br>");
                            stringBuilder0.append(jSONObject0.getString("content"));
                        }
                        contentValues0.put("desc", stringBuilder0.toString());
                        arrayList0.add(contentValues0);
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            ˑٴ0.MTH5111(arrayList0);
            יﹳ0.MTH7303(ˑٴ0);
            יﹳ0.MTH7308(5);
            יﹳ0.MTH7301(new CLS302(((CLS298)object1), ˑٴ0, ((Activity)object0), arrayList0, 0));
            CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
            return;
        }
        CLS556 ﾞٴ0 = (CLS556)object1;
        ﾞٴ0.getClass();
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
        CLS525 ʻˑ0 = new CLS525(((Activity)object0), linearLayout1, menu0);
        ʻˑ0.MTH7187("reset_to_default", ((CLS3)new CLS1627(0, ﾞٴ0)));
        ʻˑ0.MTH7188();
        CLS544 ᵔʾ0 = new CLS544(((Activity)object0));
        ﾞٴ0.FLD5414 = ᵔʾ0;
        ᵔʾ0.setOnColorSelectedListener(((CLS543)new CLS1229(14, ﾞٴ0)));
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(CLS523.MTH7137(200), CLS523.MTH7137(200));
        linearLayout$LayoutParams0.gravity = 17;
        linearLayout1.addView(ﾞٴ0.FLD5414, linearLayout$LayoutParams0);
        View view0 = new View(((Activity)object0));
        ﾞٴ0.FLD5413 = view0;
        linearLayout1.addView(view0, new LinearLayout.LayoutParams(-1, CLS523.MTH7137(15)));
        CLS1623 יᐧ0 = new CLS1623(((Activity)object0));
        CLS1622 ˑٴ1 = new CLS1622(((Activity)object0));
        ﾞٴ0.FLD5422 = ˑٴ1;
        ˑٴ1.FLD5243 = true;
        יᐧ0.MTH7296(ˑٴ1);
        CLS1628 ᐧי0 = new CLS1628(((Activity)object0));
        ᐧי0.FLD5320 = true;
        ᐧי0.MTH800(CLS27.MTH889("red"));
        ﾞٴ0.FLD5421 = ᐧי0.FLD5315;
        ᐧי0.FLD5315.setMax(0xFF);
        int v5 = Build.VERSION.SDK_INT;
        SeekBar seekBar0 = ﾞٴ0.FLD5421;
        if(v5 >= 21) {
            seekBar0.setProgressTintList(ColorStateList.valueOf(0xFFFF0000));
        }
        else {
            seekBar0.getProgressDrawable().setColorFilter(0xFFFF0000, PorterDuff.Mode.SRC_IN);
        }
        ﾞٴ0.FLD5421.setOnSeekBarChangeListener(new CLS553(ﾞٴ0, ᐧי0));
        ᐧי0.FLD5318 = new CLS537(ﾞٴ0, ((Activity)object0), ᐧי0, 0);
        יᐧ0.MTH7296(ᐧי0);
        CLS1628 ᐧי1 = new CLS1628(((Activity)object0));
        ᐧי1.FLD5320 = true;
        ᐧי1.MTH800(CLS27.MTH889("green"));
        ﾞٴ0.FLD5408 = ᐧי1.FLD5315;
        ᐧי1.FLD5315.setMax(0xFF);
        SeekBar seekBar1 = ﾞٴ0.FLD5408;
        if(v5 >= 21) {
            seekBar1.setProgressTintList(ColorStateList.valueOf(0xFF00FF00));
        }
        else {
            seekBar1.getProgressDrawable().setColorFilter(0xFF00FF00, PorterDuff.Mode.SRC_IN);
        }
        ﾞٴ0.FLD5408.setOnSeekBarChangeListener(new CLS552(ﾞٴ0, ᐧי1));
        ᐧי1.FLD5318 = new CLS537(ﾞٴ0, ((Activity)object0), ᐧי1, 1);
        יᐧ0.MTH7296(ᐧי1);
        CLS1628 ᐧי2 = new CLS1628(((Activity)object0));
        ᐧי2.FLD5320 = true;
        ᐧי2.MTH800(CLS27.MTH889("blue"));
        ﾞٴ0.FLD5409 = ᐧי2.FLD5315;
        ᐧי2.FLD5315.setMax(0xFF);
        SeekBar seekBar2 = ﾞٴ0.FLD5409;
        if(v5 >= 21) {
            seekBar2.setProgressTintList(ColorStateList.valueOf(0xFF0000FF));
        }
        else {
            seekBar2.getProgressDrawable().setColorFilter(0xFF0000FF, PorterDuff.Mode.SRC_IN);
        }
        ﾞٴ0.FLD5409.setOnSeekBarChangeListener(new CLS554(ﾞٴ0, ᐧי2));
        ᐧי2.FLD5318 = new CLS537(ﾞٴ0, ((Activity)object0), ᐧי2, 2);
        יᐧ0.MTH7296(ᐧי2);
        if(ﾞٴ0.FLD5420) {
            CLS1628 ᐧי3 = new CLS1628(((Activity)object0));
            ᐧי3.FLD5320 = true;
            ᐧי3.MTH800(CLS27.MTH889("alpha"));
            ﾞٴ0.FLD5412 = ᐧי3.FLD5315;
            ᐧי3.FLD5315.setMax(0xFF);
            SeekBar seekBar3 = ﾞٴ0.FLD5412;
            if(v5 >= 21) {
                seekBar3.setProgressTintList(ColorStateList.valueOf(-1));
            }
            else {
                seekBar3.getProgressDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            }
            ﾞٴ0.FLD5412.setOnSeekBarChangeListener(new CLS551(ﾞٴ0, ᐧי3));
            ᐧי3.FLD5318 = new CLS537(ﾞٴ0, ((Activity)object0), ᐧי3, 3);
            יᐧ0.MTH7296(ᐧי3);
        }
        ﾞٴ0.FLD5422.FLD5246.setOnEditorActionListener(new CLS547(ﾞٴ0, ((Activity)object0)));
        יᐧ0.MTH7290(linearLayout1, CLS523.MTH7137(3));
        ﾞٴ0.MTH7431(ﾞٴ0.FLD5419);
        ﾞٴ0.MTH7430();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS518$CLS516
    public final void MTH7045(Bitmap bitmap0) {
        ((CLS885)this.FLD3181).getClass();
        byte[] arr_b = CLS518.MTH7054(bitmap0);
        ((HashMap)this.FLD3180).put("thumbData", arr_b);
        ((CLS885)this.FLD3181).FLD1589 = true;
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1617$CLS526
    public final void MTH7191(LinearLayout linearLayout0) {
        ((CLS1030)this.FLD3181).getClass();
        CLS1623 יᐧ0 = new CLS1623(((Activity)this.FLD3180));
        CLS1622 ˑٴ0 = new CLS1622(((Activity)this.FLD3180));
        String s = CLS182.MTH3469(4100975886096716597L, ˑٴ0, 4100975967701095221L);
        ˑٴ0.MTH7277(((CLS1030)this.FLD3181).FLD2151.MTH925(s, ""));
        ˑٴ0.FLD5252 = new CLS1178(((CLS1030)this.FLD3181), 5);
        יᐧ0.MTH7296(ˑٴ0);
        CLS1635 ﾞᵎ0 = new CLS1635(((Activity)this.FLD3180));
        ﾞᵎ0.MTH800(CLS27.MTH889("use_proxy"));
        ﾞᵎ0.MTH7437(((CLS1030)this.FLD3181).FLD2151.MTH938("openai_use_proxy", false));
        ﾞᵎ0.MTH7438(new CLS262(((CLS1030)this.FLD3181), 8));
        CLS1622 ˑٴ1 = CLS182.MTH3486(יᐧ0, ﾞᵎ0, ((Activity)this.FLD3180));
        CLS1622 ˑٴ2 = new CLS1622(((Activity)this.FLD3180));
        CLS1629 ⁱˉ0 = new CLS1629(((Activity)this.FLD3180));
        ⁱˉ0.MTH7372("http", "http");
        ⁱˉ0.MTH7372("socks", "socks");
        ⁱˉ0.FLD5356 = new CLS1259(((CLS1030)this.FLD3181), ˑٴ1, ˑٴ2, 15);
        ⁱˉ0.MTH7375(((CLS1030)this.FLD3181).FLD2151.MTH925("openai_proxy_type", "http"));
        יᐧ0.MTH7296(ⁱˉ0);
        ˑٴ1.MTH800(CLS27.MTH889("proxy_http"));
        ˑٴ1.FLD5256 = CLS27.MTH889("proxy_hint");
        ˑٴ1.MTH7277(((CLS1030)this.FLD3181).FLD2151.MTH925("openai_proxy_http", ""));
        ˑٴ1.FLD5252 = new CLS1178(((CLS1030)this.FLD3181), 6);
        יᐧ0.MTH7296(ˑٴ1);
        ˑٴ2.MTH800(CLS27.MTH889("proxy_socks"));
        ˑٴ2.FLD5256 = CLS27.MTH889("proxy_hint");
        ˑٴ2.MTH7277(((CLS1030)this.FLD3181).FLD2151.MTH925("openai_proxy_socks", ""));
        ˑٴ2.FLD5252 = new CLS1178(((CLS1030)this.FLD3181), 7);
        יᐧ0.MTH7296(ˑٴ2);
        if("http".equals(((CLS1030)this.FLD3181).FLD2151.MTH925("openai_proxy_type", "http"))) {
            ˑٴ1.MTH801(0);
            ˑٴ2.MTH801(8);
        }
        else {
            ˑٴ1.MTH801(8);
            ˑٴ2.MTH801(0);
        }
        יᐧ0.MTH7290(linearLayout0, 0);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        Object object0 = this.FLD3180;
        Object object1 = this.FLD3181;
        switch(this.FLD3179) {
            case 15: {
                ((CLS794)object1).getClass();
                if(!TextUtils.isEmpty(s)) {
                    CLS372.MTH5405(((ArrayList)object0));
                    CLS387.MTH5585(false, ((CLS140)(((CLS794)object1))).MTH3042(), ((ArrayList)object0), ((CLS2)new CLS654(s)), null, -1);
                }
                return;
            }
            case 17: {
                ArrayList arrayList1 = new ArrayList(((HashSet)object0));
                CLS314.FLD3231.MTH5003(((String)object1), s, arrayList1);
                CLS314.FLD3231.MTH5002();
                return;
            }
            default: {
                ((CLS881)object1).getClass();
                CLS534 ˈˈ0 = ((CLS1620)object0).FLD5219;
                String s1 = ((CLS881)object1).FLD1495.FLD398;
                ArrayList arrayList0 = ˈˈ0.FLD5195;
                if(arrayList0.contains(s1)) {
                    arrayList0.remove(s1);
                    arrayList0.add(s);
                    ˈˈ0.FLD5196.notifyDataSetChanged();
                    ˈˈ0.MTH7228(s);
                }
                CLS94 ⁱˉ0 = ((CLS881)object1).FLD1495;
                CLS59 ⁱᵔ0 = ((CLS881)object1).FLD1500;
                ⁱᵔ0.getClass();
                if(ⁱˉ0 != null && !TextUtils.isEmpty(s)) {
                    ⁱᵔ0.FLD182.remove(ⁱˉ0.FLD398);
                    if(CLS59.MTH1282(ⁱˉ0)) {
                        String s2 = ⁱˉ0.FLD398;
                        String s3 = CLS31.MTH979(s, "png");
                        ((Boolean)CLS21.FLD76.MTH816("core", "renameModuleFile", new Object[]{2, s2, s3})).booleanValue();
                    }
                    ⁱˉ0.FLD398 = s;
                    ⁱᵔ0.MTH1281(ⁱˉ0);
                    ⁱᵔ0.MTH1287();
                }
            }
        }
    }

    @Override  // b.ﾞˎ.CLS556$CLS555
    public final void MTH7428(int v, String s) {
        CLS1619 ˉᐧ0 = (CLS1619)this.FLD3181;
        CLS1626 ـﹳ0 = (CLS1626)this.FLD3180;
        ˉᐧ0.getClass();
        try {
            ˉᐧ0.FLD5208.MTH7428(v, s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        ـﹳ0.MTH7325(s);
        int v1 = CLS522.MTH7110(s);
        ـﹳ0.FLD5302.setTextColor(v1);
    }

    @Override  // b.ʻˑ.CLS7
    public final void MTH784(Object object0) {
        CLS629 ʻˋ0 = (CLS629)this.FLD3181;
        String s = (String)this.FLD3180;
        ʻˋ0.getClass();
        if(((CLS82)object0) != null) {
            ʻˋ0.FLD1447.MTH3018(((CLS82)object0), s);
        }
    }
}

