package lin.xposed.hook.util.qq;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p038.C6385;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQMessageUtils {
    public static final String TAG = AbstractC8405.m13972(964);

    public static List<String> getMsgRecordMd5List(Object obj) {
        ArrayList arrayList = (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), obj);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C6335 c6335M11854 = C6335.m11854(obj2.getClass());
            c6335M11854.f17458.f3618 = AbstractC8405.m13972(140);
            c6335M11854.f17458.f3617 = AbstractC6337.m11866(AbstractC8405.m13972(178));
            Object objM11856 = c6335M11854.m11856(obj2, new Object[0]);
            if (objM11856 != null) {
                arrayList2.add(getPicElementMd5(objM11856));
            }
        }
        return arrayList2;
    }

    public static Map<String, String> getMsgRecordMd5UrlMap(Object obj) {
        String picElementMd5;
        ArrayList arrayList = (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), obj);
        int iIntValue = ((Integer) AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(125), obj)).intValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            C6335 c6335M11854 = C6335.m11854(obj2.getClass());
            c6335M11854.f17458.f3618 = AbstractC8405.m13972(140);
            c6335M11854.f17458.f3617 = AbstractC6337.m11866(AbstractC8405.m13972(178));
            Object objM11856 = c6335M11854.m11856(obj2, new Object[0]);
            if (objM11856 != null && (picElementMd5 = getPicElementMd5(objM11856)) != null && !picElementMd5.isEmpty()) {
                linkedHashMap.put(picElementMd5, getPicElementUrl(iIntValue, objM11856));
            }
        }
        return linkedHashMap;
    }

    public static String getMsgRecordPicUrl(Object obj) {
        ArrayList arrayList = (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), obj);
        int iIntValue = ((Integer) AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(125), obj)).intValue();
        String picElementUrl = "";
        for (Object obj2 : arrayList) {
            C6335 c6335M11854 = C6335.m11854(obj2.getClass());
            c6335M11854.f17458.f3618 = AbstractC8405.m13972(140);
            c6335M11854.f17458.f3617 = AbstractC6337.m11866(AbstractC8405.m13972(178));
            Object objM11856 = c6335M11854.m11856(obj2, new Object[0]);
            if (objM11856 != null) {
                picElementUrl = getPicElementUrl(iIntValue, objM11856);
            }
        }
        return picElementUrl;
    }

    public static List<String> getMsgRecordPicUrlList(Object obj) {
        ArrayList arrayList = (ArrayList) AbstractC6336.m11859(ArrayList.class, AbstractC8405.m13972(152), obj);
        int iIntValue = ((Integer) AbstractC6336.m11859(Integer.TYPE, AbstractC8405.m13972(125), obj)).intValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            C6335 c6335M11854 = C6335.m11854(obj2.getClass());
            c6335M11854.f17458.f3618 = AbstractC8405.m13972(140);
            c6335M11854.f17458.f3617 = AbstractC6337.m11866(AbstractC8405.m13972(178));
            Object objM11856 = c6335M11854.m11856(obj2, new Object[0]);
            if (objM11856 != null) {
                arrayList2.add(getPicElementUrl(iIntValue, objM11856));
            }
        }
        return arrayList2;
    }

    public static String getPicElementMd5(Object obj) {
        return (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(179), obj);
    }

    public static String getPicElementUrl(int i, Object obj) {
        String str = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(957), obj);
        String str2 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(719), obj);
        String str3 = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13972(179), obj);
        String strM13972 = AbstractC8405.m13972(958);
        if (str != null && !str.isEmpty()) {
            if (!str.startsWith(AbstractC8405.m13972(959))) {
                return strM13972.concat(str);
            }
            String str4 = C6385.f17548;
            if (str.contains(AbstractC8405.m13972(960))) {
                str4 = C6385.f17549;
            }
            return strM13972 + str + str4;
        }
        if (str2.length() < 64) {
            return AbstractC8405.m13972(512) + str3.toUpperCase() + AbstractC8405.m13972(963);
        }
        String strM13973 = i == 1 ? AbstractC8405.m13973("喵呜喵喵喵喵呜喵~喵呜喵喵喵喵喵呜~喵呜喵喵呜喵呜喵~喵呜喵呜呜呜呜喵") : i == 2 ? AbstractC8405.m13973("喵呜喵喵喵喵呜喵~喵呜喵喵喵喵喵呜~喵呜喵喵呜喵呜喵~喵呜喵呜呜呜呜呜") : "";
        String str5 = C6385.f17548;
        if (strM13973.equals(AbstractC8405.m13973("喵呜喵喵喵喵呜喵~喵呜喵喵喵喵喵呜~喵呜喵喵呜喵呜喵~喵呜喵呜呜呜呜喵"))) {
            str5 = C6385.f17549;
        }
        return AbstractC8405.m13972(961) + strM13973 + AbstractC8405.m13972(962) + str2 + AbstractC8405.m13973("喵呜喵呜喵呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜~喵喵喵喵喵呜呜喵~喵呜喵呜喵喵喵呜~喵呜喵呜喵喵喵呜") + str5;
    }
}
