// Decompiled by JEB v5.42.0.202606242140

package b.ˆٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS85.CLS83;
import b.ˈˈ.CLS85;
import b.ˈˈ.CLS97;
import b.ˑٴ.CLS759;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1234;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1279;
import b.ⁱᵔ.CLS1467;
import b.ⁱᵔ.CLS1568;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS390;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS396;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS449;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS485.CLS484;
import b.ⁱᵔ.CLS485;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS66 {
    public static Method FLD211;

    // 此方法包含解密的字符串
    public static void MTH1360(boolean z) {
        Class class0 = CLS27.MTH894("dbClass1");
        Class class1 = CLS27.MTH894("privacySettingsClass");
        Class class2 = CLS27.MTH894("RoomNameClass3");
        if(class0 != null && class1 != null && class2 != null) {
            try {
                int v = (int)(((Integer)CLS66.MTH1377()));
                CLS66.MTH1431(7, ((int)(z ? v | 0x20 : v & -33)));
                Object object0 = CLS166.MTH3188(class1, new Object[0]);
                CLS166.MTH3196(4, object0, CLS27.MTH897("privacySettingsField1"));
                CLS166.MTH3196((z ? 1 : 2), object0, CLS27.MTH897("privacySettingsField2"));
                CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("dbMethod1"), new Object[0]), CLS27.MTH897("delMethod5"), new Object[0]), CLS27.MTH897("delMethod6"), new Object[]{CLS166.MTH3188(class2, new Object[]{23, object0})});
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1361(Context context0, Object object0, String s) {
        Class class0 = CLS27.MTH894("favClass3");
        if(class0 == null) {
            return;
        }
        try {
            CLS166.MTH3192(class0, CLS27.MTH897("favMethod4"), new Object[]{context0, s, object0});
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH1362(long v, String s) {
        Class class0 = CLS27.MTH894("sendArticleClass");
        if(class0 == null) {
            return null;
        }
        try {
            Object object0 = CLS166.MTH3192(class0, CLS27.MTH897("sendFileMethod1"), new Object[]{s});
            if(object0 == null) {
                if(v == 0L) {
                    return null;
                }
                Object object1 = CLS66.MTH1495(v);
                object0 = CLS166.MTH3192(class0, CLS27.MTH892("sendFileMethod1_2", "c"), new Object[]{object1, s});
            }
            return (String)CLS166.MTH3194(object0, "field_fileFullPath");
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1363(int v, String s, String s1, String s2) {
        Object object0 = null;
        if(CLS27.MTH890("TransferConfirmClass_f")) {
            Class class0 = CLS27.MTH894("TransferConfirmClass_f");
            if(class0 != null) {
                object0 = CLS166.MTH3188(class0, new Object[]{s, s1, 0, "confirm", s2, v, "", null, 1, null});
            }
        }
        else if(CLS27.MTH890("TransferConfirmClass_d")) {
            Class class1 = CLS27.MTH894("TransferConfirmClass_d");
            if(class1 != null) {
                object0 = CLS166.MTH3188(class1, new Object[]{s, s1, 0, "confirm", s2, v, "", null, 1});
            }
        }
        else if(CLS27.MTH890("TransferConfirmClass_e")) {
            Class class2 = CLS27.MTH894("TransferConfirmClass_e");
            if(class2 != null) {
                object0 = CLS166.MTH3188(class2, new Object[]{0, v, 1, s, s1, "confirm", s2, "", null});
            }
        }
        else if(CLS27.MTH890("TransferConfirmClass_c")) {
            Class class3 = CLS27.MTH894("TransferConfirmClass_c");
            if(class3 != null) {
                object0 = CLS166.MTH3188(class3, new Object[]{s, s1, 0, "confirm", s2, v, "", null});
            }
        }
        else if(CLS27.MTH890("TransferConfirmClass_b")) {
            Class class4 = CLS27.MTH894("TransferConfirmClass_b");
            if(class4 != null) {
                object0 = CLS166.MTH3188(class4, new Object[]{s, s1, 0, "confirm", s2, v, null});
            }
        }
        else if(CLS27.MTH890("TransferConfirmClass")) {
            Class class5 = CLS27.MTH894("TransferConfirmClass");
            if(class5 != null) {
                object0 = CLS166.MTH3188(class5, new Object[]{s, s1, 0, "confirm", s2, v});
            }
        }
        if(object0 == null) {
            return;
        }
        CLS66.MTH1521(object0);
    }

    // 去混淆评级： 低(45)
    // 此方法包含解密的字符串
    public static boolean MTH1364(String s) {
        Class class0 = CLS27.MTH894("dbClass1");
        return class0 == null ? false : ((Boolean)CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("dbMethod1"), new Object[0]), CLS27.MTH897("delMethod8"), new Object[0]), CLS27.MTH897("placeToTopMethod1"), new Object[]{s})).booleanValue();
    }

    // 此方法包含解密的字符串
    public static String MTH1365() {
        if(CLS27.MTH890("accountPathNameField")) {
            try {
                Object object0 = CLS66.MTH1457();
                return object0 == null ? "" : ((String)CLS166.MTH3194(object0, CLS27.MTH897("accountPathNameField")));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return "";
    }

    // 此方法包含解密的字符串
    public static int MTH1366(String s, int v, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2) {
        try {
            Class class0 = CLS27.MTH894("snsImgItemClass1");
            if(class0 == null) {
                return -1;
            }
            ArrayList arrayList3 = CLS66.MTH1437(arrayList0);
            LinkedList linkedList0 = new LinkedList();
            for(int v1 = 0; true; ++v1) {
                int v2 = 1;
                if(v1 >= arrayList3.size()) {
                    break;
                }
                String s1 = (String)arrayList3.get(v1);
                if(CLS31.MTH1029(new CLS69(s1))) {
                    Object object0 = CLS166.MTH3188(class0, new Object[]{s1, 2});
                    CLS166.MTH3196(2, object0, CLS27.MTH897("snsImgItemTypeField"));
                    String s2 = CLS27.MTH897("snsImgItemField1");
                    if(v != 1) {
                        v2 = 0;
                    }
                    CLS166.MTH3196(v2, object0, s2);
                    CLS166.MTH3198(object0, CLS27.MTH897("snsImgItemDescField"), s);
                    linkedList0.add(object0);
                }
            }
            if(linkedList0.isEmpty()) {
                return CLS66.MTH1418(s, v, arrayList1, arrayList2);
            }
            Object object1 = CLS66.MTH1397(1);
            if(object1 == null) {
                return -1;
            }
            if(v == 3) {
                CLS166.MTH3195(object1, CLS27.MTH897("upSetShareTypeMethod"), new Object[]{1});
            }
            else {
                CLS166.MTH3195(object1, CLS27.MTH897("upSetShareTypeMethod"), new Object[]{0});
            }
            if(CLS27.MTH890("upSetTypeMethod")) {
                CLS166.MTH3195(object1, CLS27.MTH897("upSetTypeMethod"), new Object[]{0});
            }
            else if(CLS27.MTH890("upClassField4")) {
                CLS166.MTH3198(CLS166.MTH3194(object1, CLS27.MTH897("upClassField4")), CLS27.MTH897("upClassField5"), 0);
            }
            if(!TextUtils.isEmpty(CLS27.MTH897("upMethod3"))) {
                CLS166.MTH3195(object1, CLS27.MTH897("upMethod3"), new Object[]{null, null, null, ((int)(v <= 1 ? 0 : 1)), 0});
            }
            CLS166.MTH3195(object1, CLS27.MTH897("upSetContentMethod"), new Object[]{s});
            CLS166.MTH3195(object1, CLS27.MTH897("upSetMentionListMethod"), new Object[]{CLS66.MTH1504(arrayList1)});
            CLS166.MTH3195(object1, CLS27.MTH897("upSetPrivateMethod"), new Object[]{((int)(v == 1 ? 1 : 0))});
            if(CLS27.MTH890("upMethod4")) {
                CLS166.MTH3195(object1, CLS27.MTH897("upMethod4"), new Object[]{0});
            }
            else if(CLS27.MTH890("upClass1Field2")) {
                CLS166.MTH3198(CLS166.MTH3194(object1, CLS27.MTH897("upClass1Field2")), CLS27.MTH897("upClass1Field3"), 0);
            }
            CLS166.MTH3195(object1, CLS27.MTH897("upSetListMethod"), new Object[]{arrayList2});
            CLS166.MTH3195(object1, CLS27.MTH897("upSetImageListMethod"), new Object[]{linkedList0});
            int v3 = (int)(((Integer)CLS166.MTH3195(object1, CLS27.MTH897("upCommitMethod"), new Object[0])));
            Class class1 = CLS27.MTH894("SnsPathClass");
            if(class1 != null) {
                CLS166.MTH3195(CLS166.MTH3192(class1, CLS27.MTH897("upMethod1"), new Object[0]), CLS27.MTH897("upMethod2"), new Object[0]);
            }
            return v3;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return -1;
        }
    }

    public static String MTH1367(long v) {
        try {
            return CLS31.MTH992(CLS66.MTH1395(CLS66.MTH1410(CLS371.FLD3470.MTH5319(v))));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return CLS31.MTH992(CLS66.MTH1395(null));
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1368(String s, boolean z) {
        if(!CLS182.MTH3470(0x38EBE0102B3CD335L) && !CLS182.MTH3470(0x38EBE01F2B3CD335L)) {
            Class class0 = CLS27.MTH894("SetRemarkClass");
            if(z) {
                CLS166.MTH3192(class0, CLS27.MTH897("setStarMethod2"), new Object[]{CLS66.MTH1384(s)});
                return;
            }
            CLS166.MTH3192(class0, CLS27.MTH897("setStarMethod1"), new Object[]{CLS66.MTH1384(s)});
        }
    }

    // 去混淆评级： 低(27)
    // 此方法包含解密的字符串
    public static String MTH1369() {
        if(!CLS27.MTH890("LastLoginInfoClass")) {
            return "";
        }
        Class class0 = CLS27.MTH894("LastLoginInfoClass");
        if(class0 == null) {
            return "";
        }
        try {
            return (String)CLS166.MTH3195(CLS166.MTH3186(class0, CLS27.MTH897("LastLoginInfoClass_field1")), CLS27.MTH897("LastLoginInfoClass_getString"), new Object[]{"login_weixin_username", ""});
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static String MTH1370(String s) {
        Class class0 = CLS27.MTH894("friendCardClass");
        if(!TextUtils.isEmpty(s) && class0 != null) {
            try {
                return TextUtils.isEmpty(CLS27.MTH897("friendCardMethod2")) ? ((String)CLS166.MTH3192(class0, CLS27.MTH897("friendCardMethod"), new Object[]{s})) : ((String)CLS166.MTH3192(class0, CLS27.MTH897("friendCardMethod2"), new Object[]{s, null}));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static void MTH1371(long v, long v1, String s) {
        if(v == 0L) {
            return;
        }
        Class class0 = CLS27.MTH894("snsAttrClass");
        Class class1 = CLS27.MTH894("snsContentClass");
        ContentValues contentValues0 = CLS66.MTH1430(v);
        if(contentValues0 == null) {
            return;
        }
        contentValues0.remove("rowid");
        contentValues0.put("userName", CLS27.MTH904());
        contentValues0.put(CLS182.MTH3479(0, contentValues0, "snsId", 0x38EBE4572B3CD335L), v1);
        Object object0 = CLS66.MTH1381(class1, contentValues0.getAsByteArray("content"));
        if(object0 != null && !TextUtils.isEmpty(s)) {
            CLS166.MTH3198(object0, CLS27.MTH897("snsContentField"), CLS502.MTH6931(s));
            contentValues0.put("content", CLS396.MTH5764(object0));
        }
        Object object1 = CLS66.MTH1381(class0, contentValues0.getAsByteArray("attrBuf"));
        if(object1 != null) {
            LinkedList linkedList0 = (LinkedList)CLS182.MTH3492(0x38EBE40A2B3CD335L, object1);
            if(linkedList0 != null) {
                linkedList0.clear();
            }
            CLS166.MTH3196(0, object1, CLS27.MTH897("snsAttrLikeFieldCount"));
            LinkedList linkedList1 = (LinkedList)CLS166.MTH3194(object1, CLS27.MTH897("snsAttrCommentsListField"));
            if(linkedList1 != null) {
                linkedList1.clear();
            }
            CLS166.MTH3196(0, object1, CLS27.MTH897("snsAttrCommentFieldCount"));
            contentValues0.put("attrBuf", CLS396.MTH5764(object1));
        }
        CLS396.FLD3775.MTH5762(contentValues0, "SnsInfo", "");
        CLS66.MTH1373();
    }

    // 此方法包含解密的字符串
    public static Bitmap MTH1372(String s) {
        Bitmap bitmap1;
        Class class0 = CLS27.MTH894("avatarClass2");
        Bitmap bitmap0 = null;
        if(class0 == null) {
            return null;
        }
        if(CLS27.MTH890("avatarMethod3")) {
            bitmap1 = (Bitmap)CLS166.MTH3192(class0, CLS27.MTH897("avatarMethod3"), new Object[]{s, Boolean.FALSE, -1});
        }
        else {
            bitmap1 = CLS27.MTH890("avatarMethod3b") ? ((Bitmap)CLS166.MTH3192(class0, CLS27.MTH897("avatarMethod3b"), new Object[]{s, Boolean.FALSE, -1, null})) : null;
        }
        if(bitmap1 != null && !bitmap1.isRecycled()) {
            return bitmap1;
        }
        Class class1 = CLS27.MTH894("avatarClass");
        if(class1 != null) {
            if(CLS27.MTH890("avatarMethod2")) {
                bitmap0 = (Bitmap)CLS166.MTH3195(CLS166.MTH3192(class1, CLS27.MTH897("avatarMethod1"), new Object[0]), CLS27.MTH897("avatarMethod2"), new Object[]{s, Boolean.FALSE, -1});
                return bitmap0 != null && !bitmap0.isRecycled() ? bitmap0 : CLS66.MTH1488(s);
            }
            if(CLS27.MTH890("avatarMethod2b")) {
                bitmap0 = (Bitmap)CLS166.MTH3195(CLS166.MTH3192(class1, CLS27.MTH897("avatarMethod1"), new Object[0]), CLS27.MTH897("avatarMethod2b"), new Object[]{s, Boolean.FALSE, -1, null});
            }
            return bitmap0 != null && !bitmap0.isRecycled() ? bitmap0 : CLS66.MTH1488(s);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static void MTH1373() {
        Object object2;
        Object object0 = null;
        if(CLS27.MTH890("MvvmList_submitRefreshAll")) {
            try {
                Activity activity0 = (Activity)CLS21.FLD76.MTH836("getImproveSnsTimelineUIActivity", new Object[0]);
                if(activity0 != null) {
                    Object object1 = CLS66.MTH1493(activity0, CLS27.MTH894("ImproveMainUIC"));
                    if(object1 != null) {
                        if(CLS27.MTH890("ImproveMainUIC_getDataUIC")) {
                            object2 = CLS166.MTH3195(object1, CLS27.MTH897("ImproveMainUIC_getDataUIC"), new Object[0]);
                        }
                        else {
                            object2 = CLS27.MTH890("ImproveDataUIC_cls") ? CLS66.MTH1493(activity0, CLS27.MTH894("ImproveDataUIC_cls")) : null;
                        }
                        if(object2 != null) {
                            CLS166.MTH3195(CLS166.MTH3195(object2, CLS27.MTH897("ImproveDataUIC_getLiveList"), new Object[0]), CLS27.MTH897("MvvmList_submitRefreshAll"), new Object[0]);
                        }
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        if(CLS27.MTH890("SnsServer_doFpList")) {
            try {
                CLS166.MTH3195(CLS166.MTH3192(CLS27.MTH894("SnsPathClass"), CLS27.MTH897("SnsCore_getSnsServer"), new Object[0]), CLS27.MTH897("SnsServer_doFpList"), new Object[]{1, "", Boolean.FALSE, Boolean.FALSE, 0});
                return;
            }
            catch(Throwable throwable1) {
                goto label_22;
            }
        }
        if(CLS27.MTH890("SnsServer_doFpList_b")) {
            try {
                CLS166.MTH3195(CLS166.MTH3192(CLS27.MTH894("SnsPathClass"), CLS27.MTH897("SnsCore_getSnsServer"), new Object[0]), CLS27.MTH897("SnsServer_doFpList_b"), new Object[]{"", 1, 0, Boolean.FALSE});
                return;
            }
            catch(Throwable throwable1) {
            label_22:
                CLS27.MTH893(throwable1);
            }
        }
        try {
            if(CLS27.MTH890("snsTimelineSync")) {
                Class class0 = CLS27.MTH894("snsTimelineSync");
                if(class0 != null) {
                    object0 = CLS166.MTH3188(class0, new Object[]{0});
                }
            }
            else if(CLS27.MTH890("snsTimelineSync2")) {
                Class class1 = CLS27.MTH894("snsTimelineSync2");
                if(class1 != null) {
                    object0 = CLS166.MTH3188(class1, new Object[]{0, 0, 0});
                }
            }
        }
        catch(Throwable throwable2) {
            CLS27.MTH893(throwable2);
        }
        if(object0 == null) {
            return;
        }
        CLS66.MTH1521(object0);
    }

    // 去混淆评级： 低(22)
    // 此方法包含解密的字符串
    public static String MTH1374(String s) {
        Object object1;
        String s1 = "";
        try {
            if(CLS27.MTH890("imageClass")) {
                Class class0 = CLS27.MTH894("imageClass");
                if(class0 != null) {
                    Object object0 = CLS166.MTH3192(class0, CLS27.MTH897("imageMethod1"), new Object[0]);
                    if(CLS27.MTH890("imageMethod3")) {
                        object1 = CLS166.MTH3195(object0, CLS27.MTH897("imageMethod3"), new Object[]{s, "", ""});
                        s1 = (String)object1;
                        return CLS66.MTH1395(s1);
                    }
                    if(CLS27.MTH890("imageMethod3_b")) {
                        object1 = CLS166.MTH3195(object0, CLS27.MTH897("imageMethod3_b"), new Object[]{s, "", "", Boolean.TRUE});
                        s1 = (String)object1;
                        return CLS66.MTH1395(s1);
                    }
                }
            }
            else if(CLS27.MTH890("imageClass2")) {
                Object object2 = CLS166.MTH3195(CLS66.MTH1487(CLS27.MTH894("imageClass2")), CLS27.MTH897("imageMethod1"), new Object[0]);
                boolean z = false;
                if(CLS27.MTH890("imageMethod3")) {
                    z = true;
                    object1 = CLS166.MTH3195(object2, CLS27.MTH897("imageMethod3"), new Object[]{s, "", ""});
                }
                else if(CLS27.MTH890("imageMethod3_b")) {
                    z = true;
                    object1 = CLS166.MTH3195(object2, CLS27.MTH897("imageMethod3_b"), new Object[]{s, "", "", Boolean.TRUE});
                }
                if(z) {
                    s1 = (String)object1;
                    return CLS66.MTH1395(s1);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return CLS66.MTH1395(s1);
    }

    // 此方法包含解密的字符串
    public static void MTH1375(int v, String s, String s1) {
        Object object0 = null;
        try {
            if(CLS27.MTH890("TransferDetailClass_b")) {
                Class class2 = CLS27.MTH894("TransferDetailClass_b");
                if(class2 != null) {
                    object0 = CLS166.MTH3188(class2, new Object[]{0, s, s1, v, null});
                }
            }
            else if(CLS27.MTH890("TransferDetailClass_c")) {
                Class class0 = CLS27.MTH894("TransferDetailClass_c");
                if(class0 != null) {
                    object0 = CLS166.MTH3188(class0, new Object[]{0, s, v, s1, null});
                }
            }
            else if(CLS27.MTH890("TransferDetailClass")) {
                Class class1 = CLS27.MTH894("TransferDetailClass");
                if(class1 != null) {
                    object0 = CLS166.MTH3188(class1, new Object[]{0, s, s1, v});
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        if(object0 == null) {
            return;
        }
        CLS166.MTH3199(object0, "wx", s);
        CLS66.MTH1521(object0);
    }

    // 此方法包含解密的字符串
    public static void MTH1376(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        if(!CLS182.MTH3470(4101135929463067445L)) {
            Class class0 = CLS27.MTH894("chatroomAnnouncementClass");
            if(class0 != null) {
                try {
                    CLS66.MTH1521(CLS166.MTH3188(class0, new Object[]{s, s1}));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        else if(!CLS182.MTH3470(4101135603045552949L)) {
            Class class1 = CLS27.MTH894("chatroomAnnouncementClass2");
            Object object0 = CLS27.MTH890("chatroomAnnouncementClass2_method1") ? CLS166.MTH3192(class1, CLS27.MTH897("chatroomAnnouncementClass2_method1"), new Object[0]) : CLS166.MTH3188(class1, new Object[0]);
            if(object0 == null) {
                return;
            }
            CLS166.MTH3198(object0, CLS27.MTH897("chatroomAnnouncementClass2_field1"), s);
            CLS166.MTH3198(object0, CLS27.MTH897("chatroomAnnouncementClass2_field2"), s1);
            CLS166.MTH3198(object0, CLS27.MTH897("chatroomAnnouncementClass2_field3"), "");
            CLS166.MTH3198(object0, CLS27.MTH897("chatroomAnnouncementClass2_field4"), 1);
            CLS66.MTH1446(CLS166.MTH3195(object0, CLS27.MTH897("chatroomAnnouncementClass2_method2"), new Object[0]));
        }
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public static Object MTH1377() {
        Object object0 = CLS66.MTH1414();
        return object0 == null ? null : CLS166.MTH3195(object0, CLS27.MTH892("configStorageGetMethod", "get"), new Object[]{7, null});
    }

    // 此方法包含解密的字符串
    public static void MTH1378(int v, String s) {
        Class class0 = CLS27.MTH894("voiceClass1");
        Class class1 = CLS27.MTH894("voiceRefreshClass");
        if(class0 != null && class1 != null) {
            try {
                if(CLS27.MTH890("voiceMethod3")) {
                    CLS166.MTH3192(class0, CLS27.MTH897("voiceMethod3"), new Object[]{s, v, 0});
                }
                else if(CLS27.MTH890("voiceMethod3_b")) {
                    CLS166.MTH3192(class0, CLS27.MTH897("voiceMethod3_b"), new Object[]{v, 0, s});
                }
                CLS166.MTH3195(CLS166.MTH3192(class1, CLS27.MTH897("voiceRefreshMethod"), new Object[0]), CLS27.MTH892("voiceRefreshRunMethod", "run"), new Object[0]);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1379(LinkedList linkedList0) {
        Class class0 = CLS27.MTH894("contactLabelModifyClass");
        if(class0 == null) {
            return;
        }
        try {
            Object object0 = CLS166.MTH3188(class0, new Object[]{linkedList0});
            CLS166.MTH3199(object0, "wx", Boolean.TRUE);
            CLS66.MTH1521(object0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1380(int v, String s, String s1, String s2) {
        String s4;
        Class class0 = CLS27.MTH894("sendVideoClass");
        if(class0 == null) {
            return;
        }
        if(CLS27.MTH890("sendVideoOriginMethod")) {
            String s3 = CLS182.MTH3475(4101151378460431157L, CLS182.MTH3483(s));
            CLS66.MTH1473(CLS66.MTH1449(s), CLS66.MTH1449(s3));
            CLS66.MTH1473(CLS66.MTH1482(s), CLS66.MTH1482(s3));
            CLS166.MTH3192(class0, CLS27.MTH897("sendVideoOriginMethod"), new Object[]{s3, null, v, s2, s1, 0, "", 43, null, "", 0, null, "", Boolean.TRUE});
            s4 = s3;
        }
        else {
            s4 = null;
        }
        CLS66.MTH1413(s, s4, s1, s2, 0, v, "", 0L, null);
    }

    // 此方法包含解密的字符串
    public static Object MTH1381(Class class0, byte[] arr_b) {
        if(class0 != null && arr_b != null) {
            try {
                return CLS166.MTH3184(CLS166.MTH3188(class0, new Object[0]), CLS27.MTH897("blobDecodeMethod"), new Class[]{byte[].class}, new Object[]{arr_b});
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static void MTH1382(Context context0, Object object0, String s) {
        if(!TextUtils.isEmpty(s) && object0 != null) {
            Class class0 = CLS27.MTH894("EmojiComponentClass");
            if(class0 != null) {
                CLS66.MTH1412(CLS166.MTH3192(class0, CLS27.MTH897("EmojiComponentClassMethod1"), new Object[]{object0}), s);
                return;
            }
            Class class1 = CLS27.MTH894("retransmitClass");
            if(class1 == null) {
                return;
            }
            try {
                if(!TextUtils.isEmpty(CLS27.MTH897("retransmitMethod"))) {
                    CLS166.MTH3192(class1, CLS27.MTH897("retransmitMethod"), new Object[]{context0, s, object0, Boolean.FALSE});
                    return;
                }
                CLS166.MTH3192(class1, CLS27.MTH897("retransmitMethod1"), new Object[]{context0, s, object0});
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    public static boolean MTH1383(String s, String s1) {
        return CLS66.MTH1405(CLS66.MTH1505(s), s1);
    }

    // 去混淆评级： 低(45)
    // 此方法包含解密的字符串
    public static Object MTH1384(String s) {
        Class class0 = CLS27.MTH894("dbClass1");
        return class0 == null ? null : CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("dbMethod1"), new Object[0]), CLS27.MTH897("delMethod2"), new Object[0]), CLS27.MTH897("delMethod3"), new Object[]{s});
    }

    // 此方法包含解密的字符串
    public static void MTH1385(String s, String s1) {
        Object object0;
        try {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            if(!CLS31.MTH1024(s1)) {
                return;
            }
            if(CLS27.MTH890("sendGifEmojiClass2")) {
                object0 = CLS166.MTH3192(CLS27.MTH894("sendGifEmojiClass2"), CLS27.MTH897("sendGifEmojiMethod1"), new Object[0]);
            }
            else {
                object0 = CLS27.MTH890("sendGifEmojiClass3") ? CLS166.MTH3195(CLS66.MTH1487(CLS27.MTH894("sendGifEmojiClass4")), CLS27.MTH897("sendGifEmojiMethod1"), new Object[0]) : null;
            }
            if(object0 == null) {
                return;
            }
            Object object1 = CLS166.MTH3195(object0, CLS27.MTH897("sendGifEmojiMethod2"), new Object[]{CLS31.MTH1017(s1)});
            if(object1 == null) {
                if(CLS27.MTH890("sendGifEmojiMethod3")) {
                    object1 = CLS166.MTH3195(object0, CLS27.MTH897("sendGifEmojiMethod2"), new Object[]{CLS166.MTH3195(object0, CLS27.MTH897("sendGifEmojiMethod3"), new Object[]{s1})});
                }
                else if(CLS27.MTH890("sendGifEmojiMethod3b")) {
                    object1 = CLS166.MTH3195(object0, CLS27.MTH897("sendGifEmojiMethod2"), new Object[]{CLS166.MTH3195(object0, CLS27.MTH897("sendGifEmojiMethod3b"), new Object[]{CLS27.MTH900(), s1})});
                }
            }
            if(object1 != null) {
                CLS66.MTH1412(object1, s);
                return;
            }
            CLS66.MTH1406(CLS27.MTH904(), s, s1);
        }
        catch(Throwable throwable0) {
            CLS66.MTH1406(CLS27.MTH904(), s, s1);
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1386(String s) {
        Object object2;
        Object object1;
        Object object0 = null;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            if(CLS27.MTH890("GetA8KeyClass_f1")) {
                object2 = CLS66.MTH1404(((int)System.currentTimeMillis()), s, CLS27.MTH904(), CLS27.MTH904(), new byte[0]);
            }
            else if(CLS27.MTH890("GetA8KeyClass_2")) {
                object2 = CLS166.MTH3195(CLS166.MTH3188(CLS27.MTH894("GetA8KeyClass_2"), new Object[0]), CLS27.MTH897("GetA8KeyClass_method2"), new Object[]{s, CLS27.MTH904(), 37, 0, 19, 8, null, ((int)System.currentTimeMillis()), new byte[0], CLS27.MTH904(), null});
            }
            else if(CLS27.MTH890("GetA8KeyClass_qr")) {
                Class class3 = CLS27.MTH894("GetA8KeyClass_qr");
                object1 = class3 == null ? null : CLS166.MTH3188(class3, new Object[]{s, 37, 19, 8, ((int)System.currentTimeMillis()), new byte[0]});
                object2 = object1;
            }
            else if(CLS27.MTH890("GetA8KeyClass_qr2")) {
                Class class0 = CLS27.MTH894("GetA8KeyClass_qr2");
                object1 = class0 == null ? null : CLS166.MTH3188(class0, new Object[]{s, 19, 8, ((int)System.currentTimeMillis()), new byte[0]});
                object2 = object1;
            }
            else if(CLS27.MTH890("GetA8KeyClass_qr2_b")) {
                Class class1 = CLS27.MTH894("GetA8KeyClass_qr2_b");
                object2 = class1 == null ? null : CLS166.MTH3188(class1, new Object[]{s, CLS27.MTH904(), 19, 8, ((int)System.currentTimeMillis()), new byte[0]});
            }
            else if(CLS27.MTH890("GetA8KeyClass_qr3")) {
                Class class2 = CLS27.MTH894("GetA8KeyClass_qr3");
                object2 = class2 == null ? null : CLS166.MTH3188(class2, new Object[]{s, CLS27.MTH904(), 37, 0, 19, 8, null, ((int)System.currentTimeMillis()), new byte[0], CLS27.MTH904(), null});
            }
            else {
                object2 = null;
            }
        }
        catch(Throwable throwable0) {
            goto label_47;
        }
        if(object2 == null) {
            try {
                Class class4 = CLS27.MTH894("GetA8KeyClass");
                if(class4 == null) {
                    return;
                }
                object2 = CLS166.MTH3188(class4, new Object[]{s, 37, 19, 8, null, ((int)System.currentTimeMillis()), new byte[0]});
                goto label_49;
            }
            catch(Throwable throwable0) {
                object0 = object2;
            }
        label_47:
            CLS27.MTH893(throwable0);
            object2 = object0;
        }
    label_49:
        if(object2 == null) {
            return;
        }
        CLS166.MTH3199(object2, "wx", s);
        CLS66.MTH1521(object2);
    }

    // 此方法包含解密的字符串
    public static void MTH1387(Activity activity0) {
        Object object4;
        if(!CLS27.MTH890("SnsAsyncQueueMgr_removeAllErrorComments")) {
            return;
        }
        try {
            Object object0 = CLS166.MTH3192(CLS27.MTH894("SnsPathClass"), CLS27.MTH897("SnsCore_getSnsAsyncQueueMgr"), new Object[0]);
            if(object0 == null) {
                return;
            }
            CLS166.MTH3195(object0, CLS27.MTH897("SnsAsyncQueueMgr_removeAllErrorComments"), new Object[0]);
            CLS66.MTH1373();
            String s = CLS412.MTH6009(activity0);
            if(s.equals(CLS27.MTH897("SnsTimeLineUI"))) {
                Object object1 = CLS166.MTH3194(activity0, CLS27.MTH897("SnsTimeLineUI_mUIAction"));
                if(object1 == null) {
                    return;
                }
                Object object2 = CLS166.MTH3194(object1, CLS27.MTH897("SnsUIAction_SnsHeaderField"));
                if(object2 == null) {
                    return;
                }
                CLS166.MTH3195(object2, CLS27.MTH897("SnsHeader_refreshError"), new Object[0]);
                return;
            }
            if(s.equals(CLS27.MTH897("ImproveSnsTimelineUI"))) {
                if(CLS27.MTH890("ImproveHeaderUIC_getErrorPostHandle")) {
                    Object object3 = CLS66.MTH1493(activity0, CLS27.MTH894("ImproveHeaderUIC"));
                    object4 = object3 == null ? null : CLS166.MTH3195(object3, CLS27.MTH897("ImproveHeaderUIC_getErrorPostHandle"), new Object[0]);
                }
                else if(CLS27.MTH890("ImproveMainUIC_getErrorPostHandle")) {
                    Object object5 = CLS66.MTH1493(activity0, CLS27.MTH894("ImproveHeaderUIC"));
                    object4 = object5 == null ? null : CLS166.MTH3195(object5, CLS27.MTH897("ImproveMainUIC_getErrorPostHandle"), new Object[0]);
                }
                else {
                    object4 = null;
                }
                if(object4 != null) {
                    CLS166.MTH3195(object4, CLS27.MTH897("HeaderErrorPostHandle_refreshError"), new Object[0]);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1388(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Class class0 = CLS27.MTH894("delChatroomClass2");
        Class class1 = CLS27.MTH894("delChatroomClass2_1");
        Class class2 = CLS27.MTH894("delChatroomClass1_2");
        Class class3 = CLS27.MTH894("delChatroomClass2_2");
        Class class4 = CLS27.MTH894("favClass1_a");
        try {
            if(s.endsWith("@im.chatroom")) {
                if(class0 != null) {
                    CLS166.MTH3195(CLS166.MTH3186(class0, CLS27.MTH897("delChatroomField1")), CLS27.MTH897("delChatroomMethod2"), new Object[0]);
                    return;
                }
                if(class1 != null) {
                    CLS166.MTH3195(CLS166.MTH3192(class4, CLS27.MTH897("userInfoMethod3"), new Object[]{class1}), CLS27.MTH897("delChatroomClass2_method1"), new Object[]{CLS166.MTH3188(class3, new Object[]{s, 0, 0, 0, 0})});
                    return;
                }
                if(class2 != null) {
                    Object object0 = CLS166.MTH3188(class2, new Object[0]);
                    if(!TextUtils.isEmpty(CLS27.MTH897("delChatroomClass1_2_method2"))) {
                        CLS166.MTH3195(object0, CLS27.MTH897("delChatroomClass1_2_method2"), new Object[]{s});
                    }
                    else if(!TextUtils.isEmpty(CLS27.MTH897("delChatroomClass1_2_field1"))) {
                        CLS166.MTH3198(object0, CLS27.MTH897("delChatroomClass1_2_field1"), s);
                    }
                    if(!TextUtils.isEmpty(CLS27.MTH897("delChatroomClass1_2_method3"))) {
                        CLS166.MTH3195(object0, CLS27.MTH897("delChatroomClass1_2_method3"), new Object[]{11});
                    }
                    else if(!TextUtils.isEmpty(CLS27.MTH897("delChatroomClass1_2_field2"))) {
                        CLS166.MTH3196(11, object0, CLS27.MTH897("delChatroomClass1_2_field2"));
                    }
                    CLS166.MTH3195(object0, CLS27.MTH897("delChatroomClass1_2_method1"), new Object[0]);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1389(String s, String s1) {
        String s2 = CLS27.MTH904();
        try {
            if(CLS27.MTH894("sendVideoClass") != null && CLS31.MTH1027(s)) {
                String s3 = CLS66.MTH1525(s2);
                CLS66.MTH1473(s, CLS66.MTH1449(s3));
                CLS518.MTH7053(new File(CLS66.MTH1482(s3)), s);
                long v = CLS31.MTH984(new CLS69(CLS66.MTH1449(s3)));
                CLS66.MTH1380((v == 0L ? 1 : ((int)(v / 1000L))), s3, s, s1);
                String s4 = CLS31.MTH1017(CLS66.MTH1449(s3));
                CLS21.FLD76.MTH818("skip_large_video_check", new Object[]{s4});
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1390(String s, String s1, String s2) {
        Object object0 = null;
        if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2) && !TextUtils.isEmpty(s)) {
            if(CLS27.MTH890("RedPacketMsgClass")) {
                Class class0 = CLS27.MTH894("RedPacketMsgClass");
                if(class0 != null) {
                    object0 = CLS166.MTH3188(class0, new Object[]{s, s1, s2, "v1.0"});
                }
            }
            else if(CLS27.MTH890("RedPacketMsgClass_b")) {
                Class class1 = CLS27.MTH894("RedPacketMsgClass_b");
                if(class1 != null) {
                    object0 = CLS166.MTH3188(class1, new Object[]{s, s1, s2});
                }
            }
            if(object0 == null) {
                return;
            }
            CLS66.MTH1521(object0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1391(String s, boolean z) {
        Object object0;
        if(z == CLS66.MTH1455(s)) {
            return;
        }
        Class class0 = CLS27.MTH894("ManageRoomAllowByIdentityClass1");
        if(class0 == null) {
            return;
        }
        Class class1 = CLS27.MTH894("userInfoClass2");
        if(class1 == null) {
            return;
        }
        Class class2 = CLS27.MTH894("favClass1_a");
        if(class2 == null) {
            return;
        }
        Class class3 = CLS27.MTH894("RoomNameClass3");
        if(class3 == null) {
            return;
        }
        if(CLS426.MTH6107(s)) {
            Class class4 = CLS27.MTH894("ManageRoomAllowByIdentityClass2");
            if(class4 == null) {
                return;
            }
            object0 = CLS166.MTH3188(class4, new Object[]{s, ((int)z)});
        }
        else {
            Object object1 = CLS166.MTH3188(class0, new Object[0]);
            CLS166.MTH3198(object1, CLS27.MTH897("ManageRoomAllowByIdentityField1"), s);
            CLS166.MTH3196((z ? 2 : 0), object1, CLS27.MTH897("ManageRoomAllowByIdentityField2"));
            object0 = CLS166.MTH3188(class3, new Object[]{66, object1});
        }
        CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3192(class2, CLS27.MTH897("userInfoMethod3"), new Object[]{class1}), CLS27.MTH897("delMethod5"), new Object[0]), CLS27.MTH897("delMethod6"), new Object[]{object0});
    }

    // 此方法包含解密的字符串
    public static boolean MTH1392(String s) {
        Object object0 = CLS66.MTH1384(s);
        return object0 == null ? false : (CLS166.MTH3181(object0, "field_type") & 0x40) != 0;
    }

    public static void MTH1393(String s, String s1, String s2) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(s2);
        CLS66.MTH1427(s, s1, arrayList0);
    }

    // 去混淆评级： 低(25)
    // 此方法包含解密的字符串
    public static boolean MTH1394(String s) {
        if(CLS27.MTH890("VideoParseInfoClass")) {
            try {
                String s1 = (String)CLS166.MTH3195(CLS66.MTH1453(s), CLS27.MTH897("sendVideoMethod2"), new Object[0]);
                Class class0 = CLS27.MTH894("VideoParseInfoClass");
                Object object0 = CLS27.MTH890("VideoParseInfoClass_field1") ? CLS166.MTH3195(CLS166.MTH3186(class0, CLS27.MTH897("VideoParseInfoClass_field1")), CLS27.MTH897("VideoParseInfoClass_parseMethod"), new Object[]{s1}) : CLS166.MTH3192(class0, CLS27.MTH897("VideoParseInfoClass_parseMethod"), new Object[]{s1});
                return object0 == null ? false : !TextUtils.isEmpty(((String)CLS166.MTH3194(object0, CLS27.MTH897("VideoParseInfoClass_cdnrawvideourl"))));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static String MTH1395(String s) [...] // 潜在的解密器

    // 此方法包含解密的字符串
    public static boolean MTH1396(File file0, String s) {
        Class class0 = CLS27.MTH894("diceClass2");
        boolean z = false;
        if(class0 == null) {
            return false;
        }
        Class class1 = CLS27.MTH894("favClass1_a");
        Class class2 = CLS27.MTH894("EmojiManagerInterface");
        CLS371.FLD3470.getClass();
        Cursor cursor0 = CLS371.FLD3470.MTH5307("SELECT * FROM EmojiInfo WHERE md5=?", new String[]{s});
        if(cursor0 == null) {
            return false;
        }
        try {
            if(cursor0.moveToFirst()) {
                Object object0 = CLS166.MTH3188(class0, new Object[0]);
                CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
                z = CLS31.MTH1033(file0, ((byte[])CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3192(class1, CLS27.MTH897("favClass1_a_method1"), new Object[]{class2}), CLS27.MTH897("getEmojiMgrMethod"), new Object[0]), CLS27.MTH897("decodeAsGifMethod"), new Object[]{object0})));
            }
            if(!cursor0.isClosed()) {
                cursor0.close();
                return z;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return z;
    }

    // 此方法包含解密的字符串
    public static Object MTH1397(int v) {
        if(CLS27.MTH890("UploadPackHelper")) {
            Class class0 = CLS27.MTH894("UploadPackHelper");
            return class0 == null ? null : CLS166.MTH3188(class0, new Object[]{v});
        }
        if(CLS27.MTH890("UploadPackHelper_b")) {
            Class class1 = CLS27.MTH894("UploadPackHelper_b");
            return class1 == null ? null : CLS166.MTH3188(class1, new Object[]{v, CLS27.MTH900()});
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static void MTH1398(long v, long v1, Object object0, boolean z) {
        Class class0 = CLS27.MTH894("GetMsgImgClass");
        if(class0 == null) {
            return;
        }
        Object[] arr_object = new Object[5];
        int v2 = 0;
        arr_object[0] = v;
        arr_object[1] = v1;
        arr_object[2] = (int)z;
        arr_object[3] = object0;
        if(!z) {
            v2 = -1;
        }
        arr_object[4] = v2;
        CLS66.MTH1521(CLS166.MTH3188(class0, arr_object));
    }

    // 此方法包含解密的字符串
    public static String MTH1399(Object object0) {
        try {
            Class class0 = CLS27.MTH894("snsContentClass");
            return class0 == null ? "" : CLS502.MTH6931(CLS66.MTH1511(CLS66.MTH1381(class0, ((byte[])CLS166.MTH3194(object0, "field_content")))));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static HashMap MTH1400(String s, List list0, boolean z) {
        HashMap hashMap0 = new HashMap();
        if(CLS27.MTH894("dbClass1") == null) {
            return hashMap0;
        }
        try {
            Object object0 = CLS66.MTH1505(s);
            if(object0 == null) {
                return hashMap0;
            }
            CLS371 ʻ0 = CLS371.FLD3470;
            for(Object object1: list0) {
                String s1 = (String)object1;
                String s2 = (String)CLS166.MTH3195(object0, CLS27.MTH897("AtSomeoneMethod2"), new Object[]{s1});
                if(TextUtils.isEmpty(s2)) {
                    s2 = ʻ0.MTH5304(s1);
                }
                if(z) {
                    hashMap0.put(s2, s1);
                }
                else {
                    hashMap0.put(s1, s2);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return hashMap0;
    }

    // 此方法包含解密的字符串
    public static void MTH1401(Cursor cursor0, boolean z, SharedPreferences sharedPreferences0) {
        Class class0 = CLS27.MTH894("contactModel");
        if(class0 == null) {
            return;
        }
        Class class1 = CLS27.MTH894("SetRemarkClass");
        if(class1 == null) {
            return;
        }
        Object object0 = CLS166.MTH3188(class0, new Object[0]);
        CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
        if(!z) {
            if(CLS27.MTH890("setUnMuteContactMethod")) {
                CLS166.MTH3192(class1, CLS27.MTH897("setUnMuteContactMethod"), new Object[]{object0});
            }
            else if(CLS27.MTH890("setUnMuteContactMethod_b")) {
                CLS166.MTH3192(class1, CLS27.MTH897("setUnMuteContactMethod_b"), new Object[]{object0, Boolean.TRUE});
            }
        }
        else if(CLS27.MTH890("setMuteContactMethod")) {
            CLS166.MTH3192(class1, CLS27.MTH897("setMuteContactMethod"), new Object[]{object0});
        }
        else if(CLS27.MTH890("setMuteContactMethod_b")) {
            CLS166.MTH3192(class1, CLS27.MTH897("setMuteContactMethod_b"), new Object[]{object0, Boolean.TRUE});
        }
        sharedPreferences0.edit().putBoolean("room_notify_new_msg", z).apply();
    }

    // 此方法包含解密的字符串
    public static void MTH1402(int v, String s, String s1) {
        Object object0 = null;
        if(CLS27.MTH890("RedPacketReceiveUnionClass_c")) {
            Class class0 = CLS27.MTH894("RedPacketReceiveUnionClass_c");
            if(class0 != null) {
                object0 = CLS166.MTH3188(class0, new Object[]{v, s, s1, 0});
            }
        }
        else if(CLS27.MTH890("RedPacketReceiveUnionClassb")) {
            Class class1 = CLS27.MTH894("RedPacketReceiveUnionClassb");
            if(class1 != null) {
                object0 = CLS166.MTH3188(class1, new Object[]{1, v, s, s1, 0, "v1.0"});
            }
        }
        else if(CLS27.MTH890("RedPacketReceiveUnionClass")) {
            Class class2 = CLS27.MTH894("RedPacketReceiveUnionClass");
            if(class2 != null) {
                object0 = CLS166.MTH3188(class2, new Object[]{v, s, s1, 0, "v1.0"});
            }
        }
        if(object0 == null) {
            return;
        }
        CLS66.MTH1521(object0);
    }

    // 此方法包含解密的字符串
    public static Map MTH1403(Object object0) {
        if(object0 == null) {
            return null;
        }
        if(CLS27.MTH890("chatroomDataClassMapField")) {
            return (Map)CLS182.MTH3492(0x38EBE9222B3CD335L, object0);
        }
        Map map0 = (Map)CLS164.MTH3175(object0, Map.class);
        return map0 == null ? ((Map)CLS164.MTH3175(object0, ConcurrentHashMap.class)) : map0;
    }

    // 此方法包含解密的字符串
    public static Object MTH1404(int v, String s, String s1, String s2, byte[] arr_b) {
        try {
            Class class0 = CLS27.MTH894("GetA8KeyClass");
            Class class1 = CLS27.MTH894("GetA8KeyCls_1");
            Class class2 = CLS27.MTH894("GetA8KeyCls_2");
            Object object0 = CLS166.MTH3188(class0, new Object[]{s, 0});
            Object object1 = CLS166.MTH3194(CLS166.MTH3194(CLS166.MTH3194(object0, CLS27.MTH897("GetA8KeyClass_f1")), CLS27.MTH897("GetA8KeyClass_f1_f1")), CLS27.MTH897("GetA8KeyClass_f1_f1_f1"));
            CLS166.MTH3196(2, object1, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f2"));
            Object object2 = CLS166.MTH3188(class1, new Object[0]);
            CLS166.MTH3198(object2, CLS27.MTH897("GetA8KeyCls_1_f1"), s);
            CLS166.MTH3189(object2, CLS27.MTH897("GetA8KeyCls_1_f2"), true);
            CLS166.MTH3198(object1, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f7"), object2);
            CLS166.MTH3196(37, object1, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f10"));
            CLS166.MTH3198(object1, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f11"), s1);
            CLS166.MTH3196(0, object1, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f14"));
            CLS166.MTH3196(19, object1, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f18"));
            CLS166.MTH3196(8, object1, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f19"));
            CLS166.MTH3196(v, object1, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f20"));
            CLS166.MTH3198(object1, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f28"), s2);
            CLS166.MTH3198(object1, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f29"), null);
            Object object3 = CLS166.MTH3188(class1, new Object[0]);
            CLS166.MTH3198(object3, CLS27.MTH897("GetA8KeyCls_1_f1"), null);
            CLS166.MTH3189(object3, CLS27.MTH897("GetA8KeyCls_1_f2"), true);
            CLS166.MTH3198(object1, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f4"), object3);
            Object object4 = CLS166.MTH3188(class2, new Object[0]);
            CLS166.MTH3195(object4, CLS27.MTH897("GetA8KeyCls_2_m1"), new Object[]{arr_b});
            CLS166.MTH3198(object1, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f23"), object4);
            return object0;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH1405(Object object0, String s) {
        if(object0 != null) {
            try {
                if(!TextUtils.isEmpty(CLS27.MTH897("ChatroomIsModMethod"))) {
                    return ((Boolean)CLS166.MTH3195(object0, CLS27.MTH897("ChatroomIsModMethod"), new Object[]{s})).booleanValue();
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static void MTH1406(String s, String s1, String s2) {
        try {
            if(CLS27.MTH890("ImgServiceClass")) {
                Class class0 = CLS27.MTH894("ImgServiceClass");
                if(class0 != null) {
                    CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("ImgServiceMethod1"), new Object[0]), CLS27.MTH897("ImgServiceMethod2"), new Object[]{s, s1, s2, 1, Boolean.FALSE});
                    return;
                }
            }
            Class class1 = CLS27.MTH894("sendImgClass");
            if(class1 != null) {
                CLS66.MTH1521(CLS166.MTH3188(class1, new Object[]{4, s, s1, s2, 1, null, 0, null, "", Boolean.TRUE, 0x7F080341, 0, -1000.0f, -1000.0f}));
                return;
            }
            Class class2 = CLS27.MTH894("sendImgClass2_b");
            if(class2 != null) {
                CLS66.MTH1521(CLS166.MTH3188(class2, new Object[]{4, s, s1, s2, 1, null, 0, null, "", Boolean.TRUE, 0x7F080341}));
                return;
            }
            Class class3 = CLS27.MTH894("sendImgClass2");
            if(class3 != null) {
                CLS66.MTH1521(CLS166.MTH3188(class3, new Object[]{4, s, s1, s2, 1, null, 0, null, "", Boolean.TRUE, 0x7F080341, 0, -1000.0f, -1000.0f, -1}));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 中等(50)
    // 此方法包含解密的字符串
    public static String MTH1407(Object object0) {
        return object0 == null ? null : ((String)CLS166.MTH3194(object0, CLS27.MTH892("snsLikeContentField", CLS27.MTH897("snsCommentContentField"))));
    }

    // 此方法包含解密的字符串
    public static void MTH1408(String s, CLS1467 ˑˆ0) {
        Class class0 = CLS27.MTH894("dbClass1");
        if(class0 != null && !TextUtils.isEmpty(s)) {
            try {
                CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("dbMethod1"), new Object[0]), CLS27.MTH897("delMethod8"), new Object[0]), CLS27.MTH897("markReadMethod1"), new Object[]{s});
                if(CLS27.MTH890("MMAppMgr")) {
                    CLS166.MTH3192(CLS27.MTH894("MMAppMgr"), CLS27.MTH897("markReadmethod3"), new Object[]{s});
                }
                else if(CLS27.MTH890("markRead_cls2_method1")) {
                    CLS166.MTH3195(CLS166.MTH3192(CLS27.MTH894("dbClass1"), CLS27.MTH897("markRead_cls2_method1"), new Object[0]), CLS27.MTH897("markRead_cls2_method2"), new Object[]{s});
                }
                if(CLS27.MTH890("markReadClass1")) {
                    Class class1 = CLS27.MTH894("markReadClass1");
                    if(class1 != null) {
                        CLS166.MTH3192(class1, CLS27.MTH897("markReadMethod2"), new Object[]{s, 1});
                    }
                }
                else if(CLS27.MTH890("markReadClass2")) {
                    if(CLS27.MTH890("markReadMethod2")) {
                        CLS166.MTH3195(CLS66.MTH1487(CLS27.MTH894("markReadClass2")), CLS27.MTH897("markReadMethod2"), new Object[]{s, 1});
                    }
                    else if(CLS27.MTH890("markReadMethod2b")) {
                        CLS166.MTH3195(CLS66.MTH1487(CLS27.MTH894("markReadClass2")), CLS27.MTH897("markReadMethod2b"), new Object[]{1, s});
                    }
                }
                if(ˑˆ0 != null) {
                    ˑˆ0.MTH774();
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1409(int v, String s, String s1, String s2) {
        Object object0 = null;
        if(CLS27.MTH890("RedPacketOpenClass3b")) {
            Class class0 = CLS27.MTH894("RedPacketOpenClass3b");
            if(class0 != null) {
                object0 = CLS166.MTH3188(class0, new Object[]{1, v, s, s1, ((int)(!CLS426.MTH6126(s2))), "v1.0", s2});
            }
        }
        else if(CLS27.MTH890("RedPacketOpenClass3")) {
            Class class1 = CLS27.MTH894("RedPacketOpenClass3");
            if(class1 != null) {
                object0 = CLS166.MTH3188(class1, new Object[]{v, s, s1, ((int)(!CLS426.MTH6126(s2))), "v1.0", s2});
            }
        }
        else if(CLS27.MTH890("RedPacketOpenClass4")) {
            Class class2 = CLS27.MTH894("RedPacketOpenClass4");
            if(class2 != null) {
                object0 = CLS166.MTH3188(class2, new Object[]{v, s, ((int)(!CLS426.MTH6126(s2))), s1, s2});
            }
        }
        else if(CLS27.MTH890("RedPacketOpenClass2")) {
            Class class3 = CLS27.MTH894("RedPacketOpenClass2");
            if(class3 != null) {
                object0 = CLS166.MTH3188(class3, new Object[]{v, s, s1, ((int)(!CLS426.MTH6126(s2))), "v1.0"});
            }
        }
        if(object0 == null) {
            return;
        }
        CLS66.MTH1521(object0);
    }

    // 此方法包含解密的字符串
    public static String MTH1410(String s) {
        String s1 = CLS66.MTH1374(s);
        if(TextUtils.isEmpty(s1)) {
            return "";
        }
        if(new File(s1).exists()) {
            return s1;
        }
        String s2 = new CLS69(s1).MTH1563();
        File file0 = new File(s2);
        if(file0.exists()) {
            return s2;
        }
        try {
            File file1 = file0.getParentFile();
            if(file1 == null) {
                return "";
            }
            File[] arr_file = file1.listFiles();
            if(arr_file != null && arr_file.length > 0) {
                String s3 = file0.getName();
                int v = s3.indexOf(".");
                if(v != -1) {
                    s3 = s3.substring(0, v - 1);
                }
                String s4 = "";
                int v2 = file0.getName().lastIndexOf(".");
                if(v2 != -1) {
                    s4 = file0.getName().substring(v2);
                }
                if(!TextUtils.isEmpty(s4)) {
                label_24:
                    for(int v1 = 0; v1 < arr_file.length; ++v1) {
                        File file2 = arr_file[v1];
                        String s5 = file2.getName();
                        if(s5.startsWith(s3) && s5.endsWith(s4)) {
                            return file2.getAbsolutePath();
                        }
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            if(true) {
                return "";
            }
            goto label_24;
        }
        return "";
    }

    // 此方法包含解密的字符串
    public static void MTH1411(HashMap hashMap0, long v, CLS12 ᵔʾ0) {
        if(CLS182.MTH3470(4101146752780653365L)) {
            ᵔʾ0.MTH791(null);
            return;
        }
        Class class0 = CLS27.MTH894("sendArticleClass");
        Class class1 = CLS27.MTH894("SendArticleClass3");
        Class class2 = CLS27.MTH894("FileOpClass");
        if(class2 != null && class0 != null) {
            try {
                String s = (String)hashMap0.get(".msg.appmsg.appattach.attachid");
                String s1 = CLS66.MTH1362(v, s);
                if(TextUtils.isEmpty(s1)) {
                    ᵔʾ0.MTH791(null);
                    return;
                }
                CLS1234 ˊⁱ0 = new CLS1234(class0, class1, ᵔʾ0, hashMap0, class2, s1, 4);
                if(!CLS31.MTH1029(new CLS69(s1))) {
                    CLS66.MTH1503(v, s, ((CLS3)ˊⁱ0));
                    return;
                }
                ᵔʾ0.MTH791(s1);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        ᵔʾ0.MTH791(null);
    }

    // 此方法包含解密的字符串
    public static void MTH1412(Object object0, String s) {
        Object object2;
        if(!TextUtils.isEmpty(s) && object0 != null) {
            Class class0 = CLS27.MTH894("dbClass1");
            Class class1 = CLS27.MTH894("diceClass1");
            Class class2 = CLS27.MTH894("diceClass1b");
            if(class0 == null) {
                return;
            }
            try {
                Object object1 = CLS66.MTH1384(s);
                if(class1 == null) {
                    object2 = class2 == null ? null : CLS166.MTH3188(class2, new Object[]{CLS21.FLD76.MTH836("getChattingContext", new Object[0]), object1, s});
                }
                else {
                    object2 = CLS166.MTH3188(class1, new Object[]{CLS27.MTH900(), object1, s});
                }
                if(object2 == null) {
                    return;
                }
                CLS166.MTH3195(object2, CLS27.MTH897("diceMethod1"), new Object[]{object0});
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1413(String s, String s1, String s2, String s3, int v, int v1, String s4, long v2, Object object0) {
        Class class0 = CLS27.MTH894("sendVideoClass");
        if(class0 == null) {
            return;
        }
        try {
            if(!TextUtils.isEmpty(CLS27.MTH897("sendVideoMethod"))) {
                CLS166.MTH3192(class0, CLS27.MTH897("sendVideoMethod"), new Object[]{s, v1, s3, null, v, s4, 43});
            }
            else if(!TextUtils.isEmpty(CLS27.MTH897("sendVideoMethod_b"))) {
                CLS166.MTH3192(class0, CLS27.MTH897("sendVideoMethod_b"), new Object[]{s, v1, s3, null, v, s4, 43, v2});
            }
            else if(!TextUtils.isEmpty(CLS27.MTH897("sendVideoMethod_c"))) {
                CLS166.MTH3192(class0, CLS27.MTH897("sendVideoMethod_c"), new Object[]{s, v1, s3, null, v, s4, 43, v2, null});
            }
            else if(!TextUtils.isEmpty(CLS27.MTH897("sendVideoMethod_d"))) {
                CLS166.MTH3192(class0, CLS27.MTH897("sendVideoMethod_d"), new Object[]{s, v1, s3, v, s4, 43, v2, null});
            }
            else if(!TextUtils.isEmpty(CLS27.MTH897("sendVideoMethod_e"))) {
                CLS166.MTH3192(class0, CLS27.MTH897("sendVideoMethod_e"), new Object[]{s, v1, s3, "", v, s4, 43, v2, null});
            }
            else if(!TextUtils.isEmpty(CLS27.MTH897("sendVideoMethod_f"))) {
                CLS166.MTH3192(class0, CLS27.MTH897("sendVideoMethod_f"), new Object[]{s, s1, v1, s3, s2, v, s4, 43, object0, null, v2, null, ""});
            }
            CLS166.MTH3192(class0, CLS27.MTH897("sendVideoMethod3"), new Object[]{s});
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static Object MTH1414() {
        Object object0 = CLS66.MTH1457();
        if(object0 == null) {
            try {
                return CLS166.MTH3195(CLS166.MTH3192(CLS27.MTH894("dbClass1"), CLS27.MTH897("dbMethod1"), new Object[0]), CLS27.MTH897("uploadStoreMethod2"), new Object[0]);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                return null;
            }
        }
        try {
            return CLS166.MTH3195(object0, CLS27.MTH897("uploadStoreMethod2"), new Object[0]);
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1415(String s) {
        Class class0 = CLS27.MTH894("contactLabelAddClass");
        if(class0 == null) {
            return;
        }
        try {
            Object object0 = CLS166.MTH3188(class0, new Object[]{s});
            CLS166.MTH3199(object0, "wx", s);
            CLS66.MTH1521(object0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH1416(String s, CLS12 ᵔʾ0) {
        Object object2;
        Object object1;
        if(CLS27.MTH890("RecogQBarOfImageFileInterface")) {
            if(CLS27.MTH890("RecogQBarOfImageFileInterface")) {
                Class class0 = CLS27.MTH894("RecogQBarOfImageFileInterface");
                Class class1 = CLS27.MTH894("RecogQBarOfImageFileEvent");
                Class class2 = CLS27.MTH894("QBarOfImageFileResultEventDataParserClass");
                Class class3 = CLS27.MTH894("QBarOfImageFileResultEventDataParserClass2");
                Object object0 = Proxy.newProxyInstance(class0.getClassLoader(), new Class[]{class0}, new CLS63(class2, class3, ᵔʾ0, 2));
                long v = System.currentTimeMillis();
                if(CLS27.MTH890("ImageScanCodeManagerClass2")) {
                    object1 = CLS166.MTH3188(CLS27.MTH894("ImageScanCodeManagerClass2"), new Object[0]);
                    CLS166.MTH3190(v, object1, CLS27.MTH897("ImageScanCodeManagerClass2_field1"));
                    CLS166.MTH3198(object1, CLS27.MTH897("ImageScanCodeManagerClass2_pathField"), s);
                    CLS166.MTH3198(object1, CLS27.MTH897("ImageScanCodeManagerClass2_bitmapField"), null);
                    CLS166.MTH3196(2, object1, CLS27.MTH897("ImageScanCodeManagerClass2_typeField"));
                }
                else {
                    object1 = CLS27.MTH890("ImageScanCodeManagerClass2b") ? CLS166.MTH3188(CLS27.MTH894("ImageScanCodeManagerClass2b"), new Object[]{v, 0L, s, null, 2}) : null;
                }
                CLS21 ʾᵢ0 = CLS21.FLD76;
                Activity activity0 = (Activity)ʾᵢ0.MTH836("getCurrentActivity", new Object[0]);
                if(activity0 != null) {
                    if(CLS27.MTH890("ImageScanCodeManagerClass")) {
                        object2 = CLS166.MTH3188(CLS27.MTH894("ImageScanCodeManagerClass"), new Object[]{activity0, Boolean.TRUE});
                    }
                    else {
                        object2 = CLS27.MTH890("ImageScanCodeManagerClassb") ? CLS166.MTH3188(CLS27.MTH894("ImageScanCodeManagerClassb"), new Object[]{activity0, Boolean.TRUE, ʾᵢ0.MTH826("getCurrentTalker2", new Object[0])}) : null;
                    }
                    HashMap hashMap0 = (HashMap)CLS182.MTH3492(4101601989249258293L, object2);
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.add(object0);
                    hashMap0.put(s, arrayList0);
                    ((HashMap)CLS166.MTH3194(object2, CLS27.MTH897("ImageScanCodeManagerClass_field2"))).put(s, object1);
                    Object object3 = CLS166.MTH3188(class1, new Object[0]);
                    Object object4 = CLS182.MTH3492(0x38EBD1092B3CD335L, object3);
                    CLS166.MTH3190(v, object4, CLS27.MTH897("RecogQBarOfImageFileEvent_field1_field1"));
                    CLS166.MTH3198(object4, CLS27.MTH897("RecogQBarOfImageFileEvent_field1_field2"), s);
                    CLS166.MTH3198(object4, CLS27.MTH897("RecogQBarOfImageFileEvent_field1_field3"), null);
                    CLS166.MTH3198(object4, CLS27.MTH897("RecogQBarOfImageFileEvent_field1_field4"), Boolean.TRUE);
                    CLS166.MTH3196(2, object4, CLS27.MTH897("RecogQBarOfImageFileEvent_field1_field5"));
                    CLS166.MTH3195(object3, CLS27.MTH897("RecogQBarOfImageFileEvent_publishMethod"), new Object[0]);
                    return true;
                }
            }
            return false;
        }
        if(CLS27.MTH890("ImageScanCodeCallbackInterfaceClass")) {
            try {
                if(CLS27.MTH890("ImageScanCodeCallbackInterfaceClass")) {
                    Class class4 = CLS27.MTH894("ImageScanCodeManagerClass");
                    if(class4 != null) {
                        Class class5 = CLS27.MTH894("ImageScanCodeCallbackInterfaceClass");
                        if(class5 != null) {
                            Activity activity1 = (Activity)CLS21.FLD76.MTH836("getCurrentActivity", new Object[0]);
                            if(activity1 != null) {
                                Object object5 = CLS166.MTH3188(class4, new Object[]{activity1, Boolean.TRUE});
                                Object object6 = Proxy.newProxyInstance(class5.getClassLoader(), new Class[]{class5}, new CLS64(1, ᵔʾ0));
                                CLS164.MTH3178(object5, CLS164.MTH3173(class4, CLS27.MTH897("ImageScanCodeManagerScanMethod1"), Void.TYPE, new Object[]{View.class, String.class, Bitmap.class, Boolean.TYPE, Integer.TYPE, CLS27.MTH897("ImageScanCodeCallbackInterfaceClass")}), new Object[]{null, s, null, Boolean.TRUE, 1, object6});
                                return true;
                            }
                        }
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static String MTH1417(String s) {
        String s1 = CLS27.MTH889("emoji");
        if(TextUtils.isEmpty(s)) {
            return s1;
        }
        Class class0 = CLS27.MTH894("emojiClass2");
        if(class0 != null) {
            try {
                String s2 = (String)CLS166.MTH3192(class0, CLS27.MTH897("emojiMethod4"), new Object[]{s});
                return TextUtils.isEmpty(s2) ? s1 : CLS34.MTH1079(0x38EA1FF42B3CD335L, new StringBuilder(), s2, 4101125552822080309L);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return s1;
    }

    // 此方法包含解密的字符串
    public static int MTH1418(String s, int v, ArrayList arrayList0, ArrayList arrayList1) {
        try {
            if(TextUtils.isEmpty(s)) {
                return -1;
            }
            Object object0 = CLS66.MTH1397(2);
            if(object0 == null) {
                return -1;
            }
            if(v == 3) {
                CLS166.MTH3195(object0, CLS27.MTH897("upSetShareTypeMethod"), new Object[]{1});
            }
            else {
                CLS166.MTH3195(object0, CLS27.MTH897("upSetShareTypeMethod"), new Object[]{0});
            }
            if(CLS27.MTH890("upSetTypeMethod")) {
                CLS166.MTH3195(object0, CLS27.MTH897("upSetTypeMethod"), new Object[]{0});
            }
            else if(CLS27.MTH890("upClassField4")) {
                CLS166.MTH3198(CLS166.MTH3194(object0, CLS27.MTH897("upClassField4")), CLS27.MTH897("upClassField5"), 0);
            }
            if(!TextUtils.isEmpty(CLS27.MTH897("upMethod3"))) {
                CLS166.MTH3195(object0, CLS27.MTH897("upMethod3"), new Object[]{null, null, null, ((int)(v <= 1 ? 0 : 1)), 0});
            }
            CLS166.MTH3195(object0, CLS27.MTH897("upSetContentMethod"), new Object[]{s});
            CLS166.MTH3195(object0, CLS27.MTH897("upSetMentionListMethod"), new Object[]{CLS66.MTH1504(arrayList0)});
            CLS166.MTH3195(object0, CLS27.MTH897("upSetPrivateMethod"), new Object[]{((int)(v == 1 ? 1 : 0))});
            if(CLS27.MTH890("upMethod4")) {
                CLS166.MTH3195(object0, CLS27.MTH897("upMethod4"), new Object[]{0});
            }
            else if(CLS27.MTH890("upClass1Field2")) {
                CLS166.MTH3198(CLS166.MTH3194(object0, CLS27.MTH897("upClass1Field2")), CLS27.MTH897("upClass1Field3"), 0);
            }
            CLS166.MTH3195(object0, CLS27.MTH897("upSetListMethod"), new Object[]{arrayList1});
            int v1 = (int)(((Integer)CLS166.MTH3195(object0, CLS27.MTH897("upCommitMethod"), new Object[0])));
            Class class0 = CLS27.MTH894("SnsPathClass");
            if(class0 != null) {
                CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("upMethod1"), new Object[0]), CLS27.MTH897("upMethod2"), new Object[0]);
            }
            return v1;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return -1;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1419(long v, String s, String s1) {
        String s2 = CLS27.MTH904();
        try {
            if(CLS27.MTH894("sendVideoClass") != null) {
                String s3 = CLS66.MTH1525(s2);
                CLS66.MTH1473(CLS66.MTH1449(s), CLS66.MTH1449(s3));
                if(CLS31.MTH1024(CLS66.MTH1482(s))) {
                    CLS66.MTH1473(CLS66.MTH1482(s), CLS66.MTH1482(s3));
                }
                else {
                    CLS518.MTH7053(new File(CLS66.MTH1482(s3)), CLS66.MTH1449(s));
                }
                Object object0 = CLS66.MTH1453(s);
                CLS66.MTH1429(s, s3, s1, CLS166.MTH3181(object0, CLS27.MTH897("sendVideoField1")), CLS166.MTH3181(object0, CLS27.MTH897("sendVideoField2")), "", v, (CLS27.MTH890("sendVideoField3") ? CLS166.MTH3194(object0, CLS27.MTH897("sendVideoField3")) : null));
                String s4 = CLS31.MTH1017(CLS66.MTH1449(s3));
                CLS21.FLD76.MTH818("skip_large_video_check", new Object[]{s4});
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1420(CLS78 ˊﾞ0) {
        Class class0 = CLS27.MTH894("contactModel");
        if(class0 == null) {
            return;
        }
        try {
            Cursor cursor0 = CLS371.FLD3470.MTH5307("SELECT * FROM rcontact WHERE username = ? or encryptUsername = ?", new String[]{"", ""});
            if(cursor0 == null) {
                return;
            }
            if(cursor0.moveToFirst()) {
                Object object0 = CLS166.MTH3188(class0, new Object[0]);
                CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
                if(TextUtils.isEmpty(ˊﾞ0.FLD277)) {
                    String s = "" + CLS166.MTH3195(object0, CLS27.MTH892("contactModel_getProvince", "getProvince"), new Object[0]) + CLS166.MTH3195(object0, CLS27.MTH892("contactModel_getCity", "getCity"), new Object[0]);
                    if(!TextUtils.isEmpty(s)) {
                        ˊﾞ0.FLD277 = s;
                    }
                }
                if(ˊﾞ0.FLD278 == -1) {
                    ˊﾞ0.FLD278 = CLS166.MTH3181(object0, CLS27.MTH892("ContactSexField", "sex"));
                }
                String s1 = cursor0.getString(cursor0.getColumnIndex("alias"));
                if(!TextUtils.isEmpty(s1)) {
                    ˊﾞ0.FLD276 = s1;
                }
            }
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH1421(String s, String s1, Map map0) {
        if(TextUtils.isEmpty(s1)) {
            return "";
        }
        if(map0.containsKey(s1)) {
            try {
                Object object0 = map0.get(s1);
                if(object0 != null) {
                    String s2 = (String)CLS166.MTH3194(object0, CLS27.MTH897("chatroomMemberNicknameField"));
                    return s2 == null ? "" : s2;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return CLS66.MTH1452(s, s1);
    }

    // 此方法包含解密的字符串
    public static void MTH1422(String s, String s1) {
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            if(CLS27.MTH890("SubCoreExDeviceClass")) {
                try {
                    Object object0 = CLS166.MTH3192(CLS27.MTH894("SubCoreExDeviceClass"), CLS27.MTH897("SubCoreExDevice_getExdeviceRankInfoStg"), new Object[0]);
                    if(CLS27.MTH890("werun_like_method")) {
                        CLS166.MTH3195(object0, CLS27.MTH897("werun_like_method"), new Object[]{s1, s, 1});
                    }
                    else if(CLS27.MTH890("werun_like_method_b")) {
                        CLS166.MTH3195(object0, CLS27.MTH897("werun_like_method_b"), new Object[]{1, s1, s});
                    }
                    else if(CLS27.MTH890("HardDeviceRankInfo_db_insert")) {
                        Class class0 = CLS27.MTH894("HardDeviceRankInfo_cls1");
                        Object object1 = CLS166.MTH3195(object0, CLS27.MTH897("HardDeviceRankInfo_db_get"), new Object[]{CLS166.MTH3188(class0, new Object[]{s1, null, s})});
                        if(object1 != null) {
                            CLS166.MTH3196(1, object1, "field_selfLikeState");
                            CLS166.MTH3196(CLS166.MTH3181(object1, "field_likecount") + 1, object1, "field_likecount");
                            CLS166.MTH3195(object0, CLS27.MTH897("HardDeviceRankInfo_db_insert"), new Object[]{object1, Boolean.TRUE});
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            CLS66.MTH1467(s, s1);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH1423(String s) {
        Class class0 = CLS27.MTH894("contactModel");
        if(class0 == null) {
            return "";
        }
        try {
            String s1 = "";
            Cursor cursor0 = CLS371.FLD3470.MTH5307("SELECT * FROM rcontact WHERE username = ? or encryptUsername = ?", new String[]{s, s});
            if(cursor0 == null) {
                return "";
            }
            if(cursor0.moveToFirst()) {
                Object object0 = CLS166.MTH3188(class0, new Object[0]);
                CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
                s1 = (String)CLS166.MTH3194(object0, CLS27.MTH897("AntiSpamTicketField"));
            }
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
            return s1;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static String MTH1424(byte[] arr_b) {
        Class class0 = CLS27.MTH894("snsContentClass");
        if(class0 == null) {
            return "";
        }
        Object object0 = CLS66.MTH1381(class0, arr_b);
        return object0 == null ? "" : CLS66.MTH1511(object0);
    }

    // 此方法包含解密的字符串
    public static void MTH1425(String s, String s1, String s2, ArrayList arrayList0) {
        Object object0;
        Class class0 = CLS27.MTH894("InviteChatroomMemberClass");
        Class class1 = CLS27.MTH894("InviteChatroomMemberClass_b");
        Class class2 = CLS27.MTH894("InviteChatroomMemberClass_c");
        try {
            if(!TextUtils.isEmpty(s1)) {
                CLS66.MTH1464(s, s1, arrayList0);
                return;
            }
            if(class0 != null) {
                object0 = CLS166.MTH3188(class0, new Object[]{s, arrayList0});
            }
            else if(class1 != null) {
                object0 = CLS166.MTH3188(class1, new Object[]{s, arrayList0, null});
            }
            else {
                object0 = class2 == null ? null : CLS166.MTH3188(class2, new Object[]{s, arrayList0, 0, null});
            }
            if(object0 != null) {
                CLS166.MTH3199(object0, s2, s);
                CLS66.MTH1521(object0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH1426(String s) {
        Object object0;
        String s1 = null;
        try {
            if(CLS27.MTH890("imageClass")) {
                Class class0 = CLS27.MTH894("imageClass");
                if(class0 != null) {
                    object0 = CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("imageMethod1"), new Object[0]), CLS27.MTH897("imageMethod2"), new Object[]{s});
                    s1 = (String)object0;
                    return CLS31.MTH992(CLS66.MTH1395(s1));
                }
            }
            else if(CLS27.MTH890("imageClass2")) {
                object0 = CLS166.MTH3195(CLS166.MTH3195(CLS66.MTH1487(CLS27.MTH894("imageClass2")), CLS27.MTH897("imageMethod1"), new Object[0]), CLS27.MTH897("imageMethod2"), new Object[]{s});
                s1 = (String)object0;
                return CLS31.MTH992(CLS66.MTH1395(s1));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return CLS31.MTH992(CLS66.MTH1395(s1));
    }

    // 此方法包含解密的字符串
    public static void MTH1427(String s, String s1, ArrayList arrayList0) {
        Object object0;
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("atuserlist", "<![CDATA[" + TextUtils.join(",", arrayList0) + "]]>");
            Class class0 = CLS27.MTH894("sendMsgClass");
            Class class1 = CLS27.MTH894("sendMsgClass_b");
            Class class2 = CLS27.MTH894("sendMsgClass_c");
            try {
                if(class0 != null) {
                    object0 = CLS166.MTH3188(class0, new Object[]{s, s1, 1, 291, hashMap0});
                    CLS66.MTH1521(object0);
                    return;
                }
                boolean z = false;
                if(class1 != null) {
                    z = true;
                    object0 = CLS166.MTH3188(class1, new Object[]{s, s1, 1, 1, hashMap0});
                }
                else if(class2 != null) {
                    z = true;
                    object0 = CLS166.MTH3188(class2, new Object[]{s, s1, 1, 1, hashMap0});
                }
                if(z) {
                    CLS66.MTH1521(object0);
                    return;
                }
            }
            catch(Throwable throwable0) {
                CLS66.MTH1468(1, s, s1);
                CLS27.MTH893(throwable0);
                return;
            }
            CLS66.MTH1468(1, s, s1);
        }
    }

    // 此方法包含解密的字符串
    public static int MTH1428(String s, String s1, String s2, byte[] arr_b, int v, ArrayList arrayList0, ArrayList arrayList1) {
        try {
            Object object0 = CLS66.MTH1397(3);
            if(object0 == null) {
                return -1;
            }
            if(v == 3) {
                CLS166.MTH3195(object0, CLS27.MTH897("upSetShareTypeMethod"), new Object[]{1});
            }
            else {
                CLS166.MTH3195(object0, CLS27.MTH897("upSetShareTypeMethod"), new Object[]{0});
            }
            if(CLS27.MTH890("upSetTypeMethod")) {
                CLS166.MTH3195(object0, CLS27.MTH897("upSetTypeMethod"), new Object[]{1});
            }
            else if(CLS27.MTH890("upClassField4")) {
                CLS166.MTH3198(CLS166.MTH3194(object0, CLS27.MTH897("upClassField4")), CLS27.MTH897("upClassField5"), 1);
            }
            if(!TextUtils.isEmpty(CLS27.MTH897("upMethod3"))) {
                CLS166.MTH3195(object0, CLS27.MTH897("upMethod3"), new Object[]{s1, "about:blank", null, ((int)(v <= 1 ? 0 : 1)), 0});
            }
            CLS166.MTH3195(object0, CLS27.MTH897("upSetContentMethod"), new Object[]{s});
            CLS166.MTH3195(object0, CLS27.MTH897("upSetMentionListMethod"), new Object[]{CLS66.MTH1504(arrayList0)});
            CLS166.MTH3195(object0, CLS27.MTH897("upSetPrivateMethod"), new Object[]{((int)(v == 1 ? 1 : 0))});
            if(CLS27.MTH890("upMethod4")) {
                CLS166.MTH3195(object0, CLS27.MTH897("upMethod4"), new Object[]{0});
            }
            else if(CLS27.MTH890("upClass1Field2")) {
                CLS166.MTH3198(CLS166.MTH3194(object0, CLS27.MTH897("upClass1Field2")), CLS27.MTH897("upClass1Field3"), 0);
            }
            CLS166.MTH3195(object0, CLS27.MTH897("upSetListMethod"), new Object[]{arrayList1});
            CLS166.MTH3195(object0, CLS27.MTH897("upSetUrlMethod"), new Object[]{s1});
            CLS166.MTH3195(object0, CLS27.MTH897("upSetUrlMethod2"), new Object[]{s1});
            CLS166.MTH3195(object0, CLS27.MTH897("upSetLinkDescMethod"), new Object[]{s2});
            if(CLS27.MTH890("upAddImageBytes") && arr_b != null) {
                CLS166.MTH3195(object0, CLS27.MTH897("upAddImageBytes"), new Object[]{arr_b, "", ""});
            }
            int v1 = (int)(((Integer)CLS166.MTH3195(object0, CLS27.MTH897("upCommitMethod"), new Object[0])));
            Class class0 = CLS27.MTH894("SnsPathClass");
            if(class0 != null) {
                CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("upMethod1"), new Object[0]), CLS27.MTH897("upMethod2"), new Object[0]);
            }
            return v1;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return -1;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1429(String s, String s1, String s2, int v, int v1, String s3, long v2, Object object0) {
        String s6;
        String s5;
        boolean z1;
        int v3;
        boolean z;
        Class class0 = CLS27.MTH894("sendVideoClass");
        if(class0 == null) {
            return;
        }
        Object object1 = CLS66.MTH1453(s);
        if(CLS27.MTH890("sendVideoMethod4")) {
            try {
                z = ((Boolean)CLS166.MTH3192(class0, CLS27.MTH897("sendVideoMethod4"), new Object[0])).booleanValue();
                v3 = object1 == null ? 0 : CLS166.MTH3181(object1, CLS27.MTH897("sendVideoField4"));
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                z1 = false;
                goto label_21;
            }
            z1 = !z || v3 != 0xC7 ? false : true;
        }
        else {
            z1 = false;
        }
    label_21:
        String s4 = !CLS27.MTH890("sendVideoClass_importPathField") || object1 == null ? "" : ((String)CLS182.MTH3492(0x38EA37F52B3CD335L, object1));
        if(!z1 || !CLS27.MTH890("sendVideoOriginMethod")) {
            s5 = null;
        }
        else {
            try {
                s5 = s1 + "origin";
                if(object1 == null) {
                    s6 = null;
                }
                else if(CLS27.MTH890("sendVideoClass_origin_file_name")) {
                    s6 = (String)CLS166.MTH3194(object1, CLS27.MTH897("sendVideoClass_origin_file_name"));
                }
                else {
                    s6 = null;
                }
                String s7 = CLS66.MTH1449(s6);
                if(CLS31.MTH1024(s7)) {
                    CLS66.MTH1473(s7, CLS66.MTH1449(s5));
                    CLS66.MTH1473(CLS66.MTH1482(s1), CLS66.MTH1482(s5));
                    CLS166.MTH3192(class0, CLS27.MTH897("sendVideoOriginMethod"), new Object[]{s5, null, v1, s2, "", v, s3, 43, object0, "", v2, null, "", Boolean.TRUE});
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
        if(CLS27.MTH890("WxFileIndexDirtyEvent")) {
            try {
                Object object2 = CLS166.MTH3188(CLS27.MTH894("WxFileIndexDirtyEvent"), new Object[0]);
                CLS166.MTH3190(v2, CLS166.MTH3194(object2, CLS27.MTH897("WxFileIndexDirtyEvent_field1")), CLS27.MTH897("WxFileIndexDirtyEvent_msgIdField"));
                CLS166.MTH3195(object2, CLS27.MTH897("IEvent_publish"), new Object[0]);
            }
            catch(Throwable throwable2) {
                CLS27.MTH893(throwable2);
            }
        }
        CLS66.MTH1413(s1, s5, s4, s2, v, v1, s3, v2, object0);
    }

    // 此方法包含解密的字符串
    public static ContentValues MTH1430(long v) {
        Class class0 = CLS27.MTH894("SnsInfoClass2");
        if(class0 == null) {
            return null;
        }
        Cursor cursor0 = CLS396.FLD3775.MTH5763(v);
        if(cursor0 == null) {
            return null;
        }
        Object object0 = CLS166.MTH3188(class0, new Object[0]);
        cursor0.moveToFirst();
        CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        return (ContentValues)CLS166.MTH3195(object0, CLS27.MTH897("convertToMethod"), new Object[0]);
    }

    // 此方法包含解密的字符串
    public static void MTH1431(int v, Object object0) {
        Object object1 = CLS66.MTH1414();
        if(object1 == null) {
            return;
        }
        CLS166.MTH3195(object1, CLS27.MTH892("uploadStoreMethod3", "set"), new Object[]{v, object0});
    }

    // 此方法包含解密的字符串
    public static String MTH1432(String s, String s1) {
        String s2;
        if(CLS27.MTH894("dbClass1") == null) {
            return null;
        }
        CLS371 ʻ0 = CLS371.FLD3470;
        ArrayList arrayList0 = new ArrayList(Arrays.asList(CLS502.MTH6941(ʻ0.MTH5335(s))));
        try {
            Object object0 = CLS66.MTH1505(s);
            if(object0 == null) {
                return null;
            }
            Iterator iterator0 = arrayList0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    return null;
                }
                Object object1 = iterator0.next();
                s2 = (String)object1;
                String s3 = (String)CLS166.MTH3195(object0, CLS27.MTH897("AtSomeoneMethod2"), new Object[]{s2});
                if(TextUtils.isEmpty(s3)) {
                    s3 = ʻ0.MTH5304(s2);
                }
                if(s3.equals(s1)) {
                    break;
                }
            }
            return s2;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return null;
    }

    public static boolean MTH1433(String s, String s1) {
        if(TextUtils.isEmpty(s1)) {
            return false;
        }
        return s1.equals(CLS371.FLD3470.MTH5343(s)) ? true : CLS66.MTH1383(s, s1);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Object MTH1434(long v) {
        return CLS66.MTH1516(("sns_table_" + v));
    }

    // 去混淆评级： 低(26)
    // 此方法包含解密的字符串
    public static String MTH1435(String s, String s1, String s2) {
        if(CLS502.MTH6933(s) && CLS502.MTH6933(s1) && CLS502.MTH6933(s2)) {
            return "";
        }
        try {
            Class class0 = CLS27.MTH894("RegionCodeDecoder");
            if(CLS27.MTH890("RegionCodeDecoder_getRegionCodeDecoder")) {
                Object object0 = CLS166.MTH3192(class0, CLS27.MTH897("RegionCodeDecoder_getRegionCodeDecoder"), new Object[0]);
                return ((String)CLS166.MTH3195(object0, CLS27.MTH897("RegionCodeDecoder_getProvince"), new Object[]{s, s1})) + " " + ((String)CLS166.MTH3195(object0, CLS27.MTH897("RegionCodeDecoder_getCity"), new Object[]{s, s1, s2}));
            }
            if(CLS27.MTH890("RegionCodeDecoder_getProvince_a")) {
                return ((String)CLS166.MTH3192(class0, CLS27.MTH897("RegionCodeDecoder_getProvince_a"), new Object[]{s, s1})) + " " + ((String)CLS166.MTH3192(class0, CLS27.MTH897("RegionCodeDecoder_getCity_a"), new Object[]{s, s1, s2}));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return "";
    }

    // 此方法包含解密的字符串
    public static void MTH1436(String s, String s1) {
        Object object5;
        if(!TextUtils.isEmpty(s)) {
            try {
                Object object0 = CLS66.MTH1487(CLS27.MTH894("delChatroomClass5"));
                if(object0 != null) {
                    Object object1 = CLS166.MTH3195(CLS166.MTH3195(object0, CLS27.MTH897("delChatroomMethod_21"), new Object[]{s}), CLS27.MTH897("delChatroomMethod_22"), new Object[]{s, Boolean.TRUE});
                    if(CLS27.MTH890("delChatroomMethod_23")) {
                        CLS166.MTH3195(object1, CLS27.MTH897("delChatroomMethod_23"), new Object[]{null});
                    }
                    CLS166.MTH3195(object1, CLS27.MTH897("delChatroomMethod_24"), new Object[0]);
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        if(TextUtils.isEmpty(s)) {
            return;
        }
        Class class0 = CLS27.MTH894("dbClass1");
        if(class0 == null) {
            return;
        }
        Class class1 = CLS27.MTH894("delClass");
        Class class2 = CLS27.MTH894("delClass2");
        Class class3 = CLS27.MTH894("delClass3");
        Class class4 = CLS27.MTH894("delClass4");
        Class class5 = CLS27.MTH894("delClass4_1");
        Class class6 = CLS27.MTH894("RoomNameClass2");
        Class class7 = CLS27.MTH894("RoomNameClass3");
        Class class8 = CLS27.MTH894("ChatroomMembersLogicClass");
        try {
            Object object2 = CLS166.MTH3192(class0, CLS27.MTH897("dbMethod1"), new Object[0]);
            Object object3 = CLS166.MTH3195(object2, CLS27.MTH897("delMethod5"), new Object[0]);
            long v = CLS166.MTH3185(CLS166.MTH3195(CLS166.MTH3195(object2, CLS27.MTH897("dbMethod2"), new Object[0]), CLS27.MTH897("delChatroomMethod6"), new Object[]{s}), "field_msgSvrId");
            if(!TextUtils.isEmpty(CLS27.MTH897("delChatroomMethod6"))) {
                if(class4 != null) {
                    object5 = CLS166.MTH3188(class4, new Object[]{s, v});
                }
                else if(class5 != null) {
                    Object object4 = CLS166.MTH3188(class5, new Object[0]);
                    CLS166.MTH3198(object4, CLS27.MTH897("delClass4_field1"), CLS166.MTH3195(CLS166.MTH3188(class6, new Object[0]), CLS27.MTH897("RoomNameMethod1"), new Object[]{s}));
                    CLS166.MTH3198(object4, CLS27.MTH897("delClass4_field2"), v);
                    object5 = CLS166.MTH3188(class7, new Object[]{8, object4});
                }
                else {
                    object5 = null;
                }
                if(object5 != null) {
                    CLS166.MTH3195(object3, CLS27.MTH897("delMethod6"), new Object[]{object5});
                }
            }
            CLS66.MTH1388(s);
            if(class2 != null) {
                CLS166.MTH3195(object3, CLS27.MTH897("delMethod6"), new Object[]{CLS166.MTH3188(class2, new Object[]{s})});
            }
            if(CLS27.MTH890("delChatroomMethod_11")) {
                Object object6 = CLS66.MTH1487(CLS27.MTH894("delChatroomClass6"));
                if(object6 != null) {
                    CLS166.MTH3195(object6, CLS27.MTH897("delChatroomMethod_11"), new Object[]{s, 15});
                }
            }
            else if(CLS27.MTH890("delChatroomMethod_11b")) {
                CLS166.MTH3192(CLS27.MTH894("markReadClass1"), CLS27.MTH897("delChatroomMethod_11b"), new Object[]{s, 15});
            }
            CLS166.MTH3195(CLS166.MTH3195(object2, CLS27.MTH897("delMethod8"), new Object[0]), CLS27.MTH897("delMethod9"), new Object[]{s});
            if(class1 != null) {
                CLS166.MTH3195(object3, CLS27.MTH897("delMethod6"), new Object[]{CLS166.MTH3188(class1, new Object[]{s})});
            }
            if(class3 != null) {
                CLS166.MTH3195(object3, CLS27.MTH897("delMethod6"), new Object[]{CLS166.MTH3188(class3, new Object[]{s1, s})});
            }
            if(!CLS27.MTH890("delChatroomMethod_10")) {
                if(CLS27.MTH890("delChatroomMethod3")) {
                    Object object7 = CLS166.MTH3195(object2, CLS27.MTH897("delMethod2"), new Object[0]);
                    if(object7 != null && ((Boolean)CLS166.MTH3195(object7, CLS27.MTH897("delChatroomMethod3"), new Object[]{s})).booleanValue()) {
                        CLS166.MTH3195(object7, CLS27.MTH897("delChatroomMethod4"), new Object[]{s});
                        CLS166.MTH3192(class8, CLS27.MTH897("delChatroomMethod5"), new Object[]{s});
                    }
                }
            }
            else if(class8 != null) {
                CLS166.MTH3192(class8, CLS27.MTH897("delChatroomMethod_10"), new Object[]{s});
            }
            if(CLS27.MTH890("sendGifEmojiClass3") && CLS27.MTH890("delChatroomClass7")) {
                CLS166.MTH3195(CLS166.MTH3195(CLS66.MTH1487(CLS27.MTH894("delChatroomClass7")), CLS27.MTH897("delChatroomMethod_12"), new Object[0]), CLS27.MTH897("delChatroomMethod_13"), new Object[]{s});
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }

    public static ArrayList MTH1437(ArrayList arrayList0) {
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            arrayList1.add(CLS66.MTH1395(((String)object0)));
        }
        return arrayList1;
    }

    // 此方法包含解密的字符串
    public static void MTH1438(int v, int v1, String s, String s1, String s2, String s3) {
        Object object0 = null;
        if(CLS27.MTH890("RedPacketOpenClass_d")) {
            Class class0 = CLS27.MTH894("RedPacketOpenClass_d");
            if(class0 != null) {
                object0 = CLS166.MTH3188(class0, new Object[]{v, v1, s, s1, null, null, s2, "v1.0", s3});
            }
        }
        else if(CLS27.MTH890("RedPacketOpenClass_b")) {
            Class class1 = CLS27.MTH894("RedPacketOpenClass_b");
            if(class1 != null) {
                object0 = CLS166.MTH3188(class1, new Object[]{v, v1, s, s1, null, null, s2, "v1.0", s3, ""});
            }
        }
        else if(CLS27.MTH890("RedPacketOpenClass_c")) {
            Class class2 = CLS27.MTH894("RedPacketOpenClass_c");
            if(class2 != null) {
                object0 = CLS166.MTH3188(class2, new Object[]{v, v1, s, s1, null, null, s2, s3, ""});
            }
        }
        else {
            Class class3 = CLS27.MTH894("RedPacketOpenClass");
            if(class3 == null) {
                return;
            }
            try {
                object0 = TextUtils.isEmpty(s3) ? CLS166.MTH3188(class3, new Object[]{v, v1, s, s1, null, null, s2, "v1.0"}) : CLS166.MTH3188(class3, new Object[]{v, v1, s, s1, null, null, s2, "v1.0", s3});
            }
            catch(Throwable unused_ex) {
                try {
                    object0 = CLS166.MTH3188(class3, new Object[]{v, v1, s, s1, null, null, s2, "v1.0"});
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        if(object0 == null) {
            return;
        }
        try {
            CLS66.MTH1521(object0);
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1439(String s) {
        Object object0;
        if(CLS27.MTH890("downloadVideoClass")) {
            Class class0 = CLS27.MTH894("downloadVideoClass");
            if(class0 == null) {
                return;
            }
            object0 = CLS166.MTH3188(class0, new Object[]{s});
        }
        else if(CLS27.MTH890("downloadVideoClass_b")) {
            Class class1 = CLS27.MTH894("downloadVideoClass_b");
            if(class1 == null) {
                return;
            }
            object0 = CLS166.MTH3188(class1, new Object[]{s, Boolean.TRUE});
        }
        else {
            object0 = null;
        }
        if(object0 == null) {
            return;
        }
        CLS66.MTH1521(object0);
    }

    // 此方法包含解密的字符串
    public static void MTH1440(long v, String s) {
        try {
            Object object0 = CLS66.MTH1495(v);
            if(object0 == null) {
                return;
            }
            Class class0 = CLS27.MTH894("msgRevokeClass");
            if(class0 != null) {
                CLS66.MTH1521(CLS166.MTH3188(class0, new Object[]{object0, s}));
                return;
            }
            Class class1 = CLS27.MTH894("msgRevokeClass_b");
            if(class1 != null) {
                CLS66.MTH1521(CLS166.MTH3188(class1, new Object[]{object0, s, ""}));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH1441(String s, String s1, long v, int v1, int v2) {
        if(!CLS27.MTH899(new String[]{"MsgInfoStorage_insertMsg", "MsgInfoStorage_insertMsg_b"})) {
            return false;
        }
        Class class0 = CLS27.MTH894("dbClass1");
        if(class0 == null) {
            return false;
        }
        try {
            Object object0 = CLS166.MTH3188(CLS27.MTH894("msgClass"), new Object[0]);
            CLS166.MTH3195(object0, CLS27.MTH897("msgClass_setType"), new Object[]{v1});
            CLS166.MTH3195(object0, CLS27.MTH897("msgClass_setStatus"), new Object[]{3});
            CLS166.MTH3195(object0, CLS27.MTH897("msgClass_setTalker"), new Object[]{s});
            CLS166.MTH3195(object0, CLS27.MTH897("msgClass_setContent"), new Object[]{s1});
            CLS166.MTH3195(object0, CLS27.MTH897("msgClass_setCreateTime"), new Object[]{v});
            CLS166.MTH3195(object0, CLS27.MTH897("msgClass_setIsSend"), new Object[]{v2});
            Object object1 = CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("dbMethod1"), new Object[0]), CLS27.MTH897("dbMethod2"), new Object[0]);
            if(CLS27.MTH890("MsgInfoStorage_insertMsg")) {
                CLS166.MTH3195(object1, CLS27.MTH897("MsgInfoStorage_insertMsg"), new Object[]{object0, Boolean.TRUE, Boolean.TRUE});
                return true;
            }
            if(CLS27.MTH890("MsgInfoStorage_insertMsg_b")) {
                CLS166.MTH3195(object1, CLS27.MTH897("MsgInfoStorage_insertMsg_b"), new Object[]{object0, Boolean.TRUE});
            }
            return true;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }

    // 此方法包含解密的字符串
    public static Object MTH1442(long v) {
        Object object0;
        Class class0 = CLS27.MTH894("favClass1");
        Class class1 = CLS27.MTH894("favClass1_b");
        Class class2 = CLS27.MTH894("favClass1_a");
        try {
            if(class0 == null) {
                object0 = class1 == null || class2 == null ? null : CLS166.MTH3195(CLS166.MTH3192(class2, CLS27.MTH897("favClass1_a_method1"), new Object[]{class1}), CLS27.MTH897("favMethod1"), new Object[0]);
            }
            else {
                object0 = CLS166.MTH3192(class0, CLS27.MTH897("favMethod1"), new Object[0]);
            }
            if(object0 != null) {
                return CLS166.MTH3195(object0, CLS27.MTH897("favMethod2"), new Object[]{v});
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1443(String s) {
        Class class0 = CLS27.MTH894("sendVideoClass");
        if(class0 != null && CLS27.MTH890("sendVideoMethod4")) {
            try {
                Object object0 = CLS66.MTH1453(s);
                if(((Boolean)CLS166.MTH3192(class0, CLS27.MTH897("sendVideoMethod4"), new Object[0])).booleanValue() && (object0 == null ? 0 : CLS166.MTH3181(object0, CLS27.MTH897("sendVideoField4"))) == 0xC7 && CLS27.MTH890("sendVideoClass_origin_file_name")) {
                    return CLS31.MTH1024(CLS66.MTH1449(((String)CLS166.MTH3194(object0, CLS27.MTH897("sendVideoClass_origin_file_name")))));
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static void MTH1444(String s, CLS3 ˆٴ0) {
        Object object1;
        Class class0 = CLS27.MTH894("deleteMsgClass");
        Class class1 = CLS27.MTH894("dbClass1");
        if(class0 != null && !TextUtils.isEmpty(s) && class1 != null) {
            if(!CLS27.MTH890("deleteMsgMethod2") && (CLS27.MTH890("deleteMsgMethod4") || CLS27.MTH890("deleteMsgMethod4_a") || CLS27.MTH890("deleteMsgMethod4_b"))) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(s);
                CLS66.MTH1500(arrayList0, ˆٴ0);
                return;
            }
            Object object0 = CLS166.MTH3192(class1, CLS27.MTH897("dbMethod1"), new Object[0]);
            try {
                if(CLS27.MTH890("deleteMsgCallbackClass")) {
                    Class class2 = CLS27.MTH894("deleteMsgCallbackClass");
                    object1 = Proxy.newProxyInstance(class2.getClassLoader(), new Class[]{class2}, new CLS63(object0, s, ˆٴ0));
                }
                else {
                    goto label_17;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                object1 = null;
            }
            goto label_18;
        label_17:
            object1 = null;
            try {
            label_18:
                CLS166.MTH3192(class0, CLS27.MTH892("deleteMsgMethod2", "a"), new Object[]{s, object1});
                if(object1 == null) {
                    CLS1279 ʻᐧ0 = new CLS1279(object0, s, ˆٴ0, 14);
                    CLS40.FLD157.MTH1123(((CLS39)ʻᐧ0), 1500L);
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1445(String s, boolean z) {
        Class class0 = CLS27.MTH894("dbClass1");
        Class class1 = CLS27.MTH894("disableNotifyClass1");
        if(class0 != null && class1 != null) {
            try {
                Object object0 = CLS166.MTH3192(class0, CLS27.MTH897("dbMethod1"), new Object[0]);
                Object object1 = CLS166.MTH3195(object0, CLS27.MTH897("delMethod2"), new Object[0]);
                Object object2 = CLS166.MTH3195(object1, CLS27.MTH897("delMethod3"), new Object[]{s});
                CLS166.MTH3195(CLS166.MTH3195(object0, CLS27.MTH897("delMethod5"), new Object[0]), CLS27.MTH897("delMethod6"), new Object[]{CLS166.MTH3188(class1, new Object[]{s, ((int)(z ? 0 : 1))})});
                CLS166.MTH3195(object2, CLS27.MTH897("disableNotifyMethod2"), new Object[]{((int)(z ? 0 : 1))});
                CLS166.MTH3195(object1, CLS27.MTH897("disableNotifyMethod3"), new Object[]{s, object2});
                CLS27.MTH885().edit().putBoolean("room_notify_new_msg", true).apply();
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1446(Object object0) {
        if(object0 == null) {
            return;
        }
        try {
            CLS166.MTH3195(object0, CLS27.MTH897("RunCgiMethod3"), new Object[0]);
            Object object1 = CLS166.MTH3194(object0, CLS27.MTH897("RunCgiField1"));
            if(object1 == null) {
                return;
            }
            Class class0 = CLS27.MTH894("RunCgiClass1");
            if(class0 == null) {
                return;
            }
            Object object2 = CLS166.MTH3186(class0, CLS27.MTH897("RunCgiField2"));
            if(object2 == null) {
                return;
            }
            CLS166.MTH3195((CLS27.MTH890("RunCgiMethod1") ? CLS166.MTH3195(object2, CLS27.MTH897("RunCgiMethod1"), new Object[0]) : CLS166.MTH3194(CLS166.MTH3194(object2, CLS27.MTH897("RunCgiField3")), CLS27.MTH897("RunCgiField4"))), CLS27.MTH897("RunCgiMethod2"), new Object[]{object1, 0});
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1447(String s) {
        Class class0 = CLS27.MTH894("dbClass1");
        if(class0 != null && !TextUtils.isEmpty(s)) {
            try {
                Object object0 = CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("dbMethod1"), new Object[0]), CLS27.MTH897("delMethod8"), new Object[0]);
                CLS166.MTH3195(object0, CLS27.MTH892("ConversationStorage_doNotify", "doNotify"), new Object[]{3, object0, s});
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                CLS66.MTH1408(s, null);
            }
        }
    }

    // 此方法包含解密的字符串
    public static Object MTH1448(Cursor cursor0) {
        Class class0 = CLS27.MTH894("msgClass");
        if(class0 == null) {
            return null;
        }
        Object object0 = CLS166.MTH3188(class0, new Object[0]);
        if(cursor0 != null) {
            if(cursor0.moveToFirst()) {
                CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
            }
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
        }
        return object0;
    }

    // 此方法包含解密的字符串
    public static String MTH1449(String s) {
        Object object0;
        String s1 = "";
        if(TextUtils.isEmpty(s)) {
            return s;
        }
        try {
            if(CLS27.MTH890("videoClass")) {
                Class class0 = CLS27.MTH894("videoClass");
                if(class0 != null) {
                    object0 = CLS166.MTH3192(class0, CLS27.MTH897("videoMethod2"), new Object[]{s});
                    s1 = (String)object0;
                    return CLS66.MTH1395(s1);
                }
            }
            else if(CLS27.MTH890("snsSightRequestClass3")) {
                Class class1 = CLS27.MTH894("snsSightRequestClass3");
                if(class1 != null) {
                    object0 = CLS166.MTH3195(CLS166.MTH3192(class1, CLS27.MTH897("videoMethod3"), new Object[0]), CLS27.MTH897("videoMethod2"), new Object[]{s});
                    s1 = (String)object0;
                    return CLS66.MTH1395(s1);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return CLS66.MTH1395(s1);
    }

    // 此方法包含解密的字符串
    public static boolean MTH1450(String s, String s1, Intent intent0) {
        if(CLS27.MTH890("PluginHelperClass") && CLS27.MTH890("PluginHelperMethod1")) {
            Class class0 = CLS27.MTH894("PluginHelperClass");
            if(class0 == null) {
                return false;
            }
            try {
                if(CLS27.MTH890("PluginHelperMethod1")) {
                    CLS166.MTH3192(class0, CLS27.MTH897("PluginHelperMethod1"), new Object[]{CLS27.MTH900(), s, s1, intent0});
                    return true;
                }
                if(CLS27.MTH890("PluginHelperMethod1_b")) {
                    CLS166.MTH3192(class0, CLS27.MTH897("PluginHelperMethod1_b"), new Object[]{CLS27.MTH900(), s, s1, intent0, null});
                    return true;
                }
                if(CLS27.MTH890("PluginHelperMethod1_c")) {
                    CLS166.MTH3192(class0, CLS27.MTH897("PluginHelperMethod1_c"), new Object[]{CLS27.MTH900(), s, s1, null, intent0});
                    return true;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static String MTH1451(Object object0) {
        Class class0 = CLS27.MTH894("SnsPathClass");
        Class class1 = CLS27.MTH894("SnsVideoPathClass");
        Class class2 = CLS27.MTH894("SnsDataClass");
        if(class0 != null && class2 != null && class1 != null) {
            String s = (String)CLS182.MTH3492(4101162463771022133L, object0);
            String s1 = (String)CLS166.MTH3192(class0, CLS27.MTH897("snsSightMethod1"), new Object[0]);
            String s2 = (String)CLS166.MTH3192(class1, CLS27.MTH897("snsSightMethod2"), new Object[]{s1, s});
            if(!CLS182.MTH3470(4101162665634485045L)) {
                StringBuilder stringBuilder0 = CLS182.MTH3483(s2);
                stringBuilder0.append(CLS166.MTH3192(class2, CLS27.MTH897("snsSightMethod3"), new Object[]{object0}));
                return CLS31.MTH992(CLS66.MTH1395(stringBuilder0.toString()));
            }
            StringBuilder stringBuilder1 = CLS182.MTH3483(s2);
            stringBuilder1.append(CLS166.MTH3192(class2, CLS27.MTH897("snsSightMethod3B"), new Object[]{s}));
            return CLS31.MTH992(CLS66.MTH1395(stringBuilder1.toString()));
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static String MTH1452(String s, String s1) {
        String s2;
        if(TextUtils.isEmpty(s1)) {
            return "";
        }
        try {
            s2 = "";
            Object object0 = CLS66.MTH1505(s);
            if(object0 != null) {
                s2 = "" + CLS166.MTH3195(object0, CLS27.MTH897("AtSomeoneMethod2"), new Object[]{s1});
                if(TextUtils.isEmpty(s2)) {
                    Map map0 = CLS66.MTH1403(object0);
                    if(map0 != null) {
                        Object object1 = map0.get(s1);
                        if(object1 != null) {
                            s2 = (String)CLS166.MTH3194(object1, CLS27.MTH897("chatroomMemberNicknameField"));
                        }
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        if(TextUtils.isEmpty(s2)) {
            s2 = CLS371.FLD3470.MTH5304(s1);
        }
        return TextUtils.isEmpty(s2) ? s1 : s2;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Object MTH1453(String s) {
        try {
            if(CLS27.MTH890("sendVideoClass2")) {
                return CLS166.MTH3195(CLS66.MTH1487(CLS27.MTH894("sendVideoClass2")), CLS27.MTH897("sendVideoClass2_method1"), new Object[]{s});
            }
            if(CLS27.MTH890("sendVideoMethod1")) {
                return CLS166.MTH3192(CLS27.MTH894("sendVideoClass"), CLS27.MTH897("sendVideoMethod1"), new Object[]{s});
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static void MTH1454(ArrayList arrayList0) {
        Object object0;
        if(arrayList0.isEmpty()) {
            return;
        }
        if(CLS27.MTH890("createChatroomClass")) {
            object0 = CLS166.MTH3188(CLS27.MTH894("createChatroomClass"), new Object[]{"", arrayList0});
        }
        else {
            object0 = CLS27.MTH890("createChatroomClass_b") ? CLS166.MTH3188(CLS27.MTH894("createChatroomClass_b"), new Object[]{"", arrayList0, null, null}) : null;
        }
        if(object0 == null) {
            return;
        }
        try {
            CLS66.MTH1521(object0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH1455(String s) {
        if(CLS66.MTH1433(s, CLS27.MTH904())) {
            return false;
        }
        try {
            Object object0 = CLS66.MTH1505(s);
            if(object0 == null) {
                return false;
            }
            int v = (int)(((Integer)CLS166.MTH3195(object0, CLS27.MTH897("ChatroomDataMethod1"), new Object[0])));
            return CLS426.MTH6107(s) ? (v & 1) == 1 : v == 2;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return false;
        }
    }

    // 去混淆评级： 低(23)
    // 此方法包含解密的字符串
    public static String MTH1456(String s) {
        Class class0 = CLS27.MTH894("voiceClass1");
        if(class0 == null) {
            return "";
        }
        if(!CLS182.MTH3470(4101173076635210549L)) {
            return (String)CLS166.MTH3192(class0, CLS27.MTH897("voiceMethod2"), new Object[]{s});
        }
        return CLS182.MTH3470(4101173738060174133L) ? "" : ((String)CLS166.MTH3192(class0, CLS27.MTH897("voiceMethod2b"), new Object[]{s, ""}));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static Object MTH1457() {
        try {
            if(CLS27.MTH890("MMKernelClass")) {
                Class class1 = CLS27.MTH894("MMKernelClass");
                if(class1 != null) {
                    return CLS166.MTH3192(class1, CLS27.MTH897("MMKernelClass_getCoreStorageMethod"), new Object[0]);
                }
            }
            else if(CLS27.MTH890("favClass1_a") && CLS27.MTH890("privacySettingsMethod1b")) {
                Class class0 = CLS27.MTH894("favClass1_a");
                if(class0 != null) {
                    return CLS166.MTH3192(class0, CLS27.MTH897("privacySettingsMethod1b"), new Object[0]);
                }
            }
            else if(CLS27.MTH890("privacySettingsMethod1")) {
                return CLS166.MTH3195(CLS166.MTH3192(CLS27.MTH894("dbClass1"), CLS27.MTH897("dbMethod1"), new Object[0]), CLS27.MTH897("privacySettingsMethod1"), new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static void MTH1458(String s, String s1) {
        Class class0 = CLS27.MTH894("GetContactClass");
        if(class0 == null) {
            return;
        }
        try {
            CLS166.MTH3195(CLS166.MTH3188(class0, new Object[0]), CLS27.MTH897("GetContactMethod"), new Object[]{s, s1});
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1459(long v) {
        Class class0 = CLS27.MTH894("snsDelClass");
        if(class0 == null) {
            return;
        }
        try {
            CLS66.MTH1521(CLS166.MTH3188(class0, new Object[]{v, 1}));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1460(LinkedList linkedList0, LinkedList linkedList1) {
        Object object0;
        if(CLS27.MTH890("verifyUserClass")) {
            object0 = CLS166.MTH3188(CLS27.MTH894("verifyUserClass"), new Object[]{1, linkedList0, linkedList1, "", ""});
        }
        else {
            object0 = CLS27.MTH890("verifyUserClass_2") ? CLS166.MTH3188(CLS27.MTH894("verifyUserClass_2"), new Object[]{linkedList0, linkedList1}) : null;
        }
        try {
            CLS66.MTH1521(object0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1461(ImageView imageView0, String s) {
        Class class0 = CLS27.MTH894("avatarClass3");
        if(class0 == null) {
            return;
        }
        CLS166.MTH3192(class0, CLS27.MTH897("avatarMethod4"), new Object[]{imageView0, s});
    }

    // 此方法包含解密的字符串
    public static void MTH1462(CLS85 ـˏ0) {
        Object object0;
        Class class0 = CLS27.MTH894("verifyUserClass");
        if(class0 == null) {
            return;
        }
        try {
            String s = ـˏ0.MTH1690() ? ـˏ0.FLD339 : CLS66.MTH1423(ـˏ0.FLD337);
            if(!TextUtils.isEmpty(s) && s.endsWith("@stranger")) {
                if(!ـˏ0.MTH1690()) {
                    ـˏ0.FLD339 = s;
                }
                CLS371.FLD3470.MTH5306(ـˏ0.FLD337, s);
            }
            if(TextUtils.isEmpty(s) && ـˏ0.FLD330 != CLS83.FLD324) {
                ـˏ0.FLD338 = 6;
            }
            HashMap hashMap0 = null;
            HashMap hashMap1 = ـˏ0.FLD331;
            if(ـˏ0.FLD329) {
                Object[] arr_object = new Object[9];
                arr_object[0] = 1;
                LinkedList linkedList0 = new LinkedList();
                linkedList0.add(ـˏ0.FLD337);
                arr_object[1] = linkedList0;
                LinkedList linkedList1 = new LinkedList();
                linkedList1.add(ـˏ0.FLD338);
                arr_object[2] = linkedList1;
                LinkedList linkedList2 = new LinkedList();
                if(ـˏ0.MTH1690()) {
                    linkedList2.add(ـˏ0.FLD339);
                }
                arr_object[3] = linkedList2;
                arr_object[4] = ـˏ0.MTH1689();
                arr_object[5] = "";
                if(!ـˏ0.FLD329) {
                    if(hashMap1.isEmpty()) {
                        hashMap1.put(ـˏ0.FLD337, 0);
                    }
                    hashMap0 = hashMap1;
                }
                arr_object[6] = hashMap0;
                arr_object[7] = ـˏ0.FLD340;
                arr_object[8] = "";
                object0 = CLS166.MTH3188(class0, arr_object);
            }
            else {
                Object[] arr_object1 = new Object[9];
                arr_object1[0] = 2;
                LinkedList linkedList3 = new LinkedList();
                linkedList3.add(ـˏ0.FLD337);
                arr_object1[1] = linkedList3;
                LinkedList linkedList4 = new LinkedList();
                linkedList4.add(ـˏ0.FLD338);
                arr_object1[2] = linkedList4;
                LinkedList linkedList5 = new LinkedList();
                if(ـˏ0.MTH1690()) {
                    linkedList5.add(ـˏ0.FLD339);
                }
                arr_object1[3] = linkedList5;
                arr_object1[4] = ـˏ0.MTH1689();
                arr_object1[5] = "";
                if(!ـˏ0.FLD329) {
                    if(hashMap1.isEmpty()) {
                        hashMap1.put(ـˏ0.FLD337, 0);
                    }
                    hashMap0 = hashMap1;
                }
                arr_object1[6] = hashMap0;
                arr_object1[7] = ـˏ0.FLD340;
                arr_object1[8] = "";
                object0 = CLS166.MTH3188(class0, arr_object1);
            }
            if(object0 == null) {
                return;
            }
            CLS66.MTH1521(object0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH1463(String s) {
        try {
            Class class0 = CLS27.MTH894("FileOpClass");
            if(class0 != null) {
                return ((Boolean)CLS166.MTH3192(class0, CLS27.MTH897("FileOpMethod"), new Object[]{s})).booleanValue();
            }
        }
        catch(Throwable unused_ex) {
        }
        return CLS31.MTH1024(s);
    }

    // 此方法包含解密的字符串
    public static void MTH1464(String s, String s1, ArrayList arrayList0) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(arrayList0.isEmpty()) {
            return;
        }
        Class class0 = CLS27.MTH894("AddChatroomMemberClass");
        Class class1 = CLS27.MTH894("AddChatroomMemberClass2");
        Class class2 = CLS27.MTH894("AddChatroomMemberClass3");
        Object object0 = null;
        try {
            if(class2 != null) {
                object0 = CLS166.MTH3188(class2, new Object[]{s, arrayList0, s1, null});
            }
            else if(class1 != null) {
                object0 = CLS166.MTH3188(class1, new Object[]{s, arrayList0, s1});
            }
            else if(class0 != null) {
                object0 = CLS166.MTH3188(class0, new Object[]{s, arrayList0});
            }
            if(object0 != null) {
                CLS166.MTH3199(object0, "wx", s);
                CLS66.MTH1521(object0);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static ArrayList MTH1465(List list0) {
        ArrayList arrayList0 = new ArrayList();
        Class class0 = CLS27.MTH894("ImgClass3");
        if(class0 != null && list0 != null && !list0.isEmpty()) {
            for(int v = 0; v < list0.size(); ++v) {
                Object object0 = CLS182.MTH3492(4101619160528507701L, list0.get(v));
                String s = (String)CLS166.MTH3192(class0, CLS27.MTH897("imageMethod6"), new Object[]{object0});
                if(CLS66.MTH1463(s)) {
                    arrayList0.add(s);
                }
            }
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public static void MTH1466(String s, ArrayList arrayList0) {
        Object object0;
        Class class0 = CLS27.MTH894("DelChatroomMemberClass");
        Class class1 = CLS27.MTH894("DelChatroomMemberClass_b");
        if(class0 == null) {
            object0 = null;
        }
        else {
            try {
                object0 = CLS166.MTH3188(class0, new Object[]{s, arrayList0});
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                object0 = null;
            }
        }
        if(class1 != null) {
            try {
                object0 = CLS166.MTH3188(class1, new Object[]{s, arrayList0, 0});
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
        if(object0 != null) {
            CLS66.MTH1521(object0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1467(String s, String s1) {
        Class class0 = CLS27.MTH894("weRunLikeClass");
        if(class0 == null) {
            return;
        }
        try {
            CLS66.MTH1521(CLS166.MTH3188(class0, new Object[]{s, CLS371.FLD3470.MTH5311("gh_43f2581f6fd6"), 1, s1}));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1468(int v, String s, String s1) {
        Object object0 = null;
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            try {
                if(CLS27.MTH890("sendMsgClass")) {
                    object0 = CLS166.MTH3188(CLS27.MTH894("sendMsgClass"), new Object[]{s, s1, v});
                }
                else if(CLS27.MTH890("sendMsgClass_b")) {
                    object0 = CLS166.MTH3188(CLS27.MTH894("sendMsgClass_b"), new Object[]{s, s1, v, 0});
                }
                else if(CLS27.MTH890("sendMsgClass_c")) {
                    object0 = CLS166.MTH3188(CLS27.MTH894("sendMsgClass_c"), new Object[]{s, s1, v, 0, 0L});
                }
                else if(CLS27.MTH890("sendMsgClass_d")) {
                    object0 = CLS166.MTH3188(CLS27.MTH894("sendMsgClass_d"), new Object[]{v, 0, 0L, s, s1});
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            if(object0 == null) {
                return;
            }
            CLS66.MTH1521(object0);
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH1469(String s, byte[] arr_b, HashMap hashMap0, Object object0, Object object1, long v) {
        if(CLS182.MTH3470(4101147156507579189L)) {
            return false;
        }
        Class class0 = CLS27.MTH894("sendArticleClass");
        Class class1 = CLS27.MTH894("SendArticleClass3");
        Class class2 = CLS27.MTH894("FileOpClass");
        if(class2 != null && class0 != null) {
            try {
                String s1 = (String)hashMap0.get(".msg.appmsg.appattach.attachid");
                String s2 = CLS66.MTH1362(v, s1);
                if(TextUtils.isEmpty(s2)) {
                    return false;
                }
                CLS578 ᵔʾ0 = new CLS578(class0, class1, hashMap0, class2, s2, object1, object0, s, arr_b);
                if(CLS31.MTH1029(new CLS69(s2))) {
                    ᵔʾ0.MTH774();
                    return true;
                }
                CLS66.MTH1503(v, s1, ((CLS3)ᵔʾ0));
                return false;
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static void MTH1470(long v, HashMap hashMap0, CLS17 ﾞٴ0) {
        if(hashMap0 != null) {
            String s = (String)hashMap0.get(".msg.appmsg.appattach.attachid");
            String s1 = CLS66.MTH1362(v, s);
            if(TextUtils.isEmpty(s1)) {
                return;
            }
            String s2 = (String)hashMap0.get(".msg.appmsg.title");
            CLS69 ʾᵢ0 = new CLS69(s1);
            if(CLS31.MTH1029(ʾᵢ0)) {
                ﾞٴ0.MTH796(new Object[]{ʾᵢ0.MTH1567(), s2});
                return;
            }
            CLS66.MTH1503(v, s, ((CLS3)new CLS1568(ﾞٴ0, ʾᵢ0, s2, 6)));
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH1471(Object object0, String s) {
        Object object1;
        if(CLS27.MTH890("SnsVideoPathClass2")) {
            Class class0 = CLS27.MTH894("SnsVideoPathClass2");
            if(class0 != null) {
                boolean z = false;
                if(CLS27.MTH890("snsSightMethod6")) {
                    z = true;
                    object1 = CLS166.MTH3192(class0, CLS27.MTH897("snsSightMethod6"), new Object[]{s, object0});
                }
                else if(CLS27.MTH890("snsSightMethod6_b")) {
                    z = true;
                    object1 = CLS166.MTH3192(class0, CLS27.MTH897("snsSightMethod6"), new Object[]{object0, s});
                }
                if(z) {
                    String s1 = (String)object1;
                    return TextUtils.isEmpty(s1) ? false : CLS31.MTH975(s1);
                }
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static void MTH1472(long v, String s, String s1) {
        if(s1.startsWith("{")) {
            try {
                JSONObject jSONObject0 = new JSONObject(s1);
                if(jSONObject0.has("response")) {
                    JSONArray jSONArray0 = jSONObject0.getJSONArray("response");
                    for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                        JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                        if(jSONObject1.has("checked") && jSONObject1.getBoolean("checked")) {
                            CLS66.MTH1472(v, s, jSONObject1.getString("msg"));
                        }
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        String s2 = CLS502.MTH6939(s1, s, "");
        try {
            int v2 = 8;
            Object object0 = CLS66.MTH1434(v);
            if(object0 == null) {
                return;
            }
            if(CLS27.MTH890("snsLikeClass2b")) {
                Class class0 = CLS27.MTH894("snsLikeClass2b");
                String s3 = CLS27.MTH892("snsAddCommentMethod", "a");
                Object[] arr_object = new Object[4];
                arr_object[0] = object0;
                if((CLS166.MTH3181(object0, "field_sourceType") & 0x20) <= 0) {
                    v2 = 2;
                }
                arr_object[1] = v2;
                arr_object[2] = s2;
                arr_object[3] = 0;
                CLS166.MTH3192(class0, s3, arr_object);
                return;
            }
            if(CLS27.MTH890("snsLikeClass2")) {
                Class class1 = CLS27.MTH894("snsLikeClass2");
                String s4 = CLS27.MTH892("snsAddCommentMethod", "a");
                Object[] arr_object1 = {object0, null, null};
                if((CLS166.MTH3181(object0, "field_sourceType") & 0x20) <= 0) {
                    v2 = 2;
                }
                arr_object1[1] = v2;
                arr_object1[2] = s2;
                CLS166.MTH3192(class1, s4, arr_object1);
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1473(String s, String s1) {
        boolean z = false;
        if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
            if(!CLS502.MTH6934(s, new String[]{"/.ref/"}) && !CLS502.MTH6934(s1, new String[]{"/.ref/"})) {
                if(CLS27.MTH890("VFSFileOpCopy")) {
                    try {
                        Class class0 = CLS27.MTH894("FileOpClass");
                        String s2 = CLS27.MTH897("VFSFileOpCopy");
                        Object[] arr_object = {s, s1, null};
                        String s3 = CLS27.MTH882("copy_file_link");
                        if(!TextUtils.isEmpty(s3)) {
                            z = Boolean.parseBoolean(s3);
                        }
                        arr_object[2] = Boolean.valueOf(z);
                        ((Long)CLS166.MTH3192(class0, s2, arr_object)).longValue();
                        return;
                    }
                    catch(Throwable unused_ex) {
                    }
                }
                CLS31.MTH976(s, s1);
                return;
            }
            CLS31.MTH976(s, s1);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1474(int v, String s) {
        Class class0 = CLS27.MTH894("contactLabelUpdateClass");
        if(class0 == null) {
            return;
        }
        try {
            Object object0 = CLS166.MTH3188(class0, new Object[]{v, s});
            CLS166.MTH3199(object0, "wx", Boolean.TRUE);
            CLS66.MTH1521(object0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 低(40)
    // 此方法包含解密的字符串
    public static String MTH1475(long v) {
        return CLS66.MTH1485(((LinkedList)CLS182.MTH3492(0x38EA4C0E2B3CD335L, CLS182.MTH3492(0x38EA4C7A2B3CD335L, CLS166.MTH3195(CLS66.MTH1516(("sns_table_" + v)), CLS27.MTH897("snsSightMethod5"), new Object[0])))).get(0), "sns_table_" + v);
    }

    // 此方法包含解密的字符串
    public static String MTH1476() {
        Class class0 = CLS27.MTH894("fakeAmountClass2");
        if(class0 == null) {
            return "￥";
        }
        try {
            return (String)CLS166.MTH3192(class0, CLS27.MTH897("fakeAmountMethod4"), new Object[0]);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return "￥";
        }
    }

    // 此方法包含解密的字符串
    public static int MTH1477(byte[] arr_b) {
        try {
            Object object0 = CLS66.MTH1381(CLS27.MTH894("snsAttrClass"), arr_b);
            return object0 == null ? 0 : ((List)CLS166.MTH3194(object0, CLS27.MTH897("snsAttrLikeListField"))).size();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return 0;
        }
    }

    // 去混淆评级： 低(21)
    // 此方法包含解密的字符串
    public static int MTH1478(int v, String s, String s1, String s2, ArrayList arrayList0, ArrayList arrayList1) {
        try {
            Object object0 = CLS66.MTH1397(15);
            if(object0 == null) {
                return -1;
            }
            String s3 = CLS66.MTH1395(s1);
            String s4 = CLS66.MTH1395(s2);
            switch(v) {
                case 2: {
                    CLS166.MTH3195(object0, CLS27.MTH897("upSetShareTypeMethod"), new Object[]{0});
                    break;
                }
                case 3: {
                    CLS166.MTH3195(object0, CLS27.MTH897("upSetShareTypeMethod"), new Object[]{1});
                    break;
                }
                default: {
                    CLS166.MTH3195(object0, CLS27.MTH897("upSetShareTypeMethod"), new Object[]{0});
                }
            }
            if(CLS27.MTH890("upSetTypeMethod")) {
                CLS166.MTH3195(object0, CLS27.MTH897("upSetTypeMethod"), new Object[]{0});
            }
            else if(CLS27.MTH890("upClassField4")) {
                CLS166.MTH3198(CLS166.MTH3194(object0, CLS27.MTH897("upClassField4")), CLS27.MTH897("upClassField5"), 0);
            }
            if(!TextUtils.isEmpty(CLS27.MTH897("upMethod3"))) {
                CLS166.MTH3195(object0, CLS27.MTH897("upMethod3"), new Object[]{null, null, null, ((int)(v <= 1 ? 0 : 1)), 0});
            }
            CLS166.MTH3195(object0, CLS27.MTH897("upSetContentMethod"), new Object[]{s});
            CLS166.MTH3195(object0, CLS27.MTH897("upSetMentionListMethod"), new Object[]{CLS66.MTH1504(arrayList0)});
            CLS166.MTH3195(object0, CLS27.MTH897("upSetPrivateMethod"), new Object[]{((int)(v == 1 ? 1 : 0))});
            if(CLS27.MTH890("upMethod4")) {
                CLS166.MTH3195(object0, CLS27.MTH897("upMethod4"), new Object[]{0});
            }
            else if(CLS27.MTH890("upClass1Field2")) {
                CLS166.MTH3198(CLS166.MTH3194(object0, CLS27.MTH897("upClass1Field2")), CLS27.MTH897("upClass1Field3"), 0);
            }
            CLS166.MTH3195(object0, CLS27.MTH897("upSetListMethod"), new Object[]{arrayList1});
            if(!TextUtils.isEmpty(CLS27.MTH897("upSetSightMethod"))) {
                CLS166.MTH3195(object0, CLS27.MTH897("upSetSightMethod"), new Object[]{s3, s4, s, CLS31.MTH1017(s3)});
            }
            else if(CLS27.MTH890("upSetSightMethod2d")) {
                CLS166.MTH3195(object0, CLS27.MTH897("upSetSightMethod2d"), new Object[]{"", 6, s3, s4, CLS31.MTH1017(s3), "", "", 15});
            }
            else if(CLS27.MTH890("upSetSightMethod2")) {
                CLS166.MTH3195(object0, CLS27.MTH897("upSetSightMethod2"), new Object[]{"", 6, s3, s4, CLS31.MTH1017(s3), "", ""});
            }
            else if(CLS27.MTH890("upSetSightMethod2b")) {
                CLS166.MTH3195(object0, CLS27.MTH897("upSetSightMethod2b"), new Object[]{"", s3, s4, CLS31.MTH1017(s3), "", ""});
            }
            else if(CLS27.MTH890("upSetSightMethod2c")) {
                CLS166.MTH3195(object0, CLS27.MTH897("upSetSightMethod2c"), new Object[]{s3, s4, CLS31.MTH1017(s3), "", ""});
            }
            Class class0 = CLS27.MTH894("SnsPathClass");
            Class class1 = CLS27.MTH894("sightUpClass1");
            Class class2 = CLS27.MTH894("snsImgItemClass1");
            Class class3 = CLS27.MTH894("sightUpClass2");
            if(class1 != null && class0 != null && class2 != null && class3 != null) {
                Object object1 = CLS166.MTH3192(class1, CLS27.MTH897("sightUpMethod1"), new Object[0]);
                CLS166.MTH3196(6, object1, CLS27.MTH897("sightUpField1"));
                Object object2 = CLS166.MTH3188(class2, new Object[]{s3, 6});
                if(!TextUtils.isEmpty(CLS27.MTH897("sightUpField2"))) {
                    CLS166.MTH3198(object2, CLS27.MTH897("sightUpField2"), CLS31.MTH1017(s3));
                }
                int v1 = (int)(((Integer)CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("sightUpMethod2"), new Object[0]), "a", new Object[]{object2, s3, s4})));
                CLS166.MTH3196(v1, object2, CLS27.MTH897("sightUpField3"));
                CLS166.MTH3198(object1, CLS27.MTH897("sightUpField4"), "Locall_path" + v1);
                CLS166.MTH3196(v1, object1, CLS27.MTH897("sightUpField3"));
                CLS166.MTH3195(CLS166.MTH3194(CLS166.MTH3194(CLS166.MTH3194(object0, CLS27.MTH897("sightUpField5")), CLS27.MTH897("sightUpField6")), CLS27.MTH897("sightUpField7")), "add", new Object[]{object1});
                Object object3 = CLS166.MTH3188(class3, new Object[0]);
                CLS166.MTH3196(v1, object3, CLS27.MTH897("sightUpField8"));
                CLS166.MTH3195(CLS166.MTH3194(CLS166.MTH3194(object0, CLS27.MTH897("sightUpField9")), CLS27.MTH897("sightUpField10")), "add", new Object[]{object3});
            }
            int v2 = (int)(((Integer)CLS166.MTH3195(object0, CLS27.MTH897("upCommitMethod"), new Object[0])));
            if(class0 != null) {
                CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("upMethod1"), new Object[0]), CLS27.MTH897("upMethod2"), new Object[0]);
            }
            return v2;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return -1;
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH1479(long v) {
        Object object0 = CLS66.MTH1434(v);
        return object0 != null && CLS166.MTH3181(object0, "field_likeFlag") == 1;
    }

    // 此方法包含解密的字符串
    public static void MTH1480(int v, Object object0) {
        Class class0 = CLS27.MTH894("SnsVideoPathClass2");
        if(class0 == null) {
            return;
        }
        try {
            Object object1 = CLS27.MTH890("snsSightDownloadHelperMethod3") ? CLS166.MTH3192(class0, CLS27.MTH897("snsSightDownloadHelperMethod3"), new Object[]{v, CLS166.MTH3194(object0, CLS27.MTH897("snsSightDownloadHelperField8"))}) : CLS166.MTH3192(class0, CLS27.MTH897("snsSightDownloadHelperMethod3b"), new Object[]{v, object0});
            if(CLS27.MTH890("snsSightRequestClass2")) {
                Class class1 = CLS27.MTH894("snsSightRequestClass2");
                if(!TextUtils.isEmpty(CLS27.MTH897("snsSightRequestMethod2"))) {
                    CLS166.MTH3192(class1, CLS27.MTH897("snsSightRequestMethod2"), new Object[]{((String)object1), 0, -1, 0});
                    return;
                }
                if(!TextUtils.isEmpty(CLS27.MTH897("snsSightRequestMethod2b"))) {
                    CLS166.MTH3192(class1, CLS27.MTH897("snsSightRequestMethod2b"), new Object[]{((String)object1), 0, -1});
                }
            }
            else if(CLS27.MTH890("snsSightRequestClass3")) {
                Object object2 = CLS166.MTH3192(CLS27.MTH894("snsSightRequestClass3"), CLS27.MTH897("snsSightRequestMethod3"), new Object[0]);
                if(CLS27.MTH890("snsSightRequestMethod2")) {
                    CLS166.MTH3195(object2, CLS27.MTH897("snsSightRequestMethod2"), new Object[]{((String)object1), 0, -1, 0});
                    return;
                }
                if(CLS27.MTH890("snsSightRequestMethod2b")) {
                    CLS166.MTH3195(object2, CLS27.MTH897("snsSightRequestMethod2b"), new Object[]{((String)object1), 0, -1});
                    return;
                }
                if(CLS27.MTH890("snsSightRequestMethod2c")) {
                    CLS166.MTH3195(object2, CLS27.MTH897("snsSightRequestMethod2c"), new Object[]{0, -1, ((String)object1)});
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1481(long v) {
        Class class0 = CLS27.MTH894("snsDelClass");
        if(class0 == null) {
            return;
        }
        try {
            CLS66.MTH1521(CLS166.MTH3188(class0, new Object[]{v, 2}));
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH1482(String s) {
        Object object0;
        String s1 = "";
        try {
            if(TextUtils.isEmpty(CLS27.MTH897("videoClass"))) {
                Class class1 = CLS27.MTH894("snsSightRequestClass3");
                if(class1 != null) {
                    object0 = CLS166.MTH3195(CLS166.MTH3192(class1, CLS27.MTH897("videoMethod3"), new Object[0]), CLS27.MTH897("videoMethod1"), new Object[]{s});
                    s1 = (String)object0;
                    return CLS66.MTH1395(s1);
                }
            }
            else {
                Class class0 = CLS27.MTH894("videoClass");
                if(class0 != null) {
                    object0 = CLS166.MTH3192(class0, CLS27.MTH897("videoMethod1"), new Object[]{s});
                    s1 = (String)object0;
                    return CLS66.MTH1395(s1);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return CLS66.MTH1395(s1);
    }

    // 此方法包含解密的字符串
    public static String MTH1483(String s) {
        try {
            Class class0 = CLS27.MTH894("voiceClass1");
            return class0 != null ? CLS31.MTH992(CLS66.MTH1395(((String)CLS166.MTH3192(class0, CLS27.MTH897("voiceMethod1"), new Object[]{s})))) : "";
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return "";
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1484(String s, String s1, int v, int v1, int v2) {
        Class class3;
        Class class0 = CLS27.MTH894("massSendClass");
        Class class1 = CLS27.MTH894("massSendClass2");
        if(class0 != null && class1 != null) {
            if(v2 == 43) {
                Object[] arr_object = {CLS31.MTH1017(CLS31.MTH992(s1))};
                CLS21.FLD76.MTH818("skip_large_video_check", arr_object);
            }
            CLS759 ـˏ0 = new CLS759(class1, s, v, v2, class0);
            if(v2 != 43 || !CLS27.MTH890("ImportVideoClass")) {
                ـˏ0.MTH796(new Object[]{s1, v1});
            }
            else {
                Class class2 = CLS27.MTH894("ImportVideoClass");
                if(class2 != null) {
                    Context context0 = CLS27.MTH900();
                    Intent intent0 = new Intent();
                    intent0.setData(CLS66.MTH1491(context0, new File(s1)));
                    if(CLS27.MTH890("ImportVideoClass_interface1")) {
                        class3 = CLS27.MTH894(CLS370.MTH5289(0x38EBF1B32B3CD335L));
                    }
                    else {
                        class3 = CLS27.MTH890("ImportVideoClass_interface1_b") ? CLS27.MTH894(CLS370.MTH5289(0x38EBFE6D2B3CD335L)) : null;
                    }
                    if(class3 != null) {
                        CLS485 ᐧﾞ0 = (CLS485)CLS40.FLD157.MTH1118(CLS485.class);
                        String s2 = CLS27.MTH889("mass_send");
                        String s3 = CLS27.MTH889("mass_send_import");
                        ᐧﾞ0.getClass();
                        CLS484 ᐧﾞ$ˆٴ0 = CLS485.MTH6746("mass_send", s2, s3);
                        Object object0 = Proxy.newProxyInstance(class3.getClassLoader(), new Class[]{class3}, new CLS65(ᐧﾞ$ˆٴ0, ـˏ0));
                        CLS412.MTH6011(CLS27.MTH889("mass_send_import"));
                        boolean z = CLS27.MTH890("sendVideoMethod4") ? ((Boolean)CLS166.MTH3192(CLS27.MTH894("sendVideoClass"), CLS27.MTH897("sendVideoMethod4"), new Object[0])).booleanValue() : false;
                        CLS166.MTH3195(CLS166.MTH3188(class2, new Object[0]), CLS27.MTH897("ImportVideoClass_method1"), new Object[]{context0, intent0, s, Boolean.valueOf(z), object0});
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public static String MTH1485(Object object0, String s) {
        String s1;
        try {
            if(CLS27.MTH890("SnsVideoPathClass2")) {
                Class class0 = CLS27.MTH894("SnsVideoPathClass2");
                if(class0 != null) {
                    if(CLS27.MTH890("snsSightMethod6")) {
                        s1 = (String)CLS166.MTH3192(class0, CLS27.MTH897("snsSightMethod6"), new Object[]{s, object0});
                    }
                    else {
                        s1 = CLS27.MTH890("snsSightMethod6_b") ? ((String)CLS166.MTH3192(class0, CLS27.MTH897("snsSightMethod6"), new Object[]{object0, s})) : null;
                    }
                    if(TextUtils.isEmpty(s1)) {
                        if(CLS27.MTH890("getSnsVideoFullPathMethod")) {
                            s1 = (String)CLS166.MTH3192(class0, CLS27.MTH897("getSnsVideoFullPathMethod"), new Object[]{s, object0});
                        }
                        else if(CLS27.MTH890("getSnsVideoFullPathMethod_b")) {
                            s1 = (String)CLS166.MTH3192(class0, CLS27.MTH897("getSnsVideoFullPathMethod_b"), new Object[]{object0, s});
                        }
                    }
                    if(!TextUtils.isEmpty(s1) || !CLS27.MTH890("getSnsVideoPathMethod2")) {
                        return CLS31.MTH992(CLS66.MTH1395(s1));
                    }
                    s1 = (String)CLS166.MTH3192(class0, CLS27.MTH897("getSnsVideoPathMethod2"), new Object[]{object0});
                    return CLS31.MTH992(CLS66.MTH1395(s1));
                }
                s1 = null;
                return CLS31.MTH992(CLS66.MTH1395(s1));
            }
            Class class1 = CLS27.MTH894("SnsPathClass");
            Class class2 = CLS27.MTH894("SnsVideoPathClass");
            Class class3 = CLS27.MTH894("SnsDataClass");
            if(class1 != null && class3 != null && class2 != null) {
                String s2 = (String)CLS166.MTH3194(object0, CLS27.MTH897("snsSightField4"));
                String s3 = (String)CLS166.MTH3192(class1, CLS27.MTH897("snsSightMethod1"), new Object[0]);
                String s4 = (String)CLS166.MTH3192(class2, CLS27.MTH897("snsSightMethod2"), new Object[]{s3, s2});
                s1 = TextUtils.isEmpty(CLS27.MTH897("snsSightMethod4")) ? s4 + CLS166.MTH3192(class3, CLS27.MTH897("snsSightMethod4B"), new Object[]{s2}) : s4 + CLS166.MTH3192(class3, CLS27.MTH897("snsSightMethod4"), new Object[]{object0});
                return CLS31.MTH992(CLS66.MTH1395(s1));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static boolean MTH1486(String s, String s1, byte[] arr_b, long v) {
        Object object0;
        if(arr_b == null) {
            try {
                arr_b = CLS518.MTH7054(CLS404.MTH5887());
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        Class class0 = CLS27.MTH894("sendArticleClass");
        Class class1 = CLS27.MTH894("sendArticleClass1");
        if(class0 != null && class1 != null) {
            try {
                if(v != 0L) {
                    s1 = CLS66.MTH1490(v);
                }
                String s2 = CLS27.MTH890("sendArticleClass2") ? ((String)CLS166.MTH3192(CLS27.MTH894("sendArticleClass2"), CLS27.MTH897("sendArticleMethod3"), new Object[]{s1})) : s1;
                if(CLS27.MTH890("sendArticleMethod2_b")) {
                    object0 = CLS166.MTH3192(class1, CLS27.MTH897("sendArticleMethod2_b"), new Object[]{s2, null});
                }
                else {
                    object0 = CLS27.MTH890("sendArticleMethod2") ? CLS166.MTH3192(class1, CLS27.MTH897("sendArticleMethod2"), new Object[]{s2}) : null;
                }
                if(object0 == null) {
                    return false;
                }
                Object object1 = CLS166.MTH3192(class1, CLS27.MTH897("sendArticleMethod1"), new Object[]{object0});
                HashMap hashMap0 = CLS392.MTH5633(s1, "msg");
                switch(Integer.parseInt(((String)hashMap0.get(".msg.appmsg.type")))) {
                    case 6: 
                    case 74: {
                        return CLS66.MTH1469(s, arr_b, hashMap0, object0, object1, v);
                    }
                    default: {
                        if(TextUtils.isEmpty(CLS27.MTH897("sendArticleMethodB"))) {
                            CLS166.MTH3192(class0, CLS27.MTH897("sendArticleMethod"), new Object[]{object1, CLS166.MTH3194(object0, CLS27.MTH892("sendArticleClass1_appNameField", "appName")), s, "", arr_b, null});
                            return true;
                        }
                        CLS166.MTH3192(class0, CLS27.MTH897("sendArticleMethodB"), new Object[]{object1, CLS166.MTH3194(object0, CLS27.MTH892("sendArticleClass1_appIdField", "appId")), CLS166.MTH3194(object0, CLS27.MTH892("sendArticleClass1_appNameField", "appName")), s, "", arr_b});
                        return true;
                    }
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
        return false;
    }

    // 去混淆评级： 中等(70)
    // 此方法包含解密的字符串
    public static Object MTH1487(Class class0) {
        return !CLS27.MTH890("sendGifEmojiClass3") || class0 == null ? null : CLS166.MTH3192(CLS27.MTH894("sendGifEmojiClass3"), CLS27.MTH897("sendGifEmojiClass3_method1"), new Object[]{class0});
    }

    // 此方法包含解密的字符串
    public static Bitmap MTH1488(String s) {
        Bitmap bitmap0;
        Class class0 = CLS27.MTH894("avatarClass");
        if(class0 != null && CLS27.MTH890("getAvatarStorageMethod")) {
            try {
                Object object0 = CLS166.MTH3192(class0, CLS27.MTH897("getAvatarStorageMethod"), new Object[0]);
                if(object0 == null) {
                    return null;
                }
                bitmap0 = (Bitmap)CLS166.MTH3195(object0, CLS27.MTH897("avatarCacheMethod"), new Object[]{s});
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                bitmap0 = null;
            }
            if(bitmap0 != null && !bitmap0.isRecycled()) {
                return bitmap0;
            }
            Class class1 = CLS27.MTH894("avatarClass");
            if(class1 != null && CLS27.MTH890("avatarStorage_getAvatarFileMethod")) {
                try {
                    Object object1 = CLS166.MTH3192(class1, CLS27.MTH897("getAvatarStorageMethod"), new Object[0]);
                    if(object1 != null) {
                        String s1 = (String)CLS166.MTH3195(object1, CLS27.MTH897("avatarStorage_getAvatarFileMethod"), new Object[]{s, Boolean.FALSE});
                        if(!TextUtils.isEmpty(s1)) {
                            if(CLS27.MTH890("avatarStorage_decodeFileMethod")) {
                                return CLS166.MTH3192(object1.getClass(), CLS27.MTH897("avatarStorage_decodeFileMethod"), new Object[]{s1, s, Boolean.TRUE});
                            }
                            if(CLS27.MTH890("avatarStorage_decodeFileMethod_b")) {
                                return CLS166.MTH3192(object1.getClass(), CLS27.MTH897("avatarStorage_decodeFileMethod_b"), new Object[]{s1, Boolean.TRUE});
                            }
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
            }
        }
        return null;
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static List MTH1489(long v) {
        return CLS66.MTH1508(("sns_table_" + v));
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public static String MTH1490(long v) {
        return (String)CLS166.MTH3194(CLS66.MTH1495(v), "field_content");
    }

    // 此方法包含解密的字符串
    public static Uri MTH1491(Context context0, File file0) {
        Uri uri0 = null;
        if(Build.VERSION.SDK_INT >= 24 && CLS390.MTH5620(context0) >= 24) {
            Class class0 = CLS27.MTH894("GetUriClass");
            if(class0 != null) {
                Class class1 = CLS27.MTH894("GetUriClass2");
                if(class1 == null) {
                    uri0 = (Uri)CLS166.MTH3192(class0, CLS27.MTH897("GetUriMethod"), new Object[]{context0, file0});
                }
                else if(!CLS182.MTH3470(4101634381892604725L)) {
                    uri0 = (Uri)CLS166.MTH3192(class0, CLS27.MTH897("GetUriMethod_b"), new Object[]{context0, file0});
                }
                else if(!CLS182.MTH3470(4101635060497437493L)) {
                    Object object0 = CLS166.MTH3188(class1, new Object[]{file0.getAbsolutePath()});
                    uri0 = (Uri)CLS166.MTH3192(class0, CLS27.MTH897("GetUriMethod"), new Object[]{context0, object0});
                }
            }
            if(uri0 == null) {
                uri0 = (Uri)CLS21.FLD76.MTH836("getUriFromProvider", new Object[]{file0});
            }
        }
        return uri0 == null ? Uri.fromFile(file0) : uri0;
    }

    // 此方法包含解密的字符串
    public static Object MTH1492(String s) {
        Class class0 = CLS27.MTH894("snsImageClass1");
        if(class0 != null) {
            return CLS166.MTH3188(class0, new Object[]{s});
        }
        Class class1 = CLS27.MTH894("snsImageClass2");
        return class1 != null ? Enum.valueOf(class1, s) : null;
    }

    // 此方法包含解密的字符串
    public static Object MTH1493(Context context0, Class class0) {
        if(!CLS27.MTH890("GetImproveUICls1")) {
            return null;
        }
        try {
            Object object0 = CLS166.MTH3195(CLS166.MTH3186(CLS27.MTH894("GetImproveUICls1"), CLS27.MTH897("GetImproveUICls1_field1")), CLS27.MTH897("GetImproveUICls1_method1"), new Object[]{context0});
            if(object0 != null) {
                return CLS166.MTH3195(object0, CLS27.MTH897("GetImproveUICls1_method2"), new Object[]{class0});
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static void MTH1494(int v) {
        Class class0 = CLS27.MTH894("dbClass1");
        Class class1 = CLS27.MTH894("userInfoClass");
        Class class2 = CLS27.MTH894("RoomNameClass3");
        if(class1 != null && class2 != null && class0 != null) {
            try {
                Object object0 = CLS166.MTH3192(class1, CLS27.MTH897("userInfoMethod1"), new Object[0]);
                CLS166.MTH3196(v, object0, CLS27.MTH897("userInfoField1"));
                Object object1 = CLS166.MTH3188(class2, new Object[]{1, CLS166.MTH3192(class1, CLS27.MTH897("userInfoMethod2"), new Object[]{object0})});
                Object object2 = CLS166.MTH3192(class0, CLS27.MTH897("dbMethod1"), new Object[0]);
                if(object2 != null) {
                    CLS166.MTH3195(CLS166.MTH3195(object2, CLS27.MTH897("delMethod5"), new Object[0]), CLS27.MTH897("delMethod6"), new Object[]{object1});
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    public static Object MTH1495(long v) {
        return CLS66.MTH1448(CLS371.FLD3470.MTH5361(v));
    }

    // 此方法包含解密的字符串
    public static void MTH1496(String s, String s1) {
        try {
            Class class0 = CLS27.MTH894("favItemClass");
            Class class1 = CLS27.MTH894("favClass2");
            Class class2 = CLS27.MTH894("favClass3");
            if(class0 == null || class1 == null || class2 == null) {
                return;
            }
            Cursor cursor0 = CLS449.FLD4410.MTH6388(s1);
            if(cursor0 == null) {
                return;
            }
            cursor0.moveToFirst();
            if(cursor0.getCount() == 0) {
                cursor0.close();
                return;
            }
            Object object0 = CLS166.MTH3188(class0, new Object[0]);
            CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
            int v = CLS166.MTH3181(object0, "field_type");
            if(v == -1) {
                return;
            }
            Object object1 = CLS66.MTH1442(Long.parseLong(s1));
            Object object2 = CLS166.MTH3192(class1, CLS27.MTH897("favMethod3"), new Object[]{object1});
            switch(v) {
                case 1: {
                    CLS466.MTH6542(s, ((String)CLS166.MTH3194(CLS166.MTH3194(object0, "field_favProto"), CLS27.MTH892("favProto_descField", CLS27.MTH897("favArticleField1")))));
                    return;
                }
                case 2: {
                    String s2 = CLS31.MTH992(((String)CLS166.MTH3192(class1, CLS27.MTH897("favPathMethod"), new Object[]{object2})));
                    CLS66.MTH1406(CLS27.MTH904(), s, s2);
                    return;
                }
                case 3: {
                    int v1 = CLS166.MTH3181(object2, CLS27.MTH892("favVoiceField2", "duration"));
                    String s3 = (String)CLS166.MTH3194(object2, CLS27.MTH897("favVoiceField1"));
                    if(!CLS31.MTH1024(s3)) {
                        s3 = CLS31.MTH992(((String)CLS166.MTH3192(class1, CLS27.MTH897("favPathMethod"), new Object[]{object2})));
                    }
                    if(CLS31.MTH1024(s3)) {
                        String s4 = CLS66.MTH1456(s);
                        if(CLS31.MTH976(s3, CLS66.MTH1483(s4))) {
                            CLS66.MTH1378(v1, s4);
                            return;
                        }
                    }
                    break;
                }
                case 4: 
                case 16: {
                    CLS66.MTH1361(CLS27.MTH900(), object2, s);
                    return;
                }
                default: {
                    if(CLS27.MTH890("favSendFileMethod2")) {
                        LinkedList linkedList0 = new LinkedList();
                        linkedList0.add(object0);
                        CLS166.MTH3192(class2, CLS27.MTH897("favSendFileMethod2"), new Object[]{CLS27.MTH900(), s, null, linkedList0, null});
                        return;
                    }
                    CLS166.MTH3192(class2, CLS27.MTH892("favSendFileMethod1", "a"), new Object[]{CLS27.MTH900(), s, null, object0, null});
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static boolean MTH1497() {
        try {
            if((((int)(((Integer)CLS66.MTH1377()))) & 0x20) != 0) {
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static String MTH1498(String s) {
        if(CLS66.MTH1394(s)) {
            StringBuilder stringBuilder0 = CLS182.MTH3483(s);
            stringBuilder0.append("origin");
            return CLS66.MTH1449(stringBuilder0.toString());
        }
        return CLS66.MTH1449(s);
    }

    // 此方法包含解密的字符串
    public static int MTH1499(String s) {
        int v;
        Class class0 = CLS27.MTH894("contactModel");
        if(class0 == null) {
            return -1;
        }
        try {
            Cursor cursor0 = CLS371.FLD3470.MTH5307("SELECT * FROM rcontact WHERE username = ? or encryptUsername = ?", new String[]{s, s});
            if(cursor0 == null) {
                return -1;
            }
            if(cursor0.moveToFirst()) {
                Object object0 = CLS166.MTH3188(class0, new Object[0]);
                CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
                v = CLS166.MTH3181(object0, CLS27.MTH892("ContactSexField", "sex"));
            }
            else {
                v = -1;
            }
            if(!cursor0.isClosed()) {
                cursor0.close();
            }
            return v;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return -1;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1500(ArrayList arrayList0, CLS3 ˆٴ0) {
        Object object2;
        Class class0 = CLS27.MTH894("deleteMsgClass");
        Class class1 = CLS27.MTH894("dbClass1");
        if(class0 != null && !arrayList0.isEmpty() && class1 != null) {
            if(!CLS27.MTH890("deleteMsgMethod4") && !CLS27.MTH890("deleteMsgMethod4_a") && !CLS27.MTH890("deleteMsgMethod4_b")) {
                for(Object object0: arrayList0) {
                    CLS66.MTH1444(((String)object0), ˆٴ0);
                }
                return;
            }
            Object object1 = CLS166.MTH3192(class1, CLS27.MTH897("dbMethod1"), new Object[0]);
            try {
                if(CLS27.MTH890("deleteMsgCallbackClass")) {
                    Class class2 = CLS27.MTH894("deleteMsgCallbackClass");
                    object2 = Proxy.newProxyInstance(class2.getClassLoader(), new Class[]{class2}, new CLS63(arrayList0, object1, ˆٴ0, 0));
                }
                else {
                    goto label_19;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                object2 = null;
            }
            goto label_20;
        label_19:
            object2 = null;
            try {
            label_20:
                if(CLS27.MTH890("deleteMsgMethod4")) {
                    CLS166.MTH3192(class0, CLS27.MTH897("deleteMsgMethod4"), new Object[]{arrayList0, object2, 0x7FFFFFFFFFFFFFFFL});
                }
                else if(CLS27.MTH890("deleteMsgMethod4_a")) {
                    CLS166.MTH3192(class0, CLS27.MTH897("deleteMsgMethod4_a"), new Object[]{arrayList0, object2});
                }
                else if(CLS27.MTH890("deleteMsgMethod4_b")) {
                    CLS166.MTH3192(class0, CLS27.MTH897("deleteMsgMethod4_b"), new Object[]{arrayList0});
                }
                if(object2 == null) {
                    CLS1279 ʻᐧ0 = new CLS1279(arrayList0, object1, ˆٴ0, 13);
                    CLS40.FLD157.MTH1123(((CLS39)ʻᐧ0), 1500L);
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1501(int v, String s, String s1) {
        if(CLS27.MTH890("verifyUserClass_d")) {
            Class class0 = CLS27.MTH894("verifyUserClass_d");
            if(class0 != null) {
                try {
                    CLS66.MTH1521(CLS166.MTH3188(class0, new Object[]{3, s, s1}));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        else if(CLS27.MTH890("verifyUserClass_c")) {
            Class class1 = CLS27.MTH894("verifyUserClass_c");
            if(class1 != null) {
                try {
                    CLS66.MTH1521(CLS166.MTH3188(class1, new Object[]{s, s1, v, null, 0}));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        else if(CLS27.MTH890("verifyUserClassb")) {
            Class class2 = CLS27.MTH894("verifyUserClassb");
            if(class2 != null) {
                try {
                    CLS66.MTH1521(CLS166.MTH3188(class2, new Object[]{3, s, s1, v}));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        else if(CLS27.MTH890("verifyUserClass")) {
            Class class3 = CLS27.MTH894("verifyUserClass");
            if(class3 != null) {
                try {
                    CLS66.MTH1521(CLS166.MTH3188(class3, new Object[]{s, s1, v}));
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public static boolean MTH1502(Intent intent0, String s) {
        if(CLS27.MTH890("PluginHelperClass") && CLS27.MTH890("PluginHelperMethod3")) {
            Class class0 = CLS27.MTH894("PluginHelperClass");
            if(class0 != null) {
                try {
                    if(CLS27.MTH890("PluginHelperMethod3")) {
                        CLS166.MTH3192(class0, CLS27.MTH897("PluginHelperMethod3"), new Object[]{CLS27.MTH900(), s, intent0, null});
                        return true;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static void MTH1503(long v, String s, CLS3 ˆٴ0) {
        Class class0 = CLS27.MTH894("GetMsgImgInterfaceClass");
        if(class0 == null) {
            return;
        }
        Class class1 = CLS27.MTH894("DownloadAppAttachClass");
        if(class1 == null) {
            return;
        }
        CLS97 ﾞٴ0 = new CLS97(ˆٴ0);
        CLS66.MTH1521(CLS166.MTH3188(class1, new Object[]{v, s, Proxy.newProxyInstance(class0.getClassLoader(), new Class[]{class0}, new CLS64(0, ﾞٴ0))}));
    }

    // 此方法包含解密的字符串
    public static LinkedList MTH1504(ArrayList arrayList0) {
        List list0;
        LinkedList linkedList0 = new LinkedList();
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            Class class0 = CLS27.MTH894("upClass1");
            if(class0 != null) {
                Class class1 = CLS27.MTH894("snsBlacklistClass1");
                if(class1 == null) {
                label_10:
                    Class class2 = CLS27.MTH894("SetRemarkClass");
                    if(class2 == null) {
                        list0 = new ArrayList();
                    }
                    else {
                        try {
                            list0 = (List)CLS166.MTH3192(class2, CLS27.MTH897("snsBlacklistMethod"), new Object[0]);
                        }
                        catch(Throwable throwable1) {
                            CLS27.MTH893(throwable1);
                            list0 = new ArrayList();
                        }
                    }
                }
                else {
                    try {
                        list0 = (List)CLS166.MTH3192(class1, CLS27.MTH897("snsBlacklistMethod"), new Object[0]);
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                        goto label_10;
                    }
                }
                for(Object object0: arrayList0) {
                    String s = (String)object0;
                    if(!list0.contains(s)) {
                        Object object1 = CLS166.MTH3188(class0, new Object[0]);
                        CLS166.MTH3198(object1, CLS27.MTH897("upClass1Field"), s);
                        linkedList0.add(object1);
                    }
                }
            }
        }
        return linkedList0;
    }

    // 此方法包含解密的字符串
    public static Object MTH1505(String s) {
        Object object2;
        Object object0 = null;
        try {
            if(CLS27.MTH890("AtSomeoneUIClass1")) {
                Object object1 = CLS166.MTH3192(CLS27.MTH894("AtSomeoneUIClass1"), CLS27.MTH897("AtSomeoneMethod3"), new Object[0]);
                if(CLS27.MTH890("AtSomeoneMethod4")) {
                    object1 = CLS166.MTH3195(object1, CLS27.MTH897("AtSomeoneMethod4"), new Object[0]);
                }
                object2 = CLS166.MTH3195(object1, CLS27.MTH897("AtSomeoneMethod1"), new Object[]{s});
            }
            else {
                Class class0 = CLS27.MTH894("dbClass1");
                if(class0 == null) {
                    return null;
                }
                object2 = CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("dbMethod1"), new Object[0]), CLS27.MTH897("delMethod11"), new Object[0]), CLS27.MTH897("AtSomeoneMethod1"), new Object[]{s});
            }
            object0 = object2;
            if(object0 != null) {
                CLS166.MTH3195(object0, CLS27.MTH897("chatroomDataUpdateMethod"), new Object[0]);
                return object0;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return object0;
    }

    // 此方法包含解密的字符串
    public static void MTH1506(long v, int v1, ArrayList arrayList0, ArrayList arrayList1, String s) {
        if(v == -1L) {
            return;
        }
        Class class0 = CLS27.MTH894("snsPostInfoClass1");
        Class class1 = CLS27.MTH894("TimeLineConvertClass");
        Class class2 = CLS27.MTH894("snsClass2");
        CLS396 ʿʽ0 = CLS396.FLD3775;
        Object object0 = CLS404.MTH5894(v);
        Object object1 = CLS166.MTH3188(class0, new Object[0]);
        Object object2 = CLS166.MTH3194(object0, "field_postBuf");
        if(object2 != null) {
            CLS166.MTH3195(object1, CLS27.MTH897("blobDecodeMethod"), new Object[]{object2});
        }
        String s1 = CLS27.MTH897("snsPostInfoClass1_field1");
        CLS166.MTH3196(CLS166.MTH3181(object1, CLS27.MTH897("snsPostInfoClass1_field1")) + 1, object1, s1);
        CLS166.MTH3198(object0, "field_postBuf", CLS166.MTH3195(object1, CLS27.MTH897("toByteArrayMethod"), new Object[0]));
        ContentValues contentValues0 = (ContentValues)CLS166.MTH3195(object0, CLS27.MTH897("convertToMethod"), new Object[0]);
        contentValues0.remove("rowid");
        contentValues0.put("userName", CLS27.MTH904());
        contentValues0.put("createTime", ((long)(System.currentTimeMillis() / 1000L)));
        ʿʽ0.MTH5767("SnsInfo", contentValues0, "rowid=?", new String[]{String.valueOf(v)});
        Object object3 = CLS166.MTH3195(CLS404.MTH5894(v), CLS27.MTH897("snsSightMethod5"), new Object[0]);
        String s2 = (String)CLS166.MTH3192(class1, CLS27.MTH897("TimeLineConvertMethod1"), new Object[]{object3});
        if(TextUtils.isEmpty(s2)) {
            return;
        }
        if(CLS182.MTH3474(4101624937259520821L, contentValues0) == 1 && !CLS502.MTH6934(s2, new String[]{"md5"})) {
            LinkedList linkedList0 = (LinkedList)CLS182.MTH3492(0x38EBE6C32B3CD335L, CLS182.MTH3492(0x38EBE62F2B3CD335L, object3));
            for(int v2 = 0; v2 < linkedList0.size(); ++v2) {
                Object object4 = linkedList0.get(v2);
                String s3 = (String)CLS182.MTH3492(0x38EBE6D22B3CD335L, object4);
                String s4 = (String)CLS182.MTH3492(4101625749008339765L, object4);
                String s5 = (String)CLS182.MTH3492(0x38EBE6F42B3CD335L, object4);
                String s6 = (String)CLS182.MTH3492(0x38EBE6852B3CD335L, object4);
                String s7 = (String)CLS182.MTH3492(4101625431180759861L, object4);
                String s8 = (String)CLS182.MTH3492(4101625525670040373L, object4);
                s2 = s2.replace(CLS502.MTH6945(s3, s7, null, null, null, null, 0), CLS502.MTH6945(s3, s7, s4, s5, s6, s8, 1));
            }
        }
        String s9 = s2;
        if(!TextUtils.isEmpty(s)) {
            if(CLS502.MTH6934(s9, new String[]{"<location"})) {
                s9 = CLS182.MTH3495(s9, 0, s9.indexOf("<location"), new StringBuilder(), s9.indexOf("</location>"), 11);
            }
            int v3 = s9.indexOf("</TimelineObject");
            s9 = s9.substring(0, v3) + s + s9.substring(v3);
        }
        LinkedList linkedList1 = new LinkedList();
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            linkedList1.addAll(arrayList0);
        }
        LinkedList linkedList2 = new LinkedList();
        if(arrayList1 != null && !arrayList1.isEmpty()) {
            for(Object object5: arrayList1) {
                Object object6 = CLS166.MTH3188(class2, new Object[0]);
                CLS166.MTH3195(object6, CLS27.MTH897("snsClass3_method1"), new Object[]{((String)object5)});
                linkedList2.add(object6);
            }
        }
        Object object7 = CLS166.MTH3192(CLS27.MTH894("TimeLineHelperClass"), CLS27.MTH897("TimeLineHelperMethod1"), new Object[]{s9});
        int v4 = v1 == 1 ? 1 : 0;
        int v5 = CLS166.MTH3181(object1, CLS27.MTH897("snsPostInfoClass1_field2"));
        LinkedList linkedList3 = new LinkedList();
        int v6 = CLS166.MTH3181(object1, CLS27.MTH897("snsPostInfoClass1_field3"));
        Object object8 = null;
        if(CLS27.MTH890("mmsnspostClass")) {
            object8 = CLS166.MTH3188(CLS27.MTH894("mmsnspostClass"), new Object[]{s9, v4, 0, linkedList1, object7, ((int)v), null, v5, linkedList3, v6, object1, Boolean.valueOf(v1 == 3), linkedList2, null, null, null, 1, ""});
        }
        else if(CLS27.MTH890("mmsnspostClass_b")) {
            object8 = CLS166.MTH3188(CLS27.MTH894("mmsnspostClass_b"), new Object[]{s9, v4, 0, linkedList1, object7, ((int)v), null, v5, linkedList3, v6, object1, Boolean.valueOf(v1 == 3), linkedList2, null, null, null, 1, "", ""});
        }
        if(object8 == null) {
            return;
        }
        CLS66.MTH1521(object8);
    }

    // 此方法包含解密的字符串
    public static void MTH1507(String s) {
        if(s.equals(CLS27.MTH904())) {
            return;
        }
        Class class0 = CLS27.MTH894("dbClass1");
        Class class1 = CLS27.MTH894("delClass");
        if(class0 != null && class1 != null) {
            try {
                Object object0 = CLS166.MTH3192(class0, CLS27.MTH897("dbMethod1"), new Object[0]);
                Object object1 = CLS166.MTH3195(object0, CLS27.MTH897("delMethod2"), new Object[0]);
                Object object2 = CLS166.MTH3195(object1, CLS27.MTH897("delMethod3"), new Object[]{s});
                CLS166.MTH3195(object2, CLS27.MTH897("delMethod4"), new Object[0]);
                CLS166.MTH3195(CLS166.MTH3195(object0, CLS27.MTH897("delMethod5"), new Object[0]), CLS27.MTH897("delMethod6"), new Object[]{CLS166.MTH3188(class1, new Object[]{s})});
                CLS166.MTH3195(object1, CLS27.MTH897("delMethod7"), new Object[]{s, object2});
                CLS166.MTH3195(CLS166.MTH3195(object0, CLS27.MTH897("delMethod8"), new Object[0]), CLS27.MTH897("delMethod9"), new Object[]{s});
                if(CLS27.MTH890("delMethod10")) {
                    CLS166.MTH3195(object1, CLS27.MTH897("delMethod10"), new Object[]{s});
                }
                if(CLS27.MTH890("delMethod11") && CLS27.MTH890("delMethod12")) {
                    CLS166.MTH3195(CLS166.MTH3195(object0, CLS27.MTH897("delMethod11"), new Object[0]), CLS27.MTH897("delMethod12"), new Object[]{s});
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static List MTH1508(String s) {
        if(CLS27.MTH890("ImgClass2")) {
            Class class0 = CLS27.MTH894("ImgClass2");
            if(class0 != null) {
                return (List)CLS166.MTH3192(class0, CLS27.MTH897("imageMethod5"), new Object[]{s});
            }
        }
        List list0 = null;
        if(!CLS27.MTH890("ImgClass2_cls1")) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        try {
            Object object0 = CLS66.MTH1516(s);
            if(object0 == null) {
                return null;
            }
            Class class1 = CLS27.MTH894("ImgClass2_cls1");
            Object object1 = CLS166.MTH3195(object0, CLS27.MTH897("snsSightMethod5"), new Object[0]);
            if(object1 == null) {
                return null;
            }
            Object object2 = CLS166.MTH3194(object1, CLS27.MTH897("snsContentLinkField"));
            if(object2 == null) {
                return null;
            }
            LinkedList linkedList0 = (LinkedList)CLS166.MTH3194(object2, CLS27.MTH897("snsSightField3"));
            if(linkedList0 == null || linkedList0.isEmpty()) {
                return null;
            }
            Iterator iterator0 = linkedList0.iterator();
            if(((int)(((Integer)CLS166.MTH3195(object0, CLS27.MTH897("SnsInfoClass2Method2"), new Object[0])))) != 7) {
                for(int v = 0; iterator0.hasNext(); ++v) {
                    Object object3 = CLS166.MTH3188(class1, new Object[0]);
                    String s1 = CLS27.MTH897("ImgClass2_cls1_field1");
                    Object object4 = iterator0.next();
                    CLS166.MTH3198(object3, s1, object4);
                    CLS166.MTH3198(object3, CLS27.MTH897("ImgClass2_cls1_field2"), s);
                    CLS166.MTH3198(object3, CLS27.MTH897("ImgClass2_cls1_field3"), CLS166.MTH3181(object1, CLS27.MTH897("snsContentCreateTimeField")));
                    CLS166.MTH3198(object3, CLS27.MTH897("ImgClass2_cls1_field4"), v);
                    arrayList0.add(object3);
                }
                return arrayList0;
            }
            while(iterator0.hasNext()) {
                Object object5 = iterator0.next();
                if(CLS166.MTH3181(object5, CLS27.MTH897("ImgClass2_cls2_field1")) != 2) {
                }
                else if(list0 == null) {
                    list0 = object5;
                }
                else {
                    Object object6 = CLS166.MTH3194(object5, CLS27.MTH897("ImgClass2_cls2_field2"));
                    Object object7 = CLS166.MTH3194(list0, CLS27.MTH897("ImgClass2_cls2_field2"));
                    if(CLS166.MTH3181(object6, CLS27.MTH897("ImgClass2_cls2_field3")) > CLS166.MTH3181(object7, CLS27.MTH897("ImgClass2_cls2_field3"))) {
                        list0 = object5;
                    }
                }
            }
            if(list0 != null) {
                Object object8 = CLS166.MTH3188(class1, new Object[0]);
                CLS166.MTH3198(object8, CLS27.MTH897("ImgClass2_cls1_field1"), list0);
                CLS166.MTH3198(object8, CLS27.MTH897("ImgClass2_cls1_field2"), s);
                CLS166.MTH3198(object8, CLS27.MTH897("ImgClass2_cls1_field3"), CLS166.MTH3181(object1, CLS27.MTH897("snsContentCreateTimeField")));
                CLS166.MTH3198(object8, CLS27.MTH897("ImgClass2_cls1_field4"), 0);
                arrayList0.add(object8);
                return arrayList0;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return arrayList0;
    }

    // 此方法包含解密的字符串
    public static String MTH1509(String s) {
        Object object0;
        String s1 = "";
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        try {
            if(CLS27.MTH890("imageClass")) {
                Class class0 = CLS27.MTH894("imageClass");
                if(class0 != null) {
                    if(!TextUtils.isEmpty(CLS27.MTH897("imageMethod7"))) {
                        object0 = CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("imageMethod1"), new Object[0]), CLS27.MTH897("imageMethod7"), new Object[]{s, Boolean.TRUE});
                        s1 = (String)object0;
                        return CLS31.MTH992(CLS66.MTH1395(s1));
                    }
                    if(!TextUtils.isEmpty(CLS27.MTH897("imageMethod7b"))) {
                        object0 = CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("imageMethod1"), new Object[0]), CLS27.MTH897("imageMethod7b"), new Object[]{s});
                        s1 = (String)object0;
                        return CLS31.MTH992(CLS66.MTH1395(s1));
                    }
                }
            }
            else if(CLS27.MTH890("imageClass2")) {
                Object object1 = CLS166.MTH3195(CLS66.MTH1487(CLS27.MTH894("imageClass2")), CLS27.MTH897("imageMethod1"), new Object[0]);
                if(CLS27.MTH890("imageMethod7")) {
                    object0 = CLS166.MTH3195(object1, CLS27.MTH897("imageMethod7"), new Object[]{s, Boolean.TRUE});
                    s1 = (String)object0;
                    return CLS31.MTH992(CLS66.MTH1395(s1));
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return CLS31.MTH992(CLS66.MTH1395(s1));
    }

    // 此方法包含解密的字符串
    public static void MTH1510(String s, String s1) {
        Object object0;
        Class class0 = CLS27.MTH894("favClass1_a");
        if(class0 == null) {
            return;
        }
        if(CLS27.MTH890("sendPatClass3")) {
            Class class1 = CLS27.MTH894("sendPatClass3");
            object0 = CLS166.MTH3192(class0, CLS27.MTH897("sendPatMethod4"), new Object[]{class1});
        }
        else if(CLS27.MTH890("sendPatClass1")) {
            Class class2 = CLS27.MTH894("sendPatClass1");
            object0 = CLS166.MTH3192(class0, CLS27.MTH897("sendPatMethod1"), new Object[]{class2});
        }
        else {
            object0 = null;
        }
        if(object0 == null) {
            return;
        }
        if(CLS27.MTH890("sendPathMethod3")) {
            CLS166.MTH3195(object0, CLS27.MTH897("sendPathMethod3"), new Object[]{s, s1});
            return;
        }
        if(CLS27.MTH890("sendPathMethod3b")) {
            CLS166.MTH3195(object0, CLS27.MTH897("sendPathMethod3b"), new Object[]{1, s, s1});
            return;
        }
        if(CLS27.MTH890("patMsgExt_update")) {
            Class class3 = CLS27.MTH894("sendpatCls4");
            String s2 = (String)CLS166.MTH3195(object0, CLS27.MTH897("patMsgExt_suffix"), new Object[]{s1, s});
            Pair pair0 = (Pair)CLS166.MTH3195(object0, CLS27.MTH897("patMsgExt_update"), new Object[]{s, CLS27.MTH904(), s1, s2, ((int)(System.currentTimeMillis() / 1000L)), 0});
            CLS66.MTH1521(CLS166.MTH3188(class3, new Object[]{pair0, s, s1, 1}));
            Object object1 = CLS166.MTH3188(CLS27.MTH894("sendpatCls5"), new Object[0]);
            CLS166.MTH3196(1, object1, CLS27.MTH897("sendpatCls5_f1"));
            CLS166.MTH3198(object1, CLS27.MTH897("sendpatCls5_f2"), s);
            CLS166.MTH3198(object1, CLS27.MTH897("sendpatCls5_f3"), s1);
            CLS166.MTH3198(object1, CLS27.MTH897("sendpatCls5_f4"), pair0);
            Object object2 = CLS166.MTH3194(object0, CLS27.MTH897("patMsgExt_mmhandler"));
            CLS166.MTH3195(object2, CLS27.MTH897("MMHandler_sendMessageDelayed"), new Object[]{CLS166.MTH3195(object2, CLS27.MTH897("MMHandler_obtainMessage"), new Object[]{291, object1}), 5000L});
            CLS166.MTH3198(object0, CLS27.MTH897("patMsgExt_f1"), object1);
        }
    }

    // 去混淆评级： 低(30)
    // 此方法包含解密的字符串
    public static String MTH1511(Object object0) {
        return object0 == null ? "" : ((String)CLS182.MTH3492(4101160067179270965L, object0));
    }

    // 此方法包含解密的字符串
    public static void MTH1512(String s, String s1) {
        Class class0 = CLS27.MTH894("SearchContactClass");
        if(class0 == null) {
            return;
        }
        try {
            Object object0 = CLS166.MTH3188(class0, new Object[]{s, 3});
            CLS166.MTH3199(object0, s1, s);
            CLS66.MTH1521(object0);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1513(String s) {
        Object object0;
        if(!TextUtils.isEmpty(s) && !CLS426.MTH6126(s)) {
            try {
                if(CLS27.MTH890("sendWearYoClass")) {
                    object0 = CLS166.MTH3188(CLS27.MTH894("sendWearYoClass"), new Object[]{s, 1});
                }
                else {
                    object0 = CLS27.MTH890("sendWearYoClass_b") ? CLS166.MTH3188(CLS27.MTH894("sendWearYoClass_b"), new Object[]{s}) : null;
                }
                if(object0 == null) {
                    return;
                }
                CLS66.MTH1521(object0);
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1514(String s, String s1) {
        Object object6;
        Object object0 = null;
        if(TextUtils.isEmpty(s1)) {
            return;
        }
        if(CLS27.MTH890("GetA8KeyClass_f1")) {
            String s2 = CLS182.MTH3475(0x38EA210D2B3CD335L, CLS182.MTH3483(s1));
            try {
                Class class0 = CLS27.MTH894("GetA8KeyClass");
                Class class1 = CLS27.MTH894("GetA8KeyCls_1");
                Class class2 = CLS27.MTH894("GetA8KeyCls_2");
                Object object1 = CLS166.MTH3188(class0, new Object[]{s2, 0});
                Object object2 = CLS166.MTH3194(CLS166.MTH3194(CLS166.MTH3194(object1, CLS27.MTH897("GetA8KeyClass_f1")), CLS27.MTH897("GetA8KeyClass_f1_f1")), CLS27.MTH897("GetA8KeyClass_f1_f1_f1"));
                CLS166.MTH3196(2, object2, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f2"));
                Object object3 = CLS166.MTH3188(class1, new Object[0]);
                CLS166.MTH3198(object3, CLS27.MTH897("GetA8KeyCls_1_f1"), s2);
                CLS166.MTH3189(object3, CLS27.MTH897("GetA8KeyCls_1_f2"), true);
                CLS166.MTH3198(object2, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f7"), object3);
                CLS166.MTH3196(1, object2, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f10"));
                CLS166.MTH3198(object2, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f11"), s);
                CLS166.MTH3196(0, object2, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f14"));
                CLS166.MTH3196(0, object2, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f16"));
                CLS166.MTH3198(object2, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f17"), "WIFI");
                CLS166.MTH3196(((int)System.currentTimeMillis()), object2, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f20"));
                CLS166.MTH3198(object2, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f21"), null);
                CLS166.MTH3196(0, object2, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f22"));
                Object object4 = CLS166.MTH3188(class1, new Object[0]);
                CLS166.MTH3198(object4, CLS27.MTH897("GetA8KeyCls_1_f1"), null);
                CLS166.MTH3189(object4, CLS27.MTH897("GetA8KeyCls_1_f2"), true);
                CLS166.MTH3198(object2, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f4"), object4);
                Object object5 = CLS166.MTH3188(class2, new Object[0]);
                CLS166.MTH3195(object5, CLS27.MTH897("GetA8KeyCls_2_m1"), new Object[]{null});
                CLS166.MTH3198(object2, CLS27.MTH897("GetA8KeyClass_f1_f1_f1_f23"), object5);
                object0 = object1;
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        else if(CLS27.MTH890("GetA8KeyClass_2")) {
            object0 = CLS166.MTH3195(CLS166.MTH3188(CLS27.MTH894("GetA8KeyClass_2"), new Object[0]), CLS27.MTH897("GetA8KeyClass_method1"), new Object[]{CLS182.MTH3475(4101127640176186165L, CLS182.MTH3483(s1)), s, 1, 0, 0, "WIFI", ((int)System.currentTimeMillis()), null, null, 0, null});
        }
        else if(CLS27.MTH890("GetA8KeyClass")) {
            Class class3 = CLS27.MTH894("GetA8KeyClass");
            if(class3 != null) {
                try {
                    object6 = CLS166.MTH3188(class3, new Object[]{s1 + "&from=singlemessage", s, 1, 0, 0, "WIFI", ((int)System.currentTimeMillis()), null, null, 0, null});
                }
                catch(Throwable unused_ex) {
                    try {
                        object6 = CLS166.MTH3188(class3, new Object[]{s1 + "&from=singlemessage&isappinstalled=0", s, 1, 0, 0, "WIFI", ((int)System.currentTimeMillis())});
                    }
                    catch(Throwable unused_ex) {
                        try {
                            object6 = CLS166.MTH3188(class3, new Object[]{s1 + "&from=singlemessage&isappinstalled=0", s, 1, 0, 0, "WIFI"});
                        }
                        catch(Throwable throwable1) {
                            goto label_52;
                        }
                    }
                }
                object0 = object6;
            }
        }
        else if(CLS27.MTH890("GetA8KeyClass_b")) {
            try {
                object0 = CLS166.MTH3188(CLS27.MTH894("GetA8KeyClass_b"), new Object[]{s1 + "&from=singlemessage", s, 19, 8, ((int)System.currentTimeMillis()), new byte[0]});
            }
            catch(Throwable throwable1) {
            label_52:
                CLS27.MTH893(throwable1);
            }
        }
        if(object0 == null) {
            return;
        }
        CLS166.MTH3199(object0, "wx", s1);
        CLS66.MTH1521(object0);
    }

    // 此方法包含解密的字符串
    public static boolean MTH1515(Activity activity0, String s, Intent intent0) {
        Class class0 = CLS27.MTH894("favClass2");
        if(class0 == null) {
            return false;
        }
        try {
            if(CLS27.MTH890("startFavActivityMethod")) {
                CLS166.MTH3192(class0, CLS27.MTH897("startFavActivityMethod"), new Object[]{activity0, s, intent0});
                return true;
            }
            if(CLS27.MTH890("startFavActivityMethod_b")) {
                CLS166.MTH3192(class0, CLS27.MTH897("startFavActivityMethod_b"), new Object[]{activity0, s, intent0, null});
                return true;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return false;
    }

    // 此方法包含解密的字符串
    public static Object MTH1516(String s) {
        Class class0 = CLS27.MTH894("SnsInfoClass");
        if(class0 == null) {
            return null;
        }
        try {
            return CLS166.MTH3192(class0, CLS27.MTH897("snsInfoMethod1"), new Object[]{s});
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public static HashMap MTH1517(Object object0) {
        HashMap hashMap0 = new HashMap();
        try {
            Object object1 = CLS164.MTH3175(object0, CLS27.MTH897("werunAdapterField"));
            if(object1 == null) {
                return hashMap0;
            }
            int v = (int)(((Integer)CLS166.MTH3195(object1, "getCount", new Object[0])));
        label_6:
            for(int v1 = 0; v1 < v; ++v1) {
                Object object2 = CLS166.MTH3194(CLS166.MTH3195(object1, "getItem", new Object[]{v1}), CLS27.MTH897("werunItemField"));
                if(object2 != null) {
                    String s = (String)CLS166.MTH3194(object2, "field_username");
                    if(!s.equals(CLS27.MTH904()) && CLS166.MTH3181(object2, "field_selfLikeState") == 0) {
                        hashMap0.put(s, CLS166.MTH3181(object2, "field_score"));
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            if(true) {
                return hashMap0;
            }
            goto label_6;
        }
        return hashMap0;
    }

    // 此方法包含解密的字符串
    public static void MTH1518(String s) {
        Class class0 = CLS27.MTH894("dbClass1");
        Class class1 = CLS27.MTH894("SetRemarkClass");
        if(class0 != null && class1 != null && !TextUtils.isEmpty(s) && CLS426.MTH6126(s)) {
            try {
                CLS27.MTH885().edit().putBoolean("room_save_to_contact", true).apply();
                CLS166.MTH3192(class1, CLS27.MTH897("saveChatroomAsContactMethod"), new Object[]{CLS66.MTH1384(s)});
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static String MTH1519(String s) {
        String s1 = "";
        Class class0 = CLS27.MTH894("contactModel");
        if(class0 == null) {
            return "";
        }
        try {
            Cursor cursor0 = CLS371.FLD3470.MTH5307("SELECT * FROM rcontact WHERE username = ? or encryptUsername = ?", new String[]{s, s});
            if(cursor0 == null) {
                return "";
            }
            if(cursor0.moveToFirst()) {
                Object object0 = CLS166.MTH3188(class0, new Object[0]);
                CLS166.MTH3195(object0, CLS27.MTH897("chatroomNotifyMethod"), new Object[]{cursor0});
                s1 = "" + CLS166.MTH3195(object0, CLS27.MTH892("contactModel_getProvince", "getProvince"), new Object[0]) + CLS166.MTH3195(object0, CLS27.MTH892("contactModel_getCity", "getCity"), new Object[0]);
            }
            if(!cursor0.isClosed()) {
                cursor0.close();
                return s1;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return s1;
    }

    // 去混淆评级： 低(27)
    // 此方法包含解密的字符串
    public static void MTH1520(String s, String s1) {
        Object object0 = null;
        if(CLS27.MTH890("TransferPlaceOrderClass")) {
            Class class0 = CLS27.MTH894("TransferPlaceOrderClass");
            if(class0 != null) {
                object0 = CLS166.MTH3188(class0, new Object[]{0.01, "1", s, null, 0x1F, 2, null, 0, null, null, null, null, null, 11, "", "", null, "", null, null, null, null, null, "", 0, "", 0});
            }
        }
        else if(CLS27.MTH890("TransferPlaceOrderClass_b")) {
            Class class1 = CLS27.MTH894("TransferPlaceOrderClass_b");
            if(class1 != null) {
                object0 = CLS166.MTH3188(class1, new Object[]{0.01, "1", s, null, 0x1F, 2, "", "", null, null, 11, "", "", null, "", null, null, null, null, null, "", 0, "", 0, null});
            }
        }
        else if(CLS27.MTH890("TransferPlaceOrderClass_c")) {
            Class class2 = CLS27.MTH894("TransferPlaceOrderClass_c");
            if(class2 != null) {
                object0 = CLS166.MTH3188(class2, new Object[]{0.01, "1", s, null, 0x1F, 2, null, 0, null, null, null, null, null, 11, "", "", null, "", null, null, null, null, null, "", 0, "", 0, null});
            }
        }
        else if(CLS27.MTH890("TransferPlaceOrderClass_d")) {
            Class class3 = CLS27.MTH894("TransferPlaceOrderClass_d");
            if(class3 != null) {
                object0 = CLS166.MTH3188(class3, new Object[]{0.01, "1", s, null, 0x1F, 2, null, 0, null, null, null, null, null, 11, "", "", null, "", null, null, null, null, null, "", 0, "", 0, null, ""});
            }
        }
        if(object0 == null) {
            return;
        }
        CLS166.MTH3199(object0, s1, s);
        CLS66.MTH1521(object0);
    }

    // 此方法包含解密的字符串
    public static void MTH1521(Object object0) {
        if(object0 == null) {
            return;
        }
        Class class0 = CLS27.MTH894("dbClass1");
        if(class0 == null) {
            return;
        }
        try {
            String s = CLS27.MTH897("sendMethod2B");
            if(TextUtils.isEmpty(s)) {
                CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("sendMethod1"), new Object[0]), CLS27.MTH897("sendMethod2"), new Object[]{object0});
                return;
            }
            CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("sendMethod1"), new Object[0]), s, new Object[]{object0, 0});
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static Object MTH1522(Activity activity0) {
        try {
            if(CLS27.MTH890("MMAnimateViewClass")) {
                return CLS166.MTH3188(CLS27.MTH894("MMAnimateViewClass"), new Object[]{activity0});
            }
            if(CLS27.MTH890("MMAnimateViewClass_b")) {
                return CLS166.MTH3188(CLS27.MTH894("MMAnimateViewClass_b"), new Object[]{activity0, null});
            }
            if(CLS27.MTH890("MMAnimateViewClass_c")) {
                return CLS166.MTH3188(CLS27.MTH894("MMAnimateViewClass_c"), new Object[]{activity0, null, -1});
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public static void MTH1523(String s, String s1) {
        Class class0 = CLS27.MTH894("dbClass1");
        Class class1 = CLS27.MTH894("RoomNameClass1");
        Class class2 = CLS27.MTH894("RoomNameClass2");
        Class class3 = CLS27.MTH894("RoomNameClass3");
        if(class1 != null && class0 != null && !TextUtils.isEmpty(s1) && class2 != null && class3 != null) {
            try {
                Object object0 = CLS166.MTH3188(class1, new Object[0]);
                CLS166.MTH3198(object0, CLS27.MTH897("RoomNameClass1Field1"), CLS166.MTH3195(CLS166.MTH3188(class2, new Object[0]), CLS27.MTH897("RoomNameMethod1"), new Object[]{s}));
                CLS166.MTH3198(object0, CLS27.MTH897("RoomNameClass1Field2"), CLS166.MTH3195(CLS166.MTH3188(class2, new Object[0]), CLS27.MTH897("RoomNameMethod1"), new Object[]{s1}));
                Object object1 = CLS166.MTH3188(class3, new Object[]{27, object0});
                CLS166.MTH3195(CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("dbMethod1"), new Object[0]), CLS27.MTH897("delMethod5"), new Object[0]), CLS27.MTH897("delMethod6"), new Object[]{object1});
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public static void MTH1524(Object object0) {
        if(object0 == null) {
            return;
        }
        Class class0 = CLS27.MTH894("dbClass1");
        if(class0 == null) {
            return;
        }
        try {
            CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("sendMethod1"), new Object[0]), CLS27.MTH897("cancelSceneMethod"), new Object[]{object0});
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public static String MTH1525(String s) {
        try {
            if(!TextUtils.isEmpty(CLS27.MTH897("genVideoClass"))) {
                Class class2 = CLS27.MTH894("genVideoClass");
                if(class2 != null) {
                    return CLS166.MTH3192(class2, CLS27.MTH897("genVideoFilename"), new Object[]{s});
                }
            }
            else if(!TextUtils.isEmpty(CLS27.MTH897("videoClass"))) {
                Class class0 = CLS27.MTH894("videoClass");
                if(class0 != null) {
                    return CLS166.MTH3192(class0, CLS27.MTH897("genVideoFilename"), new Object[]{s});
                }
            }
            else {
                Class class1 = CLS27.MTH894("snsSightRequestClass3");
                if(class1 != null) {
                    return CLS166.MTH3195(CLS166.MTH3192(class1, CLS27.MTH897("videoMethod3"), new Object[0]), CLS27.MTH897("genVideoFilename"), new Object[]{s});
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return "";
    }
}

