// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS13;
import b.ʻˑ.CLS15;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS6;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS33;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS574;
import b.ˆʿ.CLS44;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS91;
import b.ˈˈ.CLS97;
import b.ˑٴ.CLS115;
import b.ˑٴ.CLS640;
import b.ˑٴ.CLS737;
import b.ˑٴ.CLS764;
import b.יᐧ.CLS145;
import b.יﹳ.CLS166;
import b.ـˏ.CLS894;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1246;
import b.ᵔʾ.CLS1257;
import b.ᵔʾ.CLS1258;
import b.ⁱʾ.CLS1265;
import b.ⁱˉ.CLS370;
import b.ﾞˎ.CLS1627;
import java.io.File;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

public final class CLS466 {
    public static HashMap FLD4531;
    public static HashSet FLD4532;

    // 此方法包含解密的字符串
    public static void MTH6500(String s, String s1) {
        String s2;
        CLS91 ᵔʾ0;
        CLS44 ˆٴ0 = (CLS44)CLS40.FLD157.MTH1118(CLS44.class);
        CLS29 ˎᵢ0 = CLS27.MTH895();
        String[] arr_s = null;
        if(CLS182.MTH3480(4100889707577922357L, CLS182.MTH3483(s), ˎᵢ0, false)) {
            CLS29 ˎᵢ1 = CLS27.MTH895();
            if(CLS182.MTH3480(0x38E949032B3CD335L, CLS182.MTH3483(s), ˎᵢ1, false)) {
                String[] arr_s1 = {CLS182.MTH3475(4100889308145963829L, CLS182.MTH3483(s)), "_ANY_tail_"};
                ˆٴ0.getClass();
                ArrayList arrayList0 = new ArrayList();
                for(int v = 0; v < 2; ++v) {
                    arrayList0.addAll(ˆٴ0.MTH1173(arr_s1[v]));
                }
                ᵔʾ0 = CLS44.MTH1179(arrayList0);
            }
            else {
                StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                stringBuilder0.append("_tail");
                ᵔʾ0 = ˆٴ0.MTH1184(stringBuilder0.toString());
            }
        }
        else {
            ᵔʾ0 = ˆٴ0.MTH1184("_ANY_tail_");
        }
        s2 = ᵔʾ0 == null ? null : ᵔʾ0.MTH1735();
        String s3 = CLS27.MTH882("tailmsg2");
        if(!TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s3)) {
            try {
                if(CLS502.MTH6934(s2, new String[]{"#T"})) {
                    int v1 = s2.indexOf("#T");
                    String s4 = s2.substring(v1, (CLS502.MTH6934(s2, new String[]{"#T["}) ? s2.indexOf("]") + 1 : v1 + 2));
                    SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    if(CLS502.MTH6934(s4, new String[]{"["}) && CLS502.MTH6934(s4, new String[]{"]"})) {
                        simpleDateFormat0 = new SimpleDateFormat(s4.substring(s4.indexOf("[") + 1, s4.indexOf("]")));
                    }
                    s2 = s2.replace(s4, simpleDateFormat0.format(new Date()));
                }
                if(CLS502.MTH6934(s2, new String[]{"|"})) {
                    arr_s = s2.split(Pattern.quote("|"));
                }
                else if(CLS502.MTH6934(s2, new String[]{"#"})) {
                    arr_s = s2.split("#");
                }
                if(arr_s == null) {
                    return;
                }
                String s5 = arr_s[0].trim();
                String s6 = arr_s[1].trim();
                CLS466.MTH6505(s, String.format(s3, "<![CDATA[" + s1 + "]]>", -1L, CLS27.MTH904(), s, s5, s6));
            }
            catch(Throwable throwable0) {
                CLS466.MTH6542(s, s1);
                CLS27.MTH893(throwable0);
            }
            return;
        }
        CLS466.MTH6542(s, s1);
    }

    // 此方法包含解密的字符串
    public static void MTH6501(String s, String s1) {
        try {
            Intent intent0 = new Intent();
            intent0.putExtra("Kdescription", CLS466.MTH6541(s1));
            intent0.putExtra("need_result", true);
            intent0.putExtra("Ksnsupload_type", 21);
            intent0.putExtra("ksnsupload_finder_live_xml", s.substring(s.indexOf("<finderLive>"), s.indexOf("</finderLive>") + 13));
            if(!CLS66.MTH1450("sns", ".ui.SnsUploadUI", intent0)) {
                Activity activity0 = CLS404.MTH5891();
                intent0.setClassName(activity0, CLS27.MTH897("SnsUploadUI"));
                activity0.startActivity(intent0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static void MTH6502(String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            if(CLS502.MTH6934(s, new String[]{"<?xml"})) {
                HashMap hashMap0 = CLS392.MTH5633(s, "msg");
                String s2 = hashMap0 == null || hashMap0.isEmpty() || !hashMap0.containsKey(".msg.$username") ? "" : ((String)hashMap0.get(".msg.$username"));
                if(TextUtils.isEmpty(s2)) {
                    return;
                }
                if(!CLS372.MTH5400(s2) && CLS371.FLD3470.MTH5382(s2)) {
                    s = CLS66.MTH1370(s2);
                }
            }
            CLS66.MTH1468((CLS372.MTH5406(s1) ? 66 : 42), s1, s);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6503(String s, String s1) {
        try {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            File file0 = new File(s);
            if(!CLS31.MTH1001(file0)) {
                return;
            }
            File file1 = new File(CLS31.MTH1038(CLS27.MTH900()), "temp_share_img0");
            CLS31.MTH1025(file0, file1);
            Activity activity0 = CLS404.MTH5891();
            Uri uri0 = CLS66.MTH1491(activity0, file1);
            if(uri0 == null) {
                return;
            }
            Intent intent0 = new Intent();
            intent0.setAction("android.intent.action.SEND");
            intent0.putExtra("android.intent.extra.STREAM", uri0);
            intent0.setType(s1);
            intent0.addFlags(1);
            activity0.startActivity(Intent.createChooser(intent0, CLS27.MTH889("share")));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6504(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            Intent intent0 = new Intent();
            intent0.putExtra("Kdescription", CLS466.MTH6541(s));
            intent0.putExtra("Ksnsupload_type", 9);
            intent0.putExtra("WeXposed_TEXT", true);
            if(!CLS66.MTH1450("sns", ".ui.SnsUploadUI", intent0)) {
                Activity activity0 = CLS404.MTH5891();
                intent0.setClassName(activity0, CLS27.MTH897("SnsUploadUI"));
                activity0.startActivity(intent0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6505(String s, String s1) {
        CLS66.MTH1468(0x31000031, s, s1);
        ContentValues contentValues0 = CLS371.MTH5368(CLS371.FLD3470.MTH5315(s));
        if(contentValues0 == null) {
            return;
        }
        long v = CLS34.MTH1080(4100889497124524853L, contentValues0);
        try {
            if(CLS27.MTH894("dbClass1") != null) {
                Class class0 = CLS27.MTH894("SendAppMsgClass");
                Class class1 = CLS27.MTH894("SendAppMsgClass2");
                Class class2 = CLS27.MTH894("SendAppMsgClass3");
                Object object0 = null;
                if(class0 != null) {
                    object0 = CLS166.MTH3188(class0, new Object[]{v, null, ""});
                }
                else if(class1 != null) {
                    object0 = CLS166.MTH3188(class1, new Object[]{v, null});
                }
                else if(class2 != null) {
                    object0 = CLS166.MTH3188(class2, new Object[]{v});
                }
                CLS66.MTH1521(object0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6506(File file0) {
        String s;
        if(!CLS31.MTH1001(file0)) {
            return;
        }
        Uri uri0 = CLS66.MTH1491(CLS27.MTH900(), file0);
        if(uri0 == null) {
            return;
        }
        Intent intent0 = new Intent("android.intent.action.SEND");
        Context context0 = CLS27.MTH900();
        if("content".equals(uri0.getScheme())) {
            s = context0.getContentResolver().getType(uri0);
        }
        else {
            String s1 = MimeTypeMap.getFileExtensionFromUrl(uri0.toString());
            s = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s1.toLowerCase());
        }
        intent0.setType(s);
        intent0.putExtra("android.intent.extra.STREAM", uri0);
        CLS404.MTH5891().startActivity(Intent.createChooser(intent0, CLS27.MTH889("share")));
    }

    public static void MTH6507(String s, CLS12 ᵔʾ0, boolean z, int v) {
        CLS1265 ʻˑ0 = new CLS1265(ᵔʾ0, s, z);
        CLS40.FLD157.MTH1123(((CLS39)ʻˑ0), ((long)v));
    }

    // 此方法包含解密的字符串
    public static void MTH6508(String s, String s1) {
        try {
            Intent intent0 = new Intent();
            intent0.putExtra("Kdescription", CLS466.MTH6541(s1));
            intent0.putExtra("finder_post_from_sns_type", 0);
            intent0.putExtra("Ksnsupload_type", 17);
            intent0.putExtra("ksnsupload_finder_object_xml", s.substring(s.indexOf("<finderFeed>"), s.indexOf("</finderFeed>") + 13));
            if(!CLS66.MTH1450("sns", ".ui.SnsUploadUI", intent0)) {
                Activity activity0 = CLS404.MTH5891();
                intent0.setClassName(activity0, CLS27.MTH897("SnsUploadUI"));
                activity0.startActivity(intent0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static void MTH6509() {
        try {
            File[] arr_file = CLS31.MTH1038(CLS27.MTH900()).listFiles(new CLS418(1));
            if(arr_file == null) {
                return;
            }
        label_4:
            for(int v = 0; v < arr_file.length; ++v) {
                CLS31.MTH1011(arr_file[v]);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            if(true) {
                return;
            }
            goto label_4;
        }
    }

    // 此方法包含解密的字符串
    public static String MTH6510(String s) {
        long v = System.currentTimeMillis();
        String s1 = new SimpleDateFormat("ssHHmmMMddyy").format(new Date(v));
        if(TextUtils.isEmpty(s)) {
            s1 = CLS182.MTH3475(4100893835041493813L, CLS182.MTH3483(s1));
        }
        else {
            String s2 = CLS31.MTH970(s.getBytes());
            if(!TextUtils.isEmpty(s2)) {
                StringBuilder stringBuilder0 = CLS182.MTH3483(s1);
                stringBuilder0.append(s2.substring(0, 7));
                s1 = stringBuilder0.toString();
            }
        }
        StringBuilder stringBuilder1 = CLS182.MTH3483(s1);
        stringBuilder1.append(String.format("%04x", ((long)(v % 0xFFFFL))));
        stringBuilder1.append(v % 7L + 100L);
        return stringBuilder1.toString();
    }

    // 此方法包含解密的字符串
    public static String MTH6511(long v) {
        String s = "";
        Cursor cursor0 = CLS396.FLD3775.MTH5763(v);
        if(cursor0 == null) {
            return "";
        }
        if(cursor0.moveToFirst()) {
            s = CLS182.MTH3472(4100891966730720053L, cursor0);
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return s;
    }

    // 此方法包含解密的字符串
    public static void MTH6512(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            Intent intent0 = new Intent("android.intent.action.SEND");
            intent0.setType("text/plain");
            intent0.addFlags(1);
            intent0.putExtra("android.intent.extra.TEXT", s);
            CLS404.MTH5891().startActivity(Intent.createChooser(intent0, CLS27.MTH889("share")));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6513(String s, String s1, String s2) {
        String s6;
        long v;
        String s3;
        if(TextUtils.isEmpty(s2)) {
            return;
        }
        if(TextUtils.isEmpty(s1)) {
            s1 = CLS182.MTH3473(4100889587318838069L, CLS27.MTH895(), "encrypted_tag");
        }
        if(CLS426.MTH6126(s)) {
            StringBuilder stringBuilder0 = CLS182.MTH3483(s);
            stringBuilder0.append(CLS27.MTH904());
            s3 = stringBuilder0.toString();
        }
        else {
            s3 = CLS27.MTH904();
        }
        String s4 = CLS27.MTH889("encrypted") + s2;
        if(TextUtils.isEmpty(s4)) {
            v = 4101250635154641717L;
            s6 = CLS370.MTH5289(v);
            CLS66.MTH1486(s, String.format(CLS27.MTH882("tailmsg"), s1, s1, s6, CLS27.MTH904()), null, 0L);
            return;
        }
        else {
            try {
                String s5 = CLS31.MTH970((CLS27.MTH898(CLS27.MTH882("lic")) + CLS27.MTH882("cert") + s3).getBytes());
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append("#*");
                if(!TextUtils.isEmpty(s5) && !TextUtils.isEmpty(s4)) {
                    try {
                        s4 = CLS33.MTH1054(s5, s4);
                    }
                    catch(Throwable unused_ex) {
                        s4 = "";
                    }
                }
                stringBuilder1.append(s4);
                stringBuilder1.append("*#");
                s6 = stringBuilder1.toString();
                goto label_29;
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                v = 0x38EA9E492B3CD335L;
            }
            s6 = CLS370.MTH5289(v);
        }
    label_29:
        CLS66.MTH1486(s, String.format(CLS27.MTH882("tailmsg"), s1, s1, s6, CLS27.MTH904()), null, 0L);
    }

    // 此方法包含解密的字符串
    public static void MTH6514(String s, String s1) {
        try {
            Intent intent0 = new Intent("android.intent.action.SEND");
            intent0.setType("text/plain");
            intent0.putExtra("android.intent.extra.SUBJECT", s);
            intent0.putExtra("android.intent.extra.TEXT", s1);
            intent0.addFlags(1);
            CLS404.MTH5891().startActivity(Intent.createChooser(intent0, CLS27.MTH889("share")));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6515(String s, String s1, String s2) {
        if(!CLS66.MTH1486(s, String.format(CLS27.MTH882("appmsg1"), new Object[]{CLS502.MTH6922(s1), CLS502.MTH6922(s1), CLS502.MTH6922(s2), CLS27.MTH904()}), null, 0L)) {
            CLS466.MTH6542(s, s2);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6516(File file0) {
        try {
            if(!CLS31.MTH1001(file0)) {
                return;
            }
            File file1 = new File(CLS31.MTH1038(CLS27.MTH900()), "temp_share_vid");
            CLS31.MTH1025(file0, file1);
            CLS466.MTH6528(file1);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6517(Object object0, String s, CLS13 ⁱʽ0, boolean z) {
        ProgressDialog progressDialog1;
        try {
            String s1 = CLS66.MTH1485(object0, s);
            if(CLS31.MTH975(s1)) {
                CLS412.MTH5998(((CLS3)new CLS1471(ⁱʽ0, s1, 8)));
                return;
            }
            String s2 = CLS66.MTH1451(object0);
            long v = Long.parseLong(s.substring(s.lastIndexOf("_") + 1));
            if(z) {
                ProgressDialog progressDialog0 = new ProgressDialog(CLS404.MTH5891());
                progressDialog0.setIndeterminate(true);
                progressDialog0.setMessage(CLS27.MTH889("loading_video"));
                progressDialog0.setCancelable(true);
                progressDialog0.show();
                progressDialog1 = progressDialog0;
            }
            else {
                progressDialog1 = null;
            }
            if(object0 != null && !TextUtils.isEmpty(s)) {
                boolean[] arr_z = {false};
                if(z) {
                    progressDialog1.setOnCancelListener(new CLS498(2, arr_z));
                }
                if(TextUtils.isEmpty(s2) && TextUtils.isEmpty(s1)) {
                    CLS466.MTH6546(object0, s, ⁱʽ0, z, v, progressDialog1);
                    return;
                }
                CLS1595 ﹳﹶ0 = new CLS1595(s1, arr_z, progressDialog1, ⁱʽ0, object0, s, z, v);
                CLS40.FLD157.MTH1124(((CLS39)ﹳﹶ0));
                return;
            }
            if(progressDialog1 != null) {
                progressDialog1.dismiss();
            }
            CLS412.MTH5998(((CLS3)new CLS1627(14, ⁱʽ0)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6518(String s, Object object0, String s1) {
        if(object0 == null) {
            return;
        }
        try {
            if(CLS27.MTH894("SnsPathClass") == null) {
                return;
            }
            Object object1 = ((LinkedList)CLS166.MTH3194(CLS166.MTH3194(CLS166.MTH3195(object0, CLS27.MTH897("snsSightMethod5"), new Object[0]), CLS27.MTH897("snsContentLinkField")), CLS27.MTH897("snsSightField3"))).get(0);
            CLS466.MTH6517(object1, s, ((CLS13)new CLS1606(object1, s1, 5)), true);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6519(String s, HashMap hashMap0) {
        byte[] arr_b;
        if(hashMap0.isEmpty()) {
            return;
        }
        try {
            String s1 = (String)hashMap0.get("url");
            String s2 = (String)hashMap0.get("title");
            Intent intent0 = new Intent();
            int v = 1;
            intent0.putExtra("wexposed_wf", true);
            intent0.putExtra("KThird_app", true);
            intent0.putExtra("Ksnsupload_title", s2);
            intent0.putExtra("Ksnsupload_link", s1);
            intent0.putExtra("KSnsAction", true);
            if(hashMap0.containsKey("appname")) {
                intent0.putExtra("Ksnsupload_appname", ((String)hashMap0.get("appname")));
            }
            if(hashMap0.containsKey("appid")) {
                intent0.putExtra("Ksnsupload_appid", ((String)hashMap0.get("appid")));
            }
            if(TextUtils.isEmpty(s)) {
                arr_b = null;
            }
            else {
                arr_b = CLS31.MTH1020(new CLS69(s).MTH1554());
                if(arr_b != null) {
                    intent0.putExtra("Ksnsupload_imgbuf", arr_b);
                }
            }
            switch(Integer.parseInt(((String)hashMap0.get("type")))) {
                case 3: {
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("_wxmusicobject_musicUrl", s1);
                    if(hashMap0.containsKey("lowurl")) {
                        bundle0.putString("_wxmusicobject_musicLowBandUrl", ((String)hashMap0.get("lowurl")));
                    }
                    bundle0.putString("_wxobject_title", s2);
                    bundle0.putString("_wxobject_description", ((String)hashMap0.get("des")));
                    bundle0.putInt("_wxapi_command_type", 2);
                    bundle0.putString("_wxobject_identifier_", "com.tencent.mm.sdk.openapi.WXMusicObject");
                    if(arr_b != null) {
                        bundle0.putByteArray("_wxobject_thumbdata", arr_b);
                    }
                    intent0.putExtra("Ksnsupload_timeline", bundle0);
                    intent0.putExtra("ksnsis_music", true);
                    v = 2;
                    break;
                }
                case 4: {
                    intent0.putExtra("ksnsis_video", true);
                }
            }
            intent0.putExtra("Ksnsupload_type", v);
            if(!CLS66.MTH1450("sns", ".ui.SnsUploadUI", intent0)) {
                Activity activity0 = CLS404.MTH5891();
                intent0.setClassName(activity0, CLS27.MTH897("SnsUploadUI"));
                activity0.startActivity(intent0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 中等(67)
    // 此方法包含解密的字符串
    public static void MTH6520(String s, String s1, String s2, String s3, byte[] arr_b, String s4) {
        String s5 = s3.replaceAll("&", "&amp;").replaceAll("\"", "&quot;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll(" ", "&nbsp;").replaceAll("\'", "&apos;");
        if(!CLS66.MTH1486(s, String.format(CLS27.MTH882("appmsg2"), new Object[]{s1, s2, 5, s5, CLS27.MTH904(), s4, s5, s5}), arr_b, 0L)) {
            CLS466.MTH6542(s, s5);
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH6521(long v, int v1) {
        if(v1 == 1) {
            return false;
        }
        CLS371 ʻ0 = CLS371.FLD3470;
        String s = ʻ0.MTH5319(v);
        if(!CLS31.MTH1021(s)) {
            return true;
        }
        long v2 = ʻ0.MTH5352(v);
        Cursor cursor0 = ʻ0.MTH5307("SELECT * FROM ImgInfo2 WHERE id = " + v2, null);
        ContentValues contentValues0 = new ContentValues();
        if(cursor0 != null) {
            if(cursor0.moveToFirst()) {
                String s1 = CLS182.MTH3472(0x38EABFB42B3CD335L, cursor0);
                try {
                    int v3 = Integer.parseInt(CLS502.MTH6924(s1, "hdlength"));
                    int v4 = Integer.parseInt(CLS502.MTH6924(s1, "length"));
                    contentValues0.put("hdlength", v3);
                    contentValues0.put("length", v4);
                }
                catch(Throwable unused_ex) {
                }
            }
            cursor0.close();
        }
        int v5 = contentValues0.containsKey("hdlength") ? CLS182.MTH3474(4100894161459008309L, contentValues0) : 0;
        if(v5 <= (contentValues0.containsKey("length") ? CLS182.MTH3474(4100894230178485045L, contentValues0) : 0)) {
            return false;
        }
        String s2 = ʻ0.MTH5360(String.valueOf(v2));
        String s3 = s2.substring(s2.lastIndexOf("_") + 1);
        if(!new CLS69(CLS66.MTH1410(s)).MTH1561()) {
            StringBuilder stringBuilder0 = CLS182.MTH3483(s3);
            stringBuilder0.append(".jpg");
            if(new CLS69(CLS66.MTH1374(stringBuilder0.toString())).MTH1561()) {
                s = CLS182.MTH3475(4100894290308027189L, CLS182.MTH3483(s3));
            }
            else {
                StringBuilder stringBuilder1 = CLS182.MTH3483(s3);
                stringBuilder1.append(".png");
                if(new CLS69(CLS66.MTH1374(stringBuilder1.toString())).MTH1561()) {
                    s = CLS182.MTH3475(4100894333257700149L, CLS182.MTH3483(s3));
                }
                else {
                    StringBuilder stringBuilder2 = CLS182.MTH3483(s3);
                    stringBuilder2.append(".gif");
                    s = new CLS69(CLS66.MTH1374(stringBuilder2.toString())).MTH1561() ? CLS182.MTH3475(4100894376207373109L, CLS182.MTH3483(s3)) : s3;
                }
            }
        }
        File file0 = new File(CLS66.MTH1410(s));
        return !CLS31.MTH1001(file0) || file0.length() < ((long)v5);
    }

    public static void MTH6522(String s, String s1, String s2) {
        CLS466.MTH6533(CLS404.MTH5891(), s, s1, s2);
    }

    public static void MTH6523(File file0, CLS3 ˆٴ0, long v) {
        public final class CLS465 implements Runnable {
            public final File FLD4527;
            public final long FLD4528;
            public final int[] FLD4529;
            public final CLS3 FLD4530;

            public CLS465(File file0, int[] arr_v, long v, CLS3 ˆٴ0) {
                this.FLD4529 = arr_v;
                this.FLD4528 = v;
                this.FLD4530 = ˆٴ0;
                super();
            }

            @Override
            public final void run() {
                try {
                    if(!CLS31.MTH1001(this.FLD4527)) {
                        int v = this.FLD4529[0];
                        this.FLD4529[0] = v + 1;
                        if(((long)v) * 1000L <= this.FLD4528) {
                            CLS40.FLD157.MTH1121().postDelayed(this, 1000L);
                            return;
                        }
                    }
                    CLS40.FLD157.MTH1121().removeCallbacks(this);
                    CLS412.MTH5998(this.FLD4530);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        if(CLS31.MTH1001(file0)) {
            CLS412.MTH5998(ˆٴ0);
            return;
        }
        CLS465 ــ$ᵔʾ0 = new CLS465(file0, new int[]{1}, v, ˆٴ0);
        CLS40.FLD157.MTH1121().postDelayed(ــ$ᵔʾ0, 1000L);
    }

    // 此方法包含解密的字符串
    public static void MTH6524(Object object0) {
        long v = CLS166.MTH3185(object0, "field_msgSvrId");
        long v1 = CLS166.MTH3185(object0, "field_msgId");
        Object object1 = CLS166.MTH3194(object0, "field_imgPath");
        int v2 = CLS166.MTH3181(object0, "field_type");
        String s = (String)CLS166.MTH3194(object0, "field_content");
        String s1 = (String)CLS166.MTH3194(object0, "field_talker");
        int v3 = CLS166.MTH3181(object0, "field_isSend");
        if(v2 != 1 && v2 != 0x1000031 && v2 != 0x31000031) {
            switch(v2) {
                case 3: {
                    CLS466.MTH6539(v3, v1, v, ((CLS0)new CLS1258(17, s1)), ((String)object1));
                    return;
                }
                case 34: {
                    new CLS894(Integer.parseInt(s.split(":")[1]), new File(CLS66.MTH1483(((String)object1))).getAbsolutePath()).MTH3230(s1);
                    return;
                }
                case 0x30: {
                    CLS66.MTH1468(0x30, s1, CLS426.MTH6106(v3, s, s1));
                    return;
                }
                case 43: 
                case 62: {
                    CLS466.MTH6507(((String)object1), ((CLS12)new CLS764(v1, ((String)object1), s1)), true, 0);
                    return;
                }
                case 0x2F: 
                case 0x100031: {
                    try {
                        Object object2 = CLS66.MTH1495(v1);
                        CLS66.MTH1382(CLS27.MTH900(), object2, s1);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                    return;
                }
                case 49: 
                case 0x2D000031: 
                case 0x30000031: 
                case 0x3A000031: 
                case 0x3E000031: 
                case 0x41000031: 
                case 0x54000031: 
                case 0x55000031: {
                    byte[] arr_b = CLS466.MTH6532(((String)object1));
                    CLS66.MTH1486(s1, CLS426.MTH6106(v3, s, s1), arr_b, v1);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        String s2 = CLS426.MTH6106(v3, s, s1);
        if(v2 == 0x1000031 || v2 == 0x31000031) {
            s2 = (String)CLS392.MTH5633(s2, "msg").get(".msg.appmsg.title");
        }
        CLS466.MTH6542(s1, s2);
    }

    // 此方法包含解密的字符串
    public static HashMap MTH6525() {
        HashMap hashMap0 = CLS466.FLD4531;
        if(hashMap0 != null) {
            return hashMap0;
        }
        HashMap hashMap1 = (HashMap)CLS21.FLD76.MTH836("getRetrievedImg", new Object[0]);
        if(hashMap1 != null) {
            CLS466.FLD4531 = hashMap1;
            return hashMap1;
        }
        HashMap hashMap2 = new HashMap();
        CLS466.FLD4531 = hashMap2;
        return hashMap2;
    }

    // 此方法包含解密的字符串
    public static void MTH6526(String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            File file0 = new File(s1);
            if(!CLS31.MTH1001(file0)) {
                return;
            }
            Class class0 = CLS27.MTH894("MMGifEncoderClass");
            if(class0 == null) {
                CLS66.MTH1385(s, s1);
                return;
            }
            if(file0.getName().endsWith(".gif")) {
                CLS66.MTH1385(s, s1);
                return;
            }
            Bitmap bitmap0 = CLS518.MTH7074(800, 800, s1);
            File file1 = new File(CLS31.MTH1038(CLS27.MTH900()), "wx_temp_gif.gif");
            try {
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(bitmap0.getRowBytes() * bitmap0.getHeight());
                bitmap0.copyPixelsToBuffer(byteBuffer0);
                Object object0 = CLS166.MTH3188(class0, new Object[]{file1.getAbsolutePath(), bitmap0.getWidth(), bitmap0.getHeight(), 1000});
                CLS166.MTH3195(object0, CLS27.MTH897("MMGifEncoderInitMethod"), new Object[0]);
                CLS166.MTH3195(object0, CLS27.MTH897("MMGifEncoderAddFrameMethod"), new Object[]{byteBuffer0.array(), 0});
                CLS166.MTH3195(object0, CLS27.MTH897("MMGifEncoderFlushMethod"), new Object[0]);
                CLS66.MTH1385(s, file1.getAbsolutePath());
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6527(long v) {
        Object object0 = CLS66.MTH1516(("sns_table_" + v));
        CLS466.MTH6518(("sns_table_" + v), object0, CLS66.MTH1399(object0));
    }

    // 此方法包含解密的字符串
    public static void MTH6528(File file0) {
        try {
            if(!CLS31.MTH1001(file0)) {
                return;
            }
            Activity activity0 = CLS404.MTH5891();
            Uri uri0 = CLS66.MTH1491(activity0, file0);
            if(uri0 == null) {
                return;
            }
            Intent intent0 = new Intent();
            intent0.setAction("android.intent.action.SEND");
            intent0.putExtra("android.intent.extra.STREAM", uri0);
            intent0.setType("video/mp4");
            intent0.addFlags(1);
            if(CLS31.MTH1001(file0)) {
                activity0.startActivity(Intent.createChooser(intent0, CLS27.MTH889("share")));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6529(CLS6 ˑٴ0, List list0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            Class class0 = CLS27.MTH894("ImgClass3");
            if(class0 == null) {
                return;
            }
            CLS1257 ⁱˉ0 = new CLS1257(list0, class0, z, ˑٴ0);
            CLS40.FLD157.MTH1124(((CLS39)ⁱˉ0));
        }
    }

    // 去混淆评级： 中等(160)
    // 此方法包含解密的字符串
    public static boolean MTH6530() {
        return CLS27.MTH895().MTH938("sns_sync_enable", false) || CLS27.MTH895().MTH938("moments_forward_enable", false) && CLS500.FLD4928.MTH6897() || CLS27.MTH895().MTH938("sns_auto_forward_to_chat_enable", false) && CLS500.FLD4928.MTH6895("sns_auto_forward_to_chat") || CLS27.MTH895().MTH938("auto_like_enable", false);
    }

    public static void MTH6531(int v, String s, long v1, long v2, CLS0 ʻˑ0, int v3) {
        CLS145 ʾᵢ0 = new CLS145(v3, new CLS640(v2), new CLS1414(v, v2, v1, ʻˑ0, s), new CLS1327(v1, v2, ʻˑ0, s));
        ʾᵢ0.FLD1531.postDelayed(ʾᵢ0.FLD1533, 1000L);
    }

    public static byte[] MTH6532(String s) {
        String s1 = CLS66.MTH1509(s);
        return TextUtils.isEmpty(s1) ? null : CLS31.MTH1020(new CLS69(s1).MTH1554());
    }

    // 此方法包含解密的字符串
    public static void MTH6533(Activity activity0, String s, String s1, String s2) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        String s3 = CLS31.MTH992(CLS66.MTH1395(s));
        String s4 = CLS31.MTH992(CLS66.MTH1395(s1));
        if(TextUtils.isEmpty(s3)) {
            CLS27.MTH906("sns video path not found");
            return;
        }
        try {
            if(TextUtils.isEmpty(s4)) {
                File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "wx_vidthumb.jpg");
                CLS518.MTH7053(file0, s3);
                s4 = file0.getAbsolutePath();
            }
            File file1 = new File(CLS31.MTH1038(CLS27.MTH900()), "wx_sns_forward_vid_temp.mp4");
            File file2 = new File(CLS31.MTH1038(CLS27.MTH900()), "wx_sns_forward_thumb_temp.jpg");
            if(CLS31.MTH1025(new File(s3), file1)) {
                s3 = file1.getAbsolutePath();
            }
            if(CLS31.MTH1025(new File(s4), file2)) {
                s4 = file2.getAbsolutePath();
            }
            long v = System.currentTimeMillis();
            Intent intent0 = new Intent();
            intent0.putExtra("sight_md5", CLS31.MTH1017(s3));
            intent0.putExtra("KSightDraftEntrance", false);
            intent0.putExtra("KSightPath", s3);
            intent0.putExtra("wexposed_wf", true);
            intent0.putExtra("Ksnsupload_type", 14);
            intent0.putExtra("KTouchCameraTime", v / 1000L);
            intent0.putExtra("KSnsPostManu", true);
            intent0.putExtra("Kis_take_photo", false);
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(v / 1000L);
            stringBuilder0.append("_");
            Random random0 = new Random();
            StringBuilder stringBuilder1 = new StringBuilder();
            for(int v1 = 0; v1 < 5; ++v1) {
                stringBuilder1.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random0.nextInt(62)));
            }
            stringBuilder0.append(stringBuilder1.toString());
            intent0.putExtra("KSessionID", stringBuilder0.toString());
            if(!TextUtils.isEmpty(s4)) {
                intent0.putExtra("KSightThumbPath", s4);
            }
            if(!TextUtils.isEmpty(s2)) {
                intent0.putExtra("Kdescription", CLS466.MTH6541(s2));
            }
            if(!CLS66.MTH1450("sns", ".ui.SnsUploadUI", intent0)) {
                intent0.setClassName(activity0, CLS27.MTH897("SnsUploadUI"));
                activity0.startActivity(intent0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6534(CLS6 ˑٴ0, List list0) {
        if(CLS27.MTH901()) {
            return;
        }
        if(list0 != null && !list0.isEmpty()) {
            Class class0 = CLS27.MTH894("ImgClass3");
            if(class0 == null) {
                return;
            }
            CLS1279 ʻᐧ0 = new CLS1279(list0, class0, ˑٴ0, 10);
            CLS40.FLD157.MTH1124(((CLS39)ʻᐧ0));
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6535(ArrayList arrayList0) {
        Activity activity0 = CLS404.MTH5891();
        if(activity0 != null && !arrayList0.isEmpty()) {
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                File file0 = (File)object0;
                if(CLS31.MTH1001(file0)) {
                    arrayList1.add(CLS66.MTH1491(activity0, file0));
                }
            }
            if(!arrayList1.isEmpty()) {
                Intent intent0 = new Intent("android.intent.action.SEND_MULTIPLE");
                intent0.setType("*/*");
                intent0.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList1);
                CLS404.MTH5891().startActivity(Intent.createChooser(intent0, CLS27.MTH889("share")));
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6536(String s, ArrayList arrayList0) {
        if((arrayList0 == null || arrayList0.isEmpty()) && TextUtils.isEmpty(s)) {
            return;
        }
        try {
            Intent intent0 = new Intent();
            intent0.putExtra("wexposed_wf", true);
            if(!TextUtils.isEmpty(s)) {
                intent0.putExtra("Kdescription", CLS466.MTH6541(s));
            }
            if(arrayList0 != null && !arrayList0.isEmpty()) {
                intent0.putExtra("sns_kemdia_path_list", arrayList0);
            }
            if(!CLS66.MTH1450("sns", ".ui.SnsUploadUI", intent0)) {
                Activity activity0 = CLS404.MTH5891();
                intent0.setClassName(activity0, CLS27.MTH897("SnsUploadUI"));
                activity0.startActivity(intent0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH6537(File file0, CLS15 ⁱᵔ0, boolean z) {
        public final class CLS464 implements Runnable {
            public final File FLD4523;
            public final ProgressDialog FLD4524;
            public final boolean FLD4525;
            public final CLS15 FLD4526;

            public CLS464(File file0, boolean z, ProgressDialog progressDialog0, CLS15 ⁱᵔ0) {
                this.FLD4525 = z;
                this.FLD4524 = progressDialog0;
                this.FLD4526 = ⁱᵔ0;
                super();
            }

            @Override
            public final void run() {
                try {
                    if(!CLS31.MTH1001(this.FLD4523)) {
                        CLS40.FLD157.MTH1121().postDelayed(this, 1000L);
                        return;
                    }
                    CLS40.FLD157.MTH1121().removeCallbacks(this);
                    if(this.FLD4525) {
                        this.FLD4524.dismiss();
                    }
                    CLS15 ⁱᵔ0 = this.FLD4526;
                    if(ⁱᵔ0 != null) {
                        ⁱᵔ0.MTH794();
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        ProgressDialog progressDialog0;
        if(ⁱᵔ0 == null && !z) {
            return;
        }
        if(CLS31.MTH1001(file0)) {
            CLS412.MTH5998(((CLS3)new CLS1627(15, ⁱᵔ0)));
            return;
        }
        if(z) {
            progressDialog0 = new ProgressDialog(CLS404.MTH5891());
            progressDialog0.setIndeterminate(true);
            progressDialog0.setMessage(CLS27.MTH889("loading_video"));
            progressDialog0.setCancelable(true);
            progressDialog0.show();
        }
        else {
            progressDialog0 = null;
        }
        CLS464 ــ$ٴـ0 = new CLS464(file0, z, progressDialog0, ⁱᵔ0);
        if(z) {
            progressDialog0.setOnCancelListener(new CLS498(1, ــ$ٴـ0));
        }
        CLS40.FLD157.MTH1121().postDelayed(ــ$ٴـ0, 1000L);
    }

    // 此方法包含解密的字符串
    public static void MTH6538(ArrayList arrayList0, ArrayList arrayList1, ProgressDialog progressDialog0, CLS6 ˑٴ0) {
        if(progressDialog0 != null) {
            progressDialog0.show();
        }
        CLS97 ﾞٴ0 = new CLS97(((CLS3)new CLS1568(progressDialog0, ˑٴ0, arrayList1, 4)));
        CLS737 ˑٴ1 = new CLS737(new int[]{0}, arrayList1.size(), ﾞٴ0, progressDialog0);
        int v = 0;
        while(v < arrayList0.size()) {
            Object object0 = arrayList0.get(v);
            String s = (String)arrayList1.get(v);
            Class class0 = CLS27.MTH894("SnsPathClass");
            if(class0 != null) {
                if(CLS27.MTH894("snsImageClass1") != null || CLS27.MTH894("snsImageClass2") != null) {
                    goto label_16;
                label_19:
                    CLS27.MTH893(throwable0);
                }
                else {
                    try {
                        if(TextUtils.isEmpty(CLS27.MTH897("snsImageMethod1"))) {
                            CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("snsImageMethod2"), new Object[0]), "a", new Object[]{object0, new ImageView(CLS27.MTH900()), CLS27.MTH900().hashCode(), Boolean.TRUE});
                        }
                        else {
                            CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("snsImageMethod1"), new Object[0]), "a", new Object[]{object0, 2, null});
                        }
                        goto label_20;
                    label_16:
                        CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("snsImageMethod1"), new Object[0]), CLS27.MTH892("snsImageMethod3", "a"), new Object[]{object0, 2, null, CLS66.MTH1492("timeline")});
                        goto label_20;
                    }
                    catch(Throwable throwable0) {
                    }
                    goto label_19;
                }
            }
        label_20:
            if(object0 == null || TextUtils.isEmpty(s)) {
                ˑٴ1.MTH2457();
            }
            else {
                CLS1363 ʿᵎ0 = new CLS1363(s, ˑٴ1);
                CLS40.FLD157.MTH1124(((CLS39)ʿᵎ0));
            }
            ++v;
        }
    }

    public static void MTH6539(int v, long v1, long v2, CLS0 ʻˑ0, String s) {
        CLS466.MTH6531(v, s, v1, v2, ʻˑ0, 8);
    }

    // 此方法包含解密的字符串
    public static void MTH6540(ArrayList arrayList0) {
        if(arrayList0 != null) {
            try {
                if(!arrayList0.isEmpty()) {
                    if(arrayList0.size() == 1) {
                        CLS466.MTH6503(((String)arrayList0.get(0)), "image/jpeg");
                        return;
                    }
                    Intent intent0 = new Intent();
                    intent0.setAction("android.intent.action.SEND_MULTIPLE");
                    intent0.setType("image/jpeg");
                    intent0.addFlags(1);
                    ArrayList arrayList1 = new ArrayList();
                    Activity activity0 = CLS404.MTH5891();
                    for(int v = 0; v < arrayList0.size(); ++v) {
                        File file0 = new File(CLS31.MTH992(((String)arrayList0.get(v))));
                        if(CLS31.MTH1001(file0)) {
                            File file1 = new File(CLS31.MTH1038(CLS27.MTH900()), "temp_share_multi_img" + v + ".jpg");
                            CLS31.MTH1025(file0, file1);
                            Uri uri0 = CLS66.MTH1491(activity0, file1);
                            if(uri0 != null) {
                                arrayList1.add(uri0);
                            }
                        }
                    }
                    intent0.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList1);
                    activity0.startActivity(Intent.createChooser(intent0, CLS27.MTH889("share")));
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static String MTH6541(String s) {
        boolean z = CLS500.FLD4928.MTH6895("random_content");
        String s1 = CLS502.MTH6928(s);
        if(TextUtils.isEmpty(s1)) {
            s1 = "";
        }
        else if(!s1.contains("#小程序://")) {
            String s2 = CLS370.MTH5289((z ? 0x38EA7B862B3CD335L : 0x38EA7B882B3CD335L));
            try {
                int v1 = Math.min(s1.length() - 1, Math.max((Build.VERSION.SDK_INT < 21 ? new Random().nextInt(s1.length()) : CLS115.MTH2262(ThreadLocalRandom.current(), s1.length())), 0));
                if(z) {
                    s1 = new StringBuilder(s1).insert(v1, s2).toString();
                }
                else {
                    ArrayList arrayList0 = new ArrayList(CLS502.MTH6926());
                    new ArrayDeque();
                    Random random0 = new Random();
                    random0.setSeed(System.currentTimeMillis());
                    StringBuilder stringBuilder0 = new StringBuilder(s1);
                    int v2 = CLS412.MTH6015(10, 20);
                    for(int v3 = 0; v3 < v2; ++v3) {
                        stringBuilder0.append(((String)arrayList0.get(random0.nextInt(arrayList0.size()))));
                    }
                    s1 = stringBuilder0.toString();
                }
            }
            catch(Throwable unused_ex) {
                s1 = s1 + s2;
            }
        }
        if(TextUtils.isEmpty(s1)) {
            return "";
        }
        if(!s1.contains("#小程序://")) {
            try {
                StringBuilder stringBuilder1 = new StringBuilder();
                int v4 = CLS412.MTH6015(5, 10);
                for(int v = 0; v < v4; ++v) {
                    stringBuilder1.append("￀");
                }
                stringBuilder1.append(s1);
                return stringBuilder1.toString();
            }
            catch(Throwable unused_ex) {
            }
        }
        return s1;
    }

    public static void MTH6542(String s, String s1) {
        CLS66.MTH1468(1, s, CLS502.MTH6939(s1, s, null));
    }

    // 此方法包含解密的字符串
    public static void MTH6543(Activity activity0, String s, String s1) {
        try {
            CLS395.MTH5733(activity0, CLS27.MTH895().MTH938("add_img_watermark", false), ((CLS3)new CLS574(3, s1, s)));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static HashSet MTH6544() {
        HashSet hashSet0 = CLS466.FLD4532;
        if(hashSet0 != null) {
            return hashSet0;
        }
        HashSet hashSet1 = (HashSet)CLS21.FLD76.MTH836("getRetrievedImgHistory", new Object[0]);
        if(hashSet1 != null) {
            CLS466.FLD4532 = hashSet1;
            return hashSet1;
        }
        HashSet hashSet2 = new HashSet();
        CLS466.FLD4532 = hashSet2;
        return hashSet2;
    }

    // 此方法包含解密的字符串
    public static void MTH6545(String s, CLS13 ⁱʽ0) {
        Object object0 = CLS66.MTH1516(s);
        if(object0 == null) {
            ⁱʽ0.MTH770(null);
            return;
        }
        CLS466.MTH6517(((LinkedList)CLS182.MTH3492(4100890789909680949L, CLS182.MTH3492(4100890704010335029L, CLS166.MTH3195(object0, CLS27.MTH897("snsSightMethod5"), new Object[0])))).get(0), s, ⁱʽ0, true);
    }

    // 此方法包含解密的字符串
    public static void MTH6546(Object object0, String s, CLS13 ⁱʽ0, boolean z, long v, ProgressDialog progressDialog0) {
        public final class CLS463 implements Runnable {
            public final Object FLD4517;
            public final ProgressDialog FLD4518;
            public final String FLD4519;
            public final int FLD4520;
            public final boolean FLD4521;
            public final CLS13 FLD4522;

            public CLS463(Object object0, int v, String s, boolean z, ProgressDialog progressDialog0, CLS13 ⁱʽ0) {
                this.FLD4520 = v;
                this.FLD4519 = s;
                this.FLD4521 = z;
                this.FLD4518 = progressDialog0;
                this.FLD4522 = ⁱʽ0;
                super();
            }

            @Override
            public final void run() {
                try {
                    String s = this.FLD4519;
                    Object object0 = this.FLD4517;
                    CLS66.MTH1480(this.FLD4520, object0);
                    if(CLS66.MTH1471(object0, s)) {
                        String s1 = CLS66.MTH1485(object0, s);
                        CLS40.FLD157.MTH1121().removeCallbacks(this);
                        CLS1246 יﹳ0 = new CLS1246(this.FLD4521, this.FLD4517, this.FLD4518, this.FLD4522, s1);
                        CLS40.FLD157.MTH1123(((CLS39)יﹳ0), 5000L);
                        return;
                    }
                    CLS40.FLD157.MTH1121().postDelayed(this, 1000L);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        boolean z2;
        boolean z1;
        Object object1 = CLS66.MTH1434(v);
        if(object1 == null) {
            CLS27.MTH906("get sns info object failed");
            return;
        }
        try {
            z1 = true;
            Class class0 = CLS27.MTH894("SnsPathClass");
            if(class0 == null) {
                goto label_25;
            }
            else {
                Class class1 = CLS27.MTH894("snsImageClass1");
                if(class1 == null) {
                    z2 = false;
                }
                else {
                    Class class2 = CLS27.MTH894("SnsDecodeElmentCls");
                    Object object2 = CLS166.MTH3192(class0, CLS27.MTH897("SnsCore_getSnsDownManager"), new Object[0]);
                    int v1 = CLS166.MTH3181(object0, CLS27.MTH897("SnsElement_field2")) == 6 ? 5 : 1;
                    Object object3 = CLS166.MTH3188(class2, new Object[]{object0});
                    CLS166.MTH3195(object3, CLS27.MTH897("SnsDecodeElment_setDecodeType"), new Object[]{1});
                    CLS166.MTH3195(object3, CLS27.MTH897("SnsDecodeElment_setRequestId"), new Object[]{CLS166.MTH3194(object0, CLS27.MTH897("SnsElement_requestIdField"))});
                    Object object4 = CLS166.MTH3188(class1, new Object[]{"timeline"});
                    CLS166.MTH3195(object2, CLS27.MTH897("SnsDownloadManager_addDownLoadSns"), new Object[]{object0, v1, object3, object4, null, "", "", 1});
                    z2 = true;
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            z2 = false;
        }
        goto label_26;
    label_25:
        z2 = false;
    label_26:
        int v2 = CLS166.MTH3181(object1, "field_createTime");
        Class class3 = CLS27.MTH894("SnsPathClass");
        if(class3 == null) {
            z1 = false;
        }
        else {
            try {
                if(TextUtils.isEmpty(CLS27.MTH897("snsSightDownloadMethod1"))) {
                    if(!TextUtils.isEmpty(CLS27.MTH897("snsSightDownloadMethod1b"))) {
                        Object object5 = CLS66.MTH1492("snssight");
                        if(object5 != null && !TextUtils.isEmpty(CLS27.MTH897("snsSightDownloadField1"))) {
                            CLS166.MTH3196(v2, object5, CLS27.MTH897("snsSightDownloadField1"));
                        }
                        CLS166.MTH3195(CLS166.MTH3192(class3, CLS27.MTH897("snsSightDownloadMethod1b"), new Object[0]), CLS27.MTH897("snsSightDownloadMethod2"), new Object[]{object0, 4, null, object5});
                    }
                    else if(TextUtils.isEmpty(CLS27.MTH897("snsSightDownloadMethod1c"))) {
                        z1 = false;
                    }
                    else {
                        CLS166.MTH3195(CLS166.MTH3192(class3, CLS27.MTH897("snsSightDownloadMethod1c"), new Object[0]), CLS27.MTH897("snsSightDownloadMethod2"), new Object[]{object0, 4, null});
                    }
                }
                else if(CLS27.MTH890("snsSightDownloadMethod2")) {
                    CLS166.MTH3195(CLS166.MTH3192(class3, CLS27.MTH897("snsSightDownloadMethod1"), new Object[0]), CLS27.MTH897("snsSightDownloadMethod2"), new Object[]{object0, v2, s, Boolean.TRUE, Boolean.TRUE, 30});
                }
                else if(CLS27.MTH890("snsSightDownloadMethod2b")) {
                    Class class4 = CLS27.MTH894("SnsVideoPathClass2");
                    if(class4 == null) {
                        z1 = false;
                    }
                    else {
                        String s1 = (String)CLS166.MTH3192(class4, CLS27.MTH897("snsSightDownloadHelperMethod3b"), new Object[]{v2, object0});
                        CLS166.MTH3195(CLS166.MTH3192(class3, CLS27.MTH897("snsSightDownloadMethod1"), new Object[0]), CLS27.MTH897("snsSightDownloadMethod2b"), new Object[]{object0, v2, s, Boolean.FALSE, Boolean.TRUE, 30, s1});
                    }
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
                z1 = false;
            }
        }
        if(!z1) {
            if(progressDialog0 != null) {
                progressDialog0.dismiss();
            }
            if(ⁱʽ0 != null) {
                CLS1481 יˆ0 = new CLS1481(10, ⁱʽ0);
                CLS40.FLD157.MTH1116(((CLS39)יˆ0));
            }
            return;
        }
        CLS463 ــ$ˆٴ0 = new CLS463(object0, v2, s, z2, progressDialog0, ⁱʽ0);
        if(z) {
            progressDialog0.setOnCancelListener(new CLS498(0, ــ$ˆٴ0));
        }
        CLS40.FLD157.MTH1121().postDelayed(ــ$ˆٴ0, 1000L);
    }

    public static void MTH6547(String s, Uri uri0) {
        File file0 = new File(CLS31.MTH979(CLS31.MTH1013(CLS27.MTH900()), CLS31.MTH985(CLS27.MTH900(), uri0)));
        CLS31.MTH996(file0.getAbsolutePath());
        CLS31.MTH1037(CLS31.MTH973(uri0), file0);
        CLS466.MTH6526(s, file0.getAbsolutePath());
    }
}

