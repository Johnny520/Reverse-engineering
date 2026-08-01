package lin.xposed.hook.util.qq;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p007.AbstractC6136;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p037.C6368;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class QQMessageUtils {
    public static final String TAG = "QQMessageUtils";

    public static List<String> getMsgRecordMd5List(Object obj) {
        ArrayList arrayList = (ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", obj);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C6316 c6316M11826 = C6316.m11826(obj2.getClass());
            c6316M11826.f17409.f3617 = "getPicElement";
            c6316M11826.f17409.f3616 = AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.PicElement");
            Object objM11828 = c6316M11826.m11828(obj2, new Object[0]);
            if (objM11828 != null) {
                arrayList2.add(getPicElementMd5(objM11828));
            }
        }
        return arrayList2;
    }

    public static Map<String, String> getMsgRecordMd5UrlMap(Object obj) {
        String picElementMd5;
        ArrayList arrayList = (ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", obj);
        int iIntValue = ((Integer) AbstractC6317.m11831(Integer.TYPE, "chatType", obj)).intValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            C6316 c6316M11826 = C6316.m11826(obj2.getClass());
            c6316M11826.f17409.f3617 = "getPicElement";
            c6316M11826.f17409.f3616 = AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.PicElement");
            Object objM11828 = c6316M11826.m11828(obj2, new Object[0]);
            if (objM11828 != null && (picElementMd5 = getPicElementMd5(objM11828)) != null && !picElementMd5.isEmpty()) {
                linkedHashMap.put(picElementMd5, getPicElementUrl(iIntValue, objM11828));
            }
        }
        return linkedHashMap;
    }

    public static String getMsgRecordPicUrl(Object obj) {
        ArrayList arrayList = (ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", obj);
        int iIntValue = ((Integer) AbstractC6317.m11831(Integer.TYPE, "chatType", obj)).intValue();
        String strM6668 = "";
        for (Object obj2 : arrayList) {
            C6316 c6316M11826 = C6316.m11826(obj2.getClass());
            c6316M11826.f17409.f3617 = "getPicElement";
            c6316M11826.f17409.f3616 = AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.PicElement");
            Object objM11828 = c6316M11826.m11828(obj2, new Object[0]);
            if (objM11828 != null) {
                strM6668 = getPicElementUrl(iIntValue, objM11828);
            }
        }
        return strM6668;
    }

    public static List<String> getMsgRecordPicUrlList(Object obj) {
        ArrayList arrayList = (ArrayList) AbstractC6317.m11831(ArrayList.class, "elements", obj);
        int iIntValue = ((Integer) AbstractC6317.m11831(Integer.TYPE, "chatType", obj)).intValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C6316 c6316M11826 = C6316.m11826(obj2.getClass());
            c6316M11826.f17409.f3617 = "getPicElement";
            c6316M11826.f17409.f3616 = AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.PicElement");
            Object objM11828 = c6316M11826.m11828(obj2, new Object[0]);
            if (objM11828 != null) {
                arrayList2.add(getPicElementUrl(iIntValue, objM11828));
            }
        }
        return arrayList2;
    }

    public static String getPicElementMd5(Object obj) {
        return (String) AbstractC6317.m11831(String.class, "md5HexStr", obj);
    }

    public static String getPicElementUrl(int i, Object obj) {
        String str = (String) AbstractC6317.m11831(String.class, "originImageUrl", obj);
        String str2 = (String) AbstractC6317.m11831(String.class, "fileUuid", obj);
        String str3 = (String) AbstractC6317.m11831(String.class, "md5HexStr", obj);
        String strM6668 = "https://gchat.qpic.cn";
        if (str != null && !str.isEmpty()) {
            if (!str.startsWith("/download")) {
                return strM6668.concat(str);
            }
            String str4 = C6368.f17502;
            if (str.contains("appid=1406")) {
                str4 = C6368.f17503;
            }
            return strM6668 + str + str4;
        }
        if (str2.length() < 64) {
            return "https://gchat.qpic.cn/gchatpic_new/0/0-0-" + str3.toUpperCase() + "/0?term=2&is_origin=1";
        }
        String strM66682 = "";
        if (i == 1) {
            strM66682 = "1406";
        } else if (i == 2) {
            strM66682 = "1407";
        }
        String str5 = C6368.f17502;
        if (strM66682.equals("1406")) {
            str5 = C6368.f17503;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC6136.m11544(-3937654879238227367L, sb, strM66682);
        AbstractC6136.m11544(-3937654801928816039L, sb, str2);
        return AbstractC6136.m11557(-3937654703144568231L, sb, str5);
    }
}
